package com.google.firebase.perf.v1;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DebugUtilsKt;
import o.component23;
import o.decodeFloat;
import o.decodeInt;
import o.decodeULongsVKNKU;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getViewTreeOwners;
import o.get_autofillManagerui;
import o.invalidateDescendants;
import o.isArrEnabledui;
import o.isLifecycleInResumedState;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class PerfSession extends GeneratedMessageLite implements isLifecycleInResumedState {
    private static final PerfSession DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final decodeULongsVKNKU sessionVerbosity_converter_ = new invalidateDescendants(0);
    private int bitField0_;
    private String sessionId_ = "";
    private decodeFloat sessionVerbosity_ = GeneratedMessageLite.emptyIntList();

    public static PerfSession getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static getViewTreeOwners newBuilder() {
        return (getViewTreeOwners) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (isArrEnabledui.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new PerfSession();
            case 2:
                return new getViewTreeOwners(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", get_autofillManagerui.internalGetVerifier()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (PerfSession.class) {
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

    public getClipMetadata getSessionIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.sessionId_);
    }

    public get_autofillManagerui getSessionVerbosity(int i) {
        get_autofillManagerui get_autofillmanageruiForNumber = get_autofillManagerui.forNumber(((DebugUtilsKt) this.sessionVerbosity_).serializer(i));
        return get_autofillmanageruiForNumber == null ? get_autofillManagerui.SESSION_VERBOSITY_NONE : get_autofillmanageruiForNumber;
    }

    public int getSessionVerbosityCount() {
        return this.sessionVerbosity_.size();
    }

    public List<get_autofillManagerui> getSessionVerbosityList() {
        return new decodeInt(this.sessionVerbosity_, sessionVerbosity_converter_);
    }

    static {
        PerfSession perfSession = new PerfSession();
        DEFAULT_INSTANCE = perfSession;
        GeneratedMessageLite.registerDefaultInstance(PerfSession.class, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSessionVerbosity(Iterable<? extends get_autofillManagerui> iterable) {
        ensureSessionVerbosityIsMutable();
        for (get_autofillManagerui get_autofillmanagerui : iterable) {
            ((DebugUtilsKt) this.sessionVerbosity_).IconCompatParcelizer(get_autofillmanagerui.getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSessionVerbosity(get_autofillManagerui get_autofillmanagerui) {
        get_autofillmanagerui.getClass();
        ensureSessionVerbosityIsMutable();
        ((DebugUtilsKt) this.sessionVerbosity_).IconCompatParcelizer(get_autofillmanagerui.getNumber());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureSessionVerbosityIsMutable() {
        decodeFloat decodefloat = this.sessionVerbosity_;
        if (((transformMatrixToWindowEL8BTi8) decodefloat).RemoteActionCompatParcelizer) {
            return;
        }
        this.sessionVerbosity_ = GeneratedMessageLite.mutableCopy(decodefloat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionVerbosity(int i, get_autofillManagerui get_autofillmanagerui) {
        get_autofillmanagerui.getClass();
        ensureSessionVerbosityIsMutable();
        ((DebugUtilsKt) this.sessionVerbosity_).IconCompatParcelizer(i, get_autofillmanagerui.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionVerbosity() {
        this.sessionVerbosity_ = GeneratedMessageLite.emptyIntList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(getClipMetadata getclipmetadata) {
        this.sessionId_ = getclipmetadata.MediaMetadataCompat();
        this.bitField0_ |= 1;
    }

    private PerfSession() {
    }

    public static getViewTreeOwners newBuilder(PerfSession perfSession) {
        return (getViewTreeOwners) DEFAULT_INSTANCE.createBuilder(perfSession);
    }

    public static PerfSession parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static PerfSession parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static PerfSession parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static PerfSession parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static PerfSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfSession parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static PerfSession parseFrom(InputStream inputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfSession parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PerfSession parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (PerfSession) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
