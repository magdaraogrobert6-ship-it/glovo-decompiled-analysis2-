package com.mapbox.search.common.parking;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.annotation.MapboxExperimental;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@MapboxExperimental
public abstract class ParkingRateValue implements Parcelable {

    public static final class CustomDurationValue extends ParkingRateValue {
        public static final Parcelable.Creator<CustomDurationValue> CREATOR = new Creator();
        public final String value;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public CustomDurationValue(String str) {
            str.getClass();
            this.value = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.value);
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomDurationValue[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CustomDurationValue(parcel.readString());
            }
        }

        public final String toString() {
            return ff$$ExternalSyntheticOutline0.m(new StringBuilder("CustomDurationValue(value='"), this.value, "')");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!CustomDurationValue.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((CustomDurationValue) obj).value}, getCieXyz.write())).booleanValue();
        }
    }

    public static final class IsoValue extends ParkingRateValue {
        public static final Parcelable.Creator<IsoValue> CREATOR = new Creator();
        public final String value;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public IsoValue(String str) {
            str.getClass();
            this.value = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.value);
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IsoValue[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new IsoValue(parcel.readString());
            }
        }

        public final String toString() {
            return ff$$ExternalSyntheticOutline0.m(new StringBuilder("IsoValue(value='"), this.value, "')");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!IsoValue.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            obj.getClass();
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((IsoValue) obj).value}, getCieXyz.write())).booleanValue();
        }
    }
}
