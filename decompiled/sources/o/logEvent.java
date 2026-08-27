package o;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;

/* JADX INFO: loaded from: classes3.dex */
public class logEvent {
    public int IconCompatParcelizer;
    private final float[] MediaBrowserCompatMediaItem;
    private final int[] MediaDescriptionCompat;
    private final double[] MediaMetadataCompat;
    private final long[] MediaSessionCompatQueueItem;
    private final Object[] ParcelableVolumeInfo;
    private int RatingCompat;
    public Object RemoteActionCompatParcelizer;
    private int read;
    public Object serializer;
    public int write;

    public int write(int i) {
        switch (i) {
            case 1:
                int i2 = this.read - this.IconCompatParcelizer;
                this.read = i2;
                this.RatingCompat = i2;
                return 0;
            case 2:
                Object[] objArr = this.ParcelableVolumeInfo;
                int i3 = this.RatingCompat;
                this.RatingCompat = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.serializer = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.ParcelableVolumeInfo;
                int i4 = this.read;
                this.read = i4 + 1;
                objArr2[i4] = this.RemoteActionCompatParcelizer;
                return 0;
            case 4:
                Object[] objArr3 = this.ParcelableVolumeInfo;
                int i5 = this.read;
                this.read = i5 + 1;
                objArr3[i5] = objArr3[5];
                return 0;
            case 5:
                int i6 = this.read - 1;
                this.read = i6;
                Object[] objArr4 = this.ParcelableVolumeInfo;
                Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                objArr4[5] = obj2;
                return 0;
            case 6:
                int[] iArr = this.MediaDescriptionCompat;
                int i7 = this.read;
                iArr[i7] = 2;
                iArr[i7 + 1] = 2;
                int i8 = i7 + 1;
                this.read = i8;
                iArr[i7] = iArr[i7] % iArr[i8];
                return 0;
            case 7:
                int i9 = this.read - 1;
                this.read = i9;
                this.ParcelableVolumeInfo[i9] = null;
                return 0;
            case 9:
                Object[] objArr5 = this.ParcelableVolumeInfo;
                int i10 = this.read;
                Object obj3 = objArr5[i10 - 1];
                objArr5[i10 - 1] = null;
                this.serializer = obj3;
            case 8:
                return 0;
            case 10:
                int[] iArr2 = this.MediaDescriptionCompat;
                int i11 = this.read;
                this.read = i11 + 1;
                iArr2[i11] = this.IconCompatParcelizer;
                return 0;
            case 11:
                int[] iArr3 = this.MediaDescriptionCompat;
                int i12 = this.read;
                this.read = i12 + 1;
                iArr3[i12] = 5;
                return 0;
            case 12:
                int i13 = this.read;
                int i14 = i13 - 1;
                this.read = i14;
                int[] iArr4 = this.MediaDescriptionCompat;
                iArr4[i13 - 2] = iArr4[i13 - 2] + iArr4[i14];
                return 0;
            case 13:
                int[] iArr5 = this.MediaDescriptionCompat;
                int i15 = this.read;
                this.read = i15 + 1;
                iArr5[i15] = iArr5[i15 - 1];
                return 0;
            case 14:
                int[] iArr6 = this.MediaDescriptionCompat;
                int i16 = this.read;
                this.read = i16 + 1;
                iArr6[i16] = 128;
                return 0;
            case 15:
                int i17 = this.read;
                int i18 = i17 - 1;
                this.read = i18;
                int[] iArr7 = this.MediaDescriptionCompat;
                iArr7[i17 - 2] = iArr7[i17 - 2] % iArr7[i18];
                return 0;
            case 16:
                int[] iArr8 = this.MediaDescriptionCompat;
                int i19 = this.RatingCompat;
                this.RatingCompat = i19 + 1;
                this.write = iArr8[i19];
                return 0;
            case 17:
                int[] iArr9 = this.MediaDescriptionCompat;
                int i20 = this.read;
                this.read = i20 + 1;
                iArr9[i20] = 2;
                return 0;
            case 18:
                int i21 = this.read - 1;
                this.read = i21;
                this.write = this.MediaDescriptionCompat[i21] != 0 ? 0 : 1;
                return 0;
            case 19:
                int[] iArr10 = this.MediaDescriptionCompat;
                int i22 = this.read;
                this.read = i22 + 1;
                iArr10[i22] = 45;
                return 0;
            case 20:
                int i23 = this.read - 1;
                this.read = i23;
                this.write = this.MediaDescriptionCompat[i23] == 0 ? 0 : 1;
                return 0;
            case 21:
                for (int i24 = this.read - 1; i24 >= 0; i24--) {
                    this.ParcelableVolumeInfo[i24] = null;
                }
                Object[] objArr6 = this.ParcelableVolumeInfo;
                this.read = 1;
                objArr6[0] = this.RemoteActionCompatParcelizer;
                return 0;
            case 22:
                int i25 = this.read;
                int i26 = i25 - 1;
                Object[] objArr7 = this.ParcelableVolumeInfo;
                Object obj4 = objArr7[i26];
                objArr7[i26] = null;
                objArr7[5] = obj4;
                this.read = i25;
                objArr7[i26] = obj4;
                return 0;
            case 23:
                int[] iArr11 = this.MediaDescriptionCompat;
                int i27 = this.read;
                iArr11[i27] = 97;
                iArr11[i27 - 1] = iArr11[i27 - 1] + iArr11[i27];
                this.read = i27 + 1;
                iArr11[i27] = iArr11[i27 - 1];
                return 0;
            case 24:
                int[] iArr12 = this.MediaDescriptionCompat;
                int i28 = this.read;
                iArr12[i28] = 128;
                this.read = i28;
                iArr12[i28 - 1] = iArr12[i28 - 1] % iArr12[i28];
                return 0;
            case 25:
                int[] iArr13 = this.MediaDescriptionCompat;
                int i29 = this.read;
                iArr13[i29] = 2;
                this.read = i29;
                iArr13[i29 - 1] = iArr13[i29 - 1] % iArr13[i29];
                return 0;
            case 26:
                int[] iArr14 = this.MediaDescriptionCompat;
                int i30 = this.read;
                this.read = i30 + 1;
                iArr14[i30] = 23;
                return 0;
            case 27:
                Object[] objArr8 = this.ParcelableVolumeInfo;
                int i31 = this.read;
                this.read = i31 + 1;
                objArr8[i31] = null;
                int[] iArr15 = this.MediaDescriptionCompat;
                Object obj5 = objArr8[i31];
                objArr8[i31] = null;
                iArr15[i31] = ((int[]) obj5).length;
                return 0;
            case 28:
                int[] iArr16 = this.MediaDescriptionCompat;
                int i32 = this.read - 1;
                this.read = i32;
                this.write = iArr16[i32];
                return 0;
            case 29:
                int[] iArr17 = this.MediaDescriptionCompat;
                int i33 = this.read;
                this.read = i33 + 1;
                iArr17[i33] = 0;
                return 0;
            case 30:
                int[] iArr18 = this.MediaDescriptionCompat;
                int i34 = this.read;
                this.read = i34 + 1;
                iArr18[i34] = 1;
                return 0;
            case 31:
                int i35 = this.read - 1;
                this.read = i35;
                Object[] objArr9 = this.ParcelableVolumeInfo;
                Object obj6 = objArr9[i35];
                objArr9[i35] = null;
                objArr9[8] = obj6;
                return 0;
            case 32:
                Object[] objArr10 = this.ParcelableVolumeInfo;
                int i36 = this.read;
                this.read = i36 + 1;
                objArr10[i36] = objArr10[8];
                return 0;
            case 33:
                int i37 = this.read;
                int i38 = i37 - 1;
                Object[] objArr11 = this.ParcelableVolumeInfo;
                Object obj7 = objArr11[i38];
                objArr11[i38] = null;
                objArr11[8] = obj7;
                this.read = i37;
                objArr11[i38] = obj7;
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                int i39 = this.read;
                int i40 = i39 - 1;
                Object[] objArr12 = this.ParcelableVolumeInfo;
                Object obj8 = objArr12[i40];
                objArr12[i40] = null;
                objArr12[8] = obj8;
                this.read = i39;
                objArr12[i40] = objArr12[5];
                return 0;
            case 35:
                Object[] objArr13 = this.ParcelableVolumeInfo;
                int i41 = this.read;
                objArr13[i41] = objArr13[6];
                this.read = i41 + 2;
                objArr13[i41 + 1] = null;
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int i42 = this.read;
                int i43 = i42 - 1;
                Object[] objArr14 = this.ParcelableVolumeInfo;
                Object obj9 = objArr14[i43];
                objArr14[i43] = null;
                objArr14[6] = obj9;
                this.read = i42;
                objArr14[i43] = objArr14[8];
                return 0;
            case 37:
                Object[] objArr15 = this.ParcelableVolumeInfo;
                int i44 = this.read;
                objArr15[i44] = objArr15[6];
                this.read = i44 + 2;
                objArr15[i44 + 1] = objArr15[7];
                return 0;
            case 38:
                int i45 = this.read - 1;
                this.read = i45;
                Object[] objArr16 = this.ParcelableVolumeInfo;
                Object obj10 = objArr16[i45];
                objArr16[i45] = null;
                objArr16[6] = obj10;
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                Object[] objArr17 = this.ParcelableVolumeInfo;
                int i46 = this.read;
                this.read = i46 + 1;
                objArr17[i46] = objArr17[6];
                return 0;
            case 40:
                int[] iArr19 = this.MediaDescriptionCompat;
                int i47 = this.read;
                this.read = i47 + 1;
                iArr19[i47] = 1;
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                int i48 = this.read;
                int i49 = i48 - 1;
                int[] iArr20 = this.MediaDescriptionCompat;
                iArr20[i48 - 2] = iArr20[i48 - 2] + iArr20[i49];
                this.read = i48;
                iArr20[i49] = iArr20[i48 - 2];
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int[] iArr21 = this.MediaDescriptionCompat;
                int i50 = this.read;
                iArr21[i50] = 41;
                this.read = i50 + 2;
                iArr21[i50 + 1] = 0;
                return 0;
            case 43:
                int i51 = this.read;
                int i52 = i51 - 1;
                this.read = i52;
                int[] iArr22 = this.MediaDescriptionCompat;
                iArr22[i51 - 2] = iArr22[i51 - 2] / iArr22[i52];
                int i53 = i51 - 2;
                this.read = i53;
                this.ParcelableVolumeInfo[i53] = null;
                return 0;
            default:
                return i;
        }
    }

    public logEvent(Object obj, Object obj2, Object obj3) {
        this.MediaDescriptionCompat = new int[9];
        this.MediaSessionCompatQueueItem = new long[9];
        this.MediaBrowserCompatMediaItem = new float[9];
        this.MediaMetadataCompat = new double[9];
        Object[] objArr = new Object[9];
        this.ParcelableVolumeInfo = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        this.read = 0;
        this.RatingCompat = -1;
    }

    public logEvent(Object obj) {
        this.MediaDescriptionCompat = new int[9];
        this.MediaSessionCompatQueueItem = new long[9];
        this.MediaBrowserCompatMediaItem = new float[9];
        this.MediaMetadataCompat = new double[9];
        Object[] objArr = new Object[9];
        this.ParcelableVolumeInfo = objArr;
        objArr[5] = obj;
        this.read = 0;
        this.RatingCompat = -1;
    }
}
