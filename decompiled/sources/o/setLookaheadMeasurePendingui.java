package o;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class setLookaheadMeasurePendingui implements invalidateSubtreedefault {
    public static final IntrinsicsPolicy serializer = IntrinsicsPolicy.ALGORITHM_REQUIRES_BORINGCRYPTO;
    public final String IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final SecretKeySpec read;
    public final setLookaheadLayoutPendingForAlignmentui write;

    @Override // o.invalidateSubtreedefault
    public final byte[] IconCompatParcelizer(int i, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i > this.RemoteActionCompatParcelizer) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        setLookaheadLayoutPendingForAlignmentui setlookaheadlayoutpendingforalignmentui = this.write;
        ((Mac) setlookaheadlayoutpendingforalignmentui.get()).update(bArr);
        return Arrays.copyOf(((Mac) setlookaheadlayoutpendingforalignmentui.get()).doFinal(), i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    public setLookaheadMeasurePendingui(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        byte b;
        setLookaheadLayoutPendingForAlignmentui setlookaheadlayoutpendingforalignmentui = new setLookaheadLayoutPendingForAlignmentui(this);
        this.write = setlookaheadlayoutpendingforalignmentui;
        if (!serializer.isCompatible()) {
            getAlignmentLinesMap.write("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.IconCompatParcelizer = str;
        this.read = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b = 0;
                break;
            case "HMACSHA224":
                b = 1;
                break;
            case "HMACSHA256":
                b = 2;
                break;
            case "HMACSHA384":
                b = 3;
                break;
            case "HMACSHA512":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            this.RemoteActionCompatParcelizer = 20;
        } else if (b == 1) {
            this.RemoteActionCompatParcelizer = 28;
        } else if (b == 2) {
            this.RemoteActionCompatParcelizer = 32;
        } else if (b == 3) {
            this.RemoteActionCompatParcelizer = 48;
        } else {
            if (b != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            this.RemoteActionCompatParcelizer = 64;
        }
        setlookaheadlayoutpendingforalignmentui.get();
    }
}
