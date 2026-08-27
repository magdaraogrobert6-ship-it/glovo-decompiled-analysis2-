package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import com.sentiance.core.model.events.I$b;

/* JADX INFO: loaded from: classes2.dex */
public class RectRulersImpl extends drawWithRotationAndOffsetubNVwUQ implements Checkable, createPausedPrecomposition {
    public final RectRulersCompanion MediaMetadataCompat;
    public boolean MediaSessionCompatToken;
    public final boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public static final int[] MediaSessionCompatQueueItem = {android.R.attr.state_checkable};
    public static final int[] MediaBrowserCompatMediaItem = {android.R.attr.state_checked};
    public static final int[] MediaDescriptionCompat = {com.logistics.rider.glovo.R.attr.state_dragged};

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.MediaSessionCompatToken;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnCheckedChangeListener(innermostOf innermostof) {
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.MediaMetadataCompat.read.getBounds());
        return rectF;
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public ColorStateList getCardBackgroundColor() {
        return this.MediaMetadataCompat.read.getLifecycle.RemoteActionCompatParcelizer;
    }

    public ColorStateList getCardForegroundColor() {
        return this.MediaMetadataCompat.PlaybackStateCompatCustomAction.getLifecycle.RemoteActionCompatParcelizer;
    }

    public Drawable getCheckedIcon() {
        return this.MediaMetadataCompat.MediaDescriptionCompat;
    }

    public int getCheckedIconGravity() {
        return this.MediaMetadataCompat.MediaBrowserCompatMediaItem;
    }

    public int getCheckedIconMargin() {
        return this.MediaMetadataCompat.MediaSessionCompatQueueItem;
    }

    public int getCheckedIconSize() {
        return this.MediaMetadataCompat.RatingCompat;
    }

    public ColorStateList getCheckedIconTint() {
        return this.MediaMetadataCompat.MediaMetadataCompat;
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public int getContentPaddingBottom() {
        return this.MediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.bottom;
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public int getContentPaddingLeft() {
        return this.MediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.left;
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public int getContentPaddingRight() {
        return this.MediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.right;
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public int getContentPaddingTop() {
        return this.MediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.top;
    }

    public float getProgress() {
        return this.MediaMetadataCompat.read.getLifecycle.IconCompatParcelizer;
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public float getRadius() {
        return this.MediaMetadataCompat.read.MediaBrowserCompatMediaItem();
    }

    public ColorStateList getRippleColor() {
        return this.MediaMetadataCompat.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    }

    public SubcomposeLayoutPausableCompositionException getShapeAppearanceModel() {
        return this.MediaMetadataCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.MediaMetadataCompat.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.MediaMetadataCompat.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    }

    public int getStrokeWidth() {
        return this.MediaMetadataCompat.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        if (rectRulersCompanion != null && rectRulersCompanion.IconCompatParcelizer) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, MediaSessionCompatQueueItem);
        }
        if (this.MediaSessionCompatToken) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, MediaBrowserCompatMediaItem);
        }
        if (this.PlaybackStateCompatCustomAction) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, MediaDescriptionCompat);
        }
        return iArrOnCreateDrawableState;
    }

    public final void read() {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        RippleDrawable rippleDrawable = rectRulersCompanion.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (rippleDrawable != null) {
            android.graphics.Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            rectRulersCompanion.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            rectRulersCompanion.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = this.MediaMetadataCompat.PlaybackStateCompatCustomAction;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.MediaMetadataCompat.IconCompatParcelizer = z;
    }

    public void setCheckedIcon(Drawable drawable) {
        this.MediaMetadataCompat.read(drawable);
    }

    public void setCheckedIconGravity(int i) {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        if (rectRulersCompanion.MediaBrowserCompatMediaItem != i) {
            rectRulersCompanion.MediaBrowserCompatMediaItem = i;
            RectRulersImpl rectRulersImpl = rectRulersCompanion.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            rectRulersCompanion.IconCompatParcelizer(rectRulersImpl.getMeasuredWidth(), rectRulersImpl.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.MediaMetadataCompat.MediaSessionCompatQueueItem = i;
    }

    public void setCheckedIconSize(int i) {
        this.MediaMetadataCompat.RatingCompat = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.MediaMetadataCompat.RatingCompat = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        rectRulersCompanion.MediaMetadataCompat = colorStateList;
        Drawable drawable = rectRulersCompanion.MediaDescriptionCompat;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    public void setProgress(float f) {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        rectRulersCompanion.read.MediaSessionCompatQueueItem(f);
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = rectRulersCompanion.PlaybackStateCompatCustomAction;
        if (subcomposeSlotReusePolicy != null) {
            subcomposeSlotReusePolicy.MediaSessionCompatQueueItem(f);
        }
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = rectRulersCompanion.MediaSessionCompatResultReceiverWrapper;
        if (subcomposeSlotReusePolicy2 != null) {
            subcomposeSlotReusePolicy2.MediaSessionCompatQueueItem(f);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        rectRulersCompanion.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = colorStateList;
        RippleDrawable rippleDrawable = rectRulersCompanion.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        if (rectRulersCompanion.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != colorStateList) {
            rectRulersCompanion.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = colorStateList;
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = rectRulersCompanion.PlaybackStateCompatCustomAction;
            subcomposeSlotReusePolicy.getLifecycle.ParcelableVolumeInfo = rectRulersCompanion.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            subcomposeSlotReusePolicy.invalidateSelf();
            accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy.getLifecycle;
            if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateList) {
                accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateList;
                subcomposeSlotReusePolicy.onStateChange(subcomposeSlotReusePolicy.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        if (i != rectRulersCompanion.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            rectRulersCompanion.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = i;
            SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = rectRulersCompanion.PlaybackStateCompatCustomAction;
            ColorStateList colorStateList = rectRulersCompanion.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            subcomposeSlotReusePolicy.getLifecycle.ParcelableVolumeInfo = i;
            subcomposeSlotReusePolicy.invalidateSelf();
            accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy.getLifecycle;
            if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateList) {
                accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateList;
                subcomposeSlotReusePolicy.onStateChange(subcomposeSlotReusePolicy.getState());
            }
        }
        invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public RectRulersImpl(Context context, AttributeSet attributeSet, int i) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, i, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.MediaSessionCompatToken = false;
        this.PlaybackStateCompatCustomAction = false;
        this.PlaybackStateCompat = true;
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(getContext(), attributeSet, setMeasuredSizeozmzZPI.MaterialCardView, i, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_CardView, new int[0]);
        RectRulersCompanion rectRulersCompanion = new RectRulersCompanion(this, attributeSet, i);
        this.MediaMetadataCompat = rectRulersCompanion;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = rectRulersCompanion.read;
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(cardBackgroundColor);
        rectRulersCompanion.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        rectRulersCompanion.updateContentPadding();
        RectRulersImpl rectRulersImpl = rectRulersCompanion.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        ColorStateList colorStateListIconCompatParcelizer = ScaleFactorKt.IconCompatParcelizer(rectRulersImpl.getContext(), typedArray, 11);
        rectRulersCompanion.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = colorStateListIconCompatParcelizer;
        if (colorStateListIconCompatParcelizer == null) {
            rectRulersCompanion.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = ColorStateList.valueOf(-1);
        }
        rectRulersCompanion.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArray.getDimensionPixelSize(12, 0);
        boolean z = typedArray.getBoolean(0, false);
        rectRulersCompanion.IconCompatParcelizer = z;
        rectRulersImpl.setLongClickable(z);
        rectRulersCompanion.MediaMetadataCompat = ScaleFactorKt.IconCompatParcelizer(rectRulersImpl.getContext(), typedArray, 6);
        rectRulersCompanion.read(ScaleFactorKt.write(rectRulersImpl.getContext(), typedArray, 2));
        rectRulersCompanion.RatingCompat = typedArray.getDimensionPixelSize(5, 0);
        rectRulersCompanion.MediaSessionCompatQueueItem = typedArray.getDimensionPixelSize(4, 0);
        rectRulersCompanion.MediaBrowserCompatMediaItem = typedArray.getInteger(3, 8388661);
        ColorStateList colorStateListIconCompatParcelizer2 = ScaleFactorKt.IconCompatParcelizer(rectRulersImpl.getContext(), typedArray, 7);
        rectRulersCompanion.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = colorStateListIconCompatParcelizer2;
        if (colorStateListIconCompatParcelizer2 == null) {
            rectRulersCompanion.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = ColorStateList.valueOf(mergeRulerValues.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.attr.colorControlHighlight, rectRulersImpl));
        }
        ColorStateList colorStateListIconCompatParcelizer3 = ScaleFactorKt.IconCompatParcelizer(rectRulersImpl.getContext(), typedArray, 1);
        colorStateListIconCompatParcelizer3 = colorStateListIconCompatParcelizer3 == null ? ColorStateList.valueOf(0) : colorStateListIconCompatParcelizer3;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = rectRulersCompanion.PlaybackStateCompatCustomAction;
        subcomposeSlotReusePolicy2.MediaBrowserCompatMediaItem(colorStateListIconCompatParcelizer3);
        RippleDrawable rippleDrawable = rectRulersCompanion.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(rectRulersCompanion.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        }
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem(rectRulersImpl.getCardElevation());
        float f = rectRulersCompanion.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        ColorStateList colorStateList = rectRulersCompanion.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        subcomposeSlotReusePolicy2.getLifecycle.ParcelableVolumeInfo = f;
        subcomposeSlotReusePolicy2.invalidateSelf();
        accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy2.getLifecycle;
        if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateList) {
            accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateList;
            subcomposeSlotReusePolicy2.onStateChange(subcomposeSlotReusePolicy2.getState());
        }
        rectRulersImpl.setBackgroundInternal(rectRulersCompanion.serializer(subcomposeSlotReusePolicy));
        Drawable drawableRemoteActionCompatParcelizer = rectRulersImpl.isClickable() ? rectRulersCompanion.RemoteActionCompatParcelizer() : subcomposeSlotReusePolicy2;
        rectRulersCompanion.MediaSessionCompatToken = drawableRemoteActionCompatParcelizer;
        rectRulersImpl.setForeground(rectRulersCompanion.serializer(drawableRemoteActionCompatParcelizer));
        typedArray.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SubcomposeLayoutKtSubcomposeLayout2.serializer(this, this.MediaMetadataCompat.read);
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.MediaMetadataCompat.IconCompatParcelizer(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        rectRulersCompanion.read.MediaBrowserCompatMediaItem(rectRulersCompanion.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getCardElevation());
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.MediaMetadataCompat.MediaSessionCompatQueueItem = getResources().getDimensionPixelSize(i);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        if (rectRulersCompanion != null) {
            Drawable drawable = rectRulersCompanion.MediaSessionCompatToken;
            RectRulersImpl rectRulersImpl = rectRulersCompanion.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            Drawable drawableRemoteActionCompatParcelizer = rectRulersImpl.isClickable() ? rectRulersCompanion.RemoteActionCompatParcelizer() : rectRulersCompanion.PlaybackStateCompatCustomAction;
            rectRulersCompanion.MediaSessionCompatToken = drawableRemoteActionCompatParcelizer;
            if (drawable != drawableRemoteActionCompatParcelizer) {
                if (rectRulersImpl.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) rectRulersImpl.getForeground()).setDrawable(drawableRemoteActionCompatParcelizer);
                } else {
                    rectRulersImpl.setForeground(rectRulersCompanion.serializer(drawableRemoteActionCompatParcelizer));
                }
            }
        }
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.MediaMetadataCompat.serializer();
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        rectRulersCompanion.serializer();
        rectRulersCompanion.updateContentPadding();
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public void setRadius(float f) {
        super.setRadius(f);
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        I$b i$bWrite = rectRulersCompanion.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.write();
        i$bWrite.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(f);
        i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(f);
        i$bWrite.RatingCompat = new SubcomposeLayoutKt(f);
        i$bWrite.MediaMetadataCompat = new SubcomposeLayoutKt(f);
        rectRulersCompanion.RemoteActionCompatParcelizer(i$bWrite.IconCompatParcelizer());
        rectRulersCompanion.MediaSessionCompatToken.invalidateSelf();
        if (rectRulersCompanion.write() || (rectRulersCompanion.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getPreventCornerOverlap() && !rectRulersCompanion.read.MediaSessionCompatToken())) {
            rectRulersCompanion.updateContentPadding();
        }
        if (rectRulersCompanion.write()) {
            rectRulersCompanion.serializer();
        }
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        rectRulersCompanion.serializer();
        rectRulersCompanion.updateContentPadding();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.PlaybackStateCompat) {
            RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
            if (!rectRulersCompanion.ComponentActivity) {
                rectRulersCompanion.ComponentActivity = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public void setCardBackgroundColor(int i) {
        this.MediaMetadataCompat.read.MediaBrowserCompatMediaItem(ColorStateList.valueOf(i));
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.MediaSessionCompatToken != z) {
            toggle();
        }
    }

    public void setCheckedIconResource(int i) {
        this.MediaMetadataCompat.read(coil3.util.IntPair.write(getContext(), i));
    }

    public void setDragged(boolean z) {
        if (this.PlaybackStateCompatCustomAction != z) {
            this.PlaybackStateCompatCustomAction = z;
            refreshDrawableState();
            read();
            invalidate();
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateListWrite = FocusListener.write(getContext(), i);
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        rectRulersCompanion.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = colorStateListWrite;
        RippleDrawable rippleDrawable = rectRulersCompanion.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateListWrite);
        }
    }

    @Override // o.createPausedPrecomposition
    public void setShapeAppearanceModel(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        setClipToOutline(subcomposeLayoutPausableCompositionException.read(getBoundsAsRectF()));
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(subcomposeLayoutPausableCompositionException);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        if (rectRulersCompanion != null && rectRulersCompanion.IconCompatParcelizer && isEnabled()) {
            this.MediaSessionCompatToken = !this.MediaSessionCompatToken;
            refreshDrawableState();
            read();
            rectRulersCompanion.IconCompatParcelizer(this.MediaSessionCompatToken, true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.MediaSessionCompatToken);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        RectRulersCompanion rectRulersCompanion = this.MediaMetadataCompat;
        accessibilityNodeInfo.setCheckable(rectRulersCompanion != null && rectRulersCompanion.IconCompatParcelizer);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.MediaSessionCompatToken);
    }

    @Override // o.drawWithRotationAndOffsetubNVwUQ
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.MediaMetadataCompat.read.MediaBrowserCompatMediaItem(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public RectRulersImpl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.logistics.rider.glovo.R.attr.materialCardViewStyle);
    }
}
