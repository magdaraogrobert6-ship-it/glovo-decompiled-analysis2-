package o;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class SuspendingTransactionWithReturn implements decode {
    private static int IconCompatParcelizer = 1;
    private static int read;

    @Override // o.decode
    public final void IconCompatParcelizer(String str, Map map) {
        int i = 2 % 2;
        str.getClass();
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
        getintentarraywithconfiguredbackstacklambda1.write = str;
        getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
        if (map != null) {
            int i2 = read + 87;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            for (Map.Entry entry : map.entrySet()) {
                int i4 = read + 19;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                getintentarraywithconfiguredbackstacklambda1.read(entry.getValue(), (String) entry.getKey());
            }
        }
        internalHeightCallbacklambda0.IconCompatParcelizer().read(getintentarraywithconfiguredbackstacklambda1);
    }

    @Override // o.decode
    public final void logEvent(String str, Map map) {
        int i = 2 % 2;
        str.getClass();
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = new getIntentArrayWithConfiguredBackStacklambda1();
        getintentarraywithconfiguredbackstacklambda1.write = str;
        getintentarraywithconfiguredbackstacklambda1.read = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO;
        if (map != null) {
            int i2 = read + 29;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            Iterator it = map.entrySet().iterator();
            while (!(!it.hasNext())) {
                Map.Entry entry = (Map.Entry) it.next();
                getintentarraywithconfiguredbackstacklambda1.read(entry.getValue(), (String) entry.getKey());
            }
        }
        internalHeightCallbacklambda0.IconCompatParcelizer().read(getintentarraywithconfiguredbackstacklambda1);
        int i4 = IconCompatParcelizer + 49;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
