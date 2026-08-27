package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.sentiance.core.model.events.I$b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class RulerScope extends SubcomposeSlotReusePolicy implements Drawable.Callback {
    public ColorStateList ComponentActivity;
    public boolean IconCompatParcelizer;
    public ColorStateList MediaBrowserCompatMediaItem;
    public ColorStateList MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public float MediaSessionCompatQueueItem;
    public float MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public Drawable ParcelableVolumeInfo;
    public float PlaybackStateCompat;
    public ColorStateList PlaybackStateCompatCustomAction;
    public float RatingCompat;
    public float ResultReceiver;
    public ColorStateList _init_lambda1;
    public int _init_lambda2;
    public int _init_lambda3;
    public boolean _init_lambda4;
    public final Context accessensureViewModelStore;
    public final PointF addContentView;
    public ColorStateList addMenuProvider;
    public int addObserverForBackInvoker;
    public int addObserverForBackInvokerlambda0;
    public final android.graphics.Path addOnConfigurationChangedListener;
    public accesshandleMotionFrameOfReferencePlacement addOnContextAvailableListener;
    public boolean addOnMultiWindowModeChangedListener;
    public CharSequence addOnNewIntentListener;
    public ColorStateList addOnPictureInPictureModeChangedListener;
    public float addOnPictureInPictureUiStateChangedListener;
    public final getApplyPausedNjRlDlw addOnTrimMemoryListener;
    public PorterDuffColorFilter addOnUserLeaveHintListener;
    public int createFullyDrawnExecutor;
    public int defaultViewModelProviderFactory_delegatelambda0;
    public int ensureViewModelStore;
    public float enterPictureInPictureMode;
    public accesshandleMotionFrameOfReferencePlacement fullyDrawnReporter_delegatelambda0;
    public boolean fullyDrawnReporter_delegatelambda00;
    public PorterDuff.Mode getDefaultViewModelProviderFactory;
    public TextUtils.TruncateAt getLastCustomNonConfigurationInstance;
    public float getOnBackPressedInput;
    public java.lang.ref.WeakReference getSavedStateRegistryControllerannotations;
    public final android.graphics.Paint.FontMetrics menuHostHelperlambda0;
    public boolean onBackPressedDispatcher_delegatelambda0;
    public final RectF onBackPressedDispatcher_delegatelambda00;
    public int onBackPressedDispatcher_delegatelambda010;
    public float onBackPressedInput_delegatelambda0;
    public final android.graphics.Paint r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public float r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public ColorStateList r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public float r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public Drawable r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public float r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public RippleDrawable r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public SpannableStringBuilder r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public ColorStateList r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public int[] r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public float r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public android.graphics.ColorFilter r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public Drawable serializer;
    public int write;
    public static final int[] read = {android.R.attr.state_enabled};
    public static final ShapeDrawable RemoteActionCompatParcelizer = new ShapeDrawable(new OvalShape());

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.write;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        return this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void read(ColorStateList colorStateList) {
        this.fullyDrawnReporter_delegatelambda00 = true;
        if (this.PlaybackStateCompatCustomAction != colorStateList) {
            this.PlaybackStateCompatCustomAction = colorStateList;
            if (MediaDescriptionCompat()) {
                this.ParcelableVolumeInfo.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void RemoteActionCompatParcelizer() {
        RootMeasurePolicy rootMeasurePolicy = (RootMeasurePolicy) this.getSavedStateRegistryControllerannotations.get();
        if (rootMeasurePolicy != null) {
            rootMeasurePolicy.write(rootMeasurePolicy.ResultReceiver);
            rootMeasurePolicy.requestLayout();
            rootMeasurePolicy.invalidateOutline();
        }
    }

    public final void RemoteActionCompatParcelizer(isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations) {
        getApplyPausedNjRlDlw getapplypausednjrldlw = this.addOnTrimMemoryListener;
        RootMeasurePolicymeasure3 rootMeasurePolicymeasure3 = getapplypausednjrldlw.read;
        TextPaint textPaint = getapplypausednjrldlw.write;
        if (getapplypausednjrldlw.serializer != isspecifiedfk8ayysannotations) {
            getapplypausednjrldlw.serializer = isspecifiedfk8ayysannotations;
            if (isspecifiedfk8ayysannotations != null) {
                Context context = this.accessensureViewModelStore;
                isspecifiedfk8ayysannotations.IconCompatParcelizer(context, textPaint, rootMeasurePolicymeasure3);
                RulerScope rulerScope = (RulerScope) getapplypausednjrldlw.IconCompatParcelizer.get();
                if (rulerScope != null) {
                    textPaint.drawableState = rulerScope.getState();
                }
                isspecifiedfk8ayysannotations.RemoteActionCompatParcelizer(context, textPaint, rootMeasurePolicymeasure3);
                getapplypausednjrldlw.RemoteActionCompatParcelizer = true;
            }
            RulerScope rulerScope2 = (RulerScope) getapplypausednjrldlw.IconCompatParcelizer.get();
            if (rulerScope2 != null) {
                rulerScope2.RemoteActionCompatParcelizer();
                rulerScope2.invalidateSelf();
                rulerScope2.onStateChange(rulerScope2.getState());
            }
        }
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int iSave;
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.write) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.onBackPressedDispatcher_delegatelambda0;
        android.graphics.Paint paint = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        RectF rectF3 = this.onBackPressedDispatcher_delegatelambda00;
        if (!z) {
            paint.setColor(this.addObserverForBackInvokerlambda0);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, read(), read(), paint);
        }
        if (!this.onBackPressedDispatcher_delegatelambda0) {
            paint.setColor(this._init_lambda3);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.ColorFilter colorFilter = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (colorFilter == null) {
                colorFilter = this.addOnUserLeaveHintListener;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, read(), read(), paint);
        }
        if (this.onBackPressedDispatcher_delegatelambda0) {
            super.draw(canvas);
        }
        if (this.ResultReceiver > 0.0f && !this.onBackPressedDispatcher_delegatelambda0) {
            paint.setColor(this._init_lambda2);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            if (!this.onBackPressedDispatcher_delegatelambda0) {
                android.graphics.ColorFilter colorFilter2 = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.addOnUserLeaveHintListener;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.ResultReceiver / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.MediaSessionCompatQueueItem - (this.ResultReceiver / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.createFullyDrawnExecutor);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.onBackPressedDispatcher_delegatelambda0) {
            RectF rectF4 = new RectF(bounds);
            accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
            SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = accessgetreusedslotidp.PlaybackStateCompat;
            float f4 = accessgetreusedslotidp.IconCompatParcelizer;
            PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = this.onCreate;
            BrazeImageUtils brazeImageUtils = this.onConfigurationChanged;
            android.graphics.Path path = this.addOnConfigurationChangedListener;
            brazeImageUtils.IconCompatParcelizer(subcomposeLayoutPausableCompositionException, f4, rectF4, pinnableContainerKtLocalPinnableContainer1, path);
            read(canvas, paint, path, this.getLifecycle.PlaybackStateCompat, RatingCompat());
        } else {
            canvas.drawRoundRect(rectF3, read(), read(), paint);
        }
        if (MediaDescriptionCompat()) {
            serializer(bounds, rectF3);
            float f5 = rectF3.left;
            float f6 = rectF3.top;
            canvas.translate(f5, f6);
            this.ParcelableVolumeInfo.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.ParcelableVolumeInfo.draw(canvas);
            canvas.translate(-f5, -f6);
        }
        if (write()) {
            serializer(bounds, rectF3);
            float f7 = rectF3.left;
            float f8 = rectF3.top;
            canvas.translate(f7, f8);
            this.serializer.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.serializer.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (!this.addOnMultiWindowModeChangedListener || this.addOnNewIntentListener == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.addContentView;
            pointF.set(0.0f, 0.0f);
            android.graphics.Paint.Align align = android.graphics.Paint.Align.LEFT;
            CharSequence charSequence = this.addOnNewIntentListener;
            getApplyPausedNjRlDlw getapplypausednjrldlw = this.addOnTrimMemoryListener;
            if (charSequence != null) {
                float fIconCompatParcelizer = IconCompatParcelizer() + this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + this.enterPictureInPictureMode;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fIconCompatParcelizer;
                } else {
                    pointF.x = bounds.right - fIconCompatParcelizer;
                    align = android.graphics.Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = getapplypausednjrldlw.write;
                android.graphics.Paint.FontMetrics fontMetrics = this.menuHostHelperlambda0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.addOnNewIntentListener != null) {
                float fIconCompatParcelizer2 = IconCompatParcelizer() + this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + this.enterPictureInPictureMode;
                float fSerializer = serializer() + this.RatingCompat + this.addOnPictureInPictureUiStateChangedListener;
                int layoutDirection = getLayoutDirection();
                int i5 = bounds.left;
                if (layoutDirection == 0) {
                    rectF3.left = i5 + fIconCompatParcelizer2;
                    rectF3.right = bounds.right - fSerializer;
                } else {
                    rectF3.left = i5 + fSerializer;
                    rectF3.right = bounds.right - fIconCompatParcelizer2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations = getapplypausednjrldlw.serializer;
            TextPaint textPaint2 = getapplypausednjrldlw.write;
            if (isspecifiedfk8ayysannotations != null) {
                textPaint2.drawableState = getState();
                getapplypausednjrldlw.serializer.RemoteActionCompatParcelizer(this.accessensureViewModelStore, textPaint2, getapplypausednjrldlw.read);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(getapplypausednjrldlw.RemoteActionCompatParcelizer(this.addOnNewIntentListener.toString())) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.addOnNewIntentListener;
            if (z2 && this.getLastCustomNonConfigurationInstance != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.getLastCustomNonConfigurationInstance);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f9 = pointF.x;
            float f10 = pointF.y;
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence2, 0, length, f9, f10, textPaint2);
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
        if (MediaMetadataCompat()) {
            rectF.setEmpty();
            if (MediaMetadataCompat()) {
                float f11 = this.RatingCompat + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                if (getLayoutDirection() == 0) {
                    float f12 = bounds.right - f11;
                    rectF2 = rectF;
                    rectF2.right = f12;
                    rectF2.left = f12 - this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                } else {
                    rectF2 = rectF;
                    float f13 = bounds.left + f11;
                    rectF2.left = f13;
                    rectF2.right = f13 + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f14 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                float f15 = fExactCenterY - (f14 / 2.0f);
                rectF2.top = f15;
                rectF2.bottom = f15 + f14;
            } else {
                rectF2 = rectF;
            }
            float f16 = rectF2.left;
            float f17 = rectF2.top;
            canvas.translate(f16, f17);
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.setBounds(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.getBounds());
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.jumpToCurrentState();
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (this.write < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        float fIconCompatParcelizer = IconCompatParcelizer();
        float f2 = this.enterPictureInPictureMode;
        float fRemoteActionCompatParcelizer = this.addOnTrimMemoryListener.RemoteActionCompatParcelizer(this.addOnNewIntentListener.toString());
        float f3 = this.addOnPictureInPictureUiStateChangedListener;
        return Math.min(Math.round(serializer() + fRemoteActionCompatParcelizer + fIconCompatParcelizer + f + f2 + f3 + this.RatingCompat), this.onBackPressedDispatcher_delegatelambda010);
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (RemoteActionCompatParcelizer(this.ComponentActivity) || RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem) || RemoteActionCompatParcelizer(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus)) {
            return true;
        }
        isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations = this.addOnTrimMemoryListener.serializer;
        if (isspecifiedfk8ayysannotations == null || (colorStateList = isspecifiedfk8ayysannotations.PlaybackStateCompat) == null || !colorStateList.isStateful()) {
            return (this.MediaMetadataCompat && this.serializer != null && this.IconCompatParcelizer) || IconCompatParcelizer(this.ParcelableVolumeInfo) || IconCompatParcelizer(this.serializer) || RemoteActionCompatParcelizer(this.addOnPictureInPictureModeChangedListener);
        }
        return true;
    }

    public static void RemoteActionCompatParcelizer(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void serializer(android.graphics.Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (MediaDescriptionCompat() || write()) {
            float f = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + this.onBackPressedInput_delegatelambda0;
            Drawable drawable = this._init_lambda4 ? this.serializer : this.ParcelableVolumeInfo;
            float intrinsicWidth = this.PlaybackStateCompat;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this._init_lambda4 ? this.serializer : this.ParcelableVolumeInfo;
            float fCeil = this.PlaybackStateCompat;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.accessensureViewModelStore.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final void serializer(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) {
            if (drawable.isStateful()) {
                drawable.setState(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            }
            drawable.setTintList(this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
            return;
        }
        Drawable drawable2 = this.ParcelableVolumeInfo;
        if (drawable == drawable2 && this.fullyDrawnReporter_delegatelambda00) {
            drawable2.setTintList(this.PlaybackStateCompatCustomAction);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != colorStateList) {
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = colorStateList;
            if (this.onBackPressedDispatcher_delegatelambda0) {
                accessgetReusedSlotIdp accessgetreusedslotidp = this.getLifecycle;
                if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateList) {
                    accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        if (this.IconCompatParcelizer != z) {
            this.IconCompatParcelizer = z;
            float fIconCompatParcelizer = IconCompatParcelizer();
            if (!z && this._init_lambda4) {
                this._init_lambda4 = false;
            }
            float fIconCompatParcelizer2 = IconCompatParcelizer();
            invalidateSelf();
            if (fIconCompatParcelizer != fIconCompatParcelizer2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaSessionCompatToken && this.ParcelableVolumeInfo != null;
    }

    public final void MediaMetadataCompat(ColorStateList colorStateList) {
        if (this.addMenuProvider != colorStateList) {
            this.addMenuProvider = colorStateList;
            this._init_lambda1 = null;
            onStateChange(getState());
        }
    }

    public final boolean MediaMetadataCompat() {
        return this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 && this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (this.MediaSessionCompatToken != z) {
            boolean zMediaDescriptionCompat = MediaDescriptionCompat();
            this.MediaSessionCompatToken = z;
            boolean zMediaDescriptionCompat2 = MediaDescriptionCompat();
            if (zMediaDescriptionCompat != zMediaDescriptionCompat2) {
                Drawable drawable = this.ParcelableVolumeInfo;
                if (zMediaDescriptionCompat2) {
                    serializer(drawable);
                } else {
                    RemoteActionCompatParcelizer(drawable);
                }
                invalidateSelf();
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        if (this.onBackPressedDispatcher_delegatelambda0) {
            super.getOutline(outline);
            return;
        }
        android.graphics.Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.MediaSessionCompatResultReceiverWrapper, this.MediaSessionCompatQueueItem);
        } else {
            outline.setRoundRect(bounds, this.MediaSessionCompatQueueItem);
        }
        outline.setAlpha(this.write / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (MediaDescriptionCompat()) {
            zOnLayoutDirectionChanged |= this.ParcelableVolumeInfo.setLayoutDirection(i);
        }
        if (write()) {
            zOnLayoutDirectionChanged |= this.serializer.setLayoutDirection(i);
        }
        if (MediaMetadataCompat()) {
            zOnLayoutDirectionChanged |= this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (MediaDescriptionCompat()) {
            zOnLevelChange |= this.ParcelableVolumeInfo.setLevel(i);
        }
        if (write()) {
            zOnLevelChange |= this.serializer.setLevel(i);
        }
        if (MediaMetadataCompat()) {
            zOnLevelChange |= this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    public final float read() {
        return this.onBackPressedDispatcher_delegatelambda0 ? MediaBrowserCompatMediaItem() : this.MediaSessionCompatQueueItem;
    }

    public final void read(Drawable drawable) {
        if (this.serializer != drawable) {
            float fIconCompatParcelizer = IconCompatParcelizer();
            this.serializer = drawable;
            float fIconCompatParcelizer2 = IconCompatParcelizer();
            RemoteActionCompatParcelizer(this.serializer);
            serializer(this.serializer);
            invalidateSelf();
            if (fIconCompatParcelizer != fIconCompatParcelizer2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void read(boolean z) {
        if (this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 != z) {
            boolean zMediaMetadataCompat = MediaMetadataCompat();
            this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = z;
            boolean zMediaMetadataCompat2 = MediaMetadataCompat();
            if (zMediaMetadataCompat != zMediaMetadataCompat2) {
                Drawable drawable = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                if (zMediaMetadataCompat2) {
                    serializer(drawable);
                } else {
                    RemoteActionCompatParcelizer(drawable);
                }
                invalidateSelf();
                RemoteActionCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    public final boolean read(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.ComponentActivity;
        int i = read(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.addObserverForBackInvokerlambda0) : 0);
        boolean state = true;
        if (this.addObserverForBackInvokerlambda0 != i) {
            this.addObserverForBackInvokerlambda0 = i;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.MediaBrowserCompatMediaItem;
        int i2 = read(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this._init_lambda3) : 0);
        if (this._init_lambda3 != i2) {
            this._init_lambda3 = i2;
            zOnStateChange = true;
        }
        int iRemoteActionCompatParcelizer = setPrevious.RemoteActionCompatParcelizer(i2, i);
        if ((this.ensureViewModelStore != iRemoteActionCompatParcelizer) | (this.getLifecycle.RemoteActionCompatParcelizer == null)) {
            this.ensureViewModelStore = iRemoteActionCompatParcelizer;
            MediaBrowserCompatMediaItem(ColorStateList.valueOf(iRemoteActionCompatParcelizer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this._init_lambda2) : 0;
        if (this._init_lambda2 != colorForState2) {
            this._init_lambda2 = colorForState2;
            zOnStateChange = true;
        }
        if (this._init_lambda1 != null) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i3 : iArr) {
                if (i3 == 16842910) {
                    z3 = true;
                } else if (i3 == 16842908 || i3 == 16842919 || i3 == 16843623) {
                    z4 = true;
                }
            }
            if (z3 && z4) {
                colorForState = this._init_lambda1.getColorForState(iArr, this.createFullyDrawnExecutor);
            } else {
                colorForState = 0;
            }
        } else {
            colorForState = 0;
        }
        if (this.createFullyDrawnExecutor != colorForState) {
            this.createFullyDrawnExecutor = colorForState;
        }
        isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations = this.addOnTrimMemoryListener.serializer;
        int colorForState3 = (isspecifiedfk8ayysannotations == null || (colorStateList = isspecifiedfk8ayysannotations.PlaybackStateCompat) == null) ? 0 : colorStateList.getColorForState(iArr, this.addObserverForBackInvoker);
        if (this.addObserverForBackInvoker != colorForState3) {
            this.addObserverForBackInvoker = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
            break;
        }
        int length = state2.length;
        int i4 = 0;
        while (true) {
            if (i4 < length) {
                if (state2[i4] == 16842912) {
                    if (this.IconCompatParcelizer) {
                        z = true;
                        break;
                    }
                } else {
                    i4++;
                }
            }
            z = false;
            break;
        }
        if (this._init_lambda4 == z || this.serializer == null) {
            z2 = false;
        } else {
            float fIconCompatParcelizer = IconCompatParcelizer();
            this._init_lambda4 = z;
            if (fIconCompatParcelizer != IconCompatParcelizer()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.addOnPictureInPictureModeChangedListener;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.defaultViewModelProviderFactory_delegatelambda0) : 0;
        if (this.defaultViewModelProviderFactory_delegatelambda0 != colorForState4) {
            this.defaultViewModelProviderFactory_delegatelambda0 = colorForState4;
            ColorStateList colorStateList6 = this.addOnPictureInPictureModeChangedListener;
            PorterDuff.Mode mode = this.getDefaultViewModelProviderFactory;
            this.addOnUserLeaveHintListener = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (IconCompatParcelizer(this.ParcelableVolumeInfo)) {
            state |= this.ParcelableVolumeInfo.setState(iArr);
        }
        if (IconCompatParcelizer(this.serializer)) {
            state |= this.serializer.setState(iArr);
        }
        if (IconCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setState(iArr3);
        }
        if (IconCompatParcelizer(this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4)) {
            state |= this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            RemoteActionCompatParcelizer();
        }
        return state;
    }

    public final void serializer(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.MediaDescriptionCompat != colorStateList) {
            this.MediaDescriptionCompat = colorStateList;
            if (this.MediaMetadataCompat && (drawable = this.serializer) != null && this.IconCompatParcelizer) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.write != i) {
            this.write = i;
            invalidateSelf();
        }
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 != colorFilter) {
            this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.addOnPictureInPictureModeChangedListener != colorStateList) {
            this.addOnPictureInPictureModeChangedListener = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.getDefaultViewModelProviderFactory != mode) {
            this.getDefaultViewModelProviderFactory = mode;
            ColorStateList colorStateList = this.addOnPictureInPictureModeChangedListener;
            this.addOnUserLeaveHintListener = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (MediaDescriptionCompat()) {
            visible |= this.ParcelableVolumeInfo.setVisible(z, z2);
        }
        if (write()) {
            visible |= this.serializer.setVisible(z, z2);
        }
        if (MediaMetadataCompat()) {
            visible |= this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void write(ColorStateList colorStateList) {
        if (this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs != colorStateList) {
            this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = colorStateList;
            if (MediaMetadataCompat()) {
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void write(boolean z) {
        if (this.MediaMetadataCompat != z) {
            boolean zWrite = write();
            this.MediaMetadataCompat = z;
            boolean zWrite2 = write();
            if (zWrite != zWrite2) {
                Drawable drawable = this.serializer;
                if (zWrite2) {
                    serializer(drawable);
                } else {
                    RemoteActionCompatParcelizer(drawable);
                }
                invalidateSelf();
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final boolean write() {
        return this.MediaMetadataCompat && this.serializer != null && this._init_lambda4;
    }

    public RulerScope(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action);
        this.MediaSessionCompatQueueItem = -1.0f;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new android.graphics.Paint(1);
        this.menuHostHelperlambda0 = new android.graphics.Paint.FontMetrics();
        this.onBackPressedDispatcher_delegatelambda00 = new RectF();
        this.addContentView = new PointF();
        this.addOnConfigurationChangedListener = new android.graphics.Path();
        this.write = 255;
        this.getDefaultViewModelProviderFactory = PorterDuff.Mode.SRC_IN;
        this.getSavedStateRegistryControllerannotations = new java.lang.ref.WeakReference(null);
        write(context);
        this.accessensureViewModelStore = context;
        getApplyPausedNjRlDlw getapplypausednjrldlw = new getApplyPausedNjRlDlw(this);
        this.addOnTrimMemoryListener = getapplypausednjrldlw;
        this.addOnNewIntentListener = "";
        getapplypausednjrldlw.write.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = read;
        setState(iArr);
        if (!Arrays.equals(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, iArr)) {
            this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = iArr;
            if (MediaMetadataCompat()) {
                read(getState(), iArr);
            }
        }
        this.addOnMultiWindowModeChangedListener = true;
        RemoteActionCompatParcelizer.setTint(-1);
    }

    public final void IconCompatParcelizer(float f) {
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != f) {
            this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = f;
            invalidateSelf();
            if (MediaMetadataCompat()) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void MediaDescriptionCompat(float f) {
        if (this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ != f) {
            this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = f;
            invalidateSelf();
            if (MediaMetadataCompat()) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void MediaMetadataCompat(float f) {
        if (this.getOnBackPressedInput != f) {
            float fIconCompatParcelizer = IconCompatParcelizer();
            this.getOnBackPressedInput = f;
            float fIconCompatParcelizer2 = IconCompatParcelizer();
            invalidateSelf();
            if (fIconCompatParcelizer != fIconCompatParcelizer2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void RatingCompat(float f) {
        if (this.onBackPressedInput_delegatelambda0 != f) {
            float fIconCompatParcelizer = IconCompatParcelizer();
            this.onBackPressedInput_delegatelambda0 = f;
            float fIconCompatParcelizer2 = IconCompatParcelizer();
            invalidateSelf();
            if (fIconCompatParcelizer != fIconCompatParcelizer2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(float f) {
        if (this.MediaSessionCompatQueueItem != f) {
            this.MediaSessionCompatQueueItem = f;
            I$b i$bWrite = this.getLifecycle.PlaybackStateCompat.write();
            i$bWrite.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(f);
            i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(f);
            i$bWrite.RatingCompat = new SubcomposeLayoutKt(f);
            i$bWrite.MediaMetadataCompat = new SubcomposeLayoutKt(f);
            setShapeAppearanceModel(i$bWrite.IconCompatParcelizer());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void read(float f) {
        if (this.PlaybackStateCompat != f) {
            float fIconCompatParcelizer = IconCompatParcelizer();
            this.PlaybackStateCompat = f;
            float fIconCompatParcelizer2 = IconCompatParcelizer();
            invalidateSelf();
            if (fIconCompatParcelizer != fIconCompatParcelizer2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final float serializer() {
        if (!MediaMetadataCompat()) {
            return 0.0f;
        }
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    }

    public final void serializer(float f) {
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != f) {
            this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = f;
            invalidateSelf();
            if (MediaMetadataCompat()) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void write(float f) {
        if (this.ResultReceiver != f) {
            this.ResultReceiver = f;
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.setStrokeWidth(f);
            if (this.onBackPressedDispatcher_delegatelambda0) {
                this.getLifecycle.ParcelableVolumeInfo = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final float IconCompatParcelizer() {
        if (!MediaDescriptionCompat() && !write()) {
            return 0.0f;
        }
        float f = this.onBackPressedInput_delegatelambda0;
        Drawable drawable = this._init_lambda4 ? this.serializer : this.ParcelableVolumeInfo;
        float intrinsicWidth = this.PlaybackStateCompat;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.getOnBackPressedInput;
    }

    public final void RatingCompat(Drawable drawable) {
        Drawable drawable2 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fSerializer = serializer();
            this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.addMenuProvider;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new RippleDrawable(colorStateListValueOf, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, RemoteActionCompatParcelizer);
            float fSerializer2 = serializer();
            RemoteActionCompatParcelizer(drawable2);
            if (MediaMetadataCompat()) {
                serializer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            }
            invalidateSelf();
            if (fSerializer != fSerializer2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public final void write(Drawable drawable) {
        Drawable drawable2 = this.ParcelableVolumeInfo;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fIconCompatParcelizer = IconCompatParcelizer();
            this.ParcelableVolumeInfo = drawable != null ? drawable.mutate() : null;
            float fIconCompatParcelizer2 = IconCompatParcelizer();
            RemoteActionCompatParcelizer(drawable2);
            if (MediaDescriptionCompat()) {
                serializer(this.ParcelableVolumeInfo);
            }
            invalidateSelf();
            if (fIconCompatParcelizer != fIconCompatParcelizer2) {
                RemoteActionCompatParcelizer();
            }
        }
    }

    public static boolean RemoteActionCompatParcelizer(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean IconCompatParcelizer(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Override // o.SubcomposeSlotReusePolicy, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.onBackPressedDispatcher_delegatelambda0) {
            super.onStateChange(iArr);
        }
        return read(iArr, this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
    }
}
