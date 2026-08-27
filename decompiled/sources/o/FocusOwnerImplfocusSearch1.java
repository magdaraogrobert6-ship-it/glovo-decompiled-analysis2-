package o;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImplfocusSearch1 extends FocusOwnerImplWhenMappings {
    public final Object read;

    @Override // o.FocusOwnerImplWhenMappings, o.setRootFocusNodeui
    public final Object write() {
        Object objWrite;
        synchronized (this.read) {
            objWrite = super.write();
        }
        return objWrite;
    }

    @Override // o.FocusOwnerImplWhenMappings, o.setRootFocusNodeui
    public final boolean IconCompatParcelizer(Object obj) {
        boolean zIconCompatParcelizer;
        obj.getClass();
        synchronized (this.read) {
            zIconCompatParcelizer = super.IconCompatParcelizer(obj);
        }
        return zIconCompatParcelizer;
    }

    public FocusOwnerImplfocusSearch1(int i) {
        super(i);
        this.read = new Object();
    }
}
