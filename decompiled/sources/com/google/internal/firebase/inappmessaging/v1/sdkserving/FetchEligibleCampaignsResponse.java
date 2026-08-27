package com.google.internal.firebase.inappmessaging.v1.sdkserving;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidPlatformTextInputSessionstartInputMethod1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accessgetHandlerp;
import o.accessgetMaindelegatecp;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchEligibleCampaignsResponse extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final FetchEligibleCampaignsResponse DEFAULT_INSTANCE;
    public static final int EXPIRATION_EPOCH_TIMESTAMP_MILLIS_FIELD_NUMBER = 2;
    public static final int MESSAGES_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private long expirationEpochTimestampMillis_;
    private decodeString messages_ = GeneratedMessageLite.emptyProtobufList();

    public static FetchEligibleCampaignsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpirationEpochTimestampMillis(long j) {
        this.expirationEpochTimestampMillis_ = j;
    }

    public long getExpirationEpochTimestampMillis() {
        return this.expirationEpochTimestampMillis_;
    }

    public List<CampaignProto$ThickContent> getMessagesList() {
        return this.messages_;
    }

    public List<? extends AndroidPlatformTextInputSessionstartInputMethod1> getMessagesOrBuilderList() {
        return this.messages_;
    }

    static {
        FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse = new FetchEligibleCampaignsResponse();
        DEFAULT_INSTANCE = fetchEligibleCampaignsResponse;
        GeneratedMessageLite.registerDefaultInstance(FetchEligibleCampaignsResponse.class, fetchEligibleCampaignsResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpirationEpochTimestampMillis() {
        this.expirationEpochTimestampMillis_ = 0L;
    }

    public static accessgetMaindelegatecp newBuilder() {
        return (accessgetMaindelegatecp) DEFAULT_INSTANCE.createBuilder();
    }

    public static FetchEligibleCampaignsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchEligibleCampaignsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetHandlerp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new FetchEligibleCampaignsResponse();
            case 2:
                return new accessgetMaindelegatecp(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"messages_", CampaignProto$ThickContent.class, "expirationEpochTimestampMillis_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (FetchEligibleCampaignsResponse.class) {
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

    public CampaignProto$ThickContent getMessages(int i) {
        return (CampaignProto$ThickContent) this.messages_.get(i);
    }

    public int getMessagesCount() {
        return this.messages_.size();
    }

    public AndroidPlatformTextInputSessionstartInputMethod1 getMessagesOrBuilder(int i) {
        return (AndroidPlatformTextInputSessionstartInputMethod1) this.messages_.get(i);
    }

    private FetchEligibleCampaignsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMessages(Iterable<? extends CampaignProto$ThickContent> iterable) {
        ensureMessagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.messages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(CampaignProto$ThickContent campaignProto$ThickContent) {
        campaignProto$ThickContent.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(campaignProto$ThickContent);
    }

    private void ensureMessagesIsMutable() {
        decodeString decodestring = this.messages_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.messages_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMessages(int i) {
        ensureMessagesIsMutable();
        this.messages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessages(int i, CampaignProto$ThickContent campaignProto$ThickContent) {
        campaignProto$ThickContent.getClass();
        ensureMessagesIsMutable();
        this.messages_.set(i, campaignProto$ThickContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessages() {
        this.messages_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static accessgetMaindelegatecp newBuilder(FetchEligibleCampaignsResponse fetchEligibleCampaignsResponse) {
        return (accessgetMaindelegatecp) DEFAULT_INSTANCE.createBuilder(fetchEligibleCampaignsResponse);
    }

    public static FetchEligibleCampaignsResponse parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static FetchEligibleCampaignsResponse parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static FetchEligibleCampaignsResponse parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static FetchEligibleCampaignsResponse parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMessages(int i, CampaignProto$ThickContent campaignProto$ThickContent) {
        campaignProto$ThickContent.getClass();
        ensureMessagesIsMutable();
        this.messages_.add(i, campaignProto$ThickContent);
    }

    public static FetchEligibleCampaignsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FetchEligibleCampaignsResponse parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static FetchEligibleCampaignsResponse parseFrom(InputStream inputStream) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FetchEligibleCampaignsResponse parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static FetchEligibleCampaignsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static FetchEligibleCampaignsResponse parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (FetchEligibleCampaignsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
