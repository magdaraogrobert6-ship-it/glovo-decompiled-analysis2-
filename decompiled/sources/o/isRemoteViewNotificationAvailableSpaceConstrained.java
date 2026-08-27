package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.event.OffTheGridEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class isRemoteViewNotificationAvailableSpaceConstrained implements Parcelable.Creator<OffTheGridEvent> {
    @Override // android.os.Parcelable.Creator
    public final OffTheGridEvent[] newArray(int i) {
        return new OffTheGridEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final OffTheGridEvent createFromParcel(Parcel parcel) {
        return new OffTheGridEvent(parcel);
    }
}
