package o;

import com.google.firestore.admin.v1.Index;

/* JADX INFO: loaded from: classes4.dex */
public final class createEvent implements decodeByte {
    public static final createEvent write = new createEvent();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return Index.IndexField.serializer.forNumber(i) != null;
    }
}
