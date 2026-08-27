package com.sentiance.core.model.sdkcomm;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.getAlignmentLinesMap;
import o.r8lambdafwY2aqg_mqrgPa_vrbZbCv3Jtm4;
import o.r8lambdaj5EJgTpSAStXSMXlXwpTKsml9Mo;
import o.r8lambdaqNfvz1AWVLJoP7Ir1LpTGczzEjs;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class SmartGeofence extends GeneratedMessageLite implements r8lambdaqNfvz1AWVLJoP7Ir1LpTGczzEjs {
    private static final SmartGeofence DEFAULT_INSTANCE;
    public static final int EXTERNAL_ID_FIELD_NUMBER = 5;
    public static final int GEOFENCE_LIST_ID_FIELD_NUMBER = 6;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 3;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int RADIUS_FIELD_NUMBER = 4;
    public static final int SENTIANCE_ID_FIELD_NUMBER = 1;
    private int latitude_;
    private int longitude_;
    private int radius_;
    private String sentianceId_ = "";
    private String externalId_ = "";
    private String geofenceListId_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.latitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.longitude_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRadius() {
        this.radius_ = 0;
    }

    public static SmartGeofence getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(int i) {
        this.latitude_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(int i) {
        this.longitude_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRadius(int i) {
        this.radius_ = i;
    }

    public String getExternalId() {
        return this.externalId_;
    }

    public String getGeofenceListId() {
        return this.geofenceListId_;
    }

    public int getLatitude() {
        return this.latitude_;
    }

    public int getLongitude() {
        return this.longitude_;
    }

    public int getRadius() {
        return this.radius_;
    }

    public String getSentianceId() {
        return this.sentianceId_;
    }

    static {
        SmartGeofence smartGeofence = new SmartGeofence();
        DEFAULT_INSTANCE = smartGeofence;
        GeneratedMessageLite.registerDefaultInstance(SmartGeofence.class, smartGeofence);
    }

    public static r8lambdaj5EJgTpSAStXSMXlXwpTKsml9Mo newBuilder() {
        return (r8lambdaj5EJgTpSAStXSMXlXwpTKsml9Mo) DEFAULT_INSTANCE.createBuilder();
    }

    public static SmartGeofence parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SmartGeofence) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmartGeofence parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (r8lambdafwY2aqg_mqrgPa_vrbZbCv3Jtm4.read[methodToInvoke.ordinal()]) {
            case 1:
                return new SmartGeofence();
            case 2:
                return new r8lambdaj5EJgTpSAStXSMXlXwpTKsml9Mo(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0004\u0005Ȉ\u0006Ȉ", new Object[]{"sentianceId_", "latitude_", "longitude_", "radius_", "externalId_", "geofenceListId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (SmartGeofence.class) {
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

    public ByteString getExternalIdBytes() {
        return ByteString.read(this.externalId_);
    }

    public ByteString getGeofenceListIdBytes() {
        return ByteString.read(this.geofenceListId_);
    }

    public ByteString getSentianceIdBytes() {
        return ByteString.read(this.sentianceId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalId(String str) {
        str.getClass();
        this.externalId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExternalIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.externalId_ = byteString.write();
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
    public void clearExternalId() {
        this.externalId_ = getDefaultInstance().getExternalId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGeofenceListId() {
        this.geofenceListId_ = getDefaultInstance().getGeofenceListId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSentianceId() {
        this.sentianceId_ = getDefaultInstance().getSentianceId();
    }

    private SmartGeofence() {
    }

    public static r8lambdaj5EJgTpSAStXSMXlXwpTKsml9Mo newBuilder(SmartGeofence smartGeofence) {
        return (r8lambdaj5EJgTpSAStXSMXlXwpTKsml9Mo) DEFAULT_INSTANCE.createBuilder(smartGeofence);
    }

    public static SmartGeofence parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SmartGeofence) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofence parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofence parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SmartGeofence parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofence parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SmartGeofence parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofence parseFrom(InputStream inputStream) throws IOException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SmartGeofence parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SmartGeofence parseFrom(u uVar) throws IOException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static SmartGeofence parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SmartGeofence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
