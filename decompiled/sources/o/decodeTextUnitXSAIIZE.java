package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class decodeTextUnitXSAIIZE implements getClipToBounds {
    public static final decodeTextUnitXSAIIZE RemoteActionCompatParcelizer = new decodeTextUnitXSAIIZE(1);
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ decodeTextUnitXSAIIZE(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.getClipToBounds
    public final boolean RemoteActionCompatParcelizer(Class cls) {
        if (this.IconCompatParcelizer != 0) {
            return GeneratedMessageLite.class.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // o.getClipToBounds
    public final canBeSaved read(Class cls) {
        if (this.IconCompatParcelizer == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            try {
                return (canBeSaved) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).buildMessageInfo();
            } catch (Exception e) {
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to get message info for ".concat(cls.getName()), e);
            }
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unsupported message type: ".concat(cls.getName()));
        }
        return null;
    }
}
