package com.huawei.location.nlp.network;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.airbnb.lottie.PerformanceTracker;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.gson.Gson;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.location.BuildConfig;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.http.interceptor.UcsAuthInterceptor;
import com.huawei.location.nlp.network.request.OnlineLocationRequest;
import com.huawei.location.nlp.network.response.OnlineLocationResponse;
import com.mapbox.search.base.MetadataExtKt;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o.ContentCaptureSessionCompat;
import o.InAppMessageBoundedLayout;
import o.RelativeScroller;
import o.WrappedCompositionsetContent1;
import o.WrappedCompositionsetContent12;
import o.WrappedCompositionsetContent1211;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.accessgetDisposedp;
import o.onChange;
import o.placeAtf8xVGno;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.setWebViewContent;
import o.updateMenuItemsui;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class OnlineLocationService {
    private static final int FLAG_ACCURACY = 16;
    private static final int FLAG_BEARING = 8;
    private static final int FLAG_SPEED = 4;
    private static final String LOCATION_URL = "/networklocation/v1/onlineLocation";
    public static final String SRC_DEFAULT = "4";
    private static final String TAG = "OnlineLocationService";
    public static final String X_REQ_SRC = "X-Req-src";

    public HwLocationResult getLocationFromCloud(OnlineLocationRequest onlineLocationRequest) {
        long j;
        onlineLocationRequest.setBoottime(SystemClock.elapsedRealtimeNanos() / 1000);
        OnlineLocationResponse onlineLocationResponseDoHttp = doHttp(onlineLocationRequest);
        HwLocationResult hwLocationResult = new HwLocationResult();
        Location location = new Location("network");
        if (!onlineLocationResponseDoHttp.isSuccess()) {
            WrappedCompositionsetContent1211.read(TAG, "getLocationFromCloud, response is failed");
            hwLocationResult.setCode(11000);
            hwLocationResult.setMessage(ContentCaptureSessionCompat.IconCompatParcelizer(11000));
            return hwLocationResult;
        }
        if (!convertNativeLocation(location, onlineLocationResponseDoHttp)) {
            hwLocationResult.setCode(11000);
            hwLocationResult.setMessage(ContentCaptureSessionCompat.IconCompatParcelizer(11000));
            return hwLocationResult;
        }
        if (onlineLocationResponseDoHttp.getIndoor() == 0) {
            String locateType = onlineLocationResponseDoHttp.getLocateType();
            if ("wifi".equalsIgnoreCase(locateType)) {
                location.setElapsedRealtimeNanos(TimeUnit.MILLISECONDS.toNanos(updateMenuItemsui.read().MediaMetadataCompat));
            }
            if ("cell".equalsIgnoreCase(locateType)) {
                updateMenuItemsui updatemenuitemsui = updateMenuItemsui.read();
                synchronized (updatemenuitemsui) {
                    j = updatemenuitemsui.read;
                }
                location.setElapsedRealtimeNanos(j);
            }
        }
        hwLocationResult.setCode(0);
        hwLocationResult.setMessage(ContentCaptureSessionCompat.IconCompatParcelizer(0));
        hwLocationResult.setLocation(location);
        return hwLocationResult;
    }

    private OnlineLocationResponse doHttp(OnlineLocationRequest onlineLocationRequest) {
        WrappedCompositionsetContent1ExternalSyntheticLambda0 e;
        OnlineLocationResponse onlineLocationResponse;
        WrappedCompositionsetContent1 e2;
        StringBuilder sb;
        String message;
        String string;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "doHttp, request is " + onlineLocationRequest.toString());
        OnlineLocationResponse onlineLocationResponse2 = new OnlineLocationResponse();
        try {
            JSONObject jSONObject = new JSONObject(new Gson().toJson(onlineLocationRequest));
            try {
                try {
                    new JSONObject();
                    String string2 = jSONObject.toString();
                    String strIconCompatParcelizer = onChange.IconCompatParcelizer(BuildConfig.LIBRARY_PACKAGE_NAME);
                    if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                        WrappedCompositionsetContent1211.read(TAG, "grsHostAddress is null");
                        return onlineLocationResponse2;
                    }
                    String packageName = placeAtf8xVGno.read().getPackageName();
                    HashMap map = new HashMap();
                    map.put(X_REQ_SRC, SRC_DEFAULT);
                    String string3 = UUID.randomUUID().toString();
                    PerformanceTracker performanceTracker = new PerformanceTracker(string3);
                    performanceTracker.IconCompatParcelizer(packageName);
                    performanceTracker.IconCompatParcelizer.putAll(map);
                    WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12(LOCATION_URL);
                    wrappedCompositionsetContent12.MediaMetadataCompat = strIconCompatParcelizer;
                    wrappedCompositionsetContent12.write = performanceTracker;
                    wrappedCompositionsetContent12.RemoteActionCompatParcelizer = string2.getBytes();
                    wrappedCompositionsetContent12.RatingCompat = "application/json; charset=utf-8";
                    WrappedCompositionsetContent12 wrappedCompositionsetContent12RemoteActionCompatParcelizer = wrappedCompositionsetContent12.RemoteActionCompatParcelizer();
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
                    arrayList2.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(0));
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
                    onlineLocationResponse = (OnlineLocationResponse) new SubmitEx(wrappedCompositionsetContent12RemoteActionCompatParcelizer, accessgetdisposedp).RemoteActionCompatParcelizer(OnlineLocationResponse.class);
                    try {
                        onlineLocationResponse.setSessionId(string3);
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "doHttp, response code is " + onlineLocationResponse.getApiCode());
                        return onlineLocationResponse;
                    } catch (Exception unused2) {
                        onlineLocationResponse2 = onlineLocationResponse;
                        string = "unknown exception";
                        WrappedCompositionsetContent1211.read(TAG, string);
                        return onlineLocationResponse2;
                    } catch (WrappedCompositionsetContent1 e3) {
                        e2 = e3;
                        sb = new StringBuilder("doHttp, OnErrorException: code is ");
                        sb.append(e2.read);
                        sb.append(", msg is ");
                        message = e2.RemoteActionCompatParcelizer;
                        onlineLocationResponse2 = onlineLocationResponse;
                        sb.append(message);
                        string = sb.toString();
                        WrappedCompositionsetContent1211.read(TAG, string);
                        return onlineLocationResponse2;
                    } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e4) {
                        e = e4;
                        sb = new StringBuilder("doHttp, OnFailureException: code is ");
                        sb.append(e.serializer);
                        sb.append(", msg is ");
                        message = e.getMessage();
                        onlineLocationResponse2 = onlineLocationResponse;
                        sb.append(message);
                        string = sb.toString();
                        WrappedCompositionsetContent1211.read(TAG, string);
                        return onlineLocationResponse2;
                    }
                } catch (Exception unused3) {
                }
            } catch (WrappedCompositionsetContent1 e5) {
                e2 = e5;
                onlineLocationResponse = onlineLocationResponse2;
            } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e6) {
                e = e6;
                onlineLocationResponse = onlineLocationResponse2;
            }
        } catch (JSONException unused4) {
            WrappedCompositionsetContent1211.read(TAG, "doHttp, transfer to JSONException failed");
            return onlineLocationResponse2;
        }
    }

    private boolean convertNativeLocation(Location location, OnlineLocationResponse onlineLocationResponse) {
        String str;
        com.huawei.location.nlp.network.response.Location position = onlineLocationResponse.getPosition();
        if (position == null) {
            str = "convertNativeLocation, responseLocation is null.";
        } else {
            short flags = position.getFlags();
            if (flags <= 0) {
                str = "convertNativeLocation, flag is invalid.";
            } else {
                if ((flags & 1) > 0) {
                    location.setLatitude(position.getLatitude());
                    location.setLongitude(position.getLongitude());
                    if ((flags & 4) != 0) {
                        location.setSpeed(position.getSpeed());
                    }
                    if ((flags & 8) != 0) {
                        location.setBearing(position.getBearing());
                    }
                    if ((flags & 16) != 0) {
                        location.setAccuracy(position.getAccuracy());
                    }
                    location.setElapsedRealtimeNanos(SystemClock.elapsedRealtimeNanos());
                    location.setTime(System.currentTimeMillis());
                    location.setProvider("network");
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(onlineLocationResponse.getSessionId())) {
                        bundle.putString("session_id", onlineLocationResponse.getSessionId());
                    }
                    bundle.putInt("vendorType", 1);
                    bundle.putString("locateType", onlineLocationResponse.getLocateType());
                    bundle.putString("buildingId", position.getBuildingId());
                    bundle.putInt("floor", position.getFloor());
                    bundle.putInt("floorAcc", position.getFloorAcc());
                    bundle.putLong(CrashHianalyticsData.TIME, position.getTime());
                    bundle.putShort("flags", position.getFlags());
                    location.setExtras(bundle);
                    return true;
                }
                str = "convertNativeLocation, lon&lat is invalid.";
            }
        }
        WrappedCompositionsetContent1211.read(TAG, str);
        return false;
    }
}
