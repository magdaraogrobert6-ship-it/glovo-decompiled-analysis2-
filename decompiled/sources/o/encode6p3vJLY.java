package o;

/* JADX INFO: loaded from: classes4.dex */
public final class encode6p3vJLY implements decodeByte {
    public static final encode6p3vJLY IconCompatParcelizer = new encode6p3vJLY(1);
    public static final encode6p3vJLY serializer = new encode6p3vJLY(0);
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ encode6p3vJLY(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.decodeByte
    public final boolean write(int i) {
        if (this.RemoteActionCompatParcelizer != 0) {
            return component21.forNumber(i) != null;
        }
        return encode.forNumber(i) != null;
    }
}
