package androidx.camera.core;

import android.hardware.camera2.CameraDevice;
import android.os.Process;
import androidx.biometric.BiometricFragment;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.lifecycle.BlockRunner;
import androidx.navigation.NavArgsLazy;
import androidx.work.WorkerKt$$ExternalSyntheticLambda2;
import coil3.util.UtilsKt;
import com.airbnb.lottie.parser.DropShadowEffect;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.ut;
import com.sentiance.core.model.thrift.k$c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import o.AndroidGraphicsContext2;
import o.AnimatedContentMeasurePolicy;
import o.AnimatedVisibilityKtAnimatedVisibilityImpl11;
import o.AuthenticatorUtils;
import o.CacheDrawModifierNodeImpl1;
import o.CombinedClickableElement;
import o.DrawModifierNodeKt;
import o.EnterExitTransitionKtshrinkVertically2;
import o.ImageCaptureFailWithAutoFlashQuirk;
import o.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk;
import o.ObjectListtoString1;
import o.PrematureEndOfStreamVideoQuirk;
import o.PreviewGreenTintQuirk;
import o.PreviewView1ExternalSyntheticLambda2;
import o.SurfaceViewNotCroppedByParentQuirk;
import o.VideoQualityQuirk;
import o.ViewRootForInspectorDefaultImpls;
import o.getDefaultDisplay;
import o.getFixedWidthMajor;
import o.getInflatedId;
import o.getMaxCardElevation;
import o.getPrompt;
import o.getThumbScrollRange;
import o.maxIntrinsicHeight;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;
import o.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import o.setBaselineAligned;
import o.setBrightness;
import o.setCompoundDrawablesWithIntrinsicBounds;
import o.setInflatedId;
import o.setNavigationIcon;
import o.setOnInflateListener;
import o.setPrompt;
import o.setTextFuture;
import o.setTextMetricsParamsCompat;
import o.setTextSize;
import o.setTitleMarginBottom;
import o.toImageConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Preview$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ Preview$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.read = obj;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: all -> 0x00db, TryCatch #2 {, blocks: (B:33:0x00af, B:34:0x00b5, B:35:0x00b9, B:37:0x00bf, B:39:0x00cd, B:40:0x00d9), top: B:157:0x00af }] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.write) {
            case 0:
                ((AuthenticatorUtils) this.read).ParcelableVolumeInfo();
                return;
            case 1:
                r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = (r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) this.read;
                Runnable runnable = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.RemoteActionCompatParcelizer;
                if (runnable != null) {
                    runnable.run();
                    r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.RemoteActionCompatParcelizer = null;
                    return;
                }
                return;
            case 2:
                super/*android.app.Dialog*/.onBackPressed();
                return;
            case 3:
                getPrompt getprompt = ((BiometricFragment) this.read).write;
                if (getprompt.RatingCompat == null) {
                    getprompt.RatingCompat = new setPrompt();
                }
                getprompt.RatingCompat.getClass();
                return;
            case 4:
                ((CameraDevice) this.read).close();
                return;
            case 5:
                toImageConfig toimageconfig = (toImageConfig) this.read;
                if (toimageconfig.serializer) {
                    return;
                }
                UtilsKt.RemoteActionCompatParcelizer((String) null, ((setTextMetricsParamsCompat) toimageconfig.write).RatingCompat._init_lambda1 == setTextFuture.REOPENING || ((setTextMetricsParamsCompat) toimageconfig.write).RatingCompat._init_lambda1 == setTextFuture.REOPENING_QUIRK);
                boolean zSerializer = ((setTextMetricsParamsCompat) toimageconfig.write).serializer();
                Camera2CameraImpl camera2CameraImpl = ((setTextMetricsParamsCompat) toimageconfig.write).RatingCompat;
                if (zSerializer) {
                    camera2CameraImpl.read(true);
                    return;
                } else {
                    camera2CameraImpl.serializer(true);
                    return;
                }
            case 6:
                ((getFixedWidthMajor) this.read).write.serializer();
                return;
            case 7:
                ((setTitleMarginBottom) this.read).read();
                return;
            case 8:
                setBaselineAligned setbaselinealigned = (setBaselineAligned) this.read;
                synchronized (setbaselinealigned.MediaSessionCompatResultReceiverWrapper) {
                    if (setbaselinealigned.write.isEmpty()) {
                        return;
                    }
                    try {
                        setbaselinealigned.write(setbaselinealigned.write);
                        setbaselinealigned.write.clear();
                        return;
                    } catch (Throwable th) {
                        setbaselinealigned.write.clear();
                        throw th;
                    }
                }
            case 9:
                for (getThumbScrollRange getthumbscrollrange : (LinkedHashSet) this.read) {
                    getthumbscrollrange.getClass();
                    getthumbscrollrange.RemoteActionCompatParcelizer(getthumbscrollrange);
                }
                return;
            case 10:
                CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1 = (CacheDrawModifierNodeImpl1) this.read;
                onDrawWithContent ondrawwithcontent = (onDrawWithContent) cacheDrawModifierNodeImpl1.IconCompatParcelizer;
                if (ondrawwithcontent != null) {
                    ondrawwithcontent.RemoteActionCompatParcelizer(null);
                    cacheDrawModifierNodeImpl1.IconCompatParcelizer = null;
                    return;
                }
                return;
            case 11:
                Runnable runnable2 = (Runnable) this.read;
                Process.setThreadPriority(-3);
                runnable2.run();
                return;
            case 12:
                setNavigationIcon setnavigationicon = (setNavigationIcon) this.read;
                synchronized (setnavigationicon.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) {
                    setnavigationicon.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = null;
                    getInflatedId getinflatedid = setnavigationicon.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    if (getinflatedid != null) {
                        setnavigationicon.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = null;
                        setnavigationicon.serializer(getinflatedid);
                    }
                    break;
                }
                return;
            case 13:
                ImageCaptureFailedWhenVideoCaptureIsBoundQuirk imageCaptureFailedWhenVideoCaptureIsBoundQuirk = (ImageCaptureFailedWhenVideoCaptureIsBoundQuirk) ((BlockRunner) ((setOnInflateListener) this.read).read).read;
                if (imageCaptureFailedWhenVideoCaptureIsBoundQuirk != null) {
                    ImageCaptureFailWithAutoFlashQuirk imageCaptureFailWithAutoFlashQuirk = imageCaptureFailedWhenVideoCaptureIsBoundQuirk.write;
                    PrematureEndOfStreamVideoQuirk.write();
                    if (imageCaptureFailWithAutoFlashQuirk.MediaMetadataCompat || imageCaptureFailWithAutoFlashQuirk.RatingCompat) {
                        return;
                    }
                    imageCaptureFailWithAutoFlashQuirk.RatingCompat = true;
                    return;
                }
                return;
            case 14:
                setCompoundDrawablesWithIntrinsicBounds setcompounddrawableswithintrinsicbounds = (setCompoundDrawablesWithIntrinsicBounds) this.read;
                if (setcompounddrawableswithintrinsicbounds.read._init_lambda1 == setTextFuture.PENDING_OPEN || setcompounddrawableswithintrinsicbounds.read._init_lambda1 == setTextFuture.OPENING_WITH_ERROR) {
                    setcompounddrawableswithintrinsicbounds.read.serializer(false);
                    return;
                }
                return;
            case 15:
                setTextSize settextsize = (setTextSize) this.read;
                if (settextsize.IconCompatParcelizer._init_lambda1 == setTextFuture.OPENED) {
                    settextsize.IconCompatParcelizer.MediaSessionCompatToken();
                    return;
                }
                return;
            case 16:
                ((onDrawBehind) this.read).cancel(true);
                return;
            case 17:
                ((SurfaceViewNotCroppedByParentQuirk) this.read).close();
                return;
            case 18:
                PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2 = (PreviewView1ExternalSyntheticLambda2) this.read;
                previewView1ExternalSyntheticLambda2.RatingCompat = true;
                previewView1ExternalSyntheticLambda2.read();
                return;
            case 19:
                ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls = (ViewRootForInspectorDefaultImpls) ((NavArgsLazy) this.read).RatingCompat;
                if (viewRootForInspectorDefaultImpls != null) {
                    Iterator it = viewRootForInspectorDefaultImpls.values().iterator();
                    while (it.hasNext()) {
                        ((setBrightness) it.next()).read();
                    }
                    return;
                }
                return;
            case 20:
                getMaxCardElevation getmaxcardelevation = (getMaxCardElevation) this.read;
                getmaxcardelevation.RatingCompat = true;
                getmaxcardelevation.write();
                return;
            case 21:
                ViewRootForInspectorDefaultImpls viewRootForInspectorDefaultImpls2 = (ViewRootForInspectorDefaultImpls) ((DropShadowEffect) this.read).serializer;
                if (viewRootForInspectorDefaultImpls2 != null) {
                    Iterator it2 = viewRootForInspectorDefaultImpls2.values().iterator();
                    while (it2.hasNext()) {
                        ((setBrightness) it2.next()).read();
                    }
                    return;
                }
                return;
            case 22:
                k$c k_c = (k$c) this.read;
                k_c.write();
                ObjectListtoString1 objectListtoString1 = (ObjectListtoString1) k_c.read;
                Set<AnimatedContentMeasurePolicy> setKeySet = (HashSet) k_c.MediaDescriptionCompat;
                synchronized (objectListtoString1.MediaSessionCompatQueueItem) {
                    if (setKeySet == null) {
                        setKeySet = objectListtoString1.RemoteActionCompatParcelizer.keySet();
                        while (r0.hasNext()) {
                            if (objectListtoString1.RemoteActionCompatParcelizer.containsKey(animatedContentMeasurePolicy)) {
                                objectListtoString1.RemoteActionCompatParcelizer((maxIntrinsicHeight) objectListtoString1.RemoteActionCompatParcelizer.get(animatedContentMeasurePolicy));
                            }
                        }
                        break;
                    } else {
                        for (AnimatedContentMeasurePolicy animatedContentMeasurePolicy : setKeySet) {
                            if (objectListtoString1.RemoteActionCompatParcelizer.containsKey(animatedContentMeasurePolicy)) {
                                objectListtoString1.RemoteActionCompatParcelizer((maxIntrinsicHeight) objectListtoString1.RemoteActionCompatParcelizer.get(animatedContentMeasurePolicy));
                            }
                        }
                        break;
                    }
                    throw th;
                }
                return;
            case 23:
                EnterExitTransitionKtshrinkVertically2 enterExitTransitionKtshrinkVertically2 = (EnterExitTransitionKtshrinkVertically2) ((i$d) this.read).read;
                if (enterExitTransitionKtshrinkVertically2.read) {
                    return;
                }
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                SurfaceRequest surfaceRequest = (SurfaceRequest) enterExitTransitionKtshrinkVertically2.RemoteActionCompatParcelizer;
                PreviewGreenTintQuirk previewGreenTintQuirk = (PreviewGreenTintQuirk) enterExitTransitionKtshrinkVertically2.MediaSessionCompatQueueItem;
                AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11 = (AnimatedVisibilityKtAnimatedVisibilityImpl11) enterExitTransitionKtshrinkVertically2.RatingCompat;
                Objects.toString(animatedVisibilityKtAnimatedVisibilityImpl11._init_lambda1);
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg r8lambdauosl1ojcz1lncaiooglfrbn5pcg = animatedVisibilityKtAnimatedVisibilityImpl11.defaultViewModelProviderFactory_delegatelambda0;
                r8lambdauosl1ojcz1lncaiooglfrbn5pcg.serializer();
                VideoQualityQuirk.write((DrawModifierNodeKt) r8lambdauosl1ojcz1lncaiooglfrbn5pcg.MediaSessionCompatToken).RemoteActionCompatParcelizer(new WorkerKt$$ExternalSyntheticLambda2(enterExitTransitionKtshrinkVertically2, surfaceRequest, previewGreenTintQuirk, 12), animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                return;
            case 24:
                ((VideoCapture) this.read).ParcelableVolumeInfo();
                return;
            case 25:
                ((onDrawWithContent) ((r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.read).PlaybackStateCompat).RemoteActionCompatParcelizer(null);
                return;
            case 26:
                ((EncoderImpl.MediaCodecCallback) this.read).read();
                return;
            case 27:
                ut utVar = (ut) this.read;
                synchronized (utVar.MediaBrowserCompatMediaItem) {
                    if (utVar.write) {
                        return;
                    }
                    setInflatedId.IconCompatParcelizer(3, "CameraController");
                    ((AndroidGraphicsContext2) utVar.RatingCompat).serializer(new CombinedClickableElement(0));
                    utVar.write = true;
                    return;
                }
            case 28:
                ((getDefaultDisplay) this.read).read();
                return;
            default:
                ((PreviewView$1$$ExternalSyntheticLambda2) this.read).serializer();
                return;
        }
    }
}
