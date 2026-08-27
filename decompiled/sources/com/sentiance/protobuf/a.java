package com.sentiance.protobuf;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import o.CardKey;
import o.RuntimeAppConfigurationProvider;
import o.accessgetDiskCacheLockp;
import o.fromStringlambda1;
import o.r8lambdaoBunNbByHO6kbZSa9SfTnMEkzIo;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setRuntimeAppConfigurationProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements accessgetDiskCacheLockp {
    protected int write;

    public abstract int getSerializedSize(fromStringlambda1 fromstringlambda1);

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        CardKey.IconCompatParcelizer(iterable, (List) collection);
    }

    public UninitializedMessageException newUninitializedMessageException() {
        return new UninitializedMessageException();
    }

    public final String a$1(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(bArr, serializedSize);
            writeTo(runtimeAppConfigurationProvider);
            if (runtimeAppConfigurationProvider.read() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(a$1("byte array"), e);
            return null;
        }
    }

    public ByteString toByteString() {
        try {
            int serializedSize = getSerializedSize();
            ByteString byteString = ByteString.RemoteActionCompatParcelizer;
            byte[] bArr = new byte[serializedSize];
            Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(bArr, serializedSize);
            writeTo(runtimeAppConfigurationProvider);
            if (runtimeAppConfigurationProvider.read() == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer(a$1("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int i = setRuntimeAppConfigurationProvider.read(serializedSize) + serializedSize;
        if (i > 4096) {
            i = 4096;
        }
        r8lambdaoBunNbByHO6kbZSa9SfTnMEkzIo r8lambdaobunnbbyho6kbzsa9sftnmekzio = new r8lambdaoBunNbByHO6kbZSa9SfTnMEkzIo(outputStream, i);
        r8lambdaobunnbbyho6kbzsa9sftnmekzio.RatingCompat(serializedSize);
        writeTo(r8lambdaobunnbbyho6kbzsa9sftnmekzio);
        if (r8lambdaobunnbbyho6kbzsa9sftnmekzio.MediaMetadataCompat > 0) {
            r8lambdaobunnbbyho6kbzsa9sftnmekzio.IconCompatParcelizer();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = setRuntimeAppConfigurationProvider.RemoteActionCompatParcelizer;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        r8lambdaoBunNbByHO6kbZSa9SfTnMEkzIo r8lambdaobunnbbyho6kbzsa9sftnmekzio = new r8lambdaoBunNbByHO6kbZSa9SfTnMEkzIo(outputStream, serializedSize);
        writeTo(r8lambdaobunnbbyho6kbzsa9sftnmekzio);
        if (r8lambdaobunnbbyho6kbzsa9sftnmekzio.MediaMetadataCompat > 0) {
            r8lambdaobunnbbyho6kbzsa9sftnmekzio.IconCompatParcelizer();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        CardKey.IconCompatParcelizer(iterable, list);
    }

    public static void checkByteStringIsUtf8(ByteString byteString) throws IllegalArgumentException {
        if (byteString.IconCompatParcelizer()) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Byte string is not UTF-8.");
    }
}
