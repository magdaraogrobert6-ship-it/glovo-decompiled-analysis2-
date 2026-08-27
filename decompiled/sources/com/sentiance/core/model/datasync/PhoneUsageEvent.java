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
import o.disableDelayedInitializationlambda1;
import o.disableSdklambda1;
import o.getAlignmentLinesMap;
import o.onSuccess;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.shouldAllowSingletonInitializationlambda1;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneUsageEvent extends GeneratedMessageLite implements shouldAllowSingletonInitializationlambda1 {
    private static final PhoneUsageEvent DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 2;
    public static final int IS_CALL_IN_PROGRESS_FIELD_NUMBER = 4;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int START_FIELD_NUMBER = 1;
    public static final int WAYPOINTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private DateTime end_;
    private boolean isCallInProgress_;
    private DateTime start_;
    private onSuccess waypoints_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnd() {
        this.end_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStart() {
        this.start_ = null;
        this.bitField0_ &= -2;
    }

    public static PhoneUsageEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean getIsCallInProgress() {
        return this.isCallInProgress_;
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

    public boolean hasIsCallInProgress() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasStart() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        PhoneUsageEvent phoneUsageEvent = new PhoneUsageEvent();
        DEFAULT_INSTANCE = phoneUsageEvent;
        GeneratedMessageLite.registerDefaultInstance(PhoneUsageEvent.class, phoneUsageEvent);
    }

    public static disableSdklambda1 newBuilder() {
        return (disableSdklambda1) DEFAULT_INSTANCE.createBuilder();
    }

    public static PhoneUsageEvent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PhoneUsageEvent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (disableDelayedInitializationlambda1.read[methodToInvoke.ordinal()]) {
            case 1:
                return new PhoneUsageEvent();
            case 2:
                return new disableSdklambda1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004ဇ\u0002", new Object[]{"bitField0_", "start_", "end_", "waypoints_", Waypoint.class, "isCallInProgress_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (PhoneUsageEvent.class) {
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

    public Waypoint getWaypoints(int i) {
        return (Waypoint) this.waypoints_.get(i);
    }

    public int getWaypointsCount() {
        return this.waypoints_.size();
    }

    public _get_isDelayedInitializationEnabled_lambda0 getWaypointsOrBuilder(int i) {
        return (_get_isDelayedInitializationEnabled_lambda0) this.waypoints_.get(i);
    }

    private PhoneUsageEvent() {
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
    public void clearIsCallInProgress() {
        this.bitField0_ &= -5;
        this.isCallInProgress_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWaypoints() {
        this.waypoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCallInProgress(boolean z) {
        this.bitField0_ |= 4;
        this.isCallInProgress_ = z;
    }

    public DateTime getEnd() {
        DateTime dateTime = this.end_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public DateTime getStart() {
        DateTime dateTime = this.start_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public static disableSdklambda1 newBuilder(PhoneUsageEvent phoneUsageEvent) {
        return (disableSdklambda1) DEFAULT_INSTANCE.createBuilder(phoneUsageEvent);
    }

    public static PhoneUsageEvent parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static PhoneUsageEvent parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static PhoneUsageEvent parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PhoneUsageEvent parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWaypoints(int i, Waypoint waypoint) {
        waypoint.getClass();
        ensureWaypointsIsMutable();
        this.waypoints_.add(i, waypoint);
    }

    public static PhoneUsageEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PhoneUsageEvent parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static PhoneUsageEvent parseFrom(InputStream inputStream) throws IOException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PhoneUsageEvent parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static PhoneUsageEvent parseFrom(u uVar) throws IOException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static PhoneUsageEvent parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (PhoneUsageEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
