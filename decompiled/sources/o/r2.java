package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements getShortEdge {
    private static int read = 0;
    private static int write = 1;
    public final setMaxElementsWrap IconCompatParcelizer;

    public r2(setMaxElementsWrap setmaxelementswrap) {
        this.IconCompatParcelizer = setmaxelementswrap;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("X-Device-Id", (String) this.IconCompatParcelizer.write.serializer.MediaSessionCompatResultReceiverWrapper());
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = write + 25;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return _get_messagewebview_lambda1Write;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
