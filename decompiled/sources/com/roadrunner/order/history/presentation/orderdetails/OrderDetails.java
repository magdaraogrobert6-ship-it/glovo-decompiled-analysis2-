package com.roadrunner.order.history.presentation.orderdetails;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import o.RealImageLoader;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.setLatLng;
import o.slot;
import o.styleScaling;
import o.updatePulsingUi;
import o.updateStyle;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class OrderDetails implements Parcelable {
    public static final Parcelable.Creator<OrderDetails> CREATOR = new updatePulsingUi();
    private static int IconCompatParcelizer = 0;
    private static int read = 0;
    private static int serializer = 1;
    private static int write = 1;
    private final String confirmationNumber;
    private final Customer customer;
    private final long deliveryId;
    private final List<Item> orderItems;
    private final Vendor vendor;
    private final int vendorOrderNumber;

    @Keep
    public static final class Address implements Parcelable {
        public static final Parcelable.Creator<Address> CREATOR = new slot();
        private static int IconCompatParcelizer = 1;
        private static int RemoteActionCompatParcelizer = 0;
        private static int serializer = 0;
        private static int write = 1;
        private final LatLong coordinate;
        private final String formattedAddress;
        private final String specialInstructions;

        @Keep
        public static final class LatLong implements Parcelable {
            public static final Parcelable.Creator<LatLong> CREATOR = new styleScaling();
            private static int IconCompatParcelizer = 0;
            private static int read = 1;
            private static int serializer = 1;
            private static int write;
            private final double latitude;
            private final double longitude;

            @Override // android.os.Parcelable
            public final int describeContents() {
                int i = 2 % 2;
                int i2 = read;
                int i3 = i2 + 47;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                int i5 = i2 + 87;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return 0;
                }
                throw null;
            }

            static {
                int i = write + 43;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i2 = 51 / 0;
                }
            }

            public final double component1() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 13;
                int i3 = i2 % Fields.SpotShadowColor;
                read = i3;
                int i4 = i2 % 2;
                double d = this.latitude;
                int i5 = i3 + 85;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return d;
            }

            public final double component2() {
                double d;
                int i = 2 % 2;
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 75;
                read = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    d = this.longitude;
                    int i4 = 45 / 0;
                } else {
                    d = this.longitude;
                }
                int i5 = i2 + 107;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return d;
            }

            public final double getLatitude() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 77;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                double d = this.latitude;
                int i5 = i2 + 3;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = 1 / 0;
                }
                return d;
            }

            public final double getLongitude() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer;
                int i3 = i2 + 5;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                double d = this.longitude;
                int i5 = i2 + 77;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return d;
            }

            public LatLong(double d, double d2) {
                this.latitude = d;
                this.longitude = d2;
            }

            public final LatLong copy(double d, double d2) {
                int i = 2 % 2;
                LatLong latLong = new LatLong(d, d2);
                int i2 = read + 55;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 82 / 0;
                }
                return latLong;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                int i2 = 2 % 2;
                int i3 = read + 5;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                parcel.getClass();
                parcel.writeDouble(this.latitude);
                parcel.writeDouble(this.longitude);
                int i5 = read + 41;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 17 / 0;
                }
            }

            public int hashCode() {
                int iHashCode;
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 85;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    iHashCode = Double.hashCode(this.longitude) % (Double.hashCode(this.latitude) >>> 80);
                } else {
                    iHashCode = Double.hashCode(this.longitude) + (Double.hashCode(this.latitude) * 31);
                }
                int i3 = IconCompatParcelizer + 85;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return iHashCode;
            }

            public static /* synthetic */ LatLong copy$default(LatLong latLong, double d, double d2, int i, Object obj) {
                int i2 = 2 % 2;
                int i3 = read + 19;
                int i4 = i3 % Fields.SpotShadowColor;
                IconCompatParcelizer = i4;
                if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
                    int i5 = i4 + 119;
                    read = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    d = latLong.latitude;
                    int i7 = i4 + 15;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                if ((i & 2) != 0) {
                    int i9 = i4 + 105;
                    read = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    d2 = latLong.longitude;
                }
                return latLong.copy(d, d2);
            }

            public String toString() {
                int i = 2 % 2;
                int i2 = read + 115;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                String strM = ff$$ExternalSyntheticOutline0.m(this.longitude, ")", af$$ExternalSyntheticOutline0.m(this.latitude, "LatLong(latitude=", ", longitude="));
                int i4 = IconCompatParcelizer + 75;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return strM;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public boolean equals(Object obj) {
                int i = 2 % 2;
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LatLong)) {
                    return false;
                }
                LatLong latLong = (LatLong) obj;
                if (Double.compare(this.latitude, latLong.latitude) == 0) {
                    if (Double.compare(this.longitude, latLong.longitude) == 0) {
                        return true;
                    }
                    int i2 = IconCompatParcelizer + 51;
                    read = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = read + 109;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = serializer + 23;
            write = i2 % Fields.SpotShadowColor;
            return 1 ^ (i2 % 2 == 0 ? 0 : 1);
        }

        static {
            int i = RemoteActionCompatParcelizer + 83;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = write + 125;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return this.formattedAddress;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final LatLong component2() {
            LatLong latLong;
            int i = 2 % 2;
            int i2 = write + 115;
            int i3 = i2 % Fields.SpotShadowColor;
            serializer = i3;
            if (i2 % 2 != 0) {
                latLong = this.coordinate;
                int i4 = 84 / 0;
            } else {
                latLong = this.coordinate;
            }
            int i5 = i3 + 37;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return latLong;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = serializer + 95;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.specialInstructions;
            }
            throw null;
        }

        public final LatLong getCoordinate() {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 59;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            LatLong latLong = this.coordinate;
            int i5 = i2 + 117;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return latLong;
        }

        public final String getFormattedAddress() {
            int i = 2 % 2;
            int i2 = serializer + 81;
            int i3 = i2 % Fields.SpotShadowColor;
            write = i3;
            if (i2 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.formattedAddress;
            int i4 = i3 + 113;
            serializer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 88 / 0;
            }
            return str;
        }

        public final String getSpecialInstructions() {
            int i = 2 % 2;
            int i2 = serializer + 69;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.specialInstructions;
            }
            int i3 = 28 / 0;
            return this.specialInstructions;
        }

        public Address(String str, LatLong latLong, String str2) {
            this.formattedAddress = str;
            this.coordinate = latLong;
            this.specialInstructions = str2;
        }

        public final Address copy(String str, LatLong latLong, String str2) {
            int i = 2 % 2;
            Address address = new Address(str, latLong, str2);
            int i2 = serializer + 95;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return address;
        }

        public static /* synthetic */ Address copy$default(Address address, String str, LatLong latLong, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = serializer + 85;
                write = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                str = address.formattedAddress;
            }
            if ((i & 2) != 0) {
                int i5 = write;
                int i6 = i5 + 77;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                LatLong latLong2 = address.coordinate;
                int i8 = i5 + 113;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                latLong = latLong2;
            }
            if ((i & 4) != 0) {
                str2 = address.specialInstructions;
            }
            return address.copy(str, latLong, str2);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = write + 59;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.formattedAddress);
            LatLong latLong = this.coordinate;
            if (latLong == null) {
                int i5 = serializer + 7;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                latLong.writeToParcel(parcel, i);
            }
            parcel.writeString(this.specialInstructions);
            int i7 = serializer + 109;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                throw null;
            }
        }

        public String toString() {
            int i = 2 % 2;
            String str = this.formattedAddress;
            LatLong latLong = this.coordinate;
            String str2 = this.specialInstructions;
            StringBuilder sb = new StringBuilder("Address(formattedAddress=");
            sb.append(str);
            sb.append(", coordinate=");
            sb.append(latLong);
            sb.append(", specialInstructions=");
            String strM = ff$$ExternalSyntheticOutline0.m(sb, str2, ")");
            int i2 = serializer + 33;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return strM;
            }
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            int i2 = write + 111;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            String str = this.formattedAddress;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            LatLong latLong = this.coordinate;
            if (latLong == null) {
                int i4 = serializer + 95;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                iHashCode = 0;
            } else {
                iHashCode = latLong.hashCode();
            }
            String str2 = this.specialInstructions;
            return (((iHashCode2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = write + 55;
                serializer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            if (obj instanceof Address) {
                Address address = (Address) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.formattedAddress, address.formattedAddress}, getCieXyz.write())).booleanValue()) {
                    return false;
                }
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinate, address.coordinate}, getCieXyz.write())).booleanValue()) {
                    return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.specialInstructions, address.specialInstructions}, getCieXyz.write())).booleanValue();
                }
                int i4 = serializer + 121;
                int i5 = i4 % Fields.SpotShadowColor;
                write = i5;
                int i6 = i4 % 2;
                int i7 = i5 + 47;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return false;
            }
            int i9 = serializer + 25;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            return false;
        }
    }

    @Keep
    public static final class Customer implements Parcelable {
        public static final Parcelable.Creator<Customer> CREATOR = new setLatLng();
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 0;
        private static int serializer = 1;
        private final Address dropOffAddress;
        private final String name;
        private final String phoneNumber;

        public static /* synthetic */ void getPhoneNumber$annotations() {
            int i = 2 % 2;
            int i2 = read + 43;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = read + 63;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return 0;
        }

        static {
            int i = IconCompatParcelizer + 75;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 23;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.name;
            int i5 = i2 + 11;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 109;
            int i3 = i2 % Fields.SpotShadowColor;
            read = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            String str = this.phoneNumber;
            int i4 = i3 + 33;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return str;
        }

        public final Address component3() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 7;
            int i3 = i2 % Fields.SpotShadowColor;
            read = i3;
            int i4 = i2 % 2;
            Address address = this.dropOffAddress;
            int i5 = i3 + 115;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return address;
        }

        public final Address getDropOffAddress() {
            int i = 2 % 2;
            int i2 = read + 9;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            Address address = this.dropOffAddress;
            int i5 = i3 + 33;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return address;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 125;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.name;
            int i5 = i2 + 41;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return str;
        }

        public final String getPhoneNumber() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 115;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return this.phoneNumber;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Customer(String str, String str2, Address address) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.phoneNumber = str2;
            this.dropOffAddress = address;
        }

        public final Customer copy(String str, String str2, Address address) {
            int i = 2 % 2;
            str.getClass();
            str2.getClass();
            Customer customer = new Customer(str, str2, address);
            int i2 = read + 79;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return customer;
        }

        public static /* synthetic */ Customer copy$default(Customer customer, String str, String str2, Address address, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = RemoteActionCompatParcelizer + 57;
                read = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                str = customer.name;
            }
            if ((i & 2) != 0) {
                int i5 = read + 57;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    str2 = customer.phoneNumber;
                    int i6 = 28 / 0;
                } else {
                    str2 = customer.phoneNumber;
                }
            }
            if ((i & 4) != 0) {
                int i7 = read + 19;
                int i8 = i7 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i8;
                if (i7 % 2 == 0) {
                    address = customer.dropOffAddress;
                    int i9 = 43 / 0;
                } else {
                    address = customer.dropOffAddress;
                }
                int i10 = i8 + 93;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            return customer.copy(str, str2, address);
        }

        public int hashCode() {
            int iHashCode;
            int i;
            int i2 = 2 % 2;
            int iM = af$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.phoneNumber);
            Address address = this.dropOffAddress;
            if (address == null) {
                int i3 = read + 37;
                int i4 = i3 % Fields.SpotShadowColor;
                RemoteActionCompatParcelizer = i4;
                iHashCode = i3 % 2 == 0 ? 1 : 0;
                i = i4 + 61;
            } else {
                iHashCode = address.hashCode();
                i = RemoteActionCompatParcelizer + 5;
            }
            read = i % Fields.SpotShadowColor;
            int i5 = i % 2;
            return iM + iHashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = read + 39;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.phoneNumber);
            Address address = this.dropOffAddress;
            if (address == null) {
                int i5 = RemoteActionCompatParcelizer + 55;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
            int i7 = RemoteActionCompatParcelizer + 75;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Customer(name=" + this.name + ", phoneNumber=REDACTED, dropOffAddress=" + this.dropOffAddress + ")";
            int i2 = read + 119;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return str;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            if (this != obj) {
                if (obj instanceof Customer) {
                    Customer customer = (Customer) obj;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, customer.name}, getCieXyz.write())).booleanValue()) {
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.phoneNumber, customer.phoneNumber}, getCieXyz.write())).booleanValue()) {
                            return false;
                        }
                        return !(((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.dropOffAddress, customer.dropOffAddress}, getCieXyz.write())).booleanValue() ^ true);
                    }
                    int i2 = read + 63;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    int i3 = i2 % 2;
                    return false;
                }
                int i4 = read + 69;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return false;
            }
            int i6 = read + 3;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return true;
        }
    }

    @Keep
    public static final class Item implements Parcelable {
        public static final Parcelable.Creator<Item> CREATOR = new RealImageLoader();
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 0;
        private static int write = 1;
        private final String description;
        private final float quantity;

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = read + 83;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return 0;
        }

        static {
            int i = write + 61;
            IconCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float component1() {
            int i = 2 % 2;
            int i2 = read + 125;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            float f = this.quantity;
            int i5 = i3 + 59;
            read = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return f;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = read;
            int i3 = i2 + 21;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.description;
            int i4 = i2 + 103;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return str;
        }

        public final String getDescription() {
            int i = 2 % 2;
            int i2 = read + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.description;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final float getQuantity() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 79;
            read = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return this.quantity;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Item(float f, String str) {
            str.getClass();
            this.quantity = f;
            this.description = str;
        }

        public final Item copy(float f, String str) {
            int i = 2 % 2;
            str.getClass();
            Item item = new Item(f, str);
            int i2 = RemoteActionCompatParcelizer + 53;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return item;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer + 47;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeFloat(this.quantity);
            parcel.writeString(this.description);
            int i5 = read + 79;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                throw null;
            }
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = read + 45;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int iHashCode = this.description.hashCode() + (Float.hashCode(this.quantity) * 31);
            int i4 = RemoteActionCompatParcelizer + 73;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return iHashCode;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Item copy$default(Item item, float f, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = read + 7;
            int i4 = i3 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i4;
            if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
                f = item.quantity;
            }
            if ((i & 2) != 0) {
                int i5 = i4 + 89;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    str = item.description;
                    int i6 = 16 / 0;
                } else {
                    str = item.description;
                }
                int i7 = i4 + 41;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            }
            return item.copy(f, str);
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Item(quantity=" + this.quantity + ", description=" + this.description + ")";
            int i2 = read + 83;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 48 / 0;
            }
            return str;
        }

        public boolean equals(Object obj) {
            int i = 2 % 2;
            if (this == obj) {
                int i2 = RemoteActionCompatParcelizer + 19;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return true;
            }
            if (!(obj instanceof Item)) {
                int i4 = read + 43;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 32 / 0;
                }
                return false;
            }
            Item item = (Item) obj;
            if (Float.compare(this.quantity, item.quantity) != 0) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.description, item.description}, getCieXyz.write())).booleanValue();
        }
    }

    @Keep
    public static final class Vendor implements Parcelable {
        public static final Parcelable.Creator<Vendor> CREATOR = new updateStyle();
        private static int RemoteActionCompatParcelizer = 1;
        private static int read = 1;
        private static int serializer;
        private static int write;
        private final String name;
        private final String phoneNumber;
        private final Address pickUpAddress;

        public static /* synthetic */ void getPhoneNumber$annotations() {
            int i = 2 % 2;
            int i2 = serializer + 33;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = 77 / 0;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer;
            int i3 = i2 + 103;
            serializer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            int i5 = i2 + 25;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        static {
            int i = write + 91;
            read = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 101;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            String str = this.name;
            int i5 = i2 + 47;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = serializer;
            int i3 = i2 + 91;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            Object obj = null;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.phoneNumber;
            int i4 = i2 + 65;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        public final Address component3() {
            int i = 2 % 2;
            int i2 = serializer + 123;
            int i3 = i2 % Fields.SpotShadowColor;
            RemoteActionCompatParcelizer = i3;
            int i4 = i2 % 2;
            Address address = this.pickUpAddress;
            int i5 = i3 + 65;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return address;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getName() {
            int i = 2 % 2;
            int i2 = serializer + 27;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.name;
            }
            int i3 = 6 / 0;
            return this.name;
        }

        public final String getPhoneNumber() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 49;
            int i3 = i2 % Fields.SpotShadowColor;
            serializer = i3;
            if (i2 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.phoneNumber;
            int i4 = i3 + 93;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return str;
        }

        public final Address getPickUpAddress() {
            int i = 2 % 2;
            int i2 = serializer + 115;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return this.pickUpAddress;
            }
            int i3 = 36 / 0;
            return this.pickUpAddress;
        }

        public Vendor(String str, String str2, Address address) {
            str.getClass();
            str2.getClass();
            this.name = str;
            this.phoneNumber = str2;
            this.pickUpAddress = address;
        }

        public final Vendor copy(String str, String str2, Address address) {
            int i = 2 % 2;
            str.getClass();
            str2.getClass();
            Vendor vendor = new Vendor(str, str2, address);
            int i2 = RemoteActionCompatParcelizer + 71;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                return vendor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static /* synthetic */ Vendor copy$default(Vendor vendor, String str, String str2, Address address, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = RemoteActionCompatParcelizer;
            int i4 = i3 + 95;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 59;
                int i7 = i6 % Fields.SpotShadowColor;
                serializer = i7;
                int i8 = i6 % 2;
                String str3 = vendor.name;
                int i9 = i7 + 103;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                str = str3;
            }
            if ((i & 2) != 0) {
                str2 = vendor.phoneNumber;
            }
            if ((i & 4) != 0) {
                int i11 = serializer + 97;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    address = vendor.pickUpAddress;
                } else {
                    Address address2 = vendor.pickUpAddress;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return vendor.copy(str, str2, address);
        }

        public int hashCode() {
            int i;
            int i2 = 2 % 2;
            int iM = af$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.phoneNumber);
            Address address = this.pickUpAddress;
            if (address == null) {
                int i3 = serializer + 105;
                RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                i = 0;
            } else {
                int iHashCode = address.hashCode();
                int i5 = RemoteActionCompatParcelizer + 67;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i = iHashCode;
            }
            return iM + i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2 = 2 % 2;
            int i3 = serializer + 97;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            parcel.getClass();
            parcel.writeString(this.name);
            parcel.writeString(this.phoneNumber);
            Address address = this.pickUpAddress;
            if (address == null) {
                int i5 = RemoteActionCompatParcelizer + 5;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            address.writeToParcel(parcel, i);
            int i7 = RemoteActionCompatParcelizer + 85;
            serializer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Vendor(name=" + this.name + ", phoneNumber=REDACTED, pickUpAddress=" + this.pickUpAddress + ")";
            int i2 = serializer + 45;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        
            if ((r22 instanceof com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor) != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        
            r1 = (com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor) r22;
            r12 = new java.lang.Object[]{r21.name, r1.name};
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r12, o.getCieXyz.write())).booleanValue() != false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
        
            r1 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.serializer + 125;
            com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        
            if ((r1 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            r19 = new java.lang.Object[]{r21.phoneNumber, r1.phoneNumber};
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0084, code lost:
        
            r1 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.serializer + 39;
            com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        
            r19 = new java.lang.Object[]{r21.pickUpAddress, r1.pickUpAddress};
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
        
            if (((java.lang.Boolean) o.removeNodeAtDepth.RemoteActionCompatParcelizer(o.getCieXyz.write(), 1803334089, -1803334089, o.getCieXyz.write(), o.getCieXyz.write(), r19, o.getCieXyz.write())).booleanValue() != false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r21 == r22) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        
            return true;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean equals(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r2 = 2
                int r3 = r2 % r2
                int r3 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.RemoteActionCompatParcelizer
                int r3 = r3 + 9
                int r4 = r3 % 128
                com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.serializer = r4
                int r3 = r3 % r2
                r4 = 1
                r5 = 0
                if (r3 == 0) goto L1a
                r3 = 28
                int r3 = r3 / r5
                if (r0 != r1) goto L1d
                goto L1c
            L1a:
                if (r0 != r1) goto L1d
            L1c:
                return r4
            L1d:
                boolean r3 = r1 instanceof com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor
                if (r3 != 0) goto L22
                return r5
            L22:
                com.roadrunner.order.history.presentation.orderdetails.OrderDetails$Vendor r1 = (com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor) r1
                java.lang.String r3 = r0.name
                java.lang.String r6 = r1.name
                java.lang.Object[] r12 = new java.lang.Object[]{r3, r6}
                int r7 = o.getCieXyz.write()
                int r11 = o.getCieXyz.write()
                int r13 = o.getCieXyz.write()
                int r10 = o.getCieXyz.write()
                r3 = 1803334089(0x6b7cb1c9, float:3.0548887E26)
                r6 = -1803334089(0xffffffff94834e37, float:-1.325847E-26)
                r8 = r3
                r9 = r6
                java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r7, r8, r9, r10, r11, r12, r13)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L5d
                int r1 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.serializer
                int r1 = r1 + 125
                int r3 = r1 % 128
                com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.RemoteActionCompatParcelizer = r3
                int r1 = r1 % r2
                if (r1 != 0) goto L5c
                return r4
            L5c:
                return r5
            L5d:
                java.lang.String r7 = r0.phoneNumber
                java.lang.String r8 = r1.phoneNumber
                java.lang.Object[] r19 = new java.lang.Object[]{r7, r8}
                int r14 = o.getCieXyz.write()
                int r18 = o.getCieXyz.write()
                int r20 = o.getCieXyz.write()
                int r17 = o.getCieXyz.write()
                r15 = r3
                r16 = r6
                java.lang.Object r7 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 != 0) goto L8e
                int r1 = com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.serializer
                int r1 = r1 + 39
                int r3 = r1 % 128
                com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.RemoteActionCompatParcelizer = r3
                int r1 = r1 % r2
                return r5
            L8e:
                com.roadrunner.order.history.presentation.orderdetails.OrderDetails$Address r2 = r0.pickUpAddress
                com.roadrunner.order.history.presentation.orderdetails.OrderDetails$Address r1 = r1.pickUpAddress
                java.lang.Object[] r19 = new java.lang.Object[]{r2, r1}
                int r14 = o.getCieXyz.write()
                int r18 = o.getCieXyz.write()
                int r20 = o.getCieXyz.write()
                int r17 = o.getCieXyz.write()
                r15 = r3
                r16 = r6
                java.lang.Object r1 = o.removeNodeAtDepth.RemoteActionCompatParcelizer(r14, r15, r16, r17, r18, r19, r20)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto Lb6
                return r5
            Lb6:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.order.history.presentation.orderdetails.OrderDetails.Vendor.equals(java.lang.Object):boolean");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 13;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return 0;
    }

    static {
        int i = IconCompatParcelizer + 79;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final long component1() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 51;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        long j = this.deliveryId;
        int i5 = i2 + 19;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = write + 69;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.confirmationNumber;
        }
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 121;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.vendorOrderNumber;
        int i6 = i2 + 45;
        write = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return i5;
    }

    public final Vendor component4() {
        int i = 2 % 2;
        int i2 = read + 107;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.vendor;
        }
        throw null;
    }

    public final Customer component5() {
        int i = 2 % 2;
        int i2 = read + 95;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.customer;
        }
        int i3 = 9 / 0;
        return this.customer;
    }

    public final List<Item> component6() {
        int i = 2 % 2;
        int i2 = write + 77;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.orderItems;
        }
        int i3 = 34 / 0;
        return this.orderItems;
    }

    public final String getConfirmationNumber() {
        int i = 2 % 2;
        int i2 = write + 45;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.confirmationNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Customer getCustomer() {
        int i = 2 % 2;
        int i2 = read + 87;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return this.customer;
        }
        throw null;
    }

    public final long getDeliveryId() {
        int i = 2 % 2;
        int i2 = read + 39;
        int i3 = i2 % Fields.SpotShadowColor;
        write = i3;
        int i4 = i2 % 2;
        long j = this.deliveryId;
        int i5 = i3 + 65;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return j;
    }

    public final List<Item> getOrderItems() {
        int i = 2 % 2;
        int i2 = write + 21;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        int i4 = i2 % 2;
        List<Item> list = this.orderItems;
        int i5 = i3 + 113;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final Vendor getVendor() {
        int i = 2 % 2;
        int i2 = write + 95;
        int i3 = i2 % Fields.SpotShadowColor;
        read = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Vendor vendor = this.vendor;
        int i4 = i3 + 105;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return vendor;
        }
        obj.hashCode();
        throw null;
    }

    public final int getVendorOrderNumber() {
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 + 71;
        read = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.vendorOrderNumber;
        int i5 = i2 + 9;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public OrderDetails(long j, String str, int i, Vendor vendor, Customer customer, List<Item> list) {
        str.getClass();
        vendor.getClass();
        customer.getClass();
        list.getClass();
        this.deliveryId = j;
        this.confirmationNumber = str;
        this.vendorOrderNumber = i;
        this.vendor = vendor;
        this.customer = customer;
        this.orderItems = list;
    }

    public final OrderDetails copy(long j, String str, int i, Vendor vendor, Customer customer, List<Item> list) {
        int i2 = 2 % 2;
        str.getClass();
        vendor.getClass();
        customer.getClass();
        list.getClass();
        OrderDetails orderDetails = new OrderDetails(j, str, i, vendor, customer, list);
        int i3 = read + 25;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return orderDetails;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = write + 103;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(this.vendorOrderNumber, af$$ExternalSyntheticOutline0.m(Long.hashCode(this.deliveryId) * 31, 31, this.confirmationNumber), 31);
        int iHashCode = this.vendor.hashCode();
        int iHashCode2 = this.orderItems.hashCode() + ((this.customer.hashCode() + ((iHashCode + iM) * 31)) * 31);
        int i4 = write + 59;
        read = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return iHashCode2;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderDetails copy$default(OrderDetails orderDetails, long j, String str, int i, Vendor vendor, Customer customer, List list, int i2, Object obj) {
        String str2;
        List list2;
        int i3 = 2 % 2;
        long j2 = (i2 & 1) != 0 ? orderDetails.deliveryId : j;
        if ((i2 & 2) != 0) {
            str2 = orderDetails.confirmationNumber;
            int i4 = read + 89;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 3 % 5;
            }
        } else {
            str2 = str;
        }
        int i6 = (i2 & 4) != 0 ? orderDetails.vendorOrderNumber : i;
        Vendor vendor2 = (i2 & 8) != 0 ? orderDetails.vendor : vendor;
        Customer customer2 = (i2 & 16) != 0 ? orderDetails.customer : customer;
        if ((i2 & 32) != 0) {
            int i7 = read + 93;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            list2 = orderDetails.orderItems;
        } else {
            list2 = list;
        }
        return orderDetails.copy(j2, str2, i6, vendor2, customer2, list2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = read + 11;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeLong(this.deliveryId);
        parcel.writeString(this.confirmationNumber);
        parcel.writeInt(this.vendorOrderNumber);
        this.vendor.writeToParcel(parcel, i);
        this.customer.writeToParcel(parcel, i);
        List<Item> list = this.orderItems;
        parcel.writeInt(list.size());
        Iterator<Item> it = list.iterator();
        while (!(!it.hasNext())) {
            int i5 = read + 71;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                it.next().writeToParcel(parcel, i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(parcel, i);
        }
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = read + 63;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        long j = this.deliveryId;
        String str = this.confirmationNumber;
        int i4 = this.vendorOrderNumber;
        Vendor vendor = this.vendor;
        Customer customer = this.customer;
        List<Item> list = this.orderItems;
        StringBuilder sb = getBitmapFromCache.read("OrderDetails(deliveryId=", ", confirmationNumber=", j, str);
        sb.append(", vendorOrderNumber=");
        sb.append(i4);
        sb.append(", vendor=");
        sb.append(vendor);
        sb.append(", customer=");
        sb.append(customer);
        sb.append(", orderItems=");
        sb.append(list);
        sb.append(")");
        String string = sb.toString();
        int i5 = read + 77;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = read;
        int i3 = i2 + 63;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderDetails)) {
            return false;
        }
        OrderDetails orderDetails = (OrderDetails) obj;
        Object obj2 = null;
        if (this.deliveryId != orderDetails.deliveryId) {
            int i5 = i2 + 87;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                return false;
            }
            obj2.hashCode();
            throw null;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.confirmationNumber, orderDetails.confirmationNumber}, getCieXyz.write())).booleanValue()) {
            int i6 = write + 1;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (this.vendorOrderNumber != orderDetails.vendorOrderNumber) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.vendor, orderDetails.vendor}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.customer, orderDetails.customer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.orderItems, orderDetails.orderItems}, getCieXyz.write())).booleanValue();
        }
        int i7 = write + 19;
        read = i7 % Fields.SpotShadowColor;
        return i7 % 2 != 0;
    }
}
