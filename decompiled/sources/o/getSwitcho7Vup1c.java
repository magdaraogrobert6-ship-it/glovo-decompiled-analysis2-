package o;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.wisesecurity.kfs.crypto.key.AESKeyStoreKeyManager;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class getSwitcho7Vup1c {
    public final /* synthetic */ int serializer;

    public /* synthetic */ getSwitcho7Vup1c(int i) {
        this.serializer = i;
    }

    public void read(Credential credential, Context context) {
        byte[] bArrDecryptKekWithEc;
        String kekString = credential.getKekString();
        ConcurrentHashMap concurrentHashMap = getRadioButtono7Vup1c.IconCompatParcelizer;
        if (concurrentHashMap.containsKey(kekString)) {
            return;
        }
        int i = this.serializer;
        if (i == 0) {
            try {
                String[] strArrSplit = credential.getKekString().split(":");
                if (strArrSplit.length < 3) {
                    getSteps.serializer("KeyStoreECIESParseHandler", "EC kek doDecrypt failure. kek string invalid", new Object[0]);
                    throw new UcsException(1020L, "EC kek doDecrypt failure. kek string invalid");
                }
                byte[] bArrIconCompatParcelizer = accessgetButtoncp.IconCompatParcelizer(0, strArrSplit[0]);
                byte[] bArrIconCompatParcelizer2 = accessgetButtoncp.IconCompatParcelizer(0, strArrSplit[1]);
                byte[] bArrIconCompatParcelizer3 = accessgetButtoncp.IconCompatParcelizer(0, strArrSplit[2]);
                EcKeyPair ecKeyPairB = com.huawei.wisesecurity.ucs_credential.n.b(context);
                bArrDecryptKekWithEc = UcsLib.decryptKekWithEc(bArrIconCompatParcelizer3, 1, bArrIconCompatParcelizer, bArrIconCompatParcelizer2, ecKeyPairB.getPrivateKey());
                if (bArrDecryptKekWithEc == null || bArrDecryptKekWithEc.length == 0) {
                    getSteps.serializer("KeyStoreECIESParseHandler", "KeyStore doDecrypt failure.", new Object[0]);
                    throw new UcsException(1020L, "KeyStore doDecrypt failure.");
                }
                com.huawei.wisesecurity.ucs_credential.n.serializer(ecKeyPairB);
            } catch (UcsException e) {
                if (credential.getKekVersion() == 6) {
                    SpUtil.putInt(context, 0, "ucs_ec_keystore_sp_key_t");
                } else {
                    SpUtil.putInt(context, 0, "ucs_ec_huks_sp_key_t");
                }
                StringBuilder sbIconCompatParcelizer = accessgetSwitchcp.IconCompatParcelizer("decrypt kek get exception : ");
                sbIconCompatParcelizer.append(e.getMessage());
                String string = sbIconCompatParcelizer.toString();
                throw accessgetDropdownListcp.IconCompatParcelizer("KeyStoreECIESParseHandler", string, new Object[0], 1020L, string);
            }
        } else if (i != 1) {
            bArrDecryptKekWithEc = UcsLib.decryptKek(credential.getKekBytes(), credential.getAlg());
        } else {
            try {
                if (com.huawei.wisesecurity.ucs_credential.p0.serializer == null) {
                    com.huawei.wisesecurity.ucs_credential.p0.serializer = new AESKeyStoreKeyManager(1);
                }
                bArrDecryptKekWithEc = com.huawei.wisesecurity.ucs_credential.p0.RemoteActionCompatParcelizer.read(credential.getKekBytes());
                if (bArrDecryptKekWithEc == null || bArrDecryptKekWithEc.length == 0) {
                    SpUtil.putInt(context, 0, "ucs_keystore_sp_key_t");
                    getSteps.serializer("KeyStoreParseHandler", "KeyStore doDecrypt failure.", new Object[0]);
                    throw new UcsException(1020L, "KeyStore doDecrypt failure.");
                }
            } catch (Throwable th) {
                SpUtil.putInt(context, 0, "ucs_keystore_sp_key_t");
                String str = "decrypt kek get exception : " + th.getMessage();
                throw accessgetDropdownListcp.IconCompatParcelizer("KeyStoreParseHandler", str, new Object[0], 1020L, str);
            }
        }
        if (TextUtils.isEmpty(kekString) || bArrDecryptKekWithEc == null) {
            throw accessgetDropdownListcp.IconCompatParcelizer("KekStore", "putKek param is null.", new Object[0], 1001L, "putKek param is null.");
        }
        concurrentHashMap.put(kekString, bArrDecryptKekWithEc);
    }

    public static byte[] RemoteActionCompatParcelizer(Credential credential) throws UcsException {
        String kekString = credential.getKekString();
        ConcurrentHashMap concurrentHashMap = getRadioButtono7Vup1c.IconCompatParcelizer;
        if (TextUtils.isEmpty(kekString)) {
            throw accessgetDropdownListcp.IconCompatParcelizer("KekStore", "getKek param is null.", new Object[0], 1001L, "getKek param is null.");
        }
        ConcurrentHashMap concurrentHashMap2 = getRadioButtono7Vup1c.IconCompatParcelizer;
        if (concurrentHashMap2.containsKey(kekString)) {
            return (byte[]) concurrentHashMap2.get(kekString);
        }
        MapboxMap$$ExternalSyntheticLambda0.m(2001L, "kek is empty");
        return null;
    }

    public static getSwitcho7Vup1c read(Credential credential) {
        int kekVersion = credential.getKekVersion();
        if (kekVersion == 3) {
            return new getSwitcho7Vup1c(1);
        }
        if (kekVersion != 6 && kekVersion != 7) {
            return new getSwitcho7Vup1c(2);
        }
        return new getSwitcho7Vup1c(0);
    }
}
