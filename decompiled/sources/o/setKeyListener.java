package o;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat$EmojiCompatInitCallback;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.setKeyListener;

/* JADX INFO: loaded from: classes.dex */
public class setKeyListener extends CompoundButton {
    public int ComponentActivity;
    public SwitchCompat$EmojiCompatInitCallback IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public StaticLayout MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public boolean ParcelableVolumeInfo;
    public StaticLayout PlaybackStateCompat;
    public ObjectAnimator PlaybackStateCompatCustomAction;
    public final int RatingCompat;
    public getAccessibilityClassName RemoteActionCompatParcelizer;
    public int ResultReceiver;
    public final TextPaint _init_lambda1;
    public ColorStateList _init_lambda2;
    public Drawable _init_lambda3;
    public float _init_lambda4;
    public int accessensureViewModelStore;
    public int addObserverForBackInvoker;
    public final int addObserverForBackInvokerlambda0;
    public int createFullyDrawnExecutor;
    public PorterDuff.Mode defaultViewModelProviderFactory_delegatelambda0;
    public float ensureViewModelStore;
    public ColorStateList fullyDrawnReporter_delegatelambda0;
    public Drawable fullyDrawnReporter_delegatelambda00;
    public PorterDuff.Mode getOnBackPressedInput;
    public final android.view.VelocityTracker getSavedStateRegistryControllerannotations;
    public float menuHostHelperlambda0;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final android.graphics.Rect r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
    public final remove r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
    public int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    public int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    public CharSequence r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
    public CharSequence r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    public CharSequence r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    public CharSequence r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public final ColorStateList r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
    public boolean serializer;
    public static final Fields write = new Fields(Float.class, "thumbPos", 1);
    public static final int[] read = {android.R.attr.state_checked};

    private boolean getTargetCheckedState() {
        return this._init_lambda4 > 0.5f;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public boolean getShowText() {
        return this.ParcelableVolumeInfo;
    }

    public boolean getSplitTrack() {
        return this.MediaSessionCompatToken;
    }

    public int getSwitchMinWidth() {
        return this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    }

    public int getSwitchPadding() {
        return this.ComponentActivity;
    }

    public CharSequence getTextOff() {
        return this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    }

    public CharSequence getTextOn() {
        return this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
    }

    public Drawable getThumbDrawable() {
        return this._init_lambda3;
    }

    public final float getThumbPosition() {
        return this._init_lambda4;
    }

    public int getThumbTextPadding() {
        return this.accessensureViewModelStore;
    }

    public ColorStateList getThumbTintList() {
        return this._init_lambda2;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.defaultViewModelProviderFactory_delegatelambda0;
    }

    public Drawable getTrackDrawable() {
        return this.fullyDrawnReporter_delegatelambda00;
    }

    public ColorStateList getTrackTintList() {
        return this.fullyDrawnReporter_delegatelambda0;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.getOnBackPressedInput;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = charSequence;
        TransformationMethod transformationMethodIconCompatParcelizer = ((coil3.UriKt) getEmojiTextViewHelper().RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).IconCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        if (transformationMethodIconCompatParcelizer != null) {
            charSequence = transformationMethodIconCompatParcelizer.getTransformation(charSequence, this);
        }
        this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = charSequence;
        this.MediaSessionCompatResultReceiverWrapper = null;
        if (this.ParcelableVolumeInfo) {
            setupEmojiCompatLoadCallback();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = charSequence;
        TransformationMethod transformationMethodIconCompatParcelizer = ((coil3.UriKt) getEmojiTextViewHelper().RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).IconCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
        if (transformationMethodIconCompatParcelizer != null) {
            charSequence = transformationMethodIconCompatParcelizer.getTransformation(charSequence, this);
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = charSequence;
        this.PlaybackStateCompat = null;
        if (this.ParcelableVolumeInfo) {
            setupEmojiCompatLoadCallback();
        }
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int i;
        int i2;
        int i3 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i4 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i5 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        int i6 = this.ResultReceiver;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this._init_lambda3;
        android.graphics.Rect rect = drawable != null ? getNestedScrollAxes.read(drawable) : getNestedScrollAxes.write;
        Drawable drawable2 = this.fullyDrawnReporter_delegatelambda00;
        android.graphics.Rect rect2 = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.fullyDrawnReporter_delegatelambda00.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.fullyDrawnReporter_delegatelambda00.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this._init_lambda3;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.addObserverForBackInvoker + rect2.right;
            this._init_lambda3.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, read);
        }
        return iArrOnCreateDrawableState;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        android.view.VelocityTracker velocityTracker = this.getSavedStateRegistryControllerannotations;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.addObserverForBackInvokerlambda0;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.createFullyDrawnExecutor == 2) {
                    this.createFullyDrawnExecutor = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.RatingCompat) {
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.createFullyDrawnExecutor = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i2 = this.createFullyDrawnExecutor;
                if (i2 == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.ensureViewModelStore) > f3 || Math.abs(y - this.menuHostHelperlambda0) > f3) {
                        this.createFullyDrawnExecutor = 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.ensureViewModelStore = x;
                        this.menuHostHelperlambda0 = y;
                        return true;
                    }
                } else if (i2 == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.ensureViewModelStore;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this._init_lambda4;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.ensureViewModelStore = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.createFullyDrawnExecutor == 2) {
                    this.createFullyDrawnExecutor = 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.RatingCompat) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (getLayoutDirection() == 1) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.createFullyDrawnExecutor = 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this._init_lambda3 != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this._init_lambda3;
                android.graphics.Rect rect = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                drawable.getPadding(rect);
                int i3 = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                int i4 = (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + thumbOffset) - i;
                int i5 = this.addObserverForBackInvoker;
                int i6 = rect.left;
                int i7 = rect.right;
                int i8 = this.ResultReceiver;
                if (x3 > i4 && x3 < i5 + i4 + i6 + i7 + i && y2 > i3 - i && y2 < i8 + i) {
                    this.createFullyDrawnExecutor = 1;
                    this.ensureViewModelStore = x3;
                    this.menuHostHelperlambda0 = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void serializer() {
        setTextOnInternal(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        setTextOffInternal(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.serializer = z;
        invalidate();
    }

    public void setSplitTrack(boolean z) {
        this.MediaSessionCompatToken = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.ComponentActivity = i;
        requestLayout();
    }

    public void setSwitchTypeface(android.graphics.Typeface typeface) {
        TextPaint textPaint = this._init_lambda1;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setThumbPosition(float f) {
        this._init_lambda4 = f;
        invalidate();
    }

    public void setThumbTextPadding(int i) {
        this.accessensureViewModelStore = i;
        requestLayout();
    }

    public setKeyListener(Context context, AttributeSet attributeSet) {
        android.graphics.Typeface typeface;
        android.graphics.Typeface typefaceCreate;
        int resourceId;
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.switchStyle);
        this._init_lambda2 = null;
        this.defaultViewModelProviderFactory_delegatelambda0 = null;
        this.MediaMetadataCompat = false;
        this.MediaSessionCompatQueueItem = false;
        this.fullyDrawnReporter_delegatelambda0 = null;
        this.getOnBackPressedInput = null;
        this.MediaDescriptionCompat = false;
        this.MediaBrowserCompatMediaItem = false;
        this.getSavedStateRegistryControllerannotations = android.view.VelocityTracker.obtain();
        this.serializer = true;
        this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new android.graphics.Rect();
        setSupportBackgroundTintList.read(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this._init_lambda1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = onUserLeaveHint.SwitchCompat;
        androidx.emoji2.text.EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = androidx.emoji2.text.EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, com.logistics.rider.glovo.R.attr.switchStyle);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        FocusPropertiesNode.IconCompatParcelizer(this, context, iArr, attributeSet, typedArray, com.logistics.rider.glovo.R.attr.switchStyle);
        Drawable drawableRemoteActionCompatParcelizer = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(2);
        this._init_lambda3 = drawableRemoteActionCompatParcelizer;
        if (drawableRemoteActionCompatParcelizer != null) {
            drawableRemoteActionCompatParcelizer.setCallback(this);
        }
        Drawable drawableRemoteActionCompatParcelizer2 = emojiProcessorRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(11);
        this.fullyDrawnReporter_delegatelambda00 = drawableRemoteActionCompatParcelizer2;
        if (drawableRemoteActionCompatParcelizer2 != null) {
            drawableRemoteActionCompatParcelizer2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.ParcelableVolumeInfo = typedArray.getBoolean(3, true);
        this.accessensureViewModelStore = typedArray.getDimensionPixelSize(8, 0);
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = typedArray.getDimensionPixelSize(5, 0);
        this.ComponentActivity = typedArray.getDimensionPixelSize(6, 0);
        this.MediaSessionCompatToken = typedArray.getBoolean(4, false);
        ColorStateList colorStateListSerializer = emojiProcessorRemoteActionCompatParcelizer.serializer(9);
        if (colorStateListSerializer != null) {
            this._init_lambda2 = colorStateListSerializer;
            this.MediaMetadataCompat = true;
        }
        PorterDuff.Mode modeIconCompatParcelizer = getNestedScrollAxes.IconCompatParcelizer(typedArray.getInt(10, -1), null);
        if (this.defaultViewModelProviderFactory_delegatelambda0 != modeIconCompatParcelizer) {
            this.defaultViewModelProviderFactory_delegatelambda0 = modeIconCompatParcelizer;
            this.MediaSessionCompatQueueItem = true;
        }
        if (this.MediaMetadataCompat || this.MediaSessionCompatQueueItem) {
            RemoteActionCompatParcelizer();
        }
        ColorStateList colorStateListSerializer2 = emojiProcessorRemoteActionCompatParcelizer.serializer(12);
        if (colorStateListSerializer2 != null) {
            this.fullyDrawnReporter_delegatelambda0 = colorStateListSerializer2;
            this.MediaDescriptionCompat = true;
        }
        PorterDuff.Mode modeIconCompatParcelizer2 = getNestedScrollAxes.IconCompatParcelizer(typedArray.getInt(13, -1), null);
        if (this.getOnBackPressedInput != modeIconCompatParcelizer2) {
            this.getOnBackPressedInput = modeIconCompatParcelizer2;
            this.MediaBrowserCompatMediaItem = true;
        }
        if (this.MediaDescriptionCompat || this.MediaBrowserCompatMediaItem) {
            IconCompatParcelizer();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, onUserLeaveHint.TextAppearance);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = FocusListener.write(context, resourceId)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = colorStateList;
            } else {
                this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i2 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i == 1) {
                typeface = android.graphics.Typeface.SANS_SERIF;
            } else if (i != 2) {
                typeface = i != 3 ? null : android.graphics.Typeface.MONOSPACE;
            } else {
                typeface = android.graphics.Typeface.SERIF;
            }
            if (i2 > 0) {
                if (typeface == null) {
                    typefaceCreate = android.graphics.Typeface.defaultFromStyle(i2);
                } else {
                    typefaceCreate = android.graphics.Typeface.create(typeface, i2);
                }
                setSwitchTypeface(typefaceCreate);
                int i3 = (~(typefaceCreate != null ? typefaceCreate.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) != 0);
                textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                remove removeVar = new remove();
                removeVar.read = context2.getResources().getConfiguration().locale;
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = removeVar;
            } else {
                this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = null;
            }
            setTextOnInternal(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
            setTextOffInternal(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
            typedArrayObtainStyledAttributes.recycle();
        }
        new setSplitBackground(this).RemoteActionCompatParcelizer(attributeSet, com.logistics.rider.glovo.R.attr.switchStyle);
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.addObserverForBackInvokerlambda0 = viewConfiguration.getScaledTouchSlop();
        this.RatingCompat = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().write(attributeSet, com.logistics.rider.glovo.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this._init_lambda3;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.fullyDrawnReporter_delegatelambda00;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this._init_lambda3;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.fullyDrawnReporter_delegatelambda00;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this._init_lambda3;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.fullyDrawnReporter_delegatelambda00;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.PlaybackStateCompatCustomAction;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.PlaybackStateCompatCustomAction.end();
        this.PlaybackStateCompatCustomAction = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.fullyDrawnReporter_delegatelambda00;
        android.graphics.Rect rect = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
        int i2 = this.ResultReceiver;
        int i3 = rect.top;
        int i4 = rect.bottom;
        Drawable drawable2 = this._init_lambda3;
        if (drawable != null) {
            if (!this.MediaSessionCompatToken || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                android.graphics.Rect rect2 = getNestedScrollAxes.read(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rect2.left;
                rect.right -= rect2.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.PlaybackStateCompat : this.MediaSessionCompatResultReceiverWrapper;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this._init_lambda1;
            ColorStateList colorStateList = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                android.graphics.Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), (((i + i3) + (i2 - i4)) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this._init_lambda3 != null) {
            Drawable drawable = this.fullyDrawnReporter_delegatelambda00;
            android.graphics.Rect rect = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            android.graphics.Rect rect2 = getNestedScrollAxes.read(this._init_lambda3);
            iMax = Math.max(0, rect2.left - rect.left);
            iMax2 = Math.max(0, rect2.right - rect.right);
        } else {
            iMax = 0;
        }
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = paddingLeft;
        this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = paddingTop;
        this.ResultReceiver = height;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = width;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw : this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().RemoteActionCompatParcelizer(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                if (string == null) {
                    string = getResources().getString(com.logistics.rider.glovo.R.string.abc_capital_on);
                }
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).write(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (string2 == null) {
                string2 = getResources().getString(com.logistics.rider.glovo.R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).write(this, string2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.PlaybackStateCompatCustomAction;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, write, zIsChecked ? 1.0f : 0.0f);
        this.PlaybackStateCompatCustomAction = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.PlaybackStateCompatCustomAction.setAutoCancel(true);
        this.PlaybackStateCompatCustomAction.start();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (string == null) {
            string = getResources().getString(com.logistics.rider.glovo.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).write(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        if (string == null) {
            string = getResources().getString(com.logistics.rider.glovo.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_state_description, CharSequence.class, 64, 30, 2).write(this, string);
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this._init_lambda2 = colorStateList;
        this.MediaMetadataCompat = true;
        RemoteActionCompatParcelizer();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.defaultViewModelProviderFactory_delegatelambda0 = mode;
        this.MediaSessionCompatQueueItem = true;
        RemoteActionCompatParcelizer();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.fullyDrawnReporter_delegatelambda0 = colorStateList;
        this.MediaDescriptionCompat = true;
        IconCompatParcelizer();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.getOnBackPressedInput = mode;
        this.MediaBrowserCompatMediaItem = true;
        IconCompatParcelizer();
    }

    private int getThumbOffset() {
        int layoutDirection = getLayoutDirection();
        float f = this._init_lambda4;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.fullyDrawnReporter_delegatelambda00;
        if (drawable == null) {
            return 0;
        }
        android.graphics.Rect rect = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        drawable.getPadding(rect);
        Drawable drawable2 = this._init_lambda3;
        android.graphics.Rect rect2 = drawable2 != null ? getNestedScrollAxes.read(drawable2) : getNestedScrollAxes.write;
        int i = this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        int i2 = this.addObserverForBackInvoker;
        int i3 = rect.left;
        return ((((i - i2) - i3) - rect.right) - rect2.left) - rect2.right;
    }

    public final void IconCompatParcelizer() {
        Drawable drawable = this.fullyDrawnReporter_delegatelambda00;
        if (drawable != null) {
            if (this.MediaDescriptionCompat || this.MediaBrowserCompatMediaItem) {
                Drawable drawableMutate = drawable.mutate();
                this.fullyDrawnReporter_delegatelambda00 = drawableMutate;
                if (this.MediaDescriptionCompat) {
                    drawableMutate.setTintList(this.fullyDrawnReporter_delegatelambda0);
                }
                if (this.MediaBrowserCompatMediaItem) {
                    this.fullyDrawnReporter_delegatelambda00.setTintMode(this.getOnBackPressedInput);
                }
                if (this.fullyDrawnReporter_delegatelambda00.isStateful()) {
                    this.fullyDrawnReporter_delegatelambda00.setState(getDrawableState());
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        Drawable drawable = this._init_lambda3;
        if (drawable != null) {
            if (this.MediaMetadataCompat || this.MediaSessionCompatQueueItem) {
                Drawable drawableMutate = drawable.mutate();
                this._init_lambda3 = drawableMutate;
                if (this.MediaMetadataCompat) {
                    drawableMutate.setTintList(this._init_lambda2);
                }
                if (this.MediaSessionCompatQueueItem) {
                    this._init_lambda3.setTintMode(this.defaultViewModelProviderFactory_delegatelambda0);
                }
                if (this._init_lambda3.isStateful()) {
                    this._init_lambda3.setState(getDrawableState());
                }
            }
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().serializer(z);
        setTextOnInternal(this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw);
        setTextOffInternal(this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().serializer(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.ParcelableVolumeInfo != z) {
            this.ParcelableVolumeInfo = z;
            requestLayout();
            if (z) {
                setupEmojiCompatLoadCallback();
            }
        }
    }

    public void setThumbResource(int i) {
        setThumbDrawable(coil3.util.IntPair.write(getContext(), i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(coil3.util.IntPair.write(getContext(), i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.appcompat.widget.SwitchCompat$EmojiCompatInitCallback, androidx.emoji2.text.EmojiCompat$InitCallback] */
    public final void setupEmojiCompatLoadCallback() {
        if (this.IconCompatParcelizer == null && ((coil3.UriKt) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer).read() && MutableRectKt.write()) {
            MutableRectKt mutableRectKtRemoteActionCompatParcelizer = MutableRectKt.RemoteActionCompatParcelizer();
            int iIconCompatParcelizer = mutableRectKtRemoteActionCompatParcelizer.IconCompatParcelizer();
            if (iIconCompatParcelizer == 3 || iIconCompatParcelizer == 0) {
                ?? r1 = new EmojiCompat$InitCallback(this) { // from class: androidx.appcompat.widget.SwitchCompat$EmojiCompatInitCallback
                    public final WeakReference read;

                    @Override // androidx.emoji2.text.EmojiCompat$InitCallback
                    public final void onFailed(Throwable th) {
                        setKeyListener setkeylistener = (setKeyListener) this.read.get();
                        if (setkeylistener != null) {
                            setkeylistener.serializer();
                        }
                    }

                    @Override // androidx.emoji2.text.EmojiCompat$InitCallback
                    public final void onInitialized() {
                        setKeyListener setkeylistener = (setKeyListener) this.read.get();
                        if (setkeylistener != null) {
                            setkeylistener.serializer();
                        }
                    }

                    {
                        this.read = new WeakReference(this);
                    }
                };
                this.IconCompatParcelizer = r1;
                mutableRectKtRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r1);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw : this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.ParcelableVolumeInfo) {
            StaticLayout staticLayout = this.PlaybackStateCompat;
            TextPaint textPaint = this._init_lambda1;
            if (staticLayout == null) {
                CharSequence charSequence = this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                this.PlaybackStateCompat = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(android.text.Layout.getDesiredWidth(charSequence, textPaint)) : 0, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.MediaSessionCompatResultReceiverWrapper == null) {
                CharSequence charSequence2 = this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                this.MediaSessionCompatResultReceiverWrapper = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(android.text.Layout.getDesiredWidth(charSequence2, textPaint)) : 0, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this._init_lambda3;
        android.graphics.Rect rect = this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this._init_lambda3.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this._init_lambda3.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.ParcelableVolumeInfo) {
            iMax = (this.accessensureViewModelStore * 2) + Math.max(this.PlaybackStateCompat.getWidth(), this.MediaSessionCompatResultReceiverWrapper.getWidth());
        } else {
            iMax = 0;
        }
        this.addObserverForBackInvoker = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.fullyDrawnReporter_delegatelambda00;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.fullyDrawnReporter_delegatelambda00.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this._init_lambda3;
        if (drawable3 != null) {
            android.graphics.Rect rect2 = getNestedScrollAxes.read(drawable3);
            iMax2 = Math.max(iMax2, rect2.left);
            iMax3 = Math.max(iMax3, rect2.right);
        }
        boolean z = this.serializer;
        int iMax4 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (z) {
            iMax4 = Math.max(iMax4, (this.addObserverForBackInvoker * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = iMax4;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this._init_lambda3;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this._init_lambda3 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.fullyDrawnReporter_delegatelambda00;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.fullyDrawnReporter_delegatelambda00 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    private getAccessibilityClassName getEmojiTextViewHelper() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new getAccessibilityClassName(this);
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this._init_lambda3 || drawable == this.fullyDrawnReporter_delegatelambda00;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.ComponentActivity : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.ComponentActivity : compoundPaddingRight;
    }
}
