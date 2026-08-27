package okhttp3.internal.platform;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import o.r8lambdayCqONI5qtI0P4J7deuwwogdnEs;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidPlatform$Companion {
    public static boolean serializer() {
        return r8lambdayCqONI5qtI0P4J7deuwwogdnEs.read;
    }

    public static ApiException read(Status status) {
        return status.MediaSessionCompatQueueItem != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static r8lambdayCqONI5qtI0P4J7deuwwogdnEs write() {
        if (r8lambdayCqONI5qtI0P4J7deuwwogdnEs.read) {
            return new r8lambdayCqONI5qtI0P4J7deuwwogdnEs();
        }
        return null;
    }
}
