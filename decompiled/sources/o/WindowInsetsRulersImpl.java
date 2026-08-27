package o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WindowInsetsRulersImpl implements Runnable {
    public final ParentDataModifierDefaultImpls read;

    public abstract void RemoteActionCompatParcelizer();

    public WindowInsetsRulersImpl() {
        this.read = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            RemoteActionCompatParcelizer();
        } catch (Exception e) {
            ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = this.read;
            if (parentDataModifierDefaultImpls != null) {
                parentDataModifierDefaultImpls.IconCompatParcelizer(e);
            }
        }
    }

    public WindowInsetsRulersImpl(ParentDataModifierDefaultImpls parentDataModifierDefaultImpls) {
        this.read = parentDataModifierDefaultImpls;
    }
}
