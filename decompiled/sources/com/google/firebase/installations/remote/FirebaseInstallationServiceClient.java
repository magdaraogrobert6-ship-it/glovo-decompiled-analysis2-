package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import com.adjust.sdk.Constants;
import com.deliveryhero.fwf_http.ConstantKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.firebase.installations.FirebaseInstallationsException;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.coroutines.BuildersKt;
import o.AbstractComposeViewExternalSyntheticLambda0;
import o.AccessibilityIteratorsLineTextSegmentIterator;
import o.AccessibilityIteratorsLineTextSegmentIteratorCompanion;
import o.AccessibilityIteratorsPageTextSegmentIterator;
import o.AccessibilityIteratorsParagraphTextSegmentIterator;
import o.accessgetLineInstancecp;
import o.accessgetPageInstancecp;
import o.accessgetSystemNavigationDowncp;
import o.accessgetTvInputVga1cp;
import o.accessgetWcp;
import o.getLineEdgeIndex;
import o.isEndBoundary;
import o.onSemanticsChange;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.registerOnEndApplyChangesListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseInstallationServiceClient {
    public final AbstractComposeViewExternalSyntheticLambda0 read;
    public final isEndBoundary serializer;
    public final Context write;
    public static final Pattern RemoteActionCompatParcelizer = Pattern.compile("[0-9]+s");
    public static final Charset IconCompatParcelizer = Charset.forName(Constants.ENCODING);

    public static long IconCompatParcelizer(String str) {
        accessgetSystemNavigationDowncp.write("Invalid Expiration Timestamp.", RemoteActionCompatParcelizer.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static void serializer(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:19.1.0");
            read(httpURLConnection, jSONObject.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
        }
    }

    public static void write(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:19.1.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            read(httpURLConnection, jSONObject2.toString().getBytes(Constants.ENCODING));
        } catch (JSONException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.write(e);
        }
    }

    public final HttpURLConnection write(URL url, String str) {
        String strIconCompatParcelizer;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(ConstantKt.CONTENT_TYPE_HEADER, ConstantKt.CONTENT_TYPE_JSON);
            httpURLConnection.addRequestProperty("Accept", ConstantKt.CONTENT_TYPE_JSON);
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            Context context = this.write;
            httpURLConnection.addRequestProperty("X-Android-Package", context.getPackageName());
            registerOnEndApplyChangesListener registeronendapplychangeslistener = (registerOnEndApplyChangesListener) this.read.write();
            if (registeronendapplychangeslistener != null) {
                try {
                    httpURLConnection.addRequestProperty("x-firebase-client", (String) LazyKt__LazyJVMKt.read(((onSemanticsChange) registeronendapplychangeslistener).write()));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    SentryLogcatAdapter.write("ContentValues", "Failed to get heartbeats header", e);
                } catch (ExecutionException e2) {
                    SentryLogcatAdapter.write("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            try {
                byte[] bArr = BuildersKt.read(context, context.getPackageName());
                if (bArr == null) {
                    SentryLogcatAdapter.serializer("ContentValues", "Could not get fingerprint hash for package: " + context.getPackageName());
                    strIconCompatParcelizer = null;
                } else {
                    strIconCompatParcelizer = accessgetTvInputVga1cp.IconCompatParcelizer(bArr);
                }
            } catch (PackageManager.NameNotFoundException e3) {
                SentryLogcatAdapter.read("ContentValues", "No such package: " + context.getPackageName(), e3);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", strIconCompatParcelizer);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            FirebaseInstallationsException.serializer serializerVar = FirebaseInstallationsException.serializer.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
    }

    public FirebaseInstallationServiceClient(Context context, AbstractComposeViewExternalSyntheticLambda0 abstractComposeViewExternalSyntheticLambda0) {
        this.write = context;
        this.read = abstractComposeViewExternalSyntheticLambda0;
        isEndBoundary isendboundary = new isEndBoundary();
        if (accessgetWcp.read == null) {
            Pattern pattern = AccessibilityIteratorsLineTextSegmentIterator.RemoteActionCompatParcelizer;
            accessgetWcp.read = new accessgetWcp(29);
        }
        accessgetWcp accessgetwcp = accessgetWcp.read;
        if (AccessibilityIteratorsLineTextSegmentIterator.read == null) {
            AccessibilityIteratorsLineTextSegmentIterator.read = new AccessibilityIteratorsLineTextSegmentIterator(accessgetwcp);
        }
        isendboundary.write = AccessibilityIteratorsLineTextSegmentIterator.read;
        this.serializer = isendboundary;
    }

    public static URL read(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/".concat(str));
        } catch (MalformedURLException e) {
            String message = e.getMessage();
            FirebaseInstallationsException.serializer serializerVar = FirebaseInstallationsException.serializer.BAD_CONFIG;
            throw new FirebaseInstallationsException(message);
        }
    }

    public static getLineEdgeIndex IconCompatParcelizer(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, IconCompatParcelizer));
        accessgetLineInstancecp accessgetlineinstancecpWrite = getLineEdgeIndex.write();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                accessgetlineinstancecpWrite.serializer(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                accessgetlineinstancecpWrite.RemoteActionCompatParcelizer(IconCompatParcelizer(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        accessgetlineinstancecpWrite.RemoteActionCompatParcelizer(AccessibilityIteratorsParagraphTextSegmentIterator.OK);
        return accessgetlineinstancecpWrite.write();
    }

    public static AccessibilityIteratorsPageTextSegmentIterator read(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, IconCompatParcelizer));
        accessgetLineInstancecp accessgetlineinstancecpWrite = getLineEdgeIndex.write();
        AccessibilityIteratorsLineTextSegmentIteratorCompanion accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer = AccessibilityIteratorsPageTextSegmentIterator.serializer();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.RemoteActionCompatParcelizer(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.read(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.serializer(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        accessgetlineinstancecpWrite.serializer(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        accessgetlineinstancecpWrite.RemoteActionCompatParcelizer(IconCompatParcelizer(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.write(accessgetlineinstancecpWrite.write());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.serializer(accessgetPageInstancecp.OK);
        return accessibilityIteratorsLineTextSegmentIteratorCompanionSerializer.read();
    }

    public static void read(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.serializer("Cannot send request to FIS servers. No OutputStream available.");
            return;
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void serializer(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, IconCompatParcelizer));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        SentryLogcatAdapter.IconCompatParcelizer("Firebase-Installations", str4);
        SentryLogcatAdapter.IconCompatParcelizer("Firebase-Installations", r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Firebase options used while communicating with Firebase server APIs: ", str2, ", ", str3, TextUtils.isEmpty(str) ? "" : r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer(", ", str)));
    }
}
