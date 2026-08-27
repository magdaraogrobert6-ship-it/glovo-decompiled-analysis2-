package o;

/* JADX INFO: loaded from: classes.dex */
public final class removeDependencies implements SemanticsInfo {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ removeDependencies(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // o.SemanticsInfo
    public final Object init(ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i != 0) {
            return createfromparcel;
        }
        onDependencyAdded.IconCompatParcelizer().serializeNulls();
        return createfromparcel;
    }
}
