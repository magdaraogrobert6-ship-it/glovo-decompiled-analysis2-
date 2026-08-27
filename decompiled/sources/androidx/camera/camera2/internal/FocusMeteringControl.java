package androidx.camera.camera2.internal;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.view.PendingValue;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.sentiance.okhttp3.u$a;
import com.sentiance.sdk.events.f$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import o.CameraProviderInitRetryPolicy;
import o.CameraRepository;
import o.CameraXExternalSyntheticLambda0;
import o.DrawModifierNodeKt;
import o.EncoderImplMediaCodecCallback;
import o.FlashAvailabilityBufferUnderflowQuirk;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.ReportedVideoQualityNotSupportedQuirk;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.TorchFlashRequiredFor3aUpdateQuirk;
import o.abandonFocus;
import o.access701;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.play;
import o.setContentDrawScopeui;
import o.setInflatedId;
import o.setLayoutResource;
import o.setMeasureWithLargestChildEnabled;
import o.setOrientation;

/* JADX INFO: loaded from: classes.dex */
public final class FocusMeteringControl {
    public static final MeteringRectangle[] IconCompatParcelizer = new MeteringRectangle[0];
    public setOrientation ComponentActivity;
    public MeteringRectangle[] MediaBrowserCompatMediaItem;
    public final Camera2CameraControlImpl MediaDescriptionCompat;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public MeteringRectangle[] RemoteActionCompatParcelizer;
    public final ReportedVideoQualityNotSupportedQuirk r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ImageCapture$1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public onDrawWithContent r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public ScheduledFuture read;
    public MeteringRectangle[] serializer;
    public ScheduledFuture write;
    public volatile boolean PlaybackStateCompat = false;
    public volatile Rational ResultReceiver = null;
    public boolean ParcelableVolumeInfo = false;
    public Integer MediaMetadataCompat = 0;
    public long RatingCompat = 0;
    public boolean PlaybackStateCompatCustomAction = false;
    public boolean MediaSessionCompatToken = false;
    public int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = 1;
    public setMeasureWithLargestChildEnabled r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;

    /* JADX INFO: renamed from: androidx.camera.camera2.internal.FocusMeteringControl$2, reason: invalid class name */
    public final class AnonymousClass2 extends StillCaptureFlashStopRepeatingQuirk {
        public final /* synthetic */ onDrawWithContent IconCompatParcelizer;
        public final /* synthetic */ int write;

        public /* synthetic */ AnonymousClass2(onDrawWithContent ondrawwithcontent, int i) {
            this.write = i;
            this.IconCompatParcelizer = ondrawwithcontent;
        }

        @Override // o.StillCaptureFlashStopRepeatingQuirk
        public final void RemoteActionCompatParcelizer(int i) {
            int i2 = this.write;
            onDrawWithContent ondrawwithcontent = this.IconCompatParcelizer;
            if (i2 != 0) {
                ondrawwithcontent.serializer(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            } else {
                ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is closed"));
            }
        }

        @Override // o.StillCaptureFlashStopRepeatingQuirk
        public final void RemoteActionCompatParcelizer(int i, PendingValue pendingValue) {
            int i2 = this.write;
            onDrawWithContent ondrawwithcontent = this.IconCompatParcelizer;
            if (i2 == 0) {
                ondrawwithcontent.serializer(new Exception() { // from class: androidx.camera.core.impl.CameraControlInternal$CameraControlException
                });
                return;
            }
            ondrawwithcontent.serializer(new ImageCaptureException(2, "Capture request failed with reason " + ((TorchFlashRequiredFor3aUpdateQuirk) pendingValue.serializer), null));
        }

        @Override // o.StillCaptureFlashStopRepeatingQuirk
        public final void serializer(int i, CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0) {
            int i2 = this.write;
            onDrawWithContent ondrawwithcontent = this.IconCompatParcelizer;
            if (i2 != 0) {
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
            } else {
                setInflatedId.IconCompatParcelizer(3, "FocusMeteringControl");
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
            }
        }
    }

    public final void read(boolean z, boolean z2) {
        if (this.PlaybackStateCompat) {
            abandonFocus abandonfocus = new abandonFocus();
            abandonfocus.RatingCompat = true;
            abandonfocus.MediaMetadataCompat = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
            if (z) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            abandonfocus.RemoteActionCompatParcelizer(new access701(23, CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)));
            this.MediaDescriptionCompat.write(Collections.singletonList(abandonfocus.IconCompatParcelizer()));
        }
    }

    public final DrawModifierNodeKt RemoteActionCompatParcelizer(boolean z) {
        if (Camera2CameraControlImpl.serializer(this.MediaDescriptionCompat.serializer, 5) != 5) {
            return EncoderImplMediaCodecCallback.IconCompatParcelizer;
        }
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.MediaSessionCompatQueueItem.execute(new f$$ExternalSyntheticLambda1(this, z, ondrawwithcontent, 1));
            ondrawwithcontent.RemoteActionCompatParcelizer = "enableExternalFlashAeMode";
            return ondrawbehind;
        } catch (Exception e) {
            ondrawbehind.write(e);
            return ondrawbehind;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        Camera2CameraControlImpl camera2CameraControlImpl = this.MediaDescriptionCompat;
        ((HashSet) camera2CameraControlImpl.ResultReceiver.read).remove(null);
        ((HashSet) camera2CameraControlImpl.ResultReceiver.read).remove(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        onDrawWithContent ondrawwithcontent = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (ondrawwithcontent != null) {
            ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        }
        ScheduledFuture scheduledFuture = this.read;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.read = null;
        }
        ScheduledFuture scheduledFuture2 = this.write;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.write = null;
        }
        if (this.RemoteActionCompatParcelizer.length > 0) {
            read(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = meteringRectangleArr;
        this.serializer = meteringRectangleArr;
        this.MediaBrowserCompatMediaItem = meteringRectangleArr;
        this.ParcelableVolumeInfo = false;
        camera2CameraControlImpl.MediaSessionCompatQueueItem();
    }

    public final void RemoteActionCompatParcelizer(onDrawWithContent ondrawwithcontent) {
        setInflatedId.IconCompatParcelizer(3, "FocusMeteringControl");
        if (!this.PlaybackStateCompat) {
            ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is not active."));
            return;
        }
        abandonFocus abandonfocus = new abandonFocus();
        abandonfocus.MediaMetadataCompat = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        abandonfocus.RatingCompat = true;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
        cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        abandonfocus.RemoteActionCompatParcelizer(new access701(23, CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)));
        abandonfocus.read(new AnonymousClass2(ondrawwithcontent, 0));
        this.MediaDescriptionCompat.write(Collections.singletonList(abandonfocus.IconCompatParcelizer()));
    }

    public FocusMeteringControl(Camera2CameraControlImpl camera2CameraControlImpl, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, u$a u_a) {
        MeteringRectangle[] meteringRectangleArr = IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = meteringRectangleArr;
        this.serializer = meteringRectangleArr;
        this.MediaBrowserCompatMediaItem = meteringRectangleArr;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = null;
        this.MediaSessionCompatResultReceiverWrapper = false;
        this.ComponentActivity = null;
        this.MediaDescriptionCompat = camera2CameraControlImpl;
        this.MediaSessionCompatQueueItem = previewFreezeAfterHighSpeedRecordingQuirk;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = reportedVideoQualityNotSupportedQuirk;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ImageCapture$1(20, u_a);
    }

    public final List read(List list, int i, Rational rational, Rect rect, int i2) {
        PointF pointF;
        if (!list.isEmpty() && i != 0) {
            ArrayList arrayList = new ArrayList();
            Rational rational2 = new Rational(rect.width(), rect.height());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                setLayoutResource setlayoutresource = (setLayoutResource) it.next();
                if (arrayList.size() == i) {
                    break;
                }
                float f = setlayoutresource.RemoteActionCompatParcelizer;
                float f2 = setlayoutresource.IconCompatParcelizer;
                if (f >= 0.0f && f <= 1.0f) {
                    float f3 = setlayoutresource.serializer;
                    if (f3 >= 0.0f && f3 <= 1.0f) {
                        Rational rational3 = setlayoutresource.read;
                        if (rational3 == null) {
                            rational3 = rational;
                        }
                        if (i2 == 1 && ((u$a) this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer(AfRegionFlipHorizontallyQuirk.class)) {
                            pointF = new PointF(1.0f - f, f3);
                        } else {
                            pointF = new PointF(f, f3);
                        }
                        if (!rational3.equals(rational2)) {
                            if (rational3.compareTo(rational2) > 0) {
                                float fDoubleValue = (float) (rational3.doubleValue() / rational2.doubleValue());
                                pointF.y = (1.0f / fDoubleValue) * (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointF.y);
                            } else {
                                float fDoubleValue2 = (float) (rational2.doubleValue() / rational3.doubleValue());
                                pointF.x = (1.0f / fDoubleValue2) * (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointF.x);
                            }
                        }
                        int iWidth = (int) ((pointF.x * rect.width()) + rect.left);
                        int iHeight = (int) ((pointF.y * rect.height()) + rect.top);
                        int iWidth2 = ((int) (rect.width() * f2)) / 2;
                        int iHeight2 = ((int) (f2 * rect.height())) / 2;
                        Rect rect2 = new Rect(iWidth - iWidth2, iHeight - iHeight2, iWidth + iWidth2, iHeight + iHeight2);
                        rect2.left = Math.min(Math.max(rect2.left, rect.left), rect.right);
                        rect2.right = Math.min(Math.max(rect2.right, rect.left), rect.right);
                        rect2.top = Math.min(Math.max(rect2.top, rect.top), rect.bottom);
                        rect2.bottom = Math.min(Math.max(rect2.bottom, rect.top), rect.bottom);
                        MeteringRectangle meteringRectangle = new MeteringRectangle(rect2, 1000);
                        if (meteringRectangle.getWidth() != 0 && meteringRectangle.getHeight() != 0) {
                            arrayList.add(meteringRectangle);
                        }
                    }
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public final void IconCompatParcelizer(boolean z) {
        if (this.PlaybackStateCompat) {
            abandonFocus abandonfocus = new abandonFocus();
            abandonfocus.MediaMetadataCompat = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            abandonfocus.RatingCompat = true;
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                int iSerializer = Camera2CameraControlImpl.serializer(this.MediaDescriptionCompat.serializer, 1);
                cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(key), play.HIGH_PRIORITY_REQUIRED, Integer.valueOf(iSerializer));
            }
            abandonfocus.RemoteActionCompatParcelizer(new access701(23, CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)));
            abandonfocus.read(new FlashAvailabilityBufferUnderflowQuirk(1));
            this.MediaDescriptionCompat.write(Collections.singletonList(abandonfocus.IconCompatParcelizer()));
        }
    }

    public final onDrawBehind write() {
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.MediaSessionCompatQueueItem.execute(new CameraX$$ExternalSyntheticLambda2(this, 10, ondrawwithcontent));
            ondrawwithcontent.RemoteActionCompatParcelizer = "triggerAePrecapture";
            return ondrawbehind;
        } catch (Exception e) {
            ondrawbehind.write(e);
            return ondrawbehind;
        }
    }
}
