package o;

import com.google.firestore.v1.StructuredQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class getInfoStateDescriptionOrNull implements decodeByte {
    public static final getInfoStateDescriptionOrNull write = new getInfoStateDescriptionOrNull();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return StructuredQuery.IconCompatParcelizer.forNumber(i) != null;
    }
}
