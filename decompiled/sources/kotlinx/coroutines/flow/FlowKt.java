package kotlinx.coroutines.flow;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.sidemenu.data.cache.SideMenuCacheImpl$get$$inlined$map$1;
import io.reactivex.subjects.BehaviorSubject;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NopCollector;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import o.DrawableTransformation;
import o.IInAppMessageViewWrapper;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.getContentViewGroupParentLayout;
import o.instance_delegatelambda0;
import o.isLongPressDragEnabled;
import o.markOnScreenCardsAsReadlambda1;
import o.onAnimationEndlambda1;
import o.onBackCancelledlambda3;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowKt {
    public static final Flow serializer() {
        return EmptyFlow.write;
    }

    public static final Flow IconCompatParcelizer(SideMenuCacheImpl$get$$inlined$map$1 sideMenuCacheImpl$get$$inlined$map$1, MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1) {
        return FlowKt__DistinctKt.write(sideMenuCacheImpl$get$$inlined$map$1, mapApiError$$ExternalSyntheticLambda1, FlowKt__DistinctKt.read);
    }

    public static final ChannelLimitedFlowMerge IconCompatParcelizer(Flow... flowArr) {
        int i = FlowKt__MergeKt.write;
        return new ChannelLimitedFlowMerge(flowArr.length == 0 ? instance_delegatelambda0.write : new isLongPressDragEnabled(1, flowArr), r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, -2, IInAppMessageViewWrapper.SUSPEND);
    }

    public static final Flow RemoteActionCompatParcelizer(Flow flow, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        if (textAnnouncementContentCardView.get(onAnimationEndlambda1.RemoteActionCompatParcelizer) != null) {
            DrawableTransformation.serializer(textAnnouncementContentCardView, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (textAnnouncementContentCardView.equals(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write)) {
            return flow;
        }
        return flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.write((FusibleFlow) flow, textAnnouncementContentCardView, 0, null, 6) : new ChannelFlowOperatorImpl(flow, textAnnouncementContentCardView, 0, null, 12);
    }

    public static final Object collect(Flow flow, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = flow.collect(NopCollector.write, shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public static final Flow read(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return new SafeFlow(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final SharedFlow read(SharedFlowImpl sharedFlowImpl) {
        return new ReadonlySharedFlow(sharedFlowImpl);
    }

    public static final StateFlow write(MutableStateFlow mutableStateFlow) {
        return new ReadonlyStateFlow(mutableStateFlow);
    }

    public static final Flow RemoteActionCompatParcelizer(BufferedChannel bufferedChannel) {
        return new ChannelAsFlow(bufferedChannel, true);
    }

    public static final r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer(Flow flow, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        return BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3);
    }

    public static final Object emitAll(FlowCollector flowCollector, Flow flow, ShortNewsContentCardView shortNewsContentCardView) throws Throwable {
        IconCompatParcelizer(flowCollector);
        Object objCollect = flow.collect(flowCollector, shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    public static final Flow write(BufferedChannel bufferedChannel) {
        return new ChannelAsFlow(bufferedChannel, false);
    }

    public static final Flow write(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return new CallbackFlowBuilder(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, -2, IInAppMessageViewWrapper.SUSPEND);
    }

    public static final FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1 RemoteActionCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Flow flow) {
        int i = FlowKt__MergeKt.write;
        return new FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, flow));
    }

    public static final SharedFlow read(Flow flow, getContentViewGroupParentLayout getcontentviewgroupparentlayout, SharingStarted sharingStarted) {
        SharingConfig sharingConfig = FlowKt__ShareKt.read(flow);
        SharedFlowImpl sharedFlowImplRemoteActionCompatParcelizer = SharedFlowKt.RemoteActionCompatParcelizer(1, sharingConfig.write, sharingConfig.RemoteActionCompatParcelizer);
        BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, sharingConfig.read, sharingStarted.equals(SharingStarted.Companion.RemoteActionCompatParcelizer) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, sharingConfig.IconCompatParcelizer, sharedFlowImplRemoteActionCompatParcelizer, SharedFlowKt.write, null));
        return new ReadonlySharedFlow(sharedFlowImplRemoteActionCompatParcelizer);
    }

    public static final StateFlow write(Flow flow, getContentViewGroupParentLayout getcontentviewgroupparentlayout, SharingStarted sharingStarted, Object obj) {
        SharingConfig sharingConfig = FlowKt__ShareKt.read(flow);
        MutableStateFlow mutableStateFlow = StateFlowKt.read(obj);
        BuildersKt.IconCompatParcelizer(getcontentviewgroupparentlayout, sharingConfig.read, sharingStarted.equals(SharingStarted.Companion.RemoteActionCompatParcelizer) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(sharingStarted, sharingConfig.IconCompatParcelizer, mutableStateFlow, obj, null));
        return new ReadonlyStateFlow(mutableStateFlow);
    }

    public static final void IconCompatParcelizer(FlowCollector flowCollector) throws Throwable {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).read;
        }
    }

    public static final ChannelFlowTransformLatest RemoteActionCompatParcelizer(Flow flow, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        int i = FlowKt__MergeKt.write;
        return new ChannelFlowTransformLatest(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, flow, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, -2, IInAppMessageViewWrapper.SUSPEND);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Serializable catchImpl(Flow flow, FlowCollector flowCollector, ContinuationImpl continuationImpl) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Throwable th;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        Throwable th2;
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0;
        CancellationException cancellationExceptionWrite;
        if (continuationImpl instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuationImpl;
            int i = flowKt__ErrorsKt$catchImpl$1.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuationImpl);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ErrorsKt$catchImpl$1.RemoteActionCompatParcelizer;
        if (i2 != 0) {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            createinappmessageeventsubscriber = flowKt__ErrorsKt$catchImpl$1.write;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
                th2 = (Throwable) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (th2 == null) {
                    if (th2 == null) {
                        return th;
                    }
                    if (th instanceof CancellationException) {
                        markOnScreenCardsAsReadlambda1.read(th2, th);
                        throw th2;
                    }
                    markOnScreenCardsAsReadlambda1.read(th, th2);
                    throw th;
                }
                if (th2 == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    markOnScreenCardsAsReadlambda1.read(th2, th);
                    throw th2;
                }
                markOnScreenCardsAsReadlambda1.read(th, th2);
                throw th;
                throw th;
            }
        }
        createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
        try {
            FlowCollector flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(createinappmessageeventsubscriberM3979m, flowCollector);
            flowKt__ErrorsKt$catchImpl$1.write = createinappmessageeventsubscriberM3979m;
            flowKt__ErrorsKt$catchImpl$1.RemoteActionCompatParcelizer = 1;
            if (flow.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            th2 = (Throwable) createinappmessageeventsubscriber.IconCompatParcelizer;
            if ((th2 == null && th2.equals(th)) || ((setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) flowKt__ErrorsKt$catchImpl$1.getContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer)) != null && setallviewgroupchildrenasnonaccessibilityimportantlambda0.MediaDescriptionCompat() && (cancellationExceptionWrite = setallviewgroupchildrenasnonaccessibilityimportantlambda0.write()) != null && cancellationExceptionWrite.equals(th))) {
                throw th;
            }
            if (th2 == null) {
                return th;
            }
            if (th instanceof CancellationException) {
                markOnScreenCardsAsReadlambda1.read(th2, th);
                throw th2;
            }
            markOnScreenCardsAsReadlambda1.read(th, th2);
            throw th;
        }
    }

    public static final Object collectLatest(Flow flow, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ShortNewsContentCardView shortNewsContentCardView) {
        Object objCollect = collect(IconCompatParcelizer(write(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, flow), 0), shortNewsContentCardView);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1] */
    public static final Object first(Flow flow, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        AbortFlowException e;
        ?? r6;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuationImpl;
            int i = flowKt__ReduceKt$first$1.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$first$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$first$1.RemoteActionCompatParcelizer;
        Symbol symbol = NullSurrogateKt.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            final createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            createinappmessageeventsubscriberM3979m.IconCompatParcelizer = symbol;
            ?? r2 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView) {
                    createinappmessageeventsubscriberM3979m.IconCompatParcelizer = obj2;
                    throw new AbortFlowException(this);
                }
            };
            try {
                flowKt__ReduceKt$first$1.read = createinappmessageeventsubscriberM3979m;
                flowKt__ReduceKt$first$1.serializer = r2;
                flowKt__ReduceKt$first$1.RemoteActionCompatParcelizer = 1;
                if (flow.collect(r2, flowKt__ReduceKt$first$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            } catch (AbortFlowException e2) {
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
                e = e2;
                r6 = r2;
                if (e.write == r6) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$first$1.getContext());
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r6 = flowKt__ReduceKt$first$1.serializer;
            createinappmessageeventsubscriber = flowKt__ReduceKt$first$1.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.write == r6) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$first$1.getContext());
            }
        }
        Object obj2 = createinappmessageeventsubscriber.IconCompatParcelizer;
        if (obj2 != symbol) {
            return obj2;
        }
        DrawableTransformation.write("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1] */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlinx.coroutines.flow.Flow] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1] */
    public static final Object firstOrNull(Flow flow, ShortNewsContentCardView shortNewsContentCardView) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        AbortFlowException e;
        ?? r4;
        if (shortNewsContentCardView instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) shortNewsContentCardView;
            int i = flowKt__ReduceKt$firstOrNull$1.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.write = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(shortNewsContentCardView);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(shortNewsContentCardView);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$firstOrNull$1.write;
        if (i2 == 0) {
            final createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            ?? r2 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, ShortNewsContentCardView shortNewsContentCardView2) {
                    createinappmessageeventsubscriberM3979m.IconCompatParcelizer = obj2;
                    throw new AbortFlowException(this);
                }
            };
            try {
                flowKt__ReduceKt$firstOrNull$1.IconCompatParcelizer = createinappmessageeventsubscriberM3979m;
                flowKt__ReduceKt$firstOrNull$1.read = r2;
                flowKt__ReduceKt$firstOrNull$1.write = 1;
                if (flow.collect(r2, flowKt__ReduceKt$firstOrNull$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            } catch (AbortFlowException e2) {
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
                e = e2;
                r4 = r2;
                if (e.write == r4) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r4 = flowKt__ReduceKt$firstOrNull$1.read;
            createinappmessageeventsubscriber = flowKt__ReduceKt$firstOrNull$1.IconCompatParcelizer;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.write == r4) {
                    throw e;
                }
                JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$firstOrNull$1.getContext());
            }
        }
        return createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    public static final Flow serializer(Flow flow) {
        return flow instanceof StateFlow ? flow : FlowKt__DistinctKt.write(flow, FlowKt__DistinctKt.IconCompatParcelizer, FlowKt__DistinctKt.read);
    }

    public static final ChannelFlowTransformLatest write(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Flow flow) {
        int i = FlowKt__MergeKt.write;
        return RemoteActionCompatParcelizer(flow, new FlowKt__MergeKt$mapLatest$1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null));
    }

    public static final FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 serializer(Flow flow, long j) {
        if (j > 0) {
            return new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(new FlowKt__DelayKt$sample$2(j, flow, null));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Sample period should be positive");
        return null;
    }

    public static final Flow write(Flow flow, long j) {
        if (j >= 0) {
            return j == 0 ? flow : new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(new FlowKt__DelayKt$debounceInternal$1(new FlowKt__DelayKt$$ExternalSyntheticLambda0(j, 0), flow, null));
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Debounce timeout should not be negative");
        return null;
    }

    public static Flow IconCompatParcelizer(Flow flow, int i) {
        IInAppMessageViewWrapper iInAppMessageViewWrapper = IInAppMessageViewWrapper.SUSPEND;
        if (i < 0 && i != -2 && i != -1) {
            DrawableTransformation.serializer((Object) c8$$ExternalSyntheticOutline0.m(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            iInAppMessageViewWrapper = IInAppMessageViewWrapper.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        IInAppMessageViewWrapper iInAppMessageViewWrapper2 = iInAppMessageViewWrapper;
        return flow instanceof FusibleFlow ? FusibleFlow.DefaultImpls.write((FusibleFlow) flow, null, i2, iInAppMessageViewWrapper2, 1) : new ChannelFlowOperatorImpl(flow, null, i2, iInAppMessageViewWrapper2, 2);
    }

    public static final Flow serializer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Flow flow) {
        int iWrite = BehaviorSubject.BehaviorDisposable.write();
        int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
        pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{2, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
        return FlowKt__DistinctKt.write(flow, FlowKt__DistinctKt.IconCompatParcelizer, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final Object emitAll(FlowCollector flowCollector, onBackCancelledlambda3 onbackcancelledlambda3, SuspendLambda suspendLambda) throws Throwable {
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector, onbackcancelledlambda3, true, suspendLambda);
        return objEmitAllImpl$FlowKt__ChannelsKt == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmitAllImpl$FlowKt__ChannelsKt : createFromParcel.INSTANCE;
    }

    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 RemoteActionCompatParcelizer(Flow flow, Flow flow2, Flow flow3, Flow flow4, Flow flow5, r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3, flow4, flow5}, r8lambdahlfuu54mfvlmnthbk7uy9j3wgim);
    }

    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 RemoteActionCompatParcelizer(Flow flow, Flow flow2, Flow flow3, Flow flow4, r8lambdagdus9EWsajL31FKA79xR2Pb0c4E r8lambdagdus9ewsajl31fka79xr2pb0c4e) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2, flow3, flow4}, r8lambdagdus9ewsajl31fka79xr2pb0c4e);
    }

    public static final FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 read(Flow flow, Flow flow2, Flow flow3, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds) {
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2, flow3}, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds);
    }

    public static final FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 write(Flow flow, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(new FlowKt__DelayKt$debounceInternal$1(r8lambdaunavo3sxub_pc9xroryotnrlvsm, flow, null));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object firstOrNull(Flow flow, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        AbortFlowException e;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        if (continuationImpl instanceof FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3) continuationImpl;
            int i = flowKt__ReduceKt$firstOrNull$3.RemoteActionCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.RemoteActionCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$3 = new FlowKt__ReduceKt$firstOrNull$3(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$3.read;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$firstOrNull$3.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, createinappmessageeventsubscriberM3979m);
            try {
                flowKt__ReduceKt$firstOrNull$3.write = createinappmessageeventsubscriberM3979m;
                flowKt__ReduceKt$firstOrNull$3.serializer = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                flowKt__ReduceKt$firstOrNull$3.RemoteActionCompatParcelizer = 1;
                if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3, flowKt__ReduceKt$firstOrNull$3) == obj2) {
                    return obj2;
                }
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            } catch (AbortFlowException e2) {
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
                e = e2;
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3;
                if (e.write == flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) {
                    JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$firstOrNull$3.getContext());
                } else {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = flowKt__ReduceKt$firstOrNull$3.serializer;
            createinappmessageeventsubscriber = flowKt__ReduceKt$firstOrNull$3.write;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.write == flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) {
                    JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$firstOrNull$3.getContext());
                } else {
                    throw e;
                }
            }
        }
        return createinappmessageeventsubscriber.IconCompatParcelizer;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object first(Flow flow, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber;
        AbortFlowException e;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        if (continuationImpl instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) continuationImpl;
            int i = flowKt__ReduceKt$first$3.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.IconCompatParcelizer = i - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(continuationImpl);
        }
        Object obj = flowKt__ReduceKt$first$3.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__ReduceKt$first$3.IconCompatParcelizer;
        Symbol symbol = NullSurrogateKt.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            createInAppMessageEventSubscriber createinappmessageeventsubscriberM3979m = c8$$ExternalSyntheticOutline0.m3979m(obj);
            createinappmessageeventsubscriberM3979m.IconCompatParcelizer = symbol;
            FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$3 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, createinappmessageeventsubscriberM3979m);
            try {
                flowKt__ReduceKt$first$3.read = createinappmessageeventsubscriberM3979m;
                flowKt__ReduceKt$first$3.RemoteActionCompatParcelizer = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                flowKt__ReduceKt$first$3.IconCompatParcelizer = 1;
                if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$3, flowKt__ReduceKt$first$3) == obj2) {
                    return obj2;
                }
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
            } catch (AbortFlowException e2) {
                createinappmessageeventsubscriber = createinappmessageeventsubscriberM3979m;
                e = e2;
                flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$$inlined$collectWhile$3;
                if (e.write == flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$first$3.getContext());
                } else {
                    throw e;
                }
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$3.RemoteActionCompatParcelizer;
            createinappmessageeventsubscriber = flowKt__ReduceKt$first$3.read;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                if (e.write == flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    JobKt.RemoteActionCompatParcelizer(flowKt__ReduceKt$first$3.getContext());
                } else {
                    throw e;
                }
            }
        }
        Object obj3 = createinappmessageeventsubscriber.IconCompatParcelizer;
        if (obj3 != symbol) {
            return obj3;
        }
        DrawableTransformation.write("Expected at least one element matching the predicate");
        return null;
    }
}
