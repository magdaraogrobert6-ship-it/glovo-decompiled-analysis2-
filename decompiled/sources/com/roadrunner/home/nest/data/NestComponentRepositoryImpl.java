package com.roadrunner.home.nest.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.ShortNewsContentCardView;
import o.SwitchPreference;
import o.expandFieldArray;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class NestComponentRepositoryImpl {
    private static int MediaDescriptionCompat = 1;
    private static int write;
    public final MutableStateFlow IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final SwitchPreference read;
    public final ExecuteApiRequest serializer;

    public NestComponentRepositoryImpl(SwitchPreference switchPreference, ExecuteApiRequest executeApiRequest) {
        switchPreference.getClass();
        executeApiRequest.getClass();
        this.read = switchPreference;
        this.serializer = executeApiRequest;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new expandFieldArray(null));
        this.IconCompatParcelizer = mutableStateFlow;
        this.RemoteActionCompatParcelizer = mutableStateFlow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    /* JADX INFO: renamed from: load-IoAF18A, reason: not valid java name */
    public final Object m4967loadIoAF18A(ContinuationImpl continuationImpl) {
        NestComponentRepositoryImpl$load$1 nestComponentRepositoryImpl$load$1;
        int i = 2 % 2;
        int i2 = write + 125;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof NestComponentRepositoryImpl$load$1) {
            nestComponentRepositoryImpl$load$1 = (NestComponentRepositoryImpl$load$1) continuationImpl;
            int i4 = nestComponentRepositoryImpl$load$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = write + 79;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                nestComponentRepositoryImpl$load$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                nestComponentRepositoryImpl$load$1 = new NestComponentRepositoryImpl$load$1(this, continuationImpl);
            }
        } else {
            nestComponentRepositoryImpl$load$1 = new NestComponentRepositoryImpl$load$1(this, continuationImpl);
        }
        Object obj = nestComponentRepositoryImpl$load$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = nestComponentRepositoryImpl$load$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 != 0) {
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 13);
        nestComponentRepositoryImpl$load$1.IconCompatParcelizer = 1;
        Object objM4875invokegIAlus = this.serializer.m4875invokegIAlus(mapboxNavigation$parsing$2, nestComponentRepositoryImpl$load$1);
        return objM4875invokegIAlus == coroutineSingletons ? coroutineSingletons : objM4875invokegIAlus;
    }
}
