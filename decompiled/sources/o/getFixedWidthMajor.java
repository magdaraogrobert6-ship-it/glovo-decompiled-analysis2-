package o;

import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class getFixedWidthMajor {
    public final FlowLayoutBuildingBlocks$WrapInfo IconCompatParcelizer;
    public final int MediaDescriptionCompat;
    public final ScheduledExecutorService MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final Executor read;
    public final androidx.camera.camera2.internal.Camera2CameraControlImpl serializer;
    public long RatingCompat = 1000000000;
    public final ArrayList MediaBrowserCompatMediaItem = new ArrayList();
    public final getFixedWidthMinor write = new getFixedWidthMinor(this);

    public final DrawModifierNodeKt serializer(int i) {
        boolean zIsEmpty = this.MediaBrowserCompatMediaItem.isEmpty();
        DrawModifierNodeKt drawModifierNodeKt = EncoderImplMediaCodecCallback.IconCompatParcelizer;
        if (zIsEmpty) {
            return drawModifierNodeKt;
        }
        if (this.write.read()) {
            onForwardedEvent onforwardedevent = new onForwardedEvent(null);
            androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = this.serializer;
            camera2CameraControlImpl.write(onforwardedevent);
            CameraX$$ExternalSyntheticLambda2 cameraX$$ExternalSyntheticLambda2 = new CameraX$$ExternalSyntheticLambda2(camera2CameraControlImpl, 8, onforwardedevent);
            PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = camera2CameraControlImpl.MediaDescriptionCompat;
            onDrawBehind ondrawbehind = onforwardedevent.IconCompatParcelizer;
            ondrawbehind.serializer.RemoteActionCompatParcelizer(cameraX$$ExternalSyntheticLambda2, previewFreezeAfterHighSpeedRecordingQuirk);
            drawModifierNodeKt = ondrawbehind;
        }
        VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer = VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(drawModifierNodeKt);
        getLayer getlayer = new getLayer(i, this);
        Executor executor = this.read;
        return VideoQualityQuirk.serializer(VideoQualityQuirk.serializer(videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer, getlayer, executor), new StreamSharing$$ExternalSyntheticLambda0(2, this), executor);
    }

    public getFixedWidthMajor(int i, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk, androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl, boolean z, FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo) {
        this.MediaDescriptionCompat = i;
        this.read = previewFreezeAfterHighSpeedRecordingQuirk;
        this.MediaMetadataCompat = reportedVideoQualityNotSupportedQuirk;
        this.serializer = camera2CameraControlImpl;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = flowLayoutBuildingBlocks$WrapInfo;
    }
}
