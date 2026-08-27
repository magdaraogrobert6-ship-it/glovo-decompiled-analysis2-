package o;

import android.graphics.SurfaceTexture;
import android.media.ImageWriter;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SessionConfig$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Crossfade implements Runnable {
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;

    public /* synthetic */ Crossfade(Object obj, int i, Object obj2) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        ScheduledFuture scheduledFuture;
        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl;
        animateDecay animatedecay;
        Executor executor;
        int i = 1;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                AnimatedVisibilityKtAnimatedVisibilityImpl11 animatedVisibilityKtAnimatedVisibilityImpl11 = (AnimatedVisibilityKtAnimatedVisibilityImpl11) this.read;
                InfiniteTransitionrun113 infiniteTransitionrun113 = (InfiniteTransitionrun113) this.serializer;
                InfiniteTransitionrun113 infiniteTransitionrun114 = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = infiniteTransitionrun113;
                if (infiniteTransitionrun114 == infiniteTransitionrun113) {
                    Objects.toString(infiniteTransitionrun113);
                    setInflatedId.IconCompatParcelizer(3, "Recorder");
                    return;
                }
                Objects.toString(infiniteTransitionrun113);
                setInflatedId.IconCompatParcelizer(3, "Recorder");
                if (infiniteTransitionrun113 != InfiniteTransitionrun113.INACTIVE) {
                    if (infiniteTransitionrun113 != InfiniteTransitionrun113.ACTIVE_NON_STREAMING || (scheduledFuture = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) == null || !scheduledFuture.cancel(false) || (encoderImpl = animatedVisibilityKtAnimatedVisibilityImpl11._init_lambda1) == null) {
                        return;
                    }
                    AnimatedVisibilityKtAnimatedVisibilityImpl11.IconCompatParcelizer(encoderImpl);
                    return;
                }
                if (animatedVisibilityKtAnimatedVisibilityImpl11.MediaMetadataCompat == null) {
                    EnterExitTransitionKtshrinkVertically2 enterExitTransitionKtshrinkVertically2 = animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                    if (enterExitTransitionKtshrinkVertically2 != null) {
                        if (!enterExitTransitionKtshrinkVertically2.read) {
                            enterExitTransitionKtshrinkVertically2.read = true;
                            ScheduledFuture scheduledFuture2 = (ScheduledFuture) enterExitTransitionKtshrinkVertically2.IconCompatParcelizer;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(false);
                                enterExitTransitionKtshrinkVertically2.IconCompatParcelizer = null;
                            }
                        }
                        animatedVisibilityKtAnimatedVisibilityImpl11.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = null;
                    }
                    animatedVisibilityKtAnimatedVisibilityImpl11.write();
                    return;
                }
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.read;
                toString tostring = (toString) this.serializer;
                CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException = (CameraValidatorCameraIdListIncorrectException) entry.getKey();
                tostring.getClass();
                cameraValidatorCameraIdListIncorrectException.IconCompatParcelizer(tostring.RemoteActionCompatParcelizer);
                return;
            case 2:
                NegativeLatLongSavesIncorrectlyQuirk.IconCompatParcelizer((NegativeLatLongSavesIncorrectlyQuirk) this.read, (accessunregisterComponentCallback) this.serializer);
                return;
            case 3:
                Preview$$ExternalSyntheticLambda0 preview$$ExternalSyntheticLambda0 = (Preview$$ExternalSyntheticLambda0) this.read;
                CountDownLatch countDownLatch = (CountDownLatch) this.serializer;
                try {
                    preview$$ExternalSyntheticLambda0.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 4:
                onDrawWithContent ondrawwithcontent = (onDrawWithContent) this.read;
                onDrawBehind ondrawbehind = (onDrawBehind) this.serializer;
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
                ondrawbehind.cancel(true);
                return;
            case 5:
                ((getThumbTintMode) this.read).onImageReleased((ImageWriter) this.serializer);
                return;
            case 6:
                PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2 = (PreviewView1ExternalSyntheticLambda2) this.read;
                SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk = (SurfaceViewNotCroppedByParentQuirk) this.serializer;
                Surface surfaceSerializer = surfaceViewNotCroppedByParentQuirk.serializer(previewView1ExternalSyntheticLambda2.IconCompatParcelizer, new updateWko1d7g(previewView1ExternalSyntheticLambda2, i, surfaceViewNotCroppedByParentQuirk));
                previewView1ExternalSyntheticLambda2.write.serializer(surfaceSerializer);
                previewView1ExternalSyntheticLambda2.MediaBrowserCompatMediaItem.put(surfaceViewNotCroppedByParentQuirk, surfaceSerializer);
                return;
            case 7:
                ((PreviewView1ExternalSyntheticLambda2) this.read).MediaDescriptionCompat.add((getSensorToViewTransform) this.serializer);
                return;
            case 8:
                final PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda3 = (PreviewView1ExternalSyntheticLambda2) this.read;
                final androidx.camera.core.SurfaceRequest surfaceRequest = (androidx.camera.core.SurfaceRequest) this.serializer;
                previewView1ExternalSyntheticLambda3.RemoteActionCompatParcelizer++;
                fromId fromid = previewView1ExternalSyntheticLambda3.write;
                setCardBackgroundColor.serializer(fromid.MediaMetadataCompat, true);
                setCardBackgroundColor.serializer(fromid.RatingCompat);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(fromid.MediaBrowserCompatMediaItem);
                android.util.Size size = surfaceRequest.MediaSessionCompatQueueItem;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface = new Surface(surfaceTexture);
                ReportedVideoQualityNotSupportedQuirk reportedVideoQualityNotSupportedQuirk = previewView1ExternalSyntheticLambda3.IconCompatParcelizer;
                surfaceRequest.IconCompatParcelizer(reportedVideoQualityNotSupportedQuirk, new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(previewView1ExternalSyntheticLambda3, 6, surfaceRequest));
                surfaceRequest.write(surface, reportedVideoQualityNotSupportedQuirk, new FocusOwnerImplmodifier1() { // from class: o.setScaleType
                    @Override // o.FocusOwnerImplmodifier1
                    public final void accept(Object obj) {
                        PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda4 = previewView1ExternalSyntheticLambda3;
                        androidx.camera.core.SurfaceRequest surfaceRequest2 = surfaceRequest;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface2 = surface;
                        synchronized (surfaceRequest2.MediaDescriptionCompat) {
                            surfaceRequest2.ResultReceiver = null;
                            surfaceRequest2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        previewView1ExternalSyntheticLambda4.RemoteActionCompatParcelizer--;
                        previewView1ExternalSyntheticLambda4.read();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(previewView1ExternalSyntheticLambda3, previewView1ExternalSyntheticLambda3.serializer);
                return;
            case 9:
                ((FocusOwnerImplmodifier1) ((AtomicReference) this.serializer).get()).accept(new getContentInsetEnd((SurfaceViewNotCroppedByParentQuirk) this.read));
                return;
            case 10:
                final getMaxCardElevation getmaxcardelevation = (getMaxCardElevation) this.read;
                androidx.camera.core.SurfaceRequest surfaceRequest2 = (androidx.camera.core.SurfaceRequest) this.serializer;
                getmaxcardelevation.read++;
                getPreventCornerOverlap getpreventcorneroverlap = getmaxcardelevation.RemoteActionCompatParcelizer;
                boolean z = surfaceRequest2.RatingCompat;
                android.util.Size size2 = surfaceRequest2.MediaSessionCompatQueueItem;
                setCardBackgroundColor.serializer(getpreventcorneroverlap.MediaMetadataCompat, true);
                setCardBackgroundColor.serializer(getpreventcorneroverlap.RatingCompat);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z ? getpreventcorneroverlap.PlaybackStateCompatCustomAction : getpreventcorneroverlap.ComponentActivity);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface2 = new Surface(surfaceTexture2);
                surfaceRequest2.write(surface2, getmaxcardelevation.IconCompatParcelizer, new FocusOwnerImplmodifier1() { // from class: o.getContentPaddingTop
                    @Override // o.FocusOwnerImplmodifier1
                    public final void accept(Object obj) {
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface2.release();
                        getMaxCardElevation getmaxcardelevation2 = getmaxcardelevation;
                        getmaxcardelevation2.read--;
                        getmaxcardelevation2.write();
                    }
                });
                if (z) {
                    getmaxcardelevation.MediaBrowserCompatMediaItem = surfaceTexture2;
                    return;
                } else {
                    getmaxcardelevation.MediaDescriptionCompat = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(getmaxcardelevation, getmaxcardelevation.serializer);
                    return;
                }
            case 11:
                getMaxCardElevation getmaxcardelevation2 = (getMaxCardElevation) this.read;
                SurfaceViewNotCroppedByParentQuirk surfaceViewNotCroppedByParentQuirk2 = (SurfaceViewNotCroppedByParentQuirk) this.serializer;
                Surface surfaceSerializer2 = surfaceViewNotCroppedByParentQuirk2.serializer(getmaxcardelevation2.IconCompatParcelizer, new updateWko1d7g(getmaxcardelevation2, 2, surfaceViewNotCroppedByParentQuirk2));
                getmaxcardelevation2.RemoteActionCompatParcelizer.serializer(surfaceSerializer2);
                getmaxcardelevation2.MediaSessionCompatQueueItem.put(surfaceViewNotCroppedByParentQuirk2, surfaceSerializer2);
                return;
            case 12:
                SupportedSurfaceCombination supportedSurfaceCombination = (SupportedSurfaceCombination) this.read;
                androidx.camera.core.LegacySessionConfig legacySessionConfig = (androidx.camera.core.LegacySessionConfig) this.serializer;
                HashSet hashSet = new HashSet();
                if (supportedSurfaceCombination != null) {
                    hashSet.addAll(supportedSurfaceCombination.IconCompatParcelizer);
                }
                ((SessionConfig$$ExternalSyntheticLambda1) legacySessionConfig.read).getClass();
                return;
            case 13:
                ((Executor) this.read).execute((Runnable) this.serializer);
                return;
            case 14:
                androidx.camera.video.VideoCapture videoCapture = (androidx.camera.video.VideoCapture) this.read;
                if (((PreviewExternalSyntheticLambda0) this.serializer) == videoCapture.serializer) {
                    videoCapture.read();
                    return;
                }
                return;
            case 15:
                Animatable animatable = (Animatable) this.read;
                UseCaseAdditionSimulator useCaseAdditionSimulator = (UseCaseAdditionSimulator) this.serializer;
                ((ArrayList) useCaseAdditionSimulator.serializer.write).remove(animatable);
                useCaseAdditionSimulator.MediaDescriptionCompat.remove(animatable);
                return;
            case 16:
                ((CrossfadeKtCrossfade51alpha2) ((r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.read).MediaDescriptionCompat).RemoteActionCompatParcelizer((Surface) this.serializer);
                return;
            case 17:
                ((androidx.camera.video.internal.encoder.EncoderImpl) this.read).MediaSessionCompatResultReceiverWrapper.remove((getHasInitialValueAnimations) this.serializer);
                return;
            case 18:
                Executor executor2 = (Executor) this.read;
                androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback = (androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback) this.serializer;
                Objects.requireNonNull(mediaCodecCallback);
                executor2.execute(new Preview$$ExternalSyntheticLambda0(26, mediaCodecCallback));
                return;
            case 19:
                ((androidx.camera.video.internal.encoder.EncoderImpl) this.read).write.remove((onDrawWithContent) this.serializer);
                return;
            case 20:
                ((CameraValidatorCameraIdListIncorrectException) ((Map.Entry) this.read).getKey()).IconCompatParcelizer((FloatTweenSpec) this.serializer);
                return;
            case 21:
                Transition transition = (Transition) this.read;
                CameraValidatorCameraIdListIncorrectException cameraValidatorCameraIdListIncorrectException2 = (CameraValidatorCameraIdListIncorrectException) this.serializer;
                LinkedHashMap linkedHashMap = transition.IconCompatParcelizer;
                cameraValidatorCameraIdListIncorrectException2.getClass();
                linkedHashMap.remove(cameraValidatorCameraIdListIncorrectException2);
                return;
            case 22:
                ((onDrawWithContent) this.serializer).RemoteActionCompatParcelizer(((Transition) this.read).serializer);
                return;
            case 23:
                ((CameraValidatorCameraIdListIncorrectException) this.read).IconCompatParcelizer((FloatTweenSpec) this.serializer);
                return;
            case 24:
                androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback2 = (androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback) this.read;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.serializer;
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl2 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                switch (encoderImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        encoderImpl2.read(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(encoderImpl2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                        return;
                }
            case 25:
                androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback mediaCodecCallback3 = (androidx.camera.video.internal.encoder.EncoderImpl.MediaCodecCallback) this.read;
                MediaFormat mediaFormat = (MediaFormat) this.serializer;
                boolean z2 = mediaCodecCallback3.MediaBrowserCompatMediaItem;
                androidx.camera.video.internal.encoder.EncoderImpl encoderImpl3 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                if (z2) {
                    setInflatedId.read(encoderImpl3._init_lambda1, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (encoderImpl3.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        androidx.camera.video.internal.encoder.EncoderImpl encoderImpl4 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                        if (encoderImpl4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY && encoderImpl4.write()) {
                            mediaFormat.setInteger("time-lapse-enable", 1);
                            mediaFormat.setInteger("time-lapse-fps", ((animateOneFrame) androidx.camera.video.internal.encoder.EncoderImpl.this.MediaBrowserCompatMediaItem).read);
                        }
                        synchronized (androidx.camera.video.internal.encoder.EncoderImpl.this.ResultReceiver) {
                            androidx.camera.video.internal.encoder.EncoderImpl encoderImpl5 = androidx.camera.video.internal.encoder.EncoderImpl.this;
                            animatedecay = encoderImpl5.MediaSessionCompatQueueItem;
                            executor = encoderImpl5.MediaDescriptionCompat;
                            break;
                        }
                        try {
                            executor.execute(new onTransitionEndanimation_core(animatedecay, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e) {
                            setInflatedId.read(androidx.camera.video.internal.encoder.EncoderImpl.this._init_lambda1, "Unable to post to the supplied executor.", e);
                            return;
                        }
                    default:
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(androidx.camera.video.internal.encoder.EncoderImpl.this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0, "Unknown state: ");
                        return;
                }
            case 26:
                ((animateDecay) this.read).serializer((animate) this.serializer);
                return;
            case 27:
                ((SpringSimulation) this.read).RemoteActionCompatParcelizer((Surface) this.serializer);
                return;
            case 28:
                ((getExtendedTouchPaddinghWWAJMo) this.read).MediaBrowserCompatMediaItem = (getLogoDescription) this.serializer;
                return;
            default:
                ((AndroidEdgeEffectOverscrollEffect) ((androidx.camera.view.PendingValue) this.read).serializer).MediaSessionCompatToken.RemoteActionCompatParcelizer((androidx.camera.core.SurfaceRequest) this.serializer);
                return;
        }
    }
}
