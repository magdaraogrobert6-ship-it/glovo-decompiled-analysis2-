package o;

/* JADX INFO: loaded from: classes3.dex */
public class estimatedTimeToArrivalFormatter {
    public Object IconCompatParcelizer;
    private final int[] MediaSessionCompatQueueItem;
    private final Object[] MediaSessionCompatToken;
    private int RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    private int write;
    private final long[] MediaDescriptionCompat = new long[8];
    private final float[] MediaMetadataCompat = new float[8];
    private final double[] MediaBrowserCompatMediaItem = new double[8];

    public int IconCompatParcelizer(int i) {
        switch (i) {
            case 1:
                int i2 = this.write - 1;
                this.write = i2;
                Object[] objArr = this.MediaSessionCompatToken;
                Object obj = objArr[i2];
                objArr[i2] = null;
                this.serializer = obj != null ? 0 : 1;
                return 0;
            case 2:
                Object[] objArr2 = this.MediaSessionCompatToken;
                int i3 = this.write;
                this.write = i3 + 1;
                objArr2[i3] = objArr2[7];
                return 0;
            case 3:
                int[] iArr = this.MediaSessionCompatQueueItem;
                int i4 = this.write;
                iArr[i4] = iArr[6];
                iArr[i4 + 1] = 2;
                int i5 = i4 + 1;
                this.write = i5;
                iArr[i4] = iArr[i5] & iArr[i4];
                return 0;
            case 4:
                int i6 = this.write - 1;
                this.write = i6;
                this.serializer = this.MediaSessionCompatQueueItem[i6] == 0 ? 0 : 1;
                return 0;
            case 5:
                Object[] objArr3 = this.MediaSessionCompatToken;
                int i7 = this.write;
                this.write = i7 + 1;
                objArr3[i7] = this.IconCompatParcelizer;
                return 0;
            case 6:
                int i8 = this.write - 1;
                this.write = i8;
                Object[] objArr4 = this.MediaSessionCompatToken;
                Object obj2 = objArr4[i8];
                objArr4[i8] = null;
                objArr4[5] = obj2;
                return 0;
            case 7:
                Object[] objArr5 = this.MediaSessionCompatToken;
                int i9 = this.write;
                this.write = i9 + 1;
                objArr5[i9] = objArr5[3];
                return 0;
            case 8:
                int i10 = this.write - this.read;
                this.write = i10;
                this.RatingCompat = i10;
                return 0;
            case 9:
                Object[] objArr6 = this.MediaSessionCompatToken;
                int i11 = this.RatingCompat;
                this.RatingCompat = i11 + 1;
                Object obj3 = objArr6[i11];
                objArr6[i11] = null;
                this.RemoteActionCompatParcelizer = obj3;
                return 0;
            case 10:
                Object[] objArr7 = this.MediaSessionCompatToken;
                int i12 = this.write;
                objArr7[i12] = objArr7[4];
                this.write = i12 + 2;
                objArr7[i12 + 1] = objArr7[5];
                return 0;
            case 11:
                Object[] objArr8 = this.MediaSessionCompatToken;
                int i13 = this.write;
                Object obj4 = objArr8[i13 - 1];
                objArr8[i13 - 1] = null;
                this.RemoteActionCompatParcelizer = obj4;
                return 0;
            case 12:
                int i14 = this.write;
                int i15 = i14 - 1;
                Object[] objArr9 = this.MediaSessionCompatToken;
                Object obj5 = objArr9[i15];
                objArr9[i15] = null;
                objArr9[3] = obj5;
                this.write = i14;
                objArr9[i15] = obj5;
                return 0;
            case 13:
                Object[] objArr10 = this.MediaSessionCompatToken;
                int i16 = this.write;
                this.write = i16 + 1;
                objArr10[i16] = null;
                return 0;
            case 14:
                int[] iArr2 = this.MediaSessionCompatQueueItem;
                int i17 = this.write;
                iArr2[i17] = 2;
                this.write = i17 + 2;
                iArr2[i17 + 1] = 2;
                return 0;
            case 15:
                int i18 = this.write;
                int i19 = i18 - 1;
                this.write = i19;
                int[] iArr3 = this.MediaSessionCompatQueueItem;
                iArr3[i18 - 2] = iArr3[i18 - 2] % iArr3[i19];
                int i20 = i18 - 2;
                this.write = i20;
                this.MediaSessionCompatToken[i20] = null;
                return 0;
            case 16:
                int[] iArr4 = this.MediaSessionCompatQueueItem;
                int i21 = this.write;
                this.write = i21 + 1;
                iArr4[i21] = 2;
                return 0;
            case 17:
                int i22 = this.write;
                int i23 = i22 - 1;
                this.write = i23;
                int[] iArr5 = this.MediaSessionCompatQueueItem;
                iArr5[i22 - 2] = iArr5[i22 - 2] % iArr5[i23];
                return 0;
            case 18:
                int i24 = this.write - 1;
                this.write = i24;
                this.MediaSessionCompatToken[i24] = null;
                return 0;
            case 19:
                int[] iArr6 = this.MediaSessionCompatQueueItem;
                int i25 = this.write - 1;
                this.write = i25;
                this.serializer = iArr6[i25];
                return 0;
            case 20:
                int[] iArr7 = this.MediaSessionCompatQueueItem;
                int i26 = this.write;
                this.write = i26 + 1;
                iArr7[i26] = 0;
                return 0;
            case 21:
                int[] iArr8 = this.MediaSessionCompatQueueItem;
                int i27 = this.write;
                this.write = i27 + 1;
                iArr8[i27] = 1;
                return 0;
            case 22:
                int[] iArr9 = this.MediaSessionCompatQueueItem;
                int i28 = this.write;
                this.write = i28 + 1;
                iArr9[i28] = 15;
                return 0;
            case 23:
                int[] iArr10 = this.MediaSessionCompatQueueItem;
                int i29 = this.write;
                this.write = i29 + 1;
                iArr10[i29] = 67;
                return 0;
            case 24:
                for (int i30 = this.write - 1; i30 >= 0; i30--) {
                    this.MediaSessionCompatToken[i30] = null;
                }
                Object[] objArr11 = this.MediaSessionCompatToken;
                this.write = 1;
                objArr11[0] = this.IconCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }

    public estimatedTimeToArrivalFormatter(Object obj, Object obj2, Object obj3, int i, Object obj4) {
        int[] iArr = new int[8];
        this.MediaSessionCompatQueueItem = iArr;
        Object[] objArr = new Object[8];
        this.MediaSessionCompatToken = objArr;
        objArr[3] = obj;
        objArr[4] = obj2;
        objArr[5] = obj3;
        iArr[6] = i;
        objArr[7] = obj4;
        this.write = 0;
        this.RatingCompat = -1;
    }
}
