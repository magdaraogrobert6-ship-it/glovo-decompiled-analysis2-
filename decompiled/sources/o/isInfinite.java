package o;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class isInfinite {
    public overlaps ComponentActivity;
    public boolean MediaBrowserCompatMediaItem;
    public final ArrayList MediaDescriptionCompat;
    public float MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public float MediaSessionCompatToken;
    public final io.sentry.util.network.IconCompatParcelizer ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public float PlaybackStateCompatCustomAction;
    public long RatingCompat;
    public boolean ResultReceiver;
    public final ArrayList r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public float r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getScaleXannotations r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public float r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public static final setBottom IconCompatParcelizer = new setBottom(0);
    public static final setBottom MediaMetadataCompat = new setBottom(2);
    public static final setBottom write = new setBottom(3);
    public static final setBottom RemoteActionCompatParcelizer = new setBottom(4);
    public static final setBottom serializer = new setBottom(5);
    public static final setBottom read = new setBottom(1);

    public isInfinite(getScaleXannotations getscalexannotations) {
        div44nBxM0 div44nbxm0 = getScaleXannotations.write;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0.0f;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Float.MAX_VALUE;
        this.ResultReceiver = false;
        this.MediaSessionCompatResultReceiverWrapper = false;
        this.MediaSessionCompatQueueItem = Float.MAX_VALUE;
        this.PlaybackStateCompatCustomAction = -3.4028235E38f;
        this.RatingCompat = 0L;
        this.MediaDescriptionCompat = new ArrayList();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayList();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = getscalexannotations;
        this.ParcelableVolumeInfo = div44nbxm0;
        if (div44nbxm0 == write || div44nbxm0 == RemoteActionCompatParcelizer || div44nbxm0 == serializer) {
            this.PlaybackStateCompat = 0.1f;
            return;
        }
        if (div44nbxm0 == read) {
            this.PlaybackStateCompat = 0.00390625f;
        } else if (div44nbxm0 == IconCompatParcelizer || div44nbxm0 == MediaMetadataCompat) {
            this.PlaybackStateCompat = 0.00390625f;
        } else {
            this.PlaybackStateCompat = 1.0f;
        }
    }

    public final void IconCompatParcelizer(float f) {
        ArrayList arrayList;
        this.ParcelableVolumeInfo.setValue(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, f);
        int i = 0;
        while (true) {
            arrayList = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) != null) {
                CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) arrayList.get(i);
                float f2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                getOffscreenNrFUSI getoffscreennrfusi = compositeShaderBrush.MediaBrowserCompatMediaItem;
                long jMax = Math.max(-1L, Math.min(getoffscreennrfusi.addObserverForBackInvoker + 1, Math.round(f2)));
                getoffscreennrfusi.IconCompatParcelizer(jMax, compositeShaderBrush.RemoteActionCompatParcelizer);
                compositeShaderBrush.RemoteActionCompatParcelizer = jMax;
            }
            i++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.ComponentActivity.read <= 0.0d) {
            IBraze$$ExternalSyntheticBUOutline0.m("Spring animations can only come to an end when there is damping");
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            if (this.MediaSessionCompatResultReceiverWrapper) {
                this.MediaBrowserCompatMediaItem = true;
            }
        }
    }

    public final void read(float f) {
        if (this.MediaSessionCompatResultReceiverWrapper) {
            this.MediaSessionCompatToken = f;
            return;
        }
        if (this.ComponentActivity == null) {
            this.ComponentActivity = new overlaps(f);
        }
        overlaps overlapsVar = this.ComponentActivity;
        double d = f;
        overlapsVar.IconCompatParcelizer = d;
        double d2 = (float) d;
        if (d2 > this.MediaSessionCompatQueueItem) {
            IBraze$$ExternalSyntheticBUOutline0.m("Final position of the spring cannot be greater than the max value.");
            return;
        }
        if (d2 < this.PlaybackStateCompatCustomAction) {
            IBraze$$ExternalSyntheticBUOutline0.m("Final position of the spring cannot be less than the min value.");
            return;
        }
        double dAbs = Math.abs(this.PlaybackStateCompat * 0.75f);
        overlapsVar.MediaBrowserCompatMediaItem = dAbs;
        overlapsVar.MediaSessionCompatQueueItem = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z = this.MediaSessionCompatResultReceiverWrapper;
        if (z || z) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = true;
        if (!this.ResultReceiver) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = this.ParcelableVolumeInfo.getValue(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        float f2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (f2 > this.MediaSessionCompatQueueItem || f2 < this.PlaybackStateCompatCustomAction) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Starting value need to be in between min value and max value");
            return;
        }
        ThreadLocal threadLocal = isFinite.read;
        if (threadLocal.get() == null) {
            threadLocal.set(new isFinite());
        }
        isFinite isfinite = (isFinite) threadLocal.get();
        ArrayList arrayList = isfinite.serializer;
        if (arrayList.size() == 0) {
            if (isfinite.MediaDescriptionCompat == null) {
                isfinite.MediaDescriptionCompat = new androidx.navigation.NavArgsLazy(isfinite.RemoteActionCompatParcelizer);
            }
            androidx.navigation.NavArgsLazy navArgsLazy = isfinite.MediaDescriptionCompat;
            ((Choreographer) navArgsLazy.read).postFrameCallback((inflate) navArgsLazy.RatingCompat);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public isInfinite(set setVar) {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0.0f;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = Float.MAX_VALUE;
        this.ResultReceiver = false;
        this.MediaSessionCompatResultReceiverWrapper = false;
        this.MediaSessionCompatQueueItem = Float.MAX_VALUE;
        this.PlaybackStateCompatCustomAction = -3.4028235E38f;
        this.RatingCompat = 0L;
        this.MediaDescriptionCompat = new ArrayList();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new ArrayList();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        this.ParcelableVolumeInfo = new setTop(setVar);
        this.PlaybackStateCompat = 1.0f;
    }
}
