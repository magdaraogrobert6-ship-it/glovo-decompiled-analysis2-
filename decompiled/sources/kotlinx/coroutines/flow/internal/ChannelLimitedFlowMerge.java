package kotlinx.coroutines.flow.internal;

import androidx.sqlite.SQLite;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import o.IInAppMessageViewWrapper;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onBackCancelledlambda3;

/* JADX INFO: loaded from: classes4.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    public final Iterable IconCompatParcelizer;

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return new ChannelLimitedFlowMerge(this.IconCompatParcelizer, textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView) {
        SendingCollector sendingCollector = new SendingCollector(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1);
        Iterator<T> it = this.IconCompatParcelizer.iterator();
        while (it.hasNext()) {
            BuildersKt.RemoteActionCompatParcelizer(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((Flow) it.next(), sendingCollector, null), 3);
        }
        return createFromParcel.INSTANCE;
    }

    public ChannelLimitedFlowMerge(Iterable iterable, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        super(textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
        this.IconCompatParcelizer = iterable;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final onBackCancelledlambda3 write(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = IInAppMessageViewWrapper.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(SQLite.write(getcontentviewgroupparentlayout, this.RatingCompat), SQLite.IconCompatParcelizer(this.RemoteActionCompatParcelizer, 4, iInAppMessageViewWrapper));
        coroutineStart.invoke(channelFlow$collectToFun$1, producerCoroutine, producerCoroutine);
        return producerCoroutine;
    }
}
