package o;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes.dex */
public final class getBlendMode0nO6VwU extends updateDensity {
    public final updateDensity ParcelableVolumeInfo;
    public boolean PlaybackStateCompatCustomAction;

    @Override // o.updateDensity
    public final TuplesKt write() {
        updateDensity updatedensity = this.ParcelableVolumeInfo;
        if (updatedensity.serializer || updatedensity.MediaSessionCompatToken) {
            return new getSpread(this);
        }
        relocationOffsetfbGrOKE relocationoffsetfbgroke = this.read;
        long j = this.ResultReceiver;
        HashMap mapWrite = relocationoffsetfbgroke != null ? getOffsetF1C5BW0.write(updatedensity.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), this, this.ParcelableVolumeInfo.ResultReceiver()) : null;
        Object obj = getOffsetF1C5BW0.MediaDescriptionCompat;
        synchronized (obj) {
            getOffsetF1C5BW0.read(this);
            if (relocationoffsetfbgroke == null || relocationoffsetfbgroke.write == 0) {
                MediaSessionCompatResultReceiverWrapper();
            } else {
                TuplesKt tuplesKtWrite = write(this.ParcelableVolumeInfo.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), relocationoffsetfbgroke, mapWrite, this.ParcelableVolumeInfo.ResultReceiver());
                if (!tuplesKtWrite.equals(getDensity.write)) {
                    return tuplesKtWrite;
                }
                relocationOffsetfbGrOKE relocationoffsetfbgrokeMediaDescriptionCompat = this.ParcelableVolumeInfo.MediaDescriptionCompat();
                if (relocationoffsetfbgrokeMediaDescriptionCompat != null) {
                    relocationoffsetfbgrokeMediaDescriptionCompat.serializer((awaitTouchSlopOrCancellationjO51t88) relocationoffsetfbgroke);
                } else {
                    this.ParcelableVolumeInfo.write(relocationoffsetfbgroke);
                    this.read = null;
                }
            }
            if (removeNodeAtDepth.read(this.ParcelableVolumeInfo.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(), j) < 0) {
                this.ParcelableVolumeInfo.MediaMetadataCompat();
            }
            updateDensity updatedensity2 = this.ParcelableVolumeInfo;
            updatedensity2.read(updatedensity2.ResultReceiver().read(j).read(this.RemoteActionCompatParcelizer));
            this.ParcelableVolumeInfo.read(j);
            updateDensity updatedensity3 = this.ParcelableVolumeInfo;
            int i = this.MediaSessionCompatResultReceiverWrapper;
            this.MediaSessionCompatResultReceiverWrapper = -1;
            if (i >= 0) {
                int[] iArr = updatedensity3.MediaMetadataCompat;
                iArr.getClass();
                int length = iArr.length;
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = i;
                updatedensity3.MediaMetadataCompat = iArrCopyOf;
            } else {
                updatedensity3.getClass();
            }
            updateDensity updatedensity4 = this.ParcelableVolumeInfo;
            getFontScale getfontscale = this.RemoteActionCompatParcelizer;
            updatedensity4.getClass();
            synchronized (obj) {
                updatedensity4.RemoteActionCompatParcelizer = updatedensity4.RemoteActionCompatParcelizer.serializer(getfontscale);
                updateDensity updatedensity5 = this.ParcelableVolumeInfo;
                int[] iArr2 = this.MediaMetadataCompat;
                updatedensity5.getClass();
                if (iArr2.length != 0) {
                    int[] iArr3 = updatedensity5.MediaMetadataCompat;
                    if (iArr3.length != 0) {
                        iArr2 = onContentCardClicked.read(iArr3, iArr2);
                    }
                    updatedensity5.MediaMetadataCompat = iArr2;
                }
            }
            this.serializer = true;
            if (!this.PlaybackStateCompatCustomAction) {
                this.PlaybackStateCompatCustomAction = true;
                this.ParcelableVolumeInfo.RemoteActionCompatParcelizer();
            }
            return getDensity.write;
        }
    }

    public getBlendMode0nO6VwU(long j, getFontScale getfontscale, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, updateDensity updatedensity) {
        super(j, getfontscale, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
        this.ParcelableVolumeInfo = updatedensity;
        updatedensity.IconCompatParcelizer();
    }

    @Override // o.updateDensity, o.getBrush
    public final void serializer() {
        if (this.MediaSessionCompatToken) {
            return;
        }
        super.serializer();
        if (this.PlaybackStateCompatCustomAction) {
            return;
        }
        this.PlaybackStateCompatCustomAction = true;
        this.ParcelableVolumeInfo.RemoteActionCompatParcelizer();
    }
}
