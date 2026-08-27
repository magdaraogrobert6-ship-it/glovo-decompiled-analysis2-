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
import o.getLayoutCoordinates;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setResult;

/* JADX INFO: loaded from: classes2.dex */
public final class MessagesProto$Button extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BUTTON_HEX_COLOR_FIELD_NUMBER = 2;
    private static final MessagesProto$Button DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String buttonHexColor_ = "";
    private MessagesProto$Text text_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.text_ = null;
        this.bitField0_ &= -2;
    }

    public static MessagesProto$Button getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getButtonHexColor() {
        return this.buttonHexColor_;
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        MessagesProto$Button messagesProto$Button = new MessagesProto$Button();
        DEFAULT_INSTANCE = messagesProto$Button;
        GeneratedMessageLite.registerDefaultInstance(MessagesProto$Button.class, messagesProto$Button);
    }

    public static setResult newBuilder() {
        return (setResult) DEFAULT_INSTANCE.createBuilder();
    }

    public static MessagesProto$Button parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Button parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (ParentDataModifierNodeKt.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new MessagesProto$Button();
            case 2:
                return new setResult(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "text_", "buttonHexColor_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (MessagesProto$Button.class) {
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

    public getClipMetadata getButtonHexColorBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.buttonHexColor_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeText(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        MessagesProto$Text messagesProto$Text2 = this.text_;
        if (messagesProto$Text2 == null || messagesProto$Text2 == MessagesProto$Text.getDefaultInstance()) {
            this.text_ = messagesProto$Text;
        } else {
            getLayoutCoordinates getlayoutcoordinatesNewBuilder = MessagesProto$Text.newBuilder(this.text_);
            getlayoutcoordinatesNewBuilder.read(messagesProto$Text);
            this.text_ = (MessagesProto$Text) getlayoutcoordinatesNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonHexColor(String str) {
        str.getClass();
        this.buttonHexColor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonHexColorBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.buttonHexColor_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setText(MessagesProto$Text messagesProto$Text) {
        messagesProto$Text.getClass();
        this.text_ = messagesProto$Text;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonHexColor() {
        this.buttonHexColor_ = getDefaultInstance().getButtonHexColor();
    }

    public MessagesProto$Text getText() {
        MessagesProto$Text messagesProto$Text = this.text_;
        return messagesProto$Text == null ? MessagesProto$Text.getDefaultInstance() : messagesProto$Text;
    }

    private MessagesProto$Button() {
    }

    public static setResult newBuilder(MessagesProto$Button messagesProto$Button) {
        return (setResult) DEFAULT_INSTANCE.createBuilder(messagesProto$Button);
    }

    public static MessagesProto$Button parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Button parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Button parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static MessagesProto$Button parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Button parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MessagesProto$Button parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Button parseFrom(InputStream inputStream) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MessagesProto$Button parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static MessagesProto$Button parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static MessagesProto$Button parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (MessagesProto$Button) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
