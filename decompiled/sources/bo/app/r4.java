package bo.app;

import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DataStoreKey;
import com.braze.enums.DeviceKey;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import o.accessgetInstancedelegatecp;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class r4 extends l2 {
    public tb l;
    public SdkFlavor m;
    public ub n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o1 f22o;
    public EnumSet p;
    public String q;
    public String r;
    public fh s;
    public final k9 t;

    public static final String l() {
        return "Remote notifications enabled field set on request, but push token field not set. Not sending remote notifications enabled field.";
    }

    public static final String m() {
        return "Experienced JSONException while retrieving parameters. Returning empty object.";
    }

    public static final String n() {
        return "Trigger dispatch completed. Alerting subscribers.";
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    @Override // bo.app.l9
    public final boolean c() {
        ArrayList arrayList;
        int size;
        int i;
        t9 t9Var;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.j);
        arrayList2.add(this.n);
        arrayList2.add(this.f22o);
        arrayList2.add(this.l);
        if (arrayList2.isEmpty()) {
            arrayList = new ArrayList();
            arrayList.add(this.j);
            size = arrayList.size();
            i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t9Var = (t9) obj;
                if (t9Var != null || t9Var.isEmpty()) {
                }
            }
            return true;
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            t9 t9Var2 = (t9) obj2;
            if (t9Var2 == null || t9Var2.isEmpty()) {
            }
        }
        arrayList = new ArrayList();
        arrayList.add(this.j);
        size = arrayList.size();
        i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            t9Var = (t9) obj3;
            if (t9Var != null) {
            }
        }
        return true;
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(df dfVar, String str, tb tbVar) {
        super(new td(str.concat(RemoteMessageConst.DATA), false), (String) null, dfVar, 10);
        dfVar.getClass();
        str.getClass();
        tbVar.getClass();
        this.l = tbVar;
        this.t = k9.V3_DATA;
    }

    @Override // bo.app.l2, bo.app.z9
    public final void b(z7 z7Var) {
        z7Var.getClass();
        if (this.l.b()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(24), 7, (Object) null);
            z7Var.b(new mg(this), mg.class);
        }
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        ub ubVar;
        d5 d5Var = this.j;
        if (d5Var == null || !d5Var.forJsonPut().has(DeviceKey.NOTIFICATIONS_ENABLED.getKey()) || ((ubVar = this.n) != null && ubVar.a.has(DataStoreKey.PUSH_TOKEN.getKey()))) {
            d5 d5Var2 = this.j;
            if (d5Var2 != null) {
                d5Var2.m = true;
            }
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(25), 7, (Object) null);
            d5 d5Var3 = this.j;
            if (d5Var3 != null) {
                d5Var3.m = false;
            }
        }
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        try {
            String str = this.q;
            if (str != null) {
                jSONObjectA.put("app_version", str);
            }
            String str2 = this.r;
            if (str2 != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                jSONObjectA.put("app_version_code", this.r);
            }
            ub ubVar2 = this.n;
            if (ubVar2 != null && !ubVar2.isEmpty()) {
                JSONArray jSONArray = ubVar2.b;
                jSONArray.getClass();
                jSONObjectA.put("attributes", jSONArray);
            }
            o1 o1Var = this.f22o;
            if (o1Var != null && !o1Var.b) {
                jSONObjectA.put("events", JsonUtils.constructJsonArray(o1Var.a));
            }
            SdkFlavor sdkFlavor = this.m;
            if (sdkFlavor != null) {
                jSONObjectA.put("sdk_flavor", sdkFlavor.forJsonPut());
            }
            EnumSet<BrazeSdkMetadata> enumSet = this.p;
            if (enumSet != null) {
                BrazeSdkMetadata.Companion.getClass();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(enumSet, 10));
                for (BrazeSdkMetadata brazeSdkMetadata : enumSet) {
                    brazeSdkMetadata.getClass();
                    arrayList.add(brazeSdkMetadata.jsonKey);
                }
                jSONObjectA.put("sdk_metadata", new JSONArray((Collection) onContentCardDismissed.PlaybackStateCompatCustomAction(arrayList)));
            }
            jSONObjectA.put("respond_with", this.l.forJsonPut());
            fh fhVar = this.s;
            if (fhVar != null) {
                jSONObjectA.put("triggers", new JSONObject().put("checksums", fhVar.a()));
            }
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n4$$ExternalSyntheticLambda0(26), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l9
    public final k9 b() {
        return this.t;
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var) {
        z7Var.getClass();
        if (this.l.b()) {
            z7Var.b(new ng(this), ng.class);
        }
    }

    @Override // bo.app.l2, bo.app.l9
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        if (!this.l.isEmpty() && this.l.b()) {
            map.put("X-Braze-TriggersRequest", "true");
            map.put("X-Braze-DataRequest", "true");
        }
    }
}
