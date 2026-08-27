package com.incognia;

import android.location.Address;
import androidx.compose.ui.graphics.Fields;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class EventAddress {
    private final String addressLine;
    private final String city;
    private final String countryCode;
    private final String countryName;
    private final Double latitude;
    private final Locale locale;
    private final Double longitude;
    private final String neighborhood;
    private final String number;
    private final String postalCode;
    private final String state;
    private final String street;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class Builder {
        private String addressLine;
        private String city;
        private String countryCode;
        private String countryName;
        private Double latitude;
        private Locale locale;
        private Double longitude;
        private String neighborhood;
        private String number;
        private String postalCode;
        private String state;
        private String street;

        public final Builder addressLine(String str) {
            this.addressLine = str;
            return this;
        }

        public final Builder city(String str) {
            this.city = str;
            return this;
        }

        public final Builder countryCode(String str) {
            this.countryCode = str;
            return this;
        }

        public final Builder countryName(String str) {
            this.countryName = str;
            return this;
        }

        public final Builder latitude(Double d) {
            this.latitude = d;
            return this;
        }

        public final Builder locale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public final Builder longitude(Double d) {
            this.longitude = d;
            return this;
        }

        public final Builder neighborhood(String str) {
            this.neighborhood = str;
            return this;
        }

        public final Builder number(String str) {
            this.number = str;
            return this;
        }

        public final Builder postalCode(String str) {
            this.postalCode = str;
            return this;
        }

        public final Builder state(String str) {
            this.state = str;
            return this;
        }

        public final Builder street(String str) {
            this.street = str;
            return this;
        }

        public final EventAddress build() {
            return new EventAddress(this.locale, this.countryCode, this.countryName, this.state, this.city, this.neighborhood, this.number, this.street, this.postalCode, this.addressLine, this.latitude, this.longitude);
        }
    }

    public final Locale component1() {
        return this.locale;
    }

    public final String component10() {
        return this.addressLine;
    }

    public final Double component11() {
        return this.latitude;
    }

    public final Double component12() {
        return this.longitude;
    }

    public final String component2() {
        return this.countryCode;
    }

    public final String component3() {
        return this.countryName;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.city;
    }

    public final String component6() {
        return this.neighborhood;
    }

    public final String component7() {
        return this.number;
    }

    public final String component8() {
        return this.street;
    }

    public final String component9() {
        return this.postalCode;
    }

    public final String getAddressLine() {
        return this.addressLine;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getNeighborhood() {
        return this.neighborhood;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStreet() {
        return this.street;
    }

    public final EventAddress copy(Locale locale, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, Double d2) {
        return new EventAddress(locale, str, str2, str3, str4, str5, str6, str7, str8, str9, d, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventAddress)) {
            return false;
        }
        EventAddress eventAddress = (EventAddress) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.locale, eventAddress.locale}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryCode, eventAddress.countryCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countryName, eventAddress.countryName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.state, eventAddress.state}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.city, eventAddress.city}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.neighborhood, eventAddress.neighborhood}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.number, eventAddress.number}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.street, eventAddress.street}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.postalCode, eventAddress.postalCode}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addressLine, eventAddress.addressLine}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.latitude, eventAddress.latitude}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.longitude, eventAddress.longitude}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "EventAddress(locale=" + this.locale + ", countryCode=" + this.countryCode + ", countryName=" + this.countryName + ", state=" + this.state + ", city=" + this.city + ", neighborhood=" + this.neighborhood + ", number=" + this.number + ", street=" + this.street + ", postalCode=" + this.postalCode + ", addressLine=" + this.addressLine + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EventAddress(Address address) {
        Locale locale = address.getLocale();
        this(locale == null ? Locale.getDefault() : locale, address.getCountryCode(), address.getCountryName(), address.getAdminArea(), address.getLocality(), address.getSubLocality(), address.getSubThoroughfare(), address.getThoroughfare(), address.getPostalCode(), address.getAddressLine(0), Double.valueOf(address.getLatitude()), Double.valueOf(address.getLongitude()));
    }

    public int hashCode() {
        Locale locale = this.locale;
        int iHashCode = locale == null ? 0 : locale.hashCode();
        String str = this.countryCode;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.countryName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.state;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.city;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.neighborhood;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.number;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.street;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.postalCode;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.addressLine;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        Double d = this.latitude;
        int iHashCode11 = d == null ? 0 : d.hashCode();
        Double d2 = this.longitude;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (d2 != null ? d2.hashCode() : 0);
    }

    public EventAddress(Locale locale, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, Double d2) {
        this.locale = locale;
        this.countryCode = str;
        this.countryName = str2;
        this.state = str3;
        this.city = str4;
        this.neighborhood = str5;
        this.number = str6;
        this.street = str7;
        this.postalCode = str8;
        this.addressLine = str9;
        this.latitude = d;
        this.longitude = d2;
    }

    public /* synthetic */ EventAddress(Locale locale, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Double d, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : locale, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & Fields.SpotShadowColor) != 0 ? null : str7, (i & Fields.RotationX) != 0 ? null : str8, (i & Fields.RotationY) != 0 ? null : str9, (i & Fields.RotationZ) != 0 ? null : d, (i & Fields.CameraDistance) == 0 ? d2 : null);
    }

    public EventAddress(String str) {
        this(Locale.getDefault(), null, null, null, null, null, null, null, null, str, null, null, 3582, null);
    }

    public EventAddress(double d, double d2) {
        this(null, null, null, null, null, null, null, null, null, null, Double.valueOf(d), Double.valueOf(d2), 511, null);
    }

    public EventAddress() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
