package bo.app;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.DeviceKey;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d5 implements IPutIntoJson, t9 {
    public static final c5 n = new c5();
    public final BrazeConfigurationProvider a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final String j;
    public final Boolean k;
    public boolean l;
    public boolean m;

    public static final String b() {
        return "Caught exception creating device Json.";
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            c5 c5Var = n;
            c5Var.a(this.a, jSONObject, DeviceKey.ANDROID_VERSION, this.b);
            c5Var.a(this.a, jSONObject, DeviceKey.CARRIER, this.c);
            c5Var.a(this.a, jSONObject, DeviceKey.BRAND, this.d);
            c5Var.a(this.a, jSONObject, DeviceKey.MODEL, this.e);
            c5Var.a(this.a, jSONObject, DeviceKey.LOCALE, this.f);
            if (this.m) {
                c5Var.a(this.a, jSONObject, DeviceKey.NOTIFICATIONS_ENABLED, this.h);
            }
            c5Var.a(this.a, jSONObject, DeviceKey.IS_BACKGROUND_RESTRICTED, this.i);
            c5Var.a(this.a, jSONObject, DeviceKey.GOOGLE_ADVERTISING_ID, this.j);
            Boolean bool = this.k;
            if (bool != null) {
                c5Var.a(this.a, jSONObject, DeviceKey.AD_TRACKING_ENABLED, bool);
            }
            String str = this.g;
            if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                c5Var.a(this.a, jSONObject, DeviceKey.TIMEZONE, this.g);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g$$ExternalSyntheticLambda0(3), 4, (Object) null);
            return jSONObject;
        }
    }

    public d5(BrazeConfigurationProvider brazeConfigurationProvider, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, Boolean bool3) {
        brazeConfigurationProvider.getClass();
        this.a = brazeConfigurationProvider;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bool;
        this.i = bool2;
        this.j = str7;
        this.k = bool3;
        this.m = true;
    }

    @Override // bo.app.t9
    public final boolean isEmpty() {
        return forJsonPut().length() == 0;
    }
}
