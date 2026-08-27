package com.roadrunner.login.legacy.data.user;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.data.util.exception.FoodoraNullException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.HomeViewModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.getDouble;
import o.getQueryExecutor;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class UserStorageManager {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final getQueryExecutor serializer;

    public UserStorageManager(getQueryExecutor getqueryexecutor) {
        this.serializer = getqueryexecutor;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object loadUserName(ContinuationImpl continuationImpl) throws Throwable {
        getDouble getdouble;
        int i = 2 % 2;
        if (continuationImpl instanceof getDouble) {
            getdouble = (getDouble) continuationImpl;
            int i2 = getdouble.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getdouble.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                getdouble = new getDouble(this, continuationImpl);
            }
        } else {
            getdouble = new getDouble(this, continuationImpl);
        }
        Object objWithContext = getdouble.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getdouble.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i3 != 0) {
                int i4 = RemoteActionCompatParcelizer + 1;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                int i6 = read + 105;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
                getQueryExecutor getqueryexecutor = this.serializer;
                getdouble.RemoteActionCompatParcelizer = 1;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new HomeViewModel.AnonymousClass1(getqueryexecutor, shortNewsContentCardView, 17), getdouble);
                if (objWithContext == coroutineSingletons) {
                    int i8 = RemoteActionCompatParcelizer + 95;
                    read = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    return coroutineSingletons;
                }
            }
            String str = (String) objWithContext;
            int i10 = RemoteActionCompatParcelizer + 39;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 55 / 0;
            }
            return str;
        } catch (FoodoraNullException unused) {
            return "";
        }
    }
}
