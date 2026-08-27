package com.google.firebase.inappmessaging;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.ParentDataModifierNodeKt;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getPlaceable;

/* JADX INFO: loaded from: classes2.dex */
public final class MessagesProto$Action extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ACTION_URL_FIELD_NUMBER = 1;
    private static final MessagesProto$Action DEFAULT_INSTANCE;
    private static volatile component23 PARSER;
    private String actionUrl_ = "";

    public static MessagesProto$Action getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getActionUrl() {
        return this.actionUrl_;
    }

    static {
        MessagesProto$Action messagesProto$Action = new MessagesProto$Action();
        DEFAULT_INSTANCE = messagesProto$Action;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$Action.class, messagesProto$Action);
    }

    public static getPlaceable newBuilder() {
        return (getPlaceable) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$Action parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Action parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (ParentDataModifierNodeKt.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new MessagesProto$Action();
            case 2:
                return new getPlaceable(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"actionUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (MessagesProto$Action.class) {
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

    public getClipMetadata getActionUrlBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.actionUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrl(String str) {
        str.getClass();
        this.actionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrlBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.actionUrl_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionUrl() {
        this.actionUrl_ = getDefaultInstance().getActionUrl();
    }

    private MessagesProto$Action() {
    }

    public static getPlaceable newBuilder(MessagesProto$Action messagesProto$Action) {
        return (getPlaceable) DEFAULT_INSTANCE.createBuilder(messagesProto$Action);
    }

    public static MessagesProto$Action parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Action parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Action parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static MessagesProto$Action parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Action parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$Action parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Action parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Action parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Action parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$Action parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Action) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
