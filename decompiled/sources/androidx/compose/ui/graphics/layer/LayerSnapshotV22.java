package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.grpc.LoadBalancer$Helper;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ShortNewsContentCardView;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public final class LayerSnapshotV22 implements LayerSnapshotImpl {
    public static final int $stable = 0;
    public static final LayerSnapshotV22 INSTANCE = new LayerSnapshotV22();

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LayerSnapshotV22.this.toBitmap(null, this);
        }
    }

    private LayerSnapshotV22() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.ui.graphics.layer.LayerSnapshotImpl
    public Object toBitmap(GraphicsLayer graphicsLayer, ShortNewsContentCardView<? super Bitmap> shortNewsContentCardView) {
        AnonymousClass1 anonymousClass1;
        Throwable th;
        AutoCloseable autoCloseable;
        AutoCloseable autoCloseable2;
        if (shortNewsContentCardView instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) shortNewsContentCardView;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(shortNewsContentCardView);
        }
        Object result = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(result);
            long jM1395getSizeYbymL2g = graphicsLayer.m1395getSizeYbymL2g();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (jM1395getSizeYbymL2g >> 32), (int) (jM1395getSizeYbymL2g & 4294967295L), 1, 1);
            try {
                anonymousClass1.L$0 = graphicsLayer;
                anonymousClass1.L$1 = looperMyLooper;
                anonymousClass1.L$2 = imageReaderNewInstance;
                anonymousClass1.L$3 = imageReaderNewInstance;
                anonymousClass1.L$4 = anonymousClass1;
                anonymousClass1.label = 1;
                final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(anonymousClass1));
                cancellableContinuationImpl.read();
                imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: androidx.compose.ui.graphics.layer.LayerSnapshotV22$toBitmap$2$image$1$1
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader) {
                        cancellableContinuationImpl.resumeWith(imageReader.acquireLatestImage());
                    }
                }, Handler.createAsync(looperMyLooper));
                Surface surface = imageReaderNewInstance.getSurface();
                Canvas canvasLockCanvas = SurfaceUtils.INSTANCE.lockCanvas(surface);
                try {
                    canvasLockCanvas.drawColor(ColorKt.m776toArgb8_81llA(Color.Companion.m748getBlack0d7_KjU()), PorterDuff.Mode.CLEAR);
                    graphicsLayer.draw$ui_graphics(AndroidCanvas_androidKt.Canvas(canvasLockCanvas), null);
                    surface.unlockCanvasAndPost(canvasLockCanvas);
                    result = cancellableContinuationImpl.getResult();
                    if (result == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    autoCloseable = imageReaderNewInstance;
                } catch (Throwable th2) {
                    surface.unlockCanvasAndPost(canvasLockCanvas);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                autoCloseable2 = imageReaderNewInstance;
                throw th;
            }
        } else {
            if (i2 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            autoCloseable = (AutoCloseable) anonymousClass1.L$2;
            try {
                ExtrasKt.RemoteActionCompatParcelizer(result);
                autoCloseable = autoCloseable;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable2 = autoCloseable;
                try {
                    throw th;
                } catch (Throwable th5) {
                    Okio.RemoteActionCompatParcelizer(autoCloseable2, th);
                    throw th5;
                }
            }
        }
        Bitmap bitmap = LayerSnapshot_androidKt.toBitmap((Image) result);
        Okio.RemoteActionCompatParcelizer(autoCloseable, null);
        return bitmap;
    }
}
