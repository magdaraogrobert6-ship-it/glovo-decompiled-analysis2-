package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o._get_isDelayedInitializationEnabled_lambda1;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class GeoLocation extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final GeoLocation DEFAULT_INSTANCE;
    public static final int HORIZONTAL_ACCURACY_METERS_FIELD_NUMBER = 3;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile writeStringlambda1 PARSER;
    private int bitField0_;
    private int horizontalAccuracyMeters_;
    private double latitude_;
    private double longitude_;

    private GeoLocation() {
    }

    public static GeoLocation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d) {
        this.latitude_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d) {
        this.longitude_ = d;
    }

    public int getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters_;
    }

    public double getLatitude() {
        return this.latitude_;
    }

    public double getLongitude() {
        return this.longitude_;
    }

    public boolean hasHorizontalAccuracyMeters() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        GeoLocation geoLocation = new GeoLocation();
        DEFAULT_INSTANCE = geoLocation;
        GeneratedMessageLite.registerDefaultInstance(GeoLocation.class, geoLocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0.0d;
    }

    public static r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs newBuilder() {
        return (r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs) DEFAULT_INSTANCE.createBuilder();
    }

    public static GeoLocation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GeoLocation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeoLocation parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (_get_isDelayedInitializationEnabled_lambda1.read[methodToInvoke.ordinal()]) {
            case 1:
                return new GeoLocation();
            case 2:
                return new r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003င\u0000", new Object[]{"bitField0_", "latitude_", "longitude_", "horizontalAccuracyMeters_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (GeoLocation.class) {
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
    public void clearHorizontalAccuracyMeters() {
        this.bitField0_ &= -2;
        this.horizontalAccuracyMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalAccuracyMeters(int i) {
        this.bitField0_ |= 1;
        this.horizontalAccuracyMeters_ = i;
    }

    public static r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs newBuilder(GeoLocation geoLocation) {
        return (r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs) DEFAULT_INSTANCE.createBuilder(geoLocation);
    }

    public static GeoLocation parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeoLocation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GeoLocation parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static GeoLocation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GeoLocation parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static GeoLocation parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GeoLocation parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static GeoLocation parseFrom(InputStream inputStream) throws IOException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GeoLocation parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GeoLocation parseFrom(u uVar) throws IOException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static GeoLocation parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GeoLocation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
