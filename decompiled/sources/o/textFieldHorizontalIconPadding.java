package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class textFieldHorizontalIconPadding implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new androidx.compose.foundation.lazy.layout.DefaultLazyKey[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new androidx.compose.foundation.lazy.layout.DefaultLazyKey(parcel.readInt());
    }
}
