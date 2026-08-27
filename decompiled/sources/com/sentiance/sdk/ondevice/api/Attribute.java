package com.sentiance.sdk.ondevice.api;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.sentiance.sdk.DontObfuscate;
import o.r8lambdaOjxGQ2KAKi6yqipEZlqYQGp4WgU;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class Attribute implements Parcelable {
    public static final Parcelable.Creator<Attribute> CREATOR = new r8lambdaOjxGQ2KAKi6yqipEZlqYQGp4WgU();
    private final String mName;
    private final double mValue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.mName;
    }

    public double getValue() {
        return this.mValue;
    }

    public int hashCode() {
        int iHashCode = this.mName.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.mValue);
        return (iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeDouble(this.mValue);
    }

    public Attribute(Parcel parcel) {
        this.mName = parcel.readString();
        this.mValue = parcel.readDouble();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Attribute{name='");
        sb.append(this.mName);
        sb.append("', value=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.mValue, '}');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        if (Double.compare(attribute.mValue, this.mValue) != 0) {
            return false;
        }
        return this.mName.equals(attribute.mName);
    }

    public Attribute(String str, double d) {
        this.mName = str;
        this.mValue = d;
    }
}
