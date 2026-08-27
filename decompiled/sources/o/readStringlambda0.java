package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class readStringlambda0 {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;

    public static final class serializer {
        public serializer(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new serializer(null);
    }

    public readStringlambda0(r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }

    public static readDatalambda0 write(readStringlambda0 readstringlambda0, clearandroid_sdk_base_release clearandroid_sdk_base_releaseVar, long j, String str, Runnable runnable, int i) {
        if ((i & 8) != 0) {
            str = "WALL_CLOCK_SINGLE_USE";
        }
        String str2 = str;
        readstringlambda0.getClass();
        clearandroid_sdk_base_releaseVar.getClass();
        if (j >= 0) {
            return new readDatalambda0(clearandroid_sdk_base_releaseVar, readstringlambda0.IconCompatParcelizer, j, 1000L, str2, runnable);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("delayMillis must be >= 0");
        return null;
    }
}
