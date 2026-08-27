package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1 extends ScopeCoroutine implements Runnable {
    public final long write;

    @Override // kotlinx.coroutines.JobSupport
    public final String J_() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.J_());
        sb.append("(timeMillis=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.write, ')');
    }

    @Override // java.lang.Runnable
    public final void run() {
        DelayKt.serializer(this.RemoteActionCompatParcelizer);
        MediaDescriptionCompat(new TimeoutCancellationException("Timed out waiting for " + this.write + " ms", this));
    }

    public DefaultInAppMessageViewWrapperopen4dismissInAppMessageCallback1(long j, ContinuationImpl continuationImpl) {
        super(continuationImpl, continuationImpl.getContext());
        this.write = j;
    }
}
