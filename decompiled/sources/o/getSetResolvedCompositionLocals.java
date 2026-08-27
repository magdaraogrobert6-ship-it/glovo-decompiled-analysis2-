package o;

import com.google.api.ResourceDescriptor;

/* JADX INFO: loaded from: classes4.dex */
public final class getSetResolvedCompositionLocals implements decodeByte {
    public static final getSetResolvedCompositionLocals write = new getSetResolvedCompositionLocals();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return ResourceDescriptor.serializer.forNumber(i) != null;
    }
}
