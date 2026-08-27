package com.roadrunner.helpcenter.businessmetrics.repo;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.PreferencesSerializer;
import o.ShortNewsContentCardView;
import o.SingleProcessDataStoredata11;
import o.createFromParcel;
import o.onItemDismiss;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class BusinessMetricsRepository {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final SingleProcessDataStoredata11 RemoteActionCompatParcelizer;
    public final ExecuteApiRequest read;
    public final ArrayList write;

    public BusinessMetricsRepository(ExecuteApiRequest executeApiRequest, SingleProcessDataStoredata11 singleProcessDataStoredata11) {
        executeApiRequest.getClass();
        singleProcessDataStoredata11.getClass();
        this.read = executeApiRequest;
        this.RemoteActionCompatParcelizer = singleProcessDataStoredata11;
        this.write = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0049 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final Object postEvents(ContinuationImpl continuationImpl) {
        PreferencesSerializer preferencesSerializer;
        int i;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i2;
        ArrayList arrayList;
        ShortNewsContentCardView shortNewsContentCardView;
        Object objM4875invokegIAlus;
        Throwable thSerializer;
        int i3;
        int i4 = 2 % 2;
        int i5 = IconCompatParcelizer + 95;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            if (continuationImpl instanceof PreferencesSerializer) {
                preferencesSerializer = (PreferencesSerializer) continuationImpl;
                i = preferencesSerializer.IconCompatParcelizer;
                if ((i & Integer.MIN_VALUE) != 0) {
                    preferencesSerializer.IconCompatParcelizer = i - Integer.MIN_VALUE;
                }
            }
            obj = preferencesSerializer.write;
            coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            i2 = preferencesSerializer.IconCompatParcelizer;
            arrayList = this.write;
            shortNewsContentCardView = null;
            if (i2 == 0) {
                i3 = serializer + 121;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!arrayList.isEmpty()) {
                MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 12);
                preferencesSerializer.IconCompatParcelizer = 1;
                objM4875invokegIAlus = this.read.m4875invokegIAlus(mapboxNavigation$parsing$2, preferencesSerializer);
                if (objM4875invokegIAlus == coroutineSingletons) {
                    int i6 = serializer + 67;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
            thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
            if (thSerializer == null) {
                int i8 = IconCompatParcelizer + 119;
                serializer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                arrayList.clear();
            } else {
                Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
                new Throwable(thSerializer.getMessage());
                forest.getClass();
                int i10 = IconCompatParcelizer + 39;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
            return createFromParcel.INSTANCE;
        }
        int i12 = 71 / 0;
        if (continuationImpl instanceof PreferencesSerializer) {
            preferencesSerializer = (PreferencesSerializer) continuationImpl;
            i = preferencesSerializer.IconCompatParcelizer;
            if ((i & Integer.MIN_VALUE) != 0) {
                preferencesSerializer.IconCompatParcelizer = i - Integer.MIN_VALUE;
            }
        }
        obj = preferencesSerializer.write;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = preferencesSerializer.IconCompatParcelizer;
        arrayList = this.write;
        shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!arrayList.isEmpty()) {
                MapboxNavigation$parsing$2 mapboxNavigation$parsing$3 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 12);
                preferencesSerializer.IconCompatParcelizer = 1;
                objM4875invokegIAlus = this.read.m4875invokegIAlus(mapboxNavigation$parsing$3, preferencesSerializer);
                if (objM4875invokegIAlus == coroutineSingletons) {
                    int i13 = serializer + 67;
                    IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }
        i3 = serializer + 121;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer == null) {
            int i15 = IconCompatParcelizer + 119;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            arrayList.clear();
        } else {
            Timber.Forest forest2 = Timber.RemoteActionCompatParcelizer;
            new Throwable(thSerializer.getMessage());
            forest2.getClass();
            int i17 = IconCompatParcelizer + 39;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
        }
        return createFromParcel.INSTANCE;
        preferencesSerializer = new PreferencesSerializer(this, continuationImpl);
        obj = preferencesSerializer.write;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = preferencesSerializer.IconCompatParcelizer;
        arrayList = this.write;
        shortNewsContentCardView = null;
        if (i2 == 0) {
            i3 = serializer + 121;
            IconCompatParcelizer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        if (!arrayList.isEmpty()) {
            MapboxNavigation$parsing$2 mapboxNavigation$parsing$4 = new MapboxNavigation$parsing$2(this, shortNewsContentCardView, 12);
            preferencesSerializer.IconCompatParcelizer = 1;
            objM4875invokegIAlus = this.read.m4875invokegIAlus(mapboxNavigation$parsing$4, preferencesSerializer);
            if (objM4875invokegIAlus == coroutineSingletons) {
                int i19 = serializer + 67;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                int i110 = i19 % 2;
                return coroutineSingletons;
            }
        }
        return createFromParcel.INSTANCE;
        thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer == null) {
            int i111 = IconCompatParcelizer + 119;
            serializer = i111 % Fields.SpotShadowColor;
            int i112 = i111 % 2;
            arrayList.clear();
        } else {
            Timber.Forest forest3 = Timber.RemoteActionCompatParcelizer;
            new Throwable(thSerializer.getMessage());
            forest3.getClass();
            int i113 = IconCompatParcelizer + 39;
            serializer = i113 % Fields.SpotShadowColor;
            int i114 = i113 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
