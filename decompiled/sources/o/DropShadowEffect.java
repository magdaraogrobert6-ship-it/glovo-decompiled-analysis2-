package o;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;

/* JADX INFO: loaded from: classes3.dex */
public class DropShadowEffect {
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private final long[] MediaDescriptionCompat;
    private final float[] MediaMetadataCompat;
    private final int[] MediaSessionCompatQueueItem;
    private final Object[] MediaSessionCompatResultReceiverWrapper;
    private final double[] RatingCompat;
    private int RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public int write;

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaSessionCompatResultReceiverWrapper;
                int i2 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i2 + 1;
                objArr[i2] = objArr[5];
                return 0;
            case 2:
                int i3 = this.RemoteActionCompatParcelizer - this.write;
                this.RemoteActionCompatParcelizer = i3;
                this.MediaBrowserCompatMediaItem = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaSessionCompatResultReceiverWrapper;
                int i4 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.read = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaSessionCompatResultReceiverWrapper;
                int i5 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i5 + 1;
                objArr3[i5] = this.IconCompatParcelizer;
                return 0;
            case 5:
                int i6 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i6;
                Object[] objArr4 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                objArr4[5] = obj2;
                return 0;
            case 6:
                int[] iArr = this.MediaSessionCompatQueueItem;
                int i7 = this.RemoteActionCompatParcelizer;
                iArr[i7] = 2;
                iArr[i7 + 1] = 2;
                int i8 = i7 + 1;
                this.RemoteActionCompatParcelizer = i8;
                iArr[i7] = iArr[i7] % iArr[i8];
                return 0;
            case 7:
                int i9 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i9;
                this.MediaSessionCompatResultReceiverWrapper[i9] = null;
                return 0;
            case 8:
                Object[] objArr5 = this.MediaSessionCompatResultReceiverWrapper;
                int i10 = this.RemoteActionCompatParcelizer;
                Object obj3 = objArr5[i10 - 1];
                objArr5[i10 - 1] = null;
                this.read = obj3;
                return 0;
            case 10:
                int[] iArr2 = this.MediaSessionCompatQueueItem;
                int i11 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i11 + 1;
                iArr2[i11] = this.write;
            case 9:
                return 0;
            case 11:
                int[] iArr3 = this.MediaSessionCompatQueueItem;
                int i12 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i12 + 1;
                iArr3[i12] = 81;
                return 0;
            case 12:
                int i13 = this.RemoteActionCompatParcelizer;
                int i14 = i13 - 1;
                int[] iArr4 = this.MediaSessionCompatQueueItem;
                iArr4[i13 - 2] = iArr4[i13 - 2] + iArr4[i14];
                this.RemoteActionCompatParcelizer = i13;
                iArr4[i14] = iArr4[i13 - 2];
                return 0;
            case 13:
                int[] iArr5 = this.MediaSessionCompatQueueItem;
                int i15 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i15 + 1;
                this.serializer = iArr5[i15];
                return 0;
            case 14:
                int[] iArr6 = this.MediaSessionCompatQueueItem;
                int i16 = this.RemoteActionCompatParcelizer;
                iArr6[i16] = 128;
                this.RemoteActionCompatParcelizer = i16;
                iArr6[i16 - 1] = iArr6[i16 - 1] % iArr6[i16];
                return 0;
            case 15:
                int[] iArr7 = this.MediaSessionCompatQueueItem;
                int i17 = this.RemoteActionCompatParcelizer;
                iArr7[i17] = 2;
                this.RemoteActionCompatParcelizer = i17;
                iArr7[i17 - 1] = iArr7[i17 - 1] % iArr7[i17];
                return 0;
            case 16:
                int i18 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i18;
                this.serializer = this.MediaSessionCompatQueueItem[i18] != 0 ? 0 : 1;
                return 0;
            case 17:
                int[] iArr8 = this.MediaSessionCompatQueueItem;
                int i19 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i19 + 1;
                iArr8[i19] = 63;
                return 0;
            case 18:
                int i20 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i20;
                this.serializer = this.MediaSessionCompatQueueItem[i20] == 0 ? 0 : 1;
                return 0;
            case 19:
                for (int i21 = this.RemoteActionCompatParcelizer - 1; i21 >= 0; i21--) {
                    this.MediaSessionCompatResultReceiverWrapper[i21] = null;
                }
                Object[] objArr6 = this.MediaSessionCompatResultReceiverWrapper;
                this.RemoteActionCompatParcelizer = 1;
                objArr6[0] = this.IconCompatParcelizer;
                return 0;
            case 20:
                int i22 = this.RemoteActionCompatParcelizer;
                int i23 = i22 - 1;
                Object[] objArr7 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj4 = objArr7[i23];
                objArr7[i23] = null;
                objArr7[5] = obj4;
                this.RemoteActionCompatParcelizer = i22;
                objArr7[i23] = obj4;
                return 0;
            case 21:
                int[] iArr9 = this.MediaSessionCompatQueueItem;
                int i24 = this.RemoteActionCompatParcelizer;
                iArr9[i24] = 71;
                iArr9[i24 - 1] = iArr9[i24 - 1] + iArr9[i24];
                this.RemoteActionCompatParcelizer = i24 + 1;
                iArr9[i24] = iArr9[i24 - 1];
                return 0;
            case 22:
                int[] iArr10 = this.MediaSessionCompatQueueItem;
                int i25 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i25 + 1;
                iArr10[i25] = 2;
                return 0;
            case 23:
                int i26 = this.RemoteActionCompatParcelizer;
                int i27 = i26 - 1;
                this.RemoteActionCompatParcelizer = i27;
                int[] iArr11 = this.MediaSessionCompatQueueItem;
                iArr11[i26 - 2] = iArr11[i26 - 2] % iArr11[i27];
                return 0;
            case 24:
                int[] iArr12 = this.MediaSessionCompatQueueItem;
                int i28 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i28 + 1;
                iArr12[i28] = 28;
                return 0;
            case 25:
                int[] iArr13 = this.MediaSessionCompatQueueItem;
                int i29 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i29 + 1;
                iArr13[i29] = 0;
                return 0;
            case 26:
                int i30 = this.RemoteActionCompatParcelizer;
                int i31 = i30 - 1;
                this.RemoteActionCompatParcelizer = i31;
                int[] iArr14 = this.MediaSessionCompatQueueItem;
                iArr14[i30 - 2] = iArr14[i30 - 2] / iArr14[i31];
                int i32 = i30 - 2;
                this.RemoteActionCompatParcelizer = i32;
                this.MediaSessionCompatResultReceiverWrapper[i32] = null;
                return 0;
            case 27:
                int[] iArr15 = this.MediaSessionCompatQueueItem;
                int i33 = this.RemoteActionCompatParcelizer;
                iArr15[i33] = 89;
                iArr15[i33 - 1] = iArr15[i33 - 1] + iArr15[i33];
                this.RemoteActionCompatParcelizer = i33 + 1;
                iArr15[i33] = iArr15[i33 - 1];
                return 0;
            case 28:
                int[] iArr16 = this.MediaSessionCompatQueueItem;
                int i34 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i34 + 1;
                iArr16[i34] = 128;
                return 0;
            case 29:
                int[] iArr17 = this.MediaSessionCompatQueueItem;
                int i35 = this.RemoteActionCompatParcelizer;
                iArr17[i35] = 40;
                iArr17[i35 + 1] = 0;
                int i36 = i35 + 1;
                this.RemoteActionCompatParcelizer = i36;
                iArr17[i35] = iArr17[i35] / iArr17[i36];
                return 0;
            case 30:
                int[] iArr18 = this.MediaSessionCompatQueueItem;
                int i37 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i37;
                this.serializer = iArr18[i37];
                return 0;
            case 31:
                int[] iArr19 = this.MediaSessionCompatQueueItem;
                int i38 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i38 + 1;
                iArr19[i38] = 14;
                return 0;
            case 32:
                int[] iArr20 = this.MediaSessionCompatQueueItem;
                int i39 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i39 + 1;
                iArr20[i39] = 72;
                return 0;
            case 33:
                int[] iArr21 = this.MediaSessionCompatQueueItem;
                int i40 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i40 + 1;
                iArr21[i40] = 0;
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                int[] iArr22 = this.MediaSessionCompatQueueItem;
                int i41 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i41 + 1;
                iArr22[i41] = 1;
                return 0;
            case 35:
                int i42 = this.RemoteActionCompatParcelizer;
                int i43 = i42 - 1;
                Object[] objArr8 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj5 = objArr8[i43];
                objArr8[i43] = null;
                objArr8[8] = obj5;
                this.RemoteActionCompatParcelizer = i42;
                objArr8[i43] = obj5;
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int i44 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i44;
                Object[] objArr9 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj6 = objArr9[i44];
                objArr9[i44] = null;
                objArr9[8] = obj6;
                return 0;
            case 37:
                Object[] objArr10 = this.MediaSessionCompatResultReceiverWrapper;
                int i45 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i45 + 1;
                objArr10[i45] = objArr10[8];
                return 0;
            case 38:
                Object[] objArr11 = this.MediaSessionCompatResultReceiverWrapper;
                int i46 = this.RemoteActionCompatParcelizer;
                objArr11[i46] = objArr11[5];
                this.RemoteActionCompatParcelizer = i46 + 2;
                objArr11[i46 + 1] = objArr11[6];
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                Object[] objArr12 = this.MediaSessionCompatResultReceiverWrapper;
                int i47 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i47 + 1;
                objArr12[i47] = null;
                return 0;
            case 40:
                int i48 = this.RemoteActionCompatParcelizer;
                int i49 = i48 - 1;
                Object[] objArr13 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj7 = objArr13[i49];
                objArr13[i49] = null;
                objArr13[6] = obj7;
                objArr13[i49] = objArr13[8];
                this.RemoteActionCompatParcelizer = i48 + 1;
                objArr13[i48] = objArr13[6];
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                Object[] objArr14 = this.MediaSessionCompatResultReceiverWrapper;
                int i50 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i50 + 1;
                objArr14[i50] = objArr14[7];
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int i51 = this.RemoteActionCompatParcelizer - 1;
                this.RemoteActionCompatParcelizer = i51;
                Object[] objArr15 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj8 = objArr15[i51];
                objArr15[i51] = null;
                objArr15[6] = obj8;
                return 0;
            case 43:
                Object[] objArr16 = this.MediaSessionCompatResultReceiverWrapper;
                int i52 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i52 + 1;
                objArr16[i52] = objArr16[6];
                return 0;
            case 44:
                int i53 = this.RemoteActionCompatParcelizer;
                int i54 = i53 - 1;
                this.RemoteActionCompatParcelizer = i54;
                int[] iArr23 = this.MediaSessionCompatQueueItem;
                iArr23[i53 - 2] = iArr23[i53 - 2] % iArr23[i54];
                int i55 = i53 - 2;
                this.RemoteActionCompatParcelizer = i55;
                this.MediaSessionCompatResultReceiverWrapper[i55] = null;
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                int[] iArr24 = this.MediaSessionCompatQueueItem;
                int i56 = this.RemoteActionCompatParcelizer;
                iArr24[i56] = 53;
                iArr24[i56 - 1] = iArr24[i56 - 1] + iArr24[i56];
                this.RemoteActionCompatParcelizer = i56 + 1;
                iArr24[i56] = iArr24[i56 - 1];
                return 0;
            case 46:
                Object[] objArr17 = this.MediaSessionCompatResultReceiverWrapper;
                int i57 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i57 + 1;
                objArr17[i57] = null;
                int[] iArr25 = this.MediaSessionCompatQueueItem;
                Object obj9 = objArr17[i57];
                objArr17[i57] = null;
                iArr25[i57] = ((int[]) obj9).length;
                this.RemoteActionCompatParcelizer = i57;
                objArr17[i57] = null;
                return 0;
            case 47:
                int[] iArr26 = this.MediaSessionCompatQueueItem;
                int i58 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i58 + 1;
                iArr26[i58] = 47;
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                int[] iArr27 = this.MediaSessionCompatQueueItem;
                int i59 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = i59 + 1;
                iArr27[i59] = 13;
                return 0;
            default:
                return i;
        }
    }

    public DropShadowEffect(Object obj, Object obj2, Object obj3) {
        this.MediaSessionCompatQueueItem = new int[9];
        this.MediaDescriptionCompat = new long[9];
        this.MediaMetadataCompat = new float[9];
        this.RatingCompat = new double[9];
        Object[] objArr = new Object[9];
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        objArr[5] = obj;
        objArr[6] = obj2;
        objArr[7] = obj3;
        this.RemoteActionCompatParcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public DropShadowEffect(Object obj) {
        this.MediaSessionCompatQueueItem = new int[9];
        this.MediaDescriptionCompat = new long[9];
        this.MediaMetadataCompat = new float[9];
        this.RatingCompat = new double[9];
        Object[] objArr = new Object[9];
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        objArr[5] = obj;
        this.RemoteActionCompatParcelizer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }
}
