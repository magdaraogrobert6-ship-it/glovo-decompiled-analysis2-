package com.mapbox.navigation.core.directions.session;

import android.app.Application;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import androidx.datastore.rxjava2.RxDataStore;
import com.mapbox.search.MapboxSearchSdkInitializerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.RetryCountTrackerImpl;
import io.reactivex.Scheduler;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.pickChildForBackwardSearch;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DirectionsSessionKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    public static final ArrayList getRoutesPlusIgnored(MapboxDirectionsSession mapboxDirectionsSession) {
        int i = 2 % 2;
        mapboxDirectionsSession.getClass();
        List routes = mapboxDirectionsSession.getRoutes();
        List ignoredRoutes = mapboxDirectionsSession.getIgnoredRoutes();
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(ignoredRoutes, 10));
        Iterator it = ignoredRoutes.iterator();
        int i2 = RemoteActionCompatParcelizer + 77;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int i4 = read + 13;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            arrayList.add(((IgnoredRoute) it.next()).navigationRoute);
        }
        return onContentCardDismissed.IconCompatParcelizer(arrayList, routes);
    }

    public static RetryCountTrackerImpl write(Application application) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        application.getClass();
        Scheduler scheduler = Schedulers.IconCompatParcelizer;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = RxJavaPlugins.MediaMetadataCompat;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
            try {
                scheduler = (Scheduler) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.apply(scheduler);
                int i4 = RemoteActionCompatParcelizer + 53;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 4;
                }
            } catch (Throwable th) {
                throw ExceptionHelper.write(th);
            }
        }
        scheduler.getClass();
        ArrayList arrayList = new ArrayList();
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(new r8lambdalYb5VtOc2Bfai2EaTTJcq9AhA(scheduler).plus(JobKt.RemoteActionCompatParcelizer()));
        Object[] objArr = {null, arrayList, contextScopeRemoteActionCompatParcelizer, new SingleProcessDataStore$file$2(2, new MapboxSearchSdkInitializerImpl.AnonymousClass1(application, 1))};
        return new RetryCountTrackerImpl(new RxDataStore(new pickChildForBackwardSearch((SingleProcessDataStore) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-756067223, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 756067223, sourceInformationContextOfdefault.read(), objArr, sourceInformationContextOfdefault.read())), contextScopeRemoteActionCompatParcelizer));
    }
}
