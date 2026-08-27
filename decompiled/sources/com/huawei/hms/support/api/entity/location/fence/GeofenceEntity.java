package com.huawei.hms.support.api.entity.location.fence;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.FieldType$$ExternalSyntheticBUOutline0;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.Geofence;

/* JADX INFO: loaded from: classes4.dex */
public class GeofenceEntity implements Parcelable, Geofence, IMessageEntity {
    private static final int CONVERSIONS_MAX = 7;
    public static final Parcelable.Creator<GeofenceEntity> CREATOR = new yn();
    private static final double DEFAULT_LATITUDE_MAX = 90.0d;
    private static final double DEFAULT_LATITUDE_MIN = -90.0d;
    private static final double DEFAULT_LONGITUDE_MAX = 180.0d;
    private static final double DEFAULT_LONGITUDE_MIN = -180.0d;
    private static final float DEFAULT_RADIUS = 0.0f;
    private static final int DEFAULT_UNIQUE_ID_LENGTH_MAX = 100;

    @Packed
    private int conversions;

    @Packed
    private int dwellDelayTime;

    @Packed
    private double latitude;

    @Packed
    private double longitude;

    @Packed
    private int notificationInterval;

    @Packed
    private float radius;

    @Packed
    private String uniqueId;

    @Packed
    private long validDuration;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.location.Geofence
    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final class yn implements Parcelable.Creator<GeofenceEntity> {
        @Override // android.os.Parcelable.Creator
        public final GeofenceEntity[] newArray(int i) {
            return new GeofenceEntity[i];
        }

        @Override // android.os.Parcelable.Creator
        public final GeofenceEntity createFromParcel(Parcel parcel) {
            return new GeofenceEntity(parcel, null);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.uniqueId);
        parcel.writeInt(this.conversions);
        parcel.writeLong(this.validDuration);
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeFloat(this.radius);
        parcel.writeInt(this.notificationInterval);
        parcel.writeInt(this.dwellDelayTime);
    }

    public GeofenceEntity(String str, int i, double d, double d2, float f, long j, int i2, int i3) {
        this.dwellDelayTime = -1;
        if (TextUtils.isEmpty(str) || str.length() > 100) {
            throw new IllegalArgumentException(TextUtils.isEmpty(str) ? "uniqueId is null" : "uniqueId is too long: ".concat(str));
        }
        if (f <= 0.0f) {
            FieldType$$ExternalSyntheticBUOutline0.read(f, "invalid radius: ");
            throw null;
        }
        if (d > 90.0d || d < -90.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid latitude");
            throw null;
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid longitude");
            throw null;
        }
        if ((i & 7) == 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "invalid conversions: "));
            throw null;
        }
        this.uniqueId = str;
        this.latitude = d;
        this.longitude = d2;
        this.radius = f;
        this.validDuration = j;
        this.conversions = i;
        this.notificationInterval = i2;
        this.dwellDelayTime = i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeofenceEntity{uniqueId='");
        sb.append(this.uniqueId);
        sb.append("', conversions=");
        sb.append(this.conversions);
        sb.append(", validDuration=");
        sb.append(this.validDuration);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", notificationInterval=");
        sb.append(this.notificationInterval);
        sb.append(", dwellDelayTime=");
        return af$$ExternalSyntheticOutline0.m(sb, this.dwellDelayTime, '}');
    }

    public /* synthetic */ GeofenceEntity(Parcel parcel, yn ynVar) {
        this(parcel);
    }

    private GeofenceEntity(Parcel parcel) {
        this.dwellDelayTime = -1;
        this.uniqueId = parcel.readString();
        this.conversions = parcel.readInt();
        this.validDuration = parcel.readLong();
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.radius = parcel.readFloat();
        this.notificationInterval = parcel.readInt();
        this.dwellDelayTime = parcel.readInt();
    }
}
