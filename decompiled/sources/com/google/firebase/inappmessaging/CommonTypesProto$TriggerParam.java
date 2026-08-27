package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accessgetObserverp;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.observeLayoutModifierSnapshotReadsui;
import o.observeLayoutSnapshotReadsAffectingLookaheadui;

/* JADX INFO: loaded from: classes2.dex */
public final class CommonTypesProto$TriggerParam extends GeneratedMessageLite implements observeLayoutModifierSnapshotReadsui {
    private static final CommonTypesProto$TriggerParam DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 5;
    public static final int FLOAT_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 2;
    private double doubleValue_;
    private float floatValue_;
    private long intValue_;
    private String name_ = "";
    private String stringValue_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFloatValue() {
        this.floatValue_ = 0.0f;
    }

    public static CommonTypesProto$TriggerParam getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d) {
        this.doubleValue_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFloatValue(float f) {
        this.floatValue_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntValue(long j) {
        this.intValue_ = j;
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public float getFloatValue() {
        return this.floatValue_;
    }

    public long getIntValue() {
        return this.intValue_;
    }

    public String getName() {
        return this.name_;
    }

    public String getStringValue() {
        return this.stringValue_;
    }

    static {
        CommonTypesProto$TriggerParam commonTypesProto$TriggerParam = new CommonTypesProto$TriggerParam();
        DEFAULT_INSTANCE = commonTypesProto$TriggerParam;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$TriggerParam.class, commonTypesProto$TriggerParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.doubleValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntValue() {
        this.intValue_ = 0L;
    }

    public static observeLayoutSnapshotReadsAffectingLookaheadui newBuilder() {
        return (observeLayoutSnapshotReadsAffectingLookaheadui) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$TriggerParam parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggerParam parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetObserverp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CommonTypesProto$TriggerParam();
            case 2:
                return new observeLayoutSnapshotReadsAffectingLookaheadui(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\u0001\u0005\u0000", new Object[]{"name_", "stringValue_", "intValue_", "floatValue_", "doubleValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CommonTypesProto$TriggerParam.class) {
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

    public getClipMetadata getStringValueBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.stringValue_);
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
    public void setStringValue(String str) {
        str.getClass();
        this.stringValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.stringValue_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    private CommonTypesProto$TriggerParam() {
    }

    public static observeLayoutSnapshotReadsAffectingLookaheadui newBuilder(CommonTypesProto$TriggerParam commonTypesProto$TriggerParam) {
        return (observeLayoutSnapshotReadsAffectingLookaheadui) DEFAULT_INSTANCE.createBuilder(commonTypesProto$TriggerParam);
    }

    public static CommonTypesProto$TriggerParam parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggerParam parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggerParam parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CommonTypesProto$TriggerParam parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggerParam parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$TriggerParam parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggerParam parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$TriggerParam parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$TriggerParam parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$TriggerParam parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$TriggerParam) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
