package com.google.longrunning;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.accesssetScheduledFrameDispatchp;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.postFrameCallbackui;

/* JADX INFO: loaded from: classes4.dex */
public final class GetOperationRequest extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final GetOperationRequest DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private String name_ = "";

    public static GetOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getName() {
        return this.name_;
    }

    static {
        GetOperationRequest getOperationRequest = new GetOperationRequest();
        DEFAULT_INSTANCE = getOperationRequest;
        GeneratedMessageLite.registerDefaultInstance(GetOperationRequest.class, getOperationRequest);
    }

    public static postFrameCallbackui newBuilder() {
        return (postFrameCallbackui) DEFAULT_INSTANCE.createBuilder();
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetOperationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accesssetScheduledFrameDispatchp.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new GetOperationRequest();
            case 2:
                return new postFrameCallbackui(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (GetOperationRequest.class) {
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

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
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
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private GetOperationRequest() {
    }

    public static postFrameCallbackui newBuilder(GetOperationRequest getOperationRequest) {
        return (postFrameCallbackui) DEFAULT_INSTANCE.createBuilder(getOperationRequest);
    }

    public static GetOperationRequest parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (GetOperationRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static GetOperationRequest parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static GetOperationRequest parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static GetOperationRequest parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static GetOperationRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GetOperationRequest parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static GetOperationRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GetOperationRequest parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static GetOperationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static GetOperationRequest parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (GetOperationRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
