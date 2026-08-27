package o;

import com.google.protobuf.DescriptorProtos$FieldOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class incrementViewCountui implements decodeByte {
    public static final incrementViewCountui read = new incrementViewCountui();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return DescriptorProtos$FieldOptions.serializer.forNumber(i) != null;
    }
}
