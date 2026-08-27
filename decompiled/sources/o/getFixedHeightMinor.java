package o;

import android.hardware.camera2.TotalCaptureResult;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import bo.app.m1$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes.dex */
public final class getFixedHeightMinor implements setAttachListener {
    public final FlowLayoutBuildingBlocks$WrapInfo IconCompatParcelizer;
    public final int read;
    public final androidx.camera.camera2.internal.Camera2CameraControlImpl serializer;
    public boolean write = false;

    @Override // o.setAttachListener
    public final boolean read() {
        return this.read == 0;
    }

    @Override // o.setAttachListener
    public final DrawModifierNodeKt IconCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        if (!abandonFocus.read(this.read, totalCaptureResult)) {
            return VideoQualityQuirk.read(Boolean.FALSE);
        }
        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
        this.write = true;
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.serializer.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(ondrawwithcontent);
            this.IconCompatParcelizer.IconCompatParcelizer = true;
            ondrawwithcontent.RemoteActionCompatParcelizer = "AePreCapture";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer = VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(ondrawbehind);
        getTrackDrawable gettrackdrawable = new getTrackDrawable(8);
        return VideoQualityQuirk.serializer(videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer, new androidx.camera.view.PendingValue(5, gettrackdrawable), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public getFixedHeightMinor(androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, int i, FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo) {
        this.serializer = camera2CameraControlImpl;
        this.read = i;
        this.IconCompatParcelizer = flowLayoutBuildingBlocks$WrapInfo;
    }

    @Override // o.setAttachListener
    public final void serializer() {
        if (this.write) {
            setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
            this.serializer.PlaybackStateCompatCustomAction.read(false, true);
            this.IconCompatParcelizer.IconCompatParcelizer = false;
        }
    }
}
