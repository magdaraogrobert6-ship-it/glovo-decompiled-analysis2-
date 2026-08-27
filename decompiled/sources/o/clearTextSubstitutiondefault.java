package o;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.mapbox.common.logger.LogPriority;
import com.qualtrics.digital.EmbeddedFeedbackUtils;

/* JADX INFO: loaded from: classes3.dex */
public class clearTextSubstitutiondefault {
    public int IconCompatParcelizer;
    private final float[] MediaBrowserCompatMediaItem;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final long[] MediaSessionCompatQueueItem;
    private final Object[] MediaSessionCompatResultReceiverWrapper;
    private final double[] PlaybackStateCompatCustomAction;
    private final int[] RatingCompat;
    public int RemoteActionCompatParcelizer;
    public long read;
    public Object serializer;
    public Object write;

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaSessionCompatResultReceiverWrapper;
                int i2 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i2 + 1;
                objArr[i2] = objArr[12];
                return 0;
            case 2:
                int i3 = this.MediaMetadataCompat - this.RemoteActionCompatParcelizer;
                this.MediaMetadataCompat = i3;
                this.MediaDescriptionCompat = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaSessionCompatResultReceiverWrapper;
                int i4 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.write = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaSessionCompatResultReceiverWrapper;
                int i5 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i5 + 1;
                objArr3[i5] = this.serializer;
                return 0;
            case 5:
                int i6 = this.MediaMetadataCompat;
                int i7 = i6 - 1;
                Object[] objArr4 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj2 = objArr4[i7];
                objArr4[i7] = null;
                objArr4[12] = obj2;
                this.MediaMetadataCompat = i6;
                objArr4[i7] = obj2;
                return 0;
            case 6:
                int[] iArr = this.RatingCompat;
                int i8 = this.MediaMetadataCompat;
                iArr[i8] = 2;
                iArr[i8 + 1] = 2;
                int i9 = i8 + 1;
                this.MediaMetadataCompat = i9;
                iArr[i8] = iArr[i8] % iArr[i9];
                return 0;
            case 7:
                int i10 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i10;
                this.MediaSessionCompatResultReceiverWrapper[i10] = null;
                return 0;
            case 8:
                Object[] objArr5 = this.MediaSessionCompatResultReceiverWrapper;
                int i11 = this.MediaMetadataCompat;
                Object obj3 = objArr5[i11 - 1];
                objArr5[i11 - 1] = null;
                this.write = obj3;
                return 0;
            case 10:
                int[] iArr2 = this.RatingCompat;
                int i12 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i12 + 1;
                iArr2[i12] = this.RemoteActionCompatParcelizer;
            case 9:
                return 0;
            case 11:
                int[] iArr3 = this.RatingCompat;
                int i13 = this.MediaMetadataCompat;
                iArr3[i13] = 3;
                this.MediaMetadataCompat = i13;
                iArr3[i13 - 1] = iArr3[i13 - 1] + iArr3[i13];
                return 0;
            case 12:
                int[] iArr4 = this.RatingCompat;
                int i14 = this.MediaMetadataCompat;
                iArr4[i14] = iArr4[i14 - 1];
                iArr4[i14 + 1] = 128;
                int i15 = i14 + 1;
                this.MediaMetadataCompat = i15;
                iArr4[i14] = iArr4[i14] % iArr4[i15];
                return 0;
            case 13:
                int[] iArr5 = this.RatingCompat;
                int i16 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i16 + 1;
                this.IconCompatParcelizer = iArr5[i16];
                return 0;
            case 14:
                int i17 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i17;
                this.IconCompatParcelizer = this.RatingCompat[i17] != 0 ? 0 : 1;
                return 0;
            case 15:
                int[] iArr6 = this.RatingCompat;
                int i18 = this.MediaMetadataCompat;
                iArr6[i18] = 2;
                this.MediaMetadataCompat = i18;
                iArr6[i18 - 1] = iArr6[i18 - 1] % iArr6[i18];
                return 0;
            case 16:
                Object[] objArr6 = this.MediaSessionCompatResultReceiverWrapper;
                int i19 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i19 + 1;
                objArr6[i19] = null;
                return 0;
            case 17:
                int[] iArr7 = this.RatingCompat;
                int i20 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i20 + 1;
                iArr7[i20] = 9;
                return 0;
            case 18:
                int i21 = this.MediaMetadataCompat;
                int i22 = i21 - 1;
                int[] iArr8 = this.RatingCompat;
                iArr8[i21 - 2] = iArr8[i21 - 2] + iArr8[i22];
                this.MediaMetadataCompat = i21;
                iArr8[i22] = iArr8[i21 - 2];
                return 0;
            case 19:
                int[] iArr9 = this.RatingCompat;
                int i23 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i23 + 1;
                iArr9[i23] = 128;
                return 0;
            case 20:
                int i24 = this.MediaMetadataCompat;
                int i25 = i24 - 1;
                this.MediaMetadataCompat = i25;
                int[] iArr10 = this.RatingCompat;
                iArr10[i24 - 2] = iArr10[i24 - 2] % iArr10[i25];
                return 0;
            case 21:
                int[] iArr11 = this.RatingCompat;
                int i26 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i26;
                this.IconCompatParcelizer = iArr11[i26];
                return 0;
            case 22:
                int[] iArr12 = this.RatingCompat;
                int i27 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i27 + 1;
                iArr12[i27] = 0;
                return 0;
            case 23:
                int[] iArr13 = this.RatingCompat;
                int i28 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i28 + 1;
                iArr13[i28] = 1;
                return 0;
            case 24:
                for (int i29 = this.MediaMetadataCompat - 1; i29 >= 0; i29--) {
                    this.MediaSessionCompatResultReceiverWrapper[i29] = null;
                }
                Object[] objArr7 = this.MediaSessionCompatResultReceiverWrapper;
                this.MediaMetadataCompat = 1;
                objArr7[0] = this.serializer;
                return 0;
            case 25:
                int i30 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i30;
                Object[] objArr8 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj4 = objArr8[i30];
                objArr8[i30] = null;
                objArr8[12] = obj4;
                return 0;
            case 26:
                int[] iArr14 = this.RatingCompat;
                int i31 = this.MediaMetadataCompat;
                iArr14[i31] = 47;
                this.MediaMetadataCompat = i31;
                iArr14[i31 - 1] = iArr14[i31 - 1] + iArr14[i31];
                return 0;
            case 27:
                int[] iArr15 = this.RatingCompat;
                int i32 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i32 + 1;
                iArr15[i32] = 2;
                return 0;
            case 28:
                int[] iArr16 = this.RatingCompat;
                int i33 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i33 + 1;
                iArr16[i33] = 81;
                return 0;
            case 29:
                int i34 = this.MediaMetadataCompat;
                int i35 = i34 - 1;
                this.MediaMetadataCompat = i35;
                int[] iArr17 = this.RatingCompat;
                iArr17[i34 - 2] = iArr17[i34 - 2] + iArr17[i35];
                return 0;
            case 30:
                int[] iArr18 = this.RatingCompat;
                int i36 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i36 + 1;
                iArr18[i36] = iArr18[i36 - 1];
                return 0;
            case 31:
                int i37 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i37;
                this.IconCompatParcelizer = this.RatingCompat[i37] == 0 ? 0 : 1;
                return 0;
            case 32:
                int[] iArr19 = this.RatingCompat;
                int i38 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i38 + 1;
                iArr19[i38] = 113;
                return 0;
            case 33:
                int[] iArr20 = this.RatingCompat;
                int i39 = this.MediaMetadataCompat;
                iArr20[i39] = 128;
                this.MediaMetadataCompat = i39;
                iArr20[i39 - 1] = iArr20[i39 - 1] % iArr20[i39];
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                int[] iArr21 = this.RatingCompat;
                int i40 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i40 + 1;
                iArr21[i40] = 94;
                return 0;
            case 35:
                int[] iArr22 = this.RatingCompat;
                int i41 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i41 + 1;
                iArr22[i41] = 0;
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int i42 = this.MediaMetadataCompat;
                int i43 = i42 - 1;
                this.MediaMetadataCompat = i43;
                int[] iArr23 = this.RatingCompat;
                iArr23[i42 - 2] = iArr23[i42 - 2] / iArr23[i43];
                return 0;
            case 37:
                int[] iArr24 = this.RatingCompat;
                int i44 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i44 + 1;
                iArr24[i44] = 65;
                return 0;
            case 38:
                int[] iArr25 = this.RatingCompat;
                int i45 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i45 + 1;
                iArr25[i45] = 28;
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                int[] iArr26 = this.RatingCompat;
                int i46 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i46 + 1;
                iArr26[i46] = 37;
                return 0;
            case 40:
                int i47 = this.MediaMetadataCompat;
                int i48 = i47 - 1;
                this.MediaMetadataCompat = i48;
                int[] iArr27 = this.RatingCompat;
                iArr27[i47 - 2] = iArr27[i47 - 2] % iArr27[i48];
                int i49 = i47 - 2;
                this.MediaMetadataCompat = i49;
                this.MediaSessionCompatResultReceiverWrapper[i49] = null;
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                int[] iArr28 = this.RatingCompat;
                int i50 = this.MediaMetadataCompat;
                iArr28[i50] = 93;
                iArr28[i50 - 1] = iArr28[i50 - 1] + iArr28[i50];
                this.MediaMetadataCompat = i50 + 1;
                iArr28[i50] = iArr28[i50 - 1];
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int[] iArr29 = this.RatingCompat;
                int i51 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i51 + 1;
                iArr29[i51] = 35;
                return 0;
            case 43:
                int i52 = this.MediaMetadataCompat;
                int i53 = i52 - 1;
                int[] iArr30 = this.RatingCompat;
                iArr30[i52 - 2] = iArr30[i52 - 2] + iArr30[i53];
                iArr30[i53] = iArr30[i52 - 2];
                this.MediaMetadataCompat = i52 + 1;
                iArr30[i52] = 128;
                return 0;
            case 44:
                int[] iArr31 = this.RatingCompat;
                int i54 = this.MediaMetadataCompat;
                iArr31[i54] = 75;
                this.MediaMetadataCompat = i54;
                iArr31[i54 - 1] = iArr31[i54 - 1] + iArr31[i54];
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                int[] iArr32 = this.RatingCompat;
                int i55 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i55 + 1;
                iArr32[i55] = 59;
                return 0;
            case 46:
                int[] iArr33 = this.RatingCompat;
                int i56 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i56 + 1;
                iArr33[i56] = 33;
                return 0;
            case 47:
                int[] iArr34 = this.RatingCompat;
                int i57 = this.MediaMetadataCompat;
                iArr34[i57] = 125;
                this.MediaMetadataCompat = i57;
                iArr34[i57 - 1] = iArr34[i57 - 1] + iArr34[i57];
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                int i58 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i58;
                Object[] objArr9 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj5 = objArr9[i58];
                objArr9[i58] = null;
                objArr9[13] = obj5;
                return 0;
            case 49:
                Object[] objArr10 = this.MediaSessionCompatResultReceiverWrapper;
                int i59 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i59 + 1;
                objArr10[i59] = objArr10[13];
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                int i60 = this.MediaMetadataCompat;
                int i61 = i60 - 1;
                Object[] objArr11 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj6 = objArr11[i61];
                objArr11[i61] = null;
                objArr11[13] = obj6;
                this.MediaMetadataCompat = i60;
                objArr11[i61] = obj6;
                return 0;
            case 51:
                int[] iArr35 = this.RatingCompat;
                int i62 = this.MediaMetadataCompat;
                iArr35[i62] = 21;
                iArr35[i62 - 1] = iArr35[i62 - 1] + iArr35[i62];
                this.MediaMetadataCompat = i62 + 1;
                iArr35[i62] = iArr35[i62 - 1];
                return 0;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                int[] iArr36 = this.RatingCompat;
                int i63 = this.MediaMetadataCompat;
                Object[] objArr12 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj7 = objArr12[i63 - 1];
                objArr12[i63 - 1] = null;
                iArr36[i63 - 1] = ((int[]) obj7).length;
                int i64 = i63 - 1;
                this.MediaMetadataCompat = i64;
                objArr12[i64] = null;
                return 0;
            case 53:
                int[] iArr37 = this.RatingCompat;
                int i65 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i65 + 1;
                iArr37[i65] = 29;
                return 0;
            case 54:
                int[] iArr38 = this.RatingCompat;
                int i66 = this.MediaMetadataCompat;
                iArr38[i66] = 119;
                this.MediaMetadataCompat = i66;
                iArr38[i66 - 1] = iArr38[i66 - 1] + iArr38[i66];
                return 0;
            case 55:
                int[] iArr39 = this.RatingCompat;
                int i67 = this.MediaMetadataCompat;
                iArr39[i67] = iArr39[i67 - 1];
                this.MediaMetadataCompat = i67 + 2;
                iArr39[i67 + 1] = 128;
                return 0;
            case 56:
                Object[] objArr13 = this.MediaSessionCompatResultReceiverWrapper;
                int i68 = this.MediaMetadataCompat;
                objArr13[i68] = objArr13[12];
                int[] iArr40 = this.RatingCompat;
                this.MediaMetadataCompat = i68 + 2;
                iArr40[i68 + 1] = 1;
                return 0;
            case 57:
                int[] iArr41 = this.RatingCompat;
                int i69 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i69 + 1;
                iArr41[i69] = 55;
                return 0;
            case 58:
                int i70 = this.MediaMetadataCompat;
                int i71 = i70 - 1;
                Object[] objArr14 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj8 = objArr14[i71];
                objArr14[i71] = null;
                objArr14[14] = obj8;
                this.MediaMetadataCompat = i70;
                objArr14[i71] = obj8;
                return 0;
            case 59:
                int i72 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i72;
                Object[] objArr15 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj9 = objArr15[i72];
                objArr15[i72] = null;
                objArr15[14] = obj9;
                return 0;
            case 60:
                Object[] objArr16 = this.MediaSessionCompatResultReceiverWrapper;
                int i73 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i73 + 1;
                objArr16[i73] = objArr16[14];
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                int i74 = this.MediaMetadataCompat;
                int i75 = i74 - 1;
                Object[] objArr17 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj10 = objArr17[i75];
                objArr17[i75] = null;
                objArr17[15] = obj10;
                this.MediaMetadataCompat = i74;
                objArr17[i75] = null;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                int i76 = this.MediaMetadataCompat;
                int i77 = i76 - 1;
                Object[] objArr18 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj11 = objArr18[i77];
                objArr18[i77] = null;
                objArr18[14] = obj11;
                this.MediaMetadataCompat = i76;
                objArr18[i77] = objArr18[15];
                return 0;
            case 63:
                int i78 = this.MediaMetadataCompat;
                int i79 = i78 - 1;
                Object[] objArr19 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj12 = objArr19[i79];
                objArr19[i79] = null;
                objArr19[15] = obj12;
                this.MediaMetadataCompat = i78;
                objArr19[i79] = obj12;
                return 0;
            case 64:
                int i80 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i80;
                Object[] objArr20 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj13 = objArr20[i80];
                objArr20[i80] = null;
                this.IconCompatParcelizer = obj13 == null ? 0 : 1;
                return 0;
            case 65:
                int i81 = this.MediaMetadataCompat;
                int i82 = i81 - 1;
                Object[] objArr21 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj14 = objArr21[i82];
                objArr21[i82] = null;
                objArr21[16] = obj14;
                this.MediaMetadataCompat = i81;
                objArr21[i82] = obj14;
                return 0;
            case 66:
                int i83 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i83;
                Object[] objArr22 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj15 = objArr22[i83];
                objArr22[i83] = null;
                objArr22[16] = obj15;
                return 0;
            case 67:
                Object[] objArr23 = this.MediaSessionCompatResultReceiverWrapper;
                int i84 = this.MediaMetadataCompat;
                objArr23[i84] = objArr23[14];
                objArr23[i84 + 1] = objArr23[15];
                this.MediaMetadataCompat = i84 + 3;
                objArr23[i84 + 2] = objArr23[16];
                return 0;
            case 68:
                int i85 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i85;
                Object[] objArr24 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj16 = objArr24[i85];
                objArr24[i85] = null;
                objArr24[15] = obj16;
                return 0;
            case 69:
                int i86 = this.MediaMetadataCompat;
                int i87 = i86 - 1;
                Object[] objArr25 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj17 = objArr25[i87];
                objArr25[i87] = null;
                objArr25[16] = obj17;
                this.MediaMetadataCompat = i86;
                objArr25[i87] = objArr25[14];
                return 0;
            case 70:
                int i88 = this.MediaMetadataCompat;
                int i89 = i88 - 1;
                Object[] objArr26 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj18 = objArr26[i89];
                objArr26[i89] = null;
                objArr26[17] = obj18;
                this.MediaMetadataCompat = i88;
                objArr26[i89] = objArr26[14];
                return 0;
            case 71:
                int i90 = this.MediaMetadataCompat;
                int i91 = i90 - 1;
                Object[] objArr27 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj19 = objArr27[i91];
                objArr27[i91] = null;
                objArr27[15] = obj19;
                this.MediaMetadataCompat = i90;
                objArr27[i91] = objArr27[17];
                return 0;
            case 72:
                Object[] objArr28 = this.MediaSessionCompatResultReceiverWrapper;
                int i92 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i92 + 1;
                objArr28[i92] = objArr28[17];
                return 0;
            case 73:
                int i93 = this.MediaMetadataCompat;
                int i94 = i93 - 1;
                int[] iArr42 = this.RatingCompat;
                iArr42[13] = iArr42[i94];
                Object[] objArr29 = this.MediaSessionCompatResultReceiverWrapper;
                objArr29[i94] = objArr29[14];
                int i95 = i93 - 1;
                this.MediaMetadataCompat = i95;
                Object obj20 = objArr29[i95];
                objArr29[i95] = null;
                objArr29[15] = obj20;
                return 0;
            case 74:
                int[] iArr43 = this.RatingCompat;
                int i96 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i96 + 1;
                iArr43[i96] = iArr43[13];
                return 0;
            case 75:
                Object[] objArr30 = this.MediaSessionCompatResultReceiverWrapper;
                int i97 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i97 + 1;
                objArr30[i97] = objArr30[16];
                return 0;
            case 76:
                int i98 = this.MediaMetadataCompat;
                int i99 = i98 - 1;
                int[] iArr44 = this.RatingCompat;
                iArr44[13] = iArr44[i99];
                Object[] objArr31 = this.MediaSessionCompatResultReceiverWrapper;
                this.MediaMetadataCompat = i98;
                objArr31[i99] = objArr31[14];
                return 0;
            case 77:
                int i100 = this.MediaMetadataCompat;
                int i101 = i100 - 1;
                Object[] objArr32 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj21 = objArr32[i101];
                objArr32[i101] = null;
                objArr32[15] = obj21;
                int[] iArr45 = this.RatingCompat;
                this.MediaMetadataCompat = i100;
                iArr45[i101] = iArr45[13];
                return 0;
            case 78:
                int i102 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i102;
                this.IconCompatParcelizer = this.RatingCompat[i102] <= 0 ? 0 : 1;
                return 0;
            case 79:
                int i103 = this.MediaMetadataCompat;
                int i104 = i103 - 1;
                this.MediaSessionCompatResultReceiverWrapper[i104] = null;
                int[] iArr46 = this.RatingCompat;
                this.MediaMetadataCompat = i103;
                iArr46[i104] = 1;
                return 0;
            case 80:
                int i105 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i105;
                Object[] objArr33 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj22 = objArr33[i105];
                objArr33[i105] = null;
                objArr33[17] = obj22;
                return 0;
            case 81:
                Object[] objArr34 = this.MediaSessionCompatResultReceiverWrapper;
                int i106 = this.MediaMetadataCompat;
                objArr34[i106] = objArr34[17];
                int[] iArr47 = this.RatingCompat;
                this.MediaMetadataCompat = i106 + 2;
                iArr47[i106 + 1] = 0;
                return 0;
            case 82:
                int i107 = this.MediaMetadataCompat;
                int i108 = i107 - 3;
                this.MediaMetadataCompat = i108;
                Object[] objArr35 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj23 = objArr35[i108];
                objArr35[i108] = null;
                int i109 = this.RatingCompat[i107 - 2];
                Object obj24 = objArr35[i107 - 1];
                objArr35[i107 - 1] = null;
                ((Object[]) obj23)[i109] = obj24;
                this.MediaMetadataCompat = i107 - 2;
                objArr35[i108] = objArr35[16];
                return 0;
            case 83:
                Object[] objArr36 = this.MediaSessionCompatResultReceiverWrapper;
                int i110 = this.MediaMetadataCompat;
                objArr36[i110] = objArr36[17];
                int[] iArr48 = this.RatingCompat;
                this.MediaMetadataCompat = i110 + 2;
                iArr48[i110 + 1] = 6;
                return 0;
            case 84:
                Object[] objArr37 = this.MediaSessionCompatResultReceiverWrapper;
                int i111 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i111 + 1;
                objArr37[i111] = objArr37[15];
                return 0;
            case 85:
                int i112 = this.MediaMetadataCompat;
                int i113 = i112 - 1;
                Object[] objArr38 = this.MediaSessionCompatResultReceiverWrapper;
                objArr38[i113] = null;
                this.MediaMetadataCompat = i112;
                objArr38[i113] = objArr38[16];
                return 0;
            case 86:
                int i114 = this.MediaMetadataCompat;
                int i115 = i114 - 1;
                Object[] objArr39 = this.MediaSessionCompatResultReceiverWrapper;
                objArr39[i115] = null;
                objArr39[i115] = objArr39[16];
                int[] iArr49 = this.RatingCompat;
                this.MediaMetadataCompat = i114 + 1;
                iArr49[i114] = 8;
                return 0;
            case 87:
                int i116 = this.MediaMetadataCompat;
                int i117 = i116 - 1;
                Object[] objArr40 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj25 = objArr40[i117];
                objArr40[i117] = null;
                objArr40[15] = obj25;
                int[] iArr50 = this.RatingCompat;
                this.MediaMetadataCompat = i116;
                iArr50[i117] = 22;
                return 0;
            case 88:
                int i118 = this.MediaMetadataCompat;
                int i119 = i118 - 1;
                Object[] objArr41 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj26 = objArr41[i119];
                objArr41[i119] = null;
                objArr41[17] = obj26;
                objArr41[i119] = objArr41[16];
                this.MediaMetadataCompat = i118 + 1;
                objArr41[i118] = objArr41[15];
                return 0;
            case 89:
                int i120 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i120;
                Object[] objArr42 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj27 = objArr42[i120];
                objArr42[i120] = null;
                objArr42[19] = obj27;
                return 0;
            case 90:
                Object[] objArr43 = this.MediaSessionCompatResultReceiverWrapper;
                int i121 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i121 + 1;
                objArr43[i121] = objArr43[19];
                return 0;
            case 91:
                int i122 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i122;
                Object[] objArr44 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj28 = objArr44[i122];
                objArr44[i122] = null;
                objArr44[20] = obj28;
                return 0;
            case 92:
                int i123 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i123;
                Object[] objArr45 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj29 = objArr45[i123];
                objArr45[i123] = null;
                this.IconCompatParcelizer = obj29 != null ? 0 : 1;
                return 0;
            case 93:
                int i124 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i124;
                Object[] objArr46 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj30 = objArr46[i124];
                objArr46[i124] = null;
                objArr46[18] = obj30;
                return 0;
            case 94:
                int i125 = this.MediaMetadataCompat;
                int i126 = i125 - 1;
                Object[] objArr47 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj31 = objArr47[i126];
                objArr47[i126] = null;
                objArr47[17] = obj31;
                this.MediaMetadataCompat = i125;
                objArr47[i126] = objArr47[18];
                return 0;
            case 95:
                Object[] objArr48 = this.MediaSessionCompatResultReceiverWrapper;
                int i127 = this.MediaMetadataCompat;
                objArr48[i127] = objArr48[19];
                this.MediaMetadataCompat = i127;
                Object obj32 = objArr48[i127];
                objArr48[i127] = null;
                objArr48[17] = obj32;
                return 0;
            case 96:
                Object[] objArr49 = this.MediaSessionCompatResultReceiverWrapper;
                int i128 = this.MediaMetadataCompat;
                objArr49[i128] = null;
                objArr49[i128 + 1] = null;
                long[] jArr = this.MediaSessionCompatQueueItem;
                this.MediaMetadataCompat = i128 + 3;
                jArr[i128 + 2] = 0;
                return 0;
            case 97:
                int[] iArr51 = this.RatingCompat;
                int i129 = this.MediaMetadataCompat;
                iArr51[i129] = 0;
                Object[] objArr50 = this.MediaSessionCompatResultReceiverWrapper;
                objArr50[i129 + 1] = objArr50[20];
                this.MediaMetadataCompat = i129 + 3;
                objArr50[i129 + 2] = objArr50[15];
                return 0;
            case 98:
                Object[] objArr51 = this.MediaSessionCompatResultReceiverWrapper;
                int i130 = this.MediaMetadataCompat;
                objArr51[i130] = objArr51[16];
                this.MediaMetadataCompat = i130 + 2;
                objArr51[i130 + 1] = objArr51[18];
                return 0;
            case LogPriority.NONE /* 99 */:
                long[] jArr2 = this.MediaSessionCompatQueueItem;
                int i131 = this.MediaDescriptionCompat;
                this.MediaDescriptionCompat = i131 + 1;
                this.read = jArr2[i131];
                return 0;
            case 100:
                int[] iArr52 = this.RatingCompat;
                int i132 = this.MediaMetadataCompat;
                iArr52[i132] = 2;
                this.MediaMetadataCompat = i132 + 2;
                iArr52[i132 + 1] = 2;
                return 0;
            case 101:
                int[] iArr53 = this.RatingCompat;
                int i133 = this.MediaMetadataCompat;
                iArr53[i133] = 71;
                this.MediaMetadataCompat = i133;
                iArr53[i133 - 1] = iArr53[i133 - 1] + iArr53[i133];
                return 0;
            case 102:
                int[] iArr54 = this.RatingCompat;
                int i134 = this.MediaMetadataCompat;
                Object[] objArr52 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj33 = objArr52[i134 - 1];
                objArr52[i134 - 1] = null;
                iArr54[i134 - 1] = ((int[]) obj33).length;
                return 0;
            case 103:
                int[] iArr55 = this.RatingCompat;
                int i135 = this.MediaMetadataCompat;
                iArr55[i135] = 23;
                iArr55[i135 - 1] = iArr55[i135 - 1] + iArr55[i135];
                this.MediaMetadataCompat = i135 + 1;
                iArr55[i135] = iArr55[i135 - 1];
                return 0;
            case 104:
                int[] iArr56 = this.RatingCompat;
                int i136 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i136 + 1;
                iArr56[i136] = 87;
                return 0;
            case 105:
                int[] iArr57 = this.RatingCompat;
                int i137 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i137 + 1;
                iArr57[i137] = 23;
                return 0;
            case GwiErrorCode.ALG_LIBRARY_NOT_EXIST /* 106 */:
                int[] iArr58 = this.RatingCompat;
                int i138 = this.MediaMetadataCompat;
                iArr58[i138] = 91;
                iArr58[i138 - 1] = iArr58[i138 - 1] + iArr58[i138];
                this.MediaMetadataCompat = i138 + 1;
                iArr58[i138] = iArr58[i138 - 1];
                return 0;
            case 107:
                int[] iArr59 = this.RatingCompat;
                int i139 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i139 + 1;
                iArr59[i139] = 12;
                return 0;
            case ActivityIdentificationData.RUNNING /* 108 */:
                int[] iArr60 = this.RatingCompat;
                int i140 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i140 + 1;
                iArr60[i140] = 1;
                return 0;
            case 109:
                int[] iArr61 = this.RatingCompat;
                int i141 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i141 + 1;
                iArr61[i141] = 68;
                return 0;
            case 110:
                int[] iArr62 = this.RatingCompat;
                int i142 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i142 + 1;
                iArr62[i142] = 41;
                return 0;
            case 111:
                int[] iArr63 = this.RatingCompat;
                int i143 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i143 + 1;
                iArr63[i143] = 47;
                return 0;
            case 112:
                int i144 = this.MediaMetadataCompat;
                int i145 = i144 - 1;
                Object[] objArr53 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj34 = objArr53[i145];
                objArr53[i145] = null;
                objArr53[14] = obj34;
                objArr53[i145] = objArr53[12];
                this.MediaMetadataCompat = i144 + 1;
                objArr53[i144] = null;
                return 0;
            case 113:
                int[] iArr64 = this.RatingCompat;
                int i146 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i146 + 1;
                iArr64[i146] = 14;
                return 0;
            case 114:
                Object[] objArr54 = this.MediaSessionCompatResultReceiverWrapper;
                int i147 = this.MediaMetadataCompat;
                objArr54[i147] = objArr54[14];
                this.MediaMetadataCompat = i147 + 2;
                objArr54[i147 + 1] = objArr54[15];
                return 0;
            case 115:
                Object[] objArr55 = this.MediaSessionCompatResultReceiverWrapper;
                int i148 = this.MediaMetadataCompat;
                objArr55[i148] = objArr55[13];
                this.MediaMetadataCompat = i148 + 2;
                objArr55[i148 + 1] = objArr55[14];
                return 0;
            case 116:
                int i149 = this.MediaMetadataCompat;
                int i150 = i149 - 2;
                this.MediaMetadataCompat = i150;
                Object[] objArr56 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj35 = objArr56[i150];
                objArr56[i150] = null;
                Object obj36 = objArr56[i149 - 1];
                objArr56[i149 - 1] = null;
                this.IconCompatParcelizer = obj35 != obj36 ? 0 : 1;
                return 0;
            case 117:
                int[] iArr65 = this.RatingCompat;
                int i151 = this.MediaMetadataCompat;
                iArr65[i151] = 17;
                this.MediaMetadataCompat = i151;
                iArr65[i151 - 1] = iArr65[i151 - 1] + iArr65[i151];
                return 0;
            case 118:
                int[] iArr66 = this.RatingCompat;
                int i152 = this.MediaMetadataCompat;
                iArr66[i152] = 65;
                iArr66[i152 - 1] = iArr66[i152 - 1] + iArr66[i152];
                this.MediaMetadataCompat = i152 + 1;
                iArr66[i152] = iArr66[i152 - 1];
                return 0;
            case 119:
                Object[] objArr57 = this.MediaSessionCompatResultReceiverWrapper;
                int i153 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i153 + 1;
                objArr57[i153] = null;
                int[] iArr67 = this.RatingCompat;
                Object obj37 = objArr57[i153];
                objArr57[i153] = null;
                iArr67[i153] = ((int[]) obj37).length;
                this.MediaMetadataCompat = i153;
                objArr57[i153] = null;
                return 0;
            case 120:
                int[] iArr68 = this.RatingCompat;
                int i154 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i154 + 1;
                iArr68[i154] = 56;
                return 0;
            case 121:
                int[] iArr69 = this.RatingCompat;
                int i155 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i155 + 1;
                iArr69[i155] = 42;
                return 0;
            case 122:
                Object[] objArr58 = this.MediaSessionCompatResultReceiverWrapper;
                int i156 = this.MediaMetadataCompat;
                objArr58[i156] = objArr58[12];
                objArr58[i156 + 1] = null;
                int[] iArr70 = this.RatingCompat;
                this.MediaMetadataCompat = i156 + 3;
                iArr70[i156 + 2] = 6;
                return 0;
            case 123:
                Object[] objArr59 = this.MediaSessionCompatResultReceiverWrapper;
                int i157 = this.MediaMetadataCompat;
                objArr59[i157] = objArr59[14];
                objArr59[i157 + 1] = objArr59[15];
                this.MediaMetadataCompat = i157 + 3;
                objArr59[i157 + 2] = objArr59[13];
                return 0;
            case 124:
                int[] iArr71 = this.RatingCompat;
                int i158 = this.MediaMetadataCompat;
                iArr71[i158] = 121;
                iArr71[i158 - 1] = iArr71[i158 - 1] + iArr71[i158];
                this.MediaMetadataCompat = i158 + 1;
                iArr71[i158] = iArr71[i158 - 1];
                return 0;
            case 125:
                Object[] objArr60 = this.MediaSessionCompatResultReceiverWrapper;
                int i159 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i159 + 1;
                objArr60[i159] = null;
                int[] iArr72 = this.RatingCompat;
                Object obj38 = objArr60[i159];
                objArr60[i159] = null;
                iArr72[i159] = ((int[]) obj38).length;
                return 0;
            case 126:
                int[] iArr73 = this.RatingCompat;
                int i160 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i160 + 1;
                iArr73[i160] = 21;
                return 0;
            case 127:
                int[] iArr74 = this.RatingCompat;
                int i161 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i161 + 1;
                iArr74[i161] = 85;
                return 0;
            case androidx.compose.ui.graphics.Fields.SpotShadowColor /* 128 */:
                int[] iArr75 = this.RatingCompat;
                int i162 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i162 + 1;
                iArr75[i162] = 90;
                return 0;
            case 129:
                int[] iArr76 = this.RatingCompat;
                int i163 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i163 + 1;
                iArr76[i163] = 73;
                return 0;
            case 130:
                int[] iArr77 = this.RatingCompat;
                int i164 = this.MediaMetadataCompat;
                iArr77[i164] = 2;
                this.MediaMetadataCompat = i164;
                iArr77[i164 - 1] = iArr77[i164 - 1] % iArr77[i164];
                int i165 = i164 - 1;
                this.MediaMetadataCompat = i165;
                this.MediaSessionCompatResultReceiverWrapper[i165] = null;
                return 0;
            case 131:
                int[] iArr78 = this.RatingCompat;
                int i166 = this.MediaMetadataCompat;
                iArr78[i166] = 109;
                iArr78[i166 - 1] = iArr78[i166 - 1] + iArr78[i166];
                this.MediaMetadataCompat = i166 + 1;
                iArr78[i166] = iArr78[i166 - 1];
                return 0;
            case 132:
                int[] iArr79 = this.RatingCompat;
                int i167 = this.MediaMetadataCompat;
                iArr79[i167] = 0;
                this.MediaMetadataCompat = i167;
                iArr79[i167 - 1] = iArr79[i167 - 1] / iArr79[i167];
                return 0;
            case 133:
                int[] iArr80 = this.RatingCompat;
                int i168 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i168 + 1;
                iArr80[i168] = 39;
                return 0;
            case 134:
                int[] iArr81 = this.RatingCompat;
                int i169 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i169 + 1;
                iArr81[i169] = 50;
                return 0;
            case 135:
                int i170 = this.MediaMetadataCompat;
                int i171 = i170 - 1;
                int[] iArr82 = this.RatingCompat;
                int i172 = iArr82[i171];
                iArr82[15] = i172;
                this.MediaMetadataCompat = i170;
                iArr82[i171] = i172;
                return 0;
            case 136:
                int i173 = this.MediaMetadataCompat - 1;
                this.MediaMetadataCompat = i173;
                int[] iArr83 = this.RatingCompat;
                iArr83[14] = iArr83[i173];
                return 0;
            case 137:
                int[] iArr84 = this.RatingCompat;
                int i174 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i174 + 1;
                iArr84[i174] = iArr84[14];
                return 0;
            case 138:
                int i175 = this.MediaMetadataCompat;
                int i176 = i175 - 1;
                this.MediaMetadataCompat = i176;
                int[] iArr85 = this.RatingCompat;
                iArr85[i175 - 2] = iArr85[i175 - 2] & iArr85[i176];
                return 0;
            case 139:
                Object[] objArr61 = this.MediaSessionCompatResultReceiverWrapper;
                int i177 = this.MediaMetadataCompat;
                objArr61[i177] = objArr61[12];
                this.MediaMetadataCompat = i177 + 2;
                objArr61[i177 + 1] = objArr61[13];
                return 0;
            case 140:
                int i178 = this.MediaMetadataCompat;
                int i179 = i178 - 1;
                int[] iArr86 = this.RatingCompat;
                int i180 = iArr86[i179];
                iArr86[14] = i180;
                this.MediaMetadataCompat = i178;
                iArr86[i179] = i180;
                return 0;
            case 141:
                int i181 = this.MediaMetadataCompat;
                int i182 = i181 - 2;
                this.MediaMetadataCompat = i182;
                int[] iArr87 = this.RatingCompat;
                this.IconCompatParcelizer = iArr87[i182] != iArr87[i181 - 1] ? 0 : 1;
                return 0;
            case 142:
                int[] iArr88 = this.RatingCompat;
                int i183 = this.MediaMetadataCompat;
                iArr88[i183] = iArr88[14];
                this.MediaMetadataCompat = i183 + 2;
                iArr88[i183 + 1] = 1;
                return 0;
            case 143:
                Object[] objArr62 = this.MediaSessionCompatResultReceiverWrapper;
                int i184 = this.MediaMetadataCompat;
                objArr62[i184] = objArr62[16];
                this.MediaMetadataCompat = i184;
                Object obj39 = objArr62[i184];
                objArr62[i184] = null;
                objArr62[13] = obj39;
                return 0;
            case 144:
                Object[] objArr63 = this.MediaSessionCompatResultReceiverWrapper;
                int i185 = this.MediaMetadataCompat;
                objArr63[i185] = objArr63[13];
                int[] iArr89 = this.RatingCompat;
                this.MediaMetadataCompat = i185 + 2;
                iArr89[i185 + 1] = 1;
                return 0;
            case 145:
                int i186 = this.MediaMetadataCompat;
                int i187 = i186 - 1;
                Object[] objArr64 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj40 = objArr64[i187];
                objArr64[i187] = null;
                objArr64[13] = obj40;
                this.MediaMetadataCompat = i186;
                objArr64[i187] = objArr64[16];
                return 0;
            case 146:
                int[] iArr90 = this.RatingCompat;
                int i188 = this.MediaMetadataCompat;
                iArr90[i188] = 117;
                iArr90[i188 - 1] = iArr90[i188 - 1] + iArr90[i188];
                this.MediaMetadataCompat = i188 + 1;
                iArr90[i188] = iArr90[i188 - 1];
                return 0;
            case 147:
                int[] iArr91 = this.RatingCompat;
                int i189 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i189 + 1;
                iArr91[i189] = 91;
                return 0;
            case 148:
                int[] iArr92 = this.RatingCompat;
                int i190 = this.MediaMetadataCompat;
                iArr92[i190] = iArr92[14];
                this.MediaMetadataCompat = i190 + 2;
                iArr92[i190 + 1] = 0;
                return 0;
            case 149:
                int[] iArr93 = this.RatingCompat;
                int i191 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i191 + 1;
                iArr93[i191] = 43;
                return 0;
            case 150:
                int[] iArr94 = this.RatingCompat;
                int i192 = this.MediaMetadataCompat;
                iArr94[i192] = 1;
                iArr94[i192 - 1] = iArr94[i192 - 1] + iArr94[i192];
                this.MediaMetadataCompat = i192 + 1;
                iArr94[i192] = iArr94[i192 - 1];
                return 0;
            case 151:
                Object[] objArr65 = this.MediaSessionCompatResultReceiverWrapper;
                int i193 = this.MediaMetadataCompat;
                objArr65[i193] = objArr65[16];
                int[] iArr95 = this.RatingCompat;
                this.MediaMetadataCompat = i193 + 2;
                iArr95[i193 + 1] = iArr95[14];
                return 0;
            case 152:
                int i194 = this.MediaMetadataCompat;
                int i195 = i194 - 1;
                this.MediaMetadataCompat = i195;
                int[] iArr96 = this.RatingCompat;
                iArr96[i194 - 2] = iArr96[i194 - 2] * iArr96[i195];
                return 0;
            case 153:
                int[] iArr97 = this.RatingCompat;
                int i196 = this.MediaMetadataCompat;
                iArr97[i196] = 95;
                iArr97[i196 - 1] = iArr97[i196 - 1] + iArr97[i196];
                this.MediaMetadataCompat = i196 + 1;
                iArr97[i196] = iArr97[i196 - 1];
                return 0;
            case 154:
                int[] iArr98 = this.RatingCompat;
                int i197 = this.MediaMetadataCompat;
                iArr98[i197] = 31;
                iArr98[i197 - 1] = iArr98[i197 - 1] + iArr98[i197];
                this.MediaMetadataCompat = i197 + 1;
                iArr98[i197] = iArr98[i197 - 1];
                return 0;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                Object[] objArr66 = this.MediaSessionCompatResultReceiverWrapper;
                int i198 = this.MediaMetadataCompat;
                objArr66[i198] = objArr66[13];
                this.MediaMetadataCompat = i198 + 2;
                objArr66[i198 + 1] = null;
                return 0;
            case 156:
                int i199 = this.MediaMetadataCompat;
                int i200 = i199 - 1;
                Object[] objArr67 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj41 = objArr67[i200];
                objArr67[i200] = null;
                objArr67[13] = obj41;
                this.MediaMetadataCompat = i199;
                objArr67[i200] = objArr67[15];
                return 0;
            case 157:
                int i201 = this.MediaMetadataCompat;
                int i202 = i201 - 1;
                Object[] objArr68 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj42 = objArr68[i202];
                objArr68[i202] = null;
                objArr68[14] = obj42;
                this.MediaMetadataCompat = i201;
                objArr68[i202] = objArr68[13];
                return 0;
            case 158:
                int[] iArr99 = this.RatingCompat;
                int i203 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i203 + 1;
                iArr99[i203] = 115;
                return 0;
            case 159:
                int[] iArr100 = this.RatingCompat;
                int i204 = this.MediaMetadataCompat;
                iArr100[i204] = 123;
                this.MediaMetadataCompat = i204;
                iArr100[i204 - 1] = iArr100[i204 - 1] + iArr100[i204];
                return 0;
            case 160:
                int[] iArr101 = this.RatingCompat;
                int i205 = this.MediaMetadataCompat;
                iArr101[i205] = 19;
                this.MediaMetadataCompat = i205;
                iArr101[i205 - 1] = iArr101[i205 - 1] + iArr101[i205];
                return 0;
            case 161:
                int[] iArr102 = this.RatingCompat;
                int i206 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i206 + 1;
                iArr102[i206] = 89;
                return 0;
            case 162:
                int[] iArr103 = this.RatingCompat;
                int i207 = this.MediaMetadataCompat;
                this.MediaMetadataCompat = i207 + 1;
                iArr103[i207] = 6;
                return 0;
            default:
                return i;
        }
    }

    public clearTextSubstitutiondefault(Object obj, Object obj2, Object obj3) {
        this.RatingCompat = new int[21];
        this.MediaSessionCompatQueueItem = new long[21];
        this.MediaBrowserCompatMediaItem = new float[21];
        this.PlaybackStateCompatCustomAction = new double[21];
        Object[] objArr = new Object[21];
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        objArr[14] = obj3;
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat = -1;
    }

    public clearTextSubstitutiondefault(Object obj, Object obj2) {
        this.RatingCompat = new int[21];
        this.MediaSessionCompatQueueItem = new long[21];
        this.MediaBrowserCompatMediaItem = new float[21];
        this.PlaybackStateCompatCustomAction = new double[21];
        Object[] objArr = new Object[21];
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        objArr[12] = obj;
        objArr[13] = obj2;
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat = -1;
    }

    public clearTextSubstitutiondefault() {
        this.RatingCompat = new int[21];
        this.MediaSessionCompatQueueItem = new long[21];
        this.MediaBrowserCompatMediaItem = new float[21];
        this.PlaybackStateCompatCustomAction = new double[21];
        this.MediaSessionCompatResultReceiverWrapper = new Object[21];
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat = -1;
    }

    public clearTextSubstitutiondefault(Object obj) {
        this.RatingCompat = new int[21];
        this.MediaSessionCompatQueueItem = new long[21];
        this.MediaBrowserCompatMediaItem = new float[21];
        this.PlaybackStateCompatCustomAction = new double[21];
        Object[] objArr = new Object[21];
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        objArr[12] = obj;
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat = -1;
    }
}
