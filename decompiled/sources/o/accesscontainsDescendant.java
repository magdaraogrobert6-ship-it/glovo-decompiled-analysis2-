package o;

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes2.dex */
public final class accesscontainsDescendant extends CompositionLocalsKtLocalHapticFeedback1 implements containsDescendant {
    public final void RemoteActionCompatParcelizer(double d) {
        RemoteActionCompatParcelizer();
        ((Value) this.RemoteActionCompatParcelizer).setDoubleValue(d);
    }

    public final void RemoteActionCompatParcelizer(String str) {
        RemoteActionCompatParcelizer();
        ((Value) this.RemoteActionCompatParcelizer).setReferenceValue(str);
    }

    public final void RemoteActionCompatParcelizer(getAction getaction) {
        RemoteActionCompatParcelizer();
        ((Value) this.RemoteActionCompatParcelizer).setMapValue((MapValue) getaction.serializer());
    }

    public final void read(String str) {
        RemoteActionCompatParcelizer();
        ((Value) this.RemoteActionCompatParcelizer).setStringValue(str);
    }

    public final void serializer(performActionHelper performactionhelper) {
        RemoteActionCompatParcelizer();
        ((Value) this.RemoteActionCompatParcelizer).setArrayValue((ArrayValue) performactionhelper.serializer());
    }

    public accesscontainsDescendant(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
