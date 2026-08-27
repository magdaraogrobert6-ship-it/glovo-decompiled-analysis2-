package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.zzd;
import o.accessgetNegativeZerocp;
import o.accessgetPositiveZerocp;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new zzd(13);
    public final accessgetPositiveZerocp IconCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new accessgetNegativeZerocp(parcel).write(this.IconCompatParcelizer);
    }

    public ParcelImpl(Parcel parcel) {
        this.IconCompatParcelizer = new accessgetNegativeZerocp(parcel).serializer();
    }
}
