package o;

import com.huawei.wisesecurity.kfs.crypto.signer.ec.ECSigner;
import java.security.PrivateKey;
import java.security.PublicKey;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityAction extends AndroidUiFrameClockwithFrameNanos2callback1 {
    public final /* synthetic */ int read;
    public visitScrollCaptureCandidatesdefault serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessibilityAction(getCanScrollVertically getcanscrollvertically, int i) {
        super(getcanscrollvertically);
        this.read = i;
        if (i != 1) {
            this.serializer = visitScrollCaptureCandidatesdefault.getPreferredAlg("EC");
        } else {
            super(getcanscrollvertically);
            this.serializer = visitScrollCaptureCandidatesdefault.getPreferredAlg("RSA");
        }
    }

    public final Object RemoteActionCompatParcelizer() {
        return this.read != 0 ? new ECSigner((getCanScrollVertically) this.IconCompatParcelizer, this.serializer, (PrivateKey) this.write, (PublicKey) this.RemoteActionCompatParcelizer, 1) : new ECSigner((getCanScrollVertically) this.IconCompatParcelizer, this.serializer, (PrivateKey) this.write, (PublicKey) this.RemoteActionCompatParcelizer, 0);
    }
}
