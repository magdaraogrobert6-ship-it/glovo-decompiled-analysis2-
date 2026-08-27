package o;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum visitScrollCaptureCandidatesdefault {
    UNKNOWN(GrsBaseInfo.CountryCodeSource.UNKNOWN, GrsBaseInfo.CountryCodeSource.UNKNOWN),
    ECDSA("EC", "SHA256WithECDSA"),
    RSA_SHA256("RSA_SHA256", "SHA256WithRSA"),
    RSA_SHA256_PSS("RSA_SHA256_PSS", "SHA256withRSA/PSS"),
    HMAC_SHA256("HmacSHA256", "HmacSHA256");

    private static final Map<String, String> MAPPING = new HashMap();
    private static final Map<String, visitScrollCaptureCandidatesdefault> PREFERRED_ALGS = new HashMap();
    private final String alg;
    private final String keyType;

    public String getTransformation() {
        return this.alg;
    }

    public static visitScrollCaptureCandidatesdefault getPreferredAlg(String str) {
        return PREFERRED_ALGS.get(str);
    }

    visitScrollCaptureCandidatesdefault(String str, String str2) {
        this.keyType = str;
        this.alg = str2;
    }

    static {
        for (visitScrollCaptureCandidatesdefault visitscrollcapturecandidatesdefault : EnumSet.allOf(visitScrollCaptureCandidatesdefault.class)) {
            MAPPING.put(visitscrollcapturecandidatesdefault.keyType, visitscrollcapturecandidatesdefault.alg);
        }
        Map<String, visitScrollCaptureCandidatesdefault> map = PREFERRED_ALGS;
        map.put("EC", ECDSA);
        map.put("RSA", RSA_SHA256);
        map.put("HMAC", HMAC_SHA256);
    }
}
