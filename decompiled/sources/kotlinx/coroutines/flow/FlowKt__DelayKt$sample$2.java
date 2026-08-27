package kotlinx.coroutines.flow;

import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.onBackCancelledlambda3;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public /* synthetic */ Object IconCompatParcelizer;
    public onBackCancelledlambda3 MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public createInAppMessageEventSubscriber serializer;
    public final /* synthetic */ Flow write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2(long j, Flow flow, ShortNewsContentCardView shortNewsContentCardView) {
        super(3, shortNewsContentCardView);
        this.read = j;
        this.write = flow;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.read, this.write, (ShortNewsContentCardView) obj3);
        flowKt__DelayKt$sample$2.RemoteActionCompatParcelizer = (getContentViewGroupParentLayout) obj;
        flowKt__DelayKt$sample$2.IconCompatParcelizer = (FlowCollector) obj2;
        return flowKt__DelayKt$sample$2.invokeSuspend(createFromParcel.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        onBackCancelledlambda3 onbackcancelledlambda3;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        onBackCancelledlambda3 onbackcancelledlambda4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.MediaMetadataCompat;
        if (i == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.RemoteActionCompatParcelizer;
            flowCollector = (FlowCollector) this.IconCompatParcelizer;
            onbackcancelledlambda3 = Room.read(getcontentviewgroupparentlayout, -1, new FlowKt__DelayKt$sample$2$values$1(this.write, null), 1);
            createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
            onbackcancelledlambda4 = Room.read(getcontentviewgroupparentlayout, 0, new FlowKt__DelayKt$fixedPeriodTicker$1(this.read, null), 1);
        } else {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            onbackcancelledlambda4 = this.MediaDescriptionCompat;
            createinappmessageeventsubscriber = this.serializer;
            onbackcancelledlambda3 = (onBackCancelledlambda3) this.IconCompatParcelizer;
            flowCollector = (FlowCollector) this.RemoteActionCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        while (createinappmessageeventsubscriber.IconCompatParcelizer != NullSurrogateKt.serializer) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.read(onbackcancelledlambda3.serializer(), new FlowKt__DelayKt$sample$2$1$1(createinappmessageeventsubscriber, onbackcancelledlambda4, null));
            selectImplementation.read(onbackcancelledlambda4.RemoteActionCompatParcelizer(), new FlowKt__DelayKt$sample$2$1$2(null, createinappmessageeventsubscriber, flowCollector));
            this.RemoteActionCompatParcelizer = flowCollector;
            this.IconCompatParcelizer = onbackcancelledlambda3;
            this.serializer = createinappmessageeventsubscriber;
            this.MediaDescriptionCompat = onbackcancelledlambda4;
            this.MediaMetadataCompat = 1;
            if ((selectImplementation.RemoteActionCompatParcelizer() ? selectImplementation.read(this) : selectImplementation.doSelectSuspend(this)) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
