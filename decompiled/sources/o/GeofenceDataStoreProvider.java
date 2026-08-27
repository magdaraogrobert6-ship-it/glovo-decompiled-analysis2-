package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.usercontext.api.UserContext;

/* JADX INFO: loaded from: classes3.dex */
public final class GeofenceDataStoreProvider implements Parcelable.Creator<UserContext> {
    @Override // android.os.Parcelable.Creator
    public final UserContext[] newArray(int i) {
        return new UserContext[i];
    }

    @Override // android.os.Parcelable.Creator
    public final UserContext createFromParcel(Parcel parcel) {
        return new UserContext(parcel);
    }
}
