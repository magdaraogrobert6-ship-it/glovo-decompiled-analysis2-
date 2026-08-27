package bo.app;

import com.braze.models.Banner;
import com.braze.models.BannerPendingDismissal;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends l2 {
    public final ArrayList l;
    public final List m;
    public final k9 n;

    @Override // bo.app.l9
    public final k9 b() {
        return this.n;
    }

    @Override // bo.app.l9
    public final boolean c() {
        return false;
    }

    public static final String l() {
        return "Experienced JSONException while creating Banners Sync request. Returning null.";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ArrayList arrayList, List list, df dfVar, String str, String str2) {
        super(new td(str.concat("banners/sync"), false), str2, dfVar, 8);
        arrayList.getClass();
        list.getClass();
        dfVar.getClass();
        str.getClass();
        this.l = arrayList;
        this.m = list;
        this.n = k9.BANNERS_SYNC;
    }

    public final LinkedHashSet m() {
        ArrayList arrayList = this.l;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            linkedHashSet.add((String) ((onViewAttachedToWindowlambda0) obj).serializer);
        }
        return linkedHashSet;
    }

    @Override // bo.app.l2, bo.app.l9
    public final JSONObject a() {
        JSONObject jSONObjectA = super.a();
        if (jSONObjectA == null) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.l;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", ((onViewAttachedToWindowlambda0) obj).serializer);
                jSONArray.put(jSONObject);
            }
            String str = this.b;
            if (str != null && !hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
                jSONObjectA.put("user_id", this.b);
            }
            Object obj2 = this.f;
            if (obj2 != null) {
                jSONObjectA.put("time_ms", obj2);
            }
            jSONObjectA.put("placements", jSONArray);
            if (!this.m.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (BannerPendingDismissal bannerPendingDismissal : this.m) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("banner_id", bannerPendingDismissal.getBannerId());
                    jSONObject2.put(Banner.STABLE_KEY, bannerPendingDismissal.getStableKey());
                    jSONObject2.put("dismissal_time", bannerPendingDismissal.getDismissalTimeMs());
                    jSONArray2.put(jSONObject2);
                }
                jSONObjectA.put("pending_dismissals", jSONArray2);
            }
            return jSONObjectA;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new l$$ExternalSyntheticLambda0(12), 4, (Object) null);
            return null;
        }
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, vb vbVar) {
        z7Var.getClass();
        u9Var.getClass();
        vbVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new h$$ExternalSyntheticLambda0(15, this), 6, (Object) null);
        z7Var.b(new j0(this), j0.class);
    }

    public static final String a(k0 k0Var) {
        return af$$ExternalSyntheticOutline0.m(k0Var.l.size(), "BannersSyncRequest executed successfully. placements=", k0Var.m.size(), " pendingDismissals=");
    }

    @Override // bo.app.l2, bo.app.z9
    public final void a(z7 z7Var, u9 u9Var, ba baVar) {
        z7Var.getClass();
        u9Var.getClass();
        baVar.getClass();
        super.a(z7Var, u9Var, baVar);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(this, 5, baVar), 6, (Object) null);
        z7Var.b(new i0(), i0.class);
    }

    public static final String a(k0 k0Var, ba baVar) {
        int size = k0Var.l.size();
        int size2 = k0Var.m.size();
        String strA = baVar.a();
        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m(size, size2, "BannersSyncRequest failed. placements=", " pendingDismissals=", " error=");
        sbM.append(strA);
        return sbM.toString();
    }

    @Override // bo.app.l2, bo.app.l9
    public final void a(HashMap map) {
        map.getClass();
        super.a(map);
        map.put("X-Braze-DataRequest", "true");
        map.put("X-Braze-BannersRequest", "true");
    }
}
