package o;

import com.google.firestore.admin.v1.Index;

/* JADX INFO: loaded from: classes4.dex */
public final class createOutline12SF9DM implements decodeByte {
    public static final createOutline12SF9DM IconCompatParcelizer = new createOutline12SF9DM();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return Index.serializer.forNumber(i) != null;
    }
}
