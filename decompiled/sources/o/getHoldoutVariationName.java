package o;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class getHoldoutVariationName<T> {
    public final Object body;
    public final _get_messageWebView_lambda3 errorBody;
    public final _get_messageWebView_lambda1 rawResponse;

    public final String toString() {
        return this.rawResponse.toString();
    }

    public getHoldoutVariationName(_get_messageWebView_lambda1 _get_messagewebview_lambda1, Object obj, _get_messageWebView_lambda4 _get_messagewebview_lambda4) {
        this.rawResponse = _get_messagewebview_lambda1;
        this.body = obj;
        this.errorBody = _get_messagewebview_lambda4;
    }

    public static getHoldoutVariationName IconCompatParcelizer(int i, _get_messageWebView_lambda4 _get_messagewebview_lambda4) {
        if (i >= 400) {
            _get_messageWebView_lambda4 _get_messagewebview_lambda5 = _get_messageWebView_lambda3.EMPTY;
            ArrayList arrayList = new ArrayList(20);
            getNegate getnegate = new getNegate(_get_messagewebview_lambda4.$contentType, _get_messagewebview_lambda4.$contentLength);
            r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc r8lambdacwme7obcpvw4lrr1hr7xiufmyc = r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1;
            r8lambdacwme7obcpvw4lrr1hr7xiufmyc.getClass();
            _get_messageWebView_lambda0 _get_messagewebview_lambda0 = new _get_messageWebView_lambda0(0);
            _get_messagewebview_lambda0.read("http://localhost/");
            r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
            if (i >= 0) {
                return IconCompatParcelizer(_get_messagewebview_lambda4, new _get_messageWebView_lambda1(r8lambday113fdftsr5e4pzj6xssxltpl60, r8lambdacwme7obcpvw4lrr1hr7xiufmyc, "Response.error()", i, null, new resetMessageMarginslambda00((String[]) arrayList.toArray(new String[0])), getnegate, null, null, null, 0L, 0L, null, getMessageWebView.EMPTY));
            }
            DrawableTransformation.read((Object) c8$$ExternalSyntheticOutline0.m(i, "code < 0: "));
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "code < 400: "));
        return null;
    }

    public static getHoldoutVariationName IconCompatParcelizer(_get_messageWebView_lambda4 _get_messagewebview_lambda4, _get_messageWebView_lambda1 _get_messagewebview_lambda1) {
        if (!_get_messagewebview_lambda1.isSuccessful) {
            return new getHoldoutVariationName(_get_messagewebview_lambda1, null, _get_messagewebview_lambda4);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("rawResponse should not be successful response");
        return null;
    }
}
