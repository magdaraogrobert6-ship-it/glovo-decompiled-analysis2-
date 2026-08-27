package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.impl.utils.futures.Futures$$ExternalSyntheticLambda3;
import coil3.util.UtilsKt;
import com.deliveryhero.fwf_http.ConstantKt;
import java.util.concurrent.ScheduledExecutorService;
import o.DrawModifierNodeKt;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import o.getTrackDrawable;
import o.obtainShadowContext;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onForwardedEvent;
import o.setInflatedId;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1 implements StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, obtainShadowContext {
    public final /* synthetic */ int read;
    public final /* synthetic */ Camera2CapturePipeline$ScreenFlashTask serializer;

    public /* synthetic */ Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1(Camera2CapturePipeline$ScreenFlashTask camera2CapturePipeline$ScreenFlashTask, int i) {
        this.read = i;
        this.serializer = camera2CapturePipeline$ScreenFlashTask;
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        int i = this.read;
        Camera2CapturePipeline$ScreenFlashTask camera2CapturePipeline$ScreenFlashTask = this.serializer;
        if (i == 0) {
            return camera2CapturePipeline$ScreenFlashTask.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(true);
        }
        if (i == 1) {
            return UtilsKt.RemoteActionCompatParcelizer(new Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1(camera2CapturePipeline$ScreenFlashTask, 4));
        }
        if (i == 2) {
            return camera2CapturePipeline$ScreenFlashTask.RemoteActionCompatParcelizer.PlaybackStateCompatCustomAction.write();
        }
        ScheduledExecutorService scheduledExecutorService = camera2CapturePipeline$ScreenFlashTask.write;
        Camera2CameraControlImpl camera2CameraControlImpl = camera2CapturePipeline$ScreenFlashTask.RemoteActionCompatParcelizer;
        onForwardedEvent onforwardedevent = new onForwardedEvent(new getTrackDrawable(13));
        camera2CameraControlImpl.write(onforwardedevent);
        CameraX$$ExternalSyntheticLambda2 cameraX$$ExternalSyntheticLambda2 = new CameraX$$ExternalSyntheticLambda2(camera2CameraControlImpl, 8, onforwardedevent);
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = camera2CameraControlImpl.MediaDescriptionCompat;
        onDrawBehind ondrawbehind = onforwardedevent.IconCompatParcelizer;
        ondrawbehind.serializer.RemoteActionCompatParcelizer(cameraX$$ExternalSyntheticLambda2, previewFreezeAfterHighSpeedRecordingQuirk);
        return UtilsKt.RemoteActionCompatParcelizer(new Futures$$ExternalSyntheticLambda3(ondrawbehind, scheduledExecutorService, ConstantKt.DEFAULT_REQUEST_TIMEOUT, 1));
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        Camera2CapturePipeline$ScreenFlashTask camera2CapturePipeline$ScreenFlashTask = this.serializer;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) camera2CapturePipeline$ScreenFlashTask.IconCompatParcelizer.MediaSessionCompatQueueItem;
        boolean z = (torchFlashRequiredFor3aUpdateQuirk == null || Camera2CameraControlImpl.serializer(torchFlashRequiredFor3aUpdateQuirk.IconCompatParcelizer, 5) == 5) ? false : true;
        setInflatedId.IconCompatParcelizer(3, "UseFlashModeTorchFor3aUpdate");
        if (!z) {
            ondrawwithcontent.RemoteActionCompatParcelizer(null);
            return "EnableTorchInternal";
        }
        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
        camera2CapturePipeline$ScreenFlashTask.RemoteActionCompatParcelizer.write(2);
        ondrawwithcontent.RemoteActionCompatParcelizer(null);
        return "EnableTorchInternal";
    }
}
