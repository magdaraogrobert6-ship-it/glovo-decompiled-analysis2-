package com.sentiance.core.model.tile.gis;

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
import o.setDeviceObjectAllowlistandroid_sdk_base_release;
import o.setFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class GisTileV1 extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final GisTileV1 DEFAULT_INSTANCE;
    public static final int GIS_FEATURES_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER;
    private ByteString gisFeatures_ = ByteString.RemoteActionCompatParcelizer;

    public static GisTileV1 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public ByteString getGisFeatures() {
        return this.gisFeatures_;
    }

    static {
        GisTileV1 gisTileV1 = new GisTileV1();
        DEFAULT_INSTANCE = gisTileV1;
        GeneratedMessageLite.registerDefaultInstance(GisTileV1.class, gisTileV1);
    }

    public static setFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release newBuilder() {
        return (setFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release) DEFAULT_INSTANCE.createBuilder();
    }

    public static GisTileV1 parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GisTileV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GisTileV1 parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (setDeviceObjectAllowlistandroid_sdk_base_release.RemoteActionCompatParcelizer[methodToInvoke.ordinal()]) {
            case 1:
                return new GisTileV1();
            case 2:
                return new setFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"gisFeatures_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (GisTileV1.class) {
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

    private GisTileV1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGisFeatures(ByteString byteString) {
        byteString.getClass();
        this.gisFeatures_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGisFeatures() {
        this.gisFeatures_ = getDefaultInstance().getGisFeatures();
    }

    public static setFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release newBuilder(GisTileV1 gisTileV1) {
        return (setFallbackFirebaseMessagingServiceEnabledandroid_sdk_base_release) DEFAULT_INSTANCE.createBuilder(gisTileV1);
    }

    public static GisTileV1 parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GisTileV1) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GisTileV1 parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static GisTileV1 parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static GisTileV1 parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static GisTileV1 parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GisTileV1 parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static GisTileV1 parseFrom(InputStream inputStream) throws IOException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GisTileV1 parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static GisTileV1 parseFrom(u uVar) throws IOException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static GisTileV1 parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (GisTileV1) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
