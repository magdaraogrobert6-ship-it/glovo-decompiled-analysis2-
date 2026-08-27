package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.Waypoint;

/* JADX INFO: loaded from: classes3.dex */
public final class getStoryStylelambda1 implements Parcelable.Creator<Waypoint> {
    @Override // android.os.Parcelable.Creator
    public final Waypoint[] newArray(int i) {
        return new Waypoint[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Waypoint createFromParcel(Parcel parcel) {
        return new Waypoint(parcel);
    }
}
