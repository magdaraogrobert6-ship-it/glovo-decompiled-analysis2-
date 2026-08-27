package com.google.apphosting.datastore.testing;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DelegatableNodeRegistrationHandle;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.requireLayoutNode;

/* JADX INFO: loaded from: classes4.dex */
public final class DatastoreTestTrace$StatusProto extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CANONICAL_CODE_FIELD_NUMBER = 6;
    public static final int CODE_FIELD_NUMBER = 1;
    private static final DatastoreTestTrace$StatusProto DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int SPACE_FIELD_NUMBER = 2;
    private int canonicalCode_;
    private int code_;
    private String space_ = "";
    private String message_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanonicalCode() {
        this.canonicalCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    public static DatastoreTestTrace$StatusProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanonicalCode(int i) {
        this.canonicalCode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(int i) {
        this.code_ = i;
    }

    public int getCanonicalCode() {
        return this.canonicalCode_;
    }

    public int getCode() {
        return this.code_;
    }

    public String getMessage() {
        return this.message_;
    }

    public String getSpace() {
        return this.space_;
    }

    static {
        DatastoreTestTrace$StatusProto datastoreTestTrace$StatusProto = new DatastoreTestTrace$StatusProto();
        DEFAULT_INSTANCE = datastoreTestTrace$StatusProto;
        GeneratedMessageLite.registerDefaultInstance(DatastoreTestTrace$StatusProto.class, datastoreTestTrace$StatusProto);
    }

    public static requireLayoutNode newBuilder() {
        return (requireLayoutNode) DEFAULT_INSTANCE.createBuilder();
    }

    public static DatastoreTestTrace$StatusProto parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DatastoreTestTrace$StatusProto();
            case 2:
                return new requireLayoutNode(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0006\u0004", new Object[]{"code_", "space_", "message_", "canonicalCode_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DatastoreTestTrace$StatusProto.class) {
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

    public getClipMetadata getMessageBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.message_);
    }

    public getClipMetadata getSpaceBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.space_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.message_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpace(String str) {
        str.getClass();
        this.space_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpaceBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.space_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpace() {
        this.space_ = getDefaultInstance().getSpace();
    }

    private DatastoreTestTrace$StatusProto() {
    }

    public static requireLayoutNode newBuilder(DatastoreTestTrace$StatusProto datastoreTestTrace$StatusProto) {
        return (requireLayoutNode) DEFAULT_INSTANCE.createBuilder(datastoreTestTrace$StatusProto);
    }

    public static DatastoreTestTrace$StatusProto parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DatastoreTestTrace$StatusProto parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$StatusProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
