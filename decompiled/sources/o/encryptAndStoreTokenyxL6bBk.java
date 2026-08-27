package o;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;

/* JADX INFO: loaded from: classes3.dex */
public class encryptAndStoreTokenyxL6bBk {
    public int IconCompatParcelizer;
    private int MediaSessionCompatQueueItem;
    private final Object[] PlaybackStateCompat;
    public int RemoteActionCompatParcelizer;
    public Object read;
    private int serializer;
    public Object write;
    private final int[] RatingCompat = new int[11];
    private final long[] MediaBrowserCompatMediaItem = new long[11];
    private final float[] MediaDescriptionCompat = new float[11];
    private final double[] MediaMetadataCompat = new double[11];

    public int serializer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.PlaybackStateCompat;
                int i2 = this.serializer;
                this.serializer = i2 + 1;
                objArr[i2] = objArr[4];
                return 0;
            case 2:
                int i3 = this.serializer - this.RemoteActionCompatParcelizer;
                this.serializer = i3;
                this.MediaSessionCompatQueueItem = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.PlaybackStateCompat;
                int i4 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.write = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.PlaybackStateCompat;
                int i5 = this.serializer;
                this.serializer = i5 + 1;
                objArr3[i5] = this.read;
                return 0;
            case 5:
                int i6 = this.serializer - 1;
                this.serializer = i6;
                Object[] objArr4 = this.PlaybackStateCompat;
                Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                objArr4[8] = obj2;
                return 0;
            case 6:
                Object[] objArr5 = this.PlaybackStateCompat;
                int i7 = this.serializer;
                this.serializer = i7 + 1;
                objArr5[i7] = objArr5[8];
                return 0;
            case 7:
                int i8 = this.serializer - 1;
                this.serializer = i8;
                Object[] objArr6 = this.PlaybackStateCompat;
                Object obj3 = objArr6[i8];
                objArr6[i8] = null;
                objArr6[9] = obj3;
                return 0;
            case 8:
                Object[] objArr7 = this.PlaybackStateCompat;
                int i9 = this.serializer;
                this.serializer = i9 + 1;
                objArr7[i9] = objArr7[9];
                return 0;
            case 9:
                int i10 = this.serializer;
                int i11 = i10 - 1;
                Object[] objArr8 = this.PlaybackStateCompat;
                Object obj4 = objArr8[i11];
                objArr8[i11] = null;
                objArr8[9] = obj4;
                this.serializer = i10;
                objArr8[i11] = objArr8[8];
                return 0;
            case 10:
                Object[] objArr9 = this.PlaybackStateCompat;
                int i12 = this.serializer;
                objArr9[i12] = objArr9[9];
                int[] iArr = this.RatingCompat;
                this.serializer = i12 + 2;
                iArr[i12 + 1] = 64;
                return 0;
            case 11:
                int[] iArr2 = this.RatingCompat;
                int i13 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i13 + 1;
                this.IconCompatParcelizer = iArr2[i13];
                return 0;
            case 12:
                int i14 = this.serializer - 1;
                this.serializer = i14;
                Object[] objArr10 = this.PlaybackStateCompat;
                Object obj5 = objArr10[i14];
                objArr10[i14] = null;
                this.IconCompatParcelizer = obj5 == null ? 0 : 1;
                return 0;
            case 13:
                int i15 = this.serializer;
                int i16 = i15 - 1;
                Object[] objArr11 = this.PlaybackStateCompat;
                Object obj6 = objArr11[i16];
                objArr11[i16] = null;
                objArr11[8] = obj6;
                this.serializer = i15;
                objArr11[i16] = obj6;
                return 0;
            case 14:
                int[] iArr3 = this.RatingCompat;
                int i17 = this.serializer;
                Object[] objArr12 = this.PlaybackStateCompat;
                Object obj7 = objArr12[i17 - 1];
                objArr12[i17 - 1] = null;
                iArr3[i17 - 1] = ((Object[]) obj7).length;
                int i18 = i17 - 1;
                int i19 = iArr3[i18];
                iArr3[5] = i19;
                this.serializer = i17;
                iArr3[i18] = i19;
                return 0;
            case 15:
                int[] iArr4 = this.RatingCompat;
                int i20 = this.serializer;
                Object[] objArr13 = this.PlaybackStateCompat;
                Object obj8 = objArr13[i20 - 1];
                objArr13[i20 - 1] = null;
                iArr4[i20 - 1] = ((Object[]) obj8).length;
                return 0;
            case 16:
                int i21 = this.serializer;
                int i22 = i21 - 1;
                int[] iArr5 = this.RatingCompat;
                iArr5[6] = iArr5[i22];
                iArr5[i22] = 0;
                int i23 = i21 - 1;
                this.serializer = i23;
                iArr5[5] = iArr5[i23];
                return 0;
            case 17:
                int[] iArr6 = this.RatingCompat;
                int i24 = this.serializer;
                this.serializer = i24 + 1;
                iArr6[i24] = iArr6[5];
                return 0;
            case 18:
                int i25 = this.serializer;
                int i26 = i25 - 2;
                this.serializer = i26;
                int[] iArr7 = this.RatingCompat;
                this.IconCompatParcelizer = iArr7[i26] >= iArr7[i25 - 1] ? 0 : 1;
                return 0;
            case 19:
                int[] iArr8 = this.RatingCompat;
                int i27 = this.serializer;
                this.serializer = i27 + 1;
                iArr8[i27] = iArr8[6];
                return 0;
            case 20:
                Object[] objArr14 = this.PlaybackStateCompat;
                int i28 = this.serializer;
                objArr14[i28] = objArr14[8];
                int[] iArr9 = this.RatingCompat;
                this.serializer = i28 + 2;
                iArr9[i28 + 1] = iArr9[5];
                return 0;
            case 21:
                int i29 = this.serializer;
                int i30 = i29 - 1;
                this.serializer = i30;
                Object[] objArr15 = this.PlaybackStateCompat;
                Object obj9 = objArr15[i29 - 2];
                objArr15[i29 - 2] = null;
                objArr15[i29 - 2] = ((Object[]) obj9)[this.RatingCompat[i30]];
                return 0;
            case 22:
                int i31 = this.serializer - 1;
                this.serializer = i31;
                Object[] objArr16 = this.PlaybackStateCompat;
                Object obj10 = objArr16[i31];
                objArr16[i31] = null;
                objArr16[10] = obj10;
                return 0;
            case 23:
                Object[] objArr17 = this.PlaybackStateCompat;
                int i32 = this.serializer;
                this.serializer = i32 + 1;
                objArr17[i32] = objArr17[10];
                return 0;
            case 24:
                int[] iArr10 = this.RatingCompat;
                int i33 = this.serializer;
                this.serializer = i33 + 1;
                iArr10[i33] = this.RemoteActionCompatParcelizer;
                return 0;
            case 25:
                int i34 = this.serializer;
                int i35 = i34 - 1;
                int[] iArr11 = this.RatingCompat;
                iArr11[7] = iArr11[i35];
                Object[] objArr18 = this.PlaybackStateCompat;
                this.serializer = i34;
                objArr18[i35] = objArr18[9];
                return 0;
            case 26:
                int[] iArr12 = this.RatingCompat;
                int i36 = this.serializer;
                this.serializer = i36 + 1;
                iArr12[i36] = iArr12[7];
                return 0;
            case 27:
                int i37 = this.serializer - 1;
                this.serializer = i37;
                this.PlaybackStateCompat[i37] = null;
                return 0;
            case 28:
                int[] iArr13 = this.RatingCompat;
                iArr13[5] = iArr13[5] + 1;
                return 0;
            case 29:
                Object[] objArr19 = this.PlaybackStateCompat;
                int i38 = this.serializer;
                this.serializer = i38 + 1;
                objArr19[i38] = null;
                return 0;
            case 30:
                int[] iArr14 = this.RatingCompat;
                int i39 = this.serializer;
                this.serializer = i39 + 1;
                iArr14[i39] = 2;
                return 0;
            case 31:
                int[] iArr15 = this.RatingCompat;
                int i40 = this.serializer;
                iArr15[i40] = 2;
                this.serializer = i40;
                iArr15[i40 - 1] = iArr15[i40 - 1] % iArr15[i40];
                int i41 = i40 - 1;
                this.serializer = i41;
                this.PlaybackStateCompat[i41] = null;
                return 0;
            case 32:
                Object[] objArr20 = this.PlaybackStateCompat;
                int i42 = this.serializer;
                Object obj11 = objArr20[i42 - 1];
                objArr20[i42 - 1] = null;
                this.write = obj11;
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                int[] iArr16 = this.RatingCompat;
                int i43 = this.serializer;
                iArr16[i43] = 2;
                this.serializer = i43 + 2;
                iArr16[i43 + 1] = 2;
            case 33:
                return 0;
            case 35:
                int i44 = this.serializer;
                int i45 = i44 - 1;
                this.serializer = i45;
                int[] iArr17 = this.RatingCompat;
                iArr17[i44 - 2] = iArr17[i44 - 2] % iArr17[i45];
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int[] iArr18 = this.RatingCompat;
                int i46 = this.serializer;
                iArr18[i46] = 15;
                this.serializer = i46;
                iArr18[i46 - 1] = iArr18[i46 - 1] + iArr18[i46];
                return 0;
            case 37:
                int[] iArr19 = this.RatingCompat;
                int i47 = this.serializer;
                iArr19[i47] = iArr19[i47 - 1];
                this.serializer = i47 + 2;
                iArr19[i47 + 1] = 128;
                return 0;
            case 38:
                int i48 = this.serializer - 1;
                this.serializer = i48;
                this.IconCompatParcelizer = this.RatingCompat[i48] == 0 ? 0 : 1;
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                int[] iArr20 = this.RatingCompat;
                int i49 = this.serializer;
                iArr20[i49] = 37;
                this.serializer = i49;
                iArr20[i49 - 1] = iArr20[i49 - 1] + iArr20[i49];
                return 0;
            case 40:
                int[] iArr21 = this.RatingCompat;
                int i50 = this.serializer;
                iArr21[i50] = iArr21[i50 - 1];
                iArr21[i50 + 1] = 128;
                int i51 = i50 + 1;
                this.serializer = i51;
                iArr21[i50] = iArr21[i50] % iArr21[i51];
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                int[] iArr22 = this.RatingCompat;
                int i52 = this.serializer;
                iArr22[i52] = 2;
                this.serializer = i52;
                iArr22[i52 - 1] = iArr22[i52 - 1] % iArr22[i52];
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int i53 = this.serializer - 1;
                this.serializer = i53;
                this.IconCompatParcelizer = this.RatingCompat[i53] != 0 ? 0 : 1;
                return 0;
            case 43:
                int[] iArr23 = this.RatingCompat;
                int i54 = this.serializer - 1;
                this.serializer = i54;
                this.IconCompatParcelizer = iArr23[i54];
                return 0;
            case 44:
                int[] iArr24 = this.RatingCompat;
                int i55 = this.serializer;
                this.serializer = i55 + 1;
                iArr24[i55] = 1;
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                int[] iArr25 = this.RatingCompat;
                int i56 = this.serializer;
                this.serializer = i56 + 1;
                iArr25[i56] = 0;
                return 0;
            case 46:
                int[] iArr26 = this.RatingCompat;
                int i57 = this.serializer;
                this.serializer = i57 + 1;
                iArr26[i57] = 47;
                return 0;
            case 47:
                int[] iArr27 = this.RatingCompat;
                int i58 = this.serializer;
                this.serializer = i58 + 1;
                iArr27[i58] = 58;
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                for (int i59 = this.serializer - 1; i59 >= 0; i59--) {
                    this.PlaybackStateCompat[i59] = null;
                }
                Object[] objArr21 = this.PlaybackStateCompat;
                this.serializer = 1;
                objArr21[0] = this.read;
                return 0;
            default:
                return i;
        }
    }

    public encryptAndStoreTokenyxL6bBk(Object obj) {
        Object[] objArr = new Object[11];
        this.PlaybackStateCompat = objArr;
        objArr[4] = obj;
        this.serializer = 0;
        this.MediaSessionCompatQueueItem = -1;
    }
}
