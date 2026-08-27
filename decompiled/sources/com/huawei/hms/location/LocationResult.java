package com.huawei.hms.location;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.location.common.LocationJsonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public class LocationResult implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<LocationResult> CREATOR = new yn();
    private static final String EXTRA_KEY = "com.huawei.hms.location.EXTRA_LOCATION_RESULT";
    private static final String TAG = "LocationResult";

    @Packed
    private List<HWLocation> locations;

    public final class yn implements Parcelable.Creator<LocationResult> {
        @Override // android.os.Parcelable.Creator
        public final LocationResult[] newArray(int i) {
            return new LocationResult[i];
        }

        @Override // android.os.Parcelable.Creator
        public final LocationResult createFromParcel(Parcel parcel) {
            return new LocationResult(parcel);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<HWLocation> getHWLocationList() {
        return this.locations;
    }

    public static LocationResult create(List<HWLocation> list) {
        return new LocationResult(list);
    }

    public final HWLocation getLastHWLocation() {
        int size = this.locations.size();
        if (size == 0) {
            return null;
        }
        return this.locations.get(size - 1);
    }

    public final Location getLastLocation() {
        int size = this.locations.size();
        if (size == 0) {
            return null;
        }
        return LocationJsonUtil.convertLocation(this.locations.get(size - 1));
    }

    public final List<Location> getLocations() {
        ArrayList arrayList = new ArrayList();
        Iterator<HWLocation> it = this.locations.iterator();
        while (it.hasNext()) {
            Location locationConvertLocation = LocationJsonUtil.convertLocation(it.next());
            if (locationConvertLocation != null) {
                arrayList.add(locationConvertLocation);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return Objects.hash(this.locations);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.locations);
    }

    public LocationResult(Parcel parcel) {
        this.locations = parcel.createTypedArrayList(HWLocation.CREATOR);
    }

    public static boolean hasResult(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            return intent.hasExtra(EXTRA_KEY);
        } catch (Exception unused) {
            return false;
        }
    }

    public String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("LocationResult{locations="), (List) this.locations, '}');
    }

    public static LocationResult extractResult(Intent intent) {
        if (intent == null) {
            return null;
        }
        try {
            if (!intent.hasExtra(EXTRA_KEY)) {
                return null;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra(EXTRA_KEY);
            if (parcelableExtra instanceof LocationResult) {
                return (LocationResult) parcelableExtra;
            }
            if (!(parcelableExtra instanceof Bundle)) {
                return null;
            }
            Bundle bundle = (Bundle) parcelableExtra;
            if (bundle.getParcelable(EXTRA_KEY) != null) {
                return (LocationResult) bundle.getParcelable(EXTRA_KEY);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.locations, ((LocationResult) obj).locations);
    }

    public LocationResult(List<HWLocation> list) {
        this.locations = list;
    }
}
