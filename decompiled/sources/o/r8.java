package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r8 implements getShortEdge {
    private static int serializer = 1;
    private static int write;
    public final setTransactionSuccessful IconCompatParcelizer;

    public r8(setTransactionSuccessful settransactionsuccessful) {
        this.IconCompatParcelizer = settransactionsuccessful;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        java.util.Locale locale = this.IconCompatParcelizer.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("X-Translation-Language", locale.getLanguage() + "-r" + locale.getCountry());
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = serializer + 77;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return _get_messagewebview_lambda1Write;
        }
        throw null;
    }
}
