package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SubcomposeSlotReusePolicySlotIdsSet extends FrameLayout {
    public static final withMotionFrameOfReferencePlacement IconCompatParcelizer = new withMotionFrameOfReferencePlacement(1);
    public PorterDuff.Mode MediaBrowserCompatMediaItem;
    public ColorStateList MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public getSetRootui MediaSessionCompatQueueItem;
    public final SubcomposeLayoutPausableCompositionException MediaSessionCompatToken;
    public android.graphics.Rect PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public final float RemoteActionCompatParcelizer;
    public boolean read;
    public int serializer;
    public final float write;

    public SubcomposeSlotReusePolicySlotIdsSet(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, setMeasuredSizeozmzZPI.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            setElevation(dimensionPixelSize);
        }
        this.serializer = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.MediaSessionCompatToken = SubcomposeLayoutPausableCompositionException.serializer(context2, attributeSet, 0, 0).IconCompatParcelizer();
        }
        this.write = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(ScaleFactorKt.IconCompatParcelizer(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(getResumePausedNjRlDlw.read(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.RatingCompat = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(IconCompatParcelizer);
        setFocusable(true);
        if (getBackground() == null) {
            int iWrite = mergeRulerValues.write(getBackgroundOverlayColorAlpha(), mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorSurface, this), mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorOnSurface, this));
            SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = this.MediaSessionCompatToken;
            if (subcomposeLayoutPausableCompositionException != null) {
                restore restoreVar = getSetRootui.IconCompatParcelizer;
                SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy(subcomposeLayoutPausableCompositionException);
                subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(ColorStateList.valueOf(iWrite));
                drawable = subcomposeSlotReusePolicy;
            } else {
                Resources resources = getResources();
                restore restoreVar2 = getSetRootui.IconCompatParcelizer;
                float dimension = resources.getDimension(com.logistics.rider.glovo.R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iWrite);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.MediaDescriptionCompat;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(getSetRootui getsetrootui) {
        this.MediaSessionCompatQueueItem = getsetrootui;
    }

    public float getActionTextColorAlpha() {
        return this.RemoteActionCompatParcelizer;
    }

    public int getAnimationMode() {
        return this.serializer;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.write;
    }

    public int getMaxInlineActionWidth() {
        return this.RatingCompat;
    }

    public int getMaxWidth() {
        return this.MediaMetadataCompat;
    }

    public void setAnimationMode(int i) {
        this.serializer = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.MediaDescriptionCompat != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.MediaDescriptionCompat);
            drawable.setTintMode(this.MediaBrowserCompatMediaItem);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.MediaDescriptionCompat = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.MediaBrowserCompatMediaItem);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.MediaBrowserCompatMediaItem = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getSetRootui getsetrootui = this.MediaSessionCompatQueueItem;
        if (getsetrootui != null) {
            getsetrootui.serializer();
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int i;
        boolean z;
        forEach foreach;
        super.onDetachedFromWindow();
        getSetRootui getsetrootui = this.MediaSessionCompatQueueItem;
        if (getsetrootui != null) {
            androidx.transition.TransitionValuesMaps transitionValuesMapsMediaDescriptionCompat = androidx.transition.TransitionValuesMaps.MediaDescriptionCompat();
            SubcomposeMeasureScope subcomposeMeasureScope = getsetrootui.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
            synchronized (transitionValuesMapsMediaDescriptionCompat.MediaBrowserCompatMediaItem) {
                i = 1;
                z = transitionValuesMapsMediaDescriptionCompat.IconCompatParcelizer(subcomposeMeasureScope) || ((foreach = (forEach) transitionValuesMapsMediaDescriptionCompat.RatingCompat) != null && foreach.read.get() == subcomposeMeasureScope);
            }
            if (z) {
                getSetRootui.MediaDescriptionCompat.post(new SubcomposeLayoutStatePrecomposedSlotHandle(getsetrootui, i));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getSetRootui getsetrootui = this.MediaSessionCompatQueueItem;
        if (getsetrootui == null || !getsetrootui.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            return;
        }
        getsetrootui.MediaMetadataCompat();
        getsetrootui.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.MediaMetadataCompat;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.read || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.PlaybackStateCompatCustomAction = new android.graphics.Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        getSetRootui getsetrootui = this.MediaSessionCompatQueueItem;
        if (getsetrootui != null) {
            restore restoreVar = getSetRootui.IconCompatParcelizer;
            getsetrootui.MediaBrowserCompatMediaItem();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : IconCompatParcelizer);
        super.setOnClickListener(onClickListener);
    }
}
