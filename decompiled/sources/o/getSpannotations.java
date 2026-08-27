package o;

/* JADX INFO: loaded from: classes3.dex */
public final class getSpannotations implements getShortEdge {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final getEmannotations serializer;

    public getSpannotations(getEmannotations getemannotations) {
        getemannotations.getClass();
        this.serializer = getemannotations;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(inAppMessageModalView.MediaDescriptionCompat);
        String strWrite = _get_messagewebview_lambda1Write.headers.write("X-Push-Token-Missing");
        if (strWrite != null) {
            int i2 = IconCompatParcelizer + 91;
            read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            this.serializer.IconCompatParcelizer.write(Boolean.valueOf(Boolean.parseBoolean(strWrite)));
        }
        int i4 = read + 83;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return _get_messagewebview_lambda1Write;
    }
}
