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
import o.accessisScreenReaderFocusable;
import o.accesssetTraversalValues;
import o.component23;
import o.createStateDescriptionForTextField;
import o.dumpRenderNodeData;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getFromIndex;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public final class StructuredPipeline extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final StructuredPipeline DEFAULT_INSTANCE;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int PIPELINE_FIELD_NUMBER = 1;
    private int bitField0_;
    private fromDpSizeitqla9I options_ = fromDpSizeitqla9I.serializer;
    private Pipeline pipeline_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPipeline() {
        this.pipeline_ = null;
        this.bitField0_ &= -2;
    }

    public static StructuredPipeline getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableOptionsMap() {
        return internalGetMutableOptions();
    }

    private fromDpSizeitqla9I internalGetOptions() {
        return this.options_;
    }

    @Deprecated
    public Map<String, Value> getOptions() {
        return getOptionsMap();
    }

    public boolean hasPipeline() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        StructuredPipeline structuredPipeline = new StructuredPipeline();
        DEFAULT_INSTANCE = structuredPipeline;
        GeneratedMessageLite.registerDefaultInstance(StructuredPipeline.class, structuredPipeline);
    }

    private fromDpSizeitqla9I internalGetMutableOptions() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.options_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.options_ = fromdpsizeitqla9i.serializer();
        }
        return this.options_;
    }

    public static accesssetTraversalValues newBuilder() {
        return (accesssetTraversalValues) DEFAULT_INSTANCE.createBuilder();
    }

    public static StructuredPipeline parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StructuredPipeline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StructuredPipeline parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessisScreenReaderFocusable.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new StructuredPipeline();
            case 2:
                return new accesssetTraversalValues(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "pipeline_", "options_", createStateDescriptionForTextField.RemoteActionCompatParcelizer});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (StructuredPipeline.class) {
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

    private StructuredPipeline() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePipeline(Pipeline pipeline) {
        pipeline.getClass();
        Pipeline pipeline2 = this.pipeline_;
        if (pipeline2 == null || pipeline2 == Pipeline.getDefaultInstance()) {
            this.pipeline_ = pipeline;
        } else {
            getFromIndex getfromindexNewBuilder = Pipeline.newBuilder(this.pipeline_);
            getfromindexNewBuilder.read(pipeline);
            this.pipeline_ = (Pipeline) getfromindexNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPipeline(Pipeline pipeline) {
        pipeline.getClass();
        this.pipeline_ = pipeline;
        this.bitField0_ |= 1;
    }

    public boolean containsOptions(String str) {
        str.getClass();
        return internalGetOptions().containsKey(str);
    }

    public Value getOptionsOrDefault(String str, Value value) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetOptions = internalGetOptions();
        return fromdpsizeitqla9iInternalGetOptions.containsKey(str) ? (Value) fromdpsizeitqla9iInternalGetOptions.get(str) : value;
    }

    public Value getOptionsOrThrow(String str) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetOptions = internalGetOptions();
        if (fromdpsizeitqla9iInternalGetOptions.containsKey(str)) {
            return (Value) fromdpsizeitqla9iInternalGetOptions.get(str);
        }
        DrawableTransformation.write();
        return null;
    }

    public int getOptionsCount() {
        return internalGetOptions().size();
    }

    public Map<String, Value> getOptionsMap() {
        return Collections.unmodifiableMap(internalGetOptions());
    }

    public Pipeline getPipeline() {
        Pipeline pipeline = this.pipeline_;
        return pipeline == null ? Pipeline.getDefaultInstance() : pipeline;
    }

    public static accesssetTraversalValues newBuilder(StructuredPipeline structuredPipeline) {
        return (accesssetTraversalValues) DEFAULT_INSTANCE.createBuilder(structuredPipeline);
    }

    public static StructuredPipeline parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredPipeline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredPipeline parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredPipeline parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static StructuredPipeline parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredPipeline parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StructuredPipeline parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredPipeline parseFrom(InputStream inputStream) throws IOException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StructuredPipeline parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static StructuredPipeline parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StructuredPipeline parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (StructuredPipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
