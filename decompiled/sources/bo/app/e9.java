package bo.app;

import android.net.TrafficStats;
import com.adjust.sdk.Constants;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.io.TextStreamsKt;
import o.SimpleItemTouchHelperCallback;
import o.ensureSubscribedToInAppMessageEvents;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.sourceInformationContextOfdefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e9 {
    public static final int b = 15000;
    public final int a;

    public e9(int i) {
        this.a = i;
    }

    public final HttpURLConnection a(URL url, JSONObject jSONObject, Map map) throws IOException {
        url.getClass();
        jSONObject.getClass();
        map.getClass();
        String string = jSONObject.toString();
        string.getClass();
        Charset charsetForName = Charset.forName(Constants.ENCODING);
        charsetForName.getClass();
        byte[] bytes = string.getBytes(charsetForName);
        bytes.getClass();
        HttpURLConnection httpURLConnectionA = hh.a.a(url);
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnectionA.setConnectTimeout(b);
        httpURLConnectionA.setReadTimeout(this.a);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setInstanceFollowRedirects(false);
        httpURLConnectionA.setRequestMethod("POST");
        httpURLConnectionA.setDoOutput(true);
        httpURLConnectionA.setFixedLengthStreamingMode(bytes.length);
        OutputStream outputStream = httpURLConnectionA.getOutputStream();
        try {
            outputStream.write(bytes);
            outputStream.close();
            return httpURLConnectionA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                int i = sourceInformationContextOfdefault.read();
                int i2 = sourceInformationContextOfdefault.read();
                int i3 = sourceInformationContextOfdefault.read();
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{outputStream, th}, i3);
                throw th2;
            }
        }
    }

    public static final String a(td tdVar) {
        return "Failed request to [" + tdVar + "]";
    }

    public final v9 a(td tdVar, Map map, JSONObject jSONObject) {
        tdVar.getClass();
        map.getClass();
        jSONObject.getClass();
        TrafficStats.setThreadStatsTag(com.braze.Constants.TRAFFIC_STATS_THREAD_TAG);
        URL url = tdVar.c;
        Map mapA = SimpleItemTouchHelperCallback.serializer;
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnectionA = a(url, jSONObject, map);
            responseCode = httpURLConnectionA.getResponseCode();
            Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
            headerFields.getClass();
            mapA = com.braze.support.h.a(headerFields);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(d9.a(httpURLConnectionA), ensureSubscribedToInAppMessageEvents.write), 8192);
            try {
                String strIconCompatParcelizer = TextStreamsKt.IconCompatParcelizer(bufferedReader);
                bufferedReader.close();
                return new v9(responseCode, mapA, new JSONObject(strIconCompatParcelizer));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    int i = sourceInformationContextOfdefault.read();
                    int i2 = sourceInformationContextOfdefault.read();
                    int i3 = sourceInformationContextOfdefault.read();
                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, i, i2, -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th}, i3);
                    throw th2;
                }
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new e9$$ExternalSyntheticLambda0(tdVar, 0), 4, (Object) null);
            return new v9(responseCode, mapA, 4);
        }
    }
}
