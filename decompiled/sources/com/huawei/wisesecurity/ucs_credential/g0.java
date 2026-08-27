package com.huawei.wisesecurity.ucs_credential;

import android.content.Context;
import android.text.SpannableString;
import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.FragmentActivity;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs.common.utils.SpUtil;
import com.mapbox.api.directions.v5.utils.ParseUtils;
import com.mapbox.maps.CustomLayerHost;
import com.mapbox.maps.CustomLayerRenderParameters;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$FailedToAnalyze;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$HighSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$LowSpeedDetected;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SkippedAnalysis;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedIsOk;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$SpeedMatchesCongestionLevel;
import com.mapbox.navigation.core.internal.congestions.model.SpeedAnalysisResult$WrongFalsePositiveOverrideDetected;
import com.mapbox.navigation.core.internal.congestions.model.TrafficUpdateAction$RestoreTraffic;
import com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner;
import com.mapbox.navigation.core.preview.NativeRoutesDataParser$parse$1;
import com.mapbox.navigation.ui.base.formatter.ValueFormatter;
import com.mapbox.navigation.utils.internal.ThreadController;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.PhotoSharedSuccessDialogFragment;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ScrollCaptureCandidate;
import o.ShortNewsContentCardView;
import o.createNodeAt;
import o.div7Ah8Wj8;
import o.ignoreRemeasureRequests;
import o.mergeChildui;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements ScrollCaptureCandidate, ParseUtils.ValueParser, CustomLayerHost, TrafficUpdateActionScanner, ValueFormatter, mergeChildui {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    public /* synthetic */ g0() {
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void contextLost() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 21;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 71 / 0;
        }
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void deinitialize() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void initialize() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.mapbox.maps.CustomLayerHost
    public void render(CustomLayerRenderParameters customLayerRenderParameters) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 83;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            customLayerRenderParameters.getClass();
            throw null;
        }
        customLayerRenderParameters.getClass();
        int i3 = write + 35;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public static Float write(Float f) {
        int i = 2 % 2;
        if (f != null) {
            int i2 = RemoteActionCompatParcelizer + 25;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (f.floatValue() > 0.0f) {
                int i4 = RemoteActionCompatParcelizer + 33;
                write = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return f;
                }
                throw null;
            }
        }
        return null;
    }

    @Override // com.mapbox.navigation.ui.base.formatter.ValueFormatter
    public Object format(Object obj) {
        int i = 2 % 2;
        SpannableString spannableString = new SpannableString(String.valueOf((int) ((Number) obj).doubleValue()));
        int i2 = write + 83;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return spannableString;
    }

    public static void write(FragmentActivity fragmentActivity) {
        int i = 2 % 2;
        int i2 = write + 31;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        div7Ah8Wj8 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        if (supportFragmentManager.findFragmentByTag("photo_shared_success") == null) {
            new PhotoSharedSuccessDialogFragment().RemoteActionCompatParcelizer(supportFragmentManager, "photo_shared_success");
            return;
        }
        int i4 = RemoteActionCompatParcelizer + 111;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    public static int IconCompatParcelizer(double d) {
        int i = 2 % 2;
        int iIntValue = new BigDecimal(d).setScale(2, RoundingMode.HALF_DOWN).multiply(new BigDecimal((int) Math.pow(10.0d, 2.0d))).intValue();
        int i2 = RemoteActionCompatParcelizer + 79;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return iIntValue;
    }

    public static HashMap a(Context context) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        String string = SpUtil.getInstance(context).getString("ETag_ucscomponent", "");
        String string2 = SpUtil.getInstance(context).getString("Last-Modified_ucscomponent", "");
        map.put("ETag", string);
        map.put("If-Modified-Since", string2);
        int i2 = RemoteActionCompatParcelizer + 69;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r0 = 64 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        r1 = r9.length;
        r2 = new char[r1 << 1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if (r4 >= r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r5 = com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer + 91;
        com.huawei.wisesecurity.ucs_credential.g0.write = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
        r5 = r9[r4];
        r6 = o.getRowIndex.read;
        r2[r3] = r6[(r5 & 240) >>> 4];
        r2[r3 + 1] = r6[r5 & 15];
        r4 = r4 + 1;
        r3 = r3 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        return new java.lang.String(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (r9 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        r1 = r1 + 5;
        com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if ((r1 % 2) == 0) goto L11;
     */
    @Override // o.ScrollCaptureCandidate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String IconCompatParcelizer(byte[] r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.wisesecurity.ucs_credential.g0.write
            int r2 = r1 + 27
            int r3 = r2 % 128
            com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 == 0) goto L15
            r2 = 15
            int r2 = r2 / r3
            if (r9 != 0) goto L25
            goto L17
        L15:
            if (r9 != 0) goto L25
        L17:
            int r1 = r1 + 5
            int r9 = r1 % 128
            com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer = r9
            int r1 = r1 % r0
            r9 = 0
            if (r1 == 0) goto L24
            r0 = 64
            int r0 = r0 / r3
        L24:
            return r9
        L25:
            int r1 = r9.length
            int r2 = r1 << 1
            char[] r2 = new char[r2]
            r4 = r3
        L2b:
            if (r4 >= r1) goto L50
            int r5 = com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer
            int r5 = r5 + 91
            int r6 = r5 % 128
            com.huawei.wisesecurity.ucs_credential.g0.write = r6
            int r5 = r5 % r0
            r5 = r9[r4]
            char[] r6 = o.getRowIndex.read
            r7 = r5 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >>> 4
            char r7 = r6[r7]
            r2[r3] = r7
            int r7 = r3 + 2
            r5 = r5 & 15
            char r5 = r6[r5]
            int r3 = r3 + 1
            r2[r3] = r5
            int r4 = r4 + 1
            r3 = r7
            goto L2b
        L50:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.wisesecurity.ucs_credential.g0.IconCompatParcelizer(byte[]):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        r0 = 71 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if ((r7 instanceof o.TtsAnnotation) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r7 = ((o.TtsAnnotation) r7).RemoteActionCompatParcelizer;
        r3 = new o.resolveTextDirectionIhaHGbI(r7.title, r7.actionAccept, r7.actionConfirm);
        r7 = com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer + 77;
        com.huawei.wisesecurity.ucs_credential.g0.write = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if ((r7 instanceof o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if ((r7 instanceof o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r7 = ((o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) r7).IconCompatParcelizer;
        r7 = new o.UrlAnnotation(r7.title, r7.message, r7.actionAccept, r7.actionConfirm, r7.actionCancel);
        r1 = com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer + 75;
        com.huawei.wisesecurity.ucs_credential.g0.write = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o.TextStyleKt IconCompatParcelizer(o.VerbatimTtsAnnotation r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.huawei.wisesecurity.ucs_credential.g0.write = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            r7.getClass()
            boolean r1 = r7 instanceof o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww
            r2 = 5
            int r2 = r2 / 0
            if (r1 == 0) goto L44
            goto L20
        L19:
            r7.getClass()
            boolean r1 = r7 instanceof o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww
            if (r1 == 0) goto L44
        L20:
            o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww r7 = (o.r8lambda8Qf6Vtl1pxlFHiMZeMUbAdi_ww) r7
            o.setAttachedViewTreeObserver r7 = r7.IconCompatParcelizer
            java.lang.String r2 = r7.title
            java.lang.String r3 = r7.message
            java.lang.String r4 = r7.actionAccept
            java.lang.String r5 = r7.actionConfirm
            java.lang.String r6 = r7.actionCancel
            o.UrlAnnotation r7 = new o.UrlAnnotation
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            int r1 = com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.wisesecurity.ucs_credential.g0.write = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L43
            r0 = 71
            int r0 = r0 / 0
        L43:
            return r7
        L44:
            boolean r1 = r7 instanceof o.TtsAnnotation
            if (r1 == 0) goto L61
            o.TtsAnnotation r7 = (o.TtsAnnotation) r7
            o.setFocusedChild r7 = r7.RemoteActionCompatParcelizer
            java.lang.String r1 = r7.title
            java.lang.String r2 = r7.actionAccept
            java.lang.String r7 = r7.actionConfirm
            o.resolveTextDirectionIhaHGbI r3 = new o.resolveTextDirectionIhaHGbI
            r3.<init>(r1, r2, r7)
            int r7 = com.huawei.wisesecurity.ucs_credential.g0.RemoteActionCompatParcelizer
            int r7 = r7 + 77
            int r1 = r7 % 128
            com.huawei.wisesecurity.ucs_credential.g0.write = r1
            int r7 = r7 % r0
            return r3
        L61:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer()
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.wisesecurity.ucs_credential.g0.IconCompatParcelizer(o.VerbatimTtsAnnotation):o.TextStyleKt");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0069 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    @Override // com.mapbox.navigation.core.internal.congestions.scanner.TrafficUpdateActionScanner
    public ignoreRemeasureRequests scan(ignoreRemeasureRequests ignoreremeasurerequests, createNodeAt createnodeat) {
        boolean z;
        int i;
        boolean z2;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 117;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        ignoreremeasurerequests.getClass();
        if (createnodeat instanceof SpeedAnalysisResult$WrongFalsePositiveOverrideDetected) {
            SpeedAnalysisResult$WrongFalsePositiveOverrideDetected speedAnalysisResult$WrongFalsePositiveOverrideDetected = (SpeedAnalysisResult$WrongFalsePositiveOverrideDetected) createnodeat;
            return new TrafficUpdateAction$RestoreTraffic(speedAnalysisResult$WrongFalsePositiveOverrideDetected.route, speedAnalysisResult$WrongFalsePositiveOverrideDetected.congestionNumericOverride);
        }
        if (!(createnodeat instanceof SpeedAnalysisResult$FailedToAnalyze)) {
            boolean z3 = createnodeat instanceof SpeedAnalysisResult$HighSpeedDetected;
            int i5 = write + 111;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 3 % 5;
            }
            if (!z3) {
                z = createnodeat instanceof SpeedAnalysisResult$LowSpeedDetected;
            }
            if (!z && !(createnodeat instanceof SpeedAnalysisResult$SkippedAnalysis)) {
                z2 = createnodeat instanceof SpeedAnalysisResult$SpeedIsOk;
                int i7 = RemoteActionCompatParcelizer + 103;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (!z2 && !(createnodeat instanceof SpeedAnalysisResult$SpeedMatchesCongestionLevel)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
            }
            i = write + 99;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }
        int i9 = write + 65;
        RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        z = true;
        if (!z) {
            z2 = createnodeat instanceof SpeedAnalysisResult$SpeedIsOk;
            int i11 = RemoteActionCompatParcelizer + 103;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (!z2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
        }
        i = write + 99;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object parse(List list, ContinuationImpl continuationImpl) {
        NativeRoutesDataParser$parse$1 nativeRoutesDataParser$parse$1;
        int i = 2 % 2;
        if (continuationImpl instanceof NativeRoutesDataParser$parse$1) {
            nativeRoutesDataParser$parse$1 = (NativeRoutesDataParser$parse$1) continuationImpl;
            int i2 = nativeRoutesDataParser$parse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeRoutesDataParser$parse$1.label = i2 - Integer.MIN_VALUE;
            } else {
                nativeRoutesDataParser$parse$1 = new NativeRoutesDataParser$parse$1(this, continuationImpl);
            }
        } else {
            nativeRoutesDataParser$parse$1 = new NativeRoutesDataParser$parse$1(this, continuationImpl);
        }
        Object objWithContext = nativeRoutesDataParser$parse$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = nativeRoutesDataParser$parse$1.label;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            DefaultScheduler defaultScheduler = ThreadController.DefaultDispatcher;
            DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(list, shortNewsContentCardView, 6);
            nativeRoutesDataParser$parse$1.label = 1;
            objWithContext = BuildersKt.withContext(defaultScheduler, diskLruCache$launchCleanup$1, nativeRoutesDataParser$parse$1);
            if (objWithContext == coroutineSingletons) {
                int i4 = write + 29;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    return coroutineSingletons;
                }
                throw null;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = write + 97;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                int i6 = 52 / 0;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            }
        }
        objWithContext.getClass();
        return objWithContext;
    }

    @Override // com.mapbox.api.directions.v5.utils.ParseUtils.ValueParser
    public Object parse(String str) {
        int i = 2 % 2;
        int i2 = write + 43;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public g0(int i) {
    }
}
