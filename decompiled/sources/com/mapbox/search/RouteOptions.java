package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@Reserved
public final class RouteOptions implements Parcelable {
    public static final Parcelable.Creator<RouteOptions> CREATOR = new EtaType.Creator(4);
    public final Deviation deviation;
    public final List route;

    @Reserved
    public static abstract class Deviation implements Parcelable {

        @Reserved
        public static final class SarType implements Parcelable {
            public static final Parcelable.Creator<SarType> CREATOR = new Creator();
            public final String rawName;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            static {
                new SarType("isochrone");
            }

            public final int hashCode() {
                return this.rawName.hashCode();
            }

            public SarType(String str) {
                str.getClass();
                this.rawName = str;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.rawName);
            }

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SarType[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new SarType(parcel.readString());
                }
            }

            public final String toString() {
                return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SarType(rawName='"), this.rawName, "')");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!SarType.class.equals(obj != null ? obj.getClass() : null)) {
                    return false;
                }
                obj.getClass();
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rawName, ((SarType) obj).rawName}, getCieXyz.write())).booleanValue();
            }
        }

        @Reserved
        public static final class Time extends Deviation {
            public static final Parcelable.Creator<Time> CREATOR = new Creator();
            public final SarType sarType;
            public final TimeUnit unit;
            public final long value;

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final int hashCode() {
                int iHashCode = Long.hashCode(this.value);
                int iHashCode2 = this.unit.hashCode();
                SarType sarType = this.sarType;
                return ((iHashCode2 + (iHashCode * 31)) * 31) + (sarType != null ? sarType.rawName.hashCode() : 0);
            }

            public Time(long j, TimeUnit timeUnit, SarType sarType) {
                timeUnit.getClass();
                this.value = j;
                this.unit = timeUnit;
                this.sarType = sarType;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeLong(this.value);
                parcel.writeString(this.unit.name());
                SarType sarType = this.sarType;
                if (sarType == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(sarType.rawName);
                }
            }

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Time[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Time(parcel.readLong(), TimeUnit.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SarType.CREATOR.createFromParcel(parcel));
                }
            }

            public final String toString() {
                return "Time(value=" + this.value + ", unit=" + this.unit + ", sarType=" + this.sarType + ')';
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!Time.class.equals(obj != null ? obj.getClass() : null)) {
                    return false;
                }
                obj.getClass();
                Time time = (Time) obj;
                if (this.value != time.value || this.unit != time.unit) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sarType, time.sarType}, getCieXyz.write())).booleanValue();
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.deviation.hashCode() + (this.route.hashCode() * 31);
    }

    public RouteOptions(List list, Deviation deviation) {
        deviation.getClass();
        this.route = list;
        this.deviation = deviation;
        if (list.size() > 1) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Route should contain at least 2 points!");
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.route;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            parcel.writeSerializable((Serializable) it.next());
        }
        parcel.writeParcelable(this.deviation, i);
    }

    public final String toString() {
        return "RouteOptions(route=" + this.route + ", deviation=" + this.deviation + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RouteOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RouteOptions routeOptions = (RouteOptions) obj;
        if (!this.route.equals(routeOptions.route)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.deviation, routeOptions.deviation}, getCieXyz.write())).booleanValue();
    }
}
