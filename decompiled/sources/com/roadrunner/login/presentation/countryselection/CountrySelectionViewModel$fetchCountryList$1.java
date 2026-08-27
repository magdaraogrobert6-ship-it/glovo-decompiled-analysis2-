package com.roadrunner.login.presentation.countryselection;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.home.nest.NestViewModel$observeNestScope$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CountrySelectionViewModel$fetchCountryList$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ CountrySelectionViewModel read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountrySelectionViewModel$fetchCountryList$1(CountrySelectionViewModel countrySelectionViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = countrySelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        CountrySelectionViewModel countrySelectionViewModel = this.read;
        int i5 = 0;
        if (i4 == 0) {
            return new CountrySelectionViewModel$fetchCountryList$1(countrySelectionViewModel, shortNewsContentCardView, i5);
        }
        CountrySelectionViewModel$fetchCountryList$1 countrySelectionViewModel$fetchCountryList$1 = new CountrySelectionViewModel$fetchCountryList$1(countrySelectionViewModel, shortNewsContentCardView, 1);
        int i6 = serializer + 19;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 94 / 0;
        }
        return countrySelectionViewModel$fetchCountryList$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((CountrySelectionViewModel$fetchCountryList$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((CountrySelectionViewModel$fetchCountryList$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = IconCompatParcelizer + 5;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 47;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        CountrySelectionViewModel countrySelectionViewModel = this.read;
        if (i3 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(countrySelectionViewModel.MediaSessionCompatQueueItem.RemoteActionCompatParcelizer.RatingCompat.write());
                NestViewModel$observeNestScope$1.AnonymousClass1 anonymousClass1 = new NestViewModel$observeNestScope$1.AnonymousClass1(28, countrySelectionViewModel);
                this.write = 1;
                if (flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1.collect(anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createfromparcel2;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.write;
        if (i5 != 0) {
            int i6 = serializer + 59;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 != 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i7 = IconCompatParcelizer + 51;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getAllSemanticsNodesToMap getallsemanticsnodestomap = countrySelectionViewModel.MediaSessionCompatToken;
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(countrySelectionViewModel, null, 16);
            this.write = 1;
            if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("country_selection_fetch_list", mapboxNavigation$parsing$2, this) == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        }
        return createfromparcel2;
    }
}
