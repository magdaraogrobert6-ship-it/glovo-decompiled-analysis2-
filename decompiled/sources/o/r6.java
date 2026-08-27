package o;

import java.time.Clock;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class r6 implements getShortEdge {
    private static int serializer = 0;
    private static int write = 1;
    public final Clock RemoteActionCompatParcelizer;

    public r6(Clock clock) {
        this.RemoteActionCompatParcelizer = clock;
    }

    @Override // o.getShortEdge
    public final _get_messageWebView_lambda1 intercept(getMessageHeaderTextView getmessageheadertextview) {
        int i = 2 % 2;
        InAppMessageModalView inAppMessageModalView = (InAppMessageModalView) getmessageheadertextview;
        _get_messageWebView_lambda0 _get_messagewebview_lambda0 = inAppMessageModalView.MediaDescriptionCompat.read();
        _get_messagewebview_lambda0.IconCompatParcelizer("X-Request-Started-At", String.valueOf(Instant.now(this.RemoteActionCompatParcelizer).toEpochMilli()));
        _get_messageWebView_lambda1 _get_messagewebview_lambda1Write = inAppMessageModalView.write(new r8lambday113fDFTSR5e4PZj6XsSXLtpL60(_get_messagewebview_lambda0));
        int i2 = serializer + 51;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return _get_messagewebview_lambda1Write;
    }
}
