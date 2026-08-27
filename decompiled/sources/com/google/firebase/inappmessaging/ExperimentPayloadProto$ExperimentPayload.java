package com.google.firebase.inappmessaging;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.OwnerSnapshotObserverclearInvalidObservations1;
import o.OwnerSnapshotObserveronCommitAffectingLayout1;
import o.OwnerSnapshotObserveronCommitAffectingLayoutModifierInLookahead1;
import o.component23;
import o.dataAvailable;
import o.decodeByte;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.ifDebug;
import o.observeSemanticsReadsui;
import o.stopObservingui;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class ExperimentPayloadProto$ExperimentPayload extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ACTIVATE_EVENT_TO_LOG_FIELD_NUMBER = 8;
    public static final int CLEAR_EVENT_TO_LOG_FIELD_NUMBER = 9;
    private static final ExperimentPayloadProto$ExperimentPayload DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    public static final int EXPERIMENT_START_TIME_MILLIS_FIELD_NUMBER = 3;
    public static final int ONGOING_EXPERIMENTS_FIELD_NUMBER = 13;
    public static final int OVERFLOW_POLICY_FIELD_NUMBER = 12;
    private static volatile component23 PARSER = null;
    public static final int SET_EVENT_TO_LOG_FIELD_NUMBER = 7;
    public static final int TIMEOUT_EVENT_TO_LOG_FIELD_NUMBER = 10;
    public static final int TIME_TO_LIVE_MILLIS_FIELD_NUMBER = 6;
    public static final int TRIGGER_EVENT_FIELD_NUMBER = 4;
    public static final int TRIGGER_TIMEOUT_MILLIS_FIELD_NUMBER = 5;
    public static final int TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER = 11;
    public static final int VARIANT_ID_FIELD_NUMBER = 2;
    private long experimentStartTimeMillis_;
    private int overflowPolicy_;
    private long timeToLiveMillis_;
    private long triggerTimeoutMillis_;
    private String experimentId_ = "";
    private String variantId_ = "";
    private String triggerEvent_ = "";
    private String setEventToLog_ = "";
    private String activateEventToLog_ = "";
    private String clearEventToLog_ = "";
    private String timeoutEventToLog_ = "";
    private String ttlExpiryEventToLog_ = "";
    private decodeString ongoingExperiments_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOverflowPolicy() {
        this.overflowPolicy_ = 0;
    }

    public static ExperimentPayloadProto$ExperimentPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentStartTimeMillis(long j) {
        this.experimentStartTimeMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverflowPolicyValue(int i) {
        this.overflowPolicy_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToLiveMillis(long j) {
        this.timeToLiveMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerTimeoutMillis(long j) {
        this.triggerTimeoutMillis_ = j;
    }

    public String getActivateEventToLog() {
        return this.activateEventToLog_;
    }

    public String getClearEventToLog() {
        return this.clearEventToLog_;
    }

    public String getExperimentId() {
        return this.experimentId_;
    }

    public long getExperimentStartTimeMillis() {
        return this.experimentStartTimeMillis_;
    }

    public List<ExperimentPayloadProto$ExperimentLite> getOngoingExperimentsList() {
        return this.ongoingExperiments_;
    }

    public List<? extends OwnerSnapshotObserverclearInvalidObservations1> getOngoingExperimentsOrBuilderList() {
        return this.ongoingExperiments_;
    }

    public int getOverflowPolicyValue() {
        return this.overflowPolicy_;
    }

    public String getSetEventToLog() {
        return this.setEventToLog_;
    }

    public long getTimeToLiveMillis() {
        return this.timeToLiveMillis_;
    }

    public String getTimeoutEventToLog() {
        return this.timeoutEventToLog_;
    }

    public String getTriggerEvent() {
        return this.triggerEvent_;
    }

    public long getTriggerTimeoutMillis() {
        return this.triggerTimeoutMillis_;
    }

    public String getTtlExpiryEventToLog() {
        return this.ttlExpiryEventToLog_;
    }

    public String getVariantId() {
        return this.variantId_;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum IconCompatParcelizer implements ifDebug {
        POLICY_UNSPECIFIED(0),
        DISCARD_OLDEST(1),
        IGNORE_NEWEST(2),
        UNRECOGNIZED(-1);

        public static final int DISCARD_OLDEST_VALUE = 1;
        public static final int IGNORE_NEWEST_VALUE = 2;
        public static final int POLICY_UNSPECIFIED_VALUE = 0;
        private static final dataAvailable internalValueMap = new stopObservingui();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return OwnerSnapshotObserveronCommitAffectingLayoutModifierInLookahead1.serializer;
        }

        IconCompatParcelizer(int i) {
            this.value = i;
        }

        @Override // o.ifDebug
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static IconCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }

        public static IconCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return POLICY_UNSPECIFIED;
            }
            if (i == 1) {
                return DISCARD_OLDEST;
            }
            if (i != 2) {
                return null;
            }
            return IGNORE_NEWEST;
        }
    }

    static {
        ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload = new ExperimentPayloadProto$ExperimentPayload();
        DEFAULT_INSTANCE = experimentPayloadProto$ExperimentPayload;
        GeneratedMessageLite.registerDefaultInstance(ExperimentPayloadProto$ExperimentPayload.class, experimentPayloadProto$ExperimentPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentStartTimeMillis() {
        this.experimentStartTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToLiveMillis() {
        this.timeToLiveMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerTimeoutMillis() {
        this.triggerTimeoutMillis_ = 0L;
    }

    public static OwnerSnapshotObserveronCommitAffectingLayout1 newBuilder() {
        return (OwnerSnapshotObserveronCommitAffectingLayout1) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExperimentPayloadProto$ExperimentPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (observeSemanticsReadsui.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ExperimentPayloadProto$ExperimentPayload();
            case 2:
                return new OwnerSnapshotObserveronCommitAffectingLayout1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0000\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u0005\u0002\u0006\u0002\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\f\f\r\u001b", new Object[]{"experimentId_", "variantId_", "experimentStartTimeMillis_", "triggerEvent_", "triggerTimeoutMillis_", "timeToLiveMillis_", "setEventToLog_", "activateEventToLog_", "clearEventToLog_", "timeoutEventToLog_", "ttlExpiryEventToLog_", "overflowPolicy_", "ongoingExperiments_", ExperimentPayloadProto$ExperimentLite.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ExperimentPayloadProto$ExperimentPayload.class) {
                    compositionLocalsKtLocalLayoutDirection1 = PARSER;
                    if (compositionLocalsKtLocalLayoutDirection1 == null) {
                        compositionLocalsKtLocalLayoutDirection1 = new CompositionLocalsKtLocalLayoutDirection1(DEFAULT_INSTANCE);
                        PARSER = compositionLocalsKtLocalLayoutDirection1;
                    }
                    break;
                }
                return compositionLocalsKtLocalLayoutDirection1;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public getClipMetadata getActivateEventToLogBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.activateEventToLog_);
    }

    public getClipMetadata getClearEventToLogBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.clearEventToLog_);
    }

    public getClipMetadata getExperimentIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.experimentId_);
    }

    public ExperimentPayloadProto$ExperimentLite getOngoingExperiments(int i) {
        return (ExperimentPayloadProto$ExperimentLite) this.ongoingExperiments_.get(i);
    }

    public int getOngoingExperimentsCount() {
        return this.ongoingExperiments_.size();
    }

    public OwnerSnapshotObserverclearInvalidObservations1 getOngoingExperimentsOrBuilder(int i) {
        return (OwnerSnapshotObserverclearInvalidObservations1) this.ongoingExperiments_.get(i);
    }

    public IconCompatParcelizer getOverflowPolicy() {
        IconCompatParcelizer iconCompatParcelizerForNumber = IconCompatParcelizer.forNumber(this.overflowPolicy_);
        return iconCompatParcelizerForNumber == null ? IconCompatParcelizer.UNRECOGNIZED : iconCompatParcelizerForNumber;
    }

    public getClipMetadata getSetEventToLogBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.setEventToLog_);
    }

    public getClipMetadata getTimeoutEventToLogBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.timeoutEventToLog_);
    }

    public getClipMetadata getTriggerEventBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.triggerEvent_);
    }

    public getClipMetadata getTtlExpiryEventToLogBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.ttlExpiryEventToLog_);
    }

    public getClipMetadata getVariantIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.variantId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOngoingExperiments(Iterable<? extends ExperimentPayloadProto$ExperimentLite> iterable) {
        ensureOngoingExperimentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.ongoingExperiments_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOngoingExperiments(ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        experimentPayloadProto$ExperimentLite.getClass();
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.add(experimentPayloadProto$ExperimentLite);
    }

    private void ensureOngoingExperimentsIsMutable() {
        decodeString decodestring = this.ongoingExperiments_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.ongoingExperiments_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOngoingExperiments(int i) {
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivateEventToLog(String str) {
        str.getClass();
        this.activateEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActivateEventToLogBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.activateEventToLog_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearEventToLog(String str) {
        str.getClass();
        this.clearEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClearEventToLogBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.clearEventToLog_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentId(String str) {
        str.getClass();
        this.experimentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.experimentId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOngoingExperiments(int i, ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        experimentPayloadProto$ExperimentLite.getClass();
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.set(i, experimentPayloadProto$ExperimentLite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetEventToLog(String str) {
        str.getClass();
        this.setEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetEventToLogBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.setEventToLog_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutEventToLog(String str) {
        str.getClass();
        this.timeoutEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeoutEventToLogBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.timeoutEventToLog_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerEvent(String str) {
        str.getClass();
        this.triggerEvent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerEventBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.triggerEvent_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtlExpiryEventToLog(String str) {
        str.getClass();
        this.ttlExpiryEventToLog_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTtlExpiryEventToLogBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.ttlExpiryEventToLog_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVariantId(String str) {
        str.getClass();
        this.variantId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVariantIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.variantId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActivateEventToLog() {
        this.activateEventToLog_ = getDefaultInstance().getActivateEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClearEventToLog() {
        this.clearEventToLog_ = getDefaultInstance().getClearEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentId() {
        this.experimentId_ = getDefaultInstance().getExperimentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOngoingExperiments() {
        this.ongoingExperiments_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetEventToLog() {
        this.setEventToLog_ = getDefaultInstance().getSetEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeoutEventToLog() {
        this.timeoutEventToLog_ = getDefaultInstance().getTimeoutEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerEvent() {
        this.triggerEvent_ = getDefaultInstance().getTriggerEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTtlExpiryEventToLog() {
        this.ttlExpiryEventToLog_ = getDefaultInstance().getTtlExpiryEventToLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVariantId() {
        this.variantId_ = getDefaultInstance().getVariantId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOverflowPolicy(IconCompatParcelizer iconCompatParcelizer) {
        this.overflowPolicy_ = iconCompatParcelizer.getNumber();
    }

    private ExperimentPayloadProto$ExperimentPayload() {
    }

    public static OwnerSnapshotObserveronCommitAffectingLayout1 newBuilder(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        return (OwnerSnapshotObserveronCommitAffectingLayout1) DEFAULT_INSTANCE.createBuilder(experimentPayloadProto$ExperimentPayload);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOngoingExperiments(int i, ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        experimentPayloadProto$ExperimentLite.getClass();
        ensureOngoingExperimentsIsMutable();
        this.ongoingExperiments_.add(i, experimentPayloadProto$ExperimentLite);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExperimentPayloadProto$ExperimentPayload parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExperimentPayloadProto$ExperimentPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
