package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class accessgetReuseDeactivationViaHostcp extends androidx.appcompat.widget.AppCompatImageView implements createPausedPrecomposition {
    public ColorStateList ComponentActivity;
    public final int IconCompatParcelizer;
    public final RectF MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public final android.graphics.Paint MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final android.graphics.Path MediaSessionCompatResultReceiverWrapper;
    public final int MediaSessionCompatToken;
    public final BrazeImageUtils ParcelableVolumeInfo;
    public final RectF PlaybackStateCompat;
    public final android.graphics.Path PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public SubcomposeLayoutPausableCompositionException ResultReceiver;
    public SubcomposeSlotReusePolicy r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final android.graphics.Paint read;

    public int getContentPaddingBottom() {
        return this.IconCompatParcelizer;
    }

    public int getContentPaddingTop() {
        return this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public SubcomposeLayoutPausableCompositionException getShapeAppearanceModel() {
        return this.ResultReceiver;
    }

    public ColorStateList getStrokeColor() {
        return this.ComponentActivity;
    }

    public float getStrokeWidth() {
        return this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public final boolean read() {
        return getLayoutDirection() == 1;
    }

    public final int getContentPaddingEnd() {
        int i = this.MediaDescriptionCompat;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return read() ? this.RatingCompat : this.MediaSessionCompatToken;
    }

    public final int getContentPaddingStart() {
        int i = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return read() ? this.MediaSessionCompatToken : this.RatingCompat;
    }

    @Override // o.createPausedPrecomposition
    public void setShapeAppearanceModel(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this.ResultReceiver = subcomposeLayoutPausableCompositionException;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (subcomposeSlotReusePolicy != null) {
            subcomposeSlotReusePolicy.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        }
        read(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.ComponentActivity = colorStateList;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.MediaSessionCompatResultReceiverWrapper, this.MediaMetadataCompat);
        if (this.ComponentActivity == null) {
            return;
        }
        float f = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        android.graphics.Paint paint = this.read;
        paint.setStrokeWidth(f);
        int colorForState = this.ComponentActivity.getColorForState(getDrawableState(), this.ComponentActivity.getDefaultColor());
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus <= 0.0f || colorForState == 0) {
            return;
        }
        paint.setColor(colorForState);
        canvas.drawPath(this.PlaybackStateCompatCustomAction, paint);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.MediaSessionCompatQueueItem && isLayoutDirectionResolved()) {
            this.MediaSessionCompatQueueItem = true;
            if (!isPaddingRelative() && this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == Integer.MIN_VALUE && this.MediaDescriptionCompat == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        read(i, i2);
    }

    public accessgetReuseDeactivationViaHostcp(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, 0, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_ShapeableImageView), attributeSet, 0);
        this.ParcelableVolumeInfo = SubcomposeLayoutKtSubcomposeLayout41.RemoteActionCompatParcelizer;
        this.PlaybackStateCompatCustomAction = new android.graphics.Path();
        this.MediaSessionCompatQueueItem = false;
        Context context2 = getContext();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.MediaMetadataCompat = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.MediaBrowserCompatMediaItem = new RectF();
        this.PlaybackStateCompat = new RectF();
        this.MediaSessionCompatResultReceiverWrapper = new android.graphics.Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.ShapeableImageView, 0, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_ShapeableImageView);
        setLayerType(2, null);
        this.ComponentActivity = ScaleFactorKt.IconCompatParcelizer(context2, typedArrayObtainStyledAttributes, 9);
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.RatingCompat = dimensionPixelSize;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = dimensionPixelSize;
        this.MediaSessionCompatToken = dimensionPixelSize;
        this.IconCompatParcelizer = dimensionPixelSize;
        this.RatingCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.MediaSessionCompatToken = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.read = paint2;
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.ResultReceiver = SubcomposeLayoutPausableCompositionException.serializer(context2, attributeSet, 0, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_ShapeableImageView).IconCompatParcelizer();
        setOutlineProvider(new accessgetReuseSyncDeactivationcp(this));
    }

    public int getContentPaddingLeft() {
        int i = this.MediaDescriptionCompat;
        int i2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (read() && i != Integer.MIN_VALUE) {
                return i;
            }
            if (!read() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
        }
        return this.RatingCompat;
    }

    public int getContentPaddingRight() {
        int i = this.MediaDescriptionCompat;
        int i2 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        if (i2 != Integer.MIN_VALUE || i != Integer.MIN_VALUE) {
            if (read() && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!read() && i != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.MediaSessionCompatToken;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(FocusListener.write(getContext(), i));
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public final void read(int i, int i2) {
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float paddingRight = i - getPaddingRight();
        float paddingBottom = i2 - getPaddingBottom();
        RectF rectF = this.MediaBrowserCompatMediaItem;
        rectF.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.ResultReceiver;
        BrazeImageUtils brazeImageUtils = this.ParcelableVolumeInfo;
        android.graphics.Path path = this.PlaybackStateCompatCustomAction;
        brazeImageUtils.IconCompatParcelizer(subcomposeLayoutPausableCompositionException, 1.0f, rectF, null, path);
        android.graphics.Path path2 = this.MediaSessionCompatResultReceiverWrapper;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.PlaybackStateCompat;
        rectF2.set(0.0f, 0.0f, i, i2);
        path2.addRect(rectF2, android.graphics.Path.Direction.CCW);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(getContentPaddingLeft() + i, getContentPaddingTop() + i2, getContentPaddingRight() + i3, getContentPaddingBottom() + i4);
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(getContentPaddingStart() + i, getContentPaddingTop() + i2, getContentPaddingEnd() + i3, getContentPaddingBottom() + i4);
    }

    public void setStrokeWidth(float f) {
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != f) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = f;
            invalidate();
        }
    }
}
