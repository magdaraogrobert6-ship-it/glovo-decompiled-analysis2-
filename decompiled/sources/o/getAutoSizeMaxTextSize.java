package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getAutoSizeMaxTextSize implements Runnable {
    public final /* synthetic */ androidx.appcompat.widget.Toolbar IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getAutoSizeMaxTextSize(androidx.appcompat.widget.Toolbar toolbar, int i) {
        this.read = i;
        this.IconCompatParcelizer = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        androidx.appcompat.widget.Toolbar toolbar = this.IconCompatParcelizer;
        if (i != 0) {
            toolbar.MediaDescriptionCompat();
            return;
        }
        setAllCaps setallcaps = toolbar.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        Keep keep = setallcaps == null ? null : setallcaps.IconCompatParcelizer;
        if (keep != null) {
            keep.collapseActionView();
        }
    }
}
