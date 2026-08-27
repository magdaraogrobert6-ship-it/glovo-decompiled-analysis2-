package o;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class isNullOrEmpty {
    public static final java.util.logging.Logger RemoteActionCompatParcelizer = java.util.logging.Logger.getLogger(r8lambdan29IM8cjKN7OBDaXnvkIjDq8Rpc.class.getName());
    public final incrementPermissionRequestCountlambda0 read;
    public final Object serializer = new Object();

    public static void IconCompatParcelizer(incrementPermissionRequestCountlambda0 incrementpermissionrequestcountlambda0, Level level, String str) {
        java.util.logging.Logger logger = RemoteActionCompatParcelizer;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + incrementpermissionrequestcountlambda0 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void serializer(r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA r8lambdaqyswzub08pynnyve4xv_lckzra) {
        Level level;
        int i = ifNonEmpty.write[r8lambdaqyswzub08pynnyve4xv_lckzra.write.ordinal()];
        if (i != 1) {
            level = i != 2 ? Level.FINEST : Level.FINER;
        } else {
            level = Level.FINE;
        }
        synchronized (this.serializer) {
        }
        IconCompatParcelizer(this.read, level, r8lambdaqyswzub08pynnyve4xv_lckzra.IconCompatParcelizer);
    }

    public isNullOrEmpty(incrementPermissionRequestCountlambda0 incrementpermissionrequestcountlambda0, long j, String str) {
        this.read = incrementpermissionrequestcountlambda0;
        String strConcat = str.concat(" created");
        getPermissionRequestCount getpermissionrequestcount = getPermissionRequestCount.CT_INFO;
        TextStreamsKt.serializer(getpermissionrequestcount, "severity");
        serializer(new r8lambdaqYSwZub08pyNNYVE4xV_lcKzRA(strConcat, getpermissionrequestcount, j, null));
    }
}
