package o;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class getPEK5gGoQ implements Comparator {
    public final /* synthetic */ androidx.transition.TransitionValuesMaps read;
    public final /* synthetic */ getNumPadInsertEK5gGoQ write;

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq = (getNumPadMoveHomeEK5gGoQ) obj;
        getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq2 = (getNumPadMoveHomeEK5gGoQ) obj2;
        if (getnumpadmovehomeek5ggoq instanceof getOEK5gGoQ) {
            return !(getnumpadmovehomeek5ggoq2 instanceof getOEK5gGoQ) ? 1 : 0;
        }
        if (getnumpadmovehomeek5ggoq2 instanceof getOEK5gGoQ) {
            return -1;
        }
        getNumPadInsertEK5gGoQ getnumpadinsertek5ggoq = this.write;
        if (getnumpadinsertek5ggoq == null) {
            return getnumpadmovehomeek5ggoq.IconCompatParcelizer().compareTo(getnumpadmovehomeek5ggoq2.IconCompatParcelizer());
        }
        return (int) getTvInputComposite2EK5gGoQ.serializer(getnumpadinsertek5ggoq.RemoteActionCompatParcelizer(this.read, Arrays.asList(getnumpadmovehomeek5ggoq, getnumpadmovehomeek5ggoq2)).write().doubleValue());
    }

    public getPEK5gGoQ(getNumPadInsertEK5gGoQ getnumpadinsertek5ggoq, androidx.transition.TransitionValuesMaps transitionValuesMaps) {
        this.write = getnumpadinsertek5ggoq;
        this.read = transitionValuesMaps;
    }
}
