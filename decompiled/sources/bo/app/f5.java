package bo.app;

import android.content.Context;
import android.os.Build;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.ItemTouchHelperAdapter;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f5 extends b {
    public static final e5 e = new e5();
    public final BrazeConfigurationProvider b;
    public final g5 c;
    public d5 d;

    public static final String d() {
        return "Caught exception confirming and unlocking device cache.";
    }

    public static final String f() {
        return "Sending full device on next export but keeping cache intact.";
    }

    public static final String h() {
        return "Caught exception confirming and unlocking JSON objects.";
    }

    public static final String i() {
        return "Failed to generate diff between the cached and live device. Returning the live device.";
    }

    public static final String j() {
        return "Remote Notification Enabled changed to true. Updating user subscription.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(23), 6, (Object) null);
        this.c.writeData(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.TRUE);
    }

    public f5(Context context, String str, String str2) {
        context.getClass();
        this.b = new BrazeConfigurationProvider(context);
        this.c = new g5(context, str, str2);
    }

    @Override // bo.app.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final d5 c() {
        JSONObject jSONObjectA;
        String str = "{}";
        JSONObject jSONObject = new JSONObject();
        d5 d5Var = this.d;
        JSONObject jSONObjectForJsonPut = d5Var != null ? d5Var.forJsonPut() : new JSONObject();
        try {
            g5 g5Var = this.c;
            int i = g5.d;
            g5Var.getClass();
            String string = g5Var.readString(DataStoreKey.CACHED_DEVICE, "{}");
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (JSONException e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(24), 4, (Object) null);
        }
        g5 g5Var2 = this.c;
        int i2 = Build.VERSION.SDK_INT;
        g5Var2.getClass();
        Integer num = g5Var2.readInt(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION, Integer.valueOf(i2));
        int iIntValue = num != null ? num.intValue() : i2;
        e5 e5Var = e;
        final boolean zA = e5Var.a(jSONObject, jSONObjectForJsonPut, iIntValue, i2);
        g5 g5Var3 = this.c;
        g5Var3.getClass();
        Boolean bool = g5Var3.readBoolean(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT, Boolean.FALSE);
        final boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (zBooleanValue || zA) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.f5$$ExternalSyntheticLambda4
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return f5.a(zBooleanValue, zA);
                }
            }, 7, (Object) null);
            jSONObjectA = e5Var.a(new JSONObject(), jSONObjectForJsonPut);
        } else {
            jSONObjectA = e5Var.a(jSONObject, jSONObjectForJsonPut);
        }
        if (jSONObjectA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(25), 7, (Object) null);
            return this.d;
        }
        BrazeConfigurationProvider brazeConfigurationProvider = this.b;
        brazeConfigurationProvider.getClass();
        String optionalString = null;
        String optionalString2 = null;
        String str2 = null;
        String optionalString3 = null;
        String optionalString4 = null;
        String optionalString5 = null;
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = null;
        String optionalString6 = null;
        Boolean boolValueOf3 = null;
        for (DeviceKey deviceKey : DeviceKey.getEntries()) {
            String key = deviceKey.getKey();
            switch (b5.a[deviceKey.ordinal()]) {
                case 1:
                    optionalString5 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 2:
                    optionalString = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 3:
                    optionalString2 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 4:
                    optionalString4 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 5:
                    String optionalString7 = JsonUtils.getOptionalString(jSONObjectA, key);
                    if (optionalString7 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) optionalString7)) {
                        str2 = optionalString7;
                    }
                    break;
                case 6:
                    optionalString3 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 7:
                    if (jSONObjectA.has(key)) {
                        boolValueOf = Boolean.valueOf(jSONObjectA.optBoolean(key, true));
                    }
                    break;
                case 8:
                    if (jSONObjectA.has(key)) {
                        boolValueOf2 = Boolean.valueOf(jSONObjectA.optBoolean(key, false));
                    }
                    break;
                case 9:
                    optionalString6 = JsonUtils.getOptionalString(jSONObjectA, key);
                    break;
                case 10:
                    if (jSONObjectA.has(key)) {
                        boolValueOf3 = Boolean.valueOf(jSONObjectA.optBoolean(key));
                    }
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
            }
        }
        d5 d5Var2 = new d5(brazeConfigurationProvider, optionalString2, optionalString, str2, optionalString3, optionalString4, optionalString5, boolValueOf, boolValueOf2, optionalString6, boolValueOf3);
        if (!zA) {
            return d5Var2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(26), 6, (Object) null);
        d5Var2.l = true;
        return d5Var2;
    }

    @Override // bo.app.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void c(d5 d5Var, boolean z) {
        String str = "{}";
        d5Var.getClass();
        if (z) {
            try {
                g5 g5Var = this.c;
                int i = g5.d;
                g5Var.getClass();
                DataStoreKey dataStoreKey = DataStoreKey.CACHED_DEVICE;
                String string = g5Var.readString(dataStoreKey, "{}");
                if (string != null) {
                    str = string;
                }
                String string2 = JsonUtils.mergeJsonObjects(new JSONObject(str), d5Var.forJsonPut()).toString();
                string2.getClass();
                this.c.batchUpdate(onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0(dataStoreKey.getKey(), string2), new onViewAttachedToWindowlambda0(DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), Boolean.FALSE), new onViewAttachedToWindowlambda0(DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey(), Integer.valueOf(Build.VERSION.SDK_INT))), ItemTouchHelperAdapter.serializer);
            } catch (JSONException e2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e2, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(22), 4, (Object) null);
            }
        }
    }

    public static final String a(boolean z, boolean z2) {
        return "Exporting the full device due to either: shouldSendFullDeviceOnNextExport: " + z + ", shouldReportPushPermissionsAsGranted: " + z2;
    }
}
