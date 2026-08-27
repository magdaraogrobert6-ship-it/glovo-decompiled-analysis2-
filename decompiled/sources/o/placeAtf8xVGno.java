package o;

import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class placeAtf8xVGno {
    public static Context RemoteActionCompatParcelizer;

    public static Context read() {
        Context context = RemoteActionCompatParcelizer;
        if (context != null) {
            return context;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Context is null , must init first!");
        return null;
    }
}
