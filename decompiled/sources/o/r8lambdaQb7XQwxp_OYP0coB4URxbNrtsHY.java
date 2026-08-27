package o;

import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaQb7XQwxp_OYP0coB4URxbNrtsHY {
    public static <T> void read(Task task, parseLonglambda0 parselonglambda0, String str, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, long j) {
        migratePushDeliveryEventsToJsonlambda0.write writeVar = new migratePushDeliveryEventsToJsonlambda0.write();
        if (task.isComplete()) {
            return;
        }
        Boolean[] boolArr = {Boolean.FALSE};
        task.addOnCompleteListener(new r8lambdaIKrUXM7M1NlFsmnL5loEQlEFIc4(writeVar, boolArr));
        boolean z = j == 0;
        r8lambdaqv3gcjxzuxdig5g76qjuzxgjni.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        while (true) {
            long j2 = (jCurrentTimeMillis + j) - jCurrentTimeMillis2;
            if (boolArr[0].booleanValue()) {
                return;
            }
            if (!z && j2 <= 0) {
                return;
            }
            if (z) {
                j2 = 0;
            }
            try {
                synchronized (writeVar) {
                    try {
                        writeVar.wait(j2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException e) {
                parselonglambda0.IconCompatParcelizer(false, e, str.concat(": interrupted"), new Object[0]);
                Thread.currentThread().interrupt();
            }
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
    }

    public static <T> void read(Task task, parseLonglambda0 parselonglambda0, String str) {
        Exception exception = task.getException();
        if (exception != null) {
            if (exception instanceof com.google.android.gms.common.api.ApiException) {
                parselonglambda0.IconCompatParcelizer(false, exception, "%s. Reason: %s", str, GeofenceStatusCodes.getStatusCodeString(((com.google.android.gms.common.api.ApiException) exception).getStatusCode()));
                return;
            } else {
                parselonglambda0.IconCompatParcelizer(false, exception, "%s", str);
                return;
            }
        }
        parselonglambda0.RemoteActionCompatParcelizer("%s. No exception available.", str);
    }
}
