package kotlinx.coroutines.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;
import o.getInAppMessageViewFactory;
import o.resetAfterInAppMessageCloselambda2;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineExceptionHandlerImplKt {
    public static final Collection RemoteActionCompatParcelizer;

    static {
        try {
            RemoteActionCompatParcelizer = resetAfterInAppMessageCloselambda2.read(resetAfterInAppMessageCloselambda2.serializer(Arrays.asList(new AndroidExceptionPreHandler(), new getInAppMessageViewFactory()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
