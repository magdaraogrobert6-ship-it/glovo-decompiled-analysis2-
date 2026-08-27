package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Brush implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new androidx.recyclerview.widget.RecyclerView.SavedState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new androidx.recyclerview.widget.RecyclerView.SavedState(parcel, classLoader);
    }
}
