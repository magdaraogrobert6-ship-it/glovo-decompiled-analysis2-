package kotlinx.coroutines.flow.internal;

import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.IInAppMessageViewWrapper;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.onBackCancelledlambda3;
import o.onContentCardDismissed;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ChannelFlow<T> implements FusibleFlow<T> {
    public final IInAppMessageViewWrapper MediaSessionCompatQueueItem;
    public final TextAnnouncementContentCardView RatingCompat;
    public final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public /* synthetic */ Object IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ ChannelFlow serializer;
        public final /* synthetic */ FlowCollector write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FlowCollector flowCollector, ChannelFlow channelFlow, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = flowCollector;
            this.serializer = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.write, this.serializer, shortNewsContentCardView);
            anonymousClass2.IconCompatParcelizer = obj;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                onBackCancelledlambda3 onbackcancelledlambda3Write = this.serializer.write((getContentViewGroupParentLayout) this.IconCompatParcelizer);
                this.RemoteActionCompatParcelizer = 1;
                if (FlowKt.emitAll(this.write, onbackcancelledlambda3Write, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
    }

    public Flow IconCompatParcelizer() {
        return null;
    }

    public abstract ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper);

    public abstract Object collectTo(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView);

    public String write() {
        return null;
    }

    public onBackCancelledlambda3 write(getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        int i = this.RemoteActionCompatParcelizer;
        if (i == -3) {
            i = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        ProducerCoroutine producerCoroutine = new ProducerCoroutine(SQLite.write(getcontentviewgroupparentlayout, this.RatingCompat), SQLite.IconCompatParcelizer(i, 4, this.MediaSessionCompatQueueItem));
        coroutineStart.invoke(channelFlow$collectToFun$1, producerCoroutine, producerCoroutine);
        return producerCoroutine;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow serializer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        TextAnnouncementContentCardView textAnnouncementContentCardView2 = this.RatingCompat;
        TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = textAnnouncementContentCardView.plus(textAnnouncementContentCardView2);
        IInAppMessageViewWrapper iInAppMessageViewWrapper2 = IInAppMessageViewWrapper.SUSPEND;
        IInAppMessageViewWrapper iInAppMessageViewWrapper3 = this.MediaSessionCompatQueueItem;
        int i2 = this.RemoteActionCompatParcelizer;
        if (iInAppMessageViewWrapper == iInAppMessageViewWrapper2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            iInAppMessageViewWrapper = iInAppMessageViewWrapper3;
        }
        return (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{textAnnouncementContentCardViewPlus, textAnnouncementContentCardView2}, getCieXyz.write())).booleanValue() && i == i2 && iInAppMessageViewWrapper == iInAppMessageViewWrapper3) ? this : RemoteActionCompatParcelizer(textAnnouncementContentCardViewPlus, i, iInAppMessageViewWrapper);
    }

    public ChannelFlow(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        this.RatingCompat = textAnnouncementContentCardView;
        this.RemoteActionCompatParcelizer = i;
        this.MediaSessionCompatQueueItem = iInAppMessageViewWrapper;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCoroutineScope = YieldKt.coroutineScope(new AnonymousClass2(flowCollector, this, null), shortNewsContentCardView);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strWrite = write();
        if (strWrite != null) {
            arrayList.add(strWrite);
        }
        r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc r8lambda2qmxd75iptxkfld4rjabqemoamc = r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write;
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.RatingCompat;
        if (textAnnouncementContentCardView != r8lambda2qmxd75iptxkfld4rjabqemoamc) {
            arrayList.add("context=" + textAnnouncementContentCardView);
        }
        int i = this.RemoteActionCompatParcelizer;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        IInAppMessageViewWrapper iInAppMessageViewWrapper = IInAppMessageViewWrapper.SUSPEND;
        IInAppMessageViewWrapper iInAppMessageViewWrapper2 = this.MediaSessionCompatQueueItem;
        if (iInAppMessageViewWrapper2 != iInAppMessageViewWrapper) {
            arrayList.add("onBufferOverflow=" + iInAppMessageViewWrapper2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return ff$$ExternalSyntheticOutline0.m(sb, onContentCardDismissed.IconCompatParcelizer(arrayList, ", ", null, null, null, 62), ']');
    }
}
