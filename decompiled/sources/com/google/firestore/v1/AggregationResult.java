package com.google.firestore.v1;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DrawableTransformation;
import o.component23;
import o.dumpRenderNodeData;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getTextForTextField;
import o.notifySubtreeAccessibilityStateChangedIfNeeded;
import o.performActionHelpercanScroll;

/* JADX INFO: loaded from: classes4.dex */
public final class AggregationResult extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
    private static final AggregationResult DEFAULT_INSTANCE;
    private static volatile component23 PARSER;
    private fromDpSizeitqla9I aggregateFields_ = fromDpSizeitqla9I.serializer;

    public static AggregationResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableAggregateFieldsMap() {
        return internalGetMutableAggregateFields();
    }

    private fromDpSizeitqla9I internalGetAggregateFields() {
        return this.aggregateFields_;
    }

    @Deprecated
    public Map<String, Value> getAggregateFields() {
        return getAggregateFieldsMap();
    }

    static {
        AggregationResult aggregationResult = new AggregationResult();
        DEFAULT_INSTANCE = aggregationResult;
        GeneratedMessageLite.registerDefaultInstance(AggregationResult.class, aggregationResult);
    }

    private fromDpSizeitqla9I internalGetMutableAggregateFields() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.aggregateFields_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.aggregateFields_ = fromdpsizeitqla9i.serializer();
        }
        return this.aggregateFields_;
    }

    public static performActionHelpercanScroll newBuilder() {
        return (performActionHelpercanScroll) DEFAULT_INSTANCE.createBuilder();
    }

    public static AggregationResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AggregationResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggregationResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getTextForTextField.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new AggregationResult();
            case 2:
                return new performActionHelpercanScroll(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"aggregateFields_", notifySubtreeAccessibilityStateChangedIfNeeded.read});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (AggregationResult.class) {
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

    private AggregationResult() {
    }

    public boolean containsAggregateFields(String str) {
        str.getClass();
        return internalGetAggregateFields().containsKey(str);
    }

    public Value getAggregateFieldsOrDefault(String str, Value value) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetAggregateFields = internalGetAggregateFields();
        return fromdpsizeitqla9iInternalGetAggregateFields.containsKey(str) ? (Value) fromdpsizeitqla9iInternalGetAggregateFields.get(str) : value;
    }

    public Value getAggregateFieldsOrThrow(String str) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetAggregateFields = internalGetAggregateFields();
        if (fromdpsizeitqla9iInternalGetAggregateFields.containsKey(str)) {
            return (Value) fromdpsizeitqla9iInternalGetAggregateFields.get(str);
        }
        DrawableTransformation.write();
        return null;
    }

    public int getAggregateFieldsCount() {
        return internalGetAggregateFields().size();
    }

    public Map<String, Value> getAggregateFieldsMap() {
        return Collections.unmodifiableMap(internalGetAggregateFields());
    }

    public static performActionHelpercanScroll newBuilder(AggregationResult aggregationResult) {
        return (performActionHelpercanScroll) DEFAULT_INSTANCE.createBuilder(aggregationResult);
    }

    public static AggregationResult parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (AggregationResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static AggregationResult parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static AggregationResult parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static AggregationResult parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static AggregationResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AggregationResult parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static AggregationResult parseFrom(InputStream inputStream) throws IOException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AggregationResult parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static AggregationResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AggregationResult parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (AggregationResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
