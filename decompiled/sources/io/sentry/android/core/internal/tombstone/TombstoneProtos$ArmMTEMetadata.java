package io.sentry.android.core.internal.tombstone;

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

/* JADX INFO: loaded from: classes4.dex */
public final class TombstoneProtos$ArmMTEMetadata extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final TombstoneProtos$ArmMTEMetadata DEFAULT_INSTANCE;
    public static final int MEMORY_TAGS_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private getClipMetadata memoryTags_ = getClipMetadata.serializer;

    public static TombstoneProtos$ArmMTEMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public getClipMetadata getMemoryTags() {
        return this.memoryTags_;
    }

    static {
        TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata = new TombstoneProtos$ArmMTEMetadata();
        DEFAULT_INSTANCE = tombstoneProtos$ArmMTEMetadata;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$ArmMTEMetadata.class, tombstoneProtos$ArmMTEMetadata);
    }

    public static MediaDescriptionCompat newBuilder() {
        return (MediaDescriptionCompat) DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$ArmMTEMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (IconCompatParcelizer.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TombstoneProtos$ArmMTEMetadata();
            case 2:
                return new MediaDescriptionCompat(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"memoryTags_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TombstoneProtos$ArmMTEMetadata.class) {
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

    private TombstoneProtos$ArmMTEMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryTags(getClipMetadata getclipmetadata) {
        getclipmetadata.getClass();
        this.memoryTags_ = getclipmetadata;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryTags() {
        this.memoryTags_ = getDefaultInstance().getMemoryTags();
    }

    public static MediaDescriptionCompat newBuilder(TombstoneProtos$ArmMTEMetadata tombstoneProtos$ArmMTEMetadata) {
        return (MediaDescriptionCompat) DEFAULT_INSTANCE.createBuilder(tombstoneProtos$ArmMTEMetadata);
    }

    public static TombstoneProtos$ArmMTEMetadata parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(InputStream inputStream) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$ArmMTEMetadata parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TombstoneProtos$ArmMTEMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
