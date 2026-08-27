package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import o.ShortNewsContentCardView;
import o.cancelPendingWebViewPause;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    public final /* synthetic */ cancelPendingWebViewPause IconCompatParcelizer;
    public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 write;

    public FlowKt__LimitKt$dropWhile$1$1(cancelPendingWebViewPause cancelpendingwebviewpause, FlowCollector flowCollector, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.IconCompatParcelizer = cancelpendingwebviewpause;
        this.RemoteActionCompatParcelizer = flowCollector;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (shortNewsContentCardView instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) shortNewsContentCardView;
            int i = flowKt__LimitKt$dropWhile$1$1$emit$1.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.serializer = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, shortNewsContentCardView);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, shortNewsContentCardView);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            if (this.IconCompatParcelizer.IconCompatParcelizer) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.serializer = 1;
                if (this.RemoteActionCompatParcelizer.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons) {
                    return createfromparcel;
                }
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1.read = this;
                flowKt__LimitKt$dropWhile$1$1$emit$1.RemoteActionCompatParcelizer = obj;
                flowKt__LimitKt$dropWhile$1$1$emit$1.serializer = 2;
                objInvoke = this.write.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                if (objInvoke != coroutineSingletons) {
                    flowKt__LimitKt$dropWhile$1$1 = this;
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            return createfromparcel;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj = flowKt__LimitKt$dropWhile$1$1$emit$1.RemoteActionCompatParcelizer;
        flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.read;
        ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
        if (!((Boolean) objInvoke).booleanValue()) {
            flowKt__LimitKt$dropWhile$1$1.IconCompatParcelizer.IconCompatParcelizer = true;
            FlowCollector flowCollector = flowKt__LimitKt$dropWhile$1$1.RemoteActionCompatParcelizer;
            flowKt__LimitKt$dropWhile$1$1$emit$1.read = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.RemoteActionCompatParcelizer = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.serializer = 3;
            if (flowCollector.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }
}
