package com.google.firestore.bundle;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firestore.v1.StructuredQuery;
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
import o.dataAvailable;
import o.decodeByte;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getDisableContentCapture;
import o.getIterableTextForAccessibility;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getShapeBounds;
import o.ifDebug;
import o.isAccessibilityFocused;
import o.isRequestFromAccessibilityTool;

/* JADX INFO: loaded from: classes4.dex */
public final class BundledQuery extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final BundledQuery DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimitType() {
        this.limitType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    public static BundledQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitTypeValue(int i) {
        this.limitType_ = i;
    }

    public int getLimitTypeValue() {
        return this.limitType_;
    }

    public String getParent() {
        return this.parent_;
    }

    public boolean hasStructuredQuery() {
        return this.queryTypeCase_ == 2;
    }

    public enum read {
        STRUCTURED_QUERY(2),
        QUERYTYPE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        read(int i) {
            this.value = i;
        }

        public static read forNumber(int i) {
            if (i == 0) {
                return QUERYTYPE_NOT_SET;
            }
            if (i != 2) {
                return null;
            }
            return STRUCTURED_QUERY;
        }

        @Deprecated
        public static read valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum write implements ifDebug {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);

        public static final int FIRST_VALUE = 0;
        public static final int LAST_VALUE = 1;
        private static final dataAvailable internalValueMap = new isRequestFromAccessibilityTool();
        private final int value;

        public static dataAvailable internalGetValueMap() {
            return internalValueMap;
        }

        public static decodeByte internalGetVerifier() {
            return isAccessibilityFocused.IconCompatParcelizer;
        }

        write(int i) {
            this.value = i;
        }

        @Override // o.ifDebug
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Can't get the number of an unknown enum value.");
            return 0;
        }

        public static write forNumber(int i) {
            if (i == 0) {
                return FIRST;
            }
            if (i != 1) {
                return null;
            }
            return LAST;
        }

        @Deprecated
        public static write valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        BundledQuery bundledQuery = new BundledQuery();
        DEFAULT_INSTANCE = bundledQuery;
        GeneratedMessageLite.registerDefaultInstance(BundledQuery.class, bundledQuery);
    }

    public static getIterableTextForAccessibility newBuilder() {
        return (getIterableTextForAccessibility) DEFAULT_INSTANCE.createBuilder();
    }

    public static BundledQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BundledQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BundledQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getShapeBounds.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new BundledQuery();
            case 2:
                return new getIterableTextForAccessibility(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", StructuredQuery.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (BundledQuery.class) {
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

    public write getLimitType() {
        write writeVarForNumber = write.forNumber(this.limitType_);
        return writeVarForNumber == null ? write.UNRECOGNIZED : writeVarForNumber;
    }

    public getClipMetadata getParentBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.parent_);
    }

    public read getQueryTypeCase() {
        return read.forNumber(this.queryTypeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        if (this.queryTypeCase_ != 2 || this.queryType_ == StructuredQuery.getDefaultInstance()) {
            this.queryType_ = structuredQuery;
        } else {
            getDisableContentCapture getdisablecontentcaptureNewBuilder = StructuredQuery.newBuilder((StructuredQuery) this.queryType_);
            getdisablecontentcaptureNewBuilder.read(structuredQuery);
            this.queryType_ = getdisablecontentcaptureNewBuilder.read();
        }
        this.queryTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParent(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParentBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.parent_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructuredQuery(StructuredQuery structuredQuery) {
        structuredQuery.getClass();
        this.queryType_ = structuredQuery;
        this.queryTypeCase_ = 2;
    }

    private BundledQuery() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParent() {
        this.parent_ = getDefaultInstance().getParent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitType(write writeVar) {
        this.limitType_ = writeVar.getNumber();
    }

    public StructuredQuery getStructuredQuery() {
        return this.queryTypeCase_ == 2 ? (StructuredQuery) this.queryType_ : StructuredQuery.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    public static getIterableTextForAccessibility newBuilder(BundledQuery bundledQuery) {
        return (getIterableTextForAccessibility) DEFAULT_INSTANCE.createBuilder(bundledQuery);
    }

    public static BundledQuery parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundledQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledQuery parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledQuery parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static BundledQuery parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BundledQuery parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledQuery parseFrom(InputStream inputStream) throws IOException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BundledQuery parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BundledQuery parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundledQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
