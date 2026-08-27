package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getSubcompositionsStateui implements getDoubleTapTimeoutMillis {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public static final getSubcompositionsStateui serializer = new getSubcompositionsStateui(0);
    public static final getSubcompositionsStateui read = new getSubcompositionsStateui(1);
    public static final getSubcompositionsStateui write = new getSubcompositionsStateui(2);
    public static final getSubcompositionsStateui IconCompatParcelizer = new getSubcompositionsStateui(3);

    public /* synthetic */ getSubcompositionsStateui(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.getDoubleTapTimeoutMillis
    public final boolean read(int i) {
        int i2 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            return getOwnerui.forNumber(i) != null;
        }
        if (i2 == 1) {
            return invalidateSemanticsui.forNumber(i) != null;
        }
        if (i2 != 2) {
            return requestRemeasureui.forNumber(i) != null;
        }
        return isSemanticsInvalidatedui.forNumber(i) != null;
    }
}
