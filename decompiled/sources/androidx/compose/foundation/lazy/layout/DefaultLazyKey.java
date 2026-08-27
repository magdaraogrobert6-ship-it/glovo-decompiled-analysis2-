package androidx.compose.foundation.lazy.layout;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import o.textFieldHorizontalIconPadding;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new textFieldHorizontalIconPadding();
    public final int IconCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.IconCompatParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.IconCompatParcelizer);
    }

    public DefaultLazyKey(int i) {
        this.IconCompatParcelizer = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.IconCompatParcelizer == ((DefaultLazyKey) obj).IconCompatParcelizer;
    }

    public final String toString() {
        return af$$ExternalSyntheticOutline0.m(new StringBuilder("DefaultLazyKey(index="), this.IconCompatParcelizer, ')');
    }
}
