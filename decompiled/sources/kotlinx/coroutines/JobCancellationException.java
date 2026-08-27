package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import o.DefaultInAppMessageViewWrappercreateTouchAwareListener1;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class JobCancellationException extends CancellationException {
    public final transient JobSupport serializer;

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{jobCancellationException.getMessage(), getMessage()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object obj2 = jobCancellationException.serializer;
        if (obj2 == null) {
            obj2 = DefaultInAppMessageViewWrappercreateTouchAwareListener1.serializer;
        }
        Object obj3 = this.serializer;
        if (obj3 == null) {
            obj3 = DefaultInAppMessageViewWrappercreateTouchAwareListener1.serializer;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj2, obj3}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{jobCancellationException.getCause(), getCause()}, getCieXyz.write())).booleanValue();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.serializer;
        if (obj == null) {
            obj = DefaultInAppMessageViewWrappercreateTouchAwareListener1.serializer;
        }
        sb.append(obj);
        return sb.toString();
    }

    public JobCancellationException(String str, Throwable th, JobSupport jobSupport) {
        super(str);
        this.serializer = jobSupport;
        if (th != null) {
            initCause(th);
        }
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int iHashCode = message.hashCode();
        Object obj = this.serializer;
        if (obj == null) {
            obj = DefaultInAppMessageViewWrappercreateTouchAwareListener1.serializer;
        }
        int iHashCode2 = obj != null ? obj.hashCode() : 0;
        Throwable cause = getCause();
        return (((iHashCode * 31) + iHashCode2) * 31) + (cause != null ? cause.hashCode() : 0);
    }
}
