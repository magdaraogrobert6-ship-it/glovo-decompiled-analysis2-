package o;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.protobuf.DescriptorProtos$FileOptions;
import com.google.protobuf.DescriptorProtos$MethodOptions;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.location.LocationRequest;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.huawei.riemann.location.common.utils.Constant;
import com.mapbox.common.logger.LogPriority;
import com.qualtrics.digital.EmbeddedFeedbackUtils;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public class currentThreadId {
    public int IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private final long[] MediaDescriptionCompat;
    private final float[] MediaMetadataCompat;
    private final int[] MediaSessionCompatQueueItem;
    private final double[] MediaSessionCompatResultReceiverWrapper;
    private final Object[] ParcelableVolumeInfo;
    private int RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    public Object serializer;
    public long write;

    public int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case 1:
                Object[] objArr = this.ParcelableVolumeInfo;
                int i2 = this.RatingCompat;
                this.RatingCompat = i2 + 1;
                objArr[i2] = objArr[9];
                return 0;
            case 2:
                int i3 = this.RatingCompat - this.IconCompatParcelizer;
                this.RatingCompat = i3;
                this.MediaBrowserCompatMediaItem = i3;
                return 0;
            case 3:
                Object[] objArr2 = this.ParcelableVolumeInfo;
                int i4 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i4 + 1;
                Object obj = objArr2[i4];
                objArr2[i4] = null;
                this.serializer = obj;
                return 0;
            case 4:
                Object[] objArr3 = this.ParcelableVolumeInfo;
                int i5 = this.RatingCompat;
                this.RatingCompat = i5 + 1;
                objArr3[i5] = this.RemoteActionCompatParcelizer;
                return 0;
            case 5:
                Object[] objArr4 = this.ParcelableVolumeInfo;
                int i6 = this.RatingCompat;
                this.RatingCompat = i6 + 1;
                objArr4[i6] = objArr4[10];
                return 0;
            case 6:
                int i7 = this.RatingCompat - 1;
                this.RatingCompat = i7;
                Object[] objArr5 = this.ParcelableVolumeInfo;
                Object obj2 = objArr5[i7];
                objArr5[i7] = null;
                objArr5[9] = obj2;
                return 0;
            case 7:
                int[] iArr = this.MediaSessionCompatQueueItem;
                int i8 = this.RatingCompat;
                this.RatingCompat = i8 + 1;
                iArr[i8] = 2;
                return 0;
            case 8:
                int[] iArr2 = this.MediaSessionCompatQueueItem;
                int i9 = this.RatingCompat;
                iArr2[i9] = 2;
                this.RatingCompat = i9;
                iArr2[i9 - 1] = iArr2[i9 - 1] % iArr2[i9];
                int i10 = i9 - 1;
                this.RatingCompat = i10;
                this.ParcelableVolumeInfo[i10] = null;
                return 0;
            case 9:
                Object[] objArr6 = this.ParcelableVolumeInfo;
                int i11 = this.RatingCompat;
                Object obj3 = objArr6[i11 - 1];
                objArr6[i11 - 1] = null;
                this.serializer = obj3;
                return 0;
            case 11:
                int[] iArr3 = this.MediaSessionCompatQueueItem;
                int i12 = this.RatingCompat;
                this.RatingCompat = i12 + 1;
                iArr3[i12] = this.IconCompatParcelizer;
            case 10:
                return 0;
            case 12:
                int[] iArr4 = this.MediaSessionCompatQueueItem;
                int i13 = this.RatingCompat;
                iArr4[i13] = 15;
                iArr4[i13 - 1] = iArr4[i13 - 1] + iArr4[i13];
                this.RatingCompat = i13 + 1;
                iArr4[i13] = iArr4[i13 - 1];
                return 0;
            case 13:
                int[] iArr5 = this.MediaSessionCompatQueueItem;
                int i14 = this.RatingCompat;
                iArr5[i14] = 128;
                this.RatingCompat = i14;
                iArr5[i14 - 1] = iArr5[i14 - 1] % iArr5[i14];
                return 0;
            case 14:
                int[] iArr6 = this.MediaSessionCompatQueueItem;
                int i15 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i15 + 1;
                this.read = iArr6[i15];
                return 0;
            case 15:
                int i16 = this.RatingCompat - 1;
                this.RatingCompat = i16;
                this.read = this.MediaSessionCompatQueueItem[i16] == 0 ? 0 : 1;
                return 0;
            case 16:
                int i17 = this.RatingCompat;
                int i18 = i17 - 1;
                this.RatingCompat = i18;
                int[] iArr7 = this.MediaSessionCompatQueueItem;
                iArr7[i17 - 2] = iArr7[i17 - 2] % iArr7[i18];
                return 0;
            case 17:
                int[] iArr8 = this.MediaSessionCompatQueueItem;
                int i19 = this.RatingCompat;
                iArr8[i19] = 75;
                this.RatingCompat = i19;
                iArr8[i19 - 1] = iArr8[i19 - 1] + iArr8[i19];
                return 0;
            case 18:
                int[] iArr9 = this.MediaSessionCompatQueueItem;
                int i20 = this.RatingCompat;
                this.RatingCompat = i20 + 1;
                iArr9[i20] = iArr9[i20 - 1];
                return 0;
            case 19:
                int[] iArr10 = this.MediaSessionCompatQueueItem;
                int i21 = this.RatingCompat;
                this.RatingCompat = i21 + 1;
                iArr10[i21] = 128;
                return 0;
            case 20:
                int i22 = this.RatingCompat - 1;
                this.RatingCompat = i22;
                this.read = this.MediaSessionCompatQueueItem[i22] != 0 ? 0 : 1;
                return 0;
            case 21:
                Object[] objArr7 = this.ParcelableVolumeInfo;
                int i23 = this.RatingCompat;
                this.RatingCompat = i23 + 1;
                objArr7[i23] = null;
                return 0;
            case 22:
                int i24 = this.RatingCompat - 1;
                this.RatingCompat = i24;
                this.ParcelableVolumeInfo[i24] = null;
                return 0;
            case 23:
                int[] iArr11 = this.MediaSessionCompatQueueItem;
                int i25 = this.RatingCompat - 1;
                this.RatingCompat = i25;
                this.read = iArr11[i25];
                return 0;
            case 24:
                int[] iArr12 = this.MediaSessionCompatQueueItem;
                int i26 = this.RatingCompat;
                this.RatingCompat = i26 + 1;
                iArr12[i26] = 1;
                return 0;
            case 25:
                int[] iArr13 = this.MediaSessionCompatQueueItem;
                int i27 = this.RatingCompat;
                this.RatingCompat = i27 + 1;
                iArr13[i27] = 0;
                return 0;
            case 26:
                for (int i28 = this.RatingCompat - 1; i28 >= 0; i28--) {
                    this.ParcelableVolumeInfo[i28] = null;
                }
                Object[] objArr8 = this.ParcelableVolumeInfo;
                this.RatingCompat = 1;
                objArr8[0] = this.RemoteActionCompatParcelizer;
                return 0;
            case 27:
                Object[] objArr9 = this.ParcelableVolumeInfo;
                int i29 = this.RatingCompat;
                objArr9[i29] = objArr9[11];
                this.RatingCompat = i29 + 2;
                objArr9[i29 + 1] = objArr9[12];
                return 0;
            case 28:
                int[] iArr14 = this.MediaSessionCompatQueueItem;
                int i30 = this.RatingCompat;
                iArr14[i30] = 2;
                iArr14[i30 + 1] = 2;
                int i31 = i30 + 1;
                this.RatingCompat = i31;
                iArr14[i30] = iArr14[i30] % iArr14[i31];
                return 0;
            case 29:
                int[] iArr15 = this.MediaSessionCompatQueueItem;
                int i32 = this.RatingCompat;
                iArr15[i32] = 63;
                this.RatingCompat = i32;
                iArr15[i32 - 1] = iArr15[i32 - 1] + iArr15[i32];
                return 0;
            case 30:
                int[] iArr16 = this.MediaSessionCompatQueueItem;
                int i33 = this.RatingCompat;
                iArr16[i33] = iArr16[i33 - 1];
                iArr16[i33 + 1] = 128;
                int i34 = i33 + 1;
                this.RatingCompat = i34;
                iArr16[i33] = iArr16[i33] % iArr16[i34];
                return 0;
            case 31:
                int[] iArr17 = this.MediaSessionCompatQueueItem;
                int i35 = this.RatingCompat;
                iArr17[i35] = 2;
                this.RatingCompat = i35;
                iArr17[i35 - 1] = iArr17[i35 - 1] % iArr17[i35];
                return 0;
            case 32:
                int[] iArr18 = this.MediaSessionCompatQueueItem;
                int i36 = this.RatingCompat;
                Object[] objArr10 = this.ParcelableVolumeInfo;
                Object obj4 = objArr10[i36 - 1];
                objArr10[i36 - 1] = null;
                iArr18[i36 - 1] = ((int[]) obj4).length;
                return 0;
            case 33:
                int[] iArr19 = this.MediaSessionCompatQueueItem;
                int i37 = this.RatingCompat;
                iArr19[i37] = 11;
                iArr19[i37 - 1] = iArr19[i37 - 1] + iArr19[i37];
                this.RatingCompat = i37 + 1;
                iArr19[i37] = iArr19[i37 - 1];
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                Object[] objArr11 = this.ParcelableVolumeInfo;
                int i38 = this.RatingCompat;
                objArr11[i38] = objArr11[10];
                objArr11[i38 + 1] = objArr11[11];
                this.RatingCompat = i38 + 3;
                objArr11[i38 + 2] = objArr11[12];
                return 0;
            case 35:
                Object[] objArr12 = this.ParcelableVolumeInfo;
                int i39 = this.RatingCompat;
                this.RatingCompat = i39 + 1;
                objArr12[i39] = null;
                int[] iArr20 = this.MediaSessionCompatQueueItem;
                Object obj5 = objArr12[i39];
                objArr12[i39] = null;
                iArr20[i39] = ((int[]) obj5).length;
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int i40 = this.RatingCompat;
                int i41 = i40 - 1;
                Object[] objArr13 = this.ParcelableVolumeInfo;
                Object obj6 = objArr13[i41];
                objArr13[i41] = null;
                objArr13[9] = obj6;
                this.RatingCompat = i40;
                objArr13[i41] = obj6;
                return 0;
            case 37:
                int[] iArr21 = this.MediaSessionCompatQueueItem;
                int i42 = this.RatingCompat;
                iArr21[i42] = 20;
                this.RatingCompat = i42 + 2;
                iArr21[i42 + 1] = 0;
                return 0;
            case 38:
                int i43 = this.RatingCompat;
                int i44 = i43 - 1;
                this.RatingCompat = i44;
                int[] iArr22 = this.MediaSessionCompatQueueItem;
                iArr22[i43 - 2] = iArr22[i43 - 2] / iArr22[i44];
                int i45 = i43 - 2;
                this.RatingCompat = i45;
                this.ParcelableVolumeInfo[i45] = null;
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                int[] iArr23 = this.MediaSessionCompatQueueItem;
                int i46 = this.RatingCompat;
                this.RatingCompat = i46 + 1;
                iArr23[i46] = 79;
                return 0;
            case 40:
                int[] iArr24 = this.MediaSessionCompatQueueItem;
                int i47 = this.RatingCompat;
                this.RatingCompat = i47 + 1;
                iArr24[i47] = 29;
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                Object[] objArr14 = this.ParcelableVolumeInfo;
                int i48 = this.RatingCompat;
                objArr14[i48] = objArr14[9];
                this.RatingCompat = i48 + 2;
                objArr14[i48 + 1] = objArr14[10];
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int[] iArr25 = this.MediaSessionCompatQueueItem;
                int i49 = this.RatingCompat;
                this.RatingCompat = i49 + 1;
                iArr25[i49] = 65;
                return 0;
            case 43:
                int i50 = this.RatingCompat;
                int i51 = i50 - 1;
                int[] iArr26 = this.MediaSessionCompatQueueItem;
                iArr26[i50 - 2] = iArr26[i50 - 2] + iArr26[i51];
                this.RatingCompat = i50;
                iArr26[i51] = iArr26[i50 - 2];
                return 0;
            case 44:
                int[] iArr27 = this.MediaSessionCompatQueueItem;
                int i52 = this.RatingCompat;
                this.RatingCompat = i52 + 1;
                iArr27[i52] = 9;
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                int i53 = this.RatingCompat;
                int i54 = i53 - 1;
                this.RatingCompat = i54;
                int[] iArr28 = this.MediaSessionCompatQueueItem;
                iArr28[i53 - 2] = iArr28[i53 - 2] + iArr28[i54];
                return 0;
            case 46:
                int i55 = this.RatingCompat;
                int i56 = i55 - 1;
                this.RatingCompat = i56;
                int[] iArr29 = this.MediaSessionCompatQueueItem;
                iArr29[i55 - 2] = iArr29[i55 - 2] % iArr29[i56];
                int i57 = i55 - 2;
                this.RatingCompat = i57;
                this.ParcelableVolumeInfo[i57] = null;
                return 0;
            case 47:
                int[] iArr30 = this.MediaSessionCompatQueueItem;
                int i58 = this.RatingCompat;
                iArr30[i58] = 65;
                this.RatingCompat = i58;
                iArr30[i58 - 1] = iArr30[i58 - 1] + iArr30[i58];
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                int[] iArr31 = this.MediaSessionCompatQueueItem;
                int i59 = this.RatingCompat;
                iArr31[i59] = iArr31[i59 - 1];
                this.RatingCompat = i59 + 2;
                iArr31[i59 + 1] = 128;
                return 0;
            case 49:
                int[] iArr32 = this.MediaSessionCompatQueueItem;
                int i60 = this.RatingCompat;
                this.RatingCompat = i60 + 1;
                iArr32[i60] = 41;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                Object[] objArr15 = this.ParcelableVolumeInfo;
                int i61 = this.RatingCompat;
                objArr15[i61] = objArr15[11];
                int[] iArr33 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i61 + 2;
                iArr33[i61 + 1] = iArr33[12];
                return 0;
            case 51:
                int[] iArr34 = this.MediaSessionCompatQueueItem;
                int i62 = this.RatingCompat;
                iArr34[i62] = 69;
                iArr34[i62 - 1] = iArr34[i62 - 1] + iArr34[i62];
                this.RatingCompat = i62 + 1;
                iArr34[i62] = iArr34[i62 - 1];
                return 0;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                int[] iArr35 = this.MediaSessionCompatQueueItem;
                int i63 = this.RatingCompat;
                iArr35[i63] = 79;
                iArr35[i63 - 1] = iArr35[i63 - 1] + iArr35[i63];
                this.RatingCompat = i63 + 1;
                iArr35[i63] = iArr35[i63 - 1];
                return 0;
            case 53:
                int[] iArr36 = this.MediaSessionCompatQueueItem;
                int i64 = this.RatingCompat;
                iArr36[i64] = 12;
                this.RatingCompat = i64 + 2;
                iArr36[i64 + 1] = 0;
                return 0;
            case 54:
                int i65 = this.RatingCompat;
                int i66 = i65 - 1;
                this.RatingCompat = i66;
                int[] iArr37 = this.MediaSessionCompatQueueItem;
                iArr37[i65 - 2] = iArr37[i65 - 2] / iArr37[i66];
                return 0;
            case 55:
                int[] iArr38 = this.MediaSessionCompatQueueItem;
                int i67 = this.RatingCompat;
                iArr38[i67] = 2;
                this.RatingCompat = i67 + 2;
                iArr38[i67 + 1] = 2;
                return 0;
            case 56:
                int[] iArr39 = this.MediaSessionCompatQueueItem;
                int i68 = this.RatingCompat;
                this.RatingCompat = i68 + 1;
                iArr39[i68] = 1;
                return 0;
            case 57:
                Object[] objArr16 = this.ParcelableVolumeInfo;
                int i69 = this.RatingCompat;
                this.RatingCompat = i69 + 1;
                objArr16[i69] = null;
                int[] iArr40 = this.MediaSessionCompatQueueItem;
                Object obj7 = objArr16[i69];
                objArr16[i69] = null;
                iArr40[i69] = ((int[]) obj7).length;
                this.RatingCompat = i69;
                objArr16[i69] = null;
                return 0;
            case 58:
                int[] iArr41 = this.MediaSessionCompatQueueItem;
                int i70 = this.RatingCompat;
                this.RatingCompat = i70 + 1;
                iArr41[i70] = 81;
                return 0;
            case 59:
                int[] iArr42 = this.MediaSessionCompatQueueItem;
                int i71 = this.RatingCompat;
                this.RatingCompat = i71 + 1;
                iArr42[i71] = 13;
                return 0;
            case 60:
                int[] iArr43 = this.MediaSessionCompatQueueItem;
                int i72 = this.RatingCompat;
                iArr43[i72] = 0;
                this.RatingCompat = i72;
                iArr43[i72 - 1] = iArr43[i72 - 1] / iArr43[i72];
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                int[] iArr44 = this.MediaSessionCompatQueueItem;
                int i73 = this.RatingCompat;
                this.RatingCompat = i73 + 1;
                iArr44[i73] = 98;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                int[] iArr45 = this.MediaSessionCompatQueueItem;
                int i74 = this.RatingCompat;
                this.RatingCompat = i74 + 1;
                iArr45[i74] = 52;
                return 0;
            case 63:
                int[] iArr46 = this.MediaSessionCompatQueueItem;
                int i75 = this.RatingCompat;
                this.RatingCompat = i75 + 1;
                iArr46[i75] = 93;
                return 0;
            case 64:
                int i76 = this.RatingCompat;
                int i77 = i76 - 1;
                int[] iArr47 = this.MediaSessionCompatQueueItem;
                iArr47[i76 - 2] = iArr47[i76 - 2] + iArr47[i77];
                iArr47[i77] = iArr47[i76 - 2];
                this.RatingCompat = i76 + 1;
                iArr47[i76] = 128;
                return 0;
            case 65:
                int[] iArr48 = this.MediaSessionCompatQueueItem;
                int i78 = this.RatingCompat;
                this.RatingCompat = i78 + 1;
                iArr48[i78] = 85;
                return 0;
            case 66:
                int[] iArr49 = this.MediaSessionCompatQueueItem;
                int i79 = this.RatingCompat;
                iArr49[i79] = 19;
                this.RatingCompat = i79;
                iArr49[i79 - 1] = iArr49[i79 - 1] + iArr49[i79];
                return 0;
            case 67:
                int[] iArr50 = this.MediaSessionCompatQueueItem;
                int i80 = this.RatingCompat;
                this.RatingCompat = i80 + 1;
                iArr50[i80] = 27;
                return 0;
            case 68:
                int[] iArr51 = this.MediaSessionCompatQueueItem;
                int i81 = this.RatingCompat;
                this.RatingCompat = i81 + 1;
                iArr51[i81] = 34;
                return 0;
            case 69:
                int[] iArr52 = this.MediaSessionCompatQueueItem;
                int i82 = this.RatingCompat;
                this.RatingCompat = i82 + 1;
                iArr52[i82] = 55;
                return 0;
            case 70:
                int[] iArr53 = this.MediaSessionCompatQueueItem;
                int i83 = this.RatingCompat;
                this.RatingCompat = i83 + 1;
                iArr53[i83] = 75;
                return 0;
            case 71:
                int[] iArr54 = this.MediaSessionCompatQueueItem;
                int i84 = this.RatingCompat;
                this.RatingCompat = i84 + 1;
                iArr54[i84] = 92;
                return 0;
            case 72:
                int[] iArr55 = this.MediaSessionCompatQueueItem;
                int i85 = this.RatingCompat;
                this.RatingCompat = i85 + 1;
                iArr55[i85] = 18;
                return 0;
            case 73:
                int[] iArr56 = this.MediaSessionCompatQueueItem;
                int i86 = this.RatingCompat;
                this.RatingCompat = i86 + 1;
                iArr56[i86] = 47;
                return 0;
            case 74:
                int[] iArr57 = this.MediaSessionCompatQueueItem;
                int i87 = this.RatingCompat;
                iArr57[i87] = 61;
                iArr57[i87 - 1] = iArr57[i87 - 1] + iArr57[i87];
                this.RatingCompat = i87 + 1;
                iArr57[i87] = iArr57[i87 - 1];
                return 0;
            case 75:
                int[] iArr58 = this.MediaSessionCompatQueueItem;
                int i88 = this.RatingCompat;
                iArr58[i88] = 31;
                this.RatingCompat = i88;
                iArr58[i88 - 1] = iArr58[i88 - 1] + iArr58[i88];
                return 0;
            case 76:
                int[] iArr59 = this.MediaSessionCompatQueueItem;
                int i89 = this.RatingCompat;
                iArr59[i89] = 87;
                iArr59[i89 - 1] = iArr59[i89 - 1] + iArr59[i89];
                this.RatingCompat = i89 + 1;
                iArr59[i89] = iArr59[i89 - 1];
                return 0;
            case 77:
                int[] iArr60 = this.MediaSessionCompatQueueItem;
                int i90 = this.RatingCompat;
                this.RatingCompat = i90 + 1;
                iArr60[i90] = 56;
                return 0;
            case 78:
                int[] iArr61 = this.MediaSessionCompatQueueItem;
                int i91 = this.RatingCompat;
                iArr61[i91] = 0;
                this.RatingCompat = i91;
                iArr61[i91 - 1] = iArr61[i91 - 1] / iArr61[i91];
                int i92 = i91 - 1;
                this.RatingCompat = i92;
                this.ParcelableVolumeInfo[i92] = null;
                return 0;
            case 79:
                int[] iArr62 = this.MediaSessionCompatQueueItem;
                int i93 = this.RatingCompat;
                this.RatingCompat = i93 + 1;
                iArr62[i93] = 69;
                return 0;
            case 80:
                int[] iArr63 = this.MediaSessionCompatQueueItem;
                int i94 = this.RatingCompat;
                this.RatingCompat = i94 + 1;
                iArr63[i94] = 33;
                return 0;
            case 81:
                int[] iArr64 = this.MediaSessionCompatQueueItem;
                int i95 = this.RatingCompat;
                iArr64[i95] = 95;
                iArr64[i95 - 1] = iArr64[i95 - 1] + iArr64[i95];
                this.RatingCompat = i95 + 1;
                iArr64[i95] = iArr64[i95 - 1];
                return 0;
            case 82:
                int[] iArr65 = this.MediaSessionCompatQueueItem;
                int i96 = this.RatingCompat;
                iArr65[i96] = 53;
                iArr65[i96 - 1] = iArr65[i96 - 1] + iArr65[i96];
                this.RatingCompat = i96 + 1;
                iArr65[i96] = iArr65[i96 - 1];
                return 0;
            case 83:
                int[] iArr66 = this.MediaSessionCompatQueueItem;
                int i97 = this.RatingCompat;
                this.RatingCompat = i97 + 1;
                iArr66[i97] = 17;
                return 0;
            case 84:
                int[] iArr67 = this.MediaSessionCompatQueueItem;
                int i98 = this.RatingCompat;
                iArr67[i98] = 23;
                this.RatingCompat = i98;
                iArr67[i98 - 1] = iArr67[i98 - 1] + iArr67[i98];
                return 0;
            case 85:
                int[] iArr68 = this.MediaSessionCompatQueueItem;
                int i99 = this.RatingCompat;
                this.RatingCompat = i99 + 1;
                iArr68[i99] = 97;
                return 0;
            case 86:
                int[] iArr69 = this.MediaSessionCompatQueueItem;
                int i100 = this.RatingCompat;
                iArr69[i100] = 30;
                this.RatingCompat = i100 + 2;
                iArr69[i100 + 1] = 0;
                return 0;
            case 87:
                int[] iArr70 = this.MediaSessionCompatQueueItem;
                int i101 = this.RatingCompat;
                iArr70[i101] = 37;
                this.RatingCompat = i101;
                iArr70[i101 - 1] = iArr70[i101 - 1] + iArr70[i101];
                return 0;
            case 88:
                int[] iArr71 = this.MediaSessionCompatQueueItem;
                int i102 = this.RatingCompat;
                this.RatingCompat = i102 + 1;
                iArr71[i102] = 115;
                return 0;
            case 89:
                int[] iArr72 = this.MediaSessionCompatQueueItem;
                int i103 = this.RatingCompat;
                this.RatingCompat = i103 + 1;
                iArr72[i103] = 11;
                return 0;
            case 90:
                int[] iArr73 = this.MediaSessionCompatQueueItem;
                int i104 = this.RatingCompat;
                this.RatingCompat = i104 + 1;
                iArr73[i104] = 39;
                return 0;
            case 91:
                int[] iArr74 = this.MediaSessionCompatQueueItem;
                int i105 = this.RatingCompat;
                iArr74[i105] = 33;
                this.RatingCompat = i105;
                iArr74[i105 - 1] = iArr74[i105 - 1] + iArr74[i105];
                return 0;
            case 92:
                int[] iArr75 = this.MediaSessionCompatQueueItem;
                int i106 = this.RatingCompat;
                iArr75[i106] = 54;
                iArr75[i106 + 1] = 0;
                int i107 = i106 + 1;
                this.RatingCompat = i107;
                iArr75[i106] = iArr75[i106] / iArr75[i107];
                return 0;
            case 93:
                int[] iArr76 = this.MediaSessionCompatQueueItem;
                int i108 = this.RatingCompat;
                iArr76[i108] = 91;
                this.RatingCompat = i108 + 2;
                iArr76[i108 + 1] = 0;
                return 0;
            case 94:
                int[] iArr77 = this.MediaSessionCompatQueueItem;
                int i109 = this.RatingCompat;
                iArr77[i109] = 93;
                iArr77[i109 - 1] = iArr77[i109 - 1] + iArr77[i109];
                this.RatingCompat = i109 + 1;
                iArr77[i109] = iArr77[i109 - 1];
                return 0;
            case 95:
                Object[] objArr17 = this.ParcelableVolumeInfo;
                int i110 = this.RatingCompat;
                this.RatingCompat = i110 + 1;
                objArr17[i110] = objArr17[11];
                return 0;
            case 96:
                int[] iArr78 = this.MediaSessionCompatQueueItem;
                int i111 = this.RatingCompat;
                this.RatingCompat = i111 + 1;
                iArr78[i111] = 123;
                return 0;
            case 97:
                Object[] objArr18 = this.ParcelableVolumeInfo;
                int i112 = this.RatingCompat;
                objArr18[i112] = objArr18[9];
                objArr18[i112 + 1] = objArr18[10];
                this.RatingCompat = i112 + 3;
                objArr18[i112 + 2] = objArr18[11];
                return 0;
            case 98:
                int[] iArr79 = this.MediaSessionCompatQueueItem;
                int i113 = this.RatingCompat;
                Object[] objArr19 = this.ParcelableVolumeInfo;
                Object obj8 = objArr19[i113 - 1];
                objArr19[i113 - 1] = null;
                iArr79[i113 - 1] = ((int[]) obj8).length;
                int i114 = i113 - 1;
                this.RatingCompat = i114;
                objArr19[i114] = null;
                return 0;
            case LogPriority.NONE /* 99 */:
                int[] iArr80 = this.MediaSessionCompatQueueItem;
                int i115 = this.RatingCompat;
                this.RatingCompat = i115 + 1;
                iArr80[i115] = 38;
                return 0;
            case 100:
                int[] iArr81 = this.MediaSessionCompatQueueItem;
                int i116 = this.RatingCompat;
                this.RatingCompat = i116 + 1;
                iArr81[i116] = 51;
                return 0;
            case 101:
                int[] iArr82 = this.MediaSessionCompatQueueItem;
                int i117 = this.RatingCompat;
                this.RatingCompat = i117 + 1;
                iArr82[i117] = 125;
                return 0;
            case 102:
                int[] iArr83 = this.MediaSessionCompatQueueItem;
                int i118 = this.RatingCompat;
                this.RatingCompat = i118 + 1;
                iArr83[i118] = 95;
                return 0;
            case 103:
                int[] iArr84 = this.MediaSessionCompatQueueItem;
                int i119 = this.RatingCompat;
                this.RatingCompat = i119 + 1;
                iArr84[i119] = 54;
                return 0;
            case 104:
                Object[] objArr20 = this.ParcelableVolumeInfo;
                int i120 = this.RatingCompat;
                objArr20[i120] = objArr20[10];
                objArr20[i120 + 1] = objArr20[11];
                int[] iArr85 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i120 + 3;
                iArr85[i120 + 2] = iArr85[12];
                return 0;
            case 105:
                Object[] objArr21 = this.ParcelableVolumeInfo;
                int i121 = this.RatingCompat;
                this.RatingCompat = i121 + 1;
                objArr21[i121] = objArr21[13];
                return 0;
            case GwiErrorCode.ALG_LIBRARY_NOT_EXIST /* 106 */:
                Object[] objArr22 = this.ParcelableVolumeInfo;
                int i122 = this.RatingCompat;
                objArr22[i122] = objArr22[14];
                this.RatingCompat = i122 + 2;
                objArr22[i122 + 1] = objArr22[15];
                return 0;
            case 107:
                int[] iArr86 = this.MediaSessionCompatQueueItem;
                int i123 = this.RatingCompat;
                iArr86[i123] = 35;
                this.RatingCompat = i123;
                iArr86[i123 - 1] = iArr86[i123 - 1] + iArr86[i123];
                return 0;
            case ActivityIdentificationData.RUNNING /* 108 */:
                Object[] objArr23 = this.ParcelableVolumeInfo;
                int i124 = this.RatingCompat;
                objArr23[i124] = objArr23[11];
                int[] iArr87 = this.MediaSessionCompatQueueItem;
                iArr87[i124 + 1] = iArr87[12];
                this.RatingCompat = i124 + 3;
                objArr23[i124 + 2] = objArr23[13];
                return 0;
            case 109:
                Object[] objArr24 = this.ParcelableVolumeInfo;
                int i125 = this.RatingCompat;
                this.RatingCompat = i125 + 1;
                objArr24[i125] = objArr24[14];
                return 0;
            case 110:
                Object[] objArr25 = this.ParcelableVolumeInfo;
                int i126 = this.RatingCompat;
                this.RatingCompat = i126 + 1;
                objArr25[i126] = objArr25[15];
                return 0;
            case 111:
                int[] iArr88 = this.MediaSessionCompatQueueItem;
                int i127 = this.RatingCompat;
                iArr88[i127] = 67;
                this.RatingCompat = i127;
                iArr88[i127 - 1] = iArr88[i127 - 1] + iArr88[i127];
                return 0;
            case 112:
                int[] iArr89 = this.MediaSessionCompatQueueItem;
                int i128 = this.RatingCompat;
                this.RatingCompat = i128 + 1;
                iArr89[i128] = 45;
                return 0;
            case 113:
                Object[] objArr26 = this.ParcelableVolumeInfo;
                int i129 = this.RatingCompat;
                objArr26[i129] = objArr26[13];
                objArr26[i129 + 1] = objArr26[14];
                this.RatingCompat = i129 + 3;
                objArr26[i129 + 2] = objArr26[15];
                return 0;
            case 114:
                int[] iArr90 = this.MediaSessionCompatQueueItem;
                int i130 = this.RatingCompat;
                this.RatingCompat = i130 + 1;
                iArr90[i130] = 24;
                return 0;
            case 115:
                int[] iArr91 = this.MediaSessionCompatQueueItem;
                int i131 = this.RatingCompat;
                this.RatingCompat = i131 + 1;
                iArr91[i131] = 73;
                return 0;
            case 116:
                int[] iArr92 = this.MediaSessionCompatQueueItem;
                int i132 = this.RatingCompat;
                this.RatingCompat = i132 + 1;
                iArr92[i132] = 28;
                return 0;
            case 117:
                int[] iArr93 = this.MediaSessionCompatQueueItem;
                int i133 = this.RatingCompat;
                this.RatingCompat = i133 + 1;
                iArr93[i133] = 91;
                return 0;
            case 118:
                int[] iArr94 = this.MediaSessionCompatQueueItem;
                int i134 = this.RatingCompat;
                this.RatingCompat = i134 + 1;
                iArr94[i134] = 21;
                return 0;
            case 119:
                int[] iArr95 = this.MediaSessionCompatQueueItem;
                int i135 = this.RatingCompat;
                this.RatingCompat = i135 + 1;
                iArr95[i135] = 30;
                return 0;
            case 120:
                int[] iArr96 = this.MediaSessionCompatQueueItem;
                int i136 = this.RatingCompat;
                this.RatingCompat = i136 + 1;
                iArr96[i136] = 0;
                return 0;
            case 121:
                int[] iArr97 = this.MediaSessionCompatQueueItem;
                int i137 = this.RatingCompat;
                this.RatingCompat = i137 + 1;
                iArr97[i137] = 53;
                return 0;
            case 122:
                int i138 = this.RatingCompat;
                int i139 = i138 - 1;
                Object[] objArr27 = this.ParcelableVolumeInfo;
                Object obj9 = objArr27[i139];
                objArr27[i139] = null;
                objArr27[17] = obj9;
                int[] iArr98 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i138;
                iArr98[i139] = 0;
                return 0;
            case 123:
                int i140 = this.RatingCompat;
                int i141 = i140 - 1;
                Object[] objArr28 = this.ParcelableVolumeInfo;
                Object obj10 = objArr28[i141];
                objArr28[i141] = null;
                objArr28[18] = obj10;
                this.RatingCompat = i140;
                objArr28[i141] = objArr28[17];
                return 0;
            case 124:
                Object[] objArr29 = this.ParcelableVolumeInfo;
                int i142 = this.RatingCompat;
                this.RatingCompat = i142 + 1;
                objArr29[i142] = objArr29[18];
                return 0;
            case 125:
                int i143 = this.RatingCompat;
                int i144 = i143 - 1;
                Object[] objArr30 = this.ParcelableVolumeInfo;
                Object obj11 = objArr30[i144];
                objArr30[i144] = null;
                objArr30[18] = obj11;
                this.RatingCompat = i143;
                objArr30[i144] = obj11;
                return 0;
            case 126:
                int i145 = this.RatingCompat;
                int i146 = i145 - 1;
                Object[] objArr31 = this.ParcelableVolumeInfo;
                Object obj12 = objArr31[i146];
                objArr31[i146] = null;
                objArr31[21] = obj12;
                this.RatingCompat = i145;
                objArr31[i146] = obj12;
                return 0;
            case 127:
                int i147 = this.RatingCompat - 1;
                this.RatingCompat = i147;
                Object[] objArr32 = this.ParcelableVolumeInfo;
                Object obj13 = objArr32[i147];
                objArr32[i147] = null;
                objArr32[19] = obj13;
                return 0;
            case androidx.compose.ui.graphics.Fields.SpotShadowColor /* 128 */:
                Object[] objArr33 = this.ParcelableVolumeInfo;
                int i148 = this.RatingCompat;
                this.RatingCompat = i148 + 1;
                objArr33[i148] = objArr33[21];
                return 0;
            case 129:
                int i149 = this.RatingCompat - 1;
                this.RatingCompat = i149;
                Object[] objArr34 = this.ParcelableVolumeInfo;
                Object obj14 = objArr34[i149];
                objArr34[i149] = null;
                objArr34[18] = obj14;
                return 0;
            case 130:
                int i150 = this.RatingCompat - 1;
                this.RatingCompat = i150;
                Object[] objArr35 = this.ParcelableVolumeInfo;
                Object obj15 = objArr35[i150];
                objArr35[i150] = null;
                objArr35[20] = obj15;
                return 0;
            case 131:
                int i151 = this.RatingCompat - 1;
                this.RatingCompat = i151;
                Object[] objArr36 = this.ParcelableVolumeInfo;
                Object obj16 = objArr36[i151];
                objArr36[i151] = null;
                this.read = obj16 != null ? 0 : 1;
                return 0;
            case 132:
                int i152 = this.RatingCompat - 1;
                this.RatingCompat = i152;
                Object[] objArr37 = this.ParcelableVolumeInfo;
                Object obj17 = objArr37[i152];
                objArr37[i152] = null;
                objArr37[10] = obj17;
                return 0;
            case 133:
                Object[] objArr38 = this.ParcelableVolumeInfo;
                int i153 = this.RatingCompat;
                this.RatingCompat = i153 + 1;
                objArr38[i153] = objArr38[17];
                return 0;
            case 134:
                Object[] objArr39 = this.ParcelableVolumeInfo;
                int i154 = this.RatingCompat;
                this.RatingCompat = i154 + 1;
                objArr39[i154] = objArr39[20];
                return 0;
            case 135:
                int i155 = this.RatingCompat;
                int i156 = i155 - 1;
                Object[] objArr40 = this.ParcelableVolumeInfo;
                Object obj18 = objArr40[i156];
                objArr40[i156] = null;
                objArr40[22] = obj18;
                this.RatingCompat = i155;
                objArr40[i156] = obj18;
                return 0;
            case 136:
                int i157 = this.RatingCompat - 1;
                this.RatingCompat = i157;
                Object[] objArr41 = this.ParcelableVolumeInfo;
                Object obj19 = objArr41[i157];
                objArr41[i157] = null;
                objArr41[23] = obj19;
                return 0;
            case 137:
                Object[] objArr42 = this.ParcelableVolumeInfo;
                int i158 = this.RatingCompat;
                this.RatingCompat = i158 + 1;
                objArr42[i158] = objArr42[23];
                return 0;
            case 138:
                int i159 = this.RatingCompat;
                int i160 = i159 - 1;
                Object[] objArr43 = this.ParcelableVolumeInfo;
                Object obj20 = objArr43[i160];
                objArr43[i160] = null;
                objArr43[23] = obj20;
                this.RatingCompat = i159;
                objArr43[i160] = obj20;
                return 0;
            case 139:
                int i161 = this.RatingCompat;
                int i162 = i161 - 1;
                Object[] objArr44 = this.ParcelableVolumeInfo;
                Object obj21 = objArr44[i162];
                objArr44[i162] = null;
                objArr44[24] = obj21;
                this.RatingCompat = i161;
                objArr44[i162] = objArr44[23];
                return 0;
            case 140:
                Object[] objArr45 = this.ParcelableVolumeInfo;
                int i163 = this.RatingCompat;
                this.RatingCompat = i163 + 1;
                objArr45[i163] = objArr45[24];
                return 0;
            case 141:
                int i164 = this.RatingCompat;
                int i165 = i164 - 1;
                int[] iArr99 = this.MediaSessionCompatQueueItem;
                iArr99[13] = iArr99[i165];
                Object[] objArr46 = this.ParcelableVolumeInfo;
                this.RatingCompat = i164;
                objArr46[i165] = objArr46[22];
                return 0;
            case 142:
                int i166 = this.RatingCompat;
                int i167 = i166 - 1;
                Object[] objArr47 = this.ParcelableVolumeInfo;
                Object obj22 = objArr47[i167];
                objArr47[i167] = null;
                objArr47[24] = obj22;
                this.RatingCompat = i166;
                objArr47[i167] = obj22;
                return 0;
            case 143:
                int i168 = this.RatingCompat - 1;
                this.RatingCompat = i168;
                int[] iArr100 = this.MediaSessionCompatQueueItem;
                iArr100[14] = iArr100[i168];
                return 0;
            case 144:
                int[] iArr101 = this.MediaSessionCompatQueueItem;
                int i169 = this.RatingCompat;
                this.RatingCompat = i169 + 1;
                iArr101[i169] = iArr101[14];
                return 0;
            case 145:
                int i170 = this.RatingCompat;
                int i171 = i170 - 1;
                int[] iArr102 = this.MediaSessionCompatQueueItem;
                int i172 = iArr102[i171];
                iArr102[14] = i172;
                this.RatingCompat = i170;
                iArr102[i171] = i172;
                return 0;
            case 146:
                Object[] objArr48 = this.ParcelableVolumeInfo;
                int i173 = this.RatingCompat;
                this.RatingCompat = i173 + 1;
                objArr48[i173] = objArr48[22];
                return 0;
            case 147:
                int i174 = this.RatingCompat - 1;
                this.RatingCompat = i174;
                Object[] objArr49 = this.ParcelableVolumeInfo;
                Object obj23 = objArr49[i174];
                objArr49[i174] = null;
                objArr49[24] = obj23;
                return 0;
            case 148:
                int i175 = this.RatingCompat - 1;
                this.RatingCompat = i175;
                Object[] objArr50 = this.ParcelableVolumeInfo;
                Object obj24 = objArr50[i175];
                objArr50[i175] = null;
                objArr50[25] = obj24;
                return 0;
            case 149:
                Object[] objArr51 = this.ParcelableVolumeInfo;
                int i176 = this.RatingCompat;
                this.RatingCompat = i176 + 1;
                objArr51[i176] = objArr51[25];
                return 0;
            case 150:
                int i177 = this.RatingCompat;
                int i178 = i177 - 1;
                Object[] objArr52 = this.ParcelableVolumeInfo;
                Object obj25 = objArr52[i178];
                objArr52[i178] = null;
                objArr52[25] = obj25;
                this.RatingCompat = i177;
                objArr52[i178] = obj25;
                return 0;
            case 151:
                long[] jArr = this.MediaDescriptionCompat;
                int i179 = this.RatingCompat;
                this.RatingCompat = i179 + 1;
                jArr[i179] = this.write;
                return 0;
            case 152:
                int i180 = this.RatingCompat;
                int i181 = i180 - 1;
                long[] jArr2 = this.MediaDescriptionCompat;
                long j = jArr2[i181];
                jArr2[15] = j;
                this.RatingCompat = i180;
                jArr2[i181] = j;
                this.MediaSessionCompatQueueItem[i180 - 1] = (int) jArr2[i180 - 1];
                return 0;
            case 153:
                int i182 = this.RatingCompat - 1;
                this.RatingCompat = i182;
                int[] iArr103 = this.MediaSessionCompatQueueItem;
                iArr103[11] = iArr103[i182];
                return 0;
            case 154:
                int[] iArr104 = this.MediaSessionCompatQueueItem;
                int i183 = this.RatingCompat;
                this.RatingCompat = i183 + 1;
                iArr104[i183] = iArr104[11];
                return 0;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                int i184 = this.RatingCompat - 1;
                this.RatingCompat = i184;
                Object[] objArr53 = this.ParcelableVolumeInfo;
                Object obj26 = objArr53[i184];
                objArr53[i184] = null;
                objArr53[26] = obj26;
                return 0;
            case 156:
                Object[] objArr54 = this.ParcelableVolumeInfo;
                int i185 = this.RatingCompat;
                objArr54[i185] = objArr54[17];
                this.RatingCompat = i185 + 2;
                objArr54[i185 + 1] = objArr54[25];
                return 0;
            case 157:
                Object[] objArr55 = this.ParcelableVolumeInfo;
                int i186 = this.RatingCompat;
                this.RatingCompat = i186 + 1;
                objArr55[i186] = objArr55[26];
                return 0;
            case 158:
                int i187 = this.RatingCompat - 1;
                this.RatingCompat = i187;
                this.read = this.MediaSessionCompatQueueItem[i187] > 0 ? 0 : 1;
                return 0;
            case 159:
                int i188 = this.RatingCompat;
                int i189 = i188 - 1;
                int[] iArr105 = this.MediaSessionCompatQueueItem;
                int i190 = iArr105[i189];
                iArr105[12] = i190;
                this.RatingCompat = i188;
                iArr105[i189] = i190;
                return 0;
            case 160:
                int[] iArr106 = this.MediaSessionCompatQueueItem;
                int i191 = this.RatingCompat;
                iArr106[i191] = iArr106[11];
                this.RatingCompat = i191;
                iArr106[i191 - 1] = iArr106[i191 - 1] % iArr106[i191];
                return 0;
            case 161:
                Object[] objArr56 = this.ParcelableVolumeInfo;
                int i192 = this.RatingCompat;
                objArr56[i192] = objArr56[24];
                int[] iArr107 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i192 + 2;
                iArr107[i192 + 1] = iArr107[11];
                return 0;
            case 162:
                int i193 = this.RatingCompat;
                int i194 = i193 - 1;
                Object[] objArr57 = this.ParcelableVolumeInfo;
                objArr57[i194] = null;
                this.RatingCompat = i193;
                objArr57[i194] = objArr57[24];
                return 0;
            case 163:
                int i195 = this.RatingCompat;
                int i196 = i195 - 1;
                Object[] objArr58 = this.ParcelableVolumeInfo;
                Object obj27 = objArr58[i196];
                objArr58[i196] = null;
                objArr58[25] = obj27;
                objArr58[i196] = objArr58[17];
                this.RatingCompat = i195 + 1;
                objArr58[i195] = objArr58[24];
                return 0;
            case 164:
                int i197 = this.RatingCompat - 1;
                this.RatingCompat = i197;
                Object[] objArr59 = this.ParcelableVolumeInfo;
                Object obj28 = objArr59[i197];
                objArr59[i197] = null;
                objArr59[22] = obj28;
                return 0;
            case 165:
                int[] iArr108 = this.MediaSessionCompatQueueItem;
                int i198 = this.RatingCompat;
                this.RatingCompat = i198 + 1;
                iArr108[i198] = iArr108[13];
                return 0;
            case 166:
                int i199 = this.RatingCompat;
                int i200 = i199 - 1;
                int[] iArr109 = this.MediaSessionCompatQueueItem;
                int i201 = iArr109[i200];
                iArr109[13] = i201;
                this.RatingCompat = i199;
                iArr109[i200] = i201;
                return 0;
            case 167:
                int i202 = this.RatingCompat - 1;
                this.RatingCompat = i202;
                int[] iArr110 = this.MediaSessionCompatQueueItem;
                iArr110[13] = iArr110[i202];
                return 0;
            case DateTimeConstants.HOURS_PER_WEEK /* 168 */:
                int i203 = this.RatingCompat - 1;
                this.RatingCompat = i203;
                Object[] objArr60 = this.ParcelableVolumeInfo;
                Object obj29 = objArr60[i203];
                objArr60[i203] = null;
                objArr60[21] = obj29;
                return 0;
            case 169:
                Object[] objArr61 = this.ParcelableVolumeInfo;
                int i204 = this.RatingCompat;
                objArr61[i204] = objArr61[17];
                objArr61[i204 + 1] = objArr61[20];
                this.RatingCompat = i204 + 3;
                objArr61[i204 + 2] = objArr61[21];
                return 0;
            case 170:
                Object[] objArr62 = this.ParcelableVolumeInfo;
                int i205 = this.RatingCompat;
                this.RatingCompat = i205 + 1;
                objArr62[i205] = objArr62[19];
                return 0;
            case 171:
                int i206 = this.RatingCompat;
                int i207 = i206 - 1;
                Object[] objArr63 = this.ParcelableVolumeInfo;
                Object obj30 = objArr63[i207];
                objArr63[i207] = null;
                objArr63[10] = obj30;
                objArr63[i207] = objArr63[18];
                this.RatingCompat = i206 + 1;
                objArr63[i206] = objArr63[10];
                return 0;
            case 172:
                int i208 = this.RatingCompat;
                int i209 = i208 - 1;
                Object[] objArr64 = this.ParcelableVolumeInfo;
                Object obj31 = objArr64[i209];
                objArr64[i209] = null;
                objArr64[10] = obj31;
                this.RatingCompat = i208;
                objArr64[i209] = obj31;
                return 0;
            case 173:
                Object[] objArr65 = this.ParcelableVolumeInfo;
                int i210 = this.RatingCompat;
                objArr65[i210] = objArr65[18];
                this.RatingCompat = i210 + 2;
                objArr65[i210 + 1] = objArr65[20];
                return 0;
            case 174:
                int i211 = this.RatingCompat;
                int i212 = i211 - 1;
                Object[] objArr66 = this.ParcelableVolumeInfo;
                Object obj32 = objArr66[i212];
                objArr66[i212] = null;
                objArr66[10] = obj32;
                this.RatingCompat = i211;
                objArr66[i212] = objArr66[17];
                return 0;
            case 175:
                int[] iArr111 = this.MediaSessionCompatQueueItem;
                int i213 = this.RatingCompat;
                iArr111[i213] = 11;
                this.RatingCompat = i213;
                iArr111[i213 - 1] = iArr111[i213 - 1] + iArr111[i213];
                return 0;
            case 176:
                int[] iArr112 = this.MediaSessionCompatQueueItem;
                int i214 = this.RatingCompat;
                iArr112[i214] = 91;
                this.RatingCompat = i214;
                iArr112[i214 - 1] = iArr112[i214 - 1] + iArr112[i214];
                return 0;
            case 177:
                int[] iArr113 = this.MediaSessionCompatQueueItem;
                int i215 = this.RatingCompat;
                this.RatingCompat = i215 + 1;
                iArr113[i215] = 105;
                return 0;
            case 178:
                int[] iArr114 = this.MediaSessionCompatQueueItem;
                int i216 = this.RatingCompat;
                this.RatingCompat = i216 + 1;
                iArr114[i216] = 58;
                return 0;
            case 179:
                int i217 = this.RatingCompat - 1;
                this.RatingCompat = i217;
                Object[] objArr67 = this.ParcelableVolumeInfo;
                Object obj33 = objArr67[i217];
                objArr67[i217] = null;
                objArr67[11] = obj33;
                return 0;
            case 180:
                int i218 = this.RatingCompat;
                int i219 = i218 - 1;
                int[] iArr115 = this.MediaSessionCompatQueueItem;
                int i220 = iArr115[i219];
                iArr115[10] = i220;
                this.RatingCompat = i218;
                iArr115[i219] = i220;
                return 0;
            case 181:
                int i221 = this.RatingCompat;
                int i222 = i221 - 1;
                Object[] objArr68 = this.ParcelableVolumeInfo;
                Object obj34 = objArr68[i222];
                objArr68[i222] = null;
                objArr68[11] = obj34;
                this.RatingCompat = i221;
                objArr68[i222] = obj34;
                return 0;
            case 182:
                int i223 = this.RatingCompat;
                int i224 = i223 - 1;
                Object[] objArr69 = this.ParcelableVolumeInfo;
                objArr69[i224] = null;
                this.RatingCompat = i223;
                objArr69[i224] = objArr69[11];
                return 0;
            case 183:
                int i225 = this.RatingCompat - 1;
                this.RatingCompat = i225;
                Object[] objArr70 = this.ParcelableVolumeInfo;
                Object obj35 = objArr70[i225];
                objArr70[i225] = null;
                this.read = obj35 == null ? 0 : 1;
                return 0;
            case 184:
                Object[] objArr71 = this.ParcelableVolumeInfo;
                int i226 = this.RatingCompat;
                objArr71[i226] = null;
                this.RatingCompat = i226;
                Object obj36 = objArr71[i226];
                objArr71[i226] = null;
                objArr71[11] = obj36;
                return 0;
            case 185:
                int i227 = this.RatingCompat;
                int i228 = i227 - 1;
                Object[] objArr72 = this.ParcelableVolumeInfo;
                Object obj37 = objArr72[i228];
                objArr72[i228] = null;
                objArr72[12] = obj37;
                this.RatingCompat = i227;
                objArr72[i228] = objArr72[11];
                return 0;
            case 186:
                int i229 = this.RatingCompat;
                int i230 = i229 - 1;
                Object[] objArr73 = this.ParcelableVolumeInfo;
                Object obj38 = objArr73[i230];
                objArr73[i230] = null;
                objArr73[11] = obj38;
                objArr73[i230] = objArr73[9];
                this.RatingCompat = i229 + 1;
                objArr73[i229] = objArr73[11];
                return 0;
            case 187:
                int[] iArr116 = this.MediaSessionCompatQueueItem;
                int i231 = this.RatingCompat;
                iArr116[i231] = 57;
                this.RatingCompat = i231;
                iArr116[i231 - 1] = iArr116[i231 - 1] + iArr116[i231];
                return 0;
            case 188:
                int[] iArr117 = this.MediaSessionCompatQueueItem;
                int i232 = this.RatingCompat;
                this.RatingCompat = i232 + 1;
                iArr117[i232] = 89;
                return 0;
            case 189:
                int[] iArr118 = this.MediaSessionCompatQueueItem;
                int i233 = this.RatingCompat;
                iArr118[i233] = 77;
                this.RatingCompat = i233 + 2;
                iArr118[i233 + 1] = 0;
                return 0;
            case 190:
                int[] iArr119 = this.MediaSessionCompatQueueItem;
                int i234 = this.RatingCompat;
                this.RatingCompat = i234 + 1;
                iArr119[i234] = 99;
                return 0;
            case 191:
                int i235 = this.RatingCompat - 1;
                this.RatingCompat = i235;
                Object[] objArr74 = this.ParcelableVolumeInfo;
                Object obj39 = objArr74[i235];
                objArr74[i235] = null;
                objArr74[13] = obj39;
                return 0;
            case 192:
                int[] iArr120 = this.MediaSessionCompatQueueItem;
                int i236 = this.RatingCompat;
                iArr120[i236] = iArr120[12];
                Object[] objArr75 = this.ParcelableVolumeInfo;
                this.RatingCompat = i236 + 2;
                objArr75[i236 + 1] = objArr75[10];
                return 0;
            case 193:
                Object[] objArr76 = this.ParcelableVolumeInfo;
                int i237 = this.RatingCompat;
                objArr76[i237] = objArr76[11];
                this.RatingCompat = i237 + 2;
                objArr76[i237 + 1] = null;
                return 0;
            case 194:
                int[] iArr121 = this.MediaSessionCompatQueueItem;
                int i238 = this.RatingCompat;
                this.RatingCompat = i238 + 1;
                iArr121[i238] = 5;
                return 0;
            case 195:
                int i239 = this.RatingCompat;
                int i240 = i239 - 1;
                Object[] objArr77 = this.ParcelableVolumeInfo;
                Object obj40 = objArr77[i240];
                objArr77[i240] = null;
                objArr77[10] = obj40;
                this.RatingCompat = i239;
                objArr77[i240] = objArr77[13];
                return 0;
            case 196:
                Object[] objArr78 = this.ParcelableVolumeInfo;
                int i241 = this.RatingCompat;
                objArr78[i241] = null;
                objArr78[i241 + 1] = objArr78[10];
                int[] iArr122 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i241 + 3;
                iArr122[i241 + 2] = 3;
                return 0;
            case 197:
                int[] iArr123 = this.MediaSessionCompatQueueItem;
                int i242 = this.RatingCompat;
                iArr123[i242] = 111;
                iArr123[i242 - 1] = iArr123[i242 - 1] + iArr123[i242];
                this.RatingCompat = i242 + 1;
                iArr123[i242] = iArr123[i242 - 1];
                return 0;
            case 198:
                Object[] objArr79 = this.ParcelableVolumeInfo;
                int i243 = this.RatingCompat;
                objArr79[i243] = objArr79[9];
                this.MediaSessionCompatQueueItem[i243 + 1] = 1;
                this.RatingCompat = i243 + 3;
                objArr79[i243 + 2] = null;
                return 0;
            case 199:
                int[] iArr124 = this.MediaSessionCompatQueueItem;
                int i244 = this.RatingCompat;
                iArr124[i244] = 5;
                this.RatingCompat = i244;
                iArr124[i244 - 1] = iArr124[i244 - 1] + iArr124[i244];
                return 0;
            case 200:
                Object[] objArr80 = this.ParcelableVolumeInfo;
                int i245 = this.RatingCompat;
                objArr80[i245] = objArr80[9];
                int[] iArr125 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i245 + 2;
                iArr125[i245 + 1] = 0;
                return 0;
            case 201:
                int[] iArr126 = this.MediaSessionCompatQueueItem;
                int i246 = this.RatingCompat;
                this.RatingCompat = i246 + 1;
                iArr126[i246] = 4;
                return 0;
            case 202:
                int[] iArr127 = this.MediaSessionCompatQueueItem;
                int i247 = this.RatingCompat;
                this.RatingCompat = i247 + 1;
                iArr127[i247] = 94;
                return 0;
            case 203:
                int i248 = this.RatingCompat - 1;
                this.RatingCompat = i248;
                Object[] objArr81 = this.ParcelableVolumeInfo;
                Object obj41 = objArr81[i248];
                objArr81[i248] = null;
                objArr81[12] = obj41;
                return 0;
            case Constant.ERROR_ACC_INVALID /* 204 */:
                int i249 = this.RatingCompat;
                int i250 = i249 - 1;
                Object[] objArr82 = this.ParcelableVolumeInfo;
                Object obj42 = objArr82[i250];
                objArr82[i250] = null;
                objArr82[13] = obj42;
                this.RatingCompat = i249;
                objArr82[i250] = objArr82[12];
                return 0;
            case Constant.ERROR_ACC_GRAVITY_INVALID /* 205 */:
                Object[] objArr83 = this.ParcelableVolumeInfo;
                int i251 = this.RatingCompat;
                this.RatingCompat = i251 + 1;
                objArr83[i251] = objArr83[12];
                return 0;
            case Constant.ERROR_ACC_JUMP /* 206 */:
                int i252 = this.RatingCompat;
                int i253 = i252 - 1;
                Object[] objArr84 = this.ParcelableVolumeInfo;
                Object obj43 = objArr84[i253];
                objArr84[i253] = null;
                objArr84[12] = obj43;
                this.RatingCompat = i252;
                objArr84[i253] = obj43;
                return 0;
            case 207:
                Object[] objArr85 = this.ParcelableVolumeInfo;
                int i254 = this.RatingCompat;
                objArr85[i254] = objArr85[10];
                this.RatingCompat = i254 + 2;
                objArr85[i254 + 1] = objArr85[11];
                return 0;
            case 208:
                int i255 = this.RatingCompat;
                int i256 = i255 - 1;
                Object[] objArr86 = this.ParcelableVolumeInfo;
                Object obj44 = objArr86[i256];
                objArr86[i256] = null;
                objArr86[10] = obj44;
                objArr86[i256] = objArr86[12];
                this.RatingCompat = i255 + 1;
                objArr86[i255] = objArr86[10];
                return 0;
            case 209:
                int[] iArr128 = this.MediaSessionCompatQueueItem;
                int i257 = this.RatingCompat;
                iArr128[i257] = 119;
                iArr128[i257 - 1] = iArr128[i257 - 1] + iArr128[i257];
                this.RatingCompat = i257 + 1;
                iArr128[i257] = iArr128[i257 - 1];
                return 0;
            case 210:
                int i258 = this.RatingCompat;
                int i259 = i258 - 1;
                Object[] objArr87 = this.ParcelableVolumeInfo;
                Object obj45 = objArr87[i259];
                objArr87[i259] = null;
                objArr87[10] = obj45;
                objArr87[i259] = objArr87[9];
                this.RatingCompat = i258 + 1;
                objArr87[i258] = null;
                return 0;
            case Constant.ERROR_GYRO_NO_DATA /* 211 */:
                Object[] objArr88 = this.ParcelableVolumeInfo;
                int i260 = this.RatingCompat;
                objArr88[i260] = null;
                objArr88[i260 + 1] = null;
                this.RatingCompat = i260 + 3;
                objArr88[i260 + 2] = objArr88[11];
                return 0;
            case Constant.ERROR_GYRO_LOW_FREQ /* 212 */:
                int[] iArr129 = this.MediaSessionCompatQueueItem;
                int i261 = this.RatingCompat;
                this.RatingCompat = i261 + 1;
                iArr129[i261] = 3;
                return 0;
            case Constant.ERROR_GYRO_TIME_DIFF_LARGE /* 213 */:
                int i262 = this.RatingCompat;
                int i263 = i262 - 1;
                Object[] objArr89 = this.ParcelableVolumeInfo;
                Object obj46 = objArr89[i263];
                objArr89[i263] = null;
                objArr89[10] = obj46;
                this.RatingCompat = i262;
                objArr89[i263] = objArr89[11];
                return 0;
            case Constant.ERROR_GYRO_INVALID /* 214 */:
                int i264 = this.RatingCompat;
                int i265 = i264 - 1;
                Object[] objArr90 = this.ParcelableVolumeInfo;
                Object obj47 = objArr90[i265];
                objArr90[i265] = null;
                objArr90[11] = obj47;
                this.RatingCompat = i264;
                objArr90[i265] = objArr90[10];
                return 0;
            case 215:
                int[] iArr130 = this.MediaSessionCompatQueueItem;
                int i266 = this.RatingCompat;
                iArr130[i266] = 9;
                this.RatingCompat = i266;
                iArr130[i266 - 1] = iArr130[i266 - 1] + iArr130[i266];
                return 0;
            case Constant.ERROR_GYRO_JUMP /* 216 */:
                int[] iArr131 = this.MediaSessionCompatQueueItem;
                int i267 = this.RatingCompat;
                this.RatingCompat = i267 + 1;
                iArr131[i267] = 119;
                return 0;
            case 217:
                int[] iArr132 = this.MediaSessionCompatQueueItem;
                int i268 = this.RatingCompat;
                this.RatingCompat = i268 + 1;
                iArr132[i268] = 25;
                return 0;
            case com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor.MODULE_VERSION /* 218 */:
                int[] iArr133 = this.MediaSessionCompatQueueItem;
                int i269 = this.RatingCompat;
                this.RatingCompat = i269 + 1;
                iArr133[i269] = 50;
                return 0;
            case 219:
                int i270 = this.RatingCompat;
                int i271 = i270 - 1;
                Object[] objArr91 = this.ParcelableVolumeInfo;
                objArr91[i271] = null;
                this.RatingCompat = i270;
                objArr91[i271] = objArr91[9];
                return 0;
            case 220:
                int[] iArr134 = this.MediaSessionCompatQueueItem;
                int i272 = this.RatingCompat;
                this.RatingCompat = i272 + 1;
                iArr134[i272] = 5;
                return 0;
            case Constant.ERROR_WSS_NO_DATA /* 221 */:
                int[] iArr135 = this.MediaSessionCompatQueueItem;
                int i273 = this.RatingCompat;
                iArr135[i273] = 16;
                iArr135[i273 + 1] = 0;
                int i274 = i273 + 1;
                this.RatingCompat = i274;
                iArr135[i273] = iArr135[i273] / iArr135[i274];
                return 0;
            case Constant.ERROR_WSS_LOW_FREQ /* 222 */:
                int[] iArr136 = this.MediaSessionCompatQueueItem;
                int i275 = this.RatingCompat;
                this.RatingCompat = i275 + 1;
                iArr136[i275] = 49;
                return 0;
            case Constant.ERROR_WSS_TIME_DIFF_LARGE /* 223 */:
                int[] iArr137 = this.MediaSessionCompatQueueItem;
                int i276 = this.RatingCompat;
                iArr137[i276] = 1;
                Object[] objArr92 = this.ParcelableVolumeInfo;
                this.RatingCompat = i276 + 2;
                objArr92[i276 + 1] = null;
                return 0;
            case Constant.ERROR_WSS_INVALID /* 224 */:
                int[] iArr138 = this.MediaSessionCompatQueueItem;
                int i277 = this.RatingCompat;
                this.RatingCompat = i277 + 1;
                iArr138[i277] = 7;
                return 0;
            case 225:
                Object[] objArr93 = this.ParcelableVolumeInfo;
                int i278 = this.RatingCompat;
                objArr93[i278] = objArr93[10];
                this.RatingCompat = i278 + 2;
                objArr93[i278 + 1] = objArr93[9];
                return 0;
            case Constant.ERROR_WSS_SPEED_JUMP /* 226 */:
                int[] iArr139 = this.MediaSessionCompatQueueItem;
                int i279 = this.RatingCompat;
                iArr139[i279] = 47;
                this.RatingCompat = i279;
                iArr139[i279 - 1] = iArr139[i279 - 1] + iArr139[i279];
                return 0;
            case 227:
                int[] iArr140 = this.MediaSessionCompatQueueItem;
                int i280 = this.RatingCompat;
                this.RatingCompat = i280 + 1;
                iArr140[i280] = 43;
                return 0;
            case 228:
                int i281 = this.RatingCompat;
                int i282 = i281 - 1;
                int[] iArr141 = this.MediaSessionCompatQueueItem;
                int i283 = iArr141[i282];
                iArr141[17] = i283;
                this.RatingCompat = i281;
                iArr141[i282] = i283;
                return 0;
            case 229:
                int i284 = this.RatingCompat - 1;
                this.RatingCompat = i284;
                int[] iArr142 = this.MediaSessionCompatQueueItem;
                iArr142[16] = iArr142[i284];
                return 0;
            case 230:
                int[] iArr143 = this.MediaSessionCompatQueueItem;
                int i285 = this.RatingCompat;
                this.RatingCompat = i285 + 1;
                iArr143[i285] = iArr143[16];
                return 0;
            case 231:
                int i286 = this.RatingCompat;
                int i287 = i286 - 1;
                this.RatingCompat = i287;
                int[] iArr144 = this.MediaSessionCompatQueueItem;
                iArr144[i286 - 2] = iArr144[i286 - 2] & iArr144[i287];
                return 0;
            case 232:
                Object[] objArr94 = this.ParcelableVolumeInfo;
                int i288 = this.RatingCompat;
                objArr94[i288] = objArr94[18];
                this.RatingCompat = i288;
                Object obj48 = objArr94[i288];
                objArr94[i288] = null;
                objArr94[15] = obj48;
                return 0;
            case 233:
                int i289 = this.RatingCompat - 1;
                this.RatingCompat = i289;
                Object[] objArr95 = this.ParcelableVolumeInfo;
                Object obj49 = objArr95[i289];
                objArr95[i289] = null;
                objArr95[15] = obj49;
                return 0;
            case Constant.ERROR_LOCATION_INVALID /* 234 */:
                int i290 = this.RatingCompat;
                int i291 = i290 - 1;
                int[] iArr145 = this.MediaSessionCompatQueueItem;
                int i292 = iArr145[i291];
                iArr145[16] = i292;
                this.RatingCompat = i290;
                iArr145[i291] = i292;
                return 0;
            case 235:
                int i293 = this.RatingCompat;
                int i294 = i293 - 2;
                this.RatingCompat = i294;
                int[] iArr146 = this.MediaSessionCompatQueueItem;
                this.read = iArr146[i294] != iArr146[i293 - 1] ? 0 : 1;
                return 0;
            case 236:
                int i295 = this.RatingCompat;
                int i296 = i295 - 1;
                Object[] objArr96 = this.ParcelableVolumeInfo;
                Object obj50 = objArr96[i296];
                objArr96[i296] = null;
                objArr96[20] = obj50;
                this.RatingCompat = i295;
                objArr96[i296] = objArr96[19];
                return 0;
            case 237:
                int i297 = this.RatingCompat;
                int i298 = i297 - 1;
                Object[] objArr97 = this.ParcelableVolumeInfo;
                Object obj51 = objArr97[i298];
                objArr97[i298] = null;
                objArr97[10] = obj51;
                this.RatingCompat = i297;
                objArr97[i298] = objArr97[14];
                return 0;
            case 238:
                Object[] objArr98 = this.ParcelableVolumeInfo;
                int i299 = this.RatingCompat;
                objArr98[i299] = objArr98[10];
                int[] iArr147 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i299 + 2;
                iArr147[i299 + 1] = iArr147[16];
                return 0;
            case 239:
                int i300 = this.RatingCompat;
                int i301 = i300 - 1;
                this.RatingCompat = i301;
                int[] iArr148 = this.MediaSessionCompatQueueItem;
                Object[] objArr99 = this.ParcelableVolumeInfo;
                Object obj52 = objArr99[i300 - 2];
                objArr99[i300 - 2] = null;
                iArr148[i300 - 2] = ((int[]) obj52)[iArr148[i301]];
                return 0;
            case 240:
                int i302 = this.RatingCompat;
                int i303 = i302 - 2;
                this.RatingCompat = i303;
                int[] iArr149 = this.MediaSessionCompatQueueItem;
                this.read = iArr149[i303] == iArr149[i302 - 1] ? 0 : 1;
                return 0;
            case 241:
                int[] iArr150 = this.MediaSessionCompatQueueItem;
                int i304 = this.RatingCompat;
                iArr150[i304] = iArr150[16];
                this.RatingCompat = i304 + 2;
                iArr150[i304 + 1] = 2;
                return 0;
            case 242:
                int i305 = this.RatingCompat;
                int i306 = i305 - 1;
                Object[] objArr100 = this.ParcelableVolumeInfo;
                Object obj53 = objArr100[i306];
                objArr100[i306] = null;
                objArr100[19] = obj53;
                objArr100[i306] = objArr100[10];
                this.RatingCompat = i305 + 1;
                objArr100[i305] = objArr100[19];
                return 0;
            case 243:
                int[] iArr151 = this.MediaSessionCompatQueueItem;
                int i307 = this.RatingCompat;
                iArr151[i307] = iArr151[12];
                this.RatingCompat = i307 + 2;
                iArr151[i307 + 1] = 1;
                return 0;
            case Constant.ERROR_GNSS_STATUS_INVALID /* 244 */:
                int[] iArr152 = this.MediaSessionCompatQueueItem;
                int i308 = this.RatingCompat;
                this.RatingCompat = i308 + 1;
                iArr152[i308] = iArr152[12];
                return 0;
            case 245:
                int i309 = this.RatingCompat;
                int i310 = i309 - 1;
                Object[] objArr101 = this.ParcelableVolumeInfo;
                Object obj54 = objArr101[i310];
                objArr101[i310] = null;
                objArr101[14] = obj54;
                this.RatingCompat = i309;
                objArr101[i310] = objArr101[13];
                return 0;
            case 246:
                int i311 = this.RatingCompat;
                int i312 = i311 - 1;
                Object[] objArr102 = this.ParcelableVolumeInfo;
                Object obj55 = objArr102[i312];
                objArr102[i312] = null;
                objArr102[19] = obj55;
                objArr102[i312] = objArr102[15];
                this.RatingCompat = i311 + 1;
                objArr102[i311] = objArr102[19];
                return 0;
            case 247:
                int i313 = this.RatingCompat;
                int i314 = i313 - 2;
                this.RatingCompat = i314;
                Object[] objArr103 = this.ParcelableVolumeInfo;
                Object obj56 = objArr103[i314];
                objArr103[i314] = null;
                Object obj57 = objArr103[i313 - 1];
                objArr103[i313 - 1] = null;
                this.read = obj56 != obj57 ? 0 : 1;
                return 0;
            case 248:
                int[] iArr153 = this.MediaSessionCompatQueueItem;
                int i315 = this.RatingCompat;
                iArr153[i315] = 125;
                this.RatingCompat = i315;
                iArr153[i315 - 1] = iArr153[i315 - 1] + iArr153[i315];
                return 0;
            case 249:
                int[] iArr154 = this.MediaSessionCompatQueueItem;
                int i316 = this.RatingCompat;
                iArr154[i316] = 79;
                this.RatingCompat = i316;
                iArr154[i316 - 1] = iArr154[i316 - 1] + iArr154[i316];
                return 0;
            case 250:
                int[] iArr155 = this.MediaSessionCompatQueueItem;
                int i317 = this.RatingCompat;
                iArr155[i317] = 82;
                this.RatingCompat = i317 + 2;
                iArr155[i317 + 1] = 0;
                return 0;
            case 251:
                int[] iArr156 = this.MediaSessionCompatQueueItem;
                int i318 = this.RatingCompat;
                iArr156[i318] = 113;
                this.RatingCompat = i318;
                iArr156[i318 - 1] = iArr156[i318 - 1] + iArr156[i318];
                return 0;
            case 252:
                int[] iArr157 = this.MediaSessionCompatQueueItem;
                int i319 = this.RatingCompat;
                this.RatingCompat = i319 + 1;
                iArr157[i319] = 96;
                return 0;
            case 253:
                int[] iArr158 = this.MediaSessionCompatQueueItem;
                int i320 = this.RatingCompat;
                this.RatingCompat = i320 + 1;
                iArr158[i320] = 2;
                return 0;
            case Constant.ERROR_ROAD_AREA_INVALID /* 254 */:
                int[] iArr159 = this.MediaSessionCompatQueueItem;
                int i321 = this.RatingCompat;
                iArr159[i321] = 62;
                iArr159[i321 + 1] = 0;
                int i322 = i321 + 1;
                this.RatingCompat = i322;
                iArr159[i321] = iArr159[i321] / iArr159[i322];
                return 0;
            case 255:
                int[] iArr160 = this.MediaSessionCompatQueueItem;
                int i323 = this.RatingCompat;
                this.RatingCompat = i323 + 1;
                iArr160[i323] = 66;
                return 0;
            case androidx.compose.ui.graphics.Fields.RotationX /* 256 */:
                int[] iArr161 = this.MediaSessionCompatQueueItem;
                int i324 = this.RatingCompat;
                this.RatingCompat = i324 + 1;
                iArr161[i324] = 72;
                return 0;
            case 257:
                int i325 = this.RatingCompat - 1;
                this.RatingCompat = i325;
                Object[] objArr104 = this.ParcelableVolumeInfo;
                Object obj58 = objArr104[i325];
                objArr104[i325] = null;
                objArr104[17] = obj58;
                return 0;
            case 258:
                Object[] objArr105 = this.ParcelableVolumeInfo;
                int i326 = this.RatingCompat;
                objArr105[i326] = objArr105[10];
                this.RatingCompat = i326 + 2;
                objArr105[i326 + 1] = objArr105[17];
                return 0;
            case 259:
                int i327 = this.RatingCompat;
                int i328 = i327 - 1;
                Object[] objArr106 = this.ParcelableVolumeInfo;
                Object obj59 = objArr106[i328];
                objArr106[i328] = null;
                objArr106[11] = obj59;
                objArr106[i328] = objArr106[13];
                this.RatingCompat = i327 + 1;
                objArr106[i327] = objArr106[11];
                return 0;
            case 260:
                int i329 = this.RatingCompat;
                int i330 = i329 - 1;
                Object[] objArr107 = this.ParcelableVolumeInfo;
                Object obj60 = objArr107[i330];
                objArr107[i330] = null;
                objArr107[13] = obj60;
                this.RatingCompat = i329;
                objArr107[i330] = objArr107[11];
                return 0;
            case 261:
                int i331 = this.RatingCompat;
                int i332 = i331 - 1;
                Object[] objArr108 = this.ParcelableVolumeInfo;
                Object obj61 = objArr108[i332];
                objArr108[i332] = null;
                objArr108[11] = obj61;
                this.RatingCompat = i331;
                objArr108[i332] = objArr108[13];
                return 0;
            case 262:
                int i333 = this.RatingCompat;
                int i334 = i333 - 2;
                this.RatingCompat = i334;
                Object[] objArr109 = this.ParcelableVolumeInfo;
                Object obj62 = objArr109[i334];
                objArr109[i334] = null;
                Object obj63 = objArr109[i333 - 1];
                objArr109[i333 - 1] = null;
                this.read = obj62 == obj63 ? 0 : 1;
                return 0;
            case 263:
                int i335 = this.RatingCompat;
                int i336 = i335 - 1;
                Object[] objArr110 = this.ParcelableVolumeInfo;
                Object obj64 = objArr110[i336];
                objArr110[i336] = null;
                objArr110[15] = obj64;
                this.RatingCompat = i335;
                objArr110[i336] = objArr110[13];
                return 0;
            case Constant.ERROR_ROTATION_ANGLE_INVALID /* 264 */:
                int i337 = this.RatingCompat;
                int i338 = i337 - 1;
                Object[] objArr111 = this.ParcelableVolumeInfo;
                Object obj65 = objArr111[i338];
                objArr111[i338] = null;
                objArr111[13] = obj65;
                this.RatingCompat = i337;
                objArr111[i338] = obj65;
                return 0;
            case 265:
                int i339 = this.RatingCompat;
                int i340 = i339 - 1;
                Object[] objArr112 = this.ParcelableVolumeInfo;
                Object obj66 = objArr112[i340];
                objArr112[i340] = null;
                objArr112[13] = obj66;
                this.RatingCompat = i339;
                objArr112[i340] = objArr112[9];
                return 0;
            case 266:
                int i341 = this.RatingCompat;
                int i342 = i341 - 1;
                Object[] objArr113 = this.ParcelableVolumeInfo;
                Object obj67 = objArr113[i342];
                objArr113[i342] = null;
                objArr113[18] = obj67;
                objArr113[i342] = objArr113[15];
                this.RatingCompat = i341 + 1;
                objArr113[i341] = objArr113[18];
                return 0;
            case 267:
                int i343 = this.RatingCompat;
                int i344 = i343 - 1;
                Object[] objArr114 = this.ParcelableVolumeInfo;
                Object obj68 = objArr114[i344];
                objArr114[i344] = null;
                objArr114[18] = obj68;
                this.RatingCompat = i343;
                objArr114[i344] = objArr114[11];
                return 0;
            case 268:
                int i345 = this.RatingCompat;
                int i346 = i345 - 3;
                this.RatingCompat = i346;
                Object[] objArr115 = this.ParcelableVolumeInfo;
                Object obj69 = objArr115[i346];
                objArr115[i346] = null;
                int i347 = this.MediaSessionCompatQueueItem[i345 - 2];
                Object obj70 = objArr115[i345 - 1];
                objArr115[i345 - 1] = null;
                ((Object[]) obj69)[i347] = obj70;
                return 0;
            case 269:
                Object[] objArr116 = this.ParcelableVolumeInfo;
                int i348 = this.RatingCompat;
                objArr116[i348] = objArr116[13];
                this.MediaSessionCompatQueueItem[i348 + 1] = 1;
                this.RatingCompat = i348 + 3;
                objArr116[i348 + 2] = objArr116[20];
                return 0;
            case 270:
                Object[] objArr117 = this.ParcelableVolumeInfo;
                int i349 = this.RatingCompat;
                objArr117[i349] = objArr117[13];
                this.MediaSessionCompatQueueItem[i349 + 1] = 2;
                this.RatingCompat = i349 + 3;
                objArr117[i349 + 2] = objArr117[21];
                return 0;
            case 271:
                Object[] objArr118 = this.ParcelableVolumeInfo;
                int i350 = this.RatingCompat;
                objArr118[i350] = objArr118[13];
                this.MediaSessionCompatQueueItem[i350 + 1] = 3;
                this.RatingCompat = i350 + 3;
                objArr118[i350 + 2] = objArr118[11];
                return 0;
            case 272:
                int i351 = this.RatingCompat;
                int i352 = i351 - 3;
                this.RatingCompat = i352;
                Object[] objArr119 = this.ParcelableVolumeInfo;
                Object obj71 = objArr119[i352];
                objArr119[i352] = null;
                int i353 = this.MediaSessionCompatQueueItem[i351 - 2];
                Object obj72 = objArr119[i351 - 1];
                objArr119[i351 - 1] = null;
                ((Object[]) obj71)[i353] = obj72;
                this.RatingCompat = i351 - 2;
                objArr119[i352] = objArr119[13];
                return 0;
            case 273:
                int i354 = this.RatingCompat;
                int i355 = i354 - 1;
                Object[] objArr120 = this.ParcelableVolumeInfo;
                Object obj73 = objArr120[i355];
                objArr120[i355] = null;
                objArr120[11] = obj73;
                objArr120[i355] = objArr120[18];
                this.RatingCompat = i354 + 1;
                objArr120[i354] = objArr120[11];
                return 0;
            case 274:
                int i356 = this.RatingCompat;
                int i357 = i356 - 1;
                Object[] objArr121 = this.ParcelableVolumeInfo;
                Object obj74 = objArr121[i357];
                objArr121[i357] = null;
                objArr121[10] = obj74;
                objArr121[i357] = objArr121[9];
                this.RatingCompat = i356 + 1;
                objArr121[i356] = objArr121[10];
                return 0;
            case 275:
                int i358 = this.RatingCompat;
                int i359 = i358 - 1;
                Object[] objArr122 = this.ParcelableVolumeInfo;
                Object obj75 = objArr122[i359];
                objArr122[i359] = null;
                objArr122[14] = obj75;
                this.RatingCompat = i358;
                objArr122[i359] = obj75;
                return 0;
            case 276:
                Object[] objArr123 = this.ParcelableVolumeInfo;
                int i360 = this.RatingCompat;
                objArr123[i360] = objArr123[9];
                this.RatingCompat = i360 + 2;
                objArr123[i360 + 1] = objArr123[11];
                return 0;
            case 277:
                int i361 = this.RatingCompat - 1;
                this.RatingCompat = i361;
                Object[] objArr124 = this.ParcelableVolumeInfo;
                Object obj76 = objArr124[i361];
                objArr124[i361] = null;
                objArr124[14] = obj76;
                return 0;
            case 278:
                Object[] objArr125 = this.ParcelableVolumeInfo;
                int i362 = this.RatingCompat;
                objArr125[i362] = objArr125[11];
                this.RatingCompat = i362 + 2;
                objArr125[i362 + 1] = objArr125[10];
                return 0;
            case 279:
                Object[] objArr126 = this.ParcelableVolumeInfo;
                int i363 = this.RatingCompat;
                objArr126[i363] = objArr126[14];
                objArr126[i363 + 1] = objArr126[13];
                this.RatingCompat = i363 + 3;
                objArr126[i363 + 2] = objArr126[15];
                return 0;
            case 280:
                int i364 = this.RatingCompat - 1;
                this.RatingCompat = i364;
                int[] iArr162 = this.MediaSessionCompatQueueItem;
                iArr162[12] = iArr162[i364];
                return 0;
            case 281:
                Object[] objArr127 = this.ParcelableVolumeInfo;
                int i365 = this.RatingCompat;
                objArr127[i365] = objArr127[10];
                this.RatingCompat = i365 + 2;
                objArr127[i365 + 1] = objArr127[14];
                return 0;
            case 282:
                int i366 = this.RatingCompat;
                int i367 = i366 - 1;
                this.RatingCompat = i367;
                int[] iArr163 = this.MediaSessionCompatQueueItem;
                iArr163[i366 - 2] = iArr163[i366 - 2] - iArr163[i367];
                return 0;
            case 283:
                int[] iArr164 = this.MediaSessionCompatQueueItem;
                int i368 = this.RatingCompat;
                iArr164[i368] = 73;
                this.RatingCompat = i368;
                iArr164[i368 - 1] = iArr164[i368 - 1] + iArr164[i368];
                return 0;
            case 284:
                int[] iArr165 = this.MediaSessionCompatQueueItem;
                int i369 = this.RatingCompat;
                this.RatingCompat = i369 + 1;
                iArr165[i369] = 83;
                return 0;
            case 285:
                int[] iArr166 = this.MediaSessionCompatQueueItem;
                int i370 = this.RatingCompat;
                this.RatingCompat = i370 + 1;
                iArr166[i370] = 68;
                return 0;
            case 286:
                int[] iArr167 = this.MediaSessionCompatQueueItem;
                int i371 = this.RatingCompat;
                this.RatingCompat = i371 + 1;
                iArr167[i371] = 90;
                return 0;
            case 287:
                int[] iArr168 = this.MediaSessionCompatQueueItem;
                int i372 = this.RatingCompat;
                iArr168[i372] = 8;
                this.RatingCompat = i372;
                iArr168[i372 - 1] = iArr168[i372] & iArr168[i372 - 1];
                return 0;
            case 288:
                Object[] objArr128 = this.ParcelableVolumeInfo;
                int i373 = this.RatingCompat;
                objArr128[i373] = null;
                this.RatingCompat = i373;
                Object obj77 = objArr128[i373];
                objArr128[i373] = null;
                objArr128[14] = obj77;
                return 0;
            case 289:
                int[] iArr169 = this.MediaSessionCompatQueueItem;
                int i374 = this.RatingCompat;
                iArr169[i374] = 63;
                iArr169[i374 - 1] = iArr169[i374 - 1] + iArr169[i374];
                this.RatingCompat = i374 + 1;
                iArr169[i374] = iArr169[i374 - 1];
                return 0;
            case 290:
                int[] iArr170 = this.MediaSessionCompatQueueItem;
                int i375 = this.RatingCompat;
                iArr170[i375] = 9;
                this.RatingCompat = i375;
                iArr170[i375 - 1] = iArr170[i375] & iArr170[i375 - 1];
                return 0;
            case 291:
                int[] iArr171 = this.MediaSessionCompatQueueItem;
                int i376 = this.RatingCompat;
                this.RatingCompat = i376 + 1;
                iArr171[i376] = 22;
                return 0;
            case 292:
                int i377 = this.RatingCompat;
                int i378 = i377 - 1;
                int[] iArr172 = this.MediaSessionCompatQueueItem;
                int i379 = iArr172[i378];
                iArr172[13] = i379;
                Object[] objArr129 = this.ParcelableVolumeInfo;
                objArr129[i378] = objArr129[9];
                this.RatingCompat = i377 + 1;
                iArr172[i377] = i379;
                return 0;
            case 293:
                int i380 = this.RatingCompat;
                int i381 = i380 - 1;
                int[] iArr173 = this.MediaSessionCompatQueueItem;
                int i382 = iArr173[i381];
                iArr173[13] = i382;
                iArr173[i381] = i382;
                this.RatingCompat = i380 + 1;
                iArr173[i380] = 1;
                return 0;
            case 294:
                int[] iArr174 = this.MediaSessionCompatQueueItem;
                int i383 = this.RatingCompat;
                iArr174[i383] = iArr174[13];
                this.RatingCompat = i383 + 2;
                iArr174[i383 + 1] = 2;
                return 0;
            case 295:
                int[] iArr175 = this.MediaSessionCompatQueueItem;
                int i384 = this.RatingCompat;
                iArr175[i384] = iArr175[13];
                this.RatingCompat = i384 + 2;
                iArr175[i384 + 1] = 3;
                return 0;
            case 296:
                int[] iArr176 = this.MediaSessionCompatQueueItem;
                int i385 = this.RatingCompat;
                iArr176[i385] = iArr176[13];
                this.RatingCompat = i385 + 2;
                iArr176[i385 + 1] = 4;
                return 0;
            case 297:
                int[] iArr177 = this.MediaSessionCompatQueueItem;
                int i386 = this.RatingCompat;
                iArr177[i386] = 23;
                iArr177[i386 - 1] = iArr177[i386 - 1] + iArr177[i386];
                this.RatingCompat = i386 + 1;
                iArr177[i386] = iArr177[i386 - 1];
                return 0;
            case 298:
                int[] iArr178 = this.MediaSessionCompatQueueItem;
                int i387 = this.RatingCompat;
                iArr178[i387] = 67;
                iArr178[i387 - 1] = iArr178[i387 - 1] + iArr178[i387];
                this.RatingCompat = i387 + 1;
                iArr178[i387] = iArr178[i387 - 1];
                return 0;
            case 299:
                int i388 = this.RatingCompat;
                int[] iArr179 = this.MediaSessionCompatQueueItem;
                iArr179[i388 - 2] = iArr179[i388 - 2] + iArr179[i388 - 1];
                int i389 = i388 - 2;
                this.RatingCompat = i389;
                this.ParcelableVolumeInfo[i389] = null;
                return 0;
            case LocationRequest.PRIORITY_INDOOR /* 300 */:
                int[] iArr180 = this.MediaSessionCompatQueueItem;
                int i390 = this.RatingCompat;
                this.RatingCompat = i390 + 1;
                iArr180[i390] = 80;
                return 0;
            case LocationRequest.PRIORITY_MAG_POSITION /* 301 */:
                int[] iArr181 = this.MediaSessionCompatQueueItem;
                int i391 = this.RatingCompat;
                this.RatingCompat = i391 + 1;
                iArr181[i391] = iArr181[10];
                return 0;
            case 302:
                int[] iArr182 = this.MediaSessionCompatQueueItem;
                int i392 = this.RatingCompat;
                this.RatingCompat = i392 + 1;
                iArr182[i392] = 19;
                return 0;
            case 303:
                int[] iArr183 = this.MediaSessionCompatQueueItem;
                int i393 = this.RatingCompat;
                iArr183[i393] = 15;
                this.RatingCompat = i393 + 2;
                iArr183[i393 + 1] = 0;
                return 0;
            case 304:
                int i394 = this.RatingCompat;
                int i395 = i394 - 1;
                Object[] objArr130 = this.ParcelableVolumeInfo;
                objArr130[i395] = null;
                this.RatingCompat = i394;
                objArr130[i395] = objArr130[12];
                return 0;
            case 305:
                int[] iArr184 = this.MediaSessionCompatQueueItem;
                int i396 = this.RatingCompat;
                iArr184[i396] = 57;
                iArr184[i396 + 1] = 0;
                int i397 = i396 + 1;
                this.RatingCompat = i397;
                iArr184[i396] = iArr184[i396] / iArr184[i397];
                return 0;
            case 306:
                int i398 = this.RatingCompat;
                int i399 = i398 - 1;
                Object[] objArr131 = this.ParcelableVolumeInfo;
                Object obj78 = objArr131[i399];
                objArr131[i399] = null;
                objArr131[9] = obj78;
                objArr131[i399] = objArr131[10];
                int[] iArr185 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i398 + 1;
                iArr185[i398] = 0;
                return 0;
            case 307:
                Object[] objArr132 = this.ParcelableVolumeInfo;
                int i400 = this.RatingCompat;
                objArr132[i400] = objArr132[9];
                int[] iArr186 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i400 + 2;
                iArr186[i400 + 1] = 1;
                return 0;
            case 308:
                int[] iArr187 = this.MediaSessionCompatQueueItem;
                int i401 = this.RatingCompat;
                iArr187[i401] = 101;
                iArr187[i401 - 1] = iArr187[i401 - 1] + iArr187[i401];
                this.RatingCompat = i401 + 1;
                iArr187[i401] = iArr187[i401 - 1];
                return 0;
            case 309:
                int[] iArr188 = this.MediaSessionCompatQueueItem;
                int i402 = this.RatingCompat;
                iArr188[i402] = 1;
                this.RatingCompat = i402 + 2;
                iArr188[i402 + 1] = 0;
                return 0;
            case 310:
                int[] iArr189 = this.MediaSessionCompatQueueItem;
                int i403 = this.RatingCompat;
                iArr189[i403] = 13;
                this.RatingCompat = i403;
                iArr189[i403 - 1] = iArr189[i403 - 1] + iArr189[i403];
                return 0;
            case 311:
                int[] iArr190 = this.MediaSessionCompatQueueItem;
                int i404 = this.RatingCompat;
                iArr190[i404] = 77;
                this.RatingCompat = i404;
                iArr190[i404 - 1] = iArr190[i404 - 1] + iArr190[i404];
                return 0;
            case 312:
                Object[] objArr133 = this.ParcelableVolumeInfo;
                int i405 = this.RatingCompat;
                objArr133[i405] = objArr133[10];
                int[] iArr191 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i405 + 2;
                iArr191[i405 + 1] = iArr191[9];
                return 0;
            case 313:
                int[] iArr192 = this.MediaSessionCompatQueueItem;
                int i406 = this.RatingCompat;
                iArr192[i406] = 107;
                iArr192[i406 - 1] = iArr192[i406 - 1] + iArr192[i406];
                this.RatingCompat = i406 + 1;
                iArr192[i406] = iArr192[i406 - 1];
                return 0;
            case 314:
                int[] iArr193 = this.MediaSessionCompatQueueItem;
                int i407 = this.RatingCompat;
                this.RatingCompat = i407 + 1;
                iArr193[i407] = 3;
                return 0;
            case 315:
                int[] iArr194 = this.MediaSessionCompatQueueItem;
                int i408 = this.RatingCompat;
                iArr194[i408] = iArr194[9];
                Object[] objArr134 = this.ParcelableVolumeInfo;
                this.RatingCompat = i408 + 2;
                objArr134[i408 + 1] = null;
                return 0;
            case 316:
                int[] iArr195 = this.MediaSessionCompatQueueItem;
                int i409 = this.RatingCompat;
                this.RatingCompat = i409 + 1;
                iArr195[i409] = 61;
                return 0;
            case 317:
                int i410 = this.RatingCompat;
                int i411 = i410 - 1;
                Object[] objArr135 = this.ParcelableVolumeInfo;
                Object obj79 = objArr135[i411];
                objArr135[i411] = null;
                objArr135[12] = obj79;
                objArr135[i411] = objArr135[9];
                this.RatingCompat = i410 + 1;
                objArr135[i410] = objArr135[11];
                return 0;
            case 318:
                Object[] objArr136 = this.ParcelableVolumeInfo;
                int i412 = this.RatingCompat;
                objArr136[i412] = null;
                int[] iArr196 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i412 + 2;
                iArr196[i412 + 1] = 14;
                return 0;
            case 319:
                int i413 = this.RatingCompat;
                int i414 = i413 - 1;
                Object[] objArr137 = this.ParcelableVolumeInfo;
                Object obj80 = objArr137[i414];
                objArr137[i414] = null;
                objArr137[10] = obj80;
                this.RatingCompat = i413;
                objArr137[i414] = objArr137[12];
                return 0;
            case 320:
                Object[] objArr138 = this.ParcelableVolumeInfo;
                int i415 = this.RatingCompat;
                objArr138[i415] = null;
                int[] iArr197 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i415 + 2;
                iArr197[i415 + 1] = 12;
                return 0;
            case 321:
                Object[] objArr139 = this.ParcelableVolumeInfo;
                int i416 = this.RatingCompat;
                objArr139[i416] = objArr139[10];
                this.RatingCompat = i416 + 2;
                objArr139[i416 + 1] = null;
                return 0;
            case 322:
                Object[] objArr140 = this.ParcelableVolumeInfo;
                int i417 = this.RatingCompat;
                objArr140[i417] = null;
                this.RatingCompat = i417 + 2;
                objArr140[i417 + 1] = objArr140[11];
                return 0;
            case 323:
                int[] iArr198 = this.MediaSessionCompatQueueItem;
                int i418 = this.RatingCompat;
                this.RatingCompat = i418 + 1;
                iArr198[i418] = 12;
                return 0;
            case 324:
                int[] iArr199 = this.MediaSessionCompatQueueItem;
                int i419 = this.RatingCompat;
                this.RatingCompat = i419 + 1;
                iArr199[i419] = 87;
                return 0;
            case 325:
                int[] iArr200 = this.MediaSessionCompatQueueItem;
                int i420 = this.RatingCompat;
                iArr200[i420] = 3;
                iArr200[i420 - 1] = iArr200[i420 - 1] + iArr200[i420];
                this.RatingCompat = i420 + 1;
                iArr200[i420] = iArr200[i420 - 1];
                return 0;
            case 326:
                int i421 = this.RatingCompat - 1;
                this.RatingCompat = i421;
                int[] iArr201 = this.MediaSessionCompatQueueItem;
                iArr201[10] = iArr201[i421];
                return 0;
            case 327:
                this.read = this.MediaSessionCompatQueueItem[this.RatingCompat - 1];
                return 0;
            case 328:
                int[] iArr202 = this.MediaSessionCompatQueueItem;
                int i422 = this.RatingCompat;
                iArr202[i422] = 55;
                this.RatingCompat = i422;
                iArr202[i422 - 1] = iArr202[i422 - 1] + iArr202[i422];
                return 0;
            case 329:
                int[] iArr203 = this.MediaSessionCompatQueueItem;
                int i423 = this.RatingCompat;
                this.RatingCompat = i423 + 1;
                iArr203[i423] = 48;
                return 0;
            case 330:
                int[] iArr204 = this.MediaSessionCompatQueueItem;
                int i424 = this.RatingCompat;
                iArr204[i424] = 121;
                iArr204[i424 - 1] = iArr204[i424 - 1] + iArr204[i424];
                this.RatingCompat = i424 + 1;
                iArr204[i424] = iArr204[i424 - 1];
                return 0;
            case 331:
                int[] iArr205 = this.MediaSessionCompatQueueItem;
                int i425 = this.RatingCompat;
                iArr205[i425] = 89;
                this.RatingCompat = i425;
                iArr205[i425 - 1] = iArr205[i425 - 1] + iArr205[i425];
                return 0;
            case 332:
                int i426 = this.RatingCompat;
                int i427 = i426 - 1;
                Object[] objArr141 = this.ParcelableVolumeInfo;
                Object obj81 = objArr141[i427];
                objArr141[i427] = null;
                objArr141[11] = obj81;
                this.RatingCompat = i426;
                objArr141[i427] = objArr141[9];
                return 0;
            case 333:
                int i428 = this.RatingCompat;
                int i429 = i428 - 1;
                Object[] objArr142 = this.ParcelableVolumeInfo;
                objArr142[i429] = null;
                this.RatingCompat = i428;
                objArr142[i429] = objArr142[10];
                return 0;
            case 334:
                Object[] objArr143 = this.ParcelableVolumeInfo;
                int i430 = this.RatingCompat;
                objArr143[i430] = objArr143[9];
                objArr143[i430 + 1] = objArr143[10];
                this.RatingCompat = i430 + 3;
                objArr143[i430 + 2] = null;
                return 0;
            case 335:
                Object[] objArr144 = this.ParcelableVolumeInfo;
                int i431 = this.RatingCompat;
                objArr144[i431] = objArr144[10];
                int[] iArr206 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i431 + 2;
                iArr206[i431 + 1] = 3;
                return 0;
            case 336:
                int[] iArr207 = this.MediaSessionCompatQueueItem;
                int i432 = this.RatingCompat;
                this.RatingCompat = i432 + 1;
                iArr207[i432] = 15;
                return 0;
            case 337:
                int[] iArr208 = this.MediaSessionCompatQueueItem;
                int i433 = this.RatingCompat;
                this.RatingCompat = i433 + 1;
                iArr208[i433] = 107;
                return 0;
            case 338:
                int i434 = this.RatingCompat;
                int i435 = i434 - 1;
                Object[] objArr145 = this.ParcelableVolumeInfo;
                Object obj82 = objArr145[i435];
                objArr145[i435] = null;
                objArr145[12] = obj82;
                int[] iArr209 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i434;
                iArr209[i435] = 0;
                return 0;
            case 339:
                int i436 = this.RatingCompat;
                int i437 = i436 - 1;
                int[] iArr210 = this.MediaSessionCompatQueueItem;
                int i438 = iArr210[i437];
                iArr210[11] = i438;
                this.RatingCompat = i436;
                iArr210[i437] = i438;
                return 0;
            case 340:
                int i439 = this.RatingCompat;
                int i440 = i439 - 1;
                Object[] objArr146 = this.ParcelableVolumeInfo;
                Object obj83 = objArr146[i440];
                objArr146[i440] = null;
                objArr146[12] = obj83;
                objArr146[i440] = objArr146[10];
                this.RatingCompat = i439 + 1;
                objArr146[i439] = objArr146[12];
                return 0;
            case 341:
                int[] iArr211 = this.MediaSessionCompatQueueItem;
                int i441 = this.RatingCompat;
                iArr211[i441] = 45;
                this.RatingCompat = i441;
                iArr211[i441 - 1] = iArr211[i441 - 1] + iArr211[i441];
                return 0;
            case 342:
                int[] iArr212 = this.MediaSessionCompatQueueItem;
                int i442 = this.RatingCompat;
                this.RatingCompat = i442 + 1;
                iArr212[i442] = 76;
                return 0;
            case 343:
                int[] iArr213 = this.MediaSessionCompatQueueItem;
                int i443 = this.RatingCompat;
                this.RatingCompat = i443 + 1;
                iArr213[i443] = 46;
                return 0;
            case 344:
                int[] iArr214 = this.MediaSessionCompatQueueItem;
                int i444 = this.RatingCompat;
                iArr214[i444] = 83;
                this.RatingCompat = i444;
                iArr214[i444 - 1] = iArr214[i444 - 1] + iArr214[i444];
                return 0;
            case 345:
                int[] iArr215 = this.MediaSessionCompatQueueItem;
                int i445 = this.RatingCompat;
                iArr215[i445] = 13;
                iArr215[i445 - 1] = iArr215[i445 - 1] + iArr215[i445];
                this.RatingCompat = i445 + 1;
                iArr215[i445] = iArr215[i445 - 1];
                return 0;
            case 346:
                Object[] objArr147 = this.ParcelableVolumeInfo;
                int i446 = this.RatingCompat;
                objArr147[i446] = objArr147[11];
                objArr147[i446 + 1] = null;
                this.RatingCompat = i446 + 3;
                objArr147[i446 + 2] = null;
                return 0;
            case 347:
                int[] iArr216 = this.MediaSessionCompatQueueItem;
                int i447 = this.RatingCompat;
                iArr216[i447] = 41;
                iArr216[i447 + 1] = 0;
                int i448 = i447 + 1;
                this.RatingCompat = i448;
                iArr216[i447] = iArr216[i447] / iArr216[i448];
                return 0;
            case 348:
                int[] iArr217 = this.MediaSessionCompatQueueItem;
                int i449 = this.RatingCompat;
                this.RatingCompat = i449 + 1;
                iArr217[i449] = 71;
                return 0;
            case 349:
                int[] iArr218 = this.MediaSessionCompatQueueItem;
                int i450 = this.RatingCompat;
                iArr218[i450] = iArr218[11];
                this.RatingCompat = i450 + 2;
                iArr218[i450 + 1] = 1;
                return 0;
            case 350:
                Object[] objArr148 = this.ParcelableVolumeInfo;
                int i451 = this.RatingCompat;
                objArr148[i451] = objArr148[13];
                this.RatingCompat = i451 + 2;
                objArr148[i451 + 1] = objArr148[10];
                return 0;
            case 351:
                int[] iArr219 = this.MediaSessionCompatQueueItem;
                int i452 = this.RatingCompat;
                this.RatingCompat = i452 + 1;
                iArr219[i452] = 60;
                return 0;
            case 352:
                int[] iArr220 = this.MediaSessionCompatQueueItem;
                int i453 = this.RatingCompat;
                this.RatingCompat = i453 + 1;
                iArr220[i453] = 14;
                return 0;
            case 353:
                Object[] objArr149 = this.ParcelableVolumeInfo;
                int i454 = this.RatingCompat;
                objArr149[i454] = null;
                int[] iArr221 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i454 + 2;
                iArr221[i454 + 1] = 25;
                return 0;
            case 354:
                int i455 = this.RatingCompat;
                int i456 = i455 - 1;
                Object[] objArr150 = this.ParcelableVolumeInfo;
                Object obj84 = objArr150[i456];
                objArr150[i456] = null;
                objArr150[10] = obj84;
                objArr150[i456] = objArr150[11];
                this.RatingCompat = i455 + 1;
                objArr150[i455] = null;
                return 0;
            case 355:
                Object[] objArr151 = this.ParcelableVolumeInfo;
                int i457 = this.RatingCompat;
                objArr151[i457] = null;
                this.RatingCompat = i457 + 2;
                objArr151[i457 + 1] = objArr151[10];
                return 0;
            case 356:
                int[] iArr222 = this.MediaSessionCompatQueueItem;
                int i458 = this.RatingCompat;
                iArr222[i458] = 59;
                iArr222[i458 - 1] = iArr222[i458 - 1] + iArr222[i458];
                this.RatingCompat = i458 + 1;
                iArr222[i458] = iArr222[i458 - 1];
                return 0;
            case 357:
                int i459 = this.RatingCompat;
                int i460 = i459 - 1;
                Object[] objArr152 = this.ParcelableVolumeInfo;
                Object obj85 = objArr152[i460];
                objArr152[i460] = null;
                objArr152[15] = obj85;
                this.RatingCompat = i459;
                objArr152[i460] = objArr152[9];
                return 0;
            case 358:
                int i461 = this.RatingCompat;
                int i462 = i461 - 1;
                Object[] objArr153 = this.ParcelableVolumeInfo;
                Object obj86 = objArr153[i462];
                objArr153[i462] = null;
                objArr153[13] = obj86;
                int[] iArr223 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i461;
                iArr223[i462] = 0;
                return 0;
            case 359:
                int[] iArr224 = this.MediaSessionCompatQueueItem;
                int i463 = this.RatingCompat;
                iArr224[i463] = 0;
                this.RatingCompat = i463 + 2;
                iArr224[i463 + 1] = 24;
                return 0;
            case 360:
                int i464 = this.RatingCompat;
                int i465 = i464 - 1;
                Object[] objArr154 = this.ParcelableVolumeInfo;
                Object obj87 = objArr154[i465];
                objArr154[i465] = null;
                objArr154[14] = obj87;
                this.RatingCompat = i464;
                objArr154[i465] = objArr154[15];
                return 0;
            case 361:
                int i466 = this.RatingCompat;
                int i467 = i466 - 1;
                Object[] objArr155 = this.ParcelableVolumeInfo;
                Object obj88 = objArr155[i467];
                objArr155[i467] = null;
                objArr155[15] = obj88;
                this.RatingCompat = i466;
                objArr155[i467] = objArr155[10];
                return 0;
            case 362:
                int i468 = this.RatingCompat;
                int i469 = i468 - 1;
                Object[] objArr156 = this.ParcelableVolumeInfo;
                Object obj89 = objArr156[i469];
                objArr156[i469] = null;
                objArr156[10] = obj89;
                this.RatingCompat = i468;
                objArr156[i469] = objArr156[15];
                return 0;
            case 363:
                int i470 = this.RatingCompat;
                int i471 = i470 - 1;
                Object[] objArr157 = this.ParcelableVolumeInfo;
                Object obj90 = objArr157[i471];
                objArr157[i471] = null;
                objArr157[15] = obj90;
                this.RatingCompat = i470;
                objArr157[i471] = objArr157[14];
                return 0;
            case 364:
                int[] iArr225 = this.MediaSessionCompatQueueItem;
                int i472 = this.RatingCompat;
                iArr225[i472] = 3;
                Object[] objArr158 = this.ParcelableVolumeInfo;
                this.RatingCompat = i472 + 2;
                objArr158[i472 + 1] = objArr158[13];
                return 0;
            case 365:
                Object[] objArr159 = this.ParcelableVolumeInfo;
                int i473 = this.RatingCompat;
                objArr159[i473] = objArr159[15];
                this.RatingCompat = i473 + 2;
                objArr159[i473 + 1] = objArr159[13];
                return 0;
            case 366:
                Object[] objArr160 = this.ParcelableVolumeInfo;
                int i474 = this.RatingCompat;
                objArr160[i474] = objArr160[13];
                objArr160[i474 + 1] = objArr160[12];
                int[] iArr226 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i474 + 3;
                iArr226[i474 + 2] = 41;
                return 0;
            case 367:
                int[] iArr227 = this.MediaSessionCompatQueueItem;
                int i475 = this.RatingCompat;
                iArr227[i475] = 55;
                iArr227[i475 - 1] = iArr227[i475 - 1] + iArr227[i475];
                this.RatingCompat = i475 + 1;
                iArr227[i475] = iArr227[i475 - 1];
                return 0;
            case 368:
                int i476 = this.RatingCompat;
                int i477 = i476 - 1;
                Object[] objArr161 = this.ParcelableVolumeInfo;
                Object obj91 = objArr161[i477];
                objArr161[i477] = null;
                objArr161[12] = obj91;
                int[] iArr228 = this.MediaSessionCompatQueueItem;
                this.RatingCompat = i476;
                iArr228[i477] = iArr228[10];
                return 0;
            case 369:
                int[] iArr229 = this.MediaSessionCompatQueueItem;
                int i478 = this.RatingCompat;
                this.RatingCompat = i478 + 1;
                iArr229[i478] = 63;
                return 0;
            case 370:
                int i479 = this.RatingCompat;
                int i480 = i479 - 1;
                Object[] objArr162 = this.ParcelableVolumeInfo;
                Object obj92 = objArr162[i480];
                objArr162[i480] = null;
                objArr162[11] = obj92;
                this.RatingCompat = i479;
                objArr162[i480] = objArr162[12];
                return 0;
            case 371:
                int i481 = this.RatingCompat;
                int i482 = i481 - 1;
                Object[] objArr163 = this.ParcelableVolumeInfo;
                Object obj93 = objArr163[i482];
                objArr163[i482] = null;
                objArr163[12] = obj93;
                objArr163[i482] = objArr163[9];
                this.RatingCompat = i481 + 1;
                objArr163[i481] = objArr163[10];
                return 0;
            case 372:
                Object[] objArr164 = this.ParcelableVolumeInfo;
                int i483 = this.RatingCompat;
                objArr164[i483] = objArr164[12];
                objArr164[i483 + 1] = null;
                this.RatingCompat = i483 + 3;
                objArr164[i483 + 2] = null;
                return 0;
            case 373:
                int[] iArr230 = this.MediaSessionCompatQueueItem;
                int i484 = this.RatingCompat;
                iArr230[i484] = 41;
                iArr230[i484 - 1] = iArr230[i484 - 1] + iArr230[i484];
                this.RatingCompat = i484 + 1;
                iArr230[i484] = iArr230[i484 - 1];
                return 0;
            case 374:
                int[] iArr231 = this.MediaSessionCompatQueueItem;
                int i485 = this.RatingCompat;
                iArr231[i485] = 47;
                iArr231[i485 + 1] = 0;
                int i486 = i485 + 1;
                this.RatingCompat = i486;
                iArr231[i485] = iArr231[i485] / iArr231[i486];
                return 0;
            default:
                return i;
        }
    }

    public currentThreadId(int i, Object obj) {
        int[] iArr = new int[27];
        this.MediaSessionCompatQueueItem = iArr;
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        iArr[9] = i;
        objArr[10] = obj;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj, int i) {
        int[] iArr = new int[27];
        this.MediaSessionCompatQueueItem = iArr;
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        iArr[10] = i;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, Object obj6, int i2, Object obj7) {
        int[] iArr = new int[27];
        this.MediaSessionCompatQueueItem = iArr;
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        iArr[12] = i;
        objArr[13] = obj4;
        objArr[14] = obj5;
        objArr[15] = obj6;
        iArr[16] = i2;
        objArr[17] = obj7;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj, Object obj2, Object obj3, int i, Object obj4, Object obj5, Object obj6) {
        int[] iArr = new int[27];
        this.MediaSessionCompatQueueItem = iArr;
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        iArr[12] = i;
        objArr[13] = obj4;
        objArr[14] = obj5;
        objArr[15] = obj6;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj, Object obj2, Object obj3) {
        this.MediaSessionCompatQueueItem = new int[27];
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = new int[27];
        this.MediaSessionCompatQueueItem = iArr;
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        iArr[12] = i;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj) {
        this.MediaSessionCompatQueueItem = new int[27];
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj, Object obj2, Object obj3, Object obj4) {
        this.MediaSessionCompatQueueItem = new int[27];
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        objArr[11] = obj3;
        objArr[12] = obj4;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public currentThreadId(Object obj, Object obj2) {
        this.MediaSessionCompatQueueItem = new int[27];
        this.MediaDescriptionCompat = new long[27];
        this.MediaMetadataCompat = new float[27];
        this.MediaSessionCompatResultReceiverWrapper = new double[27];
        Object[] objArr = new Object[27];
        this.ParcelableVolumeInfo = objArr;
        objArr[9] = obj;
        objArr[10] = obj2;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }
}
