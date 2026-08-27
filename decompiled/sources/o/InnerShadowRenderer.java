package o;

import android.app.Application;
import com.deliveryhero.performance.core.aqs.AppQualityScore;
import com.deliveryhero.performance.core.calculator.PerformanceClassCalculatorImpl;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerShadowRenderer extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ AppQualityScore serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InnerShadowRenderer(AppQualityScore appQualityScore, int i) {
        super(0);
        this.write = i;
        this.serializer = appQualityScore;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.write;
        if (i != 0) {
            if (i != 1) {
                return new PerformanceClassCalculatorImpl(this.serializer.serializer);
            }
            Object obj = this.serializer.read.get();
            obj.getClass();
            return (Map) obj;
        }
        getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4 = drawCachedImageFqjB98A.RemoteActionCompatParcelizer;
        AppQualityScore appQualityScore = this.serializer;
        Application application = appQualityScore.serializer;
        BlurFilter blurFilter = appQualityScore.ParcelableVolumeInfo;
        getIndex getindex = appQualityScore.MediaSessionCompatResultReceiverWrapper;
        requestFocusBypassUnfocusableComposeView requestfocusbypassunfocusablecomposeview = appQualityScore.MediaSessionCompatQueueItem;
        and andVar = appQualityScore.RatingCompat;
        ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl = appQualityScore.MediaBrowserCompatMediaItem;
        ContextScope contextScope = appQualityScore.PlaybackStateCompat;
        andVar.getClass();
        executorCoroutineDispatcherImpl.getClass();
        contextScope.getClass();
        drawCachedImageFqjB98A drawcachedimagefqjb98a = drawCachedImageFqjB98A.serializer;
        if (drawcachedimagefqjb98a == null) {
            synchronized (getintentarraywithconfiguredbackstacklambda4) {
                drawcachedimagefqjb98a = drawCachedImageFqjB98A.serializer;
                if (drawcachedimagefqjb98a == null) {
                    drawcachedimagefqjb98a = new drawCachedImageFqjB98A(application, blurFilter, getindex, requestfocusbypassunfocusablecomposeview, executorCoroutineDispatcherImpl, contextScope);
                    drawCachedImageFqjB98A.serializer = drawcachedimagefqjb98a;
                }
            }
        }
        return drawcachedimagefqjb98a;
    }
}
