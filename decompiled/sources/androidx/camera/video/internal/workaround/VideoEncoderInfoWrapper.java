package androidx.camera.video.internal.workaround;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.MediaCodecInfoReportIncorrectInfoQuirk;
import coil3.util.UtilsKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import o.accesswaitForCompositionAfterTargetStateChange;
import o.setInflatedId;
import o.setInitialAnimationsanimation_core;

/* JADX INFO: loaded from: classes.dex */
public final class VideoEncoderInfoWrapper implements setInitialAnimationsanimation_core {
    public final Range RemoteActionCompatParcelizer;
    public final Range read;
    public final HashSet serializer;
    public final setInitialAnimationsanimation_core write;

    @Override // o.setInitialAnimationsanimation_core
    public final Range read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range write() {
        return this.read;
    }

    @Override // o.setInitialAnimationsanimation_core
    public final boolean IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final int MediaSessionCompatQueueItem() {
        return this.write.MediaSessionCompatQueueItem();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final int RemoteActionCompatParcelizer() {
        return this.write.RemoteActionCompatParcelizer();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range serializer() {
        return this.write.serializer();
    }

    @Override // o.setInitialAnimationsanimation_core
    public final boolean serializer(int i, int i2) {
        setInitialAnimationsanimation_core setinitialanimationsanimation_core = this.write;
        if (setinitialanimationsanimation_core.serializer(i, i2)) {
            return true;
        }
        for (Size size : this.serializer) {
            if (size.getWidth() == i && size.getHeight() == i2) {
                return true;
            }
        }
        return this.read.contains(Integer.valueOf(i)) && this.RemoteActionCompatParcelizer.contains(Integer.valueOf(i2)) && i % setinitialanimationsanimation_core.MediaSessionCompatQueueItem() == 0 && i2 % setinitialanimationsanimation_core.RemoteActionCompatParcelizer() == 0;
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range RemoteActionCompatParcelizer(int i) {
        Range range = this.RemoteActionCompatParcelizer;
        boolean zContains = range.contains(Integer.valueOf(i));
        setInitialAnimationsanimation_core setinitialanimationsanimation_core = this.write;
        UtilsKt.IconCompatParcelizer("Not supported height: " + i + " which is not in " + range + " or can not be divided by alignment " + setinitialanimationsanimation_core.RemoteActionCompatParcelizer(), zContains && i % setinitialanimationsanimation_core.RemoteActionCompatParcelizer() == 0);
        return this.read;
    }

    @Override // o.setInitialAnimationsanimation_core
    public final Range read(int i) {
        Range range = this.read;
        boolean zContains = range.contains(Integer.valueOf(i));
        setInitialAnimationsanimation_core setinitialanimationsanimation_core = this.write;
        UtilsKt.IconCompatParcelizer("Not supported width: " + i + " which is not in " + range + " or can not be divided by alignment " + setinitialanimationsanimation_core.MediaSessionCompatQueueItem(), zContains && i % setinitialanimationsanimation_core.MediaSessionCompatQueueItem() == 0);
        return this.RemoteActionCompatParcelizer;
    }

    public VideoEncoderInfoWrapper(setInitialAnimationsanimation_core setinitialanimationsanimation_core) {
        HashSet hashSet = new HashSet();
        this.serializer = hashSet;
        this.write = setinitialanimationsanimation_core;
        int iMediaSessionCompatQueueItem = setinitialanimationsanimation_core.MediaSessionCompatQueueItem();
        this.read = Range.create(Integer.valueOf(iMediaSessionCompatQueueItem), Integer.valueOf(((int) Math.ceil(4096.0d / ((double) iMediaSessionCompatQueueItem))) * iMediaSessionCompatQueueItem));
        int iRemoteActionCompatParcelizer = setinitialanimationsanimation_core.RemoteActionCompatParcelizer();
        this.RemoteActionCompatParcelizer = Range.create(Integer.valueOf(iRemoteActionCompatParcelizer), Integer.valueOf(((int) Math.ceil(2160.0d / ((double) iRemoteActionCompatParcelizer))) * iRemoteActionCompatParcelizer));
        hashSet.addAll(MediaCodecInfoReportIncorrectInfoQuirk.write.contains(Build.MODEL.toLowerCase(Locale.US)) ? Collections.singleton(new Size(1920, 1080)) : Collections.EMPTY_SET);
    }

    public static setInitialAnimationsanimation_core serializer(setInitialAnimationsanimation_core setinitialanimationsanimation_core, Size size) {
        if (!(setinitialanimationsanimation_core instanceof VideoEncoderInfoWrapper)) {
            if (accesswaitForCompositionAfterTargetStateChange.read.read(MediaCodecInfoReportIncorrectInfoQuirk.class) != null) {
                setinitialanimationsanimation_core = new VideoEncoderInfoWrapper(setinitialanimationsanimation_core);
            } else if (size != null && !setinitialanimationsanimation_core.IconCompatParcelizer(size.getWidth(), size.getHeight())) {
                setInflatedId.read("VideoEncoderInfoWrapper", "Detected that the device does not support a size " + size + " that should be valid in widths/heights = " + setinitialanimationsanimation_core.write() + "/" + setinitialanimationsanimation_core.read());
                setinitialanimationsanimation_core = new VideoEncoderInfoWrapper(setinitialanimationsanimation_core);
            }
        }
        if (size != null && (setinitialanimationsanimation_core instanceof VideoEncoderInfoWrapper)) {
            ((VideoEncoderInfoWrapper) setinitialanimationsanimation_core).serializer.add(size);
        }
        return setinitialanimationsanimation_core;
    }
}
