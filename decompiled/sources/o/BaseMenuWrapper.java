package o;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseMenuWrapper extends setShowingForActionMode {
    public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner read;
    public final /* synthetic */ getInflater write;

    @Override // o.setShowingForActionMode
    public final invalidateOptionsMenu IconCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMenuWrapper(androidx.appcompat.widget.AppCompatSpinner appCompatSpinner, androidx.appcompat.widget.AppCompatSpinner appCompatSpinner2, getInflater getinflater) {
        super(appCompatSpinner2);
        this.read = appCompatSpinner;
        this.write = getinflater;
    }

    @Override // o.setShowingForActionMode
    public final boolean write() {
        androidx.appcompat.widget.AppCompatSpinner appCompatSpinner = this.read;
        if (appCompatSpinner.getInternalPopup().serializer()) {
            return true;
        }
        appCompatSpinner.serializer.write(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
        return true;
    }
}
