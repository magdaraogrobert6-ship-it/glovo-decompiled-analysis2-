package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class RootMeasurePolicy extends supportShouldUpRecreateTask implements createPausedPrecomposition, Checkable {
    public static final int[] IconCompatParcelizer;
    public static final android.graphics.Rect MediaDescriptionCompat;
    public static final int[] MediaSessionCompatQueueItem;
    private static int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = 0;
    private static int r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = 1;
    private static byte r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public InsetDrawable ComponentActivity;
    public boolean MediaBrowserCompatMediaItem;
    public CharSequence MediaMetadataCompat;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final RootMeasurePolicymeasure3 MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public boolean PlaybackStateCompatCustomAction;
    public RulerScope RatingCompat;
    public int ResultReceiver;
    public View.OnClickListener r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public CompoundButton.OnCheckedChangeListener r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final android.graphics.Rect r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final RootMeasurePolicymeasure1 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public final RectF r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public RippleDrawable r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    public Drawable getChipDrawable() {
        return this.RatingCompat;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.MediaMetadataCompat = charSequence;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setInternalOnCheckedChangeListener(accessgetSlotToReusedFromOnReusecp accessgetslottoreusedfromonreusecp) {
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = onCheckedChangeListener;
    }

    static {
        MediaBrowserCompatMediaItem();
        MediaDescriptionCompat = new android.graphics.Rect();
        MediaSessionCompatQueueItem = new int[]{android.R.attr.state_selected};
        IconCompatParcelizer = new int[]{android.R.attr.state_checkable};
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        rectF.setEmpty();
        if (RemoteActionCompatParcelizer() && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
            RulerScope rulerScope = this.RatingCompat;
            android.graphics.Rect bounds = rulerScope.getBounds();
            rectF.setEmpty();
            if (rulerScope.MediaMetadataCompat()) {
                float f = rulerScope.RatingCompat;
                float f2 = rulerScope.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                float f3 = f + f2 + rulerScope.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 + rulerScope.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ + rulerScope.addOnPictureInPictureUiStateChangedListener;
                if (rulerScope.getLayoutDirection() == 0) {
                    float f4 = bounds.right;
                    rectF.right = f4;
                    rectF.left = f4 - f3;
                } else {
                    float f5 = bounds.left;
                    rectF.left = f5;
                    rectF.right = f5 + f3;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    public final void IconCompatParcelizer() {
        ColorStateList colorStateListValueOf = this.RatingCompat.addMenuProvider;
        if (colorStateListValueOf == null) {
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = new RippleDrawable(colorStateListValueOf, getBackgroundDrawable(), null);
        this.RatingCompat.getClass();
        RippleDrawable rippleDrawable = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setBackground(rippleDrawable);
        write();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.MediaMetadataCompat)) {
            return this.MediaMetadataCompat;
        }
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || !rulerScope.IconCompatParcelizer) {
            return isClickable() ? "android.widget.Button" : androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName;
        }
        getParent();
        return "android.widget.Button";
    }

    public SubcomposeLayoutPausableCompositionException getShapeAppearanceModel() {
        return this.RatingCompat.getLifecycle.PlaybackStateCompat;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, MediaSessionCompatQueueItem);
        }
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null && rulerScope.IconCompatParcelizer) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, IconCompatParcelizer);
        }
        return iArrOnCreateDrawableState;
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.ParcelableVolumeInfo = z;
        write(this.ResultReceiver);
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onClickListener;
        read();
    }

    @Override // o.createPausedPrecomposition
    public void setShapeAppearanceModel(SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException) {
        this.RatingCompat.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Chip does not support multi-line text");
        }
    }

    public final void write(int i) {
        this.ResultReceiver = i;
        if (!this.ParcelableVolumeInfo) {
            InsetDrawable insetDrawable = this.ComponentActivity;
            if (insetDrawable == null) {
                IconCompatParcelizer();
                return;
            } else {
                if (insetDrawable != null) {
                    this.ComponentActivity = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    IconCompatParcelizer();
                    return;
                }
                return;
            }
        }
        int iMax = Math.max(0, i - ((int) this.RatingCompat.MediaSessionCompatResultReceiverWrapper));
        int iMax2 = Math.max(0, i - this.RatingCompat.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            InsetDrawable insetDrawable2 = this.ComponentActivity;
            if (insetDrawable2 == null) {
                IconCompatParcelizer();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.ComponentActivity = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    IconCompatParcelizer();
                    return;
                }
                return;
            }
        }
        int i2 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i3 = iMax > 0 ? iMax / 2 : 0;
        if (this.ComponentActivity != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.ComponentActivity.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                IconCompatParcelizer();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.ComponentActivity = new InsetDrawable((Drawable) this.RatingCompat, i2, i3, i2, i3);
        IconCompatParcelizer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    @Override // o.supportShouldUpRecreateTask, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || !RulerScope.IconCompatParcelizer(rulerScope.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg)) {
            return;
        }
        RulerScope rulerScope2 = this.RatingCompat;
        ?? IsEnabled = isEnabled();
        if (this.MediaBrowserCompatMediaItem) {
            i = IsEnabled;
            i = IsEnabled + 1;
        }
        i = IsEnabled;
        int i2 = i;
        if (this.PlaybackStateCompat) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.MediaSessionCompatResultReceiverWrapper) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.MediaBrowserCompatMediaItem) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.PlaybackStateCompat) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.MediaSessionCompatResultReceiverWrapper) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        if (Arrays.equals(rulerScope2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw, iArr)) {
            return;
        }
        rulerScope2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = iArr;
        if (rulerScope2.MediaMetadataCompat() && rulerScope2.read(rulerScope2.getState(), iArr)) {
            invalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SubcomposeLayoutKtSubcomposeLayout2.serializer(this, this.RatingCompat);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            RootMeasurePolicymeasure1 rootMeasurePolicymeasure1 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            int i2 = rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem;
            if (i2 != Integer.MIN_VALUE) {
                rootMeasurePolicymeasure1.serializer(i2);
            }
            if (z) {
                rootMeasurePolicymeasure1.write(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        RulerScope rulerScope = this.RatingCompat;
        accessibilityNodeInfo.setCheckable(rulerScope != null && rulerScope.IconCompatParcelizer);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != i) {
            this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i;
            write();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.MediaBrowserCompatMediaItem(f);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.onBackPressedDispatcher_delegatelambda010 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RemoteActionCompatParcelizer(new isSpecifiedFK8aYYsannotations(rulerScope.accessensureViewModelStore, i));
        }
        serializer();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            float fApplyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            getApplyPausedNjRlDlw getapplypausednjrldlw = rulerScope.addOnTrimMemoryListener;
            isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations = getapplypausednjrldlw.serializer;
            if (isspecifiedfk8ayysannotations != null) {
                isspecifiedfk8ayysannotations.MediaSessionCompatResultReceiverWrapper = fApplyDimension;
                getapplypausednjrldlw.write.setTextSize(fApplyDimension);
                rulerScope.RemoteActionCompatParcelizer();
                rulerScope.invalidateSelf();
            }
        }
        serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public android.graphics.Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        android.graphics.Rect rect = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private isSpecifiedFK8aYYsannotations getTextAppearance() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.addOnTrimMemoryListener.serializer;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.PlaybackStateCompat != z) {
            this.PlaybackStateCompat = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.MediaSessionCompatResultReceiverWrapper != z) {
            this.MediaSessionCompatResultReceiverWrapper = z;
            refreshDrawableState();
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null) {
            return false;
        }
        Drawable drawable = rulerScope.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            return super.dispatchHoverEvent(motionEvent);
        }
        RootMeasurePolicymeasure1 rootMeasurePolicymeasure1 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        android.view.accessibility.AccessibilityManager accessibilityManager = rootMeasurePolicymeasure1.RatingCompat;
        int i2 = 0;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                RootMeasurePolicy rootMeasurePolicy = rootMeasurePolicymeasure1.PlaybackStateCompat;
                if (rootMeasurePolicy.RemoteActionCompatParcelizer() && rootMeasurePolicy.getCloseIconTouchBounds().contains(x, y)) {
                    i2 = 1;
                }
                int i3 = rootMeasurePolicymeasure1.MediaDescriptionCompat;
                if (i3 != i2) {
                    rootMeasurePolicymeasure1.MediaDescriptionCompat = i2;
                    rootMeasurePolicymeasure1.read(i2, androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    rootMeasurePolicymeasure1.read(i3, androidx.compose.ui.graphics.Fields.RotationX);
                    return true;
                }
            } else if (action == 10 && (i = rootMeasurePolicymeasure1.MediaDescriptionCompat) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    rootMeasurePolicymeasure1.MediaDescriptionCompat = Integer.MIN_VALUE;
                    rootMeasurePolicymeasure1.read(Integer.MIN_VALUE, androidx.compose.ui.graphics.Fields.SpotShadowColor);
                    rootMeasurePolicymeasure1.read(i, androidx.compose.ui.graphics.Fields.RotationX);
                    return true;
                }
            } else if (super.dispatchHoverEvent(motionEvent)) {
                return false;
            }
        } else if (super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1 A[RETURN] */
    @Override // android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean zWrite;
        int i;
        RootMeasurePolicy rootMeasurePolicy;
        View.OnClickListener onClickListener;
        if (!this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        RootMeasurePolicymeasure1 rootMeasurePolicymeasure1 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        rootMeasurePolicymeasure1.getClass();
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                int i3 = 0;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount();
                                zWrite = false;
                                while (i3 < repeatCount + 1 && rootMeasurePolicymeasure1.write(i2, null)) {
                                    i3++;
                                    zWrite = true;
                                }
                                if (zWrite) {
                                    if (rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem != Integer.MIN_VALUE) {
                                        return true;
                                    }
                                }
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                i = rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem;
                                if (i != Integer.MIN_VALUE) {
                                    rootMeasurePolicy = rootMeasurePolicymeasure1.PlaybackStateCompat;
                                    if (i == 0) {
                                        rootMeasurePolicy.performClick();
                                    } else if (i == 1) {
                                        rootMeasurePolicy.playSoundEffect(0);
                                        onClickListener = rootMeasurePolicy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(rootMeasurePolicy);
                                        }
                                        if (rootMeasurePolicy.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                                            rootMeasurePolicy.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read(1, 1);
                                        }
                                    }
                                }
                                if (rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem != Integer.MIN_VALUE) {
                                    return true;
                                }
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    i = rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem;
                    if (i != Integer.MIN_VALUE) {
                        rootMeasurePolicy = rootMeasurePolicymeasure1.PlaybackStateCompat;
                        if (i == 0) {
                            rootMeasurePolicy.performClick();
                        } else if (i == 1) {
                            rootMeasurePolicy.playSoundEffect(0);
                            onClickListener = rootMeasurePolicy.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            if (onClickListener != null) {
                                onClickListener.onClick(rootMeasurePolicy);
                            }
                            if (rootMeasurePolicy.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                                rootMeasurePolicy.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read(1, 1);
                            }
                        }
                    }
                    if (rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    zWrite = rootMeasurePolicymeasure1.write(2, null);
                } else if (keyEvent.hasModifiers(1)) {
                    zWrite = rootMeasurePolicymeasure1.write(1, null);
                }
                if (zWrite) {
                    if (rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.ComponentActivity;
        return insetDrawable == null ? this.RatingCompat : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.serializer;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.MediaDescriptionCompat;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.MediaBrowserCompatMediaItem;
        }
        return null;
    }

    public float getChipEndPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.RatingCompat;
        }
        return 0.0f;
    }

    public float getChipIconSize() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.PlaybackStateCompat;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.PlaybackStateCompatCustomAction;
        }
        return null;
    }

    public float getChipMinHeight() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.MediaSessionCompatResultReceiverWrapper;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.ResultReceiver;
        }
        return 0.0f;
    }

    public CharSequence getCloseIconContentDescription() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.getLastCustomNonConfigurationInstance;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
            RootMeasurePolicymeasure1 rootMeasurePolicymeasure1 = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
            if (rootMeasurePolicymeasure1.MediaBrowserCompatMediaItem == 1 || rootMeasurePolicymeasure1.IconCompatParcelizer == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public accesshandleMotionFrameOfReferencePlacement getHideMotionSpec() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.fullyDrawnReporter_delegatelambda0;
        }
        return null;
    }

    public float getIconEndPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.getOnBackPressedInput;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.onBackPressedInput_delegatelambda0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.addMenuProvider;
        }
        return null;
    }

    public accesshandleMotionFrameOfReferencePlacement getShowMotionSpec() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.addOnContextAvailableListener;
        }
        return null;
    }

    public float getTextEndPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.addOnPictureInPictureUiStateChangedListener;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return rulerScope.enterPictureInPictureMode;
        }
        return 0.0f;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? android.view.PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                } else if (this.MediaSessionCompatResultReceiverWrapper) {
                    if (!zContains) {
                        setCloseIconPressed(false);
                    }
                }
                if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            } else {
                if (this.MediaSessionCompatResultReceiverWrapper) {
                    playSoundEffect(0);
                    View.OnClickListener onClickListener = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    if (this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read(1, 1);
                    }
                    z = true;
                }
                setCloseIconPressed(false);
                if (!z) {
                    if (super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
            z = false;
            setCloseIconPressed(false);
            if (!z) {
                if (super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        } else if (zContains) {
            setCloseIconPressed(true);
        } else if (super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void serializer() {
        TextPaint paint = getPaint();
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            paint.drawableState = rulerScope.getState();
        }
        isSpecifiedFK8aYYsannotations textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.RemoteActionCompatParcelizer(getContext(), paint, this.MediaSessionCompatToken);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        SentryLogcatAdapter.IconCompatParcelizer("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // o.supportShouldUpRecreateTask, android.view.View
    public void setBackgroundResource(int i) {
        SentryLogcatAdapter.IconCompatParcelizer("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        SentryLogcatAdapter.IconCompatParcelizer("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        SentryLogcatAdapter.IconCompatParcelizer("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.IconCompatParcelizer(z);
        }
    }

    public void setCheckableResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.IconCompatParcelizer(rulerScope.accessensureViewModelStore.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null) {
            this.PlaybackStateCompatCustomAction = z;
        } else if (rulerScope.IconCompatParcelizer) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.read(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.read(coil3.util.IntPair.write(rulerScope.accessensureViewModelStore, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.serializer(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.serializer(FocusListener.write(rulerScope.accessensureViewModelStore, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(rulerScope.accessensureViewModelStore.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.MediaBrowserCompatMediaItem == colorStateList) {
            return;
        }
        rulerScope.MediaBrowserCompatMediaItem = colorStateList;
        rulerScope.onStateChange(rulerScope.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateListWrite;
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.MediaBrowserCompatMediaItem == (colorStateListWrite = FocusListener.write(rulerScope.accessensureViewModelStore, i))) {
            return;
        }
        rulerScope.MediaBrowserCompatMediaItem = colorStateListWrite;
        rulerScope.onStateChange(rulerScope.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RemoteActionCompatParcelizer(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RemoteActionCompatParcelizer(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setChipEndPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.RatingCompat == f) {
            return;
        }
        rulerScope.RatingCompat = f;
        rulerScope.invalidateSelf();
        rulerScope.RemoteActionCompatParcelizer();
    }

    public void setChipEndPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            float dimension = rulerScope.accessensureViewModelStore.getResources().getDimension(i);
            if (rulerScope.RatingCompat != dimension) {
                rulerScope.RatingCompat = dimension;
                rulerScope.invalidateSelf();
                rulerScope.RemoteActionCompatParcelizer();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(drawable);
        }
    }

    public void setChipIconResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(coil3.util.IntPair.write(rulerScope.accessensureViewModelStore, i));
        }
    }

    public void setChipIconSize(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.read(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.read(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.read(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.read(FocusListener.write(rulerScope.accessensureViewModelStore, i));
        }
    }

    public void setChipIconVisible(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RemoteActionCompatParcelizer(rulerScope.accessensureViewModelStore.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.MediaSessionCompatResultReceiverWrapper == f) {
            return;
        }
        rulerScope.MediaSessionCompatResultReceiverWrapper = f;
        rulerScope.invalidateSelf();
        rulerScope.RemoteActionCompatParcelizer();
    }

    public void setChipMinHeightResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            float dimension = rulerScope.accessensureViewModelStore.getResources().getDimension(i);
            if (rulerScope.MediaSessionCompatResultReceiverWrapper != dimension) {
                rulerScope.MediaSessionCompatResultReceiverWrapper = dimension;
                rulerScope.invalidateSelf();
                rulerScope.RemoteActionCompatParcelizer();
            }
        }
    }

    public void setChipStartPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == f) {
            return;
        }
        rulerScope.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = f;
        rulerScope.invalidateSelf();
        rulerScope.RemoteActionCompatParcelizer();
    }

    public void setChipStartPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            float dimension = rulerScope.accessensureViewModelStore.getResources().getDimension(i);
            if (rulerScope.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != dimension) {
                rulerScope.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = dimension;
                rulerScope.invalidateSelf();
                rulerScope.RemoteActionCompatParcelizer();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.IconCompatParcelizer(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.IconCompatParcelizer(FocusListener.write(rulerScope.accessensureViewModelStore, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setCloseIcon(Drawable drawable) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RatingCompat(drawable);
        }
        read();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == charSequence) {
            return;
        }
        String str = FocusOwnerImpl.IconCompatParcelizer;
        FocusOwnerImpl focusOwnerImpl = TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1 ? FocusOwnerImpl.RemoteActionCompatParcelizer : FocusOwnerImpl.write;
        focusOwnerImpl.getClass();
        setDropDownVerticalOffset setdropdownverticaloffset = traverseAncestorsIncludingSelfQFhIj7k.serializer;
        rulerScope.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = focusOwnerImpl.write(charSequence);
        rulerScope.invalidateSelf();
    }

    public void setCloseIconEndPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.IconCompatParcelizer(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.IconCompatParcelizer(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RatingCompat(coil3.util.IntPair.write(rulerScope.accessensureViewModelStore, i));
        }
        read();
    }

    public void setCloseIconSize(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.serializer(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.serializer(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.MediaDescriptionCompat(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.MediaDescriptionCompat(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(FocusListener.write(rulerScope.accessensureViewModelStore, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // o.supportShouldUpRecreateTask, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // o.supportShouldUpRecreateTask, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setHideMotionSpec(accesshandleMotionFrameOfReferencePlacement accesshandlemotionframeofreferenceplacement) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.fullyDrawnReporter_delegatelambda0 = accesshandlemotionframeofreferenceplacement;
        }
    }

    public void setHideMotionSpecResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.fullyDrawnReporter_delegatelambda0 = accesshandleMotionFrameOfReferencePlacement.IconCompatParcelizer(rulerScope.accessensureViewModelStore, i);
        }
    }

    public void setIconEndPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.MediaMetadataCompat(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.MediaMetadataCompat(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RatingCompat(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RatingCompat(rulerScope.accessensureViewModelStore.getResources().getDimension(i));
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.MediaMetadataCompat(colorStateList);
        }
        this.RatingCompat.getClass();
        IconCompatParcelizer();
    }

    public void setRippleColorResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.MediaMetadataCompat(FocusListener.write(rulerScope.accessensureViewModelStore, i));
            this.RatingCompat.getClass();
            IconCompatParcelizer();
        }
    }

    public void setShowMotionSpec(accesshandleMotionFrameOfReferencePlacement accesshandlemotionframeofreferenceplacement) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.addOnContextAvailableListener = accesshandlemotionframeofreferenceplacement;
        }
    }

    public void setShowMotionSpecResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.addOnContextAvailableListener = accesshandleMotionFrameOfReferencePlacement.IconCompatParcelizer(rulerScope.accessensureViewModelStore, i);
        }
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.addOnPictureInPictureUiStateChangedListener == f) {
            return;
        }
        rulerScope.addOnPictureInPictureUiStateChangedListener = f;
        rulerScope.invalidateSelf();
        rulerScope.RemoteActionCompatParcelizer();
    }

    public void setTextEndPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            float dimension = rulerScope.accessensureViewModelStore.getResources().getDimension(i);
            if (rulerScope.addOnPictureInPictureUiStateChangedListener != dimension) {
                rulerScope.addOnPictureInPictureUiStateChangedListener = dimension;
                rulerScope.invalidateSelf();
                rulerScope.RemoteActionCompatParcelizer();
            }
        }
    }

    public void setTextStartPadding(float f) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || rulerScope.enterPictureInPictureMode == f) {
            return;
        }
        rulerScope.enterPictureInPictureMode = f;
        rulerScope.invalidateSelf();
        rulerScope.RemoteActionCompatParcelizer();
    }

    public void setTextStartPaddingResource(int i) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            float dimension = rulerScope.accessensureViewModelStore.getResources().getDimension(i);
            if (rulerScope.enterPictureInPictureMode != dimension) {
                rulerScope.enterPictureInPictureMode = dimension;
                rulerScope.invalidateSelf();
                rulerScope.RemoteActionCompatParcelizer();
            }
        }
    }

    public final void write() {
        RulerScope rulerScope;
        if (TextUtils.isEmpty(getText()) || (rulerScope = this.RatingCompat) == null) {
            return;
        }
        int iSerializer = (int) (rulerScope.serializer() + rulerScope.RatingCompat + rulerScope.addOnPictureInPictureUiStateChangedListener);
        RulerScope rulerScope2 = this.RatingCompat;
        int iIconCompatParcelizer = (int) (rulerScope2.IconCompatParcelizer() + rulerScope2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + rulerScope2.enterPictureInPictureMode);
        if (this.ComponentActivity != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            this.ComponentActivity.getPadding(rect);
            iIconCompatParcelizer += rect.left;
            iSerializer += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setPaddingRelative(iIconCompatParcelizer, paddingTop, iSerializer, paddingBottom);
    }

    public float getChipCornerRadius() {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            return Math.max(0.0f, rulerScope.read());
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || (drawable = rulerScope.ParcelableVolumeInfo) == null) {
            return null;
        }
        return drawable;
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null || (drawable = rulerScope.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) == null) {
            return null;
        }
        return drawable;
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.RatingCompat == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            IBraze$$ExternalSyntheticBUOutline0.m("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.getLastCustomNonConfigurationInstance = truncateAt;
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.RatingCompat == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    public final void read() {
        RulerScope rulerScope;
        if (!RemoteActionCompatParcelizer() || (rulerScope = this.RatingCompat) == null || !rulerScope.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 || this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == null) {
            FocusPropertiesNode.write(this, (androidx.core.view.AccessibilityDelegateCompat) null);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = false;
        } else {
            FocusPropertiesNode.write(this, this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = true;
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            super.setBackground(drawable);
        } else {
            SentryLogcatAdapter.IconCompatParcelizer("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // o.supportShouldUpRecreateTask, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) {
            super.setBackgroundDrawable(drawable);
        } else {
            SentryLogcatAdapter.IconCompatParcelizer("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(rulerScope.addOnMultiWindowModeChangedListener ? null : charSequence, bufferType);
        RulerScope rulerScope2 = this.RatingCompat;
        if (rulerScope2 == null || TextUtils.equals(rulerScope2.addOnNewIntentListener, charSequence)) {
            return;
        }
        rulerScope2.addOnNewIntentListener = charSequence;
        rulerScope2.addOnTrimMemoryListener.RemoteActionCompatParcelizer = true;
        rulerScope2.invalidateSelf();
        rulerScope2.RemoteActionCompatParcelizer();
    }

    public void setChipDrawable(RulerScope rulerScope) {
        RulerScope rulerScope2 = this.RatingCompat;
        if (rulerScope2 != rulerScope) {
            if (rulerScope2 != null) {
                rulerScope2.getSavedStateRegistryControllerannotations = new java.lang.ref.WeakReference(null);
            }
            this.RatingCompat = rulerScope;
            rulerScope.addOnMultiWindowModeChangedListener = false;
            rulerScope.getSavedStateRegistryControllerannotations = new java.lang.ref.WeakReference(this);
            write(this.ResultReceiver);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            SentryLogcatAdapter.IconCompatParcelizer("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    @Deprecated
    public void setChipTextResource(int i) {
        int i2 = 2 % 2;
        String string = getResources().getString(i);
        Object obj = null;
        if (!(!string.startsWith("%('"))) {
            int i3 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 57;
            r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(string.substring(3), objArr);
                ((String) objArr[0]).intern();
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            a(string.substring(3), objArr2);
            string = ((String) objArr2[0]).intern();
        }
        setText(string);
        int i4 = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs + 49;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public RootMeasurePolicy(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        int resourceId3;
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.logistics.rider.glovo.R.attr.chipStyle);
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new android.graphics.Rect();
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new RectF();
        int i = 0;
        this.MediaSessionCompatToken = new RootMeasurePolicymeasure3(i, this);
        Context context2 = getContext();
        accesshandleMotionFrameOfReferencePlacement accesshandlemotionframeofreferenceplacementIconCompatParcelizer = null;
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                SentryLogcatAdapter.IconCompatParcelizer("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                    SentryLogcatAdapter.IconCompatParcelizer("Chip", "Chip text must be vertically center and start aligned");
                                }
                            } else {
                                IBraze$$ExternalSyntheticBUOutline0.m("Chip does not support multi-line text");
                                throw null;
                            }
                        } else {
                            IBraze$$ExternalSyntheticBUOutline0.m("Please set end drawable using R.attr#closeIcon.");
                            throw null;
                        }
                    } else {
                        IBraze$$ExternalSyntheticBUOutline0.m("Please set end drawable using R.attr#closeIcon.");
                        throw null;
                    }
                } else {
                    IBraze$$ExternalSyntheticBUOutline0.m("Please set start drawable using R.attr#chipIcon.");
                    throw null;
                }
            } else {
                IBraze$$ExternalSyntheticBUOutline0.m("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
        }
        RulerScope rulerScope = new RulerScope(context2, attributeSet);
        Context context3 = rulerScope.accessensureViewModelStore;
        int[] iArr = setMeasuredSizeozmzZPI.Chip;
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(context3, attributeSet, iArr, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        rulerScope.onBackPressedDispatcher_delegatelambda0 = typedArray.hasValue(37);
        Context context4 = rulerScope.accessensureViewModelStore;
        ColorStateList colorStateListIconCompatParcelizer = ScaleFactorKt.IconCompatParcelizer(context4, typedArray, 24);
        if (rulerScope.ComponentActivity != colorStateListIconCompatParcelizer) {
            rulerScope.ComponentActivity = colorStateListIconCompatParcelizer;
            rulerScope.onStateChange(rulerScope.getState());
        }
        ColorStateList colorStateListIconCompatParcelizer2 = ScaleFactorKt.IconCompatParcelizer(context4, typedArray, 11);
        if (rulerScope.MediaBrowserCompatMediaItem != colorStateListIconCompatParcelizer2) {
            rulerScope.MediaBrowserCompatMediaItem = colorStateListIconCompatParcelizer2;
            rulerScope.onStateChange(rulerScope.getState());
        }
        float dimension = typedArray.getDimension(19, 0.0f);
        if (rulerScope.MediaSessionCompatResultReceiverWrapper != dimension) {
            rulerScope.MediaSessionCompatResultReceiverWrapper = dimension;
            rulerScope.invalidateSelf();
            rulerScope.RemoteActionCompatParcelizer();
        }
        if (typedArray.hasValue(12)) {
            rulerScope.RemoteActionCompatParcelizer(typedArray.getDimension(12, 0.0f));
        }
        rulerScope.IconCompatParcelizer(ScaleFactorKt.IconCompatParcelizer(context4, typedArray, 22));
        rulerScope.write(typedArray.getDimension(23, 0.0f));
        rulerScope.MediaMetadataCompat(ScaleFactorKt.IconCompatParcelizer(context4, typedArray, 36));
        String text = typedArray.getText(5);
        text = text == null ? "" : text;
        if (!TextUtils.equals(rulerScope.addOnNewIntentListener, text)) {
            rulerScope.addOnNewIntentListener = text;
            rulerScope.addOnTrimMemoryListener.RemoteActionCompatParcelizer = true;
            rulerScope.invalidateSelf();
            rulerScope.RemoteActionCompatParcelizer();
        }
        isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations = (!typedArray.hasValue(0) || (resourceId3 = typedArray.getResourceId(0, 0)) == 0) ? null : new isSpecifiedFK8aYYsannotations(context4, resourceId3);
        isspecifiedfk8ayysannotations.MediaSessionCompatResultReceiverWrapper = typedArray.getDimension(1, isspecifiedfk8ayysannotations.MediaSessionCompatResultReceiverWrapper);
        rulerScope.RemoteActionCompatParcelizer(isspecifiedfk8ayysannotations);
        int i2 = typedArray.getInt(3, 0);
        if (i2 == 1) {
            rulerScope.getLastCustomNonConfigurationInstance = TextUtils.TruncateAt.START;
        } else if (i2 == 2) {
            rulerScope.getLastCustomNonConfigurationInstance = TextUtils.TruncateAt.MIDDLE;
        } else if (i2 == 3) {
            rulerScope.getLastCustomNonConfigurationInstance = TextUtils.TruncateAt.END;
        }
        rulerScope.RemoteActionCompatParcelizer(typedArray.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            rulerScope.RemoteActionCompatParcelizer(typedArray.getBoolean(15, false));
        }
        rulerScope.write(ScaleFactorKt.write(context4, typedArray, 14));
        if (typedArray.hasValue(17)) {
            rulerScope.read(ScaleFactorKt.IconCompatParcelizer(context4, typedArray, 17));
        }
        rulerScope.read(typedArray.getDimension(16, -1.0f));
        rulerScope.read(typedArray.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            rulerScope.read(typedArray.getBoolean(26, false));
        }
        rulerScope.RatingCompat(ScaleFactorKt.write(context4, typedArray, 25));
        rulerScope.write(ScaleFactorKt.IconCompatParcelizer(context4, typedArray, 30));
        rulerScope.serializer(typedArray.getDimension(28, 0.0f));
        rulerScope.IconCompatParcelizer(typedArray.getBoolean(6, false));
        rulerScope.write(typedArray.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            rulerScope.write(typedArray.getBoolean(8, false));
        }
        rulerScope.read(ScaleFactorKt.write(context4, typedArray, 7));
        if (typedArray.hasValue(9)) {
            rulerScope.serializer(ScaleFactorKt.IconCompatParcelizer(context4, typedArray, 9));
        }
        rulerScope.addOnContextAvailableListener = (!typedArray.hasValue(39) || (resourceId2 = typedArray.getResourceId(39, 0)) == 0) ? null : accesshandleMotionFrameOfReferencePlacement.IconCompatParcelizer(context4, resourceId2);
        if (typedArray.hasValue(33) && (resourceId = typedArray.getResourceId(33, 0)) != 0) {
            accesshandlemotionframeofreferenceplacementIconCompatParcelizer = accesshandleMotionFrameOfReferencePlacement.IconCompatParcelizer(context4, resourceId);
        }
        rulerScope.fullyDrawnReporter_delegatelambda0 = accesshandlemotionframeofreferenceplacementIconCompatParcelizer;
        float dimension2 = typedArray.getDimension(21, 0.0f);
        if (rulerScope.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != dimension2) {
            rulerScope.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = dimension2;
            rulerScope.invalidateSelf();
            rulerScope.RemoteActionCompatParcelizer();
        }
        rulerScope.RatingCompat(typedArray.getDimension(35, 0.0f));
        rulerScope.MediaMetadataCompat(typedArray.getDimension(34, 0.0f));
        float dimension3 = typedArray.getDimension(41, 0.0f);
        if (rulerScope.enterPictureInPictureMode != dimension3) {
            rulerScope.enterPictureInPictureMode = dimension3;
            rulerScope.invalidateSelf();
            rulerScope.RemoteActionCompatParcelizer();
        }
        float dimension4 = typedArray.getDimension(40, 0.0f);
        if (rulerScope.addOnPictureInPictureUiStateChangedListener != dimension4) {
            rulerScope.addOnPictureInPictureUiStateChangedListener = dimension4;
            rulerScope.invalidateSelf();
            rulerScope.RemoteActionCompatParcelizer();
        }
        rulerScope.MediaDescriptionCompat(typedArray.getDimension(29, 0.0f));
        rulerScope.IconCompatParcelizer(typedArray.getDimension(27, 0.0f));
        float dimension5 = typedArray.getDimension(13, 0.0f);
        if (rulerScope.RatingCompat != dimension5) {
            rulerScope.RatingCompat = dimension5;
            rulerScope.invalidateSelf();
            rulerScope.RemoteActionCompatParcelizer();
        }
        rulerScope.onBackPressedDispatcher_delegatelambda010 = typedArray.getDimensionPixelSize(4, Integer.MAX_VALUE);
        typedArray.recycle();
        getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action);
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context2, attributeSet, iArr, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action);
        this.ParcelableVolumeInfo = typedArrayObtainStyledAttributes.getBoolean(32, false);
        this.ResultReceiver = (int) Math.ceil(typedArrayObtainStyledAttributes.getDimension(20, (float) Math.ceil(TypedValue.applyDimension(1, 48.0f, getContext().getResources().getDisplayMetrics()))));
        typedArrayObtainStyledAttributes.recycle();
        setChipDrawable(rulerScope);
        rulerScope.MediaBrowserCompatMediaItem(getElevation());
        getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action);
        getDeactivateOutOfFrameNjRlDlw.RemoteActionCompatParcelizer(context2, attributeSet, iArr, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.logistics.rider.glovo.R.attr.chipStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_Chip_Action);
        boolean zHasValue = typedArrayObtainStyledAttributes2.hasValue(37);
        typedArrayObtainStyledAttributes2.recycle();
        this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = new RootMeasurePolicymeasure1(this, this);
        read();
        if (!zHasValue) {
            setOutlineProvider(new RootMeasurePolicymeasure2(i, this));
        }
        setChecked(this.PlaybackStateCompatCustomAction);
        setText(rulerScope.addOnNewIntentListener);
        setEllipsize(rulerScope.getLastCustomNonConfigurationInstance);
        serializer();
        if (!this.RatingCompat.addOnMultiWindowModeChangedListener) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        write();
        if (this.ParcelableVolumeInfo) {
            setMinHeight(this.ResultReceiver);
        }
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.Ruler
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                }
            }
        });
    }

    public void setCloseIconVisible(boolean z) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.read(z);
        }
        read();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public void setCheckedIconVisible(boolean z) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.write(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RemoteActionCompatParcelizer(z);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(isSpecifiedFK8aYYsannotations isspecifiedfk8ayysannotations) {
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RemoteActionCompatParcelizer(isspecifiedfk8ayysannotations);
        }
        serializer();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        RulerScope rulerScope = this.RatingCompat;
        if (rulerScope != null) {
            rulerScope.RemoteActionCompatParcelizer(new isSpecifiedFK8aYYsannotations(rulerScope.accessensureViewModelStore, i));
        }
        serializer();
    }

    private void a(String str, Object[] objArr) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length];
        for (int i = 0; i < bArrDecode.length; i++) {
            bArr[i] = (byte) (bArrDecode[(bArrDecode.length - i) - 1] ^ r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }

    static void MediaBrowserCompatMediaItem() {
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = (byte) -112;
    }
}
