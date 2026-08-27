package com.google.firestore.v1;

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
import o.getSendRecurringAccessibilityEventsIntervalMillisui;
import o.onTouchExplorationStateChanged;
import o.sendEventForVirtualView;

/* JADX INFO: loaded from: classes2.dex */
public final class ExistenceFilter extends GeneratedMessageLite implements dumpRenderNodeData {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ExistenceFilter DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int count_;
    private int targetId_;
    private BloomFilter unchangedNames_;

    private ExistenceFilter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCount() {
        this.count_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTargetId() {
        this.targetId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnchangedNames() {
        this.unchangedNames_ = null;
        this.bitField0_ &= -2;
    }

    public static ExistenceFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCount(int i) {
        this.count_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTargetId(int i) {
        this.targetId_ = i;
    }

    public int getCount() {
        return this.count_;
    }

    public int getTargetId() {
        return this.targetId_;
    }

    public boolean hasUnchangedNames() {
        return (this.bitField0_ & 1) != 0;
    }

    static {
        ExistenceFilter existenceFilter = new ExistenceFilter();
        DEFAULT_INSTANCE = existenceFilter;
        GeneratedMessageLite.registerDefaultInstance(ExistenceFilter.class, existenceFilter);
    }

    public static onTouchExplorationStateChanged newBuilder() {
        return (onTouchExplorationStateChanged) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExistenceFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExistenceFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExistenceFilter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (getSendRecurringAccessibilityEventsIntervalMillisui.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ExistenceFilter();
            case 2:
                return new onTouchExplorationStateChanged(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003ဉ\u0000", new Object[]{"bitField0_", "targetId_", "count_", "unchangedNames_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ExistenceFilter.class) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUnchangedNames(BloomFilter bloomFilter) {
        bloomFilter.getClass();
        BloomFilter bloomFilter2 = this.unchangedNames_;
        if (bloomFilter2 == null || bloomFilter2 == BloomFilter.getDefaultInstance()) {
            this.unchangedNames_ = bloomFilter;
        } else {
            sendEventForVirtualView sendeventforvirtualviewNewBuilder = BloomFilter.newBuilder(this.unchangedNames_);
            sendeventforvirtualviewNewBuilder.read(bloomFilter);
            this.unchangedNames_ = (BloomFilter) sendeventforvirtualviewNewBuilder.read();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnchangedNames(BloomFilter bloomFilter) {
        bloomFilter.getClass();
        this.unchangedNames_ = bloomFilter;
        this.bitField0_ |= 1;
    }

    public BloomFilter getUnchangedNames() {
        BloomFilter bloomFilter = this.unchangedNames_;
        return bloomFilter == null ? BloomFilter.getDefaultInstance() : bloomFilter;
    }

    public static onTouchExplorationStateChanged newBuilder(ExistenceFilter existenceFilter) {
        return (onTouchExplorationStateChanged) DEFAULT_INSTANCE.createBuilder(existenceFilter);
    }

    public static ExistenceFilter parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExistenceFilter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExistenceFilter parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExistenceFilter parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ExistenceFilter parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExistenceFilter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExistenceFilter parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExistenceFilter parseFrom(InputStream inputStream) throws IOException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExistenceFilter parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ExistenceFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ExistenceFilter parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ExistenceFilter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
