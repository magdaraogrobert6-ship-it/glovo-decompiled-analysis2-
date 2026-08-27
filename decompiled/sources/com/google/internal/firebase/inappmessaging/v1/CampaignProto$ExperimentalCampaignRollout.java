package com.google.internal.firebase.inappmessaging.v1;

import com.google.firebase.inappmessaging.CommonTypesProto$CampaignTime;
import com.google.firebase.inappmessaging.CommonTypesProto$Priority;
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
import o.accessgetOnCommitAffectingLayoutModifierp;
import o.accessgetTextInputServicep;
import o.clearui;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes4.dex */
public final class CampaignProto$ExperimentalCampaignRollout extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final CampaignProto$ExperimentalCampaignRollout DEFAULT_INSTANCE;
    public static final int END_TIME_FIELD_NUMBER = 5;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int PRIORITY_FIELD_NUMBER = 3;
    public static final int SELECTED_VARIANT_INDEX_FIELD_NUMBER = 2;
    public static final int START_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private CommonTypesProto$CampaignTime endTime_;
    private String experimentId_ = "";
    private CommonTypesProto$Priority priority_;
    private int selectedVariantIndex_;
    private CommonTypesProto$CampaignTime startTime_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndTime() {
        this.endTime_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.priority_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelectedVariantIndex() {
        this.selectedVariantIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStartTime() {
        this.startTime_ = null;
        this.bitField0_ &= -3;
    }

    public static CampaignProto$ExperimentalCampaignRollout getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectedVariantIndex(int i) {
        this.selectedVariantIndex_ = i;
    }

    public String getExperimentId() {
        return this.experimentId_;
    }

    public int getSelectedVariantIndex() {
        return this.selectedVariantIndex_;
    }

    public boolean hasEndTime() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasStartTime() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        CampaignProto$ExperimentalCampaignRollout campaignProto$ExperimentalCampaignRollout = new CampaignProto$ExperimentalCampaignRollout();
        DEFAULT_INSTANCE = campaignProto$ExperimentalCampaignRollout;
        GeneratedMessageLite.registerDefaultInstance(CampaignProto$ExperimentalCampaignRollout.class, campaignProto$ExperimentalCampaignRollout);
    }

    public static accessgetTextInputServicep newBuilder() {
        return (accessgetTextInputServicep) DEFAULT_INSTANCE.createBuilder();
    }

    public static CampaignProto$ExperimentalCampaignRollout parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidFontResourceLoaderHelper.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CampaignProto$ExperimentalCampaignRollout();
            case 2:
                return new accessgetTextInputServicep(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "experimentId_", "selectedVariantIndex_", "priority_", "startTime_", "endTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CampaignProto$ExperimentalCampaignRollout.class) {
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

    public getClipMetadata getExperimentIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.experimentId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeEndTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime2 = this.endTime_;
        if (commonTypesProto$CampaignTime2 == null || commonTypesProto$CampaignTime2 == CommonTypesProto$CampaignTime.getDefaultInstance()) {
            this.endTime_ = commonTypesProto$CampaignTime;
        } else {
            accessgetOnCommitAffectingLayoutModifierp accessgetoncommitaffectinglayoutmodifierpNewBuilder = CommonTypesProto$CampaignTime.newBuilder(this.endTime_);
            accessgetoncommitaffectinglayoutmodifierpNewBuilder.read(commonTypesProto$CampaignTime);
            this.endTime_ = (CommonTypesProto$CampaignTime) accessgetoncommitaffectinglayoutmodifierpNewBuilder.read();
        }
        this.bitField0_ |= 4;
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
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStartTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime2 = this.startTime_;
        if (commonTypesProto$CampaignTime2 == null || commonTypesProto$CampaignTime2 == CommonTypesProto$CampaignTime.getDefaultInstance()) {
            this.startTime_ = commonTypesProto$CampaignTime;
        } else {
            accessgetOnCommitAffectingLayoutModifierp accessgetoncommitaffectinglayoutmodifierpNewBuilder = CommonTypesProto$CampaignTime.newBuilder(this.startTime_);
            accessgetoncommitaffectinglayoutmodifierpNewBuilder.read(commonTypesProto$CampaignTime);
            this.startTime_ = (CommonTypesProto$CampaignTime) accessgetoncommitaffectinglayoutmodifierpNewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        this.endTime_ = commonTypesProto$CampaignTime;
        this.bitField0_ |= 4;
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
    public void setPriority(CommonTypesProto$Priority commonTypesProto$Priority) {
        commonTypesProto$Priority.getClass();
        this.priority_ = commonTypesProto$Priority;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStartTime(CommonTypesProto$CampaignTime commonTypesProto$CampaignTime) {
        commonTypesProto$CampaignTime.getClass();
        this.startTime_ = commonTypesProto$CampaignTime;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentId() {
        this.experimentId_ = getDefaultInstance().getExperimentId();
    }

    public CommonTypesProto$CampaignTime getEndTime() {
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime = this.endTime_;
        return commonTypesProto$CampaignTime == null ? CommonTypesProto$CampaignTime.getDefaultInstance() : commonTypesProto$CampaignTime;
    }

    public CommonTypesProto$Priority getPriority() {
        CommonTypesProto$Priority commonTypesProto$Priority = this.priority_;
        return commonTypesProto$Priority == null ? CommonTypesProto$Priority.getDefaultInstance() : commonTypesProto$Priority;
    }

    public CommonTypesProto$CampaignTime getStartTime() {
        CommonTypesProto$CampaignTime commonTypesProto$CampaignTime = this.startTime_;
        return commonTypesProto$CampaignTime == null ? CommonTypesProto$CampaignTime.getDefaultInstance() : commonTypesProto$CampaignTime;
    }

    private CampaignProto$ExperimentalCampaignRollout() {
    }

    public static accessgetTextInputServicep newBuilder(CampaignProto$ExperimentalCampaignRollout campaignProto$ExperimentalCampaignRollout) {
        return (accessgetTextInputServicep) DEFAULT_INSTANCE.createBuilder(campaignProto$ExperimentalCampaignRollout);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(InputStream inputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CampaignProto$ExperimentalCampaignRollout parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CampaignProto$ExperimentalCampaignRollout) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
