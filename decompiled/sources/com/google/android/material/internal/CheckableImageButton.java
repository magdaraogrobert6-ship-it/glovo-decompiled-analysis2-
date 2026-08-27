package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.compose.ui.graphics.Fields;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.datepicker.MaterialCalendar;
import o.FocusPropertiesNode;
import o.WindowCallbackWrapper;
import o.accessgetSlotToReusedFromOnDeactivatecp;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends WindowCallbackWrapper implements Checkable {
    public static final int[] write = {R.attr.state_checked};
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean serializer;

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.MediaMetadataCompat;
    }

    public void setPressable(boolean z) {
        this.MediaSessionCompatQueueItem = z;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new accessgetSlotToReusedFromOnDeactivatecp();
        public boolean read;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.read = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.read ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.logistics.rider.glovo.R.attr.imageButtonStyle);
        this.serializer = true;
        this.MediaSessionCompatQueueItem = true;
        FocusPropertiesNode.write(this, new MaterialCalendar.AnonymousClass6(4, this));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.IconCompatParcelizer);
        setChecked(savedState.read);
    }

    public void setCheckable(boolean z) {
        if (this.serializer != z) {
            this.serializer = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.serializer || this.MediaMetadataCompat == z) {
            return;
        }
        this.MediaMetadataCompat = z;
        refreshDrawableState();
        sendAccessibilityEvent(Fields.CameraDistance);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.MediaSessionCompatQueueItem) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.MediaMetadataCompat);
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.MediaMetadataCompat ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), write) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.read = this.MediaMetadataCompat;
        return savedState;
    }
}
