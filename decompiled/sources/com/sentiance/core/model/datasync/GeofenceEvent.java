package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.DelayedInitializationAnalyticsBehavior;
import o.InAppMessageEvent;
import o.SweepGradientShader9KIMszodefault;
import o._get_isDisabled_lambda2;
import o._set_outboundNetworkRequestsOffline_lambda0;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.isDisabledannotations;
import o.onSuccess;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.shouldAllowSingletonInitializationlambda2;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class GeofenceEvent extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final GeofenceEvent DEFAULT_INSTANCE;
    public static final int GEOFENCES_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int TIME_FIELD_NUMBER = 3;
    public static final int TRIGGERING_WAYPOINT_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int bitField0_;
    private onSuccess geofences_ = GeneratedMessageLite.emptyProtobufList();
    private DateTime time_;
    private Waypoint triggeringWaypoint_;
    private int type_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTime() {
        this.time_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringWaypoint() {
        this.triggeringWaypoint_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static GeofenceEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    public List<Geofence> getGeofencesList() {
        return this.geofences_;
    }

    public List<? extends shouldAllowSingletonInitializationlambda2> getGeofencesOrBuilderList() {
        return this.geofences_;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTriggeringWaypoint() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        GeofenceEvent geofenceEvent = new GeofenceEvent();
        DEFAULT_INSTANCE = geofenceEvent;
        GeneratedMessageLite.registerDefaultInstance(GeofenceEvent.class, geofenceEvent);
    }

    public static _set_outboundNetworkRequestsOffline_lambda0 newBuilder() {
        return (_set_outboundNetworkRequestsOffline_lambda0) DEFAULT_INSTANCE.createBuilder();
    }

    public static GeofenceEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GeofenceEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeofenceEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (_get_isDisabled_lambda2.read[methodToInvoke.ordinal()]) {
            case 1:
                return new GeofenceEvent();
            case 2:
                return new _set_outboundNetworkRequestsOffline_lambda0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "geofences_", Geofence.class, "type_", "time_", "triggeringWaypoint_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (GeofenceEvent.class) {
                    r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = PARSER;
                    if (r8lambdaxuhu5lvqisjsccdg7c1_hbvwri == null) {
                        r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = new r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI();
                        PARSER = r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                    }
                    break;
                }
                return r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public Geofence getGeofences(int i) {
        return (Geofence) this.geofences_.get(i);
    }

    public int getGeofencesCount() {
        return this.geofences_.size();
    }

    public shouldAllowSingletonInitializationlambda2 getGeofencesOrBuilder(int i) {
        return (shouldAllowSingletonInitializationlambda2) this.geofences_.get(i);
    }

    public GeofenceEventType getType() {
        GeofenceEventType geofenceEventTypeForNumber = GeofenceEventType.forNumber(this.type_);
        return geofenceEventTypeForNumber == null ? GeofenceEventType.UNRECOGNIZED : geofenceEventTypeForNumber;
    }

    private GeofenceEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllGeofences(Iterable<? extends Geofence> iterable) {
        ensureGeofencesIsMutable();
        a.addAll((Iterable) iterable, (List) this.geofences_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeofences(Geofence geofence) {
        geofence.getClass();
        ensureGeofencesIsMutable();
        this.geofences_.add(geofence);
    }

    private void ensureGeofencesIsMutable() {
        onSuccess onsuccess = this.geofences_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.geofences_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTime(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.time_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.time_ = dateTime;
        } else {
            this.time_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.time_, dateTime);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTriggeringWaypoint(Waypoint waypoint) {
        waypoint.getClass();
        Waypoint waypoint2 = this.triggeringWaypoint_;
        if (waypoint2 == null || waypoint2 == Waypoint.getDefaultInstance()) {
            this.triggeringWaypoint_ = waypoint;
        } else {
            isDisabledannotations isdisabledannotationsNewBuilder = Waypoint.newBuilder(this.triggeringWaypoint_);
            isdisabledannotationsNewBuilder.serializer(waypoint);
            this.triggeringWaypoint_ = (Waypoint) isdisabledannotationsNewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeGeofences(int i) {
        ensureGeofencesIsMutable();
        this.geofences_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeofences(int i, Geofence geofence) {
        geofence.getClass();
        ensureGeofencesIsMutable();
        this.geofences_.set(i, geofence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTime(DateTime dateTime) {
        dateTime.getClass();
        this.time_ = dateTime;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringWaypoint(Waypoint waypoint) {
        waypoint.getClass();
        this.triggeringWaypoint_ = waypoint;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeofences() {
        this.geofences_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(GeofenceEventType geofenceEventType) {
        this.type_ = geofenceEventType.getNumber();
    }

    public DateTime getTime() {
        DateTime dateTime = this.time_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public Waypoint getTriggeringWaypoint() {
        Waypoint waypoint = this.triggeringWaypoint_;
        return waypoint == null ? Waypoint.getDefaultInstance() : waypoint;
    }

    public static _set_outboundNetworkRequestsOffline_lambda0 newBuilder(GeofenceEvent geofenceEvent) {
        return (_set_outboundNetworkRequestsOffline_lambda0) DEFAULT_INSTANCE.createBuilder(geofenceEvent);
    }

    public static GeofenceEvent parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeofenceEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GeofenceEvent parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static GeofenceEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GeofenceEvent parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGeofences(int i, Geofence geofence) {
        geofence.getClass();
        ensureGeofencesIsMutable();
        this.geofences_.add(i, geofence);
    }

    public static GeofenceEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GeofenceEvent parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static GeofenceEvent parseFrom(InputStream inputStream) throws IOException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeofenceEvent parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GeofenceEvent parseFrom(u uVar) throws IOException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static GeofenceEvent parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeofenceEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
