package o;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements getShortEdge {
    private static int read = 1;
    private static int write;
    public final subscribeToBannersUpdateslambda2 serializer;

    public r0(subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2) {
        this.serializer = subscribetobannersupdateslambda2;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        String str = this.serializer.read();
        if (str == null) {
            int i2 = write;
            int i3 = i2 + 25;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 29;
            read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            str = "";
        }
        _get_messagewebview_lambda0.IconCompatParcelizer("X-Contract-Type", str);
        return inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
    }
}
