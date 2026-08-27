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
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$Signal extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CODE_FIELD_NUMBER = 3;
    public static final int CODE_NAME_FIELD_NUMBER = 4;
    private static final TombstoneProtos$Signal DEFAULT_INSTANCE;
    public static final int FAULT_ADDRESS_FIELD_NUMBER = 9;
    public static final int FAULT_ADJACENT_METADATA_FIELD_NUMBER = 10;
    public static final int HAS_FAULT_ADDRESS_FIELD_NUMBER = 8;
    public static final int HAS_SENDER_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NUMBER_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int SENDER_PID_FIELD_NUMBER = 7;
    public static final int SENDER_UID_FIELD_NUMBER = 6;
    private int bitField0_;
    private int code_;
    private long faultAddress_;
    private TombstoneProtos$MemoryDump faultAdjacentMetadata_;
    private boolean hasFaultAddress_;
    private boolean hasSender_;
    private int number_;
    private int senderPid_;
    private int senderUid_;
    private String name_ = "";
    private String codeName_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaultAdjacentMetadata() {
        this.faultAdjacentMetadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasFaultAddress() {
        this.hasFaultAddress_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHasSender() {
        this.hasSender_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderPid() {
        this.senderPid_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderUid() {
        this.senderUid_ = 0;
    }

    public static TombstoneProtos$Signal getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaultAddress(long j) {
        this.faultAddress_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasFaultAddress(boolean z) {
        this.hasFaultAddress_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasSender(boolean z) {
        this.hasSender_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderPid(int i) {
        this.senderPid_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderUid(int i) {
        this.senderUid_ = i;
    }

    public int getCode() {
        return this.code_;
    }

    public String getCodeName() {
        return this.codeName_;
    }

    public long getFaultAddress() {
        return this.faultAddress_;
    }

    public boolean getHasFaultAddress() {
        return this.hasFaultAddress_;
    }

    public boolean getHasSender() {
        return this.hasSender_;
    }

    public String getName() {
        return this.name_;
    }

    public int getNumber() {
        return this.number_;
    }

    public int getSenderPid() {
        return this.senderPid_;
    }

    public int getSenderUid() {
        return this.senderUid_;
    }

    public boolean hasFaultAdjacentMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        TombstoneProtos$Signal tombstoneProtos$Signal = new TombstoneProtos$Signal();
        DEFAULT_INSTANCE = tombstoneProtos$Signal;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Signal.class, tombstoneProtos$Signal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFaultAddress() {
        this.faultAddress_ = 0L;
    }

    public static _init_lambda1 newBuilder() {
        return (_init_lambda1) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Signal parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Signal parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$Signal();
            case 2:
                return new _init_lambda1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0007\u0006\u0004\u0007\u0004\b\u0007\t\u0003\nဉ\u0000", new Object[]{"bitField0_", "number_", "name_", "code_", "codeName_", "hasSender_", "senderUid_", "senderPid_", "hasFaultAddress_", "faultAddress_", "faultAdjacentMetadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$Signal.class) {
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

    public getClipMetadata getCodeNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.codeName_);
    }

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump2 = this.faultAdjacentMetadata_;
        if (tombstoneProtos$MemoryDump2 == null || tombstoneProtos$MemoryDump2 == TombstoneProtos$MemoryDump.getDefaultInstance()) {
            this.faultAdjacentMetadata_ = tombstoneProtos$MemoryDump;
        } else {
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgNewBuilder = TombstoneProtos$MemoryDump.newBuilder(this.faultAdjacentMetadata_);
            r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgNewBuilder.read(tombstoneProtos$MemoryDump);
            this.faultAdjacentMetadata_ = (TombstoneProtos$MemoryDump) r8lambdaquuwrpysdd6n6dd7wraaa0s4oxgNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeName(String str) {
        str.getClass();
        this.codeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.codeName_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFaultAdjacentMetadata(TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump) {
        tombstoneProtos$MemoryDump.getClass();
        this.faultAdjacentMetadata_ = tombstoneProtos$MemoryDump;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.name_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCodeName() {
        this.codeName_ = getDefaultInstance().getCodeName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public TombstoneProtos$MemoryDump getFaultAdjacentMetadata() {
        TombstoneProtos$MemoryDump tombstoneProtos$MemoryDump = this.faultAdjacentMetadata_;
        return tombstoneProtos$MemoryDump == null ? TombstoneProtos$MemoryDump.getDefaultInstance() : tombstoneProtos$MemoryDump;
    }

    private TombstoneProtos$Signal() {
    }

    public static _init_lambda1 newBuilder(TombstoneProtos$Signal tombstoneProtos$Signal) {
        return (_init_lambda1) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Signal);
    }

    public static TombstoneProtos$Signal parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Signal parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Signal parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$Signal parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Signal parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Signal parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Signal parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Signal parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$Signal parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Signal parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$Signal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
