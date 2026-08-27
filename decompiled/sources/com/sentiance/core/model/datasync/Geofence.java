package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o._get_isDisabled_lambda1;
import o.addSdkMetadatalambda00;
import o.getAlignmentLinesMap;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.shouldAllowSingletonInitializationlambda2;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class Geofence extends GeneratedMessageLite implements shouldAllowSingletonInitializationlambda2 {
    private static final Geofence DEFAULT_INSTANCE;
    public static final int GEOFENCE_LIST_ID_FIELD_NUMBER = 2;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SENTIANCE_ID_FIELD_NUMBER = 1;
    private String sentianceId_ = "";
    private String geofenceListId_ = "";

    public static Geofence getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getGeofenceListId() {
        return this.geofenceListId_;
    }

    public String getSentianceId() {
        return this.sentianceId_;
    }

    static {
        Geofence geofence = new Geofence();
        DEFAULT_INSTANCE = geofence;
        GeneratedMessageLite.registerDefaultInstance(Geofence.class, geofence);
    }

    public static _get_isDisabled_lambda1 newBuilder() {
        return (_get_isDisabled_lambda1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Geofence parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Geofence) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Geofence parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (addSdkMetadatalambda00.write[methodToInvoke.ordinal()]) {
            case 1:
                return new Geofence();
            case 2:
                return new _get_isDisabled_lambda1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"sentianceId_", "geofenceListId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (Geofence.class) {
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

    public ByteString getGeofenceListIdBytes() {
        return ByteString.read(this.geofenceListId_);
    }

    public ByteString getSentianceIdBytes() {
        return ByteString.read(this.sentianceId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeofenceListId(String str) {
        str.getClass();
        this.geofenceListId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGeofenceListIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.geofenceListId_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSentianceId(String str) {
        str.getClass();
        this.sentianceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSentianceIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.sentianceId_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeofenceListId() {
        this.geofenceListId_ = getDefaultInstance().getGeofenceListId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSentianceId() {
        this.sentianceId_ = getDefaultInstance().getSentianceId();
    }

    private Geofence() {
    }

    public static _get_isDisabled_lambda1 newBuilder(Geofence geofence) {
        return (_get_isDisabled_lambda1) DEFAULT_INSTANCE.createBuilder(geofence);
    }

    public static Geofence parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Geofence) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Geofence parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static Geofence parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Geofence parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static Geofence parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Geofence parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static Geofence parseFrom(InputStream inputStream) throws IOException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Geofence parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Geofence parseFrom(u uVar) throws IOException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static Geofence parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Geofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
