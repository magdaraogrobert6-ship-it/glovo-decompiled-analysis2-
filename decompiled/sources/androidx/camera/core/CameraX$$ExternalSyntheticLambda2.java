package androidx.camera.core;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageWriter;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.biometric.BiometricFragment;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.camera2.internal.FocusMeteringControl;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.impl.CameraRepository;
import androidx.navigation.NavArgsLazy;
import androidx.sqlite.SQLite;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.ut;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.AbstractClickableNodeonPointerEvent1;
import o.AndroidGraphicsContext2;
import o.AuthPromptFailureException;
import o.BiometricFragmentExternalSyntheticLambda7;
import o.CameraUseCaseAdapter;
import o.CameraValidatorCameraIdListIncorrectException;
import o.ExtraSupportedOutputSizeQuirk;
import o.ImageCapture1;
import o.ImageCaptureFailWithAutoFlashQuirk;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.IncorrectCaptureStateQuirk;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewExternalSyntheticLambda0;
import o.StillCaptureFlashStopRepeatingQuirk;
import o.SurfaceOrderQuirk;
import o.awaitNavigationRoutes;
import o.clear;
import o.getContentInsetRight;
import o.getCurrentContentInsetRight;
import o.getDifferencertfAjoo;
import o.getDividerDrawable;
import o.getInflatedId;
import o.getLayoutResource;
import o.getNavButtonView;
import o.getPrompt;
import o.getQueryParameterslambda2;
import o.getSurfaceClass;
import o.mapToBase;
import o.onContentCardDismissed;
import o.onDetachedFromWindow;
import o.onDrawWithContent;
import o.onForwardedEvent;
import o.setDropDownHorizontalOffset;
import o.setInflatedId;
import o.setPrompt;
import o.setSelector;
import o.setSubtitleTextColor;
import o.toString;
import o.unregisterComponentCallback;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CameraX$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ CameraX$$ExternalSyntheticLambda2(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.IconCompatParcelizer = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        int i = 2;
        int i2 = 1;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                getCurrentContentInsetRight getcurrentcontentinsetright = (getCurrentContentInsetRight) this.read;
                onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.IconCompatParcelizer;
                Camera2CameraFactory camera2CameraFactory = getcurrentcontentinsetright.RemoteActionCompatParcelizer;
                Camera2CameraCoordinator camera2CameraCoordinator = camera2CameraFactory.IconCompatParcelizer;
                synchronized (camera2CameraCoordinator.MediaMetadataCompat) {
                    camera2CameraCoordinator.MediaBrowserCompatMediaItem.clear();
                    camera2CameraCoordinator.IconCompatParcelizer.clear();
                    camera2CameraCoordinator.serializer.clear();
                    camera2CameraCoordinator.read.clear();
                    camera2CameraCoordinator.write = 0;
                    break;
                }
                camera2CameraFactory.MediaMetadataCompat.IconCompatParcelizer();
                if (getcurrentcontentinsetright.ComponentActivity != null) {
                    Executor executor = getcurrentcontentinsetright.read;
                    if (executor instanceof getContentInsetRight) {
                        getContentInsetRight getcontentinsetright = (getContentInsetRight) executor;
                        synchronized (getcontentinsetright.RemoteActionCompatParcelizer) {
                            if (!getcontentinsetright.serializer.isShutdown()) {
                                getcontentinsetright.serializer.shutdown();
                            }
                        }
                    }
                    getcurrentcontentinsetright.ComponentActivity.quit();
                    break;
                }
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
                return;
            case 1:
                getDifferencertfAjoo getdifferencertfajoo = (getDifferencertfAjoo) this.read;
                try {
                    ((Runnable) this.IconCompatParcelizer).run();
                    return;
                } finally {
                    getdifferencertfajoo.RemoteActionCompatParcelizer();
                }
            case 2:
                BiometricFragment biometricFragment = (BiometricFragment) this.read;
                setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) this.IconCompatParcelizer;
                getPrompt getprompt = biometricFragment.write;
                if (getprompt.RatingCompat == null) {
                    getprompt.RatingCompat = new setPrompt();
                }
                getprompt.RatingCompat.IconCompatParcelizer(setdropdownhorizontaloffset);
                return;
            case 3:
                Camera2CameraControlImpl camera2CameraControlImpl = (Camera2CameraControlImpl) this.read;
                StillCaptureFlashStopRepeatingQuirk stillCaptureFlashStopRepeatingQuirk = (StillCaptureFlashStopRepeatingQuirk) this.IconCompatParcelizer;
                AbstractClickableNodeonPointerEvent1 abstractClickableNodeonPointerEvent1 = camera2CameraControlImpl.write;
                ((HashSet) abstractClickableNodeonPointerEvent1.read).remove(stillCaptureFlashStopRepeatingQuirk);
                ((ArrayMap) abstractClickableNodeonPointerEvent1.write).remove(stillCaptureFlashStopRepeatingQuirk);
                return;
            case 4:
                getDividerDrawable getdividerdrawable = (getDividerDrawable) this.read;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) this.IconCompatParcelizer;
                HashSet hashSet = new HashSet();
                HashSet<onDetachedFromWindow> hashSet2 = (HashSet) getdividerdrawable.read;
                for (onDetachedFromWindow ondetachedfromwindow : hashSet2) {
                    if (ondetachedfromwindow.RemoteActionCompatParcelizer(totalCaptureResult)) {
                        hashSet.add(ondetachedfromwindow);
                    }
                }
                if (hashSet.isEmpty()) {
                    return;
                }
                hashSet2.removeAll(hashSet);
                return;
            case 5:
                Surface surface = (Surface) this.read;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.IconCompatParcelizer;
                surface.release();
                surfaceTexture.release();
                return;
            case 6:
                Camera2CameraImpl camera2CameraImpl = (Camera2CameraImpl) this.read;
                String str = (String) this.IconCompatParcelizer;
                camera2CameraImpl.write("Use case " + str + " INACTIVE");
                LinkedHashMap linkedHashMap = camera2CameraImpl.addObserverForBackInvoker.serializer;
                if (linkedHashMap.containsKey(str)) {
                    SurfaceOrderQuirk surfaceOrderQuirk = (SurfaceOrderQuirk) linkedHashMap.get(str);
                    surfaceOrderQuirk.RemoteActionCompatParcelizer = false;
                    if (!surfaceOrderQuirk.serializer) {
                        linkedHashMap.remove(str);
                    }
                }
                camera2CameraImpl.PlaybackStateCompat();
                return;
            case 7:
                ((awaitNavigationRoutes) this.read).IconCompatParcelizer((mapToBase) this.IconCompatParcelizer, CameraUseCaseAdapter.SESSION_ERROR_SURFACE_NEEDS_RESET);
                return;
            case 8:
                ((HashSet) ((Camera2CameraControlImpl) this.read).ResultReceiver.read).remove((onForwardedEvent) this.IconCompatParcelizer);
                return;
            case 9:
                setSelector setselector = (setSelector) this.read;
                onDrawWithContent ondrawwithcontent2 = (onDrawWithContent) this.IconCompatParcelizer;
                try {
                    String[] strArrRemoteActionCompatParcelizer = setselector.write.RemoteActionCompatParcelizer();
                    strArrRemoteActionCompatParcelizer.getClass();
                    ArrayList arrayList = new ArrayList(strArrRemoteActionCompatParcelizer.length);
                    for (String str2 : strArrRemoteActionCompatParcelizer) {
                        str2.getClass();
                        arrayList.add(new getNavButtonView((ArrayList) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), -866125098, new Object[]{new String[]{str2}}, getQueryParameterslambda2.serializer(), 866125100, getQueryParameterslambda2.serializer()), null));
                    }
                    onContentCardDismissed.IconCompatParcelizer(arrayList, null, null, null, null, 63);
                    setselector.serializer(arrayList, (CameraUnavailableException) null);
                    ondrawwithcontent2.RemoteActionCompatParcelizer(arrayList);
                    return;
                } catch (CameraAccessExceptionCompat e) {
                    SentryLogcatAdapter.read("Camera2PresenceSrc", "[FetchData] Failed to get camera list for refresh.", e);
                    CameraUnavailableException cameraUnavailableException = new CameraUnavailableException(e);
                    setselector.serializer((ArrayList) null, cameraUnavailableException);
                    ondrawwithcontent2.serializer(cameraUnavailableException);
                    return;
                }
            case 10:
                ((FocusMeteringControl) this.read).RemoteActionCompatParcelizer((onDrawWithContent) this.IconCompatParcelizer);
                return;
            case 11:
                AuthPromptFailureException authPromptFailureException = (AuthPromptFailureException) this.read;
                NavArgsLazy navArgsLazy = (NavArgsLazy) this.IconCompatParcelizer;
                authPromptFailureException.MediaSessionCompatQueueItem();
                ((AtomicBoolean) navArgsLazy.read).set(false);
                ImageWriter imageWriter = (ImageWriter) navArgsLazy.MediaSessionCompatQueueItem;
                if (imageWriter != null) {
                    imageWriter.close();
                    return;
                }
                return;
            case 12:
                ((getSurfaceClass) this.IconCompatParcelizer).RemoteActionCompatParcelizer((ut) this.read);
                return;
            case 13:
                AuthPromptFailureException authPromptFailureException2 = (AuthPromptFailureException) this.read;
                AuthPromptFailureException authPromptFailureException3 = (AuthPromptFailureException) this.IconCompatParcelizer;
                authPromptFailureException2.MediaSessionCompatQueueItem();
                if (authPromptFailureException3 != null) {
                    authPromptFailureException3.MediaSessionCompatQueueItem();
                    return;
                }
                return;
            case 14:
                ((getSurfaceClass) this.IconCompatParcelizer).RemoteActionCompatParcelizer((getLayoutResource) this.read);
                return;
            case 15:
                ((BiometricFragmentExternalSyntheticLambda7) this.read).RemoteActionCompatParcelizer((SurfaceRequest) this.IconCompatParcelizer);
                return;
            case 16:
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read;
                getInflatedId getinflatedid = (getInflatedId) this.IconCompatParcelizer;
                ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.write;
                PrematureEndOfStreamVideoQuirk.write();
                if (imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat) {
                    getinflatedid.close();
                    return;
                }
                UtilsKt.RemoteActionCompatParcelizer("onImageCaptured() must be called before onFinalResult()", imageCaptureFailWithAutoFlashQuirk.IconCompatParcelizer.serializer.isDone());
                imageCaptureFailWithAutoFlashQuirk.RemoteActionCompatParcelizer();
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = imageCaptureFailWithAutoFlashQuirk.MediaDescriptionCompat;
                extraSupportedOutputSizeQuirk.IconCompatParcelizer.execute(new pNP$$ExternalSyntheticLambda0(extraSupportedOutputSizeQuirk, getinflatedid, i2));
                return;
            case 17:
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk2 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read;
                ImageCapture$1 imageCapture$1 = (ImageCapture$1) this.IconCompatParcelizer;
                ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk2 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk2.write;
                PrematureEndOfStreamVideoQuirk.write();
                if (imageCaptureFailWithAutoFlashQuirk2.MediaMetadataCompat) {
                    return;
                }
                UtilsKt.RemoteActionCompatParcelizer("onImageCaptured() must be called before onFinalResult()", imageCaptureFailWithAutoFlashQuirk2.IconCompatParcelizer.serializer.isDone());
                imageCaptureFailWithAutoFlashQuirk2.RemoteActionCompatParcelizer();
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk2 = imageCaptureFailWithAutoFlashQuirk2.MediaDescriptionCompat;
                extraSupportedOutputSizeQuirk2.IconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(extraSupportedOutputSizeQuirk2, 22, imageCapture$1));
                return;
            case 18:
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk3 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read;
                Bitmap bitmap = (Bitmap) this.IconCompatParcelizer;
                ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk3 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk3.write;
                PrematureEndOfStreamVideoQuirk.write();
                if (imageCaptureFailWithAutoFlashQuirk3.MediaMetadataCompat) {
                    return;
                }
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk3 = imageCaptureFailWithAutoFlashQuirk3.MediaDescriptionCompat;
                extraSupportedOutputSizeQuirk3.IconCompatParcelizer.execute(new pNP$$ExternalSyntheticLambda0(extraSupportedOutputSizeQuirk3, bitmap, i));
                return;
            case 19:
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk4 = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) this.read;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.IconCompatParcelizer;
                ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk4 = imageCaptureFailedWhenVideoCaptureIsBoundQuirk4.write;
                PrematureEndOfStreamVideoQuirk.write();
                if (imageCaptureFailWithAutoFlashQuirk4.MediaMetadataCompat) {
                    return;
                }
                UtilsKt.RemoteActionCompatParcelizer("onImageCaptured() must be called before onFinalResult()", imageCaptureFailWithAutoFlashQuirk4.IconCompatParcelizer.serializer.isDone());
                imageCaptureFailWithAutoFlashQuirk4.RemoteActionCompatParcelizer();
                PrematureEndOfStreamVideoQuirk.write();
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk4 = imageCaptureFailWithAutoFlashQuirk4.MediaDescriptionCompat;
                extraSupportedOutputSizeQuirk4.IconCompatParcelizer.execute(new CameraX$$ExternalSyntheticLambda2(extraSupportedOutputSizeQuirk4, 21, imageCaptureException));
                return;
            case 20:
                ((IncorrectCaptureStateQuirk) this.read).IconCompatParcelizer.remove((ImageCaptureFailWithAutoFlashQuirk) this.IconCompatParcelizer);
                return;
            case 21:
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk5 = (ExtraSupportedOutputSizeQuirk) this.read;
                ImageCaptureException imageCaptureException2 = (ImageCaptureException) this.IconCompatParcelizer;
                setSubtitleTextColor setsubtitletextcolor = extraSupportedOutputSizeQuirk5.MediaSessionCompatQueueItem;
                if (setsubtitletextcolor != null) {
                    setsubtitletextcolor.write(imageCaptureException2);
                    return;
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("One and only one callback is allowed.");
                    return;
                }
            case 22:
                ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk6 = (ExtraSupportedOutputSizeQuirk) this.read;
                ImageCapture$1 imageCapture$2 = (ImageCapture$1) this.IconCompatParcelizer;
                setSubtitleTextColor setsubtitletextcolor2 = extraSupportedOutputSizeQuirk6.MediaSessionCompatQueueItem;
                Objects.requireNonNull(setsubtitletextcolor2);
                Objects.requireNonNull(imageCapture$2);
                setsubtitletextcolor2.IconCompatParcelizer(imageCapture$2);
                return;
            case 23:
                ((ImageCapture1) this.read).MediaMetadataCompat().write().RemoteActionCompatParcelizer((unregisterComponentCallback) this.IconCompatParcelizer);
                return;
            case 24:
                ((o.FocusMeteringAction) this.read).write().read((o.ImageProcessingUtil) this.IconCompatParcelizer);
                return;
            case 25:
                CameraRepository cameraRepository = (CameraRepository) this.read;
                ImageCapture1 imageCapture1 = (ImageCapture1) this.IconCompatParcelizer;
                synchronized (cameraRepository.write) {
                    cameraRepository.MediaSessionCompatQueueItem.remove(imageCapture1);
                    if (cameraRepository.MediaSessionCompatQueueItem.isEmpty()) {
                        cameraRepository.RemoteActionCompatParcelizer.getClass();
                        cameraRepository.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(null);
                        cameraRepository.RemoteActionCompatParcelizer = null;
                        cameraRepository.IconCompatParcelizer = null;
                    }
                    break;
                }
                return;
            case 26:
                clear clearVar = (clear) this.read;
                CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException = (CameraValidatorCameraIdListIncorrectException) this.IconCompatParcelizer;
                try {
                    cameraValidatorCameraIdListIncorrectException.IconCompatParcelizer(clearVar.RemoteActionCompatParcelizer.write);
                    return;
                } catch (InterruptedException | ExecutionException e2) {
                    cameraValidatorCameraIdListIncorrectException.IconCompatParcelizer(e2);
                    return;
                }
            case 27:
                PreviewExternalSyntheticLambda0 previewExternalSyntheticLambda0 = (PreviewExternalSyntheticLambda0) this.read;
                String str3 = (String) this.IconCompatParcelizer;
                try {
                    previewExternalSyntheticLambda0.ParcelableVolumeInfo.get();
                    PreviewExternalSyntheticLambda0.serializer.decrementAndGet();
                    PreviewExternalSyntheticLambda0.MediaBrowserCompatMediaItem.get();
                    previewExternalSyntheticLambda0.MediaDescriptionCompat();
                    return;
                } catch (Exception e3) {
                    setInflatedId.serializer("DeferrableSurface", "Unexpected surface termination for " + previewExternalSyntheticLambda0 + "\nStack Trace:\n" + str3);
                    synchronized (previewExternalSyntheticLambda0.MediaSessionCompatResultReceiverWrapper) {
                        try {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", previewExternalSyntheticLambda0, Boolean.valueOf(previewExternalSyntheticLambda0.MediaSessionCompatQueueItem), Integer.valueOf(previewExternalSyntheticLambda0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)), e3);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            case 28:
                NavArgsLazy navArgsLazy2 = (NavArgsLazy) this.read;
                CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException2 = (CameraValidatorCameraIdListIncorrectException) this.IconCompatParcelizer;
                toString tostring = (toString) ((AndroidGraphicsContext2) navArgsLazy2.MediaSessionCompatQueueItem).IconCompatParcelizer();
                if (tostring == null) {
                    return;
                }
                cameraValidatorCameraIdListIncorrectException2.IconCompatParcelizer(tostring.RemoteActionCompatParcelizer);
                return;
            default:
                NavArgsLazy navArgsLazy3 = (NavArgsLazy) this.read;
                onDrawWithContent ondrawwithcontent3 = (onDrawWithContent) this.IconCompatParcelizer;
                toString tostring2 = (toString) ((AndroidGraphicsContext2) navArgsLazy3.MediaSessionCompatQueueItem).IconCompatParcelizer();
                if (tostring2 == null) {
                    ondrawwithcontent3.serializer(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    ondrawwithcontent3.RemoteActionCompatParcelizer(tostring2.RemoteActionCompatParcelizer);
                    return;
                }
        }
    }
}
