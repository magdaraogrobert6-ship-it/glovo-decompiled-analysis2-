package o;

import android.content.Context;
import android.content.res.TypedArray;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes.dex */
public abstract class RoundRectgG7oq9Y {
    public static r8lambdaCTegLFIY2N5eeYL50pY32CICZRI RemoteActionCompatParcelizer(String str, String str2, RequestBody requestBody) {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("form-data; name=");
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = MultipartBody.IconCompatParcelizer;
        getFrameView.RemoteActionCompatParcelizer(str, sbM);
        if (str2 != null) {
            sbM.append("; filename=");
            getFrameView.RemoteActionCompatParcelizer(str2, sbM);
        }
        String string = sbM.toString();
        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
        applydisplaycutoutmarginstocontentarealambda0.RemoteActionCompatParcelizer("Content-Disposition", string);
        resetMessageMarginslambda00 resetmessagemarginslambda00 = applydisplaycutoutmarginstocontentarealambda0.read();
        if (resetmessagemarginslambda00.write(ConstantKt.CONTENT_TYPE_HEADER) != null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected header: Content-Type");
            return null;
        }
        if (resetmessagemarginslambda00.write("Content-Length") == null) {
            return new r8lambdaCTegLFIY2N5eeYL50pY32CICZRI(resetmessagemarginslambda00, requestBody);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unexpected header: Content-Length");
        return null;
    }

    public static int read(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
