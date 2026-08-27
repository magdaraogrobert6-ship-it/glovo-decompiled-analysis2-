package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.search.MapboxSearchSdkInitializerImpl;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getFloat extends View {
    public static final /* synthetic */ int IconCompatParcelizer = 0;
    public final isAdapterPositionOnScreen MediaBrowserCompatMediaItem;
    public final Float[][] MediaDescriptionCompat;
    public final float MediaSessionCompatQueueItem;
    public final ValueAnimator RatingCompat;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public float read;
    public final isAdapterPositionOnScreen serializer;
    public float write;

    private final float getDotSize() {
        return ((Number) this.serializer.MediaSessionCompatResultReceiverWrapper()).floatValue();
    }

    private final float getDotSpacing() {
        return ((Number) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).floatValue();
    }

    private final android.graphics.Paint getPaint() {
        return (android.graphics.Paint) this.MediaBrowserCompatMediaItem.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.RatingCompat.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.RatingCompat.cancel();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int iWrite = MathKt.write((float) Math.floor(this.write));
        Float[][] fArr = this.MediaDescriptionCompat;
        int length = iWrite % fArr.length;
        int length2 = fArr.length;
        float paddingStart = getPaddingStart() + getDotSize();
        float measuredHeight = getMeasuredHeight() / 2.0f;
        for (int i = 0; i < 3; i++) {
            float fFloatValue = fArr[length][i].floatValue();
            canvas.drawCircle(paddingStart, measuredHeight, c8$$ExternalSyntheticOutline0.m(fArr[(length + 1) % length2][i].floatValue(), fFloatValue, (this.read * this.MediaSessionCompatQueueItem) % 1.0f, fFloatValue) * getDotSize(), getPaint());
            paddingStart += getDotSpacing();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getFloat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(1.75f);
        Float fValueOf3 = Float.valueOf(0.645f);
        this.MediaDescriptionCompat = new Float[][]{new Float[]{fValueOf, fValueOf, fValueOf}, new Float[]{fValueOf2, fValueOf3, fValueOf}, new Float[]{fValueOf, fValueOf2, fValueOf3}, new Float[]{fValueOf, fValueOf, fValueOf2}};
        this.serializer = new isAdapterPositionOnScreen(new getNamedFloat(this, 0));
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new getNamedFloat(this, 1));
        this.MediaSessionCompatQueueItem = 4.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 4.0f);
        valueAnimatorOfFloat.setDuration(1004L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f));
        valueAnimatorOfFloat.addUpdateListener(new TileMode(3, this));
        this.RatingCompat = valueAnimatorOfFloat;
        this.MediaBrowserCompatMediaItem = new isAdapterPositionOnScreen(new MapboxSearchSdkInitializerImpl.AnonymousClass1(context, 2));
    }

    private final float getViewWidth() {
        return ((getDotSpacing() * 3.0f) + (getPaddingEnd() + getPaddingStart())) - ((getDotSize() * 3.0f) / 2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, MathKt.write(getViewWidth()));
        } else if (mode != 1073741824) {
            size = MathKt.write(getViewWidth());
        }
        int iWrite = MathKt.write((getDotSize() * 2.0f * 1.75f) + 2.0f);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, iWrite);
        } else if (mode2 != 1073741824) {
            size2 = iWrite;
        }
        setMeasuredDimension(size, size2);
    }
}
