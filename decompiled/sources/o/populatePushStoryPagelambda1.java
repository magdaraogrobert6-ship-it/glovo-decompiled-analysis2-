package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.ondevice.api.segment.Segment;

/* JADX INFO: loaded from: classes3.dex */
public final class populatePushStoryPagelambda1 implements Parcelable.Creator<Segment> {
    @Override // android.os.Parcelable.Creator
    public final Segment[] newArray(int i) {
        return new Segment[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Segment createFromParcel(Parcel parcel) {
        return new Segment(parcel);
    }
}
