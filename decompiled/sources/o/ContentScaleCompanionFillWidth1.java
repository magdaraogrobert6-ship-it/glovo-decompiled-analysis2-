package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ContentScaleCompanionFillWidth1 {
    public static int read;
    public static int write;

    public static boolean RemoteActionCompatParcelizer(ContentScaleCompanionFillHeight1 contentScaleCompanionFillHeight1, Collection collection) {
        collection.getClass();
        if (collection instanceof getInside) {
            collection = ((getInside) collection).RemoteActionCompatParcelizer();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= contentScaleCompanionFillHeight1.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= contentScaleCompanionFillHeight1.remove(it.next());
            }
            return zRemove;
        }
        Iterator<E> it2 = contentScaleCompanionFillHeight1.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static int write() {
        int i = write;
        int i2 = i % 5903486;
        write = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iNextInt = new Random().nextInt(2039771117);
        read = iNextInt;
        return iNextInt;
    }
}
