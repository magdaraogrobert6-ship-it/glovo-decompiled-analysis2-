package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.SweepGradientShader9KIMszodefault;
import o._get_isDelayedInitializationEnabled_lambda0;
import o.enableDelayedInitializationlambda0;
import o.getAlignmentLinesMap;
import o.getOutboundNetworkRequestsOfflineannotations;
import o.isDisabledannotations;
import o.r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class Waypoint extends GeneratedMessageLite implements _get_isDelayedInitializationEnabled_lambda0 {
    private static final Waypoint DEFAULT_INSTANCE;
    public static final int IS_SYNTHETIC_FIELD_NUMBER = 5;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SPEED_LIMIT_FIELD_NUMBER = 4;
    public static final int SPEED_MPS_FIELD_NUMBER = 3;
    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isSynthetic_;
    private GeoLocation location_;
    private SpeedLimit speedLimit_;
    private float speedMps_;
    private DateTime timestamp_;

    private Waypoint() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsSynthetic() {
        this.isSynthetic_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimit() {
        this.speedLimit_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.timestamp_ = null;
        this.bitField0_ &= -3;
    }

    public static Waypoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsSynthetic(boolean z) {
        this.isSynthetic_ = z;
    }

    public boolean getIsSynthetic() {
        return this.isSynthetic_;
    }

    public float getSpeedMps() {
        return this.speedMps_;
    }

    public boolean hasLocation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSpeedLimit() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSpeedMps() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        Waypoint waypoint = new Waypoint();
        DEFAULT_INSTANCE = waypoint;
        GeneratedMessageLite.registerDefaultInstance(Waypoint.class, waypoint);
    }

    public static isDisabledannotations newBuilder() {
        return (isDisabledannotations) DEFAULT_INSTANCE.createBuilder();
    }

    public static Waypoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Waypoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Waypoint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (getOutboundNetworkRequestsOfflineannotations.read[methodToInvoke.ordinal()]) {
            case 1:
                return new Waypoint();
            case 2:
                return new isDisabledannotations(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ခ\u0002\u0004ဉ\u0003\u0005\u0007", new Object[]{"bitField0_", "location_", "timestamp_", "speedMps_", "speedLimit_", "isSynthetic_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (Waypoint.class) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocation(GeoLocation geoLocation) {
        geoLocation.getClass();
        GeoLocation geoLocation2 = this.location_;
        if (geoLocation2 == null || geoLocation2 == GeoLocation.getDefaultInstance()) {
            this.location_ = geoLocation;
        } else {
            r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder = GeoLocation.newBuilder(this.location_);
            r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.serializer(geoLocation);
            this.location_ = (GeoLocation) r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSpeedLimit(SpeedLimit speedLimit) {
        speedLimit.getClass();
        SpeedLimit speedLimit2 = this.speedLimit_;
        if (speedLimit2 == null || speedLimit2 == SpeedLimit.getDefaultInstance()) {
            this.speedLimit_ = speedLimit;
        } else {
            enableDelayedInitializationlambda0 enabledelayedinitializationlambda0NewBuilder = SpeedLimit.newBuilder(this.speedLimit_);
            enabledelayedinitializationlambda0NewBuilder.serializer(speedLimit);
            this.speedLimit_ = (SpeedLimit) enabledelayedinitializationlambda0NewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimestamp(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.timestamp_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.timestamp_ = dateTime;
        } else {
            this.timestamp_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.timestamp_, dateTime);
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(GeoLocation geoLocation) {
        geoLocation.getClass();
        this.location_ = geoLocation;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimit(SpeedLimit speedLimit) {
        speedLimit.getClass();
        this.speedLimit_ = speedLimit;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(DateTime dateTime) {
        dateTime.getClass();
        this.timestamp_ = dateTime;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedMps() {
        this.bitField0_ &= -5;
        this.speedMps_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedMps(float f) {
        this.bitField0_ |= 4;
        this.speedMps_ = f;
    }

    public GeoLocation getLocation() {
        GeoLocation geoLocation = this.location_;
        return geoLocation == null ? GeoLocation.getDefaultInstance() : geoLocation;
    }

    public SpeedLimit getSpeedLimit() {
        SpeedLimit speedLimit = this.speedLimit_;
        return speedLimit == null ? SpeedLimit.getDefaultInstance() : speedLimit;
    }

    public DateTime getTimestamp() {
        DateTime dateTime = this.timestamp_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public static isDisabledannotations newBuilder(Waypoint waypoint) {
        return (isDisabledannotations) DEFAULT_INSTANCE.createBuilder(waypoint);
    }

    public static Waypoint parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Waypoint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Waypoint parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static Waypoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Waypoint parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static Waypoint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Waypoint parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static Waypoint parseFrom(InputStream inputStream) throws IOException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Waypoint parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Waypoint parseFrom(u uVar) throws IOException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static Waypoint parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Waypoint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
