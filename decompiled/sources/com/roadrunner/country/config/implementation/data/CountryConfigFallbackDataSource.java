package com.roadrunner.country.config.implementation.data;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.isItemDismissable;
import o.isOpenInternalroom_runtime;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.resetTransientState;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryConfigFallbackDataSource {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final resetTransientState serializer;
    public final Application write;

    public CountryConfigFallbackDataSource(Application application, resetTransientState resettransientstate, isOpenInternalroom_runtime isopeninternalroom_runtime) {
        this.write = application;
        this.serializer = resettransientstate;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX INFO: renamed from: getFallbackCountryConfigs-IoAF18A, reason: not valid java name */
    public final Object m4877getFallbackCountryConfigsIoAF18A(ContinuationImpl continuationImpl) {
        CountryConfigFallbackDataSource$getFallbackCountryConfigs$1 countryConfigFallbackDataSource$getFallbackCountryConfigs$1;
        int i;
        int i2 = 2 % 2;
        int i3 = read + 33;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i3 % 2 != 0) {
            boolean z = continuationImpl instanceof CountryConfigFallbackDataSource$getFallbackCountryConfigs$1;
            shortNewsContentCardView.hashCode();
            throw null;
        }
        if (continuationImpl instanceof CountryConfigFallbackDataSource$getFallbackCountryConfigs$1) {
            countryConfigFallbackDataSource$getFallbackCountryConfigs$1 = (CountryConfigFallbackDataSource$getFallbackCountryConfigs$1) continuationImpl;
            int i4 = countryConfigFallbackDataSource$getFallbackCountryConfigs$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                countryConfigFallbackDataSource$getFallbackCountryConfigs$1.write = i4 - Integer.MIN_VALUE;
            } else {
                countryConfigFallbackDataSource$getFallbackCountryConfigs$1 = new CountryConfigFallbackDataSource$getFallbackCountryConfigs$1(this, continuationImpl);
                i = read + 103;
                RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
                if (i % 2 != 0) {
                    int i5 = 3 / 4;
                }
            }
        } else {
            countryConfigFallbackDataSource$getFallbackCountryConfigs$1 = new CountryConfigFallbackDataSource$getFallbackCountryConfigs$1(this, continuationImpl);
            i = read + 103;
            RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
            if (i % 2 != 0) {
                int i6 = 3 / 4;
            }
        }
        Object objWithContext = countryConfigFallbackDataSource$getFallbackCountryConfigs$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = countryConfigFallbackDataSource$getFallbackCountryConfigs$1.write;
        try {
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.RemoteActionCompatParcelizer;
                DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(this, shortNewsContentCardView, 17);
                countryConfigFallbackDataSource$getFallbackCountryConfigs$1.write = 1;
                objWithContext = BuildersKt.withContext(defaultIoScheduler, diskLruCache$launchCleanup$1, countryConfigFallbackDataSource$getFallbackCountryConfigs$1);
                if (objWithContext == coroutineSingletons) {
                    int i8 = read + 107;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i7 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i10 = RemoteActionCompatParcelizer + 63;
                read = i10 % Fields.SpotShadowColor;
                if (i10 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            }
            return ((onItemDismiss) objWithContext).IconCompatParcelizer;
        } catch (Exception e) {
            return new isItemDismissable(e);
        }
    }
}
