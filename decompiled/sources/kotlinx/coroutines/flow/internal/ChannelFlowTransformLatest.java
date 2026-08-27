package kotlinx.coroutines.flow.internal;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY serializer;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public int IconCompatParcelizer;
        public /* synthetic */ Object read;
        public final /* synthetic */ FlowCollector write;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
        final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ getContentViewGroupParentLayout IconCompatParcelizer;
            public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
            public final /* synthetic */ createInAppMessageEventSubscriber read;
            public final /* synthetic */ ChannelFlowTransformLatest write;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
            final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                public final /* synthetic */ ChannelFlowTransformLatest IconCompatParcelizer;
                public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
                public int read;
                public final /* synthetic */ Object serializer;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector, Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    super(2, shortNewsContentCardView);
                    this.IconCompatParcelizer = channelFlowTransformLatest;
                    this.RemoteActionCompatParcelizer = flowCollector;
                    this.serializer = obj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    return new AnonymousClass2(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.serializer, shortNewsContentCardView);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.read;
                    if (i == 0) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = this.IconCompatParcelizer.serializer;
                        this.read = 1;
                        if (r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(this.RemoteActionCompatParcelizer, this.serializer, this) == coroutineSingletons) {
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

            public AnonymousClass1(createInAppMessageEventSubscriber createinappmessageeventsubscriber, getContentViewGroupParentLayout getcontentviewgroupparentlayout, ChannelFlowTransformLatest channelFlowTransformLatest, FlowCollector flowCollector) {
                this.read = createinappmessageeventsubscriber;
                this.IconCompatParcelizer = getcontentviewgroupparentlayout;
                this.write = channelFlowTransformLatest;
                this.RemoteActionCompatParcelizer = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
                AnonymousClass1<T> anonymousClass1;
                if (shortNewsContentCardView instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) shortNewsContentCardView;
                    int i = channelFlowTransformLatest$flowCollect$3$1$emit$1.IconCompatParcelizer;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.IconCompatParcelizer = i - Integer.MIN_VALUE;
                    } else {
                        channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, shortNewsContentCardView);
                    }
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, shortNewsContentCardView);
                }
                Object obj2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.RemoteActionCompatParcelizer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.IconCompatParcelizer;
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.read.IconCompatParcelizer;
                    if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                        setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(new ChildCancelledException());
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.read = this;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.serializer = obj;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.IconCompatParcelizer = 1;
                        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0.join(channelFlowTransformLatest$flowCollect$3$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    anonymousClass1 = this;
                } else {
                    if (i2 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.serializer;
                    anonymousClass1 = (AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.read;
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                }
                anonymousClass1.read.IconCompatParcelizer = BuildersKt.RemoteActionCompatParcelizer(anonymousClass1.IconCompatParcelizer, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.write, anonymousClass1.RemoteActionCompatParcelizer, obj, null), 1);
                return createFromParcel.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.write = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.write, shortNewsContentCardView);
            anonymousClass3.read = obj;
            return anonymousClass3;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.read;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                ChannelFlowTransformLatest channelFlowTransformLatest = ChannelFlowTransformLatest.this;
                Flow flow = channelFlowTransformLatest.IconCompatParcelizer;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(createinappmessageeventsubscriber, getcontentviewgroupparentlayout, channelFlowTransformLatest, this.write);
                this.IconCompatParcelizer = 1;
                if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
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

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return new ChannelFlowTransformLatest(this.serializer, this.IconCompatParcelizer, textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
    }

    public ChannelFlowTransformLatest(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Flow flow, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        super(i, textAnnouncementContentCardView, iInAppMessageViewWrapper, flow);
        this.serializer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public final Object flowCollect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCoroutineScope = YieldKt.coroutineScope(new AnonymousClass3(flowCollector, null), shortNewsContentCardView);
        return objCoroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? objCoroutineScope : createFromParcel.INSTANCE;
    }
}
