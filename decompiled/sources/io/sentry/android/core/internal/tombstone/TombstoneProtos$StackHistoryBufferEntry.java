package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes5.dex */
public final class TombstoneProtos$StackHistoryBufferEntry extends GeneratedMessageLite implements _init_lambda3 {
    public static final int ADDR_FIELD_NUMBER = 1;
    private static final TombstoneProtos$StackHistoryBufferEntry DEFAULT_INSTANCE;
    public static final int FP_FIELD_NUMBER = 2;
    private static volatile component23 PARSER = null;
    public static final int TAG_FIELD_NUMBER = 3;
    private TombstoneProtos$BacktraceFrame addr_;
    private int bitField0_;
    private long fp_;
    private long tag_;

    private TombstoneProtos$StackHistoryBufferEntry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddr() {
        this.addr_ = null;
        this.bitField0_ &= -2;
    }

    public static TombstoneProtos$StackHistoryBufferEntry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFp(long j) {
        this.fp_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(long j) {
        this.tag_ = j;
    }

    public long getFp() {
        return this.fp_;
    }

    public long getTag() {
        return this.tag_;
    }

    public boolean hasAddr() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry = new TombstoneProtos$StackHistoryBufferEntry();
        DEFAULT_INSTANCE = tombstoneProtos$StackHistoryBufferEntry;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$StackHistoryBufferEntry.class, tombstoneProtos$StackHistoryBufferEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFp() {
        this.fp_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = 0L;
    }

    public static _init_lambda2 newBuilder() {
        return (_init_lambda2) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$StackHistoryBufferEntry();
            case 2:
                return new _init_lambda2(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0003\u0003\u0003", new Object[]{"bitField0_", "addr_", "fp_", "tag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$StackHistoryBufferEntry.class) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddr(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame2 = this.addr_;
        if (tombstoneProtos$BacktraceFrame2 == null || tombstoneProtos$BacktraceFrame2 == TombstoneProtos$BacktraceFrame.getDefaultInstance()) {
            this.addr_ = tombstoneProtos$BacktraceFrame;
        } else {
            MediaBrowserCompatMediaItem mediaBrowserCompatMediaItemNewBuilder = TombstoneProtos$BacktraceFrame.newBuilder(this.addr_);
            mediaBrowserCompatMediaItemNewBuilder.read(tombstoneProtos$BacktraceFrame);
            this.addr_ = (TombstoneProtos$BacktraceFrame) mediaBrowserCompatMediaItemNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddr(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        tombstoneProtos$BacktraceFrame.getClass();
        this.addr_ = tombstoneProtos$BacktraceFrame;
        this.bitField0_ |= 1;
    }

    public TombstoneProtos$BacktraceFrame getAddr() {
        TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame = this.addr_;
        return tombstoneProtos$BacktraceFrame == null ? TombstoneProtos$BacktraceFrame.getDefaultInstance() : tombstoneProtos$BacktraceFrame;
    }

    public static _init_lambda2 newBuilder(TombstoneProtos$StackHistoryBufferEntry tombstoneProtos$StackHistoryBufferEntry) {
        return (_init_lambda2) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$StackHistoryBufferEntry);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$StackHistoryBufferEntry parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$StackHistoryBufferEntry) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
