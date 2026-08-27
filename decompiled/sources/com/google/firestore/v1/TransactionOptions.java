package com.google.firestore.v1;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.AndroidComposeViewVerificationHelperMethodsN;
import o.AndroidComposeViewVerificationHelperMethodsO;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.component23;
import o.dumpRenderNodeData;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getLocalProvidableScrollCaptureInProgress;
import o.setViewTranslationCallback;
import o.toAndroidPointerIcon;

/* JADX INFO: loaded from: classes4.dex */
public final class TransactionOptions extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final TransactionOptions DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    public static final class ReadOnly extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final ReadOnly DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConsistencySelector() {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }

        public static ReadOnly getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public boolean hasReadTime() {
            return this.consistencySelectorCase_ == 2;
        }

        public enum serializer {
            READ_TIME(2),
            CONSISTENCYSELECTOR_NOT_SET(0);

            private final int value;

            public int getNumber() {
                return this.value;
            }

            serializer(int i) {
                this.value = i;
            }

            public static serializer forNumber(int i) {
                if (i == 0) {
                    return CONSISTENCYSELECTOR_NOT_SET;
                }
                if (i != 2) {
                    return null;
                }
                return READ_TIME;
            }

            @Deprecated
            public static serializer valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            ReadOnly readOnly = new ReadOnly();
            DEFAULT_INSTANCE = readOnly;
            GeneratedMessageLite.registerDefaultInstance(ReadOnly.class, readOnly);
        }

        public static toAndroidPointerIcon newBuilder() {
            return (toAndroidPointerIcon) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReadOnly parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReadOnly) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadOnly parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (AndroidComposeViewVerificationHelperMethodsN.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new ReadOnly();
                case 2:
                    return new toAndroidPointerIcon(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002<\u0000", new Object[]{"consistencySelector_", "consistencySelectorCase_", Timestamp.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (ReadOnly.class) {
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

        public serializer getConsistencySelectorCase() {
            return serializer.forNumber(this.consistencySelectorCase_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeReadTime(Timestamp timestamp) {
            timestamp.getClass();
            if (this.consistencySelectorCase_ != 2 || this.consistencySelector_ == Timestamp.getDefaultInstance()) {
                this.consistencySelector_ = timestamp;
            } else {
                this.consistencySelector_ = o.IconCompatParcelizer.RemoteActionCompatParcelizer((Timestamp) this.consistencySelector_, timestamp);
            }
            this.consistencySelectorCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadTime(Timestamp timestamp) {
            timestamp.getClass();
            this.consistencySelector_ = timestamp;
            this.consistencySelectorCase_ = 2;
        }

        private ReadOnly() {
        }

        public Timestamp getReadTime() {
            return this.consistencySelectorCase_ == 2 ? (Timestamp) this.consistencySelector_ : Timestamp.getDefaultInstance();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadTime() {
            if (this.consistencySelectorCase_ == 2) {
                this.consistencySelectorCase_ = 0;
                this.consistencySelector_ = null;
            }
        }

        public static toAndroidPointerIcon newBuilder(ReadOnly readOnly) {
            return (toAndroidPointerIcon) DEFAULT_INSTANCE.createBuilder(readOnly);
        }

        public static ReadOnly parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ReadOnly) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadOnly parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadOnly parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static ReadOnly parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadOnly parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReadOnly parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadOnly parseFrom(InputStream inputStream) throws IOException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadOnly parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadOnly parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReadOnly parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ReadOnly) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static final class ReadWrite extends GeneratedMessageLite implements dumpRenderNodeData {
        private static final ReadWrite DEFAULT_INSTANCE;
        private static volatile component23 PARSER = null;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private getClipMetadata retryTransaction_ = getClipMetadata.serializer;

        public static ReadWrite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public getClipMetadata getRetryTransaction() {
            return this.retryTransaction_;
        }

        static {
            ReadWrite readWrite = new ReadWrite();
            DEFAULT_INSTANCE = readWrite;
            GeneratedMessageLite.registerDefaultInstance(ReadWrite.class, readWrite);
        }

        public static AndroidComposeViewVerificationHelperMethodsO newBuilder() {
            return (AndroidComposeViewVerificationHelperMethodsO) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReadWrite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReadWrite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadWrite parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (AndroidComposeViewVerificationHelperMethodsN.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new ReadWrite();
                case 2:
                    return new AndroidComposeViewVerificationHelperMethodsO(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"retryTransaction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (ReadWrite.class) {
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

        private ReadWrite() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryTransaction(getClipMetadata getclipmetadata) {
            getclipmetadata.getClass();
            this.retryTransaction_ = getclipmetadata;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRetryTransaction() {
            this.retryTransaction_ = getDefaultInstance().getRetryTransaction();
        }

        public static AndroidComposeViewVerificationHelperMethodsO newBuilder(ReadWrite readWrite) {
            return (AndroidComposeViewVerificationHelperMethodsO) DEFAULT_INSTANCE.createBuilder(readWrite);
        }

        public static ReadWrite parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ReadWrite) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadWrite parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadWrite parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static ReadWrite parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadWrite parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReadWrite parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadWrite parseFrom(InputStream inputStream) throws IOException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReadWrite parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static ReadWrite parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ReadWrite parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (ReadWrite) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMode() {
        this.modeCase_ = 0;
        this.mode_ = null;
    }

    public static TransactionOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public boolean hasReadOnly() {
        return this.modeCase_ == 2;
    }

    public boolean hasReadWrite() {
        return this.modeCase_ == 3;
    }

    public enum IconCompatParcelizer {
        READ_ONLY(2),
        READ_WRITE(3),
        MODE_NOT_SET(0);

        private final int value;

        public int getNumber() {
            return this.value;
        }

        IconCompatParcelizer(int i) {
            this.value = i;
        }

        @Deprecated
        public static IconCompatParcelizer valueOf(int i) {
            return forNumber(i);
        }

        public static IconCompatParcelizer forNumber(int i) {
            if (i == 0) {
                return MODE_NOT_SET;
            }
            if (i == 2) {
                return READ_ONLY;
            }
            if (i != 3) {
                return null;
            }
            return READ_WRITE;
        }
    }

    static {
        TransactionOptions transactionOptions = new TransactionOptions();
        DEFAULT_INSTANCE = transactionOptions;
        GeneratedMessageLite.registerDefaultInstance(TransactionOptions.class, transactionOptions);
    }

    public static setViewTranslationCallback newBuilder() {
        return (setViewTranslationCallback) DEFAULT_INSTANCE.createBuilder();
    }

    public static TransactionOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransactionOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionOptions parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (AndroidComposeViewVerificationHelperMethodsN.IconCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new TransactionOptions();
            case 2:
                return new setViewTranslationCallback(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"mode_", "modeCase_", ReadOnly.class, ReadWrite.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (TransactionOptions.class) {
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

    public IconCompatParcelizer getModeCase() {
        return IconCompatParcelizer.forNumber(this.modeCase_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadOnly(ReadOnly readOnly) {
        readOnly.getClass();
        if (this.modeCase_ != 2 || this.mode_ == ReadOnly.getDefaultInstance()) {
            this.mode_ = readOnly;
        } else {
            toAndroidPointerIcon toandroidpointericonNewBuilder = ReadOnly.newBuilder((ReadOnly) this.mode_);
            toandroidpointericonNewBuilder.read(readOnly);
            this.mode_ = toandroidpointericonNewBuilder.read();
        }
        this.modeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReadWrite(ReadWrite readWrite) {
        readWrite.getClass();
        if (this.modeCase_ != 3 || this.mode_ == ReadWrite.getDefaultInstance()) {
            this.mode_ = readWrite;
        } else {
            AndroidComposeViewVerificationHelperMethodsO androidComposeViewVerificationHelperMethodsONewBuilder = ReadWrite.newBuilder((ReadWrite) this.mode_);
            androidComposeViewVerificationHelperMethodsONewBuilder.read(readWrite);
            this.mode_ = androidComposeViewVerificationHelperMethodsONewBuilder.read();
        }
        this.modeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadOnly(ReadOnly readOnly) {
        readOnly.getClass();
        this.mode_ = readOnly;
        this.modeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReadWrite(ReadWrite readWrite) {
        readWrite.getClass();
        this.mode_ = readWrite;
        this.modeCase_ = 3;
    }

    private TransactionOptions() {
    }

    public ReadOnly getReadOnly() {
        return this.modeCase_ == 2 ? (ReadOnly) this.mode_ : ReadOnly.getDefaultInstance();
    }

    public ReadWrite getReadWrite() {
        return this.modeCase_ == 3 ? (ReadWrite) this.mode_ : ReadWrite.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadOnly() {
        if (this.modeCase_ == 2) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReadWrite() {
        if (this.modeCase_ == 3) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    public static setViewTranslationCallback newBuilder(TransactionOptions transactionOptions) {
        return (setViewTranslationCallback) DEFAULT_INSTANCE.createBuilder(transactionOptions);
    }

    public static TransactionOptions parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TransactionOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TransactionOptions parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static TransactionOptions parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static TransactionOptions parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    public static TransactionOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TransactionOptions parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static TransactionOptions parseFrom(InputStream inputStream) throws IOException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TransactionOptions parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static TransactionOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TransactionOptions parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (TransactionOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
