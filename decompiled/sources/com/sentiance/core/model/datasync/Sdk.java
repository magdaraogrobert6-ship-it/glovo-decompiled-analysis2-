package com.sentiance.core.model.datasync;

import com.sentiance.protobuf.ByteString;
import com.sentiance.protobuf.GeneratedMessageLite;
import com.sentiance.protobuf.InvalidProtocolBufferException;
import com.sentiance.protobuf.a;
import com.sentiance.protobuf.u;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.DelayedInitializationAnalyticsBehavior;
import o.accessgetDiskLruCachep;
import o.disableSdklambda0;
import o.enableDelayedInitializationlambda3;
import o.getAlignmentLinesMap;
import o.r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes5.dex */
public final class Sdk extends GeneratedMessageLite implements accessgetDiskLruCachep {
    public static final int APP_ID_FIELD_NUMBER = 3;
    private static final Sdk DEFAULT_INSTANCE;
    public static final int INSTALL_ID_FIELD_NUMBER = 2;
    public static final int OS_FIELD_NUMBER = 5;
    private static volatile writeStringlambda1 PARSER = null;
    public static final int PERSON_ID_FIELD_NUMBER = 1;
    public static final int SDK_VERSION_FIELD_NUMBER = 4;
    private int os_;
    private String personId_ = "";
    private String installId_ = "";
    private String appId_ = "";
    private String sdkVersion_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = 0;
    }

    public static Sdk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsValue(int i) {
        this.os_ = i;
    }

    public String getAppId() {
        return this.appId_;
    }

    public String getInstallId() {
        return this.installId_;
    }

    public int getOsValue() {
        return this.os_;
    }

    public String getPersonId() {
        return this.personId_;
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    static {
        Sdk sdk = new Sdk();
        DEFAULT_INSTANCE = sdk;
        GeneratedMessageLite.registerDefaultInstance(Sdk.class, sdk);
    }

    public static enableDelayedInitializationlambda3 newBuilder() {
        return (enableDelayedInitializationlambda3) DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static writeStringlambda1 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.sentiance.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        writeStringlambda1 r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
        switch (disableSdklambda0.read[methodToInvoke.ordinal()]) {
            case 1:
                return new Sdk();
            case 2:
                return new enableDelayedInitializationlambda3(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"personId_", "installId_", "appId_", "sdkVersion_", "os_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                writeStringlambda1 writestringlambda1 = PARSER;
                if (writestringlambda1 != null) {
                    return writestringlambda1;
                }
                synchronized (Sdk.class) {
                    r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = PARSER;
                    if (r8lambdaxuhu5lvqisjsccdg7c1_hbvwri == null) {
                        r8lambdaxuhu5lvqisjsccdg7c1_hbvwri = new r8lambdaxuHU5lVQiSJSCCDg7c1_hBVWrI();
                        PARSER = r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
                    }
                    break;
                }
                return r8lambdaxuhu5lvqisjsccdg7c1_hbvwri;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                getAlignmentLinesMap.write();
                return null;
        }
    }

    public ByteString getAppIdBytes() {
        return ByteString.read(this.appId_);
    }

    public ByteString getInstallIdBytes() {
        return ByteString.read(this.installId_);
    }

    public OS getOs() {
        OS osForNumber = OS.forNumber(this.os_);
        return osForNumber == null ? OS.UNRECOGNIZED : osForNumber;
    }

    public ByteString getPersonIdBytes() {
        return ByteString.read(this.personId_);
    }

    public ByteString getSdkVersionBytes() {
        return ByteString.read(this.sdkVersion_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(String str) {
        str.getClass();
        this.appId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.appId_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallId(String str) {
        str.getClass();
        this.installId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstallIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.installId_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonId(String str) {
        str.getClass();
        this.personId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersonIdBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.personId_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        str.getClass();
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(ByteString byteString) {
        a.checkByteStringIsUtf8(byteString);
        this.sdkVersion_ = byteString.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppId() {
        this.appId_ = getDefaultInstance().getAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstallId() {
        this.installId_ = getDefaultInstance().getInstallId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersonId() {
        this.personId_ = getDefaultInstance().getPersonId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(OS os) {
        this.os_ = os.getNumber();
    }

    private Sdk() {
    }

    public static enableDelayedInitializationlambda3 newBuilder(Sdk sdk) {
        return (enableDelayedInitializationlambda3) DEFAULT_INSTANCE.createBuilder(sdk);
    }

    public static Sdk parseDelimitedFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Sdk) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Sdk parseFrom(ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, delayedInitializationAnalyticsBehavior);
    }

    public static Sdk parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sdk parseFrom(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, delayedInitializationAnalyticsBehavior);
    }

    public static Sdk parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk parseFrom(byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, delayedInitializationAnalyticsBehavior);
    }

    public static Sdk parseFrom(InputStream inputStream) throws IOException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk parseFrom(InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, delayedInitializationAnalyticsBehavior);
    }

    public static Sdk parseFrom(u uVar) throws IOException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar);
    }

    public static Sdk parseFrom(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
        return (Sdk) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, uVar, delayedInitializationAnalyticsBehavior);
    }
}
