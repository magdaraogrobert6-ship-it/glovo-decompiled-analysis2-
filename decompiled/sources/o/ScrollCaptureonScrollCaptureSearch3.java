package o;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* JADX INFO: loaded from: classes2.dex */
public final class ScrollCaptureonScrollCaptureSearch3 extends AndroidUiFrameClockwithFrameNanos2callback1 {
    public getScrollCaptureInProgress read;
    public final OAEPParameterSpec serializer;

    public final Object write() {
        return new com.airbnb.lottie.parser.DropShadowEffect((getCanScrollVertically) this.IconCompatParcelizer, this.read, (PrivateKey) this.write, (PublicKey) this.RemoteActionCompatParcelizer, this.serializer);
    }

    public ScrollCaptureonScrollCaptureSearch3(getCanScrollVertically getcanscrollvertically) {
        super(getcanscrollvertically);
        this.read = getScrollCaptureInProgress.getPreferredAlg("RSA");
        this.serializer = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
    }
}
