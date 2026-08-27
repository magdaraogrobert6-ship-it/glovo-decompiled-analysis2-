package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class component1D9Ej5fM extends component50d7_KjU {
    public component1D9Ej5fM(setAlignment setalignment) {
        super(setalignment);
    }

    @Override // o.component50d7_KjU
    public final boolean MediaDescriptionCompat() {
        return false;
    }

    @Override // o.component50d7_KjU
    public final void write() {
        this.MediaSessionCompatQueueItem = null;
        this.PlaybackStateCompatCustomAction.read();
    }

    @Override // o.releaseGraphicsLayers
    public final void IconCompatParcelizer(releaseGraphicsLayers releasegraphicslayers) {
        PainterModifierKt painterModifierKt = (PainterModifierKt) this.MediaSessionCompatResultReceiverWrapper;
        int i = painterModifierKt.write;
        releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
        Iterator it = releasegraphicslayer.MediaMetadataCompat.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((releaseGraphicsLayer) it.next()).PlaybackStateCompat;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            releasegraphicslayer.IconCompatParcelizer(i3 + painterModifierKt.IconCompatParcelizer);
        } else {
            releasegraphicslayer.IconCompatParcelizer(i2 + painterModifierKt.IconCompatParcelizer);
        }
    }

    @Override // o.component50d7_KjU
    public final void RemoteActionCompatParcelizer() {
        setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
        if (setalignment instanceof PainterModifierKt) {
            releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
            releasegraphicslayer.IconCompatParcelizer = true;
            ArrayList arrayList = releasegraphicslayer.MediaMetadataCompat;
            PainterModifierKt painterModifierKt = (PainterModifierKt) setalignment;
            int i = painterModifierKt.write;
            boolean z = painterModifierKt.RemoteActionCompatParcelizer;
            int i2 = 0;
            if (i == 0) {
                releasegraphicslayer.RatingCompat = setGraphicsContext.LEFT;
                while (i2 < painterModifierKt.removeOnMultiWindowModeChangedListener) {
                    setAlignment setalignment2 = painterModifierKt.removeOnContextAvailableListener[i2];
                    if (z || setalignment2.onMultiWindowModeChanged != 8) {
                        releaseGraphicsLayer releasegraphicslayer2 = setalignment2.getOnBackPressedInput.PlaybackStateCompatCustomAction;
                        releasegraphicslayer2.RemoteActionCompatParcelizer.add(releasegraphicslayer);
                        arrayList.add(releasegraphicslayer2);
                    }
                    i2++;
                }
                RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.PlaybackStateCompatCustomAction);
                RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.RemoteActionCompatParcelizer);
                return;
            }
            if (i == 1) {
                releasegraphicslayer.RatingCompat = setGraphicsContext.RIGHT;
                while (i2 < painterModifierKt.removeOnMultiWindowModeChangedListener) {
                    setAlignment setalignment3 = painterModifierKt.removeOnContextAvailableListener[i2];
                    if (z || setalignment3.onMultiWindowModeChanged != 8) {
                        releaseGraphicsLayer releasegraphicslayer3 = setalignment3.getOnBackPressedInput.RemoteActionCompatParcelizer;
                        releasegraphicslayer3.RemoteActionCompatParcelizer.add(releasegraphicslayer);
                        arrayList.add(releasegraphicslayer3);
                    }
                    i2++;
                }
                RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.PlaybackStateCompatCustomAction);
                RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.getOnBackPressedInput.RemoteActionCompatParcelizer);
                return;
            }
            if (i == 2) {
                releasegraphicslayer.RatingCompat = setGraphicsContext.TOP;
                while (i2 < painterModifierKt.removeOnMultiWindowModeChangedListener) {
                    setAlignment setalignment4 = painterModifierKt.removeOnContextAvailableListener[i2];
                    if (z || setalignment4.onMultiWindowModeChanged != 8) {
                        releaseGraphicsLayer releasegraphicslayer4 = setalignment4.onCreatePanelMenu.PlaybackStateCompatCustomAction;
                        releasegraphicslayer4.RemoteActionCompatParcelizer.add(releasegraphicslayer);
                        arrayList.add(releasegraphicslayer4);
                    }
                    i2++;
                }
                RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.PlaybackStateCompatCustomAction);
                RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.RemoteActionCompatParcelizer);
                return;
            }
            if (i != 3) {
                return;
            }
            releasegraphicslayer.RatingCompat = setGraphicsContext.BOTTOM;
            while (i2 < painterModifierKt.removeOnMultiWindowModeChangedListener) {
                setAlignment setalignment5 = painterModifierKt.removeOnContextAvailableListener[i2];
                if (z || setalignment5.onMultiWindowModeChanged != 8) {
                    releaseGraphicsLayer releasegraphicslayer5 = setalignment5.onCreatePanelMenu.RemoteActionCompatParcelizer;
                    releasegraphicslayer5.RemoteActionCompatParcelizer.add(releasegraphicslayer);
                    arrayList.add(releasegraphicslayer5);
                }
                i2++;
            }
            RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.PlaybackStateCompatCustomAction);
            RemoteActionCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper.onCreatePanelMenu.RemoteActionCompatParcelizer);
        }
    }

    public final void RemoteActionCompatParcelizer(releaseGraphicsLayer releasegraphicslayer) {
        releaseGraphicsLayer releasegraphicslayer2 = this.PlaybackStateCompatCustomAction;
        releasegraphicslayer2.RemoteActionCompatParcelizer.add(releasegraphicslayer);
        releasegraphicslayer.MediaMetadataCompat.add(releasegraphicslayer2);
    }

    @Override // o.component50d7_KjU
    public final void serializer() {
        setAlignment setalignment = this.MediaSessionCompatResultReceiverWrapper;
        if (setalignment instanceof PainterModifierKt) {
            int i = ((PainterModifierKt) setalignment).write;
            releaseGraphicsLayer releasegraphicslayer = this.PlaybackStateCompatCustomAction;
            if (i == 0 || i == 1) {
                setalignment.onPictureInPictureModeChanged = releasegraphicslayer.PlaybackStateCompat;
            } else {
                setalignment.onRetainNonConfigurationInstance = releasegraphicslayer.PlaybackStateCompat;
            }
        }
    }
}
