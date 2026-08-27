package o;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getAppSwitchEK5gGoQ {
    public static final /* synthetic */ int write = 0;

    static {
        getAppSwitchEK5gGoQ.class.getClassLoader();
    }

    public static Parcelable RemoteActionCompatParcelizer(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void serializer(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(d$$ExternalSyntheticOutline0.m(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
        }
    }
}
