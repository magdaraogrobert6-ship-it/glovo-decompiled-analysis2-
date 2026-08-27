package com.google.firebase.crashlytics.internal.network;

import android.util.Log;
import bo.app.af$$ExternalSyntheticOutline0;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.huawei.hms.framework.common.ContainerUtils;
import com.mapbox.maps.extension.style.sources.generated.ImageSource;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import o.prune;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpGetRequest {
    public final HashMap IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final HashMap write;

    public static String IconCompatParcelizer(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), Constants.ENCODING) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append(ContainerUtils.FIELD_DELIMITER);
            sb.append((String) entry2.getKey());
            sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), Constants.ENCODING) : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return af$$ExternalSyntheticOutline0.m(str, "?", string);
        }
        if (!str.endsWith(ContainerUtils.FIELD_DELIMITER)) {
            string = ContainerUtils.FIELD_DELIMITER.concat(string);
        }
        return str.concat(string);
    }

    public void RemoteActionCompatParcelizer(String str, String str2) {
        this.IconCompatParcelizer.put(str, str2);
    }

    public ImageSource build() {
        ImageSource imageSource = new ImageSource(this.RemoteActionCompatParcelizer, 0);
        imageSource.getSourceProperties$extension_style_release().putAll(this.write);
        imageSource.getVolatileSourceProperties$extension_style_release().putAll(this.IconCompatParcelizer);
        return imageSource;
    }

    public ImageSource build$1() {
        ImageSource imageSource = new ImageSource(this.RemoteActionCompatParcelizer, 1);
        imageSource.getSourceProperties$extension_style_release().putAll(this.write);
        imageSource.getVolatileSourceProperties$extension_style_release().putAll(this.IconCompatParcelizer);
        return imageSource;
    }

    public ImageSource build$2() {
        ImageSource imageSource = new ImageSource(this.RemoteActionCompatParcelizer, 2);
        imageSource.getSourceProperties$extension_style_release().putAll(this.write);
        imageSource.getVolatileSourceProperties$extension_style_release().putAll(this.IconCompatParcelizer);
        return imageSource;
    }

    public ImageSource build$3() {
        ImageSource imageSource = new ImageSource(this.RemoteActionCompatParcelizer, 3);
        imageSource.getSourceProperties$extension_style_release().putAll(this.write);
        imageSource.getVolatileSourceProperties$extension_style_release().putAll(this.IconCompatParcelizer);
        return imageSource;
    }

    public ImageSource build$4() {
        ImageSource imageSource = new ImageSource(this.RemoteActionCompatParcelizer, 4);
        imageSource.getSourceProperties$extension_style_release().putAll(this.write);
        imageSource.getVolatileSourceProperties$extension_style_release().putAll(this.IconCompatParcelizer);
        return imageSource;
    }

    public ImageSource build$5() {
        ImageSource imageSource = new ImageSource(this.RemoteActionCompatParcelizer, 5);
        imageSource.getSourceProperties$extension_style_release().putAll(this.write);
        imageSource.getVolatileSourceProperties$extension_style_release().putAll(this.IconCompatParcelizer);
        return imageSource;
    }

    public prune RemoteActionCompatParcelizer() throws Throwable {
        Throwable th;
        HttpsURLConnection httpsURLConnection;
        CrashlyticsWorkers.read();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strIconCompatParcelizer = IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write);
            Log.isLoggable("FirebaseCrashlytics", 2);
            httpsURLConnection = (HttpsURLConnection) new URL(strIconCompatParcelizer).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : this.IconCompatParcelizer.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, Constants.ENCODING));
                        char[] cArr = new char[8192];
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            int i = bufferedReader.read(cArr);
                            if (i == -1) {
                                break;
                            }
                            sb.append(cArr, 0, i);
                        }
                        string = sb.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new prune(responseCode, 1, string);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public HttpGetRequest(String str, int i) {
        str.getClass();
        if (i == 2) {
            this.RemoteActionCompatParcelizer = str;
            this.write = new HashMap();
            this.IconCompatParcelizer = new HashMap();
            return;
        }
        if (i == 3) {
            this.RemoteActionCompatParcelizer = str;
            this.write = new HashMap();
            this.IconCompatParcelizer = new HashMap();
            return;
        }
        if (i == 4) {
            this.RemoteActionCompatParcelizer = str;
            this.write = new HashMap();
            this.IconCompatParcelizer = new HashMap();
        } else if (i == 5) {
            this.RemoteActionCompatParcelizer = str;
            this.write = new HashMap();
            this.IconCompatParcelizer = new HashMap();
        } else if (i != 6) {
            this.RemoteActionCompatParcelizer = str;
            this.write = new HashMap();
            this.IconCompatParcelizer = new HashMap();
        } else {
            this.RemoteActionCompatParcelizer = str;
            this.write = new HashMap();
            this.IconCompatParcelizer = new HashMap();
        }
    }

    public HttpGetRequest(String str, HashMap map) {
        this.RemoteActionCompatParcelizer = str;
        this.write = map;
        this.IconCompatParcelizer = new HashMap();
    }
}
