package o;

import android.os.Process;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WindowInsetsRulers_androidKt {
    public static final HashMap RemoteActionCompatParcelizer;

    public static Map serializer() {
        Map map;
        synchronized (WindowInsetsRulers_androidKt.class) {
            HashMap map2 = RemoteActionCompatParcelizer;
            if (!map2.containsKey("app_update")) {
                HashMap map3 = new HashMap();
                map3.put("java", 11004);
                map2.put("app_update", map3);
            }
            map = (Map) map2.get("app_update");
        }
        return map;
    }

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        RemoteActionCompatParcelizer = new HashMap();
        af$$ExternalSyntheticOutline0.m(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}
