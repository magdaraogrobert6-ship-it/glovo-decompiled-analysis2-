package o;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public interface r8lambdaMIqXXOzLMUUicX7GG348aw6pQE extends getConfigurationValue, WritableByteChannel {
    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE IconCompatParcelizer(String str, Charset charset);

    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE MediaMetadataCompat(int i);

    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE MediaSessionCompatQueueItem(int i);

    OutputStream PlaybackStateCompat();

    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RatingCompat(int i);

    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE RemoteActionCompatParcelizer(int i, byte[] bArr);

    @Override // o.getConfigurationValue, java.io.Flushable
    void flush();

    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE serializer(String str);

    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE write(long j);

    r8lambdaMIqXXOzLMUUicX7GG348aw6pQE write(byte[] bArr);
}
