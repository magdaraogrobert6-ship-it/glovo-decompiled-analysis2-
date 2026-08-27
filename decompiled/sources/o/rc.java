package o;

import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class rc implements getShortEdge {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final isAdapterPositionOnScreen read = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(16, this));
    public final rd write;

    public rc(rd rdVar) {
        this.write = rdVar;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("X-Installation-Source", (String) this.read.MediaSessionCompatResultReceiverWrapper());
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = serializer + 99;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return _get_messagewebview_lambda1Write;
    }
}
