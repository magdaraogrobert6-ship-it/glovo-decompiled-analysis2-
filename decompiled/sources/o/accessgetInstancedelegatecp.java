package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class accessgetInstancedelegatecp extends androidx.sqlite.SQLite {
    public static int write(Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    public static ArrayList r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) it.next(), (Collection) arrayList);
        }
        return arrayList;
    }
}
