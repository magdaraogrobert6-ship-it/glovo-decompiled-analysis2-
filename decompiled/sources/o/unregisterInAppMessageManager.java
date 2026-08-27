package o;

/* JADX INFO: loaded from: classes4.dex */
public final class unregisterInAppMessageManager implements BrazeInAppMessageManagerhideCurrentlyDisplayingInAppMessage1 {
    public static final unregisterInAppMessageManager IconCompatParcelizer = new unregisterInAppMessageManager(1);
    public final /* synthetic */ int write;

    public /* synthetic */ unregisterInAppMessageManager(int i) {
        this.write = i;
    }

    public String toString() {
        if (this.write != 1) {
            return super.toString();
        }
        int i = BrazeInAppMessageManagerWhenMappings.IconCompatParcelizer;
        return "TimeSource(System.nanoTime())";
    }

    @Override // o.BrazeInAppMessageManagerhideCurrentlyDisplayingInAppMessage1
    public DefaultInAppMessageViewWrapper IconCompatParcelizer() {
        return new DefaultInAppMessageViewWrapper(BrazeInAppMessageManagerWhenMappings.write());
    }
}
