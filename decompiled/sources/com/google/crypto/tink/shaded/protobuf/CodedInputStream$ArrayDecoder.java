package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import o.getMinimumTouchTargetSizeMYxV2XQ;
import o.getNextChildPlaceOrderui;
import o.setOnAttachui;
import o.setOnDetachui;
import o.setOuterToInnerOffsetDirtyui;

/* JADX INFO: loaded from: classes2.dex */
public final class CodedInputStream$ArrayDecoder extends setOuterToInnerOffsetDirtyui {
    public final byte[] IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public final int MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int RatingCompat;
    public int serializer;
    public int write = Integer.MAX_VALUE;

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int MediaBrowserCompatMediaItem() {
        return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int MediaDescriptionCompat() {
        return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long MediaSessionCompatQueueItem() {
        return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long ParcelableVolumeInfo() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long PlaybackStateCompat() {
        return r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int PlaybackStateCompatCustomAction() {
        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int RatingCompat() {
        return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long ResultReceiver() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
        return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final boolean read() {
        return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() != 0;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final void IconCompatParcelizer(int i) {
        this.write = i;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaSessionCompatQueueItem == this.MediaBrowserCompatMediaItem;
    }

    public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
        int i;
        int i2 = this.MediaSessionCompatQueueItem;
        int i3 = this.MediaBrowserCompatMediaItem;
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
        return (int) r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    public final int r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() throws InvalidProtocolBufferException {
        int i = this.MediaSessionCompatQueueItem;
        if (this.MediaBrowserCompatMediaItem - i < 4) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        this.MediaSessionCompatQueueItem = i + 4;
        byte[] bArr = this.IconCompatParcelizer;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() throws InvalidProtocolBufferException {
        int i = this.MediaSessionCompatQueueItem;
        if (this.MediaBrowserCompatMediaItem - i < 8) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        this.MediaSessionCompatQueueItem = i + 8;
        byte[] bArr = this.IconCompatParcelizer;
        long j = bArr[i];
        return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.MediaSessionCompatQueueItem;
        int i2 = this.MediaBrowserCompatMediaItem;
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
        return r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    public final void r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() {
        int i = this.MediaBrowserCompatMediaItem + this.serializer;
        this.MediaBrowserCompatMediaItem = i;
        int i2 = i - this.MediaMetadataCompat;
        int i3 = this.write;
        if (i2 <= i3) {
            this.serializer = 0;
            return;
        }
        int i4 = i2 - i3;
        this.serializer = i4;
        this.MediaBrowserCompatMediaItem = i - i4;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int write() {
        return this.MediaSessionCompatQueueItem - this.MediaMetadataCompat;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int write(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.write();
        }
        int iWrite = write() + i;
        if (iWrite < 0) {
            throw InvalidProtocolBufferException.RatingCompat();
        }
        int i2 = this.write;
        if (iWrite > i2) {
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }
        this.write = iWrite;
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        return i2;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final double IconCompatParcelizer() {
        return Double.longBitsToDouble(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4());
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final float MediaMetadataCompat() {
        return Float.intBitsToFloat(r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg());
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final long MediaSessionCompatResultReceiverWrapper() {
        return setOuterToInnerOffsetDirtyui.IconCompatParcelizer(r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM());
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int MediaSessionCompatToken() {
        return setOuterToInnerOffsetDirtyui.read(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // o.setOuterToInnerOffsetDirtyui
    public final setOnDetachui serializer() throws InvalidProtocolBufferException {
        byte[] bArrCopyOfRange;
        int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        byte[] bArr = this.IconCompatParcelizer;
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.MediaSessionCompatQueueItem;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2) {
                setOnDetachui setondetachuiRemoteActionCompatParcelizer = setOnAttachui.RemoteActionCompatParcelizer(bArr, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                this.MediaSessionCompatQueueItem += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                return setondetachuiRemoteActionCompatParcelizer;
            }
        }
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
            return setOnAttachui.IconCompatParcelizer;
        }
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
            int i3 = this.MediaBrowserCompatMediaItem;
            int i4 = this.MediaSessionCompatQueueItem;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i3 - i4) {
                int i5 = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + i4;
                this.MediaSessionCompatQueueItem = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= 0) {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                    throw InvalidProtocolBufferException.write();
                }
                bArrCopyOfRange = getMinimumTouchTargetSizeMYxV2XQ.IconCompatParcelizer;
            }
        } else {
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= 0) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                throw InvalidProtocolBufferException.write();
            }
            bArrCopyOfRange = getMinimumTouchTargetSizeMYxV2XQ.IconCompatParcelizer;
        }
        setOnDetachui setondetachui = setOnAttachui.IconCompatParcelizer;
        return new setOnDetachui(bArrCopyOfRange);
    }

    public CodedInputStream$ArrayDecoder(byte[] bArr, int i, int i2, boolean z) {
        this.IconCompatParcelizer = bArr;
        this.MediaBrowserCompatMediaItem = i2 + i;
        this.MediaSessionCompatQueueItem = i;
        this.MediaMetadataCompat = i;
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final String ComponentActivity() throws InvalidProtocolBufferException {
        int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.MediaSessionCompatQueueItem;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2) {
                String strSerializer = getNextChildPlaceOrderui.RemoteActionCompatParcelizer.serializer(this.IconCompatParcelizer, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                this.MediaSessionCompatQueueItem += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                return strSerializer;
            }
        }
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
            return "";
        }
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= 0) {
            throw InvalidProtocolBufferException.write();
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final String r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() throws InvalidProtocolBufferException {
        int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.MediaSessionCompatQueueItem;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2) {
                String str = new String(this.IconCompatParcelizer, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, getMinimumTouchTargetSizeMYxV2XQ.write);
                this.MediaSessionCompatQueueItem += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                return str;
            }
        }
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
            return "";
        }
        if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < 0) {
            throw InvalidProtocolBufferException.write();
        }
        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() throws InvalidProtocolBufferException {
        if (RemoteActionCompatParcelizer()) {
            this.RatingCompat = 0;
            return 0;
        }
        int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        this.RatingCompat = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        if ((iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss >>> 3) != 0) {
            return iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        }
        throw InvalidProtocolBufferException.read();
    }

    public final long r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.MediaSessionCompatQueueItem;
            if (i2 != this.MediaBrowserCompatMediaItem) {
                this.MediaSessionCompatQueueItem = i2 + 1;
                byte b = this.IconCompatParcelizer[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
        }
        throw InvalidProtocolBufferException.IconCompatParcelizer();
    }

    @Override // o.setOuterToInnerOffsetDirtyui
    public final void serializer(int i) {
        if (this.RatingCompat != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }
}
