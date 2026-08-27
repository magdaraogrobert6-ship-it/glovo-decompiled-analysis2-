package com.google.protobuf;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import o.ClipboardExtensions_androidKt;
import o.ComposeViewContent1;
import o.CompositionLocalsKtLocalHapticFeedback1;
import o.CompositionLocalsKtLocalWindowInfo1;
import o.IndirectPointerNavigationGestureDetector;
import o.getClipMetadata;
import o.getClipToOutline;
import o.getLocalProvidableScrollCaptureInProgress;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CodedInputStream {
    public int RemoteActionCompatParcelizer = 100;
    public CodedInputStreamReader read;
    public int write;

    public final class StreamDecoder extends CodedInputStream {
        public final byte[] IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem = Integer.MAX_VALUE;
        public int MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public int MediaSessionCompatQueueItem;
        public int PlaybackStateCompat;
        public final InputStream RatingCompat;
        public int serializer;

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
            return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final long PlaybackStateCompatCustomAction() {
            return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int RatingCompat() {
            return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
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
        public final boolean IconCompatParcelizer() {
            return this.MediaSessionCompatQueueItem == this.serializer && !ParcelableVolumeInfo(1);
        }

        public final void MediaDescriptionCompat(int i) throws InvalidProtocolBufferException {
            int i2 = this.serializer;
            int i3 = this.MediaSessionCompatQueueItem;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.MediaSessionCompatQueueItem = i3 + i;
                return;
            }
            InputStream inputStream = this.RatingCompat;
            if (i < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            int i5 = this.PlaybackStateCompat;
            int i6 = i5 + i3;
            int i7 = this.MediaBrowserCompatMediaItem;
            if (i6 + i > i7) {
                MediaDescriptionCompat((i7 - i5) - i3);
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            this.PlaybackStateCompat = i6;
            this.serializer = 0;
            this.MediaSessionCompatQueueItem = 0;
            while (i4 < i) {
                long j = i - i4;
                try {
                    try {
                        long jSkip = inputStream.skip(j);
                        if (jSkip < 0 || jSkip > j) {
                            throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                        }
                        if (jSkip == 0) {
                            break;
                        } else {
                            i4 += (int) jSkip;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.IconCompatParcelizer = true;
                        throw e;
                    }
                } catch (Throwable th) {
                    this.PlaybackStateCompat += i4;
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                    throw th;
                }
            }
            this.PlaybackStateCompat += i4;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
            if (i4 >= i) {
                return;
            }
            int i8 = this.serializer;
            int i9 = i8 - this.MediaSessionCompatQueueItem;
            this.MediaSessionCompatQueueItem = i8;
            MediaMetadataCompat(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.serializer;
                if (i10 <= i11) {
                    this.MediaSessionCompatQueueItem = i10;
                    return;
                } else {
                    i9 += i11;
                    this.MediaSessionCompatQueueItem = i11;
                    MediaMetadataCompat(1);
                }
            }
        }

        public final byte[] MediaSessionCompatQueueItem(int i) throws IOException {
            if (i == 0) {
                return CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            int i2 = this.PlaybackStateCompat;
            int i3 = this.MediaSessionCompatQueueItem;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.MediaBrowserCompatMediaItem;
            if (i4 > i5) {
                MediaDescriptionCompat((i5 - i2) - i3);
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            int i6 = this.serializer - i3;
            int i7 = i - i6;
            InputStream inputStream = this.RatingCompat;
            if (i7 >= 4096) {
                try {
                    if (i7 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.IconCompatParcelizer = true;
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, bArr, 0, i6);
            this.PlaybackStateCompat += this.serializer;
            this.MediaSessionCompatQueueItem = 0;
            this.serializer = 0;
            while (i6 < i) {
                try {
                    int i8 = inputStream.read(bArr, i6, i - i6);
                    if (i8 == -1) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    this.PlaybackStateCompat += i8;
                    i6 += i8;
                } catch (InvalidProtocolBufferException e2) {
                    e2.IconCompatParcelizer = true;
                    throw e2;
                }
            }
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int MediaSessionCompatToken() {
            int i;
            int i2 = this.MediaSessionCompatQueueItem;
            int i3 = this.serializer;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.IconCompatParcelizer;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.MediaSessionCompatQueueItem = i4;
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
                    this.MediaSessionCompatQueueItem = i5;
                    return i;
                }
            }
            return (int) r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }

        public final boolean ParcelableVolumeInfo(int i) throws IOException {
            InputStream inputStream = this.RatingCompat;
            int i2 = this.MediaSessionCompatQueueItem;
            int i3 = this.serializer;
            if (i2 + i <= i3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i4 = this.PlaybackStateCompat;
            if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.MediaBrowserCompatMediaItem) {
                byte[] bArr = this.IconCompatParcelizer;
                if (i2 > 0) {
                    if (i3 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                    }
                    this.PlaybackStateCompat += i2;
                    this.serializer -= i2;
                    this.MediaSessionCompatQueueItem = 0;
                }
                int i5 = this.serializer;
                try {
                    int i6 = inputStream.read(bArr, i5, Math.min(bArr.length - i5, (Integer.MAX_VALUE - this.PlaybackStateCompat) - i5));
                    if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(i6, inputStream.getClass());
                        return false;
                    }
                    if (i6 > 0) {
                        this.serializer += i6;
                        r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                        if (this.serializer >= i) {
                            return true;
                        }
                        return ParcelableVolumeInfo(i);
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.IconCompatParcelizer = true;
                    throw e;
                }
            }
            return false;
        }

        public final ArrayList RatingCompat(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, Fields.TransformOrigin);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.RatingCompat.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.MediaDescriptionCompat();
                    }
                    this.PlaybackStateCompat += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public final int r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() throws InvalidProtocolBufferException {
            int i = this.MediaSessionCompatQueueItem;
            if (this.serializer - i < 4) {
                MediaMetadataCompat(4);
                i = this.MediaSessionCompatQueueItem;
            }
            this.MediaSessionCompatQueueItem = i + 4;
            byte[] bArr = this.IconCompatParcelizer;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final void r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
            int i = this.serializer + this.MediaMetadataCompat;
            this.serializer = i;
            int i2 = this.PlaybackStateCompat + i;
            int i3 = this.MediaBrowserCompatMediaItem;
            if (i2 <= i3) {
                this.MediaMetadataCompat = 0;
                return;
            }
            int i4 = i2 - i3;
            this.MediaMetadataCompat = i4;
            this.serializer = i - i4;
        }

        public final long r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() throws InvalidProtocolBufferException {
            int i = this.MediaSessionCompatQueueItem;
            if (this.serializer - i < 8) {
                MediaMetadataCompat(8);
                i = this.MediaSessionCompatQueueItem;
            }
            this.MediaSessionCompatQueueItem = i + 8;
            byte[] bArr = this.IconCompatParcelizer;
            long j = bArr[i];
            return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public final long r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.MediaSessionCompatQueueItem;
            int i2 = this.serializer;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.IconCompatParcelizer;
                byte b = bArr[i];
                if (b >= 0) {
                    this.MediaSessionCompatQueueItem = i3;
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
                    this.MediaSessionCompatQueueItem = i4;
                    return j;
                }
            }
            return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int read() {
            return this.PlaybackStateCompat + this.MediaSessionCompatQueueItem;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int read(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            int i2 = this.PlaybackStateCompat + this.MediaSessionCompatQueueItem + i;
            int i3 = this.MediaBrowserCompatMediaItem;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            this.MediaBrowserCompatMediaItem = i2;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
            return i3;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void serializer(int i) {
            this.MediaBrowserCompatMediaItem = i;
            r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void IconCompatParcelizer(int i, getClipToOutline getcliptooutline, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            RemoteActionCompatParcelizer();
            this.write++;
            ((CompositionLocalsKtLocalHapticFeedback1) getcliptooutline).IconCompatParcelizer(this, getlocalprovidablescrollcaptureinprogress);
            RemoteActionCompatParcelizer((i << 3) | 4);
            this.write--;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String ComponentActivity() throws InvalidProtocolBufferException {
            int iMediaSessionCompatToken = MediaSessionCompatToken();
            byte[] bArr = this.IconCompatParcelizer;
            if (iMediaSessionCompatToken > 0) {
                int i = this.serializer;
                int i2 = this.MediaSessionCompatQueueItem;
                if (iMediaSessionCompatToken <= i - i2) {
                    String str = new String(bArr, i2, iMediaSessionCompatToken, CompositionLocalsKtLocalWindowInfo1.serializer);
                    this.MediaSessionCompatQueueItem += iMediaSessionCompatToken;
                    return str;
                }
            }
            if (iMediaSessionCompatToken == 0) {
                return "";
            }
            if (iMediaSessionCompatToken < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            if (iMediaSessionCompatToken > this.serializer) {
                return new String(MediaBrowserCompatMediaItem(iMediaSessionCompatToken), CompositionLocalsKtLocalWindowInfo1.serializer);
            }
            MediaMetadataCompat(iMediaSessionCompatToken);
            String str2 = new String(bArr, this.MediaSessionCompatQueueItem, iMediaSessionCompatToken, CompositionLocalsKtLocalWindowInfo1.serializer);
            this.MediaSessionCompatQueueItem += iMediaSessionCompatToken;
            return str2;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final ClipboardExtensions_androidKt MediaBrowserCompatMediaItem() throws IOException {
            int iMediaSessionCompatToken = MediaSessionCompatToken();
            int i = this.serializer;
            int i2 = this.MediaSessionCompatQueueItem;
            byte[] bArr = this.IconCompatParcelizer;
            if (iMediaSessionCompatToken <= i - i2 && iMediaSessionCompatToken > 0) {
                ClipboardExtensions_androidKt clipboardExtensions_androidKt = getClipMetadata.read(bArr, i2, iMediaSessionCompatToken);
                this.MediaSessionCompatQueueItem += iMediaSessionCompatToken;
                return clipboardExtensions_androidKt;
            }
            if (iMediaSessionCompatToken == 0) {
                return getClipMetadata.serializer;
            }
            if (iMediaSessionCompatToken < 0) {
                throw InvalidProtocolBufferException.MediaMetadataCompat();
            }
            byte[] bArrMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(iMediaSessionCompatToken);
            if (bArrMediaSessionCompatQueueItem != null) {
                return getClipMetadata.read(bArrMediaSessionCompatQueueItem, 0, bArrMediaSessionCompatQueueItem.length);
            }
            int i3 = this.MediaSessionCompatQueueItem;
            int i4 = this.serializer;
            int length = i4 - i3;
            this.PlaybackStateCompat += i4;
            this.MediaSessionCompatQueueItem = 0;
            this.serializer = 0;
            ArrayList<byte[]> arrayListRatingCompat = RatingCompat(iMediaSessionCompatToken - length);
            byte[] bArr2 = new byte[iMediaSessionCompatToken];
            System.arraycopy(bArr, i3, bArr2, 0, length);
            for (byte[] bArr3 : arrayListRatingCompat) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ClipboardExtensions_androidKt clipboardExtensions_androidKt2 = getClipMetadata.serializer;
            return new ClipboardExtensions_androidKt(bArr2);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final double MediaMetadataCompat() {
            return Double.longBitsToDouble(r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final float MediaSessionCompatResultReceiverWrapper() {
            return Float.intBitsToFloat(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
        }

        @Override // com.google.protobuf.CodedInputStream
        public final String ResultReceiver() throws IOException {
            int iMediaSessionCompatToken = MediaSessionCompatToken();
            int i = this.MediaSessionCompatQueueItem;
            int i2 = this.serializer;
            byte[] bArrMediaBrowserCompatMediaItem = this.IconCompatParcelizer;
            if (iMediaSessionCompatToken <= i2 - i && iMediaSessionCompatToken > 0) {
                this.MediaSessionCompatQueueItem = i + iMediaSessionCompatToken;
            } else {
                if (iMediaSessionCompatToken == 0) {
                    return "";
                }
                if (iMediaSessionCompatToken < 0) {
                    throw InvalidProtocolBufferException.MediaMetadataCompat();
                }
                i = 0;
                if (iMediaSessionCompatToken <= i2) {
                    MediaMetadataCompat(iMediaSessionCompatToken);
                    this.MediaSessionCompatQueueItem = iMediaSessionCompatToken;
                } else {
                    bArrMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(iMediaSessionCompatToken);
                }
            }
            return IndirectPointerNavigationGestureDetector.write.RemoteActionCompatParcelizer(bArrMediaBrowserCompatMediaItem, i, iMediaSessionCompatToken);
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
        public final void serializer(getClipToOutline getcliptooutline, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress) throws InvalidProtocolBufferException {
            int iMediaSessionCompatToken = MediaSessionCompatToken();
            RemoteActionCompatParcelizer();
            int i = read(iMediaSessionCompatToken);
            this.write++;
            ((CompositionLocalsKtLocalHapticFeedback1) getcliptooutline).IconCompatParcelizer(this, getlocalprovidablescrollcaptureinprogress);
            RemoteActionCompatParcelizer(0);
            this.write--;
            if (write() != 0) {
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            serializer(i);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final void RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
            if (this.MediaDescriptionCompat != i) {
                throw InvalidProtocolBufferException.write();
            }
        }

        public StreamDecoder(InputStream inputStream) {
            CompositionLocalsKtLocalWindowInfo1.read(inputStream, "input");
            this.RatingCompat = inputStream;
            this.IconCompatParcelizer = new byte[Fields.TransformOrigin];
            this.serializer = 0;
            this.MediaSessionCompatQueueItem = 0;
            this.PlaybackStateCompat = 0;
        }

        public final byte[] MediaBrowserCompatMediaItem(int i) throws IOException {
            byte[] bArrMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(i);
            if (bArrMediaSessionCompatQueueItem != null) {
                return bArrMediaSessionCompatQueueItem;
            }
            int i2 = this.MediaSessionCompatQueueItem;
            int i3 = this.serializer;
            int length = i3 - i2;
            this.PlaybackStateCompat += i3;
            this.MediaSessionCompatQueueItem = 0;
            this.serializer = 0;
            ArrayList<byte[]> arrayListRatingCompat = RatingCompat(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.IconCompatParcelizer, i2, bArr, 0, length);
            for (byte[] bArr2 : arrayListRatingCompat) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() throws InvalidProtocolBufferException {
            if (IconCompatParcelizer()) {
                this.MediaDescriptionCompat = 0;
                return 0;
            }
            int iMediaSessionCompatToken = MediaSessionCompatToken();
            this.MediaDescriptionCompat = iMediaSessionCompatToken;
            if ((iMediaSessionCompatToken >>> 3) != 0) {
                return iMediaSessionCompatToken;
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }

        public final long r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.MediaSessionCompatQueueItem == this.serializer) {
                    MediaMetadataCompat(1);
                }
                int i2 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i2 + 1;
                byte b = this.IconCompatParcelizer[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.read();
        }

        public final void MediaMetadataCompat(int i) throws InvalidProtocolBufferException {
            if (ParcelableVolumeInfo(i)) {
                return;
            }
            if (i <= (Integer.MAX_VALUE - this.PlaybackStateCompat) - this.MediaSessionCompatQueueItem) {
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        @Override // com.google.protobuf.CodedInputStream
        public final int write() {
            int i = this.MediaBrowserCompatMediaItem;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.PlaybackStateCompat + this.MediaSessionCompatQueueItem);
        }

        @Override // com.google.protobuf.CodedInputStream
        public final boolean IconCompatParcelizer(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    MediaDescriptionCompat(8);
                    return true;
                }
                if (i2 == 2) {
                    MediaDescriptionCompat(MediaSessionCompatToken());
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
                    MediaDescriptionCompat(4);
                    return true;
                }
                throw InvalidProtocolBufferException.serializer();
            }
            int i4 = this.serializer;
            int i5 = this.MediaSessionCompatQueueItem;
            byte[] bArr = this.IconCompatParcelizer;
            if (i4 - i5 >= 10) {
                while (i3 < 10) {
                    int i6 = this.MediaSessionCompatQueueItem;
                    this.MediaSessionCompatQueueItem = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.read();
            }
            while (i3 < 10) {
                if (this.MediaSessionCompatQueueItem == this.serializer) {
                    MediaMetadataCompat(1);
                }
                int i7 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i7 + 1;
                if (bArr[i7] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.read();
            return true;
        }
    }

    public static long read(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int write(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public abstract String ComponentActivity();

    public abstract void IconCompatParcelizer(int i, getClipToOutline getcliptooutline, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress);

    public abstract boolean IconCompatParcelizer();

    public abstract boolean IconCompatParcelizer(int i);

    public abstract ClipboardExtensions_androidKt MediaBrowserCompatMediaItem();

    public abstract long MediaDescriptionCompat();

    public abstract double MediaMetadataCompat();

    public abstract int MediaSessionCompatQueueItem();

    public abstract float MediaSessionCompatResultReceiverWrapper();

    public abstract int MediaSessionCompatToken();

    public abstract int ParcelableVolumeInfo();

    public abstract int PlaybackStateCompat();

    public abstract long PlaybackStateCompatCustomAction();

    public abstract int RatingCompat();

    public abstract void RemoteActionCompatParcelizer(int i);

    public abstract String ResultReceiver();

    public abstract int r8lambda54BeH8ZsBru0CXI2CCSP2syNys();

    public abstract long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();

    public abstract long r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();

    public abstract int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();

    public abstract int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();

    public abstract long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();

    public abstract int read();

    public abstract int read(int i);

    public abstract void serializer(int i);

    public abstract void serializer(getClipToOutline getcliptooutline, getLocalProvidableScrollCaptureInProgress getlocalprovidablescrollcaptureinprogress);

    public abstract boolean serializer();

    public abstract int write();

    public static CodedInputStream IconCompatParcelizer(InputStream inputStream) {
        if (inputStream != null) {
            return new StreamDecoder(inputStream);
        }
        byte[] bArr = CompositionLocalsKtLocalWindowInfo1.IconCompatParcelizer;
        return serializer(bArr, 0, bArr.length, false);
    }

    public final void RemoteActionCompatParcelizer() throws InvalidProtocolBufferException {
        if (this.write >= this.RemoteActionCompatParcelizer) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() throws InvalidProtocolBufferException {
        boolean zIconCompatParcelizer;
        do {
            int iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0) {
                return;
            }
            RemoteActionCompatParcelizer();
            this.write++;
            zIconCompatParcelizer = IconCompatParcelizer(iR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
            this.write--;
        } while (zIconCompatParcelizer);
    }

    public static int IconCompatParcelizer(int i, InputStream inputStream) throws IOException {
        if ((i & Fields.SpotShadowColor) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & Fields.SpotShadowColor) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.MediaDescriptionCompat();
            }
            if ((i5 & Fields.SpotShadowColor) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.read();
    }

    public static ComposeViewContent1 serializer(byte[] bArr, int i, int i2, boolean z) {
        ComposeViewContent1 composeViewContent1 = new ComposeViewContent1(bArr, i, i2, z);
        try {
            composeViewContent1.read(i2);
            return composeViewContent1;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
