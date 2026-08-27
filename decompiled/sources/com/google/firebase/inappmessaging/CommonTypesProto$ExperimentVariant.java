package com.google.firebase.inappmessaging;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.PointerInputModifierNode;
import o.accessgetObserverp;
import o.accessgetOnCommitAffectingSemanticsp;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonTypesProto$ExperimentVariant extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final CommonTypesProto$ExperimentVariant DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private int bitField0_;
    private MessagesProto$Content content_;
    private int index_;

    private CommonTypesProto$ExperimentVariant() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIndex() {
        this.index_ = 0;
    }

    public static CommonTypesProto$ExperimentVariant getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndex(int i) {
        this.index_ = i;
    }

    public int getIndex() {
        return this.index_;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        CommonTypesProto$ExperimentVariant commonTypesProto$ExperimentVariant = new CommonTypesProto$ExperimentVariant();
        DEFAULT_INSTANCE = commonTypesProto$ExperimentVariant;
        GeneratedMessageLite.registerDefaultInstance(CommonTypesProto$ExperimentVariant.class, commonTypesProto$ExperimentVariant);
    }

    public static accessgetOnCommitAffectingSemanticsp newBuilder() {
        return (accessgetOnCommitAffectingSemanticsp) DEFAULT_INSTANCE.createBuilder();
    }

    public static CommonTypesProto$ExperimentVariant parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (accessgetObserverp.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new CommonTypesProto$ExperimentVariant();
            case 2:
                return new accessgetOnCommitAffectingSemanticsp(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000", new Object[]{"bitField0_", "index_", "content_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (CommonTypesProto$ExperimentVariant.class) {
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
    public void mergeContent(MessagesProto$Content messagesProto$Content) {
        messagesProto$Content.getClass();
        MessagesProto$Content messagesProto$Content2 = this.content_;
        if (messagesProto$Content2 == null || messagesProto$Content2 == MessagesProto$Content.getDefaultInstance()) {
            this.content_ = messagesProto$Content;
        } else {
            PointerInputModifierNode pointerInputModifierNodeNewBuilder = MessagesProto$Content.newBuilder(this.content_);
            pointerInputModifierNodeNewBuilder.read(messagesProto$Content);
            this.content_ = (MessagesProto$Content) pointerInputModifierNodeNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(MessagesProto$Content messagesProto$Content) {
        messagesProto$Content.getClass();
        this.content_ = messagesProto$Content;
        this.bitField0_ |= 1;
    }

    public MessagesProto$Content getContent() {
        MessagesProto$Content messagesProto$Content = this.content_;
        return messagesProto$Content == null ? MessagesProto$Content.getDefaultInstance() : messagesProto$Content;
    }

    public static accessgetOnCommitAffectingSemanticsp newBuilder(CommonTypesProto$ExperimentVariant commonTypesProto$ExperimentVariant) {
        return (accessgetOnCommitAffectingSemanticsp) DEFAULT_INSTANCE.createBuilder(commonTypesProto$ExperimentVariant);
    }

    public static CommonTypesProto$ExperimentVariant parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(InputStream inputStream) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static CommonTypesProto$ExperimentVariant parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (CommonTypesProto$ExperimentVariant) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
