package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.BuildersKt;
import o.FocusModifierKt;
import o.accessgetTvInputVga1cp;
import o.setCoroutineContext;
import o.setLastMatrixRecalculationAnimationTimeui;
import o.setPrimaryDirectionalMotionAxisOverrider2epLt8ui;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigFetchHttpClient {
    public static final Pattern serializer = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final String IconCompatParcelizer;
    public final long MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final String RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final Context read;
    public final String write;

    public static void serializer(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @Keep
    public setLastMatrixRecalculationAnimationTimeui fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date, Map<String, String> map3) throws FirebaseRemoteConfigException {
        String strIconCompatParcelizer;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        httpURLConnection.setDoOutput(true);
        long j = this.RemoteActionCompatParcelizer;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(j));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.MediaMetadataCompat));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.write);
        Context context = this.read;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        JSONArray jSONArray2 = null;
        try {
            byte[] bArr = BuildersKt.read(context, context.getPackageName());
            if (bArr == null) {
                SentryLogcatAdapter.serializer("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strIconCompatParcelizer = null;
            } else {
                strIconCompatParcelizer = accessgetTvInputVga1cp.IconCompatParcelizer(bArr);
            }
        } catch (PackageManager.NameNotFoundException e) {
            SentryLogcatAdapter.read("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strIconCompatParcelizer);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
        httpURLConnection.setRequestProperty("Accept", ConstantKt.CONTENT_TYPE_JSON);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                serializer(httpURLConnection, read(str, str2, map, l, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectSerializer = serializer(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                try {
                    setCoroutineContext setcoroutinecontextRemoteActionCompatParcelizer = setPrimaryDirectionalMotionAxisOverrider2epLt8ui.RemoteActionCompatParcelizer();
                    setcoroutinecontextRemoteActionCompatParcelizer.IconCompatParcelizer = date;
                    try {
                        jSONObject = jSONObjectSerializer.getJSONObject("entries");
                    } catch (JSONException unused2) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            setcoroutinecontextRemoteActionCompatParcelizer.serializer = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused3) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectSerializer.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused4) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            setcoroutinecontextRemoteActionCompatParcelizer.write = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused5) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectSerializer.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused6) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            setcoroutinecontextRemoteActionCompatParcelizer.read = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused7) {
                        }
                    }
                    String string = jSONObjectSerializer.has("templateVersion") ? jSONObjectSerializer.getString("templateVersion") : null;
                    if (string != null) {
                        setcoroutinecontextRemoteActionCompatParcelizer.RatingCompat = Long.parseLong(string);
                    }
                    try {
                        jSONArray2 = jSONObjectSerializer.getJSONArray("rolloutMetadata");
                    } catch (JSONException unused8) {
                    }
                    if (jSONArray2 != null) {
                        try {
                            setcoroutinecontextRemoteActionCompatParcelizer.RemoteActionCompatParcelizer = new JSONArray(jSONArray2.toString());
                        } catch (JSONException unused9) {
                        }
                    }
                    setPrimaryDirectionalMotionAxisOverrider2epLt8ui setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer = setcoroutinecontextRemoteActionCompatParcelizer.serializer();
                    try {
                        if (!(!jSONObjectSerializer.get("state").equals("NO_CHANGE"))) {
                            return setLastMatrixRecalculationAnimationTimeui.RemoteActionCompatParcelizer(setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer);
                        }
                    } catch (JSONException unused10) {
                    }
                    return setLastMatrixRecalculationAnimationTimeui.RemoteActionCompatParcelizer(setprimarydirectionalmotionaxisoverrider2eplt8uiSerializer, headerField);
                } catch (JSONException e2) {
                    throw new FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", (Exception) e2);
                }
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused11) {
                }
                throw th;
            }
        } catch (IOException | JSONException e3) {
            throw new FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e3);
        }
    }

    public final HttpURLConnection RemoteActionCompatParcelizer() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.MediaSessionCompatQueueItem + "/namespaces/" + this.RatingCompat + ":fetch").openConnection();
        } catch (IOException e) {
            throw new FirebaseRemoteConfigException(e.getMessage());
        }
    }

    public final JSONObject read(String str, String str2, Map map, Long l, Map map2) throws FirebaseRemoteConfigClientException {
        HashMap map3 = new HashMap();
        if (str == null) {
            throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        map3.put("appInstanceId", str);
        map3.put("appInstanceIdToken", str2);
        map3.put("appId", this.IconCompatParcelizer);
        Context context = this.read;
        Locale locale = context.getResources().getConfiguration().locale;
        map3.put("countryCode", locale.getCountry());
        map3.put("languageCode", locale.toLanguageTag());
        map3.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
        map3.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map3.put("appVersion", packageInfo.versionName);
                map3.put("appBuild", Long.toString(FocusModifierKt.IconCompatParcelizer(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map3.put("packageName", context.getPackageName());
        map3.put("sdkVersion", "23.0.1");
        map3.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            map3.put("customSignals", new JSONObject(map2));
            Objects.toString(map2.keySet());
        }
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map3.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map3);
    }

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.read = context;
        this.IconCompatParcelizer = str;
        this.write = str2;
        Matcher matcher = serializer.matcher(str);
        this.MediaSessionCompatQueueItem = matcher.matches() ? matcher.group(1) : null;
        this.RatingCompat = str3;
        this.RemoteActionCompatParcelizer = j;
        this.MediaMetadataCompat = j2;
    }

    public static JSONObject serializer(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i != -1) {
                sb.append((char) i);
            } else {
                return new JSONObject(sb.toString());
            }
        }
    }
}
