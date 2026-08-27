package kotlinx.coroutines.flow.internal;

import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.IInAppMessageViewWrapper;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getInAppMessageManagerListener;
import o.onBackCancelledlambda3;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes5.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        throw null;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView) {
        throw null;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final String write() {
        throw null;
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

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    final class AnonymousClass2<T> implements FlowCollector {

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            public final /* synthetic */ getInAppMessageManagerListener IconCompatParcelizer;
            public final /* synthetic */ SendingCollector RemoteActionCompatParcelizer;
            public final /* synthetic */ Flow read;
            public int write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Flow flow, SendingCollector sendingCollector, getInAppMessageManagerListener getinappmessagemanagerlistener, ShortNewsContentCardView shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
                this.read = flow;
                this.RemoteActionCompatParcelizer = sendingCollector;
                this.IconCompatParcelizer = getinappmessagemanagerlistener;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                return new AnonymousClass1(this.read, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView);
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.write;
                getInAppMessageManagerListener getinappmessagemanagerlistener = this.IconCompatParcelizer;
                try {
                    if (i == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        Flow flow = this.read;
                        SendingCollector sendingCollector = this.RemoteActionCompatParcelizer;
                        this.write = 1;
                        if (flow.collect(sendingCollector, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                    getinappmessagemanagerlistener.IconCompatParcelizer();
                    return createFromParcel.INSTANCE;
                } catch (Throwable th) {
                    getinappmessagemanagerlistener.IconCompatParcelizer();
                    throw th;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Flow flow, ShortNewsContentCardView shortNewsContentCardView) {
            ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
            if (shortNewsContentCardView instanceof ChannelFlowMerge$collectTo$2$emit$1) {
                channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) shortNewsContentCardView;
                int i = channelFlowMerge$collectTo$2$emit$1.IconCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelFlowMerge$collectTo$2$emit$1.IconCompatParcelizer = i - Integer.MIN_VALUE;
                } else {
                    channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, shortNewsContentCardView);
                }
            } else {
                channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, shortNewsContentCardView);
            }
            Object obj = channelFlowMerge$collectTo$2$emit$1.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = channelFlowMerge$collectTo$2$emit$1.IconCompatParcelizer;
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                channelFlowMerge$collectTo$2$emit$1.serializer = this;
                channelFlowMerge$collectTo$2$emit$1.read = flow;
                channelFlowMerge$collectTo$2$emit$1.IconCompatParcelizer = 1;
                throw null;
            }
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Flow flow2 = channelFlowMerge$collectTo$2$emit$1.read;
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) channelFlowMerge$collectTo$2$emit$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            anonymousClass2.getClass();
            BuildersKt.RemoteActionCompatParcelizer(null, null, null, new AnonymousClass1(flow2, null, null, null), 3);
            return createFromParcel.INSTANCE;
        }
    }
}
