package com.roadrunner.delivery.destination.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import com.roadrunner.delivery.common.data.model.tasks.Reason$$ExternalSyntheticLambda0;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.Serializable;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.getCieXyz;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class DestinationLocation implements Parcelable {
    private static int IconCompatParcelizer = 1;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final String caption;
    public final double latitude;
    public final double longitude;
    public final VehicleType vehicleType;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DestinationLocation> CREATOR = new SearchResult.Creator(8);
    public static final onViewDetachedFromWindowlambda1[] $childSerializers = {null, null, null, LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new Reason$$ExternalSyntheticLambda0(25))};

    public static final class Companion {
        private static int RemoteActionCompatParcelizer = 0;
        private static int read = 1;

        public final setGraphicModalMaxWidthDp serializer() {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 27;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            DestinationLocation$$serializer destinationLocation$$serializer = DestinationLocation$$serializer.RemoteActionCompatParcelizer;
            int i4 = read + 37;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return destinationLocation$$serializer;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 69;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 73;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return i4;
    }

    static {
        int i = write + 89;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public /* synthetic */ DestinationLocation(int i, double d, double d2, String str, VehicleType vehicleType) {
        Object obj = null;
        if (11 == (i & 11)) {
            this.latitude = d;
            this.longitude = d2;
            if ((i & 4) == 0) {
                this.caption = null;
            } else {
                this.caption = str;
                int i2 = IconCompatParcelizer + 111;
                serializer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i3 = 4 / 2;
                } else {
                    int i4 = 2 % 2;
                }
            }
            this.vehicleType = vehicleType;
            int i5 = IconCompatParcelizer + 23;
            serializer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(i, 11, DestinationLocation$$serializer.RemoteActionCompatParcelizer.getDescriptor());
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 13;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeString(this.caption);
        parcel.writeString(this.vehicleType.name());
        int i5 = serializer + 69;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 103;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iRemoteActionCompatParcelizer = r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.longitude, Double.hashCode(this.latitude) * 31, 31);
        String str = this.caption;
        if (str == null) {
            int i4 = serializer + 31;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return this.vehicleType.hashCode() + ((iRemoteActionCompatParcelizer + iHashCode) * 31);
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
        int i2 = IconCompatParcelizer + 87;
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
        int i4 = serializer + 81;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return string;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = serializer + 5;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (obj instanceof DestinationLocation) {
            DestinationLocation destinationLocation = (DestinationLocation) obj;
            if (Double.compare(this.latitude, destinationLocation.latitude) != 0 || Double.compare(this.longitude, destinationLocation.longitude) != 0) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.caption, destinationLocation.caption}, getCieXyz.write())).booleanValue() && this.vehicleType == destinationLocation.vehicleType;
        }
        int i3 = IconCompatParcelizer + 99;
        serializer = i3 % Fields.SpotShadowColor;
        return i3 % 2 != 0;
    }
}
