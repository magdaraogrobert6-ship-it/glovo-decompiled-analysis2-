package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.event.StationaryEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class getNotificationStylelambda4 implements Parcelable.Creator<StationaryEvent> {
    @Override // android.os.Parcelable.Creator
    public final StationaryEvent[] newArray(int i) {
        return new StationaryEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final StationaryEvent createFromParcel(Parcel parcel) {
        return new StationaryEvent(parcel);
    }
}
