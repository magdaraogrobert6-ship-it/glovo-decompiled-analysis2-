package io.sentry.transport;

import com.adjust.sdk.Constants;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.SentryOptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.io.TextStreamsKt;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.openUriWithActionViewFromPush;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaoLSjZZF44WAcj26APhfSuFI7AQ;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class read {
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(Constants.ENCODING);
    public final OkHttpCall$1 IconCompatParcelizer;
    public final PlaybackStateCompat read;
    public final Proxy serializer;
    public final SentryOptions write;

    public final TextStreamsKt write(OkHttpCall$1 okHttpCall$1) throws IOException {
        SentryOptions sentryOptions = this.write;
        sentryOptions.getSocketTagger().write();
        OkHttpCall$1 okHttpCall$2 = this.IconCompatParcelizer;
        URL url = (URL) okHttpCall$2.write;
        Proxy proxy = this.serializer;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy)));
        for (Map.Entry entry : ((HashMap) okHttpCall$2.serializer).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty(ConstantKt.CONTENT_TYPE_HEADER, "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", ConstantKt.CONTENT_TYPE_JSON);
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(sentryOptions.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(sentryOptions.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = sentryOptions.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    sentryOptions.getSerializer().write(okHttpCall$1, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, th5, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                IconCompatParcelizer(httpURLConnection);
                sentryOptions.getSocketTagger().serializer();
            }
        }
        return IconCompatParcelizer(httpURLConnection);
    }

    public read(SentryOptions sentryOptions, OkHttpCall$1 okHttpCall$1, PlaybackStateCompat playbackStateCompat) {
        Proxy proxy;
        this.IconCompatParcelizer = okHttpCall$1;
        this.write = sentryOptions;
        this.read = playbackStateCompat;
        r8lambdaoLSjZZF44WAcj26APhfSuFI7AQ proxy2 = sentryOptions.getProxy();
        if (proxy2 != null) {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.read(), Integer.parseInt(proxy2.serializer())));
            } catch (NumberFormatException e) {
                this.write.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Failed to parse Sentry Proxy port: " + proxy2.serializer() + ". Proxy is ignored", new Object[0]);
                proxy = null;
            }
        } else {
            proxy = null;
        }
        this.serializer = proxy;
        if (proxy == null || sentryOptions.getProxy() == null) {
            return;
        }
        String strIconCompatParcelizer = sentryOptions.getProxy().IconCompatParcelizer();
        String strWrite = sentryOptions.getProxy().write();
        if (strIconCompatParcelizer == null || strWrite == null) {
            return;
        }
        Authenticator.setDefault(new MediaSessionCompatResultReceiverWrapper(strIconCompatParcelizer, strWrite));
    }

    public final TextStreamsKt IconCompatParcelizer(HttpURLConnection httpURLConnection) {
        SentryOptions sentryOptions = this.write;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            read(httpURLConnection, responseCode);
            if (responseCode == 200) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Envelope sent successfully.", new Object[0]);
                return r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer;
            }
            BrazeActionParserExternalSyntheticLambda0 logger = sentryOptions.getLogger();
            r8lambdaL32xCEzW71g2Xzeh1NM3NImxco r8lambdal32xcezw71g2xzeh1nm3nimxco = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR;
            logger.IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (sentryOptions.isDebug()) {
                sentryOptions.getLogger().IconCompatParcelizer(r8lambdal32xcezw71g2xzeh1nm3nimxco, "%s", serializer(httpURLConnection));
            }
            return new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(responseCode);
        } catch (IOException e) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, e, "Error reading and logging the response stream", new Object[0]);
            return new r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(-1);
        } finally {
            RemoteActionCompatParcelizer(httpURLConnection);
        }
    }

    public static void RemoteActionCompatParcelizer(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static String serializer(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, RemoteActionCompatParcelizer));
                try {
                    StringBuilder sb = new StringBuilder();
                    boolean z = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z) {
                            sb.append("\n");
                        }
                        sb.append(line);
                        z = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th) {
                                th.addSuppressed(th);
                            }
                        }
                        throw th;
                    }
                    String string = sb.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th4;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    public final void read(HttpURLConnection httpURLConnection, int i) {
        long j;
        long j2;
        String string;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        PlaybackStateCompat playbackStateCompat = this.read;
        SentryOptions sentryOptions = (SentryOptions) playbackStateCompat.RemoteActionCompatParcelizer;
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) playbackStateCompat.read;
        double d = 1000.0d;
        if (headerField2 == null) {
            if (i == 429) {
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = 60000;
                    }
                } else {
                    j = 60000;
                }
                iconCompatParcelizer.getClass();
                playbackStateCompat.read(openUriWithActionViewFromPush.All, new Date(System.currentTimeMillis() + j));
                return;
            }
            return;
        }
        int i2 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        char c = 0;
        int i3 = 0;
        while (i3 < length) {
            String[] strArrSplit2 = strArrSplit[i3].replace(" ", "").split(":", i2);
            if (strArrSplit2.length > 0) {
                String str = strArrSplit2[c];
                if (str != null) {
                    try {
                        j2 = (long) (Double.parseDouble(str) * d);
                    } catch (NumberFormatException unused2) {
                        j2 = 60000;
                    }
                } else {
                    j2 = 60000;
                }
                if (strArrSplit2.length > 1) {
                    String str2 = strArrSplit2[1];
                    iconCompatParcelizer.getClass();
                    Date date = new Date(j2 + System.currentTimeMillis());
                    if (str2 != null && !str2.isEmpty()) {
                        String[] strArrSplit3 = str2.split(";", i2);
                        int length2 = strArrSplit3.length;
                        int i4 = 0;
                        while (i4 < length2) {
                            String str3 = strArrSplit3[i4];
                            openUriWithActionViewFromPush openuriwithactionviewfrompushValueOf = openUriWithActionViewFromPush.Unknown;
                            try {
                                Charset charset = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.IconCompatParcelizer;
                                if (str3 == null || str3.isEmpty()) {
                                    string = str3;
                                } else {
                                    String[] strArrSplit4 = io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read.split(str3, i2);
                                    StringBuilder sb = new StringBuilder();
                                    int length3 = strArrSplit4.length;
                                    int i5 = 0;
                                    while (i5 < length3) {
                                        sb.append(io.sentry.util.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer(strArrSplit4[i5]));
                                        i5++;
                                        strArrSplit4 = strArrSplit4;
                                    }
                                    string = sb.toString();
                                }
                                if (string != null) {
                                    openuriwithactionviewfrompushValueOf = openUriWithActionViewFromPush.valueOf(string);
                                } else {
                                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Couldn't capitalize: %s", str3);
                                }
                            } catch (IllegalArgumentException e) {
                                sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, e, "Unknown category: %s", str3);
                            }
                            openUriWithActionViewFromPush openuriwithactionviewfrompush = openuriwithactionviewfrompushValueOf;
                            if (!openUriWithActionViewFromPush.Unknown.equals(openuriwithactionviewfrompush)) {
                                playbackStateCompat.read(openuriwithactionviewfrompush, date);
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else {
                        playbackStateCompat.read(openUriWithActionViewFromPush.All, date);
                    }
                }
            }
            i3++;
            d = 1000.0d;
            i2 = -1;
            c = 0;
        }
    }
}
