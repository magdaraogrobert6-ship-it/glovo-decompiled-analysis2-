package o;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessswap implements Iterable {
    public abstract Object IconCompatParcelizer(visitNodes visitnodes);

    public abstract Comparator IconCompatParcelizer();

    public abstract int RemoteActionCompatParcelizer();

    public abstract accessswap RemoteActionCompatParcelizer(Object obj);

    public abstract accessswap RemoteActionCompatParcelizer(Object obj, Object obj2);

    public abstract Object read();

    public abstract boolean serializer();

    public abstract boolean serializer(Object obj);

    public abstract Object write();

    public abstract Iterator write(Object obj);

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessswap)) {
            return false;
        }
        accessswap accessswapVar = (accessswap) obj;
        if (!IconCompatParcelizer().equals(accessswapVar.IconCompatParcelizer()) || RemoteActionCompatParcelizer() != accessswapVar.RemoteActionCompatParcelizer()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = accessswapVar.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = IconCompatParcelizer().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }
}
