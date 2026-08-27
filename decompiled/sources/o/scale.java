package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class scale extends setPainter {
    public int setContentView = 0;
    public int reportFullyDrawn = 0;
    public int startActivityForResult = 0;
    public int setPictureInPictureParams = 0;
    public int getLifecycleRegistry1 = 0;
    public int startIntentSenderForResult = 0;
    public boolean removeOnUserLeaveHintListener = false;
    public int removeOnPictureInPictureModeChangedListener = 0;
    public int removeOnPictureInPictureUiStateChangedListener = 0;
    public final RotateKt removeOnTrimMemoryListener = new RotateKt();
    public rotate removeOnNewIntentListener = null;

    public abstract void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4);

    @Override // o.setPainter
    public final void r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        for (int i = 0; i < this.removeOnMultiWindowModeChangedListener; i++) {
            setAlignment setalignment = this.removeOnContextAvailableListener[i];
            if (setalignment != null) {
                setalignment.onBackPressedDispatcher_delegatelambda0 = true;
            }
        }
    }

    public final void write(setAlignment setalignment, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk, int i, hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2, int i2) {
        rotate rotateVar;
        getUseIntrinsicSize getuseintrinsicsize;
        while (true) {
            rotateVar = this.removeOnNewIntentListener;
            if (rotateVar != null || (getuseintrinsicsize = this.getViewModelStore) == null) {
                break;
            } else {
                this.removeOnNewIntentListener = getuseintrinsicsize.MediaSessionCompatResultReceiverWrapper;
            }
        }
        RotateKt rotateKt = this.removeOnTrimMemoryListener;
        rotateKt.read = hasspecifiedandfiniteheightuvyycjk;
        rotateKt.MediaBrowserCompatMediaItem = hasspecifiedandfiniteheightuvyycjk2;
        rotateKt.IconCompatParcelizer = i;
        rotateKt.MediaMetadataCompat = i2;
        rotateVar.measure(setalignment, rotateKt);
        setalignment.MediaSessionCompatQueueItem(rotateKt.RatingCompat);
        setalignment.MediaMetadataCompat(rotateKt.MediaDescriptionCompat);
        setalignment.addObserverForBackInvokerlambda0 = rotateKt.write;
        setalignment.RatingCompat(rotateKt.serializer);
    }
}
