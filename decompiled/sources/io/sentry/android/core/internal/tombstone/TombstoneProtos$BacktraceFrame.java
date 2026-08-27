package io.sentry.android.core.internal.tombstone;

import com.google.protobuf.AbstractMessageLite;
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

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$BacktraceFrame extends GeneratedMessageLite implements MediaMetadataCompat {
    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private static final TombstoneProtos$BacktraceFrame DEFAULT_INSTANCE;
    public static final int FILE_MAP_OFFSET_FIELD_NUMBER = 7;
    public static final int FILE_NAME_FIELD_NUMBER = 6;
    public static final int FUNCTION_NAME_FIELD_NUMBER = 4;
    public static final int FUNCTION_OFFSET_FIELD_NUMBER = 5;
    private static volatile component23 PARSER = null;
    public static final int PC_FIELD_NUMBER = 2;
    public static final int REL_PC_FIELD_NUMBER = 1;
    public static final int SP_FIELD_NUMBER = 3;
    private long fileMapOffset_;
    private long functionOffset_;
    private long pc_;
    private long relPc_;
    private long sp_;
    private String functionName_ = "";
    private String fileName_ = "";
    private String buildId_ = "";

    public static TombstoneProtos$BacktraceFrame getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileMapOffset(long j) {
        this.fileMapOffset_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionOffset(long j) {
        this.functionOffset_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPc(long j) {
        this.pc_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelPc(long j) {
        this.relPc_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSp(long j) {
        this.sp_ = j;
    }

    public String getBuildId() {
        return this.buildId_;
    }

    public long getFileMapOffset() {
        return this.fileMapOffset_;
    }

    public String getFileName() {
        return this.fileName_;
    }

    public String getFunctionName() {
        return this.functionName_;
    }

    public long getFunctionOffset() {
        return this.functionOffset_;
    }

    public long getPc() {
        return this.pc_;
    }

    public long getRelPc() {
        return this.relPc_;
    }

    public long getSp() {
        return this.sp_;
    }

    static {
        TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame = new TombstoneProtos$BacktraceFrame();
        DEFAULT_INSTANCE = tombstoneProtos$BacktraceFrame;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$BacktraceFrame.class, tombstoneProtos$BacktraceFrame);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileMapOffset() {
        this.fileMapOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionOffset() {
        this.functionOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPc() {
        this.pc_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelPc() {
        this.relPc_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSp() {
        this.sp_ = 0L;
    }

    public static MediaBrowserCompatMediaItem newBuilder() {
        return (MediaBrowserCompatMediaItem) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$BacktraceFrame parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$BacktraceFrame();
            case 2:
                return new MediaBrowserCompatMediaItem(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004Ȉ\u0005\u0003\u0006Ȉ\u0007\u0003\bȈ", new Object[]{"relPc_", "pc_", "sp_", "functionName_", "functionOffset_", "fileName_", "fileMapOffset_", "buildId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$BacktraceFrame.class) {
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

    public getClipMetadata getBuildIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.buildId_);
    }

    public getClipMetadata getFileNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.fileName_);
    }

    public getClipMetadata getFunctionNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.functionName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildId(String str) {
        str.getClass();
        this.buildId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBuildIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.buildId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.fileName_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionName(String str) {
        str.getClass();
        this.functionName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFunctionNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.functionName_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildId() {
        this.buildId_ = getDefaultInstance().getBuildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFunctionName() {
        this.functionName_ = getDefaultInstance().getFunctionName();
    }

    private TombstoneProtos$BacktraceFrame() {
    }

    public static MediaBrowserCompatMediaItem newBuilder(TombstoneProtos$BacktraceFrame tombstoneProtos$BacktraceFrame) {
        return (MediaBrowserCompatMediaItem) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$BacktraceFrame);
    }

    public static TombstoneProtos$BacktraceFrame parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$BacktraceFrame parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$BacktraceFrame) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
