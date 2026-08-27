package o;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DiffCallback {
    public static boolean RemoteActionCompatParcelizer(undelegateUnprotectedui undelegateunprotectedui, Object obj) {
        if (undelegateunprotectedui == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return undelegateunprotectedui.size() == set.size() && undelegateunprotectedui.containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static int serializer(undelegateUnprotectedui undelegateunprotectedui) {
        Iterator it = undelegateunprotectedui.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }
}
