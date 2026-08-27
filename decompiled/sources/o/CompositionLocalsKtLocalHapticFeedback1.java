package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CompositionLocalsKtLocalHapticFeedback1 implements getClipToOutline {
    public GeneratedMessageLite RemoteActionCompatParcelizer;
    public final GeneratedMessageLite write;

    public static void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        component26 component26Var = component26.IconCompatParcelizer;
        component26Var.getClass();
        component26Var.read(obj.getClass()).read(obj, obj2);
    }

    public static void read(Iterable iterable, List list) {
        Charset charset = CompositionLocalsKtLocalWindowInfo1.serializer;
        iterable.getClass();
        if (iterable instanceof decodeFontSynthesisGVVA2EU) {
            List listRemoteActionCompatParcelizer = ((decodeFontSynthesisGVVA2EU) iterable).RemoteActionCompatParcelizer();
            decodeFontSynthesisGVVA2EU decodefontsynthesisgvva2eu = (decodeFontSynthesisGVVA2EU) list;
            int size = list.size();
            for (Object obj : listRemoteActionCompatParcelizer) {
                if (obj == null) {
                    String str = "Element at index " + (decodefontsynthesisgvva2eu.size() - size) + " is null.";
                    int size2 = decodefontsynthesisgvva2eu.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str);
                            return;
                        }
                        decodefontsynthesisgvva2eu.remove(size2);
                    }
                } else if (obj instanceof getClipMetadata) {
                    decodefontsynthesisgvva2eu.read((getClipMetadata) obj);
                } else {
                    decodefontsynthesisgvva2eu.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof component24) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer(str2);
                        return;
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj2);
            }
        }
    }

    @Override // o.getClipToOutline
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public GeneratedMessageLite read() {
        boolean zIsMutable = this.RemoteActionCompatParcelizer.isMutable();
        GeneratedMessageLite generatedMessageLite = this.RemoteActionCompatParcelizer;
        if (!zIsMutable) {
            return generatedMessageLite;
        }
        generatedMessageLite.makeImmutable();
        return this.RemoteActionCompatParcelizer;
    }

    public void MediaMetadataCompat() {
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = this.write.newMutableInstance();
        RemoteActionCompatParcelizer(generatedMessageLiteNewMutableInstance, this.RemoteActionCompatParcelizer);
        this.RemoteActionCompatParcelizer = generatedMessageLiteNewMutableInstance;
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer.isMutable()) {
            return;
        }
        MediaMetadataCompat();
    }

    public final Object clone() {
        CompositionLocalsKtLocalHapticFeedback1 compositionLocalsKtLocalHapticFeedback1NewBuilderForType = this.write.newBuilderForType();
        compositionLocalsKtLocalHapticFeedback1NewBuilderForType.RemoteActionCompatParcelizer = read();
        return compositionLocalsKtLocalHapticFeedback1NewBuilderForType;
    }

    public CompositionLocalsKtLocalHapticFeedback1(GeneratedMessageLite generatedMessageLite) {
        this.write = generatedMessageLite;
        if (generatedMessageLite.isMutable()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Default instance must be immutable.");
            throw null;
        }
        this.RemoteActionCompatParcelizer = generatedMessageLite.newMutableInstance();
    }

    public final void IconCompatParcelizer(CodedInputStream codedInputStream, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) {
        RemoteActionCompatParcelizer();
        try {
            component26 component26Var = component26.IconCompatParcelizer;
            GeneratedMessageLite generatedMessageLite = this.RemoteActionCompatParcelizer;
            component26Var.getClass();
            DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0 = component26Var.read(generatedMessageLite.getClass());
            GeneratedMessageLite generatedMessageLite2 = this.RemoteActionCompatParcelizer;
            com.google.protobuf.CodedInputStreamReader codedInputStreamReader = codedInputStream.read;
            if (codedInputStreamReader == null) {
                codedInputStreamReader = new com.google.protobuf.CodedInputStreamReader(codedInputStream);
            }
            disposableSaveableStateRegistrylambda0.serializer(generatedMessageLite2, codedInputStreamReader, getlocalprovidablescrollcaptureinprogress);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof IOException)) {
                throw e;
            }
            throw ((IOException) e.getCause());
        }
    }

    @Override // o.dumpRenderNodeData
    public final boolean isInitialized() {
        return GeneratedMessageLite.isInitialized(this.RemoteActionCompatParcelizer, false);
    }

    public final GeneratedMessageLite serializer() {
        GeneratedMessageLite generatedMessageLite = read();
        if (generatedMessageLite.isInitialized()) {
            return generatedMessageLite;
        }
        throw new com.google.protobuf.UninitializedMessageException();
    }

    public final void read(GeneratedMessageLite generatedMessageLite) {
        if (this.write.equals(generatedMessageLite)) {
            return;
        }
        RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, generatedMessageLite);
    }
}
