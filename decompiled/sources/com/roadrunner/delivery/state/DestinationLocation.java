package com.roadrunner.delivery.state;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.access700;
import o.getCieXyz;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DestinationLocation implements Parcelable {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 0;
    private static int write = 1;
    public final String caption;
    public final double latitude;
    public final double longitude;
    public final VehicleType vehicleType;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DestinationLocation> CREATOR = new access700(6);
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new MapComponent$$ExternalSyntheticLambda0(12))};

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 1;
        private static int read;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = read + 3;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            DestinationLocation$$serializer destinationLocation$$serializer = DestinationLocation$$serializer.write;
            int i4 = RemoteActionCompatParcelizer + 117;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return destinationLocation$$serializer;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 69;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return 0;
    }

    static {
        int i = IconCompatParcelizer + 123;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final double RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.longitude;
        }
        int i3 = 37 / 0;
        return this.longitude;
    }

    public final String read() {
        String str;
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 77;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            str = this.caption;
            int i4 = 78 / 0;
        } else {
            str = this.caption;
        }
        int i5 = i2 + 43;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final double serializer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 + 107;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        double d = this.latitude;
        int i5 = i2 + 47;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return d;
    }

    public final VehicleType write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 5;
        int i3 = i2 % Fields.SpotShadowColor;
        serializer = i3;
        int i4 = i2 % 2;
        VehicleType vehicleType = this.vehicleType;
        int i5 = i3 + 23;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return vehicleType;
    }

    public /* synthetic */ DestinationLocation(int i, double d, double d2, String str, VehicleType vehicleType) {
        if (11 != (i & 11)) {
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 11, DestinationLocation$$serializer.write.getDescriptor());
            throw null;
        }
        this.latitude = d;
        this.longitude = d2;
        if ((i & 4) == 0) {
            this.caption = null;
            int i2 = RemoteActionCompatParcelizer + 31;
            serializer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
            }
            this.vehicleType = vehicleType;
            int i3 = serializer + 107;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
        }
        this.caption = str;
        int i5 = 2 % 2;
        this.vehicleType = vehicleType;
        int i6 = serializer + 107;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 95;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeString(this.caption);
        parcel.writeString(this.vehicleType.name());
        int i5 = serializer + 31;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 107;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        String str = this.caption;
        if (str == null) {
            int i5 = serializer;
            int i6 = i5 + 7;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = i5 + 47;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i10 = RemoteActionCompatParcelizer + 41;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i = iHashCode;
        }
        return this.vehicleType.hashCode() + ((iRemoteActionCompatParcelizer + i) * 31);
    }

    public DestinationLocation(double d, double d2, String str, VehicleType vehicleType) {
        vehicleType.getClass();
        this.latitude = d;
        this.longitude = d2;
        this.caption = str;
        this.vehicleType = vehicleType;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 119;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(this.latitude, "DestinationLocation(latitude=", ", longitude=");
        sbM.append(this.longitude);
        sbM.append(", caption=");
        sbM.append(this.caption);
        sbM.append(", vehicleType=");
        sbM.append(this.vehicleType);
        sbM.append(")");
        String string = sbM.toString();
        int i4 = RemoteActionCompatParcelizer + 43;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (!(obj instanceof DestinationLocation)) {
                return false;
            }
            DestinationLocation destinationLocation = (DestinationLocation) obj;
            if (Double.compare(this.latitude, destinationLocation.latitude) == 0) {
                if (Double.compare(this.longitude, destinationLocation.longitude) != 0) {
                    int i2 = serializer + 113;
                    RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 != 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.caption, destinationLocation.caption}, getCieXyz.write())).booleanValue() && this.vehicleType == destinationLocation.vehicleType;
            }
            int i3 = serializer + 55;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            return i3 % 2 == 0;
        }
        int i4 = serializer + 121;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return true;
    }
}
