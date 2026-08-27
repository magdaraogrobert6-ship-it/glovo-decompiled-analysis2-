package o;

import com.sentiance.sdk.InjectUsing;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "FulfilledRequestsTracker", componentName = "FulfilledOnDemandLogRequestTracker")
public class BrazeNotificationPayloadConversationMessage {
    private final com.sentiance.sdk.util.c serializer;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI write;

    public final void read(String str) {
        this.write.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.sentiance.sdk.util.c cVar = this.serializer;
        for (String str2 : cVar.RemoteActionCompatParcelizer()) {
            if (jCurrentTimeMillis - 2592000000L > cVar.IconCompatParcelizer(str2, 0L)) {
                cVar.read(str2);
            }
        }
        cVar.read(System.currentTimeMillis(), str);
    }

    public final boolean write(String str) {
        return this.serializer.write(str);
    }

    public BrazeNotificationPayloadConversationMessage(com.sentiance.sdk.util.c cVar, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni) {
        this.serializer = cVar;
        this.write = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
    }
}
