package com.google.firebase.inappmessaging;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.OwnerScope;
import o.OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1;
import o.PointerInputModifierNodeKt;
import o.accessgetOnCommitAffectingLayoutp;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getEnableExtraAssertions;
import o.getLocalProvidableScrollCaptureInProgress;
import o.observeMeasureSnapshotReadsui;
import o.observeReadsui;

/* JADX INFO: loaded from: classes2.dex */
public final class CampaignAnalytics extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 2;
    public static final int CLIENT_APP_FIELD_NUMBER = 3;
    public static final int CLIENT_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    private static final CampaignAnalytics DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER = 6;
    public static final int ENGAGEMENTMETRICS_DELIVERY_RETRY_COUNT_FIELD_NUMBER = 10;
    public static final int EVENT_TYPE_FIELD_NUMBER = 5;
    public static final int FETCH_ERROR_REASON_FIELD_NUMBER = 8;
    public static final int FIAM_SDK_VERSION_FIELD_NUMBER = 9;
    private static volatile component23 PARSER = null;
    public static final int PROJECT_NUMBER_FIELD_NUMBER = 1;
    public static final int RENDER_ERROR_REASON_FIELD_NUMBER = 7;
    private int bitField0_;
    private ClientAppInfo clientApp_;
    private long clientTimestampMillis_;
    private int engagementMetricsDeliveryRetryCount_;
    private Object event_;
    private int eventCase_ = 0;
    private String projectNumber_ = "";
    private String campaignId_ = "";
    private String fiamSdkVersion_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientApp() {
        this.clientApp_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEvent() {
        this.eventCase_ = 0;
        this.event_ = null;
    }

    public static CampaignAnalytics getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getCampaignId() {
        return this.campaignId_;
    }

    public long getClientTimestampMillis() {
        return this.clientTimestampMillis_;
    }

    public int getEngagementMetricsDeliveryRetryCount() {
        return this.engagementMetricsDeliveryRetryCount_;
    }

    public String getFiamSdkVersion() {
        return this.fiamSdkVersion_;
    }

    public String getProjectNumber() {
        return this.projectNumber_;
    }

    public boolean hasCampaignId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasClientApp() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasClientTimestampMillis() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDismissType() {
        return this.eventCase_ == 6;
    }

    public boolean hasEngagementMetricsDeliveryRetryCount() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasEventType() {
        return this.eventCase_ == 5;
    }

    public boolean hasFetchErrorReason() {
        return this.eventCase_ == 8;
    }

    public boolean hasFiamSdkVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasProjectNumber() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRenderErrorReason() {
        return this.eventCase_ == 7;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum write {
        EVENT_TYPE(5),
        DISMISS_TYPE(6),
        RENDER_ERROR_REASON(7),
        FETCH_ERROR_REASON(8),
        EVENT_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        write(int i) {
            this.value = i;
        }

        @Deprecated
        public static write valueOf(int i) {
            return forNumber(i);
        }

        public static write forNumber(int i) {
            if (i == 0) {
                return EVENT_NOT_SET;
            }
            if (i == 5) {
                return EVENT_TYPE;
            }
            if (i == 6) {
                return DISMISS_TYPE;
            }
            if (i == 7) {
                return RENDER_ERROR_REASON;
            }
            if (i != 8) {
                return null;
            }
            return FETCH_ERROR_REASON;
        }
    }

    static {
        CampaignAnalytics campaignAnalytics = new CampaignAnalytics();
        DEFAULT_INSTANCE = campaignAnalytics;
        GeneratedMessageLite.registerDefaultInstance(CampaignAnalytics.class, campaignAnalytics);
    }

    public static getEnableExtraAssertions newBuilder() {
        return (getEnableExtraAssertions) DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignAnalytics parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignAnalytics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (OwnerScope.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CampaignAnalytics();
            case 2:
                return new getEnableExtraAssertions(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005\u083f\u0000\u0006\u083f\u0000\u0007\u083f\u0000\b\u083f\u0000\tဈ\u0004\nင\u0005", new Object[]{"event_", "eventCase_", "bitField0_", "projectNumber_", "campaignId_", "clientApp_", "clientTimestampMillis_", observeReadsui.internalGetVerifier(), observeMeasureSnapshotReadsui.internalGetVerifier(), PointerInputModifierNodeKt.internalGetVerifier(), OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1.internalGetVerifier(), "fiamSdkVersion_", "engagementMetricsDeliveryRetryCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CampaignAnalytics.class) {
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

    public getClipMetadata getCampaignIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.campaignId_);
    }

    public write getEventCase() {
        return write.forNumber(this.eventCase_);
    }

    public getClipMetadata getFiamSdkVersionBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.fiamSdkVersion_);
    }

    public getClipMetadata getProjectNumberBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.projectNumber_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeClientApp(ClientAppInfo clientAppInfo) {
        clientAppInfo.getClass();
        ClientAppInfo clientAppInfo2 = this.clientApp_;
        if (clientAppInfo2 == null || clientAppInfo2 == ClientAppInfo.getDefaultInstance()) {
            this.clientApp_ = clientAppInfo;
        } else {
            accessgetOnCommitAffectingLayoutp accessgetoncommitaffectinglayoutpNewBuilder = ClientAppInfo.newBuilder(this.clientApp_);
            accessgetoncommitaffectinglayoutpNewBuilder.read(clientAppInfo);
            this.clientApp_ = (ClientAppInfo) accessgetoncommitaffectinglayoutpNewBuilder.read();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientApp(ClientAppInfo clientAppInfo) {
        clientAppInfo.getClass();
        this.clientApp_ = clientAppInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamSdkVersion(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.fiamSdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectNumber(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.projectNumber_ = str;
    }

    private CampaignAnalytics() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.bitField0_ &= -3;
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTimestampMillis() {
        this.bitField0_ &= -9;
        this.clientTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEngagementMetricsDeliveryRetryCount() {
        this.bitField0_ &= -33;
        this.engagementMetricsDeliveryRetryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFiamSdkVersion() {
        this.bitField0_ &= -17;
        this.fiamSdkVersion_ = getDefaultInstance().getFiamSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProjectNumber() {
        this.bitField0_ &= -2;
        this.projectNumber_ = getDefaultInstance().getProjectNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(getClipMetadata getclipmetadata) {
        this.campaignId_ = getclipmetadata.MediaMetadataCompat();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTimestampMillis(long j) {
        this.bitField0_ |= 8;
        this.clientTimestampMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEngagementMetricsDeliveryRetryCount(int i) {
        this.bitField0_ |= 32;
        this.engagementMetricsDeliveryRetryCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFiamSdkVersionBytes(getClipMetadata getclipmetadata) {
        this.fiamSdkVersion_ = getclipmetadata.MediaMetadataCompat();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProjectNumberBytes(getClipMetadata getclipmetadata) {
        this.projectNumber_ = getclipmetadata.MediaMetadataCompat();
        this.bitField0_ |= 1;
    }

    public ClientAppInfo getClientApp() {
        ClientAppInfo clientAppInfo = this.clientApp_;
        return clientAppInfo == null ? ClientAppInfo.getDefaultInstance() : clientAppInfo;
    }

    public observeMeasureSnapshotReadsui getDismissType() {
        if (this.eventCase_ != 6) {
            return observeMeasureSnapshotReadsui.UNKNOWN_DISMISS_TYPE;
        }
        observeMeasureSnapshotReadsui observemeasuresnapshotreadsuiForNumber = observeMeasureSnapshotReadsui.forNumber(((Integer) this.event_).intValue());
        return observemeasuresnapshotreadsuiForNumber == null ? observeMeasureSnapshotReadsui.UNKNOWN_DISMISS_TYPE : observemeasuresnapshotreadsuiForNumber;
    }

    public observeReadsui getEventType() {
        if (this.eventCase_ != 5) {
            return observeReadsui.UNKNOWN_EVENT_TYPE;
        }
        observeReadsui observereadsuiForNumber = observeReadsui.forNumber(((Integer) this.event_).intValue());
        return observereadsuiForNumber == null ? observeReadsui.UNKNOWN_EVENT_TYPE : observereadsuiForNumber;
    }

    public PointerInputModifierNodeKt getRenderErrorReason() {
        if (this.eventCase_ != 7) {
            return PointerInputModifierNodeKt.UNSPECIFIED_RENDER_ERROR;
        }
        PointerInputModifierNodeKt pointerInputModifierNodeKtForNumber = PointerInputModifierNodeKt.forNumber(((Integer) this.event_).intValue());
        return pointerInputModifierNodeKtForNumber == null ? PointerInputModifierNodeKt.UNSPECIFIED_RENDER_ERROR : pointerInputModifierNodeKtForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDismissType() {
        if (this.eventCase_ == 6) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventType() {
        if (this.eventCase_ == 5) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderErrorReason() {
        if (this.eventCase_ == 7) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    public OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1 getFetchErrorReason() {
        if (this.eventCase_ != 8) {
            return OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1.UNSPECIFIED_FETCH_ERROR;
        }
        OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1 ownerSnapshotObserveronCommitAffectingLookaheadMeasure1ForNumber = OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1.forNumber(((Integer) this.event_).intValue());
        return ownerSnapshotObserveronCommitAffectingLookaheadMeasure1ForNumber == null ? OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1.UNSPECIFIED_FETCH_ERROR : ownerSnapshotObserveronCommitAffectingLookaheadMeasure1ForNumber;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFetchErrorReason() {
        if (this.eventCase_ == 8) {
            this.eventCase_ = 0;
            this.event_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDismissType(observeMeasureSnapshotReadsui observemeasuresnapshotreadsui) {
        this.event_ = Integer.valueOf(observemeasuresnapshotreadsui.getNumber());
        this.eventCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventType(observeReadsui observereadsui) {
        this.event_ = Integer.valueOf(observereadsui.getNumber());
        this.eventCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFetchErrorReason(OwnerSnapshotObserveronCommitAffectingLookaheadMeasure1 ownerSnapshotObserveronCommitAffectingLookaheadMeasure1) {
        this.event_ = Integer.valueOf(ownerSnapshotObserveronCommitAffectingLookaheadMeasure1.getNumber());
        this.eventCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderErrorReason(PointerInputModifierNodeKt pointerInputModifierNodeKt) {
        this.event_ = Integer.valueOf(pointerInputModifierNodeKt.getNumber());
        this.eventCase_ = 7;
    }

    public static getEnableExtraAssertions newBuilder(CampaignAnalytics campaignAnalytics) {
        return (getEnableExtraAssertions) DEFAULT_INSTANCE.createBuilder(campaignAnalytics);
    }

    public static CampaignAnalytics parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignAnalytics parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignAnalytics parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CampaignAnalytics parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignAnalytics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignAnalytics parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignAnalytics parseFrom(InputStream inputStream) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignAnalytics parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignAnalytics parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignAnalytics parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignAnalytics) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
