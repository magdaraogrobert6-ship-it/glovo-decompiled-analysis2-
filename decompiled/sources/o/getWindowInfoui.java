package o;

import com.google.protobuf.DescriptorProtos$FieldOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class getWindowInfoui implements decodeByte {
    public static final getWindowInfoui IconCompatParcelizer = new getWindowInfoui();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return DescriptorProtos$FieldOptions.RemoteActionCompatParcelizer.forNumber(i) != null;
    }
}
