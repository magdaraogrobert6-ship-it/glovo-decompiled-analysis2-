package o;

/* JADX INFO: loaded from: classes.dex */
public final class getNaNslo4al4 extends Float16Companion {
    public final /* synthetic */ int IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getNaNslo4al4(String str, String str2, int i) {
        super(str, str2, 2);
        this.IconCompatParcelizer = i;
    }

    @Override // o.toRawBitsimpl
    public final boolean RemoteActionCompatParcelizer() {
        if (this.IconCompatParcelizer != 0) {
            if (toLongimpl.write("MULTI_PROFILE")) {
                return super.RemoteActionCompatParcelizer();
            }
            return false;
        }
        if (!super.RemoteActionCompatParcelizer() || !toLongimpl.write("MULTI_PROCESS")) {
            return false;
        }
        int i = toShortimpl.IconCompatParcelizer;
        if (getNegativeInfinityslo4al4.read.RemoteActionCompatParcelizer()) {
            return getNegativeZeroslo4al4.IconCompatParcelizer.k_().isMultiProcessEnabled();
        }
        throw getNegativeInfinityslo4al4.RemoteActionCompatParcelizer();
    }
}
