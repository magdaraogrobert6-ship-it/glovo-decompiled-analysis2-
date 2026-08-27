package o;

import com.google.android.gms.internal.measurement.zzz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class getNumPadMoveEndEK5gGoQ extends getNumPadInsertEK5gGoQ {
    public final ArrayList RemoteActionCompatParcelizer;
    public final ArrayList read;
    public final androidx.transition.TransitionValuesMaps write;

    @Override // o.getNumPadInsertEK5gGoQ, o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        return new getNumPadMoveEndEK5gGoQ(this);
    }

    @Override // o.getNumPadInsertEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer(androidx.transition.TransitionValuesMaps transitionValuesMaps, List list) {
        getOEK5gGoQ getoek5ggoq;
        androidx.transition.TransitionValuesMaps transitionValuesMapsPlaybackStateCompatCustomAction = this.write.PlaybackStateCompatCustomAction();
        zzz zzzVar = (zzz) transitionValuesMapsPlaybackStateCompatCustomAction.MediaDescriptionCompat;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.read;
            int size = arrayList.size();
            getoek5ggoq = getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                transitionValuesMapsPlaybackStateCompatCustomAction.write((String) arrayList.get(i), ((zzz) transitionValuesMaps.MediaDescriptionCompat).write(transitionValuesMaps, (getNumPadMoveHomeEK5gGoQ) list.get(i)));
            } else {
                transitionValuesMapsPlaybackStateCompatCustomAction.write((String) arrayList.get(i), getoek5ggoq);
            }
            i++;
        }
        for (getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq : this.RemoteActionCompatParcelizer) {
            getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoqWrite = zzzVar.write(transitionValuesMapsPlaybackStateCompatCustomAction, getnumpadmovehomeek5ggoq);
            if (getnumpadmovehomeek5ggoqWrite instanceof getNumPadRightParenthesisEK5gGoQ) {
                getnumpadmovehomeek5ggoqWrite = zzzVar.write(transitionValuesMapsPlaybackStateCompatCustomAction, getnumpadmovehomeek5ggoq);
            }
            if (getnumpadmovehomeek5ggoqWrite instanceof getNumPadEqualsEK5gGoQ) {
                return ((getNumPadEqualsEK5gGoQ) getnumpadmovehomeek5ggoqWrite).RemoteActionCompatParcelizer;
            }
        }
        return getoek5ggoq;
    }

    public getNumPadMoveEndEK5gGoQ(String str, ArrayList arrayList, List list, androidx.transition.TransitionValuesMaps transitionValuesMaps) {
        super(str);
        this.read = new ArrayList();
        this.write = transitionValuesMaps;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.read.add(((getNumPadMoveHomeEK5gGoQ) it.next()).IconCompatParcelizer());
            }
        }
        this.RemoteActionCompatParcelizer = new ArrayList(list);
    }

    public getNumPadMoveEndEK5gGoQ(getNumPadMoveEndEK5gGoQ getnumpadmoveendek5ggoq) {
        super(getnumpadmoveendek5ggoq.serializer);
        ArrayList arrayList = new ArrayList(getnumpadmoveendek5ggoq.read.size());
        this.read = arrayList;
        arrayList.addAll(getnumpadmoveendek5ggoq.read);
        ArrayList arrayList2 = new ArrayList(getnumpadmoveendek5ggoq.RemoteActionCompatParcelizer.size());
        this.RemoteActionCompatParcelizer = arrayList2;
        arrayList2.addAll(getnumpadmoveendek5ggoq.RemoteActionCompatParcelizer);
        this.write = getnumpadmoveendek5ggoq.write;
    }
}
