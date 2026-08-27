package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidComposeView_androidKtplatformTextInputServiceInterceptor1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.component23;
import o.containsDescendant;
import o.decodeString;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getContentCaptureSessionCompat;
import o.getLocalConfiguration;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class WriteResult extends GeneratedMessageLite implements AndroidComposeView_androidKtplatformTextInputServiceInterceptor1 {
    private static final WriteResult DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private decodeString transformResults_ = GeneratedMessageLite.emptyProtobufList();
    private Timestamp updateTime_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUpdateTime() {
        this.updateTime_ = null;
        this.bitField0_ &= -2;
    }

    public static WriteResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Value> getTransformResultsList() {
        return this.transformResults_;
    }

    public List<? extends containsDescendant> getTransformResultsOrBuilderList() {
        return this.transformResults_;
    }

    public boolean hasUpdateTime() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        WriteResult writeResult = new WriteResult();
        DEFAULT_INSTANCE = writeResult;
        GeneratedMessageLite.registerDefaultInstance(WriteResult.class, writeResult);
    }

    public static getLocalConfiguration newBuilder() {
        return (getLocalConfiguration) DEFAULT_INSTANCE.createBuilder();
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteResult parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getContentCaptureSessionCompat.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new WriteResult();
            case 2:
                return new getLocalConfiguration(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "updateTime_", "transformResults_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (WriteResult.class) {
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

    public Value getTransformResults(int i) {
        return (Value) this.transformResults_.get(i);
    }

    public int getTransformResultsCount() {
        return this.transformResults_.size();
    }

    public containsDescendant getTransformResultsOrBuilder(int i) {
        return (containsDescendant) this.transformResults_.get(i);
    }

    private WriteResult() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTransformResults(Iterable<? extends Value> iterable) {
        ensureTransformResultsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.transformResults_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransformResults(Value value) {
        value.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.add(value);
    }

    private void ensureTransformResultsIsMutable() {
        decodeString decodestring = this.transformResults_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.transformResults_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.updateTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.updateTime_ = timestamp;
        } else {
            this.updateTime_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.updateTime_, timestamp);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTransformResults(int i) {
        ensureTransformResultsIsMutable();
        this.transformResults_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransformResults(int i, Value value) {
        value.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.set(i, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpdateTime(Timestamp timestamp) {
        timestamp.getClass();
        this.updateTime_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransformResults() {
        this.transformResults_ = GeneratedMessageLite.emptyProtobufList();
    }

    public Timestamp getUpdateTime() {
        Timestamp timestamp = this.updateTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public static getLocalConfiguration newBuilder(WriteResult writeResult) {
        return (getLocalConfiguration) DEFAULT_INSTANCE.createBuilder(writeResult);
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteResult parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteResult parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static WriteResult parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTransformResults(int i, Value value) {
        value.getClass();
        ensureTransformResultsIsMutable();
        this.transformResults_.add(i, value);
    }

    public static WriteResult parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WriteResult parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteResult parseFrom(InputStream inputStream) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteResult parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (WriteResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
