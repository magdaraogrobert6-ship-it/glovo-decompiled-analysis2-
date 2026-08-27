package o;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes4.dex */
public interface RegistryNoImageHeaderParserException extends DateTimeConverter, WritableByteChannel {
    long IconCompatParcelizer(ItemSingleChoiceBinding itemSingleChoiceBinding);

    RegistryNoImageHeaderParserException IconCompatParcelizer(int i);

    RegistryNoImageHeaderParserException IconCompatParcelizer(RequestBuilder requestBuilder);

    RegistryNoImageHeaderParserException MediaDescriptionCompat(long j);

    RegistryMissingComponentException MediaSessionCompatQueueItem();

    RegistryNoImageHeaderParserException MediaSessionCompatQueueItem(int i);

    RegistryNoImageHeaderParserException MediaSessionCompatQueueItem(long j);

    RegistryNoImageHeaderParserException RemoteActionCompatParcelizer(byte[] bArr);

    RegistryNoImageHeaderParserException RemoteActionCompatParcelizer(byte[] bArr, int i, int i2);

    @Override // o.DateTimeConverter, java.io.Flushable
    void flush();

    RegistryNoImageHeaderParserException read();

    RegistryNoImageHeaderParserException read(String str);

    RegistryNoImageHeaderParserException serializer(int i);

    RegistryNoImageHeaderParserException write(int i, int i2, String str);
}
