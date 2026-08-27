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
public final class TombstoneProtos$MemoryDump extends GeneratedMessageLite implements r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 {
    public static final int ARM_MTE_METADATA_FIELD_NUMBER = 6;
    public static final int BEGIN_ADDRESS_FIELD_NUMBER = 3;
    private static final TombstoneProtos$MemoryDump DEFAULT_INSTANCE;
    public static final int MAPPING_NAME_FIELD_NUMBER = 2;
    public static final int MEMORY_FIELD_NUMBER = 4;
    private static volatile component23 PARSER = null;
    public static final int REGISTER_NAME_FIELD_NUMBER = 1;
    private long beginAddress_;
    private Object metadata_;
    private int metadataCase_ = 0;
    private String registerName_ = "";
    private String mappingName_ = "";
    private getClipMetadata memory_ = getClipMetadata.serializer;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadataCase_ = 0;
        this.metadata_ = null;
    }

    public static TombstoneProtos$MemoryDump getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeginAddress(long j) {
        this.beginAddress_ = j;
    }

    public long getBeginAddress() {
        return this.beginAddress_;
    }

    public String getMappingName() {
        return this.mappingName_;
    }

    public getClipMetadata getMemory() {
        return this.memory_;
    }

    public String getRegisterName() {
        return this.registerName_;
    }

    public boolean hasArmMteMetadata() {
        return this.metadataCase_ == 6;
    }

    public enum serializer {
        ARM_MTE_METADATA(6),
        METADATA_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        serializer(int i) {
            this.value = i;
        }

        public static serializer forNumber(int i) {
            if (i == 0) {
                return METADATA_NOT_SET;
            }
            if (i != 6) {
                return null;
            }
            return ARM_MTE_METADATA;
        }

        @Deprecated
        public static serializer valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump = new TombstoneProtos$MemoryDump();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryDump;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryDump.class, tombstoneProtos$MemoryDump);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeginAddress() {
        this.beginAddress_ = 0L;
    }

    public static r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg newBuilder() {
        return (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryDump parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryDump();
            case 2:
                return new r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0003\u0004\n\u0006<\u0000", new Object[]{"metadata_", "metadataCase_", "registerName_", "mappingName_", "beginAddress_", "memory_", TombstoneProtos$ArmMTEMetadata.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$MemoryDump.class) {
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

    public getClipMetadata getMappingNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.mappingName_);
    }

    public serializer getMetadataCase() {
        return serializer.forNumber(this.metadataCase_);
    }

    public getClipMetadata getRegisterNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.registerName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        tombstoneProtos$ArmMTEMetadata.getClass();
        if (this.metadataCase_ != 6 || this.metadata_ == TombstoneProtos$ArmMTEMetadata.getDefaultInstance()) {
            this.metadata_ = tombstoneProtos$ArmMTEMetadata;
        } else {
            MediaDescriptionCompat mediaDescriptionCompatNewBuilder = TombstoneProtos$ArmMTEMetadata.newBuilder((TombstoneProtos$ArmMTEMetadata) this.metadata_);
            mediaDescriptionCompatNewBuilder.read(tombstoneProtos$ArmMTEMetadata);
            this.metadata_ = mediaDescriptionCompatNewBuilder.read();
        }
        this.metadataCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArmMteMetadata(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        tombstoneProtos$ArmMTEMetadata.getClass();
        this.metadata_ = tombstoneProtos$ArmMTEMetadata;
        this.metadataCase_ = 6;
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
    public void setMemory(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.memory_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisterName(String str) {
        str.getClass();
        this.registerName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegisterNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.registerName_ = getclipmetadata.MediaMetadataCompat();
    }

    private TombstoneProtos$MemoryDump() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMappingName() {
        this.mappingName_ = getDefaultInstance().getMappingName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemory() {
        this.memory_ = getDefaultInstance().getMemory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegisterName() {
        this.registerName_ = getDefaultInstance().getRegisterName();
    }

    public TombstoneProtos$ArmMTEMetadata getArmMteMetadata() {
        return this.metadataCase_ == 6 ? (TombstoneProtos$ArmMTEMetadata) this.metadata_ : TombstoneProtos$ArmMTEMetadata.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArmMteMetadata() {
        if (this.metadataCase_ == 6) {
            this.metadataCase_ = 0;
            this.metadata_ = null;
        }
    }

    public static r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg newBuilder(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        return (r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryDump);
    }

    public static TombstoneProtos$MemoryDump parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryDump parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryDump parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$MemoryDump parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryDump parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryDump parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryDump parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$MemoryDump parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryDump parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$MemoryDump) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
