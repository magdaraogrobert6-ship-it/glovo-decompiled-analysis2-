package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import com.google.android.gms.net.zza;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.huawei.location.ut;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidEdgeEffectOverscrollEffect extends FrameLayout {
    public static final pullLeftk4lQ0M serializer = pullLeftk4lQ0M.PERFORMANCE;
    public TransitionState IconCompatParcelizer;
    public final applyToFlingBMRW4eQ MediaBrowserCompatMediaItem;
    public final displacementF1C5BW0foundation MediaDescriptionCompat;
    public pullLeftk4lQ0M MediaMetadataCompat;
    public final AndroidGraphicsContext2 MediaSessionCompatQueueItem;
    public final backgrounddefault MediaSessionCompatResultReceiverWrapper;
    public final androidx.camera.view.PendingValue MediaSessionCompatToken;
    public final shrinkKibmq7A ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public MotionEvent PlaybackStateCompatCustomAction;
    public BackgroundKt RatingCompat;
    public final AtomicReference RemoteActionCompatParcelizer;
    public final CombinedClickableNodehandleDownEvent1 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public FocusMeteringAction read;
    public final pullRightk4lQ0M write;

    public accessunregisterComponentCallback getPreviewStreamState() {
        return this.MediaSessionCompatQueueItem;
    }

    public setTitleMarginBottom getScreenFlash() {
        return getScreenFlashInternal();
    }

    public static boolean RemoteActionCompatParcelizer(androidx.camera.core.SurfaceRequest surfaceRequest, pullLeftk4lQ0M pullleftk4lq0m) {
        boolean zEquals = surfaceRequest.RemoteActionCompatParcelizer.MediaMetadataCompat().RatingCompat().equals("androidx.camera.camera2.legacy");
        boolean z = (HoverableNode.serializer.read(androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk.class) == null && HoverableNode.serializer.read(androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!zEquals && !z) {
            int iOrdinal = pullleftk4lq0m.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    Gson$$ExternalSyntheticBUOutline0.m(pullleftk4lq0m, "Invalid implementation mode: ");
                }
            }
            return false;
        }
        return true;
    }

    private setTitleMarginBottom getScreenFlashInternal() {
        return this.ParcelableVolumeInfo.getScreenFlash();
    }

    public HorizontalScrollableClipShape getOutputTransform() {
        android.graphics.Matrix matrixSerializer;
        applyToFlingBMRW4eQ applytoflingbmrw4eq = this.MediaBrowserCompatMediaItem;
        PrematureEndOfStreamVideoQuirk.write();
        try {
            matrixSerializer = applytoflingbmrw4eq.serializer(new android.util.Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixSerializer = null;
        }
        android.graphics.Rect rect = applytoflingbmrw4eq.MediaBrowserCompatMediaItem;
        if (matrixSerializer == null || rect == null) {
            setInflatedId.IconCompatParcelizer(3, "PreviewView");
            return null;
        }
        RectF rectF = MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer;
        RectF rectF2 = new RectF(rect);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(MediaStoreVideoCannotWrite.RemoteActionCompatParcelizer, rectF2, android.graphics.Matrix.ScaleToFit.FILL);
        matrixSerializer.preConcat(matrix);
        if (this.RatingCompat instanceof CombinedClickableNodehandleDownEvent2) {
            matrixSerializer.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            setInflatedId.read("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new android.util.Size(rect.width(), rect.height());
        return new HorizontalScrollableClipShape();
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.IconCompatParcelizer != null) {
            MotionEvent motionEvent = this.PlaybackStateCompatCustomAction;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.PlaybackStateCompatCustomAction;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            TransitionState transitionState = this.IconCompatParcelizer;
            backgrounddefault backgrounddefaultVar = this.MediaSessionCompatResultReceiverWrapper;
            AndroidGraphicsContext2 androidGraphicsContext2 = transitionState.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
            long j = transitionState.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (!transitionState.RemoteActionCompatParcelizer()) {
                setInflatedId.read("CameraController", "Use cases not attached to camera.");
            } else if (transitionState.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                PointF pointF = new PointF(x, y);
                setLayoutResource setlayoutresourceSerializer = backgrounddefaultVar.serializer(pointF.x, pointF.y, 0.16666667f);
                setLayoutResource setlayoutresourceSerializer2 = backgrounddefaultVar.serializer(pointF.x, pointF.y, 0.25f);
                androidx.camera.core.FocusMeteringAction focusMeteringAction = new androidx.camera.core.FocusMeteringAction(setlayoutresourceSerializer);
                focusMeteringAction.IconCompatParcelizer(setlayoutresourceSerializer2, 2);
                int i = 1;
                if (j > 0) {
                    coil3.util.UtilsKt.IconCompatParcelizer("autoCancelDuration must be at least 1", j >= 1);
                    focusMeteringAction.RemoteActionCompatParcelizer = j / 1000000;
                } else {
                    focusMeteringAction.RemoteActionCompatParcelizer = 0L;
                }
                androidx.camera.core.FocusMeteringAction focusMeteringAction2 = new androidx.camera.core.FocusMeteringAction(focusMeteringAction);
                setInflatedId.IconCompatParcelizer(3, "CameraController");
                ut utVar = transitionState.MediaDescriptionCompat;
                if (utVar != null) {
                    synchronized (utVar.MediaBrowserCompatMediaItem) {
                        utVar.write = true;
                    }
                }
                androidGraphicsContext2.serializer(new CombinedClickableElement(1));
                ut utVar2 = new ut(pointF, androidGraphicsContext2);
                transitionState.MediaDescriptionCompat = utVar2;
                DrawModifierNodeKt drawModifierNodeKtIconCompatParcelizer = ((ImageCaptureMetadata) ((ImageCaptureWashedOutImageQuirk) transitionState.write.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY()).write).IconCompatParcelizer(focusMeteringAction2);
                drawModifierNodeKtIconCompatParcelizer.RemoteActionCompatParcelizer(new zza(drawModifierNodeKtIconCompatParcelizer, i, utVar2), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
                long j2 = j / 1000000;
                setInflatedId.IconCompatParcelizer(3, "CameraController");
                if (j2 > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Preview$$ExternalSyntheticLambda0(27, utVar2), j2);
                }
            } else {
                setInflatedId.IconCompatParcelizer(3, "CameraController");
            }
        }
        this.PlaybackStateCompatCustomAction = null;
        return super.performClick();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.ParcelableVolumeInfo.setBackgroundColor(i);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [o.displacementF1C5BW0foundation] */
    public AndroidEdgeEffectOverscrollEffect(Context context) {
        super(context, null, 0, 0);
        pullLeftk4lQ0M pullleftk4lq0m = serializer;
        this.MediaMetadataCompat = pullleftk4lq0m;
        applyToFlingBMRW4eQ applytoflingbmrw4eq = new applyToFlingBMRW4eQ();
        applytoflingbmrw4eq.MediaDescriptionCompat = applyToFlingBMRW4eQ.read;
        this.MediaBrowserCompatMediaItem = applytoflingbmrw4eq;
        this.PlaybackStateCompat = true;
        this.MediaSessionCompatQueueItem = new AndroidGraphicsContext2(pullTopk4lQ0M.IDLE);
        this.RemoteActionCompatParcelizer = new AtomicReference();
        this.MediaSessionCompatResultReceiverWrapper = new backgrounddefault(applytoflingbmrw4eq);
        this.write = new pullRightk4lQ0M(this);
        this.MediaDescriptionCompat = new View.OnLayoutChangeListener() { // from class: o.displacementF1C5BW0foundation
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) {
                    return;
                }
                AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = this.read;
                androidEdgeEffectOverscrollEffect.RemoteActionCompatParcelizer();
                androidEdgeEffectOverscrollEffect.read(true);
            }
        };
        this.MediaSessionCompatToken = new androidx.camera.view.PendingValue(12, this);
        PrematureEndOfStreamVideoQuirk.write();
        Resources.Theme theme = context.getTheme();
        int[] iArr = BorderKt.PreviewView;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr, null, typedArrayObtainStyledAttributes, 0);
        try {
            setScaleType(pullBottomk4lQ0M.fromId(typedArrayObtainStyledAttributes.getInteger(1, applytoflingbmrw4eq.MediaDescriptionCompat.getId())));
            setImplementationMode(pullLeftk4lQ0M.fromId(typedArrayObtainStyledAttributes.getInteger(0, pullleftk4lq0m.getId())));
            typedArrayObtainStyledAttributes.recycle();
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new CombinedClickableNodehandleDownEvent1(context, new StreamSharing$$ExternalSyntheticLambda0(13, this));
            if (getBackground() == null) {
                setBackgroundColor(getContext().getColor(android.R.color.black));
            }
            shrinkKibmq7A shrinkkibmq7a = new shrinkKibmq7A(context, null, 0, 0);
            shrinkkibmq7a.setBackgroundColor(-1);
            shrinkkibmq7a.setAlpha(0.0f);
            shrinkkibmq7a.setElevation(Float.MAX_VALUE);
            this.ParcelableVolumeInfo = shrinkkibmq7a;
            shrinkkibmq7a.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        android.graphics.Rect rect;
        Display defaultDisplay;
        FocusMeteringAction focusMeteringAction;
        PrematureEndOfStreamVideoQuirk.write();
        if (this.RatingCompat != null) {
            if (this.PlaybackStateCompat && (defaultDisplay = getDefaultDisplay()) != null && (focusMeteringAction = this.read) != null) {
                applyToFlingBMRW4eQ applytoflingbmrw4eq = this.MediaBrowserCompatMediaItem;
                int iRemoteActionCompatParcelizer = focusMeteringAction.RemoteActionCompatParcelizer(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (applytoflingbmrw4eq.RemoteActionCompatParcelizer) {
                    applytoflingbmrw4eq.serializer = iRemoteActionCompatParcelizer;
                    applytoflingbmrw4eq.MediaMetadataCompat = rotation;
                }
            }
            this.RatingCompat.read();
        }
        backgrounddefault backgrounddefaultVar = this.MediaSessionCompatResultReceiverWrapper;
        android.util.Size size = new android.util.Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        backgrounddefaultVar.getClass();
        PrematureEndOfStreamVideoQuirk.write();
        synchronized (backgrounddefaultVar) {
            if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = backgrounddefaultVar.read) == null) {
                backgrounddefaultVar.serializer = null;
            } else {
                backgrounddefaultVar.serializer = backgrounddefaultVar.write.serializer(size, layoutDirection, rect);
            }
        }
        if (this.IconCompatParcelizer != null) {
            getSensorToViewTransform();
            PrematureEndOfStreamVideoQuirk.write();
        }
    }

    public Bitmap getBitmap() {
        PrematureEndOfStreamVideoQuirk.write();
        BackgroundKt backgroundKt = this.RatingCompat;
        if (backgroundKt == null) {
            return null;
        }
        FrameLayout frameLayout = backgroundKt.IconCompatParcelizer;
        Bitmap bitmapRemoteActionCompatParcelizer = backgroundKt.RemoteActionCompatParcelizer();
        if (bitmapRemoteActionCompatParcelizer == null) {
            return null;
        }
        applyToFlingBMRW4eQ applytoflingbmrw4eq = backgroundKt.RemoteActionCompatParcelizer;
        android.util.Size size = new android.util.Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!applytoflingbmrw4eq.RemoteActionCompatParcelizer()) {
            return bitmapRemoteActionCompatParcelizer;
        }
        android.graphics.Matrix matrixWrite = applytoflingbmrw4eq.write();
        RectF rectF = applytoflingbmrw4eq.read(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapRemoteActionCompatParcelizer.getConfig());
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postConcat(matrixWrite);
        matrix.postScale(rectF.width() / applytoflingbmrw4eq.IconCompatParcelizer.getWidth(), rectF.height() / applytoflingbmrw4eq.IconCompatParcelizer.getHeight());
        matrix.postTranslate(rectF.left, rectF.top);
        canvas.drawBitmap(bitmapRemoteActionCompatParcelizer, matrix, new android.graphics.Paint(7));
        return bitmapCreateBitmap;
    }

    public TransitionState getController() {
        PrematureEndOfStreamVideoQuirk.write();
        return this.IconCompatParcelizer;
    }

    public pullLeftk4lQ0M getImplementationMode() {
        PrematureEndOfStreamVideoQuirk.write();
        return this.MediaMetadataCompat;
    }

    public setLayoutInflater getMeteringPointFactory() {
        PrematureEndOfStreamVideoQuirk.write();
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public pullBottomk4lQ0M getScaleType() {
        PrematureEndOfStreamVideoQuirk.write();
        return this.MediaBrowserCompatMediaItem.MediaDescriptionCompat;
    }

    public android.graphics.Matrix getSensorToViewTransform() {
        PrematureEndOfStreamVideoQuirk.write();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        android.util.Size size = new android.util.Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        applyToFlingBMRW4eQ applytoflingbmrw4eq = this.MediaBrowserCompatMediaItem;
        if (!applytoflingbmrw4eq.RemoteActionCompatParcelizer()) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix(applytoflingbmrw4eq.MediaSessionCompatQueueItem);
        matrix.postConcat(applytoflingbmrw4eq.serializer(size, layoutDirection));
        return matrix;
    }

    public BiometricFragmentExternalSyntheticLambda7 getSurfaceProvider() {
        PrematureEndOfStreamVideoQuirk.write();
        return this.MediaSessionCompatToken;
    }

    public CameraIdUtil getViewPort() {
        PrematureEndOfStreamVideoQuirk.write();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        int rotation = defaultDisplay.getRotation();
        PrematureEndOfStreamVideoQuirk.write();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        CameraIdUtil cameraIdUtil = new CameraIdUtil();
        cameraIdUtil.IconCompatParcelizer = viewPortScaleType;
        cameraIdUtil.serializer = rational;
        cameraIdUtil.write = rotation;
        cameraIdUtil.read = layoutDirection;
        return cameraIdUtil;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.write, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.MediaDescriptionCompat);
        BackgroundKt backgroundKt = this.RatingCompat;
        if (backgroundKt != null) {
            backgroundKt.serializer();
        }
        read(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.MediaDescriptionCompat);
        BackgroundKt backgroundKt = this.RatingCompat;
        if (backgroundKt != null) {
            backgroundKt.IconCompatParcelizer();
        }
        TransitionState transitionState = this.IconCompatParcelizer;
        if (transitionState != null) {
            transitionState.IconCompatParcelizer();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.write);
    }

    public final void read(boolean z) {
        PrematureEndOfStreamVideoQuirk.write();
        CameraIdUtil viewPort = getViewPort();
        if (this.IconCompatParcelizer == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.IconCompatParcelizer.serializer(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            setInflatedId.read("PreviewView", e.toString(), e);
        }
    }

    public void setController(TransitionState transitionState) {
        PrematureEndOfStreamVideoQuirk.write();
        TransitionState transitionState2 = this.IconCompatParcelizer;
        if (transitionState2 != null && transitionState2 != transitionState) {
            transitionState2.IconCompatParcelizer();
            setScreenFlashUiInfo(null);
        }
        this.IconCompatParcelizer = transitionState;
        read(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(pullLeftk4lQ0M pullleftk4lq0m) {
        PrematureEndOfStreamVideoQuirk.write();
        this.MediaMetadataCompat = pullleftk4lq0m;
        pullLeftk4lQ0M pullleftk4lq0m2 = pullLeftk4lQ0M.PERFORMANCE;
    }

    public void setScaleType(pullBottomk4lQ0M pullbottomk4lq0m) {
        PrematureEndOfStreamVideoQuirk.write();
        this.MediaBrowserCompatMediaItem.MediaDescriptionCompat = pullbottomk4lq0m;
        RemoteActionCompatParcelizer();
        read(false);
    }

    public void setScreenFlashWindow(Window window) {
        PrematureEndOfStreamVideoQuirk.write();
        this.ParcelableVolumeInfo.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0151  */
    /* JADX WARN: Code duplicated, block: B:112:0x0183  */
    /* JADX WARN: Code duplicated, block: B:115:0x018f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:133:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0126  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionIndex;
        int i;
        int i2;
        float x;
        float y;
        float f;
        float f2;
        int i3;
        float fAbs;
        float fAbs2;
        float f3;
        float fHypot;
        boolean z3;
        if (this.IconCompatParcelizer == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z4 = motionEvent.getPointerCount() == 1;
        boolean z5 = motionEvent.getAction() == 1;
        boolean z6 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) android.view.ViewConfiguration.getLongPressTimeout());
        if (z4 && z5 && z6) {
            this.PlaybackStateCompatCustomAction = motionEvent;
            performClick();
            return true;
        }
        CombinedClickableNodehandleDownEvent1 combinedClickableNodehandleDownEvent1 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i4 = combinedClickableNodehandleDownEvent1.ParcelableVolumeInfo;
        StreamSharing$$ExternalSyntheticLambda0 streamSharing$$ExternalSyntheticLambda0 = combinedClickableNodehandleDownEvent1.PlaybackStateCompatCustomAction;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (combinedClickableNodehandleDownEvent1.MediaMetadataCompat) {
            combinedClickableNodehandleDownEvent1.MediaBrowserCompatMediaItem.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z7 = (motionEvent.getButtonState() & 32) != 0;
        boolean z8 = combinedClickableNodehandleDownEvent1.read == 2 && !z7;
        boolean z9 = actionMasked == 1 || actionMasked == 3 || z8;
        if (actionMasked == 0 || z9) {
            if (combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem) {
                combinedClickableNodehandleDownEvent1.write();
                streamSharing$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs) new GlowOverscrollNode());
                combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem = false;
                combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = 0.0f;
                combinedClickableNodehandleDownEvent1.read = 0;
            } else if (combinedClickableNodehandleDownEvent1.read() && z9) {
                combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem = false;
                combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = 0.0f;
                combinedClickableNodehandleDownEvent1.read = 0;
            }
            if (!z9) {
                if (!combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem && combinedClickableNodehandleDownEvent1.RatingCompat && !combinedClickableNodehandleDownEvent1.read() && !z9 && z7) {
                    combinedClickableNodehandleDownEvent1.RemoteActionCompatParcelizer = motionEvent.getX();
                    combinedClickableNodehandleDownEvent1.serializer = motionEvent.getY();
                    combinedClickableNodehandleDownEvent1.read = 2;
                    combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = 0.0f;
                }
                if (actionMasked != 0 || actionMasked == 6 || actionMasked == 5 || z8) {
                    z = true;
                } else {
                    z = false;
                }
                if (actionMasked == 6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    actionIndex = motionEvent.getActionIndex();
                } else {
                    actionIndex = -1;
                }
                if (z2) {
                    i = pointerCount - 1;
                } else {
                    i = pointerCount;
                }
                if (combinedClickableNodehandleDownEvent1.read()) {
                    f = combinedClickableNodehandleDownEvent1.RemoteActionCompatParcelizer;
                    f2 = combinedClickableNodehandleDownEvent1.serializer;
                    if (motionEvent.getY() < f2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    combinedClickableNodehandleDownEvent1.write = z3;
                } else {
                    x = 0.0f;
                    y = 0.0f;
                    for (i2 = 0; i2 < pointerCount; i2++) {
                        if (actionIndex != i2) {
                            x = motionEvent.getX(i2) + x;
                            y = motionEvent.getY(i2) + y;
                        }
                    }
                    float f4 = i;
                    f = x / f4;
                    f2 = y / f4;
                }
                fAbs = 0.0f;
                fAbs2 = 0.0f;
                for (i3 = 0; i3 < pointerCount; i3++) {
                    if (actionIndex != i3) {
                        fAbs = Math.abs(motionEvent.getX(i3) - f) + fAbs;
                        fAbs2 = Math.abs(motionEvent.getY(i3) - f2) + fAbs2;
                    }
                }
                float f5 = i;
                f3 = fAbs / f5;
                fHypot = (fAbs2 / f5) * 2.0f;
                if (!combinedClickableNodehandleDownEvent1.read()) {
                    fHypot = (float) Math.hypot(2.0f * f3, fHypot);
                }
                boolean z10 = combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem;
                MathKt.write(f);
                MathKt.write(f2);
                if (!combinedClickableNodehandleDownEvent1.read() && combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem && (fHypot < 0.0f || z)) {
                    combinedClickableNodehandleDownEvent1.write();
                    streamSharing$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs) new GlowOverscrollNode());
                    combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem = false;
                    combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = fHypot;
                }
                if (z) {
                    combinedClickableNodehandleDownEvent1.IconCompatParcelizer = fHypot;
                    combinedClickableNodehandleDownEvent1.MediaSessionCompatToken = fHypot;
                    combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = fHypot;
                }
                int i5 = combinedClickableNodehandleDownEvent1.read() ? i4 : 0;
                if (!combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem && fHypot >= i5 && (z10 || Math.abs(fHypot - combinedClickableNodehandleDownEvent1.MediaDescriptionCompat) > i4)) {
                    combinedClickableNodehandleDownEvent1.IconCompatParcelizer = fHypot;
                    combinedClickableNodehandleDownEvent1.MediaSessionCompatToken = fHypot;
                    streamSharing$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs) new GlowOverscrollNode());
                    combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem = true;
                }
                if (actionMasked == 2) {
                    combinedClickableNodehandleDownEvent1.IconCompatParcelizer = fHypot;
                    if (combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem) {
                        streamSharing$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs) new GlowEdgeEffectCompat(combinedClickableNodehandleDownEvent1.write()));
                    }
                    combinedClickableNodehandleDownEvent1.MediaSessionCompatToken = combinedClickableNodehandleDownEvent1.IconCompatParcelizer;
                }
            }
        } else {
            if (!combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem) {
                combinedClickableNodehandleDownEvent1.RemoteActionCompatParcelizer = motionEvent.getX();
                combinedClickableNodehandleDownEvent1.serializer = motionEvent.getY();
                combinedClickableNodehandleDownEvent1.read = 2;
                combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = 0.0f;
            }
            if (actionMasked != 0) {
                z = true;
            } else {
                z = true;
            }
            if (actionMasked == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                actionIndex = motionEvent.getActionIndex();
            } else {
                actionIndex = -1;
            }
            if (z2) {
                i = pointerCount - 1;
            } else {
                i = pointerCount;
            }
            if (combinedClickableNodehandleDownEvent1.read()) {
                f = combinedClickableNodehandleDownEvent1.RemoteActionCompatParcelizer;
                f2 = combinedClickableNodehandleDownEvent1.serializer;
                if (motionEvent.getY() < f2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                combinedClickableNodehandleDownEvent1.write = z3;
            } else {
                x = 0.0f;
                y = 0.0f;
                while (i2 < pointerCount) {
                    if (actionIndex != i2) {
                        x = motionEvent.getX(i2) + x;
                        y = motionEvent.getY(i2) + y;
                    }
                }
                float f6 = i;
                f = x / f6;
                f2 = y / f6;
            }
            fAbs = 0.0f;
            fAbs2 = 0.0f;
            while (i3 < pointerCount) {
                if (actionIndex != i3) {
                    fAbs = Math.abs(motionEvent.getX(i3) - f) + fAbs;
                    fAbs2 = Math.abs(motionEvent.getY(i3) - f2) + fAbs2;
                }
            }
            float f7 = i;
            f3 = fAbs / f7;
            fHypot = (fAbs2 / f7) * 2.0f;
            if (!combinedClickableNodehandleDownEvent1.read()) {
                fHypot = (float) Math.hypot(2.0f * f3, fHypot);
            }
            boolean z11 = combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem;
            MathKt.write(f);
            MathKt.write(f2);
            if (!combinedClickableNodehandleDownEvent1.read()) {
                combinedClickableNodehandleDownEvent1.write();
                streamSharing$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs) new GlowOverscrollNode());
                combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem = false;
                combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = fHypot;
            }
            if (z) {
                combinedClickableNodehandleDownEvent1.IconCompatParcelizer = fHypot;
                combinedClickableNodehandleDownEvent1.MediaSessionCompatToken = fHypot;
                combinedClickableNodehandleDownEvent1.MediaDescriptionCompat = fHypot;
            }
            if (combinedClickableNodehandleDownEvent1.read()) {
            }
            if (!combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem) {
                combinedClickableNodehandleDownEvent1.IconCompatParcelizer = fHypot;
                combinedClickableNodehandleDownEvent1.MediaSessionCompatToken = fHypot;
                streamSharing$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs) new GlowOverscrollNode());
                combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem = true;
            }
            if (actionMasked == 2) {
                combinedClickableNodehandleDownEvent1.IconCompatParcelizer = fHypot;
                if (combinedClickableNodehandleDownEvent1.MediaSessionCompatQueueItem) {
                    streamSharing$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer((r8lambda9zISiqWdkc3dd5mJTZ1F1xGFCGs) new GlowEdgeEffectCompat(combinedClickableNodehandleDownEvent1.write()));
                }
                combinedClickableNodehandleDownEvent1.MediaSessionCompatToken = combinedClickableNodehandleDownEvent1.IconCompatParcelizer;
            }
        }
        return true;
    }

    private void setScreenFlashUiInfo(setTitleMarginBottom settitlemarginbottom) {
        TransitionState transitionState = this.IconCompatParcelizer;
        if (transitionState == null) {
            setInflatedId.IconCompatParcelizer(3, "PreviewView");
            return;
        }
        applySemantics applysemantics = applySemantics.PREVIEW_VIEW;
        FocusableNode focusableNode = new FocusableNode(applysemantics, settitlemarginbottom);
        FocusableNode focusableNode2 = transitionState.read();
        transitionState.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.put(applysemantics, focusableNode);
        FocusableNode focusableNode3 = transitionState.read();
        if (focusableNode3 == null || focusableNode3.equals(focusableNode2)) {
            return;
        }
        transitionState.MediaSessionCompatQueueItem();
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }
}
