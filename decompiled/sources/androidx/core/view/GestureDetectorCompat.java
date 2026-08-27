package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class GestureDetectorCompat {
    public final GestureDetector read;

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.read = new GestureDetector(context, onGestureListener, handler);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }
}
