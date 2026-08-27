package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.navigation.base.ExperimentalPreviewMapboxNavigationAPI;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@ExperimentalPreviewMapboxNavigationAPI
public final class SearchResultUsed {
    private final String address;
    private final HistoryPoint coordinates;
    private final String id;
    private final String name;
    private final String provider;
    private final List<HistoryRoutablePoint> routablePoint;

    public final String getAddress() {
        return this.address;
    }

    public final HistoryPoint getCoordinates() {
        return this.coordinates;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final List<HistoryRoutablePoint> getRoutablePoint() {
        return this.routablePoint;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.provider.hashCode() * 31, 31, this.id), 31, this.name), 31, this.address);
        int iHashCode = this.coordinates.hashCode();
        List<HistoryRoutablePoint> list = this.routablePoint;
        return ((iHashCode + iM) * 31) + (list != null ? list.hashCode() : 0);
    }

    public SearchResultUsed(String str, String str2, String str3, String str4, HistoryPoint historyPoint, List<HistoryRoutablePoint> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        historyPoint.getClass();
        this.provider = str;
        this.id = str2;
        this.name = str3;
        this.address = str4;
        this.coordinates = historyPoint;
        this.routablePoint = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SearchResultUsed(provider='");
        sb.append(this.provider);
        sb.append("', id='");
        sb.append(this.id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', address='");
        sb.append(this.address);
        sb.append("', coordinates=");
        sb.append(this.coordinates);
        sb.append(", routablePoint=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.routablePoint, ')');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchResultUsed.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchResultUsed searchResultUsed = (SearchResultUsed) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.provider, searchResultUsed.provider}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, searchResultUsed.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, searchResultUsed.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, searchResultUsed.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinates, searchResultUsed.coordinates}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routablePoint, searchResultUsed.routablePoint}, getCieXyz.write())).booleanValue();
    }
}
