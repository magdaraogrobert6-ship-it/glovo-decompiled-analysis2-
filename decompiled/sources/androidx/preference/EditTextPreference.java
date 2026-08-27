package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import coil3.ExtrasKt;
import com.google.firebase.Timestamp;
import com.logistics.rider.glovo.R;
import o.evaluateCubic;
import o.isQuadraticMonotonic;

/* JADX INFO: loaded from: classes4.dex */
public class EditTextPreference extends DialogPreference {
    public String MediaSessionCompatQueueItem;

    @Override // androidx.preference.Preference
    public final Object write(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new evaluateCubic();
        public String serializer;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.serializer = parcel.readString();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.serializer);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean read() {
        return TextUtils.isEmpty(this.MediaSessionCompatQueueItem) || super.read();
    }

    @Override // androidx.preference.Preference
    public final Parcelable IconCompatParcelizer() {
        super.IconCompatParcelizer();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.fullyDrawnReporter_delegatelambda00) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.serializer = this.MediaSessionCompatQueueItem;
        return savedState;
    }

    public final void read(String str) {
        boolean z = read();
        this.MediaSessionCompatQueueItem = str;
        serializer(str);
        boolean z2 = read();
        if (z2 != z) {
            write(z2);
        }
        write();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iRemoteActionCompatParcelizer);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.EditTextPreference, iRemoteActionCompatParcelizer, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (Timestamp.Companion.read == null) {
                Timestamp.Companion.read = new Timestamp.Companion(0);
            }
            this.onBackPressedDispatcher_delegatelambda010 = Timestamp.Companion.read;
            write();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void read(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.read(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.read(savedState.getSuperState());
        read(savedState.serializer);
    }
}
