package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.DelayKt;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes4.dex */
public final class _get_messageWebView_lambda0 {
    public Object IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public Object read;
    public Object serializer;
    public Object write;

    public void write(r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, Object obj) {
        Map mapSerializer;
        Map map = (Map) this.read;
        if (obj == null) {
            if (map.isEmpty()) {
                return;
            }
            Map map2 = (Map) this.read;
            map2.getClass();
            pauseWebviewIfNecessarylambda10.serializer(map2).remove(r8lambdaucgighn8fiyv_vccodeafjfpedk);
            return;
        }
        if (map.isEmpty()) {
            mapSerializer = new LinkedHashMap();
            this.read = mapSerializer;
        } else {
            Map map3 = (Map) this.read;
            map3.getClass();
            mapSerializer = pauseWebviewIfNecessarylambda10.serializer(map3);
        }
        pauseWebviewIfNecessarylambda10.RemoteActionCompatParcelizer(r8lambdaucgighn8fiyv_vccodeafjfpedk, obj);
        mapSerializer.put(r8lambdaucgighn8fiyv_vccodeafjfpedk, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public _get_messageWebView_lambda0(int i) {
        this(new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(), new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(), (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) null, (getIntentArrayWithConfiguredBackStacklambda0) null, (Boolean) null);
        if (i != 4) {
            this.read = SimpleItemTouchHelperCallback.serializer;
            this.RemoteActionCompatParcelizer = "GET";
            this.serializer = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
            return;
        }
    }

    public void IconCompatParcelizer(String str, String str2) {
        str.getClass();
        str2.getClass();
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = (applyDisplayCutoutMarginsToContentArealambda0) this.serializer;
        applydisplaycutoutmarginstocontentarealambda0.getClass();
        DelayKt.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(str);
        DelayKt.serializer(str2, str);
        applydisplaycutoutmarginstocontentarealambda0.RemoteActionCompatParcelizer(str);
        DelayKt.write(applydisplaycutoutmarginstocontentarealambda0, str, str2);
    }

    public void serializer(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((applyDisplayCutoutMarginsToContentArealambda0) this.serializer).write(str, str2);
    }

    public void write(String str, RequestBody requestBody) {
        str.getClass();
        if (str.length() <= 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("method.isEmpty() == true");
            return;
        }
        if (requestBody == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m("method ", str, " must have a request body."));
                return;
            }
        } else if (!LoadBalancer$Helper.serializer(str)) {
            DrawableTransformation.serializer((Object) ff$$ExternalSyntheticOutline0.m("method ", str, " must not have a request body."));
            return;
        }
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = requestBody;
    }

    public void read(String str) {
        str.getClass();
        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        createAppropriateViews createappropriateviews = new createAppropriateViews();
        createappropriateviews.read(null, str);
        this.write = createappropriateviews.RemoteActionCompatParcelizer();
    }

    public _get_messageWebView_lambda0(Boolean bool, Double d) {
        this(bool, d, (Double) null, Boolean.FALSE, (Double) null);
    }

    public _get_messageWebView_lambda0(Boolean bool, Double d, Double d2) {
        this(bool, d, d2, Boolean.FALSE, (Double) null);
    }

    public _get_messageWebView_lambda0(Boolean bool, Double d, Double d2, Boolean bool2, Double d3) {
        this.write = bool;
        this.RemoteActionCompatParcelizer = d;
        this.serializer = d2;
        this.IconCompatParcelizer = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.read = d3;
    }

    public _get_messageWebView_lambda0(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k2, getIntentArrayWithConfiguredBackStacklambda0 getintentarraywithconfiguredbackstacklambda0, Boolean bool) {
        this.write = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.RemoteActionCompatParcelizer = r8lambdayq9qbmke5in5qopvpj_kuggks_k;
        this.serializer = r8lambdayq9qbmke5in5qopvpj_kuggks_k2;
        this.read = removeNodeAtDepth.write(getintentarraywithconfiguredbackstacklambda0, bool, null, null);
        this.IconCompatParcelizer = bool;
    }

    public _get_messageWebView_lambda0(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        this((io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) _get_messagewebview_lambda0.write, (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) _get_messagewebview_lambda0.RemoteActionCompatParcelizer, (r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k) _get_messagewebview_lambda0.serializer, (getIntentArrayWithConfiguredBackStacklambda0) _get_messagewebview_lambda0.read, (Boolean) _get_messagewebview_lambda0.IconCompatParcelizer);
    }

    public /* synthetic */ _get_messageWebView_lambda0(mergeJsonObjects mergejsonobjects, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, getColorIntegerOrNulllambda0 getcolorintegerornulllambda1, getColorIntegerOrNulllambda0 getcolorintegerornulllambda2, mergeJsonObjects mergejsonobjects2) {
        this.write = mergejsonobjects;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
        this.serializer = getcolorintegerornulllambda1;
        this.IconCompatParcelizer = getcolorintegerornulllambda2;
        this.read = mergejsonobjects2;
    }

    public _get_messageWebView_lambda0() {
    }
}
