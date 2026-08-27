package androidx.compose.material.ripple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class RippleHostMap {
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public final LinkedHashMap read;

    public Set getAllClearedRouteIds() {
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((onViewAttachedToWindowlambda0) ((Map.Entry) it.next()).getValue()).write);
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
    }

    public Set getAllRenderedRouteIds() {
        LinkedHashMap linkedHashMap = this.read;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((onViewAttachedToWindowlambda0) ((Map.Entry) it.next()).getValue()).write);
        }
        return onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList);
    }

    public RippleHostMap(int i) {
        if (i != 1) {
            this.read = new LinkedHashMap();
            this.RemoteActionCompatParcelizer = new LinkedHashMap();
        } else {
            this.read = new LinkedHashMap();
            this.RemoteActionCompatParcelizer = new LinkedHashMap();
        }
    }
}
