package o;

import com.google.protobuf.CodedInputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class getShouldCreateCompositionOnAttachedToWindowannotations extends CodedInputStream {
    public ByteBuffer IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public long MediaMetadataCompat;
    public final Iterator MediaSessionCompatQueueItem;
    public int ParcelableVolumeInfo;
    public int PlaybackStateCompatCustomAction;
    public long RatingCompat;
    public int serializer;
    public int MediaDescriptionCompat = Integer.MAX_VALUE;
    public int MediaSessionCompatResultReceiverWrapper = 0;

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
        return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long PlaybackStateCompatCustomAction() {
        return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int RatingCompat() {
        return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
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
        return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean serializer() {
        return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() != 0;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int MediaSessionCompatToken() {
        int i;
        long j = this.MediaBrowserCompatMediaItem;
        if (this.MediaMetadataCompat != j) {
            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
            byte bSerializer = graphicsLayerOwnerLayerrecordLambda1.serializer(j);
            if (bSerializer >= 0) {
                this.MediaBrowserCompatMediaItem++;
                return bSerializer;
            }
            if (this.MediaMetadataCompat - this.MediaBrowserCompatMediaItem >= 10) {
                long j2 = 2 + j;
                int iSerializer = bSerializer ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(1 + j) << 7);
                if (iSerializer < 0) {
                    i = iSerializer ^ (-128);
                } else {
                    long j3 = 3 + j;
                    int iSerializer2 = iSerializer ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j2) << 14);
                    if (iSerializer2 >= 0) {
                        i = iSerializer2 ^ 16256;
                    } else {
                        j2 = 4 + j;
                        int iSerializer3 = iSerializer2 ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j3) << 21);
                        if (iSerializer3 < 0) {
                            i = (-2080896) ^ iSerializer3;
                        } else {
                            j3 = 5 + j;
                            byte bSerializer2 = graphicsLayerOwnerLayerrecordLambda1.serializer(j2);
                            int i2 = (iSerializer3 ^ (bSerializer2 << 28)) ^ 266354560;
                            if (bSerializer2 < 0) {
                                j2 = 6 + j;
                                if (graphicsLayerOwnerLayerrecordLambda1.serializer(j3) < 0) {
                                    j3 = 7 + j;
                                    if (graphicsLayerOwnerLayerrecordLambda1.serializer(j2) < 0) {
                                        j2 = 8 + j;
                                        if (graphicsLayerOwnerLayerrecordLambda1.serializer(j3) < 0) {
                                            j3 = 9 + j;
                                            if (graphicsLayerOwnerLayerrecordLambda1.serializer(j2) < 0) {
                                                if (graphicsLayerOwnerLayerrecordLambda1.serializer(j3) >= 0) {
                                                    j2 = j + 10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i2;
                            }
                            i = i2;
                        }
                    }
                    j2 = j3;
                }
                this.MediaBrowserCompatMediaItem = j2;
                return i;
            }
        }
        return (int) r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
    }

    public final int _init_lambda1() {
        return (int) ((((long) (this.ParcelableVolumeInfo - this.MediaSessionCompatResultReceiverWrapper)) - this.MediaBrowserCompatMediaItem) + this.RatingCompat);
    }

    public final void _init_lambda4() {
        ByteBuffer byteBuffer = (ByteBuffer) this.MediaSessionCompatQueueItem.next();
        this.IconCompatParcelizer = byteBuffer;
        this.MediaSessionCompatResultReceiverWrapper += (int) (this.MediaBrowserCompatMediaItem - this.RatingCompat);
        long jPosition = byteBuffer.position();
        this.MediaBrowserCompatMediaItem = jPosition;
        this.RatingCompat = jPosition;
        this.MediaMetadataCompat = this.IconCompatParcelizer.limit();
        long jMediaDescriptionCompat = setDirty.RatingCompat.MediaDescriptionCompat(setDirty.serializer, this.IconCompatParcelizer);
        this.MediaBrowserCompatMediaItem += jMediaDescriptionCompat;
        this.RatingCompat += jMediaDescriptionCompat;
        this.MediaMetadataCompat += jMediaDescriptionCompat;
    }

    public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
        return this.MediaMetadataCompat - this.MediaBrowserCompatMediaItem;
    }

    public final long r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() throws com.google.protobuf.InvalidProtocolBufferException {
        long j;
        long jR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        byte bR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        if (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() >= 8) {
            long j2 = this.MediaBrowserCompatMediaItem;
            this.MediaBrowserCompatMediaItem = 8 + j2;
            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
            long jSerializer = graphicsLayerOwnerLayerrecordLambda1.serializer(j2);
            long jSerializer2 = graphicsLayerOwnerLayerrecordLambda1.serializer(1 + j2);
            long jSerializer3 = graphicsLayerOwnerLayerrecordLambda1.serializer(j2 + 2);
            long jSerializer4 = graphicsLayerOwnerLayerrecordLambda1.serializer(j2 + 3);
            long jSerializer5 = (graphicsLayerOwnerLayerrecordLambda1.serializer(j2 + 4) & 255) << 32;
            jR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = jSerializer5 | ((jSerializer4 & 255) << 24) | (jSerializer & 255) | ((jSerializer2 & 255) << 8) | ((jSerializer3 & 255) << 16) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j2 + 5)) & 255) << 40) | ((((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j2 + 6)) & 255) << 48);
            bR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = graphicsLayerOwnerLayerrecordLambda1.serializer(j2 + 7);
            j = 255;
        } else {
            j = 255;
            jR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = (((long) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) & 255) | ((((long) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) & 255) << 8) | ((((long) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) & 255) << 16) | ((((long) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) & 255) << 24) | ((((long) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) & 255) << 32) | ((((long) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) & 255) << 40) | ((((long) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs()) & 255) << 48);
            bR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }
        return jR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs | ((((long) bR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) & j) << 56);
    }

    public final long r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.MediaBrowserCompatMediaItem;
        if (this.MediaMetadataCompat != j4) {
            GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
            byte bSerializer = graphicsLayerOwnerLayerrecordLambda1.serializer(j4);
            if (bSerializer >= 0) {
                this.MediaBrowserCompatMediaItem++;
                return bSerializer;
            }
            if (this.MediaMetadataCompat - this.MediaBrowserCompatMediaItem >= 10) {
                long j5 = 2 + j4;
                int iSerializer = bSerializer ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(1 + j4) << 7);
                if (iSerializer >= 0) {
                    long j6 = 3 + j4;
                    int iSerializer2 = iSerializer ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j5) << 14);
                    if (iSerializer2 >= 0) {
                        j = iSerializer2 ^ 16256;
                        j5 = j6;
                    } else {
                        j5 = 4 + j4;
                        int iSerializer3 = iSerializer2 ^ (graphicsLayerOwnerLayerrecordLambda1.serializer(j6) << 21);
                        if (iSerializer3 < 0) {
                            i = (-2080896) ^ iSerializer3;
                        } else {
                            long j7 = 5 + j4;
                            long jSerializer = ((long) iSerializer3) ^ (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j5)) << 28);
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
                                            j7 = 9 + j4;
                                            long jSerializer3 = (jSerializer2 ^ (((long) graphicsLayerOwnerLayerrecordLambda1.serializer(j8)) << 56)) ^ 71499008037633920L;
                                            if (jSerializer3 >= 0) {
                                                j = jSerializer3;
                                                j5 = j7;
                                            } else if (graphicsLayerOwnerLayerrecordLambda1.serializer(j7) >= 0) {
                                                j5 = j4 + 10;
                                                j = jSerializer3;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jSerializer2;
                                j5 = j8;
                            }
                            j = j3 ^ jSerializer;
                            j5 = j7;
                        }
                    }
                    this.MediaBrowserCompatMediaItem = j5;
                    return j;
                }
                i = iSerializer ^ (-128);
                j = i;
                this.MediaBrowserCompatMediaItem = j5;
                return j;
            }
        }
        return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
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
        int i4 = this.ParcelableVolumeInfo + this.serializer;
        this.ParcelableVolumeInfo = i4;
        if (i4 <= i2) {
            this.serializer = 0;
            return i3;
        }
        int i5 = i4 - i2;
        this.serializer = i5;
        this.ParcelableVolumeInfo = i4 - i5;
        return i3;
    }

    public final void read(int i, byte[] bArr) throws com.google.protobuf.InvalidProtocolBufferException {
        if (i < 0 || i > _init_lambda1()) {
            if (i > 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            if (i != 0) {
                throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
            }
            return;
        }
        int i2 = i;
        while (i2 > 0) {
            if (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() == 0) {
                if (!this.MediaSessionCompatQueueItem.hasNext()) {
                    throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
                }
                _init_lambda4();
            }
            int iMin = Math.min(i2, (int) r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
            long j = iMin;
            setDirty.RatingCompat.serializer(this.MediaBrowserCompatMediaItem, bArr, i - i2, j);
            i2 -= iMin;
            this.MediaBrowserCompatMediaItem += j;
        }
    }

    @Override // com.google.protobuf.CodedInputStream
    public final void serializer(int i) {
        this.MediaDescriptionCompat = i;
        int i2 = this.ParcelableVolumeInfo + this.serializer;
        this.ParcelableVolumeInfo = i2;
        if (i2 <= i) {
            this.serializer = 0;
            return;
        }
        int i3 = i2 - i;
        this.serializer = i3;
        this.ParcelableVolumeInfo = i2 - i3;
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
    public final boolean IconCompatParcelizer() {
        return (((long) this.MediaSessionCompatResultReceiverWrapper) + this.MediaBrowserCompatMediaItem) - this.RatingCompat == ((long) this.ParcelableVolumeInfo);
    }

    public final void MediaSessionCompatQueueItem(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        if (i >= 0) {
            if (i <= (((long) (this.ParcelableVolumeInfo - this.MediaSessionCompatResultReceiverWrapper)) - this.MediaBrowserCompatMediaItem) + this.RatingCompat) {
                while (i > 0) {
                    if (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() == 0) {
                        if (this.MediaSessionCompatQueueItem.hasNext()) {
                            _init_lambda4();
                        } else {
                            throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
                        }
                    }
                    int iMin = Math.min(i, (int) r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
                    i -= iMin;
                    this.MediaBrowserCompatMediaItem += (long) iMin;
                }
                return;
            }
        }
        if (i < 0) {
            throw com.google.protobuf.InvalidProtocolBufferException.MediaMetadataCompat();
        }
        throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int read() {
        return (int) ((((long) this.MediaSessionCompatResultReceiverWrapper) + this.MediaBrowserCompatMediaItem) - this.RatingCompat);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final double MediaMetadataCompat() {
        return Double.longBitsToDouble(r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final float MediaSessionCompatResultReceiverWrapper() {
        return Float.intBitsToFloat(r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return CodedInputStream.write(MediaSessionCompatToken());
    }

    @Override // com.google.protobuf.CodedInputStream
    public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
        return CodedInputStream.read(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ());
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
        if (this.PlaybackStateCompatCustomAction != i) {
            throw com.google.protobuf.InvalidProtocolBufferException.write();
        }
    }

    public getShouldCreateCompositionOnAttachedToWindowannotations(int i, ArrayList arrayList) {
        this.ParcelableVolumeInfo = i;
        this.MediaSessionCompatQueueItem = arrayList.iterator();
        if (i != 0) {
            _init_lambda4();
            return;
        }
        this.IconCompatParcelizer = CompositionLocalsKtLocalWindowInfo1.write;
        this.MediaBrowserCompatMediaItem = 0L;
        this.RatingCompat = 0L;
        this.MediaMetadataCompat = 0L;
    }

    @Override // com.google.protobuf.CodedInputStream
    public final String ComponentActivity() throws com.google.protobuf.InvalidProtocolBufferException {
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        if (iMediaSessionCompatToken > 0) {
            long j = iMediaSessionCompatToken;
            long j2 = this.MediaMetadataCompat;
            long j3 = this.MediaBrowserCompatMediaItem;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iMediaSessionCompatToken];
                setDirty.RatingCompat.serializer(j3, bArr, 0L, j);
                String str = new String(bArr, CompositionLocalsKtLocalWindowInfo1.serializer);
                this.MediaBrowserCompatMediaItem += j;
                return str;
            }
        }
        if (iMediaSessionCompatToken > 0 && iMediaSessionCompatToken <= _init_lambda1()) {
            byte[] bArr2 = new byte[iMediaSessionCompatToken];
            read(iMediaSessionCompatToken, bArr2);
            return new String(bArr2, CompositionLocalsKtLocalWindowInfo1.serializer);
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
            long j = iMediaSessionCompatToken;
            long j2 = this.MediaMetadataCompat;
            long j3 = this.MediaBrowserCompatMediaItem;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[iMediaSessionCompatToken];
                setDirty.RatingCompat.serializer(j3, bArr, 0L, j);
                this.MediaBrowserCompatMediaItem += j;
                ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.serializer;
                return new ClipboardExtensions_androidKt(bArr);
            }
        }
        if (iMediaSessionCompatToken > 0 && iMediaSessionCompatToken <= _init_lambda1()) {
            byte[] bArr2 = new byte[iMediaSessionCompatToken];
            read(iMediaSessionCompatToken, bArr2);
            ClipboardExtensions_androidKt clipboardExtensions_androidKt2 = getClipMetadata.serializer;
            return new ClipboardExtensions_androidKt(bArr2);
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
            long j = iMediaSessionCompatToken;
            long j2 = this.MediaMetadataCompat;
            long j3 = this.MediaBrowserCompatMediaItem;
            if (j <= j2 - j3) {
                String strWrite = IndirectPointerNavigationGestureDetector.write(this.IconCompatParcelizer, (int) (j3 - this.RatingCompat), iMediaSessionCompatToken);
                this.MediaBrowserCompatMediaItem += j;
                return strWrite;
            }
        }
        if (iMediaSessionCompatToken >= 0 && iMediaSessionCompatToken <= _init_lambda1()) {
            byte[] bArr = new byte[iMediaSessionCompatToken];
            read(iMediaSessionCompatToken, bArr);
            return IndirectPointerNavigationGestureDetector.write.RemoteActionCompatParcelizer(bArr, 0, iMediaSessionCompatToken);
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
            this.PlaybackStateCompatCustomAction = 0;
            return 0;
        }
        int iMediaSessionCompatToken = MediaSessionCompatToken();
        this.PlaybackStateCompatCustomAction = iMediaSessionCompatToken;
        if ((iMediaSessionCompatToken >>> 3) != 0) {
            return iMediaSessionCompatToken;
        }
        throw com.google.protobuf.InvalidProtocolBufferException.RemoteActionCompatParcelizer();
    }

    public final long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() throws com.google.protobuf.InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte bR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
            j |= ((long) (bR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs & 127)) << i;
            if ((bR8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs & 128) == 0) {
                return j;
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

    public final byte r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() throws com.google.protobuf.InvalidProtocolBufferException {
        if (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() == 0) {
            if (!this.MediaSessionCompatQueueItem.hasNext()) {
                throw com.google.protobuf.InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            _init_lambda4();
        }
        long j = this.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = 1 + j;
        return setDirty.RatingCompat.serializer(j);
    }

    public final int r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() throws com.google.protobuf.InvalidProtocolBufferException {
        if (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() < 4) {
            return (r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() & 255) | ((r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() & 255) << 8) | ((r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() & 255) << 16) | ((r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() & 255) << 24);
        }
        long j = this.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = 4 + j;
        GraphicsLayerOwnerLayerrecordLambda1 graphicsLayerOwnerLayerrecordLambda1 = setDirty.RatingCompat;
        return ((graphicsLayerOwnerLayerrecordLambda1.serializer(j + 3) & 255) << 24) | (graphicsLayerOwnerLayerrecordLambda1.serializer(j) & 255) | ((graphicsLayerOwnerLayerrecordLambda1.serializer(1 + j) & 255) << 8) | ((graphicsLayerOwnerLayerrecordLambda1.serializer(2 + j) & 255) << 16);
    }

    @Override // com.google.protobuf.CodedInputStream
    public final boolean IconCompatParcelizer(int i) throws com.google.protobuf.InvalidProtocolBufferException {
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() >= 0) {
                    return true;
                }
            }
            throw com.google.protobuf.InvalidProtocolBufferException.read();
        }
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
}
