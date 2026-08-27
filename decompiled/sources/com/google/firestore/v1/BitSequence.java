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
import o.scheduleScrollEventIfNeeded;
import o.semanticsNodeIdToAccessibilityVirtualNodeId;

/* JADX INFO: loaded from: classes2.dex */
public final class BitSequence extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BITMAP_FIELD_NUMBER = 1;
    private static final BitSequence DEFAULT_INSTANCE;
    public static final int PADDING_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private getClipMetadata bitmap_ = getClipMetadata.serializer;
    private int padding_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPadding() {
        this.padding_ = 0;
    }

    public static BitSequence getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPadding(int i) {
        this.padding_ = i;
    }

    public getClipMetadata getBitmap() {
        return this.bitmap_;
    }

    public int getPadding() {
        return this.padding_;
    }

    static {
        BitSequence bitSequence = new BitSequence();
        DEFAULT_INSTANCE = bitSequence;
        GeneratedMessageLite.registerDefaultInstance(BitSequence.class, bitSequence);
    }

    public static semanticsNodeIdToAccessibilityVirtualNodeId newBuilder() {
        return (semanticsNodeIdToAccessibilityVirtualNodeId) DEFAULT_INSTANCE.createBuilder();
    }

    public static BitSequence parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BitSequence) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BitSequence parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (scheduleScrollEventIfNeeded.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new BitSequence();
            case 2:
                return new semanticsNodeIdToAccessibilityVirtualNodeId(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"bitmap_", "padding_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (BitSequence.class) {
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

    private BitSequence() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBitmap(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.bitmap_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBitmap() {
        this.bitmap_ = getDefaultInstance().getBitmap();
    }

    public static semanticsNodeIdToAccessibilityVirtualNodeId newBuilder(BitSequence bitSequence) {
        return (semanticsNodeIdToAccessibilityVirtualNodeId) DEFAULT_INSTANCE.createBuilder(bitSequence);
    }

    public static BitSequence parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BitSequence) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BitSequence parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static BitSequence parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static BitSequence parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static BitSequence parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BitSequence parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static BitSequence parseFrom(InputStream inputStream) throws IOException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BitSequence parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BitSequence parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BitSequence parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BitSequence) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
