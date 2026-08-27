package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public class ParkingRateInfo implements Serializable {
    private final String currencyCode;
    private final String currencySymbol;
    private final List<ParkingRate> rates;

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getCurrencySymbol() {
        return this.currencySymbol;
    }

    public List<ParkingRate> getRates() {
        return this.rates;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.currencySymbol, this.currencyCode, this.rates);
    }

    public ParkingRateInfo(String str, String str2, List<ParkingRate> list) {
        this.currencySymbol = str;
        this.currencyCode = str2;
        this.rates = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[currencySymbol: ");
        IconCompatParcelizer.read(sb, this.currencySymbol, ", currencyCode: ");
        IconCompatParcelizer.read(sb, this.currencyCode, ", rates: ");
        return MediaSessionCompatQueueItem.read(this.rates, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParkingRateInfo parkingRateInfo = (ParkingRateInfo) obj;
        return Objects.equals(this.currencySymbol, parkingRateInfo.currencySymbol) && Objects.equals(this.currencyCode, parkingRateInfo.currencyCode) && Objects.equals(this.rates, parkingRateInfo.rates);
    }
}
