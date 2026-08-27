package com.mapbox.navigator;

/* JADX INFO: loaded from: classes3.dex */
public enum RoadObjectType {
    INCIDENT("Incident"),
    TOLL_COLLECTION_POINT("TollCollectionPoint"),
    BORDER_CROSSING("BorderCrossing"),
    TUNNEL("Tunnel"),
    RESTRICTED_AREA("RestrictedArea"),
    SERVICE_AREA("ServiceArea"),
    BRIDGE("Bridge"),
    RAILWAY_CROSSING("RailwayCrossing"),
    JCT("Jct"),
    IC("Ic"),
    CUSTOM("Custom"),
    NOTIFICATION("Notification"),
    MERGING_AREA("MergingArea");

    private String str;

    private int getValue() {
        return ordinal();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.str;
    }

    RoadObjectType(String str) {
        this.str = str;
    }
}
