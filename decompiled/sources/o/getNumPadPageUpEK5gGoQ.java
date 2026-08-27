package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class getNumPadPageUpEK5gGoQ implements getNumPadMoveHomeEK5gGoQ, getNumPadMultiplyEK5gGoQ {
    public final HashMap RemoteActionCompatParcelizer = new HashMap();

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Boolean serializer() {
        return Boolean.TRUE;
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final String IconCompatParcelizer() {
        return "[object Object]";
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ MediaDescriptionCompat() {
        getNumPadPageUpEK5gGoQ getnumpadpageupek5ggoq = new getNumPadPageUpEK5gGoQ();
        for (Map.Entry entry : this.RemoteActionCompatParcelizer.entrySet()) {
            boolean z = entry.getValue() instanceof getNumPadMultiplyEK5gGoQ;
            HashMap map = getnumpadpageupek5ggoq.RemoteActionCompatParcelizer;
            if (z) {
                map.put((String) entry.getKey(), (getNumPadMoveHomeEK5gGoQ) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((getNumPadMoveHomeEK5gGoQ) entry.getValue()).MediaDescriptionCompat());
            }
        }
        return getnumpadpageupek5ggoq;
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final boolean RemoteActionCompatParcelizer(String str) {
        return this.RemoteActionCompatParcelizer.containsKey(str);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Iterator read() {
        return new getNumPadDotEK5gGoQ(this.RemoteActionCompatParcelizer.keySet().iterator());
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public getNumPadMoveHomeEK5gGoQ read(String str, androidx.transition.TransitionValuesMaps transitionValuesMaps, ArrayList arrayList) {
        return "toString".equals(str) ? new getNumPadSubtractEK5gGoQ(toString()) : getNumPadMultiplyEK5gGoQ.serializer(this, new getNumPadSubtractEK5gGoQ(str), transitionValuesMaps, arrayList);
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final getNumPadMoveHomeEK5gGoQ serializer(String str) {
        HashMap map = this.RemoteActionCompatParcelizer;
        return map.containsKey(str) ? (getNumPadMoveHomeEK5gGoQ) map.get(str) : getNumPadMoveHomeEK5gGoQ.MediaBrowserCompatMediaItem;
    }

    @Override // o.getNumPadMultiplyEK5gGoQ
    public final void RemoteActionCompatParcelizer(String str, getNumPadMoveHomeEK5gGoQ getnumpadmovehomeek5ggoq) {
        HashMap map = this.RemoteActionCompatParcelizer;
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
        if (obj instanceof getNumPadPageUpEK5gGoQ) {
            return this.RemoteActionCompatParcelizer.equals(((getNumPadPageUpEK5gGoQ) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.RemoteActionCompatParcelizer;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // o.getNumPadMoveHomeEK5gGoQ
    public final Double write() {
        return Double.valueOf(Double.NaN);
    }
}
