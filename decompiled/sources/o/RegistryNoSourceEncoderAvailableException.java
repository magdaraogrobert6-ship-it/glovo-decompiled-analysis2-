package o;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public interface RegistryNoSourceEncoderAvailableException extends ItemSingleChoiceBinding, ReadableByteChannel {
    short ComponentActivity();

    String IconCompatParcelizer(Charset charset);

    void IconCompatParcelizer(RegistryMissingComponentException registryMissingComponentException, long j);

    void IconCompatParcelizer(byte[] bArr);

    byte MediaBrowserCompatMediaItem();

    GifDrawableTransformation MediaDescriptionCompat();

    InputStream MediaMetadataCompat();

    void MediaMetadataCompat(long j);

    RegistryMissingComponentException MediaSessionCompatQueueItem();

    int MediaSessionCompatResultReceiverWrapper();

    long ParcelableVolumeInfo();

    byte[] PlaybackStateCompat();

    long PlaybackStateCompatCustomAction();

    void RatingCompat(long j);

    boolean RatingCompat();

    long RemoteActionCompatParcelizer(RegistryNoImageHeaderParserException registryNoImageHeaderParserException);

    long RemoteActionCompatParcelizer(RequestBuilder requestBuilder);

    RequestBuilder RemoteActionCompatParcelizer(long j);

    boolean RemoteActionCompatParcelizer(long j, RequestBuilder requestBuilder);

    String ResultReceiver();

    int serializer(Options options);

    String serializer(long j);

    long write(RequestBuilder requestBuilder);

    boolean write(long j);
}
