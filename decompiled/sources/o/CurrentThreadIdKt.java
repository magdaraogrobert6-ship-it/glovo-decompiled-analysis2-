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
public class CurrentThreadIdKt {
    public Object IconCompatParcelizer;
    private int MediaBrowserCompatMediaItem;
    private final float[] MediaDescriptionCompat;
    private final int[] MediaMetadataCompat;
    private final double[] MediaSessionCompatQueueItem;
    private final Object[] MediaSessionCompatToken;
    private final long[] RatingCompat;
    public Object RemoteActionCompatParcelizer;
    public int read;
    private int serializer;
    public int write;

    public int write(int i) {
        switch (i) {
            case 1:
                int i2 = this.serializer - this.write;
                this.serializer = i2;
                this.MediaBrowserCompatMediaItem = i2;
                return 0;
            case 2:
                Object[] objArr = this.MediaSessionCompatToken;
                int i3 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i3 + 1;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.RemoteActionCompatParcelizer = obj;
                return 0;
            case 3:
                Object[] objArr2 = this.MediaSessionCompatToken;
                int i4 = this.serializer;
                this.serializer = i4 + 1;
                objArr2[i4] = this.IconCompatParcelizer;
                return 0;
            case 4:
                Object[] objArr3 = this.MediaSessionCompatToken;
                int i5 = this.serializer;
                this.serializer = i5 + 1;
                objArr3[i5] = objArr3[34];
                return 0;
            case 5:
                int i6 = this.serializer - 1;
                this.serializer = i6;
                Object[] objArr4 = this.MediaSessionCompatToken;
                Object obj2 = objArr4[i6];
                objArr4[i6] = null;
                objArr4[34] = obj2;
                return 0;
            case 6:
                int[] iArr = this.MediaMetadataCompat;
                int i7 = this.serializer;
                iArr[i7] = 2;
                this.serializer = i7 + 2;
                iArr[i7 + 1] = 2;
                return 0;
            case 7:
                int i8 = this.serializer;
                int i9 = i8 - 1;
                this.serializer = i9;
                int[] iArr2 = this.MediaMetadataCompat;
                iArr2[i8 - 2] = iArr2[i8 - 2] % iArr2[i9];
                int i10 = i8 - 2;
                this.serializer = i10;
                this.MediaSessionCompatToken[i10] = null;
                return 0;
            case 8:
                Object[] objArr5 = this.MediaSessionCompatToken;
                int i11 = this.serializer;
                Object obj3 = objArr5[i11 - 1];
                objArr5[i11 - 1] = null;
                this.RemoteActionCompatParcelizer = obj3;
                return 0;
            case 10:
                int[] iArr3 = this.MediaMetadataCompat;
                int i12 = this.serializer;
                this.serializer = i12 + 1;
                iArr3[i12] = this.write;
            case 9:
                return 0;
            case 11:
                int[] iArr4 = this.MediaMetadataCompat;
                int i13 = this.serializer;
                iArr4[i13] = 89;
                this.serializer = i13;
                iArr4[i13 - 1] = iArr4[i13 - 1] + iArr4[i13];
                return 0;
            case 12:
                int[] iArr5 = this.MediaMetadataCompat;
                int i14 = this.serializer;
                iArr5[i14] = iArr5[i14 - 1];
                iArr5[i14 + 1] = 128;
                int i15 = i14 + 1;
                this.serializer = i15;
                iArr5[i14] = iArr5[i14] % iArr5[i15];
                return 0;
            case 13:
                int[] iArr6 = this.MediaMetadataCompat;
                int i16 = this.MediaBrowserCompatMediaItem;
                this.MediaBrowserCompatMediaItem = i16 + 1;
                this.read = iArr6[i16];
                return 0;
            case 14:
                int[] iArr7 = this.MediaMetadataCompat;
                int i17 = this.serializer;
                this.serializer = i17 + 1;
                iArr7[i17] = 2;
                return 0;
            case 15:
                int i18 = this.serializer;
                int i19 = i18 - 1;
                this.serializer = i19;
                int[] iArr8 = this.MediaMetadataCompat;
                iArr8[i18 - 2] = iArr8[i18 - 2] % iArr8[i19];
                return 0;
            case 16:
                int i20 = this.serializer - 1;
                this.serializer = i20;
                this.read = this.MediaMetadataCompat[i20] != 0 ? 0 : 1;
                return 0;
            case 17:
                int[] iArr9 = this.MediaMetadataCompat;
                int i21 = this.serializer;
                this.serializer = i21 + 1;
                iArr9[i21] = 87;
                return 0;
            case 18:
                int i22 = this.serializer;
                int i23 = i22 - 1;
                int[] iArr10 = this.MediaMetadataCompat;
                iArr10[i22 - 2] = iArr10[i22 - 2] + iArr10[i23];
                iArr10[i23] = iArr10[i22 - 2];
                this.serializer = i22 + 1;
                iArr10[i22] = 128;
                return 0;
            case 19:
                int i24 = this.serializer - 1;
                this.serializer = i24;
                this.read = this.MediaMetadataCompat[i24] == 0 ? 0 : 1;
                return 0;
            case 20:
                for (int i25 = this.serializer - 1; i25 >= 0; i25--) {
                    this.MediaSessionCompatToken[i25] = null;
                }
                Object[] objArr6 = this.MediaSessionCompatToken;
                this.serializer = 1;
                objArr6[0] = this.IconCompatParcelizer;
                return 0;
            case 21:
                Object[] objArr7 = this.MediaSessionCompatToken;
                int i26 = this.serializer;
                this.serializer = i26 + 1;
                objArr7[i26] = objArr7[35];
                return 0;
            case 22:
                int[] iArr11 = this.MediaMetadataCompat;
                int i27 = this.serializer;
                iArr11[i27] = 55;
                this.serializer = i27;
                iArr11[i27 - 1] = iArr11[i27 - 1] + iArr11[i27];
                return 0;
            case 23:
                int[] iArr12 = this.MediaMetadataCompat;
                int i28 = this.serializer;
                iArr12[i28] = iArr12[i28 - 1];
                this.serializer = i28 + 2;
                iArr12[i28 + 1] = 128;
                return 0;
            case 24:
                int[] iArr13 = this.MediaMetadataCompat;
                int i29 = this.serializer;
                iArr13[i29] = 2;
                this.serializer = i29;
                iArr13[i29 - 1] = iArr13[i29 - 1] % iArr13[i29];
                return 0;
            case 25:
                int i30 = this.serializer;
                int i31 = i30 - 1;
                Object[] objArr8 = this.MediaSessionCompatToken;
                Object obj4 = objArr8[i31];
                objArr8[i31] = null;
                objArr8[34] = obj4;
                this.serializer = i30;
                objArr8[i31] = obj4;
                return 0;
            case 26:
                int[] iArr14 = this.MediaMetadataCompat;
                int i32 = this.serializer;
                iArr14[i32] = 43;
                this.serializer = i32 + 2;
                iArr14[i32 + 1] = 0;
                return 0;
            case 27:
                int i33 = this.serializer;
                int i34 = i33 - 1;
                this.serializer = i34;
                int[] iArr15 = this.MediaMetadataCompat;
                iArr15[i33 - 2] = iArr15[i33 - 2] / iArr15[i34];
                return 0;
            case 28:
                int i35 = this.serializer - 1;
                this.serializer = i35;
                this.MediaSessionCompatToken[i35] = null;
                return 0;
            case 29:
                int[] iArr16 = this.MediaMetadataCompat;
                int i36 = this.serializer - 1;
                this.serializer = i36;
                this.read = iArr16[i36];
                return 0;
            case 30:
                int[] iArr17 = this.MediaMetadataCompat;
                int i37 = this.serializer;
                this.serializer = i37 + 1;
                iArr17[i37] = 36;
                return 0;
            case 31:
                int[] iArr18 = this.MediaMetadataCompat;
                int i38 = this.serializer;
                this.serializer = i38 + 1;
                iArr18[i38] = 56;
                return 0;
            case 32:
                Object[] objArr9 = this.MediaSessionCompatToken;
                int i39 = this.serializer;
                objArr9[i39] = objArr9[34];
                this.serializer = i39 + 2;
                objArr9[i39 + 1] = objArr9[35];
                return 0;
            case 33:
                Object[] objArr10 = this.MediaSessionCompatToken;
                int i40 = this.serializer;
                objArr10[i40] = objArr10[36];
                int[] iArr19 = this.MediaMetadataCompat;
                this.serializer = i40 + 2;
                iArr19[i40 + 1] = iArr19[37];
                return 0;
            case DescriptorProtos$MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                int[] iArr20 = this.MediaMetadataCompat;
                int i41 = this.serializer;
                iArr20[i41] = 33;
                iArr20[i41 - 1] = iArr20[i41 - 1] + iArr20[i41];
                this.serializer = i41 + 1;
                iArr20[i41] = iArr20[i41 - 1];
                return 0;
            case 35:
                int[] iArr21 = this.MediaMetadataCompat;
                int i42 = this.serializer;
                iArr21[i42] = 128;
                this.serializer = i42;
                iArr21[i42 - 1] = iArr21[i42 - 1] % iArr21[i42];
                return 0;
            case DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                int[] iArr22 = this.MediaMetadataCompat;
                int i43 = this.serializer;
                this.serializer = i43 + 1;
                iArr22[i43] = 99;
                return 0;
            case 37:
                int[] iArr23 = this.MediaMetadataCompat;
                int i44 = this.serializer;
                iArr23[i44] = 0;
                this.serializer = i44;
                iArr23[i44 - 1] = iArr23[i44 - 1] / iArr23[i44];
                int i45 = i44 - 1;
                this.serializer = i45;
                this.MediaSessionCompatToken[i45] = null;
                return 0;
            case 38:
                int[] iArr24 = this.MediaMetadataCompat;
                int i46 = this.serializer;
                iArr24[i46] = 89;
                iArr24[i46 - 1] = iArr24[i46 - 1] + iArr24[i46];
                this.serializer = i46 + 1;
                iArr24[i46] = iArr24[i46 - 1];
                return 0;
            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                Object[] objArr11 = this.MediaSessionCompatToken;
                int i47 = this.serializer;
                objArr11[i47] = objArr11[35];
                objArr11[i47 + 1] = objArr11[36];
                int[] iArr25 = this.MediaMetadataCompat;
                this.serializer = i47 + 3;
                iArr25[i47 + 2] = iArr25[37];
                return 0;
            case 40:
                int[] iArr26 = this.MediaMetadataCompat;
                int i48 = this.serializer;
                iArr26[i48] = 66;
                iArr26[i48 + 1] = 0;
                int i49 = i48 + 1;
                this.serializer = i49;
                iArr26[i48] = iArr26[i48] / iArr26[i49];
                return 0;
            case DescriptorProtos$FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                int[] iArr27 = this.MediaMetadataCompat;
                int i50 = this.serializer;
                this.serializer = i50 + 1;
                iArr27[i50] = 1;
                return 0;
            case DescriptorProtos$FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                int[] iArr28 = this.MediaMetadataCompat;
                int i51 = this.serializer;
                this.serializer = i51 + 1;
                iArr28[i51] = 0;
                return 0;
            case 43:
                int[] iArr29 = this.MediaMetadataCompat;
                int i52 = this.serializer;
                this.serializer = i52 + 1;
                iArr29[i52] = 15;
                return 0;
            case 44:
                int i53 = this.serializer;
                int i54 = i53 - 1;
                int[] iArr30 = this.MediaMetadataCompat;
                iArr30[i53 - 2] = iArr30[i53 - 2] + iArr30[i54];
                this.serializer = i53;
                iArr30[i54] = iArr30[i53 - 2];
                return 0;
            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                int[] iArr31 = this.MediaMetadataCompat;
                int i55 = this.serializer;
                this.serializer = i55 + 1;
                iArr31[i55] = 128;
                return 0;
            case 46:
                int[] iArr32 = this.MediaMetadataCompat;
                int i56 = this.serializer;
                this.serializer = i56 + 1;
                iArr32[i56] = 89;
                return 0;
            case 47:
                int i57 = this.serializer;
                int i58 = i57 - 1;
                this.serializer = i58;
                int[] iArr33 = this.MediaMetadataCompat;
                iArr33[i57 - 2] = iArr33[i57 - 2] + iArr33[i58];
                return 0;
            case androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_MASK /* 48 */:
                int[] iArr34 = this.MediaMetadataCompat;
                int i59 = this.serializer;
                iArr34[i59] = 2;
                iArr34[i59 + 1] = 2;
                int i60 = i59 + 1;
                this.serializer = i60;
                iArr34[i59] = iArr34[i59] % iArr34[i60];
                return 0;
            case 49:
                int[] iArr35 = this.MediaMetadataCompat;
                int i61 = this.serializer;
                iArr35[i61] = 125;
                iArr35[i61 - 1] = iArr35[i61 - 1] + iArr35[i61];
                this.serializer = i61 + 1;
                iArr35[i61] = iArr35[i61 - 1];
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForLastChildOffset /* 50 */:
                int[] iArr36 = this.MediaMetadataCompat;
                int i62 = this.serializer;
                iArr36[i62] = 13;
                iArr36[i62 - 1] = iArr36[i62 - 1] + iArr36[i62];
                this.serializer = i62 + 1;
                iArr36[i62] = iArr36[i62 - 1];
                return 0;
            case 51:
                Object[] objArr12 = this.MediaSessionCompatToken;
                int i63 = this.serializer;
                this.serializer = i63 + 1;
                objArr12[i63] = null;
                return 0;
            case EmbeddedFeedbackUtils.THUMB_WIDTH /* 52 */:
                int[] iArr37 = this.MediaMetadataCompat;
                int i64 = this.serializer;
                this.serializer = i64 + 1;
                iArr37[i64] = 43;
                return 0;
            case 53:
                int[] iArr38 = this.MediaMetadataCompat;
                int i65 = this.serializer;
                Object[] objArr13 = this.MediaSessionCompatToken;
                Object obj5 = objArr13[i65 - 1];
                objArr13[i65 - 1] = null;
                iArr38[i65 - 1] = ((int[]) obj5).length;
                int i66 = i65 - 1;
                this.serializer = i66;
                objArr13[i66] = null;
                return 0;
            case 54:
                int[] iArr39 = this.MediaMetadataCompat;
                int i67 = this.serializer;
                iArr39[i67] = 35;
                iArr39[i67 - 1] = iArr39[i67 - 1] + iArr39[i67];
                this.serializer = i67 + 1;
                iArr39[i67] = iArr39[i67 - 1];
                return 0;
            case 55:
                int[] iArr40 = this.MediaMetadataCompat;
                int i68 = this.serializer;
                this.serializer = i68 + 1;
                iArr40[i68] = 13;
                return 0;
            case 56:
                int[] iArr41 = this.MediaMetadataCompat;
                int i69 = this.serializer;
                this.serializer = i69 + 1;
                iArr41[i69] = 91;
                return 0;
            case 57:
                int[] iArr42 = this.MediaMetadataCompat;
                int i70 = this.serializer;
                this.serializer = i70 + 1;
                iArr42[i70] = 1;
                return 0;
            case 58:
                int[] iArr43 = this.MediaMetadataCompat;
                int i71 = this.serializer;
                this.serializer = i71 + 1;
                iArr43[i71] = iArr43[i71 - 1];
                return 0;
            case 59:
                int[] iArr44 = this.MediaMetadataCompat;
                int i72 = this.serializer;
                iArr44[i72] = 19;
                iArr44[i72 - 1] = iArr44[i72 - 1] + iArr44[i72];
                this.serializer = i72 + 1;
                iArr44[i72] = iArr44[i72 - 1];
                return 0;
            case 60:
                int[] iArr45 = this.MediaMetadataCompat;
                int i73 = this.serializer;
                iArr45[i73] = 15;
                iArr45[i73 - 1] = iArr45[i73 - 1] + iArr45[i73];
                this.serializer = i73 + 1;
                iArr45[i73] = iArr45[i73 - 1];
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForFocusable /* 61 */:
                int[] iArr46 = this.MediaMetadataCompat;
                int i74 = this.serializer;
                this.serializer = i74 + 1;
                iArr46[i74] = 21;
                return 0;
            case androidx.compose.ui.spatial.RectListKt.BitOffsetForGesturable /* 62 */:
                int[] iArr47 = this.MediaMetadataCompat;
                int i75 = this.serializer;
                iArr47[i75] = 27;
                iArr47[i75 - 1] = iArr47[i75 - 1] + iArr47[i75];
                this.serializer = i75 + 1;
                iArr47[i75] = iArr47[i75 - 1];
                return 0;
            case 63:
                int[] iArr48 = this.MediaMetadataCompat;
                int i76 = this.serializer;
                this.serializer = i76 + 1;
                iArr48[i76] = 41;
                return 0;
            case 64:
                int[] iArr49 = this.MediaMetadataCompat;
                int i77 = this.serializer;
                this.serializer = i77 + 1;
                iArr49[i77] = 96;
                return 0;
            case 65:
                int[] iArr50 = this.MediaMetadataCompat;
                int i78 = this.serializer;
                this.serializer = i78 + 1;
                iArr50[i78] = 85;
                return 0;
            case 66:
                int[] iArr51 = this.MediaMetadataCompat;
                int i79 = this.serializer;
                iArr51[i79] = 31;
                iArr51[i79 - 1] = iArr51[i79 - 1] + iArr51[i79];
                this.serializer = i79 + 1;
                iArr51[i79] = iArr51[i79 - 1];
                return 0;
            case 67:
                int[] iArr52 = this.MediaMetadataCompat;
                int i80 = this.serializer;
                this.serializer = i80 + 1;
                iArr52[i80] = 45;
                return 0;
            case 68:
                int[] iArr53 = this.MediaMetadataCompat;
                int i81 = this.serializer;
                this.serializer = i81 + 1;
                iArr53[i81] = 48;
                return 0;
            case 69:
                int[] iArr54 = this.MediaMetadataCompat;
                int i82 = this.serializer;
                this.serializer = i82 + 1;
                iArr54[i82] = 65;
                return 0;
            case 70:
                int[] iArr55 = this.MediaMetadataCompat;
                int i83 = this.serializer;
                this.serializer = i83 + 1;
                iArr55[i83] = 77;
                return 0;
            case 71:
                int[] iArr56 = this.MediaMetadataCompat;
                int i84 = this.serializer;
                Object[] objArr14 = this.MediaSessionCompatToken;
                Object obj6 = objArr14[i84 - 1];
                objArr14[i84 - 1] = null;
                iArr56[i84 - 1] = ((int[]) obj6).length;
                return 0;
            case 72:
                int[] iArr57 = this.MediaMetadataCompat;
                int i85 = this.serializer;
                iArr57[i85] = 105;
                this.serializer = i85;
                iArr57[i85 - 1] = iArr57[i85 - 1] + iArr57[i85];
                return 0;
            case 73:
                int[] iArr58 = this.MediaMetadataCompat;
                int i86 = this.serializer;
                this.serializer = i86 + 1;
                iArr58[i86] = 121;
                return 0;
            case 74:
                int[] iArr59 = this.MediaMetadataCompat;
                int i87 = this.serializer;
                iArr59[i87] = 39;
                iArr59[i87 - 1] = iArr59[i87 - 1] + iArr59[i87];
                this.serializer = i87 + 1;
                iArr59[i87] = iArr59[i87 - 1];
                return 0;
            case 75:
                int[] iArr60 = this.MediaMetadataCompat;
                int i88 = this.serializer;
                this.serializer = i88 + 1;
                iArr60[i88] = 83;
                return 0;
            case 76:
                int[] iArr61 = this.MediaMetadataCompat;
                int i89 = this.serializer;
                this.serializer = i89 + 1;
                iArr61[i89] = 101;
                return 0;
            case 77:
                int[] iArr62 = this.MediaMetadataCompat;
                int i90 = this.serializer;
                this.serializer = i90 + 1;
                iArr62[i90] = 39;
                return 0;
            case 78:
                Object[] objArr15 = this.MediaSessionCompatToken;
                int i91 = this.serializer;
                this.serializer = i91 + 1;
                objArr15[i91] = objArr15[36];
                return 0;
            case 79:
                Object[] objArr16 = this.MediaSessionCompatToken;
                int i92 = this.serializer;
                objArr16[i92] = objArr16[37];
                int[] iArr63 = this.MediaMetadataCompat;
                this.serializer = i92 + 2;
                iArr63[i92 + 1] = iArr63[38];
                return 0;
            case 80:
                int[] iArr64 = this.MediaMetadataCompat;
                int i93 = this.serializer;
                this.serializer = i93 + 1;
                iArr64[i93] = 125;
                return 0;
            case 81:
                int[] iArr65 = this.MediaMetadataCompat;
                int i94 = this.serializer;
                this.serializer = i94 + 1;
                iArr65[i94] = 33;
                return 0;
            case 82:
                int[] iArr66 = this.MediaMetadataCompat;
                int i95 = this.serializer;
                iArr66[i95] = 0;
                this.serializer = i95;
                iArr66[i95 - 1] = iArr66[i95 - 1] / iArr66[i95];
                return 0;
            case 83:
                int[] iArr67 = this.MediaMetadataCompat;
                int i96 = this.serializer;
                this.serializer = i96 + 1;
                iArr67[i96] = 73;
                return 0;
            case 84:
                int[] iArr68 = this.MediaMetadataCompat;
                int i97 = this.serializer;
                iArr68[i97] = 7;
                iArr68[i97 - 1] = iArr68[i97 - 1] + iArr68[i97];
                this.serializer = i97 + 1;
                iArr68[i97] = iArr68[i97 - 1];
                return 0;
            case 85:
                Object[] objArr17 = this.MediaSessionCompatToken;
                int i98 = this.serializer;
                this.serializer = i98 + 1;
                objArr17[i98] = null;
                int[] iArr69 = this.MediaMetadataCompat;
                Object obj7 = objArr17[i98];
                objArr17[i98] = null;
                iArr69[i98] = ((int[]) obj7).length;
                this.serializer = i98;
                objArr17[i98] = null;
                return 0;
            case 86:
                int[] iArr70 = this.MediaMetadataCompat;
                int i99 = this.serializer;
                iArr70[i99] = 65;
                this.serializer = i99;
                iArr70[i99 - 1] = iArr70[i99 - 1] + iArr70[i99];
                return 0;
            case 87:
                int i100 = this.serializer - 1;
                this.serializer = i100;
                Object[] objArr18 = this.MediaSessionCompatToken;
                Object obj8 = objArr18[i100];
                objArr18[i100] = null;
                objArr18[35] = obj8;
                return 0;
            case 88:
                int i101 = this.serializer;
                int i102 = i101 - 1;
                Object[] objArr19 = this.MediaSessionCompatToken;
                Object obj9 = objArr19[i102];
                objArr19[i102] = null;
                objArr19[35] = obj9;
                this.serializer = i101;
                objArr19[i102] = obj9;
                return 0;
            case 89:
                int[] iArr71 = this.MediaMetadataCompat;
                int i103 = this.serializer;
                this.serializer = i103 + 1;
                iArr71[i103] = 69;
                return 0;
            case 90:
                Object[] objArr20 = this.MediaSessionCompatToken;
                int i104 = this.serializer;
                this.serializer = i104 + 1;
                objArr20[i104] = null;
                int[] iArr72 = this.MediaMetadataCompat;
                Object obj10 = objArr20[i104];
                objArr20[i104] = null;
                iArr72[i104] = ((int[]) obj10).length;
                return 0;
            case 91:
                int[] iArr73 = this.MediaMetadataCompat;
                int i105 = this.serializer;
                this.serializer = i105 + 1;
                iArr73[i105] = 74;
                return 0;
            case 92:
                int i106 = this.serializer;
                int i107 = i106 - 1;
                Object[] objArr21 = this.MediaSessionCompatToken;
                Object obj11 = objArr21[i107];
                objArr21[i107] = null;
                objArr21[35] = obj11;
                this.MediaMetadataCompat[i107] = 5;
                this.serializer = i106 + 1;
                objArr21[i106] = objArr21[34];
                return 0;
            case 93:
                int i108 = this.serializer;
                int i109 = i108 - 1;
                Object[] objArr22 = this.MediaSessionCompatToken;
                Object obj12 = objArr22[i109];
                objArr22[i109] = null;
                objArr22[34] = obj12;
                this.serializer = i108;
                objArr22[i109] = objArr22[35];
                return 0;
            case 94:
                Object[] objArr23 = this.MediaSessionCompatToken;
                int i110 = this.serializer;
                objArr23[i110] = objArr23[35];
                this.serializer = i110 + 2;
                objArr23[i110 + 1] = objArr23[34];
                return 0;
            case 95:
                int[] iArr74 = this.MediaMetadataCompat;
                int i111 = this.serializer;
                iArr74[i111] = 1;
                iArr74[i111 - 1] = iArr74[i111 - 1] + iArr74[i111];
                this.serializer = i111 + 1;
                iArr74[i111] = iArr74[i111 - 1];
                return 0;
            case 96:
                int[] iArr75 = this.MediaMetadataCompat;
                int i112 = this.serializer;
                this.serializer = i112 + 1;
                iArr75[i112] = 75;
                return 0;
            case 97:
                int[] iArr76 = this.MediaMetadataCompat;
                int i113 = this.serializer;
                this.serializer = i113 + 1;
                iArr76[i113] = 58;
                return 0;
            case 98:
                int[] iArr77 = this.MediaMetadataCompat;
                int i114 = this.serializer;
                iArr77[i114] = 75;
                iArr77[i114 - 1] = iArr77[i114 - 1] + iArr77[i114];
                this.serializer = i114 + 1;
                iArr77[i114] = iArr77[i114 - 1];
                return 0;
            case LogPriority.NONE /* 99 */:
                int[] iArr78 = this.MediaMetadataCompat;
                int i115 = this.serializer;
                this.serializer = i115 + 1;
                iArr78[i115] = 71;
                return 0;
            case 100:
                int[] iArr79 = this.MediaMetadataCompat;
                int i116 = this.serializer;
                this.serializer = i116 + 1;
                iArr79[i116] = 49;
                return 0;
            case 101:
                int[] iArr80 = this.MediaMetadataCompat;
                int i117 = this.serializer;
                this.serializer = i117 + 1;
                iArr80[i117] = 79;
                return 0;
            case 102:
                int[] iArr81 = this.MediaMetadataCompat;
                int i118 = this.serializer;
                this.serializer = i118 + 1;
                iArr81[i118] = 29;
                return 0;
            case 103:
                int[] iArr82 = this.MediaMetadataCompat;
                int i119 = this.serializer;
                iArr82[i119] = 115;
                this.serializer = i119;
                iArr82[i119 - 1] = iArr82[i119 - 1] + iArr82[i119];
                return 0;
            case 104:
                int i120 = this.serializer - 1;
                this.serializer = i120;
                Object[] objArr24 = this.MediaSessionCompatToken;
                Object obj13 = objArr24[i120];
                objArr24[i120] = null;
                this.read = obj13 == null ? 0 : 1;
                return 0;
            case 105:
                int i121 = this.serializer;
                int i122 = i121 - 1;
                Object[] objArr25 = this.MediaSessionCompatToken;
                Object obj14 = objArr25[i122];
                objArr25[i122] = null;
                objArr25[38] = obj14;
                this.serializer = i121;
                objArr25[i122] = objArr25[34];
                return 0;
            case GwiErrorCode.ALG_LIBRARY_NOT_EXIST /* 106 */:
                int i123 = this.serializer - 1;
                this.serializer = i123;
                Object[] objArr26 = this.MediaSessionCompatToken;
                Object obj15 = objArr26[i123];
                objArr26[i123] = null;
                objArr26[37] = obj15;
                return 0;
            case 107:
                Object[] objArr27 = this.MediaSessionCompatToken;
                int i124 = this.serializer;
                this.serializer = i124 + 1;
                objArr27[i124] = objArr27[38];
                return 0;
            case ActivityIdentificationData.RUNNING /* 108 */:
                int i125 = this.serializer;
                int i126 = i125 - 1;
                Object[] objArr28 = this.MediaSessionCompatToken;
                Object obj16 = objArr28[i126];
                objArr28[i126] = null;
                objArr28[38] = obj16;
                this.serializer = i125;
                objArr28[i126] = obj16;
                return 0;
            case 109:
                int i127 = this.serializer;
                int i128 = i127 - 1;
                Object[] objArr29 = this.MediaSessionCompatToken;
                objArr29[i128] = null;
                this.serializer = i127;
                objArr29[i128] = objArr29[37];
                return 0;
            case 110:
                int i129 = this.serializer - 1;
                this.serializer = i129;
                Object[] objArr30 = this.MediaSessionCompatToken;
                Object obj17 = objArr30[i129];
                objArr30[i129] = null;
                objArr30[38] = obj17;
                return 0;
            case 111:
                int i130 = this.serializer;
                int i131 = i130 - 1;
                Object[] objArr31 = this.MediaSessionCompatToken;
                Object obj18 = objArr31[i131];
                objArr31[i131] = null;
                objArr31[38] = obj18;
                objArr31[i131] = obj18;
                this.serializer = i130 + 1;
                objArr31[i130] = objArr31[35];
                return 0;
            case 112:
                int i132 = this.serializer - 1;
                this.serializer = i132;
                int[] iArr83 = this.MediaMetadataCompat;
                iArr83[36] = iArr83[i132];
                return 0;
            case 113:
                int[] iArr84 = this.MediaMetadataCompat;
                int i133 = this.serializer;
                this.serializer = i133 + 1;
                iArr84[i133] = iArr84[36];
                return 0;
            case 114:
                int i134 = this.serializer;
                int i135 = i134 - 1;
                Object[] objArr32 = this.MediaSessionCompatToken;
                Object obj19 = objArr32[i135];
                objArr32[i135] = null;
                objArr32[39] = obj19;
                objArr32[i135] = objArr32[38];
                this.serializer = i134 + 1;
                objArr32[i134] = objArr32[39];
                return 0;
            case 115:
                Object[] objArr33 = this.MediaSessionCompatToken;
                int i136 = this.serializer;
                this.serializer = i136 + 1;
                objArr33[i136] = objArr33[37];
                return 0;
            case 116:
                int i137 = this.serializer - 1;
                this.serializer = i137;
                Object[] objArr34 = this.MediaSessionCompatToken;
                Object obj20 = objArr34[i137];
                objArr34[i137] = null;
                objArr34[39] = obj20;
                return 0;
            case 117:
                Object[] objArr35 = this.MediaSessionCompatToken;
                int i138 = this.serializer;
                objArr35[i138] = objArr35[38];
                this.serializer = i138 + 2;
                objArr35[i138 + 1] = objArr35[39];
                return 0;
            case 118:
                int i139 = this.serializer;
                int i140 = i139 - 1;
                int[] iArr85 = this.MediaMetadataCompat;
                int i141 = iArr85[i140];
                iArr85[36] = i141;
                this.serializer = i139;
                iArr85[i140] = i141;
                return 0;
            case 119:
                Object[] objArr36 = this.MediaSessionCompatToken;
                int i142 = this.serializer;
                objArr36[i142] = objArr36[37];
                this.serializer = i142 + 2;
                objArr36[i142 + 1] = objArr36[35];
                return 0;
            case 120:
                int i143 = this.serializer;
                int i144 = i143 - 1;
                Object[] objArr37 = this.MediaSessionCompatToken;
                Object obj21 = objArr37[i144];
                objArr37[i144] = null;
                objArr37[38] = obj21;
                objArr37[i144] = objArr37[35];
                this.serializer = i143 + 1;
                objArr37[i143] = objArr37[38];
                return 0;
            case 121:
                int i145 = this.serializer;
                int i146 = i145 - 1;
                Object[] objArr38 = this.MediaSessionCompatToken;
                Object obj22 = objArr38[i146];
                objArr38[i146] = null;
                objArr38[38] = obj22;
                objArr38[i146] = objArr38[37];
                this.serializer = i145 + 1;
                objArr38[i145] = objArr38[35];
                return 0;
            case 122:
                int i147 = this.serializer;
                int i148 = i147 - 1;
                Object[] objArr39 = this.MediaSessionCompatToken;
                Object obj23 = objArr39[i148];
                objArr39[i148] = null;
                objArr39[39] = obj23;
                this.serializer = i147;
                objArr39[i148] = objArr39[38];
                return 0;
            case 123:
                Object[] objArr40 = this.MediaSessionCompatToken;
                int i149 = this.serializer;
                this.serializer = i149 + 1;
                objArr40[i149] = objArr40[39];
                return 0;
            case 124:
                int i150 = this.serializer;
                int i151 = i150 - 1;
                Object[] objArr41 = this.MediaSessionCompatToken;
                Object obj24 = objArr41[i151];
                objArr41[i151] = null;
                objArr41[39] = obj24;
                this.serializer = i150;
                objArr41[i151] = obj24;
                return 0;
            case 125:
                int i152 = this.serializer;
                int i153 = i152 - 1;
                Object[] objArr42 = this.MediaSessionCompatToken;
                Object obj25 = objArr42[i153];
                objArr42[i153] = null;
                objArr42[38] = obj25;
                this.serializer = i152;
                objArr42[i153] = objArr42[39];
                return 0;
            case 126:
                int i154 = this.serializer;
                int i155 = i154 - 1;
                Object[] objArr43 = this.MediaSessionCompatToken;
                Object obj26 = objArr43[i155];
                objArr43[i155] = null;
                objArr43[39] = obj26;
                this.serializer = i154;
                objArr43[i155] = objArr43[37];
                return 0;
            case 127:
                int i156 = this.serializer;
                int i157 = i156 - 1;
                Object[] objArr44 = this.MediaSessionCompatToken;
                Object obj27 = objArr44[i157];
                objArr44[i157] = null;
                objArr44[35] = obj27;
                this.serializer = i156;
                objArr44[i157] = objArr44[34];
                return 0;
            case androidx.compose.ui.graphics.Fields.SpotShadowColor /* 128 */:
                int i158 = this.serializer;
                int i159 = i158 - 1;
                Object[] objArr45 = this.MediaSessionCompatToken;
                Object obj28 = objArr45[i159];
                objArr45[i159] = null;
                objArr45[37] = obj28;
                this.serializer = i158;
                objArr45[i159] = obj28;
                return 0;
            case 129:
                int i160 = this.serializer;
                int i161 = i160 - 1;
                Object[] objArr46 = this.MediaSessionCompatToken;
                objArr46[i161] = null;
                this.serializer = i160;
                objArr46[i161] = objArr46[35];
                return 0;
            case 130:
                int[] iArr86 = this.MediaMetadataCompat;
                int i162 = this.serializer;
                this.serializer = i162 + 1;
                iArr86[i162] = 57;
                return 0;
            case 131:
                int[] iArr87 = this.MediaMetadataCompat;
                int i163 = this.serializer;
                iArr87[i163] = 79;
                this.serializer = i163;
                iArr87[i163 - 1] = iArr87[i163 - 1] + iArr87[i163];
                return 0;
            case 132:
                int[] iArr88 = this.MediaMetadataCompat;
                int i164 = this.serializer;
                iArr88[i164] = 65;
                iArr88[i164 - 1] = iArr88[i164 - 1] + iArr88[i164];
                this.serializer = i164 + 1;
                iArr88[i164] = iArr88[i164 - 1];
                return 0;
            case 133:
                int[] iArr89 = this.MediaMetadataCompat;
                int i165 = this.serializer;
                iArr89[i165] = 0;
                iArr89[i165 + 1] = 0;
                int i166 = i165 + 1;
                this.serializer = i166;
                iArr89[i165] = iArr89[i165] / iArr89[i166];
                return 0;
            case 134:
                int[] iArr90 = this.MediaMetadataCompat;
                int i167 = this.serializer;
                this.serializer = i167 + 1;
                iArr90[i167] = 27;
                return 0;
            case 135:
                int[] iArr91 = this.MediaMetadataCompat;
                int i168 = this.serializer;
                this.serializer = i168 + 1;
                iArr91[i168] = 123;
                return 0;
            case 136:
                int[] iArr92 = this.MediaMetadataCompat;
                int i169 = this.serializer;
                iArr92[i169] = 17;
                this.serializer = i169;
                iArr92[i169 - 1] = iArr92[i169 - 1] + iArr92[i169];
                return 0;
            case 137:
                int[] iArr93 = this.MediaMetadataCompat;
                int i170 = this.serializer;
                this.serializer = i170 + 1;
                iArr93[i170] = 109;
                return 0;
            case 138:
                int[] iArr94 = this.MediaMetadataCompat;
                int i171 = this.serializer;
                this.serializer = i171 + 1;
                iArr94[i171] = 17;
                return 0;
            case 139:
                int[] iArr95 = this.MediaMetadataCompat;
                int i172 = this.serializer;
                this.serializer = i172 + 1;
                iArr95[i172] = 11;
                return 0;
            case 140:
                int[] iArr96 = this.MediaMetadataCompat;
                int i173 = this.serializer;
                this.serializer = i173 + 1;
                iArr96[i173] = 7;
                return 0;
            case 141:
                int i174 = this.serializer;
                int i175 = i174 - 1;
                Object[] objArr47 = this.MediaSessionCompatToken;
                Object obj29 = objArr47[i175];
                objArr47[i175] = null;
                objArr47[36] = obj29;
                objArr47[i175] = obj29;
                this.serializer = i174 + 1;
                objArr47[i174] = objArr47[35];
                return 0;
            case 142:
                int[] iArr97 = this.MediaMetadataCompat;
                int i176 = this.serializer;
                this.serializer = i176 + 1;
                iArr97[i176] = 81;
                return 0;
            case 143:
                int[] iArr98 = this.MediaMetadataCompat;
                int i177 = this.serializer;
                iArr98[i177] = 115;
                iArr98[i177 - 1] = iArr98[i177 - 1] + iArr98[i177];
                this.serializer = i177 + 1;
                iArr98[i177] = iArr98[i177 - 1];
                return 0;
            case 144:
                int i178 = this.serializer - 1;
                this.serializer = i178;
                Object[] objArr48 = this.MediaSessionCompatToken;
                Object obj30 = objArr48[i178];
                objArr48[i178] = null;
                objArr48[36] = obj30;
                return 0;
            case 145:
                Object[] objArr49 = this.MediaSessionCompatToken;
                int i179 = this.serializer;
                objArr49[i179] = objArr49[36];
                this.serializer = i179 + 2;
                objArr49[i179 + 1] = objArr49[35];
                return 0;
            case 146:
                int[] iArr99 = this.MediaMetadataCompat;
                int i180 = this.serializer;
                this.serializer = i180 + 1;
                iArr99[i180] = 51;
                return 0;
            case 147:
                int[] iArr100 = this.MediaMetadataCompat;
                int i181 = this.serializer;
                this.serializer = i181 + 1;
                iArr100[i181] = 31;
                return 0;
            case 148:
                int[] iArr101 = this.MediaMetadataCompat;
                int i182 = this.serializer;
                this.serializer = i182 + 1;
                iArr101[i182] = 80;
                return 0;
            case 149:
                int i183 = this.serializer;
                int i184 = i183 - 1;
                Object[] objArr50 = this.MediaSessionCompatToken;
                Object obj31 = objArr50[i184];
                objArr50[i184] = null;
                objArr50[37] = obj31;
                this.serializer = i183;
                objArr50[i184] = objArr50[34];
                return 0;
            case 150:
                int i185 = this.serializer;
                int i186 = i185 - 1;
                Object[] objArr51 = this.MediaSessionCompatToken;
                Object obj32 = objArr51[i186];
                objArr51[i186] = null;
                objArr51[36] = obj32;
                this.serializer = i185;
                objArr51[i186] = objArr51[37];
                return 0;
            case 151:
                int i187 = this.serializer;
                int i188 = i187 - 1;
                Object[] objArr52 = this.MediaSessionCompatToken;
                Object obj33 = objArr52[i188];
                objArr52[i188] = null;
                objArr52[37] = obj33;
                int[] iArr102 = this.MediaMetadataCompat;
                this.serializer = i187;
                iArr102[i188] = 13;
                return 0;
            case 152:
                Object[] objArr53 = this.MediaSessionCompatToken;
                int i189 = this.serializer;
                objArr53[i189] = objArr53[35];
                objArr53[i189 + 1] = objArr53[36];
                this.serializer = i189 + 3;
                objArr53[i189 + 2] = objArr53[37];
                return 0;
            case 153:
                int[] iArr103 = this.MediaMetadataCompat;
                int i190 = this.serializer;
                this.serializer = i190 + 1;
                iArr103[i190] = 63;
                return 0;
            case 154:
                int i191 = this.serializer;
                int i192 = i191 - 1;
                Object[] objArr54 = this.MediaSessionCompatToken;
                Object obj34 = objArr54[i192];
                objArr54[i192] = null;
                objArr54[36] = obj34;
                this.serializer = i191;
                objArr54[i192] = obj34;
                return 0;
            case ModuleDescriptor.MODULE_VERSION /* 155 */:
                Object[] objArr55 = this.MediaSessionCompatToken;
                int i193 = this.serializer;
                objArr55[i193] = objArr55[35];
                this.serializer = i193 + 2;
                objArr55[i193 + 1] = objArr55[37];
                return 0;
            case 156:
                int[] iArr104 = this.MediaMetadataCompat;
                int i194 = this.serializer;
                iArr104[i194] = 19;
                this.serializer = i194;
                iArr104[i194 - 1] = iArr104[i194 - 1] + iArr104[i194];
                return 0;
            case 157:
                int[] iArr105 = this.MediaMetadataCompat;
                int i195 = this.serializer;
                this.serializer = i195 + 1;
                iArr105[i195] = 26;
                return 0;
            case 158:
                int i196 = this.serializer;
                int i197 = i196 - 1;
                Object[] objArr56 = this.MediaSessionCompatToken;
                Object obj35 = objArr56[i197];
                objArr56[i197] = null;
                objArr56[36] = obj35;
                this.serializer = i196;
                objArr56[i197] = objArr56[34];
                return 0;
            case 159:
                Object[] objArr57 = this.MediaSessionCompatToken;
                int i198 = this.serializer;
                objArr57[i198] = null;
                this.serializer = i198;
                Object obj36 = objArr57[i198];
                objArr57[i198] = null;
                objArr57[35] = obj36;
                return 0;
            case 160:
                Object[] objArr58 = this.MediaSessionCompatToken;
                int i199 = this.serializer;
                objArr58[i199] = objArr58[36];
                objArr58[i199 + 1] = objArr58[34];
                this.serializer = i199 + 3;
                objArr58[i199 + 2] = null;
                return 0;
            case 161:
                int[] iArr106 = this.MediaMetadataCompat;
                int i200 = this.serializer;
                this.serializer = i200 + 1;
                iArr106[i200] = 16;
                return 0;
            case 162:
                int[] iArr107 = this.MediaMetadataCompat;
                int i201 = this.serializer;
                this.serializer = i201 + 1;
                iArr107[i201] = 19;
                return 0;
            case 163:
                int[] iArr108 = this.MediaMetadataCompat;
                int i202 = this.serializer;
                this.serializer = i202 + 1;
                iArr108[i202] = 50;
                return 0;
            case 164:
                int i203 = this.serializer;
                int i204 = i203 - 1;
                Object[] objArr59 = this.MediaSessionCompatToken;
                Object obj37 = objArr59[i204];
                objArr59[i204] = null;
                objArr59[40] = obj37;
                this.serializer = i203;
                objArr59[i204] = obj37;
                return 0;
            case 165:
                int i205 = this.serializer - 1;
                this.serializer = i205;
                Object[] objArr60 = this.MediaSessionCompatToken;
                Object obj38 = objArr60[i205];
                objArr60[i205] = null;
                objArr60[41] = obj38;
                return 0;
            case 166:
                Object[] objArr61 = this.MediaSessionCompatToken;
                int i206 = this.serializer;
                objArr61[i206] = objArr61[40];
                this.serializer = i206 + 2;
                objArr61[i206 + 1] = objArr61[41];
                return 0;
            case 167:
                int i207 = this.serializer - 1;
                this.serializer = i207;
                int[] iArr109 = this.MediaMetadataCompat;
                iArr109[39] = iArr109[i207];
                return 0;
            case DateTimeConstants.HOURS_PER_WEEK /* 168 */:
                int[] iArr110 = this.MediaMetadataCompat;
                int i208 = this.serializer;
                this.serializer = i208 + 1;
                iArr110[i208] = iArr110[39];
                return 0;
            case 169:
                int i209 = this.serializer - 1;
                this.serializer = i209;
                Object[] objArr62 = this.MediaSessionCompatToken;
                Object obj39 = objArr62[i209];
                objArr62[i209] = null;
                objArr62[40] = obj39;
                return 0;
            case 170:
                Object[] objArr63 = this.MediaSessionCompatToken;
                int i210 = this.serializer;
                this.serializer = i210 + 1;
                objArr63[i210] = objArr63[40];
                return 0;
            case 171:
                Object[] objArr64 = this.MediaSessionCompatToken;
                int i211 = this.serializer;
                objArr64[i211] = objArr64[35];
                this.serializer = i211 + 2;
                objArr64[i211 + 1] = objArr64[36];
                return 0;
            case 172:
                int i212 = this.serializer;
                int i213 = i212 - 1;
                Object[] objArr65 = this.MediaSessionCompatToken;
                Object obj40 = objArr65[i213];
                objArr65[i213] = null;
                objArr65[35] = obj40;
                objArr65[i213] = objArr65[40];
                this.serializer = i212 + 1;
                objArr65[i212] = objArr65[35];
                return 0;
            case 173:
                int i214 = this.serializer;
                int i215 = i214 - 1;
                Object[] objArr66 = this.MediaSessionCompatToken;
                Object obj41 = objArr66[i215];
                objArr66[i215] = null;
                objArr66[40] = obj41;
                objArr66[i215] = obj41;
                this.serializer = i214 + 1;
                objArr66[i214] = objArr66[34];
                return 0;
            case 174:
                Object[] objArr67 = this.MediaSessionCompatToken;
                int i216 = this.serializer;
                objArr67[i216] = objArr67[36];
                this.serializer = i216 + 2;
                objArr67[i216 + 1] = objArr67[37];
                return 0;
            case 175:
                int[] iArr111 = this.MediaMetadataCompat;
                int i217 = this.serializer;
                this.serializer = i217 + 1;
                iArr111[i217] = iArr111[38];
                return 0;
            case 176:
                int[] iArr112 = this.MediaMetadataCompat;
                int i218 = this.serializer;
                iArr112[i218] = 2;
                this.serializer = i218;
                iArr112[i218 - 1] = iArr112[i218 - 1] % iArr112[i218];
                int i219 = i218 - 1;
                this.serializer = i219;
                this.MediaSessionCompatToken[i219] = null;
                return 0;
            case 177:
                int i220 = this.serializer;
                int i221 = i220 - 1;
                Object[] objArr68 = this.MediaSessionCompatToken;
                Object obj42 = objArr68[i221];
                objArr68[i221] = null;
                objArr68[41] = obj42;
                this.serializer = i220;
                objArr68[i221] = objArr68[40];
                return 0;
            case 178:
                Object[] objArr69 = this.MediaSessionCompatToken;
                int i222 = this.serializer;
                this.serializer = i222 + 1;
                objArr69[i222] = objArr69[41];
                return 0;
            case 179:
                int i223 = this.serializer;
                int i224 = i223 - 1;
                int[] iArr113 = this.MediaMetadataCompat;
                int i225 = iArr113[i224];
                iArr113[39] = i225;
                this.serializer = i223;
                iArr113[i224] = i225;
                return 0;
            case 180:
                int[] iArr114 = this.MediaMetadataCompat;
                int i226 = this.serializer;
                iArr114[i226] = 37;
                iArr114[i226 + 1] = 0;
                int i227 = i226 + 1;
                this.serializer = i227;
                iArr114[i226] = iArr114[i226] / iArr114[i227];
                return 0;
            case 181:
                int[] iArr115 = this.MediaMetadataCompat;
                int i228 = this.serializer;
                iArr115[i228] = 75;
                this.serializer = i228;
                iArr115[i228 - 1] = iArr115[i228 - 1] + iArr115[i228];
                return 0;
            case 182:
                int[] iArr116 = this.MediaMetadataCompat;
                int i229 = this.serializer;
                iArr116[i229] = 1;
                this.serializer = i229;
                iArr116[i229 - 1] = iArr116[i229] & iArr116[i229 - 1];
                return 0;
            case 183:
                int[] iArr117 = this.MediaMetadataCompat;
                int i230 = this.serializer;
                iArr117[i230] = iArr117[39];
                iArr117[i230 + 1] = 2;
                int i231 = i230 + 1;
                this.serializer = i231;
                iArr117[i230] = iArr117[i231] & iArr117[i230];
                return 0;
            case 184:
                int[] iArr118 = this.MediaMetadataCompat;
                int i232 = this.serializer;
                this.serializer = i232 + 1;
                iArr118[i232] = 4;
                return 0;
            case 185:
                int i233 = this.serializer;
                int i234 = i233 - 1;
                this.serializer = i234;
                int[] iArr119 = this.MediaMetadataCompat;
                iArr119[i233 - 2] = iArr119[i233 - 2] & iArr119[i234];
                return 0;
            case 186:
                int[] iArr120 = this.MediaMetadataCompat;
                int i235 = this.serializer;
                iArr120[i235] = iArr120[39];
                this.serializer = i235 + 2;
                iArr120[i235 + 1] = 8;
                return 0;
            case 187:
                int[] iArr121 = this.MediaMetadataCompat;
                int i236 = this.serializer;
                iArr121[i236] = 0;
                this.serializer = i236;
                iArr121[38] = iArr121[i236];
                return 0;
            case 188:
                int[] iArr122 = this.MediaMetadataCompat;
                int i237 = this.serializer;
                iArr122[i237] = 83;
                iArr122[i237 - 1] = iArr122[i237 - 1] + iArr122[i237];
                this.serializer = i237 + 1;
                iArr122[i237] = iArr122[i237 - 1];
                return 0;
            case 189:
                int[] iArr123 = this.MediaMetadataCompat;
                int i238 = this.serializer;
                this.serializer = i238 + 1;
                iArr123[i238] = 97;
                return 0;
            case 190:
                Object[] objArr70 = this.MediaSessionCompatToken;
                int i239 = this.serializer;
                objArr70[i239] = objArr70[36];
                int[] iArr124 = this.MediaMetadataCompat;
                this.serializer = i239 + 2;
                iArr124[i239 + 1] = 2;
                return 0;
            case 191:
                int i240 = this.serializer;
                int i241 = i240 - 1;
                Object[] objArr71 = this.MediaSessionCompatToken;
                objArr71[i241] = null;
                this.serializer = i240;
                objArr71[i241] = objArr71[34];
                return 0;
            case 192:
                int i242 = this.serializer - 1;
                this.serializer = i242;
                int[] iArr125 = this.MediaMetadataCompat;
                iArr125[35] = iArr125[i242];
                return 0;
            case 193:
                int[] iArr126 = this.MediaMetadataCompat;
                int i243 = this.serializer;
                this.serializer = i243 + 1;
                iArr126[i243] = iArr126[35];
                return 0;
            case 194:
                Object[] objArr72 = this.MediaSessionCompatToken;
                int i244 = this.serializer;
                objArr72[i244] = objArr72[34];
                this.serializer = i244 + 2;
                objArr72[i244 + 1] = objArr72[36];
                return 0;
            case 195:
                int[] iArr127 = this.MediaMetadataCompat;
                int i245 = this.serializer;
                iArr127[i245] = 85;
                iArr127[i245 - 1] = iArr127[i245 - 1] + iArr127[i245];
                this.serializer = i245 + 1;
                iArr127[i245] = iArr127[i245 - 1];
                return 0;
            case 196:
                int[] iArr128 = this.MediaMetadataCompat;
                int i246 = this.serializer;
                this.serializer = i246 + 1;
                iArr128[i246] = 111;
                return 0;
            case 197:
                int[] iArr129 = this.MediaMetadataCompat;
                int i247 = this.serializer;
                this.serializer = i247 + 1;
                iArr129[i247] = 24;
                return 0;
            case 198:
                Object[] objArr73 = this.MediaSessionCompatToken;
                int i248 = this.serializer;
                objArr73[i248] = objArr73[35];
                int[] iArr130 = this.MediaMetadataCompat;
                this.serializer = i248 + 2;
                iArr130[i248 + 1] = 1;
                return 0;
            case 199:
                int i249 = this.serializer;
                int i250 = i249 - 1;
                Object[] objArr74 = this.MediaSessionCompatToken;
                Object obj43 = objArr74[i250];
                objArr74[i250] = null;
                objArr74[35] = obj43;
                objArr74[i250] = obj43;
                int[] iArr131 = this.MediaMetadataCompat;
                this.serializer = i249 + 1;
                iArr131[i249] = 1;
                return 0;
            case 200:
                int i251 = this.serializer;
                int i252 = i251 - 1;
                Object[] objArr75 = this.MediaSessionCompatToken;
                Object obj44 = objArr75[i252];
                objArr75[i252] = null;
                objArr75[35] = obj44;
                objArr75[i252] = objArr75[34];
                this.serializer = i251 + 1;
                objArr75[i251] = objArr75[35];
                return 0;
            case 201:
                int[] iArr132 = this.MediaMetadataCompat;
                int i253 = this.serializer;
                iArr132[i253] = 32;
                iArr132[i253 + 1] = 0;
                int i254 = i253 + 1;
                this.serializer = i254;
                iArr132[i253] = iArr132[i253] / iArr132[i254];
                return 0;
            case 202:
                int[] iArr133 = this.MediaMetadataCompat;
                int i255 = this.serializer;
                iArr133[i255] = iArr133[37];
                this.serializer = i255 + 2;
                iArr133[i255 + 1] = 3;
                return 0;
            case 203:
                int i256 = this.serializer;
                int i257 = i256 - 2;
                this.serializer = i257;
                int[] iArr134 = this.MediaMetadataCompat;
                this.read = iArr134[i257] == iArr134[i256 - 1] ? 0 : 1;
                return 0;
            case Constant.ERROR_ACC_INVALID /* 204 */:
                int i258 = this.serializer - 1;
                this.serializer = i258;
                int[] iArr135 = this.MediaMetadataCompat;
                iArr135[38] = iArr135[i258];
                return 0;
            case Constant.ERROR_ACC_GRAVITY_INVALID /* 205 */:
                int[] iArr136 = this.MediaMetadataCompat;
                int i259 = this.serializer;
                this.serializer = i259 + 1;
                iArr136[i259] = iArr136[37];
                return 0;
            case Constant.ERROR_ACC_JUMP /* 206 */:
                int i260 = this.serializer;
                int i261 = i260 - 1;
                int[] iArr137 = this.MediaMetadataCompat;
                int i262 = iArr137[i261];
                iArr137[38] = i262;
                this.serializer = i260;
                iArr137[i261] = i262;
                return 0;
            case 207:
                Object[] objArr76 = this.MediaSessionCompatToken;
                int i263 = this.serializer;
                objArr76[i263] = objArr76[39];
                this.serializer = i263 + 2;
                objArr76[i263 + 1] = objArr76[40];
                return 0;
            case 208:
                int i264 = this.serializer;
                int i265 = i264 - 1;
                Object[] objArr77 = this.MediaSessionCompatToken;
                Object obj45 = objArr77[i265];
                objArr77[i265] = null;
                objArr77[41] = obj45;
                int[] iArr138 = this.MediaMetadataCompat;
                this.serializer = i264;
                iArr138[i265] = 2;
                return 0;
            case 209:
                int i266 = this.serializer;
                int i267 = i266 - 1;
                Object[] objArr78 = this.MediaSessionCompatToken;
                Object obj46 = objArr78[i267];
                objArr78[i267] = null;
                objArr78[40] = obj46;
                objArr78[i267] = obj46;
                int[] iArr139 = this.MediaMetadataCompat;
                this.serializer = i266 + 1;
                iArr139[i266] = 0;
                return 0;
            case 210:
                Object[] objArr79 = this.MediaSessionCompatToken;
                int i268 = this.serializer;
                objArr79[i268] = objArr79[39];
                int i269 = i268 - 2;
                this.serializer = i269;
                Object obj47 = objArr79[i269];
                objArr79[i269] = null;
                int i270 = this.MediaMetadataCompat[i268 - 1];
                Object obj48 = objArr79[i268];
                objArr79[i268] = null;
                ((Object[]) obj47)[i270] = obj48;
                return 0;
            case Constant.ERROR_GYRO_NO_DATA /* 211 */:
                Object[] objArr80 = this.MediaSessionCompatToken;
                int i271 = this.serializer;
                objArr80[i271] = objArr80[41];
                int i272 = i271 - 2;
                this.serializer = i272;
                Object obj49 = objArr80[i272];
                objArr80[i272] = null;
                int i273 = this.MediaMetadataCompat[i271 - 1];
                Object obj50 = objArr80[i271];
                objArr80[i271] = null;
                ((Object[]) obj49)[i273] = obj50;
                return 0;
            case Constant.ERROR_GYRO_LOW_FREQ /* 212 */:
                Object[] objArr81 = this.MediaSessionCompatToken;
                int i274 = this.serializer;
                objArr81[i274] = objArr81[34];
                objArr81[i274 + 1] = objArr81[35];
                int[] iArr140 = this.MediaMetadataCompat;
                this.serializer = i274 + 3;
                iArr140[i274 + 2] = 0;
                return 0;
            case Constant.ERROR_GYRO_TIME_DIFF_LARGE /* 213 */:
                Object[] objArr82 = this.MediaSessionCompatToken;
                int i275 = this.serializer;
                objArr82[i275] = objArr82[40];
                objArr82[i275 + 1] = objArr82[34];
                this.serializer = i275 + 3;
                objArr82[i275 + 2] = objArr82[36];
                return 0;
            case Constant.ERROR_GYRO_INVALID /* 214 */:
                int[] iArr141 = this.MediaMetadataCompat;
                int i276 = this.serializer;
                this.serializer = i276 + 1;
                iArr141[i276] = 59;
                return 0;
            case 215:
                int i277 = this.serializer;
                int i278 = i277 - 1;
                Object[] objArr83 = this.MediaSessionCompatToken;
                Object obj51 = objArr83[i278];
                objArr83[i278] = null;
                objArr83[45] = obj51;
                int[] iArr142 = this.MediaMetadataCompat;
                iArr142[i278] = iArr142[37];
                this.serializer = i277 + 1;
                iArr142[i277] = 3;
                return 0;
            case Constant.ERROR_GYRO_JUMP /* 216 */:
                int i279 = this.serializer;
                int i280 = i279 - 1;
                int[] iArr143 = this.MediaMetadataCompat;
                iArr143[i279 - 2] = iArr143[i279 - 2] & iArr143[i280];
                this.serializer = i279;
                iArr143[i280] = 2;
                return 0;
            case 217:
                int[] iArr144 = this.MediaMetadataCompat;
                int i281 = this.serializer;
                iArr144[i281] = 1;
                this.serializer = i281;
                iArr144[38] = iArr144[i281];
                return 0;
            case com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor.MODULE_VERSION /* 218 */:
                Object[] objArr84 = this.MediaSessionCompatToken;
                int i282 = this.serializer;
                objArr84[i282] = objArr84[41];
                int[] iArr145 = this.MediaMetadataCompat;
                iArr145[i282 + 1] = iArr145[37];
                this.serializer = i282 + 3;
                iArr145[i282 + 2] = 1;
                return 0;
            case 219:
                int i283 = this.serializer;
                int i284 = i283 - 1;
                int[] iArr146 = this.MediaMetadataCompat;
                iArr146[i283 - 2] = iArr146[i283 - 2] & iArr146[i284];
                this.serializer = i283;
                iArr146[i284] = iArr146[38];
                return 0;
            case 220:
                int i285 = this.serializer;
                int i286 = i285 - 1;
                Object[] objArr85 = this.MediaSessionCompatToken;
                Object obj52 = objArr85[i286];
                objArr85[i286] = null;
                objArr85[42] = obj52;
                this.serializer = i285;
                objArr85[i286] = objArr85[34];
                return 0;
            case Constant.ERROR_WSS_NO_DATA /* 221 */:
                Object[] objArr86 = this.MediaSessionCompatToken;
                int i287 = this.serializer;
                objArr86[i287] = objArr86[36];
                this.serializer = i287 + 2;
                objArr86[i287 + 1] = objArr86[41];
                return 0;
            case Constant.ERROR_WSS_LOW_FREQ /* 222 */:
                int i288 = this.serializer;
                int i289 = i288 - 1;
                Object[] objArr87 = this.MediaSessionCompatToken;
                Object obj53 = objArr87[i289];
                objArr87[i289] = null;
                objArr87[44] = obj53;
                this.serializer = i288;
                objArr87[i289] = objArr87[41];
                return 0;
            case Constant.ERROR_WSS_TIME_DIFF_LARGE /* 223 */:
                int i290 = this.serializer;
                int i291 = i290 - 1;
                Object[] objArr88 = this.MediaSessionCompatToken;
                Object obj54 = objArr88[i291];
                objArr88[i291] = null;
                objArr88[46] = obj54;
                this.serializer = i290;
                objArr88[i291] = objArr88[34];
                return 0;
            case Constant.ERROR_WSS_INVALID /* 224 */:
                int i292 = this.serializer - 1;
                this.serializer = i292;
                Object[] objArr89 = this.MediaSessionCompatToken;
                Object obj55 = objArr89[i292];
                objArr89[i292] = null;
                objArr89[47] = obj55;
                return 0;
            case 225:
                Object[] objArr90 = this.MediaSessionCompatToken;
                int i293 = this.serializer;
                objArr90[i293] = objArr90[41];
                this.serializer = i293 + 2;
                objArr90[i293 + 1] = objArr90[34];
                return 0;
            case Constant.ERROR_WSS_SPEED_JUMP /* 226 */:
                int i294 = this.serializer - 1;
                this.serializer = i294;
                Object[] objArr91 = this.MediaSessionCompatToken;
                Object obj56 = objArr91[i294];
                objArr91[i294] = null;
                objArr91[43] = obj56;
                return 0;
            case 227:
                Object[] objArr92 = this.MediaSessionCompatToken;
                int i295 = this.serializer;
                objArr92[i295] = objArr92[36];
                this.serializer = i295 + 2;
                objArr92[i295 + 1] = objArr92[43];
                return 0;
            case 228:
                int i296 = this.serializer;
                int i297 = i296 - 2;
                this.serializer = i297;
                Object[] objArr93 = this.MediaSessionCompatToken;
                Object obj57 = objArr93[i297];
                objArr93[i297] = null;
                Object obj58 = objArr93[i296 - 1];
                objArr93[i296 - 1] = null;
                this.read = obj57 != obj58 ? 0 : 1;
                return 0;
            case 229:
                Object[] objArr94 = this.MediaSessionCompatToken;
                int i298 = this.serializer;
                objArr94[i298] = objArr94[34];
                int[] iArr147 = this.MediaMetadataCompat;
                this.serializer = i298 + 2;
                iArr147[i298 + 1] = 2;
                return 0;
            case 230:
                int i299 = this.serializer;
                int i300 = i299 - 1;
                Object[] objArr95 = this.MediaSessionCompatToken;
                Object obj59 = objArr95[i300];
                objArr95[i300] = null;
                objArr95[39] = obj59;
                objArr95[i300] = objArr95[41];
                this.serializer = i299 + 1;
                objArr95[i299] = objArr95[39];
                return 0;
            case 231:
                int i301 = this.serializer - 1;
                this.serializer = i301;
                Object[] objArr96 = this.MediaSessionCompatToken;
                Object obj60 = objArr96[i301];
                objArr96[i301] = null;
                objArr96[48] = obj60;
                return 0;
            case 232:
                Object[] objArr97 = this.MediaSessionCompatToken;
                int i302 = this.serializer;
                objArr97[i302] = objArr97[34];
                int[] iArr148 = this.MediaMetadataCompat;
                this.serializer = i302 + 2;
                iArr148[i302 + 1] = 3;
                return 0;
            case 233:
                int i303 = this.serializer;
                int i304 = i303 - 1;
                Object[] objArr98 = this.MediaSessionCompatToken;
                Object obj61 = objArr98[i304];
                objArr98[i304] = null;
                objArr98[36] = obj61;
                objArr98[i304] = objArr98[46];
                this.serializer = i303 + 1;
                objArr98[i303] = objArr98[47];
                return 0;
            case Constant.ERROR_LOCATION_INVALID /* 234 */:
                Object[] objArr99 = this.MediaSessionCompatToken;
                int i305 = this.serializer;
                this.serializer = i305 + 1;
                objArr99[i305] = objArr99[48];
                return 0;
            case 235:
                Object[] objArr100 = this.MediaSessionCompatToken;
                int i306 = this.serializer;
                this.serializer = i306 + 1;
                objArr100[i306] = objArr100[45];
                return 0;
            case 236:
                int i307 = this.serializer - 1;
                this.serializer = i307;
                Object[] objArr101 = this.MediaSessionCompatToken;
                Object obj62 = objArr101[i307];
                objArr101[i307] = null;
                objArr101[46] = obj62;
                return 0;
            case 237:
                int i308 = this.serializer;
                int i309 = i308 - 1;
                int[] iArr149 = this.MediaMetadataCompat;
                iArr149[38] = iArr149[i309];
                Object[] objArr102 = this.MediaSessionCompatToken;
                this.serializer = i308;
                objArr102[i309] = objArr102[41];
                return 0;
            case 238:
                int i310 = this.serializer;
                int i311 = i310 - 1;
                Object[] objArr103 = this.MediaSessionCompatToken;
                Object obj63 = objArr103[i311];
                objArr103[i311] = null;
                objArr103[36] = obj63;
                int[] iArr150 = this.MediaMetadataCompat;
                this.serializer = i310;
                iArr150[i311] = iArr150[38];
                return 0;
            case 239:
                Object[] objArr104 = this.MediaSessionCompatToken;
                int i312 = this.serializer;
                objArr104[i312] = objArr104[36];
                this.serializer = i312;
                Object obj64 = objArr104[i312];
                objArr104[i312] = null;
                objArr104[39] = obj64;
                return 0;
            case 240:
                Object[] objArr105 = this.MediaSessionCompatToken;
                int i313 = this.serializer;
                objArr105[i313] = objArr105[34];
                int[] iArr151 = this.MediaMetadataCompat;
                this.serializer = i313 + 2;
                iArr151[i313 + 1] = 4;
                return 0;
            case 241:
                Object[] objArr106 = this.MediaSessionCompatToken;
                int i314 = this.serializer;
                objArr106[i314] = objArr106[41];
                this.serializer = i314 + 2;
                objArr106[i314 + 1] = objArr106[39];
                return 0;
            case 242:
                Object[] objArr107 = this.MediaSessionCompatToken;
                int i315 = this.serializer;
                objArr107[i315] = objArr107[34];
                int[] iArr152 = this.MediaMetadataCompat;
                this.serializer = i315 + 2;
                iArr152[i315 + 1] = 5;
                return 0;
            case 243:
                Object[] objArr108 = this.MediaSessionCompatToken;
                int i316 = this.serializer;
                this.serializer = i316 + 1;
                objArr108[i316] = objArr108[46];
                return 0;
            case Constant.ERROR_GNSS_STATUS_INVALID /* 244 */:
                Object[] objArr109 = this.MediaSessionCompatToken;
                int i317 = this.serializer;
                objArr109[i317] = objArr109[39];
                this.serializer = i317 + 2;
                objArr109[i317 + 1] = objArr109[47];
                return 0;
            case 245:
                Object[] objArr110 = this.MediaSessionCompatToken;
                int i318 = this.serializer;
                objArr110[i318] = objArr110[48];
                this.serializer = i318 + 2;
                objArr110[i318 + 1] = objArr110[36];
                return 0;
            case 246:
                Object[] objArr111 = this.MediaSessionCompatToken;
                int i319 = this.serializer;
                objArr111[i319] = objArr111[36];
                objArr111[i319 + 1] = objArr111[41];
                this.serializer = i319 + 3;
                objArr111[i319 + 2] = objArr111[45];
                return 0;
            case 247:
                int i320 = this.serializer;
                int i321 = i320 - 1;
                Object[] objArr112 = this.MediaSessionCompatToken;
                objArr112[i321] = null;
                this.serializer = i320;
                objArr112[i321] = objArr112[41];
                return 0;
            case 248:
                int i322 = this.serializer;
                int i323 = i322 - 1;
                Object[] objArr113 = this.MediaSessionCompatToken;
                Object obj65 = objArr113[i323];
                objArr113[i323] = null;
                objArr113[39] = obj65;
                objArr113[i323] = objArr113[36];
                this.serializer = i322 + 1;
                objArr113[i322] = objArr113[43];
                return 0;
            case 249:
                int i324 = this.serializer;
                int i325 = i324 - 1;
                Object[] objArr114 = this.MediaSessionCompatToken;
                Object obj66 = objArr114[i325];
                objArr114[i325] = null;
                objArr114[49] = obj66;
                this.serializer = i324;
                objArr114[i325] = objArr114[34];
                return 0;
            case 250:
                int i326 = this.serializer;
                int i327 = i326 - 1;
                Object[] objArr115 = this.MediaSessionCompatToken;
                Object obj67 = objArr115[i327];
                objArr115[i327] = null;
                objArr115[45] = obj67;
                objArr115[i327] = objArr115[41];
                this.serializer = i326 + 1;
                objArr115[i326] = objArr115[45];
                return 0;
            case 251:
                Object[] objArr116 = this.MediaSessionCompatToken;
                int i328 = this.serializer;
                objArr116[i328] = objArr116[45];
                int[] iArr153 = this.MediaMetadataCompat;
                this.serializer = i328 + 2;
                iArr153[i328 + 1] = 20;
                return 0;
            case 252:
                int i329 = this.serializer;
                int i330 = i329 - 1;
                Object[] objArr117 = this.MediaSessionCompatToken;
                Object obj68 = objArr117[i330];
                objArr117[i330] = null;
                objArr117[39] = obj68;
                this.serializer = i329;
                objArr117[i330] = objArr117[41];
                return 0;
            case 253:
                int i331 = this.serializer - 1;
                this.serializer = i331;
                Object[] objArr118 = this.MediaSessionCompatToken;
                Object obj69 = objArr118[i331];
                objArr118[i331] = null;
                objArr118[50] = obj69;
                return 0;
            case Constant.ERROR_ROAD_AREA_INVALID /* 254 */:
                int i332 = this.serializer - 1;
                this.serializer = i332;
                Object[] objArr119 = this.MediaSessionCompatToken;
                Object obj70 = objArr119[i332];
                objArr119[i332] = null;
                objArr119[45] = obj70;
                return 0;
            case 255:
                Object[] objArr120 = this.MediaSessionCompatToken;
                int i333 = this.serializer;
                objArr120[i333] = objArr120[36];
                Object obj71 = objArr120[i333];
                objArr120[i333] = null;
                objArr120[39] = obj71;
                this.serializer = i333 + 1;
                objArr120[i333] = objArr120[36];
                return 0;
            case androidx.compose.ui.graphics.Fields.RotationX /* 256 */:
                Object[] objArr121 = this.MediaSessionCompatToken;
                int i334 = this.serializer;
                this.serializer = i334 + 1;
                objArr121[i334] = objArr121[43];
                return 0;
            case 257:
                Object[] objArr122 = this.MediaSessionCompatToken;
                int i335 = this.serializer;
                objArr122[i335] = objArr122[45];
                int[] iArr154 = this.MediaMetadataCompat;
                this.serializer = i335 + 2;
                iArr154[i335 + 1] = 21;
                return 0;
            case 258:
                int i336 = this.serializer;
                int i337 = i336 - 1;
                Object[] objArr123 = this.MediaSessionCompatToken;
                Object obj72 = objArr123[i337];
                objArr123[i337] = null;
                objArr123[51] = obj72;
                this.serializer = i336;
                objArr123[i337] = objArr123[44];
                return 0;
            case 259:
                int i338 = this.serializer - 1;
                this.serializer = i338;
                Object[] objArr124 = this.MediaSessionCompatToken;
                Object obj73 = objArr124[i338];
                objArr124[i338] = null;
                objArr124[44] = obj73;
                return 0;
            case 260:
                Object[] objArr125 = this.MediaSessionCompatToken;
                int i339 = this.serializer;
                this.serializer = i339 + 1;
                objArr125[i339] = objArr125[44];
                return 0;
            case 261:
                Object[] objArr126 = this.MediaSessionCompatToken;
                int i340 = this.serializer;
                objArr126[i340] = objArr126[41];
                this.serializer = i340 + 2;
                objArr126[i340 + 1] = objArr126[40];
                return 0;
            case 262:
                int[] iArr155 = this.MediaMetadataCompat;
                int i341 = this.serializer;
                this.serializer = i341 + 1;
                iArr155[i341] = 22;
                return 0;
            case 263:
                int i342 = this.serializer;
                int i343 = i342 - 1;
                Object[] objArr127 = this.MediaSessionCompatToken;
                Object obj74 = objArr127[i343];
                objArr127[i343] = null;
                objArr127[52] = obj74;
                this.serializer = i342;
                objArr127[i343] = objArr127[34];
                return 0;
            case Constant.ERROR_ROTATION_ANGLE_INVALID /* 264 */:
                int i344 = this.serializer;
                int i345 = i344 - 1;
                Object[] objArr128 = this.MediaSessionCompatToken;
                Object obj75 = objArr128[i345];
                objArr128[i345] = null;
                objArr128[53] = obj75;
                this.serializer = i344;
                objArr128[i345] = objArr128[34];
                return 0;
            case 265:
                int i346 = this.serializer;
                int i347 = i346 - 1;
                Object[] objArr129 = this.MediaSessionCompatToken;
                Object obj76 = objArr129[i347];
                objArr129[i347] = null;
                objArr129[40] = obj76;
                objArr129[i347] = objArr129[41];
                this.serializer = i346 + 1;
                objArr129[i346] = objArr129[40];
                return 0;
            case 266:
                Object[] objArr130 = this.MediaSessionCompatToken;
                int i348 = this.serializer;
                objArr130[i348] = objArr130[40];
                int[] iArr156 = this.MediaMetadataCompat;
                this.serializer = i348 + 2;
                iArr156[i348 + 1] = 22;
                return 0;
            case 267:
                int i349 = this.serializer - 1;
                this.serializer = i349;
                Object[] objArr131 = this.MediaSessionCompatToken;
                Object obj77 = objArr131[i349];
                objArr131[i349] = null;
                objArr131[54] = obj77;
                return 0;
            case 268:
                int[] iArr157 = this.MediaMetadataCompat;
                int i350 = this.serializer;
                this.serializer = i350 + 1;
                iArr157[i350] = 23;
                return 0;
            case 269:
                int i351 = this.serializer;
                int i352 = i351 - 1;
                Object[] objArr132 = this.MediaSessionCompatToken;
                Object obj78 = objArr132[i352];
                objArr132[i352] = null;
                objArr132[61] = obj78;
                objArr132[i352] = objArr132[41];
                this.serializer = i351 + 1;
                objArr132[i351] = objArr132[34];
                return 0;
            case 270:
                Object[] objArr133 = this.MediaSessionCompatToken;
                int i353 = this.serializer;
                objArr133[i353] = objArr133[34];
                int[] iArr158 = this.MediaMetadataCompat;
                this.serializer = i353 + 2;
                iArr158[i353 + 1] = 17;
                return 0;
            case 271:
                int i354 = this.serializer - 1;
                this.serializer = i354;
                Object[] objArr134 = this.MediaSessionCompatToken;
                Object obj79 = objArr134[i354];
                objArr134[i354] = null;
                objArr134[55] = obj79;
                return 0;
            case 272:
                int i355 = this.serializer;
                int i356 = i355 - 1;
                Object[] objArr135 = this.MediaSessionCompatToken;
                Object obj80 = objArr135[i356];
                objArr135[i356] = null;
                objArr135[39] = obj80;
                this.serializer = i355;
                objArr135[i356] = objArr135[36];
                return 0;
            case 273:
                int[] iArr159 = this.MediaMetadataCompat;
                int i357 = this.serializer;
                this.serializer = i357 + 1;
                iArr159[i357] = 18;
                return 0;
            case 274:
                int i358 = this.serializer;
                int i359 = i358 - 1;
                Object[] objArr136 = this.MediaSessionCompatToken;
                Object obj81 = objArr136[i359];
                objArr136[i359] = null;
                objArr136[62] = obj81;
                this.serializer = i358;
                objArr136[i359] = objArr136[34];
                return 0;
            case 275:
                Object[] objArr137 = this.MediaSessionCompatToken;
                int i360 = this.serializer;
                objArr137[i360] = null;
                this.serializer = i360;
                Object obj82 = objArr137[i360];
                objArr137[i360] = null;
                objArr137[36] = obj82;
                return 0;
            case 276:
                int i361 = this.serializer - 1;
                this.serializer = i361;
                Object[] objArr138 = this.MediaSessionCompatToken;
                Object obj83 = objArr138[i361];
                objArr138[i361] = null;
                objArr138[56] = obj83;
                return 0;
            case 277:
                int i362 = this.serializer;
                int i363 = i362 - 1;
                Object[] objArr139 = this.MediaSessionCompatToken;
                Object obj84 = objArr139[i363];
                objArr139[i363] = null;
                objArr139[57] = obj84;
                this.serializer = i362;
                objArr139[i363] = objArr139[34];
                return 0;
            case 278:
                int i364 = this.serializer - 1;
                this.serializer = i364;
                Object[] objArr140 = this.MediaSessionCompatToken;
                Object obj85 = objArr140[i364];
                objArr140[i364] = null;
                objArr140[58] = obj85;
                return 0;
            case 279:
                int i365 = this.serializer;
                int i366 = i365 - 1;
                Object[] objArr141 = this.MediaSessionCompatToken;
                Object obj86 = objArr141[i366];
                objArr141[i366] = null;
                objArr141[59] = obj86;
                this.serializer = i365;
                objArr141[i366] = objArr141[34];
                return 0;
            case 280:
                int i367 = this.serializer - 1;
                this.serializer = i367;
                Object[] objArr142 = this.MediaSessionCompatToken;
                Object obj87 = objArr142[i367];
                objArr142[i367] = null;
                objArr142[60] = obj87;
                return 0;
            case 281:
                int i368 = this.serializer - 1;
                this.serializer = i368;
                Object[] objArr143 = this.MediaSessionCompatToken;
                Object obj88 = objArr143[i368];
                objArr143[i368] = null;
                objArr143[63] = obj88;
                return 0;
            case 282:
                Object[] objArr144 = this.MediaSessionCompatToken;
                int i369 = this.serializer;
                this.serializer = i369 + 1;
                objArr144[i369] = objArr144[63];
                return 0;
            case 283:
                int i370 = this.serializer;
                int i371 = i370 - 1;
                Object[] objArr145 = this.MediaSessionCompatToken;
                Object obj89 = objArr145[i371];
                objArr145[i371] = null;
                objArr145[39] = obj89;
                int[] iArr160 = this.MediaMetadataCompat;
                this.serializer = i370;
                iArr160[i371] = iArr160[38];
                return 0;
            case 284:
                int i372 = this.serializer;
                int i373 = i372 - 1;
                Object[] objArr146 = this.MediaSessionCompatToken;
                Object obj90 = objArr146[i373];
                objArr146[i373] = null;
                objArr146[40] = obj90;
                objArr146[i373] = objArr146[39];
                this.serializer = i372 + 1;
                objArr146[i372] = objArr146[43];
                return 0;
            case 285:
                int[] iArr161 = this.MediaMetadataCompat;
                int i374 = this.serializer;
                iArr161[i374] = 21;
                Object[] objArr147 = this.MediaSessionCompatToken;
                this.serializer = i374 + 2;
                objArr147[i374 + 1] = objArr147[63];
                return 0;
            case 286:
                int i375 = this.serializer;
                int i376 = i375 - 1;
                Object[] objArr148 = this.MediaSessionCompatToken;
                Object obj91 = objArr148[i376];
                objArr148[i376] = null;
                objArr148[65] = obj91;
                this.serializer = i375;
                objArr148[i376] = objArr148[34];
                return 0;
            case 287:
                int i377 = this.serializer - 1;
                this.serializer = i377;
                Object[] objArr149 = this.MediaSessionCompatToken;
                Object obj92 = objArr149[i377];
                objArr149[i377] = null;
                objArr149[64] = obj92;
                return 0;
            case 288:
                int i378 = this.serializer;
                int i379 = i378 - 1;
                Object[] objArr150 = this.MediaSessionCompatToken;
                Object obj93 = objArr150[i379];
                objArr150[i379] = null;
                objArr150[40] = obj93;
                this.serializer = i378;
                objArr150[i379] = objArr150[39];
                return 0;
            case 289:
                Object[] objArr151 = this.MediaSessionCompatToken;
                int i380 = this.serializer;
                objArr151[i380] = objArr151[34];
                int[] iArr162 = this.MediaMetadataCompat;
                this.serializer = i380 + 2;
                iArr162[i380 + 1] = 19;
                return 0;
            case 290:
                int i381 = this.serializer - 1;
                this.serializer = i381;
                Object[] objArr152 = this.MediaSessionCompatToken;
                Object obj94 = objArr152[i381];
                objArr152[i381] = null;
                objArr152[67] = obj94;
                return 0;
            case 291:
                int i382 = this.serializer - 1;
                this.serializer = i382;
                Object[] objArr153 = this.MediaSessionCompatToken;
                Object obj95 = objArr153[i382];
                objArr153[i382] = null;
                objArr153[66] = obj95;
                return 0;
            case 292:
                Object[] objArr154 = this.MediaSessionCompatToken;
                int i383 = this.serializer;
                this.serializer = i383 + 1;
                objArr154[i383] = objArr154[66];
                return 0;
            case 293:
                Object[] objArr155 = this.MediaSessionCompatToken;
                int i384 = this.serializer;
                this.serializer = i384 + 1;
                objArr155[i384] = objArr155[49];
                return 0;
            case 294:
                int i385 = this.serializer;
                int i386 = i385 - 1;
                Object[] objArr156 = this.MediaSessionCompatToken;
                Object obj96 = objArr156[i386];
                objArr156[i386] = null;
                objArr156[49] = obj96;
                this.serializer = i385;
                objArr156[i386] = objArr156[50];
                return 0;
            case 295:
                int i387 = this.serializer;
                int i388 = i387 - 1;
                Object[] objArr157 = this.MediaSessionCompatToken;
                Object obj97 = objArr157[i388];
                objArr157[i388] = null;
                objArr157[50] = obj97;
                this.serializer = i387;
                objArr157[i388] = objArr157[51];
                return 0;
            case 296:
                int i389 = this.serializer - 1;
                this.serializer = i389;
                Object[] objArr158 = this.MediaSessionCompatToken;
                Object obj98 = objArr158[i389];
                objArr158[i389] = null;
                objArr158[51] = obj98;
                return 0;
            case 297:
                Object[] objArr159 = this.MediaSessionCompatToken;
                int i390 = this.serializer;
                this.serializer = i390 + 1;
                objArr159[i390] = objArr159[52];
                return 0;
            case 298:
                int i391 = this.serializer;
                int i392 = i391 - 1;
                Object[] objArr160 = this.MediaSessionCompatToken;
                Object obj99 = objArr160[i392];
                objArr160[i392] = null;
                objArr160[52] = obj99;
                this.serializer = i391;
                objArr160[i392] = objArr160[53];
                return 0;
            case 299:
                int i393 = this.serializer - 1;
                this.serializer = i393;
                Object[] objArr161 = this.MediaSessionCompatToken;
                Object obj100 = objArr161[i393];
                objArr161[i393] = null;
                objArr161[53] = obj100;
                return 0;
            case LocationRequest.PRIORITY_INDOOR /* 300 */:
                int[] iArr163 = this.MediaMetadataCompat;
                int i394 = this.serializer;
                this.serializer = i394 + 1;
                iArr163[i394] = 6;
                return 0;
            case LocationRequest.PRIORITY_MAG_POSITION /* 301 */:
                int i395 = this.serializer;
                int i396 = i395 - 1;
                Object[] objArr162 = this.MediaSessionCompatToken;
                Object obj101 = objArr162[i396];
                objArr162[i396] = null;
                objArr162[40] = obj101;
                this.serializer = i395;
                objArr162[i396] = objArr162[41];
                return 0;
            case 302:
                int i397 = this.serializer;
                int i398 = i397 - 1;
                Object[] objArr163 = this.MediaSessionCompatToken;
                Object obj102 = objArr163[i398];
                objArr163[i398] = null;
                objArr163[68] = obj102;
                this.serializer = i397;
                objArr163[i398] = objArr163[54];
                return 0;
            case 303:
                Object[] objArr164 = this.MediaSessionCompatToken;
                int i399 = this.serializer;
                this.serializer = i399 + 1;
                objArr164[i399] = objArr164[61];
                return 0;
            case 304:
                int i400 = this.serializer;
                int i401 = i400 - 1;
                Object[] objArr165 = this.MediaSessionCompatToken;
                Object obj103 = objArr165[i401];
                objArr165[i401] = null;
                objArr165[61] = obj103;
                this.serializer = i400;
                objArr165[i401] = objArr165[41];
                return 0;
            case 305:
                int i402 = this.serializer - 1;
                this.serializer = i402;
                Object[] objArr166 = this.MediaSessionCompatToken;
                Object obj104 = objArr166[i402];
                objArr166[i402] = null;
                objArr166[69] = obj104;
                return 0;
            case 306:
                Object[] objArr167 = this.MediaSessionCompatToken;
                int i403 = this.serializer;
                this.serializer = i403 + 1;
                objArr167[i403] = objArr167[55];
                return 0;
            case 307:
                Object[] objArr168 = this.MediaSessionCompatToken;
                int i404 = this.serializer;
                this.serializer = i404 + 1;
                objArr168[i404] = objArr168[62];
                return 0;
            case 308:
                int i405 = this.serializer - 1;
                this.serializer = i405;
                Object[] objArr169 = this.MediaSessionCompatToken;
                Object obj105 = objArr169[i405];
                objArr169[i405] = null;
                objArr169[62] = obj105;
                return 0;
            case 309:
                Object[] objArr170 = this.MediaSessionCompatToken;
                int i406 = this.serializer;
                this.serializer = i406 + 1;
                objArr170[i406] = objArr170[67];
                return 0;
            case 310:
                Object[] objArr171 = this.MediaSessionCompatToken;
                int i407 = this.serializer;
                this.serializer = i407 + 1;
                objArr171[i407] = objArr171[65];
                return 0;
            case 311:
                int i408 = this.serializer;
                int i409 = i408 - 1;
                Object[] objArr172 = this.MediaSessionCompatToken;
                Object obj106 = objArr172[i409];
                objArr172[i409] = null;
                objArr172[65] = obj106;
                this.serializer = i408;
                objArr172[i409] = objArr172[41];
                return 0;
            case 312:
                Object[] objArr173 = this.MediaSessionCompatToken;
                int i410 = this.serializer;
                objArr173[i410] = objArr173[39];
                this.serializer = i410;
                Object obj107 = objArr173[i410];
                objArr173[i410] = null;
                objArr173[40] = obj107;
                return 0;
            case 313:
                Object[] objArr174 = this.MediaSessionCompatToken;
                int i411 = this.serializer;
                objArr174[i411] = objArr174[39];
                this.serializer = i411 + 2;
                objArr174[i411 + 1] = objArr174[43];
                return 0;
            case 314:
                int i412 = this.serializer;
                int i413 = i412 - 1;
                Object[] objArr175 = this.MediaSessionCompatToken;
                Object obj108 = objArr175[i413];
                objArr175[i413] = null;
                objArr175[39] = obj108;
                this.serializer = i412;
                objArr175[i413] = objArr175[35];
                return 0;
            case 315:
                Object[] objArr176 = this.MediaSessionCompatToken;
                int i414 = this.serializer;
                objArr176[i414] = objArr176[49];
                objArr176[i414 + 1] = objArr176[50];
                this.serializer = i414 + 3;
                objArr176[i414 + 2] = objArr176[51];
                return 0;
            case 316:
                Object[] objArr177 = this.MediaSessionCompatToken;
                int i415 = this.serializer;
                this.serializer = i415 + 1;
                objArr177[i415] = objArr177[42];
                return 0;
            case 317:
                Object[] objArr178 = this.MediaSessionCompatToken;
                int i416 = this.serializer;
                objArr178[i416] = objArr178[44];
                objArr178[i416 + 1] = objArr178[52];
                this.serializer = i416 + 3;
                objArr178[i416 + 2] = objArr178[53];
                return 0;
            case 318:
                Object[] objArr179 = this.MediaSessionCompatToken;
                int i417 = this.serializer;
                this.serializer = i417 + 1;
                objArr179[i417] = objArr179[68];
                return 0;
            case 319:
                Object[] objArr180 = this.MediaSessionCompatToken;
                int i418 = this.serializer;
                objArr180[i418] = objArr180[54];
                objArr180[i418 + 1] = objArr180[61];
                this.serializer = i418 + 3;
                objArr180[i418 + 2] = objArr180[46];
                return 0;
            case 320:
                Object[] objArr181 = this.MediaSessionCompatToken;
                int i419 = this.serializer;
                objArr181[i419] = objArr181[47];
                objArr181[i419 + 1] = objArr181[48];
                this.serializer = i419 + 3;
                objArr181[i419 + 2] = objArr181[60];
                return 0;
            case 321:
                Object[] objArr182 = this.MediaSessionCompatToken;
                int i420 = this.serializer;
                objArr182[i420] = objArr182[59];
                objArr182[i420 + 1] = objArr182[58];
                this.serializer = i420 + 3;
                objArr182[i420 + 2] = objArr182[56];
                return 0;
            case 322:
                Object[] objArr183 = this.MediaSessionCompatToken;
                int i421 = this.serializer;
                this.serializer = i421 + 1;
                objArr183[i421] = objArr183[57];
                return 0;
            case 323:
                Object[] objArr184 = this.MediaSessionCompatToken;
                int i422 = this.serializer;
                this.serializer = i422 + 1;
                objArr184[i422] = objArr184[64];
                return 0;
            case 324:
                Object[] objArr185 = this.MediaSessionCompatToken;
                int i423 = this.serializer;
                objArr185[i423] = objArr185[69];
                this.serializer = i423 + 2;
                objArr185[i423 + 1] = objArr185[55];
                return 0;
            case 325:
                Object[] objArr186 = this.MediaSessionCompatToken;
                int i424 = this.serializer;
                objArr186[i424] = objArr186[36];
                objArr186[i424 + 1] = objArr186[67];
                this.serializer = i424 + 3;
                objArr186[i424 + 2] = objArr186[65];
                return 0;
            case 326:
                Object[] objArr187 = this.MediaSessionCompatToken;
                int i425 = this.serializer;
                objArr187[i425] = objArr187[63];
                this.serializer = i425 + 2;
                objArr187[i425 + 1] = objArr187[34];
                return 0;
            case 327:
                Object[] objArr188 = this.MediaSessionCompatToken;
                int i426 = this.serializer;
                objArr188[i426] = objArr188[39];
                objArr188[i426 + 1] = objArr188[41];
                int[] iArr164 = this.MediaMetadataCompat;
                this.serializer = i426 + 3;
                iArr164[i426 + 2] = 0;
                return 0;
            case 328:
                int[] iArr165 = this.MediaMetadataCompat;
                int i427 = this.serializer;
                iArr165[i427] = 4160;
                this.serializer = i427 + 2;
                iArr165[i427 + 1] = 0;
                return 0;
            case 329:
                int[] iArr166 = this.MediaMetadataCompat;
                int i428 = this.serializer;
                this.serializer = i428 + 1;
                iArr166[i428] = 107;
                return 0;
            case 330:
                int[] iArr167 = this.MediaMetadataCompat;
                int i429 = this.serializer;
                iArr167[i429] = 99;
                iArr167[i429 - 1] = iArr167[i429 - 1] + iArr167[i429];
                this.serializer = i429 + 1;
                iArr167[i429] = iArr167[i429 - 1];
                return 0;
            case 331:
                int[] iArr168 = this.MediaMetadataCompat;
                int i430 = this.serializer;
                iArr168[i430] = 21;
                this.serializer = i430;
                iArr168[i430 - 1] = iArr168[i430 - 1] + iArr168[i430];
                return 0;
            case 332:
                int[] iArr169 = this.MediaMetadataCompat;
                int i431 = this.serializer;
                iArr169[i431] = 117;
                iArr169[i431 - 1] = iArr169[i431 - 1] + iArr169[i431];
                this.serializer = i431 + 1;
                iArr169[i431] = iArr169[i431 - 1];
                return 0;
            case 333:
                int[] iArr170 = this.MediaMetadataCompat;
                int i432 = this.serializer;
                iArr170[i432] = 3;
                iArr170[i432 + 1] = 0;
                int i433 = i432 + 1;
                this.serializer = i433;
                iArr170[i432] = iArr170[i432] / iArr170[i433];
                return 0;
            case 334:
                int[] iArr171 = this.MediaMetadataCompat;
                int i434 = this.serializer;
                iArr171[i434] = 91;
                this.serializer = i434;
                iArr171[i434 - 1] = iArr171[i434 - 1] + iArr171[i434];
                return 0;
            case 335:
                int[] iArr172 = this.MediaMetadataCompat;
                int i435 = this.serializer;
                iArr172[i435] = 63;
                iArr172[i435 - 1] = iArr172[i435 - 1] + iArr172[i435];
                this.serializer = i435 + 1;
                iArr172[i435] = iArr172[i435 - 1];
                return 0;
            case 336:
                Object[] objArr189 = this.MediaSessionCompatToken;
                int i436 = this.serializer;
                objArr189[i436] = objArr189[41];
                this.serializer = i436 + 2;
                objArr189[i436 + 1] = objArr189[63];
                return 0;
            case 337:
                int[] iArr173 = this.MediaMetadataCompat;
                int i437 = this.serializer;
                iArr173[i437] = 55;
                this.serializer = i437 + 2;
                iArr173[i437 + 1] = 0;
                return 0;
            case 338:
                int[] iArr174 = this.MediaMetadataCompat;
                int i438 = this.serializer;
                iArr174[i438] = 21;
                iArr174[i438 - 1] = iArr174[i438 - 1] + iArr174[i438];
                this.serializer = i438 + 1;
                iArr174[i438] = iArr174[i438 - 1];
                return 0;
            case 339:
                int[] iArr175 = this.MediaMetadataCompat;
                int i439 = this.serializer;
                this.serializer = i439 + 1;
                iArr175[i439] = 54;
                return 0;
            case 340:
                int[] iArr176 = this.MediaMetadataCompat;
                int i440 = this.serializer;
                this.serializer = i440 + 1;
                iArr176[i440] = 90;
                return 0;
            case 341:
                int[] iArr177 = this.MediaMetadataCompat;
                int i441 = this.serializer;
                this.serializer = i441 + 1;
                iArr177[i441] = 28;
                return 0;
            case 342:
                int[] iArr178 = this.MediaMetadataCompat;
                int i442 = this.serializer;
                this.serializer = i442 + 1;
                iArr178[i442] = 10;
                return 0;
            case 343:
                int[] iArr179 = this.MediaMetadataCompat;
                int i443 = this.serializer;
                this.serializer = i443 + 1;
                iArr179[i443] = 40;
                return 0;
            case 344:
                int[] iArr180 = this.MediaMetadataCompat;
                int i444 = this.serializer;
                iArr180[i444] = 103;
                this.serializer = i444;
                iArr180[i444 - 1] = iArr180[i444 - 1] + iArr180[i444];
                return 0;
            case 345:
                int[] iArr181 = this.MediaMetadataCompat;
                int i445 = this.serializer;
                iArr181[i445] = 5;
                iArr181[i445 - 1] = iArr181[i445 - 1] + iArr181[i445];
                this.serializer = i445 + 1;
                iArr181[i445] = iArr181[i445 - 1];
                return 0;
            case 346:
                int[] iArr182 = this.MediaMetadataCompat;
                int i446 = this.serializer;
                this.serializer = i446 + 1;
                iArr182[i446] = 25;
                return 0;
            case 347:
                int[] iArr183 = this.MediaMetadataCompat;
                int i447 = this.serializer;
                iArr183[i447] = 28;
                this.serializer = i447 + 2;
                iArr183[i447 + 1] = 0;
                return 0;
            case 348:
                int[] iArr184 = this.MediaMetadataCompat;
                int i448 = this.serializer;
                this.serializer = i448 + 1;
                iArr184[i448] = 61;
                return 0;
            case 349:
                int[] iArr185 = this.MediaMetadataCompat;
                int i449 = this.serializer;
                iArr185[i449] = 111;
                iArr185[i449 - 1] = iArr185[i449 - 1] + iArr185[i449];
                this.serializer = i449 + 1;
                iArr185[i449] = iArr185[i449 - 1];
                return 0;
            case 350:
                Object[] objArr190 = this.MediaSessionCompatToken;
                int i450 = this.serializer;
                objArr190[i450] = null;
                int[] iArr186 = this.MediaMetadataCompat;
                this.serializer = i450 + 2;
                iArr186[i450 + 1] = 0;
                return 0;
            case 351:
                int[] iArr187 = this.MediaMetadataCompat;
                int i451 = this.serializer;
                iArr187[i451] = 17;
                iArr187[i451 - 1] = iArr187[i451 - 1] + iArr187[i451];
                this.serializer = i451 + 1;
                iArr187[i451] = iArr187[i451 - 1];
                return 0;
            case 352:
                int[] iArr188 = this.MediaMetadataCompat;
                int i452 = this.serializer;
                iArr188[i452] = 87;
                this.serializer = i452;
                iArr188[i452 - 1] = iArr188[i452 - 1] + iArr188[i452];
                return 0;
            case 353:
                Object[] objArr191 = this.MediaSessionCompatToken;
                int i453 = this.serializer;
                objArr191[i453] = objArr191[34];
                objArr191[i453 + 1] = null;
                this.serializer = i453 + 3;
                objArr191[i453 + 2] = null;
                return 0;
            case 354:
                int[] iArr189 = this.MediaMetadataCompat;
                int i454 = this.serializer;
                this.serializer = i454 + 1;
                iArr189[i454] = 110;
                return 0;
            case 355:
                int[] iArr190 = this.MediaMetadataCompat;
                int i455 = this.serializer;
                this.serializer = i455 + 1;
                iArr190[i455] = 94;
                return 0;
            case 356:
                int[] iArr191 = this.MediaMetadataCompat;
                int i456 = this.serializer;
                this.serializer = i456 + 1;
                iArr191[i456] = 64;
                return 0;
            case 357:
                int i457 = this.serializer;
                int i458 = i457 - 1;
                Object[] objArr192 = this.MediaSessionCompatToken;
                Object obj109 = objArr192[i458];
                objArr192[i458] = null;
                objArr192[34] = obj109;
                objArr192[i458] = obj109;
                this.serializer = i457 + 1;
                objArr192[i457] = objArr192[35];
                return 0;
            case 358:
                int[] iArr192 = this.MediaMetadataCompat;
                int i459 = this.serializer;
                this.serializer = i459 + 1;
                iArr192[i459] = 95;
                return 0;
            case 359:
                int[] iArr193 = this.MediaMetadataCompat;
                int i460 = this.serializer;
                iArr193[i460] = 105;
                iArr193[i460 - 1] = iArr193[i460 - 1] + iArr193[i460];
                this.serializer = i460 + 1;
                iArr193[i460] = iArr193[i460 - 1];
                return 0;
            case 360:
                int[] iArr194 = this.MediaMetadataCompat;
                int i461 = this.serializer;
                iArr194[i461] = 37;
                iArr194[i461 - 1] = iArr194[i461 - 1] + iArr194[i461];
                this.serializer = i461 + 1;
                iArr194[i461] = iArr194[i461 - 1];
                return 0;
            case 361:
                int[] iArr195 = this.MediaMetadataCompat;
                int i462 = this.serializer;
                iArr195[i462] = 90;
                this.serializer = i462 + 2;
                iArr195[i462 + 1] = 0;
                return 0;
            case 362:
                int i463 = this.serializer;
                int i464 = i463 - 1;
                this.serializer = i464;
                int[] iArr196 = this.MediaMetadataCompat;
                iArr196[i463 - 2] = iArr196[i463 - 2] / iArr196[i464];
                int i465 = i463 - 2;
                this.serializer = i465;
                this.MediaSessionCompatToken[i465] = null;
                return 0;
            case 363:
                int i466 = this.serializer;
                int i467 = i466 - 1;
                Object[] objArr193 = this.MediaSessionCompatToken;
                objArr193[i467] = null;
                this.serializer = i466;
                objArr193[i467] = objArr193[36];
                return 0;
            case 364:
                int[] iArr197 = this.MediaMetadataCompat;
                int i468 = this.serializer;
                iArr197[i468] = 101;
                iArr197[i468 - 1] = iArr197[i468 - 1] + iArr197[i468];
                this.serializer = i468 + 1;
                iArr197[i468] = iArr197[i468 - 1];
                return 0;
            case 365:
                int[] iArr198 = this.MediaMetadataCompat;
                int i469 = this.serializer;
                iArr198[i469] = 85;
                this.serializer = i469;
                iArr198[i469 - 1] = iArr198[i469 - 1] + iArr198[i469];
                return 0;
            case 366:
                int[] iArr199 = this.MediaMetadataCompat;
                int i470 = this.serializer;
                iArr199[i470] = 61;
                iArr199[i470 - 1] = iArr199[i470 - 1] + iArr199[i470];
                this.serializer = i470 + 1;
                iArr199[i470] = iArr199[i470 - 1];
                return 0;
            case 367:
                int[] iArr200 = this.MediaMetadataCompat;
                int i471 = this.serializer;
                iArr200[i471] = 13;
                this.serializer = i471;
                iArr200[i471 - 1] = iArr200[i471 - 1] + iArr200[i471];
                return 0;
            case 368:
                int[] iArr201 = this.MediaMetadataCompat;
                int i472 = this.serializer;
                iArr201[i472] = 57;
                this.serializer = i472;
                iArr201[i472 - 1] = iArr201[i472 - 1] + iArr201[i472];
                return 0;
            case 369:
                int[] iArr202 = this.MediaMetadataCompat;
                int i473 = this.serializer;
                this.serializer = i473 + 1;
                iArr202[i473] = 3;
                return 0;
            case 370:
                int[] iArr203 = this.MediaMetadataCompat;
                int i474 = this.serializer;
                this.serializer = i474 + 1;
                iArr203[i474] = 86;
                return 0;
            case 371:
                int[] iArr204 = this.MediaMetadataCompat;
                int i475 = this.serializer;
                this.serializer = i475 + 1;
                iArr204[i475] = 70;
                return 0;
            case 372:
                int[] iArr205 = this.MediaMetadataCompat;
                int i476 = this.serializer;
                iArr205[i476] = 93;
                this.serializer = i476;
                iArr205[i476 - 1] = iArr205[i476 - 1] + iArr205[i476];
                return 0;
            case 373:
                int[] iArr206 = this.MediaMetadataCompat;
                int i477 = this.serializer;
                iArr206[i477] = 63;
                this.serializer = i477;
                iArr206[i477 - 1] = iArr206[i477 - 1] + iArr206[i477];
                return 0;
            case 374:
                int[] iArr207 = this.MediaMetadataCompat;
                int i478 = this.serializer;
                this.serializer = i478 + 1;
                iArr207[i478] = 9;
                return 0;
            case 375:
                int[] iArr208 = this.MediaMetadataCompat;
                int i479 = this.serializer;
                this.serializer = i479 + 1;
                iArr208[i479] = 53;
                return 0;
            case 376:
                int[] iArr209 = this.MediaMetadataCompat;
                int i480 = this.serializer;
                iArr209[i480] = 81;
                this.serializer = i480;
                iArr209[i480 - 1] = iArr209[i480 - 1] + iArr209[i480];
                return 0;
            case 377:
                int[] iArr210 = this.MediaMetadataCompat;
                int i481 = this.serializer;
                this.serializer = i481 + 1;
                iArr210[i481] = 14;
                return 0;
            case 378:
                int[] iArr211 = this.MediaMetadataCompat;
                int i482 = this.serializer;
                iArr211[i482] = 97;
                this.serializer = i482;
                iArr211[i482 - 1] = iArr211[i482 - 1] + iArr211[i482];
                return 0;
            case 379:
                int[] iArr212 = this.MediaMetadataCompat;
                int i483 = this.serializer;
                iArr212[i483] = 61;
                this.serializer = i483 + 2;
                iArr212[i483 + 1] = 0;
                return 0;
            case 380:
                int[] iArr213 = this.MediaMetadataCompat;
                int i484 = this.serializer;
                this.serializer = i484 + 1;
                iArr213[i484] = 72;
                return 0;
            case 381:
                int[] iArr214 = this.MediaMetadataCompat;
                int i485 = this.serializer;
                this.serializer = i485 + 1;
                iArr214[i485] = 0;
                return 0;
            case 382:
                int[] iArr215 = this.MediaMetadataCompat;
                int i486 = this.serializer;
                iArr215[i486] = 41;
                this.serializer = i486;
                iArr215[i486 - 1] = iArr215[i486 - 1] + iArr215[i486];
                return 0;
            case 383:
                int[] iArr216 = this.MediaMetadataCompat;
                int i487 = this.serializer;
                iArr216[i487] = 23;
                this.serializer = i487;
                iArr216[i487 - 1] = iArr216[i487 - 1] + iArr216[i487];
                return 0;
            case 384:
                int[] iArr217 = this.MediaMetadataCompat;
                int i488 = this.serializer;
                iArr217[i488] = 123;
                iArr217[i488 - 1] = iArr217[i488 - 1] + iArr217[i488];
                this.serializer = i488 + 1;
                iArr217[i488] = iArr217[i488 - 1];
                return 0;
            case 385:
                int[] iArr218 = this.MediaMetadataCompat;
                int i489 = this.serializer;
                this.serializer = i489 + 1;
                iArr218[i489] = 8;
                return 0;
            case 386:
                int[] iArr219 = this.MediaMetadataCompat;
                int i490 = this.serializer;
                this.serializer = i490 + 1;
                iArr219[i490] = 42;
                return 0;
            case 387:
                int[] iArr220 = this.MediaMetadataCompat;
                int i491 = this.serializer;
                iArr220[i491] = 51;
                iArr220[i491 - 1] = iArr220[i491 - 1] + iArr220[i491];
                this.serializer = i491 + 1;
                iArr220[i491] = iArr220[i491 - 1];
                return 0;
            case 388:
                int[] iArr221 = this.MediaMetadataCompat;
                int i492 = this.serializer;
                iArr221[i492] = 20;
                iArr221[i492 + 1] = 0;
                int i493 = i492 + 1;
                this.serializer = i493;
                iArr221[i492] = iArr221[i492] / iArr221[i493];
                return 0;
            case 389:
                int[] iArr222 = this.MediaMetadataCompat;
                int i494 = this.serializer;
                iArr222[i494] = 29;
                this.serializer = i494;
                iArr222[i494 - 1] = iArr222[i494 - 1] + iArr222[i494];
                return 0;
            case 390:
                int[] iArr223 = this.MediaMetadataCompat;
                int i495 = this.serializer;
                iArr223[i495] = 47;
                iArr223[i495 - 1] = iArr223[i495 - 1] + iArr223[i495];
                this.serializer = i495 + 1;
                iArr223[i495] = iArr223[i495 - 1];
                return 0;
            case 391:
                int[] iArr224 = this.MediaMetadataCompat;
                int i496 = this.serializer;
                this.serializer = i496 + 1;
                iArr224[i496] = 47;
                return 0;
            case 392:
                int[] iArr225 = this.MediaMetadataCompat;
                int i497 = this.serializer;
                this.serializer = i497 + 1;
                iArr225[i497] = 68;
                return 0;
            case 393:
                int[] iArr226 = this.MediaMetadataCompat;
                int i498 = this.serializer;
                iArr226[i498] = 117;
                this.serializer = i498;
                iArr226[i498 - 1] = iArr226[i498 - 1] + iArr226[i498];
                return 0;
            case 394:
                int[] iArr227 = this.MediaMetadataCompat;
                int i499 = this.serializer;
                iArr227[i499] = 37;
                this.serializer = i499;
                iArr227[i499 - 1] = iArr227[i499 - 1] + iArr227[i499];
                return 0;
            case 395:
                int[] iArr228 = this.MediaMetadataCompat;
                int i500 = this.serializer;
                iArr228[i500] = 1;
                this.serializer = i500;
                iArr228[i500 - 1] = iArr228[i500 - 1] + iArr228[i500];
                return 0;
            case 396:
                int[] iArr229 = this.MediaMetadataCompat;
                int i501 = this.serializer;
                iArr229[i501] = 35;
                this.serializer = i501;
                iArr229[i501 - 1] = iArr229[i501 - 1] + iArr229[i501];
                return 0;
            case 397:
                int[] iArr230 = this.MediaMetadataCompat;
                int i502 = this.serializer;
                this.serializer = i502 + 1;
                iArr230[i502] = 67;
                return 0;
            case 398:
                int[] iArr231 = this.MediaMetadataCompat;
                int i503 = this.serializer;
                iArr231[i503] = 53;
                this.serializer = i503;
                iArr231[i503 - 1] = iArr231[i503 - 1] + iArr231[i503];
                return 0;
            case 399:
                int[] iArr232 = this.MediaMetadataCompat;
                int i504 = this.serializer;
                iArr232[i504] = 121;
                iArr232[i504 - 1] = iArr232[i504 - 1] + iArr232[i504];
                this.serializer = i504 + 1;
                iArr232[i504] = iArr232[i504 - 1];
                return 0;
            case 400:
                int[] iArr233 = this.MediaMetadataCompat;
                int i505 = this.serializer;
                iArr233[i505] = 42;
                iArr233[i505 + 1] = 0;
                int i506 = i505 + 1;
                this.serializer = i506;
                iArr233[i505] = iArr233[i505] / iArr233[i506];
                return 0;
            case Constant.ERROR_ALGO_NULL_RESULT /* 401 */:
                int[] iArr234 = this.MediaMetadataCompat;
                int i507 = this.serializer;
                this.serializer = i507 + 1;
                iArr234[i507] = 55;
                return 0;
            case Constant.ERROR_ALGO_NOT_START /* 402 */:
                int[] iArr235 = this.MediaMetadataCompat;
                int i508 = this.serializer;
                this.serializer = i508 + 1;
                iArr235[i508] = 88;
                return 0;
            case 403:
                int[] iArr236 = this.MediaMetadataCompat;
                int i509 = this.serializer;
                iArr236[i509] = 29;
                iArr236[i509 - 1] = iArr236[i509 - 1] + iArr236[i509];
                this.serializer = i509 + 1;
                iArr236[i509] = iArr236[i509 - 1];
                return 0;
            case 404:
                int[] iArr237 = this.MediaMetadataCompat;
                int i510 = this.serializer;
                this.serializer = i510 + 1;
                iArr237[i510] = 105;
                return 0;
            case 405:
                int[] iArr238 = this.MediaMetadataCompat;
                int i511 = this.serializer;
                iArr238[i511] = 107;
                this.serializer = i511;
                iArr238[i511 - 1] = iArr238[i511 - 1] + iArr238[i511];
                return 0;
            case 406:
                int[] iArr239 = this.MediaMetadataCompat;
                int i512 = this.serializer;
                iArr239[i512] = 107;
                iArr239[i512 - 1] = iArr239[i512 - 1] + iArr239[i512];
                this.serializer = i512 + 1;
                iArr239[i512] = iArr239[i512 - 1];
                return 0;
            case 407:
                int[] iArr240 = this.MediaMetadataCompat;
                int i513 = this.serializer;
                this.serializer = i513 + 1;
                iArr240[i513] = 66;
                return 0;
            case 408:
                int[] iArr241 = this.MediaMetadataCompat;
                int i514 = this.serializer;
                this.serializer = i514 + 1;
                iArr241[i514] = 30;
                return 0;
            case 409:
                int[] iArr242 = this.MediaMetadataCompat;
                int i515 = this.serializer;
                this.serializer = i515 + 1;
                iArr242[i515] = 78;
                return 0;
            case 410:
                int[] iArr243 = this.MediaMetadataCompat;
                int i516 = this.serializer;
                this.serializer = i516 + 1;
                iArr243[i516] = 93;
                return 0;
            case 411:
                int[] iArr244 = this.MediaMetadataCompat;
                int i517 = this.serializer;
                this.serializer = i517 + 1;
                iArr244[i517] = 119;
                return 0;
            case 412:
                int[] iArr245 = this.MediaMetadataCompat;
                int i518 = this.serializer;
                iArr245[i518] = 49;
                this.serializer = i518;
                iArr245[i518 - 1] = iArr245[i518 - 1] + iArr245[i518];
                return 0;
            case 413:
                int[] iArr246 = this.MediaMetadataCompat;
                int i519 = this.serializer;
                iArr246[i519] = 79;
                iArr246[i519 - 1] = iArr246[i519 - 1] + iArr246[i519];
                this.serializer = i519 + 1;
                iArr246[i519] = iArr246[i519 - 1];
                return 0;
            case 414:
                int[] iArr247 = this.MediaMetadataCompat;
                int i520 = this.serializer;
                iArr247[i520] = 43;
                iArr247[i520 - 1] = iArr247[i520 - 1] + iArr247[i520];
                this.serializer = i520 + 1;
                iArr247[i520] = iArr247[i520 - 1];
                return 0;
            case 415:
                int i521 = this.serializer;
                int i522 = i521 - 1;
                Object[] objArr194 = this.MediaSessionCompatToken;
                Object obj110 = objArr194[i522];
                objArr194[i522] = null;
                objArr194[37] = obj110;
                objArr194[i522] = objArr194[35];
                this.serializer = i521 + 1;
                objArr194[i521] = objArr194[37];
                return 0;
            case 416:
                int[] iArr248 = this.MediaMetadataCompat;
                int i523 = this.serializer;
                iArr248[i523] = 47;
                iArr248[i523 + 1] = 0;
                int i524 = i523 + 1;
                this.serializer = i524;
                iArr248[i523] = iArr248[i523] / iArr248[i524];
                return 0;
            case 417:
                int[] iArr249 = this.MediaMetadataCompat;
                int i525 = this.serializer;
                iArr249[i525] = 95;
                iArr249[i525 - 1] = iArr249[i525 - 1] + iArr249[i525];
                this.serializer = i525 + 1;
                iArr249[i525] = iArr249[i525 - 1];
                return 0;
            case 418:
                int[] iArr250 = this.MediaMetadataCompat;
                int i526 = this.serializer;
                this.serializer = i526 + 1;
                iArr250[i526] = 2;
                return 0;
            case 419:
                int[] iArr251 = this.MediaMetadataCompat;
                int i527 = this.serializer;
                this.serializer = i527 + 1;
                iArr251[i527] = 4;
                return 0;
            default:
                return i;
        }
    }

    public CurrentThreadIdKt(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, Object obj5) {
        int[] iArr = new int[70];
        this.MediaMetadataCompat = iArr;
        this.RatingCompat = new long[70];
        this.MediaDescriptionCompat = new float[70];
        this.MediaSessionCompatQueueItem = new double[70];
        Object[] objArr = new Object[70];
        this.MediaSessionCompatToken = objArr;
        objArr[34] = obj;
        objArr[35] = obj2;
        objArr[36] = obj3;
        objArr[37] = obj4;
        iArr[38] = i;
        iArr[39] = i2;
        objArr[40] = obj5;
        this.serializer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public CurrentThreadIdKt(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        int[] iArr = new int[70];
        this.MediaMetadataCompat = iArr;
        this.RatingCompat = new long[70];
        this.MediaDescriptionCompat = new float[70];
        this.MediaSessionCompatQueueItem = new double[70];
        Object[] objArr = new Object[70];
        this.MediaSessionCompatToken = objArr;
        objArr[34] = obj;
        objArr[35] = obj2;
        objArr[36] = obj3;
        objArr[37] = obj4;
        iArr[38] = i;
        this.serializer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public CurrentThreadIdKt(Object obj, Object obj2, Object obj3, int i) {
        int[] iArr = new int[70];
        this.MediaMetadataCompat = iArr;
        this.RatingCompat = new long[70];
        this.MediaDescriptionCompat = new float[70];
        this.MediaSessionCompatQueueItem = new double[70];
        Object[] objArr = new Object[70];
        this.MediaSessionCompatToken = objArr;
        objArr[34] = obj;
        objArr[35] = obj2;
        objArr[36] = obj3;
        iArr[37] = i;
        this.serializer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public CurrentThreadIdKt(Object obj, Object obj2) {
        this.MediaMetadataCompat = new int[70];
        this.RatingCompat = new long[70];
        this.MediaDescriptionCompat = new float[70];
        this.MediaSessionCompatQueueItem = new double[70];
        Object[] objArr = new Object[70];
        this.MediaSessionCompatToken = objArr;
        objArr[34] = obj;
        objArr[35] = obj2;
        this.serializer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }

    public CurrentThreadIdKt(Object obj) {
        this.MediaMetadataCompat = new int[70];
        this.RatingCompat = new long[70];
        this.MediaDescriptionCompat = new float[70];
        this.MediaSessionCompatQueueItem = new double[70];
        Object[] objArr = new Object[70];
        this.MediaSessionCompatToken = objArr;
        objArr[34] = obj;
        this.serializer = 0;
        this.MediaBrowserCompatMediaItem = -1;
    }
}
