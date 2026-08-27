package o;

import android.media.MediaCodecInfo;
import android.util.Range;
import io.socket.emitter.Emitter;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionKtrememberTransitionlambda10inlinedonDispose1 extends Emitter implements setInitialAnimationsanimation_core {
    public static final updateInitialValuesanimation_core write = new updateInitialValuesanimation_core();
    public final MediaCodecInfo.VideoCapabilities read;

    @Override // o.setInitialAnimationsanimation_core
    public final boolean IconCompatParcelizer() {
        return true;
    }

    @Override // o.setInitialAnimationsanimation_core
    public final int MediaSessionCompatQueueItem() {
        return this.read.getWidthAlignment();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final int RemoteActionCompatParcelizer() {
        return this.read.getHeightAlignment();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range RemoteActionCompatParcelizer(int i) {
        try {
            return this.read.getSupportedWidthsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range read() {
        return this.read.getSupportedHeights();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range read(int i) {
        try {
            return this.read.getSupportedHeightsFor(i);
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException(th);
        }
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range serializer() {
        return this.read.getBitrateRange();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final boolean serializer(int i, int i2) {
        return this.read.isSizeSupported(i, i2);
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range write() {
        return this.read.getSupportedWidths();
    }

    public TransitionKtrememberTransitionlambda10inlinedonDispose1(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = ((MediaCodecInfo.CodecCapabilities) this.ComponentActivity).getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.read = videoCapabilities;
    }
}
