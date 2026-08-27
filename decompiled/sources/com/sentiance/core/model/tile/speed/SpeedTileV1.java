package com.sentiance.core.model.tile.speed;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.setFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release;
import o.setFallbackFirebaseMessagingServiceEnabled;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class SpeedTileV1 extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final SpeedTileV1 DEFAULT_INSTANCE;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SPEED_LIMITS_FIELD_NUMBER = 1;
    private ByteString speedLimits_ = ByteString.RemoteActionCompatParcelizer;

    public static SpeedTileV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public ByteString getSpeedLimits() {
        return this.speedLimits_;
    }

    static {
        SpeedTileV1 speedTileV1 = new SpeedTileV1();
        DEFAULT_INSTANCE = speedTileV1;
        GeneratedMessageLite.registerDefaultInstance(SpeedTileV1.class, speedTileV1);
    }

    public static setFallbackFirebaseMessagingServiceEnabled newBuilder() {
        return (setFallbackFirebaseMessagingServiceEnabled) DEFAULT_INSTANCE.createBuilder();
    }

    public static SpeedTileV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpeedTileV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpeedTileV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (setFallbackFirebaseMessagingServiceClasspathandroid_sdk_base_release.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new SpeedTileV1();
            case 2:
                return new setFallbackFirebaseMessagingServiceEnabled(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"speedLimits_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (SpeedTileV1.class) {
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

    private SpeedTileV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimits(ByteString byteString) {
        byteString.getClass();
        this.speedLimits_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimits() {
        this.speedLimits_ = getDefaultInstance().getSpeedLimits();
    }

    public static setFallbackFirebaseMessagingServiceEnabled newBuilder(SpeedTileV1 speedTileV1) {
        return (setFallbackFirebaseMessagingServiceEnabled) DEFAULT_INSTANCE.createBuilder(speedTileV1);
    }

    public static SpeedTileV1 parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedTileV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedTileV1 parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedTileV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SpeedTileV1 parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedTileV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SpeedTileV1 parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedTileV1 parseFrom(InputStream inputStream) throws IOException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpeedTileV1 parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedTileV1 parseFrom(u uVar) throws IOException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static SpeedTileV1 parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
