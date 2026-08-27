package com.huawei.wisesecurity.ucs_credential;

import android.util.Log;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.mlkit_vision_face.zzmq;
import com.huawei.wisesecurity.kfs.crypto.key.AESKeyStoreKeyManager;
import com.huawei.wisesecurity.kfs.exception.KfsException;
import com.huawei.wisesecurity.ucs.common.exception.UcsKeyStoreException;
import com.mapbox.api.directions.v5.utils.ParseUtils;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.internal.performance.PerformanceTracker;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsResponseParsingResult;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$FailedToAnalyze;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$HighSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$LowSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SkippedAnalysis;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedIsOk;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedMatchesCongestionLevel;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$WrongFalsePositiveOverrideDetected;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$DecreaseTraffic;
import com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import java.util.List;
import o.BrazeInAppMessageManagerExternalSyntheticLambda2;
import o.BrazeInAppMessageManagerWhenMappings;
import o.DefaultInAppMessageViewWrapper;
import o.DragAndDropTargetModifierNode;
import o.LtrBoundsComparator;
import o.ScrollCapture_androidKt;
import o.ScrollCaptureonScrollCaptureSearch3;
import o.copyTextdefault;
import o.createNodeAt;
import o.emitFakeNodes;
import o.getCanScrollVertically;
import o.getEllipsize;
import o.getParagraphEnd;
import o.getScrollCaptureInProgress;
import o.getSteps;
import o.getTraversalIndexdelegate;
import o.getVerticalPaddings;
import o.ignoreRemeasureRequests;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.p5;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.stripNonMetricAffectingCharacterStyleSpans;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements LtrBoundsComparator, ParseUtils.ValueParser, TrafficUpdateActionScanner, emitFakeNodes, stripNonMetricAffectingCharacterStyleSpans {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 0;
    private static int read = 0;
    public static AESKeyStoreKeyManager serializer = null;
    private static int write = 1;
    public static final p0 RemoteActionCompatParcelizer = new p0(0);
    public static final Object IconCompatParcelizer = new Object();

    public /* synthetic */ p0() {
    }

    @Override // o.LtrBoundsComparator
    public void RemoteActionCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 77;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.LtrBoundsComparator
    public void read(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    static {
        int i = read + 53;
        write = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // o.LtrBoundsComparator
    public void IconCompatParcelizer(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            Log.e(str, str2);
        } else {
            Log.e(str, str2);
            int i3 = 42 / 0;
        }
    }

    @Override // o.LtrBoundsComparator
    public void write(String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Log.w(str, str2);
        int i4 = MediaDescriptionCompat + 61;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public /* synthetic */ p0(Object obj) {
    }

    public p0(getParagraphEnd getparagraphend, getVerticalPaddings getverticalpaddings, getEllipsize getellipsize) {
    }

    public byte[] read(byte[] bArr) {
        byte[] bArr2;
        synchronized (IconCompatParcelizer) {
            try {
                try {
                    ScrollCaptureonScrollCaptureSearch3 scrollCaptureonScrollCaptureSearch3 = new ScrollCaptureonScrollCaptureSearch3((getCanScrollVertically) serializer.IconCompatParcelizer);
                    scrollCaptureonScrollCaptureSearch3.read = getScrollCaptureInProgress.RSA_OAEP;
                    scrollCaptureonScrollCaptureSearch3.RemoteActionCompatParcelizer("ucs_alias_rootKey");
                    bArr2 = ((ScrollCapture_androidKt) scrollCaptureonScrollCaptureSearch3.write()).getDecryptHandler().from(bArr).to();
                } catch (KfsException e) {
                    getSteps.serializer("KeyStoreManager", "doDecrypt failed, " + e.getMessage(), new Object[0]);
                    throw new UcsKeyStoreException("doDecrypt failed , exception " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArr2;
    }

    @Override // com.mapbox.api.directions.v5.utils.ParseUtils.ValueParser
    public Object parse(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 91;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (!str.equals("unlimited")) {
            return Double.valueOf(str);
        }
        int i4 = MediaBrowserCompatMediaItem + 73;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return Double.valueOf(Double.POSITIVE_INFINITY);
    }

    @Override // o.stripNonMetricAffectingCharacterStyleSpans
    public DragAndDropTargetModifierNode read(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        int i = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new p5(this, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1), true, -1829154247);
        int i2 = MediaBrowserCompatMediaItem + 115;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return dragAndDropTargetModifierNode;
    }

    public static void read(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 37 / 0;
            if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment") != null) {
                return;
            }
        } else if (fragmentActivity.getSupportFragmentManager().findFragmentByTag("com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment") != null) {
            return;
        }
        new GalleryFragment().RemoteActionCompatParcelizer(fragmentActivity.getSupportFragmentManager(), "com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment");
        int i4 = MediaBrowserCompatMediaItem + 109;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner
    public ignoreRemeasureRequests scan(ignoreRemeasureRequests ignoreremeasurerequests, createNodeAt createnodeat) {
        int i;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 117;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        Object obj = null;
        if (i3 % 2 != 0) {
            ignoreremeasurerequests.getClass();
            boolean z = createnodeat instanceof SpeedAnalysisResult$HighSpeedDetected;
            obj.hashCode();
            throw null;
        }
        ignoreremeasurerequests.getClass();
        if (createnodeat instanceof SpeedAnalysisResult$HighSpeedDetected) {
            SpeedAnalysisResult$HighSpeedDetected speedAnalysisResult$HighSpeedDetected = (SpeedAnalysisResult$HighSpeedDetected) createnodeat;
            return new TrafficUpdateAction$DecreaseTraffic(speedAnalysisResult$HighSpeedDetected.currentSpeed, speedAnalysisResult$HighSpeedDetected.legProgress, speedAnalysisResult$HighSpeedDetected.route);
        }
        if ((createnodeat instanceof SpeedAnalysisResult$FailedToAnalyze) || (createnodeat instanceof SpeedAnalysisResult$LowSpeedDetected)) {
            i = MediaDescriptionCompat + 19;
            MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                if (!(createnodeat instanceof SpeedAnalysisResult$WrongFalsePositiveOverrideDetected)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
            }
        } else {
            boolean z2 = createnodeat instanceof SpeedAnalysisResult$SkippedAnalysis;
            int i4 = MediaDescriptionCompat + 75;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            if (z2 || (createnodeat instanceof SpeedAnalysisResult$SpeedIsOk)) {
                i = MediaDescriptionCompat + 19;
                MediaBrowserCompatMediaItem = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    if (!(createnodeat instanceof SpeedAnalysisResult$WrongFalsePositiveOverrideDetected)) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    }
                }
            } else if (!(createnodeat instanceof SpeedAnalysisResult$SpeedMatchesCongestionLevel)) {
                if (!(createnodeat instanceof SpeedAnalysisResult$WrongFalsePositiveOverrideDetected)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: parse-IoAF18A, reason: not valid java name */
    public Object m4527parseIoAF18A(ResponseToParse responseToParse) {
        int i = 2 % 2;
        responseToParse.getClass();
        try {
            if (LoggingLevelUtilKt.accepts(Time$SystemClockImpl.getLogLevel(), LoggingLevel.DEBUG)) {
                Time$SystemClockImpl.logD("parsing directions response", "JAVA-ROUTE-MODELS-PARSER");
            }
            PerformanceTracker performanceTracker = PerformanceTracker.INSTANCE;
            if (!PerformanceTracker.getTrackingIsActive()) {
                int i2 = MediaBrowserCompatMediaItem + 55;
                MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                DirectionsResponseParsingResult directionsResponseParsingResultAccess$parseDirectionsResponseJava = zzmq.access$parseDirectionsResponseJava(responseToParse);
                int i4 = MediaDescriptionCompat + 87;
                MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 43 / 0;
                }
                return directionsResponseParsingResultAccess$parseDirectionsResponseJava;
            }
            PerformanceTracker.syncSectionStarted("JavaRouteModelsParser#parseDirectionsResponseJava");
            try {
                long jWrite = BrazeInAppMessageManagerWhenMappings.write();
                DirectionsResponseParsingResult directionsResponseParsingResultAccess$parseDirectionsResponseJava2 = zzmq.access$parseDirectionsResponseJava(responseToParse);
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("JavaRouteModelsParser#parseDirectionsResponseJava", new BrazeInAppMessageManagerExternalSyntheticLambda2(DefaultInAppMessageViewWrapper.serializer(jWrite)));
                int i6 = MediaBrowserCompatMediaItem + 13;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return directionsResponseParsingResultAccess$parseDirectionsResponseJava2;
            } catch (Throwable th) {
                PerformanceTracker.m4781syncSectionCompleted6Au4x4Y("JavaRouteModelsParser#parseDirectionsResponseJava", null);
                throw th;
            }
        } catch (Throwable th2) {
            return new isItemDismissable(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003b A[PHI: r2 r5 r6 r7 r9
  0x003b: PHI (r2v9 java.lang.String) = (r2v4 java.lang.String), (r2v10 java.lang.String) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r5v12 java.lang.String) = (r5v0 java.lang.String), (r5v13 java.lang.String) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r6v7 java.lang.String) = (r6v0 java.lang.String), (r6v8 java.lang.String) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r7v3 long) = (r7v0 long), (r7v4 long) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x003b: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r2 r5 r6 r7
  0x0035: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v10 java.lang.String) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r5v1 java.lang.String) = (r5v0 java.lang.String), (r5v13 java.lang.String) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v8 java.lang.String) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r7v1 long) = (r7v0 long), (r7v4 long) binds: [B:8:0x0033, B:5:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    public static getTraversalIndexdelegate IconCompatParcelizer(copyTextdefault copytextdefault) {
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        long jLongValue;
        boolean z;
        String str9;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            copytextdefault.getClass();
            str = copytextdefault.accessToken;
            str2 = copytextdefault.refreshToken;
            str3 = copytextdefault.deviceToken;
            j = copytextdefault.expiresIn;
            str4 = copytextdefault.cityName;
            int i3 = 86 / 0;
            if (str4 == null) {
                str5 = str;
                str6 = "";
                str7 = str2;
                str8 = str3;
            } else {
                str5 = str;
                str7 = str2;
                str8 = str3;
                str6 = str4;
            }
        } else {
            copytextdefault.getClass();
            str = copytextdefault.accessToken;
            str2 = copytextdefault.refreshToken;
            str3 = copytextdefault.deviceToken;
            j = copytextdefault.expiresIn;
            str4 = copytextdefault.cityName;
            if (str4 == null) {
                str5 = str;
                str6 = "";
                str7 = str2;
                str8 = str3;
            } else {
                str5 = str;
                str7 = str2;
                str8 = str3;
                str6 = str4;
            }
        }
        Long l = copytextdefault.cityId;
        if (l != null) {
            int i4 = MediaBrowserCompatMediaItem + 45;
            MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j2 = jLongValue;
        String str10 = copytextdefault.contractType;
        String str11 = str10 == null ? "" : str10;
        boolean z2 = copytextdefault.isApplicationPending;
        Boolean bool = copytextdefault.isNewPasswordRequired;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int i6 = MediaDescriptionCompat + 1;
            MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = zBooleanValue;
        } else {
            z = false;
        }
        List list = copytextdefault.idVerificationLocations;
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        List list2 = list == null ? instance_delegatelambda0Var : list;
        boolean zContains = list != null ? list.contains("LOGIN") : false;
        String str12 = copytextdefault.userId;
        if (str12 == null) {
            int i8 = MediaBrowserCompatMediaItem + 29;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str9 = "";
        } else {
            str9 = str12;
        }
        String str13 = copytextdefault.email;
        String str14 = str13 == null ? "" : str13;
        String str15 = copytextdefault.name;
        String str16 = str15 == null ? "" : str15;
        List list3 = copytextdefault.roles;
        List list4 = list3 == null ? instance_delegatelambda0Var : list3;
        List list5 = copytextdefault.countries;
        return new getTraversalIndexdelegate(str5, str7, str8, j * 1000, str11, str6, j2, false, zContains, z2, z, list2, str9, str14, str16, list4, list5 == null ? instance_delegatelambda0Var : list5, copytextdefault.isRiderOnboardingEligible);
    }

    public p0(int i) {
    }
}
