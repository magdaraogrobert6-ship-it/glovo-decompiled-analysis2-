package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import o.AndroidComposeViewAccessibilityDelegateCompatApi24Impl;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setSendRecurringAccessibilityEventsIntervalMillisui;
import o.toSpannableString;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes4.dex */
public final class ListDocumentsResponse extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final ListDocumentsResponse DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile component23 PARSER;
    private decodeString documents_ = GeneratedMessageLite.emptyProtobufList();
    private String nextPageToken_ = "";

    public static ListDocumentsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Document> getDocumentsList() {
        return this.documents_;
    }

    public List<? extends toSpannableString> getDocumentsOrBuilderList() {
        return this.documents_;
    }

    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    static {
        ListDocumentsResponse listDocumentsResponse = new ListDocumentsResponse();
        DEFAULT_INSTANCE = listDocumentsResponse;
        GeneratedMessageLite.registerDefaultInstance(ListDocumentsResponse.class, listDocumentsResponse);
    }

    public static AndroidComposeViewAccessibilityDelegateCompatApi24Impl newBuilder() {
        return (AndroidComposeViewAccessibilityDelegateCompatApi24Impl) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListDocumentsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListDocumentsResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (setSendRecurringAccessibilityEventsIntervalMillisui.write[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new ListDocumentsResponse();
            case 2:
                return new AndroidComposeViewAccessibilityDelegateCompatApi24Impl(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"documents_", Document.class, "nextPageToken_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (ListDocumentsResponse.class) {
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

    public Document getDocuments(int i) {
        return (Document) this.documents_.get(i);
    }

    public int getDocumentsCount() {
        return this.documents_.size();
    }

    public toSpannableString getDocumentsOrBuilder(int i) {
        return (toSpannableString) this.documents_.get(i);
    }

    public getClipMetadata getNextPageTokenBytes() {
        return getClipMetadata.RemoteActionCompatParcelizer(this.nextPageToken_);
    }

    private ListDocumentsResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDocuments(Iterable<? extends Document> iterable) {
        ensureDocumentsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.documents_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocuments(Document document) {
        document.getClass();
        ensureDocumentsIsMutable();
        this.documents_.add(document);
    }

    private void ensureDocumentsIsMutable() {
        decodeString decodestring = this.documents_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.documents_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeDocuments(int i) {
        ensureDocumentsIsMutable();
        this.documents_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocuments(int i, Document document) {
        document.getClass();
        ensureDocumentsIsMutable();
        this.documents_.set(i, document);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageToken(String str) {
        str.getClass();
        this.nextPageToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextPageTokenBytes(getClipMetadata getclipmetadata) {
        AbstractMessageLite.checkByteStringIsUtf8(getclipmetadata);
        this.nextPageToken_ = getclipmetadata.MediaMetadataCompat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocuments() {
        this.documents_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNextPageToken() {
        this.nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    public static AndroidComposeViewAccessibilityDelegateCompatApi24Impl newBuilder(ListDocumentsResponse listDocumentsResponse) {
        return (AndroidComposeViewAccessibilityDelegateCompatApi24Impl) DEFAULT_INSTANCE.createBuilder(listDocumentsResponse);
    }

    public static ListDocumentsResponse parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListDocumentsResponse parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListDocumentsResponse parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static ListDocumentsResponse parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDocuments(int i, Document document) {
        document.getClass();
        ensureDocumentsIsMutable();
        this.documents_.add(i, document);
    }

    public static ListDocumentsResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListDocumentsResponse parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListDocumentsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListDocumentsResponse parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static ListDocumentsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ListDocumentsResponse parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (ListDocumentsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
