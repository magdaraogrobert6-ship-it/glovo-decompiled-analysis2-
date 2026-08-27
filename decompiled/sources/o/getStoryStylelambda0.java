package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.event.TransportEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class getStoryStylelambda0 implements Parcelable.Creator<TransportEvent> {
    @Override // android.os.Parcelable.Creator
    public final TransportEvent[] newArray(int i) {
        return new TransportEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final TransportEvent createFromParcel(Parcel parcel) {
        return new TransportEvent(parcel);
    }
}
