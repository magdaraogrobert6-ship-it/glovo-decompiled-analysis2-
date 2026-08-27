package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusParamsConfig;
import com.deliveryhero.perseus.core.config.DefaultPerseusConfigProvider;
import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setStrokeLineCapBeK7IIE {
    public static final onViewDetachedFromWindowlambda1 IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new StateV3$$ExternalSyntheticLambda0(1));

    public static void write(String str) {
        PerseusParamsConfig perseusParamsConfig;
        if (Thread.currentThread().getId() != ((Number) IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).longValue()) {
            return;
        }
        String strM = ff$$ExternalSyntheticOutline0.m("Disk I/O operation '", str, "' must not run on the main thread");
        updateRenderPath.MediaSessionCompatQueueItem.getClass();
        synchronized (DefaultPerseusConfigProvider.read) {
            perseusParamsConfig = DefaultPerseusConfigProvider.write;
            if (perseusParamsConfig == null) {
                perseusParamsConfig = null;
            }
        }
        if (perseusParamsConfig == null || !perseusParamsConfig.getDebuggable()) {
            getPathFillTypeRgk1Os.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(strM, null);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(strM);
        }
    }
}
