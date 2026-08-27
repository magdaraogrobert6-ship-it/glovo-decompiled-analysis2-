package o;

import com.sentiance.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes3.dex */
public final class getTriggerEvent extends com.sentiance.protobuf.c1 {
    @Override // com.sentiance.protobuf.c1
    public final IValueCallback write(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        IValueCallback iValueCallback = generatedMessageLite.serializer;
        if (iValueCallback != IValueCallback.write) {
            return iValueCallback;
        }
        IValueCallback iValueCallback2 = new IValueCallback();
        generatedMessageLite.serializer = iValueCallback2;
        return iValueCallback2;
    }

    @Override // com.sentiance.protobuf.c1
    public final void write(Object obj, Object obj2) {
        ((GeneratedMessageLite) obj).serializer = (IValueCallback) obj2;
    }
}
