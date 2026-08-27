package com.roadrunner.customerchat.usecases;

import androidx.compose.ui.graphics.Fields;
import coil3.network.NetworkFetcher;
import com.data.util.AndroidScheduleProvider;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import dagger.Lazy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleUnsubscribeOn;
import o.getLastCustomNonConfigurationInstance;
import o.removeFromGlobalEntries;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomerChatCommunicatorImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final Lazy write;

    public CustomerChatCommunicatorImpl(Lazy lazy) {
        lazy.getClass();
        this.write = lazy;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl = (LegacyCustomerChatCommunicatorImpl) this.write.write();
        SingleUnsubscribeOn singleUnsubscribeOnIconCompatParcelizer = InitializeAppStartupItemsImpl.IconCompatParcelizer(legacyCustomerChatCommunicatorImpl.IconCompatParcelizer, null, null, 2);
        AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) legacyCustomerChatCommunicatorImpl.MediaDescriptionCompat;
        androidScheduleProvider.getClass();
        new SingleObserveOn(singleUnsubscribeOnIconCompatParcelizer, AndroidSchedulers.RemoteActionCompatParcelizer()).write(androidScheduleProvider.IconCompatParcelizer()).subscribe(new MapboxNavigation$$ExternalSyntheticLambda4(27, new removeFromGlobalEntries(legacyCustomerChatCommunicatorImpl)), new MapboxNavigation$$ExternalSyntheticLambda4(28, new NetworkFetcher.AnonymousClass2(18, Timber.RemoteActionCompatParcelizer)));
        int i2 = read + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        int i = 2 % 2;
        str.getClass();
        LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl = (LegacyCustomerChatCommunicatorImpl) this.write.write();
        legacyCustomerChatCommunicatorImpl.getClass();
        SingleUnsubscribeOn singleUnsubscribeOnIconCompatParcelizer = InitializeAppStartupItemsImpl.IconCompatParcelizer(legacyCustomerChatCommunicatorImpl.IconCompatParcelizer, str, null, 2);
        AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) legacyCustomerChatCommunicatorImpl.MediaDescriptionCompat;
        androidScheduleProvider.getClass();
        new SingleObserveOn(singleUnsubscribeOnIconCompatParcelizer, AndroidSchedulers.RemoteActionCompatParcelizer()).write(androidScheduleProvider.IconCompatParcelizer()).subscribe(new MapboxNavigation$$ExternalSyntheticLambda4(23, new getLastCustomNonConfigurationInstance(legacyCustomerChatCommunicatorImpl, z, 1)), new MapboxNavigation$$ExternalSyntheticLambda4(24, new NetworkFetcher.AnonymousClass2(20, Timber.RemoteActionCompatParcelizer)));
        int i2 = read + 101;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
    }

    public final Disposable RemoteActionCompatParcelizer(long j) {
        int i = 2 % 2;
        LegacyCustomerChatCommunicatorImpl legacyCustomerChatCommunicatorImpl = (LegacyCustomerChatCommunicatorImpl) this.write.write();
        SingleUnsubscribeOn singleUnsubscribeOnIconCompatParcelizer = InitializeAppStartupItemsImpl.IconCompatParcelizer(legacyCustomerChatCommunicatorImpl.IconCompatParcelizer, null, Long.valueOf(j), 1);
        AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) legacyCustomerChatCommunicatorImpl.MediaDescriptionCompat;
        androidScheduleProvider.getClass();
        Disposable disposableSubscribe = new SingleObserveOn(singleUnsubscribeOnIconCompatParcelizer, AndroidSchedulers.RemoteActionCompatParcelizer()).write(androidScheduleProvider.IconCompatParcelizer()).subscribe(new MapboxNavigation$$ExternalSyntheticLambda4(25, new BarcodeAnalyzer$$ExternalSyntheticLambda0(3, legacyCustomerChatCommunicatorImpl)), new MapboxNavigation$$ExternalSyntheticLambda4(26, new NetworkFetcher.AnonymousClass2(19, Timber.RemoteActionCompatParcelizer)));
        disposableSubscribe.getClass();
        int i2 = read + 75;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
        }
        return disposableSubscribe;
    }
}
