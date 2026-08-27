package o;

/* JADX INFO: loaded from: classes2.dex */
public final class notifyLayerIsDirtyui implements decodeByte {
    public final /* synthetic */ int write;
    public static final notifyLayerIsDirtyui serializer = new notifyLayerIsDirtyui(1);
    public static final notifyLayerIsDirtyui RemoteActionCompatParcelizer = new notifyLayerIsDirtyui(0);

    public /* synthetic */ notifyLayerIsDirtyui(int i) {
        this.write = i;
    }

    @Override // o.decodeByte
    public final boolean write(int i) {
        if (this.write != 0) {
            return EnumC0151autofill.forNumber(i) != null;
        }
        return get_autofillManagerui.forNumber(i) != null;
    }
}
