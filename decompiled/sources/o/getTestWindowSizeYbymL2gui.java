package o;

import com.google.protobuf.DescriptorProtos$FieldDescriptorProto;

/* JADX INFO: loaded from: classes4.dex */
public final class getTestWindowSizeYbymL2gui implements decodeByte {
    public static final getTestWindowSizeYbymL2gui RemoteActionCompatParcelizer = new getTestWindowSizeYbymL2gui();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return DescriptorProtos$FieldDescriptorProto.read.forNumber(i) != null;
    }
}
