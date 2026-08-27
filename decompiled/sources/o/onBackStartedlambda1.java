package o;

import java.util.Arrays;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes4.dex */
public abstract class onBackStartedlambda1 {
    public static final r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[] serializer;

    static {
        try {
            serializer = (r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[]) resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(Arrays.asList(new r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[0]).iterator())).toArray(new r8lambdaXxy0IcvbkQrEJYJmjWChAqi7z4[0]);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
