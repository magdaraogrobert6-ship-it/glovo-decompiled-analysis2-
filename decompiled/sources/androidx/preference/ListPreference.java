package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.transition.Transition$1;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import o.findFirstQuadraticRoot;
import o.findLineRoot;
import o.isQuadraticMonotonic;

/* JADX INFO: loaded from: classes4.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] MediaDescriptionCompat;
    public final CharSequence[] MediaSessionCompatResultReceiverWrapper;
    public boolean MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public String PlaybackStateCompatCustomAction;

    @Override // androidx.preference.Preference
    public final Object write(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new findFirstQuadraticRoot();
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

    public final int IconCompatParcelizer(String str) {
        CharSequence[] charSequenceArr;
        if (str != null && (charSequenceArr = this.MediaSessionCompatResultReceiverWrapper) != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    return length;
                }
            }
        }
        return -1;
    }

    public final void write(String str) {
        boolean zEquals = TextUtils.equals(this.PlaybackStateCompatCustomAction, str);
        if (zEquals && this.MediaSessionCompatToken) {
            return;
        }
        this.PlaybackStateCompatCustomAction = str;
        this.MediaSessionCompatToken = true;
        serializer(str);
        if (zEquals) {
            return;
        }
        write();
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.ListPreference, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.MediaDescriptionCompat = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.MediaSessionCompatResultReceiverWrapper = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            if (Transition$1.read == null) {
                Transition$1.read = new Transition$1(11);
            }
            this.onBackPressedDispatcher_delegatelambda010 = Transition$1.read;
            write();
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.Preference, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.ParcelableVolumeInfo = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final Parcelable IconCompatParcelizer() {
        super.IconCompatParcelizer();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.fullyDrawnReporter_delegatelambda00) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.serializer = this.PlaybackStateCompatCustomAction;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final CharSequence MediaSessionCompatQueueItem() {
        CharSequence[] charSequenceArr;
        findLineRoot findlineroot = this.onBackPressedDispatcher_delegatelambda010;
        if (findlineroot != null) {
            return findlineroot.RemoteActionCompatParcelizer(this);
        }
        int iIconCompatParcelizer = IconCompatParcelizer(this.PlaybackStateCompatCustomAction);
        CharSequence charSequence = (iIconCompatParcelizer < 0 || (charSequenceArr = this.MediaDescriptionCompat) == null) ? null : charSequenceArr[iIconCompatParcelizer];
        CharSequence charSequenceMediaSessionCompatQueueItem = super.MediaSessionCompatQueueItem();
        String str = this.ParcelableVolumeInfo;
        if (str != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            String str2 = String.format(str, charSequence);
            if (!TextUtils.equals(str2, charSequenceMediaSessionCompatQueueItem)) {
                SentryLogcatAdapter.IconCompatParcelizer("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceMediaSessionCompatQueueItem;
    }

    @Override // androidx.preference.Preference
    public final void read(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.read(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.read(savedState.getSuperState());
        write(savedState.serializer);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ExtrasKt.RemoteActionCompatParcelizer(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
