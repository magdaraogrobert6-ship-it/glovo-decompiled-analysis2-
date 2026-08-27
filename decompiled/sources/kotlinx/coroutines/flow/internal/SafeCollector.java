package kotlinx.coroutines.flow.internal;

import androidx.compose.runtime.Updater$$ExternalSyntheticLambda1;
import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.isCurrentlyDisplayingInAppMessage;
import o.onItemDismiss;
import o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T> {
    public final FlowCollector IconCompatParcelizer;
    public final TextAnnouncementContentCardView RemoteActionCompatParcelizer;
    public ShortNewsContentCardView read;
    public TextAnnouncementContentCardView serializer;
    public final int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public SafeCollector(FlowCollector flowCollector, TextAnnouncementContentCardView textAnnouncementContentCardView) {
        super(NoOpContinuation.serializer, r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write);
        this.IconCompatParcelizer = flowCollector;
        this.RemoteActionCompatParcelizer = textAnnouncementContentCardView;
        this.write = ((Number) textAnnouncementContentCardView.fold(0, new SaversKt$$ExternalSyntheticLambda7(7))).intValue();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, o.r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg
    public final r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg getCallerFrame() {
        ShortNewsContentCardView shortNewsContentCardView = this.read;
        if (shortNewsContentCardView instanceof r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) {
            return (r8lambda2dcyUKvX9WeSjXRdfGHo1Qgvdmg) shortNewsContentCardView;
        }
        return null;
    }

    public final Object emit(ShortNewsContentCardView shortNewsContentCardView, Object obj) {
        TextAnnouncementContentCardView context = shortNewsContentCardView.getContext();
        JobKt.RemoteActionCompatParcelizer(context);
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.serializer;
        if (textAnnouncementContentCardView != context) {
            if (textAnnouncementContentCardView instanceof DownstreamExceptionContext) {
                throw new IllegalStateException(isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((DownstreamExceptionContext) textAnnouncementContentCardView).read + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new Updater$$ExternalSyntheticLambda1(17, this))).intValue() != this.write) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.RemoteActionCompatParcelizer + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.serializer = context;
        }
        this.read = shortNewsContentCardView;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = SafeCollectorKt.read;
        FlowCollector flowCollector = this.IconCompatParcelizer;
        flowCollector.getClass();
        Object objInvoke = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(flowCollector, obj, this);
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{objInvoke, CoroutineSingletons.COROUTINE_SUSPENDED}, getCieXyz.write())).booleanValue()) {
            this.read = null;
        }
        return objInvoke;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        TextAnnouncementContentCardView textAnnouncementContentCardView = this.serializer;
        return textAnnouncementContentCardView == null ? r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write : textAnnouncementContentCardView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable thSerializer = onItemDismiss.serializer(obj);
        if (thSerializer != null) {
            this.serializer = new DownstreamExceptionContext(getContext(), thSerializer);
        }
        ShortNewsContentCardView shortNewsContentCardView = this.read;
        if (shortNewsContentCardView != null) {
            shortNewsContentCardView.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        try {
            Object objEmit = emit(shortNewsContentCardView, obj);
            return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : createFromParcel.INSTANCE;
        } catch (Throwable th) {
            this.serializer = new DownstreamExceptionContext(shortNewsContentCardView.getContext(), th);
            throw th;
        }
    }
}
