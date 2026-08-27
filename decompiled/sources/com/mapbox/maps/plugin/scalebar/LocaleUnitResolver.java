package com.mapbox.maps.plugin.scalebar;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LocaleUnitResolver {
    public static boolean isMetricSystem() {
        String country = Locale.getDefault().getCountry();
        country.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = country.toUpperCase(locale);
        upperCase.getClass();
        int iHashCode = upperCase.hashCode();
        if (iHashCode == 2438) {
            return !upperCase.equals("LR");
        }
        if (iHashCode != 2464) {
            return (iHashCode == 2718 && upperCase.equals("US")) ? false : true;
        }
        return !upperCase.equals("MM");
    }
}
