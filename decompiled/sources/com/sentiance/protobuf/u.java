package com.sentiance.protobuf;

import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import o.BrazeSdkAuthenticationErrorEvent;
import o.CardKey;
import o.DelayedInitializationAnalyticsBehavior;
import o.SimpleValueCallback;
import o.getErrorReason;
import o.getEventType;
import o.isFromOfflineStorage;
import o.r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA;
import o.r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {
    public v RemoteActionCompatParcelizer;
    public int read;

    public final class b extends u {
        public final byte[] IconCompatParcelizer;
        public int MediaDescriptionCompat;
        public int MediaMetadataCompat = Integer.MAX_VALUE;
        public final int MediaSessionCompatQueueItem;
        public int RatingCompat;
        public int serializer;
        public int write;

        @Override // com.sentiance.protobuf.u
        public final int ComponentActivity() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final long MediaDescriptionCompat() {
            return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean MediaSessionCompatResultReceiverWrapper() {
            return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() != 0;
        }

        @Override // com.sentiance.protobuf.u
        public final int PlaybackStateCompatCustomAction() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final long ResultReceiver() {
            return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
            return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }

        @Override // com.sentiance.protobuf.u
        public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
            return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
            return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }

        @Override // com.sentiance.protobuf.u
        public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
            return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }

        @Override // com.sentiance.protobuf.u
        public final int serializer() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final int IconCompatParcelizer(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem() + i;
            if (iMediaBrowserCompatMediaItem < 0) {
                throw InvalidProtocolBufferException.RatingCompat();
            }
            int i2 = this.MediaMetadataCompat;
            if (iMediaBrowserCompatMediaItem > i2) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.MediaMetadataCompat = iMediaBrowserCompatMediaItem;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            return i2;
        }

        @Override // com.sentiance.protobuf.u
        public final int MediaBrowserCompatMediaItem() {
            return this.RatingCompat - this.MediaSessionCompatQueueItem;
        }

        public final void MediaMetadataCompat(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                int i2 = this.write;
                int i3 = this.RatingCompat;
                if (i <= i2 - i3) {
                    this.RatingCompat = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            throw InvalidProtocolBufferException.serializer();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean ParcelableVolumeInfo() {
            return this.RatingCompat == this.write;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x006b A[PHI: r5
  0x006b: PHI (r5v2 int) = (r5v1 int), (r5v4 int) binds: [B:25:0x004a, B:29:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.sentiance.protobuf.u
        public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
            int i;
            int i2 = this.RatingCompat;
            int i3 = this.write;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.IconCompatParcelizer;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.RatingCompat = i4;
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
                                i5 = i9;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                if (b2 < 0) {
                                    int i11 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i11] < 0) {
                                            i11 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i11] < 0) {
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i2 + 10;
                                                    }
                                                }
                                            } else {
                                                i7 = i11;
                                            }
                                        }
                                    } else {
                                        i7 = i11;
                                    }
                                }
                                i = ((b2 << 28) ^ i10) ^ 266354560;
                            }
                        }
                        i5 = i7;
                    }
                    this.RatingCompat = i5;
                    return i;
                }
            }
            return (int) r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }

        public final void r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
            int i = this.write + this.serializer;
            this.write = i;
            int i2 = i - this.MediaSessionCompatQueueItem;
            int i3 = this.MediaMetadataCompat;
            if (i2 <= i3) {
                this.serializer = 0;
                return;
            }
            int i4 = i2 - i3;
            this.serializer = i4;
            this.write = i - i4;
        }

        public final long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.RatingCompat;
            int i2 = this.write;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.IconCompatParcelizer;
                byte b = bArr[i];
                if (b >= 0) {
                    this.RatingCompat = i3;
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
                    this.RatingCompat = i4;
                    return j;
                }
            }
            return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }

        public final int r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() throws InvalidProtocolBufferException {
            int i = this.RatingCompat;
            if (this.write - i < 4) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.RatingCompat = i + 4;
            byte[] bArr = this.IconCompatParcelizer;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() throws InvalidProtocolBufferException {
            int i = this.RatingCompat;
            if (this.write - i < 8) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.RatingCompat = i + 8;
            byte[] bArr = this.IconCompatParcelizer;
            long j = bArr[i];
            return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.sentiance.protobuf.u
        public final long IconCompatParcelizer() {
            return u.IconCompatParcelizer(r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28());
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // com.sentiance.protobuf.u
        public final ByteString MediaSessionCompatToken() throws InvalidProtocolBufferException {
            byte[] bArrCopyOfRange;
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            byte[] bArr = this.IconCompatParcelizer;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                int i = this.write;
                int i2 = this.RatingCompat;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2) {
                    ByteString byteStringWrite = ByteString.write(bArr, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    this.RatingCompat += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    return byteStringWrite;
                }
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return ByteString.RemoteActionCompatParcelizer;
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                int i3 = this.write;
                int i4 = this.RatingCompat;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i3 - i4) {
                    int i5 = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss + i4;
                    this.RatingCompat = i5;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
                } else {
                    if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= 0) {
                        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                    }
                    if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                        throw InvalidProtocolBufferException.serializer();
                    }
                    bArrCopyOfRange = isFromOfflineStorage.serializer;
                }
            } else {
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= 0) {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                    throw InvalidProtocolBufferException.serializer();
                }
                bArrCopyOfRange = isFromOfflineStorage.serializer;
            }
            ByteString byteString = ByteString.RemoteActionCompatParcelizer;
            return new ByteString.LiteralByteString(bArrCopyOfRange);
        }

        @Override // com.sentiance.protobuf.u
        public final double PlaybackStateCompat() {
            return Double.longBitsToDouble(r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0());
        }

        @Override // com.sentiance.protobuf.u
        public final float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
            return Float.intBitsToFloat(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ());
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
            return u.serializer(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        }

        @Override // com.sentiance.protobuf.u
        public final void read(r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            RatingCompat();
            int iIconCompatParcelizer = IconCompatParcelizer(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            this.read++;
            ((CardKey) r8lambdaxy_za9fysiz3bnvgpaidnjd_aig).write(this, delayedInitializationAnalyticsBehavior);
            RemoteActionCompatParcelizer(0);
            this.read--;
            if (MediaSessionCompatQueueItem() != 0) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            write(iIconCompatParcelizer);
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            this.IconCompatParcelizer = bArr;
            this.write = i2 + i;
            this.RatingCompat = i;
            this.MediaSessionCompatQueueItem = i;
        }

        @Override // com.sentiance.protobuf.u
        public final String RemoteActionCompatParcelizer() throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                int i = this.write;
                int i2 = this.RatingCompat;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2) {
                    String str = new String(this.IconCompatParcelizer, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, isFromOfflineStorage.read);
                    this.RatingCompat += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    return str;
                }
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return "";
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }

        @Override // com.sentiance.protobuf.u
        public final String write() throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                int i = this.write;
                int i2 = this.RatingCompat;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2) {
                    String strWrite = getErrorReason.read.write(this.IconCompatParcelizer, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    this.RatingCompat += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    return strWrite;
                }
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return "";
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }

        public final long r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                int i2 = this.RatingCompat;
                if (i2 != this.write) {
                    this.RatingCompat = i2 + 1;
                    byte b = this.IconCompatParcelizer[i2];
                    j |= ((long) (b & 127)) << i;
                    if ((b & 128) == 0) {
                        return j;
                    }
                } else {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }

        @Override // com.sentiance.protobuf.u
        public final int read() throws InvalidProtocolBufferException {
            if (ParcelableVolumeInfo()) {
                this.MediaDescriptionCompat = 0;
                return 0;
            }
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            this.MediaDescriptionCompat = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if ((iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss >>> 3) != 0) {
                return iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            }
            throw InvalidProtocolBufferException.write();
        }

        @Override // com.sentiance.protobuf.u
        public final int MediaSessionCompatQueueItem() {
            int i = this.MediaMetadataCompat;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - MediaBrowserCompatMediaItem();
        }

        @Override // com.sentiance.protobuf.u
        public final void write(int i) {
            this.MediaMetadataCompat = i;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean read(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    MediaMetadataCompat(8);
                    return true;
                }
                if (i2 == 2) {
                    MediaMetadataCompat(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
                    return true;
                }
                if (i2 == 3) {
                    MediaMetadataCompat();
                    RemoteActionCompatParcelizer(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 == 5) {
                    MediaMetadataCompat(4);
                    return true;
                }
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int i4 = this.write;
            int i5 = this.RatingCompat;
            byte[] bArr = this.IconCompatParcelizer;
            if (i4 - i5 >= 10) {
                while (i3 < 10) {
                    int i6 = this.RatingCompat;
                    this.RatingCompat = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            while (i3 < 10) {
                int i7 = this.RatingCompat;
                if (i7 != this.write) {
                    this.RatingCompat = i7 + 1;
                    if (bArr[i7] < 0) {
                        i3++;
                    }
                } else {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            return true;
        }

        @Override // com.sentiance.protobuf.u
        public final void RemoteActionCompatParcelizer(int i, r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            RatingCompat();
            this.read++;
            ((CardKey) r8lambdaxy_za9fysiz3bnvgpaidnjd_aig).write(this, delayedInitializationAnalyticsBehavior);
            RemoteActionCompatParcelizer((i << 3) | 4);
            this.read--;
        }

        @Override // com.sentiance.protobuf.u
        public final void RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
            if (this.MediaDescriptionCompat != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }
    }

    public final class d extends u {
        public final InputStream IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem;
        public int MediaDescriptionCompat;
        public int MediaMetadataCompat = Integer.MAX_VALUE;
        public int MediaSessionCompatQueueItem;
        public int RatingCompat;
        public final byte[] serializer;
        public int write;

        @Override // com.sentiance.protobuf.u
        public final int ComponentActivity() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final long MediaDescriptionCompat() {
            return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean MediaSessionCompatResultReceiverWrapper() {
            return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() != 0;
        }

        @Override // com.sentiance.protobuf.u
        public final long ResultReceiver() {
            return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }

        @Override // com.sentiance.protobuf.u
        public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
            return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
            return r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        }

        @Override // com.sentiance.protobuf.u
        public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
            return r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        }

        @Override // com.sentiance.protobuf.u
        public final int serializer() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final int IconCompatParcelizer(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            int i2 = this.MediaDescriptionCompat + this.MediaSessionCompatQueueItem + i;
            int i3 = this.MediaMetadataCompat;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.MediaMetadataCompat = i2;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            return i3;
        }

        @Override // com.sentiance.protobuf.u
        public final int MediaBrowserCompatMediaItem() {
            return this.MediaDescriptionCompat + this.MediaSessionCompatQueueItem;
        }

        public final byte[] MediaDescriptionCompat(int i) throws IOException {
            if (i == 0) {
                return isFromOfflineStorage.serializer;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            int i2 = this.MediaDescriptionCompat;
            int i3 = this.MediaSessionCompatQueueItem;
            int i4 = i2 + i3 + i;
            if (i4 - Integer.MAX_VALUE > 0) {
                throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
            }
            int i5 = this.MediaMetadataCompat;
            if (i4 > i5) {
                MediaSessionCompatQueueItem((i5 - i2) - i3);
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            int i6 = this.write - i3;
            int i7 = i - i6;
            InputStream inputStream = this.IconCompatParcelizer;
            if (i7 >= 4096) {
                try {
                    if (i7 > inputStream.available()) {
                        return null;
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.MediaSessionCompatQueueItem();
                    throw e;
                }
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.serializer, this.MediaSessionCompatQueueItem, bArr, 0, i6);
            this.MediaDescriptionCompat += this.write;
            this.MediaSessionCompatQueueItem = 0;
            this.write = 0;
            while (i6 < i) {
                try {
                    int i8 = inputStream.read(bArr, i6, i - i6);
                    if (i8 == -1) {
                        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                    }
                    this.MediaDescriptionCompat += i8;
                    i6 += i8;
                } catch (InvalidProtocolBufferException e2) {
                    e2.MediaSessionCompatQueueItem();
                    throw e2;
                }
            }
            return bArr;
        }

        public final void MediaSessionCompatQueueItem(int i) throws InvalidProtocolBufferException {
            int i2 = this.write;
            int i3 = this.MediaSessionCompatQueueItem;
            int i4 = i2 - i3;
            if (i <= i4 && i >= 0) {
                this.MediaSessionCompatQueueItem = i3 + i;
                return;
            }
            InputStream inputStream = this.IconCompatParcelizer;
            if (i < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            int i5 = this.MediaDescriptionCompat;
            int i6 = i5 + i3;
            int i7 = this.MediaMetadataCompat;
            if (i6 + i > i7) {
                MediaSessionCompatQueueItem((i7 - i5) - i3);
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.MediaDescriptionCompat = i6;
            this.write = 0;
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
                        e.MediaSessionCompatQueueItem();
                        throw e;
                    }
                } catch (Throwable th) {
                    this.MediaDescriptionCompat += i4;
                    r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    throw th;
                }
            }
            this.MediaDescriptionCompat += i4;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (i4 >= i) {
                return;
            }
            int i8 = this.write;
            int i9 = i8 - this.MediaSessionCompatQueueItem;
            this.MediaSessionCompatQueueItem = i8;
            MediaBrowserCompatMediaItem(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.write;
                if (i10 <= i11) {
                    this.MediaSessionCompatQueueItem = i10;
                    return;
                } else {
                    i9 += i11;
                    this.MediaSessionCompatQueueItem = i11;
                    MediaBrowserCompatMediaItem(1);
                }
            }
        }

        public final boolean MediaSessionCompatToken(int i) throws IOException {
            InputStream inputStream = this.IconCompatParcelizer;
            int i2 = this.MediaSessionCompatQueueItem;
            int i3 = this.write;
            if (i2 + i <= i3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m(i, "refillBuffer() called when ", " bytes were already available in buffer"));
                return false;
            }
            int i4 = this.MediaDescriptionCompat;
            if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.MediaMetadataCompat) {
                byte[] bArr = this.serializer;
                if (i2 > 0) {
                    if (i3 > i2) {
                        System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                    }
                    this.MediaDescriptionCompat += i2;
                    this.write -= i2;
                    this.MediaSessionCompatQueueItem = 0;
                }
                int i5 = this.write;
                try {
                    int i6 = inputStream.read(bArr, i5, Math.min(bArr.length - i5, (Integer.MAX_VALUE - this.MediaDescriptionCompat) - i5));
                    if (i6 == 0 || i6 < -1 || i6 > bArr.length) {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(i6, inputStream.getClass());
                        return false;
                    }
                    if (i6 > 0) {
                        this.write += i6;
                        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (this.write >= i) {
                            return true;
                        }
                        return MediaSessionCompatToken(i);
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.MediaSessionCompatQueueItem();
                    throw e;
                }
            }
            return false;
        }

        @Override // com.sentiance.protobuf.u
        public final boolean ParcelableVolumeInfo() {
            return this.MediaSessionCompatQueueItem == this.write && !MediaSessionCompatToken(1);
        }

        public final ArrayList RatingCompat(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, Fields.TransformOrigin);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.IconCompatParcelizer.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                    }
                    this.MediaDescriptionCompat += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x006b A[PHI: r5
  0x006b: PHI (r5v2 int) = (r5v1 int), (r5v4 int) binds: [B:25:0x004a, B:29:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.sentiance.protobuf.u
        public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
            int i;
            int i2 = this.MediaSessionCompatQueueItem;
            int i3 = this.write;
            if (i3 != i2) {
                int i4 = i2 + 1;
                byte[] bArr = this.serializer;
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
                                i5 = i9;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                if (b2 < 0) {
                                    int i11 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i11] < 0) {
                                            i11 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i11] < 0) {
                                                    if (bArr[i7] >= 0) {
                                                        i7 = i2 + 10;
                                                    }
                                                }
                                            } else {
                                                i7 = i11;
                                            }
                                        }
                                    } else {
                                        i7 = i11;
                                    }
                                }
                                i = ((b2 << 28) ^ i10) ^ 266354560;
                            }
                        }
                        i5 = i7;
                    }
                    this.MediaSessionCompatQueueItem = i5;
                    return i;
                }
            }
            return (int) r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }

        public final void r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
            int i = this.write + this.RatingCompat;
            this.write = i;
            int i2 = this.MediaDescriptionCompat + i;
            int i3 = this.MediaMetadataCompat;
            if (i2 <= i3) {
                this.RatingCompat = 0;
                return;
            }
            int i4 = i2 - i3;
            this.RatingCompat = i4;
            this.write = i - i4;
        }

        public final long r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() {
            long j;
            long j2;
            long j3;
            long j4;
            int i = this.MediaSessionCompatQueueItem;
            int i2 = this.write;
            if (i2 != i) {
                int i3 = i + 1;
                byte[] bArr = this.serializer;
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

        public final int r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() throws InvalidProtocolBufferException {
            int i = this.MediaSessionCompatQueueItem;
            if (this.write - i < 4) {
                MediaBrowserCompatMediaItem(4);
                i = this.MediaSessionCompatQueueItem;
            }
            this.MediaSessionCompatQueueItem = i + 4;
            byte[] bArr = this.serializer;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ() throws InvalidProtocolBufferException {
            int i = this.MediaSessionCompatQueueItem;
            if (this.write - i < 8) {
                MediaBrowserCompatMediaItem(8);
                i = this.MediaSessionCompatQueueItem;
            }
            this.MediaSessionCompatQueueItem = i + 8;
            byte[] bArr = this.serializer;
            long j = bArr[i];
            return ((((long) bArr[i + 7]) & 255) << 56) | (j & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.sentiance.protobuf.u
        public final long IconCompatParcelizer() {
            return u.IconCompatParcelizer(r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs());
        }

        @Override // com.sentiance.protobuf.u
        public final ByteString MediaSessionCompatToken() throws IOException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            int i = this.write;
            int i2 = this.MediaSessionCompatQueueItem;
            byte[] bArr = this.serializer;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2 && iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                ByteString byteStringWrite = ByteString.write(bArr, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                this.MediaSessionCompatQueueItem += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                return byteStringWrite;
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return ByteString.RemoteActionCompatParcelizer;
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            byte[] bArrMediaDescriptionCompat = MediaDescriptionCompat(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            if (bArrMediaDescriptionCompat != null) {
                return ByteString.write(bArrMediaDescriptionCompat, 0, bArrMediaDescriptionCompat.length);
            }
            int i3 = this.MediaSessionCompatQueueItem;
            int i4 = this.write;
            int length = i4 - i3;
            this.MediaDescriptionCompat += i4;
            this.MediaSessionCompatQueueItem = 0;
            this.write = 0;
            ArrayList<byte[]> arrayListRatingCompat = RatingCompat(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss - length);
            byte[] bArr2 = new byte[iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss];
            System.arraycopy(bArr, i3, bArr2, 0, length);
            for (byte[] bArr3 : arrayListRatingCompat) {
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            ByteString byteString = ByteString.RemoteActionCompatParcelizer;
            return new ByteString.LiteralByteString(bArr2);
        }

        @Override // com.sentiance.protobuf.u
        public final String RemoteActionCompatParcelizer() throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            byte[] bArr = this.serializer;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                int i = this.write;
                int i2 = this.MediaSessionCompatQueueItem;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i - i2) {
                    String str = new String(bArr, i2, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, isFromOfflineStorage.read);
                    this.MediaSessionCompatQueueItem += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    return str;
                }
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return "";
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > this.write) {
                return new String(MediaMetadataCompat(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss), isFromOfflineStorage.read);
            }
            MediaBrowserCompatMediaItem(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            String str2 = new String(bArr, this.MediaSessionCompatQueueItem, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, isFromOfflineStorage.read);
            this.MediaSessionCompatQueueItem += iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            return str2;
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
            return u.serializer(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        }

        @Override // com.sentiance.protobuf.u
        public final String write() throws IOException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            int i = this.MediaSessionCompatQueueItem;
            int i2 = this.write;
            byte[] bArrMediaMetadataCompat = this.serializer;
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i2 - i && iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                this.MediaSessionCompatQueueItem = i + iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            } else {
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                    return "";
                }
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < 0) {
                    throw InvalidProtocolBufferException.serializer();
                }
                i = 0;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= i2) {
                    MediaBrowserCompatMediaItem(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    this.MediaSessionCompatQueueItem = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                } else {
                    bArrMediaMetadataCompat = MediaMetadataCompat(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                }
            }
            return getErrorReason.read.write(bArrMediaMetadataCompat, i, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        }

        public d(InputStream inputStream) {
            isFromOfflineStorage.read(inputStream, "input");
            this.IconCompatParcelizer = inputStream;
            this.serializer = new byte[Fields.TransformOrigin];
            this.write = 0;
            this.MediaSessionCompatQueueItem = 0;
            this.MediaDescriptionCompat = 0;
        }

        public final byte[] MediaMetadataCompat(int i) throws IOException {
            byte[] bArrMediaDescriptionCompat = MediaDescriptionCompat(i);
            if (bArrMediaDescriptionCompat != null) {
                return bArrMediaDescriptionCompat;
            }
            int i2 = this.MediaSessionCompatQueueItem;
            int i3 = this.write;
            int length = i3 - i2;
            this.MediaDescriptionCompat += i3;
            this.MediaSessionCompatQueueItem = 0;
            this.write = 0;
            ArrayList<byte[]> arrayListRatingCompat = RatingCompat(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.serializer, i2, bArr, 0, length);
            for (byte[] bArr2 : arrayListRatingCompat) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final long r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                if (this.MediaSessionCompatQueueItem == this.write) {
                    MediaBrowserCompatMediaItem(1);
                }
                int i2 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i2 + 1;
                byte b = this.serializer[i2];
                j |= ((long) (b & 127)) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }

        @Override // com.sentiance.protobuf.u
        public final int read() throws InvalidProtocolBufferException {
            if (ParcelableVolumeInfo()) {
                this.MediaBrowserCompatMediaItem = 0;
                return 0;
            }
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            this.MediaBrowserCompatMediaItem = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if ((iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss >>> 3) != 0) {
                return iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            }
            throw InvalidProtocolBufferException.write();
        }

        public final void MediaBrowserCompatMediaItem(int i) throws InvalidProtocolBufferException {
            if (MediaSessionCompatToken(i)) {
                return;
            }
            if (i <= (Integer.MAX_VALUE - this.MediaDescriptionCompat) - this.MediaSessionCompatQueueItem) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }

        @Override // com.sentiance.protobuf.u
        public final int MediaSessionCompatQueueItem() {
            int i = this.MediaMetadataCompat;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.MediaDescriptionCompat + this.MediaSessionCompatQueueItem);
        }

        @Override // com.sentiance.protobuf.u
        public final void write(int i) {
            this.MediaMetadataCompat = i;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean read(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    MediaSessionCompatQueueItem(8);
                    return true;
                }
                if (i2 == 2) {
                    MediaSessionCompatQueueItem(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
                    return true;
                }
                if (i2 == 3) {
                    MediaMetadataCompat();
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
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            int i4 = this.write;
            int i5 = this.MediaSessionCompatQueueItem;
            byte[] bArr = this.serializer;
            if (i4 - i5 >= 10) {
                while (i3 < 10) {
                    int i6 = this.MediaSessionCompatQueueItem;
                    this.MediaSessionCompatQueueItem = i6 + 1;
                    if (bArr[i6] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            while (i3 < 10) {
                if (this.MediaSessionCompatQueueItem == this.write) {
                    MediaBrowserCompatMediaItem(1);
                }
                int i7 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i7 + 1;
                if (bArr[i7] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            return true;
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
            return r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        }

        @Override // com.sentiance.protobuf.u
        public final int PlaybackStateCompatCustomAction() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final void RemoteActionCompatParcelizer(int i, r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            RatingCompat();
            this.read++;
            ((CardKey) r8lambdaxy_za9fysiz3bnvgpaidnjd_aig).write(this, delayedInitializationAnalyticsBehavior);
            RemoteActionCompatParcelizer((i << 3) | 4);
            this.read--;
        }

        @Override // com.sentiance.protobuf.u
        public final void read(r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            RatingCompat();
            int iIconCompatParcelizer = IconCompatParcelizer(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            this.read++;
            ((CardKey) r8lambdaxy_za9fysiz3bnvgpaidnjd_aig).write(this, delayedInitializationAnalyticsBehavior);
            RemoteActionCompatParcelizer(0);
            this.read--;
            if (MediaSessionCompatQueueItem() == 0) {
                write(iIconCompatParcelizer);
                return;
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }

        @Override // com.sentiance.protobuf.u
        public final void RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
            if (this.MediaBrowserCompatMediaItem != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // com.sentiance.protobuf.u
        public final float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
            return Float.intBitsToFloat(r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw());
        }

        @Override // com.sentiance.protobuf.u
        public final double PlaybackStateCompat() {
            return Double.longBitsToDouble(r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ());
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public final class e extends u {
        public final ByteBuffer IconCompatParcelizer;
        public int MediaBrowserCompatMediaItem = Integer.MAX_VALUE;
        public final long MediaDescriptionCompat;
        public int MediaMetadataCompat;
        public int MediaSessionCompatQueueItem;
        public long RatingCompat;
        public long serializer;
        public final long write;

        @Override // com.sentiance.protobuf.u
        public final int ComponentActivity() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final long MediaDescriptionCompat() {
            return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean MediaSessionCompatResultReceiverWrapper() {
            return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() != 0;
        }

        @Override // com.sentiance.protobuf.u
        public final int PlaybackStateCompatCustomAction() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final long ResultReceiver() {
            return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambda54BeH8ZsBru0CXI2CCSP2syNys() {
            return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }

        @Override // com.sentiance.protobuf.u
        public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY() {
            return r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0();
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8() {
            return r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
        }

        @Override // com.sentiance.protobuf.u
        public final long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4() {
            return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        }

        @Override // com.sentiance.protobuf.u
        public final int serializer() {
            return r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
        }

        @Override // com.sentiance.protobuf.u
        public final int IconCompatParcelizer(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem() + i;
            int i2 = this.MediaBrowserCompatMediaItem;
            if (iMediaBrowserCompatMediaItem > i2) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.MediaBrowserCompatMediaItem = iMediaBrowserCompatMediaItem;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            return i2;
        }

        @Override // com.sentiance.protobuf.u
        public final int MediaBrowserCompatMediaItem() {
            return (int) (this.RatingCompat - this.MediaDescriptionCompat);
        }

        public final void MediaBrowserCompatMediaItem(int i) throws InvalidProtocolBufferException {
            if (i >= 0) {
                long j = this.serializer;
                long j2 = this.RatingCompat;
                if (i <= ((int) (j - j2))) {
                    this.RatingCompat = j2 + ((long) i);
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            throw InvalidProtocolBufferException.serializer();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean ParcelableVolumeInfo() {
            return this.RatingCompat == this.serializer;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0092 A[PHI: r5
  0x0092: PHI (r5v4 long) = (r5v3 long), (r5v7 long) binds: [B:24:0x0064, B:28:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x0094 A[PHI: r10
  0x0094: PHI (r10v4 long) = (r10v3 long), (r10v6 long) binds: [B:22:0x005b, B:26:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // com.sentiance.protobuf.u
        public final int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss() {
            int i;
            long j = this.RatingCompat;
            if (this.serializer != j) {
                long j2 = 1 + j;
                r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
                byte bRemoteActionCompatParcelizer = r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j);
                if (bRemoteActionCompatParcelizer >= 0) {
                    this.RatingCompat = j2;
                    return bRemoteActionCompatParcelizer;
                }
                if (this.serializer - j2 >= 9) {
                    long j3 = 2 + j;
                    int iRemoteActionCompatParcelizer = (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j2) << 7) ^ bRemoteActionCompatParcelizer;
                    if (iRemoteActionCompatParcelizer < 0) {
                        i = iRemoteActionCompatParcelizer ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int iRemoteActionCompatParcelizer2 = iRemoteActionCompatParcelizer ^ (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j3) << 14);
                        if (iRemoteActionCompatParcelizer2 >= 0) {
                            i = iRemoteActionCompatParcelizer2 ^ 16256;
                            j3 = j4;
                        } else {
                            j3 = j + 4;
                            int iRemoteActionCompatParcelizer3 = iRemoteActionCompatParcelizer2 ^ (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j4) << 21);
                            if (iRemoteActionCompatParcelizer3 < 0) {
                                i = (-2080896) ^ iRemoteActionCompatParcelizer3;
                            } else {
                                long j5 = 5 + j;
                                byte bRemoteActionCompatParcelizer2 = r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j3);
                                if (bRemoteActionCompatParcelizer2 < 0) {
                                    long j6 = 6 + j;
                                    if (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j5) < 0) {
                                        j5 = 7 + j;
                                        if (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j6) < 0) {
                                            j6 = 8 + j;
                                            if (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j5) < 0) {
                                                long j7 = 9 + j;
                                                if (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j6) >= 0) {
                                                    j3 = j7;
                                                } else if (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j7) >= 0) {
                                                    j3 = j + 10;
                                                }
                                            } else {
                                                j3 = j6;
                                            }
                                        } else {
                                            j3 = j5;
                                        }
                                    } else {
                                        j3 = j6;
                                    }
                                } else {
                                    j3 = j5;
                                }
                                i = ((bRemoteActionCompatParcelizer2 << 28) ^ iRemoteActionCompatParcelizer3) ^ 266354560;
                            }
                        }
                    }
                    this.RatingCompat = j3;
                    return i;
                }
            }
            return (int) r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        }

        public final void r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg() {
            long j = this.serializer + ((long) this.MediaSessionCompatQueueItem);
            this.serializer = j;
            int i = (int) (j - this.MediaDescriptionCompat);
            int i2 = this.MediaBrowserCompatMediaItem;
            if (i <= i2) {
                this.MediaSessionCompatQueueItem = 0;
                return;
            }
            int i3 = i - i2;
            this.MediaSessionCompatQueueItem = i3;
            this.serializer = j - ((long) i3);
        }

        public final int r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs() throws InvalidProtocolBufferException {
            long j = this.RatingCompat;
            if (this.serializer - j < 4) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.RatingCompat = 4 + j;
            r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
            return ((r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j + 3) & 255) << 24) | (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j) & 255) | ((r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(1 + j) & 255) << 8) | ((r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(2 + j) & 255) << 16);
        }

        public final long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() throws InvalidProtocolBufferException {
            long j = this.RatingCompat;
            if (this.serializer - j < 8) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            this.RatingCompat = 8 + j;
            r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
            return ((((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j + 7)) & 255) << 56) | (((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j)) & 255) | ((((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(1 + j)) & 255) << 8) | ((((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(2 + j)) & 255) << 16) | ((((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(3 + j)) & 255) << 24) | ((((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(4 + j)) & 255) << 32) | ((((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(5 + j)) & 255) << 40) | ((((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j + 6)) & 255) << 48);
        }

        public final long r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.RatingCompat;
            if (this.serializer != j4) {
                long j5 = 1 + j4;
                r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
                byte bRemoteActionCompatParcelizer = r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j4);
                if (bRemoteActionCompatParcelizer >= 0) {
                    this.RatingCompat = j5;
                    return bRemoteActionCompatParcelizer;
                }
                if (this.serializer - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iRemoteActionCompatParcelizer = (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j5) << 7) ^ bRemoteActionCompatParcelizer;
                    if (iRemoteActionCompatParcelizer >= 0) {
                        long j7 = 3 + j4;
                        int iRemoteActionCompatParcelizer2 = iRemoteActionCompatParcelizer ^ (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j6) << 14);
                        if (iRemoteActionCompatParcelizer2 < 0) {
                            j6 = j4 + 4;
                            int iRemoteActionCompatParcelizer3 = iRemoteActionCompatParcelizer2 ^ (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j7) << 21);
                            if (iRemoteActionCompatParcelizer3 < 0) {
                                i = (-2080896) ^ iRemoteActionCompatParcelizer3;
                            } else {
                                j7 = 5 + j4;
                                long jRemoteActionCompatParcelizer = ((long) iRemoteActionCompatParcelizer3) ^ (((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j6)) << 28);
                                if (jRemoteActionCompatParcelizer >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j8 = 6 + j4;
                                    long jRemoteActionCompatParcelizer2 = jRemoteActionCompatParcelizer ^ (((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j7)) << 35);
                                    if (jRemoteActionCompatParcelizer2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j7 = 7 + j4;
                                        jRemoteActionCompatParcelizer = jRemoteActionCompatParcelizer2 ^ (((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j8)) << 42);
                                        if (jRemoteActionCompatParcelizer >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j8 = 8 + j4;
                                            jRemoteActionCompatParcelizer2 = jRemoteActionCompatParcelizer ^ (((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j7)) << 49);
                                            if (jRemoteActionCompatParcelizer2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j9 = j4 + 9;
                                                long jRemoteActionCompatParcelizer3 = (jRemoteActionCompatParcelizer2 ^ (((long) r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j8)) << 56)) ^ 71499008037633920L;
                                                if (jRemoteActionCompatParcelizer3 >= 0) {
                                                    j = jRemoteActionCompatParcelizer3;
                                                    j6 = j9;
                                                } else if (r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j9) >= 0) {
                                                    j6 = j4 + 10;
                                                    j = jRemoteActionCompatParcelizer3;
                                                }
                                            }
                                        }
                                    }
                                    j6 = j8;
                                    j = j2 ^ jRemoteActionCompatParcelizer2;
                                }
                                j = j3 ^ jRemoteActionCompatParcelizer;
                            }
                            this.RatingCompat = j6;
                            return j;
                        }
                        j = iRemoteActionCompatParcelizer2 ^ 16256;
                        j6 = j7;
                        this.RatingCompat = j6;
                        return j;
                    }
                    i = iRemoteActionCompatParcelizer ^ (-128);
                    j = i;
                    this.RatingCompat = j6;
                    return j;
                }
            }
            return r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw();
        }

        @Override // com.sentiance.protobuf.u
        public final String write() throws InvalidProtocolBufferException {
            String strSerializer;
            long j;
            byte bRemoteActionCompatParcelizer;
            byte bRemoteActionCompatParcelizer2;
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                long j2 = this.serializer;
                long j3 = this.RatingCompat;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= ((int) (j2 - j3))) {
                    int i = (int) (j3 - this.write);
                    BrazeSdkAuthenticationErrorEvent brazeSdkAuthenticationErrorEvent = getErrorReason.read;
                    brazeSdkAuthenticationErrorEvent.getClass();
                    ByteBuffer byteBuffer = this.IconCompatParcelizer;
                    if (byteBuffer.hasArray()) {
                        strSerializer = brazeSdkAuthenticationErrorEvent.write(byteBuffer.array(), byteBuffer.arrayOffset() + i, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    } else if (!byteBuffer.isDirect() || brazeSdkAuthenticationErrorEvent.read == 0) {
                        strSerializer = BrazeSdkAuthenticationErrorEvent.serializer(byteBuffer, i, iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    } else if ((((byteBuffer.limit() - i) - iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) | i | iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) >= 0) {
                        long jMediaDescriptionCompat = SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(SimpleValueCallback.MediaSessionCompatQueueItem, byteBuffer) + ((long) i);
                        long j4 = ((long) iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) + jMediaDescriptionCompat;
                        char[] cArr = new char[iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss];
                        int i2 = 0;
                        while (true) {
                            j = 1;
                            if (jMediaDescriptionCompat >= j4 || (bRemoteActionCompatParcelizer2 = SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(jMediaDescriptionCompat)) < 0) {
                                break;
                            }
                            jMediaDescriptionCompat++;
                            cArr[i2] = (char) bRemoteActionCompatParcelizer2;
                            i2++;
                        }
                        int i3 = i2;
                        while (jMediaDescriptionCompat < j4) {
                            long j5 = jMediaDescriptionCompat + j;
                            r8lambdaBnqYLh_upxuVzPQWd9SLTrjrLA r8lambdabnqylh_upxuvzpqwd9sltrjrla = SimpleValueCallback.IconCompatParcelizer;
                            byte bRemoteActionCompatParcelizer3 = r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(jMediaDescriptionCompat);
                            if (bRemoteActionCompatParcelizer3 >= 0) {
                                cArr[i3] = (char) bRemoteActionCompatParcelizer3;
                                i3++;
                                jMediaDescriptionCompat = j5;
                                while (jMediaDescriptionCompat < j4 && (bRemoteActionCompatParcelizer = SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(jMediaDescriptionCompat)) >= 0) {
                                    jMediaDescriptionCompat += j;
                                    cArr[i3] = (char) bRemoteActionCompatParcelizer;
                                    i3++;
                                }
                            } else if (bRemoteActionCompatParcelizer3 >= -32) {
                                if (bRemoteActionCompatParcelizer3 < -16) {
                                    if (j5 >= j4 - j) {
                                        throw InvalidProtocolBufferException.read();
                                    }
                                    getEventType.RemoteActionCompatParcelizer(bRemoteActionCompatParcelizer3, r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j5), r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(jMediaDescriptionCompat + 2), cArr, i3);
                                    i3++;
                                    jMediaDescriptionCompat += 3;
                                } else {
                                    if (j5 >= j4 - 2) {
                                        throw InvalidProtocolBufferException.read();
                                    }
                                    getEventType.write(bRemoteActionCompatParcelizer3, r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j5), r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(jMediaDescriptionCompat + 2), r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(jMediaDescriptionCompat + 3), cArr, i3);
                                    i3 += 2;
                                    jMediaDescriptionCompat += 4;
                                }
                                j = 1;
                            } else {
                                if (j5 >= j4) {
                                    throw InvalidProtocolBufferException.read();
                                }
                                jMediaDescriptionCompat += 2;
                                getEventType.serializer(bRemoteActionCompatParcelizer3, r8lambdabnqylh_upxuvzpqwd9sltrjrla.RemoteActionCompatParcelizer(j5), cArr, i3);
                                i3++;
                            }
                        }
                        strSerializer = new String(cArr, 0, i3);
                    } else {
                        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss)});
                        strSerializer = null;
                    }
                    this.RatingCompat += (long) iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    return strSerializer;
                }
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return "";
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }

        @Override // com.sentiance.protobuf.u
        public final long IconCompatParcelizer() {
            return u.IconCompatParcelizer(r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0());
        }

        @Override // com.sentiance.protobuf.u
        public final double PlaybackStateCompat() {
            return Double.longBitsToDouble(r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28());
        }

        @Override // com.sentiance.protobuf.u
        public final float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() {
            return Float.intBitsToFloat(r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs());
        }

        @Override // com.sentiance.protobuf.u
        public final int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
            return u.serializer(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
        }

        @Override // com.sentiance.protobuf.u
        public final void read(r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            RatingCompat();
            int iIconCompatParcelizer = IconCompatParcelizer(iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
            this.read++;
            ((CardKey) r8lambdaxy_za9fysiz3bnvgpaidnjd_aig).write(this, delayedInitializationAnalyticsBehavior);
            RemoteActionCompatParcelizer(0);
            this.read--;
            if (MediaSessionCompatQueueItem() != 0) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            write(iIconCompatParcelizer);
        }

        public e(ByteBuffer byteBuffer, boolean z) {
            this.IconCompatParcelizer = byteBuffer;
            long jMediaDescriptionCompat = SimpleValueCallback.IconCompatParcelizer.MediaDescriptionCompat(SimpleValueCallback.MediaSessionCompatQueueItem, byteBuffer);
            this.write = jMediaDescriptionCompat;
            this.serializer = ((long) byteBuffer.limit()) + jMediaDescriptionCompat;
            long jPosition = jMediaDescriptionCompat + ((long) byteBuffer.position());
            this.RatingCompat = jPosition;
            this.MediaDescriptionCompat = jPosition;
        }

        @Override // com.sentiance.protobuf.u
        public final ByteString MediaSessionCompatToken() throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                long j = this.serializer;
                long j2 = this.RatingCompat;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss];
                    long j3 = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    SimpleValueCallback.IconCompatParcelizer.write(j2, bArr, j3);
                    this.RatingCompat += j3;
                    ByteString byteString = ByteString.RemoteActionCompatParcelizer;
                    return new ByteString.LiteralByteString(bArr);
                }
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return ByteString.RemoteActionCompatParcelizer;
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }

        @Override // com.sentiance.protobuf.u
        public final String RemoteActionCompatParcelizer() throws InvalidProtocolBufferException {
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss > 0) {
                long j = this.serializer;
                long j2 = this.RatingCompat;
                if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss <= ((int) (j - j2))) {
                    byte[] bArr = new byte[iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss];
                    long j3 = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    SimpleValueCallback.IconCompatParcelizer.write(j2, bArr, j3);
                    String str = new String(bArr, isFromOfflineStorage.read);
                    this.RatingCompat += j3;
                    return str;
                }
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == 0) {
                return "";
            }
            if (iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss < 0) {
                throw InvalidProtocolBufferException.serializer();
            }
            throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
        }

        public final long r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw() throws InvalidProtocolBufferException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                long j2 = this.RatingCompat;
                if (j2 != this.serializer) {
                    this.RatingCompat = 1 + j2;
                    byte bRemoteActionCompatParcelizer = SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(j2);
                    j |= ((long) (bRemoteActionCompatParcelizer & 127)) << i;
                    if ((bRemoteActionCompatParcelizer & 128) == 0) {
                        return j;
                    }
                } else {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
        }

        @Override // com.sentiance.protobuf.u
        public final int read() throws InvalidProtocolBufferException {
            if (ParcelableVolumeInfo()) {
                this.MediaMetadataCompat = 0;
                return 0;
            }
            int iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            this.MediaMetadataCompat = iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            if ((iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss >>> 3) != 0) {
                return iR8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
            }
            throw InvalidProtocolBufferException.write();
        }

        @Override // com.sentiance.protobuf.u
        public final int MediaSessionCompatQueueItem() {
            int i = this.MediaBrowserCompatMediaItem;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - MediaBrowserCompatMediaItem();
        }

        @Override // com.sentiance.protobuf.u
        public final void write(int i) {
            this.MediaBrowserCompatMediaItem = i;
            r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
        }

        @Override // com.sentiance.protobuf.u
        public final boolean read(int i) throws InvalidProtocolBufferException {
            int i2 = i & 7;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 == 1) {
                    MediaBrowserCompatMediaItem(8);
                    return true;
                }
                if (i2 == 2) {
                    MediaBrowserCompatMediaItem(r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
                    return true;
                }
                if (i2 == 3) {
                    MediaMetadataCompat();
                    RemoteActionCompatParcelizer(((i >>> 3) << 3) | 4);
                    return true;
                }
                if (i2 == 4) {
                    return false;
                }
                if (i2 == 5) {
                    MediaBrowserCompatMediaItem(4);
                    return true;
                }
                throw InvalidProtocolBufferException.IconCompatParcelizer();
            }
            if (((int) (this.serializer - this.RatingCompat)) >= 10) {
                while (i3 < 10) {
                    long j = this.RatingCompat;
                    this.RatingCompat = j + 1;
                    if (SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(j) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            }
            while (i3 < 10) {
                long j2 = this.RatingCompat;
                if (j2 != this.serializer) {
                    this.RatingCompat = j2 + 1;
                    if (SimpleValueCallback.IconCompatParcelizer.RemoteActionCompatParcelizer(j2) < 0) {
                        i3++;
                    }
                } else {
                    throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
                }
            }
            throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
            return true;
        }

        @Override // com.sentiance.protobuf.u
        public final void RemoteActionCompatParcelizer(int i, r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
            RatingCompat();
            this.read++;
            ((CardKey) r8lambdaxy_za9fysiz3bnvgpaidnjd_aig).write(this, delayedInitializationAnalyticsBehavior);
            RemoteActionCompatParcelizer((i << 3) | 4);
            this.read--;
        }

        @Override // com.sentiance.protobuf.u
        public final void RemoteActionCompatParcelizer(int i) throws InvalidProtocolBufferException {
            if (this.MediaMetadataCompat != i) {
                throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
            }
        }
    }

    public static long IconCompatParcelizer(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static int serializer(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public abstract int ComponentActivity();

    public abstract int IconCompatParcelizer(int i);

    public abstract long IconCompatParcelizer();

    public abstract int MediaBrowserCompatMediaItem();

    public abstract long MediaDescriptionCompat();

    public abstract int MediaSessionCompatQueueItem();

    public abstract boolean MediaSessionCompatResultReceiverWrapper();

    public abstract ByteString MediaSessionCompatToken();

    public abstract boolean ParcelableVolumeInfo();

    public abstract double PlaybackStateCompat();

    public abstract int PlaybackStateCompatCustomAction();

    public abstract String RemoteActionCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer(int i);

    public abstract void RemoteActionCompatParcelizer(int i, r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior);

    public abstract long ResultReceiver();

    public abstract int r8lambda54BeH8ZsBru0CXI2CCSP2syNys();

    public abstract long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY();

    public abstract float r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();

    public abstract int r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();

    public abstract int r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();

    public abstract long r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4();

    public abstract int r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();

    public abstract int read();

    public abstract void read(r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig r8lambdaxy_za9fysiz3bnvgpaidnjd_aig, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior);

    public abstract boolean read(int i);

    public abstract int serializer();

    public abstract String write();

    public abstract void write(int i);

    public final void MediaMetadataCompat() throws InvalidProtocolBufferException {
        boolean z;
        do {
            int i = read();
            if (i == 0) {
                return;
            }
            RatingCompat();
            this.read++;
            z = read(i);
            this.read--;
        } while (z);
    }

    public static int read(int i, InputStream inputStream) throws IOException {
        if ((i & Fields.SpotShadowColor) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
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
                throw InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            }
            if ((i5 & Fields.SpotShadowColor) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.RemoteActionCompatParcelizer();
    }

    public static u IconCompatParcelizer(InputStream inputStream) {
        if (inputStream == null) {
            byte[] bArr = isFromOfflineStorage.serializer;
            return IconCompatParcelizer(bArr, 0, bArr.length, false);
        }
        return new d(inputStream);
    }

    public static b IconCompatParcelizer(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.IconCompatParcelizer(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final void RatingCompat() throws InvalidProtocolBufferException {
        if (this.read >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
