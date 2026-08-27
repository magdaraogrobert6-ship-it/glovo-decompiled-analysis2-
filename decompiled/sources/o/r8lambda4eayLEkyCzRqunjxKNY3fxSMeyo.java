package o;

import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.mapbox.common.logger.LogPriority;
import com.qualtrics.digital.EmbeddedFeedbackUtils;

/* JADX INFO: loaded from: classes3.dex */
public class r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo {
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private final int[] MediaDescriptionCompat;
    public Object MediaMetadataCompat;
    private final long[] MediaSessionCompatQueueItem;
    private final Object[] MediaSessionCompatResultReceiverWrapper;
    private final float[] ParcelableVolumeInfo;
    private final double[] PlaybackStateCompatCustomAction;
    private int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public long read;
    public long serializer;
    public int write;

    public int read(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.MediaSessionCompatResultReceiverWrapper;
                int i2 = this.RatingCompat;
                this.RatingCompat = i2 + 1;
                objArr[i2] = objArr[11];
                return 0;
            case 2:
                int i3 = this.RatingCompat - this.write;
                this.RatingCompat = i3;
                this.MediaBrowserCompatMediaItem = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaSessionCompatResultReceiverWrapper;
                int i4 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.MediaMetadataCompat = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaSessionCompatResultReceiverWrapper;
                int i5 = this.RatingCompat;
                this.RatingCompat = i5 + 1;
                objArr3[i5] = this.IconCompatParcelizer;
                return 0;
            case 5:
                int i6 = this.RatingCompat - 1;
                this.RatingCompat = i6;
                Object[] objArr4 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                objArr4[11] = obj2;
                return 0;
            case 6:
                int[] iArr = this.MediaDescriptionCompat;
                int i7 = this.RatingCompat;
                iArr[i7] = 2;
                this.RatingCompat = i7 + 2;
                iArr[i7 + 1] = 2;
                return 0;
            case 7:
                int i8 = this.RatingCompat;
                int i9 = i8 - 1;
                this.RatingCompat = i9;
                int[] iArr2 = this.MediaDescriptionCompat;
                iArr2[i8 - 2] = iArr2[i8 - 2] % iArr2[i9];
                return 0;
            case 8:
                int i10 = this.RatingCompat - 1;
                this.RatingCompat = i10;
                this.MediaSessionCompatResultReceiverWrapper[i10] = null;
                return 0;
            case 9:
                Object[] objArr5 = this.MediaSessionCompatResultReceiverWrapper;
                int i11 = this.RatingCompat;
                Object obj3 = objArr5[i11 - 1];
                objArr5[i11 - 1] = null;
                this.MediaMetadataCompat = obj3;
                return 0;
            case 11:
                int[] iArr3 = this.MediaDescriptionCompat;
                int i12 = this.RatingCompat;
                this.RatingCompat = i12 + 1;
                iArr3[i12] = this.write;
            case 10:
                return 0;
            case 12:
                int[] iArr4 = this.MediaDescriptionCompat;
                int i13 = this.RatingCompat;
                this.RatingCompat = i13 + 1;
                iArr4[i13] = 27;
                return 0;
            case 13:
                int i14 = this.RatingCompat;
                int i15 = i14 - 1;
                int[] iArr5 = this.MediaDescriptionCompat;
                iArr5[i14 - 2] = iArr5[i14 - 2] + iArr5[i15];
                iArr5[i15] = iArr5[i14 - 2];
                this.RatingCompat = i14 + 1;
                iArr5[i14] = 128;
                return 0;
            case 14:
                int[] iArr6 = this.MediaDescriptionCompat;
                int i16 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i16 + 1;
                this.RemoteActionCompatParcelizer = iArr6[i16];
                return 0;
            case 15:
                int i17 = this.RatingCompat - 1;
                this.RatingCompat = i17;
                this.RemoteActionCompatParcelizer = this.MediaDescriptionCompat[i17] == 0 ? 0 : 1;
                return 0;
            case 16:
                int[] iArr7 = this.MediaDescriptionCompat;
                int i18 = this.RatingCompat;
                iArr7[i18] = 2;
                this.RatingCompat = i18;
                iArr7[i18 - 1] = iArr7[i18 - 1] % iArr7[i18];
                return 0;
            case 17:
                int[] iArr8 = this.MediaDescriptionCompat;
                int i19 = this.RatingCompat;
                iArr8[i19] = 39;
                this.RatingCompat = i19;
                iArr8[i19 - 1] = iArr8[i19 - 1] + iArr8[i19];
                return 0;
            case 18:
                int[] iArr9 = this.MediaDescriptionCompat;
                int i20 = this.RatingCompat;
                iArr9[i20] = iArr9[i20 - 1];
                this.RatingCompat = i20 + 2;
                iArr9[i20 + 1] = 128;
                return 0;
            case 19:
                int[] iArr10 = this.MediaDescriptionCompat;
                int i21 = this.RatingCompat;
                this.RatingCompat = i21 + 1;
                iArr10[i21] = 2;
                return 0;
            case 20:
                int i22 = this.RatingCompat - 1;
                this.RatingCompat = i22;
                this.RemoteActionCompatParcelizer = this.MediaDescriptionCompat[i22] != 0 ? 0 : 1;
                return 0;
            case 21:
                int i23 = this.RatingCompat;
                int i24 = i23 - 1;
                Object[] objArr6 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj4 = objArr6[i24];
                objArr6[i24] = null;
                objArr6[11] = obj4;
                this.RatingCompat = i23;
                objArr6[i24] = obj4;
                return 0;
            case 22:
                Object[] objArr7 = this.MediaSessionCompatResultReceiverWrapper;
                int i25 = this.RatingCompat;
                this.RatingCompat = i25 + 1;
                objArr7[i25] = null;
                return 0;
            case 23:
                int[] iArr11 = this.MediaDescriptionCompat;
                int i26 = this.RatingCompat;
                Object[] objArr8 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj5 = objArr8[i26 - 1];
                objArr8[i26 - 1] = null;
                iArr11[i26 - 1] = ((int[]) obj5).length;
                return 0;
            case 24:
                int[] iArr12 = this.MediaDescriptionCompat;
                int i27 = this.RatingCompat - 1;
                this.RatingCompat = i27;
                this.RemoteActionCompatParcelizer = iArr12[i27];
                return 0;
            case 25:
                int[] iArr13 = this.MediaDescriptionCompat;
                int i28 = this.RatingCompat;
                this.RatingCompat = i28 + 1;
                iArr13[i28] = 14;
                return 0;
            case 26:
                int[] iArr14 = this.MediaDescriptionCompat;
                int i29 = this.RatingCompat;
                this.RatingCompat = i29 + 1;
                iArr14[i29] = 23;
                return 0;
            case 27:
                for (int i30 = this.RatingCompat - 1; i30 >= 0; i30--) {
                    this.MediaSessionCompatResultReceiverWrapper[i30] = null;
                }
                Object[] objArr9 = this.MediaSessionCompatResultReceiverWrapper;
                this.RatingCompat = 1;
                objArr9[0] = this.IconCompatParcelizer;
                return 0;
            case 28:
                int i31 = this.RatingCompat;
                int i32 = i31 - 1;
                Object[] objArr10 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj6 = objArr10[i32];
                objArr10[i32] = null;
                objArr10[12] = obj6;
                this.RatingCompat = i31;
                objArr10[i32] = obj6;
                return 0;
            case 29:
                int i33 = this.RatingCompat - 1;
                this.RatingCompat = i33;
                Object[] objArr11 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj7 = objArr11[i33];
                objArr11[i33] = null;
                objArr11[12] = obj7;
                return 0;
            case 30:
                Object[] objArr12 = this.MediaSessionCompatResultReceiverWrapper;
                int i34 = this.RatingCompat;
                this.RatingCompat = i34 + 1;
                objArr12[i34] = objArr12[12];
                return 0;
            case 31:
                int[] iArr15 = this.MediaDescriptionCompat;
                int i35 = this.RatingCompat;
                iArr15[i35] = 2;
                iArr15[i35 + 1] = 2;
                int i36 = i35 + 1;
                this.RatingCompat = i36;
                iArr15[i35] = iArr15[i35] % iArr15[i36];
                return 0;
            case 32:
                int[] iArr16 = this.MediaDescriptionCompat;
                int i37 = this.RatingCompat;
                iArr16[i37] = 69;
                iArr16[i37 - 1] = iArr16[i37 - 1] + iArr16[i37];
                this.RatingCompat = i37 + 1;
                iArr16[i37] = iArr16[i37 - 1];
                return 0;
            case 33:
                int[] iArr17 = this.MediaDescriptionCompat;
                int i38 = this.RatingCompat;
                iArr17[i38] = 128;
                this.RatingCompat = i38;
                iArr17[i38 - 1] = iArr17[i38 - 1] % iArr17[i38];
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                int[] iArr18 = this.MediaDescriptionCompat;
                int i39 = this.RatingCompat;
                iArr18[i39] = 1;
                iArr18[i39 - 1] = iArr18[i39 - 1] + iArr18[i39];
                this.RatingCompat = i39 + 1;
                iArr18[i39] = iArr18[i39 - 1];
                return 0;
            case 35:
                int[] iArr19 = this.MediaDescriptionCompat;
                int i40 = this.RatingCompat;
                this.RatingCompat = i40 + 1;
                iArr19[i40] = 128;
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int[] iArr20 = this.MediaDescriptionCompat;
                int i41 = this.RatingCompat;
                iArr20[i41] = 15;
                iArr20[i41 - 1] = iArr20[i41 - 1] + iArr20[i41];
                this.RatingCompat = i41 + 1;
                iArr20[i41] = iArr20[i41 - 1];
                return 0;
            case 37:
                int[] iArr21 = this.MediaDescriptionCompat;
                int i42 = this.RatingCompat;
                iArr21[i42] = 27;
                this.RatingCompat = i42;
                iArr21[i42 - 1] = iArr21[i42 - 1] + iArr21[i42];
                return 0;
            case 38:
                int[] iArr22 = this.MediaDescriptionCompat;
                int i43 = this.RatingCompat;
                this.RatingCompat = i43 + 1;
                iArr22[i43] = iArr22[i43 - 1];
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                int i44 = this.RatingCompat - 1;
                this.RatingCompat = i44;
                Object[] objArr13 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj8 = objArr13[i44];
                objArr13[i44] = null;
                objArr13[13] = obj8;
                return 0;
            case 40:
                Object[] objArr14 = this.MediaSessionCompatResultReceiverWrapper;
                int i45 = this.RatingCompat;
                this.RatingCompat = i45 + 1;
                objArr14[i45] = objArr14[13];
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                int i46 = this.RatingCompat;
                int i47 = i46 - 1;
                Object[] objArr15 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj9 = objArr15[i47];
                objArr15[i47] = null;
                objArr15[13] = obj9;
                this.RatingCompat = i46;
                objArr15[i47] = obj9;
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int i48 = this.RatingCompat - 1;
                this.RatingCompat = i48;
                int[] iArr23 = this.MediaDescriptionCompat;
                iArr23[12] = iArr23[i48];
                return 0;
            case 43:
                int[] iArr24 = this.MediaDescriptionCompat;
                int i49 = this.RatingCompat;
                this.RatingCompat = i49 + 1;
                iArr24[i49] = iArr24[12];
                return 0;
            case 44:
                int i50 = this.RatingCompat - 1;
                this.RatingCompat = i50;
                Object[] objArr16 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj10 = objArr16[i50];
                objArr16[i50] = null;
                objArr16[14] = obj10;
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                Object[] objArr17 = this.MediaSessionCompatResultReceiverWrapper;
                int i51 = this.RatingCompat;
                this.RatingCompat = i51 + 1;
                objArr17[i51] = objArr17[14];
                return 0;
            case 46:
                int i52 = this.RatingCompat - 1;
                this.RatingCompat = i52;
                Object[] objArr18 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj11 = objArr18[i52];
                objArr18[i52] = null;
                objArr18[15] = obj11;
                return 0;
            case 47:
                Object[] objArr19 = this.MediaSessionCompatResultReceiverWrapper;
                int i53 = this.RatingCompat;
                this.RatingCompat = i53 + 1;
                objArr19[i53] = objArr19[15];
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                int[] iArr25 = this.MediaDescriptionCompat;
                int i54 = this.RatingCompat;
                this.RatingCompat = i54 + 1;
                iArr25[i54] = 95;
                return 0;
            case 49:
                int i55 = this.RatingCompat;
                int i56 = i55 - 1;
                this.RatingCompat = i56;
                int[] iArr26 = this.MediaDescriptionCompat;
                iArr26[i55 - 2] = iArr26[i55 - 2] + iArr26[i56];
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                Object[] objArr20 = this.MediaSessionCompatResultReceiverWrapper;
                int i57 = this.RatingCompat;
                this.RatingCompat = i57 + 1;
                objArr20[i57] = null;
                int[] iArr27 = this.MediaDescriptionCompat;
                Object obj12 = objArr20[i57];
                objArr20[i57] = null;
                iArr27[i57] = ((int[]) obj12).length;
                this.RatingCompat = i57;
                objArr20[i57] = null;
                return 0;
            case 51:
                int[] iArr28 = this.MediaDescriptionCompat;
                int i58 = this.RatingCompat;
                iArr28[i58] = 77;
                this.RatingCompat = i58;
                iArr28[i58 - 1] = iArr28[i58 - 1] + iArr28[i58];
                return 0;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                int[] iArr29 = this.MediaDescriptionCompat;
                int i59 = this.RatingCompat;
                this.RatingCompat = i59 + 1;
                iArr29[i59] = 73;
                return 0;
            case 53:
                int[] iArr30 = this.MediaDescriptionCompat;
                int i60 = this.RatingCompat;
                this.RatingCompat = i60 + 1;
                iArr30[i60] = 0;
                return 0;
            case 54:
                int[] iArr31 = this.MediaDescriptionCompat;
                int i61 = this.RatingCompat;
                this.RatingCompat = i61 + 1;
                iArr31[i61] = 1;
                return 0;
            case 55:
                int[] iArr32 = this.MediaDescriptionCompat;
                int i62 = this.RatingCompat;
                this.RatingCompat = i62 + 1;
                iArr32[i62] = 98;
                return 0;
            case 56:
                int[] iArr33 = this.MediaDescriptionCompat;
                int i63 = this.RatingCompat;
                this.RatingCompat = i63 + 1;
                iArr33[i63] = 82;
                return 0;
            case 57:
                int i64 = this.RatingCompat - 1;
                this.RatingCompat = i64;
                Object[] objArr21 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj13 = objArr21[i64];
                objArr21[i64] = null;
                objArr21[16] = obj13;
                return 0;
            case 58:
                Object[] objArr22 = this.MediaSessionCompatResultReceiverWrapper;
                int i65 = this.RatingCompat;
                this.RatingCompat = i65 + 1;
                objArr22[i65] = objArr22[16];
                return 0;
            case 59:
                int i66 = this.RatingCompat;
                int i67 = i66 - 1;
                Object[] objArr23 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj14 = objArr23[i67];
                objArr23[i67] = null;
                objArr23[16] = obj14;
                this.RatingCompat = i66;
                objArr23[i67] = obj14;
                return 0;
            case 60:
                int i68 = this.RatingCompat;
                int i69 = i68 - 1;
                Object[] objArr24 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj15 = objArr24[i69];
                objArr24[i69] = null;
                objArr24[16] = obj15;
                int[] iArr34 = this.MediaDescriptionCompat;
                this.RatingCompat = i68;
                iArr34[i69] = 7;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                int i70 = this.RatingCompat - 1;
                this.RatingCompat = i70;
                Object[] objArr25 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj16 = objArr25[i70];
                objArr25[i70] = null;
                objArr25[17] = obj16;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                Object[] objArr26 = this.MediaSessionCompatResultReceiverWrapper;
                int i71 = this.RatingCompat;
                objArr26[i71] = objArr26[16];
                int[] iArr35 = this.MediaDescriptionCompat;
                this.RatingCompat = i71 + 2;
                iArr35[i71 + 1] = 1;
                return 0;
            case 63:
                int[] iArr36 = this.MediaDescriptionCompat;
                int i72 = this.RatingCompat;
                iArr36[i72] = 0;
                Object[] objArr27 = this.MediaSessionCompatResultReceiverWrapper;
                this.RatingCompat = i72 + 2;
                objArr27[i72 + 1] = objArr27[17];
                return 0;
            case 64:
                int i73 = this.RatingCompat - 1;
                this.RatingCompat = i73;
                Object[] objArr28 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj17 = objArr28[i73];
                objArr28[i73] = null;
                this.RemoteActionCompatParcelizer = obj17 == null ? 0 : 1;
                return 0;
            case 65:
                int i74 = this.RatingCompat;
                int i75 = i74 - 1;
                Object[] objArr29 = this.MediaSessionCompatResultReceiverWrapper;
                objArr29[i75] = null;
                this.RatingCompat = i74;
                objArr29[i75] = objArr29[16];
                return 0;
            case 66:
                long[] jArr = this.MediaSessionCompatQueueItem;
                int i76 = this.RatingCompat;
                this.RatingCompat = i76 + 1;
                jArr[i76] = this.serializer;
                return 0;
            case 67:
                int i77 = this.RatingCompat;
                int i78 = i77 - 1;
                Object[] objArr30 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj18 = objArr30[i78];
                objArr30[i78] = null;
                objArr30[17] = obj18;
                this.RatingCompat = i77;
                objArr30[i78] = objArr30[16];
                return 0;
            case 68:
                int i79 = this.RatingCompat - 1;
                this.RatingCompat = i79;
                long[] jArr2 = this.MediaSessionCompatQueueItem;
                jArr2[12] = jArr2[i79];
                return 0;
            case 69:
                int i80 = this.RatingCompat;
                int i81 = i80 - 1;
                Object[] objArr31 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj19 = objArr31[i81];
                objArr31[i81] = null;
                objArr31[18] = obj19;
                this.RatingCompat = i80;
                objArr31[i81] = objArr31[16];
                return 0;
            case 70:
                int i82 = this.RatingCompat - 1;
                this.RatingCompat = i82;
                long[] jArr3 = this.MediaSessionCompatQueueItem;
                jArr3[14] = jArr3[i82];
                return 0;
            case 71:
                long[] jArr4 = this.MediaSessionCompatQueueItem;
                int i83 = this.RatingCompat;
                this.RatingCompat = i83 + 1;
                jArr4[i83] = jArr4[12];
                return 0;
            case 72:
                long[] jArr5 = this.MediaSessionCompatQueueItem;
                int i84 = this.RatingCompat;
                jArr5[i84] = jArr5[14];
                Object[] objArr32 = this.MediaSessionCompatResultReceiverWrapper;
                this.RatingCompat = i84 + 2;
                objArr32[i84 + 1] = objArr32[11];
                return 0;
            case 73:
                long[] jArr6 = this.MediaSessionCompatQueueItem;
                int i85 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i85 + 1;
                this.read = jArr6[i85];
                return 0;
            case 74:
                Object[] objArr33 = this.MediaSessionCompatResultReceiverWrapper;
                int i86 = this.RatingCompat;
                objArr33[i86] = objArr33[17];
                this.RatingCompat = i86 + 2;
                objArr33[i86 + 1] = objArr33[18];
                return 0;
            case 75:
                int i87 = this.RatingCompat;
                int i88 = i87 - 1;
                this.RatingCompat = i88;
                int[] iArr37 = this.MediaDescriptionCompat;
                iArr37[i87 - 2] = iArr37[i87 - 2] % iArr37[i88];
                int i89 = i87 - 2;
                this.RatingCompat = i89;
                this.MediaSessionCompatResultReceiverWrapper[i89] = null;
                return 0;
            case 76:
                int[] iArr38 = this.MediaDescriptionCompat;
                int i90 = this.RatingCompat;
                this.RatingCompat = i90 + 1;
                iArr38[i90] = 51;
                return 0;
            case 77:
                int[] iArr39 = this.MediaDescriptionCompat;
                int i91 = this.RatingCompat;
                this.RatingCompat = i91 + 1;
                iArr39[i91] = 53;
                return 0;
            case 78:
                int[] iArr40 = this.MediaDescriptionCompat;
                int i92 = this.RatingCompat;
                iArr40[i92] = 12;
                this.RatingCompat = i92 + 2;
                iArr40[i92 + 1] = 0;
                return 0;
            case 79:
                int i93 = this.RatingCompat;
                int i94 = i93 - 1;
                this.RatingCompat = i94;
                int[] iArr41 = this.MediaDescriptionCompat;
                iArr41[i93 - 2] = iArr41[i93 - 2] / iArr41[i94];
                return 0;
            case 80:
                int i95 = this.RatingCompat;
                int i96 = i95 - 1;
                Object[] objArr34 = this.MediaSessionCompatResultReceiverWrapper;
                objArr34[i96] = null;
                this.RatingCompat = i95;
                objArr34[i96] = objArr34[11];
                return 0;
            case 81:
                int[] iArr42 = this.MediaDescriptionCompat;
                int i97 = this.RatingCompat;
                this.RatingCompat = i97 + 1;
                iArr42[i97] = 17;
                return 0;
            case 82:
                Object[] objArr35 = this.MediaSessionCompatResultReceiverWrapper;
                int i98 = this.RatingCompat;
                objArr35[i98] = objArr35[12];
                this.RatingCompat = i98 + 2;
                objArr35[i98 + 1] = null;
                return 0;
            case 83:
                int i99 = this.RatingCompat;
                int i100 = i99 - 1;
                Object[] objArr36 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj20 = objArr36[i100];
                objArr36[i100] = null;
                objArr36[13] = obj20;
                objArr36[i100] = objArr36[12];
                int[] iArr43 = this.MediaDescriptionCompat;
                this.RatingCompat = i99 + 1;
                iArr43[i99] = 0;
                return 0;
            case 84:
                int[] iArr44 = this.MediaDescriptionCompat;
                int i101 = this.RatingCompat;
                iArr44[i101] = 1;
                Object[] objArr37 = this.MediaSessionCompatResultReceiverWrapper;
                this.RatingCompat = i101 + 2;
                objArr37[i101 + 1] = objArr37[13];
                return 0;
            case 85:
                int[] iArr45 = this.MediaDescriptionCompat;
                int i102 = this.RatingCompat;
                this.RatingCompat = i102 + 1;
                iArr45[i102] = 71;
                return 0;
            case 86:
                int[] iArr46 = this.MediaDescriptionCompat;
                int i103 = this.RatingCompat;
                iArr46[i103] = iArr46[i103 - 1];
                iArr46[i103 + 1] = 128;
                int i104 = i103 + 1;
                this.RatingCompat = i104;
                iArr46[i103] = iArr46[i103] % iArr46[i104];
                return 0;
            case 87:
                int[] iArr47 = this.MediaDescriptionCompat;
                int i105 = this.RatingCompat;
                iArr47[i105] = 13;
                iArr47[i105 - 1] = iArr47[i105 - 1] + iArr47[i105];
                this.RatingCompat = i105 + 1;
                iArr47[i105] = iArr47[i105 - 1];
                return 0;
            case 88:
                int[] iArr48 = this.MediaDescriptionCompat;
                int i106 = this.RatingCompat;
                this.RatingCompat = i106 + 1;
                iArr48[i106] = 24;
                return 0;
            case 89:
                int[] iArr49 = this.MediaDescriptionCompat;
                int i107 = this.RatingCompat;
                this.RatingCompat = i107 + 1;
                iArr49[i107] = 0;
                return 0;
            case 90:
                int[] iArr50 = this.MediaDescriptionCompat;
                int i108 = this.RatingCompat;
                this.RatingCompat = i108 + 1;
                iArr50[i108] = 78;
                return 0;
            case 91:
                int[] iArr51 = this.MediaDescriptionCompat;
                int i109 = this.RatingCompat;
                this.RatingCompat = i109 + 1;
                iArr51[i109] = 97;
                return 0;
            case 92:
                int i110 = this.RatingCompat;
                int i111 = i110 - 1;
                Object[] objArr38 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj21 = objArr38[i111];
                objArr38[i111] = null;
                objArr38[13] = obj21;
                int[] iArr52 = this.MediaDescriptionCompat;
                this.RatingCompat = i110;
                iArr52[i111] = 0;
                return 0;
            case 93:
                Object[] objArr39 = this.MediaSessionCompatResultReceiverWrapper;
                int i112 = this.RatingCompat;
                objArr39[i112] = objArr39[12];
                this.RatingCompat = i112 + 2;
                objArr39[i112 + 1] = objArr39[13];
                return 0;
            case 94:
                int[] iArr53 = this.MediaDescriptionCompat;
                int i113 = this.RatingCompat;
                iArr53[i113] = 99;
                this.RatingCompat = i113;
                iArr53[i113 - 1] = iArr53[i113 - 1] + iArr53[i113];
                return 0;
            case 95:
                Object[] objArr40 = this.MediaSessionCompatResultReceiverWrapper;
                int i114 = this.RatingCompat;
                this.RatingCompat = i114 + 1;
                objArr40[i114] = null;
                int[] iArr54 = this.MediaDescriptionCompat;
                Object obj22 = objArr40[i114];
                objArr40[i114] = null;
                iArr54[i114] = ((int[]) obj22).length;
                return 0;
            case 96:
                int[] iArr55 = this.MediaDescriptionCompat;
                int i115 = this.RatingCompat;
                this.RatingCompat = i115 + 1;
                iArr55[i115] = 13;
                return 0;
            case 97:
                int i116 = this.RatingCompat;
                int i117 = i116 - 1;
                Object[] objArr41 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj23 = objArr41[i117];
                objArr41[i117] = null;
                objArr41[12] = obj23;
                this.RatingCompat = i116;
                objArr41[i117] = objArr41[11];
                return 0;
            case 98:
                int i118 = this.RatingCompat;
                int i119 = i118 - 1;
                Object[] objArr42 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj24 = objArr42[i119];
                objArr42[i119] = null;
                objArr42[13] = obj24;
                int[] iArr56 = this.MediaDescriptionCompat;
                this.RatingCompat = i118;
                iArr56[i119] = 1;
                return 0;
            case LogPriority.NONE /* 99 */:
                int i120 = this.RatingCompat;
                int i121 = i120 - 1;
                Object[] objArr43 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj25 = objArr43[i121];
                objArr43[i121] = null;
                objArr43[14] = obj25;
                this.RatingCompat = i120;
                objArr43[i121] = objArr43[12];
                return 0;
            case 100:
                int[] iArr57 = this.MediaDescriptionCompat;
                int i122 = this.RatingCompat;
                this.RatingCompat = i122 + 1;
                iArr57[i122] = 56;
                return 0;
            case 101:
                int[] iArr58 = this.MediaDescriptionCompat;
                int i123 = this.RatingCompat;
                this.RatingCompat = i123 + 1;
                iArr58[i123] = 46;
                return 0;
            case 102:
                int i124 = this.RatingCompat;
                int i125 = i124 - 1;
                Object[] objArr44 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj26 = objArr44[i125];
                objArr44[i125] = null;
                objArr44[18] = obj26;
                this.RatingCompat = i124;
                objArr44[i125] = obj26;
                return 0;
            case 103:
                int i126 = this.RatingCompat - 1;
                this.RatingCompat = i126;
                Object[] objArr45 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj27 = objArr45[i126];
                objArr45[i126] = null;
                objArr45[18] = obj27;
                return 0;
            case 104:
                Object[] objArr46 = this.MediaSessionCompatResultReceiverWrapper;
                int i127 = this.RatingCompat;
                objArr46[i127] = objArr46[18];
                this.RatingCompat = i127 + 2;
                objArr46[i127 + 1] = objArr46[12];
                return 0;
            case 105:
                int i128 = this.RatingCompat - 1;
                this.RatingCompat = i128;
                int[] iArr59 = this.MediaDescriptionCompat;
                iArr59[13] = iArr59[i128];
                return 0;
            case GwiErrorCode.ALG_LIBRARY_NOT_EXIST /* 106 */:
                int[] iArr60 = this.MediaDescriptionCompat;
                int i129 = this.RatingCompat;
                this.RatingCompat = i129 + 1;
                iArr60[i129] = iArr60[13];
                return 0;
            case 107:
                int i130 = this.RatingCompat - 1;
                this.RatingCompat = i130;
                Object[] objArr47 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj28 = objArr47[i130];
                objArr47[i130] = null;
                objArr47[19] = obj28;
                return 0;
            case ActivityIdentificationData.RUNNING /* 108 */:
                Object[] objArr48 = this.MediaSessionCompatResultReceiverWrapper;
                int i131 = this.RatingCompat;
                this.RatingCompat = i131 + 1;
                objArr48[i131] = objArr48[19];
                return 0;
            case 109:
                int i132 = this.RatingCompat;
                int i133 = i132 - 1;
                Object[] objArr49 = this.MediaSessionCompatResultReceiverWrapper;
                objArr49[i133] = null;
                this.RatingCompat = i132;
                objArr49[i133] = objArr49[12];
                return 0;
            case 110:
                int i134 = this.RatingCompat;
                int i135 = i134 - 1;
                Object[] objArr50 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj29 = objArr50[i135];
                objArr50[i135] = null;
                objArr50[19] = obj29;
                this.RatingCompat = i134;
                objArr50[i135] = objArr50[12];
                return 0;
            case 111:
                int i136 = this.RatingCompat;
                int i137 = i136 - 1;
                Object[] objArr51 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj30 = objArr51[i137];
                objArr51[i137] = null;
                objArr51[20] = obj30;
                this.RatingCompat = i136;
                objArr51[i137] = objArr51[12];
                return 0;
            case 112:
                int i138 = this.RatingCompat;
                int i139 = i138 - 1;
                long[] jArr7 = this.MediaSessionCompatQueueItem;
                jArr7[14] = jArr7[i139];
                Object[] objArr52 = this.MediaSessionCompatResultReceiverWrapper;
                this.RatingCompat = i138;
                objArr52[i139] = objArr52[12];
                return 0;
            case 113:
                int i140 = this.RatingCompat;
                int i141 = i140 - 1;
                Object[] objArr53 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj31 = objArr53[i141];
                objArr53[i141] = null;
                objArr53[21] = obj31;
                this.RatingCompat = i140;
                objArr53[i141] = objArr53[12];
                return 0;
            case 114:
                int i142 = this.RatingCompat - 1;
                this.RatingCompat = i142;
                long[] jArr8 = this.MediaSessionCompatQueueItem;
                jArr8[16] = jArr8[i142];
                return 0;
            case 115:
                Object[] objArr54 = this.MediaSessionCompatResultReceiverWrapper;
                int i143 = this.RatingCompat;
                objArr54[i143] = objArr54[20];
                long[] jArr9 = this.MediaSessionCompatQueueItem;
                jArr9[i143 + 1] = jArr9[14];
                this.RatingCompat = i143 + 3;
                objArr54[i143 + 2] = objArr54[21];
                return 0;
            case 116:
                long[] jArr10 = this.MediaSessionCompatQueueItem;
                int i144 = this.RatingCompat;
                this.RatingCompat = i144 + 1;
                jArr10[i144] = jArr10[16];
                return 0;
            case 117:
                int i145 = this.RatingCompat;
                int i146 = i145 - 1;
                Object[] objArr55 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj32 = objArr55[i146];
                objArr55[i146] = null;
                objArr55[12] = obj32;
                this.RatingCompat = i145;
                objArr55[i146] = objArr55[18];
                return 0;
            case 118:
                int i147 = this.RatingCompat;
                int i148 = i147 - 1;
                Object[] objArr56 = this.MediaSessionCompatResultReceiverWrapper;
                Object obj33 = objArr56[i148];
                objArr56[i148] = null;
                objArr56[18] = obj33;
                objArr56[i148] = objArr56[19];
                int[] iArr61 = this.MediaDescriptionCompat;
                this.RatingCompat = i147 + 1;
                iArr61[i147] = 0;
                return 0;
            case 119:
                Object[] objArr57 = this.MediaSessionCompatResultReceiverWrapper;
                int i149 = this.RatingCompat;
                objArr57[i149] = objArr57[18];
                int[] iArr62 = this.MediaDescriptionCompat;
                iArr62[i149 + 1] = 0;
                this.RatingCompat = i149 + 3;
                iArr62[i149 + 2] = 1;
                return 0;
            case 120:
                int[] iArr63 = this.MediaDescriptionCompat;
                int i150 = this.RatingCompat;
                iArr63[i150] = 11;
                iArr63[i150 - 1] = iArr63[i150 - 1] + iArr63[i150];
                this.RatingCompat = i150 + 1;
                iArr63[i150] = iArr63[i150 - 1];
                return 0;
            case 121:
                int i151 = this.RatingCompat;
                int i152 = i151 - 1;
                int[] iArr64 = this.MediaDescriptionCompat;
                int i153 = iArr64[i152];
                iArr64[13] = i153;
                this.RatingCompat = i151;
                iArr64[i152] = i153;
                return 0;
            case 122:
                int[] iArr65 = this.MediaDescriptionCompat;
                int i154 = this.RatingCompat;
                this.RatingCompat = i154 + 1;
                iArr65[i154] = 29;
                return 0;
            case 123:
                int[] iArr66 = this.MediaDescriptionCompat;
                int i155 = this.RatingCompat;
                this.RatingCompat = i155 + 1;
                iArr66[i155] = 87;
                return 0;
            case 124:
                int[] iArr67 = this.MediaDescriptionCompat;
                int i156 = this.RatingCompat;
                this.RatingCompat = i156 + 1;
                iArr67[i156] = 49;
                return 0;
            default:
                return i;
        }
    }

    public r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(Object obj, Object obj2) {
        this.MediaDescriptionCompat = new int[22];
        this.MediaSessionCompatQueueItem = new long[22];
        this.ParcelableVolumeInfo = new float[22];
        this.PlaybackStateCompatCustomAction = new double[22];
        Object[] objArr = new Object[22];
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        objArr[11] = obj;
        objArr[12] = obj2;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public r8lambda4eayLEkyCzRqunjxKNY3fxSMeyo(Object obj) {
        this.MediaDescriptionCompat = new int[22];
        this.MediaSessionCompatQueueItem = new long[22];
        this.ParcelableVolumeInfo = new float[22];
        this.PlaybackStateCompatCustomAction = new double[22];
        Object[] objArr = new Object[22];
        this.MediaSessionCompatResultReceiverWrapper = objArr;
        objArr[11] = obj;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }
}
