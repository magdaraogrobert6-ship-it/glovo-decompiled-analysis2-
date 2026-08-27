package com.google.firestore.bundle;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getHoveredVirtualViewIduiannotations;
import o.getIteratorForGranularity;
import o.getLocalProvidableScrollCaptureInProgress;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class BundledDocumentMetadata extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final BundledDocumentMetadata DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int QUERIES_FIELD_NUMBER = 4;
    public static final int READ_TIME_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean exists_;
    private String name_ = "";
    private decodeString queries_ = GeneratedMessageLite.emptyProtobufList();
    private Timestamp readTime_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExists() {
        this.exists_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -2;
    }

    public static BundledDocumentMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExists(boolean z) {
        this.exists_ = z;
    }

    public boolean getExists() {
        return this.exists_;
    }

    public String getName() {
        return this.name_;
    }

    public List<String> getQueriesList() {
        return this.queries_;
    }

    public boolean hasReadTime() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        BundledDocumentMetadata bundledDocumentMetadata = new BundledDocumentMetadata();
        DEFAULT_INSTANCE = bundledDocumentMetadata;
        GeneratedMessageLite.registerDefaultInstance(BundledDocumentMetadata.class, bundledDocumentMetadata);
    }

    public static getIteratorForGranularity newBuilder() {
        return (getIteratorForGranularity) DEFAULT_INSTANCE.createBuilder();
    }

    public static BundledDocumentMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BundledDocumentMetadata parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getHoveredVirtualViewIduiannotations.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new BundledDocumentMetadata();
            case 2:
                return new getIteratorForGranularity(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0007\u0004Ț", new Object[]{"bitField0_", "name_", "readTime_", "exists_", "queries_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (BundledDocumentMetadata.class) {
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

    public getClipMetadata getNameBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
    }

    public String getQueries(int i) {
        return (String) this.queries_.get(i);
    }

    public getClipMetadata getQueriesBytes(int i) {
        return getClipMetadata.RemoteActionCompatParcelizer((String) this.queries_.get(i));
    }

    public int getQueriesCount() {
        return this.queries_.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllQueries(Iterable<String> iterable) {
        ensureQueriesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.queries_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQueries(String str) {
        str.getClass();
        ensureQueriesIsMutable();
        this.queries_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addQueriesBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        ensureQueriesIsMutable();
        this.queries_.add(getclipmetadata.MediaMetadataCompat());
    }

    private void ensureQueriesIsMutable() {
        decodeString decodestring = this.queries_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.queries_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadTime(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.readTime_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.readTime_ = timestamp;
        } else {
            this.readTime_ = (Timestamp) IconCompatParcelizer.RemoteActionCompatParcelizer(this.readTime_, timestamp);
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.name_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQueries(int i, String str) {
        str.getClass();
        ensureQueriesIsMutable();
        this.queries_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQueries() {
        this.queries_ = GeneratedMessageLite.emptyProtobufList();
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    private BundledDocumentMetadata() {
    }

    public static getIteratorForGranularity newBuilder(BundledDocumentMetadata bundledDocumentMetadata) {
        return (getIteratorForGranularity) DEFAULT_INSTANCE.createBuilder(bundledDocumentMetadata);
    }

    public static BundledDocumentMetadata parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledDocumentMetadata parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledDocumentMetadata parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static BundledDocumentMetadata parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledDocumentMetadata parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BundledDocumentMetadata parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledDocumentMetadata parseFrom(InputStream inputStream) throws IOException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BundledDocumentMetadata parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static BundledDocumentMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static BundledDocumentMetadata parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (BundledDocumentMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
