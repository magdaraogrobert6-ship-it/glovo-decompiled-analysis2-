package o;

import android.util.Base64;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetEightcp {
    public final accessgetBrowsercp IconCompatParcelizer;
    public final byte[] read;
    public final String serializer;

    public static accessgetEqualscp write() {
        accessgetEqualscp accessgetequalscp = new accessgetEqualscp();
        accessgetBrowsercp accessgetbrowsercp = accessgetBrowsercp.DEFAULT;
        if (accessgetbrowsercp != null) {
            accessgetequalscp.RemoteActionCompatParcelizer = accessgetbrowsercp;
            return accessgetequalscp;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null priority");
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.serializer.hashCode();
        return ((((iHashCode ^ 1000003) * 1000003) ^ Arrays.hashCode(this.read)) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public accessgetEightcp(String str, byte[] bArr, accessgetBrowsercp accessgetbrowsercp) {
        this.serializer = str;
        this.read = bArr;
        this.IconCompatParcelizer = accessgetbrowsercp;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof accessgetEightcp)) {
            return false;
        }
        accessgetEightcp accessgeteightcp = (accessgetEightcp) obj;
        if (!this.serializer.equals(accessgeteightcp.serializer)) {
            return false;
        }
        if (accessgeteightcp instanceof accessgetEightcp) {
            bArr = accessgeteightcp.read;
        } else {
            bArr = accessgeteightcp.read;
        }
        return Arrays.equals(this.read, bArr) && this.IconCompatParcelizer.equals(accessgeteightcp.IconCompatParcelizer);
    }

    public final accessgetEightcp write(accessgetBrowsercp accessgetbrowsercp) {
        accessgetEqualscp accessgetequalscpWrite = write();
        String str = this.serializer;
        if (str == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null backendName");
            return null;
        }
        accessgetequalscpWrite.write = str;
        if (accessgetbrowsercp == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null priority");
            return null;
        }
        accessgetequalscpWrite.RemoteActionCompatParcelizer = accessgetbrowsercp;
        accessgetequalscpWrite.IconCompatParcelizer = this.read;
        return accessgetequalscpWrite.RemoteActionCompatParcelizer();
    }

    public final String toString() {
        byte[] bArr = this.read;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.serializer);
        sb.append(", ");
        sb.append(this.IconCompatParcelizer);
        sb.append(", ");
        return ff$$ExternalSyntheticOutline0.m(sb, strEncodeToString, ")");
    }
}
