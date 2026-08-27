package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.transition.TransitionValuesMaps;
import o.AndroidGraphicsContext2;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.getSwitchMinWidth;
import o.getSwitchPadding;
import o.getTextOn;
import o.getThumbTintList;
import o.getViewPortScaleType;
import o.onDrawWithContent;
import o.setInflatedId;

/* JADX INFO: loaded from: classes.dex */
public final class ZoomControl {
    public boolean IconCompatParcelizer = false;
    public final AndroidGraphicsContext2 MediaBrowserCompatMediaItem;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk RemoteActionCompatParcelizer;
    public final Camera2CameraControlImpl read;
    public final getTextOn serializer;
    public final getSwitchMinWidth write;

    public ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, getThumbTintList getthumbtintlist, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        getSwitchPadding getswitchpadding = new getSwitchPadding(this);
        this.read = camera2CameraControlImpl;
        this.RemoteActionCompatParcelizer = previewFreezeAfterHighSpeedRecordingQuirk;
        getSwitchMinWidth getswitchminwidthSerializer = serializer(getthumbtintlist);
        this.write = getswitchminwidthSerializer;
        getTextOn gettexton = new getTextOn(getswitchminwidthSerializer.IconCompatParcelizer(), getswitchminwidthSerializer.RemoteActionCompatParcelizer());
        this.serializer = gettexton;
        gettexton.RemoteActionCompatParcelizer(1.0f);
        this.MediaBrowserCompatMediaItem = new AndroidGraphicsContext2(getViewPortScaleType.read(gettexton));
        camera2CameraControlImpl.write(getswitchpadding);
    }

    public final void read(getViewPortScaleType getviewportscaletype) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        AndroidGraphicsContext2 androidGraphicsContext2 = this.MediaBrowserCompatMediaItem;
        if (looperMyLooper == mainLooper) {
            androidGraphicsContext2.RemoteActionCompatParcelizer(getviewportscaletype);
        } else {
            androidGraphicsContext2.serializer(getviewportscaletype);
        }
    }

    public final void read(onDrawWithContent ondrawwithcontent, getViewPortScaleType getviewportscaletype) {
        getViewPortScaleType getviewportscaletype2;
        if (this.IconCompatParcelizer) {
            this.write.write(getviewportscaletype.IconCompatParcelizer, ondrawwithcontent);
            this.read.MediaSessionCompatQueueItem();
            return;
        }
        synchronized (this.serializer) {
            this.serializer.RemoteActionCompatParcelizer(1.0f);
            getviewportscaletype2 = getViewPortScaleType.read(this.serializer);
        }
        read(getviewportscaletype2);
        ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is not active."));
    }

    public static getSwitchMinWidth serializer(getThumbTintList getthumbtintlist) {
        Range range;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) getthumbtintlist.write(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError e) {
                setInflatedId.RemoteActionCompatParcelizer("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
                range = null;
            }
            if (range != null) {
                return new AndroidRZoomImpl(getthumbtintlist);
            }
        }
        return new TransitionValuesMaps(getthumbtintlist);
    }
}
