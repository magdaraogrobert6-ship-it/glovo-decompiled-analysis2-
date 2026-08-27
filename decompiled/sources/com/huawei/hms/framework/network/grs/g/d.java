package com.huawei.hms.framework.network.grs.g;

import android.text.TextUtils;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f30o = "d";
    private Map<String, List<String>> a;
    private byte[] b;
    private int c;
    private long d;
    private long e;
    private long f;
    private String g;
    private int h;
    private int i;
    private String j;
    private long k;
    private String l;
    private Exception m;
    private String n;

    private void d(String str) {
    }

    private void e(String str) {
    }

    public void a(int i) {
    }

    public Exception d() {
        return this.m;
    }

    public String e() {
        return this.l;
    }

    public int f() {
        return this.h;
    }

    public long g() {
        return this.f;
    }

    public long h() {
        return this.e;
    }

    public long i() {
        return this.d;
    }

    public String j() {
        return this.g;
    }

    public long k() {
        return this.k;
    }

    public String l() {
        return this.n;
    }

    public boolean m() {
        return this.c == 304;
    }

    public boolean n() {
        return this.c == 503;
    }

    public boolean o() {
        return this.c == 200;
    }

    private void a(Map<String, String> map) {
        if (!map.containsKey("ETag")) {
            Logger.i(f30o, "Response Heads has not Etag");
            return;
        }
        String str = map.get("ETag");
        if (TextUtils.isEmpty(str)) {
            Logger.i(f30o, "The Response Heads Etag is Empty");
        } else {
            Logger.i(f30o, "success get Etag from server");
            a(str);
        }
    }

    private void b(Map<String, String> map) {
        long time;
        if (map.containsKey("Cache-Control")) {
            String str = map.get("Cache-Control");
            if (TextUtils.isEmpty(str) || !str.contains("max-age=")) {
                time = 0;
            } else {
                try {
                    time = Long.parseLong(str.substring(str.indexOf("max-age=") + 8));
                    try {
                        Logger.v(f30o, "Cache-Control value{%s}", Long.valueOf(time));
                    } catch (NumberFormatException e) {
                        e = e;
                        Logger.w(f30o, "getExpireTime addHeadersToResult NumberFormatException", e);
                    }
                } catch (NumberFormatException e2) {
                    e = e2;
                    time = 0;
                }
            }
        } else {
            if (map.containsKey("Expires")) {
                String str2 = map.get("Expires");
                Logger.v(f30o, "expires is{%s}", str2);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss 'GMT'", Locale.ROOT);
                String str3 = map.containsKey("Date") ? map.get("Date") : null;
                try {
                    time = (simpleDateFormat.parse(str2).getTime() - (TextUtils.isEmpty(str3) ? new Date() : simpleDateFormat.parse(str3)).getTime()) / 1000;
                } catch (ParseException e3) {
                    Logger.w(f30o, "getExpireTime ParseException.", e3);
                    time = 0;
                }
            } else {
                Logger.i(f30o, "response headers neither contains Cache-Control nor Expires.");
            }
            time = 0;
        }
        if (time <= 0 || time > 2592000) {
            time = ConstantsKt.DEFAULT_PROFILE_TTL;
        }
        long j = time * 1000;
        Logger.i(f30o, "convert expireTime{%s}", Long.valueOf(j));
        c(String.valueOf(System.currentTimeMillis() + j));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    private void c(Map<String, String> map) {
        long j;
        if (map.containsKey("Retry-After")) {
            String str = map.get("Retry-After");
            if (TextUtils.isEmpty(str)) {
                j = 0;
            } else {
                try {
                    j = Long.parseLong(str);
                } catch (NumberFormatException e) {
                    Logger.w(f30o, "getRetryAfter addHeadersToResult NumberFormatException", e);
                    j = 0;
                }
            }
        } else {
            j = 0;
        }
        long j2 = j * 1000;
        Logger.v(f30o, "convert retry-afterTime{%s}", Long.valueOf(j2));
        c(j2);
    }

    private void f(String str) {
        this.g = str;
    }

    private void s() {
        q();
        p();
    }

    public d(int i, Map<String, List<String>> map, byte[] bArr, long j) {
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.c = i;
        this.a = map;
        this.b = ByteBuffer.wrap(bArr).array();
        this.d = j;
        s();
    }

    private Map<String, String> r() {
        HashMap map = new HashMap(16);
        Map<String, List<String>> map2 = this.a;
        if (map2 != null && map2.size() > 0) {
            for (Map.Entry<String, List<String>> entry : this.a.entrySet()) {
                String key = entry.getKey();
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    map.put(key, it.next());
                }
            }
            return map;
        }
        Logger.v(f30o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
        return map;
    }

    private void q() {
        if (o() || n() || m()) {
            Map<String, String> mapR = r();
            if (mapR.size() <= 0) {
                Logger.w(f30o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (o() || m()) {
                    b(mapR);
                    a(mapR);
                }
                if (n()) {
                    c(mapR);
                }
            } catch (JSONException e) {
                Logger.w(f30o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054  */
    private void p() {
        int i;
        if (m()) {
            Logger.i(f30o, "GRSSDK get httpcode{304} not any changed.");
            c(1);
            return;
        }
        if (!o()) {
            Logger.i(f30o, "GRSSDK parse server body all failed.");
            c(2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.b));
            if (jSONObject.has("isSuccess")) {
                if (jSONObject.getInt("isSuccess") == 1) {
                    i = 1;
                } else {
                    i = 2;
                }
            } else if (!jSONObject.has("resultCode")) {
                Logger.e(f30o, "sth. wrong because server errorcode's key.");
                i = -1;
            } else if (jSONObject.getInt("resultCode") == 0) {
                i = 1;
            } else {
                i = 2;
            }
            if (i != 1 && jSONObject.has("services")) {
                i = 0;
            }
            c(i);
            if (i == 1 || i == 0) {
                f(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                e(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                b(jSONObject.has("errorCode") ? jSONObject.getInt("errorCode") : ConnectionResult.RESOLUTION_REQUIRED);
                d(jSONObject.has("errorDesc") ? jSONObject.getString("errorDesc") : "");
            }
        } catch (JSONException e) {
            Logger.w(f30o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e.getMessage()));
            c(2);
        }
    }

    public d(Exception exc, long j) {
        this.c = 0;
        this.h = 2;
        this.i = ConnectionResult.RESOLUTION_REQUIRED;
        this.j = "";
        this.k = 0L;
        this.l = "";
        this.m = exc;
        this.d = j;
    }

    public void a(long j) {
        this.f = j;
    }

    public void a(String str) {
        this.l = str;
    }

    public String a() {
        return this.j;
    }

    private void c(int i) {
        this.h = i;
    }

    private void c(long j) {
        this.k = j;
    }

    private void c(String str) {
        this.j = str;
    }

    public int c() {
        return this.i;
    }

    private void b(int i) {
        this.i = i;
    }

    public void b(long j) {
        this.e = j;
    }

    public void b(String str) {
        this.n = str;
    }

    public int b() {
        return this.c;
    }
}
