package o;

import android.view.View;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class toImageConfig implements Runnable {
    public final Object IconCompatParcelizer;
    public final /* synthetic */ int read;
    public boolean serializer;
    public final Object write;

    public toImageConfig(accessregisterComponentCallback accessregistercomponentcallback, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        this.read = 0;
        accessregistercomponentcallback.getClass();
        androidColorSpace_androidKt.getClass();
        this.IconCompatParcelizer = accessregistercomponentcallback;
        this.write = androidColorSpace_androidKt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SubcomposeLayoutStatePausedPrecomposition subcomposeLayoutStatePausedPrecomposition;
        int i = this.read;
        Object obj = this.write;
        Object obj2 = this.IconCompatParcelizer;
        if (i == 0) {
            if (this.serializer) {
                return;
            }
            ((accessregisterComponentCallback) obj2).serializer((AndroidColorSpace_androidKt) obj);
            this.serializer = true;
            return;
        }
        if (i == 1) {
            ((Executor) obj2).execute(new Preview$$ExternalSyntheticLambda0(5, this));
            return;
        }
        View view = (View) obj2;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
        clearChildFocusdefault clearchildfocusdefault = swipeDismissBehavior.MediaSessionCompatQueueItem;
        if (clearchildfocusdefault != null && clearchildfocusdefault.write()) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            view.postOnAnimation(this);
        } else {
            if (!this.serializer || (subcomposeLayoutStatePausedPrecomposition = swipeDismissBehavior.RemoteActionCompatParcelizer) == null) {
                return;
            }
            subcomposeLayoutStatePausedPrecomposition.write(view);
        }
    }

    public toImageConfig(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.read = 2;
        this.write = swipeDismissBehavior;
        this.IconCompatParcelizer = view;
        this.serializer = z;
    }

    public toImageConfig(setTextMetricsParamsCompat settextmetricsparamscompat, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        this.read = 1;
        this.write = settextmetricsparamscompat;
        this.serializer = false;
        this.IconCompatParcelizer = previewFreezeAfterHighSpeedRecordingQuirk;
    }
}
