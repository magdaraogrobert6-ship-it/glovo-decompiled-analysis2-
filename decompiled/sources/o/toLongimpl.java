package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class toLongimpl {
    public static boolean write(String str) {
        Float16Companion float16Companion = getNegativeInfinityslo4al4.MediaBrowserCompatMediaItem;
        Set<toRawBitsimpl> setUnmodifiableSet = Collections.unmodifiableSet(toRawBitsimpl.RemoteActionCompatParcelizer);
        HashSet<toRawBitsimpl> hashSet = new HashSet();
        for (toRawBitsimpl torawbitsimpl : setUnmodifiableSet) {
            if (torawbitsimpl.serializer.equals(str)) {
                hashSet.add(torawbitsimpl);
            }
        }
        if (hashSet.isEmpty()) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Unknown feature ".concat(str));
            return false;
        }
        for (toRawBitsimpl torawbitsimpl2 : hashSet) {
            if (torawbitsimpl2.write() || torawbitsimpl2.RemoteActionCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final getConfigfwf_client_release serializer(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        if (appCompatActivity instanceof getFwfEventValueTransformerfwf_client_release) {
            return ((getFwfEventValueTransformerfwf_client_release) appCompatActivity).write();
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("KoinApplication has not been started");
        return null;
    }
}
