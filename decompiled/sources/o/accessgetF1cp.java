package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetF1cp {
    public final byte[] IconCompatParcelizer;
    public final accessgetButton10cp write;

    public final int hashCode() {
        return ((this.write.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof accessgetF1cp)) {
            return false;
        }
        accessgetF1cp accessgetf1cp = (accessgetF1cp) obj;
        if (this.write.equals(accessgetf1cp.write)) {
            return Arrays.equals(this.IconCompatParcelizer, accessgetf1cp.IconCompatParcelizer);
        }
        return false;
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.write + ", bytes=[...]}";
    }

    public accessgetF1cp(accessgetButton10cp accessgetbutton10cp, byte[] bArr) {
        if (accessgetbutton10cp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("encoding is null");
            throw null;
        }
        if (bArr == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("bytes is null");
            throw null;
        }
        this.write = accessgetbutton10cp;
        this.IconCompatParcelizer = bArr;
    }
}
