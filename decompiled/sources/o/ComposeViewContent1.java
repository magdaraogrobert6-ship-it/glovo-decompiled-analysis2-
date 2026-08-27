package o;

import com.google.protobuf.CodedInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ComposeViewContent1 extends CodedInputStream {
    public final byte[] IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public int RatingCompat = Integer.MAX_VALUE;
    public int serializer;

    @Override // com.google.protobuf.CodedInputStream
    public final long MediaDescriptionCompat() {
        return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
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
        return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long PlaybackStateCompatCustomAction() {
        return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int RatingCompat() {
        return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
        return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
        return MediaSessionCompatToken();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean serializer() {
        return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean IconCompatParcelizer() {
        return this.MediaDescriptionCompat == this.MediaBrowserCompatMediaItem;
    }

    public final void MediaSessionCompatQueueItem(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        if (i >= 0) {
            int i2 = this.MediaBrowserCompatMediaItem;
            int i3 = this.MediaDescriptionCompat;
            if (i <= i2 - i3) {
                this.MediaDescriptionCompat = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int MediaSessionCompatToken() {
        int i;
        int i2 = this.MediaDescriptionCompat;
        int i3 = this.MediaBrowserCompatMediaItem;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.IconCompatParcelizer;
            byte b = bArr[i2];
            if (b >= 0) {
                this.MediaDescriptionCompat = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                if (bArr[i7] >= 0) {
                                                    i5 = i2 + 10;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.MediaDescriptionCompat = i5;
                return i;
            }
        }
        return (int) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
    }

    public final int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() throws com.google.protobuf.InvalidProtocolBufferException {
        int i = this.MediaDescriptionCompat;
        if (this.MediaBrowserCompatMediaItem - i < 4) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        this.MediaDescriptionCompat = i + 4;
        byte[] bArr = this.IconCompatParcelizer;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() throws com.google.protobuf.InvalidProtocolBufferException {
        int i = this.MediaDescriptionCompat;
        if (this.MediaBrowserCompatMediaItem - i < 8) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        this.MediaDescriptionCompat = i + 8;
        byte[] bArr = this.IconCompatParcelizer;
        long j = bArr[i];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final void r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        int i = this.MediaBrowserCompatMediaItem + this.serializer;
        this.MediaBrowserCompatMediaItem = i;
        int i2 = i - this.MediaSessionCompatQueueItem;
        int i3 = this.RatingCompat;
        if (i2 <= i3) {
            this.serializer = 0;
            return;
        }
        int i4 = i2 - i3;
        this.serializer = i4;
        this.MediaBrowserCompatMediaItem = i - i4;
    }

    public final long r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.MediaDescriptionCompat;
        int i2 = this.MediaBrowserCompatMediaItem;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.IconCompatParcelizer;
            byte b = bArr[i];
            if (b >= 0) {
                this.MediaDescriptionCompat = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                if (bArr[i4] >= 0) {
                                                    i4 = i + 10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.MediaDescriptionCompat = i4;
                return j;
            }
        }
        return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int read() {
        return this.MediaDescriptionCompat - this.MediaSessionCompatQueueItem;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int read(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        if (i < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
        }
        int i2 = read() + i;
        if (i2 < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        int i3 = this.RatingCompat;
        if (i2 > i3) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
        }
        this.RatingCompat = i2;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        return i3;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void serializer(int i) {
        this.RatingCompat = i;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void IconCompatParcelizer(int i, getClipToOutline getcliptooutline, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws com.google.protobuf.InvalidProtocolBufferException {
        RemoteActionCompatParcelizer();
        this.write++;
        ((CompositionLocalsKtLocalHapticFeedback1) getcliptooutline).IconCompatParcelizer(this, getlocalprovidablescrollcaptureinprogress);
        RemoteActionCompatParcelizer((i << 3) | 4);
        this.write--;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // com.google.protobuf.CodedInputStream
    public final ClipboardExtensions_androidKt MediaBrowserCompatMediaItem() throws com.google.protobuf.InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        byte[] bArr = this.IconCompatParcelizer;
        if (iMediaSessionCompatToken > 0) {
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.MediaDescriptionCompat;
            if (iMediaSessionCompatToken <= i - i2) {
                ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.read(bArr, i2, iMediaSessionCompatToken);
                this.MediaDescriptionCompat += iMediaSessionCompatToken;
                return clipboardExtensions_androidKt;
            }
        }
        if (iMediaSessionCompatToken == 0) {
            return getClipMetadata.serializer;
        }
        if (iMediaSessionCompatToken > 0) {
            int i3 = this.MediaBrowserCompatMediaItem;
            int i4 = this.MediaDescriptionCompat;
            if (iMediaSessionCompatToken <= i3 - i4) {
                int i5 = iMediaSessionCompatToken + i4;
                this.MediaDescriptionCompat = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iMediaSessionCompatToken <= 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
                }
                if (iMediaSessionCompatToken == 0) {
                    throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
                }
                bArrCopyOfRange = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer;
            }
        } else {
            if (iMediaSessionCompatToken <= 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            if (iMediaSessionCompatToken == 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
            }
            bArrCopyOfRange = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer;
        }
        ClipboardExtensions_androidKt clipboardExtensions_androidKt2 = getClipMetadata.serializer;
        return new ClipboardExtensions_androidKt(bArrCopyOfRange);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double MediaMetadataCompat() {
        return Double.longBitsToDouble(r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float MediaSessionCompatResultReceiverWrapper() {
        return Float.intBitsToFloat(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return CodedInputStream.write(MediaSessionCompatToken());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return CodedInputStream.read(r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0());
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
        if (this.MediaMetadataCompat != i) {
            throw com.google.protobuf.InvalidProtocolBufferException.write();
        }
    }

    public ComposeViewContent1(byte[] bArr, int i, int i2, boolean z) {
        this.IconCompatParcelizer = bArr;
        this.MediaBrowserCompatMediaItem = i2 + i;
        this.MediaDescriptionCompat = i;
        this.MediaSessionCompatQueueItem = i;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String ComponentActivity() throws com.google.protobuf.InvalidProtocolBufferException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        if (iMediaSessionCompatToken > 0) {
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.MediaDescriptionCompat;
            if (iMediaSessionCompatToken <= i - i2) {
                String str = new String(this.IconCompatParcelizer, i2, iMediaSessionCompatToken, CompositionLocalsKtLocalWindowInfo1.serializer);
                this.MediaDescriptionCompat += iMediaSessionCompatToken;
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
    public final String ResultReceiver() throws com.google.protobuf.InvalidProtocolBufferException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        if (iMediaSessionCompatToken > 0) {
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.MediaDescriptionCompat;
            if (iMediaSessionCompatToken <= i - i2) {
                String strRemoteActionCompatParcelizer = IndirectPointerNavigationGestureDetector.write.RemoteActionCompatParcelizer(this.IconCompatParcelizer, i2, iMediaSessionCompatToken);
                this.MediaDescriptionCompat += iMediaSessionCompatToken;
                return strRemoteActionCompatParcelizer;
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
            this.MediaMetadataCompat = 0;
            return 0;
        }
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        this.MediaMetadataCompat = iMediaSessionCompatToken;
        if ((iMediaSessionCompatToken >>> 3) != 0) {
            return iMediaSessionCompatToken;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
    }

    public final long r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() throws com.google.protobuf.InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.MediaDescriptionCompat;
            if (i2 != this.MediaBrowserCompatMediaItem) {
                this.MediaDescriptionCompat = i2 + 1;
                byte b = this.IconCompatParcelizer[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
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
        int i = this.RatingCompat;
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
        int i4 = this.MediaBrowserCompatMediaItem;
        int i5 = this.MediaDescriptionCompat;
        byte[] bArr = this.IconCompatParcelizer;
        if (i4 - i5 >= 10) {
            while (i3 < 10) {
                int i6 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.read();
        }
        while (i3 < 10) {
            int i7 = this.MediaDescriptionCompat;
            if (i7 != this.MediaBrowserCompatMediaItem) {
                this.MediaDescriptionCompat = i7 + 1;
                if (bArr[i7] < 0) {
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
