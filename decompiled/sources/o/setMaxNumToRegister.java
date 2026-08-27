package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class setMaxNumToRegister {
    private final setDurationInMilliseconds read;

    public static final class serializer {
        private final float IconCompatParcelizer;
        private final boolean serializer;

        public final boolean read() {
            return this.serializer;
        }

        public final float write() {
            return this.IconCompatParcelizer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public serializer(float f, r8lambda92cmOJndUFWJcG9v70hQ0grNTsw r8lambda92cmojndufwjcg9v70hq0grntsw) {
            r8lambda92cmojndufwjcg9v70hq0grntsw.getClass();
            long jPlaybackStateCompatCustomAction = r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction();
            long jPlaybackStateCompatCustomAction2 = r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction();
            this(f, jPlaybackStateCompatCustomAction, ((long) r8lambda92cmojndufwjcg9v70hq0grntsw.read()) + jPlaybackStateCompatCustomAction2, r8lambda92cmojndufwjcg9v70hq0grntsw.serializer());
        }

        public serializer(float f, long j, long j2, boolean z) {
            this.IconCompatParcelizer = f;
            this.serializer = z;
        }
    }

    public final ArrayList read(long j, long j2, ArrayList arrayList) {
        Object objPrevious;
        Object next;
        List<r8lambda92cmOJndUFWJcG9v70hQ0grNTsw> listRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(j, j2);
        ArrayList arrayList2 = new ArrayList();
        for (r8lambda92cmOJndUFWJcG9v70hQ0grNTsw r8lambda92cmojndufwjcg9v70hq0grntsw : listRemoteActionCompatParcelizer) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) objPrevious;
                if (handlelogclickdefault.read() != null && handlelogclickdefault.MediaDescriptionCompat() < r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction()) {
                    break;
                }
            }
            handleLogClickdefault handlelogclickdefault2 = (handleLogClickdefault) objPrevious;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                handleLogClickdefault handlelogclickdefault3 = (handleLogClickdefault) next;
                if (handlelogclickdefault3.read() != null && handlelogclickdefault3.MediaDescriptionCompat() > r8lambda92cmojndufwjcg9v70hq0grntsw.PlaybackStateCompatCustomAction() + ((long) r8lambda92cmojndufwjcg9v70hq0grntsw.read())) {
                    break;
                }
            }
            handleLogClickdefault handlelogclickdefault4 = (handleLogClickdefault) next;
            Float fMediaDescriptionCompat = onContentCardDismissed.MediaDescriptionCompat((Iterable) onContentCardClicked.RemoteActionCompatParcelizer((Object[]) new Float[]{handlelogclickdefault2 != null ? handlelogclickdefault2.read() : null, handlelogclickdefault4 != null ? handlelogclickdefault4.read() : null}));
            serializer serializerVar = fMediaDescriptionCompat != null ? new serializer(fMediaDescriptionCompat.floatValue(), r8lambda92cmojndufwjcg9v70hq0grntsw) : null;
            if (serializerVar != null) {
                arrayList2.add(serializerVar);
            }
        }
        return arrayList2;
    }

    public setMaxNumToRegister(setDurationInMilliseconds setdurationinmilliseconds) {
        setdurationinmilliseconds.getClass();
        this.read = setdurationinmilliseconds;
    }
}
