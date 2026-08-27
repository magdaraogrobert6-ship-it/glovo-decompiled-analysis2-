package o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class holdsCameraSlot implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.navigation.NavArgsLazy read;

    public /* synthetic */ holdsCameraSlot(androidx.navigation.NavArgsLazy navArgsLazy, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = navArgsLazy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.RemoteActionCompatParcelizer;
        androidx.navigation.NavArgsLazy navArgsLazy = this.read;
        if (i != 0) {
            if (((AbstractClickableNodehandlePressInteractionRelease11) navArgsLazy.RatingCompat) == null) {
                navArgsLazy.RatingCompat = new AbstractClickableNodehandlePressInteractionRelease11(1, navArgsLazy);
            }
            ((AndroidGraphicsContext2) navArgsLazy.MediaSessionCompatQueueItem).read((AbstractClickableNodehandlePressInteractionRelease11) navArgsLazy.RatingCompat);
        } else {
            AbstractClickableNodehandlePressInteractionRelease11 abstractClickableNodehandlePressInteractionRelease11 = (AbstractClickableNodehandlePressInteractionRelease11) navArgsLazy.RatingCompat;
            if (abstractClickableNodehandlePressInteractionRelease11 != null) {
                ((AndroidGraphicsContext2) navArgsLazy.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer((unregisterComponentCallback) abstractClickableNodehandlePressInteractionRelease11);
            }
        }
    }
}
