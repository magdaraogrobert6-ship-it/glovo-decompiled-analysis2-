package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.logUnregisterActivity;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resolveUnregisterDisplayedMessagelambda0;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ createInAppMessageEventSubscriber IconCompatParcelizer;
    public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
    public createInAppMessageEventSubscriber read;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(ShortNewsContentCardView shortNewsContentCardView, createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = createinappmessageeventsubscriber;
        this.RemoteActionCompatParcelizer = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(shortNewsContentCardView, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
        flowKt__DelayKt$debounceInternal$1$3$2.write = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(new logUnregisterActivity(((logUnregisterActivity) obj).RemoteActionCompatParcelizer), (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.serializer;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj2 = ((logUnregisterActivity) this.write).RemoteActionCompatParcelizer;
            boolean z = obj2 instanceof resolveUnregisterDisplayedMessagelambda0;
            createinappmessageeventsubscriber = this.IconCompatParcelizer;
            if (!z) {
                createinappmessageeventsubscriber.IconCompatParcelizer = obj2;
            }
            if (z) {
                Throwable thWrite = logUnregisterActivity.write(obj2);
                if (thWrite != null) {
                    throw thWrite;
                }
                Object obj3 = createinappmessageeventsubscriber.IconCompatParcelizer;
                if (obj3 != null) {
                    Object obj4 = obj3 != NullSurrogateKt.RemoteActionCompatParcelizer ? obj3 : null;
                    this.write = obj2;
                    this.read = createinappmessageeventsubscriber;
                    this.serializer = 1;
                    if (this.RemoteActionCompatParcelizer.emit(obj4, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    createinappmessageeventsubscriber2 = createinappmessageeventsubscriber;
                }
                createinappmessageeventsubscriber.IconCompatParcelizer = NullSurrogateKt.serializer;
            }
            return createFromParcel.INSTANCE;
        }
        if (i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        createinappmessageeventsubscriber2 = this.read;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
        createinappmessageeventsubscriber.IconCompatParcelizer = NullSurrogateKt.serializer;
        return createFromParcel.INSTANCE;
    }
}
