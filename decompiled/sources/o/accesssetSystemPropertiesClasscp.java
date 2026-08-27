package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetSystemPropertiesClasscp extends r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw {
    public static final Map IconCompatParcelizer;
    public static accesssetSystemPropertiesClasscp write;

    static {
        accessstartDrag12SF9DM accessstartdrag12sf9dm = new accessstartDrag12SF9DM();
        accessstartdrag12sf9dm.put(461L, "FIREPERF_AUTOPUSH");
        accessstartdrag12sf9dm.put(462L, "FIREPERF");
        accessstartdrag12sf9dm.put(675L, "FIREPERF_INTERNAL_LOW");
        accessstartdrag12sf9dm.put(676L, "FIREPERF_INTERNAL_HIGH");
        IconCompatParcelizer = Collections.unmodifiableMap(accessstartdrag12sf9dm);
    }

    @Override // o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw
    public final String RemoteActionCompatParcelizer() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
