package com.roadrunner.rider.safety.report.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.roadrunner.home.HomeViewModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import kotlinx.serialization.SerializationException;
import o.Constraints;
import o.DrawableTransformation;
import o.ShortNewsContentCardView;
import o.enableCostDataInAttribution;
import o.enableDeviceIdsReadingOnce;
import o.getCieXyz;
import o.getZeroYbymL2g;
import o.inCompatibilityMode;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;
import o.setAdImpressionsCount;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class MapSafetyReportResponse {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final isOpenInternalroom_runtime IconCompatParcelizer;

    public MapSafetyReportResponse(isOpenInternalroom_runtime isopeninternalroom_runtime, int i) {
        isopeninternalroom_runtime.getClass();
        if (i != 2) {
            this.IconCompatParcelizer = isopeninternalroom_runtime;
        } else {
            this.IconCompatParcelizer = isopeninternalroom_runtime;
        }
    }

    public MapSafetyReportResponse(g0 g0Var, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.IconCompatParcelizer = isopeninternalroom_runtime;
    }

    public static enableCostDataInAttribution IconCompatParcelizer(setAdImpressionsCount setadimpressionscount) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 3;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        float f = setadimpressionscount.score;
        enableDeviceIdsReadingOnce[] enabledeviceidsreadingonceArrValues = enableDeviceIdsReadingOnce.values();
        int length = enabledeviceidsreadingonceArrValues.length;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i4 >= length) {
                DrawableTransformation.write("Array contains no element matching the predicate.");
                return null;
            }
            int i5 = serializer + 117;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                Object[] objArr = {enabledeviceidsreadingonceArrValues[i4].getValue(), setadimpressionscount.tag};
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
                obj.hashCode();
                throw null;
            }
            enableDeviceIdsReadingOnce enabledeviceidsreadingonce = enabledeviceidsreadingonceArrValues[i4];
            Object[] objArr2 = {enabledeviceidsreadingonce.getValue(), setadimpressionscount.tag};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                enableCostDataInAttribution enablecostdatainattribution = new enableCostDataInAttribution(f, enabledeviceidsreadingonce);
                int i6 = serializer + 5;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    return enablecostdatainattribution;
                }
                throw null;
            }
            i4++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public Object serializePictureWithTagsData(Constraints constraints, ContinuationImpl continuationImpl) {
        getZeroYbymL2g getzeroybyml2g;
        int i;
        int i2 = 2 % 2;
        if (!(!(continuationImpl instanceof getZeroYbymL2g))) {
            int i3 = serializer + 29;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            getzeroybyml2g = (getZeroYbymL2g) continuationImpl;
            int i5 = getzeroybyml2g.serializer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                getzeroybyml2g.serializer = i5 - Integer.MIN_VALUE;
            } else {
                getzeroybyml2g = new getZeroYbymL2g(this, continuationImpl);
                i = RemoteActionCompatParcelizer + 31;
                serializer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i6 = 3 / 3;
                }
            }
        } else {
            getzeroybyml2g = new getZeroYbymL2g(this, continuationImpl);
            i = RemoteActionCompatParcelizer + 31;
            serializer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i7 = 3 / 3;
            }
        }
        Object objWithContext = getzeroybyml2g.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = getzeroybyml2g.serializer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i8 != 0) {
                int i9 = RemoteActionCompatParcelizer + 21;
                serializer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0 ? i8 != 1 : i8 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                if (constraints == null) {
                    int i10 = serializer + 89;
                    RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return "";
                }
                ((inCompatibilityMode) this.IconCompatParcelizer).getClass();
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                HomeViewModel.AnonymousClass1 anonymousClass1 = new HomeViewModel.AnonymousClass1(constraints, shortNewsContentCardView, 10);
                getzeroybyml2g.serializer = 1;
                objWithContext = BuildersKt.withContext(defaultScheduler, anonymousClass1, getzeroybyml2g);
                if (objWithContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return (String) objWithContext;
        } catch (SerializationException e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Image overlay data cannot be encoded.", new Object[0]);
            return "";
        } catch (IllegalArgumentException e2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e2, "Image overlay data cannot be encoded.", new Object[0]);
            return "";
        }
    }
}
