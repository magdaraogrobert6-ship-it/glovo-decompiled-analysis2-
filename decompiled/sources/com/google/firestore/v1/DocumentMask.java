package com.google.firestore.v1;

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
import o.canScroll0AR0LA0ui;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;
import o.updateHoveredVirtualView;

/* JADX INFO: loaded from: classes2.dex */
public final class DocumentMask extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final DocumentMask DEFAULT_INSTANCE;
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private decodeString fieldPaths_ = GeneratedMessageLite.emptyProtobufList();

    public static DocumentMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<String> getFieldPathsList() {
        return this.fieldPaths_;
    }

    static {
        DocumentMask documentMask = new DocumentMask();
        DEFAULT_INSTANCE = documentMask;
        GeneratedMessageLite.registerDefaultInstance(DocumentMask.class, documentMask);
    }

    public static updateHoveredVirtualView newBuilder() {
        return (updateHoveredVirtualView) DEFAULT_INSTANCE.createBuilder();
    }

    public static DocumentMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentMask parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (canScroll0AR0LA0ui.serializer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DocumentMask();
            case 2:
                return new updateHoveredVirtualView(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"fieldPaths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DocumentMask.class) {
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

    public String getFieldPaths(int i) {
        return (String) this.fieldPaths_.get(i);
    }

    public getClipMetadata getFieldPathsBytes(int i) {
        return getClipMetadata.RemoteActionCompatParcelizer((String) this.fieldPaths_.get(i));
    }

    public int getFieldPathsCount() {
        return this.fieldPaths_.size();
    }

    private DocumentMask() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldPaths(Iterable<String> iterable) {
        ensureFieldPathsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.fieldPaths_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPaths(String str) {
        str.getClass();
        ensureFieldPathsIsMutable();
        this.fieldPaths_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFieldPathsBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        ensureFieldPathsIsMutable();
        this.fieldPaths_.add(getclipmetadata.MediaMetadataCompat());
    }

    private void ensureFieldPathsIsMutable() {
        decodeString decodestring = this.fieldPaths_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.fieldPaths_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFieldPaths(int i, String str) {
        str.getClass();
        ensureFieldPathsIsMutable();
        this.fieldPaths_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFieldPaths() {
        this.fieldPaths_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static updateHoveredVirtualView newBuilder(DocumentMask documentMask) {
        return (updateHoveredVirtualView) DEFAULT_INSTANCE.createBuilder(documentMask);
    }

    public static DocumentMask parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentMask) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentMask parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentMask parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DocumentMask parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentMask parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DocumentMask parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentMask parseFrom(InputStream inputStream) throws IOException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DocumentMask parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DocumentMask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DocumentMask parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DocumentMask) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
