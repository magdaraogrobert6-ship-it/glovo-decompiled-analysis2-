package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.util.DateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class migratePushDeliveryEventsToJsonlambda3 implements Parcelable.Creator<DateTime> {
    @Override // android.os.Parcelable.Creator
    public final DateTime[] newArray(int i) {
        return new DateTime[i];
    }

    @Override // android.os.Parcelable.Creator
    public final DateTime createFromParcel(Parcel parcel) {
        return new DateTime(parcel);
    }
}
