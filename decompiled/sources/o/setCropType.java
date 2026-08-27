package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class setCropType extends getMessageTextColor {
    private final setAnimateOut IconCompatParcelizer;

    public static final class serializer {
        private final long read;
        private final long serializer;
        private final Boolean write;

        public final long IconCompatParcelizer() {
            return this.serializer;
        }

        public final long RemoteActionCompatParcelizer() {
            return this.read;
        }

        public final Boolean serializer() {
            return this.write;
        }

        public serializer(long j, long j2, Boolean bool) {
            this.read = j;
            this.serializer = j2;
            this.write = bool;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setCropType(setHeaderTextColor setheadertextcolor, setAnimateOut setanimateout) {
        super(setheadertextcolor);
        setheadertextcolor.getClass();
        setanimateout.getClass();
        this.IconCompatParcelizer = setanimateout;
    }

    public final ArrayList read(long j, long j2, Boolean bool) {
        ArrayList<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, j2);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
        for (r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 : arrayListRemoteActionCompatParcelizer) {
            long jMax = Math.max(r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.PlaybackStateCompatCustomAction(), j);
            Long lSerializer = r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.serializer();
            if (lSerializer == null) {
                lSerializer = Long.valueOf(j2);
            }
            long jMin = Math.min(lSerializer.longValue(), j2);
            arrayList.add(new serializer(jMax, jMin, this.IconCompatParcelizer.serializer(jMax, jMin, bool)));
        }
        return arrayList;
    }
}
