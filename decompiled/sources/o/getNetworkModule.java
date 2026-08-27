package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getNetworkModule extends provideRequest {
    public static final ConcurrentHashMap RemoteActionCompatParcelizer;
    public String read;
    public final byte[] serializer;

    public static getNetworkModule RemoteActionCompatParcelizer(byte[] bArr, boolean z) {
        RemoteActionCompatParcelizer(bArr.length);
        getNetworkModule getnetworkmodule = (getNetworkModule) RemoteActionCompatParcelizer.get(new getClientcustomerchat_release(bArr));
        if (getnetworkmodule != null) {
            return getnetworkmodule;
        }
        if (!Providerclient2.IconCompatParcelizer(bArr)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("invalid OID contents");
            return null;
        }
        if (z) {
            bArr = accessbootstrapIfNeeded.RemoteActionCompatParcelizer(bArr);
        }
        return new getNetworkModule(null, bArr);
    }

    @Override // o.provideRequest
    public final boolean R_() {
        return false;
    }

    public final String read() {
        String str;
        synchronized (this) {
            if (this.read == null) {
                this.read = IconCompatParcelizer(this.serializer);
            }
            str = this.read;
        }
        return str;
    }

    @Override // o.provideRequest
    public final void read(UserAgentHeaderInterceptorKt userAgentHeaderInterceptorKt, boolean z) {
        userAgentHeaderInterceptorKt.read(z, 6, this.serializer);
    }

    public final String toString() {
        return read();
    }

    public final getNetworkModule IconCompatParcelizer(String str) {
        String strM;
        String strSubstring;
        ConcurrentHashMap concurrentHashMap = Providerclient2.read;
        if (str.length() <= 16383) {
            int i = 0;
            if (Providerclient2.write(0, str)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i2 = -1;
                    if (i == -1) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byte[] bArr = this.serializer;
                        RemoteActionCompatParcelizer(bArr.length + byteArray.length);
                        return new getNetworkModule(read() + "." + str, accessbootstrapIfNeeded.read(bArr, byteArray));
                    }
                    if (i == -1) {
                        i2 = i;
                        strSubstring = null;
                    } else {
                        int iIndexOf = str.indexOf(46, i);
                        if (iIndexOf == -1) {
                            strSubstring = str.substring(i);
                        } else {
                            strSubstring = str.substring(i, iIndexOf);
                            i2 = iIndexOf + 1;
                        }
                    }
                    if (strSubstring.length() <= 18) {
                        Providerclient2.write(byteArrayOutputStream, Long.parseLong(strSubstring));
                    } else {
                        Providerclient2.write(byteArrayOutputStream, new BigInteger(strSubstring));
                    }
                    i = i2;
                }
            } else {
                strM = ff$$ExternalSyntheticOutline0.m("string ", str, " not a valid relative OID");
            }
        } else {
            strM = "exceeded relative OID contents length limit";
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(strM);
        return null;
    }

    @Override // o.provideRequest
    public final int RemoteActionCompatParcelizer(boolean z) {
        return UserAgentHeaderInterceptorKt.write(this.serializer.length, z);
    }

    @Override // o.provideRequest, o.getHostAppUserAgent
    public final int hashCode() {
        return accessbootstrapIfNeeded.read(this.serializer);
    }

    public final boolean read(getNetworkModule getnetworkmodule) {
        byte[] bArr = getnetworkmodule.serializer;
        int length = bArr.length;
        byte[] bArr2 = this.serializer;
        if (bArr2.length > length) {
            for (int i = 0; i < length; i++) {
                if (bArr2[i] == bArr[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final getNetworkModule serializer() {
        getNetworkModule getnetworkmodule;
        getClientcustomerchat_release getclientcustomerchat_release = new getClientcustomerchat_release(this.serializer);
        ConcurrentHashMap concurrentHashMap = RemoteActionCompatParcelizer;
        getNetworkModule getnetworkmodule2 = (getNetworkModule) concurrentHashMap.get(getclientcustomerchat_release);
        if (getnetworkmodule2 != null) {
            return getnetworkmodule2;
        }
        synchronized (concurrentHashMap) {
            if (concurrentHashMap.containsKey(getclientcustomerchat_release)) {
                getnetworkmodule = (getNetworkModule) concurrentHashMap.get(getclientcustomerchat_release);
            } else {
                concurrentHashMap.put(getclientcustomerchat_release, this);
                getnetworkmodule = this;
            }
        }
        return getnetworkmodule;
    }

    public getNetworkModule(String str) {
        char cCharAt;
        String strSubstring;
        int i;
        String strSubstring2;
        String strSubstring3;
        if (str.length() > 16385) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("exceeded OID contents length limit");
            throw null;
        }
        if (str.length() < 3 || str.charAt(1) != '.' || (cCharAt = str.charAt(0)) < '0' || cCharAt > '2' || !Providerclient2.write(2, str) || !(cCharAt == '2' || str.length() == 3 || str.charAt(3) == '.' || ((str.length() == 4 || str.charAt(4) == '.') && str.charAt(2) < '4'))) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("string ", str, " not a valid OID"));
            throw null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iIndexOf = str.indexOf(46, 0);
        if (iIndexOf == -1) {
            strSubstring = str.substring(0);
            i = -1;
        } else {
            strSubstring = str.substring(0, iIndexOf);
            i = iIndexOf + 1;
        }
        int i2 = Integer.parseInt(strSubstring) * 40;
        if (i == -1) {
            strSubstring2 = null;
        } else {
            int iIndexOf2 = str.indexOf(46, i);
            if (iIndexOf2 == -1) {
                strSubstring2 = str.substring(i);
                i = -1;
            } else {
                String strSubstring4 = str.substring(i, iIndexOf2);
                i = 1 + iIndexOf2;
                strSubstring2 = strSubstring4;
            }
        }
        if (strSubstring2.length() <= 18) {
            Providerclient2.write(byteArrayOutputStream, Long.parseLong(strSubstring2) + ((long) i2));
        } else {
            Providerclient2.write(byteArrayOutputStream, new BigInteger(strSubstring2).add(BigInteger.valueOf(i2)));
        }
        while (i != -1) {
            if (i == -1) {
                strSubstring3 = null;
            } else {
                int iIndexOf3 = str.indexOf(46, i);
                if (iIndexOf3 == -1) {
                    strSubstring3 = str.substring(i);
                    i = -1;
                } else {
                    String strSubstring5 = str.substring(i, iIndexOf3);
                    i = iIndexOf3 + 1;
                    strSubstring3 = strSubstring5;
                }
            }
            if (strSubstring3.length() <= 18) {
                Providerclient2.write(byteArrayOutputStream, Long.parseLong(strSubstring3));
            } else {
                Providerclient2.write(byteArrayOutputStream, new BigInteger(strSubstring3));
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        RemoteActionCompatParcelizer(byteArray.length);
        this.serializer = byteArray;
        this.read = str;
    }

    public static String IconCompatParcelizer(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        long j = 0;
        BigInteger bigIntegerShiftLeft = null;
        for (int i = 0; i != bArr.length; i++) {
            byte b = bArr[i];
            if (j <= 72057594037927808L) {
                long j2 = j + ((long) (b & 127));
                if ((b & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            sb.append('0');
                        } else if (j2 < 80) {
                            sb.append('1');
                            j2 -= 40;
                        } else {
                            sb.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    sb.append('.');
                    sb.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                if ((b & 128) == 0) {
                    if (z) {
                        sb.append('2');
                        bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                        z = false;
                    }
                    sb.append('.');
                    sb.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb.toString();
    }

    @Override // o.provideRequest
    public final boolean serializer(provideRequest providerequest) {
        if (this == providerequest) {
            return true;
        }
        if (providerequest instanceof getNetworkModule) {
            return Arrays.equals(this.serializer, ((getNetworkModule) providerequest).serializer);
        }
        return false;
    }

    static {
        new ProvidernetworkModule12(getNetworkModule.class, 4);
        RemoteActionCompatParcelizer = new ConcurrentHashMap();
    }

    public static void RemoteActionCompatParcelizer(int i) {
        if (i <= 4096) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("exceeded OID contents length limit");
    }

    public getNetworkModule(String str, byte[] bArr) {
        this.serializer = bArr;
        this.read = str;
    }
}
