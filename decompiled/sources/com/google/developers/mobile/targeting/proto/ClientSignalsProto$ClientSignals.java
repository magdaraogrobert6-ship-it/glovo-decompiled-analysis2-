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
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setNextChildLookaheadPlaceOrderui;
import o.updateParentData;

/* JADX INFO: loaded from: classes2.dex */
public final class ClientSignalsProto$ClientSignals extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    private static final ClientSignalsProto$ClientSignals DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    private static volatile component23 PARSER = null;
    public static final int PLATFORM_VERSION_FIELD_NUMBER = 2;
    public static final int TIME_ZONE_FIELD_NUMBER = 4;
    private String appVersion_ = "";
    private String platformVersion_ = "";
    private String languageCode_ = "";
    private String timeZone_ = "";

    public static ClientSignalsProto$ClientSignals getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public String getPlatformVersion() {
        return this.platformVersion_;
    }

    public String getTimeZone() {
        return this.timeZone_;
    }

    static {
        ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals = new ClientSignalsProto$ClientSignals();
        DEFAULT_INSTANCE = clientSignalsProto$ClientSignals;
        GeneratedMessageLite.registerDefaultInstance(ClientSignalsProto$ClientSignals.class, clientSignalsProto$ClientSignals);
    }

    public static updateParentData newBuilder() {
        return (updateParentData) DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientSignalsProto$ClientSignals parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (setNextChildLookaheadPlaceOrderui.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ClientSignalsProto$ClientSignals();
            case 2:
                return new updateParentData(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"appVersion_", "platformVersion_", "languageCode_", "timeZone_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ClientSignalsProto$ClientSignals.class) {
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

    public getClipMetadata getAppVersionBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.appVersion_);
    }

    public getClipMetadata getLanguageCodeBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.languageCode_);
    }

    public getClipMetadata getPlatformVersionBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.platformVersion_);
    }

    public getClipMetadata getTimeZoneBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.timeZone_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        str.getClass();
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.appVersion_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.languageCode_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersion(String str) {
        str.getClass();
        this.platformVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlatformVersionBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.platformVersion_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(String str) {
        str.getClass();
        this.timeZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.timeZone_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformVersion() {
        this.platformVersion_ = getDefaultInstance().getPlatformVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        this.timeZone_ = getDefaultInstance().getTimeZone();
    }

    private ClientSignalsProto$ClientSignals() {
    }

    public static updateParentData newBuilder(ClientSignalsProto$ClientSignals clientSignalsProto$ClientSignals) {
        return (updateParentData) DEFAULT_INSTANCE.createBuilder(clientSignalsProto$ClientSignals);
    }

    public static ClientSignalsProto$ClientSignals parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(InputStream inputStream) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientSignalsProto$ClientSignals parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ClientSignalsProto$ClientSignals) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
