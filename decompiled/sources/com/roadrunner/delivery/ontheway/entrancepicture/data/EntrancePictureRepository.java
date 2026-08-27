package com.roadrunner.delivery.ontheway.entrancepicture.data;

import androidx.compose.foundation.pager.PagerState$scrollToPage$2;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidFontListTypeface;
import o.AndroidParagraphHelper_androidKt;
import o.ShortNewsContentCardView;
import o.accessrequireViewFactoryHolder;
import o.accesstoNestedScrollSource;
import o.createFromParcel;
import o.isOpenInternalroom_runtime;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class EntrancePictureRepository {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final AndroidFontListTypeface IconCompatParcelizer;
    public final accessrequireViewFactoryHolder serializer;

    public EntrancePictureRepository(accessrequireViewFactoryHolder accessrequireviewfactoryholder, AndroidFontListTypeface androidFontListTypeface) {
        accessrequireviewfactoryholder.getClass();
        androidFontListTypeface.getClass();
        this.serializer = accessrequireviewfactoryholder;
        this.IconCompatParcelizer = androidFontListTypeface;
    }

    public final HeatmapDataStore$get$$inlined$map$1 RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        HeatmapDataStore$get$$inlined$map$1 heatmapDataStore$get$$inlined$map$1 = new HeatmapDataStore$get$$inlined$map$1(new StateProviderImpl$special$$inlined$map$2(((StateProviderImpl) ((accesstoNestedScrollSource) this.serializer)).MediaBrowserCompatMediaItem, 19), this, 11);
        int i2 = read + 19;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return heatmapDataStore$get$$inlined$map$1;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    public final Object incrementTooltipShownCount(ContinuationImpl continuationImpl) throws Throwable {
        AndroidParagraphHelper_androidKt androidParagraphHelper_androidKt;
        int i = 2;
        int i2 = 2 % 2;
        if (continuationImpl instanceof AndroidParagraphHelper_androidKt) {
            androidParagraphHelper_androidKt = (AndroidParagraphHelper_androidKt) continuationImpl;
            int i3 = androidParagraphHelper_androidKt.serializer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = RemoteActionCompatParcelizer + 1;
                read = i4 % Fields.SpotShadowColor;
                androidParagraphHelper_androidKt.serializer = i4 % 2 == 0 ? i3 * Integer.MIN_VALUE : i3 - Integer.MIN_VALUE;
                int i5 = read + 29;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 5 % 5;
                }
            } else {
                androidParagraphHelper_androidKt = new AndroidParagraphHelper_androidKt(this, continuationImpl);
            }
        } else {
            androidParagraphHelper_androidKt = new AndroidParagraphHelper_androidKt(this, continuationImpl);
        }
        Object objWithContext = androidParagraphHelper_androidKt.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = androidParagraphHelper_androidKt.serializer;
        AndroidFontListTypeface androidFontListTypeface = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            androidParagraphHelper_androidKt.serializer = 1;
            isOpenInternalroom_runtime isopeninternalroom_runtime = androidFontListTypeface.IconCompatParcelizer;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new EntrancePictureDataStore$getTooltipShownCount$2(0, androidFontListTypeface, shortNewsContentCardView), androidParagraphHelper_androidKt);
            if (objWithContext != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i8 = RemoteActionCompatParcelizer;
        int i9 = i8 + 75;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0 ? i7 != 1 : i7 != 0) {
            if (i7 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i8 + 105;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            shortNewsContentCardView.hashCode();
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        int iIntValue = ((Number) objWithContext).intValue();
        androidParagraphHelper_androidKt.serializer = 2;
        isOpenInternalroom_runtime isopeninternalroom_runtime2 = androidFontListTypeface.IconCompatParcelizer;
        DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PagerState$scrollToPage$2(androidFontListTypeface, iIntValue + 1, shortNewsContentCardView, i), androidParagraphHelper_androidKt);
        if (objWithContext2 != coroutineSingletons) {
            objWithContext2 = createfromparcel;
        }
        if (objWithContext2 != coroutineSingletons) {
            int i11 = RemoteActionCompatParcelizer + 67;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return createfromparcel;
        }
        return coroutineSingletons;
    }
}
