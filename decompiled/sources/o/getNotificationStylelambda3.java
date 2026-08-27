package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.event.UnknownEvent;

/* JADX INFO: loaded from: classes3.dex */
public final class getNotificationStylelambda3 implements Parcelable.Creator<UnknownEvent> {
    @Override // android.os.Parcelable.Creator
    public final UnknownEvent[] newArray(int i) {
        return new UnknownEvent[i];
    }

    @Override // android.os.Parcelable.Creator
    public final UnknownEvent createFromParcel(Parcel parcel) {
        return new UnknownEvent(parcel);
    }
}
