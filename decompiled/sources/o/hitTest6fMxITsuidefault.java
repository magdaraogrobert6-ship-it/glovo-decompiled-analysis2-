package o;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class hitTest6fMxITsuidefault implements r8lambdaKSOEf5fDpgM5EyeQgpPOXO8FS0 {
    public static final IntrinsicsPolicy write = IntrinsicsPolicy.ALGORITHM_NOT_FIPS;

    public hitTest6fMxITsuidefault() throws GeneralSecurityException {
        if (write.isCompatible()) {
            return;
        }
        getAlignmentLinesMap.write("Can not use AES-CMAC in FIPS-mode.");
        throw null;
    }
}
