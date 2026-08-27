package com.google.firestore.v1;

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
import o.semanticsNodeIdToAccessibilityVirtualNodeId;
import o.sendEvent;
import o.sendEventForVirtualView;

/* JADX INFO: loaded from: classes2.dex */
public final class BloomFilter extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BITS_FIELD_NUMBER = 1;
    private static final BloomFilter DEFAULT_INSTANCE;
    public static final int HASH_COUNT_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private int bitField0_;
    private BitSequence bits_;
    private int hashCount_;

    private BloomFilter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBits() {
        this.bits_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHashCount() {
        this.hashCount_ = 0;
    }

    public static BloomFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHashCount(int i) {
        this.hashCount_ = i;
    }

    public int getHashCount() {
        return this.hashCount_;
    }

    public boolean hasBits() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        BloomFilter bloomFilter = new BloomFilter();
        DEFAULT_INSTANCE = bloomFilter;
        GeneratedMessageLite.registerDefaultInstance(BloomFilter.class, bloomFilter);
    }

    public static sendEventForVirtualView newBuilder() {
        return (sendEventForVirtualView) DEFAULT_INSTANCE.createBuilder();
    }

    public static BloomFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BloomFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (sendEvent.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new BloomFilter();
            case 2:
                return new sendEventForVirtualView(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "bits_", "hashCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (BloomFilter.class) {
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
    public void mergeBits(BitSequence bitSequence) {
        bitSequence.getClass();
        BitSequence bitSequence2 = this.bits_;
        if (bitSequence2 == null || bitSequence2 == BitSequence.getDefaultInstance()) {
            this.bits_ = bitSequence;
        } else {
            semanticsNodeIdToAccessibilityVirtualNodeId semanticsnodeidtoaccessibilityvirtualnodeidNewBuilder = BitSequence.newBuilder(this.bits_);
            semanticsnodeidtoaccessibilityvirtualnodeidNewBuilder.read(bitSequence);
            this.bits_ = (BitSequence) semanticsnodeidtoaccessibilityvirtualnodeidNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBits(BitSequence bitSequence) {
        bitSequence.getClass();
        this.bits_ = bitSequence;
        this.bitField0_ |= 1;
    }

    public BitSequence getBits() {
        BitSequence bitSequence = this.bits_;
        return bitSequence == null ? BitSequence.getDefaultInstance() : bitSequence;
    }

    public static sendEventForVirtualView newBuilder(BloomFilter bloomFilter) {
        return (sendEventForVirtualView) DEFAULT_INSTANCE.createBuilder(bloomFilter);
    }

    public static BloomFilter parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BloomFilter parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static BloomFilter parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static BloomFilter parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static BloomFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BloomFilter parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static BloomFilter parseFrom(InputStream inputStream) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BloomFilter parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BloomFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BloomFilter parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BloomFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
