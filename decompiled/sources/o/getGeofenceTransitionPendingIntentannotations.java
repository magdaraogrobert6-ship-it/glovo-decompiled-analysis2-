package o;

import java.lang.reflect.Field;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getGeofenceTransitionPendingIntentannotations;

/* JADX INFO: loaded from: classes3.dex */
public final class getGeofenceTransitionPendingIntentannotations {
    public static final serializer read = new serializer(null);
    private final isAdapterPositionOnScreen write = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.sentiance.sdk.deviceinfo.ReactNativeInfoProvider$version$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            try {
                Field field = Class.forName("com.facebook.react.modules.systeminfo.ReactNativeVersion").getField("VERSION");
                field.setAccessible(true);
                Object obj = field.get(null);
                Map map = obj instanceof Map ? (Map) obj : null;
                if (map == null) {
                    return null;
                }
                getGeofenceTransitionPendingIntentannotations.read.getClass();
                return getGeofenceTransitionPendingIntentannotations.serializer.read(map);
            } catch (Exception unused) {
                return null;
            }
        }
    });

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static String read(Map map) {
            Object obj = map.get("major");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null) {
                int iIntValue = num.intValue();
                Object obj2 = map.get("minor");
                Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    Object obj3 = map.get("patch");
                    Integer num3 = obj3 instanceof Integer ? (Integer) obj3 : null;
                    if (num3 != null) {
                        int iIntValue3 = num3.intValue();
                        Object obj4 = map.get("prerelease");
                        String str = obj4 instanceof String ? (String) obj4 : null;
                        StringBuilder sb = new StringBuilder();
                        sb.append(iIntValue);
                        sb.append('.');
                        sb.append(iIntValue2);
                        sb.append('.');
                        sb.append(iIntValue3);
                        sb.append(str != null ? "-".concat(str) : "");
                        return sb.toString();
                    }
                }
            }
            return null;
        }
    }

    public final String IconCompatParcelizer() {
        return (String) this.write.MediaSessionCompatResultReceiverWrapper();
    }
}
