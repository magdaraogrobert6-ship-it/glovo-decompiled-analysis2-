package o;

import com.google.firestore.v1.StructuredQuery;

/* JADX INFO: loaded from: classes2.dex */
public final class setTraversalValues implements dataAvailable {
    @Override // o.dataAvailable
    public final ifDebug IconCompatParcelizer(int i) {
        return StructuredQuery.FieldFilter.read.forNumber(i);
    }
}
