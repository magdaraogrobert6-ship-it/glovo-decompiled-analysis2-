package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.GeoLocation;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdasltIPiGJVVPhbuJO9BTkcUoy0rM implements Parcelable.Creator<GeoLocation> {
    @Override // android.os.Parcelable.Creator
    public final GeoLocation[] newArray(int i) {
        return new GeoLocation[i];
    }

    @Override // android.os.Parcelable.Creator
    public final GeoLocation createFromParcel(Parcel parcel) {
        return new GeoLocation(parcel);
    }
}
