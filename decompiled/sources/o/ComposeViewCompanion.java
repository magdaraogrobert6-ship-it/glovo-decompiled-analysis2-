package o;

import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class ComposeViewCompanion extends CodedInputStream {
    public final long IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat = Integer.MAX_VALUE;
    public long MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public final long MediaSessionCompatResultReceiverWrapper;
    public long RatingCompat;
    public final ByteBuffer serializer;

    public static boolean r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        return setDirty.write;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long MediaDescriptionCompat() {
        return r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int MediaSessionCompatQueueItem() {
        return MediaSessionCompatToken();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int ParcelableVolumeInfo() {
        return MediaSessionCompatToken();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int PlaybackStateCompat() {
        return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long PlaybackStateCompatCustomAction() {
        return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int RatingCompat() {
        return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        return MediaSessionCompatToken();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean serializer() {
        return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean IconCompatParcelizer() {
        return this.MediaMetadataCompat == this.RatingCompat;
    }

    public final void MediaSessionCompatQueueItem(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        if (i >= 0) {
            long j = this.RatingCompat;
            long j2 = this.MediaMetadataCompat;
            if (i <= ((int) (j - j2))) {
                this.MediaMetadataCompat = j2 + ((long) i);
                return;
            }
        }
        if (i >= 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009c A[PHI: r5
  0x009c: PHI (r5v6 long) = (r5v5 long), (r5v8 long) binds: [B:25:0x006c, B:29:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.protobuf.CodedInputStream
    public final int MediaSessionCompatToken() {
        int i;
        long j = this.MediaMetadataCompat;
        if (this.RatingCompat != j) {
            long j2 = 1 + j;
            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
            byte bSerializer = graphicsLayerOwnerLayerrecordLambda1.serializer(j);
            if (bSerializer >= 0) {
                this.MediaMetadataCompat = j2;
                return bSerializer;
            }
            if (this.RatingCompat - j2 >= 9) {
                long j3 = 2 + j;
                int iSerializer = (graphicsLayerOwnerLayerrecordLambda1.serializer(j2) << 7) ^ bSerializer;
                if (iSerializer < 0) {
                    i = iSerializer ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iSerializer2 = iSerializer ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j3) << 14);
                    if (iSerializer2 >= 0) {
                        i = iSerializer2 ^ 16256;
                    } else {
                        j3 = j + 4;
                        int iSerializer3 = iSerializer2 ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j4) << 21);
                        if (iSerializer3 < 0) {
                            i = (-2080896) ^ iSerializer3;
                        } else {
                            j4 = 5 + j;
                            byte bSerializer2 = graphicsLayerOwnerLayerrecordLambda1.serializer(j3);
                            int i2 = (iSerializer3 ^ (bSerializer2 << 28)) ^ 266354560;
                            if (bSerializer2 < 0) {
                                long j5 = 6 + j;
                                if (graphicsLayerOwnerLayerrecordLambda1.serializer(j4) < 0) {
                                    j4 = 7 + j;
                                    if (graphicsLayerOwnerLayerrecordLambda1.serializer(j5) < 0) {
                                        j5 = 8 + j;
                                        if (graphicsLayerOwnerLayerrecordLambda1.serializer(j4) < 0) {
                                            long j6 = j + 9;
                                            if (graphicsLayerOwnerLayerrecordLambda1.serializer(j5) < 0) {
                                                long j7 = j + 10;
                                                if (graphicsLayerOwnerLayerrecordLambda1.serializer(j6) >= 0) {
                                                    j3 = j7;
                                                }
                                            } else {
                                                i = i2;
                                                j3 = j6;
                                            }
                                        } else {
                                            j3 = j5;
                                        }
                                        i = i2;
                                    }
                                } else {
                                    j3 = j5;
                                    i = i2;
                                }
                            }
                            i = i2;
                        }
                    }
                    j3 = j4;
                }
                this.MediaMetadataCompat = j3;
                return i;
            }
        }
        return (int) r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
    }

    public final long r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.MediaMetadataCompat;
        if (this.RatingCompat != j4) {
            long j5 = 1 + j4;
            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
            byte bSerializer = graphicsLayerOwnerLayerrecordLambda1.serializer(j4);
            if (bSerializer >= 0) {
                this.MediaMetadataCompat = j5;
                return bSerializer;
            }
            if (this.RatingCompat - j5 >= 9) {
                long j6 = 2 + j4;
                int iSerializer = (graphicsLayerOwnerLayerrecordLambda1.serializer(j5) << 7) ^ bSerializer;
                if (iSerializer >= 0) {
                    long j7 = 3 + j4;
                    int iSerializer2 = iSerializer ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j6) << 14);
                    if (iSerializer2 < 0) {
                        j6 = j4 + 4;
                        int iSerializer3 = iSerializer2 ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j7) << 21);
                        if (iSerializer3 < 0) {
                            i = (-2080896) ^ iSerializer3;
                        } else {
                            j7 = 5 + j4;
                            long jSerializer = ((long) iSerializer3) ^ (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j6)) << 28);
                            if (jSerializer >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = 6 + j4;
                                long jSerializer2 = jSerializer ^ (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j7)) << 35);
                                if (jSerializer2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jSerializer = jSerializer2 ^ (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j8)) << 42);
                                    if (jSerializer >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j4;
                                        jSerializer2 = jSerializer ^ (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j7)) << 49);
                                        if (jSerializer2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            long j9 = j4 + 9;
                                            long jSerializer3 = (jSerializer2 ^ (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j8)) << 56)) ^ 71499008037633920L;
                                            if (jSerializer3 >= 0) {
                                                j = jSerializer3;
                                                j6 = j9;
                                            } else if (graphicsLayerOwnerLayerrecordLambda1.serializer(j9) >= 0) {
                                                j6 = j4 + 10;
                                                j = jSerializer3;
                                            }
                                        }
                                    }
                                }
                                j6 = j8;
                                j = j2 ^ jSerializer2;
                            }
                            j = j3 ^ jSerializer;
                        }
                        this.MediaMetadataCompat = j6;
                        return j;
                    }
                    j = iSerializer2 ^ 16256;
                    j6 = j7;
                    this.MediaMetadataCompat = j6;
                    return j;
                }
                i = iSerializer ^ (-128);
                j = i;
                this.MediaMetadataCompat = j6;
                return j;
            }
        }
        return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
    }

    public final long r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() throws com.google.protobuf.InvalidProtocolBufferException {
        long j = this.MediaMetadataCompat;
        if (this.RatingCompat - j < 8) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        this.MediaMetadataCompat = 8 + j;
        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
        return ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j + 7)) & 255) << 56) | (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j)) & 255) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(1 + j)) & 255) << 8) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(2 + j)) & 255) << 16) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(3 + j)) & 255) << 24) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(4 + j)) & 255) << 32) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(5 + j)) & 255) << 40) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j + 6)) & 255) << 48);
    }

    public final int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() throws com.google.protobuf.InvalidProtocolBufferException {
        long j = this.MediaMetadataCompat;
        if (this.RatingCompat - j < 4) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        this.MediaMetadataCompat = 4 + j;
        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
        return ((graphicsLayerOwnerLayerrecordLambda1.serializer(j + 3) & 255) << 24) | (graphicsLayerOwnerLayerrecordLambda1.serializer(j) & 255) | ((graphicsLayerOwnerLayerrecordLambda1.serializer(1 + j) & 255) << 8) | ((graphicsLayerOwnerLayerrecordLambda1.serializer(2 + j) & 255) << 16);
    }

    public final void r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        long j = this.RatingCompat + ((long) this.MediaBrowserCompatMediaItem);
        this.RatingCompat = j;
        int i = (int) (j - this.MediaSessionCompatResultReceiverWrapper);
        int i2 = this.MediaDescriptionCompat;
        if (i <= i2) {
            this.MediaBrowserCompatMediaItem = 0;
            return;
        }
        int i3 = i - i2;
        this.MediaBrowserCompatMediaItem = i3;
        this.RatingCompat = j - ((long) i3);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int read() {
        return (int) (this.MediaMetadataCompat - this.MediaSessionCompatResultReceiverWrapper);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int read(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        if (i < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
        }
        int i2 = read() + i;
        int i3 = this.MediaDescriptionCompat;
        if (i2 > i3) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        this.MediaDescriptionCompat = i2;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        return i3;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void serializer(int i) {
        this.MediaDescriptionCompat = i;
        r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void IconCompatParcelizer(int i, getClipToOutline getcliptooutline, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws com.google.protobuf.InvalidProtocolBufferException {
        RemoteActionCompatParcelizer();
        this.write++;
        ((CompositionLocalsKtLocalHapticFeedback1) getcliptooutline).IconCompatParcelizer(this, getlocalprovidablescrollcaptureinprogress);
        RemoteActionCompatParcelizer((i << 3) | 4);
        this.write--;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double MediaMetadataCompat() {
        return Double.longBitsToDouble(r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float MediaSessionCompatResultReceiverWrapper() {
        return Float.intBitsToFloat(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return CodedInputStream.write(MediaSessionCompatToken());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return CodedInputStream.read(r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void serializer(getClipToOutline getcliptooutline, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws com.google.protobuf.InvalidProtocolBufferException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        RemoteActionCompatParcelizer();
        int i = read(iMediaSessionCompatToken);
        this.write++;
        ((CompositionLocalsKtLocalHapticFeedback1) getcliptooutline).IconCompatParcelizer(this, getlocalprovidablescrollcaptureinprogress);
        RemoteActionCompatParcelizer(0);
        this.write--;
        if (write() != 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        serializer(i);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void RemoteActionCompatParcelizer(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        if (this.MediaSessionCompatQueueItem != i) {
            throw com.google.protobuf.InvalidProtocolBufferException.write();
        }
    }

    public ComposeViewCompanion(ByteBuffer byteBuffer, boolean z) {
        this.serializer = byteBuffer;
        long jMediaDescriptionCompat = setDirty.RatingCompat.MediaDescriptionCompat(setDirty.serializer, byteBuffer);
        this.IconCompatParcelizer = jMediaDescriptionCompat;
        this.RatingCompat = ((long) byteBuffer.limit()) + jMediaDescriptionCompat;
        long jPosition = jMediaDescriptionCompat + ((long) byteBuffer.position());
        this.MediaMetadataCompat = jPosition;
        this.MediaSessionCompatResultReceiverWrapper = jPosition;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String ComponentActivity() throws com.google.protobuf.InvalidProtocolBufferException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        if (iMediaSessionCompatToken > 0) {
            long j = this.RatingCompat;
            long j2 = this.MediaMetadataCompat;
            if (iMediaSessionCompatToken <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMediaSessionCompatToken];
                long j3 = iMediaSessionCompatToken;
                setDirty.RatingCompat.serializer(j2, bArr, 0L, j3);
                String str = new String(bArr, CompositionLocalsKtLocalWindowInfo1.serializer);
                this.MediaMetadataCompat += j3;
                return str;
            }
        }
        if (iMediaSessionCompatToken == 0) {
            return "";
        }
        if (iMediaSessionCompatToken < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
        }
        throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final ClipboardExtensions_androidKt MediaBrowserCompatMediaItem() throws com.google.protobuf.InvalidProtocolBufferException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        if (iMediaSessionCompatToken > 0) {
            long j = this.RatingCompat;
            long j2 = this.MediaMetadataCompat;
            if (iMediaSessionCompatToken <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMediaSessionCompatToken];
                long j3 = iMediaSessionCompatToken;
                setDirty.RatingCompat.serializer(j2, bArr, 0L, j3);
                this.MediaMetadataCompat += j3;
                ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
                return new ClipboardExtensions_androidKt(bArr);
            }
        }
        if (iMediaSessionCompatToken == 0) {
            return getClipMetadata.serializer;
        }
        if (iMediaSessionCompatToken < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
        }
        throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String ResultReceiver() throws com.google.protobuf.InvalidProtocolBufferException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        if (iMediaSessionCompatToken > 0) {
            long j = this.RatingCompat;
            long j2 = this.MediaMetadataCompat;
            if (iMediaSessionCompatToken <= ((int) (j - j2))) {
                String strWrite = IndirectPointerNavigationGestureDetector.write(this.serializer, (int) (j2 - this.IconCompatParcelizer), iMediaSessionCompatToken);
                this.MediaMetadataCompat += (long) iMediaSessionCompatToken;
                return strWrite;
            }
        }
        if (iMediaSessionCompatToken == 0) {
            return "";
        }
        if (iMediaSessionCompatToken <= 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
        }
        throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() throws com.google.protobuf.InvalidProtocolBufferException {
        if (IconCompatParcelizer()) {
            this.MediaSessionCompatQueueItem = 0;
            return 0;
        }
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        this.MediaSessionCompatQueueItem = iMediaSessionCompatToken;
        if ((iMediaSessionCompatToken >>> 3) != 0) {
            return iMediaSessionCompatToken;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
    }

    public final long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() throws com.google.protobuf.InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.MediaMetadataCompat;
            if (j2 != this.RatingCompat) {
                this.MediaMetadataCompat = 1 + j2;
                byte bSerializer = setDirty.RatingCompat.serializer(j2);
                j |= ((long) (bSerializer & 127)) << i;
                if ((bSerializer & 128) == 0) {
                    return j;
                }
            } else {
                throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
            }
        }
        throw com.google.protobuf.InvalidProtocolBufferException.read();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int write() {
        int i = this.MediaDescriptionCompat;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - read();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean IconCompatParcelizer(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                MediaSessionCompatQueueItem(8);
                return true;
            }
            if (i2 == 2) {
                MediaSessionCompatQueueItem(MediaSessionCompatToken());
                return true;
            }
            if (i2 == 3) {
                r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                RemoteActionCompatParcelizer(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                MediaSessionCompatQueueItem(4);
                return true;
            }
            throw com.google.protobuf.InvalidProtocolBufferException.serializer();
        }
        if (((int) (this.RatingCompat - this.MediaMetadataCompat)) >= 10) {
            while (i3 < 10) {
                long j = this.MediaMetadataCompat;
                this.MediaMetadataCompat = j + 1;
                if (setDirty.RatingCompat.serializer(j) < 0) {
                    i3++;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.read();
        }
        while (i3 < 10) {
            long j2 = this.MediaMetadataCompat;
            if (j2 != this.RatingCompat) {
                this.MediaMetadataCompat = j2 + 1;
                if (setDirty.RatingCompat.serializer(j2) < 0) {
                    i3++;
                }
            } else {
                throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
            }
        }
        throw com.google.protobuf.InvalidProtocolBufferException.read();
        return true;
    }
}
