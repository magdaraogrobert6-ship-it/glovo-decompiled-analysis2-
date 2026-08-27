package com.mapbox.navigation.base.road.model;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.api.directions.v5.models.MapboxShield;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class RoadComponent {
    public final String imageBaseUrl;
    public final String language;
    public final MapboxShield shield;
    public final String text;

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.language);
        MapboxShield mapboxShield = this.shield;
        int iHashCode = mapboxShield != null ? mapboxShield.hashCode() : 0;
        String str = this.imageBaseUrl;
        return ((iM + iHashCode) * 31) + (str != null ? str.hashCode() : 0);
    }

    public RoadComponent(String str, String str2, MapboxShield mapboxShield, String str3) {
        this.text = str;
        this.language = str2;
        this.shield = mapboxShield;
        this.imageBaseUrl = str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoadComponent(text='");
        sb.append(this.text);
        sb.append("', language='");
        sb.append(this.language);
        sb.append("', shield=");
        sb.append(this.shield);
        sb.append(", imageBaseUrl=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.imageBaseUrl, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!RoadComponent.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        RoadComponent roadComponent = (RoadComponent) obj;
        if (!this.text.equals(roadComponent.text) || !this.language.equals(roadComponent.language)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.shield, roadComponent.shield}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imageBaseUrl, roadComponent.imageBaseUrl}, getCieXyz.write())).booleanValue();
    }
}
