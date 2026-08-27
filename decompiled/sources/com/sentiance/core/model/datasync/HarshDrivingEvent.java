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
import o._get_isDelayedInitializationEnabled_lambda0;
import o.clearDataStoreData;
import o.clearSharedPreferencesData;
import o.getAlignmentLinesMap;
import o.onSuccess;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.setConfiguredCustomEndpointlambda00;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class HarshDrivingEvent extends GeneratedMessageLite implements setConfiguredCustomEndpointlambda00 {
    public static final int CONFIDENCE_MOTORCYCLE_PERCENT_FIELD_NUMBER = 6;
    public static final int CONFIDENCE_PERCENT_FIELD_NUMBER = 4;
    private static final HarshDrivingEvent DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    public static final int MAGNITUDE_MPS2_FIELD_NUMBER = 7;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int TYPE_MOTORCYCLE_FIELD_NUMBER = 5;
    public static final int WAYPOINTS_FIELD_NUMBER = 8;
    private int bitField0_;
    private int confidenceMotorcyclePercent_;
    private int confidencePercent_;
    private DateTime end_;
    private float magnitudeMps2_;
    private DateTime start_;
    private int typeMotorcycle_;
    private int type_;
    private onSuccess waypoints_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidenceMotorcyclePercent() {
        this.confidenceMotorcyclePercent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfidencePercent() {
        this.confidencePercent_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMagnitudeMps2() {
        this.magnitudeMps2_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeMotorcycle() {
        this.typeMotorcycle_ = 0;
    }

    public static HarshDrivingEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidenceMotorcyclePercent(int i) {
        this.confidenceMotorcyclePercent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfidencePercent(int i) {
        this.confidencePercent_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMagnitudeMps2(float f) {
        this.magnitudeMps2_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeMotorcycleValue(int i) {
        this.typeMotorcycle_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    public int getConfidenceMotorcyclePercent() {
        return this.confidenceMotorcyclePercent_;
    }

    public int getConfidencePercent() {
        return this.confidencePercent_;
    }

    public float getMagnitudeMps2() {
        return this.magnitudeMps2_;
    }

    public int getTypeMotorcycleValue() {
        return this.typeMotorcycle_;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public List<Waypoint> getWaypointsList() {
        return this.waypoints_;
    }

    public List<? extends _get_isDelayedInitializationEnabled_lambda0> getWaypointsOrBuilderList() {
        return this.waypoints_;
    }

    public boolean hasEnd() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStart() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        HarshDrivingEvent harshDrivingEvent = new HarshDrivingEvent();
        DEFAULT_INSTANCE = harshDrivingEvent;
        GeneratedMessageLite.registerDefaultInstance(HarshDrivingEvent.class, harshDrivingEvent);
    }

    public static clearDataStoreData newBuilder() {
        return (clearDataStoreData) DEFAULT_INSTANCE.createBuilder();
    }

    public static HarshDrivingEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HarshDrivingEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (clearSharedPreferencesData.write[methodToInvoke.ordinal()]) {
            case 1:
                return new HarshDrivingEvent();
            case 2:
                return new clearDataStoreData(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004\u0004\u0005\f\u0006\u0004\u0007\u0001\b\u001b", new Object[]{"bitField0_", "start_", "end_", "type_", "confidencePercent_", "typeMotorcycle_", "confidenceMotorcyclePercent_", "magnitudeMps2_", "waypoints_", Waypoint.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (HarshDrivingEvent.class) {
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

    public HarshDrivingEventType getType() {
        HarshDrivingEventType harshDrivingEventTypeForNumber = HarshDrivingEventType.forNumber(this.type_);
        return harshDrivingEventTypeForNumber == null ? HarshDrivingEventType.UNRECOGNIZED : harshDrivingEventTypeForNumber;
    }

    public HarshDrivingEventType getTypeMotorcycle() {
        HarshDrivingEventType harshDrivingEventTypeForNumber = HarshDrivingEventType.forNumber(this.typeMotorcycle_);
        return harshDrivingEventTypeForNumber == null ? HarshDrivingEventType.UNRECOGNIZED : harshDrivingEventTypeForNumber;
    }

    public Waypoint getWaypoints(int i) {
        return (Waypoint) this.waypoints_.get(i);
    }

    public int getWaypointsCount() {
        return this.waypoints_.size();
    }

    public _get_isDelayedInitializationEnabled_lambda0 getWaypointsOrBuilder(int i) {
        return (_get_isDelayedInitializationEnabled_lambda0) this.waypoints_.get(i);
    }

    private HarshDrivingEvent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWaypoints(Iterable<? extends Waypoint> iterable) {
        ensureWaypointsIsMutable();
        a.addAll((Iterable) iterable, (List) this.waypoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoints(Waypoint waypoint) {
        waypoint.getClass();
        ensureWaypointsIsMutable();
        this.waypoints_.add(waypoint);
    }

    private void ensureWaypointsIsMutable() {
        onSuccess onsuccess = this.waypoints_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.waypoints_ = GeneratedMessageLite.mutableCopy(onsuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEnd(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.end_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.end_ = dateTime;
        } else {
            this.end_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.end_, dateTime);
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStart(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.start_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.start_ = dateTime;
        } else {
            this.start_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.start_, dateTime);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWaypoints(int i) {
        ensureWaypointsIsMutable();
        this.waypoints_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnd(DateTime dateTime) {
        dateTime.getClass();
        this.end_ = dateTime;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStart(DateTime dateTime) {
        dateTime.getClass();
        this.start_ = dateTime;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWaypoints(int i, Waypoint waypoint) {
        waypoint.getClass();
        ensureWaypointsIsMutable();
        this.waypoints_.set(i, waypoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoints() {
        this.waypoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(HarshDrivingEventType harshDrivingEventType) {
        this.type_ = harshDrivingEventType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeMotorcycle(HarshDrivingEventType harshDrivingEventType) {
        this.typeMotorcycle_ = harshDrivingEventType.getNumber();
    }

    public DateTime getEnd() {
        DateTime dateTime = this.end_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public DateTime getStart() {
        DateTime dateTime = this.start_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public static clearDataStoreData newBuilder(HarshDrivingEvent harshDrivingEvent) {
        return (clearDataStoreData) DEFAULT_INSTANCE.createBuilder(harshDrivingEvent);
    }

    public static HarshDrivingEvent parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static HarshDrivingEvent parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static HarshDrivingEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static HarshDrivingEvent parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoints(int i, Waypoint waypoint) {
        waypoint.getClass();
        ensureWaypointsIsMutable();
        this.waypoints_.add(i, waypoint);
    }

    public static HarshDrivingEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HarshDrivingEvent parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static HarshDrivingEvent parseFrom(InputStream inputStream) throws IOException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HarshDrivingEvent parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static HarshDrivingEvent parseFrom(u uVar) throws IOException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static HarshDrivingEvent parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (HarshDrivingEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
