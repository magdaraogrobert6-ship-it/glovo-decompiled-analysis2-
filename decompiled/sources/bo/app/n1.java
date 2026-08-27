package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.displayInAppMessagelambda1;
import o.getCieXyz;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda2;
import o.removeNodeAtDepth;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n1 implements g9 {
    public static final m1 g;
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] h;
    public final e8 a;
    public final JSONObject b;
    public final double c;
    public final String d;
    public final za e;
    public final za f;

    public static final String b() {
        return "Caught exception creating Braze event json";
    }

    public final void a(hf hfVar) {
        this.f.setValue(this, h[1], hfVar);
    }

    @Override // com.braze.models.IPutIntoJson
    public final JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.a.a);
            jSONObject.put(RemoteMessageConst.DATA, this.b);
            jSONObject.put(CrashHianalyticsData.TIME, this.c);
            za zaVar = this.e;
            registerInAppMessageManagerlambda2[] registerinappmessagemanagerlambda2Arr = h;
            registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda2 = registerinappmessagemanagerlambda2Arr[0];
            zaVar.getClass();
            registerinappmessagemanagerlambda2.getClass();
            String str = (String) zaVar.a;
            if (str != null && str.length() != 0) {
                za zaVar2 = this.e;
                registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda3 = registerinappmessagemanagerlambda2Arr[0];
                zaVar2.getClass();
                registerinappmessagemanagerlambda3.getClass();
                jSONObject.put("user_id", (String) zaVar2.a);
            }
            za zaVar3 = this.f;
            registerInAppMessageManagerlambda2 registerinappmessagemanagerlambda4 = registerinappmessagemanagerlambda2Arr[1];
            zaVar3.getClass();
            registerinappmessagemanagerlambda4.getClass();
            hf hfVar = (hf) zaVar3.a;
            if (hfVar != null) {
                jSONObject.put("session_id", hfVar.b);
            }
            return jSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(29), 4, (Object) null);
            return jSONObject;
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public n1(e8 e8Var, JSONObject jSONObject, double d, String str) {
        e8Var.getClass();
        jSONObject.getClass();
        str.getClass();
        this.a = e8Var;
        this.b = jSONObject;
        this.c = d;
        this.d = str;
        this.e = new za();
        this.f = new za();
        if (e8Var != e8.UNKNOWN) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Event type cannot be unknown.");
        throw null;
    }

    public final String toString() {
        String string = forJsonPut().toString();
        string.getClass();
        return string;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        Object[] objArr = {this.d, ((n1) obj).d};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(n1.class, "userId", "getUserId()Ljava/lang/String;", 0);
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        h = new registerInAppMessageManagerlambda2[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(n1.class, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0)};
        g = new m1();
    }

    public /* synthetic */ n1(e8 e8Var, JSONObject jSONObject, double d, int i) {
        this(e8Var, (i & 2) != 0 ? new JSONObject() : jSONObject, (i & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d, d$$ExternalSyntheticOutline0.m());
    }
}
