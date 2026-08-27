package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import o.quadraticWinding;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TwoStatePreference extends Preference {
    public CharSequence MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public CharSequence RatingCompat;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // androidx.preference.Preference
    public final Object write(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new quadraticWinding();
        public boolean RemoteActionCompatParcelizer;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.RemoteActionCompatParcelizer = parcel.readInt() == 1;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        }

        public SavedState() {
            super(AbsSavedState.EMPTY_STATE);
        }
    }

    @Override // androidx.preference.Preference
    public final boolean read() {
        boolean z = this.MediaMetadataCompat;
        boolean z2 = this.MediaDescriptionCompat;
        if (z) {
            if (z2) {
                return true;
            }
        } else if (!z2) {
            return true;
        }
        return super.read();
    }

    @Override // androidx.preference.Preference
    public final Parcelable IconCompatParcelizer() {
        super.IconCompatParcelizer();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.fullyDrawnReporter_delegatelambda00) {
            return absSavedState;
        }
        SavedState savedState = new SavedState();
        savedState.RemoteActionCompatParcelizer = this.MediaDescriptionCompat;
        return savedState;
    }

    @Override // androidx.preference.Preference
    public final void serializer() {
        RemoteActionCompatParcelizer(!this.MediaDescriptionCompat);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void read(View view) {
        boolean z;
        CharSequence charSequenceMediaSessionCompatQueueItem;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            int i = 0;
            if (!this.MediaDescriptionCompat || TextUtils.isEmpty(this.MediaBrowserCompatMediaItem)) {
                if (this.MediaDescriptionCompat || TextUtils.isEmpty(this.RatingCompat)) {
                    z = true;
                } else {
                    textView.setText(this.RatingCompat);
                }
                if (z) {
                    charSequenceMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                    if (!TextUtils.isEmpty(charSequenceMediaSessionCompatQueueItem)) {
                        textView.setText(charSequenceMediaSessionCompatQueueItem);
                    } else if (z) {
                        i = 8;
                    }
                } else if (z) {
                    i = 8;
                }
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            textView.setText(this.MediaBrowserCompatMediaItem);
            z = false;
            if (z) {
                charSequenceMediaSessionCompatQueueItem = MediaSessionCompatQueueItem();
                if (!TextUtils.isEmpty(charSequenceMediaSessionCompatQueueItem)) {
                    textView.setText(charSequenceMediaSessionCompatQueueItem);
                } else if (z) {
                    i = 8;
                }
            } else if (z) {
                i = 8;
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void read(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.read(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.read(savedState.getSuperState());
        RemoteActionCompatParcelizer(savedState.RemoteActionCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        boolean z2 = this.MediaDescriptionCompat != z;
        if (z2 || !this.MediaSessionCompatQueueItem) {
            this.MediaDescriptionCompat = z;
            this.MediaSessionCompatQueueItem = true;
            if (MediaBrowserCompatMediaItem()) {
                boolean z3 = !z;
                boolean zMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
                String str = this.accessensureViewModelStore;
                if (zMediaBrowserCompatMediaItem) {
                    z3 = this.fullyDrawnReporter_delegatelambda0.IconCompatParcelizer().getBoolean(str, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor editor = this.fullyDrawnReporter_delegatelambda0.read();
                    editor.putBoolean(str, z);
                    if (!this.fullyDrawnReporter_delegatelambda0.serializer) {
                        editor.apply();
                    }
                }
            }
            if (z2) {
                write(read());
                write();
            }
        }
    }
}
