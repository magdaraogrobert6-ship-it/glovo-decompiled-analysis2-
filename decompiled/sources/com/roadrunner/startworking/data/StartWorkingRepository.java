package com.roadrunner.startworking.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ImageHeaderParserImageType;
import o.ShortNewsContentCardView;
import o.deserializeContentCardlambda2;
import o.handleInternalBannerRefreshlambda1;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class StartWorkingRepository {
    private static int read = 1;
    private static int write;
    public final deserializeContentCardlambda2 IconCompatParcelizer;
    public final ExecuteApiRequest RemoteActionCompatParcelizer;
    public final ImageHeaderParserImageType serializer;

    public StartWorkingRepository(deserializeContentCardlambda2 deserializecontentcardlambda2, ImageHeaderParserImageType imageHeaderParserImageType, ExecuteApiRequest executeApiRequest) {
        deserializecontentcardlambda2.getClass();
        imageHeaderParserImageType.getClass();
        executeApiRequest.getClass();
        this.IconCompatParcelizer = deserializecontentcardlambda2;
        this.serializer = imageHeaderParserImageType;
        this.RemoteActionCompatParcelizer = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    /* JADX INFO: renamed from: startWorking-gIAlu-s, reason: not valid java name */
    public final Object m5070startWorkinggIAlus(handleInternalBannerRefreshlambda1 handleinternalbannerrefreshlambda1, ContinuationImpl continuationImpl) {
        StartWorkingRepository$startWorking$1 startWorkingRepository$startWorking$1;
        int i = 2 % 2;
        int i2 = read + 93;
        write = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            boolean z = continuationImpl instanceof StartWorkingRepository$startWorking$1;
            throw null;
        }
        if (continuationImpl instanceof StartWorkingRepository$startWorking$1) {
            startWorkingRepository$startWorking$1 = (StartWorkingRepository$startWorking$1) continuationImpl;
            int i3 = startWorkingRepository$startWorking$1.RemoteActionCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = write + 7;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                startWorkingRepository$startWorking$1.RemoteActionCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                startWorkingRepository$startWorking$1 = new StartWorkingRepository$startWorking$1(this, continuationImpl);
            }
        } else {
            startWorkingRepository$startWorking$1 = new StartWorkingRepository$startWorking$1(this, continuationImpl);
        }
        Object obj = startWorkingRepository$startWorking$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = startWorkingRepository$startWorking$1.RemoteActionCompatParcelizer;
        int i7 = 0;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StartWorkingRepository$startWorking$2 startWorkingRepository$startWorking$2 = new StartWorkingRepository$startWorking$2(this, handleinternalbannerrefreshlambda1, shortNewsContentCardView, i7);
            startWorkingRepository$startWorking$1.RemoteActionCompatParcelizer = 1;
            Object objM4875invokegIAlus = this.RemoteActionCompatParcelizer.m4875invokegIAlus(startWorkingRepository$startWorking$2, startWorkingRepository$startWorking$1);
            return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
        }
        int i8 = read + 39;
        write = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0 ? i6 == 1 : i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i9 = read + 113;
        write = i9 % Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            int i10 = 89 / 0;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: fetchComponents-IoAF18A, reason: not valid java name */
    public final Object m5069fetchComponentsIoAF18A(ContinuationImpl continuationImpl) {
        StartWorkingRepository$fetchComponents$1 startWorkingRepository$fetchComponents$1;
        int i = 2 % 2;
        int i2 = read + 13;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof StartWorkingRepository$fetchComponents$1) {
            startWorkingRepository$fetchComponents$1 = (StartWorkingRepository$fetchComponents$1) continuationImpl;
            int i4 = startWorkingRepository$fetchComponents$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 61;
                read = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                startWorkingRepository$fetchComponents$1.write = i4 - Integer.MIN_VALUE;
            } else {
                startWorkingRepository$fetchComponents$1 = new StartWorkingRepository$fetchComponents$1(this, continuationImpl);
            }
        } else {
            startWorkingRepository$fetchComponents$1 = new StartWorkingRepository$fetchComponents$1(this, continuationImpl);
        }
        Object obj = startWorkingRepository$fetchComponents$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = startWorkingRepository$fetchComponents$1.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 != 0) {
            int i8 = write + 111;
            read = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i7 != 1 : i7 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 26);
        startWorkingRepository$fetchComponents$1.write = 1;
        Object objM4875invokegIAlus = this.RemoteActionCompatParcelizer.m4875invokegIAlus(mapboxNavigation$parsing$2, startWorkingRepository$fetchComponents$1);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i9 = write;
        int i10 = i9 + 119;
        read = i10 % Fields.SpotShadowColor;
        int i11 = i10 % 2;
        int i12 = i9 + 13;
        read = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return coroutineSingletons;
    }
}
