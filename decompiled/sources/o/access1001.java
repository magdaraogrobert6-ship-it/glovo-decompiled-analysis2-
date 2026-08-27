package o;

import android.content.Context;
import com.huawei.hms.android.SystemUtils;
import com.roadrunner.logger.api.critical.CriticalObservabilityException;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Collections;
import java.util.Map;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public abstract class access1001 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    public static /* synthetic */ void IconCompatParcelizer(boolean z, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection, Exception exc, executeAsList executeaslist) {
        int i = 2 % 2;
        int i2 = read + 91;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer(z, swipeDismissTouchListenerVerticalDismissDirection, exc, null, executeaslist);
        } else {
            RemoteActionCompatParcelizer(z, swipeDismissTouchListenerVerticalDismissDirection, exc, null, executeaslist);
            obj.hashCode();
            throw null;
        }
    }

    public static final void RemoteActionCompatParcelizer(boolean z, SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection, Exception exc, String str, executeAsList executeaslist) {
        String str2;
        int i = 2 % 2;
        executeaslist.getClass();
        String str3 = "Delivery flow state parsing error: " + swipeDismissTouchListenerVerticalDismissDirection;
        if (!z) {
            int i2 = read + 81;
            IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 3 / 2;
            }
            str2 = "delivery_flow_non_critical_component_parsing_error";
        } else {
            int i4 = IconCompatParcelizer + 19;
            int i5 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            read = i5;
            int i6 = i4 % 2;
            int i7 = i5 + 101;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i8 = i7 % 2;
            str2 = "delivery_flow_critical_component_parsing_error";
        }
        String str4 = str2;
        int i9 = read;
        int i10 = i9 + 49;
        IconCompatParcelizer = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i11 = i10 % 2;
        if (str == null) {
            int i12 = i9 + 113;
            IconCompatParcelizer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                throw null;
            }
            str = SystemUtils.UNKNOWN;
        }
        Map mapSingletonMap = Collections.singletonMap("type", str);
        mapSingletonMap.getClass();
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new CriticalObservabilityException(str4, executeaslist, mapSingletonMap, str3, exc), str3, new Object[0]);
    }

    public static String write(Context context, int i) {
        int i2 = 2 % 2;
        if (context == null) {
            int i3 = read + 77;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return "";
        }
        if (i != 1) {
            int i5 = read + 113;
            int i6 = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            IconCompatParcelizer = i6;
            int i7 = i5 % 2;
            if (i != 7) {
                int i8 = i6 + 75;
                read = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i9 = i8 % 2;
                switch (i) {
                    case 9:
                        break;
                    case 10:
                        return context.getString(com.logistics.rider.glovo.R.string.fingerprint_error_user_canceled);
                    case 11:
                        return context.getString(com.logistics.rider.glovo.R.string.fingerprint_error_no_fingerprints);
                    case 12:
                        return context.getString(com.logistics.rider.glovo.R.string.fingerprint_error_hw_not_present);
                    default:
                        SentryLogcatAdapter.serializer("BiometricUtils", "Unknown error code: " + i);
                        return context.getString(com.logistics.rider.glovo.R.string.default_error_msg);
                }
            }
            return context.getString(com.logistics.rider.glovo.R.string.fingerprint_error_lockout);
        }
        return context.getString(com.logistics.rider.glovo.R.string.fingerprint_error_hw_not_available);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if ((!o.SoftKeyboardInterceptionModifierNode.class.getPackage().equals(o.access1001.class.getPackage())) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(o.SoftKeyboardInterceptionModifierNode.class.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        r1 = o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(o.SoftKeyboardInterceptionModifierNode.class.getPackage().getName(), ".BlazeGeneratedzzlrLoader");
        r3 = o.access1001.IconCompatParcelizer + 83;
        o.access1001.read = r3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if ((r3 % 2) != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        r3 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (o.SoftKeyboardInterceptionModifierNode.class.getPackage().equals(o.access1001.class.getPackage()) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.SoftKeyboardInterceptionModifierNode serializer() {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.access1001.serializer():o.SoftKeyboardInterceptionModifierNode");
    }
}
