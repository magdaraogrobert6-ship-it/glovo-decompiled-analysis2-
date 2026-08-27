package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.os.Build;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import android.widget.EditText;
import android.widget.Magnifier;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.compose.foundation.lazy.LazyListMeasureResult;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.IntSize;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import coil3.util.UtilsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.net.zza;
import com.huawei.hmf.tasks.a.i$d;
import com.sentiance.okhttp3.u$a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractClickableNodehandlePressInteractionStart11;
import o.AndroidEdgeEffectOverscrollEffect;
import o.BackgroundKt;
import o.BiometricFragmentExternalSyntheticLambda7;
import o.ClickableElement;
import o.ClipboardUtils_androidKt;
import o.CombinedClickableNodehandleDownEvent2;
import o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import o.Crossfade;
import o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import o.DrawModifierNodeKt;
import o.FocusMeteringAction;
import o.FocusPropertiesImpl;
import o.FocusPropertiesNode;
import o.FocusRequesterModifierKt;
import o.ImageCapture1;
import o.LinearProgressIndicatorTokens;
import o.MediaStoreVideoCannotWrite;
import o.MutableInteractionSourceImpl;
import o.PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1;
import o.PrematureEndOfStreamVideoQuirk;
import o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import o.TransformGestureDetectorKtdetectTransformGestures2;
import o.VideoEncoderCrashQuirk;
import o.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import o.VideoQualityQuirk;
import o.applyToFlingBMRW4eQ;
import o.backgrounddefault;
import o.getBrush;
import o.getHasInitialValueAnimations;
import o.getInflatedId;
import o.getSurfaceProvider;
import o.getViewPort;
import o.getViewportSizeYbymL2g;
import o.isAppSetIdReadingEnabled;
import o.obtainShadowContext;
import o.onDrawWithContent;
import o.onShowTranslationui;
import o.pullLeftk4lQ0M;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg;
import o.setInflatedId;
import o.setNativeShader;
import o.setSupportCompoundDrawablesTintList;
import o.setTextClassifier;
import o.takeOrElse3MmeM6k;

/* JADX INFO: loaded from: classes.dex */
public class PendingValue implements obtainShadowContext, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, VideoEncoderCrashQuirk, BiometricFragmentExternalSyntheticLambda7, PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1, FocusPropertiesImpl {
    public Object serializer;
    public final /* synthetic */ int write;

    public static getViewPort IconCompatParcelizer(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk crashWhenTakingPhotoWithAutoFlashAEModeQuirk) throws ImageCaptureException {
        getViewPort getviewport = crashWhenTakingPhotoWithAutoFlashAEModeQuirk.IconCompatParcelizer;
        getInflatedId getinflatedid = (getInflatedId) getviewport.read;
        Rect rect = getviewport.RemoteActionCompatParcelizer;
        try {
            byte[] bArrRemoteActionCompatParcelizer = ImageUtil.RemoteActionCompatParcelizer(getinflatedid, rect, crashWhenTakingPhotoWithAutoFlashAEModeQuirk.serializer, getviewport.MediaMetadataCompat);
            try {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk deactivateEncoderSurfaceBeforeStopEncoderQuirk = new DeactivateEncoderSurfaceBeforeStopEncoderQuirk(new takeOrElse3MmeM6k(new ByteArrayInputStream(bArrRemoteActionCompatParcelizer)));
                Size size = new Size(rect.width(), rect.height());
                Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
                int i = getviewport.MediaMetadataCompat;
                Matrix matrix = getviewport.MediaBrowserCompatMediaItem;
                RectF rectF = MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer;
                Matrix matrix2 = new Matrix(matrix);
                matrix2.postTranslate(-rect.left, -rect.top);
                return new getViewPort(bArrRemoteActionCompatParcelizer, deactivateEncoderSurfaceBeforeStopEncoderQuirk, Fields.RotationX, size, rect2, i, matrix2, getviewport.write);
            } catch (IOException e) {
                throw new ImageCaptureException(0, "Failed to extract Exif from YUV-generated JPEG", e);
            }
        } catch (ImageUtil.CodecFailedException e2) {
            throw new ImageCaptureException(1, "Failed to encode the image to JPEG.", e2);
        }
    }

    public static LinearProgressIndicatorTokens write(int i, PendingValue pendingValue) {
        LazyListState lazyListState = (LazyListState) pendingValue.serializer;
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush = (getBrush) setNativeShader.read(676141147, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], iSerializer, isAppSetIdReadingEnabled.serializer(), -676141143);
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem = getbrush != null ? getbrush.MediaSessionCompatQueueItem() : null;
        int iSerializer2 = isAppSetIdReadingEnabled.serializer();
        getBrush getbrush2 = (getBrush) setNativeShader.read(1384483406, isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[]{getbrush}, iSerializer2, isAppSetIdReadingEnabled.serializer(), -1384483406);
        try {
            LazyListMeasureResult lazyListMeasureResult = (LazyListMeasureResult) ((onShowTranslationui) lazyListState.ParcelableVolumeInfo).getValue();
            return lazyListState.ResultReceiver.write(i, lazyListMeasureResult.RemoteActionCompatParcelizer, lazyListState.MediaSessionCompatQueueItem, new getViewportSizeYbymL2g(i, lazyListMeasureResult));
        } finally {
            setNativeShader.read(getbrush, getbrush2, r8lambdaunavo3sxub_pc9xroryotnrlvsmMediaSessionCompatQueueItem);
        }
    }

    public Object IconCompatParcelizer(Object obj) throws Exception {
        getViewPort getviewportIconCompatParcelizer;
        CrashWhenTakingPhotoWithAutoFlashAEModeQuirk crashWhenTakingPhotoWithAutoFlashAEModeQuirk = (CrashWhenTakingPhotoWithAutoFlashAEModeQuirk) obj;
        getViewPort getviewport = crashWhenTakingPhotoWithAutoFlashAEModeQuirk.IconCompatParcelizer;
        try {
            int i = getviewport.serializer;
            Object obj2 = getviewport.read;
            if (i == 35) {
                getviewportIconCompatParcelizer = IconCompatParcelizer(crashWhenTakingPhotoWithAutoFlashAEModeQuirk);
            } else {
                if (i != 256 && i != 4101) {
                    throw new IllegalArgumentException("Unexpected format: " + i);
                }
                getviewportIconCompatParcelizer = write(crashWhenTakingPhotoWithAutoFlashAEModeQuirk, i);
            }
            ((getInflatedId) obj2).close();
            return getviewportIconCompatParcelizer;
        } catch (Throwable th) {
            ((getInflatedId) getviewport.read).close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    public int RemoteActionCompatParcelizer(byte[] bArr) {
        int i;
        byte b;
        if (((LargeJpegImageQuirk) this.serializer) == null || !(("Samsung".equalsIgnoreCase(Build.BRAND) && LargeJpegImageQuirk.write.contains(Build.MODEL.toUpperCase(Locale.US))) || LargeJpegImageQuirk.serializer() || bArr.length > 10000000)) {
            return bArr.length;
        }
        int i2 = 2;
        while (i2 + 4 <= bArr.length && (b = bArr[i2]) == -1) {
            int i3 = i2 + 2;
            byte b2 = bArr[i3];
            byte b3 = bArr[i2 + 3];
            if (b == -1 && bArr[i2 + 1] == -38) {
                while (true) {
                    i = i3 + 2;
                    if (i > bArr.length) {
                        break;
                    }
                    if (bArr[i3] != -1 || bArr[i3 + 1] != -39) {
                        i3++;
                    }
                    if (i != -1) {
                        return i;
                    }
                    return bArr.length;
                }
            }
            i2 += (((b2 & 255) << 8) | (b3 & 255)) + 2;
        }
        i = -1;
        if (i != -1) {
            return i;
        }
        return bArr.length;
    }

    @Override // o.FocusPropertiesImpl
    public FocusRequesterModifierKt onApplyWindowInsets(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        CoordinatorLayout.Behavior behavior;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.serializer;
        if (!Objects.equals(coordinatorLayout.PlaybackStateCompat, focusRequesterModifierKt)) {
            coordinatorLayout.PlaybackStateCompat = focusRequesterModifierKt;
            boolean z = focusRequesterModifierKt.RemoteActionCompatParcelizer() > 0;
            coordinatorLayout.ParcelableVolumeInfo = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            if (!focusRequesterModifierKt.IconCompatParcelizer.isConsumed()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                    if (childAt.getFitsSystemWindows() && (behavior = ((CoordinatorLayout.LayoutParams) childAt.getLayoutParams()).MediaDescriptionCompat) != null) {
                        focusRequesterModifierKt = behavior.onApplyWindowInsets(coordinatorLayout, childAt, focusRequesterModifierKt);
                        if (focusRequesterModifierKt.IconCompatParcelizer.isConsumed()) {
                            break;
                        }
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return focusRequesterModifierKt;
    }

    public long read() {
        Magnifier magnifier = (Magnifier) this.serializer;
        return IntSize.m3839constructorimpl((((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L));
    }

    /* JADX INFO: renamed from: update-Wko1d7g, reason: not valid java name */
    public void mo5updateWko1d7g(long j, long j2, float f) {
        ((Magnifier) this.serializer).show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r2 != (-1)) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.getViewPort write(o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk r12, int r13) {
        /*
            r11 = this;
            o.getViewPort r12 = r12.IconCompatParcelizer
            java.lang.Object r0 = r11.serializer
            androidx.camera.view.PendingValue r0 = (androidx.camera.view.PendingValue) r0
            java.lang.Object r1 = r12.read
            o.getInflatedId r1 = (o.getInflatedId) r1
            java.lang.Object r0 = r0.serializer
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r0
            r2 = 0
            if (r0 != 0) goto L28
            o.Toolbar4[] r0 = r1.IconCompatParcelizer()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.write()
            int r1 = r0.capacity()
            byte[] r1 = new byte[r1]
            r0.rewind()
            r0.get(r1)
            goto L82
        L28:
            o.Toolbar4[] r0 = r1.IconCompatParcelizer()
            r0 = r0[r2]
            java.nio.ByteBuffer r0 = r0.write()
            int r1 = r0.capacity()
            byte[] r3 = new byte[r1]
            r0.rewind()
            r0.get(r3)
            r4 = 2
            r5 = r4
        L40:
            int r6 = r5 + 4
            r7 = -1
            if (r6 > r1) goto L67
            r6 = r3[r5]
            if (r6 == r7) goto L4a
            goto L67
        L4a:
            if (r6 != r7) goto L55
            int r6 = r5 + 1
            r6 = r3[r6]
            r7 = -38
            if (r6 != r7) goto L55
            goto L7a
        L55:
            int r6 = r5 + 2
            r6 = r3[r6]
            int r7 = r5 + 3
            r7 = r3[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L40
        L67:
            int r2 = r4 + 1
            if (r2 <= r1) goto L6d
            r2 = r7
            goto L78
        L6d:
            r5 = r3[r4]
            if (r5 != r7) goto L9a
            r5 = r3[r2]
            r6 = -40
            if (r5 != r6) goto L9a
            r2 = r4
        L78:
            if (r2 == r7) goto L83
        L7a:
            int r0 = r0.limit()
            byte[] r1 = java.util.Arrays.copyOfRange(r3, r2, r0)
        L82:
            r3 = r1
        L83:
            o.DeactivateEncoderSurfaceBeforeStopEncoderQuirk r4 = r12.IconCompatParcelizer
            java.util.Objects.requireNonNull(r4)
            android.util.Size r6 = r12.MediaSessionCompatQueueItem
            android.graphics.Rect r7 = r12.RemoteActionCompatParcelizer
            int r8 = r12.MediaMetadataCompat
            android.graphics.Matrix r9 = r12.MediaBrowserCompatMediaItem
            o.CameraXExternalSyntheticLambda0 r10 = r12.write
            o.getViewPort r12 = new o.getViewPort
            r2 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        L9a:
            r4 = r2
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PendingValue.write(o.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk, int):o.getViewPort");
    }

    public PendingValue(int i) {
        this.write = i;
        if (i != 29) {
            this.serializer = (LargeJpegImageQuirk) getSurfaceProvider.read.read(LargeJpegImageQuirk.class);
        } else {
            this.serializer = new setSupportCompoundDrawablesTintList(0);
        }
    }

    @Override // o.VideoEncoderCrashQuirk
    public void a_(Object obj) {
        int i = this.write;
        if (i == 9) {
            return;
        }
        int i2 = 10;
        if (i == 10) {
            return;
        }
        getHasInitialValueAnimations gethasinitialvalueanimations = (getHasInitialValueAnimations) obj;
        EncoderImpl encoderImpl = (EncoderImpl) this.serializer;
        long jMediaSessionCompatQueueItem = encoderImpl._init_lambda3.MediaSessionCompatQueueItem();
        EncoderImpl encoderImpl2 = gethasinitialvalueanimations.RatingCompat;
        if (!encoderImpl2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) {
            jMediaSessionCompatQueueItem = encoderImpl2.read(jMediaSessionCompatQueueItem);
        }
        if (gethasinitialvalueanimations.MediaSessionCompatQueueItem.get()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The buffer is submitted or canceled.");
            return;
        }
        int i3 = 1;
        UtilsKt.serializer(jMediaSessionCompatQueueItem >= 0);
        gethasinitialvalueanimations.RemoteActionCompatParcelizer = jMediaSessionCompatQueueItem;
        AtomicBoolean atomicBoolean = gethasinitialvalueanimations.MediaSessionCompatQueueItem;
        if (atomicBoolean.get()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("The buffer is submitted or canceled.");
            return;
        }
        gethasinitialvalueanimations.read = true;
        onDrawWithContent ondrawwithcontent = gethasinitialvalueanimations.MediaDescriptionCompat;
        ByteBuffer byteBuffer = gethasinitialvalueanimations.write;
        if (!atomicBoolean.getAndSet(true)) {
            try {
                gethasinitialvalueanimations.serializer.queueInputBuffer(gethasinitialvalueanimations.IconCompatParcelizer, byteBuffer.position(), byteBuffer.limit(), gethasinitialvalueanimations.RemoteActionCompatParcelizer, gethasinitialvalueanimations.read ? 4 : 0);
                ondrawwithcontent.RemoteActionCompatParcelizer(null);
            } catch (IllegalStateException e) {
                ondrawwithcontent.serializer(e);
            }
        }
        DrawModifierNodeKt drawModifierNodeKtWrite = VideoQualityQuirk.write((DrawModifierNodeKt) gethasinitialvalueanimations.MediaBrowserCompatMediaItem);
        drawModifierNodeKtWrite.RemoteActionCompatParcelizer(new zza(drawModifierNodeKtWrite, i3, new PendingValue(i2, this)), encoderImpl.RatingCompat);
    }

    @Override // o.PagerSnapLayoutInfoProviderKtSnapLayoutInfoProvider1
    public MutableInteractionSourceImpl write(int i) {
        return this.write != 13 ? (MutableInteractionSourceImpl) this.serializer : ((ClipboardUtils_androidKt[]) this.serializer)[i];
    }

    @Override // o.BiometricFragmentExternalSyntheticLambda7
    public void RemoteActionCompatParcelizer(SurfaceRequest surfaceRequest) {
        BackgroundKt clickableElement;
        if (!PrematureEndOfStreamVideoQuirk.read()) {
            ((AndroidEdgeEffectOverscrollEffect) this.serializer).getContext().getMainExecutor().execute(new Crossfade(this, 29, surfaceRequest));
            return;
        }
        setInflatedId.IconCompatParcelizer(3, "PreviewView");
        ImageCapture1 imageCapture1 = surfaceRequest.RemoteActionCompatParcelizer;
        ((AndroidEdgeEffectOverscrollEffect) this.serializer).read = imageCapture1.MediaMetadataCompat();
        backgrounddefault backgrounddefaultVar = ((AndroidEdgeEffectOverscrollEffect) this.serializer).MediaSessionCompatResultReceiverWrapper;
        Rect rectMediaSessionCompatQueueItem = imageCapture1.MediaMetadataCompat().MediaSessionCompatQueueItem();
        backgrounddefaultVar.getClass();
        backgrounddefaultVar.RemoteActionCompatParcelizer = new Rational(rectMediaSessionCompatQueueItem.width(), rectMediaSessionCompatQueueItem.height());
        synchronized (backgrounddefaultVar) {
            backgrounddefaultVar.read = rectMediaSessionCompatQueueItem;
        }
        surfaceRequest.IconCompatParcelizer(((AndroidEdgeEffectOverscrollEffect) this.serializer).getContext().getMainExecutor(), new PreviewView$1$$ExternalSyntheticLambda2(this, imageCapture1, surfaceRequest));
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) this.serializer;
        BackgroundKt backgroundKt = androidEdgeEffectOverscrollEffect.RatingCompat;
        pullLeftk4lQ0M pullleftk4lq0m = androidEdgeEffectOverscrollEffect.MediaMetadataCompat;
        int i = 0;
        if (!(backgroundKt instanceof ClickableElement) || AndroidEdgeEffectOverscrollEffect.RemoteActionCompatParcelizer(surfaceRequest, pullleftk4lq0m)) {
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2 = (AndroidEdgeEffectOverscrollEffect) this.serializer;
            boolean zRemoteActionCompatParcelizer = AndroidEdgeEffectOverscrollEffect.RemoteActionCompatParcelizer(surfaceRequest, androidEdgeEffectOverscrollEffect2.MediaMetadataCompat);
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect3 = (AndroidEdgeEffectOverscrollEffect) this.serializer;
            applyToFlingBMRW4eQ applytoflingbmrw4eq = androidEdgeEffectOverscrollEffect3.MediaBrowserCompatMediaItem;
            if (zRemoteActionCompatParcelizer) {
                CombinedClickableNodehandleDownEvent2 combinedClickableNodehandleDownEvent2 = new CombinedClickableNodehandleDownEvent2(androidEdgeEffectOverscrollEffect3, applytoflingbmrw4eq);
                combinedClickableNodehandleDownEvent2.RatingCompat = false;
                combinedClickableNodehandleDownEvent2.MediaBrowserCompatMediaItem = new AtomicReference();
                clickableElement = combinedClickableNodehandleDownEvent2;
            } else {
                clickableElement = new ClickableElement(androidEdgeEffectOverscrollEffect3, applytoflingbmrw4eq);
            }
            androidEdgeEffectOverscrollEffect2.RatingCompat = clickableElement;
        }
        FocusMeteringAction focusMeteringActionMediaMetadataCompat = imageCapture1.MediaMetadataCompat();
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect4 = (AndroidEdgeEffectOverscrollEffect) this.serializer;
        AbstractClickableNodehandlePressInteractionStart11 abstractClickableNodehandlePressInteractionStart11 = new AbstractClickableNodehandlePressInteractionStart11(focusMeteringActionMediaMetadataCompat, androidEdgeEffectOverscrollEffect4.MediaSessionCompatQueueItem, androidEdgeEffectOverscrollEffect4.RatingCompat);
        ((AndroidEdgeEffectOverscrollEffect) this.serializer).RemoteActionCompatParcelizer.set(abstractClickableNodehandlePressInteractionStart11);
        imageCapture1.MediaDescriptionCompat().serializer(((AndroidEdgeEffectOverscrollEffect) this.serializer).getContext().getMainExecutor(), abstractClickableNodehandlePressInteractionStart11);
        ((AndroidEdgeEffectOverscrollEffect) this.serializer).RatingCompat.serializer(surfaceRequest, new PreviewView$1$$ExternalSyntheticLambda2(this, abstractClickableNodehandlePressInteractionStart11, imageCapture1, i));
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect5 = (AndroidEdgeEffectOverscrollEffect) this.serializer;
        if (androidEdgeEffectOverscrollEffect5.indexOfChild(androidEdgeEffectOverscrollEffect5.ParcelableVolumeInfo) == -1) {
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect6 = (AndroidEdgeEffectOverscrollEffect) this.serializer;
            androidEdgeEffectOverscrollEffect6.addView(androidEdgeEffectOverscrollEffect6.ParcelableVolumeInfo);
        }
    }

    @Override // o.VideoEncoderCrashQuirk
    public void write(Throwable th) {
        int i = this.write;
        if (i == 9) {
            setInflatedId.RemoteActionCompatParcelizer("VideoEncoderSession", "VideoEncoder configuration failed.", th);
            ((r8lambdauOsl1OJcz1lNCaioOGlfrBn5pcg) this.serializer).MediaDescriptionCompat();
        } else {
            if (i != 10) {
                ((EncoderImpl) this.serializer).read(0, "Unable to acquire InputBuffer.", th);
                return;
            }
            boolean z = th instanceof MediaCodec.CodecException;
            EncoderImpl encoderImpl = (EncoderImpl) ((PendingValue) this.serializer).serializer;
            if (!z) {
                encoderImpl.read(0, th.getMessage(), th);
            } else {
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                encoderImpl.read(1, codecException.getMessage(), codecException);
            }
        }
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        if (this.write != 4) {
            o.PendingValue pendingValue = (o.PendingValue) this.serializer;
            UtilsKt.RemoteActionCompatParcelizer("The result can only set once!", pendingValue.IconCompatParcelizer == null);
            pendingValue.IconCompatParcelizer = ondrawwithcontent;
            return "ListFuture[" + this + "]";
        }
        VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk = (VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk) this.serializer;
        UtilsKt.RemoteActionCompatParcelizer("The result can only set once!", videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.RatingCompat == null);
        videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.RatingCompat = ondrawwithcontent;
        return "FutureChain[" + videoEncoderSuspendDoesNotIncludeSuspendTimeQuirk + "]";
    }

    public /* synthetic */ PendingValue(int i, boolean z) {
        this.write = i;
    }

    public /* synthetic */ PendingValue(int i, Object obj) {
        this.write = i;
        this.serializer = obj;
    }

    public PendingValue(u$a u_a, int i) {
        this.write = i;
        if (i != 8) {
            this.serializer = new PendingValue(u_a, 8);
        } else {
            this.serializer = (IncorrectJpegMetadataQuirk) u_a.read(IncorrectJpegMetadataQuirk.class);
        }
    }

    public PendingValue(EditText editText) {
        this.write = 28;
        this.serializer = new i$d(editText);
    }

    public PendingValue(TransformGestureDetectorKtdetectTransformGestures2 transformGestureDetectorKtdetectTransformGestures2, float f, float f2) {
        this.write = 13;
        int iIconCompatParcelizer = transformGestureDetectorKtdetectTransformGestures2.IconCompatParcelizer();
        ClipboardUtils_androidKt[] clipboardUtils_androidKtArr = new ClipboardUtils_androidKt[iIconCompatParcelizer];
        for (int i = 0; i < iIconCompatParcelizer; i++) {
            clipboardUtils_androidKtArr[i] = new ClipboardUtils_androidKt(f, f2, transformGestureDetectorKtdetectTransformGestures2.write(i));
        }
        this.serializer = clipboardUtils_androidKtArr;
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        return VideoQualityQuirk.read(((setTextClassifier) this.serializer).read(obj));
    }
}
