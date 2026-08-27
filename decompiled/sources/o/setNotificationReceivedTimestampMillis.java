package o;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class setNotificationReceivedTimestampMillis implements setPushDeliveryEnabled {
    @Override // o.setPushDeliveryEnabled
    public final boolean serializer(Context context, StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName().equalsIgnoreCase(context.getApplicationContext().getApplicationInfo().className) && stackTraceElement.getMethodName().contentEquals("onCreate");
    }
}
