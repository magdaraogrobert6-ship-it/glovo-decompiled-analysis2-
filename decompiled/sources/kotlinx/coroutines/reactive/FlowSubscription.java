package kotlinx.coroutines.reactive;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.HomeFragment;
import io.grpc.LoadBalancer$Helper;
import io.reactivex.subjects.BehaviorSubject;
import io.sentry.SentryUUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import o.FwFClientaddFeatureKeysfeaturesUpdated1;
import o.FwFClientclose11;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createCloseInAppMessageClickListenerlambda0;
import o.createFromParcel;
import o.markOnScreenCardsAsRead;
import o.markOnScreenCardsAsReadlambda1;
import o.onBackProgressed;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;

/* JADX INFO: loaded from: classes4.dex */
public final class FlowSubscription extends createCloseInAppMessageClickListenerlambda0 implements FwFClientclose11 {
    public final FwFClientaddFeatureKeysfeaturesUpdated1 MediaBrowserCompatMediaItem;
    public final Flow MediaSessionCompatQueueItem;
    private volatile boolean cancellationRequested;
    private volatile /* synthetic */ Object producer$volatile;
    private volatile /* synthetic */ long requested$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater IconCompatParcelizer = AtomicLongFieldUpdater.newUpdater(FlowSubscription.class, "requested$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(FlowSubscription.class, Object.class, "producer$volatile");
    public static final /* synthetic */ long read = markOnScreenCardsAsRead.serializer.objectFieldOffset(FlowSubscription.class.getDeclaredField("producer$volatile"));

    @Override // o.FwFClientclose11
    public final /* synthetic */ void cancel() {
        this.cancellationRequested = true;
        write((CancellationException) null);
    }

    public FlowSubscription(Flow flow, FwFClientaddFeatureKeysfeaturesUpdated1 fwFClientaddFeatureKeysfeaturesUpdated1, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        super(textAnnouncementContentCardView, false, true);
        this.MediaSessionCompatQueueItem = flow;
        this.MediaBrowserCompatMediaItem = fwFClientaddFeatureKeysfeaturesUpdated1;
        final TextAnnouncementContentCardView textAnnouncementContentCardView2 = this.RemoteActionCompatParcelizer;
        this.producer$volatile = new ShortNewsContentCardView() { // from class: kotlinx.coroutines.reactive.FlowSubscription$createInitialContinuation$$inlined$Continuation$1
            @Override // o.ShortNewsContentCardView
            public final TextAnnouncementContentCardView getContext() {
                return textAnnouncementContentCardView2;
            }

            @Override // o.ShortNewsContentCardView
            public final void resumeWith(Object obj) {
                ShortNewsContentCardView shortNewsContentCardView;
                FlowSubscription flowSubscription = this;
                final HomeFragment.AnonymousClass1 anonymousClass1 = new HomeFragment.AnonymousClass1(1, flowSubscription, FlowSubscription.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 27);
                try {
                    TextAnnouncementContentCardView textAnnouncementContentCardView3 = flowSubscription.RemoteActionCompatParcelizer;
                    if (textAnnouncementContentCardView3 == r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write) {
                        shortNewsContentCardView = new RestrictedContinuationImpl(flowSubscription) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1
                            public int label;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj2) {
                                int i = this.label;
                                if (i != 0) {
                                    if (i != 1) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("This coroutine had already completed");
                                        return null;
                                    }
                                    this.label = 2;
                                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                    return obj2;
                                }
                                this.label = 1;
                                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                HomeFragment.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                int iWrite = BehaviorSubject.BehaviorDisposable.write();
                                int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{1, anonymousClass2}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
                                return anonymousClass2.invoke(this);
                            }
                        };
                    } else {
                        shortNewsContentCardView = new ContinuationImpl(flowSubscription, textAnnouncementContentCardView3) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2
                            public int label;

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj2) {
                                int i = this.label;
                                if (i != 0) {
                                    if (i != 1) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.write("This coroutine had already completed");
                                        return null;
                                    }
                                    this.label = 2;
                                    ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                    return obj2;
                                }
                                this.label = 1;
                                ExtrasKt.RemoteActionCompatParcelizer(obj2);
                                HomeFragment.AnonymousClass1 anonymousClass2 = anonymousClass1;
                                int iWrite = BehaviorSubject.BehaviorDisposable.write();
                                int iWrite2 = BehaviorSubject.BehaviorDisposable.write();
                                pauseWebviewIfNecessarylambda10.read(BehaviorSubject.BehaviorDisposable.write(), new Object[]{1, anonymousClass2}, BehaviorSubject.BehaviorDisposable.write(), iWrite, -722072991, 722072991, iWrite2);
                                return anonymousClass2.invoke(this);
                            }
                        };
                    }
                    DispatchedContinuationKt.serializer(createFromParcel.INSTANCE, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
                } catch (Throwable th) {
                    SentryUUID.IconCompatParcelizer(th, flowSubscription);
                    throw null;
                }
            }
        };
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object access$flowProcessing(FlowSubscription flowSubscription, ShortNewsContentCardView shortNewsContentCardView) {
        onBackProgressed onbackprogressed;
        flowSubscription.getClass();
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (shortNewsContentCardView instanceof onBackProgressed) {
            onbackprogressed = (onBackProgressed) shortNewsContentCardView;
            int i = onbackprogressed.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                onbackprogressed.write = i - Integer.MIN_VALUE;
            } else {
                onbackprogressed = new onBackProgressed(flowSubscription, shortNewsContentCardView);
            }
        } else {
            onbackprogressed = new onBackProgressed(flowSubscription, shortNewsContentCardView);
        }
        Object obj = onbackprogressed.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = onbackprogressed.write;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                onbackprogressed.IconCompatParcelizer = flowSubscription;
                onbackprogressed.write = 1;
                Object objCollect = flowSubscription.MediaSessionCompatQueueItem.collect(new FlowSubscription$consumeFlow$2(0, flowSubscription), onbackprogressed);
                if (objCollect != coroutineSingletons) {
                    objCollect = createfromparcel;
                }
                if (objCollect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                flowSubscription = onbackprogressed.IconCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            try {
                flowSubscription.MediaBrowserCompatMediaItem.onComplete();
            } catch (Throwable th) {
                TimeoutKt.read(flowSubscription.RemoteActionCompatParcelizer, th);
            }
        } catch (Throwable th2) {
            if (!flowSubscription.cancellationRequested || flowSubscription.I_() || th2 != flowSubscription.write()) {
                try {
                    flowSubscription.MediaBrowserCompatMediaItem.onError(th2);
                } catch (Throwable th3) {
                    markOnScreenCardsAsReadlambda1.read(th2, th3);
                    TimeoutKt.read(flowSubscription.RemoteActionCompatParcelizer, th2);
                }
            }
        }
        return createfromparcel;
    }

    @Override // o.FwFClientclose11
    public final void request(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        ShortNewsContentCardView shortNewsContentCardView;
        if (j <= 0) {
            return;
        }
        do {
            atomicLongFieldUpdater = IconCompatParcelizer;
            j2 = atomicLongFieldUpdater.get(this);
            j3 = j2 + j;
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j3));
        if (j2 <= 0) {
            do {
                write.getClass();
                shortNewsContentCardView = (ShortNewsContentCardView) markOnScreenCardsAsRead.serializer.getAndSetObject(this, read, (Object) null);
            } while (shortNewsContentCardView == null);
            shortNewsContentCardView.resumeWith(createFromParcel.INSTANCE);
        }
    }
}
