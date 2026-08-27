package com.braze.support;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.t1$$ExternalSyntheticLambda1;
import com.braze.enums.DataStoreKey;
import com.braze.storage.r;
import com.huawei.hms.framework.common.BundleUtil;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import o.ensureSubscribedToInAppMessageEvents;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class StringUtils {
    public static final String CACHE_SUFFIX_PREFERENCES_FILE = "com.appboy.support.stringutils.cachefilesuffix";
    public static final String MD5_HASH_OF_THE_STRING_NULL = "37a6259cc0c1dae299a7866489dff0bd";
    private static final String NULL_USER_ID_SUBSTITUTE_STRING = "null";
    public static final String SUFFIX_CACHE_USER_ID_HASH_VALUE = "user_id_hash_value";
    public static final String SUFFIX_CACHE_USER_ID_KEY = "user_id_key";
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("StringUtils");

    public static /* synthetic */ void getCACHE_SUFFIX_PREFERENCES_FILE$annotations() {
    }

    public static /* synthetic */ void getMD5_HASH_OF_THE_STRING_NULL$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_HASH_VALUE$annotations() {
    }

    public static /* synthetic */ void getSUFFIX_CACHE_USER_ID_KEY$annotations() {
    }

    public static final String getCacheFileSuffix(Context context, String str, String str2) throws NoSuchAlgorithmException {
        context.getClass();
        String str3 = str == null ? NULL_USER_ID_SUBSTITUTE_STRING : str;
        if (str3.equals(NULL_USER_ID_SUBSTITUTE_STRING)) {
            return getSuffixFromUserIdHashAndApiKey(MD5_HASH_OF_THE_STRING_NULL, str2);
        }
        r rVar = new r(context);
        DataStoreKey dataStoreKey = DataStoreKey.SUFFIX_CACHE_USER_ID_KEY;
        String string = rVar.readString(dataStoreKey, null);
        if (string != null && string.equals(str3)) {
            String string2 = rVar.readString(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, null);
            if (string2 != null && string2.length() != 0) {
                return getSuffixFromUserIdHashAndApiKey(string2, str2);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(23), 14, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new t1$$ExternalSyntheticLambda1(str3, str2, 4), 12, (Object) null);
        String md5Hash = getMd5Hash(str3);
        rVar.writeData(dataStoreKey, str3);
        rVar.writeData(DataStoreKey.SUFFIX_CACHE_USER_ID_HASH, md5Hash);
        return getSuffixFromUserIdHashAndApiKey(md5Hash, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$0() {
        return "The saved user id hash was null or empty.";
    }

    private static final String getSuffixFromUserIdHashAndApiKey(String str, String str2) {
        return (str2 == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) ? r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(".", str) : af$$ExternalSyntheticOutline0.m(".", str, ".", str2);
    }

    public static final boolean isBlank(String str) {
        if (str != null) {
            return hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
        }
        return false;
    }

    public static final boolean isNullOrBlank(String str) {
        return str == null || hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str);
    }

    public static final boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static final int countOccurrences(String str, String str2) {
        str.getClass();
        str2.getClass();
        return hideCurrentlyDisplayingInAppMessage.serializer(str, new String[]{str2}, 6).size() - 1;
    }

    public static final String emptyToNull(String str) {
        str.getClass();
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            return null;
        }
        return str;
    }

    public static final long getByteSize(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        return bytes.length;
    }

    public static final String truncateToByteLength(String str, int i) {
        str.getClass();
        if (getByteSize(str) <= i) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        charArray.getClass();
        int byteSize = 0;
        for (char c : charArray) {
            byteSize += (int) getByteSize(String.valueOf(c));
            if (byteSize > i) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCacheFileSuffix$lambda$1(String str, String str2) {
        return af$$ExternalSyntheticOutline0.m("Generating MD5 for user id: ", str, " apiKey: ", str2);
    }

    public static final String getMd5Hash(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(ensureSubscribedToInAppMessageEvents.write);
        bytes.getClass();
        return String.format(Locale.US, "%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest(bytes))}, 1));
    }

    public static final void ifNonEmpty(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(str);
    }

    public static final String getCacheMapKey(String str, String str2) {
        str2.getClass();
        return str == null ? str2 : af$$ExternalSyntheticOutline0.m(str, BundleUtil.UNDERLINE_TAG, str2);
    }

    public static final String getCacheFileSuffix(Context context, String str) {
        context.getClass();
        return getCacheFileSuffix(context, str, null);
    }
}
