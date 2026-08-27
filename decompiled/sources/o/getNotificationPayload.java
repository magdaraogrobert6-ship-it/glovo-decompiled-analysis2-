package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes3.dex */
public final class getNotificationPayload implements r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE {
    public static final getNotificationPayload write = new getNotificationPayload(0);
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ getNotificationPayload(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE
    public final boolean IconCompatParcelizer(Class cls) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return false;
        }
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }

    @Override // o.r8lambdahI3Gyneb8JrZ6jncRc55ARFUQkE
    public final DataStoreValueType write(Class cls) {
        if (this.RemoteActionCompatParcelizer != 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (DataStoreValueType) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
            } catch (Exception e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported message type: ".concat(cls.getName()));
        }
        return null;
    }
}
