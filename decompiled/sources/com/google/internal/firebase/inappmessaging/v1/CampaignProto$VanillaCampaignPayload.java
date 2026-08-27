package com.google.internal.firebase.inappmessaging.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidFontResourceLoaderHelper;
import o.AndroidPlatformTextInputSessionstartInputMethod2;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public final class CampaignProto$VanillaCampaignPayload extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CAMPAIGN_END_TIME_MILLIS_FIELD_NUMBER = 4;
    public static final int CAMPAIGN_ID_FIELD_NUMBER = 1;
    public static final int CAMPAIGN_NAME_FIELD_NUMBER = 5;
    public static final int CAMPAIGN_START_TIME_MILLIS_FIELD_NUMBER = 3;
    private static final CampaignProto$VanillaCampaignPayload DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_CAMPAIGN_ID_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private long campaignEndTimeMillis_;
    private long campaignStartTimeMillis_;
    private String campaignId_ = "";
    private String experimentalCampaignId_ = "";
    private String campaignName_ = "";

    public static CampaignProto$VanillaCampaignPayload getDefaultInstance() {
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

    public String getExperimentalCampaignId() {
        return this.experimentalCampaignId_;
    }

    static {
        CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload = new CampaignProto$VanillaCampaignPayload();
        DEFAULT_INSTANCE = campaignProto$VanillaCampaignPayload;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$VanillaCampaignPayload.class, campaignProto$VanillaCampaignPayload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignEndTimeMillis() {
        this.campaignEndTimeMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignStartTimeMillis() {
        this.campaignStartTimeMillis_ = 0L;
    }

    public static AndroidPlatformTextInputSessionstartInputMethod2 newBuilder() {
        return (AndroidPlatformTextInputSessionstartInputMethod2) DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$VanillaCampaignPayload parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidFontResourceLoaderHelper.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CampaignProto$VanillaCampaignPayload();
            case 2:
                return new AndroidPlatformTextInputSessionstartInputMethod2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0002\u0005Ȉ", new Object[]{"campaignId_", "experimentalCampaignId_", "campaignStartTimeMillis_", "campaignEndTimeMillis_", "campaignName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CampaignProto$VanillaCampaignPayload.class) {
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

    public getClipMetadata getExperimentalCampaignIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.experimentalCampaignId_);
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
    public void setExperimentalCampaignId(String str) {
        str.getClass();
        this.experimentalCampaignId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalCampaignIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.experimentalCampaignId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignId() {
        this.campaignId_ = getDefaultInstance().getCampaignId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCampaignName() {
        this.campaignName_ = getDefaultInstance().getCampaignName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalCampaignId() {
        this.experimentalCampaignId_ = getDefaultInstance().getExperimentalCampaignId();
    }

    private CampaignProto$VanillaCampaignPayload() {
    }

    public static AndroidPlatformTextInputSessionstartInputMethod2 newBuilder(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        return (AndroidPlatformTextInputSessionstartInputMethod2) DEFAULT_INSTANCE.createBuilder(campaignProto$VanillaCampaignPayload);
    }

    public static CampaignProto$VanillaCampaignPayload parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$VanillaCampaignPayload parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$VanillaCampaignPayload) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
