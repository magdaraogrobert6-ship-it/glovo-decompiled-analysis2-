package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setDismissType extends setDurationInMilliseconds {
    private final getMessageTextColor read;

    public static final class write {
        private final long IconCompatParcelizer;
        private final boolean RemoteActionCompatParcelizer;
        private final long read;
        private final boolean serializer;
        private final long write;

        public final long IconCompatParcelizer() {
            return this.write;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean serializer() {
            return this.serializer;
        }

        public final long write() {
            return this.read;
        }

        public write(long j, long j2, boolean z, boolean z2) {
            this.read = j;
            this.write = j2;
            this.serializer = z;
            this.RemoteActionCompatParcelizer = z2;
            this.IconCompatParcelizer = j2 - j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setDismissType(setHeaderTextColor setheadertextcolor, getMessageTextColor getmessagetextcolor) {
        super(setheadertextcolor);
        setheadertextcolor.getClass();
        getmessagetextcolor.getClass();
        this.read = getmessagetextcolor;
    }

    public final List<write> IconCompatParcelizer(long j, long j2) {
        return RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(j, j2));
    }

    public final List<write> write() {
        return RemoteActionCompatParcelizer(read());
    }

    public final List<write> write(long j, long j2) {
        return RemoteActionCompatParcelizer(read(j, j2));
    }

    private final List<write> RemoteActionCompatParcelizer(List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> list) {
        if (list.isEmpty()) {
            return instance_delegatelambda0.write;
        }
        long jPlaybackStateCompatCustomAction = ((r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) onContentCardDismissed.read((List) list)).PlaybackStateCompatCustomAction();
        long jPlaybackStateCompatCustomAction2 = ((r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) onContentCardDismissed.MediaDescriptionCompat((List) list)).PlaybackStateCompatCustomAction() + ((long) ((r8lambda92cmOJndUFWJcG9v70hQ0grNTsw) onContentCardDismissed.MediaDescriptionCompat((List) list)).read());
        ArrayList<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> arrayListRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(jPlaybackStateCompatCustomAction, jPlaybackStateCompatCustomAction2);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
        for (r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 : arrayListRemoteActionCompatParcelizer) {
            long jPlaybackStateCompatCustomAction3 = r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.PlaybackStateCompatCustomAction();
            Long lSerializer = r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.serializer();
            if (lSerializer == null) {
                lSerializer = Long.valueOf(jPlaybackStateCompatCustomAction2);
            }
            long jLongValue = lSerializer.longValue();
            if (jLongValue < jPlaybackStateCompatCustomAction3) {
                jLongValue = jPlaybackStateCompatCustomAction3;
            }
            arrayList.add(new setExtras(jPlaybackStateCompatCustomAction3, jLongValue));
        }
        List<setExtras> listSerializer = onContentCardDismissed.serializer(arrayList, new setIconBackgroundColor());
        ArrayList arrayList2 = new ArrayList();
        for (r8lambda92cmOJndUFWJcG9v70hQ0grNTsw r8lambda92cmojndufwjcg9v70hq0grntsw : list) {
            int iSerializer = getQueryParameterslambda2.serializer();
            int iSerializer2 = getQueryParameterslambda2.serializer();
            BaseContentCardViewExternalSyntheticLambda0 baseContentCardViewExternalSyntheticLambda0 = (BaseContentCardViewExternalSyntheticLambda0) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), iSerializer2, -1169780863, new Object[0], getQueryParameterslambda2.serializer(), 1169780871, iSerializer);
            long jPlaybackStateCompatCustomAction4 = r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction();
            long j = jPlaybackStateCompatCustomAction4 + ((long) r8lambda92cmojndufwjcg9v70hq0grntsw.read());
            if (j > jPlaybackStateCompatCustomAction4) {
                long j2 = jPlaybackStateCompatCustomAction4;
                for (setExtras setextras : listSerializer) {
                    if (setextras.read() > jPlaybackStateCompatCustomAction4) {
                        if (setextras.write() >= j) {
                            break;
                        }
                        long jMax = Math.max(setextras.write(), jPlaybackStateCompatCustomAction4);
                        long j3 = jPlaybackStateCompatCustomAction4;
                        long jMin = Math.min(setextras.read(), j);
                        if (j2 < jMax) {
                            baseContentCardViewExternalSyntheticLambda0.add(new write(j2, jMax, r8lambda92cmojndufwjcg9v70hq0grntsw.serializer(), false));
                        }
                        baseContentCardViewExternalSyntheticLambda0.add(new write(jMax, jMin, r8lambda92cmojndufwjcg9v70hq0grntsw.serializer(), true));
                        j2 = jMin;
                        jPlaybackStateCompatCustomAction4 = j3;
                    }
                }
                if (j2 < j) {
                    baseContentCardViewExternalSyntheticLambda0.add(new write(j2, j, r8lambda92cmojndufwjcg9v70hq0grntsw.serializer(), false));
                }
            }
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) androidx.sqlite.SQLite.serializer((List) baseContentCardViewExternalSyntheticLambda0), (Collection) arrayList2);
        }
        return arrayList2;
    }
}
