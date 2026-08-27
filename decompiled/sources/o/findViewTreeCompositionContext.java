package o;

import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.location.ephemeris.net.EphemerisResponse;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.http.interceptor.UcsAuthInterceptor;
import com.huawei.riemann.location.bean.eph.BdsEphemeris;
import com.huawei.riemann.location.bean.eph.BdsIon;
import com.huawei.riemann.location.bean.eph.BdsNav;
import com.huawei.riemann.location.bean.eph.BdsTim;
import com.huawei.riemann.location.bean.eph.Ephemeris;
import com.huawei.riemann.location.bean.eph.GalileoEphemeris;
import com.huawei.riemann.location.bean.eph.GalileoNav;
import com.huawei.riemann.location.bean.eph.GalileoTim;
import com.huawei.riemann.location.bean.eph.GlonassEphemeris;
import com.huawei.riemann.location.bean.eph.GlonassNav;
import com.huawei.riemann.location.bean.eph.GlonassTim;
import com.huawei.riemann.location.bean.eph.GpsEphemeris;
import com.huawei.riemann.location.bean.eph.GpsIon;
import com.huawei.riemann.location.bean.eph.GpsNav;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import com.mapbox.search.base.MetadataExtKt;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class findViewTreeCompositionContext {
    public static long IconCompatParcelizer = 0;
    public static long RemoteActionCompatParcelizer = 0;
    public static boolean write = false;
    public pluralStringResource read;

    public static JSONArray IconCompatParcelizer(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getBdsNav()).getJSONArray("ephList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphModule", "getBdsNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public static JSONArray RemoteActionCompatParcelizer(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getGloNav()).getJSONArray("gloNavItemList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphModule", "getGloNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public static JSONArray read(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getGpsNav()).getJSONArray("ephList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphModule", "getGpsNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public static JSONArray serializer(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getGalNav()).getJSONArray("ephList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphModule", "getGalNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public final GpsEphemeris MediaSessionCompatQueueItem(EphemerisResponse ephemerisResponse) throws JSONException {
        pluralStringResource pluralstringresource = this.read;
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getGpsIon());
        pluralstringresource.getClass();
        GpsIon gpsIonBuild = GpsIon.Builder.aGpsIon().withA0(jSONObject.optDouble("a0", 0.0d) / 1.073741824E9d).withA1(jSONObject.optDouble("a1", 0.0d) / 1.34217728E8d).withA2(jSONObject.optDouble("a2", 0.0d) / 1.6777216E7d).withA3(jSONObject.optDouble("a3", 0.0d) / 1.6777216E7d).withB0(jSONObject.optInt("b0", 0) * androidx.compose.ui.graphics.Fields.CameraDistance).withB1(jSONObject.optInt("b1", 0) * androidx.compose.ui.graphics.Fields.Clip).withB2(jSONObject.optInt("b2", 0) * 65536).withB3(jSONObject.optInt("b3", 0) * 65536).withValid(jSONObject.optBoolean("valid")).build();
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getGpsNav());
        pluralStringResource pluralstringresource2 = this.read;
        JSONArray jSONArray = jSONObject2.getJSONArray("ephList");
        pluralstringresource2.getClass();
        GpsNav[] gpsNavArrWrite = pluralStringResource.write(jSONArray);
        WindowInfoImplCompanion.serializer(gpsNavArrWrite.length, "EphModule", new StringBuilder("GpsNav size = "));
        return GpsEphemeris.Builder.aGpsEphemeris().withSatNumber(jSONObject2.optInt("satNumber", 0)).withGpsNavs(gpsNavArrWrite).withGpsIon(gpsIonBuild).build();
    }

    public final GlonassEphemeris write(EphemerisResponse ephemerisResponse) throws JSONException {
        pluralStringResource pluralstringresource = this.read;
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getGloTim());
        pluralstringresource.getClass();
        GlonassTim glonassTimBuild = GlonassTim.Builder.aGlonassTim().withA0(jSONObject.optDouble("a0", 0.0d) / 3.4359738368E10d).withA1(jSONObject.optDouble("a1", 0.0d) / 2.251799813685248E15d).withA2((jSONObject.optDouble("a2", 0.0d) / 1.152921504606847E18d) / 256.0d).withGnssToId(jSONObject.optInt("gnssToId", 0)).withWeekNumber(jSONObject.optInt("weekNumber", 0)).withWeekSecond(jSONObject.optInt("weekSecond", 0) * 16).build();
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getGloNav());
        pluralStringResource pluralstringresource2 = this.read;
        JSONArray jSONArray = jSONObject2.getJSONArray("gloNavItemList");
        pluralstringresource2.getClass();
        GlonassNav[] glonassNavArrIconCompatParcelizer = pluralStringResource.IconCompatParcelizer(jSONArray);
        WindowInfoImplCompanion.serializer(glonassNavArrIconCompatParcelizer.length, "EphModule", new StringBuilder("GlonassNav size = "));
        int iOptInt = jSONObject2.optInt("satNumber", 0);
        return GlonassEphemeris.Builder.aGlonassEphemeris().withSatNumber(iOptInt).withNonBroadcastInd(jSONObject2.optInt("nonBroadcastInd", 0)).withGlonassNavs(glonassNavArrIconCompatParcelizer).withGlonassTim(glonassTimBuild).build();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085 A[LOOP:1: B:35:0x0085->B:47:0x00a4, LOOP_START, PHI: r1
  0x0085: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:24:0x0066, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[Catch: JsonSyntaxException -> 0x00f6, JSONException -> 0x00fa, TryCatch #8 {JsonSyntaxException -> 0x00f6, JSONException -> 0x00fa, blocks: (B:51:0x00c2, B:53:0x00c6, B:54:0x00cd), top: B:72:0x00c2 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public final Ephemeris RemoteActionCompatParcelizer() {
        String string;
        String[] strArrSplit;
        StringBuffer stringBuffer;
        String str;
        String str2;
        EphemerisResponse ephemerisResponse;
        try {
            FileInputStream fileInputStreamOpenFileInput = placeAtf8xVGno.read().openFileInput("ephData");
            try {
                byte[] bArr = new byte[androidx.compose.ui.graphics.Fields.RotationZ];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i = fileInputStreamOpenFileInput.read(bArr);
                    if (i <= 0) {
                        break;
                    }
                    sb.append(new String(bArr, 0, i, StandardCharsets.UTF_8));
                    WrappedCompositionsetContent1211.read("FileUtil", "read from file failed");
                    string = null;
                    if (string == null) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "read Ephemeris From Json is null");
                        return null;
                    }
                    strArrSplit = string.split("\n");
                    stringBuffer = new StringBuffer();
                    str = "";
                    if (strArrSplit.length == 1) {
                        if (!TextUtils.isEmpty("LOCATION_LITE_SDK") || TextUtils.isEmpty(string)) {
                            WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
                        } else {
                            try {
                                str = AesGcmKS.read("LOCATION_LITE_SDK", string);
                            } catch (Exception unused) {
                                WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS decrypt failed");
                            }
                        }
                        stringBuffer.append(str);
                    } else {
                        for (String str3 : strArrSplit) {
                            if (!TextUtils.isEmpty("LOCATION_LITE_SDK") || TextUtils.isEmpty(str3)) {
                                WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
                            } else {
                                try {
                                    str2 = AesGcmKS.read("LOCATION_LITE_SDK", str3);
                                } catch (Exception unused2) {
                                    WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS decrypt failed");
                                    str2 = "";
                                }
                                stringBuffer.append(str2);
                            }
                            str2 = "";
                            stringBuffer.append(str2);
                        }
                    }
                    try {
                        ephemerisResponse = (EphemerisResponse) new Gson().fromJson(stringBuffer.toString().trim(), EphemerisResponse.class);
                        if (ephemerisResponse == null) {
                            return null;
                        }
                        try {
                            if (this.read == null) {
                                this.read = new pluralStringResource();
                            }
                            GpsEphemeris gpsEphemerisMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(ephemerisResponse);
                            return Ephemeris.Builder.anEphemeris().withGpsEphemeris(gpsEphemerisMediaSessionCompatQueueItem).withBdsEphemeris(RatingCompat(ephemerisResponse)).withGalileoEphemeris(MediaDescriptionCompat(ephemerisResponse)).withGlonassEphemeris(write(ephemerisResponse)).build();
                        } catch (JsonSyntaxException unused3) {
                            WrappedCompositionsetContent1211.read("EphModule", "json syntax error");
                            return null;
                        } catch (JSONException e) {
                            WrappedCompositionsetContent1211.read("EphModule", "jsonException:" + e.getMessage());
                            return null;
                        }
                    } catch (JsonSyntaxException unused4) {
                        WrappedCompositionsetContent1211.read("EphModule", "json syntax error");
                        return null;
                    }
                }
                string = sb.toString();
                fileInputStreamOpenFileInput.close();
            } catch (Throwable th) {
                if (fileInputStreamOpenFileInput != null) {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            WrappedCompositionsetContent1211.read("FileUtil", "read from file failed");
            string = null;
        }
        if (string == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "read Ephemeris From Json is null");
            return null;
        }
        strArrSplit = string.split("\n");
        stringBuffer = new StringBuffer();
        str = "";
        if (strArrSplit.length == 1) {
            if (TextUtils.isEmpty("LOCATION_LITE_SDK")) {
                WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
            } else {
                WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
            }
            stringBuffer.append(str);
        } else {
            while (i < strArrSplit.length) {
                if (TextUtils.isEmpty("LOCATION_LITE_SDK")) {
                    WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
                    str2 = "";
                } else {
                    WrappedCompositionsetContent1211.read("AesSecurityCipher", "decrypt alias or content is null");
                    str2 = "";
                }
                stringBuffer.append(str2);
            }
        }
        ephemerisResponse = (EphemerisResponse) new Gson().fromJson(stringBuffer.toString().trim(), EphemerisResponse.class);
        if (ephemerisResponse == null) {
            return null;
        }
        if (this.read == null) {
            this.read = new pluralStringResource();
        }
        GpsEphemeris gpsEphemerisMediaSessionCompatQueueItem2 = MediaSessionCompatQueueItem(ephemerisResponse);
        return Ephemeris.Builder.anEphemeris().withGpsEphemeris(gpsEphemerisMediaSessionCompatQueueItem2).withBdsEphemeris(RatingCompat(ephemerisResponse)).withGalileoEphemeris(MediaDescriptionCompat(ephemerisResponse)).withGlonassEphemeris(write(ephemerisResponse)).build();
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0478  */
    /* JADX WARN: Code duplicated, block: B:141:0x04af  */
    /* JADX WARN: Code duplicated, block: B:142:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:144:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:145:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x04be  */
    /* JADX WARN: Code duplicated, block: B:150:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:152:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:153:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x04d6 A[LOOP:4: B:154:0x04d3->B:156:0x04d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:160:0x04ee A[LOOP:5: B:158:0x04eb->B:160:0x04ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x0506 A[LOOP:6: B:162:0x0503->B:164:0x0506, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:167:0x051d A[LOOP:7: B:166:0x051b->B:167:0x051d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x0562  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    public final boolean IconCompatParcelizer() {
        String string;
        boolean z;
        long j;
        boolean z2;
        String str;
        long jMin;
        int i;
        int length;
        String strSerializer;
        GpsNav[] gpsNavArrWrite;
        BdsNav[] bdsNavArrSerializer;
        GalileoNav[] galileoNavArr;
        GlonassNav[] glonassNavArrIconCompatParcelizer;
        int toe;
        ?? r8;
        int toe2;
        ?? r9;
        int toe3;
        ?? r10;
        int iod;
        int i2;
        long jM;
        String str2;
        int i3;
        StringBuilder sb;
        String message;
        int i4 = 0;
        WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer1 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 0);
        StringBuilder sb2 = new StringBuilder("gpsTime = ");
        long j2 = windowRecomposerPolicycreateAndInstallWindowRecomposer1.RemoteActionCompatParcelizer;
        sb2.append(j2);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", sb2.toString());
        if (j2 <= write()) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "local ephemeris is valid");
            return true;
        }
        if (write) {
            return false;
        }
        if (System.currentTimeMillis() - RemoteActionCompatParcelizer < 60000) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "refreshEphemeris not ready");
            return false;
        }
        write = true;
        WindowRecomposerPolicycreateAndInstallWindowRecomposerunsetJob1 windowRecomposerPolicycreateAndInstallWindowRecomposerunsetJob1 = new WindowRecomposerPolicycreateAndInstallWindowRecomposerunsetJob1();
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlineEphService", "get online eph data");
        EphemerisResponse ephemerisResponse = new EphemerisResponse();
        try {
            JSONObject jSONObject = new JSONObject(new Gson().toJson(windowRecomposerPolicycreateAndInstallWindowRecomposerunsetJob1));
            try {
                try {
                    new JSONObject();
                    String string2 = jSONObject.toString();
                    String strIconCompatParcelizer = onChange.IconCompatParcelizer(com.huawei.hms.location.BuildConfig.LIBRARY_PACKAGE_NAME);
                    if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                        WrappedCompositionsetContent1211.read("OnlineEphService", "grsHostAddress is null");
                    } else {
                        String packageName = placeAtf8xVGno.read().getPackageName();
                        com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(UUID.randomUUID().toString());
                        performanceTracker.IconCompatParcelizer(packageName);
                        WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12("/networklocation/v1/gnssData");
                        wrappedCompositionsetContent12.MediaMetadataCompat = strIconCompatParcelizer;
                        wrappedCompositionsetContent12.write = performanceTracker;
                        wrappedCompositionsetContent12.RemoteActionCompatParcelizer = string2.getBytes();
                        wrappedCompositionsetContent12.RatingCompat = "application/json; charset=utf-8";
                        placeAtf8xVGno.read();
                        ArrayList arrayList = new ArrayList(4);
                        new ArrayList(4);
                        accessgetDisposedp accessgetdisposedp = new accessgetDisposedp();
                        accessgetdisposedp.write = arrayList;
                        ArrayList arrayList2 = accessgetdisposedp.write;
                        arrayList2.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(2));
                        UcsAuthInterceptor ucsAuthInterceptor = new UcsAuthInterceptor();
                        ucsAuthInterceptor.write = 0;
                        arrayList2.add(ucsAuthInterceptor);
                        arrayList2.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(i4));
                        WrappedCompositionsetContent1211.read();
                        r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ r8lambdauggauuj_lbnzvef8yyxtwmhrlkq = new r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ();
                        InAppMessageBoundedLayout inAppMessageBoundedLayout = accessgetDisposedp.RemoteActionCompatParcelizer;
                        inAppMessageBoundedLayout.getClass();
                        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.MediaDescriptionCompat = inAppMessageBoundedLayout;
                        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = false;
                        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.write(Collections.unmodifiableList(Arrays.asList(r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_2, r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc.HTTP_1_1)));
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.RemoteActionCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
                        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq._init_lambda2 = setWebViewContent.read("timeout", DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
                        r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.read(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM, timeUnit);
                        try {
                            r8lambdauggauuj_lbnzvef8yyxtwmhrlkq.IconCompatParcelizer(RelativeScroller.serializer(placeAtf8xVGno.read(), new SecureRandom()), MetadataExtKt.read(placeAtf8xVGno.read()));
                        } catch (Exception unused) {
                            WrappedCompositionsetContent1211.read("HttpClientReal", "init ssl socket factory failed");
                        }
                        accessgetdisposedp.IconCompatParcelizer = new r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0(r8lambdauggauuj_lbnzvef8yyxtwmhrlkq);
                        EphemerisResponse ephemerisResponse2 = (EphemerisResponse) new SubmitEx(wrappedCompositionsetContent12.RemoteActionCompatParcelizer(), accessgetdisposedp).RemoteActionCompatParcelizer(EphemerisResponse.class);
                        try {
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlineEphService", "doHttp, response code is " + ephemerisResponse2.getApiCode());
                            ephemerisResponse = ephemerisResponse2;
                        } catch (Exception unused2) {
                            ephemerisResponse = ephemerisResponse2;
                            string = "unknown exception";
                            WrappedCompositionsetContent1211.read("OnlineEphService", string);
                        } catch (WrappedCompositionsetContent1 e) {
                            e = e;
                            ephemerisResponse = ephemerisResponse2;
                            sb = new StringBuilder("doHttp, OnErrorException: code is ");
                            sb.append(e.read);
                            sb.append(", msg is ");
                            message = e.RemoteActionCompatParcelizer;
                            sb.append(message);
                            string = sb.toString();
                            WrappedCompositionsetContent1211.read("OnlineEphService", string);
                        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e2) {
                            e = e2;
                            ephemerisResponse = ephemerisResponse2;
                            sb = new StringBuilder("doHttp, OnFailureException: code is ");
                            sb.append(e.serializer);
                            sb.append(", msg is ");
                            message = e.getMessage();
                            sb.append(message);
                            string = sb.toString();
                            WrappedCompositionsetContent1211.read("OnlineEphService", string);
                        }
                    }
                } catch (Exception unused3) {
                }
            } catch (WrappedCompositionsetContent1 e3) {
                e = e3;
            } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e4) {
                e = e4;
            }
        } catch (JSONException unused4) {
            string = "doHttp, transfer to JSONException failed";
        }
        if (!ephemerisResponse.isSuccess()) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "get online ephemeris failed");
            RemoteActionCompatParcelizer = System.currentTimeMillis();
            write = false;
            z = false;
        } else if (ephemerisResponse.getBdsNav() == null || ephemerisResponse.getGpsNav() == null) {
            z = false;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "get online ephemeris contains illegal arguments");
            RemoteActionCompatParcelizer = System.currentTimeMillis();
            write = false;
        } else {
            JSONArray jSONArray = read(ephemerisResponse);
            JSONArray jSONArrayIconCompatParcelizer = IconCompatParcelizer(ephemerisResponse);
            JSONArray jSONArraySerializer = serializer(ephemerisResponse);
            JSONArray jSONArrayRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(ephemerisResponse);
            if (jSONArray.length() == 0 || jSONArrayIconCompatParcelizer.length() == 0 || jSONArraySerializer.length() == 0 || jSONArrayRemoteActionCompatParcelizer.length() == 0) {
                j = j2;
                z2 = true;
                str = "parse response failed";
            } else {
                WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer2 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 0);
                this.read.getClass();
                GpsNav[] gpsNavArrWrite2 = pluralStringResource.write(jSONArray);
                int length2 = jSONArray.length();
                while (true) {
                    length2--;
                    i3 = windowRecomposerPolicycreateAndInstallWindowRecomposer2.serializer;
                    if (length2 < 0) {
                        break;
                    }
                    GpsNav gpsNav = gpsNavArrWrite2[length2];
                    int weekNumber = windowRecomposerPolicycreateAndInstallWindowRecomposer2.IconCompatParcelizer - gpsNav.getWeekNumber();
                    if (weekNumber > 512) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "weekNumberDiff > 512");
                        weekNumber -= 1024;
                    } else if (weekNumber < -512) {
                        weekNumber += androidx.compose.ui.graphics.Fields.RotationZ;
                    } else {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "between -512 and 512");
                    }
                    int toe4 = (i3 + (weekNumber * DateTimeConstants.SECONDS_PER_WEEK)) - gpsNav.getToe();
                    if (toe4 > 302400) {
                        toe4 -= DateTimeConstants.SECONDS_PER_WEEK;
                    } else if (toe4 < -302400) {
                        toe4 += DateTimeConstants.SECONDS_PER_WEEK;
                    } else {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "between half day");
                    }
                    if (Math.abs(toe4) > 7200) {
                        WrappedCompositionsetContent1211.read("EphModule", "gpsTime diff =" + toe4);
                        jSONArray.remove(length2);
                    }
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "gpsNavs size = " + gpsNavArrWrite2.length + ", gpsNavArray size = " + jSONArray.length());
                this.read.getClass();
                BdsNav[] bdsNavArrSerializer2 = pluralStringResource.serializer(jSONArrayIconCompatParcelizer);
                int length3 = jSONArrayIconCompatParcelizer.length() + (-1);
                while (length3 >= 0) {
                    long toe5 = i3 - bdsNavArrSerializer2[length3].getToe();
                    if (toe5 > 302400) {
                        toe5 -= 604800;
                    } else if (toe5 < -302400) {
                        toe5 += 604800;
                    } else {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "between one week");
                    }
                    if (Math.abs(toe5) > 4200) {
                        WrappedCompositionsetContent1211.read("EphModule", "BdsTime diff =" + toe5);
                        jSONArrayIconCompatParcelizer.remove(length3);
                    }
                    length3--;
                    j2 = j2;
                }
                j = j2;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "bdsNavs size = " + bdsNavArrSerializer2.length + ", bdsNavArrays size = " + jSONArrayIconCompatParcelizer.length());
                this.read.getClass();
                GalileoNav[] galileoNavArr2 = pluralStringResource.read(jSONArraySerializer);
                int length4 = jSONArraySerializer.length();
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    long toe6 = i3 - galileoNavArr2[length4].getToe();
                    if (toe6 > 302400) {
                        toe6 -= 604800;
                    } else if (toe6 < -302400) {
                        toe6 += 604800;
                    } else {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "between one week");
                    }
                    if (Math.abs(toe6) > 1800) {
                        WrappedCompositionsetContent1211.read("EphModule", "GalTime diff =" + toe6);
                        jSONArraySerializer.remove(length4);
                    }
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "galNavs size = " + galileoNavArr2.length + ", galJSONArrays size = " + jSONArraySerializer.length());
                this.read.getClass();
                GlonassNav[] glonassNavArrIconCompatParcelizer2 = pluralStringResource.IconCompatParcelizer(jSONArrayRemoteActionCompatParcelizer);
                z2 = true;
                for (int length5 = jSONArrayRemoteActionCompatParcelizer.length() + (-1); length5 >= 0; length5--) {
                    int iod2 = (((glonassNavArrIconCompatParcelizer2[length5].getIod() * 900) - 10800) % 86400) - (i3 % 86400);
                    if (iod2 > 43200) {
                        iod2 -= 86400;
                    } else if (iod2 < -43200) {
                        iod2 += 86400;
                    }
                    if (Math.abs(iod2) > 1800) {
                        WrappedCompositionsetContent1211.read("EphModule", "GloTime diff =" + iod2);
                        jSONArrayRemoteActionCompatParcelizer.remove(length5);
                    }
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "gloNavs size = " + glonassNavArrIconCompatParcelizer2.length + ", gloJSONArrays size = " + jSONArrayRemoteActionCompatParcelizer.length());
                if (jSONArray.length() == 0 || jSONArrayIconCompatParcelizer.length() == 0 || jSONArraySerializer.length() == 0 || jSONArrayRemoteActionCompatParcelizer.length() == 0) {
                    str = "ephemeris is not valid";
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getGpsNav());
                        jSONObject2.put("ephList", jSONArray);
                        ephemerisResponse.setGpsNav(jSONObject2.toString());
                        JSONObject jSONObject3 = new JSONObject(ephemerisResponse.getBdsNav());
                        jSONObject3.put("ephList", jSONArrayIconCompatParcelizer);
                        ephemerisResponse.setBdsNav(jSONObject3.toString());
                        JSONObject jSONObject4 = new JSONObject(ephemerisResponse.getGalNav());
                        jSONObject4.put("ephList", jSONArraySerializer);
                        ephemerisResponse.setGalNav(jSONObject4.toString());
                        JSONObject jSONObject5 = new JSONObject(ephemerisResponse.getGloNav());
                        jSONObject5.put("gloNavItemList", jSONArrayRemoteActionCompatParcelizer);
                        ephemerisResponse.setGloNav(jSONObject5.toString());
                    } catch (JSONException unused5) {
                        WrappedCompositionsetContent1211.read("EphModule", "filteringResponse JSONException");
                    }
                }
                if (ephemerisResponse == null) {
                    jMin = 0;
                } else {
                    JSONArray jSONArray2 = read(ephemerisResponse);
                    this.read.getClass();
                    gpsNavArrWrite = pluralStringResource.write(jSONArray2);
                    JSONArray jSONArrayIconCompatParcelizer2 = IconCompatParcelizer(ephemerisResponse);
                    this.read.getClass();
                    bdsNavArrSerializer = pluralStringResource.serializer(jSONArrayIconCompatParcelizer2);
                    JSONArray jSONArraySerializer2 = serializer(ephemerisResponse);
                    this.read.getClass();
                    galileoNavArr = pluralStringResource.read(jSONArraySerializer2);
                    JSONArray jSONArrayRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(ephemerisResponse);
                    this.read.getClass();
                    glonassNavArrIconCompatParcelizer = pluralStringResource.IconCompatParcelizer(jSONArrayRemoteActionCompatParcelizer2);
                    if (gpsNavArrWrite.length == 0) {
                        str2 = "new eph data invalid no gps";
                    } else if (bdsNavArrSerializer.length == 0) {
                        str2 = "new eph data invalid no bds";
                    } else if (galileoNavArr.length == 0) {
                        str2 = "new eph data invalid no gal";
                    } else if (glonassNavArrIconCompatParcelizer.length == 0) {
                        str2 = "new eph data invalid no glo";
                    } else {
                        toe = gpsNavArrWrite[0].getToe();
                        for (r8 = z2; r8 < gpsNavArrWrite.length; r8++) {
                            toe = Math.min(gpsNavArrWrite[r8].getToe(), toe);
                        }
                        toe2 = bdsNavArrSerializer[0].getToe();
                        for (r9 = z2; r9 < bdsNavArrSerializer.length; r9++) {
                            toe2 = Math.min(toe2, bdsNavArrSerializer[r9].getToe());
                        }
                        toe3 = galileoNavArr[0].getToe();
                        for (r10 = z2; r10 < galileoNavArr.length; r10++) {
                            toe3 = Math.min(toe3, galileoNavArr[r10].getToe());
                        }
                        iod = glonassNavArrIconCompatParcelizer[0].getIod();
                        for (GlonassNav glonassNav : glonassNavArrIconCompatParcelizer) {
                            iod = Math.min(iod, glonassNav.getIod());
                        }
                        WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer3 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 0);
                        int i5 = ((windowRecomposerPolicycreateAndInstallWindowRecomposer3.read * androidx.compose.ui.graphics.Fields.RotationZ) + windowRecomposerPolicycreateAndInstallWindowRecomposer3.IconCompatParcelizer) * DateTimeConstants.SECONDS_PER_WEEK;
                        long j3 = toe + i5 + 7200;
                        long j4 = toe2 + i5 + 4200;
                        jM = ((iod * 900) - 10818) + ff$$ExternalSyntheticOutline0.m(windowRecomposerPolicycreateAndInstallWindowRecomposer3.serializer, 86400, 86400, i5) + 1800;
                        if (j - jM > 43200) {
                            jM += ConstantsKt.DEFAULT_PROFILE_TTL;
                        }
                        long j5 = i5 + toe3 + 1800;
                        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j3, "gpsExpireTime:", ", bdsExpireTime:");
                        sbM.append(j4);
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", galExpireTime:", j5, ", gloExpireTime:");
                        sbM.append(jM);
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", sbM.toString());
                        jMin = Math.min(Math.min(Math.min(j3, j4), jM), j5);
                    }
                    WrappedCompositionsetContent1211.read("EphModule", str2);
                    jMin = 0;
                }
                if (jMin < IconCompatParcelizer && jMin > j) {
                    IconCompatParcelizer = jMin;
                    new getOrder("ephemeris_expire_time").write("ephemeris_expire_time", IconCompatParcelizer);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "get online ephemeris success");
                    String json = new Gson().toJson(ephemerisResponse);
                    String strSerializer2 = "";
                    if (json.length() > 4096) {
                        double dCeil = Math.ceil(((double) json.length()) / 4096.0d);
                        StringBuffer stringBuffer = new StringBuffer();
                        int i6 = 0;
                        while (true) {
                            double d = i6;
                            if (d >= dCeil) {
                                break;
                            }
                            if (d == dCeil - 1.0d) {
                                i = i6 * androidx.compose.ui.graphics.Fields.TransformOrigin;
                                length = json.length();
                            } else {
                                i = i6 * androidx.compose.ui.graphics.Fields.TransformOrigin;
                                length = i + androidx.compose.ui.graphics.Fields.TransformOrigin;
                            }
                            String strSubstring = json.substring(i, length);
                            if (TextUtils.isEmpty("LOCATION_LITE_SDK") || TextUtils.isEmpty(strSubstring)) {
                                WrappedCompositionsetContent1211.read("AesSecurityCipher", "encrypt alias or content is null");
                            } else {
                                try {
                                    strSerializer = AesGcmKS.serializer("LOCATION_LITE_SDK", strSubstring);
                                } catch (Exception unused6) {
                                    WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS encrypt failed");
                                    strSerializer = "";
                                }
                                stringBuffer.append(strSerializer.concat("\n"));
                                i6++;
                            }
                            strSerializer = "";
                            stringBuffer.append(strSerializer.concat("\n"));
                            i6++;
                        }
                        loadVectorResourceInner.IconCompatParcelizer(stringBuffer.toString());
                    } else {
                        if (TextUtils.isEmpty("LOCATION_LITE_SDK") || TextUtils.isEmpty(json)) {
                            WrappedCompositionsetContent1211.read("AesSecurityCipher", "encrypt alias or content is null");
                        } else {
                            try {
                                strSerializer2 = AesGcmKS.serializer("LOCATION_LITE_SDK", json);
                            } catch (Exception unused7) {
                                WrappedCompositionsetContent1211.serializer("AesSecurityCipher", "AesGcmKS encrypt failed");
                            }
                        }
                        loadVectorResourceInner.IconCompatParcelizer(strSerializer2);
                    }
                    write = false;
                    return z2;
                }
                z = false;
                RemoteActionCompatParcelizer = System.currentTimeMillis();
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "cloudtime is expired");
                write = false;
            }
            WrappedCompositionsetContent1211.read("EphModule", str);
            ephemerisResponse = null;
            if (ephemerisResponse == null) {
                jMin = 0;
            } else {
                JSONArray jSONArray3 = read(ephemerisResponse);
                this.read.getClass();
                gpsNavArrWrite = pluralStringResource.write(jSONArray3);
                JSONArray jSONArrayIconCompatParcelizer3 = IconCompatParcelizer(ephemerisResponse);
                this.read.getClass();
                bdsNavArrSerializer = pluralStringResource.serializer(jSONArrayIconCompatParcelizer3);
                JSONArray jSONArraySerializer3 = serializer(ephemerisResponse);
                this.read.getClass();
                galileoNavArr = pluralStringResource.read(jSONArraySerializer3);
                JSONArray jSONArrayRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(ephemerisResponse);
                this.read.getClass();
                glonassNavArrIconCompatParcelizer = pluralStringResource.IconCompatParcelizer(jSONArrayRemoteActionCompatParcelizer3);
                if (gpsNavArrWrite.length == 0) {
                    str2 = "new eph data invalid no gps";
                } else if (bdsNavArrSerializer.length == 0) {
                    str2 = "new eph data invalid no bds";
                } else if (galileoNavArr.length == 0) {
                    str2 = "new eph data invalid no gal";
                } else if (glonassNavArrIconCompatParcelizer.length == 0) {
                    str2 = "new eph data invalid no glo";
                } else {
                    toe = gpsNavArrWrite[0].getToe();
                    while (r8 < gpsNavArrWrite.length) {
                        toe = Math.min(gpsNavArrWrite[r8].getToe(), toe);
                    }
                    toe2 = bdsNavArrSerializer[0].getToe();
                    while (r9 < bdsNavArrSerializer.length) {
                        toe2 = Math.min(toe2, bdsNavArrSerializer[r9].getToe());
                    }
                    toe3 = galileoNavArr[0].getToe();
                    while (r10 < galileoNavArr.length) {
                        toe3 = Math.min(toe3, galileoNavArr[r10].getToe());
                    }
                    iod = glonassNavArrIconCompatParcelizer[0].getIod();
                    while (i2 < r6) {
                        iod = Math.min(iod, glonassNav.getIod());
                    }
                    WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer4 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 0);
                    int i7 = ((windowRecomposerPolicycreateAndInstallWindowRecomposer4.read * androidx.compose.ui.graphics.Fields.RotationZ) + windowRecomposerPolicycreateAndInstallWindowRecomposer4.IconCompatParcelizer) * DateTimeConstants.SECONDS_PER_WEEK;
                    long j6 = toe + i7 + 7200;
                    long j7 = toe2 + i7 + 4200;
                    jM = ((iod * 900) - 10818) + ff$$ExternalSyntheticOutline0.m(windowRecomposerPolicycreateAndInstallWindowRecomposer4.serializer, 86400, 86400, i7) + 1800;
                    if (j - jM > 43200) {
                        jM += ConstantsKt.DEFAULT_PROFILE_TTL;
                    }
                    long j8 = i7 + toe3 + 1800;
                    StringBuilder sbM2 = c8$$ExternalSyntheticOutline0.m(j6, "gpsExpireTime:", ", bdsExpireTime:");
                    sbM2.append(j7);
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM2, ", galExpireTime:", j8, ", gloExpireTime:");
                    sbM2.append(jM);
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", sbM2.toString());
                    jMin = Math.min(Math.min(Math.min(j6, j7), jM), j8);
                }
                WrappedCompositionsetContent1211.read("EphModule", str2);
                jMin = 0;
            }
            if (jMin < IconCompatParcelizer) {
            }
            z = false;
            RemoteActionCompatParcelizer = System.currentTimeMillis();
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "cloudtime is expired");
            write = false;
        }
        return z;
    }

    public static long write() {
        if (IconCompatParcelizer <= 0) {
            IconCompatParcelizer = new getOrder("ephemeris_expire_time").write("ephemeris_expire_time");
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphModule", "getExpireTime = " + IconCompatParcelizer);
        return IconCompatParcelizer;
    }

    public final GalileoEphemeris MediaDescriptionCompat(EphemerisResponse ephemerisResponse) throws JSONException {
        pluralStringResource pluralstringresource = this.read;
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getGalTim());
        pluralstringresource.getClass();
        GalileoTim galileoTimBuild = GalileoTim.Builder.aGalileoTim().withA0(jSONObject.optDouble("a0", 0.0d) / 3.4359738368E10d).withA1(jSONObject.optDouble("a1", 0.0d) / 2.251799813685248E15d).withT0(jSONObject.optLong("t0", 0L)).build();
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getGalNav());
        pluralStringResource pluralstringresource2 = this.read;
        JSONArray jSONArray = jSONObject2.getJSONArray("ephList");
        pluralstringresource2.getClass();
        GalileoNav[] galileoNavArr = pluralStringResource.read(jSONArray);
        WindowInfoImplCompanion.serializer(galileoNavArr.length, "EphModule", new StringBuilder("galNavArray size = "));
        int iOptInt = jSONObject2.optInt("satNumber", 0);
        return GalileoEphemeris.Builder.aGalileoEphemeris().withSatNumber(iOptInt).withNonBroadcastInd(jSONObject2.optInt("nonBroadcastInd", 0)).withGalileoNavs(galileoNavArr).withGalileoTim(galileoTimBuild).build();
    }

    public final BdsEphemeris RatingCompat(EphemerisResponse ephemerisResponse) throws JSONException {
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getBdsNav());
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getBdsIon());
        JSONObject jSONObject3 = new JSONObject(ephemerisResponse.getBdsTim());
        pluralStringResource pluralstringresource = this.read;
        JSONArray jSONArray = jSONObject.getJSONArray("ephList");
        pluralstringresource.getClass();
        BdsNav[] bdsNavArrSerializer = pluralStringResource.serializer(jSONArray);
        pluralStringResource pluralstringresource2 = this.read;
        JSONArray jSONArray2 = jSONObject2.getJSONArray("ionList");
        pluralstringresource2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
            arrayList.add(BdsIon.Builder.aBdsIon().withA0(jSONObjectOptJSONObject.optDouble("a0", 0.0d) / 1.073741824E9d).withA1(jSONObjectOptJSONObject.optDouble("a1", 0.0d) / 1.34217728E8d).withA2(jSONObjectOptJSONObject.optDouble("a2", 0.0d) / 1.6777216E7d).withA3(jSONObjectOptJSONObject.optDouble("a3", 0.0d) / 1.6777216E7d).withB0(jSONObjectOptJSONObject.optInt("b0", 0) * androidx.compose.ui.graphics.Fields.CameraDistance).withB1(jSONObjectOptJSONObject.optInt("b1", 0) * androidx.compose.ui.graphics.Fields.Clip).withB2(jSONObjectOptJSONObject.optInt("b2", 0) * 65536).withB3(jSONObjectOptJSONObject.optInt("b3", 0) * 65536).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).withToe(jSONObjectOptJSONObject.optInt("toe", 0) * 8).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).build());
        }
        BdsIon[] bdsIonArr = new BdsIon[arrayList.size()];
        arrayList.toArray(bdsIonArr);
        pluralStringResource pluralstringresource3 = this.read;
        JSONArray jSONArray3 = jSONObject3.getJSONArray("timList");
        pluralstringresource3.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray3.optJSONObject(i2);
            arrayList2.add(BdsTim.Builder.aBdsTim().withA0(jSONObjectOptJSONObject2.optDouble("a0", 0.0d) / 3.4359738368E10d).withA1(jSONObjectOptJSONObject2.optDouble("a1", 0.0d) / 2.251799813685248E15d).withA2((jSONObjectOptJSONObject2.optDouble("a2", 0.0d) / 1.152921504606847E18d) / 256.0d).withDeltaT(jSONObjectOptJSONObject2.optInt("deltaT", 0)).withGnssToId(jSONObjectOptJSONObject2.optInt("gnssToId", 0)).withWeekNumber(jSONObjectOptJSONObject2.optInt("weekNumber", 0)).withWeekSecond(jSONObjectOptJSONObject2.optInt("weekSecond", 0) * 16).build());
        }
        BdsTim[] bdsTimArr = new BdsTim[arrayList2.size()];
        arrayList2.toArray(bdsTimArr);
        WindowInfoImplCompanion.serializer(bdsNavArrSerializer.length, "EphModule", new StringBuilder("BdsNav size = "));
        int iOptInt = jSONObject.optInt("satNumber", 0);
        return BdsEphemeris.Builder.aBdsEphemeris().withSatNumber(iOptInt).withNonBroadcastInd(jSONObject.optInt("nonBroadcastInd", 0)).withBdsNavs(bdsNavArrSerializer).withBdsIons(bdsIonArr).withBdsTims(bdsTimArr).build();
    }
}
