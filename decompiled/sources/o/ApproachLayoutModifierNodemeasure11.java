package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ApproachLayoutModifierNodemeasure11 {
    public static boolean write(onExit onexit, Collection collection) {
        collection.getClass();
        if (collection instanceof setSuppressMovementConsumption) {
            collection = ((setSuppressMovementConsumption) collection).serializer();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= onexit.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= onexit.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = onexit.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static int serializer(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
