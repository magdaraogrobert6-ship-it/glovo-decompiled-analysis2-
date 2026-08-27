package o;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes4.dex */
public final class iExternalSyntheticLambda1 extends java.lang.ref.WeakReference {
    public static final RuntimeException IconCompatParcelizer;
    public static final boolean write = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    public final ConcurrentMap MediaBrowserCompatMediaItem;
    public final AtomicBoolean MediaSessionCompatQueueItem;
    public final SoftReference RemoteActionCompatParcelizer;
    public final String read;
    public final ReferenceQueue serializer;

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.MediaBrowserCompatMediaItem.remove(this);
        this.RemoteActionCompatParcelizer.clear();
        serializer(this.serializer);
    }

    public static void serializer(ReferenceQueue referenceQueue) {
        while (true) {
            iExternalSyntheticLambda1 iexternalsyntheticlambda1 = (iExternalSyntheticLambda1) referenceQueue.poll();
            if (iexternalsyntheticlambda1 == null) {
                return;
            }
            SoftReference softReference = iexternalsyntheticlambda1.RemoteActionCompatParcelizer;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            iexternalsyntheticlambda1.MediaBrowserCompatMediaItem.remove(iexternalsyntheticlambda1);
            softReference.clear();
            if (!iexternalsyntheticlambda1.MediaSessionCompatQueueItem.get()) {
                Level level = Level.SEVERE;
                java.util.logging.Logger logger = BrazeDeeplinkHandler.write;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{iexternalsyntheticlambda1.read});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        IconCompatParcelizer = runtimeException;
    }

    public iExternalSyntheticLambda1(BrazeDeeplinkHandler brazeDeeplinkHandler, hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(brazeDeeplinkHandler, referenceQueue);
        this.MediaSessionCompatQueueItem = new AtomicBoolean();
        this.RemoteActionCompatParcelizer = new SoftReference(write ? new RuntimeException("ManagedChannel allocation site") : IconCompatParcelizer);
        this.read = hastoomanyzipentrieslambda0.toString();
        this.serializer = referenceQueue;
        this.MediaBrowserCompatMediaItem = concurrentMap;
        concurrentMap.put(this, this);
        serializer(referenceQueue);
    }
}
