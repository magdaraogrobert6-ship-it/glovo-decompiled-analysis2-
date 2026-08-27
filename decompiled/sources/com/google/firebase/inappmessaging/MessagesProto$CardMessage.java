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
import o.PlaceableResult;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLayoutCoordinates;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getPlaceable;
import o.setResult;

/* JADX INFO: loaded from: classes2.dex */
public final class MessagesProto$CardMessage extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BACKGROUND_HEX_COLOR_FIELD_NUMBER = 5;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final MessagesProto$CardMessage DEFAULT_INSTANCE;
    public static final int LANDSCAPE_IMAGE_URL_FIELD_NUMBER = 4;
    private static volatile component23 PARSER = null;
    public static final int PORTRAIT_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int PRIMARY_ACTION_BUTTON_FIELD_NUMBER = 6;
    public static final int PRIMARY_ACTION_FIELD_NUMBER = 7;
    public static final int SECONDARY_ACTION_BUTTON_FIELD_NUMBER = 8;
    public static final int SECONDARY_ACTION_FIELD_NUMBER = 9;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private MessagesProto$Text body_;
    private MessagesProto$Button primaryActionButton_;
    private MessagesProto$Action primaryAction_;
    private MessagesProto$Button secondaryActionButton_;
    private MessagesProto$Action secondaryAction_;
    private MessagesProto$Text title_;
    private String portraitImageUrl_ = "";
    private String landscapeImageUrl_ = "";
    private String backgroundHexColor_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryAction() {
        this.primaryAction_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrimaryActionButton() {
        this.primaryActionButton_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryAction() {
        this.secondaryAction_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondaryActionButton() {
        this.secondaryActionButton_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -2;
    }

    public static MessagesProto$CardMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getBackgroundHexColor() {
        return this.backgroundHexColor_;
    }

    public String getLandscapeImageUrl() {
        return this.landscapeImageUrl_;
    }

    public String getPortraitImageUrl() {
        return this.portraitImageUrl_;
    }

    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPrimaryAction() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPrimaryActionButton() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSecondaryAction() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasSecondaryActionButton() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        MessagesProto$CardMessage messagesProto$CardMessage = new MessagesProto$CardMessage();
        DEFAULT_INSTANCE = messagesProto$CardMessage;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$CardMessage.class, messagesProto$CardMessage);
    }

    public static PlaceableResult newBuilder() {
        return (PlaceableResult) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$CardMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$CardMessage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (ParentDataModifierNodeKt.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new MessagesProto$CardMessage();
            case 2:
                return new PlaceableResult(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004\tဉ\u0005", new Object[]{"bitField0_", "title_", "body_", "portraitImageUrl_", "landscapeImageUrl_", "backgroundHexColor_", "primaryActionButton_", "primaryAction_", "secondaryActionButton_", "secondaryAction_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (MessagesProto$CardMessage.class) {
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

    public getClipMetadata getLandscapeImageUrlBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.landscapeImageUrl_);
    }

    public getClipMetadata getPortraitImageUrlBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.portraitImageUrl_);
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
    public void mergePrimaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        MessagesProto$Action messagesProto$Action2 = this.primaryAction_;
        if (messagesProto$Action2 == null || messagesProto$Action2 == MessagesProto$Action.getDefaultInstance()) {
            this.primaryAction_ = messagesProto$Action;
        } else {
            getPlaceable getplaceableNewBuilder = MessagesProto$Action.newBuilder(this.primaryAction_);
            getplaceableNewBuilder.read(messagesProto$Action);
            this.primaryAction_ = (MessagesProto$Action) getplaceableNewBuilder.read();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePrimaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        MessagesProto$Button messagesProto$Button2 = this.primaryActionButton_;
        if (messagesProto$Button2 == null || messagesProto$Button2 == MessagesProto$Button.getDefaultInstance()) {
            this.primaryActionButton_ = messagesProto$Button;
        } else {
            setResult setresultNewBuilder = MessagesProto$Button.newBuilder(this.primaryActionButton_);
            setresultNewBuilder.read(messagesProto$Button);
            this.primaryActionButton_ = (MessagesProto$Button) setresultNewBuilder.read();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSecondaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        MessagesProto$Action messagesProto$Action2 = this.secondaryAction_;
        if (messagesProto$Action2 == null || messagesProto$Action2 == MessagesProto$Action.getDefaultInstance()) {
            this.secondaryAction_ = messagesProto$Action;
        } else {
            getPlaceable getplaceableNewBuilder = MessagesProto$Action.newBuilder(this.secondaryAction_);
            getplaceableNewBuilder.read(messagesProto$Action);
            this.secondaryAction_ = (MessagesProto$Action) getplaceableNewBuilder.read();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSecondaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        MessagesProto$Button messagesProto$Button2 = this.secondaryActionButton_;
        if (messagesProto$Button2 == null || messagesProto$Button2 == MessagesProto$Button.getDefaultInstance()) {
            this.secondaryActionButton_ = messagesProto$Button;
        } else {
            setResult setresultNewBuilder = MessagesProto$Button.newBuilder(this.secondaryActionButton_);
            setresultNewBuilder.read(messagesProto$Button);
            this.secondaryActionButton_ = (MessagesProto$Button) setresultNewBuilder.read();
        }
        this.bitField0_ |= 16;
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
    public void setLandscapeImageUrl(String str) {
        str.getClass();
        this.landscapeImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLandscapeImageUrlBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.landscapeImageUrl_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitImageUrl(String str) {
        str.getClass();
        this.portraitImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPortraitImageUrlBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.portraitImageUrl_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        this.primaryAction_ = messagesProto$Action;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrimaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        this.primaryActionButton_ = messagesProto$Button;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryAction(MessagesProto$Action messagesProto$Action) {
        messagesProto$Action.getClass();
        this.secondaryAction_ = messagesProto$Action;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondaryActionButton(MessagesProto$Button messagesProto$Button) {
        messagesProto$Button.getClass();
        this.secondaryActionButton_ = messagesProto$Button;
        this.bitField0_ |= 16;
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
    public void clearLandscapeImageUrl() {
        this.landscapeImageUrl_ = getDefaultInstance().getLandscapeImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPortraitImageUrl() {
        this.portraitImageUrl_ = getDefaultInstance().getPortraitImageUrl();
    }

    public MessagesProto$Text getBody() {
        MessagesProto$Text messagesProto$Text = this.body_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    public MessagesProto$Action getPrimaryAction() {
        MessagesProto$Action messagesProto$Action = this.primaryAction_;
        return messagesProto$Action == null ? MessagesProto$Action.getDefaultInstance() : messagesProto$Action;
    }

    public MessagesProto$Button getPrimaryActionButton() {
        MessagesProto$Button messagesProto$Button = this.primaryActionButton_;
        return messagesProto$Button == null ? MessagesProto$Button.getDefaultInstance() : messagesProto$Button;
    }

    public MessagesProto$Action getSecondaryAction() {
        MessagesProto$Action messagesProto$Action = this.secondaryAction_;
        return messagesProto$Action == null ? MessagesProto$Action.getDefaultInstance() : messagesProto$Action;
    }

    public MessagesProto$Button getSecondaryActionButton() {
        MessagesProto$Button messagesProto$Button = this.secondaryActionButton_;
        return messagesProto$Button == null ? MessagesProto$Button.getDefaultInstance() : messagesProto$Button;
    }

    public MessagesProto$Text getTitle() {
        MessagesProto$Text messagesProto$Text = this.title_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    private MessagesProto$CardMessage() {
    }

    public static PlaceableResult newBuilder(MessagesProto$CardMessage messagesProto$CardMessage) {
        return (PlaceableResult) DEFAULT_INSTANCE.createBuilder(messagesProto$CardMessage);
    }

    public static MessagesProto$CardMessage parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$CardMessage parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$CardMessage parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static MessagesProto$CardMessage parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$CardMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$CardMessage parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$CardMessage parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$CardMessage parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$CardMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$CardMessage parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$CardMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
