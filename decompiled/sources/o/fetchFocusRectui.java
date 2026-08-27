package o;

import android.content.res.Resources;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.google.android.gms.stats.zza;
import com.huawei.riemann.location.common.utils.Constant;

/* JADX INFO: loaded from: classes.dex */
public final class fetchFocusRectui implements View.OnTouchListener {
    public static final int RemoteActionCompatParcelizer = android.view.ViewConfiguration.getTapTimeout();
    public final accesssetProcessingCustomEnterp ComponentActivity;
    public boolean IconCompatParcelizer;
    public final float[] MediaBrowserCompatMediaItem;
    public final float[] MediaDescriptionCompat;
    public final float[] MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public zza MediaSessionCompatResultReceiverWrapper;
    public final float[] MediaSessionCompatToken;
    public final float[] ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public final setHasNonEmbeddedTabs r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final setHasNonEmbeddedTabs r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public boolean read;
    public final int serializer;
    public final AccelerateInterpolator write;

    public static float serializer(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float read(int i, float f, float f2, float f3) {
        float fSerializer;
        float interpolation;
        float fSerializer2 = serializer(this.MediaSessionCompatToken[i] * f2, 0.0f, this.MediaBrowserCompatMediaItem[i]);
        float fIconCompatParcelizer = IconCompatParcelizer(f2 - f, fSerializer2) - IconCompatParcelizer(f, fSerializer2);
        AccelerateInterpolator accelerateInterpolator = this.write;
        if (fIconCompatParcelizer >= 0.0f) {
            if (fIconCompatParcelizer > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fIconCompatParcelizer);
            } else {
                fSerializer = 0.0f;
            }
            if (fSerializer == 0.0f) {
                return 0.0f;
            }
            float f4 = this.ParcelableVolumeInfo[i];
            float f5 = this.MediaMetadataCompat[i];
            float f6 = this.MediaDescriptionCompat[i];
            float f7 = f4 * f3;
            return fSerializer > 0.0f ? serializer(fSerializer * f7, f5, f6) : -serializer((-fSerializer) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fIconCompatParcelizer);
        fSerializer = serializer(interpolation, -1.0f, 1.0f);
        if (fSerializer == 0.0f) {
            return 0.0f;
        }
        float f8 = this.ParcelableVolumeInfo[i];
        float f9 = this.MediaMetadataCompat[i];
        float f10 = this.MediaDescriptionCompat[i];
        float f11 = f8 * f3;
        if (fSerializer > 0.0f) {
        }
    }

    public final boolean serializer() {
        setHasNonEmbeddedTabs sethasnonembeddedtabs;
        int count;
        accesssetProcessingCustomEnterp accesssetprocessingcustomenterp = this.ComponentActivity;
        float f = accesssetprocessingcustomenterp.MediaBrowserCompatMediaItem;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(accesssetprocessingcustomenterp.MediaSessionCompatQueueItem);
        if (iAbs != 0 && (count = (sethasnonembeddedtabs = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus).getCount()) != 0) {
            int childCount = sethasnonembeddedtabs.getChildCount();
            int firstVisiblePosition = sethasnonembeddedtabs.getFirstVisiblePosition();
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && sethasnonembeddedtabs.getChildAt(0).getTop() >= 0)) : !(firstVisiblePosition + childCount >= count && sethasnonembeddedtabs.getChildAt(childCount - 1).getBottom() <= sethasnonembeddedtabs.getHeight())) {
                return true;
            }
        }
        return false;
    }

    public fetchFocusRectui(setHasNonEmbeddedTabs sethasnonembeddedtabs) {
        accesssetProcessingCustomEnterp accesssetprocessingcustomenterp = new accesssetProcessingCustomEnterp();
        accesssetprocessingcustomenterp.serializer = Long.MIN_VALUE;
        accesssetprocessingcustomenterp.RatingCompat = -1L;
        accesssetprocessingcustomenterp.IconCompatParcelizer = 0L;
        this.ComponentActivity = accesssetprocessingcustomenterp;
        this.write = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.MediaSessionCompatToken = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.MediaBrowserCompatMediaItem = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.ParcelableVolumeInfo = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.MediaMetadataCompat = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.MediaDescriptionCompat = fArr5;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = sethasnonembeddedtabs;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.MediaSessionCompatQueueItem = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.serializer = RemoteActionCompatParcelizer;
        accesssetprocessingcustomenterp.write = Constant.ERROR_UNKNOWN;
        accesssetprocessingcustomenterp.read = Constant.ERROR_UNKNOWN;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = sethasnonembeddedtabs;
    }

    public final void write() {
        int i = 0;
        if (this.PlaybackStateCompat) {
            this.IconCompatParcelizer = false;
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        accesssetProcessingCustomEnterp accesssetprocessingcustomenterp = this.ComponentActivity;
        int i2 = (int) (jCurrentAnimationTimeMillis - accesssetprocessingcustomenterp.serializer);
        int i3 = accesssetprocessingcustomenterp.read;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        accesssetprocessingcustomenterp.RemoteActionCompatParcelizer = i;
        accesssetprocessingcustomenterp.MediaDescriptionCompat = accesssetprocessingcustomenterp.write(jCurrentAnimationTimeMillis);
        accesssetprocessingcustomenterp.RatingCompat = jCurrentAnimationTimeMillis;
    }

    public final float IconCompatParcelizer(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.MediaSessionCompatQueueItem;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.IconCompatParcelizer && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.RatingCompat
            r1 = 0
            if (r0 != 0) goto L7
            goto L7e
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7e
        L17:
            r7.write()
            return r1
        L1b:
            r7.PlaybackStateCompatCustomAction = r2
            r7.read = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            o.setHasNonEmbeddedTabs r4 = r7.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.read(r1, r0, r3, r5)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.read(r2, r9, r8, r3)
            o.accesssetProcessingCustomEnterp r9 = r7.ComponentActivity
            r9.MediaSessionCompatQueueItem = r0
            r9.MediaBrowserCompatMediaItem = r8
            boolean r8 = r7.IconCompatParcelizer
            if (r8 != 0) goto L7e
            boolean r8 = r7.serializer()
            if (r8 == 0) goto L7e
            com.google.android.gms.stats.zza r8 = r7.MediaSessionCompatResultReceiverWrapper
            if (r8 != 0) goto L62
            com.google.android.gms.stats.zza r8 = new com.google.android.gms.stats.zza
            r9 = 10
            r8.<init>(r9, r7)
            r7.MediaSessionCompatResultReceiverWrapper = r8
        L62:
            r7.IconCompatParcelizer = r2
            r7.PlaybackStateCompat = r2
            boolean r8 = r7.read
            if (r8 != 0) goto L77
            int r8 = r7.serializer
            if (r8 <= 0) goto L77
            com.google.android.gms.stats.zza r9 = r7.MediaSessionCompatResultReceiverWrapper
            long r5 = (long) r8
            java.util.WeakHashMap r8 = o.FocusPropertiesNode.RatingCompat
            r4.postOnAnimationDelayed(r9, r5)
            goto L7c
        L77:
            com.google.android.gms.stats.zza r8 = r7.MediaSessionCompatResultReceiverWrapper
            r8.run()
        L7c:
            r7.read = r2
        L7e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.fetchFocusRectui.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
