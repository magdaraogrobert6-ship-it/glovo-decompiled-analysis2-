package o;

import com.google.crypto.tink.shaded.protobuf.CodedInputStream$ArrayDecoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setOuterToInnerOffsetDirtyui {
    public com.google.crypto.tink.shaded.protobuf.CodedInputStreamReader RemoteActionCompatParcelizer;
    public int read;

    public static long IconCompatParcelizer(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int read(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public abstract String ComponentActivity();

    public abstract double IconCompatParcelizer();

    public abstract void IconCompatParcelizer(int i);

    public abstract int MediaBrowserCompatMediaItem();

    public abstract int MediaDescriptionCompat();

    public abstract float MediaMetadataCompat();

    public abstract long MediaSessionCompatQueueItem();

    public abstract long MediaSessionCompatResultReceiverWrapper();

    public abstract int MediaSessionCompatToken();

    public abstract long ParcelableVolumeInfo();

    public abstract long PlaybackStateCompat();

    public abstract int PlaybackStateCompatCustomAction();

    public abstract int RatingCompat();

    public abstract boolean RemoteActionCompatParcelizer();

    public abstract long ResultReceiver();

    public abstract int r8lambda54BeH8ZsBru0CXI2CCSP2syNys();

    public abstract String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();

    public abstract int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();

    public abstract boolean read();

    public abstract setOnDetachui serializer();

    public abstract void serializer(int i);

    public abstract int write();

    public abstract int write(int i);

    public static CodedInputStream$ArrayDecoder IconCompatParcelizer(byte[] bArr, int i, int i2, boolean z) {
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoder = new CodedInputStream$ArrayDecoder(bArr, i, i2, z);
        try {
            codedInputStream$ArrayDecoder.write(i2);
            return codedInputStream$ArrayDecoder;
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
