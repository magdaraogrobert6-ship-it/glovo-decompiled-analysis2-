package o;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getCallEK5gGoQ {
    public final getExponentimpl IconCompatParcelizer;
    public final Context read;
    public final String serializer;
    public final HashMap RemoteActionCompatParcelizer = new HashMap();
    public final HashMap write = new HashMap();
    public final accessgetTvInputComposite1cp RatingCompat = accessgetTvInputComposite1cp.read;

    public getCallEK5gGoQ(Context context, getExponentimpl getexponentimpl) {
        String string;
        this.read = context.getApplicationContext();
        this.IconCompatParcelizer = getexponentimpl;
        String str = Build.VERSION.RELEASE;
        java.util.Locale locale = java.util.Locale.getDefault();
        if (locale == null || locale.getLanguage() == null || locale.getLanguage().length() == 0) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (locale.getCountry() != null && locale.getCountry().length() != 0) {
                sb.append("-");
                sb.append(locale.getCountry().toLowerCase());
            }
            string = sb.toString();
        }
        this.serializer = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("GoogleTagManager/5.06 (Linux; U; Android ", str, "; ", string, "; "), Build.MODEL, " Build/", Build.ID, ")");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x0343  */
    /* JADX WARN: Code duplicated, block: B:136:0x0370 A[Catch: all -> 0x03bd, TRY_LEAVE, TryCatch #22 {all -> 0x03bd, blocks: (B:134:0x036a, B:136:0x0370), top: B:235:0x036a }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0380 A[Catch: all -> 0x039d, LOOP:2: B:233:0x037a->B:139:0x0380, LOOP_END, TryCatch #21 {all -> 0x039d, blocks: (B:137:0x037a, B:139:0x0380, B:140:0x0384), top: B:233:0x037a }] */
    /* JADX WARN: Code duplicated, block: B:144:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:146:0x03a5 A[Catch: all -> 0x03c7, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x03c7, blocks: (B:133:0x0358, B:146:0x03a5), top: B:203:0x0358 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0070  */
    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:186:0x0447  */
    /* JADX WARN: Code duplicated, block: B:187:0x045e  */
    /* JADX WARN: Code duplicated, block: B:193:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x03af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x03ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ed A[Catch: all -> 0x0105, TryCatch #4 {all -> 0x0105, blocks: (B:29:0x00e4, B:31:0x00ed, B:32:0x00f1), top: B:199:0x00e4 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1 A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #4 {all -> 0x0105, blocks: (B:29:0x00e4, B:31:0x00ed, B:32:0x00f1), top: B:199:0x00e4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0122  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132 A[Catch: all -> 0x03e0, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0140 A[Catch: all -> 0x03e0, LOOP:1: B:53:0x013a->B:55:0x0140, LOOP_END, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0158 A[Catch: all -> 0x03e0, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01a6 A[Catch: all -> 0x03e0, TRY_LEAVE, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01b2 A[Catch: all -> 0x03e0, TRY_ENTER, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0232  */
    /* JADX WARN: Code duplicated, block: B:79:0x0239  */
    /* JADX WARN: Code duplicated, block: B:82:0x0240  */
    /* JADX WARN: Code duplicated, block: B:84:0x0246 A[Catch: all -> 0x03e0, TRY_ENTER, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x024b A[Catch: all -> 0x03e0, TRY_LEAVE, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0270  */
    /* JADX WARN: Code duplicated, block: B:90:0x0276 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0278 A[Catch: all -> 0x03e0, TRY_ENTER, TryCatch #0 {all -> 0x03e0, blocks: (B:50:0x0129, B:52:0x0132, B:53:0x013a, B:55:0x0140, B:57:0x0158, B:58:0x01a6, B:61:0x01b2, B:63:0x01b8, B:65:0x01be, B:67:0x01c4, B:73:0x022a, B:84:0x0246, B:86:0x024b, B:91:0x0278, B:92:0x0299, B:93:0x029c, B:96:0x02a3, B:99:0x02aa), top: B:191:0x0129 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x0278, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v33 */
    public final void read(ArrayList arrayList) throws Throwable {
        URL url;
        String str;
        int i;
        HashMap map;
        String str2;
        int i2;
        getButton9EK5gGoQ getbutton9ek5ggoq;
        accessgetTvInputComposite1cp accessgettvinputcomposite1cp;
        long jMin;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        Context context;
        Intent intent;
        boolean z;
        int responseCode;
        StringBuilder sb;
        ?? r8;
        InputStream errorStream;
        ?? r9;
        BufferedReader bufferedReader;
        String line;
        String str3 = ": ";
        int iMin = Math.min(arrayList.size(), 40);
        int i3 = 0;
        boolean z2 = true;
        while (i3 < iMin) {
            getButton9EK5gGoQ getbutton9ek5ggoq2 = (getButton9EK5gGoQ) arrayList.get(i3);
            String str4 = getbutton9ek5ggoq2.serializer;
            long j = getbutton9ek5ggoq2.read;
            try {
                url = new URL(str4);
            } catch (MalformedURLException unused) {
                getButtonThumbLeftEK5gGoQ.write("Error trying to parse the GTM url.");
                url = null;
            }
            accessgetTvInputComposite1cp accessgettvinputcomposite1cp2 = this.RatingCompat;
            HashMap map2 = this.write;
            HashMap map3 = this.RemoteActionCompatParcelizer;
            getExponentimpl getexponentimpl = this.IconCompatParcelizer;
            if (url == null || !map3.containsKey(url.toString())) {
                str = getbutton9ek5ggoq2.IconCompatParcelizer;
                i = iMin;
                map = getbutton9ek5ggoq2.RemoteActionCompatParcelizer;
                str2 = getbutton9ek5ggoq2.RatingCompat;
                if (url == null) {
                    getButtonThumbLeftEK5gGoQ.serializer("No destination: discarding hit.");
                    ((getButtonStartEK5gGoQ) getexponentimpl.read).RemoteActionCompatParcelizer(new String[]{String.valueOf(j)});
                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    str3 = str3;
                    i2 = i3;
                    str3 = str3;
                } else {
                    try {
                        i2 = i3;
                        try {
                            httpURLConnection = (HttpURLConnection) url.openConnection();
                            try {
                                try {
                                    if (z2) {
                                        try {
                                            context = this.read;
                                            int i4 = getButtonXEK5gGoQ.write;
                                            accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                            try {
                                                getbutton9ek5ggoq = getbutton9ek5ggoq2;
                                                try {
                                                    intent = new Intent("com.google.analytics.RADIO_POWERED");
                                                    intent.addCategory(context.getPackageName());
                                                    str3 = str3;
                                                    try {
                                                        intent.putExtra("com.google.android.gms.internal.gtm.zzbh", true);
                                                        if (Build.VERSION.SDK_INT < 34) {
                                                            context.sendBroadcast(intent);
                                                        } else {
                                                            inputStream = null;
                                                            try {
                                                                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                str3 = str3;
                                                                z2 = true;
                                                                if (inputStream != null) {
                                                                    try {
                                                                        inputStream.close();
                                                                    } catch (IOException e) {
                                                                        e = e;
                                                                        getButtonThumbLeftEK5gGoQ.serializer("Exception sending hit to " + url.toString() + str3 + e.getClass().getSimpleName());
                                                                        getButtonThumbLeftEK5gGoQ.serializer(e.getMessage());
                                                                        getexponentimpl.serializer(getbutton9ek5ggoq);
                                                                        String string = url.toString();
                                                                        accessgettvinputcomposite1cp.getClass();
                                                                        map2.put(string, Long.valueOf(System.currentTimeMillis()));
                                                                        if (map3.containsKey(url.toString())) {
                                                                            long jLongValue = ((Long) map3.get(url.toString())).longValue();
                                                                            jMin = Math.min(jLongValue + jLongValue, 600000L);
                                                                        } else {
                                                                            jMin = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
                                                                        }
                                                                        map3.put(url.toString(), Long.valueOf(jMin));
                                                                        getButtonThumbLeftEK5gGoQ.serializer("URL resulting in exception can be retried in " + jMin + "ms. URL: " + url.toString());
                                                                        i3 = i2 + 1;
                                                                        iMin = i;
                                                                    }
                                                                }
                                                                httpURLConnection.disconnect();
                                                                throw th;
                                                            }
                                                        }
                                                        httpURLConnection.setRequestProperty(ConstantKt.USER_AGENT_HEADER, this.serializer);
                                                        if (map != null) {
                                                            for (Map.Entry entry : map.entrySet()) {
                                                                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                                            }
                                                        }
                                                        if (str == null) {
                                                            getButtonThumbLeftEK5gGoQ.serializer(String.format("Hit %d retrieved from the store has null HTTP method.", Long.valueOf(j)));
                                                            ((getButtonStartEK5gGoQ) getexponentimpl.read).RemoteActionCompatParcelizer(new String[]{String.valueOf(j)});
                                                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                                        } else if (!str.equals("GET") || str.equals("HEAD") || str.equals("POST") || str.equals("PUT")) {
                                                            switch (str.hashCode()) {
                                                                case 70454:
                                                                    if (str.equals("GET")) {
                                                                        if (str2 != null) {
                                                                            getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                                                        }
                                                                        httpURLConnection.setRequestMethod(str);
                                                                    }
                                                                    break;
                                                                case 79599:
                                                                    if (str.equals("PUT")) {
                                                                        httpURLConnection.setRequestMethod(str);
                                                                        if (str2 != null) {
                                                                            httpURLConnection.setDoOutput(true);
                                                                            byte[] bytes = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                                                            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                                                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                                            bufferedOutputStream.write(bytes);
                                                                            bufferedOutputStream.flush();
                                                                            bufferedOutputStream.close();
                                                                        }
                                                                    }
                                                                    break;
                                                                case 2213344:
                                                                    if (str.equals("HEAD")) {
                                                                        if (str2 != null) {
                                                                            getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                                                        }
                                                                        httpURLConnection.setRequestMethod(str);
                                                                    }
                                                                    break;
                                                                case 2461856:
                                                                    if (str.equals("POST")) {
                                                                        httpURLConnection.setRequestMethod(str);
                                                                        if (str2 != null) {
                                                                            httpURLConnection.setDoOutput(true);
                                                                            byte[] bytes2 = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                                                            httpURLConnection.setFixedLengthStreamingMode(bytes2.length);
                                                                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                                            bufferedOutputStream2.write(bytes2);
                                                                            bufferedOutputStream2.flush();
                                                                            bufferedOutputStream2.close();
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            responseCode = httpURLConnection.getResponseCode();
                                                            try {
                                                                Object[] objArr = new Object[1];
                                                                try {
                                                                    objArr[0] = 2;
                                                                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                                                    if (responseCode >= 200 || responseCode >= 300) {
                                                                        z = false;
                                                                        try {
                                                                            String string2 = url.toString();
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            sb2.append("Bad response received for ");
                                                                            sb2.append(string2);
                                                                            str3 = str3;
                                                                            try {
                                                                                sb2.append(str3);
                                                                                sb2.append(responseCode);
                                                                                getButtonThumbLeftEK5gGoQ.serializer(sb2.toString());
                                                                                sb = new StringBuilder();
                                                                                try {
                                                                                    errorStream = httpURLConnection.getErrorStream();
                                                                                    if (errorStream != null) {
                                                                                        bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                                                                        while (true) {
                                                                                            try {
                                                                                                line = bufferedReader.readLine();
                                                                                                if (line != null) {
                                                                                                    sb.append(line);
                                                                                                } else {
                                                                                                    getButtonThumbLeftEK5gGoQ.serializer("Error Message: " + sb.toString());
                                                                                                    r9 = bufferedReader;
                                                                                                }
                                                                                            } catch (Throwable th2) {
                                                                                                th = th2;
                                                                                                r8 = bufferedReader;
                                                                                                if (r8 != 0) {
                                                                                                    r8.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        r9 = inputStream;
                                                                                    }
                                                                                    if (r9 != 0) {
                                                                                        r9.close();
                                                                                    }
                                                                                    getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                                    try {
                                                                                        getexponentimpl.serializer(getbutton9ek5ggoq);
                                                                                    } catch (Throwable th3) {
                                                                                        th = th3;
                                                                                        z2 = z;
                                                                                        if (inputStream != null) {
                                                                                            inputStream.close();
                                                                                        }
                                                                                        httpURLConnection.disconnect();
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    r8 = inputStream;
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                            getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                            str3 = str3;
                                                                            z2 = z;
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            httpURLConnection.disconnect();
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            InputStream inputStream2 = httpURLConnection.getInputStream();
                                                                            try {
                                                                                url.toString();
                                                                                try {
                                                                                    Object[] objArr2 = new Object[1];
                                                                                    try {
                                                                                        objArr2[0] = 2;
                                                                                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                                                                        getButtonStartEK5gGoQ getbuttonstartek5ggoq = (getButtonStartEK5gGoQ) getexponentimpl.read;
                                                                                        String[] strArr = new String[1];
                                                                                        String strValueOf = String.valueOf(j);
                                                                                        z = false;
                                                                                        try {
                                                                                            strArr[0] = strValueOf;
                                                                                            getbuttonstartek5ggoq.RemoteActionCompatParcelizer(strArr);
                                                                                            map3.remove(url.toString());
                                                                                            map2.remove(url.toString());
                                                                                            inputStream = inputStream2;
                                                                                            getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                                            str3 = str3;
                                                                                        } catch (Throwable th7) {
                                                                                            th = th7;
                                                                                            inputStream = inputStream2;
                                                                                            z2 = z;
                                                                                            getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                                            str3 = str3;
                                                                                            if (inputStream != null) {
                                                                                                inputStream.close();
                                                                                            }
                                                                                            httpURLConnection.disconnect();
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (Throwable th8) {
                                                                                        th = th8;
                                                                                        z = false;
                                                                                    }
                                                                                } catch (Throwable th9) {
                                                                                    th = th9;
                                                                                    z = false;
                                                                                    inputStream = inputStream2;
                                                                                    z2 = z;
                                                                                    getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                                    str3 = str3;
                                                                                    if (inputStream != null) {
                                                                                        inputStream.close();
                                                                                    }
                                                                                    httpURLConnection.disconnect();
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th10) {
                                                                                th = th10;
                                                                            }
                                                                        } catch (Throwable th11) {
                                                                            th = th11;
                                                                            z = false;
                                                                            getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                            str3 = str3;
                                                                            z2 = z;
                                                                            if (inputStream != null) {
                                                                                inputStream.close();
                                                                            }
                                                                            httpURLConnection.disconnect();
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    if (inputStream != null) {
                                                                        try {
                                                                            inputStream.close();
                                                                        } catch (IOException e2) {
                                                                            e = e2;
                                                                            z2 = z;
                                                                            getButtonThumbLeftEK5gGoQ.serializer("Exception sending hit to " + url.toString() + str3 + e.getClass().getSimpleName());
                                                                            getButtonThumbLeftEK5gGoQ.serializer(e.getMessage());
                                                                            getexponentimpl.serializer(getbutton9ek5ggoq);
                                                                            String string3 = url.toString();
                                                                            accessgettvinputcomposite1cp.getClass();
                                                                            map2.put(string3, Long.valueOf(System.currentTimeMillis()));
                                                                            if (map3.containsKey(url.toString())) {
                                                                                long jLongValue2 = ((Long) map3.get(url.toString())).longValue();
                                                                                jMin = Math.min(jLongValue2 + jLongValue2, 600000L);
                                                                            } else {
                                                                                jMin = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
                                                                            }
                                                                            map3.put(url.toString(), Long.valueOf(jMin));
                                                                            getButtonThumbLeftEK5gGoQ.serializer("URL resulting in exception can be retried in " + jMin + "ms. URL: " + url.toString());
                                                                        }
                                                                    }
                                                                    httpURLConnection.disconnect();
                                                                    z2 = z;
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    z = false;
                                                                    getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                                    str3 = str3;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                z = false;
                                                                z2 = z;
                                                                if (inputStream != null) {
                                                                    inputStream.close();
                                                                }
                                                                httpURLConnection.disconnect();
                                                                throw th;
                                                            }
                                                        } else {
                                                            getButtonThumbLeftEK5gGoQ.serializer("Unrecongnized HTTP method " + str + ". Supported methods are GET, HEAD, PUT and/or POST");
                                                            ((getButtonStartEK5gGoQ) getexponentimpl.read).RemoteActionCompatParcelizer(new String[]{String.valueOf(j)});
                                                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                                        }
                                                        httpURLConnection.disconnect();
                                                        z2 = false;
                                                        str3 = str3;
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        inputStream = null;
                                                        getbutton9ek5ggoq = getbutton9ek5ggoq;
                                                        str3 = str3;
                                                        z2 = true;
                                                        if (inputStream != null) {
                                                            inputStream.close();
                                                        }
                                                        httpURLConnection.disconnect();
                                                        throw th;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    str3 = str3;
                                                }
                                            } catch (Throwable th16) {
                                                th = th16;
                                                str3 = str3;
                                                getbutton9ek5ggoq = getbutton9ek5ggoq2;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            str3 = str3;
                                            getbutton9ek5ggoq = getbutton9ek5ggoq2;
                                            accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                        }
                                    } else {
                                        str3 = str3;
                                        getbutton9ek5ggoq = getbutton9ek5ggoq2;
                                        accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                                    }
                                    httpURLConnection.disconnect();
                                    z2 = false;
                                    str3 = str3;
                                } catch (IOException e3) {
                                    e = e3;
                                    getbutton9ek5ggoq = getbutton9ek5ggoq;
                                    str3 = str3;
                                    z = false;
                                    z2 = z;
                                    getButtonThumbLeftEK5gGoQ.serializer("Exception sending hit to " + url.toString() + str3 + e.getClass().getSimpleName());
                                    getButtonThumbLeftEK5gGoQ.serializer(e.getMessage());
                                    getexponentimpl.serializer(getbutton9ek5ggoq);
                                    String string4 = url.toString();
                                    accessgettvinputcomposite1cp.getClass();
                                    map2.put(string4, Long.valueOf(System.currentTimeMillis()));
                                    if (map3.containsKey(url.toString())) {
                                        long jLongValue3 = ((Long) map3.get(url.toString())).longValue();
                                        jMin = Math.min(jLongValue3 + jLongValue3, 600000L);
                                    } else {
                                        jMin = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
                                    }
                                    map3.put(url.toString(), Long.valueOf(jMin));
                                    getButtonThumbLeftEK5gGoQ.serializer("URL resulting in exception can be retried in " + jMin + "ms. URL: " + url.toString());
                                }
                                httpURLConnection.setRequestProperty(ConstantKt.USER_AGENT_HEADER, this.serializer);
                                if (map != null) {
                                    while (r3.hasNext()) {
                                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                    }
                                }
                                if (str == null) {
                                    getButtonThumbLeftEK5gGoQ.serializer(String.format("Hit %d retrieved from the store has null HTTP method.", Long.valueOf(j)));
                                    ((getButtonStartEK5gGoQ) getexponentimpl.read).RemoteActionCompatParcelizer(new String[]{String.valueOf(j)});
                                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                } else {
                                    if (str.equals("GET")) {
                                    }
                                    switch (str.hashCode()) {
                                        case 70454:
                                            if (str.equals("GET")) {
                                                if (str2 != null) {
                                                    getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                                }
                                                httpURLConnection.setRequestMethod(str);
                                            }
                                            break;
                                        case 79599:
                                            if (str.equals("PUT")) {
                                                httpURLConnection.setRequestMethod(str);
                                                if (str2 != null) {
                                                    httpURLConnection.setDoOutput(true);
                                                    byte[] bytes3 = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                                    httpURLConnection.setFixedLengthStreamingMode(bytes3.length);
                                                    BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                    bufferedOutputStream3.write(bytes3);
                                                    bufferedOutputStream3.flush();
                                                    bufferedOutputStream3.close();
                                                }
                                            }
                                            break;
                                        case 2213344:
                                            if (str.equals("HEAD")) {
                                                if (str2 != null) {
                                                    getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                                }
                                                httpURLConnection.setRequestMethod(str);
                                            }
                                            break;
                                        case 2461856:
                                            if (str.equals("POST")) {
                                                httpURLConnection.setRequestMethod(str);
                                                if (str2 != null) {
                                                    httpURLConnection.setDoOutput(true);
                                                    byte[] bytes4 = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                                    httpURLConnection.setFixedLengthStreamingMode(bytes4.length);
                                                    BufferedOutputStream bufferedOutputStream4 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                    bufferedOutputStream4.write(bytes4);
                                                    bufferedOutputStream4.flush();
                                                    bufferedOutputStream4.close();
                                                }
                                            }
                                            break;
                                    }
                                    responseCode = httpURLConnection.getResponseCode();
                                    Object[] objArr3 = new Object[1];
                                    objArr3[0] = 2;
                                    ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr3, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                    if (responseCode >= 200) {
                                        z = false;
                                        String string5 = url.toString();
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Bad response received for ");
                                        sb3.append(string5);
                                        str3 = str3;
                                        sb3.append(str3);
                                        sb3.append(responseCode);
                                        getButtonThumbLeftEK5gGoQ.serializer(sb3.toString());
                                        sb = new StringBuilder();
                                        errorStream = httpURLConnection.getErrorStream();
                                        if (errorStream != null) {
                                            bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                            while (true) {
                                                line = bufferedReader.readLine();
                                                if (line != null) {
                                                    sb.append(line);
                                                } else {
                                                    getButtonThumbLeftEK5gGoQ.serializer("Error Message: " + sb.toString());
                                                    r9 = bufferedReader;
                                                }
                                            }
                                        } else {
                                            r9 = inputStream;
                                        }
                                        if (r9 != 0) {
                                            r9.close();
                                        }
                                        getbutton9ek5ggoq = getbutton9ek5ggoq;
                                        getexponentimpl.serializer(getbutton9ek5ggoq);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        httpURLConnection.disconnect();
                                        z2 = z;
                                    } else {
                                        z = false;
                                        String string6 = url.toString();
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("Bad response received for ");
                                        sb4.append(string6);
                                        str3 = str3;
                                        sb4.append(str3);
                                        sb4.append(responseCode);
                                        getButtonThumbLeftEK5gGoQ.serializer(sb4.toString());
                                        sb = new StringBuilder();
                                        errorStream = httpURLConnection.getErrorStream();
                                        if (errorStream != null) {
                                            bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                            while (true) {
                                                line = bufferedReader.readLine();
                                                if (line != null) {
                                                    sb.append(line);
                                                } else {
                                                    getButtonThumbLeftEK5gGoQ.serializer("Error Message: " + sb.toString());
                                                    r9 = bufferedReader;
                                                }
                                            }
                                        } else {
                                            r9 = inputStream;
                                        }
                                        if (r9 != 0) {
                                            r9.close();
                                        }
                                        getbutton9ek5ggoq = getbutton9ek5ggoq;
                                        getexponentimpl.serializer(getbutton9ek5ggoq);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        httpURLConnection.disconnect();
                                        z2 = z;
                                    }
                                }
                            } catch (Throwable th18) {
                                th = th18;
                            }
                            inputStream = null;
                        } catch (IOException e4) {
                            e = e4;
                            getbutton9ek5ggoq = getbutton9ek5ggoq2;
                            accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                            getButtonThumbLeftEK5gGoQ.serializer("Exception sending hit to " + url.toString() + str3 + e.getClass().getSimpleName());
                            getButtonThumbLeftEK5gGoQ.serializer(e.getMessage());
                            getexponentimpl.serializer(getbutton9ek5ggoq);
                            String string7 = url.toString();
                            accessgettvinputcomposite1cp.getClass();
                            map2.put(string7, Long.valueOf(System.currentTimeMillis()));
                            if (map3.containsKey(url.toString())) {
                                long jLongValue4 = ((Long) map3.get(url.toString())).longValue();
                                jMin = Math.min(jLongValue4 + jLongValue4, 600000L);
                            } else {
                                jMin = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;
                            }
                            map3.put(url.toString(), Long.valueOf(jMin));
                            getButtonThumbLeftEK5gGoQ.serializer("URL resulting in exception can be retried in " + jMin + "ms. URL: " + url.toString());
                            i3 = i2 + 1;
                            iMin = i;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        i2 = i3;
                    }
                }
            } else {
                long jLongValue5 = ((Long) map3.get(url.toString())).longValue();
                long jLongValue6 = ((Long) map2.get(url.toString())).longValue();
                accessgettvinputcomposite1cp2.getClass();
                if (jLongValue6 + jLongValue5 > System.currentTimeMillis()) {
                    getexponentimpl.serializer(getbutton9ek5ggoq2);
                    i = iMin;
                } else {
                    str = getbutton9ek5ggoq2.IconCompatParcelizer;
                    i = iMin;
                    map = getbutton9ek5ggoq2.RemoteActionCompatParcelizer;
                    str2 = getbutton9ek5ggoq2.RatingCompat;
                    if (url == null) {
                        getButtonThumbLeftEK5gGoQ.serializer("No destination: discarding hit.");
                        ((getButtonStartEK5gGoQ) getexponentimpl.read).RemoteActionCompatParcelizer(new String[]{String.valueOf(j)});
                        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                    } else {
                        i2 = i3;
                        httpURLConnection = (HttpURLConnection) url.openConnection();
                        if (z2) {
                            context = this.read;
                            int i5 = getButtonXEK5gGoQ.write;
                            accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                            getbutton9ek5ggoq = getbutton9ek5ggoq2;
                            intent = new Intent("com.google.analytics.RADIO_POWERED");
                            intent.addCategory(context.getPackageName());
                            str3 = str3;
                            intent.putExtra("com.google.android.gms.internal.gtm.zzbh", true);
                            if (Build.VERSION.SDK_INT < 34) {
                                context.sendBroadcast(intent);
                            } else {
                                inputStream = null;
                                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                            }
                            httpURLConnection.setRequestProperty(ConstantKt.USER_AGENT_HEADER, this.serializer);
                            if (map != null) {
                                while (r3.hasNext()) {
                                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                                }
                            }
                            if (str == null) {
                                getButtonThumbLeftEK5gGoQ.serializer(String.format("Hit %d retrieved from the store has null HTTP method.", Long.valueOf(j)));
                                ((getButtonStartEK5gGoQ) getexponentimpl.read).RemoteActionCompatParcelizer(new String[]{String.valueOf(j)});
                                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            } else {
                                if (str.equals("GET")) {
                                }
                                switch (str.hashCode()) {
                                    case 70454:
                                        if (str.equals("GET")) {
                                            if (str2 != null) {
                                                getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                            }
                                            httpURLConnection.setRequestMethod(str);
                                        }
                                        break;
                                    case 79599:
                                        if (str.equals("PUT")) {
                                            httpURLConnection.setRequestMethod(str);
                                            if (str2 != null) {
                                                httpURLConnection.setDoOutput(true);
                                                byte[] bytes5 = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                                httpURLConnection.setFixedLengthStreamingMode(bytes5.length);
                                                BufferedOutputStream bufferedOutputStream5 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                bufferedOutputStream5.write(bytes5);
                                                bufferedOutputStream5.flush();
                                                bufferedOutputStream5.close();
                                            }
                                        }
                                        break;
                                    case 2213344:
                                        if (str.equals("HEAD")) {
                                            if (str2 != null) {
                                                getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                            }
                                            httpURLConnection.setRequestMethod(str);
                                        }
                                        break;
                                    case 2461856:
                                        if (str.equals("POST")) {
                                            httpURLConnection.setRequestMethod(str);
                                            if (str2 != null) {
                                                httpURLConnection.setDoOutput(true);
                                                byte[] bytes6 = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                                httpURLConnection.setFixedLengthStreamingMode(bytes6.length);
                                                BufferedOutputStream bufferedOutputStream6 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                                bufferedOutputStream6.write(bytes6);
                                                bufferedOutputStream6.flush();
                                                bufferedOutputStream6.close();
                                            }
                                        }
                                        break;
                                }
                                responseCode = httpURLConnection.getResponseCode();
                                Object[] objArr4 = new Object[1];
                                objArr4[0] = 2;
                                ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr4, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                                if (responseCode >= 200) {
                                    z = false;
                                    String string8 = url.toString();
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Bad response received for ");
                                    sb5.append(string8);
                                    str3 = str3;
                                    sb5.append(str3);
                                    sb5.append(responseCode);
                                    getButtonThumbLeftEK5gGoQ.serializer(sb5.toString());
                                    sb = new StringBuilder();
                                    errorStream = httpURLConnection.getErrorStream();
                                    if (errorStream != null) {
                                        bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                        while (true) {
                                            line = bufferedReader.readLine();
                                            if (line != null) {
                                                sb.append(line);
                                            } else {
                                                getButtonThumbLeftEK5gGoQ.serializer("Error Message: " + sb.toString());
                                                r9 = bufferedReader;
                                            }
                                        }
                                    } else {
                                        r9 = inputStream;
                                    }
                                    if (r9 != 0) {
                                        r9.close();
                                    }
                                    getbutton9ek5ggoq = getbutton9ek5ggoq;
                                    getexponentimpl.serializer(getbutton9ek5ggoq);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    httpURLConnection.disconnect();
                                    z2 = z;
                                } else {
                                    z = false;
                                    String string9 = url.toString();
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Bad response received for ");
                                    sb6.append(string9);
                                    str3 = str3;
                                    sb6.append(str3);
                                    sb6.append(responseCode);
                                    getButtonThumbLeftEK5gGoQ.serializer(sb6.toString());
                                    sb = new StringBuilder();
                                    errorStream = httpURLConnection.getErrorStream();
                                    if (errorStream != null) {
                                        bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                        while (true) {
                                            line = bufferedReader.readLine();
                                            if (line != null) {
                                                sb.append(line);
                                            } else {
                                                getButtonThumbLeftEK5gGoQ.serializer("Error Message: " + sb.toString());
                                                r9 = bufferedReader;
                                            }
                                        }
                                    } else {
                                        r9 = inputStream;
                                    }
                                    if (r9 != 0) {
                                        r9.close();
                                    }
                                    getbutton9ek5ggoq = getbutton9ek5ggoq;
                                    getexponentimpl.serializer(getbutton9ek5ggoq);
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    httpURLConnection.disconnect();
                                    z2 = z;
                                }
                            }
                            httpURLConnection.disconnect();
                            z2 = false;
                            str3 = str3;
                        } else {
                            str3 = str3;
                            getbutton9ek5ggoq = getbutton9ek5ggoq2;
                            accessgettvinputcomposite1cp = accessgettvinputcomposite1cp2;
                        }
                        inputStream = null;
                        httpURLConnection.setRequestProperty(ConstantKt.USER_AGENT_HEADER, this.serializer);
                        if (map != null) {
                            while (r3.hasNext()) {
                                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        if (str == null) {
                            getButtonThumbLeftEK5gGoQ.serializer(String.format("Hit %d retrieved from the store has null HTTP method.", Long.valueOf(j)));
                            ((getButtonStartEK5gGoQ) getexponentimpl.read).RemoteActionCompatParcelizer(new String[]{String.valueOf(j)});
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                        } else {
                            if (str.equals("GET")) {
                            }
                            switch (str.hashCode()) {
                                case 70454:
                                    if (str.equals("GET")) {
                                        if (str2 != null) {
                                            getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                        }
                                        httpURLConnection.setRequestMethod(str);
                                    }
                                    break;
                                case 79599:
                                    if (str.equals("PUT")) {
                                        httpURLConnection.setRequestMethod(str);
                                        if (str2 != null) {
                                            httpURLConnection.setDoOutput(true);
                                            byte[] bytes7 = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                            httpURLConnection.setFixedLengthStreamingMode(bytes7.length);
                                            BufferedOutputStream bufferedOutputStream7 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                            bufferedOutputStream7.write(bytes7);
                                            bufferedOutputStream7.flush();
                                            bufferedOutputStream7.close();
                                        }
                                    }
                                    break;
                                case 2213344:
                                    if (str.equals("HEAD")) {
                                        if (str2 != null) {
                                            getButtonThumbLeftEK5gGoQ.serializer("Body of " + str + " hit is ignored: " + str2 + ".");
                                        }
                                        httpURLConnection.setRequestMethod(str);
                                    }
                                    break;
                                case 2461856:
                                    if (str.equals("POST")) {
                                        httpURLConnection.setRequestMethod(str);
                                        if (str2 != null) {
                                            httpURLConnection.setDoOutput(true);
                                            byte[] bytes8 = str2.getBytes(Charset.forName(com.adjust.sdk.Constants.ENCODING));
                                            httpURLConnection.setFixedLengthStreamingMode(bytes8.length);
                                            BufferedOutputStream bufferedOutputStream8 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                            bufferedOutputStream8.write(bytes8);
                                            bufferedOutputStream8.flush();
                                            bufferedOutputStream8.close();
                                        }
                                    }
                                    break;
                            }
                            responseCode = httpURLConnection.getResponseCode();
                            Object[] objArr5 = new Object[1];
                            objArr5[0] = 2;
                            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), objArr5, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
                            if (responseCode >= 200) {
                                z = false;
                                String string10 = url.toString();
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("Bad response received for ");
                                sb7.append(string10);
                                str3 = str3;
                                sb7.append(str3);
                                sb7.append(responseCode);
                                getButtonThumbLeftEK5gGoQ.serializer(sb7.toString());
                                sb = new StringBuilder();
                                errorStream = httpURLConnection.getErrorStream();
                                if (errorStream != null) {
                                    bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                    while (true) {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            sb.append(line);
                                        } else {
                                            getButtonThumbLeftEK5gGoQ.serializer("Error Message: " + sb.toString());
                                            r9 = bufferedReader;
                                        }
                                    }
                                } else {
                                    r9 = inputStream;
                                }
                                if (r9 != 0) {
                                    r9.close();
                                }
                                getbutton9ek5ggoq = getbutton9ek5ggoq;
                                getexponentimpl.serializer(getbutton9ek5ggoq);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                httpURLConnection.disconnect();
                                z2 = z;
                            } else {
                                z = false;
                                String string11 = url.toString();
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append("Bad response received for ");
                                sb8.append(string11);
                                str3 = str3;
                                sb8.append(str3);
                                sb8.append(responseCode);
                                getButtonThumbLeftEK5gGoQ.serializer(sb8.toString());
                                sb = new StringBuilder();
                                errorStream = httpURLConnection.getErrorStream();
                                if (errorStream != null) {
                                    bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
                                    while (true) {
                                        line = bufferedReader.readLine();
                                        if (line != null) {
                                            sb.append(line);
                                        } else {
                                            getButtonThumbLeftEK5gGoQ.serializer("Error Message: " + sb.toString());
                                            r9 = bufferedReader;
                                        }
                                    }
                                } else {
                                    r9 = inputStream;
                                }
                                if (r9 != 0) {
                                    r9.close();
                                }
                                getbutton9ek5ggoq = getbutton9ek5ggoq;
                                getexponentimpl.serializer(getbutton9ek5ggoq);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                httpURLConnection.disconnect();
                                z2 = z;
                            }
                        }
                        httpURLConnection.disconnect();
                        z2 = false;
                        str3 = str3;
                    }
                }
                str3 = str3;
                i2 = i3;
                str3 = str3;
            }
            i3 = i2 + 1;
            iMin = i;
        }
    }
}
