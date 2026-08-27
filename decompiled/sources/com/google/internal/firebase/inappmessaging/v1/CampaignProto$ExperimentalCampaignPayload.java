package com.google.internal.firebase.inappmessaging.v1;

import com.google.firebase.inappmessaging.ExperimentPayloadProto$ExperimentPayload;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidFontResourceLoaderHelper;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.OwnerSnapshotObserveronCommitAffectingLayout1;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.startInputMethod;

/* JADX INFO: loaded from: classes2.dex */
public final class CampaignProto$ExperimentalCampaignPayload extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final CampaignProto$ExperimentalCampaignPayload DEFAULT_INSTANCE;
    public static final int EXPERIMENT_PAYLOAD_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private int bitField0_;
    private long campaignEndTimeMillis_;
    private String campaignId_ = "";
    private String campaignName_ = "";
    private long campaignStartTimeMillis_;
    private ExperimentPayloadProto$ExperimentPayload experimentPayload_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentPayload() {
        this.experimentPayload_ = null;
        this.bitField0_ &= -2;
    }

    public static CampaignProto$ExperimentalCampaignPayload getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignEndTimeMillis(long j) {
        this.campaignEndTimeMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignStartTimeMillis(long j) {
        this.campaignStartTimeMillis_ = j;
    }

    public long getCampaignEndTimeMillis() {
        return this.campaignEndTimeMillis_;
    }

    public String getCampaignId() {
        return this.campaignId_;
    }

    public String getCampaignName() {
        return this.campaignName_;
    }

    public long getCampaignStartTimeMillis() {
        return this.campaignStartTimeMillis_;
    }

    public boolean hasExperimentPayload() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload = new CampaignProto$ExperimentalCampaignPayload();
        DEFAULT_INSTANCE = campaignProto$ExperimentalCampaignPayload;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$ExperimentalCampaignPayload.class, campaignProto$ExperimentalCampaignPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignEndTimeMillis() {
        this.campaignEndTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignStartTimeMillis() {
        this.campaignStartTimeMillis_ = 0L;
    }

    public static startInputMethod newBuilder() {
        return (startInputMethod) DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$ExperimentalCampaignPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidFontResourceLoaderHelper.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CampaignProto$ExperimentalCampaignPayload();
            case 2:
                return new startInputMethod(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"bitField0_", "campaignId_", "experimentPayload_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CampaignProto$ExperimentalCampaignPayload.class) {
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

    public getClipMetadata getCampaignNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.campaignName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExperimentPayload(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        experimentPayloadProto$ExperimentPayload.getClass();
        ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload2 = this.experimentPayload_;
        if (experimentPayloadProto$ExperimentPayload2 == null || experimentPayloadProto$ExperimentPayload2 == ExperimentPayloadProto$ExperimentPayload.getDefaultInstance()) {
            this.experimentPayload_ = experimentPayloadProto$ExperimentPayload;
        } else {
            OwnerSnapshotObserveronCommitAffectingLayout1 ownerSnapshotObserveronCommitAffectingLayout1NewBuilder = ExperimentPayloadProto$ExperimentPayload.newBuilder(this.experimentPayload_);
            ownerSnapshotObserveronCommitAffectingLayout1NewBuilder.read(experimentPayloadProto$ExperimentPayload);
            this.experimentPayload_ = (ExperimentPayloadProto$ExperimentPayload) ownerSnapshotObserveronCommitAffectingLayout1NewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignId(String str) {
        str.getClass();
        this.campaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.campaignId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignName(String str) {
        str.getClass();
        this.campaignName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCampaignNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.campaignName_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentPayload(ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload) {
        experimentPayloadProto$ExperimentPayload.getClass();
        this.experimentPayload_ = experimentPayloadProto$ExperimentPayload;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignName() {
        this.campaignName_ = getDefaultInstance().getCampaignName();
    }

    public ExperimentPayloadProto$ExperimentPayload getExperimentPayload() {
        ExperimentPayloadProto$ExperimentPayload experimentPayloadProto$ExperimentPayload = this.experimentPayload_;
        return experimentPayloadProto$ExperimentPayload == null ? ExperimentPayloadProto$ExperimentPayload.getDefaultInstance() : experimentPayloadProto$ExperimentPayload;
    }

    private CampaignProto$ExperimentalCampaignPayload() {
    }

    public static startInputMethod newBuilder(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        return (startInputMethod) DEFAULT_INSTANCE.createBuilder(campaignProto$ExperimentalCampaignPayload);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$ExperimentalCampaignPayload parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ExperimentalCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
