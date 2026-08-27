package com.braze.ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.braze.enums.inappmessage.CropType;
import com.braze.support.BrazeLogger;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setRectOutlinetz77jQwdefault;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class InAppMessageImageView extends ImageView implements IInAppMessageImageView {
    private float aspectRatio;
    private Path clipPath;
    private float[] inAppRadii;
    private RectF rectf;
    private boolean setToHalfParentHeight;

    private static /* synthetic */ void getSetToHalfParentHeight$annotations() {
    }

    public final Path getClipPath() {
        return this.clipPath;
    }

    public final RectF getRectf() {
        return this.rectf;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiusPx(float f) {
        setCornersRadiiPx(f, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clipCanvasToPath$lambda$0() {
        return "In-app message radii is uninitialized, not clipping path.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String clipCanvasToPath$lambda$1() {
        return "Encountered exception while trying to clip in-app message image";
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setAltImageText(String str) {
        if (str != null) {
            setContentDescription(str);
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setAspectRatio(float f) {
        this.aspectRatio = f;
        requestLayout();
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setToHalfParentHeight(boolean z) {
        this.setToHalfParentHeight = z;
        requestLayout();
    }

    public final boolean clipCanvasToPath(Canvas canvas, int i, int i2) {
        canvas.getClass();
        if (this.inAppRadii == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(10), 7, (Object) null);
            return false;
        }
        try {
            this.clipPath.reset();
            this.rectf.set(0.0f, 0.0f, i, i2);
            this.clipPath.addRoundRect(this.rectf, getInAppRadii(), Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            return true;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new setRectOutlinetz77jQwdefault(11), 4, (Object) null);
            return false;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.getClass();
        clipCanvasToPath(canvas, getWidth(), getHeight());
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.aspectRatio != -1.0f && getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            int measuredWidth = getMeasuredWidth();
            setMeasuredDimension(measuredWidth, Math.min(getMeasuredHeight(), (int) (measuredWidth / this.aspectRatio)) + 1);
        } else {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        }
        if (this.setToHalfParentHeight) {
            Object parent = getParent();
            parent.getClass();
            setMeasuredDimension(getMeasuredWidth(), (int) (((double) ((View) parent).getHeight()) * 0.5d));
        }
    }

    public final void setClipPath(Path path) {
        path.getClass();
        this.clipPath = path;
    }

    public final void setRectf(RectF rectF) {
        rectF.getClass();
        this.rectf = rectF;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setInAppMessageImageCropType(CropType cropType) {
        if (cropType == CropType.FIT_CENTER) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (cropType == CropType.CENTER_CROP) {
            setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
    }

    public InAppMessageImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clipPath = new Path();
        this.rectf = new RectF();
        this.aspectRatio = -1.0f;
        setAdjustViewBounds(true);
    }

    public final float[] getInAppRadii() {
        float[] fArr = this.inAppRadii;
        if (fArr != null) {
            return fArr;
        }
        removeNodeAtDepth.serializer("inAppRadii");
        throw null;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImageView
    public void setCornersRadiiPx(float f, float f2, float f3, float f4) {
        this.inAppRadii = new float[]{f, f, f2, f2, f3, f3, f4, f4};
    }
}
