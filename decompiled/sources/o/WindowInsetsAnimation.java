package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import io.sentry.SentryUUID;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
class WindowInsetsAnimation extends View {
    public int IconCompatParcelizer;
    public final ValueAnimator MediaBrowserCompatMediaItem;
    public final ArrayList MediaDescriptionCompat;
    public float MediaMetadataCompat;
    public final android.graphics.Paint MediaSessionCompatQueueItem;
    public final RectF MediaSessionCompatResultReceiverWrapper;
    public final int ParcelableVolumeInfo;
    public final int PlaybackStateCompatCustomAction;
    public boolean RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public double read;
    public int serializer;
    public final float write;

    public WindowInsetsAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.materialClockStyle);
        this.MediaBrowserCompatMediaItem = new ValueAnimator();
        this.MediaDescriptionCompat = new ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.MediaSessionCompatQueueItem = paint;
        this.MediaSessionCompatResultReceiverWrapper = new RectF();
        this.serializer = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.ClockHandView, com.logistics.rider.glovo.R.attr.materialClockStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_TimePicker_Clock);
        SentryUUID.write(context, com.logistics.rider.glovo.R.attr.motionDurationLong2, 200);
        SentryUUID.IconCompatParcelizer(context, com.logistics.rider.glovo.R.attr.motionEasingEmphasizedInterpolator, handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.PlaybackStateCompatCustomAction = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.ParcelableVolumeInfo = resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_clock_hand_stroke_width);
        this.write = resources.getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(0.0f);
        android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.serializer;
        int iRound = this.IconCompatParcelizer;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f = width;
        float f2 = iRound;
        float fCos = (float) Math.cos(this.read);
        float f3 = height;
        float fSin = (float) Math.sin(this.read);
        android.graphics.Paint paint = this.MediaSessionCompatQueueItem;
        paint.setStrokeWidth(0.0f);
        int i2 = this.PlaybackStateCompatCustomAction;
        canvas.drawCircle((fCos * f2) + f, (f2 * fSin) + f3, i2, paint);
        double dSin = Math.sin(this.read);
        double d = iRound - i2;
        paint.setStrokeWidth(this.ParcelableVolumeInfo);
        canvas.drawLine(f, f3, width + ((int) (Math.cos(this.read) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f3, this.write, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.MediaBrowserCompatMediaItem.isRunning()) {
            return;
        }
        setHandRotation(this.MediaMetadataCompat);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.RemoteActionCompatParcelizer = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.RemoteActionCompatParcelizer;
            if (this.RatingCompat) {
                this.serializer = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) Math.round(((float) this.IconCompatParcelizer) * 0.66f)) + TypedValue.applyDimension(1, 12.0f, getContext().getResources().getDisplayMetrics()) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.RemoteActionCompatParcelizer;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.MediaMetadataCompat != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            setHandRotation(f);
            z3 = true;
        }
        this.RemoteActionCompatParcelizer = z4 | z3;
        return true;
    }

    public final void setHandRotation(float f) {
        ValueAnimator valueAnimator = this.MediaBrowserCompatMediaItem;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f2 = f % 360.0f;
        this.MediaMetadataCompat = f2;
        this.read = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i = this.serializer;
        int iRound = this.IconCompatParcelizer;
        if (i == 2) {
            iRound = Math.round(iRound * 0.66f);
        }
        float f3 = width;
        float f4 = iRound;
        float fCos = (((float) Math.cos(this.read)) * f4) + f3;
        float fSin = (f4 * ((float) Math.sin(this.read))) + height;
        float f5 = this.PlaybackStateCompatCustomAction;
        this.MediaSessionCompatResultReceiverWrapper.set(fCos - f5, fSin - f5, fCos + f5, fSin + f5);
        Iterator it = this.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            getCutoutRulers getcutoutrulers = (getCutoutRulers) ((WindowInsetsRulerProvider) it.next());
            if (Math.abs(getcutoutrulers.ResultReceiver - f2) > 0.001f) {
                getcutoutrulers.ResultReceiver = f2;
                getcutoutrulers.findIntersectingTextView();
            }
        }
        invalidate();
    }
}
