package o;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getDirectionCenterEK5gGoQ {
    public static final ClassLoader write = getDirectionCenterEK5gGoQ.class.getClassLoader();

    public static boolean read(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static HashMap serializer(Parcel parcel) {
        return parcel.readHashMap(write);
    }

    public static void IconCompatParcelizer(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void write(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static Parcelable serializer(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void IconCompatParcelizer(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(c8$$ExternalSyntheticOutline0.m(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
