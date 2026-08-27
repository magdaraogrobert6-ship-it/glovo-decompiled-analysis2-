package o;

import com.google.firestore.v1.StructuredQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class getInfoText implements decodeByte {
    public static final getInfoText IconCompatParcelizer = new getInfoText();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return StructuredQuery.CompositeFilter.read.forNumber(i) != null;
    }
}
