package o;

import com.google.firebase.Timestamp;
import com.google.firestore.v1.Value;

/* JADX INFO: loaded from: classes2.dex */
public interface NodeKindKt {
    Value RemoteActionCompatParcelizer(Value value, Value value2);

    Value write(Value value, Timestamp timestamp);
}
