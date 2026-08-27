package o;

/* JADX INFO: loaded from: classes3.dex */
public final class rb implements getShortEdge {
    private static int read = 1;
    private static int serializer;
    public final getError RemoteActionCompatParcelizer;

    public rb(getError geterror) {
        this.RemoteActionCompatParcelizer = geterror;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        int i2 = read + 73;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = ((InAppMessageModalView) getmessageheadertextview).MediaDescriptionCompat;
            ((getLiveRegiondelegate) this.RemoteActionCompatParcelizer).serializer();
            throw null;
        }
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl61 = inAppMessageModalView.MediaDescriptionCompat;
        String strSerializer = ((getLiveRegiondelegate) this.RemoteActionCompatParcelizer).serializer();
        if (strSerializer != null) {
            int i3 = serializer + 111;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            if (strSerializer.length() != 0) {
                _get_messageWebView_lambda0 _get_messagewebview_lambda0 = r8lambday113fdftsr5e4pzj6xssxltpl61.read();
                _get_messagewebview_lambda0.IconCompatParcelizer("Log-Employee-Id", strSerializer);
                r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl62 = new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0);
                int i5 = read + 97;
                serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                r8lambday113fdftsr5e4pzj6xssxltpl61 = r8lambday113fdftsr5e4pzj6xssxltpl62;
            }
        }
        return inAppMessageModalView.write(r8lambday113fdftsr5e4pzj6xssxltpl61);
    }
}
