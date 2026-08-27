package com.sentiance.sdk.tile.store;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.util.BoundingBox;
import java.lang.reflect.Array;
import java.util.Arrays;
import o.DataStoreProviderl;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new DataStoreProviderl();
    private final double[][] IconCompatParcelizer;
    private final BoundingBox write;

    public final BoundingBox IconCompatParcelizer() {
        return this.write;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final double[][] read() {
        return this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.IconCompatParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        double[][] dArr = this.IconCompatParcelizer;
        parcel.writeInt(dArr.length);
        for (double[] dArr2 : dArr) {
            parcel.writeIntArray(new int[]{(int) (dArr2[0] * 1000000.0d), (int) (dArr2[1] * 1000000.0d)});
        }
    }

    public c(Parcel parcel) {
        int i = parcel.readInt();
        this.IconCompatParcelizer = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, 2);
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = new int[2];
            parcel.readIntArray(iArr);
            double[] dArr = this.IconCompatParcelizer[i2];
            dArr[0] = ((double) iArr[0]) / 1000000.0d;
            dArr[1] = ((double) iArr[1]) / 1000000.0d;
        }
        this.write = BoundingBox.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.deepEquals(this.IconCompatParcelizer, ((c) obj).IconCompatParcelizer);
    }

    public c(double[][] dArr) {
        this.IconCompatParcelizer = dArr;
        this.write = BoundingBox.IconCompatParcelizer(dArr);
    }
}
