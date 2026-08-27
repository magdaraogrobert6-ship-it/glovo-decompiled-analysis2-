package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ScreenFlashView2 implements Runnable {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ScreenFlashView2(int i, int i2, com.braze.ui.contentcards.adapters.ContentCardAdapter contentCardAdapter) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
        this.read = contentCardAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.IconCompatParcelizer;
        Object obj = this.read;
        int i2 = this.serializer;
        int i3 = this.RemoteActionCompatParcelizer;
        if (i != 0) {
            com.braze.ui.contentcards.adapters.ContentCardAdapter.markOnScreenCardsAsRead$lambda$2(i3, i2, (com.braze.ui.contentcards.adapters.ContentCardAdapter) obj);
            return;
        }
        setBrightness setbrightness = (setBrightness) obj;
        if (setbrightness.MediaDescriptionCompat != i3) {
            setbrightness.MediaDescriptionCompat = i3;
            z = true;
        } else {
            z = false;
        }
        if (setbrightness.ParcelableVolumeInfo != i2) {
            setbrightness.ParcelableVolumeInfo = i2;
        } else if (!z) {
            return;
        }
        setbrightness.RemoteActionCompatParcelizer();
    }

    public /* synthetic */ ScreenFlashView2(setBrightness setbrightness, int i, int i2) {
        this.read = setbrightness;
        this.RemoteActionCompatParcelizer = i;
        this.serializer = i2;
    }
}
