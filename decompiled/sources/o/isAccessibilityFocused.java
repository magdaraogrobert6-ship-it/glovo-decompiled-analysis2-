package o;

import com.google.firestore.bundle.BundledQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class isAccessibilityFocused implements decodeByte {
    public static final isAccessibilityFocused IconCompatParcelizer = new isAccessibilityFocused();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return BundledQuery.write.forNumber(i) != null;
    }
}
