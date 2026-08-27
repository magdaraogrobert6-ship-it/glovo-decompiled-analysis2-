package com.google.internal.firebase.inappmessaging.v1;

import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.firebase.inappmessaging.MessagesProto$Content;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.AndroidFontResourceLoaderHelper;
import o.AndroidPlatformTextInputSessionstartInputMethod1;
import o.AndroidPlatformTextInputSessionstartInputMethod2;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DrawableTransformation;
import o.PointerInputModifierNode;
import o.clearInvalidObservationsui;
import o.clearui;
import o.component23;
import o.createInputConnection;
import o.decodeString;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.isReadyForConnection;
import o.startInputMethod;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class CampaignProto$ThickContent extends GeneratedMessageLite implements AndroidPlatformTextInputSessionstartInputMethod1 {
    public static final int CONTENT_FIELD_NUMBER = 3;
    public static final int DATA_BUNDLE_FIELD_NUMBER = 8;
    private static final CampaignProto$ThickContent DEFAULT_INSTANCE;
    public static final int EXPERIMENTAL_PAYLOAD_FIELD_NUMBER = 2;
    public static final int IS_TEST_CAMPAIGN_FIELD_NUMBER = 7;
    private static volatile component23 PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 4;
    public static final int TRIGGERING_CONDITIONS_FIELD_NUMBER = 5;
    public static final int VANILLA_PAYLOAD_FIELD_NUMBER = 1;
    private int bitField0_;
    private MessagesProto$Content content_;
    private boolean isTestCampaign_;
    private Object payload_;
    private CommonTypesProto$Priority priority_;
    private int payloadCase_ = 0;
    private fromDpSizeitqla9I dataBundle_ = fromDpSizeitqla9I.serializer;
    private decodeString triggeringConditions_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTestCampaign() {
        this.isTestCampaign_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = null;
        this.bitField0_ &= -3;
    }

    public static CampaignProto$ThickContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableDataBundleMap() {
        return internalGetMutableDataBundle();
    }

    private fromDpSizeitqla9I internalGetDataBundle() {
        return this.dataBundle_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTestCampaign(boolean z) {
        this.isTestCampaign_ = z;
    }

    @Deprecated
    public Map<String, String> getDataBundle() {
        return getDataBundleMap();
    }

    public boolean getIsTestCampaign() {
        return this.isTestCampaign_;
    }

    public List<CommonTypesProto$TriggeringCondition> getTriggeringConditionsList() {
        return this.triggeringConditions_;
    }

    public List<? extends clearInvalidObservationsui> getTriggeringConditionsOrBuilderList() {
        return this.triggeringConditions_;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasExperimentalPayload() {
        return this.payloadCase_ == 2;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasVanillaPayload() {
        return this.payloadCase_ == 1;
    }

    public enum write {
        VANILLA_PAYLOAD(1),
        EXPERIMENTAL_PAYLOAD(2),
        PAYLOAD_NOT_SET(0);

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
                return PAYLOAD_NOT_SET;
            }
            if (i == 1) {
                return VANILLA_PAYLOAD;
            }
            if (i != 2) {
                return null;
            }
            return EXPERIMENTAL_PAYLOAD;
        }
    }

    static {
        CampaignProto$ThickContent campaignProto$ThickContent = new CampaignProto$ThickContent();
        DEFAULT_INSTANCE = campaignProto$ThickContent;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$ThickContent.class, campaignProto$ThickContent);
    }

    private fromDpSizeitqla9I internalGetMutableDataBundle() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.dataBundle_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.dataBundle_ = fromdpsizeitqla9i.serializer();
        }
        return this.dataBundle_;
    }

    public static isReadyForConnection newBuilder() {
        return (isReadyForConnection) DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$ThickContent parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ThickContent parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidFontResourceLoaderHelper.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CampaignProto$ThickContent();
            case 2:
                return new isReadyForConnection();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\b\u0007\u0001\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0007\u0007\b2", new Object[]{"payload_", "payloadCase_", "bitField0_", CampaignProto$VanillaCampaignPayload.class, CampaignProto$ExperimentalCampaignPayload.class, "content_", "priority_", "triggeringConditions_", CommonTypesProto$TriggeringCondition.class, "isTestCampaign_", "dataBundle_", createInputConnection.serializer});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CampaignProto$ThickContent.class) {
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

    public write getPayloadCase() {
        return write.forNumber(this.payloadCase_);
    }

    public CommonTypesProto$TriggeringCondition getTriggeringConditions(int i) {
        return (CommonTypesProto$TriggeringCondition) this.triggeringConditions_.get(i);
    }

    public int getTriggeringConditionsCount() {
        return this.triggeringConditions_.size();
    }

    public clearInvalidObservationsui getTriggeringConditionsOrBuilder(int i) {
        return (clearInvalidObservationsui) this.triggeringConditions_.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTriggeringConditions(Iterable<? extends CommonTypesProto$TriggeringCondition> iterable) {
        ensureTriggeringConditionsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.triggeringConditions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggeringConditions(CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        commonTypesProto$TriggeringCondition.getClass();
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.add(commonTypesProto$TriggeringCondition);
    }

    private void ensureTriggeringConditionsIsMutable() {
        decodeString decodestring = this.triggeringConditions_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.triggeringConditions_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(MessagesProto$Content messagesProto$Content) {
        messagesProto$Content.getClass();
        MessagesProto$Content messagesProto$Content2 = this.content_;
        if (messagesProto$Content2 == null || messagesProto$Content2 == MessagesProto$Content.getDefaultInstance()) {
            this.content_ = messagesProto$Content;
        } else {
            PointerInputModifierNode pointerInputModifierNodeNewBuilder = MessagesProto$Content.newBuilder(this.content_);
            pointerInputModifierNodeNewBuilder.read(messagesProto$Content);
            this.content_ = (MessagesProto$Content) pointerInputModifierNodeNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeExperimentalPayload(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        campaignProto$ExperimentalCampaignPayload.getClass();
        if (this.payloadCase_ != 2 || this.payload_ == CampaignProto$ExperimentalCampaignPayload.getDefaultInstance()) {
            this.payload_ = campaignProto$ExperimentalCampaignPayload;
        } else {
            startInputMethod startinputmethodNewBuilder = CampaignProto$ExperimentalCampaignPayload.newBuilder((CampaignProto$ExperimentalCampaignPayload) this.payload_);
            startinputmethodNewBuilder.read(campaignProto$ExperimentalCampaignPayload);
            this.payload_ = startinputmethodNewBuilder.read();
        }
        this.payloadCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        commonTypesProto$Priority.getClass();
        CommonTypesProto$Priority commonTypesProto$Priority2 = this.priority_;
        if (commonTypesProto$Priority2 == null || commonTypesProto$Priority2 == CommonTypesProto$Priority.getDefaultInstance()) {
            this.priority_ = commonTypesProto$Priority;
        } else {
            clearui clearuiVarNewBuilder = CommonTypesProto$Priority.newBuilder(this.priority_);
            clearuiVarNewBuilder.read(commonTypesProto$Priority);
            this.priority_ = (CommonTypesProto$Priority) clearuiVarNewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVanillaPayload(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        campaignProto$VanillaCampaignPayload.getClass();
        if (this.payloadCase_ != 1 || this.payload_ == CampaignProto$VanillaCampaignPayload.getDefaultInstance()) {
            this.payload_ = campaignProto$VanillaCampaignPayload;
        } else {
            AndroidPlatformTextInputSessionstartInputMethod2 androidPlatformTextInputSessionstartInputMethod2NewBuilder = CampaignProto$VanillaCampaignPayload.newBuilder((CampaignProto$VanillaCampaignPayload) this.payload_);
            androidPlatformTextInputSessionstartInputMethod2NewBuilder.read(campaignProto$VanillaCampaignPayload);
            this.payload_ = androidPlatformTextInputSessionstartInputMethod2NewBuilder.read();
        }
        this.payloadCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTriggeringConditions(int i) {
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(MessagesProto$Content messagesProto$Content) {
        messagesProto$Content.getClass();
        this.content_ = messagesProto$Content;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentalPayload(CampaignProto$ExperimentalCampaignPayload campaignProto$ExperimentalCampaignPayload) {
        campaignProto$ExperimentalCampaignPayload.getClass();
        this.payload_ = campaignProto$ExperimentalCampaignPayload;
        this.payloadCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        commonTypesProto$Priority.getClass();
        this.priority_ = commonTypesProto$Priority;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringConditions(int i, CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        commonTypesProto$TriggeringCondition.getClass();
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.set(i, commonTypesProto$TriggeringCondition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVanillaPayload(CampaignProto$VanillaCampaignPayload campaignProto$VanillaCampaignPayload) {
        campaignProto$VanillaCampaignPayload.getClass();
        this.payload_ = campaignProto$VanillaCampaignPayload;
        this.payloadCase_ = 1;
    }

    public boolean containsDataBundle(String str) {
        str.getClass();
        return internalGetDataBundle().containsKey(str);
    }

    public String getDataBundleOrDefault(String str, String str2) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetDataBundle = internalGetDataBundle();
        return fromdpsizeitqla9iInternalGetDataBundle.containsKey(str) ? (String) fromdpsizeitqla9iInternalGetDataBundle.get(str) : str2;
    }

    public String getDataBundleOrThrow(String str) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetDataBundle = internalGetDataBundle();
        if (fromdpsizeitqla9iInternalGetDataBundle.containsKey(str)) {
            return (String) fromdpsizeitqla9iInternalGetDataBundle.get(str);
        }
        DrawableTransformation.write();
        return null;
    }

    private CampaignProto$ThickContent() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringConditions() {
        this.triggeringConditions_ = GeneratedMessageLite.emptyProtobufList();
    }

    public MessagesProto$Content getContent() {
        MessagesProto$Content messagesProto$Content = this.content_;
        return messagesProto$Content == null ? MessagesProto$Content.getDefaultInstance() : messagesProto$Content;
    }

    public int getDataBundleCount() {
        return internalGetDataBundle().size();
    }

    public Map<String, String> getDataBundleMap() {
        return Collections.unmodifiableMap(internalGetDataBundle());
    }

    public CommonTypesProto$Priority getPriority() {
        CommonTypesProto$Priority commonTypesProto$Priority = this.priority_;
        return commonTypesProto$Priority == null ? CommonTypesProto$Priority.getDefaultInstance() : commonTypesProto$Priority;
    }

    public CampaignProto$ExperimentalCampaignPayload getExperimentalPayload() {
        return this.payloadCase_ == 2 ? (CampaignProto$ExperimentalCampaignPayload) this.payload_ : CampaignProto$ExperimentalCampaignPayload.getDefaultInstance();
    }

    public CampaignProto$VanillaCampaignPayload getVanillaPayload() {
        return this.payloadCase_ == 1 ? (CampaignProto$VanillaCampaignPayload) this.payload_ : CampaignProto$VanillaCampaignPayload.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentalPayload() {
        if (this.payloadCase_ == 2) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVanillaPayload() {
        if (this.payloadCase_ == 1) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    public static isReadyForConnection newBuilder(CampaignProto$ThickContent campaignProto$ThickContent) {
        return (isReadyForConnection) DEFAULT_INSTANCE.createBuilder(campaignProto$ThickContent);
    }

    public static CampaignProto$ThickContent parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ThickContent parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ThickContent parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CampaignProto$ThickContent parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggeringConditions(int i, CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition) {
        commonTypesProto$TriggeringCondition.getClass();
        ensureTriggeringConditionsIsMutable();
        this.triggeringConditions_.add(i, commonTypesProto$TriggeringCondition);
    }

    public static CampaignProto$ThickContent parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$ThickContent parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ThickContent parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ThickContent parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ThickContent parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$ThickContent parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ThickContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
