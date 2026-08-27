package com.google.developers.mobile.targeting.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.LayoutNodeLayoutDelegateKt;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setNextChildLookaheadPlaceOrderui;

/* JADX INFO: loaded from: classes4.dex */
public final class ClientSignalsProto$AppInstanceClaim extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 1;
    public static final int APP_INSTANCE_TOKEN_FIELD_NUMBER = 2;
    private static final ClientSignalsProto$AppInstanceClaim DEFAULT_INSTANCE;
    public static final int GMP_APP_ID_FIELD_NUMBER = 3;
    private static volatile component23 PARSER;
    private String appInstanceId_ = "";
    private String appInstanceToken_ = "";
    private String gmpAppId_ = "";

    public static ClientSignalsProto$AppInstanceClaim getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    public String getAppInstanceToken() {
        return this.appInstanceToken_;
    }

    public String getGmpAppId() {
        return this.gmpAppId_;
    }

    static {
        ClientSignalsProto$AppInstanceClaim clientSignalsProto$AppInstanceClaim = new ClientSignalsProto$AppInstanceClaim();
        DEFAULT_INSTANCE = clientSignalsProto$AppInstanceClaim;
        GeneratedMessageLite.registerDefaultInstance(ClientSignalsProto$AppInstanceClaim.class, clientSignalsProto$AppInstanceClaim);
    }

    public static LayoutNodeLayoutDelegateKt newBuilder() {
        return (LayoutNodeLayoutDelegateKt) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientSignalsProto$AppInstanceClaim parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (setNextChildLookaheadPlaceOrderui.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ClientSignalsProto$AppInstanceClaim();
            case 2:
                return new LayoutNodeLayoutDelegateKt(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"appInstanceId_", "appInstanceToken_", "gmpAppId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ClientSignalsProto$AppInstanceClaim.class) {
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

    public getClipMetadata getAppInstanceIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.appInstanceId_);
    }

    public getClipMetadata getAppInstanceTokenBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.appInstanceToken_);
    }

    public getClipMetadata getGmpAppIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.gmpAppId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        str.getClass();
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.appInstanceId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceToken(String str) {
        str.getClass();
        this.appInstanceToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceTokenBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.appInstanceToken_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmpAppId(String str) {
        str.getClass();
        this.gmpAppId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGmpAppIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.gmpAppId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceToken() {
        this.appInstanceToken_ = getDefaultInstance().getAppInstanceToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGmpAppId() {
        this.gmpAppId_ = getDefaultInstance().getGmpAppId();
    }

    private ClientSignalsProto$AppInstanceClaim() {
    }

    public static LayoutNodeLayoutDelegateKt newBuilder(ClientSignalsProto$AppInstanceClaim clientSignalsProto$AppInstanceClaim) {
        return (LayoutNodeLayoutDelegateKt) DEFAULT_INSTANCE.createBuilder(clientSignalsProto$AppInstanceClaim);
    }

    public static ClientSignalsProto$AppInstanceClaim parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientSignalsProto$AppInstanceClaim parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ClientSignalsProto$AppInstanceClaim) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
