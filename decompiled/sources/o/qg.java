package o;

import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class qg implements getShortEdge {
    private static int serializer = 1;
    private static int write;
    public final publishError RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(15, this));

    public qg(publishError publisherror) {
        this.RemoteActionCompatParcelizer = publisherror;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("X-User-Time-Format", (String) this.read.MediaSessionCompatResultReceiverWrapper());
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = serializer + 101;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return _get_messagewebview_lambda1Write;
    }
}
