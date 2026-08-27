package com.huawei.wisesecurity.ucs.credential.nativelib;

import android.content.Context;
import android.text.TextUtils;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import o.accessgetDropdownListcp;
import o.accessgetSwitchcp;
import o.getSteps;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes2.dex */
public class UcsLib {
    private static final String LIB_NAME = "ucs-credential";
    private static final long NATIVE_VERIFY_SIGNATURE_FAIL = 60000;
    private static final String TAG = "UcsLib";
    private static volatile boolean flag = false;
    private static volatile boolean updateRootKeyFlag = false;
    private static final Charset UTF_8 = StandardCharsets.UTF_8;
    private static final Object CA_LOCK = new Object();

    public static class OutputParam {
        public byte[] bytes = null;
        public byte[] secondBytes = null;
        public byte[] thirdBytes = null;
    }

    private static native long getSoVersion();

    public static boolean isRootKeyUpdated() {
        return updateRootKeyFlag;
    }

    private static native long nativeCheckPkgNameCertFP(Context context, byte[] bArr, byte[] bArr2, OutputParam outputParam);

    private static native long nativeDecryptKek(byte[] bArr, int i, OutputParam outputParam);

    private static native long nativeDecryptKekWithEc(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4, OutputParam outputParam);

    private static native long nativeGenReqJws(Context context, byte[] bArr, byte[] bArr2, long j, byte[] bArr3, OutputParam outputParam);

    private static native long nativeGenerateEcKeyPair(Context context, OutputParam outputParam);

    private static native long nativeGetPkgNameCertFP(Context context, OutputParam outputParam);

    public static long ucsGetSoVersion() {
        return getSoVersion();
    }

    private static native long updateRootKey(byte[] bArr, int i, OutputParam outputParam);

    private static String getErrorMessage(OutputParam outputParam, String str) {
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, ", ");
        byte[] bArr = outputParam.thirdBytes;
        sbM.append(bArr != null ? new String(bArr, StandardCharsets.UTF_8) : "errorLog is null.");
        return sbM.toString();
    }

    public static List<String> getPkgNameCertFP(Context context) throws UcsException {
        ArrayList arrayList = new ArrayList();
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeGetPkgNameCertFP = nativeGetPkgNameCertFP(context, outputParamNewOutputParam);
        if (jNativeGetPkgNameCertFP != 0) {
            String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to getPkgNameCertFP");
            throw accessgetDropdownListcp.IconCompatParcelizer(TAG, errorMessage, new Object[0], jNativeGetPkgNameCertFP, errorMessage);
        }
        byte[] bArr = outputParamNewOutputParam.bytes;
        Charset charset = StandardCharsets.UTF_8;
        arrayList.add(new String(bArr, charset));
        arrayList.add(new String(outputParamNewOutputParam.secondBytes, charset));
        return arrayList;
    }

    public static String loadLibrary() {
        String string;
        synchronized (UcsLib.class) {
            string = "";
            if (!flag) {
                try {
                    System.loadLibrary(LIB_NAME);
                    getSteps.read(TAG, "load lib {0} success", LIB_NAME);
                    flag = true;
                } catch (Throwable th) {
                    StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("load lib ucs-credential error : ");
                    sbIconCompatParcelizer.append(th.getMessage());
                    string = sbIconCompatParcelizer.toString();
                    getSteps.serializer(TAG, string, new Object[0]);
                }
            }
        }
        return string;
    }

    public static OutputParam newOutputParam() {
        return new OutputParam();
    }

    public static void ucsUpdateRootKey(byte[] bArr, int i) throws UcsException {
        synchronized (CA_LOCK) {
            OutputParam outputParamNewOutputParam = newOutputParam();
            long jUpdateRootKey = updateRootKey(bArr, i, outputParamNewOutputParam);
            updateRootKeyFlag = jUpdateRootKey == 0;
            if (jUpdateRootKey != 0) {
                String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to updateRootKey");
                getSteps.serializer(TAG, errorMessage, new Object[0]);
                throw new UcsException(1009L, errorMessage);
            }
        }
    }

    public static void checkNativeLibrary() throws UcsException {
        if (flag) {
            return;
        }
        String strLoadLibrary = loadLibrary();
        if (!flag) {
            throw new UcsException(1004L, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("UCS load library error : ", strLoadLibrary));
        }
    }

    public static byte[] decryptKek(byte[] bArr, int i) throws UcsException {
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeDecryptKek = nativeDecryptKek(bArr, i, outputParamNewOutputParam);
        if (jNativeDecryptKek == 0) {
            return outputParamNewOutputParam.bytes;
        }
        String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to decryptKek");
        throw accessgetDropdownListcp.IconCompatParcelizer(TAG, errorMessage, new Object[0], jNativeDecryptKek, errorMessage);
    }

    public static byte[] genReqJws(Context context, String str, String str2, int i, int i2) throws UcsException {
        String str3;
        String str4 = str == null ? "" : str;
        if (context != null) {
            if (!TextUtils.isEmpty(str2)) {
                OutputParam outputParamNewOutputParam = newOutputParam();
                Charset charset = StandardCharsets.UTF_8;
                long jNativeGenReqJws = nativeGenReqJws(context, str4.getBytes(charset), str2.getBytes(charset), i, String.valueOf(i2).getBytes(charset), outputParamNewOutputParam);
                if (jNativeGenReqJws == 0) {
                    return outputParamNewOutputParam.bytes;
                }
                String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to genReqJws");
                throw accessgetDropdownListcp.IconCompatParcelizer(TAG, errorMessage, new Object[0], jNativeGenReqJws, errorMessage);
            }
            str3 = "packageName cannot empty..";
        } else {
            str3 = "context cannot empty..";
        }
        MapboxMap$$ExternalSyntheticLambda0.m(1001L, str3);
        return null;
    }

    public static EcKeyPair generateEcKeyPair(Context context) throws UcsException {
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeGenerateEcKeyPair = nativeGenerateEcKeyPair(context, outputParamNewOutputParam);
        if (jNativeGenerateEcKeyPair == 0) {
            return EcKeyPair.newBuilder().publicKey(outputParamNewOutputParam.bytes).privateKey(outputParamNewOutputParam.secondBytes).build();
        }
        String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to nativeGenerateEcKeyPair");
        throw accessgetDropdownListcp.IconCompatParcelizer(TAG, errorMessage, new Object[0], jNativeGenerateEcKeyPair, errorMessage);
    }

    public static boolean checkPkgNameCertFP(Context context, String str, String str2, StringBuilder sb) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "appPkgName is null.";
        } else {
            if (!TextUtils.isEmpty(str2)) {
                OutputParam outputParamNewOutputParam = newOutputParam();
                Charset charset = StandardCharsets.UTF_8;
                long jNativeCheckPkgNameCertFP = nativeCheckPkgNameCertFP(context, str.getBytes(charset), str2.getBytes(charset), outputParamNewOutputParam);
                if (jNativeCheckPkgNameCertFP != 0) {
                    sb.append(getErrorMessage(outputParamNewOutputParam, ""));
                }
                return jNativeCheckPkgNameCertFP == 0;
            }
            str3 = "appCertFP is null.";
        }
        sb.append(str3);
        return false;
    }

    public static byte[] decryptKekWithEc(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws UcsException {
        OutputParam outputParamNewOutputParam = newOutputParam();
        long jNativeDecryptKekWithEc = nativeDecryptKekWithEc(bArr, i, bArr2, bArr3, bArr4, outputParamNewOutputParam);
        if (jNativeDecryptKekWithEc == 0) {
            return outputParamNewOutputParam.bytes;
        }
        String errorMessage = getErrorMessage(outputParamNewOutputParam, "Fail to decryptKekWithEc");
        throw accessgetDropdownListcp.IconCompatParcelizer(TAG, errorMessage, new Object[0], jNativeDecryptKekWithEc, errorMessage);
    }
}
