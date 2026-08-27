package o;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.d$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMinusEK5gGoQ {
    public static final /* synthetic */ int IconCompatParcelizer = 0;

    static {
        getMinusEK5gGoQ.class.getClassLoader();
    }

    public static void IconCompatParcelizer(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static Parcelable read(Parcel parcel, Parcelable.Creator creator) {
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
