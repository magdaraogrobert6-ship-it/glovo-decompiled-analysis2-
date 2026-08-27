package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class getTopRightCornerRadiuskKHJgLs implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new androidx.fragment.app.Fragment.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new androidx.fragment.app.Fragment.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new androidx.fragment.app.Fragment.SavedState(parcel, classLoader);
    }
}
