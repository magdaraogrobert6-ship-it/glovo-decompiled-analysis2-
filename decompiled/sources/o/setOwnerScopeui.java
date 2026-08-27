package o;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class setOwnerScopeui extends View {
    public setParentui MediaSessionCompatQueueItem;
    public RxWorker$1$$ExternalSyntheticLambda0 RatingCompat;
    public CoroutineLiveData$$ExternalSyntheticLambda0 read;
    public Boolean serializer;
    public Long write;
    public static final int[] RemoteActionCompatParcelizer = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    public static final int[] IconCompatParcelizer = new int[0];

    public final void IconCompatParcelizer() {
        setRippleState(false);
    }

    public final void RemoteActionCompatParcelizer() {
        this.read = null;
        RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = this.RatingCompat;
        if (rxWorker$1$$ExternalSyntheticLambda0 != null) {
            removeCallbacks(rxWorker$1$$ExternalSyntheticLambda0);
            RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda1 = this.RatingCompat;
            rxWorker$1$$ExternalSyntheticLambda1.getClass();
            rxWorker$1$$ExternalSyntheticLambda1.run();
        } else {
            setParentui setparentui = this.MediaSessionCompatQueueItem;
            if (setparentui != null) {
                setparentui.setState(IconCompatParcelizer);
            }
        }
        setParentui setparentui2 = this.MediaSessionCompatQueueItem;
        if (setparentui2 == null) {
            return;
        }
        setparentui2.setVisible(false, false);
        unscheduleDrawable(setparentui2);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    private final void setRippleState(boolean z) {
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.RatingCompat;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.write;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (z || jCurrentAnimationTimeMillis - jLongValue >= 5) {
            int[] iArr = z ? RemoteActionCompatParcelizer : IconCompatParcelizer;
            setParentui setparentui = this.MediaSessionCompatQueueItem;
            if (setparentui != null) {
                setparentui.setState(iArr);
            }
        } else {
            RxWorker$1$$ExternalSyntheticLambda0 rxWorker$1$$ExternalSyntheticLambda0 = new RxWorker$1$$ExternalSyntheticLambda0(2, this);
            this.RatingCompat = rxWorker$1$$ExternalSyntheticLambda0;
            postDelayed(rxWorker$1$$ExternalSyntheticLambda0, 50L);
        }
        this.write = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(setOwnerScopeui setownerscopeui) {
        setParentui setparentui = setownerscopeui.MediaSessionCompatQueueItem;
        if (setparentui != null) {
            setparentui.setState(IconCompatParcelizer);
        }
        setownerscopeui.RatingCompat = null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) throws PendingIntent.CanceledException {
        CoroutineLiveData$$ExternalSyntheticLambda0 coroutineLiveData$$ExternalSyntheticLambda0 = this.read;
        if (coroutineLiveData$$ExternalSyntheticLambda0 != null) {
            coroutineLiveData$$ExternalSyntheticLambda0.invoke();
        }
    }

    /* JADX INFO: renamed from: setRippleProperties-biQXAtU, reason: not valid java name */
    public final void m5155setRipplePropertiesbiQXAtU(long j, long j2, int i) {
        setParentui setparentui = this.MediaSessionCompatQueueItem;
        if (setparentui == null) {
            return;
        }
        if (setparentui.getRadius() != i) {
            setparentui.setRadius(i);
        }
        long jM721copywmQWz5c$default = androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(j2, 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
        androidx.compose.ui.graphics.Color color = setparentui.read;
        if (color == null || !androidx.compose.ui.graphics.Color.m723equalsimpl0(color.m732unboximpl(), jM721copywmQWz5c$default)) {
            setparentui.read = androidx.compose.ui.graphics.Color.m712boximpl(jM721copywmQWz5c$default);
            setparentui.setColor(ColorStateList.valueOf(androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(jM721copywmQWz5c$default)));
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, MathKt.write(androidx.compose.ui.geometry.Size.m546getWidthimpl(j)), MathKt.write(androidx.compose.ui.geometry.Size.m543getHeightimpl(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        setparentui.setBounds(rect);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            RemoteActionCompatParcelizer();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    public final void RemoteActionCompatParcelizer(Button button, boolean z, long j, int i, long j2, CoroutineLiveData$$ExternalSyntheticLambda0 coroutineLiveData$$ExternalSyntheticLambda0) {
        if (this.MediaSessionCompatQueueItem != null) {
            if (!Boolean.valueOf(z).equals(this.serializer)) {
                setParentui setparentui = new setParentui(z);
                setBackground(setparentui);
                this.MediaSessionCompatQueueItem = setparentui;
                this.serializer = Boolean.valueOf(z);
            }
        } else {
            setParentui setparentui2 = new setParentui(z);
            setBackground(setparentui2);
            this.MediaSessionCompatQueueItem = setparentui2;
            this.serializer = Boolean.valueOf(z);
        }
        setParentui setparentui3 = this.MediaSessionCompatQueueItem;
        setparentui3.getClass();
        this.read = coroutineLiveData$$ExternalSyntheticLambda0;
        m5155setRipplePropertiesbiQXAtU(j, j2, i);
        if (z) {
            setparentui3.setHotspot(androidx.compose.ui.geometry.Offset.m477getXimpl(button.read), androidx.compose.ui.geometry.Offset.m478getYimpl(button.read));
        } else {
            setparentui3.setHotspot(setparentui3.getBounds().centerX(), setparentui3.getBounds().centerY());
        }
        setRippleState(true);
    }

    public setOwnerScopeui(Context context) {
        super(context);
    }
}
