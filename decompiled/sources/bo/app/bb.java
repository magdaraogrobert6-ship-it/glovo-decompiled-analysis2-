package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import java.util.ArrayList;
import java.util.Map;
import o.isAdapterPositionOnScreen;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class bb {
    public final e9 a;

    public bb(e9 e9Var) {
        e9Var.getClass();
        this.a = e9Var;
    }

    public static final String a(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1, td tdVar, bb bbVar, Map map, JSONObject jSONObject) {
        Object objMediaSessionCompatResultReceiverWrapper = onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        bbVar.getClass();
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                |Making request with id => \"" + objMediaSessionCompatResultReceiverWrapper + "\"\n                |to url: " + tdVar + "\n                \n                |with headers:\n                " + a(map) + "\n                |\n                |" + (jSONObject == null ? "" : r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("and JSON :\n", JsonUtils.getPrettyPrintedString(jSONObject))) + "\n                ");
    }

    public static final String b(td tdVar, Map map, JSONObject jSONObject) {
        Object[] objArr = {tdVar, map, jSONObject};
        String str = com.braze.support.h.a;
        long jHashCode = 1;
        for (int i = 0; i < 3; i++) {
            jHashCode *= (long) objArr[i].hashCode();
        }
        String hexString = Long.toHexString(jHashCode);
        hexString.getClass();
        return hexString;
    }

    public static final String b() {
        return "Exception while logging result: ";
    }

    public final v9 a(td tdVar, Map map, JSONObject jSONObject) {
        tdVar.getClass();
        map.getClass();
        jSONObject.getClass();
        isAdapterPositionOnScreen isadapterpositiononscreen = new isAdapterPositionOnScreen(new bb$$ExternalSyntheticLambda0(tdVar, map, jSONObject, 0));
        a(tdVar, map, isadapterpositiononscreen, jSONObject);
        long jCurrentTimeMillis = System.currentTimeMillis();
        v9 v9VarA = this.a.a(tdVar, map, jSONObject);
        a(isadapterpositiononscreen, tdVar, v9VarA.b, v9VarA.c, System.currentTimeMillis() - jCurrentTimeMillis);
        return v9VarA;
    }

    public final void a(final td tdVar, final Map map, final onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1, final JSONObject jSONObject) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, tdVar.d, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.bb$$ExternalSyntheticLambda3
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return bb.a(onviewdetachedfromwindowlambda1, tdVar, this, map, jSONObject);
                }
            }, 3, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b8$$ExternalSyntheticLambda4(29), 4, (Object) null);
        }
    }

    public static final String a() {
        return "Exception while logging request: ";
    }

    public final void a(final onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1, final td tdVar, final Map map, final JSONObject jSONObject, final long j) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: bo.app.bb$$ExternalSyntheticLambda1
                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public final Object invoke() {
                    return bb.a(onviewdetachedfromwindowlambda1, tdVar, j, this, map, jSONObject);
                }
            }, 7, (Object) null);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new b8$$ExternalSyntheticLambda4(28), 4, (Object) null);
        }
    }

    public static final String a(onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1, td tdVar, long j, bb bbVar, Map map, JSONObject jSONObject) {
        Object objMediaSessionCompatResultReceiverWrapper = onviewdetachedfromwindowlambda1.MediaSessionCompatResultReceiverWrapper();
        bbVar.getClass();
        return isCurrentlyDisplayingInAppMessage.MediaDescriptionCompat("\n                |Made request with id => \"" + objMediaSessionCompatResultReceiverWrapper + "\"\n                |to url: " + tdVar + "\n                |took: " + j + "ms\n                \n                |with response headers:\n                " + a(map) + "\n                |\n                |and response JSON:\n                |" + JsonUtils.getPrettyPrintedString(jSONObject) + "\n                ");
    }

    public static String a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("|\"", (String) entry.getKey(), "\" => \"", (String) entry.getValue(), "\""));
        }
        return onContentCardDismissed.IconCompatParcelizer(arrayList, "\n", null, null, null, 62);
    }
}
