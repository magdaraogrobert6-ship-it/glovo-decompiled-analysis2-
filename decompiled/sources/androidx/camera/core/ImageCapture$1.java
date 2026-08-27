package androidx.camera.core;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.camera.core.impl.UseCaseAdditionSimulator;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.BlockRunner;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.sentiance.okhttp3.u$a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ranges.RangesKt;
import o.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk;
import o.AlertControllerButtonHandler;
import o.AuthenticatorUtils;
import o.Camera2DeviceSurfaceManager;
import o.CameraNoResponseWhenEnablingFlashQuirk;
import o.CaptureIntentPreviewQuirk;
import o.CaptureNoResponseQuirk;
import o.CaptureSessionOnClosedNotCalledQuirk;
import o.DeferrableSurfaces;
import o.ImageVectorCacheImageVectorEntry;
import o.IntentSenderRequest;
import o.Keep;
import o.PreviewExternalSyntheticLambda0;
import o.SupportedSurfaceCombination;
import o.Toolbar4;
import o.TorchControl;
import o.VideoEncoderCrashQuirk;
import o.addCloseableactivity;
import o.dispatchResult;
import o.getAutoSizeMinTextSize;
import o.getCameraXConfig;
import o.getDrawerToggleDelegate;
import o.getInflatedId;
import o.getThumbScrollRange;
import o.getVisibilityRampUpAnimationDurationMillis;
import o.onContentCardDismissed;
import o.onLayout;
import o.onNightModeChanged;
import o.onSupportActionModeStarted;
import o.r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0;
import o.setBaselineAligned;
import o.setInflatedId;
import o.setLineHeight;
import o.setNavigationOnClickListener;
import o.setSupportCompoundDrawablesTintMode;
import o.setSupportProgressBarIndeterminateVisibility;
import o.setSupportProgressBarVisibility;
import o.setThumbTintList;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class ImageCapture$1 implements onLayout, getDrawerToggleDelegate, IntentSenderRequest, VideoEncoderCrashQuirk, DeferrableSurfaces, Toolbar4 {
    public static ImageCapture$1 MediaDescriptionCompat;
    public Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RatingCompat;

    public void MediaDescriptionCompat() {
        synchronized (this) {
            Storage storage = (Storage) this.MediaSessionCompatQueueItem;
            ReentrantLock reentrantLock = storage.RemoteActionCompatParcelizer;
            reentrantLock.lock();
            try {
                storage.read.edit().clear().apply();
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public Set serializer() {
        return Collections.EMPTY_SET;
    }

    public static ImageCapture$1 read(Context context) {
        ImageCapture$1 imageCapture$1;
        synchronized (ImageCapture$1.class) {
            Context applicationContext = context.getApplicationContext();
            synchronized (ImageCapture$1.class) {
                imageCapture$1 = MediaDescriptionCompat;
                if (imageCapture$1 == null) {
                    imageCapture$1 = new ImageCapture$1(applicationContext, 1);
                    MediaDescriptionCompat = imageCapture$1;
                }
            }
            return imageCapture$1;
        }
        return imageCapture$1;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    public static CameraNoResponseWhenEnablingFlashQuirk read(Camera2DeviceSurfaceManager camera2DeviceSurfaceManager, List list) {
        boolean z;
        String string;
        List<UseCase> list2 = list;
        boolean z2 = list2 instanceof Collection;
        boolean z3 = false;
        if (!z2 || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (((UseCase) it.next()) instanceof setNavigationOnClickListener) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (!z2 || !list2.isEmpty()) {
            for (UseCase useCase : list2) {
                if ((useCase instanceof AuthenticatorUtils) || CameraUseCaseAdapter.IconCompatParcelizer(useCase)) {
                    z3 = true;
                    break;
                }
            }
        }
        int i = AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.serializer[camera2DeviceSurfaceManager.write().ordinal()];
        if (i == 1) {
            string = TorchControl.IMAGE_CAPTURE.toString();
            if (z) {
                string = null;
            }
        } else {
            if (i != 2 && i != 3 && i != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            string = TorchControl.PREVIEW + " or " + TorchControl.VIDEO_CAPTURE;
            if (z3) {
                string = null;
            }
        }
        if (string != null) {
            return new CameraNoResponseWhenEnablingFlashQuirk(string, camera2DeviceSurfaceManager);
        }
        return null;
    }

    public static ImageCapture$1 serializer(o.FocusMeteringAction focusMeteringAction) {
        o.FocusMeteringAction focusMeteringActionR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = focusMeteringAction.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        UtilsKt.IconCompatParcelizer("CameraInfo doesn't contain Camera2 implementation.", focusMeteringActionR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus instanceof setLineHeight);
        return ((setLineHeight) focusMeteringActionR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).read;
    }

    @Override // o.Toolbar4
    public int IconCompatParcelizer() {
        return ((Image.Plane) this.MediaSessionCompatQueueItem).getRowStride();
    }

    @Override // o.onLayout
    public void IconCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        ((r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0) this.MediaSessionCompatQueueItem).r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.removeCallbacksAndMessages(alertControllerButtonHandler);
    }

    public void MediaMetadataCompat() {
        setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) this.MediaSessionCompatQueueItem;
        synchronized (setnavigationonclicklistener.MediaDescriptionCompat) {
            Integer num = (Integer) setnavigationonclicklistener.MediaDescriptionCompat.getAndSet(null);
            if (num == null) {
                return;
            }
            if (num.intValue() != setnavigationonclicklistener.read()) {
                setnavigationonclicklistener.MediaSessionCompatQueueItem();
            }
        }
    }

    @Override // o.Toolbar4
    public int RemoteActionCompatParcelizer() {
        return ((Image.Plane) this.MediaSessionCompatQueueItem).getPixelStride();
    }

    @Override // o.onLayout
    public void RemoteActionCompatParcelizer(AlertControllerButtonHandler alertControllerButtonHandler, Keep keep) {
        r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0 r8lambdatwvtypfkihdx0rbtwvlevvlt0 = (r8lambdaTWvtyPFkiHdx0RbtWVLevVLT0) this.MediaSessionCompatQueueItem;
        Handler handler = r8lambdatwvtypfkihdx0rbtwvlevvlt0.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = r8lambdatwvtypfkihdx0rbtwvlevvlt0.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (alertControllerButtonHandler == ((dispatchResult) arrayList.get(i)).serializer) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        handler.postAtTime(new ImageVectorCacheImageVectorEntry(this, i2 < arrayList.size() ? (dispatchResult) arrayList.get(i2) : null, keep, alertControllerButtonHandler, 1), alertControllerButtonHandler, SystemClock.uptimeMillis() + 200);
    }

    public CameraCharacteristics read(String str) throws CameraAccessExceptionCompat {
        try {
            try {
                return ((CameraManager) this.MediaSessionCompatQueueItem).getCameraCharacteristics(str);
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (RuntimeException e2) {
            if (IconCompatParcelizer(e2)) {
                throw new CameraAccessExceptionCompat(e2);
            }
            throw e2;
        }
    }

    @Override // o.DeferrableSurfaces
    public o.InitializationException read() {
        return (o.InitializationException) this.MediaSessionCompatQueueItem;
    }

    @Override // o.getDrawerToggleDelegate
    public boolean read(AlertControllerButtonHandler alertControllerButtonHandler) {
        onSupportActionModeStarted onsupportactionmodestarted = (onSupportActionModeStarted) this.MediaSessionCompatQueueItem;
        if (alertControllerButtonHandler == onsupportactionmodestarted.MediaBrowserCompatMediaItem) {
            return false;
        }
        ((onNightModeChanged) alertControllerButtonHandler).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.getClass();
        getDrawerToggleDelegate getdrawertoggledelegate = onsupportactionmodestarted.write;
        if (getdrawertoggledelegate != null) {
            return getdrawertoggledelegate.read(alertControllerButtonHandler);
        }
        return false;
    }

    @Override // o.IntentSenderRequest
    public boolean read(AlertControllerButtonHandler alertControllerButtonHandler, MenuItem menuItem) {
        setSupportProgressBarVisibility setsupportprogressbarvisibility = ((setSupportProgressBarIndeterminateVisibility) this.MediaSessionCompatQueueItem).RatingCompat;
        if (setsupportprogressbarvisibility != null) {
            Toolbar toolbar = ((setSupportCompoundDrawablesTintMode) setsupportprogressbarvisibility).RemoteActionCompatParcelizer;
            if (toolbar.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write(menuItem)) {
                return true;
            }
            getAutoSizeMinTextSize getautosizemintextsize = toolbar.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (getautosizemintextsize != null && ((addCloseableactivity) getautosizemintextsize).write.MediaSessionCompatQueueItem.onMenuItemSelected(0, menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Object write(CameraCharacteristics.Key key) {
        return ((setLineHeight) this.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer.write(key);
    }

    @Override // o.Toolbar4
    public ByteBuffer write() {
        return ((Image.Plane) this.MediaSessionCompatQueueItem).getBuffer();
    }

    public void write(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessExceptionCompat {
        try {
            ((CameraManager) this.MediaSessionCompatQueueItem).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new CameraAccessExceptionCompat(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (!IconCompatParcelizer(e4)) {
                throw e4;
            }
            throw new CameraAccessExceptionCompat(e4);
        }
    }

    @Override // o.IntentSenderRequest
    public void write(AlertControllerButtonHandler alertControllerButtonHandler) {
        IntentSenderRequest intentSenderRequest = ((setSupportProgressBarIndeterminateVisibility) this.MediaSessionCompatQueueItem).MediaSessionCompatQueueItem;
        if (intentSenderRequest != null) {
            intentSenderRequest.write(alertControllerButtonHandler);
        }
    }

    public ImageCapture$1(Context context, int i) {
        String str;
        this.RatingCompat = i;
        if (i == 15) {
            this.MediaSessionCompatQueueItem = (CameraManager) context.getSystemService("camera");
            return;
        }
        Storage storageIconCompatParcelizer = Storage.IconCompatParcelizer(context);
        this.MediaSessionCompatQueueItem = storageIconCompatParcelizer;
        storageIconCompatParcelizer.RemoteActionCompatParcelizer();
        String str2 = storageIconCompatParcelizer.read("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(str2) || (str = storageIconCompatParcelizer.read(Storage.RemoteActionCompatParcelizer("googleSignInOptions", str2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.serializer(str);
        } catch (JSONException unused) {
        }
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        int i = this.RatingCompat;
        if (i == 8) {
            return;
        }
        if (i == 9) {
            return;
        }
        if (i == 25) {
        } else if (i == 26) {
        } else {
            ((getVisibilityRampUpAnimationDurationMillis) this.MediaSessionCompatQueueItem).run();
        }
    }

    @Override // o.getDrawerToggleDelegate
    public void read(AlertControllerButtonHandler alertControllerButtonHandler, boolean z) {
        if (alertControllerButtonHandler instanceof onNightModeChanged) {
            ((onNightModeChanged) alertControllerButtonHandler).r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.IconCompatParcelizer().RemoteActionCompatParcelizer(false);
        }
        getDrawerToggleDelegate getdrawertoggledelegate = ((onSupportActionModeStarted) this.MediaSessionCompatQueueItem).write;
        if (getdrawertoggledelegate != null) {
            getdrawertoggledelegate.read(alertControllerButtonHandler, z);
        }
    }

    public CaptureIntentPreviewQuirk read(LegacySessionConfig legacySessionConfig, ArrayList arrayList, int i, List list) {
        if (i < arrayList.size()) {
            int i2 = i + 1;
            CaptureIntentPreviewQuirk captureIntentPreviewQuirk = read(legacySessionConfig, arrayList, i2, onContentCardDismissed.RemoteActionCompatParcelizer((Collection) list, arrayList.get(i)));
            return captureIntentPreviewQuirk instanceof CaptureNoResponseQuirk ? captureIntentPreviewQuirk : read(legacySessionConfig, arrayList, i2, list);
        }
        LinkedHashSet<Camera2DeviceSurfaceManager> linkedHashSet = RangesKt.read((Set) legacySessionConfig.MediaSessionCompatQueueItem, list);
        linkedHashSet.toString();
        Objects.toString((List) legacySessionConfig.RatingCompat);
        setInflatedId.IconCompatParcelizer(3, "DefaultFeatureGroupResolver");
        o.FocusMeteringAction focusMeteringAction = (o.FocusMeteringAction) this.MediaSessionCompatQueueItem;
        SupportedSurfaceCombination supportedSurfaceCombination = new SupportedSurfaceCombination(linkedHashSet);
        for (Camera2DeviceSurfaceManager camera2DeviceSurfaceManager : linkedHashSet) {
            if (!camera2DeviceSurfaceManager.IconCompatParcelizer(legacySessionConfig, focusMeteringAction)) {
                camera2DeviceSurfaceManager.toString();
                setInflatedId.IconCompatParcelizer(3, "CameraInfoInternal");
                return CaptureSessionOnClosedNotCalledQuirk.RemoteActionCompatParcelizer;
            }
        }
        try {
            UseCaseAdditionSimulator.read(focusMeteringAction, legacySessionConfig, supportedSurfaceCombination);
            return new CaptureNoResponseQuirk(new SupportedSurfaceCombination(linkedHashSet));
        } catch (CameraUseCaseAdapter.CameraException | IllegalArgumentException unused) {
            setInflatedId.IconCompatParcelizer(3, "CameraInfoInternal");
        }
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) throws Exception {
        getThumbScrollRange getthumbscrollrange;
        int i = this.RatingCompat;
        if (i == 8) {
            synchronized (((setBaselineAligned) this.MediaSessionCompatQueueItem).MediaSessionCompatResultReceiverWrapper) {
                ((setBaselineAligned) this.MediaSessionCompatQueueItem).ParcelableVolumeInfo.IconCompatParcelizer();
                int iOrdinal = ((setBaselineAligned) this.MediaSessionCompatQueueItem).MediaSessionCompatToken.ordinal();
                if ((iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6) && !(th instanceof CancellationException)) {
                    setInflatedId.RemoteActionCompatParcelizer("CaptureSession", "Opening session with fail " + ((setBaselineAligned) this.MediaSessionCompatQueueItem).MediaSessionCompatToken, th);
                    ((setBaselineAligned) this.MediaSessionCompatQueueItem).write();
                }
            }
            return;
        }
        if (i != 9) {
            if (i == 25) {
                ((getInflatedId) this.MediaSessionCompatQueueItem).close();
                return;
            } else {
                if (i != 26) {
                    return;
                }
                ((getCameraXConfig) this.MediaSessionCompatQueueItem).close();
                return;
            }
        }
        getThumbScrollRange getthumbscrollrange2 = (getThumbScrollRange) this.MediaSessionCompatQueueItem;
        synchronized (getthumbscrollrange2.MediaSessionCompatToken) {
            List list = getthumbscrollrange2.MediaSessionCompatQueueItem;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((PreviewExternalSyntheticLambda0) it.next()).serializer();
                }
                getthumbscrollrange2.MediaSessionCompatQueueItem = null;
            }
        }
        getthumbscrollrange2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        BlockRunner blockRunner = getthumbscrollrange2.RemoteActionCompatParcelizer;
        Iterator it2 = blockRunner.RatingCompat().iterator();
        while (it2.hasNext() && (getthumbscrollrange = (getThumbScrollRange) it2.next()) != getthumbscrollrange2) {
            synchronized (getthumbscrollrange.MediaSessionCompatToken) {
                List list2 = getthumbscrollrange.MediaSessionCompatQueueItem;
                if (list2 != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        ((PreviewExternalSyntheticLambda0) it3.next()).serializer();
                    }
                    getthumbscrollrange.MediaSessionCompatQueueItem = null;
                }
            }
            getthumbscrollrange.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.RemoteActionCompatParcelizer();
        }
        synchronized (blockRunner.serializer) {
            ((LinkedHashSet) blockRunner.RemoteActionCompatParcelizer).remove(getthumbscrollrange2);
        }
    }

    public static boolean IconCompatParcelizer(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        return Build.VERSION.SDK_INT == 28 && runtimeException.getClass().equals(RuntimeException.class) && (stackTrace = runtimeException.getStackTrace()) != null && stackTrace.length >= 0 && "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    public /* synthetic */ ImageCapture$1(int i, Object obj) {
        this.RatingCompat = i;
        this.MediaSessionCompatQueueItem = obj;
    }

    public ImageCapture$1(int i) {
        this.RatingCompat = i;
        if (i == 18) {
            this.MediaSessionCompatQueueItem = (ExtraSupportedSurfaceCombinationsQuirk) setThumbTintList.RemoteActionCompatParcelizer.read(ExtraSupportedSurfaceCombinationsQuirk.class);
        } else if (i != 22) {
            this.MediaSessionCompatQueueItem = (SmallDisplaySizeQuirk) setThumbTintList.RemoteActionCompatParcelizer.read(SmallDisplaySizeQuirk.class);
        }
    }

    public ImageCapture$1(u$a u_a, int i) {
        this.RatingCompat = i;
        if (i != 21) {
            this.MediaSessionCompatQueueItem = (androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk) u_a.read(androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class);
        } else {
            this.MediaSessionCompatQueueItem = (TorchFlashRequiredFor3aUpdateQuirk) u_a.read(TorchFlashRequiredFor3aUpdateQuirk.class);
        }
    }

    public ImageCapture$1(CameraCaptureSession cameraCaptureSession, int i) {
        this.RatingCompat = i;
        if (i != 11) {
            this.MediaSessionCompatQueueItem = new ImageCapture$1(cameraCaptureSession, 11);
        } else {
            cameraCaptureSession.getClass();
            this.MediaSessionCompatQueueItem = cameraCaptureSession;
        }
    }

    public ImageCapture$1(CameraDevice cameraDevice, int i) {
        this.RatingCompat = i;
        if (i != 14) {
            cameraDevice.getClass();
            this.MediaSessionCompatQueueItem = new ImageCapture$1(cameraDevice, 14);
        } else {
            cameraDevice.getClass();
            this.MediaSessionCompatQueueItem = cameraDevice;
        }
    }
}
