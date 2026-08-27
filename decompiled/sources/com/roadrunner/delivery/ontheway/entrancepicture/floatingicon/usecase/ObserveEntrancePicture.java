package com.roadrunner.delivery.ontheway.entrancepicture.floatingicon.usecase;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureDataStore$getTooltipShownCount$2;
import com.roadrunner.delivery.ontheway.entrancepicture.data.EntrancePictureRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ActualParagraphIntrinsics;
import o.AndroidFontListTypeface;
import o.ShortNewsContentCardView;
import o.getCieXyz;
import o.isOpenInternalroom_runtime;
import o.isStateSaved;
import o.prepareForActivityTransitionCarryover;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveEntrancePicture {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final EntrancePictureRepository RemoteActionCompatParcelizer;
    public final isStateSaved serializer;

    public ObserveEntrancePicture(EntrancePictureRepository entrancePictureRepository, isStateSaved isstatesaved) {
        entrancePictureRepository.getClass();
        isstatesaved.getClass();
        this.RemoteActionCompatParcelizer = entrancePictureRepository;
        this.serializer = isstatesaved;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    public static final Object access$shouldShowTooltip(ObserveEntrancePicture observeEntrancePicture, String str, ContinuationImpl continuationImpl) throws Throwable {
        ActualParagraphIntrinsics actualParagraphIntrinsics;
        String str2;
        Object objWithContext;
        int i;
        String str3;
        String str4;
        int i2;
        int i3 = 2 % 2;
        EntrancePictureRepository entrancePictureRepository = observeEntrancePicture.RemoteActionCompatParcelizer;
        if (continuationImpl instanceof ActualParagraphIntrinsics) {
            actualParagraphIntrinsics = (ActualParagraphIntrinsics) continuationImpl;
            int i4 = actualParagraphIntrinsics.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 95;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                actualParagraphIntrinsics.IconCompatParcelizer = i5 % 2 != 0 ? i4 * Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            } else {
                actualParagraphIntrinsics = new ActualParagraphIntrinsics(observeEntrancePicture, continuationImpl);
            }
        } else {
            actualParagraphIntrinsics = new ActualParagraphIntrinsics(observeEntrancePicture, continuationImpl);
        }
        Object obj = actualParagraphIntrinsics.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = actualParagraphIntrinsics.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        boolean z = false;
        z = false;
        z = false;
        int i7 = 1;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            str2 = str;
            actualParagraphIntrinsics.write = str2;
            actualParagraphIntrinsics.IconCompatParcelizer = 1;
            AndroidFontListTypeface androidFontListTypeface = entrancePictureRepository.IconCompatParcelizer;
            isOpenInternalroom_runtime isopeninternalroom_runtime = androidFontListTypeface.IconCompatParcelizer;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new EntrancePictureDataStore$getTooltipShownCount$2(z ? 1 : 0, androidFontListTypeface, shortNewsContentCardView), actualParagraphIntrinsics);
            if (objWithContext != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 != 1) {
            int i8 = IconCompatParcelizer + 111;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i6 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = actualParagraphIntrinsics.RemoteActionCompatParcelizer;
            str3 = actualParagraphIntrinsics.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            String str5 = actualParagraphIntrinsics.write;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objWithContext = obj;
            str2 = str5;
        }
        str4 = (String) obj;
        if (i < 5) {
            int i10 = write + 109;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, str3}, getCieXyz.write())).booleanValue()) {
                i2 = write + 123;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
        int iIntValue = ((Number) objWithContext).intValue();
        actualParagraphIntrinsics.write = str2;
        actualParagraphIntrinsics.RemoteActionCompatParcelizer = iIntValue;
        actualParagraphIntrinsics.IconCompatParcelizer = 2;
        AndroidFontListTypeface androidFontListTypeface2 = entrancePictureRepository.IconCompatParcelizer;
        isOpenInternalroom_runtime isopeninternalroom_runtime2 = androidFontListTypeface2.IconCompatParcelizer;
        DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext2 = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new EntrancePictureDataStore$getTooltipShownCount$2(i7, androidFontListTypeface2, shortNewsContentCardView), actualParagraphIntrinsics);
        if (objWithContext2 != coroutineSingletons) {
            i = iIntValue;
            str3 = str2;
            obj = objWithContext2;
            str4 = (String) obj;
            if (i < 5) {
                int i12 = write + 109;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str4, str3}, getCieXyz.write())).booleanValue()) {
                    i2 = write + 123;
                    IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                    if (i2 % 2 == 0) {
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
        return coroutineSingletons;
    }
}
