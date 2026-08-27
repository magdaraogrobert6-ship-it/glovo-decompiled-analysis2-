package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ;
import o.scrollBy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0147  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.io.Closeable, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static n0 a(String str, byte[] bArr, Map<String, String> map, String str2) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        if (TextUtils.isEmpty(str)) {
            return new n0(-100, "");
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        int i = -102;
        try {
            try {
                str = a((String) str, bArr.length, (Map<String, String>) map, str2);
                try {
                    if (str == 0) {
                        n0 n0Var = new n0(-101, "");
                        k1.a((Closeable) null);
                        k1.a((Closeable) null);
                        if (str != 0) {
                            k1.a((HttpURLConnection) str);
                        }
                        return n0Var;
                    }
                    map = str.getOutputStream();
                    try {
                        bufferedOutputStream = new BufferedOutputStream(map);
                        try {
                            try {
                                bufferedOutputStream.write(bArr);
                                bufferedOutputStream.flush();
                                int responseCode = str.getResponseCode();
                                try {
                                    n0 n0Var2 = new n0(responseCode, b(str));
                                    k1.a((Closeable) bufferedOutputStream);
                                    k1.a((Closeable) map);
                                    k1.a((HttpURLConnection) str);
                                    return n0Var2;
                                } catch (SecurityException unused) {
                                    i = responseCode;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    v.f("hmsSdk", "SecurityException with HttpClient. Please check INTERNET permission.");
                                    n0 n0Var3 = new n0(i, "");
                                    k1.a((Closeable) bufferedOutputStream2);
                                    k1.a((Closeable) map);
                                    if (str != 0) {
                                        k1.a((HttpURLConnection) str);
                                    }
                                    return n0Var3;
                                } catch (ConnectException unused2) {
                                    i = responseCode;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    v.f("hmsSdk", "Network is unreachable or Connection refused");
                                    n0 n0Var4 = new n0(i, "");
                                    k1.a((Closeable) bufferedOutputStream2);
                                    k1.a((Closeable) map);
                                    if (str != 0) {
                                        k1.a((HttpURLConnection) str);
                                    }
                                    return n0Var4;
                                } catch (UnknownHostException unused3) {
                                    i = responseCode;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    v.f("hmsSdk", "No address associated with hostname or No network");
                                    n0 n0Var5 = new n0(i, "");
                                    k1.a((Closeable) bufferedOutputStream2);
                                    k1.a((Closeable) map);
                                    if (str != 0) {
                                        k1.a((HttpURLConnection) str);
                                    }
                                    return n0Var5;
                                } catch (SSLHandshakeException unused4) {
                                    i = responseCode;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    v.f("hmsSdk", "Chain validation failed,Certificate expired");
                                    n0 n0Var6 = new n0(i, "");
                                    k1.a((Closeable) bufferedOutputStream2);
                                    k1.a((Closeable) map);
                                    if (str != 0) {
                                        k1.a((HttpURLConnection) str);
                                    }
                                    return n0Var6;
                                } catch (SSLPeerUnverifiedException unused5) {
                                    i = responseCode;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    v.f("hmsSdk", "Certificate has not been verified,Request is restricted!");
                                    n0 n0Var7 = new n0(i, "");
                                    k1.a((Closeable) bufferedOutputStream2);
                                    k1.a((Closeable) map);
                                    if (str != 0) {
                                        k1.a((HttpURLConnection) str);
                                    }
                                    return n0Var7;
                                } catch (IOException unused6) {
                                    i = responseCode;
                                    bufferedOutputStream2 = bufferedOutputStream;
                                    v.f("hmsSdk", "events PostRequest(byte[]): IOException occurred.");
                                    n0 n0Var8 = new n0(i, "");
                                    k1.a((Closeable) bufferedOutputStream2);
                                    k1.a((Closeable) map);
                                    if (str != 0) {
                                        k1.a((HttpURLConnection) str);
                                    }
                                    return n0Var8;
                                }
                            } catch (a unused7) {
                                bufferedOutputStream2 = bufferedOutputStream;
                                v.f("hmsSdk", "PostRequest(byte[]): No ssl socket factory set!");
                                n0 n0Var9 = new n0(-101, "");
                                k1.a((Closeable) bufferedOutputStream2);
                                k1.a((Closeable) map);
                                if (str != 0) {
                                    k1.a((HttpURLConnection) str);
                                }
                                return n0Var9;
                            } catch (Throwable th2) {
                                th = th2;
                                k1.a((Closeable) bufferedOutputStream);
                                k1.a((Closeable) map);
                                if (str != 0) {
                                    k1.a((HttpURLConnection) str);
                                }
                                throw th;
                            }
                        } catch (SecurityException unused8) {
                        } catch (ConnectException unused9) {
                        } catch (UnknownHostException unused10) {
                        } catch (SSLHandshakeException unused11) {
                        } catch (SSLPeerUnverifiedException unused12) {
                        } catch (IOException unused13) {
                        }
                    } catch (a unused14) {
                    } catch (SecurityException unused15) {
                    } catch (ConnectException unused16) {
                    } catch (UnknownHostException unused17) {
                    } catch (SSLHandshakeException unused18) {
                    } catch (SSLPeerUnverifiedException unused19) {
                    } catch (IOException unused20) {
                    }
                } catch (a unused21) {
                    map = 0;
                } catch (SecurityException unused22) {
                    map = 0;
                } catch (ConnectException unused23) {
                    map = 0;
                } catch (UnknownHostException unused24) {
                    map = 0;
                } catch (SSLHandshakeException unused25) {
                    map = 0;
                } catch (SSLPeerUnverifiedException unused26) {
                    map = 0;
                } catch (IOException unused27) {
                    map = 0;
                } catch (Throwable th3) {
                    th = th3;
                    map = 0;
                    bufferedOutputStream = null;
                    k1.a((Closeable) bufferedOutputStream);
                    k1.a((Closeable) map);
                    if (str != 0) {
                        k1.a((HttpURLConnection) str);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (a unused28) {
            str = 0;
            map = 0;
        } catch (SecurityException unused29) {
            str = 0;
            map = 0;
        } catch (ConnectException unused30) {
            str = 0;
            map = 0;
        } catch (UnknownHostException unused31) {
            str = 0;
            map = 0;
        } catch (SSLHandshakeException unused32) {
            str = 0;
            map = 0;
        } catch (SSLPeerUnverifiedException unused33) {
            str = 0;
            map = 0;
        } catch (IOException unused34) {
            str = 0;
            map = 0;
        } catch (Throwable th5) {
            th = th5;
            str = 0;
            map = 0;
        }
    }

    private static String b(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        try {
            inputStream = httpURLConnection.getInputStream();
            return k1.a(inputStream);
        } catch (IOException unused) {
            v.f("hmsSdk", "When Response Content From Connection inputStream operation exception! " + httpURLConnection.getResponseCode());
            return "";
        } finally {
            k1.a((Closeable) inputStream);
        }
    }

    public static n0 a(String str, byte[] bArr, Map<String, String> map) {
        return a(str, bArr, map, "POST");
    }

    private static HttpURLConnection a(String str, int i, Map<String, String> map, String str2) throws ProtocolException, a {
        if (TextUtils.isEmpty(str)) {
            v.b("hmsSdk", "CreateConnection: invalid urlPath.");
            return null;
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        a(httpURLConnection);
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(ConstantKt.CONTENT_TYPE_HEADER, "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(i));
        httpURLConnection.setRequestProperty("Connection", "close");
        if (map != null && map.size() >= 1) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && !TextUtils.isEmpty(key)) {
                    httpURLConnection.setRequestProperty(key, entry.getValue());
                }
            }
        }
        return httpURLConnection;
    }

    private static void a(HttpURLConnection httpURLConnection) throws a {
        String str;
        r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite;
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            try {
                r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite = r8lambdaD0mBs1SNEZATJcjSNqO_xrqgagQ.write(q0.i());
            } catch (IOException unused) {
                str = "getSocketFactory(): IO Exception!";
                v.f("hmsSdk", str);
                r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite = null;
            } catch (IllegalAccessException unused2) {
                str = "getSocketFactory(): Illegal Access Exception ";
                v.f("hmsSdk", str);
                r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite = null;
            } catch (KeyStoreException unused3) {
                str = "getSocketFactory(): Key Store exception";
                v.f("hmsSdk", str);
                r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite = null;
            } catch (NoSuchAlgorithmException unused4) {
                str = "getSocketFactory(): Algorithm Exception!";
                v.f("hmsSdk", str);
                r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite = null;
            } catch (GeneralSecurityException unused5) {
                str = "getSocketFactory(): General Security Exception";
                v.f("hmsSdk", str);
                r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite = null;
            }
            if (r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite == null) {
                throw new a("No ssl socket factory set");
            }
            httpsURLConnection.setSSLSocketFactory(r8lambdad0mbs1snezatjcjsnqo_xrqgagqWrite);
            httpsURLConnection.setHostnameVerifier(new scrollBy());
        }
    }
}
