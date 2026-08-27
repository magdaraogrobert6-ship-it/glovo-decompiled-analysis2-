package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes4.dex */
public final class getState implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SideSheetBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new SideSheetBehavior.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SideSheetBehavior.SavedState(parcel, classLoader);
    }
}
