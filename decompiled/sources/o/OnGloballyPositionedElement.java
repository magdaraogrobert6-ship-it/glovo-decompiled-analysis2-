package o;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OnGloballyPositionedElement {
    public static final accessgetApproachSetp RemoteActionCompatParcelizer;

    public static String write(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final getKeyZmokQxo write(isCtrlPressedZmokQxo isctrlpressedzmokqxo, accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp) {
        Object obj = getKeyZmokQxo.PURPOSE_RESTRICTION_UNDEFINED;
        Object obj2 = accessgetlookaheadandancestormeasuresetp.get(isctrlpressedzmokqxo);
        if (obj2 != null) {
            obj = obj2;
        }
        return (getKeyZmokQxo) obj;
    }

    public static final int read(isCtrlPressedZmokQxo isctrlpressedzmokqxo) {
        if (isctrlpressedzmokqxo == isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (isctrlpressedzmokqxo == isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (isctrlpressedzmokqxo == isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return isctrlpressedzmokqxo == isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String write(isCtrlPressedZmokQxo isctrlpressedzmokqxo, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < isctrlpressedzmokqxo.zza()) ? "0" : String.valueOf(str.charAt(isctrlpressedzmokqxo.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= isctrlpressedzmokqxo.zza()) {
            strValueOf = String.valueOf(str2.charAt(isctrlpressedzmokqxo.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean IconCompatParcelizer(isCtrlPressedZmokQxo isctrlpressedzmokqxo, char[] cArr, String str, boolean z) {
        char c;
        int i = read(isctrlpressedzmokqxo);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= isctrlpressedzmokqxo.zza()) {
                char cCharAt = str.charAt(isctrlpressedzmokqxo.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (i > 0 && cArr[i] != '2') {
                    cArr[i] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (i > 0 && cArr[i] != '2') {
            cArr[i] = c;
        }
        return false;
    }

    public static final boolean serializer(isCtrlPressedZmokQxo isctrlpressedzmokqxo, char[] cArr, String str, boolean z) {
        char c;
        int i = read(isctrlpressedzmokqxo);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= isctrlpressedzmokqxo.zza()) {
                char cCharAt = str.charAt(isctrlpressedzmokqxo.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (i > 0 && cArr[i] != '2') {
                    cArr[i] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (i > 0 && cArr[i] != '2') {
            cArr[i] = c;
        }
        return false;
    }

    public static final boolean RemoteActionCompatParcelizer(isCtrlPressedZmokQxo isctrlpressedzmokqxo, accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp, accessgetLookaheadAndAncestorMeasureSetp accessgetlookaheadandancestormeasuresetp2, DepthSortedSetsForDifferentPassesWhenMappings depthSortedSetsForDifferentPassesWhenMappings, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        char c;
        OnFirstVisibleNoderectChanged1 onFirstVisibleNoderectChanged1;
        int i4 = read(isctrlpressedzmokqxo);
        if (i4 > 0 && (i2 != 1 || i != 1)) {
            cArr[i4] = '2';
        }
        if (write(isctrlpressedzmokqxo, accessgetlookaheadandancestormeasuresetp2) == getKeyZmokQxo.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (isctrlpressedzmokqxo == isCtrlPressedZmokQxo.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && depthSortedSetsForDifferentPassesWhenMappings.serializer.equals(str)) {
                if (i4 > 0 && cArr[i4] != '2') {
                    cArr[i4] = '1';
                }
                return true;
            }
            if (accessgetlookaheadandancestormeasuresetp.containsKey(isctrlpressedzmokqxo) && (onFirstVisibleNoderectChanged1 = (OnFirstVisibleNoderectChanged1) accessgetlookaheadandancestormeasuresetp.get(isctrlpressedzmokqxo)) != null) {
                int iOrdinal = onFirstVisibleNoderectChanged1.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return write(isctrlpressedzmokqxo, accessgetlookaheadandancestormeasuresetp2) == getKeyZmokQxo.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? IconCompatParcelizer(isctrlpressedzmokqxo, cArr, str3, z2) : serializer(isctrlpressedzmokqxo, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return write(isctrlpressedzmokqxo, accessgetlookaheadandancestormeasuresetp2) == getKeyZmokQxo.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? serializer(isctrlpressedzmokqxo, cArr, str2, z) : IconCompatParcelizer(isctrlpressedzmokqxo, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (write(isctrlpressedzmokqxo, accessgetlookaheadandancestormeasuresetp2) != getKeyZmokQxo.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return IconCompatParcelizer(isctrlpressedzmokqxo, cArr, str3, z2);
                    }
                } else if (write(isctrlpressedzmokqxo, accessgetlookaheadandancestormeasuresetp2) != getKeyZmokQxo.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return serializer(isctrlpressedzmokqxo, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (i4 <= 0 || cArr[i4] == '2') {
            return false;
        }
        cArr[i4] = c;
        return false;
    }

    static {
        DepthSortedSet depthSortedSet = delegateUnprotectedui.write;
        Object[] objArr = new Object[24];
        objArr[0] = "Version";
        objArr[1] = "GoogleConsent";
        objArr[2] = "VendorConsent";
        objArr[3] = "VendorLegitimateInterest";
        objArr[4] = "gdprApplies";
        objArr[5] = "EnableAdvertiserConsentMode";
        objArr[6] = "PolicyVersion";
        objArr[7] = "PurposeConsents";
        objArr[8] = "PurposeOneTreatment";
        objArr[9] = "Purpose1";
        objArr[10] = "Purpose3";
        objArr[11] = "Purpose4";
        System.arraycopy(new String[]{"Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics"}, 0, objArr, 12, 12);
        coil3.util.ContextsKt.serializer(24, objArr);
        RemoteActionCompatParcelizer = delegateUnprotectedui.IconCompatParcelizer(24, objArr);
    }
}
