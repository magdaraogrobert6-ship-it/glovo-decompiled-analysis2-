package o;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.qualtrics.digital.EmbeddedFeedbackUtils;

/* JADX INFO: loaded from: classes3.dex */
public class hasTimeRemaining {
    public int IconCompatParcelizer;
    public Object MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int MediaSessionCompatQueueItem;
    private final Object[] ParcelableVolumeInfo;
    public long RemoteActionCompatParcelizer;
    public Object read;
    public int serializer;
    public long write;
    private final int[] RatingCompat = new int[18];
    private final long[] MediaBrowserCompatMediaItem = new long[18];
    private final float[] MediaSessionCompatToken = new float[18];
    private final double[] PlaybackStateCompat = new double[18];

    public int read(int i) {
        switch (i) {
            case 1:
                int i2 = this.MediaSessionCompatQueueItem - this.serializer;
                this.MediaSessionCompatQueueItem = i2;
                this.MediaMetadataCompat = i2;
                return 0;
            case 2:
                Object[] objArr = this.ParcelableVolumeInfo;
                int i3 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.MediaDescriptionCompat = obj;
                return 0;
            case 3:
                long[] jArr = this.MediaBrowserCompatMediaItem;
                int i4 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i4 + 1;
                jArr[i4] = this.write;
                return 0;
            case 4:
                Object[] objArr2 = this.ParcelableVolumeInfo;
                int i5 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i5 + 1;
                objArr2[i5] = objArr2[5];
                return 0;
            case 5:
                int i6 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i6;
                long[] jArr2 = this.MediaBrowserCompatMediaItem;
                jArr2[6] = jArr2[i6];
                return 0;
            case 6:
                long[] jArr3 = this.MediaBrowserCompatMediaItem;
                int i7 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i7 + 1;
                jArr3[i7] = jArr3[6];
                return 0;
            case 7:
                int[] iArr = this.RatingCompat;
                int i8 = this.MediaSessionCompatQueueItem;
                iArr[i8] = 2;
                this.MediaSessionCompatQueueItem = i8 + 2;
                iArr[i8 + 1] = 2;
                return 0;
            case 8:
                int i9 = this.MediaSessionCompatQueueItem;
                int i10 = i9 - 1;
                this.MediaSessionCompatQueueItem = i10;
                int[] iArr2 = this.RatingCompat;
                iArr2[i9 - 2] = iArr2[i9 - 2] % iArr2[i10];
                int i11 = i9 - 2;
                this.MediaSessionCompatQueueItem = i11;
                this.ParcelableVolumeInfo[i11] = null;
                return 0;
            case 10:
                this.RemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem[this.MediaSessionCompatQueueItem - 1];
            case 9:
                return 0;
            case 11:
                int[] iArr3 = this.RatingCompat;
                int i12 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i12 + 1;
                iArr3[i12] = this.serializer;
                return 0;
            case 12:
                int[] iArr4 = this.RatingCompat;
                int i13 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i13 + 1;
                iArr4[i13] = 91;
                return 0;
            case 13:
                int i14 = this.MediaSessionCompatQueueItem;
                int i15 = i14 - 1;
                int[] iArr5 = this.RatingCompat;
                iArr5[i14 - 2] = iArr5[i14 - 2] + iArr5[i15];
                this.MediaSessionCompatQueueItem = i14;
                iArr5[i15] = iArr5[i14 - 2];
                return 0;
            case 14:
                int[] iArr6 = this.RatingCompat;
                int i16 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i16 + 1;
                iArr6[i16] = 128;
                return 0;
            case 15:
                int i17 = this.MediaSessionCompatQueueItem;
                int i18 = i17 - 1;
                this.MediaSessionCompatQueueItem = i18;
                int[] iArr7 = this.RatingCompat;
                iArr7[i17 - 2] = iArr7[i17 - 2] % iArr7[i18];
                return 0;
            case 16:
                int[] iArr8 = this.RatingCompat;
                int i19 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i19 + 1;
                this.IconCompatParcelizer = iArr8[i19];
                return 0;
            case 17:
                int i20 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i20;
                this.IconCompatParcelizer = this.RatingCompat[i20] != 0 ? 0 : 1;
                return 0;
            case 18:
                int[] iArr9 = this.RatingCompat;
                int i21 = this.MediaSessionCompatQueueItem;
                iArr9[i21] = 2;
                this.MediaSessionCompatQueueItem = i21;
                iArr9[i21 - 1] = iArr9[i21 - 1] % iArr9[i21];
                return 0;
            case 19:
                Object[] objArr3 = this.ParcelableVolumeInfo;
                int i22 = this.MediaSessionCompatQueueItem;
                Object obj2 = objArr3[i22 - 1];
                objArr3[i22 - 1] = null;
                this.MediaDescriptionCompat = obj2;
                return 0;
            case 20:
                Object[] objArr4 = this.ParcelableVolumeInfo;
                int i23 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i23 + 1;
                objArr4[i23] = null;
                return 0;
            case 21:
                int i24 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i24;
                this.ParcelableVolumeInfo[i24] = null;
                return 0;
            case 22:
                int[] iArr10 = this.RatingCompat;
                int i25 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i25;
                this.IconCompatParcelizer = iArr10[i25];
                return 0;
            case 23:
                int[] iArr11 = this.RatingCompat;
                int i26 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i26 + 1;
                iArr11[i26] = 1;
                return 0;
            case 24:
                for (int i27 = this.MediaSessionCompatQueueItem - 1; i27 >= 0; i27--) {
                    this.ParcelableVolumeInfo[i27] = null;
                }
                Object[] objArr5 = this.ParcelableVolumeInfo;
                this.MediaSessionCompatQueueItem = 1;
                objArr5[0] = this.read;
                return 0;
            case 25:
                int[] iArr12 = this.RatingCompat;
                int i28 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i28 + 1;
                iArr12[i28] = 2;
                return 0;
            case 26:
                int[] iArr13 = this.RatingCompat;
                int i29 = this.MediaSessionCompatQueueItem;
                iArr13[i29] = 83;
                this.MediaSessionCompatQueueItem = i29;
                iArr13[i29 - 1] = iArr13[i29 - 1] + iArr13[i29];
                return 0;
            case 27:
                int[] iArr14 = this.RatingCompat;
                int i30 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i30 + 1;
                iArr14[i30] = iArr14[i30 - 1];
                return 0;
            case 28:
                int i31 = this.MediaSessionCompatQueueItem;
                int i32 = i31 - 1;
                long[] jArr4 = this.MediaBrowserCompatMediaItem;
                long j = jArr4[i32];
                jArr4[6] = j;
                this.MediaSessionCompatQueueItem = i31;
                jArr4[i32] = j;
                return 0;
            case 29:
                int[] iArr15 = this.RatingCompat;
                int i33 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i33 + 1;
                iArr15[i33] = 0;
                return 0;
            case 30:
                int[] iArr16 = this.RatingCompat;
                int i34 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i34 + 1;
                iArr16[i34] = 1;
                return 0;
            case 31:
                int i35 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i35;
                long[] jArr5 = this.MediaBrowserCompatMediaItem;
                jArr5[9] = jArr5[i35];
                return 0;
            case 32:
                Object[] objArr6 = this.ParcelableVolumeInfo;
                int i36 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i36 + 1;
                objArr6[i36] = this.read;
                return 0;
            case 33:
                int i37 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i37;
                Object[] objArr7 = this.ParcelableVolumeInfo;
                Object obj3 = objArr7[i37];
                objArr7[i37] = null;
                objArr7[14] = obj3;
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                Object[] objArr8 = this.ParcelableVolumeInfo;
                int i38 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i38 + 1;
                objArr8[i38] = objArr8[14];
                return 0;
            case 35:
                int i39 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i39;
                Object[] objArr9 = this.ParcelableVolumeInfo;
                Object obj4 = objArr9[i39];
                objArr9[i39] = null;
                objArr9[15] = obj4;
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                this.ParcelableVolumeInfo[16] = this.read;
                return 0;
            case 37:
                Object[] objArr10 = this.ParcelableVolumeInfo;
                int i40 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i40 + 1;
                objArr10[i40] = objArr10[16];
                return 0;
            case 38:
                Object[] objArr11 = this.ParcelableVolumeInfo;
                int i41 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i41 + 1;
                objArr11[i41] = objArr11[15];
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                int i42 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i42;
                Object[] objArr12 = this.ParcelableVolumeInfo;
                Object obj5 = objArr12[i42];
                objArr12[i42] = null;
                objArr12[16] = obj5;
                return 0;
            case 40:
                Object[] objArr13 = this.ParcelableVolumeInfo;
                int i43 = this.MediaSessionCompatQueueItem;
                objArr13[i43] = objArr13[15];
                this.MediaSessionCompatQueueItem = i43 + 2;
                objArr13[i43 + 1] = objArr13[16];
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                Object[] objArr14 = this.ParcelableVolumeInfo;
                int i44 = this.MediaSessionCompatQueueItem;
                objArr14[i44] = null;
                this.MediaSessionCompatQueueItem = i44;
                Object obj6 = objArr14[i44];
                objArr14[i44] = null;
                objArr14[14] = obj6;
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int i45 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i45;
                Object[] objArr15 = this.ParcelableVolumeInfo;
                Object obj7 = objArr15[i45];
                objArr15[i45] = null;
                this.IconCompatParcelizer = obj7 == null ? 0 : 1;
                return 0;
            case 43:
                int i46 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i46;
                int[] iArr17 = this.RatingCompat;
                iArr17[13] = iArr17[i46];
                return 0;
            case 44:
                int[] iArr18 = this.RatingCompat;
                int i47 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i47 + 1;
                iArr18[i47] = iArr18[13];
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                int i48 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i48;
                this.IconCompatParcelizer = this.RatingCompat[i48] == 0 ? 0 : 1;
                return 0;
            case 46:
                this.ParcelableVolumeInfo[17] = this.read;
                return 0;
            case 47:
                Object[] objArr16 = this.ParcelableVolumeInfo;
                int i49 = this.MediaSessionCompatQueueItem;
                objArr16[i49] = objArr16[17];
                this.MediaSessionCompatQueueItem = i49 + 2;
                objArr16[i49 + 1] = objArr16[16];
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                Object[] objArr17 = this.ParcelableVolumeInfo;
                int i50 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i50 + 1;
                objArr17[i50] = objArr17[17];
                return 0;
            case 49:
                int i51 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i51;
                Object[] objArr18 = this.ParcelableVolumeInfo;
                Object obj8 = objArr18[i51];
                objArr18[i51] = null;
                objArr18[17] = obj8;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                Object[] objArr19 = this.ParcelableVolumeInfo;
                int i52 = this.MediaSessionCompatQueueItem;
                objArr19[i52] = objArr19[15];
                objArr19[i52 + 1] = objArr19[16];
                this.MediaSessionCompatQueueItem = i52 + 3;
                objArr19[i52 + 2] = objArr19[17];
                return 0;
            case 51:
                long[] jArr6 = this.MediaBrowserCompatMediaItem;
                int i53 = this.MediaSessionCompatQueueItem;
                jArr6[i53] = 1;
                this.MediaSessionCompatQueueItem = i53;
                jArr6[7] = jArr6[i53];
                return 0;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                int i54 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i54;
                int[] iArr19 = this.RatingCompat;
                iArr19[6] = iArr19[i54];
                return 0;
            case 53:
                int[] iArr20 = this.RatingCompat;
                int i55 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i55 + 1;
                iArr20[i55] = iArr20[6];
                return 0;
            case 54:
                long[] jArr7 = this.MediaBrowserCompatMediaItem;
                int i56 = this.MediaSessionCompatQueueItem;
                jArr7[i56 - 1] = this.RatingCompat[i56 - 1];
                int i57 = i56 - 1;
                jArr7[11] = jArr7[i57];
                this.MediaSessionCompatQueueItem = i56;
                jArr7[i57] = jArr7[7];
                return 0;
            case 55:
                long[] jArr8 = this.MediaBrowserCompatMediaItem;
                int i58 = this.MediaSessionCompatQueueItem;
                jArr8[i58] = jArr8[11];
                this.MediaSessionCompatQueueItem = i58;
                jArr8[i58 - 1] = jArr8[i58 - 1] * jArr8[i58];
                return 0;
            case 56:
                int i59 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i59;
                long[] jArr9 = this.MediaBrowserCompatMediaItem;
                jArr9[7] = jArr9[i59];
                return 0;
            case 57:
                long[] jArr10 = this.MediaBrowserCompatMediaItem;
                int i60 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i60 + 1;
                jArr10[i60] = jArr10[7];
                return 0;
            case 58:
                long[] jArr11 = this.MediaBrowserCompatMediaItem;
                int i61 = this.MediaSessionCompatQueueItem;
                jArr11[i61] = 0;
                this.MediaSessionCompatQueueItem = i61;
                this.RatingCompat[i61 - 1] = (jArr11[i61 - 1] > jArr11[i61] ? 1 : (jArr11[i61 - 1] == jArr11[i61] ? 0 : -1));
                return 0;
            case 59:
                long[] jArr12 = this.MediaBrowserCompatMediaItem;
                int i62 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i62 + 1;
                jArr12[i62] = jArr12[9];
                return 0;
            case 60:
                int i63 = this.MediaSessionCompatQueueItem;
                int i64 = i63 - 1;
                Object[] objArr20 = this.ParcelableVolumeInfo;
                Object obj9 = objArr20[i64];
                objArr20[i64] = null;
                objArr20[16] = obj9;
                this.MediaSessionCompatQueueItem = i63;
                objArr20[i64] = obj9;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                int i65 = this.MediaSessionCompatQueueItem;
                int i66 = i65 - 1;
                Object[] objArr21 = this.ParcelableVolumeInfo;
                objArr21[i66] = null;
                this.MediaSessionCompatQueueItem = i65;
                objArr21[i66] = objArr21[16];
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                Object[] objArr22 = this.ParcelableVolumeInfo;
                int i67 = this.MediaSessionCompatQueueItem;
                objArr22[i67] = objArr22[14];
                objArr22[i67 + 1] = objArr22[15];
                this.MediaSessionCompatQueueItem = i67 + 3;
                objArr22[i67 + 2] = objArr22[16];
                return 0;
            case 63:
                int[] iArr21 = this.RatingCompat;
                int i68 = this.MediaSessionCompatQueueItem;
                iArr21[i68] = 67;
                this.MediaSessionCompatQueueItem = i68;
                iArr21[i68 - 1] = iArr21[i68 - 1] + iArr21[i68];
                return 0;
            case 64:
                int[] iArr22 = this.RatingCompat;
                int i69 = this.MediaSessionCompatQueueItem;
                iArr22[i69] = iArr22[i69 - 1];
                iArr22[i69 + 1] = 128;
                int i70 = i69 + 1;
                this.MediaSessionCompatQueueItem = i70;
                iArr22[i69] = iArr22[i69] % iArr22[i70];
                return 0;
            case 65:
                int[] iArr23 = this.RatingCompat;
                int i71 = this.MediaSessionCompatQueueItem;
                iArr23[i71] = 9;
                iArr23[i71 - 1] = iArr23[i71 - 1] + iArr23[i71];
                this.MediaSessionCompatQueueItem = i71 + 1;
                iArr23[i71] = iArr23[i71 - 1];
                return 0;
            case 66:
                int[] iArr24 = this.RatingCompat;
                int i72 = this.MediaSessionCompatQueueItem;
                iArr24[i72] = 128;
                this.MediaSessionCompatQueueItem = i72;
                iArr24[i72 - 1] = iArr24[i72 - 1] % iArr24[i72];
                return 0;
            case 67:
                long[] jArr13 = this.MediaBrowserCompatMediaItem;
                int i73 = this.MediaSessionCompatQueueItem;
                jArr13[i73 - 1] = this.RatingCompat[i73 - 1];
                return 0;
            case 68:
                int i74 = this.MediaSessionCompatQueueItem;
                int i75 = i74 - 1;
                long[] jArr14 = this.MediaBrowserCompatMediaItem;
                jArr14[11] = jArr14[i75];
                this.MediaSessionCompatQueueItem = i74;
                jArr14[i75] = jArr14[7];
                return 0;
            case 69:
                long[] jArr15 = this.MediaBrowserCompatMediaItem;
                int i76 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i76 + 1;
                jArr15[i76] = jArr15[11];
                return 0;
            case 70:
                int i77 = this.MediaSessionCompatQueueItem;
                int i78 = i77 - 1;
                this.MediaSessionCompatQueueItem = i78;
                long[] jArr16 = this.MediaBrowserCompatMediaItem;
                jArr16[i77 - 2] = jArr16[i77 - 2] * jArr16[i78];
                return 0;
            case 71:
                int[] iArr25 = this.RatingCompat;
                int i79 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i79 + 1;
                iArr25[i79] = 59;
                return 0;
            case 72:
                int i80 = this.MediaSessionCompatQueueItem;
                int i81 = i80 - 1;
                int[] iArr26 = this.RatingCompat;
                iArr26[i80 - 2] = iArr26[i80 - 2] + iArr26[i81];
                iArr26[i81] = iArr26[i80 - 2];
                this.MediaSessionCompatQueueItem = i80 + 1;
                iArr26[i80] = 128;
                return 0;
            case 73:
                int[] iArr27 = this.RatingCompat;
                int i82 = this.MediaSessionCompatQueueItem;
                iArr27[i82] = 77;
                iArr27[i82 - 1] = iArr27[i82 - 1] + iArr27[i82];
                this.MediaSessionCompatQueueItem = i82 + 1;
                iArr27[i82] = iArr27[i82 - 1];
                return 0;
            case 74:
                Object[] objArr23 = this.ParcelableVolumeInfo;
                int i83 = this.MediaSessionCompatQueueItem;
                objArr23[i83] = objArr23[14];
                this.MediaSessionCompatQueueItem = i83;
                Object obj10 = objArr23[i83];
                objArr23[i83] = null;
                objArr23[15] = obj10;
                return 0;
            case 75:
                int[] iArr28 = this.RatingCompat;
                int i84 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i84 + 1;
                iArr28[i84] = 25;
                return 0;
            case 76:
                int[] iArr29 = this.RatingCompat;
                int i85 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i85 + 1;
                iArr29[i85] = 0;
                return 0;
            case 77:
                int i86 = this.MediaSessionCompatQueueItem;
                int i87 = i86 - 1;
                this.MediaSessionCompatQueueItem = i87;
                int[] iArr30 = this.RatingCompat;
                iArr30[i86 - 2] = iArr30[i86 - 2] / iArr30[i87];
                int i88 = i86 - 2;
                this.MediaSessionCompatQueueItem = i88;
                this.ParcelableVolumeInfo[i88] = null;
                return 0;
            case 78:
                int[] iArr31 = this.RatingCompat;
                int i89 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i89 + 1;
                iArr31[i89] = 75;
                return 0;
            case 79:
                int[] iArr32 = this.RatingCompat;
                int i90 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i90 + 1;
                iArr32[i90] = 65;
                return 0;
            case 80:
                int[] iArr33 = this.RatingCompat;
                int i91 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i91 + 1;
                iArr33[i91] = 43;
                return 0;
            case 81:
                int[] iArr34 = this.RatingCompat;
                int i92 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i92 + 1;
                iArr34[i92] = 53;
                return 0;
            case 82:
                int i93 = this.MediaSessionCompatQueueItem;
                int i94 = i93 - 1;
                Object[] objArr24 = this.ParcelableVolumeInfo;
                Object obj11 = objArr24[i94];
                objArr24[i94] = null;
                objArr24[8] = obj11;
                this.MediaSessionCompatQueueItem = i93;
                objArr24[i94] = obj11;
                return 0;
            case 83:
                int i95 = this.MediaSessionCompatQueueItem - 1;
                this.MediaSessionCompatQueueItem = i95;
                Object[] objArr25 = this.ParcelableVolumeInfo;
                Object obj12 = objArr25[i95];
                objArr25[i95] = null;
                objArr25[8] = obj12;
                return 0;
            case 84:
                Object[] objArr26 = this.ParcelableVolumeInfo;
                int i96 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i96 + 1;
                objArr26[i96] = objArr26[8];
                return 0;
            case 85:
                int[] iArr35 = this.RatingCompat;
                int i97 = this.MediaSessionCompatQueueItem;
                iArr35[i97] = 2;
                iArr35[i97 + 1] = 2;
                int i98 = i97 + 1;
                this.MediaSessionCompatQueueItem = i98;
                iArr35[i97] = iArr35[i97] % iArr35[i98];
                return 0;
            case 86:
                int[] iArr36 = this.RatingCompat;
                int i99 = this.MediaSessionCompatQueueItem;
                iArr36[i99] = 37;
                iArr36[i99 - 1] = iArr36[i99 - 1] + iArr36[i99];
                this.MediaSessionCompatQueueItem = i99 + 1;
                iArr36[i99] = iArr36[i99 - 1];
                return 0;
            case 87:
                int[] iArr37 = this.RatingCompat;
                int i100 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i100 + 1;
                iArr37[i100] = 101;
                return 0;
            case 88:
                int i101 = this.MediaSessionCompatQueueItem;
                int i102 = i101 - 1;
                this.MediaSessionCompatQueueItem = i102;
                int[] iArr38 = this.RatingCompat;
                iArr38[i101 - 2] = iArr38[i101 - 2] + iArr38[i102];
                return 0;
            case 89:
                int[] iArr39 = this.RatingCompat;
                int i103 = this.MediaSessionCompatQueueItem;
                iArr39[i103] = iArr39[i103 - 1];
                this.MediaSessionCompatQueueItem = i103 + 2;
                iArr39[i103 + 1] = 128;
                return 0;
            case 90:
                int[] iArr40 = this.RatingCompat;
                int i104 = this.MediaSessionCompatQueueItem;
                iArr40[i104] = 2;
                this.MediaSessionCompatQueueItem = i104;
                iArr40[i104 - 1] = iArr40[i104 - 1] % iArr40[i104];
                int i105 = i104 - 1;
                this.MediaSessionCompatQueueItem = i105;
                this.ParcelableVolumeInfo[i105] = null;
                return 0;
            case 91:
                int[] iArr41 = this.RatingCompat;
                int i106 = this.MediaSessionCompatQueueItem;
                iArr41[i106] = 77;
                this.MediaSessionCompatQueueItem = i106;
                iArr41[i106 - 1] = iArr41[i106 - 1] + iArr41[i106];
                return 0;
            case 92:
                int[] iArr42 = this.RatingCompat;
                int i107 = this.MediaSessionCompatQueueItem;
                this.MediaSessionCompatQueueItem = i107 + 1;
                iArr42[i107] = 115;
                return 0;
            default:
                return i;
        }
    }

    public hasTimeRemaining(Object obj) {
        Object[] objArr = new Object[18];
        this.ParcelableVolumeInfo = objArr;
        objArr[5] = obj;
        this.MediaSessionCompatQueueItem = 0;
        this.MediaMetadataCompat = -1;
    }
}
