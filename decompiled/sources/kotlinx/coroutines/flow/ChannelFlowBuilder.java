package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.IInAppMessageViewWrapper;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
class ChannelFlowBuilder<T> extends ChannelFlow<T> {
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return new ChannelFlowBuilder(this.serializer, textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView) {
        Object objInvoke = this.serializer.invoke(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, shortNewsContentCardView);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : createFromParcel.INSTANCE;
    }

    public ChannelFlowBuilder(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        super(textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String toString() {
        return "block[" + this.serializer + "] -> " + super.toString();
    }
}
