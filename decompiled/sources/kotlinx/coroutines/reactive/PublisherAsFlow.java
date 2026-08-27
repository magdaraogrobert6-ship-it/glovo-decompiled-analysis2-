package kotlinx.coroutines.reactive;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.channels.Channel$Factory;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;
import o.IInAppMessageViewWrapper;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.ShortNewsContentCardViewCompanion;
import o.TextAnnouncementContentCardView;
import o.createCloseInAppMessageClickListenerlambda0;
import o.createFromParcel;
import o.logUnregisterActivitylambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class PublisherAsFlow extends ChannelFlow {
    public final FlowableDoFinally read;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final Object collectTo(InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, ShortNewsContentCardView shortNewsContentCardView) {
        TextAnnouncementContentCardView textAnnouncementContentCardView = ((createCloseInAppMessageClickListenerlambda0) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1).RemoteActionCompatParcelizer;
        Object objCollectImpl = collectImpl(new SendingCollector((ProducerCoroutine) inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1), shortNewsContentCardView);
        return objCollectImpl == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollectImpl : createFromParcel.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public final ChannelFlow RemoteActionCompatParcelizer(TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        return new PublisherAsFlow(this.read, textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
    }

    public final long serializer() {
        if (this.MediaSessionCompatQueueItem != IInAppMessageViewWrapper.SUSPEND) {
            return Long.MAX_VALUE;
        }
        int i = this.RemoteActionCompatParcelizer;
        if (i == -2) {
            logUnregisterActivitylambda1.ResultReceiver.getClass();
            return Channel$Factory.serializer;
        }
        if (i == 0) {
            return 1L;
        }
        if (i == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        long j = i;
        if (j >= 1) {
            return j;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Check failed.");
        return 0L;
    }

    public PublisherAsFlow(FlowableDoFinally flowableDoFinally, TextAnnouncementContentCardView textAnnouncementContentCardView, int i, IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        super(textAnnouncementContentCardView, i, iInAppMessageViewWrapper);
        this.read = flowableDoFinally;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.RatingCompat;
        ShortNewsContentCardViewCompanion shortNewsContentCardViewCompanion = ShortNewsContentCardViewCompanion.serializer;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) textAnnouncementContentCardView.get(shortNewsContentCardViewCompanion);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (coroutineDispatcher == null || coroutineDispatcher.equals(context.get(shortNewsContentCardViewCompanion))) {
            context.plus(textAnnouncementContentCardView);
            Object objCollectImpl = collectImpl(flowCollector, shortNewsContentCardView);
            if (objCollectImpl == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objCollectImpl;
            }
        } else {
            Object objCoroutineScope = YieldKt.coroutineScope(new RxConvertKt$asObservable$1$job$1(flowCollector, this, null, 7), shortNewsContentCardView);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (objCoroutineScope != coroutineSingletons) {
                objCoroutineScope = createfromparcel;
            }
            if (objCoroutineScope == coroutineSingletons) {
                return objCoroutineScope;
            }
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:13:0x0037, B:40:0x00b3, B:26:0x0073, B:37:0x009b, B:42:0x00be, B:44:0x00c2, B:45:0x00c8, B:46:0x00cb, B:18:0x004d), top: B:55:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r13.emit(r0, r2) == r3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Type inference failed for: r4v8, types: [kotlinx.coroutines.reactive.ReactiveSubscriber] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b0 -> B:14:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collectImpl(kotlinx.coroutines.flow.FlowCollector r19, o.ShortNewsContentCardView r20) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.reactive.PublisherAsFlow.collectImpl(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }
}
