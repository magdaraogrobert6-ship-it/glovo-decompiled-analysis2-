package o;

import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class getAction extends CompositionLocalsKtLocalHapticFeedback1 {
    public final void serializer(String str, Value value) {
        str.getClass();
        value.getClass();
        RemoteActionCompatParcelizer();
        ((MapValue) this.RemoteActionCompatParcelizer).getMutableFieldsMap().put(str, value);
    }

    public getAction(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
