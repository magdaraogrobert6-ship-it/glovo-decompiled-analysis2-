package com.google.firestore.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1;
import o.AndroidComposeViewAccessibilityDelegateCompatgetShapeBoundsshapeNodeMatcher1;
import o.CompositionLocalsKtLocalLayoutDirection1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.DrawableTransformation;
import o.component23;
import o.containsDescendant;
import o.decodeString;
import o.dumpRenderNodeData;
import o.fromDpSizeitqla9I;
import o.getAlignmentLinesMap;
import o.getClipMetadata;
import o.getFromIndex;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getTraverseTime;
import o.performAction;
import o.transformMatrixToWindowEL8BTi8;

/* JADX INFO: loaded from: classes2.dex */
public final class Pipeline extends GeneratedMessageLite implements dumpRenderNodeData {
    private static final Pipeline DEFAULT_INSTANCE;
    private static volatile component23 PARSER = null;
    public static final int STAGES_FIELD_NUMBER = 1;
    private decodeString stages_ = GeneratedMessageLite.emptyProtobufList();

    public static final class Stage extends GeneratedMessageLite implements getTraverseTime {
        public static final int ARGS_FIELD_NUMBER = 2;
        private static final Stage DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile component23 PARSER;
        private fromDpSizeitqla9I options_ = fromDpSizeitqla9I.serializer;
        private String name_ = "";
        private decodeString args_ = GeneratedMessageLite.emptyProtobufList();

        public static Stage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Value> getMutableOptionsMap() {
            return internalGetMutableOptions();
        }

        private fromDpSizeitqla9I internalGetOptions() {
            return this.options_;
        }

        public List<Value> getArgsList() {
            return this.args_;
        }

        public List<? extends containsDescendant> getArgsOrBuilderList() {
            return this.args_;
        }

        public String getName() {
            return this.name_;
        }

        @Deprecated
        public Map<String, Value> getOptions() {
            return getOptionsMap();
        }

        static {
            Stage stage = new Stage();
            DEFAULT_INSTANCE = stage;
            GeneratedMessageLite.registerDefaultInstance(Stage.class, stage);
        }

        private fromDpSizeitqla9I internalGetMutableOptions() {
            fromDpSizeitqla9I fromdpsizeitqla9i = this.options_;
            if (!fromdpsizeitqla9i.RemoteActionCompatParcelizer) {
                this.options_ = fromdpsizeitqla9i.serializer();
            }
            return this.options_;
        }

        public static AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1 newBuilder() {
            return (AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1) DEFAULT_INSTANCE.createBuilder();
        }

        public static Stage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Stage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Stage parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static component23 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
            component23 compositionLocalsKtLocalLayoutDirection1;
            switch (performAction.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
                case 1:
                    return new Stage();
                case 2:
                    return new AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1(DEFAULT_INSTANCE);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0001\u0000\u0001Ȉ\u0002\u001b\u00032", new Object[]{"name_", "args_", Value.class, "options_", AndroidComposeViewAccessibilityDelegateCompatgetShapeBoundsshapeNodeMatcher1.serializer});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    component23 component23Var = PARSER;
                    if (component23Var != null) {
                        return component23Var;
                    }
                    synchronized (Stage.class) {
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

        public Value getArgs(int i) {
            return (Value) this.args_.get(i);
        }

        public int getArgsCount() {
            return this.args_.size();
        }

        public containsDescendant getArgsOrBuilder(int i) {
            return (containsDescendant) this.args_.get(i);
        }

        public getClipMetadata getNameBytes() {
            return getClipMetadata.RemoteActionCompatParcelizer(this.name_);
        }

        private Stage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllArgs(Iterable<? extends Value> iterable) {
            ensureArgsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.args_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addArgs(Value value) {
            value.getClass();
            ensureArgsIsMutable();
            this.args_.add(value);
        }

        private void ensureArgsIsMutable() {
            decodeString decodestring = this.args_;
            if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
                return;
            }
            this.args_ = GeneratedMessageLite.mutableCopy(decodestring);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeArgs(int i) {
            ensureArgsIsMutable();
            this.args_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setArgs(int i, Value value) {
            value.getClass();
            ensureArgsIsMutable();
            this.args_.set(i, value);
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

        public boolean containsOptions(String str) {
            str.getClass();
            return internalGetOptions().containsKey(str);
        }

        public Value getOptionsOrDefault(String str, Value value) {
            str.getClass();
            fromDpSizeitqla9I fromdpsizeitqla9iInternalGetOptions = internalGetOptions();
            return fromdpsizeitqla9iInternalGetOptions.containsKey(str) ? (Value) fromdpsizeitqla9iInternalGetOptions.get(str) : value;
        }

        public Value getOptionsOrThrow(String str) {
            str.getClass();
            fromDpSizeitqla9I fromdpsizeitqla9iInternalGetOptions = internalGetOptions();
            if (fromdpsizeitqla9iInternalGetOptions.containsKey(str)) {
                return (Value) fromdpsizeitqla9iInternalGetOptions.get(str);
            }
            DrawableTransformation.write();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearArgs() {
            this.args_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public int getOptionsCount() {
            return internalGetOptions().size();
        }

        public Map<String, Value> getOptionsMap() {
            return Collections.unmodifiableMap(internalGetOptions());
        }

        public static AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1 newBuilder(Stage stage) {
            return (AndroidComposeViewAccessibilityDelegateCompatcurrentSemanticsNodes1) DEFAULT_INSTANCE.createBuilder(stage);
        }

        public static Stage parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Stage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Stage parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
        }

        public static Stage parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
        }

        public static Stage parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addArgs(int i, Value value) {
            value.getClass();
            ensureArgsIsMutable();
            this.args_.add(i, value);
        }

        public static Stage parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Stage parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
        }

        public static Stage parseFrom(InputStream inputStream) throws IOException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Stage parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
        }

        public static Stage parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Stage parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            return (Stage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        }
    }

    public static Pipeline getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public List<Stage> getStagesList() {
        return this.stages_;
    }

    public List<? extends getTraverseTime> getStagesOrBuilderList() {
        return this.stages_;
    }

    static {
        Pipeline pipeline = new Pipeline();
        DEFAULT_INSTANCE = pipeline;
        GeneratedMessageLite.registerDefaultInstance(Pipeline.class, pipeline);
    }

    public static getFromIndex newBuilder() {
        return (getFromIndex) DEFAULT_INSTANCE.createBuilder();
    }

    public static Pipeline parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Pipeline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pipeline parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static component23 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2) {
        component23 compositionLocalsKtLocalLayoutDirection1;
        switch (performAction.RemoteActionCompatParcelizer[compositionLocalsKtLocalTextToolbar1.ordinal()]) {
            case 1:
                return new Pipeline();
            case 2:
                return new getFromIndex(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"stages_", Stage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                component23 component23Var = PARSER;
                if (component23Var != null) {
                    return component23Var;
                }
                synchronized (Pipeline.class) {
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

    public Stage getStages(int i) {
        return (Stage) this.stages_.get(i);
    }

    public int getStagesCount() {
        return this.stages_.size();
    }

    public getTraverseTime getStagesOrBuilder(int i) {
        return (getTraverseTime) this.stages_.get(i);
    }

    private Pipeline() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStages(Iterable<? extends Stage> iterable) {
        ensureStagesIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.stages_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStages(Stage stage) {
        stage.getClass();
        ensureStagesIsMutable();
        this.stages_.add(stage);
    }

    private void ensureStagesIsMutable() {
        decodeString decodestring = this.stages_;
        if (((transformMatrixToWindowEL8BTi8) decodestring).RemoteActionCompatParcelizer) {
            return;
        }
        this.stages_ = GeneratedMessageLite.mutableCopy(decodestring);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStages(int i) {
        ensureStagesIsMutable();
        this.stages_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStages(int i, Stage stage) {
        stage.getClass();
        ensureStagesIsMutable();
        this.stages_.set(i, stage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStages() {
        this.stages_ = GeneratedMessageLite.emptyProtobufList();
    }

    public static getFromIndex newBuilder(Pipeline pipeline) {
        return (getFromIndex) DEFAULT_INSTANCE.createBuilder(pipeline);
    }

    public static Pipeline parseDelimitedFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Pipeline) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Pipeline parseFrom(ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, getlocalprovidablescrollcaptureinprogress);
    }

    public static Pipeline parseFrom(getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata);
    }

    public static Pipeline parseFrom(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, getclipmetadata, getlocalprovidablescrollcaptureinprogress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStages(int i, Stage stage) {
        stage.getClass();
        ensureStagesIsMutable();
        this.stages_.add(i, stage);
    }

    public static Pipeline parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Pipeline parseFrom(byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, getlocalprovidablescrollcaptureinprogress);
    }

    public static Pipeline parseFrom(InputStream inputStream) throws IOException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Pipeline parseFrom(InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, getlocalprovidablescrollcaptureinprogress);
    }

    public static Pipeline parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Pipeline parseFrom(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
        return (Pipeline) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, getlocalprovidablescrollcaptureinprogress);
    }
}
