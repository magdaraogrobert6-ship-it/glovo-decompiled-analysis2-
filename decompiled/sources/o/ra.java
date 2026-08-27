package o;

import com.mapbox.common.HttpHeaders;

/* JADX INFO: loaded from: classes3.dex */
public final class ra implements getShortEdge {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public ra(qa qaVar) {
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = inAppMessageModalView.MediaDescriptionCompat;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl60.read();
        _get_messagewebview_lambda0.IconCompatParcelizer(HttpHeaders.USER_AGENT, "Roadrunner/ANDROID/1312/v4.2634.5");
        _get_messagewebview_lambda0.write(r8lambday113fdftsr5e4pzj6xssxltpl60.method, r8lambday113fdftsr5e4pzj6xssxltpl60.body);
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = RemoteActionCompatParcelizer + 29;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return _get_messagewebview_lambda1Write;
    }
}
