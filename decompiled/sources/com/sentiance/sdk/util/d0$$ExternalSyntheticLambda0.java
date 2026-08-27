package com.sentiance.sdk.util;

import androidx.compose.ui.graphics.Fields;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.roadrunner.order.history.presentation.main.HistoryFragment$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda2;
import com.sentiance.sdk.UserLinker;
import com.sentiance.sdk.UserLinkerAsync;
import com.sentiance.sdk.UserLinkerCallback;
import com.sentiance.sdk.eventtimeline.api.EventTimelineApi;
import com.sentiance.sdk.eventtimeline.api.TripLocation;
import com.sentiance.sdk.eventtimeline.api.TripLocationUpdatesListener;
import io.reactivex.functions.Consumer;
import io.sentry.android.core.createFullyDrawnExecutor;
import io.sentry.android.core.internal.gestures.serializer;
import io.sentry.android.core.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
import io.sentry.android.fragment.SentryFragmentLifecycleCallbacks;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.android.replay.capture.ParcelableVolumeInfo;
import io.sentry.android.replay.capture.RemoteActionCompatParcelizer;
import io.sentry.android.replay.capture.write;
import io.sentry.util.runtime.read;
import o.BrazeActionUtils;
import o.DataStoreProviderr;
import o.DustDataStoreProviderCompanion;
import o._get_messageWebView_lambda0;
import o.getChildStepIteratorandroid_sdk_ui_release;
import o.getNavigationEventDispatcher;
import o.getVERBOSEannotations;
import o.hideCurrentlyDisplayingInAppMessage;
import o.migrateBlocklistedListslambda0;
import o.migrateEventDuplicationMaplambda20;
import o.r8lambda43nB7leLWjup6aTdW2xmA7XSAs;
import o.r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4;
import o.r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU;
import o.r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM;
import o.r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;
import o.r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0$$ExternalSyntheticLambda0 implements getNavigationEventDispatcher, Consumer, OnFailureListener, OnSuccessListener, TripLocationUpdatesListener, UserLinkerAsync, migrateBlocklistedListslambda0, r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM, read, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U, r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4 {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;

    public /* synthetic */ d0$$ExternalSyntheticLambda0(SentryFragmentLifecycleCallbacks sentryFragmentLifecycleCallbacks, Fragment fragment) {
        this.RemoteActionCompatParcelizer = 16;
        this.read = fragment;
    }

    @Override // com.sentiance.sdk.eventtimeline.api.TripLocationUpdatesListener
    public void onLocationReceived(TripLocation tripLocation) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 125;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            EventTimelineApi.lambda$startReceivingTripLocationUpdates$9((TripLocationUpdatesListener) this.read, tripLocation);
            throw null;
        }
        EventTimelineApi.lambda$startReceivingTripLocationUpdates$9((TripLocationUpdatesListener) this.read, tripLocation);
        int i3 = serializer + 3;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // o.r8lambdaYYrMr3f_0vhPsnRJrur1NVokAtM
    public void onRefresh() {
        int i = 2 % 2;
        int i2 = serializer + 57;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        HistoryFragment$$ExternalSyntheticLambda0 historyFragment$$ExternalSyntheticLambda0 = (HistoryFragment$$ExternalSyntheticLambda0) this.read;
        int i4 = getVERBOSEannotations.ensureViewModelStore;
        historyFragment$$ExternalSyntheticLambda0.invoke();
        int i5 = serializer + 97;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public /* synthetic */ d0$$ExternalSyntheticLambda0(int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.read = obj;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 23;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        TncContentKt$$ExternalSyntheticLambda2 tncContentKt$$ExternalSyntheticLambda2 = (TncContentKt$$ExternalSyntheticLambda2) this.read;
        if (i3 == 4) {
            tncContentKt$$ExternalSyntheticLambda2.invoke(obj);
            return;
        }
        tncContentKt$$ExternalSyntheticLambda2.invoke(obj);
        int i4 = IconCompatParcelizer + 1;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.sentiance.sdk.UserLinkerAsync
    public void link(String str, UserLinkerCallback userLinkerCallback) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((UserLinker) this.read).link(str);
            throw null;
        }
        if (((UserLinker) this.read).link(str)) {
            userLinkerCallback.onSuccess();
            return;
        }
        userLinkerCallback.onFailure();
        int i3 = IconCompatParcelizer + 77;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        ((com.roadrunner.customerchat.legacy.core.usecases.CustomerChatEventUseCase$$ExternalSyntheticLambda0) r2).invoke(r5);
        r5 = com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.serializer + 7;
        com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.IconCompatParcelizer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r1 != 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r1 != 2) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        ((o.ConstraintLayout) r2).invoke(r5);
     */
    @Override // io.reactivex.functions.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.IconCompatParcelizer
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.serializer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            int r1 = r4.RemoteActionCompatParcelizer
            java.lang.Object r2 = r4.read
            r3 = 25
            int r3 = r3 / 0
            if (r1 == r0) goto L25
            goto L1f
        L19:
            int r1 = r4.RemoteActionCompatParcelizer
            java.lang.Object r2 = r4.read
            if (r1 == r0) goto L25
        L1f:
            o.ConstraintLayout r2 = (o.ConstraintLayout) r2
            r2.invoke(r5)
            return
        L25:
            com.roadrunner.customerchat.legacy.core.usecases.CustomerChatEventUseCase$$ExternalSyntheticLambda0 r2 = (com.roadrunner.customerchat.legacy.core.usecases.CustomerChatEventUseCase$$ExternalSyntheticLambda0) r2
            r2.invoke(r5)
            int r5 = com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.serializer
            int r5 = r5 + 7
            int r1 = r5 % 128
            com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.IconCompatParcelizer = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.accept(java.lang.Object):void");
    }

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) obj;
        r8lambda43nB7leLWjup6aTdW2xmA7XSAs r8lambda43nb7lelwjup6atdw2xma7xsas = ((r8lambdaBtq4C7Gm1QxfvCp_VmH0bvXHTU) this.read).RemoteActionCompatParcelizer;
        bool.getClass();
        r8lambda43nb7lelwjup6atdw2xma7xsas.serializer(bool.booleanValue());
        int i4 = serializer + 39;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if ((r1 % 2) == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        ((java.lang.Runnable) r4).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
    
        if (r1 != 7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 != 7) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        ((o.getSubtitleGravity) r4).serializer(false);
        r1 = com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.IconCompatParcelizer + 95;
        com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.serializer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void IconCompatParcelizer() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.serializer
            int r1 = r1 + 125
            int r2 = r1 % 128
            com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 7
            if (r1 == 0) goto L1a
            int r1 = r6.RemoteActionCompatParcelizer
            java.lang.Object r4 = r6.read
            r5 = 93
            int r5 = r5 / r2
            if (r1 == r3) goto L33
            goto L20
        L1a:
            int r1 = r6.RemoteActionCompatParcelizer
            java.lang.Object r4 = r6.read
            if (r1 == r3) goto L33
        L20:
            o.getSubtitleGravity r4 = (o.getSubtitleGravity) r4
            r4.serializer(r2)
            int r1 = com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.IconCompatParcelizer
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.serializer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L31
            return
        L31:
            r0 = 0
            throw r0
        L33:
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r4.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sentiance.sdk.util.d0$$ExternalSyntheticLambda0.IconCompatParcelizer():void");
    }

    @Override // o.r8lambda5RMxLAQdv9DJX4ayDOD0F7rfqx4
    public void RemoteActionCompatParcelizer(_get_messageWebView_lambda0 _get_messagewebview_lambda0) {
        int i = 2 % 2;
        ((BrazeActionUtils) this.read).read(new _get_messageWebView_lambda0(4));
        int i2 = IconCompatParcelizer + 23;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        int i = 2 % 2;
        int i2 = serializer + 93;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigProvider firebaseRemoteConfigProvider = (FirebaseRemoteConfigProvider) this.read;
        exc.getClass();
        firebaseRemoteConfigProvider.RemoteActionCompatParcelizer(true);
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(exc, "Realtime activation failed", new Object[0]);
        int i4 = IconCompatParcelizer + 7;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        String strIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        switch (i2) {
            case 15:
                brazeActionUtils.RemoteActionCompatParcelizer(new ArrivalProgressObserver$$ExternalSyntheticLambda0((serializer) obj, 27, brazeActionUtils));
                break;
            case 16:
                Fragment fragment = (Fragment) obj;
                brazeActionUtils.getClass();
                String canonicalName = fragment.getClass().getCanonicalName();
                if (canonicalName == null) {
                    int i3 = IconCompatParcelizer + 69;
                    serializer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    canonicalName = fragment.getClass().getSimpleName();
                    int i5 = IconCompatParcelizer + 41;
                    serializer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                }
                brazeActionUtils.IconCompatParcelizer(canonicalName);
                break;
            case 17:
                int i7 = SentryNavigationListener.serializer;
                brazeActionUtils.getClass();
                brazeActionUtils.RemoteActionCompatParcelizer(new ArrivalProgressObserver$$ExternalSyntheticLambda0(brazeActionUtils, 28, (getChildStepIteratorandroid_sdk_ui_release) obj));
                break;
            case 18:
                int i8 = SentryNavigationListener.serializer;
                brazeActionUtils.getClass();
                brazeActionUtils.RemoteActionCompatParcelizer(new ArrivalProgressObserver$$ExternalSyntheticLambda0((SentryNavigationListener) obj, 29, brazeActionUtils));
                break;
            case 19:
                brazeActionUtils.getClass();
                brazeActionUtils.RemoteActionCompatParcelizer(((write) obj).write());
                break;
            default:
                ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) obj;
                brazeActionUtils.getClass();
                brazeActionUtils.RemoteActionCompatParcelizer(parcelableVolumeInfo.write());
                String strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = brazeActionUtils.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg != null) {
                    int i9 = IconCompatParcelizer + 83;
                    serializer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    strIconCompatParcelizer = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, strR8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg);
                } else {
                    strIconCompatParcelizer = null;
                }
                parcelableVolumeInfo.ComponentActivity.setValue(parcelableVolumeInfo, RemoteActionCompatParcelizer.read[2], strIconCompatParcelizer);
                break;
        }
    }

    @Override // o.migrateBlocklistedListslambda0
    public Object A_() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 5;
        serializer = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        Object obj2 = this.read;
        if (i3 != 0) {
            if (i3 == 11) {
                ((r8lambdadI1pzc9JWWh1yuJ2mzyLqjyqd1I) obj2).run();
                return null;
            }
            String str = createFullyDrawnExecutor.read(((r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0) obj2).RemoteActionCompatParcelizer);
            int i4 = IconCompatParcelizer + 125;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return str;
        }
        DataStoreProviderr dataStoreProviderr = (DataStoreProviderr) obj2;
        DustDataStoreProviderCompanion dustDataStoreProviderCompanion = dataStoreProviderr.read;
        String str2 = dataStoreProviderr.RemoteActionCompatParcelizer;
        int i6 = DustDataStoreProviderCompanion.serializer;
        r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw r8lambda_8vhm_ratewwxuvom3h5y3vqfw = (r8lambda_8vhm_RatEWwxUvOm3H5y3VqFw) dustDataStoreProviderCompanion.RemoteActionCompatParcelizer(new migrateEventDuplicationMaplambda20(dustDataStoreProviderCompanion, str2, 0));
        int i7 = IconCompatParcelizer + 23;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            return r8lambda_8vhm_ratewwxuvom3h5y3vqfw;
        }
        obj.hashCode();
        throw null;
    }
}
