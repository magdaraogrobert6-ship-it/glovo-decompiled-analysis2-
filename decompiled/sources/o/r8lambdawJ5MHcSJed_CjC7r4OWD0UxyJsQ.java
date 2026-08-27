package o;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ implements r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, ViewTreeObserver.OnDrawListener, Runnable {
    public boolean IconCompatParcelizer;
    public Runnable RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.activity.ComponentActivity serializer;
    public final long write = SystemClock.uptimeMillis() + DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM;

    @Override // java.lang.Runnable
    public final void run() {
        this.serializer.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    public r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(androidx.activity.ComponentActivity componentActivity) {
        this.serializer = componentActivity;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.RemoteActionCompatParcelizer = runnable;
        View decorView = this.serializer.getWindow().getDecorView();
        decorView.getClass();
        if (!this.IconCompatParcelizer) {
            decorView.postOnAnimation(new Preview$$ExternalSyntheticLambda0(1, this));
            return;
        }
        Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.RemoteActionCompatParcelizer;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.write) {
                this.IconCompatParcelizer = false;
                this.serializer.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.RemoteActionCompatParcelizer = null;
        createFullyDrawnExecutor fullyDrawnReporter = this.serializer.getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.RemoteActionCompatParcelizer) {
            z = fullyDrawnReporter.write;
        }
        if (z) {
            this.IconCompatParcelizer = false;
            this.serializer.getWindow().getDecorView().post(this);
        }
    }

    public final void write(View view) {
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }
}
