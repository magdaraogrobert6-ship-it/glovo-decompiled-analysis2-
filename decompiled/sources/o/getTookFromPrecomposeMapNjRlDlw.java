package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getTookFromPrecomposeMapNjRlDlw extends ProgressBar {
    public getSubcomposeForceReuseNjRlDlw IconCompatParcelizer;
    public final boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final onRemeasurementAvailable ParcelableVolumeInfo;
    public int PlaybackStateCompatCustomAction;
    public final getUnspecified_hLwfpcannotations RatingCompat;
    public final getSubcomposeNjRlDlw RemoteActionCompatParcelizer;
    public final onRemeasurementAvailable read;
    public final getSubcomposeNjRlDlw serializer;
    public boolean write;

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        synchronized (this) {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingTop;
        synchronized (this) {
            ScaleFactor currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            if (((getScaleYimpl) currentDrawingDelegate).IconCompatParcelizer.MediaSessionCompatQueueItem < 0) {
                paddingTop = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                paddingTop = ((getScaleYimpl) currentDrawingDelegate).IconCompatParcelizer.MediaSessionCompatQueueItem + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(defaultSize, paddingTop);
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminate(boolean z) {
        synchronized (this) {
            if (z == isIndeterminate()) {
                return;
            }
            copy8GGzs04default copy8ggzs04default = (copy8GGzs04default) getCurrentDrawable();
            if (copy8ggzs04default != null) {
                copy8ggzs04default.RemoteActionCompatParcelizer(false, false, false);
            }
            super.setIndeterminate(z);
            copy8GGzs04default copy8ggzs04default2 = (copy8GGzs04default) getCurrentDrawable();
            if (copy8ggzs04default2 != null) {
                copy8ggzs04default2.RemoteActionCompatParcelizer(write(), false, false);
            }
            if ((copy8ggzs04default2 instanceof ScaleFactorCompanion) && write()) {
                ((ScaleFactorCompanion) copy8ggzs04default2).serializer.IconCompatParcelizer();
            }
            this.write = false;
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        synchronized (this) {
            if (isIndeterminate()) {
                return;
            }
            setProgressCompat(i, false);
        }
    }

    public int getHideAnimationBehavior() {
        return this.RatingCompat.RemoteActionCompatParcelizer;
    }

    public int[] getIndicatorColor() {
        return this.RatingCompat.IconCompatParcelizer;
    }

    public int getShowAnimationBehavior() {
        return this.RatingCompat.MediaBrowserCompatMediaItem;
    }

    public int getTrackColor() {
        return this.RatingCompat.MediaMetadataCompat;
    }

    public int getTrackCornerRadius() {
        return this.RatingCompat.MediaDescriptionCompat;
    }

    public int getTrackThickness() {
        return this.RatingCompat.MediaSessionCompatQueueItem;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.serializer);
        removeCallbacks(this.RemoteActionCompatParcelizer);
        ((copy8GGzs04default) getCurrentDrawable()).RemoteActionCompatParcelizer(false, false, false);
        ScaleFactorCompanion indeterminateDrawable = getIndeterminateDrawable();
        onRemeasurementAvailable onremeasurementavailable = this.read;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().write(onremeasurementavailable);
            getIndeterminateDrawable().serializer.serializer();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().write(onremeasurementavailable);
        }
        super.onDetachedFromWindow();
    }

    public void setAnimatorDurationScaleProvider(getSubcomposeForceReuseNjRlDlw getsubcomposeforcereusenjrldlw) {
        this.IconCompatParcelizer = getsubcomposeforcereusenjrldlw;
        if (getProgressDrawable() != null) {
            getProgressDrawable().MediaSessionCompatQueueItem = getsubcomposeforcereusenjrldlw;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().MediaSessionCompatQueueItem = getsubcomposeforcereusenjrldlw;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.RatingCompat.RemoteActionCompatParcelizer = i;
        invalidate();
    }

    public void setShowAnimationBehavior(int i) {
        this.RatingCompat.MediaBrowserCompatMediaItem = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        if (getunspecified_hlwfpcannotations.MediaMetadataCompat != i) {
            getunspecified_hlwfpcannotations.MediaMetadataCompat = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        if (getunspecified_hlwfpcannotations.MediaDescriptionCompat != i) {
            getunspecified_hlwfpcannotations.MediaDescriptionCompat = Math.min(i, getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem / 2);
        }
    }

    public void setTrackThickness(int i) {
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = this.RatingCompat;
        if (getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem != i) {
            getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem = i;
            requestLayout();
        }
    }

    public final boolean write() {
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().serializer.RemoteActionCompatParcelizer(this.ParcelableVolumeInfo);
        }
        getScaleXannotations progressDrawable = getProgressDrawable();
        onRemeasurementAvailable onremeasurementavailable = this.read;
        if (progressDrawable != null) {
            getScaleXannotations progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.RatingCompat == null) {
                progressDrawable2.RatingCompat = new ArrayList();
            }
            if (!progressDrawable2.RatingCompat.contains(onremeasurementavailable)) {
                progressDrawable2.RatingCompat.add(onremeasurementavailable);
            }
        }
        if (getIndeterminateDrawable() != null) {
            ScaleFactorCompanion indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.RatingCompat == null) {
                indeterminateDrawable.RatingCompat = new ArrayList();
            }
            if (!indeterminateDrawable.RatingCompat.contains(onremeasurementavailable)) {
                indeterminateDrawable.RatingCompat.add(onremeasurementavailable);
            }
        }
        if (write()) {
            if (this.MediaSessionCompatQueueItem > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.MediaBrowserCompatMediaItem) {
            ((copy8GGzs04default) getCurrentDrawable()).RemoteActionCompatParcelizer(write(), false, false);
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof ScaleFactorCompanion) {
            ((copy8GGzs04default) drawable).RemoteActionCompatParcelizer(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
            return;
        }
        if (drawable instanceof getScaleXannotations) {
            getScaleXannotations getscalexannotations = (getScaleXannotations) drawable;
            getscalexannotations.RemoteActionCompatParcelizer(false, false, false);
            super.setProgressDrawable(getscalexannotations);
            getscalexannotations.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Cannot set framework drawable as progress drawable.");
    }

    @Override // android.widget.ProgressBar
    public ScaleFactorCompanion getIndeterminateDrawable() {
        return (ScaleFactorCompanion) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public getScaleXannotations getProgressDrawable() {
        return (getScaleXannotations) super.getProgressDrawable();
    }

    private ScaleFactor getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().IconCompatParcelizer;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().read;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{mergeRulerValues.write(getContext(), com.logistics.rider.glovo.R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.RatingCompat.IconCompatParcelizer = iArr;
        getIndeterminateDrawable().serializer.RemoteActionCompatParcelizer();
        invalidate();
    }

    public void setProgressCompat(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.MediaMetadataCompat = i;
            this.MediaDescriptionCompat = z;
            this.write = true;
            if (getIndeterminateDrawable().isVisible()) {
                getSubcomposeForceReuseNjRlDlw getsubcomposeforcereusenjrldlw = this.IconCompatParcelizer;
                ContentResolver contentResolver = getContext().getContentResolver();
                getsubcomposeforcereusenjrldlw.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().serializer.read();
                    return;
                }
            }
            this.ParcelableVolumeInfo.read(getIndeterminateDrawable());
        }
    }

    public getTookFromPrecomposeMapNjRlDlw(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle);
        this.write = false;
        this.PlaybackStateCompatCustomAction = 4;
        this.RemoteActionCompatParcelizer = new getSubcomposeNjRlDlw(this, 0);
        this.serializer = new getSubcomposeNjRlDlw(this, 1);
        this.ParcelableVolumeInfo = new onRemeasurementAvailable(1, this);
        this.read = new onRemeasurementAvailable(2, this);
        Context context2 = getContext();
        getUnspecified_hLwfpcannotations getunspecified_hlwfpcannotations = new getUnspecified_hLwfpcannotations();
        getunspecified_hlwfpcannotations.IconCompatParcelizer = new int[0];
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(com.logistics.rider.glovo.R.dimen.mtrl_progress_track_thickness);
        getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = setMeasuredSizeozmzZPI.BaseProgressIndicator;
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context2, attributeSet, iArr, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator);
        getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem = ScaleFactorKt.serializer(context2, typedArrayObtainStyledAttributes, 8, dimensionPixelSize);
        getunspecified_hlwfpcannotations.MediaDescriptionCompat = Math.min(ScaleFactorKt.serializer(context2, typedArrayObtainStyledAttributes, 7, 0), getunspecified_hlwfpcannotations.MediaSessionCompatQueueItem / 2);
        getunspecified_hlwfpcannotations.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getInt(4, 0);
        getunspecified_hlwfpcannotations.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (!typedArrayObtainStyledAttributes.hasValue(2)) {
            getunspecified_hlwfpcannotations.IconCompatParcelizer = new int[]{mergeRulerValues.write(context2, com.logistics.rider.glovo.R.attr.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(2).type != 1) {
            getunspecified_hlwfpcannotations.IconCompatParcelizer = new int[]{typedArrayObtainStyledAttributes.getColor(2, -1)};
        } else {
            int[] intArray = context2.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(2, -1));
            getunspecified_hlwfpcannotations.IconCompatParcelizer = intArray;
            if (intArray.length == 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            getunspecified_hlwfpcannotations.MediaMetadataCompat = typedArrayObtainStyledAttributes.getColor(6, -1);
        } else {
            getunspecified_hlwfpcannotations.MediaMetadataCompat = getunspecified_hlwfpcannotations.IconCompatParcelizer[0];
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            getunspecified_hlwfpcannotations.MediaMetadataCompat = mergeRulerValues.read(getunspecified_hlwfpcannotations.MediaMetadataCompat, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr2 = setMeasuredSizeozmzZPI.LinearProgressIndicator;
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context2, attributeSet, iArr2, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator);
        getunspecified_hlwfpcannotations.serializer = typedArrayObtainStyledAttributes3.getInt(0, 1);
        getunspecified_hlwfpcannotations.read = typedArrayObtainStyledAttributes3.getInt(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        getunspecified_hlwfpcannotations.read();
        getunspecified_hlwfpcannotations.write = getunspecified_hlwfpcannotations.read == 1;
        this.RatingCompat = getunspecified_hlwfpcannotations;
        getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator);
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context2, attributeSet, iArr, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.glovo.R.attr.linearProgressIndicatorStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_LinearProgressIndicator);
        typedArrayObtainStyledAttributes4.getInt(5, -1);
        this.MediaSessionCompatQueueItem = Math.min(typedArrayObtainStyledAttributes4.getInt(3, -1), 1000);
        typedArrayObtainStyledAttributes4.recycle();
        this.IconCompatParcelizer = new getSubcomposeForceReuseNjRlDlw();
        this.MediaBrowserCompatMediaItem = true;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.MediaBrowserCompatMediaItem) {
            ((copy8GGzs04default) getCurrentDrawable()).RemoteActionCompatParcelizer(write(), false, z);
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        } else {
            this.PlaybackStateCompatCustomAction = i;
        }
    }
}
