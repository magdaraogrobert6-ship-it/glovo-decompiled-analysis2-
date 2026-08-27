package o;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class getD60 {
    public static final android.graphics.Matrix write = new android.graphics.Matrix();
    public RenderNode ComponentActivity;
    public Bitmap IconCompatParcelizer;
    public copyzey9I6wdefault MediaBrowserCompatMediaItem;
    public getD75 MediaDescriptionCompat;
    public getA MediaMetadataCompat;
    public float MediaSessionCompatQueueItem = 0.0f;
    public RectF MediaSessionCompatResultReceiverWrapper;
    public float[] MediaSessionCompatToken;
    public android.graphics.Matrix ParcelableVolumeInfo;
    public android.graphics.Canvas PlaybackStateCompat;
    public DeltaDecoder PlaybackStateCompatCustomAction;
    public android.graphics.Rect RatingCompat;
    public android.graphics.Canvas RemoteActionCompatParcelizer;
    public RectF ResultReceiver;
    public android.graphics.Canvas r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public Bitmap r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public RectF r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public BlurMaskFilter r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public copyzey9I6wdefault r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public Bitmap r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public android.graphics.Rect r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public android.graphics.Canvas r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public RectF r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public RectF r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public RenderNode r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public android.graphics.Rect read;
    public copyzey9I6wdefault serializer;

    public final void IconCompatParcelizer() {
        float f;
        copyzey9I6wdefault copyzey9i6wdefault;
        if (this.PlaybackStateCompat == null || this.PlaybackStateCompatCustomAction == null || this.MediaSessionCompatToken == null || this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int i = getD65.serializer[this.MediaDescriptionCompat.ordinal()];
        if (i == 1 || i == 2) {
            this.PlaybackStateCompat.restore();
        } else {
            if (i != 3) {
                if (i == 4) {
                    if (this.ComponentActivity == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 < 29) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("RenderNode not supported but we chose it as render strategy");
                        return;
                    }
                    this.PlaybackStateCompat.save();
                    android.graphics.Canvas canvas = this.PlaybackStateCompat;
                    float[] fArr = this.MediaSessionCompatToken;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.ComponentActivity.endRecording();
                    if (this.PlaybackStateCompatCustomAction.read()) {
                        android.graphics.Canvas canvas2 = this.PlaybackStateCompat;
                        getA geta = (getA) this.PlaybackStateCompatCustomAction.serializer;
                        if (this.ComponentActivity == null || this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (i2 < 31) {
                            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.MediaSessionCompatToken;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        getA geta2 = this.MediaMetadataCompat;
                        if (geta2 == null || geta.RemoteActionCompatParcelizer != geta2.RemoteActionCompatParcelizer || geta.serializer != geta2.serializer || geta.read != geta2.read || geta.IconCompatParcelizer != geta2.IconCompatParcelizer) {
                            android.graphics.RenderEffect renderEffectCreateColorFilterEffect = android.graphics.RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(geta.IconCompatParcelizer, PorterDuff.Mode.SRC_IN));
                            float f3 = geta.RemoteActionCompatParcelizer;
                            if (f3 > 0.0f) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                renderEffectCreateColorFilterEffect = android.graphics.RenderEffect.createBlurEffect(f4, f4, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.MediaMetadataCompat = geta;
                        }
                        RectF rectFRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, geta);
                        RectF rectF = new RectF(rectFRemoteActionCompatParcelizer.left * f2, rectFRemoteActionCompatParcelizer.top * f, rectFRemoteActionCompatParcelizer.right * f2, rectFRemoteActionCompatParcelizer.bottom * f);
                        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((geta.serializer * f2) + (-rectF.left), (geta.read * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.ComponentActivity);
                        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
                        canvas2.restore();
                    }
                    this.PlaybackStateCompat.drawRenderNode(this.ComponentActivity);
                    this.PlaybackStateCompat.restore();
                }
            } else {
                if (this.IconCompatParcelizer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.PlaybackStateCompatCustomAction.read()) {
                    android.graphics.Canvas canvas3 = this.PlaybackStateCompat;
                    getA geta3 = (getA) this.PlaybackStateCompatCustomAction.serializer;
                    RectF rectF2 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                    if (rectF2 == null || this.IconCompatParcelizer == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF rectFRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(rectF2, geta3);
                    if (this.RatingCompat == null) {
                        this.RatingCompat = new android.graphics.Rect();
                    }
                    this.RatingCompat.set((int) Math.floor(rectFRemoteActionCompatParcelizer2.left), (int) Math.floor(rectFRemoteActionCompatParcelizer2.top), (int) Math.ceil(rectFRemoteActionCompatParcelizer2.right), (int) Math.ceil(rectFRemoteActionCompatParcelizer2.bottom));
                    float[] fArr3 = this.MediaSessionCompatToken;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.ResultReceiver == null) {
                        this.ResultReceiver = new RectF();
                    }
                    this.ResultReceiver.set(rectFRemoteActionCompatParcelizer2.left * f5, rectFRemoteActionCompatParcelizer2.top * f, rectFRemoteActionCompatParcelizer2.right * f5, rectFRemoteActionCompatParcelizer2.bottom * f);
                    if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 == null) {
                        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new android.graphics.Rect();
                    }
                    this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.set(0, 0, Math.round(this.ResultReceiver.width()), Math.round(this.ResultReceiver.height()));
                    if (RemoteActionCompatParcelizer(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.ResultReceiver)) {
                        Bitmap bitmap = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = IconCompatParcelizer(this.ResultReceiver, Bitmap.Config.ARGB_8888);
                        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = IconCompatParcelizer(this.ResultReceiver, Bitmap.Config.ALPHA_8);
                        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new android.graphics.Canvas(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
                        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new android.graphics.Canvas(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                    } else {
                        android.graphics.Canvas canvas4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                        if (canvas4 == null || this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == null || (copyzey9i6wdefault = this.serializer) == null) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.write("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, copyzey9i6wdefault);
                            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.drawRect(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, this.serializer);
                        }
                    }
                    if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == null) {
                        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new copyzey9I6wdefault(1, 0);
                    }
                    RectF rectF3 = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.drawBitmap(this.IconCompatParcelizer, Math.round((rectF3.left - rectFRemoteActionCompatParcelizer2.left) * f5), Math.round((rectF3.top - rectFRemoteActionCompatParcelizer2.top) * f), (android.graphics.Paint) null);
                    if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null || this.MediaSessionCompatQueueItem != geta3.RemoteActionCompatParcelizer) {
                        float f6 = ((f5 + f) * geta3.RemoteActionCompatParcelizer) / 2.0f;
                        if (f6 > 0.0f) {
                            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = null;
                        }
                        this.MediaSessionCompatQueueItem = geta3.RemoteActionCompatParcelizer;
                    }
                    this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setColor(geta3.IconCompatParcelizer);
                    float f7 = geta3.RemoteActionCompatParcelizer;
                    copyzey9I6wdefault copyzey9i6wdefault2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    if (f7 > 0.0f) {
                        copyzey9i6wdefault2.setMaskFilter(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    } else {
                        copyzey9i6wdefault2.setMaskFilter(null);
                    }
                    this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setFilterBitmap(true);
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.drawBitmap(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, Math.round(geta3.serializer * f5), Math.round(geta3.read * f), this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                    canvas3.drawBitmap(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, this.RatingCompat, this.MediaBrowserCompatMediaItem);
                }
                if (this.read == null) {
                    this.read = new android.graphics.Rect();
                }
                this.read.set(0, 0, (int) (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.width() * this.MediaSessionCompatToken[0]), (int) (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.height() * this.MediaSessionCompatToken[4]));
                this.PlaybackStateCompat.drawBitmap(this.IconCompatParcelizer, this.read, this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, this.MediaBrowserCompatMediaItem);
            }
        }
        this.PlaybackStateCompat = null;
    }

    public static boolean RemoteActionCompatParcelizer(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public final RectF RemoteActionCompatParcelizer(RectF rectF, getA geta) {
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            this.MediaSessionCompatResultReceiverWrapper = new RectF();
        }
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs == null) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = new RectF();
        }
        this.MediaSessionCompatResultReceiverWrapper.set(rectF);
        this.MediaSessionCompatResultReceiverWrapper.offsetTo(rectF.left + geta.serializer, rectF.top + geta.read);
        RectF rectF2 = this.MediaSessionCompatResultReceiverWrapper;
        float f = -geta.RemoteActionCompatParcelizer;
        rectF2.inset(f, f);
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.set(rectF);
        this.MediaSessionCompatResultReceiverWrapper.union(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public final android.graphics.Canvas read(android.graphics.Canvas canvas, RectF rectF, DeltaDecoder deltaDecoder) {
        getD75 getd75;
        if (this.PlaybackStateCompat == null) {
            if (this.MediaSessionCompatToken == null) {
                this.MediaSessionCompatToken = new float[9];
            }
            if (this.ParcelableVolumeInfo == null) {
                this.ParcelableVolumeInfo = new android.graphics.Matrix();
            }
            canvas.getMatrix(this.ParcelableVolumeInfo);
            this.ParcelableVolumeInfo.getValues(this.MediaSessionCompatToken);
            float[] fArr = this.MediaSessionCompatToken;
            float f = fArr[0];
            float f2 = fArr[4];
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus == null) {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new RectF();
            }
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
            this.PlaybackStateCompat = canvas;
            this.PlaybackStateCompatCustomAction = deltaDecoder;
            if (deltaDecoder.write >= 255 && !deltaDecoder.read()) {
                getd75 = getD75.DIRECT;
            } else if (!deltaDecoder.read()) {
                getd75 = getD75.SAVE_LAYER;
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i < 29 || !canvas.isHardwareAccelerated() || i <= 31) {
                    getd75 = getD75.BITMAP;
                } else {
                    getd75 = getD75.RENDER_NODE;
                }
            }
            this.MediaDescriptionCompat = getd75;
            if (this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw == null) {
                this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new RectF();
            }
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            if (this.MediaBrowserCompatMediaItem == null) {
                this.MediaBrowserCompatMediaItem = new copyzey9I6wdefault();
            }
            this.MediaBrowserCompatMediaItem.reset();
            int i2 = getD65.serializer[this.MediaDescriptionCompat.ordinal()];
            if (i2 == 1) {
                canvas.save();
                return canvas;
            }
            if (i2 != 2) {
                android.graphics.Matrix matrix = write;
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (this.ComponentActivity == null) {
                                this.ComponentActivity = new RenderNode("OffscreenLayer.main");
                            }
                            if (deltaDecoder.read() && this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ == null) {
                                this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = new RenderNode("OffscreenLayer.shadow");
                                this.MediaMetadataCompat = null;
                            }
                            this.ComponentActivity.setAlpha(deltaDecoder.write / 255.0f);
                            if (deltaDecoder.read()) {
                                RenderNode renderNode = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                                if (renderNode != null) {
                                    renderNode.setAlpha(deltaDecoder.write / 255.0f);
                                } else {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Must initialize shadowRenderNode when we have shadow");
                                    return null;
                                }
                            }
                            this.ComponentActivity.setHasOverlappingRendering(true);
                            RenderNode renderNode2 = this.ComponentActivity;
                            RectF rectF2 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                            RecordingCanvas recordingCanvasBeginRecording = this.ComponentActivity.beginRecording((int) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.width(), (int) this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.height());
                            recordingCanvasBeginRecording.setMatrix(matrix);
                            recordingCanvasBeginRecording.scale(f, f2);
                            recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
                            return recordingCanvasBeginRecording;
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("RenderNode not supported but we chose it as render strategy");
                        return null;
                    }
                    ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Invalid render strategy for OffscreenLayer");
                    return null;
                }
                if (this.serializer == null) {
                    copyzey9I6wdefault copyzey9i6wdefault = new copyzey9I6wdefault();
                    this.serializer = copyzey9i6wdefault;
                    copyzey9i6wdefault.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                if (RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
                    Bitmap bitmap = this.IconCompatParcelizer;
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    Bitmap bitmapIconCompatParcelizer = IconCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, Bitmap.Config.ARGB_8888);
                    this.IconCompatParcelizer = bitmapIconCompatParcelizer;
                    this.RemoteActionCompatParcelizer = new android.graphics.Canvas(bitmapIconCompatParcelizer);
                } else {
                    android.graphics.Canvas canvas2 = this.RemoteActionCompatParcelizer;
                    if (canvas2 != null) {
                        canvas2.setMatrix(matrix);
                        this.RemoteActionCompatParcelizer.drawRect(-1.0f, -1.0f, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.width() + 1.0f, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.height() + 1.0f, this.serializer);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("If needNewBitmap() returns true, we should have a canvas ready");
                        return null;
                    }
                }
                populateFocusOrder.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, null);
                this.MediaBrowserCompatMediaItem.setColorFilter(null);
                this.MediaBrowserCompatMediaItem.setAlpha(deltaDecoder.write);
                android.graphics.Canvas canvas3 = this.RemoteActionCompatParcelizer;
                canvas3.scale(f, f2);
                canvas3.translate(-rectF.left, -rectF.top);
                return canvas3;
            }
            this.MediaBrowserCompatMediaItem.setAlpha(deltaDecoder.write);
            this.MediaBrowserCompatMediaItem.setColorFilter(null);
            newD50Xyzui_graphics.RemoteActionCompatParcelizer(canvas, rectF, this.MediaBrowserCompatMediaItem);
            return canvas;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        return null;
    }

    public static Bitmap IconCompatParcelizer(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }
}
