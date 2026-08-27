package androidx.core.content.res;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import com.mapbox.maps.renderer.MapboxRenderThread$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public abstract class ResourcesCompat$FontCallback {
    public abstract void onFontRetrievalFailed(int i);

    public abstract void onFontRetrieved(Typeface typeface);

    public static Handler getHandler(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public final void callbackFailAsync(int i, Handler handler) {
        getHandler(handler).post(new MapboxRenderThread$$ExternalSyntheticLambda0(this, i, 2));
    }

    public final void callbackSuccessAsync(Typeface typeface, Handler handler) {
        getHandler(handler).post(new ND$$ExternalSyntheticLambda0(this, 2, typeface));
    }
}
