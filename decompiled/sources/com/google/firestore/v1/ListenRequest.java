package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.AndroidComposeViewStartDragAndDropN;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DrawableTransformation;
import o.addExtraDataToAccessibilityNodeInfo;
import o.component23;
import o.createAccessibilityNodeInfo;
import o.dumpRenderNodeData;
import o.findFocus;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;

/* JADX INFO: loaded from: classes2.dex */
public final class ListenRequest extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ListenRequest DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile component23 PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private fromDpSizeitqla9I labels_ = fromDpSizeitqla9I.serializer;
    private String database_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetChange() {
        this.targetChangeCase_ = 0;
        this.targetChange_ = null;
    }

    public static ListenRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableLabelsMap() {
        return internalGetMutableLabels();
    }

    private fromDpSizeitqla9I internalGetLabels() {
        return this.labels_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRemoveTarget(int i) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(i);
    }

    public String getDatabase() {
        return this.database_;
    }

    @Deprecated
    public Map<String, String> getLabels() {
        return getLabelsMap();
    }

    public boolean hasAddTarget() {
        return this.targetChangeCase_ == 2;
    }

    public boolean hasRemoveTarget() {
        return this.targetChangeCase_ == 3;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum write {
        ADD_TARGET(2),
        REMOVE_TARGET(3),
        TARGETCHANGE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        write(int i) {
            this.value = i;
        }

        @Deprecated
        public static write valueOf(int i) {
            return forNumber(i);
        }

        public static write forNumber(int i) {
            if (i == 0) {
                return TARGETCHANGE_NOT_SET;
            }
            if (i == 2) {
                return ADD_TARGET;
            }
            if (i != 3) {
                return null;
            }
            return REMOVE_TARGET;
        }
    }

    static {
        ListenRequest listenRequest = new ListenRequest();
        DEFAULT_INSTANCE = listenRequest;
        GeneratedMessageLite.registerDefaultInstance(ListenRequest.class, listenRequest);
    }

    private fromDpSizeitqla9I internalGetMutableLabels() {
        fromDpSizeitqla9I fromdpsizeitqla9i = this.labels_;
        if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
            this.labels_ = fromdpsizeitqla9i.serializer();
        }
        return this.labels_;
    }

    public static addExtraDataToAccessibilityNodeInfo newBuilder() {
        return (addExtraDataToAccessibilityNodeInfo) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListenRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (createAccessibilityNodeInfo.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ListenRequest();
            case 2:
                return new addExtraDataToAccessibilityNodeInfo(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", Target.class, "labels_", findFocus.IconCompatParcelizer});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ListenRequest.class) {
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

    public getClipMetadata getDatabaseBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.database_);
    }

    public write getTargetChangeCase() {
        return write.forNumber(this.targetChangeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAddTarget(Target target) {
        target.getClass();
        if (this.targetChangeCase_ != 2 || this.targetChange_ == Target.getDefaultInstance()) {
            this.targetChange_ = target;
        } else {
            AndroidComposeViewStartDragAndDropN androidComposeViewStartDragAndDropNNewBuilder = Target.newBuilder((Target) this.targetChange_);
            androidComposeViewStartDragAndDropNNewBuilder.read(target);
            this.targetChange_ = androidComposeViewStartDragAndDropNNewBuilder.read();
        }
        this.targetChangeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddTarget(Target target) {
        target.getClass();
        this.targetChange_ = target;
        this.targetChangeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabase(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDatabaseBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.database_ = getclipmetadata.MediaMetadataCompat();
    }

    public boolean containsLabels(String str) {
        str.getClass();
        return internalGetLabels().containsKey(str);
    }

    public String getLabelsOrDefault(String str, String str2) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetLabels = internalGetLabels();
        return fromdpsizeitqla9iInternalGetLabels.containsKey(str) ? (String) fromdpsizeitqla9iInternalGetLabels.get(str) : str2;
    }

    public String getLabelsOrThrow(String str) {
        str.getClass();
        fromDpSizeitqla9I fromdpsizeitqla9iInternalGetLabels = internalGetLabels();
        if (fromdpsizeitqla9iInternalGetLabels.containsKey(str)) {
            return (String) fromdpsizeitqla9iInternalGetLabels.get(str);
        }
        DrawableTransformation.write();
        return null;
    }

    private ListenRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDatabase() {
        this.database_ = getDefaultInstance().getDatabase();
    }

    public int getLabelsCount() {
        return internalGetLabels().size();
    }

    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(internalGetLabels());
    }

    public Target getAddTarget() {
        return this.targetChangeCase_ == 2 ? (Target) this.targetChange_ : Target.getDefaultInstance();
    }

    public int getRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            return ((Integer) this.targetChange_).intValue();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddTarget() {
        if (this.targetChangeCase_ == 2) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    public static addExtraDataToAccessibilityNodeInfo newBuilder(ListenRequest listenRequest) {
        return (addExtraDataToAccessibilityNodeInfo) DEFAULT_INSTANCE.createBuilder(listenRequest);
    }

    public static ListenRequest parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListenRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenRequest parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenRequest parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ListenRequest parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListenRequest parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListenRequest parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListenRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListenRequest parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListenRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
