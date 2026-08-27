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
import o.getAlignmentLinesMap;
import o.getConfiguredApiKeylambda0;
import o.getCustomBrazeNotificationFactoryannotations;
import o.getDelayedInitializationProviderandroid_sdk_base_releaseannotations;
import o.getInstancelambda00;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class VehicleCrashDetectionFeedback extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int APP_INPUT_FIELD_NUMBER = 1;
    private static final VehicleCrashDetectionFeedback DEFAULT_INSTANCE;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SDK_INPUT_FIELD_NUMBER = 2;
    private VehicleCrashDetectionFeedbackAppInput appInput_;
    private int bitField0_;
    private VehicleCrashDetectionFeedbackSdkInput sdkInput_;

    private VehicleCrashDetectionFeedback() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInput() {
        this.appInput_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkInput() {
        this.sdkInput_ = null;
        this.bitField0_ &= -3;
    }

    public static VehicleCrashDetectionFeedback getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasAppInput() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSdkInput() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback = new VehicleCrashDetectionFeedback();
        DEFAULT_INSTANCE = vehicleCrashDetectionFeedback;
        GeneratedMessageLite.registerDefaultInstance(VehicleCrashDetectionFeedback.class, vehicleCrashDetectionFeedback);
    }

    public static getConfiguredApiKeylambda0 newBuilder() {
        return (getConfiguredApiKeylambda0) DEFAULT_INSTANCE.createBuilder();
    }

    public static VehicleCrashDetectionFeedback parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashDetectionFeedback parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (getDelayedInitializationProviderandroid_sdk_base_releaseannotations.read[methodToInvoke.ordinal()]) {
            case 1:
                return new VehicleCrashDetectionFeedback();
            case 2:
                return new getConfiguredApiKeylambda0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "appInput_", "sdkInput_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (VehicleCrashDetectionFeedback.class) {
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
    public void mergeAppInput(VehicleCrashDetectionFeedbackAppInput vehicleCrashDetectionFeedbackAppInput) {
        vehicleCrashDetectionFeedbackAppInput.getClass();
        VehicleCrashDetectionFeedbackAppInput vehicleCrashDetectionFeedbackAppInput2 = this.appInput_;
        if (vehicleCrashDetectionFeedbackAppInput2 == null || vehicleCrashDetectionFeedbackAppInput2 == VehicleCrashDetectionFeedbackAppInput.getDefaultInstance()) {
            this.appInput_ = vehicleCrashDetectionFeedbackAppInput;
        } else {
            getCustomBrazeNotificationFactoryannotations getcustombrazenotificationfactoryannotationsNewBuilder = VehicleCrashDetectionFeedbackAppInput.newBuilder(this.appInput_);
            getcustombrazenotificationfactoryannotationsNewBuilder.serializer(vehicleCrashDetectionFeedbackAppInput);
            this.appInput_ = (VehicleCrashDetectionFeedbackAppInput) getcustombrazenotificationfactoryannotationsNewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSdkInput(VehicleCrashDetectionFeedbackSdkInput vehicleCrashDetectionFeedbackSdkInput) {
        vehicleCrashDetectionFeedbackSdkInput.getClass();
        VehicleCrashDetectionFeedbackSdkInput vehicleCrashDetectionFeedbackSdkInput2 = this.sdkInput_;
        if (vehicleCrashDetectionFeedbackSdkInput2 == null || vehicleCrashDetectionFeedbackSdkInput2 == VehicleCrashDetectionFeedbackSdkInput.getDefaultInstance()) {
            this.sdkInput_ = vehicleCrashDetectionFeedbackSdkInput;
        } else {
            getInstancelambda00 getinstancelambda00NewBuilder = VehicleCrashDetectionFeedbackSdkInput.newBuilder(this.sdkInput_);
            getinstancelambda00NewBuilder.serializer(vehicleCrashDetectionFeedbackSdkInput);
            this.sdkInput_ = (VehicleCrashDetectionFeedbackSdkInput) getinstancelambda00NewBuilder.IconCompatParcelizer();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInput(VehicleCrashDetectionFeedbackAppInput vehicleCrashDetectionFeedbackAppInput) {
        vehicleCrashDetectionFeedbackAppInput.getClass();
        this.appInput_ = vehicleCrashDetectionFeedbackAppInput;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkInput(VehicleCrashDetectionFeedbackSdkInput vehicleCrashDetectionFeedbackSdkInput) {
        vehicleCrashDetectionFeedbackSdkInput.getClass();
        this.sdkInput_ = vehicleCrashDetectionFeedbackSdkInput;
        this.bitField0_ |= 2;
    }

    public VehicleCrashDetectionFeedbackAppInput getAppInput() {
        VehicleCrashDetectionFeedbackAppInput vehicleCrashDetectionFeedbackAppInput = this.appInput_;
        return vehicleCrashDetectionFeedbackAppInput == null ? VehicleCrashDetectionFeedbackAppInput.getDefaultInstance() : vehicleCrashDetectionFeedbackAppInput;
    }

    public VehicleCrashDetectionFeedbackSdkInput getSdkInput() {
        VehicleCrashDetectionFeedbackSdkInput vehicleCrashDetectionFeedbackSdkInput = this.sdkInput_;
        return vehicleCrashDetectionFeedbackSdkInput == null ? VehicleCrashDetectionFeedbackSdkInput.getDefaultInstance() : vehicleCrashDetectionFeedbackSdkInput;
    }

    public static getConfiguredApiKeylambda0 newBuilder(VehicleCrashDetectionFeedback vehicleCrashDetectionFeedback) {
        return (getConfiguredApiKeylambda0) DEFAULT_INSTANCE.createBuilder(vehicleCrashDetectionFeedback);
    }

    public static VehicleCrashDetectionFeedback parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedback parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedback parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VehicleCrashDetectionFeedback parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedback parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VehicleCrashDetectionFeedback parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedback parseFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashDetectionFeedback parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedback parseFrom(u uVar) throws IOException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static VehicleCrashDetectionFeedback parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
