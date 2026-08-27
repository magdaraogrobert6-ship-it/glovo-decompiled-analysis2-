package com.google.firebase.inappmessaging;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.ParentDataModifierNodeKt;
import o.PlaceableResult;
import o.PointerInputModifierNode;
import o.Ref;
import o.RootForTest;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getResult;

/* JADX INFO: loaded from: classes2.dex */
public final class MessagesProto$Content extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int CARD_FIELD_NUMBER = 4;
    private static final MessagesProto$Content DEFAULT_INSTANCE;
    public static final int IMAGE_ONLY_FIELD_NUMBER = 3;
    public static final int MODAL_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private int messageDetailsCase_ = 0;
    private Object messageDetails_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessageDetails() {
        this.messageDetailsCase_ = 0;
        this.messageDetails_ = null;
    }

    public static MessagesProto$Content getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasBanner() {
        return this.messageDetailsCase_ == 1;
    }

    public boolean hasCard() {
        return this.messageDetailsCase_ == 4;
    }

    public boolean hasImageOnly() {
        return this.messageDetailsCase_ == 3;
    }

    public boolean hasModal() {
        return this.messageDetailsCase_ == 2;
    }

    public enum read {
        BANNER(1),
        MODAL(2),
        IMAGE_ONLY(3),
        CARD(4),
        MESSAGEDETAILS_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        read(int i) {
            this.value = i;
        }

        @Deprecated
        public static read valueOf(int i) {
            return forNumber(i);
        }

        public static read forNumber(int i) {
            if (i == 0) {
                return MESSAGEDETAILS_NOT_SET;
            }
            if (i == 1) {
                return BANNER;
            }
            if (i == 2) {
                return MODAL;
            }
            if (i == 3) {
                return IMAGE_ONLY;
            }
            if (i != 4) {
                return null;
            }
            return CARD;
        }
    }

    static {
        MessagesProto$Content messagesProto$Content = new MessagesProto$Content();
        DEFAULT_INSTANCE = messagesProto$Content;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$Content.class, messagesProto$Content);
    }

    public static PointerInputModifierNode newBuilder() {
        return (PointerInputModifierNode) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$Content parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Content parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (ParentDataModifierNodeKt.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new MessagesProto$Content();
            case 2:
                return new PointerInputModifierNode(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"messageDetails_", "messageDetailsCase_", MessagesProto$BannerMessage.class, MessagesProto$ModalMessage.class, MessagesProto$ImageOnlyMessage.class, MessagesProto$CardMessage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (MessagesProto$Content.class) {
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

    public read getMessageDetailsCase() {
        return read.forNumber(this.messageDetailsCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBanner(MessagesProto$BannerMessage messagesProto$BannerMessage) {
        messagesProto$BannerMessage.getClass();
        if (this.messageDetailsCase_ != 1 || this.messageDetails_ == MessagesProto$BannerMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$BannerMessage;
        } else {
            getResult getresultNewBuilder = MessagesProto$BannerMessage.newBuilder((MessagesProto$BannerMessage) this.messageDetails_);
            getresultNewBuilder.read(messagesProto$BannerMessage);
            this.messageDetails_ = getresultNewBuilder.read();
        }
        this.messageDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCard(MessagesProto$CardMessage messagesProto$CardMessage) {
        messagesProto$CardMessage.getClass();
        if (this.messageDetailsCase_ != 4 || this.messageDetails_ == MessagesProto$CardMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$CardMessage;
        } else {
            PlaceableResult placeableResultNewBuilder = MessagesProto$CardMessage.newBuilder((MessagesProto$CardMessage) this.messageDetails_);
            placeableResultNewBuilder.read(messagesProto$CardMessage);
            this.messageDetails_ = placeableResultNewBuilder.read();
        }
        this.messageDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeImageOnly(MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage) {
        messagesProto$ImageOnlyMessage.getClass();
        if (this.messageDetailsCase_ != 3 || this.messageDetails_ == MessagesProto$ImageOnlyMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$ImageOnlyMessage;
        } else {
            Ref refNewBuilder = MessagesProto$ImageOnlyMessage.newBuilder((MessagesProto$ImageOnlyMessage) this.messageDetails_);
            refNewBuilder.read(messagesProto$ImageOnlyMessage);
            this.messageDetails_ = refNewBuilder.read();
        }
        this.messageDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeModal(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        messagesProto$ModalMessage.getClass();
        if (this.messageDetailsCase_ != 2 || this.messageDetails_ == MessagesProto$ModalMessage.getDefaultInstance()) {
            this.messageDetails_ = messagesProto$ModalMessage;
        } else {
            RootForTest rootForTestNewBuilder = MessagesProto$ModalMessage.newBuilder((MessagesProto$ModalMessage) this.messageDetails_);
            rootForTestNewBuilder.read(messagesProto$ModalMessage);
            this.messageDetails_ = rootForTestNewBuilder.read();
        }
        this.messageDetailsCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBanner(MessagesProto$BannerMessage messagesProto$BannerMessage) {
        messagesProto$BannerMessage.getClass();
        this.messageDetails_ = messagesProto$BannerMessage;
        this.messageDetailsCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCard(MessagesProto$CardMessage messagesProto$CardMessage) {
        messagesProto$CardMessage.getClass();
        this.messageDetails_ = messagesProto$CardMessage;
        this.messageDetailsCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageOnly(MessagesProto$ImageOnlyMessage messagesProto$ImageOnlyMessage) {
        messagesProto$ImageOnlyMessage.getClass();
        this.messageDetails_ = messagesProto$ImageOnlyMessage;
        this.messageDetailsCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModal(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        messagesProto$ModalMessage.getClass();
        this.messageDetails_ = messagesProto$ModalMessage;
        this.messageDetailsCase_ = 2;
    }

    private MessagesProto$Content() {
    }

    public MessagesProto$BannerMessage getBanner() {
        return this.messageDetailsCase_ == 1 ? (MessagesProto$BannerMessage) this.messageDetails_ : MessagesProto$BannerMessage.getDefaultInstance();
    }

    public MessagesProto$CardMessage getCard() {
        return this.messageDetailsCase_ == 4 ? (MessagesProto$CardMessage) this.messageDetails_ : MessagesProto$CardMessage.getDefaultInstance();
    }

    public MessagesProto$ImageOnlyMessage getImageOnly() {
        return this.messageDetailsCase_ == 3 ? (MessagesProto$ImageOnlyMessage) this.messageDetails_ : MessagesProto$ImageOnlyMessage.getDefaultInstance();
    }

    public MessagesProto$ModalMessage getModal() {
        return this.messageDetailsCase_ == 2 ? (MessagesProto$ModalMessage) this.messageDetails_ : MessagesProto$ModalMessage.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBanner() {
        if (this.messageDetailsCase_ == 1) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCard() {
        if (this.messageDetailsCase_ == 4) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageOnly() {
        if (this.messageDetailsCase_ == 3) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModal() {
        if (this.messageDetailsCase_ == 2) {
            this.messageDetailsCase_ = 0;
            this.messageDetails_ = null;
        }
    }

    public static PointerInputModifierNode newBuilder(MessagesProto$Content messagesProto$Content) {
        return (PointerInputModifierNode) DEFAULT_INSTANCE.createBuilder(messagesProto$Content);
    }

    public static MessagesProto$Content parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Content parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Content parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static MessagesProto$Content parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Content parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$Content parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Content parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Content parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Content parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$Content parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
