package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.emoji2.text.EmojiProcessor;
import coil3.util.IntPair;
import o.BaseMenuWrapper;
import o.getIndexOfFirstFeature;
import o.getInflater;
import o.initialize;
import o.onUserLeaveHint;
import o.setForceShowIcon;
import o.setGroupDividerEnabled;
import o.setPadding;
import o.setSupportBackgroundTintList;
import o.setTitle;
import o.supportRequestWindowFeature;

/* JADX INFO: loaded from: classes4.dex */
public final class AppCompatSpinner extends Spinner {
    public static final int[] write = {R.attr.spinnerMode};
    public final BaseMenuWrapper IconCompatParcelizer;
    public SpinnerAdapter MediaBrowserCompatMediaItem;
    public final boolean MediaDescriptionCompat;
    public final Rect MediaMetadataCompat;
    public final Context RatingCompat;
    public final supportRequestWindowFeature RemoteActionCompatParcelizer;
    public int read;
    public final initialize serializer;

    public final initialize getInternalPopup() {
        return this.serializer;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.RatingCompat;
    }

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() { // from class: androidx.appcompat.widget.AppCompatSpinner.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.serializer = parcel.readByte() != 0;
                return savedState;
            }
        };
        public boolean serializer;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.serializer ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (!savedState.serializer || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new setTitle(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        initialize initializeVar = this.serializer;
        savedState.serializer = initializeVar != null && initializeVar.serializer();
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    public AppCompatSpinner(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.spinnerStyle);
        this.MediaMetadataCompat = new Rect();
        setSupportBackgroundTintList.read(this, getContext());
        int[] iArr = onUserLeaveHint.Spinner;
        EmojiProcessor emojiProcessorRemoteActionCompatParcelizer = EmojiProcessor.RemoteActionCompatParcelizer(context, attributeSet, iArr, com.logistics.rider.glovo.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) emojiProcessorRemoteActionCompatParcelizer.read;
        this.RemoteActionCompatParcelizer = new supportRequestWindowFeature(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.RatingCompat = new getIndexOfFirstFeature(context, resourceId);
        } else {
            this.RatingCompat = context;
        }
        TypedArray typedArray2 = null;
        int i = -1;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, write, com.logistics.rider.glovo.R.attr.spinnerStyle, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i != 0) {
                    setGroupDividerEnabled setgroupdividerenabled = new setGroupDividerEnabled(this);
                    this.serializer = setgroupdividerenabled;
                    setgroupdividerenabled.serializer = typedArray.getString(2);
                } else if (i == 1) {
                    getInflater getinflater = new getInflater(this, this.RatingCompat, attributeSet);
                    EmojiProcessor emojiProcessorRemoteActionCompatParcelizer2 = EmojiProcessor.RemoteActionCompatParcelizer(this.RatingCompat, attributeSet, iArr, com.logistics.rider.glovo.R.attr.spinnerStyle);
                    this.read = ((TypedArray) emojiProcessorRemoteActionCompatParcelizer2.read).getLayoutDimension(3, -2);
                    getinflater.IconCompatParcelizer(emojiProcessorRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(1));
                    getinflater.serializer = typedArray.getString(2);
                    emojiProcessorRemoteActionCompatParcelizer2.IconCompatParcelizer();
                    this.serializer = getinflater;
                    this.IconCompatParcelizer = new BaseMenuWrapper(this, this, getinflater);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.logistics.rider.glovo.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
                this.MediaDescriptionCompat = true;
                spinnerAdapter = this.MediaBrowserCompatMediaItem;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.MediaBrowserCompatMediaItem = null;
                }
                this.RemoteActionCompatParcelizer.read(attributeSet, com.logistics.rider.glovo.R.attr.spinnerStyle);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            setGroupDividerEnabled setgroupdividerenabled2 = new setGroupDividerEnabled(this);
            this.serializer = setgroupdividerenabled2;
            setgroupdividerenabled2.serializer = typedArray.getString(2);
        } else if (i == 1) {
            getInflater getinflater2 = new getInflater(this, this.RatingCompat, attributeSet);
            EmojiProcessor emojiProcessorRemoteActionCompatParcelizer3 = EmojiProcessor.RemoteActionCompatParcelizer(this.RatingCompat, attributeSet, iArr, com.logistics.rider.glovo.R.attr.spinnerStyle);
            this.read = ((TypedArray) emojiProcessorRemoteActionCompatParcelizer3.read).getLayoutDimension(3, -2);
            getinflater2.IconCompatParcelizer(emojiProcessorRemoteActionCompatParcelizer3.RemoteActionCompatParcelizer(1));
            getinflater2.serializer = typedArray.getString(2);
            emojiProcessorRemoteActionCompatParcelizer3.IconCompatParcelizer();
            this.serializer = getinflater2;
            this.IconCompatParcelizer = new BaseMenuWrapper(this, this, getinflater2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.logistics.rider.glovo.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        emojiProcessorRemoteActionCompatParcelizer.IconCompatParcelizer();
        this.MediaDescriptionCompat = true;
        spinnerAdapter = this.MediaBrowserCompatMediaItem;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.MediaBrowserCompatMediaItem = null;
        }
        this.RemoteActionCompatParcelizer.read(attributeSet, com.logistics.rider.glovo.R.attr.spinnerStyle);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write();
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        initialize initializeVar = this.serializer;
        if (initializeVar == null || !initializeVar.serializer()) {
            return;
        }
        initializeVar.RemoteActionCompatParcelizer();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.serializer == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), write(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.IconCompatParcelizer();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.serializer(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        initialize initializeVar = this.serializer;
        return initializeVar != null ? initializeVar.write() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        initialize initializeVar = this.serializer;
        return initializeVar != null ? initializeVar.MediaBrowserCompatMediaItem() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.serializer != null ? this.read : super.getDropDownWidth();
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        initialize initializeVar = this.serializer;
        return initializeVar != null ? initializeVar.IconCompatParcelizer() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        initialize initializeVar = this.serializer;
        return initializeVar != null ? initializeVar.read() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.read();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            return supportrequestwindowfeature.serializer();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        BaseMenuWrapper baseMenuWrapper = this.IconCompatParcelizer;
        if (baseMenuWrapper == null || !baseMenuWrapper.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        initialize initializeVar = this.serializer;
        if (initializeVar == null) {
            return super.performClick();
        }
        if (initializeVar.serializer()) {
            return true;
        }
        initializeVar.write(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.MediaDescriptionCompat) {
            this.MediaBrowserCompatMediaItem = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        initialize initializeVar = this.serializer;
        if (initializeVar != null) {
            Context context = this.RatingCompat;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            setForceShowIcon setforceshowicon = new setForceShowIcon();
            setforceshowicon.serializer = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                setforceshowicon.IconCompatParcelizer = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                setPadding.serializer((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            initializeVar.read(setforceshowicon);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        initialize initializeVar = this.serializer;
        if (initializeVar == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            initializeVar.serializer(i);
            initializeVar.RemoteActionCompatParcelizer(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        initialize initializeVar = this.serializer;
        if (initializeVar != null) {
            initializeVar.write(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.serializer != null) {
            this.read = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        initialize initializeVar = this.serializer;
        if (initializeVar != null) {
            initializeVar.IconCompatParcelizer(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(IntPair.write(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        initialize initializeVar = this.serializer;
        if (initializeVar != null) {
            initializeVar.read(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.read(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        supportRequestWindowFeature supportrequestwindowfeature = this.RemoteActionCompatParcelizer;
        if (supportrequestwindowfeature != null) {
            supportrequestwindowfeature.write(mode);
        }
    }

    public final int write(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.MediaMetadataCompat;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }
}
