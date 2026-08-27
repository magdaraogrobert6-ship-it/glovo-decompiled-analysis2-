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
public final class HistorySearchResult {
    private final String address;
    private final HistoryPoint coordinates;
    private final String id;
    private final String name;
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

    public final List<HistoryRoutablePoint> getRoutablePoint() {
        return this.routablePoint;
    }

    public int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name), 31, this.address);
        HistoryPoint historyPoint = this.coordinates;
        int iHashCode = historyPoint != null ? historyPoint.hashCode() : 0;
        List<HistoryRoutablePoint> list = this.routablePoint;
        return ((iM + iHashCode) * 31) + (list != null ? list.hashCode() : 0);
    }

    public HistorySearchResult(String str, String str2, String str3, HistoryPoint historyPoint, List<HistoryRoutablePoint> list) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.address = str3;
        this.coordinates = historyPoint;
        this.routablePoint = list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HistorySearchResult(id='");
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
        if (!HistorySearchResult.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        HistorySearchResult historySearchResult = (HistorySearchResult) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, historySearchResult.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, historySearchResult.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, historySearchResult.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinates, historySearchResult.coordinates}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routablePoint, historySearchResult.routablePoint}, getCieXyz.write())).booleanValue();
    }
}
