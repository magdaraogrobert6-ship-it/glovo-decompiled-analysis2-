package o;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class setFirstBaselineToTopHeight extends CameraDevice.StateCallback {
    public final /* synthetic */ onDrawWithContent RemoteActionCompatParcelizer;
    public final /* synthetic */ androidx.camera.camera2.internal.Camera2CameraImpl read;

    public setFirstBaselineToTopHeight(androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl, onDrawWithContent ondrawwithcontent) {
        this.read = camera2CameraImpl;
        this.RemoteActionCompatParcelizer = ondrawwithcontent;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        androidx.camera.camera2.internal.Camera2CameraImpl camera2CameraImpl = this.read;
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = camera2CameraImpl.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        camera2CameraImpl.write("openCameraConfigAndClose camera opened");
        setBaselineAligned setbaselinealigned = new setBaselineAligned(camera2CameraImpl.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, new u$a(Collections.EMPTY_LIST), false);
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        Surface surface = new Surface(surfaceTexture);
        Camera2CameraFactory camera2CameraFactory = new Camera2CameraFactory(surface);
        VideoQualityQuirk.write((DrawModifierNodeKt) camera2CameraFactory.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new CameraX$$ExternalSyntheticLambda2(surface, 5, surfaceTexture), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        ArrayList arrayList = new ArrayList();
        CameraControlInternalCameraControlException cameraControlInternalCameraControlExceptionWrite = CameraControlInternalCameraControlException.write();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        PreviewStretchWhenVideoCaptureIsBoundQuirk previewStretchWhenVideoCaptureIsBoundQuirk = Preview3AThreadCrashQuirk.read(camera2CameraFactory);
        previewStretchWhenVideoCaptureIsBoundQuirk.IconCompatParcelizer = getNavigationIcon.MediaDescriptionCompat;
        linkedHashSet.add(previewStretchWhenVideoCaptureIsBoundQuirk.serializer());
        camera2CameraImpl.write("Start configAndClose.");
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        CameraRepository cameraRepositorySerializer = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
        ArrayList arrayList10 = new ArrayList(arrayList);
        OnePixelShiftQuirk onePixelShiftQuirk = OnePixelShiftQuirk.read;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = cameraControlInternalCameraControlExceptionWrite.IconCompatParcelizer;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        mapToBase maptobase = new mapToBase(arrayList5, arrayList6, arrayList7, arrayList8, new nativeGetYUVImageVUOff(arrayList9, cameraRepositorySerializer, 1, false, arrayList10, false, new OnePixelShiftQuirk(arrayMap), null), null, null, 0, null);
        androidx.lifecycle.BlockRunner blockRunner = camera2CameraImpl.PlaybackStateCompatCustomAction;
        StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(coil3.util.UtilsKt.RemoteActionCompatParcelizer(new EncodeException(setbaselinealigned.write(maptobase, cameraDevice, new getThumbScrollRange((u$a) blockRunner.RemoteActionCompatParcelizer, (u$a) blockRunner.IconCompatParcelizer, (androidx.lifecycle.BlockRunner) blockRunner.write, (PreviewFreezeAfterHighSpeedRecordingQuirk) blockRunner.read, (ReportedVideoQualityNotSupportedQuirk) blockRunner.serializer, (Handler) blockRunner.RatingCompat)), 1))), new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(setbaselinealigned, 1, camera2CameraFactory), previewFreezeAfterHighSpeedRecordingQuirk);
        Objects.requireNonNull(cameraDevice);
        stretchedVideoResolutionQuirkSerializer.RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(4, cameraDevice), previewFreezeAfterHighSpeedRecordingQuirk);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.read.write("openCameraConfigAndClose camera closed");
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.read.write("openCameraConfigAndClose camera disconnected");
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        this.read.write("openCameraConfigAndClose camera error " + i);
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null);
    }
}
