package o;

/* JADX INFO: loaded from: classes4.dex */
public final class Contact implements CustomerChatModulestartChat2 {
    public static final int[] RemoteActionCompatParcelizer = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public final int[] MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int MediaSessionCompatResultReceiverWrapper;
    public long ParcelableVolumeInfo;
    public final byte[] PlaybackStateCompat;
    public int PlaybackStateCompatCustomAction;
    public int RatingCompat;
    public int read;
    public int serializer;
    public int write;

    public static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        return (i & i2) ^ (i3 & (~i));
    }

    public static int read(int i) {
        return (((i << 21) | (i >>> 11)) ^ ((i >>> 6) | (i << 26))) ^ ((i << 7) | (i >>> 25));
    }

    public static int read(int i, int i2, int i3) {
        return (i & i2) | (i3 & (i ^ i2));
    }

    public static int serializer(int i) {
        return (((i << 19) | (i >>> 13)) ^ ((i >>> 2) | (i << 30))) ^ ((i << 10) | (i >>> 22));
    }

    @Override // o.CustomerChatModulestartChat2
    public final void IconCompatParcelizer(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int iMax = Math.max(0, i2);
        int i4 = this.PlaybackStateCompatCustomAction;
        byte[] bArr2 = this.PlaybackStateCompat;
        if (i4 != 0) {
            int i5 = 0;
            while (true) {
                if (i5 >= iMax) {
                    i3 = i5;
                    break;
                }
                int i6 = this.PlaybackStateCompatCustomAction;
                int i7 = i6 + 1;
                this.PlaybackStateCompatCustomAction = i7;
                int i8 = i5 + 1;
                bArr2[i6] = bArr[i5 + i];
                if (i7 == 4) {
                    write(0, bArr2);
                    this.PlaybackStateCompatCustomAction = 0;
                    i3 = i8;
                    break;
                }
                i5 = i8;
            }
        }
        while (i3 < iMax - 3) {
            write(i + i3, bArr);
            i3 += 4;
        }
        while (i3 < iMax) {
            int i9 = this.PlaybackStateCompatCustomAction;
            this.PlaybackStateCompatCustomAction = i9 + 1;
            bArr2[i9] = bArr[i3 + i];
            i3++;
        }
        this.ParcelableVolumeInfo += (long) iMax;
    }

    @Override // o.CustomerChatModulestartChat2
    public final int RemoteActionCompatParcelizer() {
        return 32;
    }

    public Contact() {
        CustomerChatModulefetchUserFeatures1 customerChatModulefetchUserFeatures1 = CustomerChatModulefetchUserFeatures1.AGREEMENT;
        this.PlaybackStateCompat = new byte[4];
        this.PlaybackStateCompatCustomAction = 0;
        this.MediaMetadataCompat = new int[64];
        CustomerChatModulesendMessage2.serializer();
        write();
    }

    @Override // o.CustomerChatModulestartChat2
    public final String serializer() {
        return "SHA-256";
    }

    public final void write() {
        this.ParcelableVolumeInfo = 0L;
        this.PlaybackStateCompatCustomAction = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.PlaybackStateCompat;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = 0;
            i++;
        }
        this.IconCompatParcelizer = 1779033703;
        this.write = -1150833019;
        this.read = 1013904242;
        this.serializer = -1521486534;
        this.MediaBrowserCompatMediaItem = 1359893119;
        this.RatingCompat = -1694144372;
        this.MediaDescriptionCompat = 528734635;
        this.MediaSessionCompatQueueItem = 1541459225;
        this.MediaSessionCompatResultReceiverWrapper = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.MediaMetadataCompat;
            if (i2 == iArr.length) {
                return;
            }
            iArr[i2] = 0;
            i2++;
        }
    }

    public final void write(int i, byte[] bArr) {
        this.MediaMetadataCompat[this.MediaSessionCompatResultReceiverWrapper] = createCache.serializer(i, bArr);
        int i2 = this.MediaSessionCompatResultReceiverWrapper + 1;
        this.MediaSessionCompatResultReceiverWrapper = i2;
        if (i2 == 16) {
            read();
        }
    }

    @Override // o.CustomerChatModulestartChat2
    public final int serializer(int i, byte[] bArr) {
        long j = this.ParcelableVolumeInfo << 3;
        byte b = -128;
        while (true) {
            RemoteActionCompatParcelizer(b);
            if (this.PlaybackStateCompatCustomAction == 0) {
                break;
            }
            b = 0;
        }
        if (this.MediaSessionCompatResultReceiverWrapper > 14) {
            read();
        }
        int[] iArr = this.MediaMetadataCompat;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
        read();
        createCache.read(bArr, this.IconCompatParcelizer, i);
        createCache.read(bArr, this.write, i + 4);
        createCache.read(bArr, this.read, i + 8);
        createCache.read(bArr, this.serializer, i + 12);
        createCache.read(bArr, this.MediaBrowserCompatMediaItem, i + 16);
        createCache.read(bArr, this.RatingCompat, i + 20);
        createCache.read(bArr, this.MediaDescriptionCompat, i + 24);
        createCache.read(bArr, this.MediaSessionCompatQueueItem, i + 28);
        write();
        return 32;
    }

    public final void read() {
        int[] iArr;
        int i = 16;
        while (true) {
            iArr = this.MediaMetadataCompat;
            if (i > 63) {
                break;
            }
            int i2 = iArr[i - 2];
            int i3 = iArr[i - 7];
            int i4 = iArr[i - 15];
            iArr[i] = ((((i2 << 13) | (i2 >>> 19)) ^ ((i2 >>> 17) | (i2 << 15))) ^ (i2 >>> 10)) + i3 + ((i4 >>> 3) ^ (((i4 << 14) | (i4 >>> 18)) ^ ((i4 >>> 7) | (i4 << 25)))) + iArr[i - 16];
            i++;
        }
        int i5 = this.IconCompatParcelizer;
        int i6 = this.write;
        int i7 = this.read;
        int i8 = this.serializer;
        int i9 = this.MediaBrowserCompatMediaItem;
        int i10 = this.RatingCompat;
        int i11 = this.MediaDescriptionCompat;
        int i12 = this.MediaSessionCompatQueueItem;
        int i13 = 0;
        int i14 = 0;
        while (i13 < 8) {
            int i15 = read(i9);
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i9, i10, i11);
            int[] iArr2 = RemoteActionCompatParcelizer;
            int i16 = iRemoteActionCompatParcelizer + i15 + iArr2[i14] + iArr[i14] + i12;
            int i17 = i8 + i16;
            int iSerializer = read(i5, i6, i7) + serializer(i5) + i16;
            int i18 = i14 + 1;
            int i19 = read(i17);
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(i17, i9, i10) + i19 + iArr2[i18] + iArr[i18] + i11;
            int i20 = i7 + iRemoteActionCompatParcelizer2;
            int iSerializer2 = read(iSerializer, i5, i6) + serializer(iSerializer) + iRemoteActionCompatParcelizer2;
            int i21 = i14 + 2;
            int i22 = read(i20);
            int iRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(i20, i17, i9) + i22 + iArr2[i21] + iArr[i21] + i10;
            int i23 = i6 + iRemoteActionCompatParcelizer3;
            int iSerializer3 = read(iSerializer2, iSerializer, i5) + serializer(iSerializer2) + iRemoteActionCompatParcelizer3;
            int i24 = i14 + 3;
            int i25 = read(i23);
            int iRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(i23, i20, i17) + i25 + iArr2[i24] + iArr[i24] + i9;
            int i26 = i5 + iRemoteActionCompatParcelizer4;
            int iSerializer4 = read(iSerializer3, iSerializer2, iSerializer) + serializer(iSerializer3) + iRemoteActionCompatParcelizer4;
            int i27 = i14 + 4;
            int i28 = read(i26);
            int iRemoteActionCompatParcelizer5 = RemoteActionCompatParcelizer(i26, i23, i20) + i28 + iArr2[i27] + iArr[i27] + i17;
            int i29 = iSerializer + iRemoteActionCompatParcelizer5;
            int iSerializer5 = read(iSerializer4, iSerializer3, iSerializer2) + serializer(iSerializer4) + iRemoteActionCompatParcelizer5;
            int i30 = i14 + 5;
            int i31 = read(i29);
            int iRemoteActionCompatParcelizer6 = RemoteActionCompatParcelizer(i29, i26, i23) + i31 + iArr2[i30] + iArr[i30] + i20;
            int i32 = iSerializer2 + iRemoteActionCompatParcelizer6;
            int iSerializer6 = read(iSerializer5, iSerializer4, iSerializer3) + serializer(iSerializer5) + iRemoteActionCompatParcelizer6;
            int i33 = i14 + 6;
            int i34 = read(i32);
            int iRemoteActionCompatParcelizer7 = RemoteActionCompatParcelizer(i32, i29, i26) + i34 + iArr2[i33] + iArr[i33] + i23;
            int i35 = iSerializer3 + iRemoteActionCompatParcelizer7;
            int iSerializer7 = read(iSerializer6, iSerializer5, iSerializer4) + serializer(iSerializer6) + iRemoteActionCompatParcelizer7;
            int i36 = i14 + 7;
            int i37 = read(i35);
            int iRemoteActionCompatParcelizer8 = RemoteActionCompatParcelizer(i35, i32, i29) + i37 + iArr2[i36] + iArr[i36] + i26;
            int i38 = iSerializer4 + iRemoteActionCompatParcelizer8;
            int iSerializer8 = read(iSerializer7, iSerializer6, iSerializer5) + serializer(iSerializer7) + iRemoteActionCompatParcelizer8;
            i14 += 8;
            i13++;
            i9 = i38;
            i5 = iSerializer8;
            i10 = i35;
            i6 = iSerializer7;
            i11 = i32;
            i7 = iSerializer6;
            i12 = i29;
            i8 = iSerializer5;
        }
        this.IconCompatParcelizer += i5;
        this.write += i6;
        this.read += i7;
        this.serializer += i8;
        this.MediaBrowserCompatMediaItem += i9;
        this.RatingCompat += i10;
        this.MediaDescriptionCompat += i11;
        this.MediaSessionCompatQueueItem += i12;
        this.MediaSessionCompatResultReceiverWrapper = 0;
        for (int i39 = 0; i39 < 16; i39++) {
            iArr[i39] = 0;
        }
    }

    @Override // o.CustomerChatModulestartChat2
    public final void RemoteActionCompatParcelizer(byte b) {
        int i = this.PlaybackStateCompatCustomAction;
        int i2 = i + 1;
        this.PlaybackStateCompatCustomAction = i2;
        byte[] bArr = this.PlaybackStateCompat;
        bArr[i] = b;
        if (i2 == bArr.length) {
            write(0, bArr);
            this.PlaybackStateCompatCustomAction = 0;
        }
        this.ParcelableVolumeInfo++;
    }
}
