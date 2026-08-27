package kotlinx.coroutines.flow.internal;

import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.bubble.presentation.GetBubbleUiState;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onAnimationEndlambda0;
import o.onBackCancelledlambda3;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final class CombineKt$zipImpl$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2 IconCompatParcelizer;
    public onAnimationEndlambda0 MediaBrowserCompatMediaItem;
    public int RatingCompat;
    public final /* synthetic */ GetBubbleUiState.AnonymousClass2 RemoteActionCompatParcelizer;
    public final /* synthetic */ StateProviderImpl$special$$inlined$map$2 read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ FlowCollector write;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ StateProviderImpl$special$$inlined$map$2 IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public final /* synthetic */ GetBubbleUiState.AnonymousClass2 MediaDescriptionCompat;
        public final /* synthetic */ FlowCollector MediaMetadataCompat;
        public final /* synthetic */ onAnimationEndlambda0 RemoteActionCompatParcelizer;
        public final /* synthetic */ ProducerCoroutine read;
        public final /* synthetic */ Object serializer;
        public final /* synthetic */ TextAnnouncementContentCardView write;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ ProducerCoroutine IconCompatParcelizer;
            public final /* synthetic */ GetBubbleUiState.AnonymousClass2 MediaBrowserCompatMediaItem;
            public final /* synthetic */ FlowCollector RemoteActionCompatParcelizer;
            public final /* synthetic */ Object read;
            public final /* synthetic */ onAnimationEndlambda0 serializer;
            public final /* synthetic */ TextAnnouncementContentCardView write;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            final class C00331 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
                public final /* synthetic */ onAnimationEndlambda0 IconCompatParcelizer;
                public FlowCollector MediaDescriptionCompat;
                public int MediaSessionCompatQueueItem;
                public final /* synthetic */ Object RemoteActionCompatParcelizer;
                public final /* synthetic */ ProducerCoroutine read;
                public final /* synthetic */ GetBubbleUiState.AnonymousClass2 serializer;
                public final /* synthetic */ FlowCollector write;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00331(ProducerCoroutine producerCoroutine, FlowCollector flowCollector, GetBubbleUiState.AnonymousClass2 anonymousClass2, Object obj, onAnimationEndlambda0 onanimationendlambda0, ShortNewsContentCardView shortNewsContentCardView) {
                    super(2, shortNewsContentCardView);
                    this.read = producerCoroutine;
                    this.write = flowCollector;
                    this.serializer = anonymousClass2;
                    this.RemoteActionCompatParcelizer = obj;
                    this.IconCompatParcelizer = onanimationendlambda0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                    return new C00331(this.read, this.write, this.serializer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, shortNewsContentCardView);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00331) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
                
                    if (r1.emit(r7, r6) == r0) goto L29;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r6.MediaSessionCompatQueueItem
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r1 == 0) goto L28
                        if (r1 == r4) goto L20
                        if (r1 == r3) goto L1a
                        if (r1 != r2) goto L14
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                        goto L6a
                    L14:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r7)
                        return r5
                    L1a:
                        kotlinx.coroutines.flow.FlowCollector r1 = r6.MediaDescriptionCompat
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                        goto L5f
                    L20:
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                        o.logUnregisterActivity r7 = (o.logUnregisterActivity) r7
                        java.lang.Object r7 = r7.RemoteActionCompatParcelizer
                        goto L36
                    L28:
                        coil3.ExtrasKt.RemoteActionCompatParcelizer(r7)
                        r6.MediaSessionCompatQueueItem = r4
                        kotlinx.coroutines.channels.ProducerCoroutine r7 = r6.read
                        java.lang.Object r7 = r7.mo5147receiveCatchingJP2dKIU(r6)
                        if (r7 != r0) goto L36
                        goto L69
                    L36:
                        boolean r1 = r7 instanceof o.resolveUnregisterDisplayedMessagelambda0
                        if (r1 == 0) goto L49
                        java.lang.Throwable r7 = o.logUnregisterActivity.write(r7)
                        if (r7 != 0) goto L48
                        o.onAnimationEndlambda0 r7 = r6.IconCompatParcelizer
                        kotlinx.coroutines.flow.internal.AbortFlowException r0 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r0.<init>(r7)
                        r7 = r0
                    L48:
                        throw r7
                    L49:
                        kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.RemoteActionCompatParcelizer
                        if (r7 != r1) goto L4e
                        r7 = r5
                    L4e:
                        kotlinx.coroutines.flow.FlowCollector r1 = r6.write
                        r6.MediaDescriptionCompat = r1
                        r6.MediaSessionCompatQueueItem = r3
                        com.roadrunner.bubble.presentation.GetBubbleUiState$invoke$2 r3 = r6.serializer
                        java.lang.Object r4 = r6.RemoteActionCompatParcelizer
                        java.lang.Object r7 = r3.invoke(r4, r7, r6)
                        if (r7 != r0) goto L5f
                        goto L69
                    L5f:
                        r6.MediaDescriptionCompat = r5
                        r6.MediaSessionCompatQueueItem = r2
                        java.lang.Object r7 = r1.emit(r7, r6)
                        if (r7 != r0) goto L6a
                    L69:
                        return r0
                    L6a:
                        o.createFromParcel r7 = o.createFromParcel.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00331.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            public AnonymousClass1(TextAnnouncementContentCardView textAnnouncementContentCardView, Object obj, ProducerCoroutine producerCoroutine, FlowCollector flowCollector, GetBubbleUiState.AnonymousClass2 anonymousClass2, onAnimationEndlambda0 onanimationendlambda0) {
                this.write = textAnnouncementContentCardView;
                this.read = obj;
                this.IconCompatParcelizer = producerCoroutine;
                this.RemoteActionCompatParcelizer = flowCollector;
                this.MediaBrowserCompatMediaItem = anonymousClass2;
                this.serializer = onanimationendlambda0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (shortNewsContentCardView instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) shortNewsContentCardView;
                    int i = combineKt$zipImpl$1$1$2$1$emit$1.write;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.write = i - Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, shortNewsContentCardView);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, shortNewsContentCardView);
                }
                Object obj2 = combineKt$zipImpl$1$1$2$1$emit$1.serializer;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = combineKt$zipImpl$1$1$2$1$emit$1.write;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                if (i2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    C00331 c00331 = new C00331(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem, obj, this.serializer, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.write = 1;
                    return ChannelFlowKt.withContextUndispatched(this.write, createfromparcel, this.read, c00331, combineKt$zipImpl$1$1$2$1$emit$1) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i2 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2, TextAnnouncementContentCardView textAnnouncementContentCardView, Object obj, ProducerCoroutine producerCoroutine, FlowCollector flowCollector, GetBubbleUiState.AnonymousClass2 anonymousClass2, onAnimationEndlambda0 onanimationendlambda0, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.IconCompatParcelizer = stateProviderImpl$special$$inlined$map$2;
            this.write = textAnnouncementContentCardView;
            this.serializer = obj;
            this.read = producerCoroutine;
            this.MediaMetadataCompat = flowCollector;
            this.MediaDescriptionCompat = anonymousClass2;
            this.RemoteActionCompatParcelizer = onanimationendlambda0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            return new AnonymousClass2(this.IconCompatParcelizer, this.write, this.serializer, this.read, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((createFromParcel) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.MediaBrowserCompatMediaItem;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.write, this.serializer, this.read, this.MediaMetadataCompat, this.MediaDescriptionCompat, this.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatMediaItem = 1;
                if (this.IconCompatParcelizer.collect(anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1(StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$2, StateProviderImpl$special$$inlined$map$2 stateProviderImpl$special$$inlined$map$3, FlowCollector flowCollector, GetBubbleUiState.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.read = stateProviderImpl$special$$inlined$map$2;
        this.IconCompatParcelizer = stateProviderImpl$special$$inlined$map$3;
        this.write = flowCollector;
        this.RemoteActionCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.read, this.IconCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, shortNewsContentCardView);
        combineKt$zipImpl$1$1.serializer = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$zipImpl$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0087 A[Catch: all -> 0x0019, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0019, blocks: (B:6:0x0015, B:25:0x007f, B:29:0x0087), top: B:33:0x0015 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [o.onBackCancelledlambda3] */
    /* JADX WARN: Type inference failed for: r4v6, types: [o.onBackCancelledlambda3] */
    /* JADX WARN: Type inference failed for: r4v8, types: [o.onBackCancelledlambda3] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlinx.coroutines.channels.ProducerCoroutine, o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4] */
    /* JADX WARN: Type inference failed for: r5v3, types: [o.onBackCancelledlambda3] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r5;
        ?? r4;
        onAnimationEndlambda0 onanimationendlambda0;
        ?? r6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.RatingCompat;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            if (i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            onanimationendlambda0 = this.MediaBrowserCompatMediaItem;
            r4 = (onBackCancelledlambda3) this.serializer;
            try {
                try {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    r6 = r4;
                    r6.write(null);
                    return createfromparcel;
                } catch (AbortFlowException e) {
                    e = e;
                    if (e.write == onanimationendlambda0) {
                        throw e;
                    }
                    r4.write(null);
                    return createfromparcel;
                }
            } catch (Throwable th) {
                th = th;
                r5 = r4;
                r5.write(null);
                throw th;
            }
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.serializer;
        r5 = Room.read(getcontentviewgroupparentlayout, 0, new CombineKt$zipImpl$1$1$second$1(this.read, null), 3);
        final onAnimationEndlambda0 onanimationendlambda0RemoteActionCompatParcelizer = JobKt.RemoteActionCompatParcelizer();
        r5.serializer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public final Object invoke(Object obj2) {
                onAnimationEndlambda0 onanimationendlambda1 = onanimationendlambda0RemoteActionCompatParcelizer;
                if (onanimationendlambda1.I_()) {
                    onanimationendlambda1.RemoteActionCompatParcelizer((CancellationException) new AbortFlowException(onanimationendlambda1));
                }
                return createFromParcel.INSTANCE;
            }
        });
        try {
            TextAnnouncementContentCardView coroutineContext = getcontentviewgroupparentlayout.getCoroutineContext();
            Object obj2 = ThreadContextKt.read(coroutineContext);
            TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = getcontentviewgroupparentlayout.getCoroutineContext().plus(onanimationendlambda0RemoteActionCompatParcelizer);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.IconCompatParcelizer, coroutineContext, obj2, r5, this.write, this.RemoteActionCompatParcelizer, onanimationendlambda0RemoteActionCompatParcelizer, null);
            this.serializer = r5;
            this.MediaBrowserCompatMediaItem = onanimationendlambda0RemoteActionCompatParcelizer;
            this.RatingCompat = 1;
            if (ChannelFlowKt.withContextUndispatched(textAnnouncementContentCardViewPlus, createfromparcel, ThreadContextKt.read(textAnnouncementContentCardViewPlus), anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            r6 = r5;
            r6.write(null);
            return createfromparcel;
        } catch (AbortFlowException e2) {
            e = e2;
            r4 = r5;
            onanimationendlambda0 = onanimationendlambda0RemoteActionCompatParcelizer;
            if (e.write == onanimationendlambda0) {
                throw e;
            }
            r4.write(null);
            return createfromparcel;
        } catch (Throwable th2) {
            th = th2;
            r5.write(null);
            throw th;
        }
    }
}
