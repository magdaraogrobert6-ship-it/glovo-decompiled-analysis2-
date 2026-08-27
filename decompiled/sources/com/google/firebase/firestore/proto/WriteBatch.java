package com.google.firebase.firestore.proto;

import com.google.firestore.v1.Write;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.accessgetContentCaptureSessionCompat;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.mapBounds;
import o.mapOffset8S9VItk;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class WriteBatch extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final WriteBatch DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private int bitField0_;
    private Timestamp localWriteTime_;
    private decodeString writes_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString baseWrites_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatchId() {
        this.batchId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocalWriteTime() {
        this.localWriteTime_ = null;
        this.bitField0_ &= -2;
    }

    public static WriteBatch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatchId(int i) {
        this.batchId_ = i;
    }

    public List<Write> getBaseWritesList() {
        return this.baseWrites_;
    }

    public List<? extends accessgetContentCaptureSessionCompat> getBaseWritesOrBuilderList() {
        return this.baseWrites_;
    }

    public int getBatchId() {
        return this.batchId_;
    }

    public List<Write> getWritesList() {
        return this.writes_;
    }

    public List<? extends accessgetContentCaptureSessionCompat> getWritesOrBuilderList() {
        return this.writes_;
    }

    public boolean hasLocalWriteTime() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        WriteBatch writeBatch = new WriteBatch();
        DEFAULT_INSTANCE = writeBatch;
        GeneratedMessageLite.registerDefaultInstance(WriteBatch.class, writeBatch);
    }

    public static mapOffset8S9VItk newBuilder() {
        return (mapOffset8S9VItk) DEFAULT_INSTANCE.createBuilder();
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteBatch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (mapBounds.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new WriteBatch();
            case 2:
                return new mapOffset8S9VItk(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "batchId_", "writes_", Write.class, "localWriteTime_", "baseWrites_", Write.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (WriteBatch.class) {
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

    public Write getBaseWrites(int i) {
        return (Write) this.baseWrites_.get(i);
    }

    public int getBaseWritesCount() {
        return this.baseWrites_.size();
    }

    public accessgetContentCaptureSessionCompat getBaseWritesOrBuilder(int i) {
        return (accessgetContentCaptureSessionCompat) this.baseWrites_.get(i);
    }

    public Write getWrites(int i) {
        return (Write) this.writes_.get(i);
    }

    public int getWritesCount() {
        return this.writes_.size();
    }

    public accessgetContentCaptureSessionCompat getWritesOrBuilder(int i) {
        return (accessgetContentCaptureSessionCompat) this.writes_.get(i);
    }

    private WriteBatch() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBaseWrites(Iterable<? extends Write> iterable) {
        ensureBaseWritesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.baseWrites_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllWrites(Iterable<? extends Write> iterable) {
        ensureWritesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.writes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(Write write) {
        write.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(Write write) {
        write.getClass();
        ensureWritesIsMutable();
        this.writes_.add(write);
    }

    private void ensureBaseWritesIsMutable() {
        decodeString decodestring = this.baseWrites_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.baseWrites_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureWritesIsMutable() {
        decodeString decodestring = this.writes_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.writes_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLocalWriteTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.localWriteTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.localWriteTime_ = timestamp;
        } else {
            this.localWriteTime_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.localWriteTime_, timestamp);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBaseWrites(int i) {
        ensureBaseWritesIsMutable();
        this.baseWrites_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeWrites(int i) {
        ensureWritesIsMutable();
        this.writes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseWrites(int i, Write write) {
        write.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.set(i, write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalWriteTime(Timestamp timestamp) {
        timestamp.getClass();
        this.localWriteTime_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrites(int i, Write write) {
        write.getClass();
        ensureWritesIsMutable();
        this.writes_.set(i, write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBaseWrites() {
        this.baseWrites_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrites() {
        this.writes_ = GeneratedMessageLite.emptyProtobufList();
    }

    public Timestamp getLocalWriteTime() {
        Timestamp timestamp = this.localWriteTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public static mapOffset8S9VItk newBuilder(WriteBatch writeBatch) {
        return (mapOffset8S9VItk) DEFAULT_INSTANCE.createBuilder(writeBatch);
    }

    public static WriteBatch parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (WriteBatch) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteBatch parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteBatch parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static WriteBatch parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBaseWrites(int i, Write write) {
        write.getClass();
        ensureBaseWritesIsMutable();
        this.baseWrites_.add(i, write);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrites(int i, Write write) {
        write.getClass();
        ensureWritesIsMutable();
        this.writes_.add(i, write);
    }

    public static WriteBatch parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static WriteBatch parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteBatch parseFrom(InputStream inputStream) throws IOException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static WriteBatch parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static WriteBatch parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static WriteBatch parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (WriteBatch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
