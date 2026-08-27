package com.incognia.internal;

import com.incognia.EventAddress;

/* JADX INFO: loaded from: classes2.dex */
public final class yo {
    public static U9 BGx(EventAddress eventAddress) {
        if (eventAddress == null) {
            return null;
        }
        return new U9(eventAddress.getLatitude(), eventAddress.getLongitude(), eventAddress.getStreet(), eventAddress.getNumber(), eventAddress.getNeighborhood(), eventAddress.getCity(), null, eventAddress.getState(), eventAddress.getPostalCode(), eventAddress.getCountryName(), eventAddress.getCountryCode(), eventAddress.getAddressLine(), eventAddress.getLocale());
    }
}
