package com.google.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.Vw$Vw;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import o.ClipboardExtensions_androidKt;
import o.ComposeView;
import o.CompositionLocalsKtLocalHapticFeedback1;
import o.DisposableSaveableStateRegistrylambda0;
import o.ProvideCompositionLocalsui;
import o.getClipMetadata;
import o.getElevation;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.stopObserving;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractMessageLite implements getElevation {
    protected int write;

    public abstract int getSerializedSize(DisposableSaveableStateRegistrylambda0 disposableSaveableStateRegistrylambda0);

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        CompositionLocalsKtLocalHapticFeedback1.read(iterable, (List) collection);
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public final String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // o.getElevation
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = ComposeView.RemoteActionCompatParcelizer;
            ProvideCompositionLocalsui provideCompositionLocalsui = new ProvideCompositionLocalsui(bArr, 0, serializedSize);
            writeTo(provideCompositionLocalsui);
            if (provideCompositionLocalsui.RemoteActionCompatParcelizer() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(getSerializingExceptionMessage("byte array"), e);
            return null;
        }
    }

    public getClipMetadata toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
            Vw$Vw vw$Vw = new Vw$Vw(serializedSize, 9);
            writeTo(vw$Vw.read());
            return vw$Vw.serializer();
        } catch (IOException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(getSerializingExceptionMessage("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iRemoteActionCompatParcelizer = ComposeView.RemoteActionCompatParcelizer(serializedSize) + serializedSize;
        if (iRemoteActionCompatParcelizer > 4096) {
            iRemoteActionCompatParcelizer = 4096;
        }
        stopObserving stopobserving = new stopObserving(outputStream, iRemoteActionCompatParcelizer);
        stopobserving.MediaBrowserCompatMediaItem(serializedSize);
        writeTo(stopobserving);
        if (stopobserving.MediaMetadataCompat > 0) {
            stopobserving.serializer();
        }
    }

    @Override // o.getElevation
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = ComposeView.RemoteActionCompatParcelizer;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        stopObserving stopobserving = new stopObserving(outputStream, serializedSize);
        writeTo(stopobserving);
        if (stopobserving.MediaMetadataCompat > 0) {
            stopobserving.serializer();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        CompositionLocalsKtLocalHapticFeedback1.read(iterable, list);
    }

    public static void checkByteStringIsUtf8(getClipMetadata getclipmetadata) throws IllegalArgumentException {
        if (getclipmetadata.read()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Byte string is not UTF-8.");
    }
}
