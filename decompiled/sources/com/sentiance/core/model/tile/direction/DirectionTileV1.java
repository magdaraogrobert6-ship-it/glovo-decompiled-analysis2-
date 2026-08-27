package com.sentiance.core.model.tile.direction;

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
import o.setDeviceObjectAllowlistEnabled;
import o.setDoesPushStoryDismissOnClick;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class DirectionTileV1 extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final DirectionTileV1 DEFAULT_INSTANCE;
    public static final int DIRECTION_FEATURES_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER;
    private ByteString directionFeatures_ = ByteString.RemoteActionCompatParcelizer;

    public static DirectionTileV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public ByteString getDirectionFeatures() {
        return this.directionFeatures_;
    }

    static {
        DirectionTileV1 directionTileV1 = new DirectionTileV1();
        DEFAULT_INSTANCE = directionTileV1;
        GeneratedMessageLite.registerDefaultInstance(DirectionTileV1.class, directionTileV1);
    }

    public static setDeviceObjectAllowlistEnabled newBuilder() {
        return (setDeviceObjectAllowlistEnabled) DEFAULT_INSTANCE.createBuilder();
    }

    public static DirectionTileV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DirectionTileV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DirectionTileV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (setDoesPushStoryDismissOnClick.serializer[methodToInvoke.ordinal()]) {
            case 1:
                return new DirectionTileV1();
            case 2:
                return new setDeviceObjectAllowlistEnabled(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"directionFeatures_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (DirectionTileV1.class) {
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

    private DirectionTileV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionFeatures(ByteString byteString) {
        byteString.getClass();
        this.directionFeatures_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirectionFeatures() {
        this.directionFeatures_ = getDefaultInstance().getDirectionFeatures();
    }

    public static setDeviceObjectAllowlistEnabled newBuilder(DirectionTileV1 directionTileV1) {
        return (setDeviceObjectAllowlistEnabled) DEFAULT_INSTANCE.createBuilder(directionTileV1);
    }

    public static DirectionTileV1 parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DirectionTileV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static DirectionTileV1 parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static DirectionTileV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DirectionTileV1 parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static DirectionTileV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DirectionTileV1 parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static DirectionTileV1 parseFrom(InputStream inputStream) throws IOException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DirectionTileV1 parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static DirectionTileV1 parseFrom(u uVar) throws IOException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static DirectionTileV1 parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (DirectionTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
