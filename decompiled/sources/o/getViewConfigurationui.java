package o;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;

/* JADX INFO: loaded from: classes4.dex */
public final class getViewConfigurationui implements decodeByte {
    public static final getViewConfigurationui serializer = new getViewConfigurationui();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return DescriptorProtos$FieldDescriptorProto.IconCompatParcelizer.forNumber(i) != null;
    }
}
