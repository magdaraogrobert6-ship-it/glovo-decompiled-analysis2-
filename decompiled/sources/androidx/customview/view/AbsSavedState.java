package androidx.customview.view;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.FocusTargetNoderequestFocus11;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public abstract class AbsSavedState implements Parcelable {
    public final Parcelable IconCompatParcelizer;
    public static final AbsSavedState serializer = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new FocusTargetNoderequestFocus11();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Parcelable write() {
        return this.IconCompatParcelizer;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.IconCompatParcelizer, i);
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.IconCompatParcelizer = parcelable == serializer ? null : parcelable;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("superState must not be null");
            throw null;
        }
    }

    public AbsSavedState() {
        this.IconCompatParcelizer = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.IconCompatParcelizer = parcelable == null ? serializer : parcelable;
    }
}
