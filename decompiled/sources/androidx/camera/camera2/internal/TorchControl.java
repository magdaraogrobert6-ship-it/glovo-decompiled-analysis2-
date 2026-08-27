package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl$OperationCanceledException;
import o.AndroidGraphicsContext2;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.getMotionEventToComposePointerIdMapui;
import o.getThumbTintList;
import o.onDetachedFromWindow;
import o.onDrawWithContent;
import o.setStacked;

/* JADX INFO: loaded from: classes.dex */
public final class TorchControl {
    public final PreviewFreezeAfterHighSpeedRecordingQuirk IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public final AndroidGraphicsContext2 MediaDescriptionCompat;
    public final AndroidGraphicsContext2 MediaMetadataCompat;
    public boolean RatingCompat;
    public final int RemoteActionCompatParcelizer;
    public final Camera2CameraControlImpl read;
    public onDrawWithContent serializer;
    public final boolean write;

    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, getThumbTintList getthumbtintlist, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk) {
        this.read = camera2CameraControlImpl;
        this.IconCompatParcelizer = previewFreezeAfterHighSpeedRecordingQuirk;
        boolean zSerializer = getMotionEventToComposePointerIdMapui.serializer(new setStacked(getthumbtintlist, 1));
        this.write = zSerializer;
        int iWrite = (zSerializer && getthumbtintlist.IconCompatParcelizer()) ? getthumbtintlist.write() : 0;
        this.RemoteActionCompatParcelizer = iWrite;
        this.MediaDescriptionCompat = new AndroidGraphicsContext2(0);
        this.MediaMetadataCompat = new AndroidGraphicsContext2(Integer.valueOf(iWrite));
        camera2CameraControlImpl.write(new onDetachedFromWindow() { // from class: o.getShowText
            @Override // o.onDetachedFromWindow
            public final boolean RemoteActionCompatParcelizer(TotalCaptureResult totalCaptureResult) {
                androidx.camera.camera2.internal.TorchControl torchControl = this.read;
                if (torchControl.serializer != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == torchControl.RatingCompat) {
                        torchControl.serializer.RemoteActionCompatParcelizer(null);
                        torchControl.serializer = null;
                    }
                }
                return false;
            }
        });
    }

    public final void IconCompatParcelizer(int i) {
        Integer numValueOf = Integer.valueOf(i != 1 ? 0 : 1);
        boolean z = PrematureEndOfStreamVideoQuirk.read();
        AndroidGraphicsContext2 androidGraphicsContext2 = this.MediaDescriptionCompat;
        if (z) {
            androidGraphicsContext2.RemoteActionCompatParcelizer(numValueOf);
        } else {
            androidGraphicsContext2.serializer(numValueOf);
        }
    }

    public final void serializer(onDrawWithContent ondrawwithcontent, int i) {
        if (!this.write) {
            if (ondrawwithcontent != null) {
                ondrawwithcontent.serializer(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.MediaBrowserCompatMediaItem) {
            IconCompatParcelizer(0);
            if (ondrawwithcontent != null) {
                ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        this.RatingCompat = i != 0;
        this.read.write(i);
        IconCompatParcelizer(i);
        onDrawWithContent ondrawwithcontent2 = this.serializer;
        if (ondrawwithcontent2 != null) {
            ondrawwithcontent2.serializer(new CameraControl$OperationCanceledException("There is a new enableTorch being set"));
        }
        this.serializer = ondrawwithcontent;
    }
}
