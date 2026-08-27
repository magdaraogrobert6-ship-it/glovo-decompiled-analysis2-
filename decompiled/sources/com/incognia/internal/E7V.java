package com.incognia.internal;

import android.location.Location;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public final class E7V {
    public static Integer BGx(Location location) throws Throwable {
        Throwable th;
        Parcel parcelObtain;
        Parcel parcel = null;
        if (XUh.BGx(XUh.BGx, 31, 0, 2) && location != null) {
            try {
                Location location2 = new Location(location);
                location2.setProvider(null);
                parcelObtain = Parcel.obtain();
                try {
                    location2.writeToParcel(parcelObtain, 0);
                    parcelObtain.setDataPosition(0);
                    parcelObtain.readString();
                    int i = parcelObtain.readInt();
                    parcelObtain.recycle();
                    return Integer.valueOf(i);
                } catch (Exception unused) {
                    if (parcelObtain != null) {
                        parcelObtain.recycle();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    parcel = parcelObtain;
                    if (parcel == null) {
                        throw th;
                    }
                    parcel.recycle();
                    throw th;
                }
            } catch (Exception unused2) {
                parcelObtain = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return null;
    }
}
