package com.incognia.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import o.accessgetInstancedelegatecp;
import o.onContentCardClicked;
import o.onContentCardDismissed;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Jpu {
    public final HlS BGx;
    public final mAX HQ;
    public final mAX N;
    public final NvL mbG;
    public static final String x = (String) W4i.Qd.MediaSessionCompatResultReceiverWrapper();
    public static final long hIl = 60000;
    public static final String hs = (String) W4i.Cp.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.lK.MediaSessionCompatResultReceiverWrapper();

    public final String BGx(boolean z) {
        X509Certificate x509Certificate;
        byte[] extensionValue;
        mAX max = z ? this.N : this.HQ;
        if (!max.BGx()) {
            return (String) max.N;
        }
        String str = x + UUID.randomUUID();
        UUID uuidRandomUUID = UUID.randomUUID();
        UUID uuidFromString = UUID.fromString((String) g2.BGx.MediaSessionCompatResultReceiverWrapper());
        UUID uuidFromString2 = UUID.fromString(AUn.BGx());
        try {
            ArrayList arrayListBGx = BGx(str, onContentCardClicked.serializer(onContentCardClicked.serializer(onContentCardClicked.serializer(ByteBuffer.allocate(16).putLong(uuidRandomUUID.getMostSignificantBits()).putLong(uuidRandomUUID.getLeastSignificantBits()).array(), ByteBuffer.allocate(16).putLong(uuidFromString.getMostSignificantBits()).putLong(uuidFromString.getLeastSignificantBits()).array()), ByteBuffer.allocate(16).putLong(uuidFromString2.getMostSignificantBits()).putLong(uuidFromString2.getLeastSignificantBits()).array()), OKg.BGx(System.currentTimeMillis())), z);
            String strHQ = (arrayListBGx == null || (x509Certificate = (X509Certificate) onContentCardDismissed.MediaMetadataCompat((List) arrayListBGx)) == null || (extensionValue = x509Certificate.getExtensionValue((String) W4i.cv.MediaSessionCompatResultReceiverWrapper())) == null) ? null : yEy.HQ(0, extensionValue);
            max.BGx(strHQ);
            return strHQ;
        } catch (Throwable th) {
            max.BGx(null);
            throw th;
        }
    }

    public final ArrayList mbG(boolean z) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String str = x + UUID.randomUUID();
        UUID uuidRandomUUID = UUID.randomUUID();
        UUID uuidFromString = UUID.fromString((String) g2.BGx.MediaSessionCompatResultReceiverWrapper());
        UUID uuidFromString2 = UUID.fromString(AUn.BGx());
        ArrayList arrayListBGx = BGx(str, onContentCardClicked.serializer(onContentCardClicked.serializer(onContentCardClicked.serializer(ByteBuffer.allocate(16).putLong(uuidRandomUUID.getMostSignificantBits()).putLong(uuidRandomUUID.getLeastSignificantBits()).array(), ByteBuffer.allocate(16).putLong(uuidFromString.getMostSignificantBits()).putLong(uuidFromString.getLeastSignificantBits()).array()), ByteBuffer.allocate(16).putLong(uuidFromString2.getMostSignificantBits()).putLong(uuidFromString2.getLeastSignificantBits()).array()), OKg.BGx(System.currentTimeMillis())), z);
        if (arrayListBGx == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListBGx, 10));
        int size = arrayListBGx.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListBGx.get(i);
            i++;
            arrayList.add(yEy.HQ(0, ((X509Certificate) obj).getEncoded()));
        }
        return arrayList;
    }

    public Jpu(HlS hlS, NvL nvL, KWh kWh) {
        this.BGx = hlS;
        this.mbG = nvL;
        long jOptLong = ((JSONObject) nvL.BGx.get()).optLong(hs, hIl);
        this.HQ = new mAX(kWh, jOptLong);
        this.N = new mAX(kWh, jOptLong);
    }

    public final h0 mbG() throws Exception {
        NvL nvL = this.mbG;
        if (!((JSONObject) nvL.BGx.get()).optBoolean(VV3, false)) {
            try {
                return new h0(BGx(false), Boolean.FALSE, null, null, 12);
            } catch (Throwable th) {
                if (th instanceof Exception) {
                    return new h0(null, null, bKM.BGx(th), null, 11);
                }
                throw th;
            }
        }
        try {
            return new h0(BGx(true), Boolean.TRUE, null, null, 12);
        } catch (Throwable th2) {
            if (th2 instanceof Exception) {
                String strBGx = bKM.BGx(th2);
                try {
                    return new h0(BGx(false), Boolean.FALSE, null, strBGx, 4);
                } catch (Throwable th3) {
                    if (th3 instanceof Exception) {
                        return new h0(null, null, bKM.BGx(th3), strBGx, 3);
                    }
                    throw th3;
                }
            }
            throw th2;
        }
    }

    public final jrj BGx() throws Exception {
        NvL nvL = this.mbG;
        if (!((JSONObject) nvL.BGx.get()).optBoolean(VV3, false)) {
            try {
                return new jrj(mbG(false), Boolean.FALSE, null, null, 12);
            } catch (Throwable th) {
                if (th instanceof Exception) {
                    return new jrj(null, Boolean.FALSE, bKM.BGx(th), null, 9);
                }
                throw th;
            }
        }
        try {
            return new jrj(mbG(true), Boolean.TRUE, null, null, 12);
        } catch (Throwable th2) {
            if (th2 instanceof Exception) {
                String strBGx = bKM.BGx(th2);
                try {
                    return new jrj(mbG(false), Boolean.FALSE, null, strBGx, 4);
                } catch (Throwable th3) {
                    if (th3 instanceof Exception) {
                        return new jrj(null, null, bKM.BGx(th3), strBGx, 3);
                    }
                    throw th3;
                }
            }
            throw th2;
        }
    }

    public final ArrayList BGx(String str, byte[] bArr, boolean z) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        List listAsList;
        Certificate[] certificateChain;
        KeyStore keyStore;
        ArrayList arrayList = null;
        if (XUh.BGx(XUh.BGx, 24, 0, 2)) {
            try {
                KeyStore keyStore2 = this.BGx.BGx;
                if (keyStore2 != null) {
                    keyStore2.load(null);
                }
            } catch (Throwable unused) {
            }
            try {
                KeyStore keyStore3 = this.BGx.BGx;
                if (keyStore3 != null && keyStore3.containsAlias(str) && (keyStore = this.BGx.BGx) != null) {
                    keyStore.deleteEntry(str);
                }
            } catch (Throwable unused2) {
            }
            HlS.BGx(str, bArr, z);
            try {
                KeyStore keyStore4 = this.BGx.BGx;
                if (keyStore4 == null || (certificateChain = keyStore4.getCertificateChain(str)) == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(certificateChain);
                    listAsList.getClass();
                }
            } catch (Throwable unused3) {
            }
            try {
                KeyStore keyStore5 = this.BGx.BGx;
                if (keyStore5 != null) {
                    keyStore5.deleteEntry(str);
                }
            } catch (Throwable unused4) {
            }
            if (listAsList != null) {
                arrayList = new ArrayList();
                for (Object obj : listAsList) {
                    if (obj instanceof X509Certificate) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        return arrayList;
    }
}
