package com.roadrunner.user.properties.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.heatmap.data.HeatmapDataStore$set$2;
import com.roadrunner.user.properties.data.UserPropertiesDataStore;
import com.roadrunner.user.properties.data.UserPropertiesRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.pauseWebviewIfNecessarylambda10;
import o.subscribeToBannersUpdateslambda30;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class SaveUserPropertiesUseCaseImpl {
    private static int read = 1;
    private static int serializer;
    public final UserPropertiesRepository write;

    public SaveUserPropertiesUseCaseImpl(UserPropertiesRepository userPropertiesRepository) {
        this.write = userPropertiesRepository;
    }

    public final Object invoke(String str, String str2, Integer num, ContinuationImpl continuationImpl) {
        int i = 2 % 2;
        int i2 = serializer + 63;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Saving Kiwi data from rider status", new Object[0]);
        ShortNewsContentCardView shortNewsContentCardView = null;
        subscribeToBannersUpdateslambda30 subscribetobannersupdateslambda30 = new subscribeToBannersUpdateslambda30(str, str2, num != null ? new Long(num.intValue()) : null);
        UserPropertiesRepository userPropertiesRepository = this.write;
        userPropertiesRepository.write.set(subscribetobannersupdateslambda30);
        UserPropertiesDataStore userPropertiesDataStore = userPropertiesRepository.IconCompatParcelizer;
        Object objSerializer = pauseWebviewIfNecessarylambda10.serializer(userPropertiesDataStore.RemoteActionCompatParcelizer, new HeatmapDataStore$set$2(userPropertiesDataStore, subscribetobannersupdateslambda30, shortNewsContentCardView, 11), continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        if (objSerializer != coroutineSingletons) {
            objSerializer = createfromparcel;
        }
        if (objSerializer != coroutineSingletons) {
            return createfromparcel;
        }
        int i4 = read + 25;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 42 / 0;
        }
        return objSerializer;
    }
}
