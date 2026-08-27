package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getNumPadInsertEK5gGoQ implements getNumPadMoveHomeEK5gGoQ, getNumPadMultiplyEK5gGoQ {
    public final HashMap IconCompatParcelizer = new HashMap();
    public final String serializer;

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        return this.serializer;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        return this;
    }

    public abstract getNumPadMoveHomeEK5gGoQ RemoteActionCompatParcelizer(androidx.transition.TransitionValuesMaps transitionValuesMaps, List list);

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        return Boolean.TRUE;
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final boolean RemoteActionCompatParcelizer(String str) {
        return this.IconCompatParcelizer.containsKey(str);
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return new getNumPadDotEK5gGoQ(this.IconCompatParcelizer.keySet().iterator());
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        return "toString".equals(str) ? new getNumPadSubtractEK5gGoQ(this.serializer) : getNumPadMultiplyEK5gGoQ.serializer(this, new getNumPadSubtractEK5gGoQ(str), transitionValuesMaps, arrayList);
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ serializer(String str) {
        HashMap map = this.IconCompatParcelizer;
        return map.containsKey(str) ? (getNumPadMoveHomeEK5gGoQ) map.get(str) : getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final void RemoteActionCompatParcelizer(String str, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        HashMap map = this.IconCompatParcelizer;
        if (getnumpadmovehomeek5ggoq == null) {
            map.remove(str);
        } else {
            map.put(str, getnumpadmovehomeek5ggoq);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNumPadInsertEK5gGoQ)) {
            return false;
        }
        getNumPadInsertEK5gGoQ getnumpadinsertek5ggoq = (getNumPadInsertEK5gGoQ) obj;
        String str = this.serializer;
        if (str != null) {
            return str.equals(getnumpadinsertek5ggoq.serializer);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.serializer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public getNumPadInsertEK5gGoQ(String str) {
        this.serializer = str;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        return Double.valueOf(Double.NaN);
    }
}
