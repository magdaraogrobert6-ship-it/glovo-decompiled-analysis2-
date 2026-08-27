package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.accessgetDiskLruCachep;
import o.enableDelayedInitializationlambda0;
import o.enableDelayedInitializationlambda1;
import o.getAlignmentLinesMap;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class SpeedLimit extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final SpeedLimit DEFAULT_INSTANCE;
    public static final int IS_UNLIMITED_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SPEED_LIMIT_MPS_FIELD_NUMBER = 2;
    private boolean isUnlimited_;
    private float speedLimitMps_;

    private SpeedLimit() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsUnlimited() {
        this.isUnlimited_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimitMps() {
        this.speedLimitMps_ = 0.0f;
    }

    public static SpeedLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsUnlimited(boolean z) {
        this.isUnlimited_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimitMps(float f) {
        this.speedLimitMps_ = f;
    }

    public boolean getIsUnlimited() {
        return this.isUnlimited_;
    }

    public float getSpeedLimitMps() {
        return this.speedLimitMps_;
    }

    static {
        SpeedLimit speedLimit = new SpeedLimit();
        DEFAULT_INSTANCE = speedLimit;
        GeneratedMessageLite.registerDefaultInstance(SpeedLimit.class, speedLimit);
    }

    public static enableDelayedInitializationlambda0 newBuilder() {
        return (enableDelayedInitializationlambda0) DEFAULT_INSTANCE.createBuilder();
    }

    public static SpeedLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SpeedLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpeedLimit parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (enableDelayedInitializationlambda1.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new SpeedLimit();
            case 2:
                return new enableDelayedInitializationlambda0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0001", new Object[]{"isUnlimited_", "speedLimitMps_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (SpeedLimit.class) {
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

    public static enableDelayedInitializationlambda0 newBuilder(SpeedLimit speedLimit) {
        return (enableDelayedInitializationlambda0) DEFAULT_INSTANCE.createBuilder(speedLimit);
    }

    public static SpeedLimit parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedLimit) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedLimit parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SpeedLimit parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedLimit parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SpeedLimit parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedLimit parseFrom(InputStream inputStream) throws IOException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SpeedLimit parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SpeedLimit parseFrom(u uVar) throws IOException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static SpeedLimit parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SpeedLimit) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
