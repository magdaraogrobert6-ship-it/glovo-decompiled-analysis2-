package o;

import com.google.api.LabelDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class recalculateQueryOwner implements decodeByte {
    public static final recalculateQueryOwner serializer = new recalculateQueryOwner();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return LabelDescriptor.write.forNumber(i) != null;
    }
}
