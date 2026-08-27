package o;

/* JADX INFO: loaded from: classes.dex */
public final class ShadowGraphicsLayerElement extends component50d7_KjU {
    @Override // o.component50d7_KjU
    public final boolean MediaDescriptionCompat() {
        return false;
    }

    @Override // o.releaseGraphicsLayers
    public final void IconCompatParcelizer(releaseGraphicsLayers releasegraphicslayers) {
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        if (releasegraphicslayer.MediaDescriptionCompat && !releasegraphicslayer.MediaBrowserCompatMediaItem) {
            releasegraphicslayer.IconCompatParcelizer((int) ((((releaseGraphicsLayer) releasegraphicslayer.MediaMetadataCompat.get(0)).PlaybackStateCompat * ((setSizeToIntrinsics) this.MediaSessionCompatResultReceiverWrapper).RemoteActionCompatParcelizer) + 0.5f));
        }
    }

    public final void serializer(releaseGraphicsLayer releasegraphicslayer) {
        releaseGraphicsLayer releasegraphicslayer2 = this.PlaybackStateCompatCustomAction;
        releasegraphicslayer2.RemoteActionCompatParcelizer.add(releasegraphicslayer);
        releasegraphicslayer.MediaMetadataCompat.add(releasegraphicslayer2);
    }

    @Override // o.component50d7_KjU
    public final void write() {
        this.PlaybackStateCompatCustomAction.read();
    }

    public ShadowGraphicsLayerElement(setSizeToIntrinsics setsizetointrinsics) {
        super(setsizetointrinsics);
        setsizetointrinsics.getOnBackPressedInput.write();
        setsizetointrinsics.onCreatePanelMenu.write();
        this.ParcelableVolumeInfo = setsizetointrinsics.read;
    }

    @Override // o.component50d7_KjU
    public final void RemoteActionCompatParcelizer() {
        setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
        setSizeToIntrinsics setsizetointrinsics = (setSizeToIntrinsics) setalignment;
        int i = setsizetointrinsics.write;
        int i2 = setsizetointrinsics.serializer;
        int i3 = setsizetointrinsics.read;
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        if (i3 == 1) {
            if (i != -1) {
                releasegraphicslayer.MediaMetadataCompat.add(setalignment.getViewModelStore.getOnBackPressedInput.PlaybackStateCompatCustomAction);
                this.MediaSessionCompatResultReceiverWrapper.getViewModelStore.getOnBackPressedInput.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer.add(releasegraphicslayer);
                releasegraphicslayer.write = i;
            } else if (i2 != -1) {
                releasegraphicslayer.MediaMetadataCompat.add(setalignment.getViewModelStore.getOnBackPressedInput.RemoteActionCompatParcelizer);
                this.MediaSessionCompatResultReceiverWrapper.getViewModelStore.getOnBackPressedInput.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.add(releasegraphicslayer);
                releasegraphicslayer.write = -i2;
            } else {
                releasegraphicslayer.IconCompatParcelizer = true;
                releasegraphicslayer.MediaMetadataCompat.add(setalignment.getViewModelStore.getOnBackPressedInput.RemoteActionCompatParcelizer);
                this.MediaSessionCompatResultReceiverWrapper.getViewModelStore.getOnBackPressedInput.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.add(releasegraphicslayer);
            }
            serializer(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.PlaybackStateCompatCustomAction);
            serializer(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.RemoteActionCompatParcelizer);
            return;
        }
        if (i != -1) {
            releasegraphicslayer.MediaMetadataCompat.add(setalignment.getViewModelStore.onCreatePanelMenu.PlaybackStateCompatCustomAction);
            this.MediaSessionCompatResultReceiverWrapper.getViewModelStore.onCreatePanelMenu.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer.add(releasegraphicslayer);
            releasegraphicslayer.write = i;
        } else if (i2 != -1) {
            releasegraphicslayer.MediaMetadataCompat.add(setalignment.getViewModelStore.onCreatePanelMenu.RemoteActionCompatParcelizer);
            this.MediaSessionCompatResultReceiverWrapper.getViewModelStore.onCreatePanelMenu.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.add(releasegraphicslayer);
            releasegraphicslayer.write = -i2;
        } else {
            releasegraphicslayer.IconCompatParcelizer = true;
            releasegraphicslayer.MediaMetadataCompat.add(setalignment.getViewModelStore.onCreatePanelMenu.RemoteActionCompatParcelizer);
            this.MediaSessionCompatResultReceiverWrapper.getViewModelStore.onCreatePanelMenu.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.add(releasegraphicslayer);
        }
        serializer(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.PlaybackStateCompatCustomAction);
        serializer(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.RemoteActionCompatParcelizer);
    }

    @Override // o.component50d7_KjU
    public final void serializer() {
        setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
        int i = ((setSizeToIntrinsics) setalignment).read;
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        if (i == 1) {
            setalignment.onPictureInPictureModeChanged = releasegraphicslayer.PlaybackStateCompat;
        } else {
            setalignment.onRetainNonConfigurationInstance = releasegraphicslayer.PlaybackStateCompat;
        }
    }
}
