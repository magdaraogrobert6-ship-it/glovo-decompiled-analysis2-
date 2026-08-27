package com.roadrunner.country.config.implementation.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import coil3.RealImageLoader$execute$2$job$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.country.config.implementation.data.database.CountryConfigListLocalDataSource;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.accessisMainThread;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.isItemDismissable;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.rectIntersectsRect;
import o.transferSessionPackageI;
import o.unpackMetaGesturable;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CountryConfigListRepository {
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat;
    public final ExecuteApiRequest IconCompatParcelizer;
    public final getContentViewGroupParentLayout MediaBrowserCompatMediaItem;
    public final CountryConfigListLocalDataSource RatingCompat;
    public r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU RemoteActionCompatParcelizer;
    public final transferSessionPackageI read;
    public final unpackMetaGesturable serializer;
    public final CountryConfigFallbackDataSource write;

    public CountryConfigListRepository(CountryConfigListLocalDataSource countryConfigListLocalDataSource, accessisMainThread accessismainthread, unpackMetaGesturable unpackmetagesturable, transferSessionPackageI transfersessionpackagei, ExecuteApiRequest executeApiRequest, CountryConfigFallbackDataSource countryConfigFallbackDataSource, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.RatingCompat = countryConfigListLocalDataSource;
        this.serializer = unpackmetagesturable;
        this.read = transfersessionpackagei;
        this.IconCompatParcelizer = executeApiRequest;
        this.write = countryConfigFallbackDataSource;
        this.MediaBrowserCompatMediaItem = getcontentviewgroupparentlayout;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX INFO: renamed from: fetchCountryConfigList-IoAF18A, reason: not valid java name */
    public final Object m4878fetchCountryConfigListIoAF18A(ContinuationImpl continuationImpl) {
        CountryConfigListRepository$fetchCountryConfigList$1 countryConfigListRepository$fetchCountryConfigList$1;
        int i;
        int i2 = 2 % 2;
        if (continuationImpl instanceof CountryConfigListRepository$fetchCountryConfigList$1) {
            countryConfigListRepository$fetchCountryConfigList$1 = (CountryConfigListRepository$fetchCountryConfigList$1) continuationImpl;
            int i3 = countryConfigListRepository$fetchCountryConfigList$1.IconCompatParcelizer;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                countryConfigListRepository$fetchCountryConfigList$1.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
            } else {
                countryConfigListRepository$fetchCountryConfigList$1 = new CountryConfigListRepository$fetchCountryConfigList$1(this, continuationImpl);
                i = MediaMetadataCompat + 117;
                MediaDescriptionCompat = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    int i4 = 3 % 4;
                }
            }
        } else {
            countryConfigListRepository$fetchCountryConfigList$1 = new CountryConfigListRepository$fetchCountryConfigList$1(this, continuationImpl);
            i = MediaMetadataCompat + 117;
            MediaDescriptionCompat = i % Fields.SpotShadowColor;
            if (i % 2 == 0) {
                int i5 = 3 % 4;
            }
        }
        Object obj = countryConfigListRepository$fetchCountryConfigList$1.serializer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = countryConfigListRepository$fetchCountryConfigList$1.IconCompatParcelizer;
        if (i6 != 0) {
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i7 = MediaMetadataCompat + 105;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i8 = 70 / 0;
            return ((onItemDismiss) obj).IconCompatParcelizer;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = this.RemoteActionCompatParcelizer;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i9 = MediaMetadataCompat + 27;
            MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
        }
        countryConfigListRepository$fetchCountryConfigList$1.IconCompatParcelizer = 1;
        Object objM4879fetchRemoteListAndUpdateCacheIoAF18A = m4879fetchRemoteListAndUpdateCacheIoAF18A(countryConfigListRepository$fetchCountryConfigList$1);
        if (objM4879fetchRemoteListAndUpdateCacheIoAF18A != obj2) {
            return objM4879fetchRemoteListAndUpdateCacheIoAF18A;
        }
        int i11 = MediaMetadataCompat + 115;
        MediaDescriptionCompat = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    /* JADX WARN: Code duplicated, block: B:64:0x014d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0159  */
    /* JADX INFO: renamed from: fetchRemoteListAndUpdateCache-IoAF18A, reason: not valid java name */
    public final Object m4879fetchRemoteListAndUpdateCacheIoAF18A(ContinuationImpl continuationImpl) {
        CountryConfigListRepository$fetchRemoteListAndUpdateCache$1 countryConfigListRepository$fetchRemoteListAndUpdateCache$1;
        Object objM4875invokegIAlus;
        Object objRemoteActionCompatParcelizer;
        Throwable thSerializer;
        Object obj;
        int i;
        Throwable thSerializer2;
        Object obj2;
        int i2 = 2 % 2;
        if (continuationImpl instanceof CountryConfigListRepository$fetchRemoteListAndUpdateCache$1) {
            int i3 = MediaDescriptionCompat + 45;
            MediaMetadataCompat = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1 = (CountryConfigListRepository$fetchRemoteListAndUpdateCache$1) continuationImpl;
            int i5 = countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                int i6 = MediaMetadataCompat + 107;
                MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = i6 % 2 == 0 ? i5 % Integer.MIN_VALUE : i5 - Integer.MIN_VALUE;
            } else {
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1 = new CountryConfigListRepository$fetchRemoteListAndUpdateCache$1(this, continuationImpl);
            }
        } else {
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1 = new CountryConfigListRepository$fetchRemoteListAndUpdateCache$1(this, continuationImpl);
        }
        Object obj3 = countryConfigListRepository$fetchRemoteListAndUpdateCache$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        CountryConfigListLocalDataSource countryConfigListLocalDataSource = this.RatingCompat;
        int i8 = 26;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 5);
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 1;
            objM4875invokegIAlus = this.IconCompatParcelizer.m4875invokegIAlus(mapboxNavigation$parsing$2, countryConfigListRepository$fetchRemoteListAndUpdateCache$1);
            if (objM4875invokegIAlus != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        int i9 = MediaMetadataCompat + 83;
        int i10 = i9 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i10;
        if (i9 % 2 != 0 ? i7 == 1 : i7 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
            objM4875invokegIAlus = ((onItemDismiss) obj3).IconCompatParcelizer;
        } else {
            int i11 = i10 + 119;
            MediaMetadataCompat = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (i7 == 2) {
                obj2 = countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("mapped the country list", new Object[0]);
                objM4875invokegIAlus = obj2;
                thSerializer2 = onItemDismiss.serializer(objM4875invokegIAlus);
                if (thSerializer2 == null) {
                    return createfromparcel;
                }
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer2, "failed to fetch the country list remotely", new Object[0]);
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = null;
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = null;
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = 0;
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 3;
                objRemoteActionCompatParcelizer = this.write.m4877getFallbackCountryConfigsIoAF18A(countryConfigListRepository$fetchRemoteListAndUpdateCache$1);
                if (objRemoteActionCompatParcelizer != coroutineSingletons) {
                    i = 0;
                    if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("fetch the fallback country list", new Object[0]);
                        objRemoteActionCompatParcelizer = accessisMainThread.RemoteActionCompatParcelizer((rectIntersectsRect) objRemoteActionCompatParcelizer);
                    }
                    if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("mapped the fallback country list", new Object[0]);
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = null;
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = objRemoteActionCompatParcelizer;
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = i;
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 4;
                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                        if (BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RealImageLoader$execute$2$job$1(countryConfigListLocalDataSource, (List) objRemoteActionCompatParcelizer, shortNewsContentCardView, i8), countryConfigListRepository$fetchRemoteListAndUpdateCache$1) != coroutineSingletons) {
                            obj = objRemoteActionCompatParcelizer;
                        }
                    }
                    thSerializer = onItemDismiss.serializer(objRemoteActionCompatParcelizer);
                    if (thSerializer != null) {
                        return new isItemDismissable(thSerializer);
                    }
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("successfully locally saved the fallback country list", new Object[0]);
                    return createfromparcel;
                }
                return coroutineSingletons;
            }
            if (i7 == 3) {
                i = countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write;
                ExtrasKt.RemoteActionCompatParcelizer(obj3);
                objRemoteActionCompatParcelizer = ((onItemDismiss) obj3).IconCompatParcelizer;
                if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("fetch the fallback country list", new Object[0]);
                    objRemoteActionCompatParcelizer = accessisMainThread.RemoteActionCompatParcelizer((rectIntersectsRect) objRemoteActionCompatParcelizer);
                }
                if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("mapped the fallback country list", new Object[0]);
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = null;
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = objRemoteActionCompatParcelizer;
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = i;
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 4;
                    DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    if (BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RealImageLoader$execute$2$job$1(countryConfigListLocalDataSource, (List) objRemoteActionCompatParcelizer, shortNewsContentCardView, i8), countryConfigListRepository$fetchRemoteListAndUpdateCache$1) != coroutineSingletons) {
                        obj = objRemoteActionCompatParcelizer;
                    }
                    return coroutineSingletons;
                }
                thSerializer = onItemDismiss.serializer(objRemoteActionCompatParcelizer);
                if (thSerializer != null) {
                    return new isItemDismissable(thSerializer);
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("successfully locally saved the fallback country list", new Object[0]);
                return createfromparcel;
            }
            if (i7 != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj3);
        }
        objRemoteActionCompatParcelizer = obj;
        thSerializer = onItemDismiss.serializer(objRemoteActionCompatParcelizer);
        if (thSerializer != null) {
            return new isItemDismissable(thSerializer);
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("successfully locally saved the fallback country list", new Object[0]);
        return createfromparcel;
        if (!(objM4875invokegIAlus instanceof isItemDismissable)) {
            try {
                objM4875invokegIAlus = accessisMainThread.RemoteActionCompatParcelizer((rectIntersectsRect) objM4875invokegIAlus);
            } catch (Throwable th) {
                objM4875invokegIAlus = new isItemDismissable(th);
            }
        }
        if (objM4875invokegIAlus instanceof isItemDismissable) {
            thSerializer2 = onItemDismiss.serializer(objM4875invokegIAlus);
            if (thSerializer2 == null) {
                return createfromparcel;
            }
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer2, "failed to fetch the country list remotely", new Object[0]);
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = null;
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = null;
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = 0;
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 3;
            objRemoteActionCompatParcelizer = this.write.m4877getFallbackCountryConfigsIoAF18A(countryConfigListRepository$fetchRemoteListAndUpdateCache$1);
            if (objRemoteActionCompatParcelizer != coroutineSingletons) {
                i = 0;
                if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("fetch the fallback country list", new Object[0]);
                    objRemoteActionCompatParcelizer = accessisMainThread.RemoteActionCompatParcelizer((rectIntersectsRect) objRemoteActionCompatParcelizer);
                }
                if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("mapped the fallback country list", new Object[0]);
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = null;
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = objRemoteActionCompatParcelizer;
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = i;
                    countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 4;
                    DefaultScheduler defaultScheduler3 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    if (BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RealImageLoader$execute$2$job$1(countryConfigListLocalDataSource, (List) objRemoteActionCompatParcelizer, shortNewsContentCardView, i8), countryConfigListRepository$fetchRemoteListAndUpdateCache$1) != coroutineSingletons) {
                        obj = objRemoteActionCompatParcelizer;
                        objRemoteActionCompatParcelizer = obj;
                    }
                }
                thSerializer = onItemDismiss.serializer(objRemoteActionCompatParcelizer);
                if (thSerializer != null) {
                    return new isItemDismissable(thSerializer);
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("successfully locally saved the fallback country list", new Object[0]);
                return createfromparcel;
            }
        } else {
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = objM4875invokegIAlus;
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = null;
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = 0;
            countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 2;
            DefaultScheduler defaultScheduler4 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            if (BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RealImageLoader$execute$2$job$1(countryConfigListLocalDataSource, (List) objM4875invokegIAlus, shortNewsContentCardView, i8), countryConfigListRepository$fetchRemoteListAndUpdateCache$1) != coroutineSingletons) {
                obj2 = objM4875invokegIAlus;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("mapped the country list", new Object[0]);
                objM4875invokegIAlus = obj2;
                thSerializer2 = onItemDismiss.serializer(objM4875invokegIAlus);
                if (thSerializer2 == null) {
                    return createfromparcel;
                }
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer2, "failed to fetch the country list remotely", new Object[0]);
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = null;
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = null;
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = 0;
                countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 3;
                objRemoteActionCompatParcelizer = this.write.m4877getFallbackCountryConfigsIoAF18A(countryConfigListRepository$fetchRemoteListAndUpdateCache$1);
                if (objRemoteActionCompatParcelizer != coroutineSingletons) {
                    i = 0;
                    if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("fetch the fallback country list", new Object[0]);
                        objRemoteActionCompatParcelizer = accessisMainThread.RemoteActionCompatParcelizer((rectIntersectsRect) objRemoteActionCompatParcelizer);
                    }
                    if (!(objRemoteActionCompatParcelizer instanceof isItemDismissable)) {
                        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("mapped the fallback country list", new Object[0]);
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.RemoteActionCompatParcelizer = null;
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.serializer = objRemoteActionCompatParcelizer;
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.write = i;
                        countryConfigListRepository$fetchRemoteListAndUpdateCache$1.read = 4;
                        DefaultScheduler defaultScheduler5 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                        if (BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new RealImageLoader$execute$2$job$1(countryConfigListLocalDataSource, (List) objRemoteActionCompatParcelizer, shortNewsContentCardView, i8), countryConfigListRepository$fetchRemoteListAndUpdateCache$1) != coroutineSingletons) {
                            obj = objRemoteActionCompatParcelizer;
                            objRemoteActionCompatParcelizer = obj;
                        }
                    }
                    thSerializer = onItemDismiss.serializer(objRemoteActionCompatParcelizer);
                    if (thSerializer != null) {
                        return new isItemDismissable(thSerializer);
                    }
                    Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("successfully locally saved the fallback country list", new Object[0]);
                    return createfromparcel;
                }
            }
        }
        return coroutineSingletons;
    }
}
