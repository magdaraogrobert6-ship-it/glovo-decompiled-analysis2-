package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.logUnregisterActivity;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resolveUnregisterDisplayedMessagelambda0;
import o.saveInAppMessageForCarryoverOnUnregister;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ FlowCollector read;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.read, shortNewsContentCardView);
        flowKt__DelayKt$timeoutInternal$1$1$1.IconCompatParcelizer = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new logUnregisterActivity(((logUnregisterActivity) obj).RemoteActionCompatParcelizer), (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Throwable thWrite;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.write;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            obj2 = ((logUnregisterActivity) this.IconCompatParcelizer).RemoteActionCompatParcelizer;
            if (!(obj2 instanceof resolveUnregisterDisplayedMessagelambda0)) {
                this.IconCompatParcelizer = obj2;
                this.write = 1;
                if (this.read.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj3 = obj2;
            }
            if (obj2 instanceof saveInAppMessageForCarryoverOnUnregister) {
                return Boolean.TRUE;
            }
            thWrite = logUnregisterActivity.write(obj2);
            if (thWrite == null) {
                return Boolean.FALSE;
            }
            throw thWrite;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        obj3 = this.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        obj2 = obj3;
        if (obj2 instanceof saveInAppMessageForCarryoverOnUnregister) {
            return Boolean.TRUE;
        }
        thWrite = logUnregisterActivity.write(obj2);
        if (thWrite == null) {
            return Boolean.FALSE;
        }
        throw thWrite;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = flowCollector;
    }
}
