package kotlinx.coroutines.flow;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import o.IInAppMessageViewWrapper;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onBackCancelledlambda3;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
final class ChannelAsFlow<T> extends ChannelFlow<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    public final boolean IconCompatParcelizer;
    private volatile /* synthetic */ int consumed$volatile;
    public final onBackCancelledlambda3 write;

    public /* synthetic */ ChannelAsFlow(onBackCancelledlambda3 onbackcancelledlambda3, boolean z) {
        this(onbackcancelledlambda3, z, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, -3, IInAppMessageViewWrapper.SUSPEND);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Flow IconCompatParcelizer() {
        return new ChannelAsFlow(this.write, this.IconCompatParcelizer);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return new ChannelAsFlow(this.write, this.IconCompatParcelizer, textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(new SendingCollector(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1), this.write, this.IconCompatParcelizer, shortNewsContentCardView);
        return objEmitAllImpl$FlowKt__ChannelsKt == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmitAllImpl$FlowKt__ChannelsKt : createFromParcel.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String write() {
        return "channel=" + this.write;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final onBackCancelledlambda3 write(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        if (!this.IconCompatParcelizer || read.getAndSet(this, 1) != 1) {
            return this.RemoteActionCompatParcelizer == -3 ? this.write : super.write(getcontentviewgroupparentlayout);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        if (this.RemoteActionCompatParcelizer == -3) {
            boolean z = this.IconCompatParcelizer;
            if (z && read.getAndSet(this, 1) == 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector, this.write, z, shortNewsContentCardView);
            if (objEmitAllImpl$FlowKt__ChannelsKt == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objEmitAllImpl$FlowKt__ChannelsKt;
            }
        } else {
            Object objCollect = super.collect(flowCollector, shortNewsContentCardView);
            if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return createFromParcel.INSTANCE;
    }

    public ChannelAsFlow(onBackCancelledlambda3 onbackcancelledlambda3, boolean z, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        super(textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
        this.write = onbackcancelledlambda3;
        this.IconCompatParcelizer = z;
    }
}
