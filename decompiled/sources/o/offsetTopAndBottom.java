package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.ArrayDecoders;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class offsetTopAndBottom implements DisposableSaveableStateRegistrylambda0 {
    public final boolean IconCompatParcelizer;
    public final com.google.protobuf.UnknownFieldSchema RemoteActionCompatParcelizer;
    public final getElevation serializer;
    public final getLocalSoftwareKeyboardController write;

    public static offsetTopAndBottom serializer(com.google.protobuf.UnknownFieldSchema unknownFieldSchema, getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller, getElevation getelevation) {
        return new offsetTopAndBottom(unknownFieldSchema, getlocalsoftwarekeyboardcontroller, getelevation);
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void IconCompatParcelizer(Object obj, DefaultHapticFeedback defaultHapticFeedback) {
        this.write.getClass();
        Iterator itWrite = ((GeneratedMessageLite.ExtendableMessage) obj).extensions.write();
        while (itWrite.hasNext()) {
            Map.Entry entry = (Map.Entry) itWrite.next();
            CompositionLocalsKtLocalLocale1 compositionLocalsKtLocalLocale1 = (CompositionLocalsKtLocalLocale1) entry.getKey();
            if (compositionLocalsKtLocalLocale1.write.getJavaType() != onDown.MESSAGE || compositionLocalsKtLocalLocale1.RemoteActionCompatParcelizer || compositionLocalsKtLocalLocale1.read) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Found invalid MessageSet item.");
                return;
            }
            defaultHapticFeedback.IconCompatParcelizer(compositionLocalsKtLocalLocale1.IconCompatParcelizer, entry.getValue());
        }
        ((GlobalSnapshotManagerensureStarted2) this.RemoteActionCompatParcelizer).getClass();
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = ((GeneratedMessageLite) obj).RemoteActionCompatParcelizer;
        graphicsLayerOwnerLayer.getClass();
        defaultHapticFeedback.getClass();
        if (onLongPress.ASCENDING != onLongPress.DESCENDING) {
            for (int i = 0; i < graphicsLayerOwnerLayer.RemoteActionCompatParcelizer; i++) {
                defaultHapticFeedback.IconCompatParcelizer(graphicsLayerOwnerLayer.RatingCompat[i] >>> 3, graphicsLayerOwnerLayer.IconCompatParcelizer[i]);
            }
            return;
        }
        int i2 = graphicsLayerOwnerLayer.RemoteActionCompatParcelizer;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            defaultHapticFeedback.IconCompatParcelizer(graphicsLayerOwnerLayer.RatingCompat[i2] >>> 3, graphicsLayerOwnerLayer.IconCompatParcelizer[i2]);
        }
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final boolean IconCompatParcelizer(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        GlobalSnapshotManagerensureStarted2 globalSnapshotManagerensureStarted2 = (GlobalSnapshotManagerensureStarted2) this.RemoteActionCompatParcelizer;
        globalSnapshotManagerensureStarted2.getClass();
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = generatedMessageLite.RemoteActionCompatParcelizer;
        globalSnapshotManagerensureStarted2.getClass();
        if (!graphicsLayerOwnerLayer.equals(generatedMessageLite2.RemoteActionCompatParcelizer)) {
            return false;
        }
        if (!this.IconCompatParcelizer) {
            return true;
        }
        this.write.getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.equals(((GeneratedMessageLite.ExtendableMessage) generatedMessageLite2).extensions);
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final boolean IconCompatParcelizer(Object obj) {
        this.write.getClass();
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions.read();
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final int read(GeneratedMessageLite generatedMessageLite) {
        ((GlobalSnapshotManagerensureStarted2) this.RemoteActionCompatParcelizer).getClass();
        int iHashCode = generatedMessageLite.RemoteActionCompatParcelizer.hashCode();
        if (!this.IconCompatParcelizer) {
            return iHashCode;
        }
        this.write.getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.RemoteActionCompatParcelizer.hashCode() + (iHashCode * 53);
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final Object read() {
        getElevation getelevation = this.serializer;
        return getelevation instanceof GeneratedMessageLite ? ((GeneratedMessageLite) getelevation).newMutableInstance() : getelevation.newBuilderForType().read();
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void read(Object obj) {
        ((GlobalSnapshotManagerensureStarted2) this.RemoteActionCompatParcelizer).getClass();
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = ((GeneratedMessageLite) obj).RemoteActionCompatParcelizer;
        if (graphicsLayerOwnerLayer.write) {
            graphicsLayerOwnerLayer.write = false;
        }
        this.write.getClass();
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.MediaSessionCompatQueueItem();
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final int write(GeneratedMessageLite generatedMessageLite) {
        ((GlobalSnapshotManagerensureStarted2) this.RemoteActionCompatParcelizer).getClass();
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = generatedMessageLite.RemoteActionCompatParcelizer;
        int i = graphicsLayerOwnerLayer.read;
        if (i == -1) {
            int iRemoteActionCompatParcelizer = 0;
            for (int i2 = 0; i2 < graphicsLayerOwnerLayer.RemoteActionCompatParcelizer; i2++) {
                int i3 = graphicsLayerOwnerLayer.RatingCompat[i2];
                getClipMetadata getclipmetadata = (getClipMetadata) graphicsLayerOwnerLayer.IconCompatParcelizer[i2];
                int iSerializer = ComposeView.serializer(1);
                int iSerializer2 = ComposeView.serializer(2);
                int iRemoteActionCompatParcelizer2 = ComposeView.RemoteActionCompatParcelizer(i3 >>> 3);
                int iSerializer3 = ComposeView.serializer(3);
                int iRatingCompat = getclipmetadata.RatingCompat();
                iRemoteActionCompatParcelizer += ComposeView.RemoteActionCompatParcelizer(iRatingCompat) + iRatingCompat + iSerializer3 + iRemoteActionCompatParcelizer2 + iSerializer2 + (iSerializer * 2);
            }
            graphicsLayerOwnerLayer.read = iRemoteActionCompatParcelizer;
            i = iRemoteActionCompatParcelizer;
        }
        if (!this.IconCompatParcelizer) {
            return i;
        }
        this.write.getClass();
        return ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.IconCompatParcelizer() + i;
    }

    public offsetTopAndBottom(com.google.protobuf.UnknownFieldSchema unknownFieldSchema, getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller, getElevation getelevation) {
        this.RemoteActionCompatParcelizer = unknownFieldSchema;
        getlocalsoftwarekeyboardcontroller.getClass();
        this.IconCompatParcelizer = getelevation instanceof GeneratedMessageLite.ExtendableMessage;
        this.write = getlocalsoftwarekeyboardcontroller;
        this.serializer = getelevation;
    }

    public final boolean RemoteActionCompatParcelizer(com.google.protobuf.CodedInputStreamReader codedInputStreamReader, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress, getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller, CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1, com.google.protobuf.UnknownFieldSchema unknownFieldSchema, GraphicsLayerOwnerLayer graphicsLayerOwnerLayer) throws com.google.protobuf.InvalidProtocolBufferException {
        int i = codedInputStreamReader.IconCompatParcelizer;
        getElevation getelevation = this.serializer;
        if (i != 11) {
            if ((i & 7) != 2) {
                return codedInputStreamReader.IconCompatParcelizer();
            }
            getlocalsoftwarekeyboardcontroller.getClass();
            CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = getlocalprovidablescrollcaptureinprogress.RemoteActionCompatParcelizer(i >>> 3, getelevation);
            if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer == null) {
                return unknownFieldSchema.write(graphicsLayerOwnerLayer, codedInputStreamReader, 0);
            }
            compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer.write, codedInputStreamReader.RemoteActionCompatParcelizer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer.serializer().getClass(), getlocalprovidablescrollcaptureinprogress));
            return true;
        }
        CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2 = null;
        getClipMetadata getclipmetadataWrite = null;
        int iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = 0;
        while (codedInputStreamReader.serializer() != Integer.MAX_VALUE) {
            int i2 = codedInputStreamReader.IconCompatParcelizer;
            if (i2 == 16) {
                codedInputStreamReader.IconCompatParcelizer(0);
                iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = codedInputStreamReader.serializer.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
                getlocalsoftwarekeyboardcontroller.getClass();
                compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2 = getlocalprovidablescrollcaptureinprogress.RemoteActionCompatParcelizer(iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, getelevation);
            } else if (i2 == 26) {
                if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2 != null) {
                    getlocalsoftwarekeyboardcontroller.getClass();
                    compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2.write, codedInputStreamReader.RemoteActionCompatParcelizer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2.serializer().getClass(), getlocalprovidablescrollcaptureinprogress));
                } else {
                    getclipmetadataWrite = codedInputStreamReader.write();
                }
            } else if (!codedInputStreamReader.IconCompatParcelizer()) {
                break;
            }
        }
        if (codedInputStreamReader.IconCompatParcelizer != 12) {
            throw com.google.protobuf.InvalidProtocolBufferException.write();
        }
        if (getclipmetadataWrite != null) {
            if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2 != null) {
                getlocalsoftwarekeyboardcontroller.getClass();
                getClipToOutline getcliptooutlineNewBuilderForType = compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2.serializer.newBuilderForType();
                CodedInputStream codedInputStreamMediaSessionCompatQueueItem = getclipmetadataWrite.MediaSessionCompatQueueItem();
                ((CompositionLocalsKtLocalHapticFeedback1) getcliptooutlineNewBuilderForType).IconCompatParcelizer(codedInputStreamMediaSessionCompatQueueItem, getlocalprovidablescrollcaptureinprogress);
                compositionLocalsKtLocalClipboard1.serializer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2.write, getcliptooutlineNewBuilderForType.read());
                codedInputStreamMediaSessionCompatQueueItem.RemoteActionCompatParcelizer(0);
                return true;
            }
            ((GlobalSnapshotManagerensureStarted2) unknownFieldSchema).getClass();
            graphicsLayerOwnerLayer.serializer((iR8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 << 3) | 2, getclipmetadataWrite);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[EDGE_INSN: B:49:0x00cf->B:37:0x00cf BREAK  A[LOOP:1: B:18:0x0077->B:36:0x00cb], SYNTHETIC] */
    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void read(Object obj, byte[] bArr, int i, int i2, r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy) throws com.google.protobuf.InvalidProtocolBufferException {
        int iRemoteActionCompatParcelizer;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer = generatedMessageLite.RemoteActionCompatParcelizer;
        if (graphicsLayerOwnerLayer == GraphicsLayerOwnerLayer.serializer) {
            graphicsLayerOwnerLayer = new GraphicsLayerOwnerLayer();
            generatedMessageLite.RemoteActionCompatParcelizer = graphicsLayerOwnerLayer;
        }
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayer2 = graphicsLayerOwnerLayer;
        CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        int iWrite = i;
        CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = null;
        while (iWrite < i2) {
            int iRemoteActionCompatParcelizer2 = ArrayDecoders.RemoteActionCompatParcelizer(bArr, iWrite, r8lambdacyuxafptvn7drfel1dgtevxcy);
            int i3 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
            getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress = (getLocalProvidableScrollCaptureInProgress) r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer;
            getElevation getelevation = this.serializer;
            getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller = this.write;
            int i4 = 2;
            if (i3 == 11) {
                int i5 = 0;
                getClipMetadata getclipmetadata = null;
                while (iRemoteActionCompatParcelizer2 < i2) {
                    iRemoteActionCompatParcelizer2 = ArrayDecoders.RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    int i6 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                    int i7 = i6 >>> 3;
                    int i8 = i6 & 7;
                    if (i7 != i4) {
                        if (i7 == 3) {
                            if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer != null) {
                                iRemoteActionCompatParcelizer = ArrayDecoders.write(component26.IconCompatParcelizer.read(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer.serializer.getClass()), bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                                compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable.serializer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer.write, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                            } else if (i8 == 2) {
                                iRemoteActionCompatParcelizer = ArrayDecoders.serializer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                                getclipmetadata = (getClipMetadata) r8lambdacyuxafptvn7drfel1dgtevxcy.read;
                            } else if (i6 == 12) {
                                break;
                            } else {
                                iRemoteActionCompatParcelizer = ArrayDecoders.write(i6, bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                            }
                        } else {
                            if (i6 == 12) {
                                break;
                                break;
                            }
                            iRemoteActionCompatParcelizer = ArrayDecoders.write(i6, bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        }
                    } else if (i8 == 0) {
                        iRemoteActionCompatParcelizer = ArrayDecoders.RemoteActionCompatParcelizer(bArr, iRemoteActionCompatParcelizer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                        i5 = r8lambdacyuxafptvn7drfel1dgtevxcy.RemoteActionCompatParcelizer;
                        getlocalsoftwarekeyboardcontroller.getClass();
                        compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = getlocalprovidablescrollcaptureinprogress.RemoteActionCompatParcelizer(i5, getelevation);
                    } else {
                        if (i6 == 12) {
                            break;
                            break;
                        }
                        iRemoteActionCompatParcelizer = ArrayDecoders.write(i6, bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    }
                    iRemoteActionCompatParcelizer2 = iRemoteActionCompatParcelizer;
                    i4 = 2;
                }
                if (getclipmetadata != null) {
                    graphicsLayerOwnerLayer2.serializer((i5 << 3) | 2, getclipmetadata);
                }
                iWrite = iRemoteActionCompatParcelizer2;
            } else if ((i3 & 7) == 2) {
                getlocalsoftwarekeyboardcontroller.getClass();
                CompositionLocalsKtLocalProvidableScrollCaptureInProgress1 compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2 = getlocalprovidablescrollcaptureinprogress.RemoteActionCompatParcelizer(i3 >>> 3, getelevation);
                if (compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2 != null) {
                    iWrite = ArrayDecoders.write(component26.IconCompatParcelizer.read(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2.serializer.getClass()), bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                    compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable.serializer(compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2.write, r8lambdacyuxafptvn7drfel1dgtevxcy.read);
                } else {
                    iWrite = ArrayDecoders.RemoteActionCompatParcelizer(i3, bArr, iRemoteActionCompatParcelizer2, i2, graphicsLayerOwnerLayer2, r8lambdacyuxafptvn7drfel1dgtevxcy);
                }
                compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer = compositionLocalsKtLocalProvidableScrollCaptureInProgress1RemoteActionCompatParcelizer2;
            } else {
                iWrite = ArrayDecoders.write(i3, bArr, iRemoteActionCompatParcelizer2, i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            }
        }
        if (iWrite != i2) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void read(Object obj, Object obj2) {
        registerProvider.write(this.RemoteActionCompatParcelizer, obj, obj2);
        if (this.IconCompatParcelizer) {
            this.write.getClass();
            CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1 = ((GeneratedMessageLite.ExtendableMessage) obj2).extensions;
            if (compositionLocalsKtLocalClipboard1.RemoteActionCompatParcelizer.isEmpty()) {
                return;
            }
            ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable().IconCompatParcelizer(compositionLocalsKtLocalClipboard1);
        }
    }

    @Override // o.DisposableSaveableStateRegistrylambda0
    public final void serializer(Object obj, com.google.protobuf.CodedInputStreamReader codedInputStreamReader, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) {
        com.google.protobuf.UnknownFieldSchema unknownFieldSchema = this.RemoteActionCompatParcelizer;
        GraphicsLayerOwnerLayer graphicsLayerOwnerLayerIconCompatParcelizer = unknownFieldSchema.IconCompatParcelizer(obj);
        getLocalSoftwareKeyboardController getlocalsoftwarekeyboardcontroller = this.write;
        getlocalsoftwarekeyboardcontroller.getClass();
        CompositionLocalsKtLocalClipboard1 compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable = ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
        while (codedInputStreamReader.serializer() != Integer.MAX_VALUE && RemoteActionCompatParcelizer(codedInputStreamReader, getlocalprovidablescrollcaptureinprogress, getlocalsoftwarekeyboardcontroller, compositionLocalsKtLocalClipboard1EnsureExtensionsAreMutable, unknownFieldSchema, graphicsLayerOwnerLayerIconCompatParcelizer)) {
            try {
            } finally {
                ((GeneratedMessageLite) obj).RemoteActionCompatParcelizer = graphicsLayerOwnerLayerIconCompatParcelizer;
            }
        }
    }
}
