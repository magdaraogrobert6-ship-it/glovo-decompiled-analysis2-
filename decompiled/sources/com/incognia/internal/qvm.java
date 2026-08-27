package com.incognia.internal;

import android.location.Address;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class qvm {
    public static U9 BGx(Address address) {
        double latitude = address.getLatitude();
        double longitude = address.getLongitude();
        return new U9(Double.valueOf(latitude), Double.valueOf(longitude), address.getThoroughfare(), address.getSubThoroughfare(), address.getSubLocality(), address.getLocality(), address.getSubAdminArea(), address.getAdminArea(), address.getPostalCode(), address.getCountryName(), address.getCountryCode(), address.getAddressLine(0), address.getLocale() != null ? address.getLocale() : Locale.getDefault());
    }
}
