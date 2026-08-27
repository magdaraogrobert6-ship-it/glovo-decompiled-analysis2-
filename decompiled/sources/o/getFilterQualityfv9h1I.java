package o;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class getFilterQualityfv9h1I {
    public final LinkedHashMap serializer = new LinkedHashMap();

    public final void read() {
        LinkedHashMap linkedHashMap = this.serializer;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((androidx.lifecycle.ViewModel) it.next()).clear$lifecycle_viewmodel();
        }
        linkedHashMap.clear();
    }
}
