package androidx.work;

import android.content.Context;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import bo.app.b$$ExternalSyntheticLambda3;
import bo.app.h$$ExternalSyntheticLambda0;
import coil3.util.UtilsKt;
import java.util.concurrent.Executor;
import o.accesssetSpotShadowColor8_81llAjd;
import o.onDrawBehind;
import o.setClip;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends accesssetSpotShadowColor8_81llAjd {
    public abstract setClip RemoteActionCompatParcelizer();

    @Override // o.accesssetSpotShadowColor8_81llAjd
    public final onDrawBehind IconCompatParcelizer() {
        Executor executor = this.MediaBrowserCompatMediaItem.IconCompatParcelizer;
        executor.getClass();
        return UtilsKt.RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(executor, 14, new h$$ExternalSyntheticLambda0(5, this)));
    }

    @Override // o.accesssetSpotShadowColor8_81llAjd
    public final onDrawBehind write() {
        Executor executor = this.MediaBrowserCompatMediaItem.IconCompatParcelizer;
        executor.getClass();
        return UtilsKt.RemoteActionCompatParcelizer(new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(executor, 14, new b$$ExternalSyntheticLambda3(this)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }
}
