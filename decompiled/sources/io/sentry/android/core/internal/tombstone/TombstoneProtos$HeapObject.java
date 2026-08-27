package io.sentry.android.core.internal.tombstone;

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
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$HeapObject extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ADDRESS_FIELD_NUMBER = 1;
    public static final int ALLOCATION_BACKTRACE_FIELD_NUMBER = 4;
    public static final int ALLOCATION_TID_FIELD_NUMBER = 3;
    public static final int DEALLOCATION_BACKTRACE_FIELD_NUMBER = 6;
    public static final int DEALLOCATION_TID_FIELD_NUMBER = 5;
    private static final TombstoneProtos$HeapObject DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    private long address_;
    private long allocationTid_;
    private long deallocationTid_;
    private long size_;
    private decodeString allocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    private decodeString deallocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();

    public static TombstoneProtos$HeapObject getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddress(long j) {
        this.address_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllocationTid(long j) {
        this.allocationTid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeallocationTid(long j) {
        this.deallocationTid_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSize(long j) {
        this.size_ = j;
    }

    public long getAddress() {
        return this.address_;
    }

    public List<TombstoneProtos$BacktraceFrame> getAllocationBacktraceList() {
        return this.allocationBacktrace_;
    }

    public List<? extends MediaMetadataCompat> getAllocationBacktraceOrBuilderList() {
        return this.allocationBacktrace_;
    }

    public long getAllocationTid() {
        return this.allocationTid_;
    }

    public List<TombstoneProtos$BacktraceFrame> getDeallocationBacktraceList() {
        return this.deallocationBacktrace_;
    }

    public List<? extends MediaMetadataCompat> getDeallocationBacktraceOrBuilderList() {
        return this.deallocationBacktrace_;
    }

    public long getDeallocationTid() {
        return this.deallocationTid_;
    }

    public long getSize() {
        return this.size_;
    }

    static {
        TombstoneProtos$HeapObject tombstoneProtos$HeapObject = new TombstoneProtos$HeapObject();
        DEFAULT_INSTANCE = tombstoneProtos$HeapObject;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$HeapObject.class, tombstoneProtos$HeapObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddress() {
        this.address_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllocationTid() {
        this.allocationTid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeallocationTid() {
        this.deallocationTid_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSize() {
        this.size_ = 0L;
    }

    public static ResultReceiver newBuilder() {
        return (ResultReceiver) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$HeapObject parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$HeapObject parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$HeapObject();
            case 2:
                return new ResultReceiver(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u001b\u0005\u0003\u0006\u001b", new Object[]{"address_", "size_", "allocationTid_", "allocationBacktrace_", TombstoneProtos$BacktraceFrame.class, "deallocationTid_", "deallocationBacktrace_", TombstoneProtos$BacktraceFrame.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$HeapObject.class) {
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

    public TombstoneProtos$BacktraceFrame getAllocationBacktrace(int i) {
        return (TombstoneProtos$BacktraceFrame) this.allocationBacktrace_.get(i);
    }

    public int getAllocationBacktraceCount() {
        return this.allocationBacktrace_.size();
    }

    public MediaMetadataCompat getAllocationBacktraceOrBuilder(int i) {
        return (MediaMetadataCompat) this.allocationBacktrace_.get(i);
    }

    public TombstoneProtos$BacktraceFrame getDeallocationBacktrace(int i) {
        return (TombstoneProtos$BacktraceFrame) this.deallocationBacktrace_.get(i);
    }

    public int getDeallocationBacktraceCount() {
        return this.deallocationBacktrace_.size();
    }

    public MediaMetadataCompat getDeallocationBacktraceOrBuilder(int i) {
        return (MediaMetadataCompat) this.deallocationBacktrace_.get(i);
    }

    private TombstoneProtos$HeapObject() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllocationBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
        ensureAllocationBacktraceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.allocationBacktrace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDeallocationBacktrace(Iterable<? extends TombstoneProtos$BacktraceFrame> iterable) {
        ensureDeallocationBacktraceIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.deallocationBacktrace_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllocationBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.add(tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeallocationBacktrace(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.add(tombstoneProtos$BacktraceFrame);
    }

    private void ensureAllocationBacktraceIsMutable() {
        decodeString decodestring = this.allocationBacktrace_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.allocationBacktrace_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    private void ensureDeallocationBacktraceIsMutable() {
        decodeString decodestring = this.deallocationBacktrace_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.deallocationBacktrace_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAllocationBacktrace(int i) {
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDeallocationBacktrace(int i) {
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.set(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeallocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.set(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllocationBacktrace() {
        this.allocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeallocationBacktrace() {
        this.deallocationBacktrace_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static ResultReceiver newBuilder(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        return (ResultReceiver) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$HeapObject);
    }

    public static TombstoneProtos$HeapObject parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$HeapObject parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$HeapObject parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$HeapObject parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureAllocationBacktraceIsMutable();
        this.allocationBacktrace_.add(i, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDeallocationBacktrace(int i, TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        ensureDeallocationBacktraceIsMutable();
        this.deallocationBacktrace_.add(i, tombstoneProtos$BacktraceFrame);
    }

    public static TombstoneProtos$HeapObject parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$HeapObject parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$HeapObject parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$HeapObject parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$HeapObject parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$HeapObject parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$HeapObject) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
