package com.google.crypto.tink.shaded.protobuf;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import o.getMinimumTouchTargetSizeMYxV2XQ;
import o.getNextChildPlaceOrderui;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setOnAttachui;
import o.setOnDetachui;
import o.setOuterToInnerOffsetDirtyui;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStream$StreamDecoder extends setOuterToInnerOffsetDirtyui {
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final ByteArrayInputStream MediaSessionCompatQueueItem;
    public int RatingCompat = Integer.MAX_VALUE;
    public int serializer;
    public final byte[] write;

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int MediaBrowserCompatMediaItem() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int MediaDescriptionCompat() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long MediaSessionCompatQueueItem() {
        return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long ParcelableVolumeInfo() {
        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long PlaybackStateCompat() {
        return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int PlaybackStateCompatCustomAction() {
        return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int RatingCompat() {
        return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long ResultReceiver() {
        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final boolean read() {
        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() != 0;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final void IconCompatParcelizer(int i) {
        this.RatingCompat = i;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
    }

    public final byte[] MediaBrowserCompatMediaItem(int i) throws IOException {
        if (i == 0) {
            return getMinimumTouchTargetSizeMYxV2XQ.IconCompatParcelizer;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.write();
        }
        int i2 = this.MediaMetadataCompat;
        int i3 = this.MediaDescriptionCompat;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.RatingCompat;
        if (i4 > i5) {
            MediaDescriptionCompat((i5 - i2) - i3);
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        int i6 = this.serializer - i3;
        int i7 = i - i6;
        ByteArrayInputStream byteArrayInputStream = this.MediaSessionCompatQueueItem;
        if (i7 >= 4096) {
            try {
                if (i7 > byteArrayInputStream.available()) {
                    return null;
                }
            } catch (InvalidProtocolBufferException e) {
                e.read = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.write, this.MediaDescriptionCompat, bArr, 0, i6);
        this.MediaMetadataCompat += this.serializer;
        this.MediaDescriptionCompat = 0;
        this.serializer = 0;
        while (i6 < i) {
            try {
                int i8 = byteArrayInputStream.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                this.MediaMetadataCompat += i8;
                i6 += i8;
            } catch (InvalidProtocolBufferException e2) {
                e2.read = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final void MediaDescriptionCompat(int i) throws InvalidProtocolBufferException {
        int i2 = this.serializer;
        int i3 = this.MediaDescriptionCompat;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.MediaDescriptionCompat = i3 + i;
            return;
        }
        ByteArrayInputStream byteArrayInputStream = this.MediaSessionCompatQueueItem;
        if (i < 0) {
            throw InvalidProtocolBufferException.write();
        }
        int i5 = this.MediaMetadataCompat;
        int i6 = i5 + i3;
        int i7 = this.RatingCompat;
        if (i6 + i > i7) {
            MediaDescriptionCompat((i7 - i5) - i3);
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        this.MediaMetadataCompat = i6;
        this.serializer = 0;
        this.MediaDescriptionCompat = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                try {
                    long jSkip = byteArrayInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(byteArrayInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i4 += (int) jSkip;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.read = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.MediaMetadataCompat += i4;
                r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
                throw th;
            }
        }
        this.MediaMetadataCompat += i4;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        if (i4 >= i) {
            return;
        }
        int i8 = this.serializer;
        int i9 = i8 - this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = i8;
        RatingCompat(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.serializer;
            if (i10 <= i11) {
                this.MediaDescriptionCompat = i10;
                return;
            } else {
                i9 += i11;
                this.MediaDescriptionCompat = i11;
                RatingCompat(1);
            }
        }
    }

    public final ArrayList MediaMetadataCompat(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, Fields.TransformOrigin);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.MediaSessionCompatQueueItem.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                this.MediaMetadataCompat += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final boolean MediaSessionCompatQueueItem(int i) throws IOException {
        ByteArrayInputStream byteArrayInputStream = this.MediaSessionCompatQueueItem;
        int i2 = this.MediaDescriptionCompat;
        int i3 = this.serializer;
        if (i2 + i <= i3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i4 = this.MediaMetadataCompat;
        if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.RatingCompat) {
            byte[] bArr = this.write;
            if (i2 > 0) {
                if (i3 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                this.MediaMetadataCompat += i2;
                this.serializer -= i2;
                this.MediaDescriptionCompat = 0;
            }
            int i5 = this.serializer;
            try {
                int i6 = byteArrayInputStream.read(bArr, i5, Math.min(bArr.length - i5, (Integer.MAX_VALUE - this.MediaMetadataCompat) - i5));
                if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(i6, byteArrayInputStream.getClass());
                    return false;
                }
                if (i6 > 0) {
                    this.serializer += i6;
                    r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
                    if (this.serializer >= i) {
                        return true;
                    }
                    return MediaSessionCompatQueueItem(i);
                }
            } catch (InvalidProtocolBufferException e) {
                e.read = true;
                throw e;
            }
        }
        return false;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaDescriptionCompat == this.serializer && !MediaSessionCompatQueueItem(1);
    }

    public final long r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.MediaDescriptionCompat;
        int i2 = this.serializer;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.write;
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
        return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
    }

    public final int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() throws InvalidProtocolBufferException {
        int i = this.MediaDescriptionCompat;
        if (this.serializer - i < 4) {
            RatingCompat(4);
            i = this.MediaDescriptionCompat;
        }
        this.MediaDescriptionCompat = i + 4;
        byte[] bArr = this.write;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() throws InvalidProtocolBufferException {
        int i = this.MediaDescriptionCompat;
        if (this.serializer - i < 8) {
            RatingCompat(8);
            i = this.MediaDescriptionCompat;
        }
        this.MediaDescriptionCompat = i + 8;
        byte[] bArr = this.write;
        long j = bArr[i];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i;
        int i2 = this.MediaDescriptionCompat;
        int i3 = this.serializer;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.write;
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
        return (int) r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
    }

    public final void r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() {
        int i = this.serializer + this.IconCompatParcelizer;
        this.serializer = i;
        int i2 = this.MediaMetadataCompat + i;
        int i3 = this.RatingCompat;
        if (i2 <= i3) {
            this.IconCompatParcelizer = 0;
            return;
        }
        int i4 = i2 - i3;
        this.IconCompatParcelizer = i4;
        this.serializer = i - i4;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int write() {
        return this.MediaMetadataCompat + this.MediaDescriptionCompat;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int write(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.write();
        }
        int i2 = this.MediaMetadataCompat + this.MediaDescriptionCompat + i;
        int i3 = this.RatingCompat;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        this.RatingCompat = i2;
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        return i3;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final String ComponentActivity() throws IOException {
        int iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        int i = this.MediaDescriptionCompat;
        int i2 = this.serializer;
        byte[] bArrRemoteActionCompatParcelizer = this.write;
        if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM <= i2 - i && iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM > 0) {
            this.MediaDescriptionCompat = i + iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        } else {
            if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == 0) {
                return "";
            }
            i = 0;
            if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM <= i2) {
                RatingCompat(iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
                this.MediaDescriptionCompat = iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            } else {
                bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
            }
        }
        return getNextChildPlaceOrderui.RemoteActionCompatParcelizer.serializer(bArrRemoteActionCompatParcelizer, i, iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final double IconCompatParcelizer() {
        return Double.longBitsToDouble(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final float MediaMetadataCompat() {
        return Float.intBitsToFloat(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8());
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long MediaSessionCompatResultReceiverWrapper() {
        return setOuterToInnerOffsetDirtyui.IconCompatParcelizer(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg());
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int MediaSessionCompatToken() {
        return setOuterToInnerOffsetDirtyui.read(r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() throws InvalidProtocolBufferException {
        int iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        byte[] bArr = this.write;
        if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM > 0) {
            int i = this.serializer;
            int i2 = this.MediaDescriptionCompat;
            if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM <= i - i2) {
                String str = new String(bArr, i2, iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, getMinimumTouchTargetSizeMYxV2XQ.write);
                this.MediaDescriptionCompat += iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                return str;
            }
        }
        if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == 0) {
            return "";
        }
        if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM > this.serializer) {
            return new String(RemoteActionCompatParcelizer(iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM), getMinimumTouchTargetSizeMYxV2XQ.write);
        }
        RatingCompat(iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        String str2 = new String(bArr, this.MediaDescriptionCompat, iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, getMinimumTouchTargetSizeMYxV2XQ.write);
        this.MediaDescriptionCompat += iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        return str2;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final setOnDetachui serializer() throws IOException {
        int iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        int i = this.serializer;
        int i2 = this.MediaDescriptionCompat;
        byte[] bArr = this.write;
        if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM <= i - i2 && iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM > 0) {
            setOnDetachui setondetachuiRemoteActionCompatParcelizer = setOnAttachui.RemoteActionCompatParcelizer(bArr, i2, iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
            this.MediaDescriptionCompat += iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            return setondetachuiRemoteActionCompatParcelizer;
        }
        if (iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM == 0) {
            return setOnAttachui.IconCompatParcelizer;
        }
        byte[] bArrMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        if (bArrMediaBrowserCompatMediaItem != null) {
            return setOnAttachui.RemoteActionCompatParcelizer(bArrMediaBrowserCompatMediaItem, 0, bArrMediaBrowserCompatMediaItem.length);
        }
        int i3 = this.MediaDescriptionCompat;
        int i4 = this.serializer;
        int length = i4 - i3;
        this.MediaMetadataCompat += i4;
        this.MediaDescriptionCompat = 0;
        this.serializer = 0;
        ArrayList<byte[]> arrayListMediaMetadataCompat = MediaMetadataCompat(iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM - length);
        byte[] bArr2 = new byte[iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM];
        System.arraycopy(bArr, i3, bArr2, 0, length);
        for (byte[] bArr3 : arrayListMediaMetadataCompat) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        setOnDetachui setondetachui = setOnAttachui.IconCompatParcelizer;
        return new setOnDetachui(bArr2);
    }

    public CodedInputStream$StreamDecoder(ByteArrayInputStream byteArrayInputStream) {
        Charset charset = getMinimumTouchTargetSizeMYxV2XQ.write;
        this.MediaSessionCompatQueueItem = byteArrayInputStream;
        this.write = new byte[Fields.TransformOrigin];
        this.serializer = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaMetadataCompat = 0;
    }

    public final byte[] RemoteActionCompatParcelizer(int i) throws IOException {
        byte[] bArrMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i);
        if (bArrMediaBrowserCompatMediaItem != null) {
            return bArrMediaBrowserCompatMediaItem;
        }
        int i2 = this.MediaDescriptionCompat;
        int i3 = this.serializer;
        int length = i3 - i2;
        this.MediaMetadataCompat += i3;
        this.MediaDescriptionCompat = 0;
        this.serializer = 0;
        ArrayList<byte[]> arrayListMediaMetadataCompat = MediaMetadataCompat(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.write, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListMediaMetadataCompat) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws InvalidProtocolBufferException {
        if (RemoteActionCompatParcelizer()) {
            this.MediaBrowserCompatMediaItem = 0;
            return 0;
        }
        int iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        this.MediaBrowserCompatMediaItem = iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if ((iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM >>> 3) != 0) {
            return iR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        throw InvalidProtocolBufferException.read();
    }

    public final long r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.MediaDescriptionCompat == this.serializer) {
                RatingCompat(1);
            }
            int i2 = this.MediaDescriptionCompat;
            this.MediaDescriptionCompat = i2 + 1;
            byte b = this.write[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.IconCompatParcelizer();
    }

    public final void RatingCompat(int i) throws InvalidProtocolBufferException {
        if (MediaSessionCompatQueueItem(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.MediaMetadataCompat) - this.MediaDescriptionCompat) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final void serializer(int i) throws InvalidProtocolBufferException {
        if (this.MediaBrowserCompatMediaItem != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }
}
