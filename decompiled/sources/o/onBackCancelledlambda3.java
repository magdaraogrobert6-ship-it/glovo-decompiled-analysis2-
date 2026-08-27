package o;

import io.grpc.internal.CallTracer;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferedChannel;

/* JADX INFO: loaded from: classes4.dex */
public interface onBackCancelledlambda3 {
    BufferedChannel.BufferedChannelIterator MediaSessionCompatToken();

    CallTracer RemoteActionCompatParcelizer();

    Object RemoteActionCompatParcelizer(ContinuationImpl continuationImpl);

    Object r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();

    /* JADX INFO: renamed from: receiveCatching-JP2dKIU */
    Object mo5147receiveCatchingJP2dKIU(SuspendLambda suspendLambda);

    CallTracer serializer();

    void write(CancellationException cancellationException);
}
