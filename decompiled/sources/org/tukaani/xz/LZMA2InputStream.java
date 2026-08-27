package org.tukaani.xz;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import o.FwFClientExtensionKt;
import o.getFeaturesExpirationTimefwf_client_release;
import o.getUseRuntimeKeysfwf_client_release;
import o.setUseEvaluationsCachefwf_client_release;

/* JADX INFO: loaded from: classes4.dex */
public final class LZMA2InputStream extends InputStream {
    public final getFeaturesExpirationTimefwf_client_release IconCompatParcelizer;
    public FwFClientExtensionKt MediaBrowserCompatMediaItem;
    public getUseRuntimeKeysfwf_client_release MediaMetadataCompat;
    public setUseEvaluationsCachefwf_client_release MediaSessionCompatQueueItem;
    public DataInputStream serializer;
    public int PlaybackStateCompatCustomAction = 0;
    public boolean read = false;
    public boolean RatingCompat = true;
    public boolean MediaDescriptionCompat = true;
    public boolean RemoteActionCompatParcelizer = false;
    public IOException write = null;
    public final byte[] ParcelableVolumeInfo = new byte[1];

    public final void IconCompatParcelizer() throws IOException {
        int unsignedByte = this.serializer.readUnsignedByte();
        if (unsignedByte == 0) {
            this.RemoteActionCompatParcelizer = true;
            setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release = this.MediaSessionCompatQueueItem;
            if (setuseevaluationscachefwf_client_release != null) {
                byte[] bArr = setuseevaluationscachefwf_client_release.RemoteActionCompatParcelizer;
                getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release = this.IconCompatParcelizer;
                getfeaturesexpirationtimefwf_client_release.IconCompatParcelizer(bArr);
                this.MediaSessionCompatQueueItem = null;
                getfeaturesexpirationtimefwf_client_release.IconCompatParcelizer(this.MediaMetadataCompat.IconCompatParcelizer);
                this.MediaMetadataCompat = null;
                return;
            }
            return;
        }
        if (unsignedByte >= 224 || unsignedByte == 1) {
            this.MediaDescriptionCompat = true;
            this.RatingCompat = false;
            setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release2 = this.MediaSessionCompatQueueItem;
            setuseevaluationscachefwf_client_release2.RatingCompat = 0;
            setuseevaluationscachefwf_client_release2.MediaDescriptionCompat = 0;
            setuseevaluationscachefwf_client_release2.write = 0;
            setuseevaluationscachefwf_client_release2.IconCompatParcelizer = 0;
            setuseevaluationscachefwf_client_release2.RemoteActionCompatParcelizer[setuseevaluationscachefwf_client_release2.read - 1] = 0;
        } else if (this.RatingCompat) {
            throw new CorruptedInputException();
        }
        if (unsignedByte < 128) {
            if (unsignedByte > 2) {
                throw new CorruptedInputException();
            }
            this.read = false;
            this.PlaybackStateCompatCustomAction = this.serializer.readUnsignedShort() + 1;
            return;
        }
        this.read = true;
        int i = (unsignedByte & 31) << 16;
        this.PlaybackStateCompatCustomAction = i;
        this.PlaybackStateCompatCustomAction = this.serializer.readUnsignedShort() + 1 + i;
        int unsignedShort = this.serializer.readUnsignedShort();
        if (unsignedByte >= 192) {
            this.MediaDescriptionCompat = false;
            int unsignedByte2 = this.serializer.readUnsignedByte();
            if (unsignedByte2 > 224) {
                throw new CorruptedInputException();
            }
            int i2 = unsignedByte2 / 45;
            int i3 = unsignedByte2 - (i2 * 45);
            int i4 = i3 / 9;
            int i5 = i3 - (i4 * 9);
            if (i5 + i4 > 4) {
                throw new CorruptedInputException();
            }
            this.MediaBrowserCompatMediaItem = new FwFClientExtensionKt(this.MediaSessionCompatQueueItem, this.MediaMetadataCompat, i5, i4, i2);
        } else {
            if (this.MediaDescriptionCompat) {
                throw new CorruptedInputException();
            }
            if (unsignedByte >= 160) {
                this.MediaBrowserCompatMediaItem.write();
            }
        }
        getUseRuntimeKeysfwf_client_release getuseruntimekeysfwf_client_release = this.MediaMetadataCompat;
        DataInputStream dataInputStream = this.serializer;
        getuseruntimekeysfwf_client_release.getClass();
        if (unsignedShort + 1 < 5) {
            throw new CorruptedInputException();
        }
        if (dataInputStream.readUnsignedByte() != 0) {
            throw new CorruptedInputException();
        }
        getuseruntimekeysfwf_client_release.write = dataInputStream.readInt();
        getuseruntimekeysfwf_client_release.RemoteActionCompatParcelizer = -1;
        int i6 = unsignedShort - 4;
        byte[] bArr2 = getuseruntimekeysfwf_client_release.IconCompatParcelizer;
        int length = bArr2.length - i6;
        getuseruntimekeysfwf_client_release.read = length;
        dataInputStream.readFully(bArr2, length, i6);
    }

    public LZMA2InputStream(InputStream inputStream, int i, getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release) {
        inputStream.getClass();
        this.IconCompatParcelizer = getfeaturesexpirationtimefwf_client_release;
        this.serializer = new DataInputStream(inputStream);
        this.MediaMetadataCompat = new getUseRuntimeKeysfwf_client_release(getfeaturesexpirationtimefwf_client_release);
        this.MediaSessionCompatQueueItem = new setUseEvaluationsCachefwf_client_release(write(i), getfeaturesexpirationtimefwf_client_release);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        DataInputStream dataInputStream = this.serializer;
        if (dataInputStream == null) {
            throw new XZIOException("Stream closed");
        }
        IOException iOException = this.write;
        if (iOException != null) {
            throw iOException;
        }
        boolean z = this.read;
        int i = this.PlaybackStateCompatCustomAction;
        return z ? i : Math.min(i, dataInputStream.available());
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.serializer != null) {
            setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release = this.MediaSessionCompatQueueItem;
            if (setuseevaluationscachefwf_client_release != null) {
                byte[] bArr = setuseevaluationscachefwf_client_release.RemoteActionCompatParcelizer;
                getFeaturesExpirationTimefwf_client_release getfeaturesexpirationtimefwf_client_release = this.IconCompatParcelizer;
                getfeaturesexpirationtimefwf_client_release.IconCompatParcelizer(bArr);
                this.MediaSessionCompatQueueItem = null;
                getfeaturesexpirationtimefwf_client_release.IconCompatParcelizer(this.MediaMetadataCompat.IconCompatParcelizer);
                this.MediaMetadataCompat = null;
            }
            try {
                this.serializer.close();
            } finally {
                this.serializer = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.serializer != null) {
            IOException iOException = this.write;
            if (iOException == null) {
                if (this.RemoteActionCompatParcelizer) {
                    return -1;
                }
                int i4 = 0;
                while (i2 > 0) {
                    try {
                        if (this.PlaybackStateCompatCustomAction == 0) {
                            IconCompatParcelizer();
                            if (this.RemoteActionCompatParcelizer) {
                                if (i4 == 0) {
                                    return -1;
                                }
                            }
                        }
                        int iMin = Math.min(this.PlaybackStateCompatCustomAction, i2);
                        boolean z = this.read;
                        setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release = this.MediaSessionCompatQueueItem;
                        if (!z) {
                            DataInputStream dataInputStream = this.serializer;
                            int iMin2 = Math.min(setuseevaluationscachefwf_client_release.read - setuseevaluationscachefwf_client_release.MediaDescriptionCompat, iMin);
                            dataInputStream.readFully(setuseevaluationscachefwf_client_release.RemoteActionCompatParcelizer, setuseevaluationscachefwf_client_release.MediaDescriptionCompat, iMin2);
                            int i5 = setuseevaluationscachefwf_client_release.MediaDescriptionCompat + iMin2;
                            setuseevaluationscachefwf_client_release.MediaDescriptionCompat = i5;
                            if (setuseevaluationscachefwf_client_release.write < i5) {
                                setuseevaluationscachefwf_client_release.write = i5;
                            }
                        } else {
                            int i6 = setuseevaluationscachefwf_client_release.read;
                            int i7 = setuseevaluationscachefwf_client_release.MediaDescriptionCompat;
                            if (i6 - i7 <= iMin) {
                                setuseevaluationscachefwf_client_release.IconCompatParcelizer = i6;
                            } else {
                                setuseevaluationscachefwf_client_release.IconCompatParcelizer = i7 + iMin;
                            }
                            this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
                        }
                        setUseEvaluationsCachefwf_client_release setuseevaluationscachefwf_client_release2 = this.MediaSessionCompatQueueItem;
                        int i8 = setuseevaluationscachefwf_client_release2.MediaDescriptionCompat;
                        int i9 = setuseevaluationscachefwf_client_release2.RatingCompat;
                        int i10 = i8 - i9;
                        if (i8 == setuseevaluationscachefwf_client_release2.read) {
                            setuseevaluationscachefwf_client_release2.MediaDescriptionCompat = 0;
                        }
                        System.arraycopy(setuseevaluationscachefwf_client_release2.RemoteActionCompatParcelizer, i9, bArr, i, i10);
                        setuseevaluationscachefwf_client_release2.RatingCompat = setuseevaluationscachefwf_client_release2.MediaDescriptionCompat;
                        i += i10;
                        i2 -= i10;
                        i4 += i10;
                        int i11 = this.PlaybackStateCompatCustomAction - i10;
                        this.PlaybackStateCompatCustomAction = i11;
                        if (i11 == 0) {
                            getUseRuntimeKeysfwf_client_release getuseruntimekeysfwf_client_release = this.MediaMetadataCompat;
                            if (getuseruntimekeysfwf_client_release.read != getuseruntimekeysfwf_client_release.IconCompatParcelizer.length || getuseruntimekeysfwf_client_release.write != 0 || this.MediaSessionCompatQueueItem.MediaMetadataCompat > 0) {
                                throw new CorruptedInputException();
                            }
                        }
                    } catch (IOException e) {
                        this.write = e;
                        throw e;
                    }
                }
                return i4;
            }
            throw iOException;
        }
        throw new XZIOException("Stream closed");
    }

    public static int write(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & (-16);
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Unsupported dictionary size "));
        return 0;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.ParcelableVolumeInfo;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
