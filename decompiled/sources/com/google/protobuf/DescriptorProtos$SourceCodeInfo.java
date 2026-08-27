package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DebugUtilsKt;
import o.component23;
import o.decodeFloat;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalAutofillManager;
import o.getLocalAutofillTreeannotations;
import o.getLocalAutofillannotations;
import o.getLocalProvidableScrollCaptureInProgress;
import o.startObserving;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class DescriptorProtos$SourceCodeInfo extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final DescriptorProtos$SourceCodeInfo DEFAULT_INSTANCE;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private static volatile component23 PARSER;
    private decodeString location_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Location extends GeneratedMessageLite implements getLocalAutofillannotations {
        private static final Location DEFAULT_INSTANCE;
        public static final int LEADING_COMMENTS_FIELD_NUMBER = 3;
        public static final int LEADING_DETACHED_COMMENTS_FIELD_NUMBER = 6;
        private static volatile component23 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SPAN_FIELD_NUMBER = 2;
        public static final int TRAILING_COMMENTS_FIELD_NUMBER = 4;
        private int bitField0_;
        private int pathMemoizedSerializedSize = -1;
        private int spanMemoizedSerializedSize = -1;
        private decodeFloat path_ = GeneratedMessageLite.emptyIntList();
        private decodeFloat span_ = GeneratedMessageLite.emptyIntList();
        private String leadingComments_ = "";
        private String trailingComments_ = "";
        private decodeString leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public String getLeadingComments() {
            return this.leadingComments_;
        }

        public List<String> getLeadingDetachedCommentsList() {
            return this.leadingDetachedComments_;
        }

        public List<Integer> getPathList() {
            return this.path_;
        }

        public List<Integer> getSpanList() {
            return this.span_;
        }

        public String getTrailingComments() {
            return this.trailingComments_;
        }

        public boolean hasLeadingComments() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasTrailingComments() {
            return (this.bitField0_ & 2) != 0;
        }

        static {
            Location location = new Location();
            DEFAULT_INSTANCE = location;
            GeneratedMessageLite.registerDefaultInstance(Location.class, location);
        }

        public static getLocalAutofillTreeannotations newBuilder() {
            return (getLocalAutofillTreeannotations) DEFAULT_INSTANCE.createBuilder();
        }

        public static Location parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (startObserving.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Location();
                case 2:
                    return new getLocalAutofillTreeannotations(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0000\u0001'\u0002'\u0003ဈ\u0000\u0004ဈ\u0001\u0006\u001a", new Object[]{"bitField0_", "path_", "span_", "leadingComments_", "trailingComments_", "leadingDetachedComments_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Location.class) {
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

        public getClipMetadata getLeadingCommentsBytes() {
            return getClipMetadata.RemoteActionCompatParcelizer(this.leadingComments_);
        }

        public String getLeadingDetachedComments(int i) {
            return (String) this.leadingDetachedComments_.get(i);
        }

        public getClipMetadata getLeadingDetachedCommentsBytes(int i) {
            return getClipMetadata.RemoteActionCompatParcelizer((String) this.leadingDetachedComments_.get(i));
        }

        public int getLeadingDetachedCommentsCount() {
            return this.leadingDetachedComments_.size();
        }

        public int getPath(int i) {
            return ((DebugUtilsKt) this.path_).serializer(i);
        }

        public int getPathCount() {
            return this.path_.size();
        }

        public int getSpan(int i) {
            return ((DebugUtilsKt) this.span_).serializer(i);
        }

        public int getSpanCount() {
            return this.span_.size();
        }

        public getClipMetadata getTrailingCommentsBytes() {
            return getClipMetadata.RemoteActionCompatParcelizer(this.trailingComments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLeadingDetachedComments(Iterable<String> iterable) {
            ensureLeadingDetachedCommentsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.leadingDetachedComments_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpan(Iterable<? extends Integer> iterable) {
            ensureSpanIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.span_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedComments(String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeadingDetachedCommentsBytes(getClipMetadata getclipmetadata) {
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.add(getclipmetadata.MediaMetadataCompat());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i) {
            ensurePathIsMutable();
            ((DebugUtilsKt) this.path_).IconCompatParcelizer(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpan(int i) {
            ensureSpanIsMutable();
            ((DebugUtilsKt) this.span_).IconCompatParcelizer(i);
        }

        private void ensureLeadingDetachedCommentsIsMutable() {
            decodeString decodestring = this.leadingDetachedComments_;
            if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
                return;
            }
            this.leadingDetachedComments_ = GeneratedMessageLite.mutableCopy(decodestring);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensurePathIsMutable() {
            decodeFloat decodefloat = this.path_;
            if (((transformMatrixToWindowEL8BTi8) decodefloat).RemoteActionCompatParcelizer) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(decodefloat);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureSpanIsMutable() {
            decodeFloat decodefloat = this.span_;
            if (((transformMatrixToWindowEL8BTi8) decodefloat).RemoteActionCompatParcelizer) {
                return;
            }
            this.span_ = GeneratedMessageLite.mutableCopy(decodefloat);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingComments(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.leadingComments_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingDetachedComments(int i, String str) {
            str.getClass();
            ensureLeadingDetachedCommentsIsMutable();
            this.leadingDetachedComments_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i, int i2) {
            ensurePathIsMutable();
            ((DebugUtilsKt) this.path_).IconCompatParcelizer(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpan(int i, int i2) {
            ensureSpanIsMutable();
            ((DebugUtilsKt) this.span_).IconCompatParcelizer(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingComments(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.trailingComments_ = str;
        }

        private Location() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingComments() {
            this.bitField0_ &= -2;
            this.leadingComments_ = getDefaultInstance().getLeadingComments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeadingDetachedComments() {
            this.leadingDetachedComments_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpan() {
            this.span_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrailingComments() {
            this.bitField0_ &= -3;
            this.trailingComments_ = getDefaultInstance().getTrailingComments();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeadingCommentsBytes(getClipMetadata getclipmetadata) {
            this.leadingComments_ = getclipmetadata.MediaMetadataCompat();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrailingCommentsBytes(getClipMetadata getclipmetadata) {
            this.trailingComments_ = getclipmetadata.MediaMetadataCompat();
            this.bitField0_ |= 2;
        }

        public static getLocalAutofillTreeannotations newBuilder(Location location) {
            return (getLocalAutofillTreeannotations) DEFAULT_INSTANCE.createBuilder(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Location) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Location parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Location parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Location parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Location parseFrom(InputStream inputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Location parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Location parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Location) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static DescriptorProtos$SourceCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Location> getLocationList() {
        return this.location_;
    }

    public List<? extends getLocalAutofillannotations> getLocationOrBuilderList() {
        return this.location_;
    }

    static {
        DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo = new DescriptorProtos$SourceCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$SourceCodeInfo;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$SourceCodeInfo.class, descriptorProtos$SourceCodeInfo);
    }

    public static getLocalAutofillManager newBuilder() {
        return (getLocalAutofillManager) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (startObserving.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DescriptorProtos$SourceCodeInfo();
            case 2:
                return new getLocalAutofillManager(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"location_", Location.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DescriptorProtos$SourceCodeInfo.class) {
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

    public Location getLocation(int i) {
        return (Location) this.location_.get(i);
    }

    public int getLocationCount() {
        return this.location_.size();
    }

    public getLocalAutofillannotations getLocationOrBuilder(int i) {
        return (getLocalAutofillannotations) this.location_.get(i);
    }

    private DescriptorProtos$SourceCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLocation(Iterable<? extends Location> iterable) {
        ensureLocationIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.location_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(location);
    }

    private void ensureLocationIsMutable() {
        decodeString decodestring = this.location_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.location_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocation(int i) {
        ensureLocationIsMutable();
        this.location_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(int i, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.set(i, location);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static getLocalAutofillManager newBuilder(DescriptorProtos$SourceCodeInfo descriptorProtos$SourceCodeInfo) {
        return (getLocalAutofillManager) DEFAULT_INSTANCE.createBuilder(descriptorProtos$SourceCodeInfo);
    }

    public static DescriptorProtos$SourceCodeInfo parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLocation(int i, Location location) {
        location.getClass();
        ensureLocationIsMutable();
        this.location_.add(i, location);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DescriptorProtos$SourceCodeInfo parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DescriptorProtos$SourceCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
