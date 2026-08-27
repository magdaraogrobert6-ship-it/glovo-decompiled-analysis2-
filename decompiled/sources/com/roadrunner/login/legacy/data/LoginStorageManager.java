package com.roadrunner.login.legacy.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.login.legacy.data.user.UserStorageManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getQueryExecutor;
import o.prepareForActivityTransitionCarryover;

/* JADX INFO: loaded from: classes3.dex */
public final class LoginStorageManager {
    private static int read = 1;
    private static int write;
    public final UserStorageManager IconCompatParcelizer;

    public LoginStorageManager(UserStorageManager userStorageManager) {
        this.IconCompatParcelizer = userStorageManager;
    }

    public final Object storeUserName(String str, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        getQueryExecutor getqueryexecutor = this.IconCompatParcelizer.serializer;
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new GetNestScope$invoke$3(getqueryexecutor, str, (ShortNewsContentCardView) null), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objWithContext != coroutineSingletons) {
            objWithContext = createfromparcel;
        }
        if (objWithContext != coroutineSingletons) {
            int i2 = read + 7;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            objWithContext = createfromparcel;
        }
        if (objWithContext != coroutineSingletons) {
            return createfromparcel;
        }
        int i4 = write + 19;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objWithContext;
    }
}
