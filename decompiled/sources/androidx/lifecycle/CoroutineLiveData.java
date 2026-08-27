package androidx.lifecycle;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.NativeCanvasannotations;
import o.ShortNewsContentCardView;
import o.accessunregisterComponentCallback;
import o.onLowMemory;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;

/* JADX INFO: loaded from: classes.dex */
public final class CoroutineLiveData extends onLowMemory {
    public final /* synthetic */ int IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;

    public /* synthetic */ CoroutineLiveData(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.accessunregisterComponentCallback
    public Object IconCompatParcelizer() {
        if (this.IconCompatParcelizer != 1) {
            return super.IconCompatParcelizer();
        }
        accessunregisterComponentCallback accessunregistercomponentcallback = (accessunregisterComponentCallback) this.RemoteActionCompatParcelizer;
        if (accessunregistercomponentcallback == null) {
            return null;
        }
        return accessunregistercomponentcallback.IconCompatParcelizer();
    }

    @Override // o.onLowMemory, o.accessunregisterComponentCallback
    public void RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer != 0) {
            super.RemoteActionCompatParcelizer();
            return;
        }
        super.RemoteActionCompatParcelizer();
        BlockRunner blockRunner = (BlockRunner) this.RemoteActionCompatParcelizer;
        if (blockRunner != null) {
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = (r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) blockRunner.IconCompatParcelizer;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            }
            blockRunner.IconCompatParcelizer = null;
            if (((r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) blockRunner.RemoteActionCompatParcelizer) != null) {
                return;
            }
            blockRunner.RemoteActionCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer((ContextScope) blockRunner.RatingCompat, null, null, new BlockRunner$maybeRun$1(blockRunner, shortNewsContentCardView, 0), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public void clearSource$lifecycle_livedata(ContinuationImpl continuationImpl) {
        NativeCanvasannotations nativeCanvasannotations;
        if (continuationImpl instanceof NativeCanvasannotations) {
            nativeCanvasannotations = (NativeCanvasannotations) continuationImpl;
            int i = nativeCanvasannotations.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                nativeCanvasannotations.read = i - Integer.MIN_VALUE;
            } else {
                nativeCanvasannotations = new NativeCanvasannotations(this, continuationImpl);
            }
        } else {
            nativeCanvasannotations = new NativeCanvasannotations(this, continuationImpl);
        }
        Object obj = nativeCanvasannotations.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nativeCanvasannotations.read;
        if (i2 == 0 || i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // o.onLowMemory, o.accessunregisterComponentCallback
    public void read() {
        if (this.IconCompatParcelizer != 0) {
            super.read();
            return;
        }
        super.read();
        BlockRunner blockRunner = (BlockRunner) this.RemoteActionCompatParcelizer;
        if (blockRunner != null) {
            if (((r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU) blockRunner.IconCompatParcelizer) != null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Cancel call cannot happen without a maybeRun");
                return;
            }
            ContextScope contextScope = (ContextScope) blockRunner.RatingCompat;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            blockRunner.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(contextScope, MainDispatcherLoader.read.IconCompatParcelizer(), null, new BlockRunner$cancel$1(blockRunner, (ShortNewsContentCardView) null, 0), 2);
        }
    }
}
