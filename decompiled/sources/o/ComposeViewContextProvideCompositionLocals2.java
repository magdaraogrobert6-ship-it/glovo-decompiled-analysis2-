package o;

import com.google.protobuf.DescriptorProtos$FileOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class ComposeViewContextProvideCompositionLocals2 implements decodeByte {
    public static final ComposeViewContextProvideCompositionLocals2 serializer = new ComposeViewContextProvideCompositionLocals2();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return DescriptorProtos$FileOptions.read.forNumber(i) != null;
    }
}
