package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BringIntoViewModifierNodeKt {
    public static final Map RemoteActionCompatParcelizer;

    static {
        HashMap map = new HashMap();
        onSessionStarted.IconCompatParcelizer(29, map, "Android10", 30, "Android11");
        onSessionStarted.IconCompatParcelizer(28, map, "Android9", 26, "Android8");
        onSessionStarted.IconCompatParcelizer(27, map, "Android8", 24, "Android7");
        map.put(25, "Android7");
        RemoteActionCompatParcelizer = Collections.unmodifiableMap(map);
    }
}
