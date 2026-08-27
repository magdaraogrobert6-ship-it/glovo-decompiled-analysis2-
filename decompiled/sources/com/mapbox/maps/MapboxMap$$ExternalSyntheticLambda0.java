package com.mapbox.maps;

import android.content.pm.ApkChecksum;
import android.nfc.AvailableNfcAntenna;
import android.telephony.CellIdentityNr;
import android.telephony.CellInfoNr;
import android.telephony.CellSignalStrengthNr;
import com.google.android.gms.tasks.OnFailureListener;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.wisesecurity.ucs.common.exception.UcsException;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.FlushOperationResultCallback;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.module.okhttp.NetworkUsageListener;
import o.clipCanvasToPath;
import o.r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class MapboxMap$$ExternalSyntheticLambda0 implements OnFailureListener, Expected.Transformer, r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI, FlushOperationResultCallback, FeatureStateOperationCallback, MapLoadingErrorDelegate, StyleImageMissingCallback, MapLoadedCallback {
    public final /* synthetic */ int $r8$classId;

    public static /* bridge */ /* synthetic */ boolean m$1(Object obj) {
        return obj instanceof CellInfoNr;
    }

    public static /* bridge */ /* synthetic */ boolean m$2(Object obj) {
        return obj instanceof CellIdentityNr;
    }

    @Override // o.r8lambdavNj85t1dyTHN_NO7j11TwIDJPDI
    public EventListener create(clipCanvasToPath clipcanvastopath) {
        return NetworkUsageListener.lambda$static$0(clipcanvastopath);
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        mapLoadingError.getClass();
    }

    public /* synthetic */ MapboxMap$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m4699m(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) ":end request.");
        throw new LocationServiceException(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE, sb.toString());
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return MapboxHttpClient.getLifeCycleStateCallback$lambda$1$lambda$0((String) obj);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = this.$r8$classId;
        if (i == 16) {
            GoogleDeviceLocationProvider.removeLocationUpdates$lambda$12(exc);
        } else if (i != 17) {
            LazyEngine.tryInstallFromGooglePlay$lambda$2(exc);
        } else {
            GoogleDeviceLocationProvider.requestLocationUpdates$lambda$10(exc);
        }
    }

    @Override // com.mapbox.common.FlushOperationResultCallback
    public void run(Expected expected) {
        int i = this.$r8$classId;
        if (i == 0) {
            expected.getClass();
            return;
        }
        if (i == 25) {
            expected.getClass();
            return;
        }
        if (i == 26) {
            expected.getClass();
            return;
        }
        switch (i) {
            case 21:
                MapProvider.flushPendingEvents$lambda$1(expected);
                break;
            case 22:
                MapProvider.flushPendingEvents$lambda$3(expected);
                break;
            case 23:
                expected.getClass();
                break;
            default:
                expected.getClass();
                break;
        }
    }

    public static /* bridge */ /* synthetic */ ApkChecksum m(Object obj) {
        return (ApkChecksum) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AvailableNfcAntenna m4695m(Object obj) {
        return (AvailableNfcAntenna) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CellIdentityNr m4696m(Object obj) {
        return (CellIdentityNr) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CellInfoNr m4697m(Object obj) {
        return (CellInfoNr) obj;
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ CellSignalStrengthNr m4698m(Object obj) {
        return (CellSignalStrengthNr) obj;
    }

    public static /* synthetic */ void m(long j, String str) throws UcsException {
        throw new UcsException(j, str);
    }

    /* JADX INFO: renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m4700m(Object obj) {
        return obj instanceof CellSignalStrengthNr;
    }

    @Override // com.mapbox.maps.MapLoadedCallback
    public void run(MapLoaded mapLoaded) {
        NativeObserver.addOnMapLoadedListener$lambda$3(null, mapLoaded);
    }

    @Override // com.mapbox.maps.StyleImageMissingCallback
    public void run(StyleImageMissing styleImageMissing) {
        NativeObserver.addOnStyleImageMissingListener$lambda$11(null, styleImageMissing);
    }
}
