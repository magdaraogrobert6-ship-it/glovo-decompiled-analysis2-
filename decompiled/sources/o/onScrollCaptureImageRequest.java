package o;

import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.http.interceptor.UcsAuthInterceptor;
import com.huawei.location.vdr.data.ephemeris.net.EphemerisResponse;
import com.huawei.riemann.gnsslocation.core.bean.eph.BdsEphemeris;
import com.huawei.riemann.gnsslocation.core.bean.eph.BdsIon;
import com.huawei.riemann.gnsslocation.core.bean.eph.BdsNav;
import com.huawei.riemann.gnsslocation.core.bean.eph.BdsTim;
import com.huawei.riemann.gnsslocation.core.bean.eph.Ephemeris;
import com.huawei.riemann.gnsslocation.core.bean.eph.GalileoEphemeris;
import com.huawei.riemann.gnsslocation.core.bean.eph.GalileoNav;
import com.huawei.riemann.gnsslocation.core.bean.eph.GalileoTim;
import com.huawei.riemann.gnsslocation.core.bean.eph.GlonassEphemeris;
import com.huawei.riemann.gnsslocation.core.bean.eph.GlonassNav;
import com.huawei.riemann.gnsslocation.core.bean.eph.GlonassTim;
import com.huawei.riemann.gnsslocation.core.bean.eph.GpsEphemeris;
import com.huawei.riemann.gnsslocation.core.bean.eph.GpsIon;
import com.huawei.riemann.gnsslocation.core.bean.eph.GpsNav;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import com.mapbox.search.base.MetadataExtKt;
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

/* JADX INFO: loaded from: classes2.dex */
public final class onScrollCaptureImageRequest {
    public static long IconCompatParcelizer = 0;
    public static boolean read = false;
    public static long write;
    public accessgetNodep RemoteActionCompatParcelizer;

    public static JSONArray IconCompatParcelizer(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getBdsNav()).getJSONArray("ephList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphProvider", "getBdsNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public static JSONArray read(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getGpsNav()).getJSONArray("ephList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphProvider", "getGpsNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public static JSONArray serializer(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getGloNav()).getJSONArray("gloNavItemList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphProvider", "getGloNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public static JSONArray write(EphemerisResponse ephemerisResponse) {
        try {
            return new JSONObject(ephemerisResponse.getGalNav()).getJSONArray("ephList");
        } catch (JSONException e) {
            WrappedCompositionsetContent1211.read("EphProvider", "getGalNavs JSONException:" + e.getMessage());
            return new JSONArray();
        }
    }

    public final GpsEphemeris MediaDescriptionCompat(EphemerisResponse ephemerisResponse) throws JSONException {
        accessgetNodep accessgetnodep = this.RemoteActionCompatParcelizer;
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getGpsIon());
        accessgetnodep.getClass();
        GpsIon gpsIonBuild = GpsIon.Builder.aGpsIon().withA0(jSONObject.optDouble("a0", 0.0d) / 1.073741824E9d).withA1(jSONObject.optDouble("a1", 0.0d) / 1.34217728E8d).withA2(jSONObject.optDouble("a2", 0.0d) / 1.6777216E7d).withA3(jSONObject.optDouble("a3", 0.0d) / 1.6777216E7d).withB0(jSONObject.optInt("b0", 0) * androidx.compose.ui.graphics.Fields.CameraDistance).withB1(jSONObject.optInt("b1", 0) * androidx.compose.ui.graphics.Fields.Clip).withB2(jSONObject.optInt("b2", 0) * 65536).withB3(jSONObject.optInt("b3", 0) * 65536).withValid(jSONObject.optBoolean("valid")).build();
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getGpsNav());
        accessgetNodep accessgetnodep2 = this.RemoteActionCompatParcelizer;
        JSONArray jSONArray = jSONObject2.getJSONArray("ephList");
        accessgetnodep2.getClass();
        GpsNav[] gpsNavArr = accessgetNodep.read(jSONArray);
        WindowInfoImplCompanion.serializer(gpsNavArr.length, "EphProvider", new StringBuilder("GpsNav size = "));
        return GpsEphemeris.Builder.aGpsEphemeris().withSatNumber(jSONObject2.optInt("satNumber", 0)).withGpsNavs(gpsNavArr).withGpsIon(gpsIonBuild).build();
    }

    public final GlonassEphemeris MediaMetadataCompat(EphemerisResponse ephemerisResponse) throws JSONException {
        accessgetNodep accessgetnodep = this.RemoteActionCompatParcelizer;
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getGloTim());
        accessgetnodep.getClass();
        GlonassTim glonassTimBuild = GlonassTim.Builder.aGlonassTim().withA0(jSONObject.optDouble("a0", 0.0d) / 3.4359738368E10d).withA1(jSONObject.optDouble("a1", 0.0d) / 2.251799813685248E15d).withA2((jSONObject.optDouble("a2", 0.0d) / 1.152921504606847E18d) / 256.0d).withGnssToId(jSONObject.optInt("gnssToId", 0)).withWeekNumber(jSONObject.optInt("weekNumber", 0)).withWeekSecond(jSONObject.optInt("weekSecond", 0) * 16).build();
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getGloNav());
        accessgetNodep accessgetnodep2 = this.RemoteActionCompatParcelizer;
        JSONArray jSONArray = jSONObject2.getJSONArray("gloNavItemList");
        accessgetnodep2.getClass();
        GlonassNav[] glonassNavArrSerializer = accessgetNodep.serializer(jSONArray);
        WindowInfoImplCompanion.serializer(glonassNavArrSerializer.length, "EphProvider", new StringBuilder("GlonassNav size = "));
        int iOptInt = jSONObject2.optInt("satNumber", 0);
        return GlonassEphemeris.Builder.aGlonassEphemeris().withSatNumber(iOptInt).withNonBroadcastInd(jSONObject2.optInt("nonBroadcastInd", 0)).withGlonassNavs(glonassNavArrSerializer).withGlonassTim(glonassTimBuild).build();
    }

    public final BdsEphemeris MediaSessionCompatQueueItem(EphemerisResponse ephemerisResponse) throws JSONException {
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getBdsNav());
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getBdsIon());
        JSONObject jSONObject3 = new JSONObject(ephemerisResponse.getBdsTim());
        accessgetNodep accessgetnodep = this.RemoteActionCompatParcelizer;
        JSONArray jSONArray = jSONObject.getJSONArray("ephList");
        accessgetnodep.getClass();
        BdsNav[] bdsNavArrWrite = accessgetNodep.write(jSONArray);
        accessgetNodep accessgetnodep2 = this.RemoteActionCompatParcelizer;
        JSONArray jSONArray2 = jSONObject2.getJSONArray("ionList");
        accessgetnodep2.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray2.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i);
            arrayList.add(BdsIon.Builder.aBdsIon().withA0(jSONObjectOptJSONObject.optDouble("a0", 0.0d) / 1.073741824E9d).withA1(jSONObjectOptJSONObject.optDouble("a1", 0.0d) / 1.34217728E8d).withA2(jSONObjectOptJSONObject.optDouble("a2", 0.0d) / 1.6777216E7d).withA3(jSONObjectOptJSONObject.optDouble("a3", 0.0d) / 1.6777216E7d).withB0(jSONObjectOptJSONObject.optInt("b0", 0) * androidx.compose.ui.graphics.Fields.CameraDistance).withB1(jSONObjectOptJSONObject.optInt("b1", 0) * androidx.compose.ui.graphics.Fields.Clip).withB2(jSONObjectOptJSONObject.optInt("b2", 0) * 65536).withB3(jSONObjectOptJSONObject.optInt("b3", 0) * 65536).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).withToe(jSONObjectOptJSONObject.optInt("toe", 0) * 8).withSvid(jSONObjectOptJSONObject.optInt("svid", 0) + 1).build());
        }
        BdsIon[] bdsIonArr = new BdsIon[arrayList.size()];
        arrayList.toArray(bdsIonArr);
        accessgetNodep accessgetnodep3 = this.RemoteActionCompatParcelizer;
        JSONArray jSONArray3 = jSONObject3.getJSONArray("timList");
        accessgetnodep3.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray3.optJSONObject(i2);
            arrayList2.add(BdsTim.Builder.aBdsTim().withA0(jSONObjectOptJSONObject2.optDouble("a0", 0.0d) / 3.4359738368E10d).withA1(jSONObjectOptJSONObject2.optDouble("a1", 0.0d) / 2.251799813685248E15d).withA2((jSONObjectOptJSONObject2.optDouble("a2", 0.0d) / 1.152921504606847E18d) / 256.0d).withDeltaT(jSONObjectOptJSONObject2.optInt("deltaT", 0)).withGnssToId(jSONObjectOptJSONObject2.optInt("gnssToId", 0)).withWeekNumber(jSONObjectOptJSONObject2.optInt("weekNumber", 0)).withWeekSecond(jSONObjectOptJSONObject2.optInt("weekSecond", 0) * 16).build());
        }
        BdsTim[] bdsTimArr = new BdsTim[arrayList2.size()];
        arrayList2.toArray(bdsTimArr);
        WindowInfoImplCompanion.serializer(bdsNavArrWrite.length, "EphProvider", new StringBuilder("BdsNav size = "));
        int iOptInt = jSONObject.optInt("satNumber", 0);
        return BdsEphemeris.Builder.aBdsEphemeris().withSatNumber(iOptInt).withNonBroadcastInd(jSONObject.optInt("nonBroadcastInd", 0)).withBdsNavs(bdsNavArrWrite).withBdsIons(bdsIonArr).withBdsTims(bdsTimArr).build();
    }

    public final GalileoEphemeris RemoteActionCompatParcelizer(EphemerisResponse ephemerisResponse) throws JSONException {
        accessgetNodep accessgetnodep = this.RemoteActionCompatParcelizer;
        JSONObject jSONObject = new JSONObject(ephemerisResponse.getGalTim());
        accessgetnodep.getClass();
        GalileoTim galileoTimBuild = GalileoTim.Builder.aGalileoTim().withA0(jSONObject.optDouble("a0", 0.0d) / 3.4359738368E10d).withA1(jSONObject.optDouble("a1", 0.0d) / 2.251799813685248E15d).withT0(jSONObject.optLong("t0", 0L)).build();
        JSONObject jSONObject2 = new JSONObject(ephemerisResponse.getGalNav());
        accessgetNodep accessgetnodep2 = this.RemoteActionCompatParcelizer;
        JSONArray jSONArray = jSONObject2.getJSONArray("ephList");
        accessgetnodep2.getClass();
        GalileoNav[] galileoNavArrIconCompatParcelizer = accessgetNodep.IconCompatParcelizer(jSONArray);
        WindowInfoImplCompanion.serializer(galileoNavArrIconCompatParcelizer.length, "EphProvider", new StringBuilder("galNavArray size = "));
        int iOptInt = jSONObject2.optInt("satNumber", 0);
        return GalileoEphemeris.Builder.aGalileoEphemeris().withSatNumber(iOptInt).withNonBroadcastInd(jSONObject2.optInt("nonBroadcastInd", 0)).withGalileoNavs(galileoNavArrIconCompatParcelizer).withGalileoTim(galileoTimBuild).build();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x045d  */
    /* JADX WARN: Code duplicated, block: B:165:0x056c  */
    public final Ephemeris serializer() {
        String string;
        boolean z;
        String str;
        long jMin;
        int i;
        int length;
        String strSerializer;
        GpsNav[] gpsNavArr;
        int i2;
        String str2;
        StringBuilder sb;
        String message;
        String str3;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "try to downloadEphemeris here");
        if (read) {
            str3 = "download task running, return empty ephemeris here";
        } else {
            WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer1 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 1);
            if (System.currentTimeMillis() - IconCompatParcelizer >= 60000) {
                read = true;
                accessgetListenerp accessgetlistenerp = new accessgetListenerp();
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("OnlineEphService", "get online eph data");
                EphemerisResponse ephemerisResponse = new EphemerisResponse();
                int i3 = 0;
                try {
                    JSONObject jSONObject = new JSONObject(new Gson().toJson(accessgetlistenerp));
                    try {
                        try {
                            new JSONObject();
                            String string2 = jSONObject.toString();
                            String string3 = UUID.randomUUID().toString();
                            String strIconCompatParcelizer = onChange.IconCompatParcelizer(com.huawei.hms.location.BuildConfig.LIBRARY_PACKAGE_NAME);
                            if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                                WrappedCompositionsetContent1211.read("OnlineEphService", "grsHostAddress is null");
                            } else {
                                String packageName = placeAtf8xVGno.read().getPackageName();
                                com.airbnb.lottie.PerformanceTracker performanceTracker = new com.airbnb.lottie.PerformanceTracker(string3);
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
                                arrayList2.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(i3));
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
                if (ephemerisResponse.isSuccess()) {
                    if (ephemerisResponse.getBdsNav() == null || ephemerisResponse.getGpsNav() == null) {
                        z = false;
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "get online ephemeris contains illegal arguments");
                        IconCompatParcelizer = System.currentTimeMillis();
                        read = false;
                    } else {
                        JSONArray jSONArray = read(ephemerisResponse);
                        JSONArray jSONArrayIconCompatParcelizer = IconCompatParcelizer(ephemerisResponse);
                        JSONArray jSONArrayWrite = write(ephemerisResponse);
                        JSONArray jSONArraySerializer = serializer(ephemerisResponse);
                        if (jSONArray.length() == 0 || jSONArrayIconCompatParcelizer.length() == 0 || jSONArrayWrite.length() == 0 || jSONArraySerializer.length() == 0) {
                            str = "parse response failed";
                        } else {
                            WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer2 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 1);
                            this.RemoteActionCompatParcelizer.getClass();
                            GpsNav[] gpsNavArr2 = accessgetNodep.read(jSONArray);
                            int length2 = jSONArray.length() - 1;
                            while (true) {
                                i2 = windowRecomposerPolicycreateAndInstallWindowRecomposer2.serializer;
                                if (length2 < 0) {
                                    break;
                                }
                                GpsNav gpsNav = gpsNavArr2[length2];
                                int weekNumber = windowRecomposerPolicycreateAndInstallWindowRecomposer2.IconCompatParcelizer - gpsNav.getWeekNumber();
                                if (weekNumber > 512) {
                                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "weekNumberDiff > 512");
                                    weekNumber -= 1024;
                                } else if (weekNumber < -512) {
                                    weekNumber += androidx.compose.ui.graphics.Fields.RotationZ;
                                } else {
                                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "between -512 and 512");
                                }
                                int toe = (i2 + (weekNumber * DateTimeConstants.SECONDS_PER_WEEK)) - gpsNav.getToe();
                                if (toe > 302400) {
                                    toe -= DateTimeConstants.SECONDS_PER_WEEK;
                                } else if (toe < -302400) {
                                    toe += DateTimeConstants.SECONDS_PER_WEEK;
                                } else {
                                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "between half day");
                                }
                                if (Math.abs(toe) > 7200) {
                                    WrappedCompositionsetContent1211.read("EphProvider", "gpsTime diff =" + toe);
                                    jSONArray.remove(length2);
                                }
                                length2--;
                            }
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "gpsNavs size = " + gpsNavArr2.length + ", gpsNavArray size = " + jSONArray.length());
                            this.RemoteActionCompatParcelizer.getClass();
                            BdsNav[] bdsNavArrWrite = accessgetNodep.write(jSONArrayIconCompatParcelizer);
                            int length3 = jSONArrayIconCompatParcelizer.length() + (-1);
                            while (true) {
                                str2 = "between one week";
                                if (length3 < 0) {
                                    break;
                                }
                                long toe2 = i2 - bdsNavArrWrite[length3].getToe();
                                if (toe2 > 302400) {
                                    toe2 -= 604800;
                                } else if (toe2 < -302400) {
                                    toe2 += 604800;
                                } else {
                                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "between one week");
                                }
                                if (Math.abs(toe2) > 4200) {
                                    WrappedCompositionsetContent1211.read("EphProvider", "BdsTime diff =" + toe2);
                                    jSONArrayIconCompatParcelizer.remove(length3);
                                }
                                length3--;
                            }
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "bdsNavs size = " + bdsNavArrWrite.length + ", bdsNavArrays size = " + jSONArrayIconCompatParcelizer.length());
                            this.RemoteActionCompatParcelizer.getClass();
                            GalileoNav[] galileoNavArrIconCompatParcelizer = accessgetNodep.IconCompatParcelizer(jSONArrayWrite);
                            int length4 = jSONArrayWrite.length() + (-1);
                            while (length4 >= 0) {
                                long toe3 = i2 - galileoNavArrIconCompatParcelizer[length4].getToe();
                                if (toe3 > 302400) {
                                    toe3 -= 604800;
                                } else if (toe3 < -302400) {
                                    toe3 += 604800;
                                } else {
                                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", str2);
                                }
                                if (Math.abs(toe3) > 1800) {
                                    WrappedCompositionsetContent1211.read("EphProvider", "GalTime diff =" + toe3);
                                    jSONArrayWrite.remove(length4);
                                }
                                length4--;
                                str2 = str2;
                            }
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "galNavs size = " + galileoNavArrIconCompatParcelizer.length + ", galJSONArrays size = " + jSONArrayWrite.length());
                            this.RemoteActionCompatParcelizer.getClass();
                            GlonassNav[] glonassNavArrSerializer = accessgetNodep.serializer(jSONArraySerializer);
                            for (int length5 = jSONArraySerializer.length() - 1; length5 >= 0; length5--) {
                                int iod = (((glonassNavArrSerializer[length5].getIod() * 900) - 10800) % 86400) - (i2 % 86400);
                                if (iod > 43200) {
                                    iod -= 86400;
                                } else if (iod < -43200) {
                                    iod += 86400;
                                }
                                if (Math.abs(iod) > 1800) {
                                    WrappedCompositionsetContent1211.read("EphProvider", "GloTime diff =" + iod);
                                    jSONArraySerializer.remove(length5);
                                }
                            }
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "gloNavs size = " + glonassNavArrSerializer.length + ", gloJSONArrays size = " + jSONArraySerializer.length());
                            if (jSONArray.length() == 0 || jSONArrayIconCompatParcelizer.length() == 0 || jSONArrayWrite.length() == 0 || jSONArraySerializer.length() == 0) {
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
                                    jSONObject4.put("ephList", jSONArrayWrite);
                                    ephemerisResponse.setGalNav(jSONObject4.toString());
                                    JSONObject jSONObject5 = new JSONObject(ephemerisResponse.getGloNav());
                                    jSONObject5.put("gloNavItemList", jSONArraySerializer);
                                    ephemerisResponse.setGloNav(jSONObject5.toString());
                                } catch (JSONException unused5) {
                                    WrappedCompositionsetContent1211.read("EphProvider", "filteringResponse JSONException");
                                }
                            }
                            long j = windowRecomposerPolicycreateAndInstallWindowRecomposer1.RemoteActionCompatParcelizer;
                            if (ephemerisResponse == null) {
                                jMin = 0;
                            } else {
                                JSONArray jSONArray2 = read(ephemerisResponse);
                                this.RemoteActionCompatParcelizer.getClass();
                                gpsNavArr = accessgetNodep.read(jSONArray2);
                                JSONArray jSONArrayIconCompatParcelizer2 = IconCompatParcelizer(ephemerisResponse);
                                this.RemoteActionCompatParcelizer.getClass();
                                BdsNav[] bdsNavArrWrite2 = accessgetNodep.write(jSONArrayIconCompatParcelizer2);
                                JSONArray jSONArrayWrite2 = write(ephemerisResponse);
                                this.RemoteActionCompatParcelizer.getClass();
                                GalileoNav[] galileoNavArrIconCompatParcelizer2 = accessgetNodep.IconCompatParcelizer(jSONArrayWrite2);
                                JSONArray jSONArraySerializer2 = serializer(ephemerisResponse);
                                this.RemoteActionCompatParcelizer.getClass();
                                GlonassNav[] glonassNavArrSerializer2 = accessgetNodep.serializer(jSONArraySerializer2);
                                if (gpsNavArr.length != 0 || bdsNavArrWrite2.length == 0 || galileoNavArrIconCompatParcelizer2.length == 0 || glonassNavArrSerializer2.length == 0) {
                                    WrappedCompositionsetContent1211.read("EphProvider", "new eph data invalid");
                                    jMin = 0;
                                } else {
                                    int toe4 = gpsNavArr[0].getToe();
                                    for (int i4 = 1; i4 < gpsNavArr.length; i4++) {
                                        toe4 = Math.min(gpsNavArr[i4].getToe(), toe4);
                                    }
                                    int toe5 = bdsNavArrWrite2[0].getToe();
                                    for (int i5 = 1; i5 < bdsNavArrWrite2.length; i5++) {
                                        toe5 = Math.min(toe5, bdsNavArrWrite2[i5].getToe());
                                    }
                                    int toe6 = galileoNavArrIconCompatParcelizer2[0].getToe();
                                    for (int i6 = 1; i6 < galileoNavArrIconCompatParcelizer2.length; i6++) {
                                        toe6 = Math.min(toe6, galileoNavArrIconCompatParcelizer2[i6].getToe());
                                    }
                                    int iod2 = glonassNavArrSerializer2[0].getIod();
                                    for (GlonassNav glonassNav : glonassNavArrSerializer2) {
                                        iod2 = Math.min(iod2, glonassNav.getIod());
                                    }
                                    WindowRecomposerPolicycreateAndInstallWindowRecomposer1 windowRecomposerPolicycreateAndInstallWindowRecomposer3 = new WindowRecomposerPolicycreateAndInstallWindowRecomposer1(System.currentTimeMillis(), 1);
                                    int i7 = ((windowRecomposerPolicycreateAndInstallWindowRecomposer3.read * androidx.compose.ui.graphics.Fields.RotationZ) + windowRecomposerPolicycreateAndInstallWindowRecomposer3.IconCompatParcelizer) * DateTimeConstants.SECONDS_PER_WEEK;
                                    long j2 = toe4 + i7 + 7200;
                                    long j3 = toe5 + i7 + 4200;
                                    long jM = ((iod2 * 900) - 10818) + ff$$ExternalSyntheticOutline0.m(windowRecomposerPolicycreateAndInstallWindowRecomposer3.serializer, 86400, 86400, i7) + 1800;
                                    if (j - jM > 43200) {
                                        jM += ConstantsKt.DEFAULT_PROFILE_TTL;
                                    }
                                    long j4 = i7 + toe6 + 1800;
                                    jMin = Math.min(j2, j3);
                                    StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(j2, "gpsExpireTime:", ", bdsExpireTime:");
                                    sbM.append(j3);
                                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", galExpireTime:", j4, ", gloExpireTime:");
                                    sbM.append(jM);
                                    sbM.append(", expireTimeVdr:");
                                    sbM.append(jMin);
                                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", sbM.toString());
                                }
                            }
                            if (jMin < write && jMin > j) {
                                write = jMin;
                                new getOrder("ephemeris_expire_time").write("ephemeris_expire_time", write);
                                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "get online ephemeris success");
                                String json = new Gson().toJson(ephemerisResponse);
                                String strSerializer2 = "";
                                if (json.length() > 4096) {
                                    double dCeil = Math.ceil(((double) json.length()) / 4096.0d);
                                    StringBuffer stringBuffer = new StringBuffer();
                                    int i8 = 0;
                                    while (true) {
                                        double d = i8;
                                        if (d >= dCeil) {
                                            break;
                                        }
                                        if (d == dCeil - 1.0d) {
                                            i = i8 * androidx.compose.ui.graphics.Fields.TransformOrigin;
                                            length = json.length();
                                        } else {
                                            i = i8 * androidx.compose.ui.graphics.Fields.TransformOrigin;
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
                                            i8++;
                                        }
                                        strSerializer = "";
                                        stringBuffer.append(strSerializer.concat("\n"));
                                        i8++;
                                    }
                                    vectorResourcedefault.read(stringBuffer.toString());
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
                                    vectorResourcedefault.read(strSerializer2);
                                }
                                read = false;
                                return MediaBrowserCompatMediaItem(ephemerisResponse);
                            }
                            IconCompatParcelizer = System.currentTimeMillis();
                            read = false;
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "ephemeris in cloud is expired, return empty ephemeris here");
                        }
                        WrappedCompositionsetContent1211.read("EphProvider", str);
                        ephemerisResponse = null;
                        long j5 = windowRecomposerPolicycreateAndInstallWindowRecomposer1.RemoteActionCompatParcelizer;
                        if (ephemerisResponse == null) {
                            jMin = 0;
                        } else {
                            JSONArray jSONArray3 = read(ephemerisResponse);
                            this.RemoteActionCompatParcelizer.getClass();
                            gpsNavArr = accessgetNodep.read(jSONArray3);
                            JSONArray jSONArrayIconCompatParcelizer3 = IconCompatParcelizer(ephemerisResponse);
                            this.RemoteActionCompatParcelizer.getClass();
                            BdsNav[] bdsNavArrWrite3 = accessgetNodep.write(jSONArrayIconCompatParcelizer3);
                            JSONArray jSONArrayWrite3 = write(ephemerisResponse);
                            this.RemoteActionCompatParcelizer.getClass();
                            GalileoNav[] galileoNavArrIconCompatParcelizer3 = accessgetNodep.IconCompatParcelizer(jSONArrayWrite3);
                            JSONArray jSONArraySerializer3 = serializer(ephemerisResponse);
                            this.RemoteActionCompatParcelizer.getClass();
                            GlonassNav[] glonassNavArrSerializer3 = accessgetNodep.serializer(jSONArraySerializer3);
                            if (gpsNavArr.length != 0) {
                            }
                            WrappedCompositionsetContent1211.read("EphProvider", "new eph data invalid");
                            jMin = 0;
                        }
                        if (jMin < write) {
                        }
                        IconCompatParcelizer = System.currentTimeMillis();
                        read = false;
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "ephemeris in cloud is expired, return empty ephemeris here");
                    }
                    return null;
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "get online ephemeris failed");
                IconCompatParcelizer = System.currentTimeMillis();
                read = false;
                z = false;
                read = z;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "ephemeris in cloud is invalid, return empty ephemeris here");
                return null;
            }
            str3 = "request too frequent, return empty ephemeris here";
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", str3);
        return null;
    }

    public static long RemoteActionCompatParcelizer() {
        if (write <= 0) {
            write = new getOrder("ephemeris_expire_time").write("ephemeris_expire_time");
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("EphProvider", "getExpireTime = " + write);
        return write;
    }

    public final Ephemeris MediaBrowserCompatMediaItem(EphemerisResponse ephemerisResponse) {
        String str;
        if (ephemerisResponse == null) {
            return null;
        }
        try {
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new accessgetNodep();
            }
            GpsEphemeris gpsEphemerisMediaDescriptionCompat = MediaDescriptionCompat(ephemerisResponse);
            BdsEphemeris bdsEphemerisMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(ephemerisResponse);
            return Ephemeris.Builder.anEphemeris().withGpsEphemeris(gpsEphemerisMediaDescriptionCompat).withBdsEphemeris(bdsEphemerisMediaSessionCompatQueueItem).withGalileoEphemeris(RemoteActionCompatParcelizer(ephemerisResponse)).withGlonassEphemeris(MediaMetadataCompat(ephemerisResponse)).build();
        } catch (JsonSyntaxException unused) {
            str = "json syntax error";
            WrappedCompositionsetContent1211.read("EphProvider", str);
            return null;
        } catch (JSONException e) {
            str = "jsonException:" + e.getMessage();
            WrappedCompositionsetContent1211.read("EphProvider", str);
            return null;
        }
    }
}
