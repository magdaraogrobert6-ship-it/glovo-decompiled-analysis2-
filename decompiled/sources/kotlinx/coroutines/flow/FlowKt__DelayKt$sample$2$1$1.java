package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.logUnregisterActivity;
import o.onBackCancelledlambda3;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resolveUnregisterDisplayedMessagelambda0;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ createInAppMessageEventSubscriber read;
    public final /* synthetic */ onBackCancelledlambda3 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, onBackCancelledlambda3 onbackcancelledlambda3, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = createinappmessageeventsubscriber;
        this.write = onbackcancelledlambda3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.read, this.write, shortNewsContentCardView);
        flowKt__DelayKt$sample$2$1$1.RemoteActionCompatParcelizer = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = (FlowKt__DelayKt$sample$2$1$1) create(new logUnregisterActivity(((logUnregisterActivity) obj).RemoteActionCompatParcelizer), (ShortNewsContentCardView) obj2);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        flowKt__DelayKt$sample$2$1$1.invokeSuspend(createfromparcel);
        return createfromparcel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj2 = ((logUnregisterActivity) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer;
        boolean z = obj2 instanceof resolveUnregisterDisplayedMessagelambda0;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = this.read;
        if (!z) {
            createinappmessageeventsubscriber.IconCompatParcelizer = obj2;
        }
        if (z) {
            Throwable thWrite = logUnregisterActivity.write(obj2);
            if (thWrite != null) {
                throw thWrite;
            }
            this.write.write(new ChildCancelledException());
            createinappmessageeventsubscriber.IconCompatParcelizer = NullSurrogateKt.serializer;
        }
        return createFromParcel.INSTANCE;
    }
}
