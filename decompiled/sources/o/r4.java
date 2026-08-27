package o;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 implements getShortEdge {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        String id = TimeZone.getDefault().getID();
        id.getClass();
        _get_messagewebview_lambda0.IconCompatParcelizer("Time-Zone", id);
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = IconCompatParcelizer + 17;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return _get_messagewebview_lambda1Write;
    }
}
