package com.google.protobuf;

import bo.app.c8$$ExternalSyntheticOutline0;
import coil3.util.ContextsKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.ClipEntry;
import o.ClipboardExtensions_androidKt;
import o.ComposeView;
import o.ComposeViewCompanion;
import o.CompositionLocalsKtLocalClipboard1;
import o.CompositionLocalsKtLocalFontFamilyResolver1;
import o.CompositionLocalsKtLocalHapticFeedback1;
import o.CompositionLocalsKtLocalInputModeManager1;
import o.CompositionLocalsKtLocalLocale1;
import o.CompositionLocalsKtLocalPointerIconService1;
import o.CompositionLocalsKtLocalProvidableLocaleList1;
import o.CompositionLocalsKtLocalProvidableScrollCaptureInProgress1;
import o.CompositionLocalsKtLocalTextToolbar1;
import o.CompositionLocalsKtProvideCommonCompositionLocals1;
import o.DebugUtilsKt;
import o.DecodeHelper;
import o.DefaultHapticFeedback;
import o.DisposableSaveableStateRegistrylambda0;
import o.DrawableTransformation;
import o.GraphicsLayerOwnerLayer;
import o.canBeSaved;
import o.component22;
import o.component23;
import o.component26;
import o.dataAvailable;
import o.decodeBaselineShifty9eOQZs;
import o.decodeFloat;
import o.decodeShadow;
import o.decodeString;
import o.dumpRenderNodeData;
import o.getClipMetadata;
import o.getClipToOutline;
import o.getDpSizeMYxV2XQ;
import o.getElevation;
import o.getLocalDensity;
import o.getLocalProvidableScrollCaptureInProgress;
import o.getLocalScrollCaptureInProgress;
import o.getTimestampSeconds;
import o.getUniqueId;
import o.ifDebug;
import o.onScroll;
import o.onShowPress;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setDirty;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite {
    private static Map<Object, GeneratedMessageLite> serializer = new ConcurrentHashMap();
    public GraphicsLayerOwnerLayer RemoteActionCompatParcelizer;
    private int read;

    public abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends CompositionLocalsKtLocalProvidableLocaleList1> extends GeneratedMessageLite implements dumpRenderNodeData {
        public CompositionLocalsKtLocalClipboard1 extensions = CompositionLocalsKtLocalClipboard1.serializer;

        @Override // com.google.protobuf.GeneratedMessageLite, o.dumpRenderNodeData
        public /* bridge */ /* synthetic */ getElevation getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, o.getElevation
        public /* bridge */ /* synthetic */ getClipToOutline newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, o.getElevation
        public /* bridge */ /* synthetic */ getClipToOutline toBuilder() {
            return toBuilder();
        }

        private void mergeMessageSetExtensionFromBytes(getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1) throws IOException {
            getElevation getelevation = (getElevation) this.extensions.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write);
            getClipToOutline builder = getelevation != null ? getelevation.toBuilder() : null;
            if (builder == null) {
                builder = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.serializer().newBuilderForType();
            }
            CompositionLocalsKtLocalHapticFeedback1 compositionLocalsKtLocalHapticFeedback1 = (CompositionLocalsKtLocalHapticFeedback1) builder;
            compositionLocalsKtLocalHapticFeedback1.getClass();
            try {
                CodedInputStream codedInputStreamMediaSessionCompatQueueItem = getclipmetadata.MediaSessionCompatQueueItem();
                compositionLocalsKtLocalHapticFeedback1.IconCompatParcelizer(codedInputStreamMediaSessionCompatQueueItem, getlocalprovidablescrollcaptureinprogress);
                codedInputStreamMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(0);
                ensureExtensionsAreMutable().serializer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write, compositionLocalsKtLocalProvidableScrollCaptureInProgress1.RemoteActionCompatParcelizer(compositionLocalsKtLocalHapticFeedback1.serializer()));
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading " + compositionLocalsKtLocalHapticFeedback1.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
            }
        }

        public CompositionLocalsKtLocalClipboard1 ensureExtensionsAreMutable() {
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = this.extensions;
            if (compositionLocalsKtLocalClipboard1.write) {
                this.extensions = compositionLocalsKtLocalClipboard1.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.read();
        }

        public int extensionsSerializedSize() {
            return this.extensions.RemoteActionCompatParcelizer();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.IconCompatParcelizer();
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = this.extensions;
            if (compositionLocalsKtLocalClipboard1.write) {
                this.extensions = compositionLocalsKtLocalClipboard1.clone();
            }
            this.extensions.IconCompatParcelizer(messagetype.extensions);
        }

        public CompositionLocalsKtLocalPointerIconService1 newExtensionWriter() {
            return new CompositionLocalsKtLocalPointerIconService1(this);
        }

        public CompositionLocalsKtLocalPointerIconService1 newMessageSetExtensionWriter() {
            return new CompositionLocalsKtLocalPointerIconService1(this);
        }

        public <MessageType extends getElevation> boolean parseUnknownField(MessageType messagetype, CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, int i) throws IOException {
            int i2 = i >>> 3;
            return parseExtension(codedInputStream, getlocalprovidablescrollcaptureinprogress, getlocalprovidablescrollcaptureinprogress.RemoteActionCompatParcelizer(i2, messagetype), i, i2);
        }

        private <MessageType extends getElevation> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws IOException {
            int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
            ClipboardExtensions_androidKt clipboardExtensions_androidKtMediaBrowserCompatMediaItem = null;
            CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = null;
            while (true) {
                int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = codedInputStream.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                    break;
                }
                if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 16) {
                    iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStream.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                    if (iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != 0) {
                        compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = getlocalprovidablescrollcaptureinprogress.RemoteActionCompatParcelizer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, messagetype);
                    }
                } else if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 26) {
                    if (iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != 0 && compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer != null) {
                        eagerlyMergeMessageSetExtension(codedInputStream, compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer, getlocalprovidablescrollcaptureinprogress, iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
                        clipboardExtensions_androidKtMediaBrowserCompatMediaItem = null;
                    } else {
                        clipboardExtensions_androidKtMediaBrowserCompatMediaItem = codedInputStream.MediaBrowserCompatMediaItem();
                    }
                } else if (!codedInputStream.IconCompatParcelizer(iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg)) {
                    break;
                }
            }
            codedInputStream.RemoteActionCompatParcelizer(12);
            if (clipboardExtensions_androidKtMediaBrowserCompatMediaItem == null || iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 == 0) {
                return;
            }
            if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer != null) {
                mergeMessageSetExtensionFromBytes(clipboardExtensions_androidKtMediaBrowserCompatMediaItem, getlocalprovidablescrollcaptureinprogress, compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer);
            } else {
                mergeLengthDelimitedField(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, clipboardExtensions_androidKtMediaBrowserCompatMediaItem);
            }
        }

        private void verifyExtensionContainingType(CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1) {
            if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1.IconCompatParcelizer() == getDefaultInstanceForType()) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public final <Type> Type getExtension(getLocalScrollCaptureInProgress getlocalscrollcaptureinprogress, int i) {
            CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000 = GeneratedMessageLite.access$000(getlocalscrollcaptureinprogress);
            verifyExtensionContainingType(compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000);
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = this.extensions;
            CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000.write;
            compositionLocalsKtLocalClipboard1.getClass();
            if (!compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("getRepeatedField() can only be called on repeated fields.");
                return null;
            }
            Object obj = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1);
            if (obj != null) {
                return (Type) compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000.read(((List) obj).get(i));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <Type> int getExtensionCount(getLocalScrollCaptureInProgress getlocalscrollcaptureinprogress) {
            CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000 = GeneratedMessageLite.access$000(getlocalscrollcaptureinprogress);
            verifyExtensionContainingType(compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000);
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = this.extensions;
            CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000.write;
            compositionLocalsKtLocalClipboard1.getClass();
            if (!compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("getRepeatedField() can only be called on repeated fields.");
                return 0;
            }
            Object obj = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }

        public final <Type> boolean hasExtension(getLocalScrollCaptureInProgress getlocalscrollcaptureinprogress) {
            CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000 = GeneratedMessageLite.access$000(getlocalscrollcaptureinprogress);
            verifyExtensionContainingType(compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000);
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = this.extensions;
            CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000.write;
            compositionLocalsKtLocalClipboard1.getClass();
            if (!compositionLocalsKtLocalLocale1.MediaSessionCompatQueueItem()) {
                return compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale1) != null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public <MessageType extends getElevation> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, int i) throws IOException {
            if (i == 11) {
                mergeMessageSetExtensionFromCodedStream(messagetype, codedInputStream, getlocalprovidablescrollcaptureinprogress);
                return true;
            }
            if ((i & 7) == 2) {
                return parseUnknownField(messagetype, codedInputStream, getlocalprovidablescrollcaptureinprogress, i);
            }
            return codedInputStream.IconCompatParcelizer(i);
        }

        private void eagerlyMergeMessageSetExtension(CodedInputStream codedInputStream, CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, int i) throws IOException {
            parseExtension(codedInputStream, getlocalprovidablescrollcaptureinprogress, compositionLocalsKtLocalProvidableScrollCaptureInProgress1, (i << 3) | 2, i);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0028  */
        private boolean parseExtension(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1, int i, int i2) throws IOException {
            boolean z;
            Object objSerializer;
            getElevation getelevation;
            int i3 = i & 7;
            boolean z2 = false;
            if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1 == null) {
                z = false;
                z2 = true;
            } else {
                CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write;
                onScroll onscrollRemoteActionCompatParcelizer = compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer();
                CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = CompositionLocalsKtLocalClipboard1.serializer;
                if (i3 == onscrollRemoteActionCompatParcelizer.getWireType()) {
                    z = false;
                } else if (compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer && compositionLocalsKtLocalLocale1.write.isPackable() && i3 == 2) {
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
            }
            if (z2) {
                return parseUnknownField(i, codedInputStream);
            }
            ensureExtensionsAreMutable();
            if (z) {
                int i4 = codedInputStream.read(codedInputStream.MediaSessionCompatToken());
                CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale2 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write;
                if (compositionLocalsKtLocalLocale2.RemoteActionCompatParcelizer() == onScroll.ENUM) {
                    while (codedInputStream.write() > 0) {
                        ifDebug ifdebugIconCompatParcelizer = compositionLocalsKtLocalLocale2.read().IconCompatParcelizer(codedInputStream.MediaSessionCompatQueueItem());
                        if (ifdebugIconCompatParcelizer == null) {
                            return true;
                        }
                        this.extensions.write(compositionLocalsKtLocalLocale2, compositionLocalsKtLocalProvidableScrollCaptureInProgress1.RemoteActionCompatParcelizer(ifdebugIconCompatParcelizer));
                    }
                } else {
                    while (codedInputStream.write() > 0) {
                        onScroll onscrollRemoteActionCompatParcelizer2 = compositionLocalsKtLocalLocale2.RemoteActionCompatParcelizer();
                        CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard2 = CompositionLocalsKtLocalClipboard1.serializer;
                        this.extensions.write(compositionLocalsKtLocalLocale2, ContextsKt.RemoteActionCompatParcelizer(codedInputStream, onscrollRemoteActionCompatParcelizer2, onShowPress.LOOSE));
                    }
                }
                codedInputStream.serializer(i4);
                return true;
            }
            int[] iArr = CompositionLocalsKtLocalFontFamilyResolver1.IconCompatParcelizer;
            CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale3 = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.write;
            int i5 = iArr[compositionLocalsKtLocalLocale3.IconCompatParcelizer().ordinal()];
            if (i5 == 1) {
                getClipToOutline builder = (compositionLocalsKtLocalLocale3.MediaSessionCompatQueueItem() || (getelevation = (getElevation) this.extensions.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalLocale3)) == null) ? null : getelevation.toBuilder();
                if (builder == null) {
                    builder = compositionLocalsKtLocalProvidableScrollCaptureInProgress1.serializer().newBuilderForType();
                }
                if (compositionLocalsKtLocalLocale3.RemoteActionCompatParcelizer() == onScroll.GROUP) {
                    codedInputStream.IconCompatParcelizer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1.RemoteActionCompatParcelizer(), builder, getlocalprovidablescrollcaptureinprogress);
                } else {
                    codedInputStream.serializer(builder, getlocalprovidablescrollcaptureinprogress);
                }
                objSerializer = ((CompositionLocalsKtLocalHapticFeedback1) builder).serializer();
            } else if (i5 != 2) {
                onScroll onscrollRemoteActionCompatParcelizer3 = compositionLocalsKtLocalLocale3.RemoteActionCompatParcelizer();
                CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard3 = CompositionLocalsKtLocalClipboard1.serializer;
                objSerializer = ContextsKt.RemoteActionCompatParcelizer(codedInputStream, onscrollRemoteActionCompatParcelizer3, onShowPress.LOOSE);
            } else {
                int iMediaSessionCompatQueueItem = codedInputStream.MediaSessionCompatQueueItem();
                ifDebug ifdebugIconCompatParcelizer2 = compositionLocalsKtLocalLocale3.read().IconCompatParcelizer(iMediaSessionCompatQueueItem);
                if (ifdebugIconCompatParcelizer2 == null) {
                    mergeVarintField(i2, iMediaSessionCompatQueueItem);
                    return true;
                }
                objSerializer = ifdebugIconCompatParcelizer2;
            }
            boolean zMediaSessionCompatQueueItem = compositionLocalsKtLocalLocale3.MediaSessionCompatQueueItem();
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard4 = this.extensions;
            if (zMediaSessionCompatQueueItem) {
                compositionLocalsKtLocalClipboard4.write(compositionLocalsKtLocalLocale3, compositionLocalsKtLocalProvidableScrollCaptureInProgress1.RemoteActionCompatParcelizer(objSerializer));
                return true;
            }
            compositionLocalsKtLocalClipboard4.serializer(compositionLocalsKtLocalLocale3, compositionLocalsKtLocalProvidableScrollCaptureInProgress1.RemoteActionCompatParcelizer(objSerializer));
            return true;
        }

        public final <Type> Type getExtension(getLocalScrollCaptureInProgress getlocalscrollcaptureinprogress) {
            CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000 = GeneratedMessageLite.access$000(getlocalscrollcaptureinprogress);
            verifyExtensionContainingType(compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000);
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = this.extensions;
            Object obj = compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.get(compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000.write);
            if (obj == null) {
                return (Type) compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000.RemoteActionCompatParcelizer;
            }
            return (Type) compositionLocalsKtLocalProvidableScrollCaptureInProgress1Access$000.IconCompatParcelizer(obj);
        }
    }

    public static DecodeHelper emptyBooleanList() {
        return ClipEntry.IconCompatParcelizer();
    }

    public static CompositionLocalsKtProvideCommonCompositionLocals1 emptyDoubleList() {
        return getLocalDensity.serializer();
    }

    public static decodeBaselineShifty9eOQZs emptyFloatList() {
        return CompositionLocalsKtLocalInputModeManager1.write();
    }

    public static decodeFloat emptyIntList() {
        return DebugUtilsKt.serializer;
    }

    public static decodeShadow emptyLongList() {
        return getDpSizeMYxV2XQ.write();
    }

    public static <E> decodeString emptyProtobufList() {
        return component22.IconCompatParcelizer;
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public void clearMemoizedHashCode() {
        this.write = 0;
    }

    public Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj) {
        return dynamicMethod(compositionLocalsKtLocalTextToolbar1, obj, null);
    }

    public abstract Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1, Object obj, Object obj2);

    public int getMemoizedHashCode() {
        return this.write;
    }

    public int getMemoizedSerializedSize() {
        return this.read & Integer.MAX_VALUE;
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public boolean isMutable() {
        return (this.read & Integer.MIN_VALUE) != 0;
    }

    public void setMemoizedHashCode(int i) {
        this.write = i;
    }

    public static void checkMessageInitialized(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (generatedMessageLite != null && !generatedMessageLite.isInitialized()) {
            throw new InvalidProtocolBufferException(generatedMessageLite.newUninitializedMessageException().getMessage());
        }
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t = (T) serializer.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) serializer.get(cls);
            } catch (ClassNotFoundException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) setDirty.IconCompatParcelizer(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            serializer.put(cls, t2);
            return t2;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public static final <T extends GeneratedMessageLite> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(CompositionLocalsKtLocalTextToolbar1.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        component26 component26Var = component26.IconCompatParcelizer;
        component26Var.getClass();
        boolean zIconCompatParcelizer = component26Var.read(t.getClass()).IconCompatParcelizer(t);
        if (z) {
            t.dynamicMethod(CompositionLocalsKtLocalTextToolbar1.SET_MEMOIZED_IS_INITIALIZED, zIconCompatParcelizer ? t : null);
        }
        return zIconCompatParcelizer;
    }

    public static Object newMessageInfo(getElevation getelevation, String str, Object[] objArr) {
        return new canBeSaved(getelevation, str, objArr);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(CompositionLocalsKtLocalTextToolbar1.BUILD_MESSAGE_INFO);
    }

    public int computeHashCode() {
        component26 component26Var = component26.IconCompatParcelizer;
        component26Var.getClass();
        return component26Var.read(getClass()).read(this);
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends CompositionLocalsKtLocalHapticFeedback1> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(CompositionLocalsKtLocalTextToolbar1.NEW_BUILDER);
    }

    @Override // o.dumpRenderNodeData
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(CompositionLocalsKtLocalTextToolbar1.GET_DEFAULT_INSTANCE);
    }

    @Override // o.getElevation
    public final component23 getParserForType() {
        return (component23) dynamicMethod(CompositionLocalsKtLocalTextToolbar1.GET_PARSER);
    }

    public void makeImmutable() {
        component26 component26Var = component26.IconCompatParcelizer;
        component26Var.getClass();
        component26Var.read(getClass()).read((Object) this);
        markImmutable();
    }

    public void mergeLengthDelimitedField(int i, getClipMetadata getclipmetadata) {
        if (this.RemoteActionCompatParcelizer == GraphicsLayerOwnerLayer.serializer) {
            this.RemoteActionCompatParcelizer = new GraphicsLayerOwnerLayer();
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.RemoteActionCompatParcelizer;
        graphicsLayerOwnerLayer.serializer();
        if (i != 0) {
            graphicsLayerOwnerLayer.serializer((i << 3) | 2, getclipmetadata);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) {
        this.RemoteActionCompatParcelizer = GraphicsLayerOwnerLayer.serializer(this.RemoteActionCompatParcelizer, graphicsLayerOwnerLayer);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.RemoteActionCompatParcelizer == GraphicsLayerOwnerLayer.serializer) {
            this.RemoteActionCompatParcelizer = new GraphicsLayerOwnerLayer();
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = this.RemoteActionCompatParcelizer;
        graphicsLayerOwnerLayer.serializer();
        if (i != 0) {
            graphicsLayerOwnerLayer.serializer(i << 3, Long.valueOf(i2));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Zero is not a valid field number.");
        }
    }

    @Override // o.getElevation
    public final CompositionLocalsKtLocalHapticFeedback1 newBuilderForType() {
        return (CompositionLocalsKtLocalHapticFeedback1) dynamicMethod(CompositionLocalsKtLocalTextToolbar1.NEW_BUILDER);
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(CompositionLocalsKtLocalTextToolbar1.NEW_MUTABLE_INSTANCE);
    }

    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.read = (i & Integer.MAX_VALUE) | (this.read & Integer.MIN_VALUE);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(i, "serialized size must be non-negative, was "));
        }
    }

    @Override // o.getElevation
    public final CompositionLocalsKtLocalHapticFeedback1 toBuilder() {
        CompositionLocalsKtLocalHapticFeedback1 compositionLocalsKtLocalHapticFeedback1 = (CompositionLocalsKtLocalHapticFeedback1) dynamicMethod(CompositionLocalsKtLocalTextToolbar1.NEW_BUILDER);
        compositionLocalsKtLocalHapticFeedback1.read(this);
        return compositionLocalsKtLocalHapticFeedback1;
    }

    @Override // o.getElevation
    public void writeTo(ComposeView composeView) throws IOException {
        component26 component26Var = component26.IconCompatParcelizer;
        component26Var.getClass();
        DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = component26Var.read(getClass());
        DefaultHapticFeedback defaultHapticFeedback = composeView.IconCompatParcelizer;
        if (defaultHapticFeedback == null) {
            defaultHapticFeedback = new DefaultHapticFeedback(composeView);
        }
        disposableSaveableStateRegistrylambda0.IconCompatParcelizer(this, defaultHapticFeedback);
    }

    public static CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 access$000(getLocalScrollCaptureInProgress getlocalscrollcaptureinprogress) {
        getlocalscrollcaptureinprogress.getClass();
        return (CompositionLocalsKtLocalProvidableScrollCaptureInProgress1) getlocalscrollcaptureinprogress;
    }

    public static <T extends GeneratedMessageLite> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        serializer.put(cls, t);
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public GeneratedMessageLite() {
        this.write = 0;
        this.read = -1;
        this.RemoteActionCompatParcelizer = GraphicsLayerOwnerLayer.serializer;
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, getLocalProvidableScrollCaptureInProgress.serializer());
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            component26 component26Var = component26.IconCompatParcelizer;
            component26Var.getClass();
            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = component26Var.read(t2.getClass());
            CodedInputStreamReader codedInputStreamReader = codedInputStream.read;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new CodedInputStreamReader(codedInputStream);
            }
            disposableSaveableStateRegistrylambda0.serializer(t2, codedInputStreamReader, getlocalprovidablescrollcaptureinprogress);
            disposableSaveableStateRegistrylambda0.read((Object) t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            if (e.IconCompatParcelizer) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = getUniqueId.write;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        getUniqueId.serializer(this, sb, 0);
        return sb.toString();
    }

    public Object dynamicMethod(CompositionLocalsKtLocalTextToolbar1 compositionLocalsKtLocalTextToolbar1) {
        return dynamicMethod(compositionLocalsKtLocalTextToolbar1, null, null);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public void markImmutable() {
        this.read &= Integer.MAX_VALUE;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Generated message class \"", cls.getName(), "\" missing method \"", str, "\".", e);
            return null;
        }
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamSerializer;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset();
            codedInputStreamSerializer = CodedInputStream.serializer(bArrArray, byteBuffer.position() + iArrayOffset, byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && ComposeViewCompanion.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4()) {
            codedInputStreamSerializer = new ComposeViewCompanion(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            codedInputStreamSerializer = CodedInputStream.serializer(bArr, 0, iRemaining, true);
        }
        T t2 = (T) parseFrom(t, codedInputStreamSerializer, getlocalprovidablescrollcaptureinprogress);
        checkMessageInitialized(t2);
        return t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        component26 component26Var = component26.IconCompatParcelizer;
        component26Var.getClass();
        return component26Var.read(getClass()).IconCompatParcelizer(this, (GeneratedMessageLite) obj);
    }

    public boolean parseUnknownField(int i, CodedInputStream codedInputStream) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == GraphicsLayerOwnerLayer.serializer) {
            this.RemoteActionCompatParcelizer = new GraphicsLayerOwnerLayer();
        }
        return this.RemoteActionCompatParcelizer.read(i, codedInputStream);
    }

    @Override // com.google.protobuf.AbstractMessageLite
    public int getSerializedSize(DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0) {
        int iWrite;
        int iWrite2;
        if (isMutable()) {
            if (disposableSaveableStateRegistrylambda0 == null) {
                component26 component26Var = component26.IconCompatParcelizer;
                component26Var.getClass();
                iWrite2 = component26Var.read(getClass()).write(this);
            } else {
                iWrite2 = disposableSaveableStateRegistrylambda0.write(this);
            }
            if (iWrite2 >= 0) {
                return iWrite2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(iWrite2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (disposableSaveableStateRegistrylambda0 == null) {
            component26 component26Var2 = component26.IconCompatParcelizer;
            component26Var2.getClass();
            iWrite = component26Var2.read(getClass()).write(this);
        } else {
            iWrite = disposableSaveableStateRegistrylambda0.write(this);
        }
        setMemoizedSerializedSize(iWrite);
        return iWrite;
    }

    public static <ContainingType extends getElevation, Type> CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 newSingularGeneratedExtension(ContainingType containingtype, Type type, getElevation getelevation, dataAvailable dataavailable, int i, onScroll onscroll, Class cls) {
        return new CompositionLocalsKtLocalProvidableScrollCaptureInProgress1(containingtype, type, getelevation, new CompositionLocalsKtLocalLocale1(dataavailable, i, onscroll, false, false));
    }

    public static GeneratedMessageLite parsePartialDelimitedFrom(GeneratedMessageLite generatedMessageLite, InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            CodedInputStream codedInputStreamIconCompatParcelizer = CodedInputStream.IconCompatParcelizer(new getTimestampSeconds(inputStream, CodedInputStream.IconCompatParcelizer(i, inputStream), 2));
            GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, codedInputStreamIconCompatParcelizer, getlocalprovidablescrollcaptureinprogress);
            codedInputStreamIconCompatParcelizer.RemoteActionCompatParcelizer(0);
            return partialFrom;
        } catch (InvalidProtocolBufferException e) {
            if (e.IconCompatParcelizer) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage(), e2);
        }
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends CompositionLocalsKtLocalHapticFeedback1> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.read(messagetype);
        return buildertype;
    }

    public static decodeFloat mutableCopy(decodeFloat decodefloat) {
        int size = decodefloat.size();
        int i = size == 0 ? 10 : size * 2;
        DebugUtilsKt debugUtilsKt = (DebugUtilsKt) decodefloat;
        if (i >= debugUtilsKt.read) {
            return new DebugUtilsKt(Arrays.copyOf(debugUtilsKt.write, i), debugUtilsKt.read, true);
        }
        DrawableTransformation.write();
        return null;
    }

    public static <ContainingType extends getElevation, Type> CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 newRepeatedGeneratedExtension(ContainingType containingtype, getElevation getelevation, dataAvailable dataavailable, int i, onScroll onscroll, boolean z, Class cls) {
        return new CompositionLocalsKtLocalProvidableScrollCaptureInProgress1(containingtype, Collections.EMPTY_LIST, getelevation, new CompositionLocalsKtLocalLocale1(dataavailable, i, onscroll, true, z));
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, getlocalprovidablescrollcaptureinprogress);
        checkMessageInitialized(t2);
        return t2;
    }

    public static decodeShadow mutableCopy(decodeShadow decodeshadow) {
        int size = decodeshadow.size();
        return ((getDpSizeMYxV2XQ) decodeshadow).read(size == 0 ? 10 : size * 2);
    }

    public static decodeBaselineShifty9eOQZs mutableCopy(decodeBaselineShifty9eOQZs decodebaselineshifty9eoqzs) {
        int size = decodebaselineshifty9eoqzs.size();
        return ((CompositionLocalsKtLocalInputModeManager1) decodebaselineshifty9eoqzs).read(size == 0 ? 10 : size * 2);
    }

    public static CompositionLocalsKtProvideCommonCompositionLocals1 mutableCopy(CompositionLocalsKtProvideCommonCompositionLocals1 compositionLocalsKtProvideCommonCompositionLocals1) {
        int size = compositionLocalsKtProvideCommonCompositionLocals1.size();
        return ((getLocalDensity) compositionLocalsKtProvideCommonCompositionLocals1).read(size == 0 ? 10 : size * 2);
    }

    public static DecodeHelper mutableCopy(DecodeHelper decodeHelper) {
        int size = decodeHelper.size();
        return ((ClipEntry) decodeHelper).read(size == 0 ? 10 : size * 2);
    }

    public static <E> decodeString mutableCopy(decodeString decodestring) {
        int size = decodestring.size();
        return decodestring.read(size == 0 ? 10 : size * 2);
    }

    @Override // o.dumpRenderNodeData
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, getLocalProvidableScrollCaptureInProgress.serializer());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, getClipMetadata getclipmetadata) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, getclipmetadata, getLocalProvidableScrollCaptureInProgress.serializer());
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, getClipMetadata getclipmetadata, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamMediaSessionCompatQueueItem = getclipmetadata.MediaSessionCompatQueueItem();
        T t2 = (T) parsePartialFrom(t, codedInputStreamMediaSessionCompatQueueItem, getlocalprovidablescrollcaptureinprogress);
        codedInputStreamMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(0);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, getLocalProvidableScrollCaptureInProgress.serializer());
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, getlocalprovidablescrollcaptureinprogress);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, CodedInputStream.IconCompatParcelizer(inputStream), getLocalProvidableScrollCaptureInProgress.serializer());
        checkMessageInitialized(t2);
        return t2;
    }

    @Override // o.getElevation
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, CodedInputStream.IconCompatParcelizer(inputStream), getlocalprovidablescrollcaptureinprogress);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, getLocalProvidableScrollCaptureInProgress.serializer());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, codedInputStream, getlocalprovidablescrollcaptureinprogress);
        checkMessageInitialized(t2);
        return t2;
    }

    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, int i2, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            component26 component26Var = component26.IconCompatParcelizer;
            component26Var.getClass();
            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = component26Var.read(generatedMessageLiteNewMutableInstance.getClass());
            disposableSaveableStateRegistrylambda0.read(generatedMessageLiteNewMutableInstance, bArr, i, i + i2, new r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY(getlocalprovidablescrollcaptureinprogress));
            disposableSaveableStateRegistrylambda0.read((Object) generatedMessageLiteNewMutableInstance);
            return generatedMessageLiteNewMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            if (e.IconCompatParcelizer) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.MediaDescriptionCompat();
        }
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, codedInputStream, getLocalProvidableScrollCaptureInProgress.serializer());
    }
}
