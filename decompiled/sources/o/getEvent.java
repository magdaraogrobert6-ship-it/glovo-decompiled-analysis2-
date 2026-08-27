package o;

/* JADX INFO: loaded from: classes4.dex */
public final class getEvent implements CustomerChatModulestartChat2 {
    public static final long[] IconCompatParcelizer = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public long MediaBrowserCompatMediaItem;
    public long MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public long MediaSessionCompatResultReceiverWrapper;
    public int MediaSessionCompatToken;
    public final byte[] ParcelableVolumeInfo;
    public long PlaybackStateCompat;
    public final long[] PlaybackStateCompatCustomAction;
    public long RatingCompat;
    public long RemoteActionCompatParcelizer;
    public int r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final /* synthetic */ int read;
    public long serializer;
    public long write;

    public static long IconCompatParcelizer(long j) {
        return (((j >>> 34) | (j << 30)) ^ ((j << 36) | (j >>> 28))) ^ ((j >>> 39) | (j << 25));
    }

    public static long IconCompatParcelizer(long j, long j2, long j3) {
        return (j & j2) ^ (j3 & (~j));
    }

    public static long read(long j) {
        return (((j >>> 18) | (j << 46)) ^ ((j << 50) | (j >>> 14))) ^ ((j >>> 41) | (j << 23));
    }

    public static long write(long j, long j2, long j3) {
        return ((j & j2) ^ (j & j3)) ^ (j2 & j3);
    }

    @Override // o.CustomerChatModulestartChat2
    public final int RemoteActionCompatParcelizer() {
        return this.read != 0 ? 64 : 48;
    }

    public final void MediaBrowserCompatMediaItem() {
        this.PlaybackStateCompat = 0L;
        this.MediaSessionCompatResultReceiverWrapper = 0L;
        int i = 0;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.ParcelableVolumeInfo;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.MediaSessionCompatToken = 0;
        while (true) {
            long[] jArr = this.PlaybackStateCompatCustomAction;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    public final void read(int i, byte[] bArr) {
        int i2 = this.MediaSessionCompatToken;
        int iSerializer = createCache.serializer(i, bArr);
        this.PlaybackStateCompatCustomAction[i2] = (((long) createCache.serializer(i + 4, bArr)) & 4294967295L) | ((((long) iSerializer) & 4294967295L) << 32);
        int i3 = this.MediaSessionCompatToken + 1;
        this.MediaSessionCompatToken = i3;
        if (i3 == 16) {
            write();
        }
    }

    public final void write() {
        long[] jArr;
        long j = this.PlaybackStateCompat;
        if (j > 2305843009213693951L) {
            this.MediaSessionCompatResultReceiverWrapper += j >>> 61;
            this.PlaybackStateCompat = j & 2305843009213693951L;
        }
        int i = 16;
        while (true) {
            jArr = this.PlaybackStateCompatCustomAction;
            if (i > 79) {
                break;
            }
            long j2 = jArr[i - 2];
            long j3 = jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = ((((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61))) ^ (j2 >>> 6)) + j3 + ((((j4 >>> 8) | (j4 << 56)) ^ ((j4 << 63) | (j4 >>> 1))) ^ (j4 >>> 7)) + jArr[i - 16];
            i++;
        }
        long j5 = this.RemoteActionCompatParcelizer;
        long j6 = this.write;
        long j7 = this.serializer;
        long j8 = this.RatingCompat;
        long j9 = this.MediaDescriptionCompat;
        long j10 = this.MediaBrowserCompatMediaItem;
        long j11 = this.MediaSessionCompatQueueItem;
        long j12 = j10;
        long j13 = this.MediaMetadataCompat;
        int i2 = 0;
        int i3 = 0;
        long jIconCompatParcelizer = j7;
        long j14 = j9;
        long jIconCompatParcelizer2 = j6;
        long j15 = j8;
        long jIconCompatParcelizer3 = j5;
        while (i2 < 10) {
            long j16 = read(j14);
            long jIconCompatParcelizer4 = IconCompatParcelizer(j14, j12, j11);
            long[] jArr2 = IconCompatParcelizer;
            int i4 = i3 + 1;
            long j17 = j16 + jIconCompatParcelizer4 + jArr2[i3] + jArr[i3] + j13;
            long j18 = j15 + j17;
            long jIconCompatParcelizer5 = IconCompatParcelizer(jIconCompatParcelizer3) + write(jIconCompatParcelizer3, jIconCompatParcelizer2, jIconCompatParcelizer) + j17;
            int i5 = i3 + 2;
            long jIconCompatParcelizer6 = j11 + read(j18) + IconCompatParcelizer(j18, j14, j12) + jArr2[i4] + jArr[i4];
            long j19 = jIconCompatParcelizer + jIconCompatParcelizer6;
            long jIconCompatParcelizer7 = IconCompatParcelizer(jIconCompatParcelizer5) + write(jIconCompatParcelizer5, jIconCompatParcelizer3, jIconCompatParcelizer2) + jIconCompatParcelizer6;
            int i6 = i3 + 3;
            long jIconCompatParcelizer8 = read(j19) + IconCompatParcelizer(j19, j18, j14) + jArr2[i5] + jArr[i5] + j12;
            long j20 = jIconCompatParcelizer2 + jIconCompatParcelizer8;
            long jIconCompatParcelizer9 = IconCompatParcelizer(jIconCompatParcelizer7) + write(jIconCompatParcelizer7, jIconCompatParcelizer5, jIconCompatParcelizer3) + jIconCompatParcelizer8;
            int i7 = i3 + 4;
            long jIconCompatParcelizer10 = read(j20) + IconCompatParcelizer(j20, j19, j18) + jArr2[i6] + jArr[i6] + j14;
            long j21 = jIconCompatParcelizer3 + jIconCompatParcelizer10;
            long jIconCompatParcelizer11 = IconCompatParcelizer(jIconCompatParcelizer9) + write(jIconCompatParcelizer9, jIconCompatParcelizer7, jIconCompatParcelizer5) + jIconCompatParcelizer10;
            int i8 = i3 + 5;
            long jIconCompatParcelizer12 = read(j21) + IconCompatParcelizer(j21, j20, j19) + jArr2[i7] + jArr[i7] + j18;
            j13 = jIconCompatParcelizer5 + jIconCompatParcelizer12;
            long jIconCompatParcelizer13 = IconCompatParcelizer(jIconCompatParcelizer11) + write(jIconCompatParcelizer11, jIconCompatParcelizer9, jIconCompatParcelizer7) + jIconCompatParcelizer12;
            int i9 = i3 + 6;
            long jIconCompatParcelizer14 = read(j13) + IconCompatParcelizer(j13, j21, j20) + jArr2[i8] + jArr[i8] + j19;
            j11 = jIconCompatParcelizer7 + jIconCompatParcelizer14;
            jIconCompatParcelizer = IconCompatParcelizer(jIconCompatParcelizer13) + write(jIconCompatParcelizer13, jIconCompatParcelizer11, jIconCompatParcelizer9) + jIconCompatParcelizer14;
            int i10 = i3 + 7;
            long jIconCompatParcelizer15 = read(j11) + IconCompatParcelizer(j11, j13, j21) + jArr2[i9] + jArr[i9] + j20;
            j12 = jIconCompatParcelizer9 + jIconCompatParcelizer15;
            jIconCompatParcelizer2 = IconCompatParcelizer(jIconCompatParcelizer) + write(jIconCompatParcelizer, jIconCompatParcelizer13, jIconCompatParcelizer11) + jIconCompatParcelizer15;
            i3 += 8;
            long jIconCompatParcelizer16 = read(j12) + IconCompatParcelizer(j12, j11, j13) + jArr2[i10] + jArr[i10] + j21;
            i2++;
            jIconCompatParcelizer3 = jIconCompatParcelizer16 + IconCompatParcelizer(jIconCompatParcelizer2) + write(jIconCompatParcelizer2, jIconCompatParcelizer, jIconCompatParcelizer13);
            j14 = jIconCompatParcelizer11 + jIconCompatParcelizer16;
            j15 = jIconCompatParcelizer13;
        }
        this.RemoteActionCompatParcelizer += jIconCompatParcelizer3;
        this.write += jIconCompatParcelizer2;
        this.serializer += jIconCompatParcelizer;
        this.RatingCompat += j15;
        this.MediaDescriptionCompat += j14;
        this.MediaBrowserCompatMediaItem += j12;
        this.MediaSessionCompatQueueItem += j11;
        this.MediaMetadataCompat += j13;
        this.MediaSessionCompatToken = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            jArr[i11] = 0;
        }
    }

    public getEvent(CustomerChatModulefetchUserFeatures1 customerChatModulefetchUserFeatures1, byte b) {
        this.ParcelableVolumeInfo = new byte[8];
        this.PlaybackStateCompatCustomAction = new long[80];
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
        IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        if (this.read != 0) {
            MediaBrowserCompatMediaItem();
            this.RemoteActionCompatParcelizer = 7640891576956012808L;
            this.write = -4942790177534073029L;
            this.serializer = 4354685564936845355L;
            this.RatingCompat = -6534734903238641935L;
            this.MediaDescriptionCompat = 5840696475078001361L;
            this.MediaBrowserCompatMediaItem = -7276294671716946913L;
            this.MediaSessionCompatQueueItem = 2270897969802886507L;
            this.MediaMetadataCompat = 6620516959819538809L;
            return;
        }
        MediaBrowserCompatMediaItem();
        this.RemoteActionCompatParcelizer = -3766243637369397544L;
        this.write = 7105036623409894663L;
        this.serializer = -7973340178411365097L;
        this.RatingCompat = 1526699215303891257L;
        this.MediaDescriptionCompat = 7436329637833083697L;
        this.MediaBrowserCompatMediaItem = -8163818279084223215L;
        this.MediaSessionCompatQueueItem = -2662702644619276377L;
        this.MediaMetadataCompat = 5167115440072839076L;
    }

    @Override // o.CustomerChatModulestartChat2
    public final int serializer(int i, byte[] bArr) {
        if (this.read == 0) {
            read();
            createCache.RemoteActionCompatParcelizer(i, this.RemoteActionCompatParcelizer, bArr);
            createCache.RemoteActionCompatParcelizer(i + 8, this.write, bArr);
            createCache.RemoteActionCompatParcelizer(i + 16, this.serializer, bArr);
            createCache.RemoteActionCompatParcelizer(i + 24, this.RatingCompat, bArr);
            createCache.RemoteActionCompatParcelizer(i + 32, this.MediaDescriptionCompat, bArr);
            createCache.RemoteActionCompatParcelizer(i + 40, this.MediaBrowserCompatMediaItem, bArr);
            IconCompatParcelizer();
            return 48;
        }
        read();
        createCache.RemoteActionCompatParcelizer(i, this.RemoteActionCompatParcelizer, bArr);
        createCache.RemoteActionCompatParcelizer(i + 8, this.write, bArr);
        createCache.RemoteActionCompatParcelizer(i + 16, this.serializer, bArr);
        createCache.RemoteActionCompatParcelizer(i + 24, this.RatingCompat, bArr);
        createCache.RemoteActionCompatParcelizer(i + 32, this.MediaDescriptionCompat, bArr);
        createCache.RemoteActionCompatParcelizer(i + 40, this.MediaBrowserCompatMediaItem, bArr);
        createCache.RemoteActionCompatParcelizer(i + 48, this.MediaSessionCompatQueueItem, bArr);
        createCache.RemoteActionCompatParcelizer(i + 56, this.MediaMetadataCompat, bArr);
        IconCompatParcelizer();
        return 64;
    }

    @Override // o.CustomerChatModulestartChat2
    public final void IconCompatParcelizer(byte[] bArr, int i, int i2) {
        while (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != 0 && i2 > 0) {
            RemoteActionCompatParcelizer(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.ParcelableVolumeInfo;
            if (i2 < bArr2.length) {
                break;
            }
            read(i, bArr);
            i += bArr2.length;
            i2 -= bArr2.length;
            this.PlaybackStateCompat += (long) bArr2.length;
        }
        while (i2 > 0) {
            RemoteActionCompatParcelizer(bArr[i]);
            i++;
            i2--;
        }
    }

    @Override // o.CustomerChatModulestartChat2
    public final String serializer() {
        return this.read != 0 ? "SHA-512" : "SHA-384";
    }

    public final void read() {
        long j = this.PlaybackStateCompat;
        if (j > 2305843009213693951L) {
            this.MediaSessionCompatResultReceiverWrapper += j >>> 61;
            this.PlaybackStateCompat = j & 2305843009213693951L;
        }
        long j2 = this.PlaybackStateCompat;
        long j3 = this.MediaSessionCompatResultReceiverWrapper;
        byte b = -128;
        while (true) {
            RemoteActionCompatParcelizer(b);
            if (this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == 0) {
                break;
            } else {
                b = 0;
            }
        }
        if (this.MediaSessionCompatToken > 14) {
            write();
        }
        long[] jArr = this.PlaybackStateCompatCustomAction;
        jArr[14] = j3;
        jArr[15] = j2 << 3;
        write();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getEvent(CustomerChatModulefetchUserFeatures1 customerChatModulefetchUserFeatures1) {
        this(customerChatModulefetchUserFeatures1, (byte) 0);
        this.read = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public getEvent() {
        this(CustomerChatModulefetchUserFeatures1.ANY, (byte) 0);
        this.read = 1;
        CustomerChatModulesendMessage2.serializer();
        IconCompatParcelizer();
    }

    @Override // o.CustomerChatModulestartChat2
    public final void RemoteActionCompatParcelizer(byte b) {
        int i = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        int i2 = i + 1;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2;
        byte[] bArr = this.ParcelableVolumeInfo;
        bArr[i] = b;
        if (i2 == bArr.length) {
            read(0, bArr);
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
        }
        this.PlaybackStateCompat++;
    }
}
