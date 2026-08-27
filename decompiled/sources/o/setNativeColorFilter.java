package o;

import android.view.Choreographer;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setNativeColorFilter implements ViewTreeObserver.OnPreDrawListener {
    public static final /* synthetic */ int serializer = 0;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        declaredField.getClass();
        declaredField.setAccessible(true);
    }
}
