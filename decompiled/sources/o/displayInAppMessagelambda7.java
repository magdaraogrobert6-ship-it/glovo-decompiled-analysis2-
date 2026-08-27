package o;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes4.dex */
public abstract class displayInAppMessagelambda7 {
    public static final double RemoteActionCompatParcelizer(int i, int i2) {
        return ((((long) i) << 27) + ((long) i2)) / 9.007199254740992E15d;
    }

    public static long read(View view) {
        if (setNativeShader.RemoteActionCompatParcelizer < 0) {
            Window window = null;
            if ((view != null ? view.getContext() : null) instanceof Activity) {
                Context context = view.getContext();
                context.getClass();
                window = ((Activity) context).getWindow();
            }
            float f = 60.0f;
            float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
            if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                f = refreshRate;
            }
            setNativeShader.RemoteActionCompatParcelizer = (long) ((1000.0f / f) * 1000000.0f);
        }
        return setNativeShader.RemoteActionCompatParcelizer;
    }
}
