package o;

import android.os.Build;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class pushDiagonal {
    public static final IntrinsicsPolicy IconCompatParcelizer = IntrinsicsPolicy.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public static final accessgetVoiceAssistcp read = new accessgetVoiceAssistcp(1);
    public final boolean RemoteActionCompatParcelizer;
    public final SecretKeySpec serializer;

    public pushDiagonal(byte[] bArr) throws GeneralSecurityException {
        if (!IconCompatParcelizer.isCompatible()) {
            getAlignmentLinesMap.write("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        setLookaheadCoordinatesAccessedDuringPlacement.serializer(bArr.length);
        this.serializer = new SecretKeySpec(bArr, "AES");
        this.RemoteActionCompatParcelizer = true;
    }

    public static AlgorithmParameterSpec read(byte[] bArr) {
        int length = bArr.length;
        if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            int i = invalidateMeasurement.read;
            Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
            if (numValueOf == null || numValueOf.intValue() <= 19) {
                return new IvParameterSpec(bArr, 0, length);
            }
        }
        return new GCMParameterSpec(androidx.compose.ui.graphics.Fields.SpotShadowColor, bArr, 0, length);
    }
}
