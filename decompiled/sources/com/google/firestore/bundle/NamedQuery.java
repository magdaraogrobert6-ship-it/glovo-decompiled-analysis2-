package com.google.firestore.bundle;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.IconCompatParcelizer;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getIterableTextForAccessibility;
import o.getLocalProvidableScrollCaptureInProgress;
import o.isAccessibilitySelectionExtendable;
import o.isTouchExplorationEnabled;

/* JADX INFO: loaded from: classes4.dex */
public final class NamedQuery extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int BUNDLED_QUERY_FIELD_NUMBER = 2;
    private static final NamedQuery DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile component23 PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    private int bitField0_;
    private BundledQuery bundledQuery_;
    private String name_ = "";
    private Timestamp readTime_;

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundledQuery() {
        this.bundledQuery_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadTime() {
        this.readTime_ = null;
        this.bitField0_ &= -3;
    }

    public static NamedQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public String getName() {
        return this.name_;
    }

    public boolean hasBundledQuery() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasReadTime() {
        return (this.bitField0_ & 2) != 0;
    }

    static {
        NamedQuery namedQuery = new NamedQuery();
        DEFAULT_INSTANCE = namedQuery;
        GeneratedMessageLite.registerDefaultInstance(NamedQuery.class, namedQuery);
    }

    public static isTouchExplorationEnabled newBuilder() {
        return (isTouchExplorationEnabled) DEFAULT_INSTANCE.createBuilder();
    }

    public static NamedQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (NamedQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NamedQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (isAccessibilitySelectionExtendable.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new NamedQuery();
            case 2:
                return new isTouchExplorationEnabled(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "name_", "bundledQuery_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (NamedQuery.class) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBundledQuery(BundledQuery bundledQuery) {
        bundledQuery.getClass();
        BundledQuery bundledQuery2 = this.bundledQuery_;
        if (bundledQuery2 == null || bundledQuery2 == BundledQuery.getDefaultInstance()) {
            this.bundledQuery_ = bundledQuery;
        } else {
            getIterableTextForAccessibility getiterabletextforaccessibilityNewBuilder = BundledQuery.newBuilder(this.bundledQuery_);
            getiterabletextforaccessibilityNewBuilder.read(bundledQuery);
            this.bundledQuery_ = (BundledQuery) getiterabletextforaccessibilityNewBuilder.read();
        }
        this.bitField0_ |= 1;
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
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundledQuery(BundledQuery bundledQuery) {
        bundledQuery.getClass();
        this.bundledQuery_ = bundledQuery;
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
    public void setReadTime(Timestamp timestamp) {
        timestamp.getClass();
        this.readTime_ = timestamp;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public BundledQuery getBundledQuery() {
        BundledQuery bundledQuery = this.bundledQuery_;
        return bundledQuery == null ? BundledQuery.getDefaultInstance() : bundledQuery;
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    private NamedQuery() {
    }

    public static isTouchExplorationEnabled newBuilder(NamedQuery namedQuery) {
        return (isTouchExplorationEnabled) DEFAULT_INSTANCE.createBuilder(namedQuery);
    }

    public static NamedQuery parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (NamedQuery) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static NamedQuery parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static NamedQuery parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static NamedQuery parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static NamedQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NamedQuery parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static NamedQuery parseFrom(InputStream inputStream) throws IOException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NamedQuery parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static NamedQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static NamedQuery parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (NamedQuery) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
