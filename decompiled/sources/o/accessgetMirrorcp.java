package o;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetMirrorcp extends Drawable implements Drawable.Callback, android.graphics.drawable.Animatable {
    public static final List IconCompatParcelizer = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor write = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new getD55());
    public boolean ComponentActivity;
    public boolean MediaBrowserCompatMediaItem;
    public StrokeJoinCompanion MediaDescriptionCompat;
    public RectF MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public Map MediaSessionCompatResultReceiverWrapper;
    public com.airbnb.lottie.parser.DropShadowEffect MediaSessionCompatToken;
    public getComponentCount ParcelableVolumeInfo;
    public getBt2020 PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public android.graphics.Rect RatingCompat;
    public final getB RemoteActionCompatParcelizer;
    public boolean ResultReceiver;
    public android.graphics.Matrix _init_lambda1;
    public RectF _init_lambda2;
    public android.graphics.Matrix _init_lambda3;
    public final float[] _init_lambda4;
    public copyzey9I6wdefault accessensureViewModelStore;
    public android.graphics.Rect addObserverForBackInvoker;
    public final RxWorker$1$$ExternalSyntheticLambda0 addObserverForBackInvokerlambda0;
    public final boolean createFullyDrawnExecutor;
    public RectF defaultViewModelProviderFactory_delegatelambda0;
    public boolean ensureViewModelStore;
    public float r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final ArrayList r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getExponentimpl r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final android.graphics.Matrix r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public boolean r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public getComposeTileModeDecal3opZhB0 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public getDecal3opZhB0 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public boolean r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public android.graphics.Canvas r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public android.graphics.Rect r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public Bitmap r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final Semaphore r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public int read;
    public getMiterLxFBmk8 serializer;

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.read;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final isWideGamut IconCompatParcelizer() {
        isWideGamut iswidegamut = null;
        for (String str : IconCompatParcelizer) {
            StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
            int size = strokeJoinCompanion.PlaybackStateCompatCustomAction.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    iswidegamut = null;
                    break;
                }
                isWideGamut iswidegamut2 = (isWideGamut) strokeJoinCompanion.PlaybackStateCompatCustomAction.get(i);
                String str2 = iswidegamut2.RemoteActionCompatParcelizer;
                if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                    iswidegamut = iswidegamut2;
                    break;
                }
                i++;
            }
            if (iswidegamut != null) {
                break;
            }
        }
        return iswidegamut;
    }

    public final void IconCompatParcelizer(android.graphics.Canvas canvas) {
        getBt2020 getbt2020 = this.PlaybackStateCompat;
        StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
        if (getbt2020 == null || strokeJoinCompanion == null) {
            return;
        }
        android.graphics.Matrix matrix = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        matrix.reset();
        android.graphics.Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / strokeJoinCompanion.write.width();
            float fHeight = bounds.height() / strokeJoinCompanion.write.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        getbt2020.RemoteActionCompatParcelizer(canvas, matrix, this.read, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.read = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        getD50Xyzui_graphics.IconCompatParcelizer("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.clear();
        getB getb = this.RemoteActionCompatParcelizer;
        getb.RemoteActionCompatParcelizer(true);
        getb.serializer(getb.IconCompatParcelizer());
        if (isVisible()) {
            return;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
    }

    public final void write() {
        StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
        if (strokeJoinCompanion == null) {
            return;
        }
        colorResource colorresource = getDestination.read;
        android.graphics.Rect rect = strokeJoinCompanion.write;
        List list = Collections.EMPTY_LIST;
        getBt2020 getbt2020 = new getBt2020(this, new getAdobeRgb(list, strokeJoinCompanion, "__container", -1L, getBt2020Pq.PRE_COMP, -1L, null, list, new ColorSpaceKt(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, getBt2020PqTransferParametersui_graphics.NONE, null, false, null, null, createConnectorYBCOT_4.NORMAL), strokeJoinCompanion.MediaBrowserCompatMediaItem, strokeJoinCompanion);
        this.PlaybackStateCompat = getbt2020;
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            getbt2020.read(true);
        }
        this.PlaybackStateCompat.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = this.MediaBrowserCompatMediaItem;
    }

    public static void RemoteActionCompatParcelizer(android.graphics.Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            getDecal3opZhB0 getdecal3opzhb0 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            if (getdecal3opzhb0 == getDecal3opZhB0.PLAY) {
                read();
                return visible;
            }
            if (getdecal3opzhb0 == getDecal3opZhB0.RESUME) {
                RatingCompat();
                return visible;
            }
        } else {
            getB getb = this.RemoteActionCompatParcelizer;
            if (getb.MediaMetadataCompat) {
                this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.clear();
                getb.RemoteActionCompatParcelizer(true);
                Iterator it = getb.RatingCompat.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(getb);
                }
                if (!isVisible()) {
                    this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
                }
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        read();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public final boolean write(Context context) {
        fromXyz fromxyz;
        if (!this.createFullyDrawnExecutor) {
            return false;
        }
        getRoundLxFBmk8.RemoteActionCompatParcelizer.getClass();
        if (context != null) {
            android.graphics.Matrix matrix = newD50Xyzui_graphics.write;
            if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
                fromxyz = fromXyz.STANDARD_MOTION;
            } else {
                fromxyz = fromXyz.REDUCED_MOTION;
            }
        } else {
            fromxyz = fromXyz.STANDARD_MOTION;
        }
        return fromxyz == fromXyz.STANDARD_MOTION;
    }

    public accessgetMirrorcp() {
        getB getb = new getB();
        this.RemoteActionCompatParcelizer = getb;
        this.createFullyDrawnExecutor = true;
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = false;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ArrayList();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new getExponentimpl(9);
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = false;
        this.MediaBrowserCompatMediaItem = true;
        this.read = 255;
        this.MediaSessionCompatQueueItem = false;
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = getComposeTileModeDecal3opZhB0.AUTOMATIC;
        this.ensureViewModelStore = false;
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new android.graphics.Matrix();
        this._init_lambda4 = new float[9];
        this.ResultReceiver = false;
        TileMode tileMode = new TileMode(0, this);
        this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = new Semaphore(1);
        this.addObserverForBackInvokerlambda0 = new RxWorker$1$$ExternalSyntheticLambda0(10, this);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = -3.4028235E38f;
        getb.addUpdateListener(tileMode);
    }

    public final void RemoteActionCompatParcelizer() {
        StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
        if (strokeJoinCompanion == null) {
            return;
        }
        this.ensureViewModelStore = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.useSoftwareRendering(Build.VERSION.SDK_INT, strokeJoinCompanion.MediaMetadataCompat, strokeJoinCompanion.MediaSessionCompatResultReceiverWrapper);
    }

    public static boolean RemoteActionCompatParcelizer(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final boolean MediaMetadataCompat() {
        StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
        if (strokeJoinCompanion == null) {
            return false;
        }
        float f = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        float fSerializer = this.RemoteActionCompatParcelizer.serializer();
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = fSerializer;
        return Math.abs(fSerializer - f) * strokeJoinCompanion.RemoteActionCompatParcelizer() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        getBt2020 getbt2020 = this.PlaybackStateCompat;
        if (getbt2020 == null) {
            return;
        }
        getMiterLxFBmk8 getmiterlxfbmk8 = this.serializer;
        if (getmiterlxfbmk8 == null) {
            getmiterlxfbmk8 = getRoundLxFBmk8.read;
        }
        boolean z = getmiterlxfbmk8 == getMiterLxFBmk8.ENABLED;
        RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = this.addObserverForBackInvokerlambda0;
        ThreadPoolExecutor threadPoolExecutor = write;
        getB getb = this.RemoteActionCompatParcelizer;
        Semaphore semaphore = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                getMiterLxFBmk8 getmiterlxfbmk9 = getRoundLxFBmk8.read;
                if (!z) {
                    return;
                }
                semaphore.release();
                if (getbt2020.addObserverForBackInvokerlambda0 == getb.serializer()) {
                    return;
                }
            } catch (Throwable th) {
                getMiterLxFBmk8 getmiterlxfbmk10 = getRoundLxFBmk8.read;
                if (z) {
                    semaphore.release();
                    if (getbt2020.addObserverForBackInvokerlambda0 != getb.serializer()) {
                        threadPoolExecutor.execute(rxWorker$1$$ExternalSyntheticLambda0);
                    }
                }
                throw th;
            }
        }
        getMiterLxFBmk8 getmiterlxfbmk11 = getRoundLxFBmk8.read;
        if (z && MediaMetadataCompat()) {
            read(getb.serializer());
        }
        boolean z2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        boolean z3 = this.ensureViewModelStore;
        if (z2) {
            try {
                if (z3) {
                    RemoteActionCompatParcelizer(canvas, getbt2020);
                } else {
                    IconCompatParcelizer(canvas);
                }
            } catch (Throwable unused2) {
                getD50Xyzui_graphics.write.getClass();
                getMiterLxFBmk8 getmiterlxfbmk12 = getRoundLxFBmk8.read;
            }
        } else if (z3) {
            RemoteActionCompatParcelizer(canvas, getbt2020);
        } else {
            IconCompatParcelizer(canvas);
        }
        this.ResultReceiver = false;
        if (z) {
            semaphore.release();
            if (getbt2020.addObserverForBackInvokerlambda0 == getb.serializer()) {
                return;
            }
            threadPoolExecutor.execute(rxWorker$1$$ExternalSyntheticLambda0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
        if (strokeJoinCompanion == null) {
            return -1;
        }
        return strokeJoinCompanion.write.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
        if (strokeJoinCompanion == null) {
            return -1;
        }
        return strokeJoinCompanion.write.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.ResultReceiver) {
            return;
        }
        this.ResultReceiver = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        getB getb = this.RemoteActionCompatParcelizer;
        if (getb == null) {
            return false;
        }
        return getb.MediaMetadataCompat;
    }

    public final void read(final float f) {
        StrokeJoinCompanion strokeJoinCompanion = this.MediaDescriptionCompat;
        if (strokeJoinCompanion == null) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new getClamp3opZhB0() { // from class: o.accessgetDecalcp
                @Override // o.getClamp3opZhB0
                public final void RemoteActionCompatParcelizer() {
                    this.IconCompatParcelizer.read(f);
                }
            });
        } else {
            getMiterLxFBmk8 getmiterlxfbmk8 = getRoundLxFBmk8.read;
            this.RemoteActionCompatParcelizer.serializer(getD50.serializer(strokeJoinCompanion.PlaybackStateCompat, strokeJoinCompanion.read, f));
        }
    }

    public final void write(final int i) {
        if (this.MediaDescriptionCompat != null) {
            this.RemoteActionCompatParcelizer.serializer(i);
        } else {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new getClamp3opZhB0() { // from class: o.accessgetRepeatedcp
                @Override // o.getClamp3opZhB0
                public final void RemoteActionCompatParcelizer() {
                    this.IconCompatParcelizer.write(i);
                }
            });
        }
    }

    public final void RatingCompat() {
        if (this.PlaybackStateCompat == null) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new accessgetClampcp(this, 0));
            return;
        }
        RemoteActionCompatParcelizer();
        boolean zWrite = write(serializer());
        getB getb = this.RemoteActionCompatParcelizer;
        if (zWrite || getb.getRepeatCount() == 0) {
            if (isVisible()) {
                getb.MediaMetadataCompat = true;
                getb.RemoteActionCompatParcelizer(false);
                Choreographer.getInstance().postFrameCallback(getb);
                getb.serializer = 0L;
                if (getb.IconCompatParcelizer() && getb.RemoteActionCompatParcelizer == getb.read()) {
                    getb.serializer(getb.RemoteActionCompatParcelizer());
                } else if (!getb.IconCompatParcelizer() && getb.RemoteActionCompatParcelizer == getb.RemoteActionCompatParcelizer()) {
                    getb.serializer(getb.read());
                }
                Iterator it = getb.RatingCompat.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(getb);
                }
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
            } else {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.RESUME;
            }
        }
        if (write(serializer())) {
            return;
        }
        write((int) (getb.PlaybackStateCompat < 0.0f ? getb.read() : getb.RemoteActionCompatParcelizer()));
        getb.RemoteActionCompatParcelizer(true);
        getb.serializer(getb.IconCompatParcelizer());
        if (isVisible()) {
            return;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
    }

    public final void RemoteActionCompatParcelizer(StrokeJoinCompanion strokeJoinCompanion) {
        if (this.MediaDescriptionCompat == strokeJoinCompanion) {
            return;
        }
        this.ResultReceiver = true;
        getB getb = this.RemoteActionCompatParcelizer;
        if (getb.MediaMetadataCompat) {
            getb.cancel();
            if (!isVisible()) {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
            }
        }
        this.MediaDescriptionCompat = null;
        this.PlaybackStateCompat = null;
        this.ParcelableVolumeInfo = null;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = -3.4028235E38f;
        getb.IconCompatParcelizer = null;
        getb.MediaSessionCompatQueueItem = -2.1474836E9f;
        getb.MediaDescriptionCompat = 2.1474836E9f;
        invalidateSelf();
        this.MediaDescriptionCompat = strokeJoinCompanion;
        write();
        boolean z = getb.IconCompatParcelizer == null;
        getb.IconCompatParcelizer = strokeJoinCompanion;
        if (z) {
            getb.serializer(Math.max(getb.MediaSessionCompatQueueItem, strokeJoinCompanion.PlaybackStateCompat), Math.min(getb.MediaDescriptionCompat, strokeJoinCompanion.read));
        } else {
            getb.serializer((int) strokeJoinCompanion.PlaybackStateCompat, (int) strokeJoinCompanion.read);
        }
        float f = getb.RemoteActionCompatParcelizer;
        getb.RemoteActionCompatParcelizer = 0.0f;
        getb.read = 0.0f;
        getb.serializer((int) f);
        getb.write();
        read(getb.getAnimatedFraction());
        ArrayList arrayList = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            getClamp3opZhB0 getclamp3opzhb0 = (getClamp3opZhB0) it.next();
            if (getclamp3opzhb0 != null) {
                getclamp3opzhb0.RemoteActionCompatParcelizer();
            }
            it.remove();
        }
        arrayList.clear();
        strokeJoinCompanion.MediaSessionCompatToken.getClass();
        RemoteActionCompatParcelizer();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    public final void read() {
        if (this.PlaybackStateCompat == null) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.add(new accessgetClampcp(this, 1));
            return;
        }
        RemoteActionCompatParcelizer();
        boolean zWrite = write(serializer());
        getB getb = this.RemoteActionCompatParcelizer;
        if (zWrite || getb.getRepeatCount() == 0) {
            if (isVisible()) {
                getb.MediaMetadataCompat = true;
                boolean zIconCompatParcelizer = getb.IconCompatParcelizer();
                Iterator it = getb.write.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(getb, zIconCompatParcelizer);
                }
                getb.serializer((int) (getb.IconCompatParcelizer() ? getb.RemoteActionCompatParcelizer() : getb.read()));
                getb.serializer = 0L;
                getb.MediaBrowserCompatMediaItem = 0;
                if (getb.MediaMetadataCompat) {
                    getb.RemoteActionCompatParcelizer(false);
                    Choreographer.getInstance().postFrameCallback(getb);
                }
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
            } else {
                this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.PLAY;
            }
        }
        if (write(serializer())) {
            return;
        }
        isWideGamut iswidegamutIconCompatParcelizer = IconCompatParcelizer();
        if (iswidegamutIconCompatParcelizer != null) {
            write((int) iswidegamutIconCompatParcelizer.serializer);
        } else {
            write((int) (getb.PlaybackStateCompat < 0.0f ? getb.read() : getb.RemoteActionCompatParcelizer()));
        }
        getb.RemoteActionCompatParcelizer(true);
        getb.serializer(getb.IconCompatParcelizer());
        if (isVisible()) {
            return;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = getDecal3opZhB0.NONE;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00e7  */
    public final void RemoteActionCompatParcelizer(android.graphics.Canvas canvas, getBt2020 getbt2020) {
        if (this.MediaDescriptionCompat == null || getbt2020 == null) {
            return;
        }
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null) {
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new android.graphics.Canvas();
            this.defaultViewModelProviderFactory_delegatelambda0 = new RectF();
            this._init_lambda1 = new android.graphics.Matrix();
            this._init_lambda3 = new android.graphics.Matrix();
            this.RatingCompat = new android.graphics.Rect();
            this.MediaMetadataCompat = new RectF();
            this.accessensureViewModelStore = new copyzey9I6wdefault();
            this.addObserverForBackInvoker = new android.graphics.Rect();
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = new android.graphics.Rect();
            this._init_lambda2 = new RectF();
        }
        canvas.getMatrix(this._init_lambda1);
        canvas.getClipBounds(this.RatingCompat);
        android.graphics.Rect rect = this.RatingCompat;
        this.MediaMetadataCompat.set(rect.left, rect.top, rect.right, rect.bottom);
        this._init_lambda1.mapRect(this.MediaMetadataCompat);
        RemoteActionCompatParcelizer(this.RatingCompat, this.MediaMetadataCompat);
        boolean z = this.MediaBrowserCompatMediaItem;
        RectF rectF = this.defaultViewModelProviderFactory_delegatelambda0;
        if (z) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            getbt2020.read(rectF, null, false);
        }
        this._init_lambda1.mapRect(this.defaultViewModelProviderFactory_delegatelambda0);
        android.graphics.Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.defaultViewModelProviderFactory_delegatelambda0;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (!(parent instanceof ViewGroup) || !(!((ViewGroup) parent).getClipChildren())) {
                RectF rectF3 = this.defaultViewModelProviderFactory_delegatelambda0;
                android.graphics.Rect rect2 = this.RatingCompat;
                rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        } else {
            RectF rectF4 = this.defaultViewModelProviderFactory_delegatelambda0;
            android.graphics.Rect rect3 = this.RatingCompat;
            rectF4.intersect(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        RectF rectF5 = this.defaultViewModelProviderFactory_delegatelambda0;
        if (!RemoteActionCompatParcelizer(rectF5.left) || !RemoteActionCompatParcelizer(rectF5.top) || !RemoteActionCompatParcelizer(rectF5.right) || !RemoteActionCompatParcelizer(rectF5.bottom)) {
            getD50Xyzui_graphics.IconCompatParcelizer("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.defaultViewModelProviderFactory_delegatelambda0.width());
        int iCeil2 = (int) Math.ceil(this.defaultViewModelProviderFactory_delegatelambda0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            getD50Xyzui_graphics.IconCompatParcelizer("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ((long) iCeil) * ((long) iCeil2);
        if (j > 50000000) {
            getD50Xyzui_graphics.IconCompatParcelizer("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
            return;
        }
        Bitmap bitmap = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = bitmapCreateBitmap;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setBitmap(bitmapCreateBitmap);
            this.ResultReceiver = true;
        } else if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getWidth() > iCeil || this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, 0, 0, iCeil, iCeil2);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = bitmapCreateBitmap2;
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setBitmap(bitmapCreateBitmap2);
            this.ResultReceiver = true;
        }
        if (this.ResultReceiver) {
            android.graphics.Matrix matrix = this._init_lambda1;
            float[] fArr = this._init_lambda4;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            android.graphics.Matrix matrix2 = this._init_lambda1;
            android.graphics.Matrix matrix3 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF6 = this.defaultViewModelProviderFactory_delegatelambda0;
            matrix3.postTranslate(-rectF6.left, -rectF6.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.eraseColor(0);
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.setMatrix(newD50Xyzui_graphics.write);
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.scale(f, f2);
            getbt2020.RemoteActionCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, matrix3, this.read, null);
            this._init_lambda1.invert(this._init_lambda3);
            this._init_lambda3.mapRect(this._init_lambda2, this.defaultViewModelProviderFactory_delegatelambda0);
            RemoteActionCompatParcelizer(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, this._init_lambda2);
        }
        this.addObserverForBackInvoker.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, this.addObserverForBackInvoker, this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, this.accessensureViewModelStore);
    }

    public final Context serializer() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }
}
