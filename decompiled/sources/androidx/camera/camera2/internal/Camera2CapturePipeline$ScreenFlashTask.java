package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.view.PendingValue;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import o.DrawModifierNodeKt;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.ReportedVideoQualityNotSupportedQuirk;
import o.StretchedVideoResolutionQuirk;
import o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import o.VideoQualityQuirk;
import o.getDefaultDisplay;
import o.getTrackDrawable;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.setAttachListener;
import o.setContentDrawScopeui;
import o.setInflatedId;
import o.setTitleMarginBottom;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2CapturePipeline$ScreenFlashTask implements setAttachListener {
    public final ImageCapture$1 IconCompatParcelizer;
    public final Camera2CameraControlImpl RemoteActionCompatParcelizer;
    public final setTitleMarginBottom read;
    public final Executor serializer;
    public final ScheduledExecutorService write;

    @Override // o.setAttachListener
    public final boolean read() {
        return false;
    }

    @Override // o.setAttachListener
    public final void serializer() {
        Camera2CameraControlImpl camera2CameraControlImpl = this.RemoteActionCompatParcelizer;
        FocusMeteringControl focusMeteringControl = camera2CameraControlImpl.PlaybackStateCompatCustomAction;
        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) this.IconCompatParcelizer.MediaSessionCompatQueueItem;
        boolean z = (torchFlashRequiredFor3aUpdateQuirk == null || Camera2CameraControlImpl.serializer(torchFlashRequiredFor3aUpdateQuirk.IconCompatParcelizer, 5) == 5) ? false : true;
        setInflatedId.IconCompatParcelizer(3, "UseFlashModeTorchFor3aUpdate");
        if (z) {
            camera2CameraControlImpl.write(0);
        }
        focusMeteringControl.RemoteActionCompatParcelizer(false).RemoteActionCompatParcelizer(new xr$$ExternalSyntheticLambda1(1), this.serializer);
        focusMeteringControl.read(false, true);
        ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirkIconCompatParcelizer = removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer();
        setTitleMarginBottom settitlemarginbottom = this.read;
        Objects.requireNonNull(settitlemarginbottom);
        reportedVideoQualityNotSupportedQuirkIconCompatParcelizer.execute(new Preview$$ExternalSyntheticLambda0(7, settitlemarginbottom));
    }

    public Camera2CapturePipeline$ScreenFlashTask(Camera2CameraControlImpl camera2CameraControlImpl, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk, ImageCapture$1 imageCapture$1) {
        this.RemoteActionCompatParcelizer = camera2CameraControlImpl;
        this.serializer = previewFreezeAfterHighSpeedRecordingQuirk;
        this.write = reportedVideoQualityNotSupportedQuirk;
        this.IconCompatParcelizer = imageCapture$1;
        setTitleMarginBottom settitlemarginbottom = camera2CameraControlImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Objects.requireNonNull(settitlemarginbottom);
        this.read = settitlemarginbottom;
    }

    @Override // o.setAttachListener
    public final DrawModifierNodeKt IconCompatParcelizer(TotalCaptureResult totalCaptureResult) {
        int i = 3;
        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
        AtomicReference atomicReference = new AtomicReference();
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        int i2 = 1;
        try {
            atomicReference.set(new getDefaultDisplay(1, ondrawwithcontent));
            ondrawwithcontent.RemoteActionCompatParcelizer = "OnScreenFlashUiApplied";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        onDrawWithContent ondrawwithcontent2 = new onDrawWithContent();
        ondrawwithcontent2.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind2 = new onDrawBehind(ondrawwithcontent2);
        ondrawwithcontent2.read = ondrawbehind2;
        ondrawwithcontent2.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.IconCompatParcelizer().execute(new WorkerKt$$ExternalSyntheticLambda2(this, atomicReference, ondrawwithcontent2));
            ondrawwithcontent2.RemoteActionCompatParcelizer = "OnScreenFlashStart";
        } catch (Exception e2) {
            ondrawbehind2.write(e2);
        }
        VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer = VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(ondrawbehind2);
        Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1 camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1 = new Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1(this, 0);
        Executor executor = this.serializer;
        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(VideoQualityQuirk.serializer(videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer, camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1, executor), new Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1(this, i2), executor);
        int i3 = 2;
        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer2 = VideoQualityQuirk.serializer(VideoQualityQuirk.serializer(VideoQualityQuirk.serializer(stretchedVideoResolutionQuirkSerializer, new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, i3, ondrawbehind), executor), new Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1(this, i3), executor), new Camera2CapturePipeline$ScreenFlashTask$$ExternalSyntheticLambda1(this, i), executor);
        getTrackDrawable gettrackdrawable = new getTrackDrawable(12);
        return VideoQualityQuirk.serializer(stretchedVideoResolutionQuirkSerializer2, new PendingValue(5, gettrackdrawable), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }
}
