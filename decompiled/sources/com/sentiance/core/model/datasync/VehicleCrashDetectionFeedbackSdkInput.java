package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.DelayedInitializationAnalyticsBehavior;
import o.InAppMessageEvent;
import o.SweepGradientShader9KIMszodefault;
import o._get_isDisabled_lambda0;
import o.accessgetDiskLruCachep;
import o.getAlignmentLinesMap;
import o.getInstancelambda00;
import o.getSdkEnablementProvider;
import o.onSuccess;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes4.dex */
public final class VehicleCrashDetectionFeedbackSdkInput extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int CRASH_EVENTS_IN_RANGE_FIELD_NUMBER = 3;
    private static final VehicleCrashDetectionFeedbackSdkInput DEFAULT_INSTANCE;
    public static final int FEEDBACK_TIME_FIELD_NUMBER = 1;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int TIMELINE_EVENT_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private DateTime feedbackTime_;
    private String timelineEventId_ = "";
    private onSuccess crashEventsInRange_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeedbackTime() {
        this.feedbackTime_ = null;
        this.bitField0_ &= -2;
    }

    public static VehicleCrashDetectionFeedbackSdkInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<VehicleCrashEvent> getCrashEventsInRangeList() {
        return this.crashEventsInRange_;
    }

    public List<? extends _get_isDisabled_lambda0> getCrashEventsInRangeOrBuilderList() {
        return this.crashEventsInRange_;
    }

    public String getTimelineEventId() {
        return this.timelineEventId_;
    }

    public boolean hasFeedbackTime() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimelineEventId() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        VehicleCrashDetectionFeedbackSdkInput vehicleCrashDetectionFeedbackSdkInput = new VehicleCrashDetectionFeedbackSdkInput();
        DEFAULT_INSTANCE = vehicleCrashDetectionFeedbackSdkInput;
        GeneratedMessageLite.registerDefaultInstance(VehicleCrashDetectionFeedbackSdkInput.class, vehicleCrashDetectionFeedbackSdkInput);
    }

    public static getInstancelambda00 newBuilder() {
        return (getInstancelambda00) DEFAULT_INSTANCE.createBuilder();
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (getSdkEnablementProvider.serializer[methodToInvoke.ordinal()]) {
            case 1:
                return new VehicleCrashDetectionFeedbackSdkInput();
            case 2:
                return new getInstancelambda00(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003\u001b", new Object[]{"bitField0_", "feedbackTime_", "timelineEventId_", "crashEventsInRange_", VehicleCrashEvent.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (VehicleCrashDetectionFeedbackSdkInput.class) {
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

    public VehicleCrashEvent getCrashEventsInRange(int i) {
        return (VehicleCrashEvent) this.crashEventsInRange_.get(i);
    }

    public int getCrashEventsInRangeCount() {
        return this.crashEventsInRange_.size();
    }

    public _get_isDisabled_lambda0 getCrashEventsInRangeOrBuilder(int i) {
        return (_get_isDisabled_lambda0) this.crashEventsInRange_.get(i);
    }

    public ByteString getTimelineEventIdBytes() {
        return ByteString.read(this.timelineEventId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCrashEventsInRange(Iterable<? extends VehicleCrashEvent> iterable) {
        ensureCrashEventsInRangeIsMutable();
        a.addAll((Iterable) iterable, (List) this.crashEventsInRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrashEventsInRange(VehicleCrashEvent vehicleCrashEvent) {
        vehicleCrashEvent.getClass();
        ensureCrashEventsInRangeIsMutable();
        this.crashEventsInRange_.add(vehicleCrashEvent);
    }

    private void ensureCrashEventsInRangeIsMutable() {
        onSuccess onsuccess = this.crashEventsInRange_;
        if (((InAppMessageEvent) onsuccess).read) {
            return;
        }
        this.crashEventsInRange_ = GeneratedMessageLite.mutableCopy(onsuccess);
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
    public void removeCrashEventsInRange(int i) {
        ensureCrashEventsInRangeIsMutable();
        this.crashEventsInRange_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrashEventsInRange(int i, VehicleCrashEvent vehicleCrashEvent) {
        vehicleCrashEvent.getClass();
        ensureCrashEventsInRangeIsMutable();
        this.crashEventsInRange_.set(i, vehicleCrashEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeedbackTime(DateTime dateTime) {
        dateTime.getClass();
        this.feedbackTime_ = dateTime;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelineEventId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.timelineEventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimelineEventIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.timelineEventId_ = byteString.write();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrashEventsInRange() {
        this.crashEventsInRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimelineEventId() {
        this.bitField0_ &= -3;
        this.timelineEventId_ = getDefaultInstance().getTimelineEventId();
    }

    public DateTime getFeedbackTime() {
        DateTime dateTime = this.feedbackTime_;
        return dateTime == null ? DateTime.getDefaultInstance() : dateTime;
    }

    private VehicleCrashDetectionFeedbackSdkInput() {
    }

    public static getInstancelambda00 newBuilder(VehicleCrashDetectionFeedbackSdkInput vehicleCrashDetectionFeedbackSdkInput) {
        return (getInstancelambda00) DEFAULT_INSTANCE.createBuilder(vehicleCrashDetectionFeedbackSdkInput);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCrashEventsInRange(int i, VehicleCrashEvent vehicleCrashEvent) {
        vehicleCrashEvent.getClass();
        ensureCrashEventsInRangeIsMutable();
        this.crashEventsInRange_.add(i, vehicleCrashEvent);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(InputStream inputStream) throws IOException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(u uVar) throws IOException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static VehicleCrashDetectionFeedbackSdkInput parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (VehicleCrashDetectionFeedbackSdkInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
