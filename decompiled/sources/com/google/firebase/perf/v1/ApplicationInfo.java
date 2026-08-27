package com.google.firebase.perf.v1;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DrawableTransformation;
import o.EnumC0151autofill;
import o.boundsUpdatesContentCaptureEventLoop;
import o.component23;
import o.dumpRenderNodeData;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setFontFamilyResolver;
import o.startDrag12SF9DM;
import o.updateWindowMetrics;

/* JADX INFO: loaded from: classes2.dex */
public final class ApplicationInfo extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final ApplicationInfo DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private AndroidApplicationInfo androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private fromDpSizeitqla9I customAttributes_ = fromDpSizeitqla9I.serializer;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidAppInfo() {
        this.androidAppInfo_ = null;
        this.bitField0_ &= -5;
    }

    public static ApplicationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private fromDpSizeitqla9I internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    public String getAppInstanceId() {
        return this.appInstanceId_;
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public String getGoogleAppId() {
        return this.googleAppId_;
    }

    public boolean hasAndroidAppInfo() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAppInstanceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasApplicationProcessState() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasGoogleAppId() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        ApplicationInfo applicationInfo = new ApplicationInfo();
        DEFAULT_INSTANCE = applicationInfo;
        GeneratedMessageLite.registerDefaultInstance(ApplicationInfo.class, applicationInfo);
    }

    private fromDpSizeitqla9I internalGetMutableCustomAttributes() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.customAttributes_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.customAttributes_ = fromdpsizeitqla9i.serializer();
        }
        return this.customAttributes_;
    }

    public static updateWindowMetrics newBuilder() {
        return (updateWindowMetrics) DEFAULT_INSTANCE.createBuilder();
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (startDrag12SF9DM.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ApplicationInfo();
            case 2:
                return new updateWindowMetrics(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", EnumC0151autofill.internalGetVerifier(), "customAttributes_", boundsUpdatesContentCaptureEventLoop.RemoteActionCompatParcelizer});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ApplicationInfo.class) {
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

    public EnumC0151autofill getApplicationProcessState() {
        EnumC0151autofill enumC0151autofillForNumber = EnumC0151autofill.forNumber(this.applicationProcessState_);
        return enumC0151autofillForNumber == null ? EnumC0151autofill.APPLICATION_PROCESS_STATE_UNKNOWN : enumC0151autofillForNumber;
    }

    public getClipMetadata getGoogleAppIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.googleAppId_);
    }

    private ApplicationInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        AndroidApplicationInfo androidApplicationInfo2 = this.androidAppInfo_;
        if (androidApplicationInfo2 == null || androidApplicationInfo2 == AndroidApplicationInfo.getDefaultInstance()) {
            this.androidAppInfo_ = androidApplicationInfo;
        } else {
            setFontFamilyResolver setfontfamilyresolverNewBuilder = AndroidApplicationInfo.newBuilder(this.androidAppInfo_);
            setfontfamilyresolverNewBuilder.read(androidApplicationInfo);
            this.androidAppInfo_ = (AndroidApplicationInfo) setfontfamilyresolverNewBuilder.read();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppInfo(AndroidApplicationInfo androidApplicationInfo) {
        androidApplicationInfo.getClass();
        this.androidAppInfo_ = androidApplicationInfo;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceId(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetCustomAttributes = internalGetCustomAttributes();
        return fromdpsizeitqla9iInternalGetCustomAttributes.containsKey(str) ? (String) fromdpsizeitqla9iInternalGetCustomAttributes.get(str) : str2;
    }

    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetCustomAttributes = internalGetCustomAttributes();
        if (fromdpsizeitqla9iInternalGetCustomAttributes.containsKey(str)) {
            return (String) fromdpsizeitqla9iInternalGetCustomAttributes.get(str);
        }
        DrawableTransformation.write();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppInstanceId() {
        this.bitField0_ &= -3;
        this.appInstanceId_ = getDefaultInstance().getAppInstanceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationProcessState() {
        this.bitField0_ &= -9;
        this.applicationProcessState_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAppId() {
        this.bitField0_ &= -2;
        this.googleAppId_ = getDefaultInstance().getGoogleAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppInstanceIdBytes(getClipMetadata getclipmetadata) {
        this.appInstanceId_ = getclipmetadata.MediaMetadataCompat();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationProcessState(EnumC0151autofill enumC0151autofill) {
        this.applicationProcessState_ = enumC0151autofill.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAppIdBytes(getClipMetadata getclipmetadata) {
        this.googleAppId_ = getclipmetadata.MediaMetadataCompat();
        this.bitField0_ |= 1;
    }

    public AndroidApplicationInfo getAndroidAppInfo() {
        AndroidApplicationInfo androidApplicationInfo = this.androidAppInfo_;
        return androidApplicationInfo == null ? AndroidApplicationInfo.getDefaultInstance() : androidApplicationInfo;
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    public static updateWindowMetrics newBuilder(ApplicationInfo applicationInfo) {
        return (updateWindowMetrics) DEFAULT_INSTANCE.createBuilder(applicationInfo);
    }

    public static ApplicationInfo parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ApplicationInfo parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ApplicationInfo parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ApplicationInfo parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ApplicationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ApplicationInfo parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ApplicationInfo parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ApplicationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ApplicationInfo parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ApplicationInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
