package com.google.apphosting.datastore.testing;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DelegatableNodeRegistrationHandle;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.requireLayoutDirection;

/* JADX INFO: loaded from: classes4.dex */
public final class DatastoreTestTrace$ValidationRule extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final DatastoreTestTrace$ValidationRule DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int VALIDATE_QUERY_INDEXES_FIELD_NUMBER = 2;
    public static final int VALIDATE_QUERY_RESULT_ORDER_FIELD_NUMBER = 1;
    private boolean validateQueryIndexes_;
    private boolean validateQueryResultOrder_;

    private DatastoreTestTrace$ValidationRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidateQueryIndexes() {
        this.validateQueryIndexes_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValidateQueryResultOrder() {
        this.validateQueryResultOrder_ = false;
    }

    public static DatastoreTestTrace$ValidationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidateQueryIndexes(boolean z) {
        this.validateQueryIndexes_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValidateQueryResultOrder(boolean z) {
        this.validateQueryResultOrder_ = z;
    }

    public boolean getValidateQueryIndexes() {
        return this.validateQueryIndexes_;
    }

    public boolean getValidateQueryResultOrder() {
        return this.validateQueryResultOrder_;
    }

    static {
        DatastoreTestTrace$ValidationRule datastoreTestTrace$ValidationRule = new DatastoreTestTrace$ValidationRule();
        DEFAULT_INSTANCE = datastoreTestTrace$ValidationRule;
        GeneratedMessageLite.registerDefaultInstance(DatastoreTestTrace$ValidationRule.class, datastoreTestTrace$ValidationRule);
    }

    public static requireLayoutDirection newBuilder() {
        return (requireLayoutDirection) DEFAULT_INSTANCE.createBuilder();
    }

    public static DatastoreTestTrace$ValidationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (DelegatableNodeRegistrationHandle.read[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new DatastoreTestTrace$ValidationRule();
            case 2:
                return new requireLayoutDirection(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"validateQueryResultOrder_", "validateQueryIndexes_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (DatastoreTestTrace$ValidationRule.class) {
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

    public static requireLayoutDirection newBuilder(DatastoreTestTrace$ValidationRule datastoreTestTrace$ValidationRule) {
        return (requireLayoutDirection) DEFAULT_INSTANCE.createBuilder(datastoreTestTrace$ValidationRule);
    }

    public static DatastoreTestTrace$ValidationRule parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(InputStream inputStream) throws IOException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DatastoreTestTrace$ValidationRule parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (DatastoreTestTrace$ValidationRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
