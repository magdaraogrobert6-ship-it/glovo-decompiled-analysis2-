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
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.getApiEndpointlambda000;
import o.getCustomBrazeNotificationFactoryannotations;
import o.r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class VehicleCrashDetectionFeedbackAppInput extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int CRASH_DETECTED_BY_SDK_FIELD_NUMBER = 4;
    private static final VehicleCrashDetectionFeedbackAppInput DEFAULT_INSTANCE;
    public static final int EVENT_LOCATION_FIELD_NUMBER = 3;
    public static final int EVENT_TIME_FIELD_NUMBER = 1;
    public static final int IS_CRASH_FIELD_NUMBER = 2;
    private static volatile writeStringlambda1 PARSER;
    private int bitField0_;
    private boolean crashDetectedBySdk_;
    private GeoLocation eventLocation_;
    private DateTime eventTime_;
    private boolean isCrash_;

    private VehicleCrashDetectionFeedbackAppInput() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashDetectedBySdk() {
        this.crashDetectedBySdk_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventLocation() {
        this.eventLocation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventTime() {
        this.eventTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsCrash() {
        this.isCrash_ = false;
    }

    public static VehicleCrashDetectionFeedbackAppInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashDetectedBySdk(boolean z) {
        this.crashDetectedBySdk_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsCrash(boolean z) {
        this.isCrash_ = z;
    }

    public boolean getCrashDetectedBySdk() {
        return this.crashDetectedBySdk_;
    }

    public boolean getIsCrash() {
        return this.isCrash_;
    }

    public boolean hasEventLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEventTime() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        VehicleCrashDetectionFeedbackAppInput vehicleCrashDetectionFeedbackAppInput = new VehicleCrashDetectionFeedbackAppInput();
        DEFAULT_INSTANCE = vehicleCrashDetectionFeedbackAppInput;
        GeneratedMessageLite.registerDefaultInstance(VehicleCrashDetectionFeedbackAppInput.class, vehicleCrashDetectionFeedbackAppInput);
    }

    public static getCustomBrazeNotificationFactoryannotations newBuilder() {
        return (getCustomBrazeNotificationFactoryannotations) DEFAULT_INSTANCE.createBuilder();
    }

    public static VehicleCrashDetectionFeedbackAppInput parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (getApiEndpointlambda000.read[methodToInvoke.ordinal()]) {
            case 1:
                return new VehicleCrashDetectionFeedbackAppInput();
            case 2:
                return new getCustomBrazeNotificationFactoryannotations(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001\u0004\u0007", new Object[]{"bitField0_", "eventTime_", "isCrash_", "eventLocation_", "crashDetectedBySdk_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (VehicleCrashDetectionFeedbackAppInput.class) {
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
    public void mergeEventLocation(GeoLocation geoLocation) {
        geoLocation.getClass();
        GeoLocation geoLocation2 = this.eventLocation_;
        if (geoLocation2 == null || geoLocation2 == GeoLocation.getDefaultInstance()) {
            this.eventLocation_ = geoLocation;
        } else {
            r8lambdatsBE8xp9IajV2MTc9Ob0aCJCaXs r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder = GeoLocation.newBuilder(this.eventLocation_);
            r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.serializer(geoLocation);
            this.eventLocation_ = (GeoLocation) r8lambdatsbe8xp9iajv2mtc9ob0acjcaxsNewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEventTime(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.eventTime_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.eventTime_ = dateTime;
        } else {
            this.eventTime_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.eventTime_, dateTime);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventLocation(GeoLocation geoLocation) {
        geoLocation.getClass();
        this.eventLocation_ = geoLocation;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventTime(DateTime dateTime) {
        dateTime.getClass();
        this.eventTime_ = dateTime;
        this.bitField0_ |= 1;
    }

    public GeoLocation getEventLocation() {
        GeoLocation geoLocation = this.eventLocation_;
        return geoLocation == null ? GeoLocation.getDefaultInstance() : geoLocation;
    }

    public DateTime getEventTime() {
        DateTime dateTime = this.eventTime_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    public static getCustomBrazeNotificationFactoryannotations newBuilder(VehicleCrashDetectionFeedbackAppInput vehicleCrashDetectionFeedbackAppInput) {
        return (getCustomBrazeNotificationFactoryannotations) DEFAULT_INSTANCE.createBuilder(vehicleCrashDetectionFeedbackAppInput);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(u uVar) throws IOException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static VehicleCrashDetectionFeedbackAppInput parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedbackAppInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
