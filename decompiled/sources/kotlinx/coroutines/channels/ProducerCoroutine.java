package kotlinx.coroutines.channels;

import io.grpc.internal.CallTracer;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createCloseInAppMessageClickListenerlambda0;
import o.logUnregisterActivitylambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class ProducerCoroutine extends createCloseInAppMessageClickListenerlambda0 implements InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, logUnregisterActivitylambda1 {
    public final BufferedChannel read;

    public ProducerCoroutine(TextAnnouncementContentCardView textAnnouncementContentCardView, BufferedChannel bufferedChannel) {
        super(textAnnouncementContentCardView, true, true);
        this.read = bufferedChannel;
    }

    @Override // o.onBackCancelledlambda3
    public final BufferedChannel.BufferedChannelIterator MediaSessionCompatToken() {
        BufferedChannel bufferedChannel = this.read;
        bufferedChannel.getClass();
        return bufferedChannel.new BufferedChannelIterator();
    }

    @Override // o.onBackCancelledlambda3
    public final CallTracer RemoteActionCompatParcelizer() {
        return this.read.RemoteActionCompatParcelizer();
    }

    @Override // o.onBackCancelledlambda3
    public final Object RemoteActionCompatParcelizer(ContinuationImpl continuationImpl) {
        BufferedChannel bufferedChannel = this.read;
        bufferedChannel.getClass();
        return BufferedChannel.receive$suspendImpl(bufferedChannel, continuationImpl);
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final Object b_(Object obj) {
        return this.read.b_(obj);
    }

    @Override // o.onBackCancelledlambda3
    public final Object r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return this.read.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
    }

    @Override // o.onBackCancelledlambda3
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    public final Object mo5147receiveCatchingJP2dKIU(SuspendLambda suspendLambda) {
        BufferedChannel bufferedChannel = this.read;
        bufferedChannel.getClass();
        Object objM5146receiveCatchingJP2dKIU$suspendImpl = BufferedChannel.m5146receiveCatchingJP2dKIU$suspendImpl(bufferedChannel, suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM5146receiveCatchingJP2dKIU$suspendImpl;
    }

    @Override // o.onBackCancelledlambda3
    public final CallTracer serializer() {
        return this.read.serializer();
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final Object serializer(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return this.read.serializer(obj, shortNewsContentCardView);
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final void serializer(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.read.serializer(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // o.createCloseInAppMessageClickListenerlambda0
    public final void write(Object obj) {
        this.read.IconCompatParcelizer((Throwable) null);
    }

    @Override // o.r8lambdahgODiqgPByAI8PyoNAxx8PBqX4
    public final boolean IconCompatParcelizer(Throwable th) {
        return this.read.read(th, false);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void RemoteActionCompatParcelizer(CancellationException cancellationException) {
        this.read.read((Throwable) cancellationException, true);
        MediaDescriptionCompat(cancellationException);
    }

    @Override // o.createCloseInAppMessageClickListenerlambda0
    public final void write(Throwable th, boolean z) {
        if (this.read.read(th, false) || z) {
            return;
        }
        TimeoutKt.read(this.RemoteActionCompatParcelizer, th);
    }

    @Override // kotlinx.coroutines.JobSupport, o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0
    public final void write(CancellationException cancellationException) {
        if (MediaDescriptionCompat()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(IconCompatParcelizer(), null, this);
        }
        RemoteActionCompatParcelizer(cancellationException);
    }
}
