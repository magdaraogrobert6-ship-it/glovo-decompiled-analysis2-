package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements getShortEdge {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final accessgetOldDependencyp IconCompatParcelizer;

    public r3(accessgetOldDependencyp accessgetolddependencyp) {
        this.IconCompatParcelizer = accessgetolddependencyp;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl60.read();
        _get_messagewebview_lambda0.IconCompatParcelizer(HiAnalyticsConstant.BI_KEY_APP_ID, ((getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET) this.IconCompatParcelizer).write);
        _get_messagewebview_lambda0.write(r8lambday113fdftsr5e4pzj6xssxltpl60.method, r8lambday113fdftsr5e4pzj6xssxltpl60.body);
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = write + 119;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return _get_messagewebview_lambda1Write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
