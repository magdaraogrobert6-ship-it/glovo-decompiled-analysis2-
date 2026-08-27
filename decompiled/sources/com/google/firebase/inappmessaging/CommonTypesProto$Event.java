package com.google.firebase.inappmessaging;

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
import o.accessgetObserverp;
import o.accessgetOnCommitAffectingLookaheadp;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.observeLayoutModifierSnapshotReadsui;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonTypesProto$Event extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int COUNT_FIELD_NUMBER = 5;
    private static final CommonTypesProto$Event DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int PREVIOUS_TIMESTAMP_MILLIS_FIELD_NUMBER = 4;
    public static final int TIMESTAMP_MILLIS_FIELD_NUMBER = 3;
    public static final int TRIGGER_PARAMS_FIELD_NUMBER = 1;
    private int count_;
    private long previousTimestampMillis_;
    private long timestampMillis_;
    private decodeString triggerParams_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    public static CommonTypesProto$Event getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i) {
        this.count_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviousTimestampMillis(long j) {
        this.previousTimestampMillis_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestampMillis(long j) {
        this.timestampMillis_ = j;
    }

    public int getCount() {
        return this.count_;
    }

    public String getName() {
        return this.name_;
    }

    public long getPreviousTimestampMillis() {
        return this.previousTimestampMillis_;
    }

    public long getTimestampMillis() {
        return this.timestampMillis_;
    }

    public List<CommonTypesProto$TriggerParam> getTriggerParamsList() {
        return this.triggerParams_;
    }

    public List<? extends observeLayoutModifierSnapshotReadsui> getTriggerParamsOrBuilderList() {
        return this.triggerParams_;
    }

    static {
        CommonTypesProto$Event commonTypesProto$Event = new CommonTypesProto$Event();
        DEFAULT_INSTANCE = commonTypesProto$Event;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$Event.class, commonTypesProto$Event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviousTimestampMillis() {
        this.previousTimestampMillis_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestampMillis() {
        this.timestampMillis_ = 0L;
    }

    public static accessgetOnCommitAffectingLookaheadp newBuilder() {
        return (accessgetOnCommitAffectingLookaheadp) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$Event parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$Event parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetObserverp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CommonTypesProto$Event();
            case 2:
                return new accessgetOnCommitAffectingLookaheadp(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003\u0002\u0004\u0002\u0005\u0004", new Object[]{"triggerParams_", CommonTypesProto$TriggerParam.class, "name_", "timestampMillis_", "previousTimestampMillis_", "count_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CommonTypesProto$Event.class) {
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

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
    }

    public CommonTypesProto$TriggerParam getTriggerParams(int i) {
        return (CommonTypesProto$TriggerParam) this.triggerParams_.get(i);
    }

    public int getTriggerParamsCount() {
        return this.triggerParams_.size();
    }

    public observeLayoutModifierSnapshotReadsui getTriggerParamsOrBuilder(int i) {
        return (observeLayoutModifierSnapshotReadsui) this.triggerParams_.get(i);
    }

    private CommonTypesProto$Event() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTriggerParams(Iterable<? extends CommonTypesProto$TriggerParam> iterable) {
        ensureTriggerParamsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.triggerParams_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggerParams(CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        commonTypesProto$TriggerParam.getClass();
        ensureTriggerParamsIsMutable();
        this.triggerParams_.add(commonTypesProto$TriggerParam);
    }

    private void ensureTriggerParamsIsMutable() {
        decodeString decodestring = this.triggerParams_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.triggerParams_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTriggerParams(int i) {
        ensureTriggerParamsIsMutable();
        this.triggerParams_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.name_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerParams(int i, CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        commonTypesProto$TriggerParam.getClass();
        ensureTriggerParamsIsMutable();
        this.triggerParams_.set(i, commonTypesProto$TriggerParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerParams() {
        this.triggerParams_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static accessgetOnCommitAffectingLookaheadp newBuilder(CommonTypesProto$Event commonTypesProto$Event) {
        return (accessgetOnCommitAffectingLookaheadp) DEFAULT_INSTANCE.createBuilder(commonTypesProto$Event);
    }

    public static CommonTypesProto$Event parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$Event parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$Event parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CommonTypesProto$Event parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTriggerParams(int i, CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        commonTypesProto$TriggerParam.getClass();
        ensureTriggerParamsIsMutable();
        this.triggerParams_.add(i, commonTypesProto$TriggerParam);
    }

    public static CommonTypesProto$Event parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$Event parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$Event parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$Event parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$Event parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$Event parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$Event) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
