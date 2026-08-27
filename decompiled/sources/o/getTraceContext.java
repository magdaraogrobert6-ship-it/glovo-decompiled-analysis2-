package o;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class getTraceContext implements r8lambdaKSOEf5fDpgM5EyeQgpPOXO8FS0 {
    public static final IntrinsicsPolicy RemoteActionCompatParcelizer = IntrinsicsPolicy.ALGORITHM_REQUIRES_BORINGCRYPTO;

    public getTraceContext() throws GeneralSecurityException {
        if (RemoteActionCompatParcelizer.isCompatible()) {
            return;
        }
        getAlignmentLinesMap.write("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        throw null;
    }
}
