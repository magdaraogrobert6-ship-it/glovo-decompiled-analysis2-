package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(ShortNewsContentCardView shortNewsContentCardView, createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector) {
        super(1, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = flowCollector;
        this.serializer = createinappmessageeventsubscriber;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(shortNewsContentCardView, this.serializer, this.RemoteActionCompatParcelizer);
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create((ShortNewsContentCardView) obj)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.write;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.serializer;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
            if (obj2 == NullSurrogateKt.RemoteActionCompatParcelizer) {
                obj2 = null;
            }
            this.write = 1;
            if (this.RemoteActionCompatParcelizer.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        createinappmessageeventsubscriber.IconCompatParcelizer = null;
        return createFromParcel.INSTANCE;
    }
}
