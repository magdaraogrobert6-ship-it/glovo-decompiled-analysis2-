package com.huawei.location.tiles.utils;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.PerformanceTracker;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.lite.common.http.SubmitEx;
import com.huawei.location.lite.common.http.exception.AuthException;
import com.huawei.location.lite.common.http.interceptor.UcsAuthInterceptor;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraOptions;
import com.mapbox.search.base.MetadataExtKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o.InAppMessageBoundedLayout;
import o.RelativeScroller;
import o.WrappedCompositionsetContent1;
import o.WrappedCompositionsetContent12;
import o.WrappedCompositionsetContent1211;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.accessgetDisposedp;
import o.dimensionResource;
import o.getCieXyz;
import o.isDisposed;
import o.onChange;
import o.placeAtf8xVGno;
import o.r8lambdaA_tBhQGR0_Qo4AfQkBrfTkXVvg0;
import o.r8lambdaCwme7obcpVw4LrR1Hr7XiufmYc;
import o.r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU;
import o.r8lambdaUgGAUuJ_lbNZVeF8yYXtWMHrLkQ;
import o.removeNodeAtDepth;
import o.setWebViewContent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LW {
    public static final boolean isStandstill(CameraOptions cameraOptions, CameraOptions cameraOptions2) {
        cameraOptions.getClass();
        cameraOptions2.getClass();
        Point center = cameraOptions.getCenter();
        Point center2 = cameraOptions2.getCenter();
        if (center == null || center2 == null) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{center, center2}, getCieXyz.write())).booleanValue()) {
                return false;
            }
        } else if (Math.abs(center.latitude() - center2.latitude()) > 1.0E-6d || Math.abs(center.longitude() - center2.longitude()) > 1.0E-6d) {
            return false;
        }
        Double bearing = cameraOptions.getBearing();
        Double bearing2 = cameraOptions2.getBearing();
        if (bearing != null && bearing2 != null) {
            if (Math.abs((((((bearing2.doubleValue() - bearing.doubleValue()) + 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d) > 0.1d) {
                return false;
            }
        } else if (!removeNodeAtDepth.read(bearing, bearing2)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptions.getPadding(), cameraOptions2.getPadding()}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{cameraOptions.getAnchor(), cameraOptions2.getAnchor()}, getCieXyz.write())).booleanValue() && removeNodeAtDepth.read(cameraOptions.getZoom(), cameraOptions2.getZoom()) && removeNodeAtDepth.read(cameraOptions.getPitch(), cameraOptions2.getPitch());
    }

    public static String write(String str) {
        StringBuilder sb;
        isDisposed isdisposed;
        String string;
        try {
            try {
                JSONObject jSONObject = new JSONObject();
                PerformanceTracker performanceTracker = new PerformanceTracker(String.valueOf(UUID.randomUUID()));
                String strIconCompatParcelizer = onChange.IconCompatParcelizer("com.huawei.configserver");
                if (TextUtils.isEmpty(strIconCompatParcelizer)) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("DownloadUtils", "Failed to obtain the domain name using GRS.");
                    return null;
                }
                WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12("/servicesupport/updateserver/data/com.huawei.higeo_dataModule_SDMConfigV2?cityId=" + str);
                wrappedCompositionsetContent12.MediaMetadataCompat = strIconCompatParcelizer;
                wrappedCompositionsetContent12.write = performanceTracker;
                wrappedCompositionsetContent12.IconCompatParcelizer = "GET";
                wrappedCompositionsetContent12.RemoteActionCompatParcelizer = jSONObject.toString().getBytes();
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
                return new String(new SubmitEx(wrappedCompositionsetContent12.RemoteActionCompatParcelizer(), accessgetdisposedp).serializer(), Constants.ENCODING);
            } catch (IOException e) {
                if (e instanceof AuthException) {
                    sb = new StringBuilder("IOException:");
                    isdisposed = ((AuthException) e).serializer;
                    sb.append(isdisposed.serializer);
                    sb.append(",");
                    sb.append(isdisposed.read);
                    string = sb.toString();
                } else {
                    string = "IOException:" + isDisposed.write(ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED) + "," + isDisposed.serializer(ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED);
                }
                WrappedCompositionsetContent1211.read("DownloadUtils", string);
                return null;
            }
        } catch (WrappedCompositionsetContent1 e2) {
            string = "OnErrorException:code:" + e2.serializer.serializer + ",apiCode:" + e2.read + ",apiMsg:" + e2.RemoteActionCompatParcelizer;
            WrappedCompositionsetContent1211.read("DownloadUtils", string);
            return null;
        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e3) {
            sb = new StringBuilder("OnFailureException:");
            isdisposed = e3.serializer;
            sb.append(isdisposed.serializer);
            sb.append(",");
            sb.append(isdisposed.read);
            string = sb.toString();
            WrappedCompositionsetContent1211.read("DownloadUtils", string);
            return null;
        }
    }

    public static byte[] RemoteActionCompatParcelizer(String str, String str2) {
        StringBuilder sb;
        String str3;
        int i = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            PerformanceTracker performanceTracker = new PerformanceTracker(String.valueOf(UUID.randomUUID()));
            WrappedCompositionsetContent12 wrappedCompositionsetContent12 = new WrappedCompositionsetContent12(str2);
            wrappedCompositionsetContent12.MediaMetadataCompat = str;
            wrappedCompositionsetContent12.write = performanceTracker;
            wrappedCompositionsetContent12.IconCompatParcelizer = "GET";
            wrappedCompositionsetContent12.RemoteActionCompatParcelizer = jSONObject.toString().getBytes();
            wrappedCompositionsetContent12.RatingCompat = "application/json; charset=utf-8";
            placeAtf8xVGno.read();
            ArrayList arrayList = new ArrayList(4);
            new ArrayList(4);
            accessgetDisposedp accessgetdisposedp = new accessgetDisposedp();
            accessgetdisposedp.write = arrayList;
            arrayList.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(2));
            arrayList.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(i));
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
            return new SubmitEx(wrappedCompositionsetContent12.RemoteActionCompatParcelizer(), accessgetdisposedp).serializer();
        } catch (WrappedCompositionsetContent1 e) {
            sb = new StringBuilder("OnErrorException:code:");
            sb.append(e.serializer.serializer);
            sb.append(",apiCode:");
            sb.append(e.read);
            sb.append(",apiMsg:");
            str3 = e.RemoteActionCompatParcelizer;
            sb.append(str3);
            WrappedCompositionsetContent1211.read("DownloadUtils", sb.toString());
            return new byte[0];
        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e2) {
            sb = new StringBuilder("OnFailureException:");
            isDisposed isdisposed = e2.serializer;
            sb.append(isdisposed.serializer);
            sb.append(",");
            str3 = isdisposed.read;
            sb.append(str3);
            WrappedCompositionsetContent1211.read("DownloadUtils", sb.toString());
            return new byte[0];
        }
    }

    public static boolean serializer(String str, String str2, String str3, String str4) {
        synchronized (LW.class) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("DownloadUtils", "download zip files from the cloud");
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                if (new File(str).exists()) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("DownloadUtils", "The file already exists.");
                    return false;
                }
                String str5 = str + ".temp";
                File file = new File(str5);
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    WrappedCompositionsetContent1211.read("DownloadUtils", "Failed to create the file directory.");
                    return false;
                }
                if (file.exists()) {
                    WrappedCompositionsetContent1211.read("DownloadUtils", "The file is being downloaded.");
                    return false;
                }
                try {
                    URI uriCreate = URI.create(str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(uriCreate.getScheme());
                    sb.append(File.pathSeparator);
                    String str6 = File.separator;
                    sb.append(str6);
                    sb.append(str6);
                    sb.append(uriCreate.getHost());
                    byte[] bArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sb.toString(), uriCreate.getPath());
                    if (bArrRemoteActionCompatParcelizer.length <= 0) {
                        WrappedCompositionsetContent1211.read();
                        return false;
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                        try {
                            fileOutputStream.write(bArrRemoteActionCompatParcelizer, 0, bArrRemoteActionCompatParcelizer.length);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        WrappedCompositionsetContent1211.read("FileUtils", "saveToSd createSdFile stream read write exception");
                    }
                    String strSerializer = dimensionResource.serializer(str5, str3);
                    if (!TextUtils.isEmpty(strSerializer) && strSerializer.equals(str4)) {
                        if (file.renameTo(new File(str))) {
                            WrappedCompositionsetContent1211.read();
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("DownloadUtils", "The zip file is downloaded successfully.");
                            return true;
                        }
                        file.delete();
                        WrappedCompositionsetContent1211.read();
                        return false;
                    }
                    file.delete();
                    WrappedCompositionsetContent1211.read();
                    return false;
                } catch (IllegalArgumentException unused2) {
                    file.delete();
                    WrappedCompositionsetContent1211.read("DownloadUtils", "downloadUrl is illegal");
                    return false;
                }
            }
            WrappedCompositionsetContent1211.read("DownloadUtils", "The url or file path is abnormal.");
            return false;
        }
    }
}
