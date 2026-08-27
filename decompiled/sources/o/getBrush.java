package o;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes.dex */
public abstract class getBrush {
    public int MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public getFontScale PlaybackStateCompat;
    public long ResultReceiver;

    public abstract void IconCompatParcelizer();

    public abstract void IconCompatParcelizer(blur1fqSgw blur1fqsgw);

    public abstract r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaSessionCompatQueueItem();

    public void MediaSessionCompatToken() {
        ComponentActivity();
    }

    public abstract r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM ParcelableVolumeInfo();

    public abstract boolean PlaybackStateCompat();

    public int PlaybackStateCompatCustomAction() {
        return 0;
    }

    public abstract void RemoteActionCompatParcelizer();

    public getFontScale ResultReceiver() {
        return this.PlaybackStateCompat;
    }

    public long r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return this.ResultReceiver;
    }

    public abstract getBrush read(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    public abstract void read();

    public void read(getFontScale getfontscale) {
        this.PlaybackStateCompat = getfontscale;
    }

    public abstract void serializer();

    public void serializer(long j) {
        this.ResultReceiver = j;
    }

    public static void write(getBrush getbrush) {
        getOffsetF1C5BW0.ParcelableVolumeInfo.read(getbrush);
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
            RatingCompat();
            MediaSessionCompatToken();
        }
    }

    public void RatingCompat() {
        getOffsetF1C5BW0.MediaBrowserCompatMediaItem = getOffsetF1C5BW0.MediaBrowserCompatMediaItem.read(r8lambda54BeH8ZsBru0CXI2CCSP2syNys());
    }

    public final getBrush r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        androidx.emoji2.text.EmojiProcessor emojiProcessor = getOffsetF1C5BW0.ParcelableVolumeInfo;
        getBrush getbrush = (getBrush) emojiProcessor.RemoteActionCompatParcelizer();
        emojiProcessor.read(this);
        return getbrush;
    }

    public getBrush(long j, getFontScale getfontscale) {
        int i;
        int iNumberOfTrailingZeros;
        this.PlaybackStateCompat = getfontscale;
        this.ResultReceiver = j;
        SaversKt$$ExternalSyntheticLambda2 saversKt$$ExternalSyntheticLambda2 = getOffsetF1C5BW0.RemoteActionCompatParcelizer;
        if (j != 0) {
            getFontScale getfontscaleResultReceiver = ResultReceiver();
            long j2 = getfontscaleResultReceiver.read;
            long[] jArr = getfontscaleResultReceiver.serializer;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = getfontscaleResultReceiver.write;
                if (j3 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = getfontscaleResultReceiver.RemoteActionCompatParcelizer;
                    if (j4 != 0) {
                        j2 += 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = ((long) iNumberOfTrailingZeros) + j2;
            }
            synchronized (getOffsetF1C5BW0.MediaDescriptionCompat) {
                i = getOffsetF1C5BW0.MediaMetadataCompat.read(j);
            }
        } else {
            i = -1;
        }
        this.MediaSessionCompatResultReceiverWrapper = i;
    }

    public final void ComponentActivity() {
        int i = this.MediaSessionCompatResultReceiverWrapper;
        if (i >= 0) {
            getOffsetF1C5BW0.serializer(i);
            this.MediaSessionCompatResultReceiverWrapper = -1;
        }
    }

    public void serializer(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }
}
