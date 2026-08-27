package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.gms.oss.licenses.zzn;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 extends supportNavigateUpTo {
    public final float MediaBrowserCompatMediaItem;
    public ColorStateList MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final setExpandedActionViewsExclusive MediaSessionCompatQueueItem;
    public ColorStateList MediaSessionCompatResultReceiverWrapper;
    public final android.graphics.Rect PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public final android.view.accessibility.AccessibilityManager read;

    public ColorStateList getDropDownBackgroundTintList() {
        return this.MediaDescriptionCompat;
    }

    public float getPopupElevation() {
        return this.MediaBrowserCompatMediaItem;
    }

    public int getSimpleItemSelectedColor() {
        return this.RatingCompat;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.MediaDescriptionCompat = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof SubcomposeSlotReusePolicy) {
            ((SubcomposeSlotReusePolicy) dropDownBackground).MediaBrowserCompatMediaItem(this.MediaDescriptionCompat);
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.RatingCompat = i;
        if (getAdapter() instanceof getBottomimpl) {
            ((getBottomimpl) getAdapter()).read();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.MediaSessionCompatResultReceiverWrapper = colorStateList;
        if (getAdapter() instanceof getBottomimpl) {
            ((getBottomimpl) getAdapter()).read();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new getBottomimpl(this, getContext(), this.MediaMetadataCompat, strArr));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutSerializer = serializer();
        if (textInputLayoutSerializer != null && textInputLayoutSerializer.addOnConfigurationChangedListener && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(java.util.Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutSerializer = serializer();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutSerializer != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                setExpandedActionViewsExclusive setexpandedactionviewsexclusive = this.MediaSessionCompatQueueItem;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.isShowing() ? -1 : setexpandedactionviewsexclusive.PlaybackStateCompat.getSelectedItemPosition()) + 15);
                View view = null;
                int i3 = 0;
                for (int iMax = Math.max(0, iMin - 15); iMax < iMin; iMax++) {
                    int itemViewType = adapter.getItemViewType(iMax);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(iMax, view, textInputLayoutSerializer);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = Math.max(measuredWidth2, view.getMeasuredWidth());
                }
                Drawable background = setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.getBackground();
                if (background != null) {
                    android.graphics.Rect rect = this.PlaybackStateCompatCustomAction;
                    background.getPadding(rect);
                    measuredWidth2 += rect.left + rect.right;
                }
                measuredWidth2 += textInputLayoutSerializer.getEndIconView().getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.MediaSessionCompatQueueItem.read(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        setExpandedActionViewsExclusive setexpandedactionviewsexclusive = this.MediaSessionCompatQueueItem;
        if (setexpandedactionviewsexclusive != null) {
            setexpandedactionviewsexclusive.IconCompatParcelizer(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.MediaSessionCompatQueueItem.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutSerializer = serializer();
        if (textInputLayoutSerializer != null) {
            textInputLayoutSerializer.MediaDescriptionCompat();
        }
    }

    public TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.PlaybackStateCompatCustomAction = new android.graphics.Rect();
        Context context2 = getContext();
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(context2, attributeSet, setMeasuredSizeozmzZPI.MaterialAutoCompleteTextView, com.logistics.rider.glovo.R.attr.autoCompleteTextViewStyle, com.logistics.rider.glovo.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArray.hasValue(0) && typedArray.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.MediaMetadataCompat = typedArray.getResourceId(3, com.logistics.rider.glovo.R.layout.mtrl_auto_complete_simple_item);
        this.MediaBrowserCompatMediaItem = typedArray.getDimensionPixelOffset(1, com.logistics.rider.glovo.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i = 2;
        if (typedArray.hasValue(2)) {
            this.MediaDescriptionCompat = ColorStateList.valueOf(typedArray.getColor(2, 0));
        }
        this.RatingCompat = typedArray.getColor(4, 0);
        this.MediaSessionCompatResultReceiverWrapper = ScaleFactorKt.IconCompatParcelizer(context2, typedArray, 5);
        this.read = (android.view.accessibility.AccessibilityManager) context2.getSystemService("accessibility");
        setExpandedActionViewsExclusive setexpandedactionviewsexclusive = new setExpandedActionViewsExclusive(context2, null, com.logistics.rider.glovo.R.attr.listPopupWindowStyle, 0);
        this.MediaSessionCompatQueueItem = setexpandedactionviewsexclusive;
        setexpandedactionviewsexclusive.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = true;
        setItemInvoker setiteminvoker = setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        setiteminvoker.setFocusable(true);
        setexpandedactionviewsexclusive.RatingCompat = this;
        setiteminvoker.setInputMethodMode(2);
        setexpandedactionviewsexclusive.read(getAdapter());
        setexpandedactionviewsexclusive.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new zzn(i, this);
        if (typedArray.hasValue(6)) {
            setSimpleItems(typedArray.getResourceId(6, 0));
        }
        typedArray.recycle();
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.read;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.read;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.read;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.MediaSessionCompatQueueItem.b_();
        }
    }

    public static void serializer(TestModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111 testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111, Object obj) {
        testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.setText(testModifierUpdaterKtTestModifierUpdaterLayoutmeasurePolicy111.convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutSerializer = serializer();
        return (textInputLayoutSerializer == null || !textInputLayoutSerializer.addOnConfigurationChangedListener) ? super.getHint() : textInputLayoutSerializer.getHint();
    }

    public final TextInputLayout serializer() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
