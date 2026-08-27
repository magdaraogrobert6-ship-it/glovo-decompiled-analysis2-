package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.interop.Camera2CameraControl$$ExternalSyntheticLambda1;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$3;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks$WrapInfo;
import androidx.navigation.NavArgsLazy;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.network.NetworkHeaders$Builder;
import coil3.util.UtilsKt;
import com.incognia.internal.pNP$$ExternalSyntheticLambda5;
import com.incognia.internal.xr$$ExternalSyntheticLambda1;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.AbstractClickableNodeonPointerEvent1;
import o.AndroidGraphicsContext2;
import o.AudioEncoderIgnoresInputTimestampQuirk;
import o.AuthPromptFailureException;
import o.CacheDrawModifierNodeImpl1;
import o.CameraControlInternalCameraControlException;
import o.CameraProviderInitRetryPolicy;
import o.CameraRepository;
import o.CameraXExternalSyntheticLambda0;
import o.DrawModifierNodeKt;
import o.EncoderImplMediaCodecCallback;
import o.ImageCaptureMetadata;
import o.ImageUtilCodecFailedException;
import o.InitializationException;
import o.JpegCaptureDownsizingQuirk;
import o.OnePixelShiftQuirk;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewExternalSyntheticLambda0;
import o.PreviewFreezeAfterHighSpeedRecordingQuirk;
import o.ReportedVideoQualityNotSupportedQuirk;
import o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import o.SurfaceOrderQuirk;
import o.UseCaseAdditionSimulator;
import o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import o.VideoQualityQuirk;
import o.abandonFocus;
import o.access701;
import o.getDividerDrawable;
import o.getLastBaselineToBottomHeight;
import o.getLayoutResource;
import o.getNavigationIcon;
import o.getOuterActionMenuPresenter;
import o.getTextOff;
import o.getThumbDrawable;
import o.getThumbPosition;
import o.getThumbTextPadding;
import o.getThumbTintList;
import o.getViewPortScaleType;
import o.getWeightSum;
import o.mapToBase;
import o.nativeGetYUVImageVUOff;
import o.obtainShadowContext;
import o.onDetachedFromWindow;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.play;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.setContentDrawScopeui;
import o.setDropDownVerticalOffset;
import o.setInflatedId;
import o.setOnInflateListener;
import o.setTextSize;
import o.setTitleMarginBottom;
import o.setVerticalGravity;

/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraControlImpl implements ImageCaptureMetadata {
    public int ComponentActivity;
    public final FlowLayoutBuildingBlocks$WrapInfo IconCompatParcelizer;
    public final setDropDownVerticalOffset MediaBrowserCompatMediaItem;
    public final PreviewFreezeAfterHighSpeedRecordingQuirk MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public volatile int MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public volatile DrawModifierNodeKt MediaSessionCompatToken;
    public final setDropDownVerticalOffset ParcelableVolumeInfo;
    public final Object PlaybackStateCompat = new Object();
    public final FocusMeteringControl PlaybackStateCompatCustomAction;
    public final setTextSize RatingCompat;
    public final abandonFocus RemoteActionCompatParcelizer;
    public final getDividerDrawable ResultReceiver;
    public final UseCaseAdditionSimulator r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public setTitleMarginBottom r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final AtomicLong r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public volatile int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public volatile int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final Recorder$3 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public final TorchControl r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public final getThumbTextPadding r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public final ZoomControl r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public final CacheDrawModifierNodeImpl1 read;
    public final getThumbTintList serializer;
    public final AbstractClickableNodeonPointerEvent1 write;

    @Override // o.ImageCaptureMetadata
    public final void serializer(setTitleMarginBottom settitlemarginbottom) {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = settitlemarginbottom;
    }

    public static int serializer(getThumbTintList getthumbtintlist, int i) {
        int[] iArr = (int[]) getthumbtintlist.write(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (read(iArr, i)) {
            return i;
        }
        return read(iArr, 1) ? 1 : 0;
    }

    @Override // o.ImageCaptureMetadata
    public final void IconCompatParcelizer() {
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.write();
    }

    @Override // o.ImageCaptureMetadata
    public final void IconCompatParcelizer(InitializationException initializationException) {
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = this.read;
        CameraRepository cameraRepositorySerializer = CameraRepository.serializer(getOuterActionMenuPresenter.IconCompatParcelizer(initializationException).read);
        synchronized (cacheDrawModifierNodeImpl1.serializer) {
            getOuterActionMenuPresenter getouteractionmenupresenter = (getOuterActionMenuPresenter) cacheDrawModifierNodeImpl1.RatingCompat;
            getouteractionmenupresenter.getClass();
            play playVar = play.OPTIONAL;
            for (JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk : cameraRepositorySerializer.MediaBrowserCompatMediaItem()) {
                getouteractionmenupresenter.read.IconCompatParcelizer(jpegCaptureDownsizingQuirk, playVar, cameraRepositorySerializer.write(jpegCaptureDownsizingQuirk));
            }
        }
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            ((PreviewFreezeAfterHighSpeedRecordingQuirk) cacheDrawModifierNodeImpl1.MediaMetadataCompat).execute(new Camera2CameraControl$$ExternalSyntheticLambda1(cacheDrawModifierNodeImpl1, ondrawwithcontent, 1));
            ondrawwithcontent.RemoteActionCompatParcelizer = "addCaptureRequestOptions";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind).RemoteActionCompatParcelizer(new xr$$ExternalSyntheticLambda1(1), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    public final void IconCompatParcelizer(boolean z) {
        synchronized (this.ParcelableVolumeInfo.IconCompatParcelizer) {
            try {
                if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0120 A[Catch: all -> 0x0165, LOOP:0: B:60:0x011a->B:62:0x0120, LOOP_END, TryCatch #0 {, blocks: (B:59:0x010a, B:60:0x011a, B:62:0x0120, B:63:0x0130), top: B:72:0x010a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final mapToBase MediaBrowserCompatMediaItem() {
        int[] iArr;
        setDropDownVerticalOffset setdropdownverticaloffset;
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1;
        CameraProviderInitRetryPolicy cameraProviderInitRetryPolicy;
        play playVar;
        UseCaseAdditionSimulator useCaseAdditionSimulator = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        useCaseAdditionSimulator.serializer.MediaMetadataCompat = this.ComponentActivity;
        int i = 1;
        getOuterActionMenuPresenter getouteractionmenupresenter = new getOuterActionMenuPresenter(1);
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        play playVar2 = play.REQUIRED;
        getouteractionmenupresenter.read(key, 1, playVar2);
        FocusMeteringControl focusMeteringControl = this.PlaybackStateCompatCustomAction;
        int i2 = 3;
        getouteractionmenupresenter.read(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(focusMeteringControl.MediaDescriptionCompat.read(focusMeteringControl.ParcelableVolumeInfo ? 1 : focusMeteringControl.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != 3 ? 4 : 3)), playVar2);
        MeteringRectangle[] meteringRectangleArr = focusMeteringControl.RemoteActionCompatParcelizer;
        if (meteringRectangleArr.length != 0) {
            getouteractionmenupresenter.read(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, playVar2);
        }
        MeteringRectangle[] meteringRectangleArr2 = focusMeteringControl.serializer;
        if (meteringRectangleArr2.length != 0) {
            getouteractionmenupresenter.read(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, playVar2);
        }
        MeteringRectangle[] meteringRectangleArr3 = focusMeteringControl.MediaBrowserCompatMediaItem;
        if (meteringRectangleArr3.length != 0) {
            getouteractionmenupresenter.read(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, playVar2);
        }
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.write.IconCompatParcelizer(getouteractionmenupresenter);
        int i3 = this.PlaybackStateCompatCustomAction.MediaSessionCompatResultReceiverWrapper ? 5 : 1;
        if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
            int i4 = this.MediaSessionCompatQueueItem;
            if (i4 == 0) {
                FlowLayoutBuildingBlocks$WrapInfo flowLayoutBuildingBlocks$WrapInfo = this.IconCompatParcelizer;
                if (flowLayoutBuildingBlocks$WrapInfo.serializer || flowLayoutBuildingBlocks$WrapInfo.IconCompatParcelizer) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            } else if (i4 != 1) {
                if (i4 == 2) {
                    i2 = 1;
                }
            }
            getouteractionmenupresenter.read(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(serializer(this.serializer, i2)), playVar2);
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.serializer.write(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!read(iArr, 1) && !read(iArr, 1))) {
                i = 0;
            }
            getouteractionmenupresenter.read(key2, Integer.valueOf(i), playVar2);
            setdropdownverticaloffset = this.MediaBrowserCompatMediaItem;
            setdropdownverticaloffset.getClass();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            synchronized (((setVerticalGravity) setdropdownverticaloffset.IconCompatParcelizer).read) {
            }
            getouteractionmenupresenter.read(key3, 0, playVar2);
            cacheDrawModifierNodeImpl1 = this.read;
            synchronized (cacheDrawModifierNodeImpl1.serializer) {
                cameraProviderInitRetryPolicy = ((getOuterActionMenuPresenter) cacheDrawModifierNodeImpl1.RatingCompat).read;
                playVar = play.ALWAYS_OVERRIDE;
                for (JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk : cameraProviderInitRetryPolicy.MediaBrowserCompatMediaItem()) {
                    getouteractionmenupresenter.read.IconCompatParcelizer(jpegCaptureDownsizingQuirk, playVar, cameraProviderInitRetryPolicy.write(jpegCaptureDownsizingQuirk));
                }
            }
            access701 access701Var = new access701(23, CameraRepository.serializer(getouteractionmenupresenter.read));
            abandonFocus abandonfocus = useCaseAdditionSimulator.serializer;
            abandonfocus.getClass();
            abandonfocus.RemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(access701Var);
            ((CameraControlInternalCameraControlException) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer.IconCompatParcelizer).IconCompatParcelizer.put("CameraControlSessionUpdateId", Long.valueOf(this.MediaMetadataCompat));
            return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer();
        }
        getouteractionmenupresenter.read(CaptureRequest.FLASH_MODE, 2, playVar2);
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 1) {
                getouteractionmenupresenter.read(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss), playVar2);
            } else if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 2) {
                getouteractionmenupresenter.read(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.serializer.write()), playVar2);
            }
        }
        i2 = i3;
        getouteractionmenupresenter.read(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(serializer(this.serializer, i2)), playVar2);
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.serializer.write(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i = 0;
        } else {
            i = 0;
        }
        getouteractionmenupresenter.read(key4, Integer.valueOf(i), playVar2);
        setdropdownverticaloffset = this.MediaBrowserCompatMediaItem;
        setdropdownverticaloffset.getClass();
        CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        synchronized (((setVerticalGravity) setdropdownverticaloffset.IconCompatParcelizer).read) {
            getouteractionmenupresenter.read(key5, 0, playVar2);
            cacheDrawModifierNodeImpl1 = this.read;
            synchronized (cacheDrawModifierNodeImpl1.serializer) {
                cameraProviderInitRetryPolicy = ((getOuterActionMenuPresenter) cacheDrawModifierNodeImpl1.RatingCompat).read;
                playVar = play.ALWAYS_OVERRIDE;
                while (r5.hasNext()) {
                    getouteractionmenupresenter.read.IconCompatParcelizer(jpegCaptureDownsizingQuirk, playVar, cameraProviderInitRetryPolicy.write(jpegCaptureDownsizingQuirk));
                }
                access701 access701Var2 = new access701(23, CameraRepository.serializer(getouteractionmenupresenter.read));
                abandonFocus abandonfocus2 = useCaseAdditionSimulator.serializer;
                abandonfocus2.getClass();
                abandonfocus2.RemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(access701Var2);
                ((CameraControlInternalCameraControlException) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer.IconCompatParcelizer).IconCompatParcelizer.put("CameraControlSessionUpdateId", Long.valueOf(this.MediaMetadataCompat));
                return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.ImageCaptureMetadata
    public final void MediaDescriptionCompat() {
        Recorder$3 recorder$3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        ((PreviewFreezeAfterHighSpeedRecordingQuirk) recorder$3.MediaBrowserCompatMediaItem).execute(new getTextOff(recorder$3, 1));
    }

    public final long MediaSessionCompatQueueItem() {
        this.MediaMetadataCompat = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getAndIncrement();
        this.RatingCompat.IconCompatParcelizer.PlaybackStateCompat();
        return this.MediaMetadataCompat;
    }

    public final boolean RatingCompat() {
        int i;
        synchronized (this.PlaybackStateCompat) {
            i = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        return i > 0;
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.PlaybackStateCompat) {
            int i = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i - 1;
        }
    }

    public final int read(int i) {
        int[] iArr = (int[]) this.serializer.write(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (read(iArr, i)) {
            return i;
        }
        if (read(iArr, 4)) {
            return 4;
        }
        return read(iArr, 1) ? 1 : 0;
    }

    @Override // o.ImageCaptureMetadata
    public final void read() {
        Recorder$3 recorder$3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        ((PreviewFreezeAfterHighSpeedRecordingQuirk) recorder$3.MediaBrowserCompatMediaItem).execute(new getTextOff(recorder$3, 0));
    }

    @Override // o.ImageCaptureMetadata
    public final void serializer() {
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = this.read;
        synchronized (cacheDrawModifierNodeImpl1.serializer) {
            cacheDrawModifierNodeImpl1.RatingCompat = new getOuterActionMenuPresenter(1);
        }
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            ((PreviewFreezeAfterHighSpeedRecordingQuirk) cacheDrawModifierNodeImpl1.MediaMetadataCompat).execute(new Camera2CameraControl$$ExternalSyntheticLambda1(cacheDrawModifierNodeImpl1, ondrawwithcontent, 0));
            ondrawwithcontent.RemoteActionCompatParcelizer = "clearCaptureRequestOptions";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind).RemoteActionCompatParcelizer(new xr$$ExternalSyntheticLambda1(1), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
    }

    @Override // o.ImageCaptureMetadata
    public final InitializationException write() {
        access701 access701Var;
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = this.read;
        synchronized (cacheDrawModifierNodeImpl1.serializer) {
            getOuterActionMenuPresenter getouteractionmenupresenter = (getOuterActionMenuPresenter) cacheDrawModifierNodeImpl1.RatingCompat;
            getouteractionmenupresenter.getClass();
            access701Var = new access701(23, CameraRepository.serializer(getouteractionmenupresenter.read));
        }
        return access701Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:56:0x016d A[LOOP:5: B:54:0x0167->B:56:0x016d, LOOP_END] */
    public final void write(List list) {
        CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda0;
        ArrayMap arrayMap;
        ArrayMap arrayMap2;
        int iRemoteActionCompatParcelizer;
        int i;
        Camera2CameraImpl camera2CameraImpl = this.RatingCompat.IconCompatParcelizer;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nativeGetYUVImageVUOff nativegetyuvimagevuoff = (nativeGetYUVImageVUOff) it.next();
            HashSet hashSet = new HashSet();
            CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
            ArrayList arrayList2 = new ArrayList();
            CameraControlInternalCameraControlException.write();
            hashSet.addAll(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem);
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer(nativegetyuvimagevuoff.MediaDescriptionCompat);
            int i2 = nativegetyuvimagevuoff.MediaSessionCompatQueueItem;
            arrayList2.addAll(nativegetyuvimagevuoff.IconCompatParcelizer);
            boolean z = nativegetyuvimagevuoff.ParcelableVolumeInfo;
            OnePixelShiftQuirk onePixelShiftQuirk = nativegetyuvimagevuoff.RatingCompat;
            ArrayMap arrayMap3 = new ArrayMap();
            for (String str : onePixelShiftQuirk.IconCompatParcelizer.keySet()) {
                arrayMap3.put(str, onePixelShiftQuirk.IconCompatParcelizer.get(str));
            }
            CameraControlInternalCameraControlException cameraControlInternalCameraControlException = new CameraControlInternalCameraControlException(arrayMap3);
            boolean z2 = nativegetyuvimagevuoff.MediaMetadataCompat;
            if (nativegetyuvimagevuoff.MediaSessionCompatQueueItem != 5 || (cameraXExternalSyntheticLambda0 = nativegetyuvimagevuoff.serializer) == null) {
                cameraXExternalSyntheticLambda0 = null;
            }
            CameraXExternalSyntheticLambda0 cameraXExternalSyntheticLambda1 = cameraXExternalSyntheticLambda0;
            if (!Collections.unmodifiableList(nativegetyuvimagevuoff.MediaBrowserCompatMediaItem).isEmpty() || !nativegetyuvimagevuoff.ParcelableVolumeInfo) {
                ArrayList arrayList3 = new ArrayList(hashSet);
                CameraRepository cameraRepositorySerializer = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                OnePixelShiftQuirk onePixelShiftQuirk2 = OnePixelShiftQuirk.read;
                arrayMap = new ArrayMap();
                arrayMap2 = cameraControlInternalCameraControlException.IconCompatParcelizer;
                for (String str2 : arrayMap2.keySet()) {
                    arrayMap.put(str2, arrayMap2.get(str2));
                }
                arrayList.add(new nativeGetYUVImageVUOff(arrayList3, cameraRepositorySerializer, i2, z2, arrayList4, z, new OnePixelShiftQuirk(arrayMap), cameraXExternalSyntheticLambda1));
            } else if (hashSet.isEmpty()) {
                NetworkHeaders$Builder networkHeaders$Builder = camera2CameraImpl.addObserverForBackInvoker;
                networkHeaders$Builder.getClass();
                ArrayList arrayList5 = new ArrayList();
                for (Map.Entry entry : networkHeaders$Builder.serializer.entrySet()) {
                    SurfaceOrderQuirk surfaceOrderQuirk = (SurfaceOrderQuirk) entry.getValue();
                    if (surfaceOrderQuirk.RemoteActionCompatParcelizer && surfaceOrderQuirk.serializer) {
                        arrayList5.add(((SurfaceOrderQuirk) entry.getValue()).IconCompatParcelizer);
                    }
                }
                Iterator it2 = Collections.unmodifiableCollection(arrayList5).iterator();
                while (it2.hasNext()) {
                    nativeGetYUVImageVUOff nativegetyuvimagevuoff2 = ((mapToBase) it2.next()).MediaDescriptionCompat;
                    List listUnmodifiableList = Collections.unmodifiableList(nativegetyuvimagevuoff2.MediaBrowserCompatMediaItem);
                    if (!listUnmodifiableList.isEmpty()) {
                        if (nativegetyuvimagevuoff2.read() != 0 && (i = nativegetyuvimagevuoff2.read()) != 0) {
                            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, Integer.valueOf(i));
                        }
                        if (nativegetyuvimagevuoff2.RemoteActionCompatParcelizer() != 0 && (iRemoteActionCompatParcelizer = nativegetyuvimagevuoff2.RemoteActionCompatParcelizer()) != 0) {
                            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(ImageUtilCodecFailedException.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, Integer.valueOf(iRemoteActionCompatParcelizer));
                        }
                        Iterator it3 = listUnmodifiableList.iterator();
                        while (it3.hasNext()) {
                            hashSet.add((PreviewExternalSyntheticLambda0) it3.next());
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    setInflatedId.read("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                } else {
                    ArrayList arrayList6 = new ArrayList(hashSet);
                    CameraRepository cameraRepositorySerializer2 = CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer);
                    ArrayList arrayList7 = new ArrayList(arrayList2);
                    OnePixelShiftQuirk onePixelShiftQuirk3 = OnePixelShiftQuirk.read;
                    arrayMap = new ArrayMap();
                    arrayMap2 = cameraControlInternalCameraControlException.IconCompatParcelizer;
                    while (r5.hasNext()) {
                        arrayMap.put(str2, arrayMap2.get(str2));
                    }
                    arrayList.add(new nativeGetYUVImageVUOff(arrayList6, cameraRepositorySerializer2, i2, z2, arrayList7, z, new OnePixelShiftQuirk(arrayMap), cameraXExternalSyntheticLambda1));
                }
            } else {
                setInflatedId.read("Camera2CameraImpl", "The capture config builder already has surface inside.");
            }
        }
        camera2CameraImpl.write("Issue capture request");
        camera2CameraImpl.PlaybackStateCompat.IconCompatParcelizer((List) arrayList);
    }

    @Override // o.ImageCaptureMetadata
    public final void write(UseCaseAdditionSimulator useCaseAdditionSimulator) {
        StreamConfigurationMap streamConfigurationMap;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap2;
        int[] validOutputFormatsForInput;
        abandonFocus abandonfocus = useCaseAdditionSimulator.serializer;
        getThumbTextPadding getthumbtextpadding = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk = getthumbtextpadding.read;
        getThumbTintList getthumbtintlist = getthumbtextpadding.serializer;
        getthumbtextpadding.write();
        if (getthumbtextpadding.RatingCompat) {
            abandonfocus.MediaMetadataCompat = 1;
            return;
        }
        if (getthumbtextpadding.MediaDescriptionCompat) {
            abandonfocus.MediaMetadataCompat = 1;
            return;
        }
        try {
            streamConfigurationMap = (StreamConfigurationMap) getthumbtintlist.write(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            setInflatedId.serializer("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new AudioEncoderIgnoresInputTimestampQuirk(true));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (getthumbtextpadding.write && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap2 = (StreamConfigurationMap) getthumbtintlist.write(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) != null) {
            for (int i2 : validOutputFormatsForInput) {
                if (i2 == 256) {
                    Size size = (Size) map.get(34);
                    getLayoutResource getlayoutresource = new getLayoutResource(size.getWidth(), size.getHeight(), 34, 9);
                    AuthPromptFailureException authPromptFailureException = new AuthPromptFailureException(getlayoutresource);
                    Surface surfaceRatingCompat = authPromptFailureException.RatingCompat();
                    Objects.requireNonNull(surfaceRatingCompat);
                    o.Camera2CameraFactory camera2CameraFactory = new o.Camera2CameraFactory(surfaceRatingCompat, new Size(authPromptFailureException.MediaDescriptionCompat(), authPromptFailureException.RemoteActionCompatParcelizer()), 34);
                    NavArgsLazy navArgsLazy = new NavArgsLazy(previewFreezeAfterHighSpeedRecordingQuirk);
                    getthumbtextpadding.MediaMetadataCompat = authPromptFailureException;
                    getthumbtextpadding.MediaSessionCompatQueueItem = camera2CameraFactory;
                    getthumbtextpadding.MediaBrowserCompatMediaItem = navArgsLazy;
                    authPromptFailureException.RemoteActionCompatParcelizer(new StreamSharing$$ExternalSyntheticLambda0(4, getthumbtextpadding), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.RemoteActionCompatParcelizer());
                    VideoQualityQuirk.write((DrawModifierNodeKt) camera2CameraFactory.ParcelableVolumeInfo).RemoteActionCompatParcelizer(new CameraX$$ExternalSyntheticLambda2(authPromptFailureException, 11, navArgsLazy), previewFreezeAfterHighSpeedRecordingQuirk);
                    useCaseAdditionSimulator.serializer(camera2CameraFactory, getNavigationIcon.MediaDescriptionCompat, -1);
                    setOnInflateListener setoninflatelistener = getlayoutresource.RemoteActionCompatParcelizer;
                    abandonfocus.read(setoninflatelistener);
                    ArrayList arrayList = useCaseAdditionSimulator.MediaDescriptionCompat;
                    if (!arrayList.contains(setoninflatelistener)) {
                        arrayList.add(setoninflatelistener);
                    }
                    getThumbPosition getthumbposition = new getThumbPosition(0, navArgsLazy);
                    ArrayList arrayList2 = useCaseAdditionSimulator.RatingCompat;
                    if (!arrayList2.contains(getthumbposition)) {
                        arrayList2.add(getthumbposition);
                    }
                    useCaseAdditionSimulator.IconCompatParcelizer = new InputConfiguration(authPromptFailureException.MediaDescriptionCompat(), authPromptFailureException.RemoteActionCompatParcelizer(), authPromptFailureException.MediaBrowserCompatMediaItem());
                    return;
                }
            }
        }
        abandonfocus.MediaMetadataCompat = 1;
    }

    public final void write(onDetachedFromWindow ondetachedfromwindow) {
        ((HashSet) this.ResultReceiver.read).add(ondetachedfromwindow);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        getViewPortScaleType getviewportscaletype;
        setInflatedId.IconCompatParcelizer(3, "Camera2CameraControlImp");
        FocusMeteringControl focusMeteringControl = this.PlaybackStateCompatCustomAction;
        if (z != focusMeteringControl.PlaybackStateCompat) {
            focusMeteringControl.PlaybackStateCompat = z;
            if (!focusMeteringControl.PlaybackStateCompat) {
                focusMeteringControl.RemoteActionCompatParcelizer();
            }
        }
        ZoomControl zoomControl = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (zoomControl.IconCompatParcelizer != z) {
            zoomControl.IconCompatParcelizer = z;
            if (!z) {
                synchronized (zoomControl.serializer) {
                    zoomControl.serializer.RemoteActionCompatParcelizer(1.0f);
                    getviewportscaletype = getViewPortScaleType.read(zoomControl.serializer);
                }
                zoomControl.read(getviewportscaletype);
                zoomControl.write.serializer();
                zoomControl.read.MediaSessionCompatQueueItem();
            }
        }
        setDropDownVerticalOffset setdropdownverticaloffset = this.ParcelableVolumeInfo;
        if (setdropdownverticaloffset.serializer != z) {
            setdropdownverticaloffset.serializer = z;
        }
        TorchControl torchControl = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i = torchControl.RemoteActionCompatParcelizer;
        if (torchControl.MediaBrowserCompatMediaItem != z) {
            torchControl.MediaBrowserCompatMediaItem = z;
            if (!z) {
                if (torchControl.RatingCompat) {
                    torchControl.RatingCompat = false;
                    torchControl.read.write(0);
                    torchControl.IconCompatParcelizer(0);
                    AndroidGraphicsContext2 androidGraphicsContext2 = torchControl.MediaMetadataCompat;
                    Integer numValueOf = Integer.valueOf(i);
                    if (PrematureEndOfStreamVideoQuirk.read()) {
                        androidGraphicsContext2.RemoteActionCompatParcelizer(numValueOf);
                    } else {
                        androidGraphicsContext2.serializer(numValueOf);
                    }
                }
                onDrawWithContent ondrawwithcontent = torchControl.serializer;
                if (ondrawwithcontent != null) {
                    ondrawwithcontent.serializer(new CameraControl$OperationCanceledException("Camera is not active."));
                    torchControl.serializer = null;
                }
            }
        }
        setDropDownVerticalOffset setdropdownverticaloffset2 = this.MediaBrowserCompatMediaItem;
        if (z != setdropdownverticaloffset2.serializer) {
            setdropdownverticaloffset2.serializer = z;
            if (!z) {
                synchronized (((setVerticalGravity) setdropdownverticaloffset2.IconCompatParcelizer).read) {
                }
            }
        }
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = this.read;
        ((PreviewFreezeAfterHighSpeedRecordingQuirk) cacheDrawModifierNodeImpl1.MediaMetadataCompat).execute(new pNP$$ExternalSyntheticLambda5(cacheDrawModifierNodeImpl1, z, 2));
        if (z) {
            return;
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        ((AtomicInteger) this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.RemoteActionCompatParcelizer).set(0);
        setInflatedId.IconCompatParcelizer(3, "VideoUsageControl");
    }

    public Camera2CameraControlImpl(getThumbTintList getthumbtintlist, ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk, PreviewFreezeAfterHighSpeedRecordingQuirk previewFreezeAfterHighSpeedRecordingQuirk, setTextSize settextsize, u$a u_a) {
        UseCaseAdditionSimulator useCaseAdditionSimulator = new UseCaseAdditionSimulator();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = useCaseAdditionSimulator;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 0;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 0;
        this.MediaSessionCompatQueueItem = 2;
        this.MediaSessionCompatResultReceiverWrapper = true;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new AtomicLong(0L);
        this.MediaSessionCompatToken = EncoderImplMediaCodecCallback.IconCompatParcelizer;
        this.ComponentActivity = 1;
        this.MediaMetadataCompat = 0L;
        AbstractClickableNodeonPointerEvent1 abstractClickableNodeonPointerEvent1 = new AbstractClickableNodeonPointerEvent1();
        abstractClickableNodeonPointerEvent1.read = new HashSet();
        abstractClickableNodeonPointerEvent1.write = new ArrayMap();
        this.write = abstractClickableNodeonPointerEvent1;
        this.serializer = getthumbtintlist;
        this.RatingCompat = settextsize;
        this.MediaDescriptionCompat = previewFreezeAfterHighSpeedRecordingQuirk;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new Recorder$3(previewFreezeAfterHighSpeedRecordingQuirk);
        getDividerDrawable getdividerdrawable = new getDividerDrawable(previewFreezeAfterHighSpeedRecordingQuirk);
        this.ResultReceiver = getdividerdrawable;
        useCaseAdditionSimulator.serializer.MediaMetadataCompat = this.ComponentActivity;
        useCaseAdditionSimulator.serializer.read(new getWeightSum(getdividerdrawable));
        useCaseAdditionSimulator.serializer.read(abstractClickableNodeonPointerEvent1);
        setDropDownVerticalOffset setdropdownverticaloffset = new setDropDownVerticalOffset();
        setdropdownverticaloffset.serializer = false;
        setVerticalGravity setverticalgravity = new setVerticalGravity();
        setverticalgravity.read = new Object();
        setdropdownverticaloffset.IconCompatParcelizer = setverticalgravity;
        this.MediaBrowserCompatMediaItem = setdropdownverticaloffset;
        this.PlaybackStateCompatCustomAction = new FocusMeteringControl(this, reportedVideoQualityNotSupportedQuirk, previewFreezeAfterHighSpeedRecordingQuirk, u_a);
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new ZoomControl(this, getthumbtintlist, previewFreezeAfterHighSpeedRecordingQuirk);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new TorchControl(this, getthumbtintlist, previewFreezeAfterHighSpeedRecordingQuirk);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = getthumbtintlist.write();
        setDropDownVerticalOffset setdropdownverticaloffset2 = new setDropDownVerticalOffset();
        new AtomicInteger(-1);
        setdropdownverticaloffset2.IconCompatParcelizer = new Object();
        boolean zWrite = setDropDownVerticalOffset.write(getthumbtintlist);
        new AndroidGraphicsContext2(-1);
        onDetachedFromWindow ondetachedfromwindow = new onDetachedFromWindow() { // from class: o.setSearchView
            @Override // o.onDetachedFromWindow
            public final boolean RemoteActionCompatParcelizer(TotalCaptureResult totalCaptureResult) {
                return false;
            }
        };
        if (zWrite) {
            write(ondetachedfromwindow);
        }
        this.ParcelableVolumeInfo = setdropdownverticaloffset2;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new getThumbTextPadding(getthumbtintlist, previewFreezeAfterHighSpeedRecordingQuirk);
        this.IconCompatParcelizer = new FlowLayoutBuildingBlocks$WrapInfo(u_a, 1);
        this.read = new CacheDrawModifierNodeImpl1(this, previewFreezeAfterHighSpeedRecordingQuirk);
        this.RemoteActionCompatParcelizer = new abandonFocus(this, getthumbtintlist, u_a, previewFreezeAfterHighSpeedRecordingQuirk, reportedVideoQualityNotSupportedQuirk);
    }

    public static boolean read(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    @Override // o.ImageCaptureMetadata
    public final void IconCompatParcelizer(int i) {
        if (!RatingCompat()) {
            setInflatedId.read("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.MediaSessionCompatQueueItem = i;
        setInflatedId.IconCompatParcelizer(3, "Camera2CameraControlImp");
        getThumbTextPadding getthumbtextpadding = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        int i2 = 0;
        boolean z = true;
        if (this.MediaSessionCompatQueueItem != 1 && this.MediaSessionCompatQueueItem != 0) {
            z = false;
        }
        getthumbtextpadding.IconCompatParcelizer = z;
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            this.MediaDescriptionCompat.execute(new getLastBaselineToBottomHeight(this, ondrawwithcontent, i2));
            ondrawwithcontent.RemoteActionCompatParcelizer = "updateSessionConfigAsync";
        } catch (Exception e) {
            ondrawbehind.write(e);
        }
        this.MediaSessionCompatToken = VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind);
    }

    public final void write(int i) {
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = i;
        if (i == 0) {
            abandonFocus abandonfocus = new abandonFocus();
            abandonfocus.MediaMetadataCompat = this.ComponentActivity;
            abandonfocus.RatingCompat = true;
            CameraProviderInitRetryPolicy cameraProviderInitRetryPolicyRemoteActionCompatParcelizer = CameraProviderInitRetryPolicy.RemoteActionCompatParcelizer();
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.CONTROL_AE_MODE), Integer.valueOf(serializer(this.serializer, 1)));
            cameraProviderInitRetryPolicyRemoteActionCompatParcelizer.IconCompatParcelizer(access701.serializer(CaptureRequest.FLASH_MODE), 0);
            abandonfocus.RemoteActionCompatParcelizer(new access701(23, CameraRepository.serializer(cameraProviderInitRetryPolicyRemoteActionCompatParcelizer)));
            write(Collections.singletonList(abandonfocus.IconCompatParcelizer()));
        }
        MediaSessionCompatQueueItem();
    }

    public static boolean serializer(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof OnePixelShiftQuirk) && (l = (Long) ((OnePixelShiftQuirk) tag).IconCompatParcelizer.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    @Override // o.ImageCaptureMetadata
    public final DrawModifierNodeKt RemoteActionCompatParcelizer(final int i) {
        if (RatingCompat()) {
            final int i2 = this.MediaSessionCompatQueueItem;
            return VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(VideoQualityQuirk.write(this.MediaSessionCompatToken)), new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk() { // from class: o.access901
                @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
                public final DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
                    abandonFocus abandonfocus = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
                    int i3 = i;
                    int i4 = i2;
                    return VideoQualityQuirk.read(new getMinWidthMinor(abandonfocus.read(i3, i4, 1), (PreviewFreezeAfterHighSpeedRecordingQuirk) abandonfocus.IconCompatParcelizer, i4));
                }
            }, this.MediaDescriptionCompat);
        }
        setInflatedId.read("Camera2CameraControlImp", "Camera is not active.");
        return new EncoderImplMediaCodecCallback(0, new CameraControl$OperationCanceledException("Camera is not active."));
    }

    @Override // o.ImageCaptureMetadata
    public final DrawModifierNodeKt read(final ArrayList arrayList, final int i, final int i2) {
        if (RatingCompat()) {
            final int i3 = this.MediaSessionCompatQueueItem;
            return VideoQualityQuirk.serializer(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(VideoQualityQuirk.write(this.MediaSessionCompatToken)), new StopCodecAfterSurfaceRemovalCrashMediaServerQuirk() { // from class: o.onTextChanged
                @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
                public final DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
                    abandonFocus abandonfocus = this.write.RemoteActionCompatParcelizer;
                    int i4 = i;
                    int i5 = i3;
                    getFixedWidthMajor getfixedwidthmajor = abandonfocus.read(i4, i5, i2);
                    VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer = VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.IconCompatParcelizer(getfixedwidthmajor.serializer(i5));
                    getMinWidthMajor getminwidthmajor = new getMinWidthMajor(getfixedwidthmajor, i5, arrayList);
                    Executor executor = getfixedwidthmajor.read;
                    StretchedVideoResolutionQuirk stretchedVideoResolutionQuirkSerializer = VideoQualityQuirk.serializer(videoEncoderSuspendDoesNotIncludeSuspendTimeQuirkIconCompatParcelizer, getminwidthmajor, executor);
                    stretchedVideoResolutionQuirkSerializer.RemoteActionCompatParcelizer(new Preview$$ExternalSyntheticLambda0(6, getfixedwidthmajor), executor);
                    return VideoQualityQuirk.write((DrawModifierNodeKt) stretchedVideoResolutionQuirkSerializer);
                }
            }, this.MediaDescriptionCompat);
        }
        setInflatedId.read("Camera2CameraControlImp", "Camera is not active.");
        return new EncoderImplMediaCodecCallback(0, new CameraControl$OperationCanceledException("Camera is not active."));
    }

    @Override // o.ImageCaptureMetadata
    public final DrawModifierNodeKt IconCompatParcelizer(FocusMeteringAction focusMeteringAction) {
        if (!RatingCompat()) {
            return new EncoderImplMediaCodecCallback(0, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        try {
            if (!((Boolean) UtilsKt.RemoteActionCompatParcelizer(new StreamSharing$$ExternalSyntheticLambda0(1, this)).serializer.get()).booleanValue()) {
                return new EncoderImplMediaCodecCallback(0, new CameraControl$OperationCanceledException("Repeating request is not available possibly because it's disable for the ImageCapture."));
            }
            FocusMeteringControl focusMeteringControl = this.PlaybackStateCompatCustomAction;
            focusMeteringControl.getClass();
            onDrawWithContent ondrawwithcontent = new onDrawWithContent();
            ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
            onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
            ondrawwithcontent.read = ondrawbehind;
            ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
            try {
                focusMeteringControl.MediaSessionCompatQueueItem.execute(new WorkerKt$$ExternalSyntheticLambda2(focusMeteringControl, ondrawwithcontent, focusMeteringAction, 3));
                ondrawwithcontent.RemoteActionCompatParcelizer = "startFocusAndMetering";
            } catch (Exception e) {
                ondrawbehind.write(e);
            }
            return VideoQualityQuirk.write((DrawModifierNodeKt) ondrawbehind);
        } catch (InterruptedException | ExecutionException e2) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unable to check if repeating request is available.", e2);
            return null;
        }
    }

    @Override // o.ImageCaptureMetadata
    public final DrawModifierNodeKt read(float f) {
        DrawModifierNodeKt encoderImplMediaCodecCallback;
        getViewPortScaleType getviewportscaletype;
        if (!RatingCompat()) {
            return new EncoderImplMediaCodecCallback(0, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        ZoomControl zoomControl = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        synchronized (zoomControl.serializer) {
            try {
                zoomControl.serializer.read(f);
                getviewportscaletype = getViewPortScaleType.read(zoomControl.serializer);
            } catch (IllegalArgumentException e) {
                encoderImplMediaCodecCallback = new EncoderImplMediaCodecCallback(0, e);
            }
        }
        zoomControl.read(getviewportscaletype);
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            zoomControl.RemoteActionCompatParcelizer.execute(new getThumbDrawable(zoomControl, ondrawwithcontent, getviewportscaletype, 1));
            ondrawwithcontent.RemoteActionCompatParcelizer = "setLinearZoom";
            encoderImplMediaCodecCallback = ondrawbehind;
        } catch (Exception e2) {
            ondrawbehind.write(e2);
            encoderImplMediaCodecCallback = ondrawbehind;
        }
        return VideoQualityQuirk.write(encoderImplMediaCodecCallback);
    }

    @Override // o.ImageCaptureMetadata
    public final DrawModifierNodeKt read(final boolean z) {
        DrawModifierNodeKt drawModifierNodeKtRemoteActionCompatParcelizer;
        if (!RatingCompat()) {
            return new EncoderImplMediaCodecCallback(0, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final TorchControl torchControl = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        if (torchControl.write) {
            torchControl.IconCompatParcelizer(z ? 1 : 0);
            final int i = z ? 1 : 0;
            drawModifierNodeKtRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(new obtainShadowContext() { // from class: o.setTextOnInternal
                @Override // o.obtainShadowContext
                public final Object serializer(onDrawWithContent ondrawwithcontent) {
                    androidx.camera.camera2.internal.TorchControl torchControl2 = torchControl;
                    torchControl2.IconCompatParcelizer.execute(new renderUrlIntoViewlambda1(torchControl2, ondrawwithcontent, i));
                    return "enableTorch: " + z;
                }
            });
        } else {
            setInflatedId.IconCompatParcelizer(3, "TorchControl");
            drawModifierNodeKtRemoteActionCompatParcelizer = new EncoderImplMediaCodecCallback(0, new IllegalStateException("No flash unit"));
        }
        return VideoQualityQuirk.write(drawModifierNodeKtRemoteActionCompatParcelizer);
    }

    @Override // o.ImageCaptureMetadata
    public final DrawModifierNodeKt serializer(float f) {
        DrawModifierNodeKt encoderImplMediaCodecCallback;
        getViewPortScaleType getviewportscaletype;
        int i = 0;
        if (!RatingCompat()) {
            return new EncoderImplMediaCodecCallback(0, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        ZoomControl zoomControl = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        synchronized (zoomControl.serializer) {
            try {
                zoomControl.serializer.RemoteActionCompatParcelizer(f);
                getviewportscaletype = getViewPortScaleType.read(zoomControl.serializer);
            } catch (IllegalArgumentException e) {
                encoderImplMediaCodecCallback = new EncoderImplMediaCodecCallback(0, e);
            }
        }
        zoomControl.read(getviewportscaletype);
        onDrawWithContent ondrawwithcontent = new onDrawWithContent();
        ondrawwithcontent.IconCompatParcelizer = new setContentDrawScopeui();
        onDrawBehind ondrawbehind = new onDrawBehind(ondrawwithcontent);
        ondrawwithcontent.read = ondrawbehind;
        ondrawwithcontent.RemoteActionCompatParcelizer = m1$$ExternalSyntheticOutline0.class;
        try {
            zoomControl.RemoteActionCompatParcelizer.execute(new getThumbDrawable(zoomControl, ondrawwithcontent, getviewportscaletype, i));
            ondrawwithcontent.RemoteActionCompatParcelizer = "setZoomRatio";
            encoderImplMediaCodecCallback = ondrawbehind;
        } catch (Exception e2) {
            ondrawbehind.write(e2);
            encoderImplMediaCodecCallback = ondrawbehind;
        }
        return VideoQualityQuirk.write(encoderImplMediaCodecCallback);
    }
}
