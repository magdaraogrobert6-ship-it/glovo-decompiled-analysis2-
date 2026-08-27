package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.venue.Venue;

/* JADX INFO: loaded from: classes3.dex */
public final class setStyleIfSupportedlambda0 implements Parcelable.Creator<Venue> {
    @Override // android.os.Parcelable.Creator
    public final Venue[] newArray(int i) {
        return new Venue[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Venue createFromParcel(Parcel parcel) {
        return new Venue(parcel);
    }
}
