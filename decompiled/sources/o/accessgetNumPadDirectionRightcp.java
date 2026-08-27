package o;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetNumPadDirectionRightcp extends getAvReceiverInputEK5gGoQ {
    public abstract void IconCompatParcelizer(Status status);

    public accessgetNumPadDirectionRightcp() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // o.getAvReceiverInputEK5gGoQ
    public final boolean IconCompatParcelizer(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) getBEK5gGoQ.RemoteActionCompatParcelizer(parcel, Status.CREATOR);
        getBEK5gGoQ.RemoteActionCompatParcelizer(parcel);
        IconCompatParcelizer(status);
        return true;
    }
}
