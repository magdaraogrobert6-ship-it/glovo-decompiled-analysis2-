package kotlinx.coroutines.flow;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes5.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ CompletableDeferredImpl read;
    public final /* synthetic */ Flow serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(Flow flow, CompletableDeferredImpl completableDeferredImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = flow;
        this.read = completableDeferredImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.serializer, this.read, shortNewsContentCardView);
        flowKt__ShareKt$launchSharingDeferred$1.write = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.IconCompatParcelizer;
        final CompletableDeferredImpl completableDeferredImpl = this.read;
        try {
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.write;
                final createInAppMessageEventSubscriber createinappmessageeventsubscriber2 = new createInAppMessageEventSubscriber();
                Flow flow = this.serializer;
                FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView) {
                        createInAppMessageEventSubscriber createinappmessageeventsubscriber3 = createinappmessageeventsubscriber2;
                        MutableStateFlow mutableStateFlow = (MutableStateFlow) createinappmessageeventsubscriber3.IconCompatParcelizer;
                        if (mutableStateFlow != null) {
                            mutableStateFlow.IconCompatParcelizer(obj2);
                        } else {
                            MutableStateFlow mutableStateFlow2 = StateFlowKt.read(obj2);
                            JobKt.IconCompatParcelizer(getcontentviewgroupparentlayout.getCoroutineContext());
                            completableDeferredImpl.MediaSessionCompatQueueItem(new onItemDismiss(new ReadonlyStateFlow(mutableStateFlow2)));
                            createinappmessageeventsubscriber3.IconCompatParcelizer = mutableStateFlow2;
                        }
                        return createFromParcel.INSTANCE;
                    }
                };
                this.write = createinappmessageeventsubscriber2;
                this.IconCompatParcelizer = 1;
                if (flow.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                createinappmessageeventsubscriber = createinappmessageeventsubscriber2;
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) this.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            if (createinappmessageeventsubscriber.IconCompatParcelizer == null) {
                completableDeferredImpl.MediaSessionCompatQueueItem(new onItemDismiss(new isItemDismissable(new NoSuchElementException("Flow is empty"))));
            }
            return createFromParcel.INSTANCE;
        } catch (Throwable th) {
            completableDeferredImpl.IconCompatParcelizer(th);
            throw th;
        }
    }
}
