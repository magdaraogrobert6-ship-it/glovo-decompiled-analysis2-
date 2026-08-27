package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import o.findQuadraticRootsdefault;
import o.isQuadraticMonotonic;
import o.processDragGesture;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PreferenceGroup extends Preference {
    public int IconCompatParcelizer;
    public final ArrayList MediaSessionCompatQueueItem;
    public boolean RemoteActionCompatParcelizer;
    public final processDragGesture read;
    public boolean serializer;
    public int write;

    public static class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new findQuadraticRootsdefault();
        public final int write;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.write = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.write);
        }

        public SavedState(int i) {
            super(AbsSavedState.EMPTY_STATE);
            this.write = i;
        }
    }

    public final Preference RemoteActionCompatParcelizer(int i) {
        return (Preference) this.MediaSessionCompatQueueItem.get(i);
    }

    @Override // androidx.preference.Preference
    public final Parcelable IconCompatParcelizer() {
        super.IconCompatParcelizer();
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        return new SavedState(this.write);
    }

    @Override // androidx.preference.Preference
    public final void IconCompatParcelizer(Bundle bundle) {
        super.IconCompatParcelizer(bundle);
        int size = this.MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(i).IconCompatParcelizer(bundle);
        }
    }

    public final Preference read(CharSequence charSequence) {
        Preference preference;
        if (charSequence != null) {
            if (TextUtils.equals(this.accessensureViewModelStore, charSequence)) {
                return this;
            }
            int size = this.MediaSessionCompatQueueItem.size();
            for (int i = 0; i < size; i++) {
                Preference preferenceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
                if (TextUtils.equals(preferenceRemoteActionCompatParcelizer.accessensureViewModelStore, charSequence)) {
                    return preferenceRemoteActionCompatParcelizer;
                }
                if ((preferenceRemoteActionCompatParcelizer instanceof PreferenceGroup) && (preference = ((PreferenceGroup) preferenceRemoteActionCompatParcelizer).read(charSequence)) != null) {
                    return preference;
                }
            }
            return null;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Key cannot be null");
        return null;
    }

    @Override // androidx.preference.Preference
    public final void read(Bundle bundle) {
        super.read(bundle);
        int size = this.MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(i).read(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void write(boolean z) {
        super.write(z);
        int size = this.MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
            if (preferenceRemoteActionCompatParcelizer.createFullyDrawnExecutor == z) {
                preferenceRemoteActionCompatParcelizer.createFullyDrawnExecutor = !z;
                preferenceRemoteActionCompatParcelizer.write(preferenceRemoteActionCompatParcelizer.read());
                preferenceRemoteActionCompatParcelizer.write();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void MediaDescriptionCompat() {
        super.MediaDescriptionCompat();
        this.RemoteActionCompatParcelizer = true;
        int size = this.MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(i).MediaDescriptionCompat();
        }
    }

    @Override // androidx.preference.Preference
    public final void RatingCompat() {
        super.RatingCompat();
        this.RemoteActionCompatParcelizer = false;
        int size = this.MediaSessionCompatQueueItem.size();
        for (int i = 0; i < size; i++) {
            RemoteActionCompatParcelizer(i).RatingCompat();
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.read = new processDragGesture(0);
        new Handler(Looper.getMainLooper());
        this.serializer = true;
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = false;
        this.write = Integer.MAX_VALUE;
        this.MediaSessionCompatQueueItem = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, isQuadraticMonotonic.PreferenceGroup, i, 0);
        this.serializer = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i3 != Integer.MAX_VALUE && TextUtils.isEmpty(this.accessensureViewModelStore)) {
                SentryLogcatAdapter.serializer("PreferenceGroup", getClass().getSimpleName().concat(" should have a key defined if it contains an expandable preference"));
            }
            this.write = i3;
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
        this.write = savedState.write;
        super.read(savedState.getSuperState());
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }
}
