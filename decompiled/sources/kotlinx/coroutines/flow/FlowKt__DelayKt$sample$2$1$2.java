package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__DelayKt$sample$2$1$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ FlowCollector read;
    public int serializer;
    public final /* synthetic */ createInAppMessageEventSubscriber write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(ShortNewsContentCardView shortNewsContentCardView, createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector) {
        super(2, shortNewsContentCardView);
        this.write = createinappmessageeventsubscriber;
        this.read = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new FlowKt__DelayKt$sample$2$1$2(shortNewsContentCardView, this.write, this.read);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$sample$2$1$2) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.serializer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            if (i == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.write;
        Object obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
        if (obj2 != null) {
            createinappmessageeventsubscriber.IconCompatParcelizer = null;
            Object obj3 = obj2 != NullSurrogateKt.RemoteActionCompatParcelizer ? obj2 : null;
            this.serializer = 1;
            if (this.read.emit(obj3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createfromparcel;
    }
}
