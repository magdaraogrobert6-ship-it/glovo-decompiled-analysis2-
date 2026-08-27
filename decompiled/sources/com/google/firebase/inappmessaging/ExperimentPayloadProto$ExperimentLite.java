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
import o.OwnerSnapshotObserverclearInvalidObservations1;
import o.OwnerSnapshotObserveronCommitAffectingLayoutModifier1;
import o.component23;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.observeSemanticsReadsui;

/* JADX INFO: loaded from: classes2.dex */
public final class ExperimentPayloadProto$ExperimentLite extends GeneratedMessageLite implements OwnerSnapshotObserverclearInvalidObservations1 {
    private static final ExperimentPayloadProto$ExperimentLite DEFAULT_INSTANCE;
    public static final int EXPERIMENT_ID_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private String experimentId_ = "";

    public static ExperimentPayloadProto$ExperimentLite getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getExperimentId() {
        return this.experimentId_;
    }

    static {
        ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite = new ExperimentPayloadProto$ExperimentLite();
        DEFAULT_INSTANCE = experimentPayloadProto$ExperimentLite;
        GeneratedMessageLite.registerDefaultInstance(ExperimentPayloadProto$ExperimentLite.class, experimentPayloadProto$ExperimentLite);
    }

    public static OwnerSnapshotObserveronCommitAffectingLayoutModifier1 newBuilder() {
        return (OwnerSnapshotObserveronCommitAffectingLayoutModifier1) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExperimentPayloadProto$ExperimentLite parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (observeSemanticsReadsui.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ExperimentPayloadProto$ExperimentLite();
            case 2:
                return new OwnerSnapshotObserveronCommitAffectingLayoutModifier1(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"experimentId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ExperimentPayloadProto$ExperimentLite.class) {
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

    public getClipMetadata getExperimentIdBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.experimentId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentId(String str) {
        str.getClass();
        this.experimentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentIdBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.experimentId_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExperimentId() {
        this.experimentId_ = getDefaultInstance().getExperimentId();
    }

    private ExperimentPayloadProto$ExperimentLite() {
    }

    public static OwnerSnapshotObserveronCommitAffectingLayoutModifier1 newBuilder(ExperimentPayloadProto$ExperimentLite experimentPayloadProto$ExperimentLite) {
        return (OwnerSnapshotObserveronCommitAffectingLayoutModifier1) DEFAULT_INSTANCE.createBuilder(experimentPayloadProto$ExperimentLite);
    }

    public static ExperimentPayloadProto$ExperimentLite parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(InputStream inputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExperimentPayloadProto$ExperimentLite parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExperimentPayloadProto$ExperimentLite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
