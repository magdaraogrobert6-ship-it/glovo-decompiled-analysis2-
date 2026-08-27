package o;

import com.google.firestore.v1.ArrayValue;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class performActionHelper extends CompositionLocalsKtLocalHapticFeedback1 implements legacyScrollOntoScreenscrollDelta {
    @Override // o.legacyScrollOntoScreenscrollDelta
    public final List getValuesList() {
        return Collections.unmodifiableList(((ArrayValue) this.RemoteActionCompatParcelizer).getValuesList());
    }

    public performActionHelper(GeneratedMessageLite generatedMessageLite) {
        super(generatedMessageLite);
    }
}
