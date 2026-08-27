package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class ParkingRate implements Serializable {
    private final String maxStay;
    private final List<ParkingRatePrice> prices;
    private final List<ParkingRateTime> times;

    public String getMaxStay() {
        return this.maxStay;
    }

    public List<ParkingRatePrice> getPrices() {
        return this.prices;
    }

    public List<ParkingRateTime> getTimes() {
        return this.times;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.maxStay, this.times, this.prices);
    }

    public ParkingRate(String str, List<ParkingRateTime> list, List<ParkingRatePrice> list2) {
        this.maxStay = str;
        this.times = list;
        this.prices = list2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[maxStay: ");
        IconCompatParcelizer.read(sb, this.maxStay, ", times: ");
        IconCompatParcelizer.RemoteActionCompatParcelizer(sb, this.times, ", prices: ");
        return MediaSessionCompatQueueItem.read(this.prices, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParkingRate parkingRate = (ParkingRate) obj;
        return Objects.equals(this.maxStay, parkingRate.maxStay) && Objects.equals(this.times, parkingRate.times) && Objects.equals(this.prices, parkingRate.prices);
    }
}
