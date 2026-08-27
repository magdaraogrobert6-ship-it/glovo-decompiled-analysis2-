package o;

import com.google.protobuf.DescriptorProtos$MethodOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class findViewTreeComposeViewContext implements decodeByte {
    public static final findViewTreeComposeViewContext serializer = new findViewTreeComposeViewContext();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return DescriptorProtos$MethodOptions.IconCompatParcelizer.forNumber(i) != null;
    }
}
