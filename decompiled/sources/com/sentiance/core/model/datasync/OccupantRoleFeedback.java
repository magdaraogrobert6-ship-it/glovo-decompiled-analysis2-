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
import o.SweepGradientShader9KIMszodefault;
import o.accessgetDiskLruCachep;
import o.configurelambda0;
import o.configurelambda11;
import o.getAlignmentLinesMap;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class OccupantRoleFeedback extends GeneratedMessageLite implements accessgetDiskLruCachep {
    private static final OccupantRoleFeedback DEFAULT_INSTANCE;
    public static final int FEEDBACK_OCCUPANT_ROLE_FIELD_NUMBER = 4;
    public static final int FEEDBACK_TIME_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int PREDICTED_OCCUPANT_ROLE_FIELD_NUMBER = 3;
    public static final int PROBABILITY_FIELD_NUMBER = 5;
    public static final int THRESHOLD_FIELD_NUMBER = 6;
    public static final int TRANSPORT_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private int feedbackOccupantRole_;
    private DateTime feedbackTime_;
    private int predictedOccupantRole_;
    private float probability_;
    private float threshold_;
    private String transportId_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackOccupantRole() {
        this.feedbackOccupantRole_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackTime() {
        this.feedbackTime_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPredictedOccupantRole() {
        this.predictedOccupantRole_ = 0;
    }

    public static OccupantRoleFeedback getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackOccupantRoleValue(int i) {
        this.feedbackOccupantRole_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredictedOccupantRoleValue(int i) {
        this.predictedOccupantRole_ = i;
    }

    public int getFeedbackOccupantRoleValue() {
        return this.feedbackOccupantRole_;
    }

    public int getPredictedOccupantRoleValue() {
        return this.predictedOccupantRole_;
    }

    public float getProbability() {
        return this.probability_;
    }

    public float getThreshold() {
        return this.threshold_;
    }

    public String getTransportId() {
        return this.transportId_;
    }

    public boolean hasFeedbackTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasProbability() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasThreshold() {
        return (this.bitField0_ & 4) != 0;
    }

    static {
        OccupantRoleFeedback occupantRoleFeedback = new OccupantRoleFeedback();
        DEFAULT_INSTANCE = occupantRoleFeedback;
        GeneratedMessageLite.registerDefaultInstance(OccupantRoleFeedback.class, occupantRoleFeedback);
    }

    public static configurelambda11 newBuilder() {
        return (configurelambda11) DEFAULT_INSTANCE.createBuilder();
    }

    public static OccupantRoleFeedback parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OccupantRoleFeedback parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (configurelambda0.read[methodToInvoke.ordinal()]) {
            case 1:
                return new OccupantRoleFeedback();
            case 2:
                return new configurelambda11(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\f\u0004\f\u0005ခ\u0001\u0006ခ\u0002", new Object[]{"bitField0_", "feedbackTime_", "transportId_", "predictedOccupantRole_", "feedbackOccupantRole_", "probability_", "threshold_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (OccupantRoleFeedback.class) {
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

    public TransportOccupantRole getFeedbackOccupantRole() {
        TransportOccupantRole transportOccupantRoleForNumber = TransportOccupantRole.forNumber(this.feedbackOccupantRole_);
        return transportOccupantRoleForNumber == null ? TransportOccupantRole.UNRECOGNIZED : transportOccupantRoleForNumber;
    }

    public TransportOccupantRole getPredictedOccupantRole() {
        TransportOccupantRole transportOccupantRoleForNumber = TransportOccupantRole.forNumber(this.predictedOccupantRole_);
        return transportOccupantRoleForNumber == null ? TransportOccupantRole.UNRECOGNIZED : transportOccupantRoleForNumber;
    }

    public ByteString getTransportIdBytes() {
        return ByteString.read(this.transportId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeedbackTime(DateTime dateTime) {
        dateTime.getClass();
        DateTime dateTime2 = this.feedbackTime_;
        if (dateTime2 == null || dateTime2 == DateTime.getDefaultInstance()) {
            this.feedbackTime_ = dateTime;
        } else {
            this.feedbackTime_ = (DateTime) SweepGradientShader9KIMszodefault.read(this.feedbackTime_, dateTime);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackTime(DateTime dateTime) {
        dateTime.getClass();
        this.feedbackTime_ = dateTime;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportId(String str) {
        str.getClass();
        this.transportId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.transportId_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProbability() {
        this.bitField0_ &= -3;
        this.probability_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThreshold() {
        this.bitField0_ &= -5;
        this.threshold_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportId() {
        this.transportId_ = getDefaultInstance().getTransportId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackOccupantRole(TransportOccupantRole transportOccupantRole) {
        this.feedbackOccupantRole_ = transportOccupantRole.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPredictedOccupantRole(TransportOccupantRole transportOccupantRole) {
        this.predictedOccupantRole_ = transportOccupantRole.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProbability(float f) {
        this.bitField0_ |= 2;
        this.probability_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThreshold(float f) {
        this.bitField0_ |= 4;
        this.threshold_ = f;
    }

    public DateTime getFeedbackTime() {
        DateTime dateTime = this.feedbackTime_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    private OccupantRoleFeedback() {
    }

    public static configurelambda11 newBuilder(OccupantRoleFeedback occupantRoleFeedback) {
        return (configurelambda11) DEFAULT_INSTANCE.createBuilder(occupantRoleFeedback);
    }

    public static OccupantRoleFeedback parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static OccupantRoleFeedback parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static OccupantRoleFeedback parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static OccupantRoleFeedback parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static OccupantRoleFeedback parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static OccupantRoleFeedback parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static OccupantRoleFeedback parseFrom(InputStream inputStream) throws IOException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static OccupantRoleFeedback parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static OccupantRoleFeedback parseFrom(u uVar) throws IOException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static OccupantRoleFeedback parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (OccupantRoleFeedback) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
