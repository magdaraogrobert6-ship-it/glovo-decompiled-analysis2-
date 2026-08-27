package o;

import com.google.protobuf.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class getLocalWindowInfo implements decodeByte {
    public static final getLocalWindowInfo write = new getLocalWindowInfo();

    @Override // o.decodeByte
    public final boolean write(int i) {
        return Field.RemoteActionCompatParcelizer.forNumber(i) != null;
    }
}
