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
import o.RootForTest;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLayoutCoordinates;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getPlaceable;
import o.setResult;

/* JADX INFO: loaded from: classes2.dex */
public final class MessagesProto$ModalMessage extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ACTION_BUTTON_FIELD_NUMBER = 4;
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final MessagesProto$ModalMessage DEFAULT_INSTANCE;
    public static final int IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private MessagesProto$Button actionButton_;
    private MessagesProto$Action action_;
    private int bitField0_;
    private MessagesProto$Text body_;
    private MessagesProto$Text title_;
    private String imageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAction() {
        this.action_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionButton() {
        this.actionButton_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    public static MessagesProto$ModalMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getBackgroundHexColor() {
        return this.backgroundHexColor_;
    }

    public String getImageUrl() {
        return this.imageUrl_;
    }

    public boolean hasAction() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasActionButton() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        MessagesProto$ModalMessage messagesProto$ModalMessage = new MessagesProto$ModalMessage();
        DEFAULT_INSTANCE = messagesProto$ModalMessage;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$ModalMessage.class, messagesProto$ModalMessage);
    }

    public static RootForTest newBuilder() {
        return (RootForTest) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$ModalMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$ModalMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (ParentDataModifierNodeKt.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new MessagesProto$ModalMessage();
            case 2:
                return new RootForTest(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ", new Object[]{"bitField0_", "title_", "body_", "imageUrl_", "actionButton_", "action_", "backgroundHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (MessagesProto$ModalMessage.class) {
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

    public getClipMetadata getBackgroundHexColorBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.backgroundHexColor_);
    }

    public getClipMetadata getImageUrlBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.imageUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        MessagesProto$Action messagesProto$Action2 = this.action_;
        if (messagesProto$Action2 == null || messagesProto$Action2 == MessagesProto$Action.getDefaultInstance()) {
            this.action_ = messagesProto$Action;
        } else {
            getPlaceable getplaceableNewBuilder = MessagesProto$Action.newBuilder(this.action_);
            getplaceableNewBuilder.read(messagesProto$Action);
            this.action_ = (MessagesProto$Action) getplaceableNewBuilder.read();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        MessagesProto$Button messagesProto$Button2 = this.actionButton_;
        if (messagesProto$Button2 == null || messagesProto$Button2 == MessagesProto$Button.getDefaultInstance()) {
            this.actionButton_ = messagesProto$Button;
        } else {
            setResult setresultNewBuilder = MessagesProto$Button.newBuilder(this.actionButton_);
            setresultNewBuilder.read(messagesProto$Button);
            this.actionButton_ = (MessagesProto$Button) setresultNewBuilder.read();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBody(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        MessagesProto$Text messagesProto$Text2 = this.body_;
        if (messagesProto$Text2 == null || messagesProto$Text2 == MessagesProto$Text.getDefaultInstance()) {
            this.body_ = messagesProto$Text;
        } else {
            getLayoutCoordinates getlayoutcoordinatesNewBuilder = MessagesProto$Text.newBuilder(this.body_);
            getlayoutcoordinatesNewBuilder.read(messagesProto$Text);
            this.body_ = (MessagesProto$Text) getlayoutcoordinatesNewBuilder.read();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTitle(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        MessagesProto$Text messagesProto$Text2 = this.title_;
        if (messagesProto$Text2 == null || messagesProto$Text2 == MessagesProto$Text.getDefaultInstance()) {
            this.title_ = messagesProto$Text;
        } else {
            getLayoutCoordinates getlayoutcoordinatesNewBuilder = MessagesProto$Text.newBuilder(this.title_);
            getlayoutcoordinatesNewBuilder.read(messagesProto$Text);
            this.title_ = (MessagesProto$Text) getlayoutcoordinatesNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        this.action_ = messagesProto$Action;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        this.actionButton_ = messagesProto$Button;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundHexColor(String str) {
        str.getClass();
        this.backgroundHexColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackgroundHexColorBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.backgroundHexColor_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        this.body_ = messagesProto$Text;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrl(String str) {
        str.getClass();
        this.imageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUrlBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.imageUrl_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        this.title_ = messagesProto$Text;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackgroundHexColor() {
        this.backgroundHexColor_ = getDefaultInstance().getBackgroundHexColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUrl() {
        this.imageUrl_ = getDefaultInstance().getImageUrl();
    }

    public MessagesProto$Action getAction() {
        MessagesProto$Action messagesProto$Action = this.action_;
        return messagesProto$Action == null ? MessagesProto$Action.getDefaultInstance() : messagesProto$Action;
    }

    public MessagesProto$Button getActionButton() {
        MessagesProto$Button messagesProto$Button = this.actionButton_;
        return messagesProto$Button == null ? MessagesProto$Button.getDefaultInstance() : messagesProto$Button;
    }

    public MessagesProto$Text getBody() {
        MessagesProto$Text messagesProto$Text = this.body_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    public MessagesProto$Text getTitle() {
        MessagesProto$Text messagesProto$Text = this.title_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    private MessagesProto$ModalMessage() {
    }

    public static RootForTest newBuilder(MessagesProto$ModalMessage messagesProto$ModalMessage) {
        return (RootForTest) DEFAULT_INSTANCE.createBuilder(messagesProto$ModalMessage);
    }

    public static MessagesProto$ModalMessage parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$ModalMessage parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$ModalMessage parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static MessagesProto$ModalMessage parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$ModalMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$ModalMessage parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$ModalMessage parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$ModalMessage parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$ModalMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$ModalMessage parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$ModalMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
