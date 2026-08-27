package androidx.work;

import android.content.Context;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import coil3.util.UtilsKt;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.single.SingleError;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.Executor;
import o.accessgetSubCompositionViewjd;
import o.accesssetSpotShadowColor8_81llAjd;
import o.onDrawBehind;

/* JADX INFO: loaded from: classes.dex */
public abstract class RxWorker extends accesssetSpotShadowColor8_81llAjd {
    public static final accessgetSubCompositionViewjd serializer = new accessgetSubCompositionViewjd(2);

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract Single read();

    public Scheduler RemoteActionCompatParcelizer() {
        Executor executor = this.MediaBrowserCompatMediaItem.IconCompatParcelizer;
        Scheduler scheduler = Schedulers.serializer;
        return new ExecutorScheduler(executor);
    }

    public Single serializer() {
        return new SingleError(Functions.RemoteActionCompatParcelizer(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`")));
    }

    @Override // o.accesssetSpotShadowColor8_81llAjd
    public final onDrawBehind IconCompatParcelizer() {
        return UtilsKt.RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 13, read()));
    }

    @Override // o.accesssetSpotShadowColor8_81llAjd
    public final onDrawBehind write() {
        return UtilsKt.RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 13, serializer()));
    }
}
