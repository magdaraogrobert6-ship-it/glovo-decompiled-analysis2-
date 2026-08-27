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
public final class TombstoneProtos$MemoryMapping extends GeneratedMessageLite implements r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 {
    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 1;
    public static final int BUILD_ID_FIELD_NUMBER = 8;
    private static final TombstoneProtos$MemoryMapping DEFAULT_INSTANCE;
    public static final int END_ADDRESS_FIELD_NUMBER = 2;
    public static final int EXECUTE_FIELD_NUMBER = 6;
    public static final int LOAD_BIAS_FIELD_NUMBER = 9;
    public static final int MAPPING_NAME_FIELD_NUMBER = 7;
    public static final int OFFSET_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int READ_FIELD_NUMBER = 4;
    public static final int WRITE_FIELD_NUMBER = 5;
    private long beginAddress_;
    private long endAddress_;
    private boolean execute_;
    private long loadBias_;
    private long offset_;
    private boolean read_;
    private boolean write_;
    private String mappingName_ = "";
    private String buildId_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExecute() {
        this.execute_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRead() {
        this.read_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWrite() {
        this.write_ = false;
    }

    public static TombstoneProtos$MemoryMapping getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginAddress(long j) {
        this.beginAddress_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndAddress(long j) {
        this.endAddress_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExecute(boolean z) {
        this.execute_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoadBias(long j) {
        this.loadBias_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffset(long j) {
        this.offset_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRead(boolean z) {
        this.read_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWrite(boolean z) {
        this.write_ = z;
    }

    public long getBeginAddress() {
        return this.beginAddress_;
    }

    public String getBuildId() {
        return this.buildId_;
    }

    public long getEndAddress() {
        return this.endAddress_;
    }

    public boolean getExecute() {
        return this.execute_;
    }

    public long getLoadBias() {
        return this.loadBias_;
    }

    public String getMappingName() {
        return this.mappingName_;
    }

    public long getOffset() {
        return this.offset_;
    }

    public boolean getRead() {
        return this.read_;
    }

    public boolean getWrite() {
        return this.write_;
    }

    static {
        TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping = new TombstoneProtos$MemoryMapping();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryMapping;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryMapping.class, tombstoneProtos$MemoryMapping);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginAddress() {
        this.beginAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndAddress() {
        this.endAddress_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoadBias() {
        this.loadBias_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffset() {
        this.offset_ = 0L;
    }

    public static r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw newBuilder() {
        return (r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryMapping parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryMapping();
            case 2:
                return new r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0003\u0002\u0003\u0003\u0003\u0004\u0007\u0005\u0007\u0006\u0007\u0007Ȉ\bȈ\t\u0003", new Object[]{"beginAddress_", "endAddress_", "offset_", "read_", "write_", "execute_", "mappingName_", "buildId_", "loadBias_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$MemoryMapping.class) {
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

    public getClipMetadata getMappingNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.mappingName_);
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
    public void setMappingName(String str) {
        str.getClass();
        this.mappingName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMappingNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.mappingName_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBuildId() {
        this.buildId_ = getDefaultInstance().getBuildId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMappingName() {
        this.mappingName_ = getDefaultInstance().getMappingName();
    }

    private TombstoneProtos$MemoryMapping() {
    }

    public static r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw newBuilder(TombstoneProtos$MemoryMapping tombstoneProtos$MemoryMapping) {
        return (r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryMapping);
    }

    public static TombstoneProtos$MemoryMapping parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryMapping parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryMapping) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
