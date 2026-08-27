package o;

import java.io.InputStream;
import org.tukaani.xz.LZMA2InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getUpdateFeaturesfwf_client_release extends getOfflineModefwf_client_release {
    public static final int[] IconCompatParcelizer = {androidx.compose.ui.graphics.Fields.ColorFilter, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};
    public int read;

    @Override // o.getOfflineModefwf_client_release
    public final InputStream write(InputStream inputStream, getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release) {
        return new LZMA2InputStream(inputStream, this.read, getfeaturesexpirationtimefwf_client_release);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
