package o;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;

/* JADX INFO: loaded from: classes3.dex */
public class clearDataIfNeeded {
    public int IconCompatParcelizer;
    private int MediaSessionCompatQueueItem;
    private final Object[] PlaybackStateCompat;
    public Object RemoteActionCompatParcelizer;
    private int read;
    public Object serializer;
    public int write;
    private final int[] MediaBrowserCompatMediaItem = new int[10];
    private final long[] MediaMetadataCompat = new long[10];
    private final float[] RatingCompat = new float[10];
    private final double[] MediaDescriptionCompat = new double[10];

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                int i2 = this.read - this.write;
                this.read = i2;
                this.MediaSessionCompatQueueItem = i2;
                return 0;
            case 2:
                Object[] objArr = this.PlaybackStateCompat;
                int i3 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.serializer = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.PlaybackStateCompat;
                int i4 = this.read;
                this.read = i4 + 1;
                objArr2[i4] = this.RemoteActionCompatParcelizer;
                return 0;
            case 4:
                Object[] objArr3 = this.PlaybackStateCompat;
                int i5 = this.read;
                this.read = i5 + 1;
                objArr3[i5] = objArr3[3];
                return 0;
            case 5:
                int i6 = this.read;
                int i7 = i6 - 1;
                Object[] objArr4 = this.PlaybackStateCompat;
                Object obj2 = objArr4[i7];
                objArr4[i7] = null;
                objArr4[7] = obj2;
                this.read = i6;
                objArr4[i7] = obj2;
                return 0;
            case 6:
                int i8 = this.read;
                int i9 = i8 - 1;
                Object[] objArr5 = this.PlaybackStateCompat;
                Object obj3 = objArr5[i9];
                objArr5[i9] = null;
                objArr5[7] = obj3;
                this.read = i8;
                objArr5[i9] = objArr5[3];
                return 0;
            case 7:
                int i10 = this.read - 1;
                this.read = i10;
                Object[] objArr6 = this.PlaybackStateCompat;
                Object obj4 = objArr6[i10];
                objArr6[i10] = null;
                objArr6[8] = obj4;
                return 0;
            case 8:
                Object[] objArr7 = this.PlaybackStateCompat;
                int i11 = this.read;
                this.read = i11 + 1;
                objArr7[i11] = objArr7[8];
                return 0;
            case 9:
                Object[] objArr8 = this.PlaybackStateCompat;
                int i12 = this.read;
                objArr8[i12] = objArr8[7];
                this.read = i12 + 2;
                objArr8[i12 + 1] = objArr8[8];
                return 0;
            case 10:
                int[] iArr = this.MediaBrowserCompatMediaItem;
                int i13 = this.read;
                this.read = i13 + 1;
                iArr[i13] = this.write;
                return 0;
            case 11:
                int[] iArr2 = this.MediaBrowserCompatMediaItem;
                int i14 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i14 + 1;
                this.IconCompatParcelizer = iArr2[i14];
                return 0;
            case 12:
                int i15 = this.read - 1;
                this.read = i15;
                Object[] objArr9 = this.PlaybackStateCompat;
                Object obj5 = objArr9[i15];
                objArr9[i15] = null;
                this.IconCompatParcelizer = obj5 == null ? 0 : 1;
                return 0;
            case 13:
                Object[] objArr10 = this.PlaybackStateCompat;
                int i16 = this.read;
                this.read = i16 + 1;
                objArr10[i16] = objArr10[7];
                return 0;
            case 14:
                Object[] objArr11 = this.PlaybackStateCompat;
                int i17 = this.read;
                this.read = i17 + 1;
                objArr11[i17] = objArr11[7];
                int[] iArr3 = this.MediaBrowserCompatMediaItem;
                Object obj6 = objArr11[i17];
                objArr11[i17] = null;
                iArr3[i17] = ((Object[]) obj6).length;
                return 0;
            case 15:
                int i18 = this.read - 1;
                this.read = i18;
                int[] iArr4 = this.MediaBrowserCompatMediaItem;
                iArr4[4] = iArr4[i18];
                return 0;
            case 16:
                int[] iArr5 = this.MediaBrowserCompatMediaItem;
                int i19 = this.read;
                this.read = i19 + 1;
                iArr5[i19] = iArr5[4];
                return 0;
            case 17:
                Object[] objArr12 = this.PlaybackStateCompat;
                int i20 = this.read;
                this.read = i20 + 1;
                objArr12[i20] = objArr12[7];
                int[] iArr6 = this.MediaBrowserCompatMediaItem;
                Object obj7 = objArr12[i20];
                objArr12[i20] = null;
                iArr6[i20] = ((Object[]) obj7).length;
                this.read = i20;
                iArr6[5] = iArr6[i20];
                return 0;
            case 18:
                int[] iArr7 = this.MediaBrowserCompatMediaItem;
                int i21 = this.read;
                iArr7[i21] = 0;
                this.read = i21;
                iArr7[4] = iArr7[i21];
                return 0;
            case 19:
                int[] iArr8 = this.MediaBrowserCompatMediaItem;
                int i22 = this.read;
                this.read = i22 + 1;
                iArr8[i22] = iArr8[5];
                return 0;
            case 20:
                int i23 = this.read;
                int i24 = i23 - 2;
                this.read = i24;
                int[] iArr9 = this.MediaBrowserCompatMediaItem;
                this.IconCompatParcelizer = iArr9[i24] >= iArr9[i23 - 1] ? 0 : 1;
                return 0;
            case 21:
                Object[] objArr13 = this.PlaybackStateCompat;
                int i25 = this.read;
                objArr13[i25] = objArr13[7];
                int[] iArr10 = this.MediaBrowserCompatMediaItem;
                iArr10[i25 + 1] = iArr10[4];
                int i26 = i25 + 1;
                this.read = i26;
                Object obj8 = objArr13[i25];
                objArr13[i25] = null;
                objArr13[i25] = ((Object[]) obj8)[iArr10[i26]];
                return 0;
            case 22:
                int i27 = this.read - 1;
                this.read = i27;
                Object[] objArr14 = this.PlaybackStateCompat;
                Object obj9 = objArr14[i27];
                objArr14[i27] = null;
                objArr14[9] = obj9;
                return 0;
            case 23:
                Object[] objArr15 = this.PlaybackStateCompat;
                int i28 = this.read;
                this.read = i28 + 1;
                objArr15[i28] = objArr15[9];
                return 0;
            case 24:
                int i29 = this.read - 1;
                this.read = i29;
                int[] iArr11 = this.MediaBrowserCompatMediaItem;
                iArr11[6] = iArr11[i29];
                return 0;
            case 25:
                int[] iArr12 = this.MediaBrowserCompatMediaItem;
                int i30 = this.read;
                this.read = i30 + 1;
                iArr12[i30] = iArr12[6];
                return 0;
            case 26:
                int i31 = this.read - 1;
                this.read = i31;
                this.PlaybackStateCompat[i31] = null;
                int[] iArr13 = this.MediaBrowserCompatMediaItem;
                iArr13[4] = iArr13[4] + 1;
                return 0;
            case 27:
                Object[] objArr16 = this.PlaybackStateCompat;
                int i32 = this.read;
                Object obj10 = objArr16[i32 - 1];
                objArr16[i32 - 1] = null;
                this.serializer = obj10;
                return 0;
            case 28:
                Object[] objArr17 = this.PlaybackStateCompat;
                int i33 = this.read;
                this.read = i33 + 1;
                objArr17[i33] = null;
                return 0;
            case 29:
                int[] iArr14 = this.MediaBrowserCompatMediaItem;
                int i34 = this.read;
                this.read = i34 + 1;
                iArr14[i34] = 2;
                return 0;
            case 30:
                int i35 = this.read;
                int i36 = i35 - 1;
                this.read = i36;
                int[] iArr15 = this.MediaBrowserCompatMediaItem;
                iArr15[i35 - 2] = iArr15[i35 - 2] % iArr15[i36];
                int i37 = i35 - 2;
                this.read = i37;
                this.PlaybackStateCompat[i37] = null;
                return 0;
            case 31:
                int[] iArr16 = this.MediaBrowserCompatMediaItem;
                int i38 = this.read;
                iArr16[i38] = 2;
                iArr16[i38 + 1] = 2;
                int i39 = i38 + 1;
                this.read = i39;
                iArr16[i38] = iArr16[i38] % iArr16[i39];
                return 0;
            case 32:
                int i40 = this.read - 1;
                this.read = i40;
                this.PlaybackStateCompat[i40] = null;
                return 0;
            case 33:
                int[] iArr17 = this.MediaBrowserCompatMediaItem;
                int i41 = this.read;
                this.read = i41 + 1;
                iArr17[i41] = 11;
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                int i42 = this.read;
                int i43 = i42 - 1;
                this.read = i43;
                int[] iArr18 = this.MediaBrowserCompatMediaItem;
                iArr18[i42 - 2] = iArr18[i42 - 2] + iArr18[i43];
                return 0;
            case 35:
                int[] iArr19 = this.MediaBrowserCompatMediaItem;
                int i44 = this.read;
                iArr19[i44] = iArr19[i44 - 1];
                iArr19[i44 + 1] = 128;
                int i45 = i44 + 1;
                this.read = i45;
                iArr19[i44] = iArr19[i44] % iArr19[i45];
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int[] iArr20 = this.MediaBrowserCompatMediaItem;
                int i46 = this.read;
                iArr20[i46] = 2;
                this.read = i46;
                iArr20[i46 - 1] = iArr20[i46 - 1] % iArr20[i46];
                return 0;
            case 37:
                int i47 = this.read - 1;
                this.read = i47;
                this.IconCompatParcelizer = this.MediaBrowserCompatMediaItem[i47] == 0 ? 0 : 1;
                return 0;
            case 38:
                int i48 = this.read - 1;
                this.read = i48;
                Object[] objArr18 = this.PlaybackStateCompat;
                Object obj11 = objArr18[i48];
                objArr18[i48] = null;
                objArr18[7] = obj11;
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                int[] iArr21 = this.MediaBrowserCompatMediaItem;
                int i49 = this.read;
                Object[] objArr19 = this.PlaybackStateCompat;
                Object obj12 = objArr19[i49 - 1];
                objArr19[i49 - 1] = null;
                iArr21[i49 - 1] = ((int[]) obj12).length;
                return 0;
            case 40:
                int[] iArr22 = this.MediaBrowserCompatMediaItem;
                int i50 = this.read;
                iArr22[i50] = 33;
                this.read = i50;
                iArr22[i50 - 1] = iArr22[i50 - 1] + iArr22[i50];
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                int[] iArr23 = this.MediaBrowserCompatMediaItem;
                int i51 = this.read;
                iArr23[i51] = 35;
                this.read = i51;
                iArr23[i51 - 1] = iArr23[i51 - 1] + iArr23[i51];
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int[] iArr24 = this.MediaBrowserCompatMediaItem;
                int i52 = this.read;
                iArr24[i52] = iArr24[i52 - 1];
                this.read = i52 + 2;
                iArr24[i52 + 1] = 128;
                return 0;
            case 43:
                int i53 = this.read;
                int i54 = i53 - 1;
                this.read = i54;
                int[] iArr25 = this.MediaBrowserCompatMediaItem;
                iArr25[i53 - 2] = iArr25[i53 - 2] % iArr25[i54];
                return 0;
            case 44:
                int i55 = this.read - 1;
                this.read = i55;
                this.IconCompatParcelizer = this.MediaBrowserCompatMediaItem[i55] != 0 ? 0 : 1;
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                int[] iArr26 = this.MediaBrowserCompatMediaItem;
                int i56 = this.read - 1;
                this.read = i56;
                this.IconCompatParcelizer = iArr26[i56];
                return 0;
            case 46:
                int[] iArr27 = this.MediaBrowserCompatMediaItem;
                int i57 = this.read;
                this.read = i57 + 1;
                iArr27[i57] = 77;
                return 0;
            case 47:
                int[] iArr28 = this.MediaBrowserCompatMediaItem;
                int i58 = this.read;
                this.read = i58 + 1;
                iArr28[i58] = 82;
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                int[] iArr29 = this.MediaBrowserCompatMediaItem;
                int i59 = this.read;
                this.read = i59 + 1;
                iArr29[i59] = 89;
                return 0;
            case 49:
                int[] iArr30 = this.MediaBrowserCompatMediaItem;
                int i60 = this.read;
                this.read = i60 + 1;
                iArr30[i60] = 99;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                for (int i61 = this.read - 1; i61 >= 0; i61--) {
                    this.PlaybackStateCompat[i61] = null;
                }
                Object[] objArr20 = this.PlaybackStateCompat;
                this.read = 1;
                objArr20[0] = this.RemoteActionCompatParcelizer;
                return 0;
            default:
                return i;
        }
    }

    public clearDataIfNeeded(Object obj) {
        Object[] objArr = new Object[10];
        this.PlaybackStateCompat = objArr;
        objArr[3] = obj;
        this.read = 0;
        this.MediaSessionCompatQueueItem = -1;
    }
}
