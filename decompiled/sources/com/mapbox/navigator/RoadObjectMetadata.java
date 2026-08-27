package com.mapbox.navigator;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public class RoadObjectMetadata {
    private Type type;
    private Object value;

    public enum Type {
        INCIDENT_INFO,
        TUNNEL_INFO,
        BORDER_CROSSING_INFO,
        TOLL_COLLECTION_INFO,
        SERVICE_AREA_INFO,
        RAILWAY_CROSSING_INFO,
        IC_INFO,
        JCT_INFO,
        NOTIFICATION_INFO,
        MERGING_AREA_INFO
    }

    public Type getTypeInfo() {
        return this.type;
    }

    public static RoadObjectMetadata valueOf(IncidentInfo incidentInfo) {
        return new RoadObjectMetadata(incidentInfo);
    }

    public boolean isBorderCrossingInfo() {
        return this.type == Type.BORDER_CROSSING_INFO;
    }

    public boolean isIcInfo() {
        return this.type == Type.IC_INFO;
    }

    public boolean isIncidentInfo() {
        return this.type == Type.INCIDENT_INFO;
    }

    public boolean isJctInfo() {
        return this.type == Type.JCT_INFO;
    }

    public boolean isMergingAreaInfo() {
        return this.type == Type.MERGING_AREA_INFO;
    }

    public boolean isNotificationInfo() {
        return this.type == Type.NOTIFICATION_INFO;
    }

    public boolean isRailwayCrossingInfo() {
        return this.type == Type.RAILWAY_CROSSING_INFO;
    }

    public boolean isServiceAreaInfo() {
        return this.type == Type.SERVICE_AREA_INFO;
    }

    public boolean isTollCollectionInfo() {
        return this.type == Type.TOLL_COLLECTION_INFO;
    }

    public boolean isTunnelInfo() {
        return this.type == Type.TUNNEL_INFO;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public RoadObjectMetadata(IncidentInfo incidentInfo) {
        this.type = Type.INCIDENT_INFO;
        this.value = incidentInfo;
    }

    public static RoadObjectMetadata valueOf(TunnelInfo tunnelInfo) {
        return new RoadObjectMetadata(tunnelInfo);
    }

    public BorderCrossingInfo getBorderCrossingInfo() {
        if (isBorderCrossingInfo()) {
            return (BorderCrossingInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (BorderCrossingInfo)");
        return null;
    }

    public IcInfo getIcInfo() {
        if (isIcInfo()) {
            return (IcInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (IcInfo)");
        return null;
    }

    public IncidentInfo getIncidentInfo() {
        if (isIncidentInfo()) {
            return (IncidentInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (IncidentInfo)");
        return null;
    }

    public JctInfo getJctInfo() {
        if (isJctInfo()) {
            return (JctInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (JctInfo)");
        return null;
    }

    public MergingAreaInfo getMergingAreaInfo() {
        if (isMergingAreaInfo()) {
            return (MergingAreaInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (MergingAreaInfo)");
        return null;
    }

    public NotificationInfo getNotificationInfo() {
        if (isNotificationInfo()) {
            return (NotificationInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (NotificationInfo)");
        return null;
    }

    public RailwayCrossingInfo getRailwayCrossingInfo() {
        if (isRailwayCrossingInfo()) {
            return (RailwayCrossingInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (RailwayCrossingInfo)");
        return null;
    }

    public ServiceAreaInfo getServiceAreaInfo() {
        if (isServiceAreaInfo()) {
            return (ServiceAreaInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (ServiceAreaInfo)");
        return null;
    }

    public TollCollectionInfo getTollCollectionInfo() {
        if (isTollCollectionInfo()) {
            return (TollCollectionInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (TollCollectionInfo)");
        return null;
    }

    public TunnelInfo getTunnelInfo() {
        if (isTunnelInfo()) {
            return (TunnelInfo) this.value;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("The content of the variant does not have type (TunnelInfo)");
        return null;
    }

    public static RoadObjectMetadata valueOf(BorderCrossingInfo borderCrossingInfo) {
        return new RoadObjectMetadata(borderCrossingInfo);
    }

    public static RoadObjectMetadata valueOf(TollCollectionInfo tollCollectionInfo) {
        return new RoadObjectMetadata(tollCollectionInfo);
    }

    public static RoadObjectMetadata valueOf(ServiceAreaInfo serviceAreaInfo) {
        return new RoadObjectMetadata(serviceAreaInfo);
    }

    public RoadObjectMetadata(TunnelInfo tunnelInfo) {
        this.type = Type.TUNNEL_INFO;
        this.value = tunnelInfo;
    }

    public static RoadObjectMetadata valueOf(RailwayCrossingInfo railwayCrossingInfo) {
        return new RoadObjectMetadata(railwayCrossingInfo);
    }

    public static RoadObjectMetadata valueOf(IcInfo icInfo) {
        return new RoadObjectMetadata(icInfo);
    }

    public static RoadObjectMetadata valueOf(JctInfo jctInfo) {
        return new RoadObjectMetadata(jctInfo);
    }

    public RoadObjectMetadata(BorderCrossingInfo borderCrossingInfo) {
        this.type = Type.BORDER_CROSSING_INFO;
        this.value = borderCrossingInfo;
    }

    public static RoadObjectMetadata valueOf(NotificationInfo notificationInfo) {
        return new RoadObjectMetadata(notificationInfo);
    }

    public static RoadObjectMetadata valueOf(MergingAreaInfo mergingAreaInfo) {
        return new RoadObjectMetadata(mergingAreaInfo);
    }

    public RoadObjectMetadata(TollCollectionInfo tollCollectionInfo) {
        this.type = Type.TOLL_COLLECTION_INFO;
        this.value = tollCollectionInfo;
    }

    public RoadObjectMetadata(ServiceAreaInfo serviceAreaInfo) {
        this.type = Type.SERVICE_AREA_INFO;
        this.value = serviceAreaInfo;
    }

    public RoadObjectMetadata(RailwayCrossingInfo railwayCrossingInfo) {
        this.type = Type.RAILWAY_CROSSING_INFO;
        this.value = railwayCrossingInfo;
    }

    public RoadObjectMetadata(IcInfo icInfo) {
        this.type = Type.IC_INFO;
        this.value = icInfo;
    }

    public RoadObjectMetadata(JctInfo jctInfo) {
        this.type = Type.JCT_INFO;
        this.value = jctInfo;
    }

    public RoadObjectMetadata(NotificationInfo notificationInfo) {
        this.type = Type.NOTIFICATION_INFO;
        this.value = notificationInfo;
    }

    public RoadObjectMetadata(MergingAreaInfo mergingAreaInfo) {
        this.type = Type.MERGING_AREA_INFO;
        this.value = mergingAreaInfo;
    }
}
