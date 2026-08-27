package o;

import android.hardware.camera2.CaptureRequest;
import android.media.ImageWriter;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class getMinWidthMajor implements StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, accessgetMediaFastForwardcp {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getMinWidthMajor(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer = obj2;
        this.read = i;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) throws Exception {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0;
        getInflatedId getinflatedid;
        ImageWriter imageWriter;
        getFixedWidthMajor getfixedwidthmajor = (getFixedWidthMajor) this.RemoteActionCompatParcelizer;
        ArrayList<nativeGetYUVImageVUOff> arrayList = (ArrayList) this.IconCompatParcelizer;
        androidx.camera.camera2.internal.Camera2CameraControlImpl camera2CameraControlImpl = getfixedwidthmajor.serializer;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (nativeGetYUVImageVUOff nativegetyuvimagevuoff : arrayList) {
            abandonFocus abandonfocus = new abandonFocus(nativegetyuvimagevuoff);
            int i = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
            if (i == 5) {
                getThumbTextPadding getthumbtextpadding = camera2CameraControlImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                if (getthumbtextpadding.IconCompatParcelizer || getthumbtextpadding.RatingCompat) {
                    cameraXExternalSyntheticLambda0 = null;
                } else {
                    try {
                        getinflatedid = (getInflatedId) getthumbtextpadding.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    } catch (NoSuchElementException unused) {
                        setInflatedId.serializer("ZslControlImpl", "dequeueImageFromBuffer no such element");
                        getinflatedid = null;
                    }
                    if (getinflatedid != null) {
                        androidx.navigation.NavArgsLazy navArgsLazy = camera2CameraControlImpl.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.MediaBrowserCompatMediaItem;
                        if (navArgsLazy != null) {
                            android.media.Image imageRemoteActionCompatParcelizer = getinflatedid.RemoteActionCompatParcelizer();
                            if (!((AtomicBoolean) navArgsLazy.read).get() || (imageWriter = (ImageWriter) navArgsLazy.MediaSessionCompatQueueItem) == null || imageRemoteActionCompatParcelizer == null) {
                                setInflatedId.serializer("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                            } else {
                                try {
                                    imageWriter.queueInputImage(imageRemoteActionCompatParcelizer);
                                    ImageWriter imageWriter2 = (ImageWriter) navArgsLazy.MediaSessionCompatQueueItem;
                                    final getThumbTintMode getthumbtintmode = new getThumbTintMode(getinflatedid);
                                    final PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = (PreviewFreezeAfterHighSpeedRecordingQuirk) navArgsLazy.RatingCompat;
                                    imageWriter2.setOnImageReleasedListener(new ImageWriter.OnImageReleasedListener() { // from class: o.getMeteringPointFactory
                                        @Override // android.media.ImageWriter.OnImageReleasedListener
                                        public final void onImageReleased(ImageWriter imageWriter3) {
                                            previewFreezeAfterHighSpeedRecordingQuirk.execute(new Crossfade(getthumbtintmode, 5, imageWriter3));
                                        }
                                    }, getViewModelStore.read());
                                    setTitleMarginStart settitlemarginstart = getinflatedid.read();
                                    cameraXExternalSyntheticLambda0 = settitlemarginstart instanceof getDisplayManager ? ((getDisplayManager) settitlemarginstart).serializer : null;
                                } catch (IllegalStateException e) {
                                    setInflatedId.serializer("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
                                    setInflatedId.serializer("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                                }
                            }
                        } else {
                            setInflatedId.serializer("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        }
                        if (cameraXExternalSyntheticLambda0 == null) {
                            getinflatedid.close();
                        }
                    } else {
                        setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
                        cameraXExternalSyntheticLambda0 = null;
                    }
                }
            } else {
                cameraXExternalSyntheticLambda0 = null;
            }
            if (cameraXExternalSyntheticLambda0 != null) {
                abandonfocus.read = cameraXExternalSyntheticLambda0;
            } else {
                int i2 = (getfixedwidthmajor.MediaDescriptionCompat != 3 || getfixedwidthmajor.RemoteActionCompatParcelizer) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                if (i2 != -1) {
                    abandonfocus.MediaMetadataCompat = i2;
                }
                setInflatedId.IconCompatParcelizer(3, "Camera2CapturePipeline");
            }
            FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo = getfixedwidthmajor.IconCompatParcelizer;
            if (flowLayoutBuildingBlocks$WrapInfo.IconCompatParcelizer && this.read == 0 && flowLayoutBuildingBlocks$WrapInfo.serializer) {
                CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.CONTROL_AE_MODE), 3);
                abandonfocus.RemoteActionCompatParcelizer(new access701(23, CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)));
            }
            onDrawWithContent ondrawwithcontent = new onDrawWithContent();
            ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
            onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
            ondrawwithcontent.read = ondrawbehind;
            ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                abandonfocus.read(new androidx.camera.camera2.internal.FocusMeteringControl.AnonymousClass2(ondrawwithcontent, 1));
                ondrawwithcontent.RemoteActionCompatParcelizer = "submitStillCapture";
            } catch (Exception e2) {
                ondrawbehind.write(e2);
            }
            arrayList2.add(ondrawbehind);
            arrayList3.add(abandonfocus.IconCompatParcelizer());
        }
        camera2CameraControlImpl.write(arrayList3);
        return VideoQualityQuirk.write(arrayList2);
    }

    @Override // o.accessgetMediaFastForwardcp
    public Object read() {
        access500 access500Var = (access500) this.RemoteActionCompatParcelizer;
        ((androidx.emoji2.text.EmojiProcessor) access500Var.MediaDescriptionCompat).IconCompatParcelizer((accessgetEightcp) this.IconCompatParcelizer, this.read + 1, false);
        return null;
    }
}
