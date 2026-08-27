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
import o.disableDelayedInitializationlambda0;
import o.disableSdklambda2;
import o.getAlignmentLinesMap;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class SafetyScores extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int ATTENTION_FIELD_NUMBER = 7;
    public static final int CALL_WHILE_MOVING_FIELD_NUMBER = 5;
    private static final SafetyScores DEFAULT_INSTANCE;
    public static final int FOCUS_FIELD_NUMBER = 3;
    public static final int LEGAL_FIELD_NUMBER = 2;
    public static final int OVERALL_SAFETY_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int SMOOTH_FIELD_NUMBER = 4;
    public static final int WRONG_WAY_DRIVING_FIELD_NUMBER = 6;
    private float attention_;
    private int bitField0_;
    private float callWhileMoving_;
    private float focus_;
    private float legal_;
    private float overallSafety_;
    private float smooth_;
    private float wrongWayDriving_;

    private SafetyScores() {
    }

    public static SafetyScores getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public float getAttention() {
        return this.attention_;
    }

    public float getCallWhileMoving() {
        return this.callWhileMoving_;
    }

    public float getFocus() {
        return this.focus_;
    }

    public float getLegal() {
        return this.legal_;
    }

    public float getOverallSafety() {
        return this.overallSafety_;
    }

    public float getSmooth() {
        return this.smooth_;
    }

    public float getWrongWayDriving() {
        return this.wrongWayDriving_;
    }

    public boolean hasAttention() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCallWhileMoving() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFocus() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLegal() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOverallSafety() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSmooth() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasWrongWayDriving() {
        return (this.bitField0_ & 32) != 0;
    }

    static {
        SafetyScores safetyScores = new SafetyScores();
        DEFAULT_INSTANCE = safetyScores;
        GeneratedMessageLite.registerDefaultInstance(SafetyScores.class, safetyScores);
    }

    public static disableDelayedInitializationlambda0 newBuilder() {
        return (disableDelayedInitializationlambda0) DEFAULT_INSTANCE.createBuilder();
    }

    public static SafetyScores parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SafetyScores) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SafetyScores parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (disableSdklambda2.serializer[methodToInvoke.ordinal()]) {
            case 1:
                return new SafetyScores();
            case 2:
                return new disableDelayedInitializationlambda0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"bitField0_", "overallSafety_", "legal_", "focus_", "smooth_", "callWhileMoving_", "wrongWayDriving_", "attention_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (SafetyScores.class) {
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
    public void clearAttention() {
        this.bitField0_ &= -65;
        this.attention_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallWhileMoving() {
        this.bitField0_ &= -17;
        this.callWhileMoving_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFocus() {
        this.bitField0_ &= -5;
        this.focus_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLegal() {
        this.bitField0_ &= -3;
        this.legal_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverallSafety() {
        this.bitField0_ &= -2;
        this.overallSafety_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSmooth() {
        this.bitField0_ &= -9;
        this.smooth_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrongWayDriving() {
        this.bitField0_ &= -33;
        this.wrongWayDriving_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttention(float f) {
        this.bitField0_ |= 64;
        this.attention_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallWhileMoving(float f) {
        this.bitField0_ |= 16;
        this.callWhileMoving_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFocus(float f) {
        this.bitField0_ |= 4;
        this.focus_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLegal(float f) {
        this.bitField0_ |= 2;
        this.legal_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverallSafety(float f) {
        this.bitField0_ |= 1;
        this.overallSafety_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSmooth(float f) {
        this.bitField0_ |= 8;
        this.smooth_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrongWayDriving(float f) {
        this.bitField0_ |= 32;
        this.wrongWayDriving_ = f;
    }

    public static disableDelayedInitializationlambda0 newBuilder(SafetyScores safetyScores) {
        return (disableDelayedInitializationlambda0) DEFAULT_INSTANCE.createBuilder(safetyScores);
    }

    public static SafetyScores parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SafetyScores) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SafetyScores parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static SafetyScores parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SafetyScores parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static SafetyScores parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SafetyScores parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static SafetyScores parseFrom(InputStream inputStream) throws IOException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SafetyScores parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static SafetyScores parseFrom(u uVar) throws IOException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static SafetyScores parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (SafetyScores) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
