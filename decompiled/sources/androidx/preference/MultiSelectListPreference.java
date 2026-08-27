package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.findCubicExtremaY;
import o.isQuadraticMonotonic;

/* JADX INFO: loaded from: classes4.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final HashSet MediaDescriptionCompat;
    public final CharSequence[] MediaSessionCompatQueueItem;
    public final CharSequence[] RatingCompat;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new findCubicExtremaY();
        public HashSet serializer;

        public SavedState(Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.serializer = new HashSet();
            String[] strArr = new String[i];
            parcel.readStringArray(strArr);
            Collections.addAll(this.serializer, strArr);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.serializer.size());
            HashSet hashSet = this.serializer;
            parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    public final void serializer(Set set) {
        HashSet hashSet = this.MediaDescriptionCompat;
        hashSet.clear();
        hashSet.addAll(set);
        if (MediaBrowserCompatMediaItem()) {
            boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            String str = this.accessensureViewModelStore;
            if (!set.equals(zMediaBrowserCompatMediaItem ? this.fullyDrawnReporter_delegatelambda0.IconCompatParcelizer().getStringSet(str, null) : null)) {
                SharedPreferences.Editor editor = this.fullyDrawnReporter_delegatelambda0.read();
                editor.putStringSet(str, set);
                if (!this.fullyDrawnReporter_delegatelambda0.serializer) {
                    editor.apply();
                }
            }
        }
        write();
    }

    @Override // androidx.preference.Preference
    public final Parcelable IconCompatParcelizer() {
        super.IconCompatParcelizer();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.fullyDrawnReporter_delegatelambda00) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.serializer = this.MediaDescriptionCompat;
        return savedState;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iRemoteActionCompatParcelizer = ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iRemoteActionCompatParcelizer);
        this.MediaDescriptionCompat = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.MultiSelectListPreference, iRemoteActionCompatParcelizer, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.RatingCompat = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.MediaSessionCompatQueueItem = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
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
        serializer(savedState.serializer);
    }

    @Override // androidx.preference.Preference
    public final Object write(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
