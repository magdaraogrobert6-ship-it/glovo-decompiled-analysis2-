package bo.app;

import com.braze.events.BrazeNetworkFailureEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.NoMatchingTriggerEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.deliveryhero.fwf_http.ConstantKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.BuildersKt;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class o2 {
    public final rd a;
    public final bb b;
    public final z7 c;
    public final u9 d;
    public final h2 e;
    public final df f;
    public final d4 g;
    public final i7 h;
    public final md i;
    public final HashMap j;
    public final l9 k;

    public static final String d() {
        return "Api response was null, failing task.";
    }

    public o2(rd rdVar, bb bbVar, z7 z7Var, u9 u9Var, h2 h2Var, df dfVar, d4 d4Var, i7 i7Var, md mdVar) {
        rdVar.getClass();
        bbVar.getClass();
        z7Var.getClass();
        u9Var.getClass();
        h2Var.getClass();
        dfVar.getClass();
        d4Var.getClass();
        i7Var.getClass();
        mdVar.getClass();
        this.a = rdVar;
        this.b = bbVar;
        this.c = z7Var;
        this.d = u9Var;
        this.e = h2Var;
        this.f = dfVar;
        this.g = d4Var;
        this.h = i7Var;
        this.i = mdVar;
        HashMap map = new HashMap();
        map.put("Accept-Encoding", "gzip, deflate");
        map.put(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
        this.j = map;
        l9 l9Var = rdVar.a;
        this.k = l9Var;
        l9Var.a(map);
    }

    public static final createFromParcel b(o2 o2Var, List list) {
        o2Var.c.b(new c9(list), c9.class);
        return createFromParcel.INSTANCE;
    }

    public final j a() {
        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
        ((l2) this.k).f = Long.valueOf(jNowInMilliseconds);
        ((l2) this.k).e = Long.valueOf(jNowInMilliseconds / 1000);
        td tdVarE = ((l2) this.k).e();
        JSONObject jSONObjectA = this.k.a();
        if (jSONObjectA == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new e9$$ExternalSyntheticLambda0(tdVarE, 1), 6, (Object) null);
            return new gh(this.k, new v9(-1, (Map) null, 6));
        }
        i7 i7Var = this.h;
        tdVarE.getClass();
        String strB = i7.b(tdVarE.a);
        long jA = i7Var.a.a(strB);
        long jNowInMilliseconds2 = DateTimeUtils.nowInMilliseconds();
        com.braze.storage.e eVar = i7Var.a;
        eVar.getClass();
        strB.getClass();
        BuildersKt.write(new h7(eVar, strB, jNowInMilliseconds2, null));
        this.j.put("X-Braze-Last-Req-Ms-Ago", String.valueOf(Math.min(jNowInMilliseconds2 - jA, 7200000L)));
        HashMap map = this.j;
        i7 i7Var2 = this.h;
        String strA = i7.a(tdVarE.a);
        long jA2 = i7Var2.a.a(strA, 1L);
        com.braze.storage.e eVar2 = i7Var2.a;
        eVar2.getClass();
        strA.getClass();
        BuildersKt.write(new f7(eVar2, strA, jA2 + 1, null));
        map.put("X-Braze-Req-Attempt", String.valueOf(jA2));
        this.j.put("X-Braze-Req-Tokens-Remaining", String.valueOf(this.a.e));
        Integer num = this.a.f;
        if (num != null) {
            this.j.put("X-Braze-Ept-Req-Tokens-Remaining", String.valueOf(num.intValue()));
        }
        v9 v9VarA = this.b.a(tdVarE, this.j, jSONObjectA);
        if (v9VarA.c != null) {
            return new vb(this.k, v9VarA, this.e);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(28), 6, (Object) null);
        ((z7) this.d).b(new BrazeNetworkFailureEvent(this.k, v9VarA), BrazeNetworkFailureEvent.class);
        return new gh(this.k, v9VarA);
    }

    public final void c() {
        j jVarA = a();
        if (!(jVarA instanceof vb)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c8$$ExternalSyntheticLambda1(27), 6, (Object) null);
            jb jbVar = new jb(this.k, jVarA.a);
            this.k.a(this.c, this.d, jbVar);
            this.c.b(new x5(this.k), x5.class);
            a(jbVar);
            this.i.a(jVarA);
            return;
        }
        vb vbVar = (vb) jVarA;
        ba baVar = vbVar.d;
        if (baVar == null) {
            i7 i7Var = this.h;
            td tdVarE = ((l2) this.k).e();
            tdVarE.getClass();
            String strA = i7.a(tdVarE.a);
            com.braze.storage.e eVar = i7Var.a;
            eVar.getClass();
            strA.getClass();
            BuildersKt.write(new f7(eVar, strA, 1L, null));
            this.k.a(this.c, this.d, vbVar);
            this.i.a(vbVar);
        } else {
            a(baVar);
            this.k.a(this.c, this.d, vbVar.d);
            this.i.a((j) vbVar);
        }
        a(vbVar);
        boolean z = vbVar.d instanceof yd;
        z7 z7Var = this.c;
        l9 l9Var = this.k;
        if (z) {
            z7Var.b(new x5(l9Var), x5.class);
        } else {
            z7Var.b(new y5(l9Var), y5.class);
        }
    }

    public static final String b(ba baVar) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Received server error from request: ", baVar.a());
    }

    public final void b(ArrayList arrayList) {
        if (arrayList != null) {
            n2.a(arrayList, new o2$$ExternalSyntheticLambda2(this, arrayList, 1));
        }
    }

    public static final String b() {
        return "Experienced network communication exception processing API response. Sending network error event.";
    }

    public static final String a(td tdVar) {
        return "Could not parse request parameters for POST request to " + tdVar + ", cancelling request.";
    }

    public final void a(vb vbVar) {
        vbVar.getClass();
        String str = this.e.b;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda6(str, 9), 6, (Object) null);
        a(vbVar.f, str);
        a(vbVar.k);
        a(vbVar.h, vbVar.j, vbVar.i);
        b(vbVar.l);
        a(vbVar.m);
        a(vbVar.g, str);
        String str2 = vbVar.n;
        String str3 = vbVar.f25o;
        String str4 = vbVar.p;
        Long l = vbVar.q;
        if (str2 != null && str3 != null && str4 != null) {
            this.c.b(new a6(str2, str3, str4, l), a6.class);
        }
        a(vbVar.s, vbVar.t, vbVar.u);
        a(vbVar.u);
        ce ceVar = vbVar.v;
        if (ceVar != null) {
            this.c.b(new he(ceVar), he.class);
        }
    }

    public static final String a(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Processing server response payload for user with id: ", str);
    }

    public final void a(ba baVar) {
        baVar.getClass();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new je$$ExternalSyntheticLambda0(baVar, 2), 6, (Object) null);
        this.c.b(new ef(baVar), ef.class);
        l9 l9Var = this.k;
        if (l9Var instanceof yf) {
            u9 u9Var = this.d;
            String strA = ((yf) l9Var).m.a();
            strA.getClass();
            ((z7) u9Var).b(new NoMatchingTriggerEvent(strA), NoMatchingTriggerEvent.class);
        }
    }

    public final void a(a4 a4Var, String str) {
        if (a4Var != null) {
            n2.a(a4Var, new bb$$ExternalSyntheticLambda0(this, a4Var, str, 2));
        }
    }

    public static final createFromParcel a(o2 o2Var, a4 a4Var, String str) {
        ContentCardsUpdatedEvent contentCardsUpdatedEventA = o2Var.g.a(a4Var, str);
        if (contentCardsUpdatedEventA != null) {
            ((z7) o2Var.d).b(contentCardsUpdatedEventA, ContentCardsUpdatedEvent.class);
        }
        return createFromParcel.INSTANCE;
    }

    public final void a(af afVar) {
        if (afVar != null) {
            n2.a(afVar, new d4$$ExternalSyntheticLambda2(this, 10, afVar));
        }
    }

    public static final createFromParcel a(o2 o2Var, af afVar) {
        o2Var.f.a(afVar);
        o2Var.c.b(new cf(afVar), cf.class);
        afVar.getClass();
        o2Var.c.b(new he(new ce(afVar.z, afVar.B, afVar.A, afVar.C, afVar.D, afVar.E)), he.class);
        return createFromParcel.INSTANCE;
    }

    public final void a(List list, fh fhVar, List list2) {
        if (list == null && list2 == null) {
            return;
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (list == null) {
            list = instance_delegatelambda0Var;
        }
        if (list2 == null) {
            list2 = instance_delegatelambda0Var;
        }
        n2.a(list, new o2$$ExternalSyntheticLambda3(this, list, fhVar, list2));
    }

    public static final createFromParcel a(o2 o2Var, List list, fh fhVar, List list2) {
        o2Var.c.b(new dh(list, fhVar, list2), dh.class);
        return createFromParcel.INSTANCE;
    }

    public final void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            n2.a(jSONArray, new d4$$ExternalSyntheticLambda2(this, 11, jSONArray));
        }
    }

    public static final createFromParcel a(o2 o2Var, JSONArray jSONArray) {
        o2Var.c.b(new p8(jSONArray), p8.class);
        return createFromParcel.INSTANCE;
    }

    public final void a(JSONObject jSONObject, Long l, ArrayList arrayList) {
        if (jSONObject != null) {
            n2.a(jSONObject, new o2$$ExternalSyntheticLambda3(this, jSONObject, l, arrayList));
        }
    }

    public static final createFromParcel a(o2 o2Var, JSONObject jSONObject, Long l, List list) {
        z7 z7Var = o2Var.c;
        if (list == null) {
            list = instance_delegatelambda0.write;
        }
        z7Var.b(new h0(jSONObject, l, list), h0.class);
        return createFromParcel.INSTANCE;
    }

    public final void a(ArrayList arrayList) {
        if (arrayList != null) {
            n2.a(arrayList, new o2$$ExternalSyntheticLambda2(this, arrayList, 0));
        }
    }

    public static final createFromParcel a(o2 o2Var, List list) {
        o2Var.c.b(new e(list), e.class);
        return createFromParcel.INSTANCE;
    }

    public final void a(InAppMessageBase inAppMessageBase, String str) {
        if (inAppMessageBase != null) {
            n2.a(inAppMessageBase, new bb$$ExternalSyntheticLambda0(this, inAppMessageBase, str, 3));
        }
    }

    public static final createFromParcel a(o2 o2Var, IInAppMessage iInAppMessage, String str) {
        l9 l9Var = o2Var.k;
        if (l9Var instanceof yf) {
            iInAppMessage.setExpirationTimestamp(((yf) l9Var).q);
            z7 z7Var = o2Var.c;
            yf yfVar = (yf) o2Var.k;
            z7Var.b(new ta(yfVar.m, yfVar.r, iInAppMessage, str), ta.class);
        }
        return createFromParcel.INSTANCE;
    }
}
