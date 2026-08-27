package o;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda4;
import io.sentry.metrics.MetricsBatchProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class setNativeColor4WTKRHQ {
    public final JankStatsFrameTracker$$ExternalSyntheticLambda3 IconCompatParcelizer;
    public boolean RemoteActionCompatParcelizer;
    public final float serializer;
    public final setNativeShader write;

    public setNativeColor4WTKRHQ(Window window, JankStatsFrameTracker$$ExternalSyntheticLambda3 jankStatsFrameTracker$$ExternalSyntheticLambda3) {
        this.IconCompatParcelizer = jankStatsFrameTracker$$ExternalSyntheticLambda3;
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
            throw null;
        }
        View rootView = viewPeekDecorView.getRootView();
        Object tag = rootView.getTag(com.logistics.rider.glovo.R.id.metricsStateHolder);
        if (tag == null) {
            tag = new setNativeStrokeMiterLimit();
            rootView.setTag(com.logistics.rider.glovo.R.id.metricsStateHolder, tag);
        }
        setNativeStrokeMiterLimit setnativestrokemiterlimit = (setNativeStrokeMiterLimit) tag;
        if (setnativestrokemiterlimit.serializer == null) {
            setnativestrokemiterlimit.serializer = new MetricsBatchProcessor(3);
        }
        setNativeShader setnativestrokejoinkltj_va = Build.VERSION.SDK_INT >= 31 ? new setNativeStrokeJoinkLtJ_vA(this, viewPeekDecorView, window) : new setNativeShader(this, viewPeekDecorView, window);
        this.write = setnativestrokejoinkltj_va;
        setnativestrokejoinkltj_va.PlaybackStateCompatCustomAction.getDecorView().post(new LifecycleUtils$$ExternalSyntheticLambda4(true, setnativestrokejoinkltj_va));
        this.RemoteActionCompatParcelizer = true;
        this.serializer = 2.0f;
    }
}
