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
public final class TombstoneProtos$StackHistoryBuffer extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final TombstoneProtos$StackHistoryBuffer DEFAULT_INSTANCE;
    public static final int ENTRIES_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int TID_FIELD_NUMBER = 1;
    private decodeString entries_ = GeneratedMessageLite.emptyProtobufList();
    private long tid_;

    public static TombstoneProtos$StackHistoryBuffer getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTid(long j) {
        this.tid_ = j;
    }

    public List<TombstoneProtos$StackHistoryBufferEntry> getEntriesList() {
        return this.entries_;
    }

    public List<? extends _init_lambda3> getEntriesOrBuilderList() {
        return this.entries_;
    }

    public long getTid() {
        return this.tid_;
    }

    static {
        TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer = new TombstoneProtos$StackHistoryBuffer();
        DEFAULT_INSTANCE = tombstoneProtos$StackHistoryBuffer;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$StackHistoryBuffer.class, tombstoneProtos$StackHistoryBuffer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTid() {
        this.tid_ = 0L;
    }

    public static accessensureViewModelStore newBuilder() {
        return (accessensureViewModelStore) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$StackHistoryBuffer parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$StackHistoryBuffer();
            case 2:
                return new accessensureViewModelStore(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0003\u0002\u001b", new Object[]{"tid_", "entries_", TombstoneProtos$StackHistoryBufferEntry.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$StackHistoryBuffer.class) {
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

    public TombstoneProtos$StackHistoryBufferEntry getEntries(int i) {
        return (TombstoneProtos$StackHistoryBufferEntry) this.entries_.get(i);
    }

    public int getEntriesCount() {
        return this.entries_.size();
    }

    public _init_lambda3 getEntriesOrBuilder(int i) {
        return (_init_lambda3) this.entries_.get(i);
    }

    private TombstoneProtos$StackHistoryBuffer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntries(Iterable<? extends TombstoneProtos$StackHistoryBufferEntry> iterable) {
        ensureEntriesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.entries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntries(TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        tombstoneProtos$StackHistoryBufferEntry.getClass();
        ensureEntriesIsMutable();
        this.entries_.add(tombstoneProtos$StackHistoryBufferEntry);
    }

    private void ensureEntriesIsMutable() {
        decodeString decodestring = this.entries_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.entries_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntries(int i) {
        ensureEntriesIsMutable();
        this.entries_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntries(int i, TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        tombstoneProtos$StackHistoryBufferEntry.getClass();
        ensureEntriesIsMutable();
        this.entries_.set(i, tombstoneProtos$StackHistoryBufferEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntries() {
        this.entries_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static accessensureViewModelStore newBuilder(TombstoneProtos$StackHistoryBuffer tombstoneProtos$StackHistoryBuffer) {
        return (accessensureViewModelStore) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$StackHistoryBuffer);
    }

    public static TombstoneProtos$StackHistoryBuffer parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntries(int i, TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        tombstoneProtos$StackHistoryBufferEntry.getClass();
        ensureEntriesIsMutable();
        this.entries_.add(i, tombstoneProtos$StackHistoryBufferEntry);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$StackHistoryBuffer parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$StackHistoryBuffer) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
