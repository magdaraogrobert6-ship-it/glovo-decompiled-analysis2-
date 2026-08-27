package com.roadrunner.logger.logger.perseus;

import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda2;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.incognia.internal.Tj;
import com.incognia.internal.X6a;
import com.incognia.internal.t4x;
import com.incognia.internal.whJ;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.RenderFrameFinished;
import com.mapbox.maps.RenderFrameFinishedCallback;
import com.mapbox.maps.renderer.MapboxRenderer;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.common.data.api.UniqueHttpExceptionKt;
import com.roadrunner.customerchat.legacy.core.LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0;
import com.roadrunner.domain.usecase.ObservableUseCase;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.logger.logger.sentry.SentryAppInfoChangedListener;
import com.roadrunner.permission.location.permission.LocationPermissionLifecycleHandler;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.sentry.protocol.ParcelableVolumeInfo;
import io.sentry.protocol.addObserverForBackInvoker;
import io.sentry.protocol.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionUtils;
import o.PinnableContainer;
import o.QueryListener;
import o.SimpleItemTouchHelperCallback;
import o._get_messageWebView_lambda1;
import o.executeAsOneOrNull;
import o.executelambda4;
import o.getCieXyz;
import o.getNavigationEventDispatcher;
import o.getSetHeightCallback;
import o.isUnspecifieduvyYCjk;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U;
import o.r8lambdadiHCtAejt895m8HzbAibmUGZMKo;
import o.r8lambday113fDFTSR5e4PZj6XsSXLtpL60;
import o.removeNodeAtDepth;
import o.safeSetClipToOutline;
import o.syncCustomerProfilefwf_client_release;
import o.updateAdidI;
import okio.Options;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PerseusInitializerImpl$$ExternalSyntheticLambda0 implements ObjectConstructor, OnSuccessListener, OnFailureListener, whJ, MapLoadingErrorDelegate, RenderFrameFinishedCallback, Function, Consumer, isUnspecifieduvyYCjk, Action, getSetHeightCallback, PinnableContainer, r8lambdaaCm2JcMru73kJeywi54SW2Mni8U, getNavigationEventDispatcher, Predicate {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ PerseusInitializerImpl$$ExternalSyntheticLambda0(executeAsOneOrNull executeasoneornull, SentryAppInfoChangedListener sentryAppInfoChangedListener) {
        this.write = 24;
        this.serializer = executeasoneornull;
    }

    @Override // com.incognia.internal.whJ
    public void BGx(List list) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            X6a.BGx((X6a) this.serializer, list);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        X6a.BGx((X6a) this.serializer, list);
        int i3 = RemoteActionCompatParcelizer + 69;
        read = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
    }

    public /* synthetic */ PerseusInitializerImpl$$ExternalSyntheticLambda0(int i, Object obj) {
        this.write = i;
        this.serializer = obj;
    }

    @Override // o.getNavigationEventDispatcher
    public void onActivityResult(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 107;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) obj;
        r8lambdadiHCtAejt895m8HzbAibmUGZMKo r8lambdadihctaejt895m8hzbaibmugzmko = ((LocationPermissionLifecycleHandler) this.serializer).MediaSessionCompatQueueItem;
        bool.getClass();
        r8lambdadihctaejt895m8hzbaibmugzmko.serializer.IconCompatParcelizer(bool);
        int i4 = read + 35;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // io.reactivex.functions.Predicate
    public boolean read(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1 = (MapApiError$$ExternalSyntheticLambda1) this.serializer;
            obj.getClass();
            ((Boolean) mapApiError$$ExternalSyntheticLambda1.invoke(obj)).booleanValue();
            throw null;
        }
        MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda2 = (MapApiError$$ExternalSyntheticLambda1) this.serializer;
        obj.getClass();
        boolean zBooleanValue = ((Boolean) mapApiError$$ExternalSyntheticLambda2.invoke(obj)).booleanValue();
        int i3 = read + 53;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 121;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.write;
        Object obj3 = this.serializer;
        if (i3 != 3) {
            ((RoomDatabase$$ExternalSyntheticLambda2) obj3).invoke(obj);
            return;
        }
        Tj.BGx((t4x) obj3, obj);
        int i4 = read + 117;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.write;
        Object obj = this.serializer;
        if (i3 != 6) {
            MapboxMap._init_$lambda$2((MapboxMap) obj, mapLoadingError);
            return;
        }
        MapboxMap._init_$lambda$1((NativeObserver) obj, mapLoadingError);
        int i4 = read + 113;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = 2 % 2;
        int i2 = read + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj = this.serializer;
        if (i4 != 1) {
            return ConstructorConstructor.lambda$newDefaultConstructor$9((Constructor) obj);
        }
        Object objLambda$newUnsafeAllocator$19 = ConstructorConstructor.lambda$newUnsafeAllocator$19((Class) obj);
        int i5 = RemoteActionCompatParcelizer + 75;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objLambda$newUnsafeAllocator$19;
        }
        throw null;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) throws Exception {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj = this.serializer;
        if (i4 == 4) {
            Tj.BGx((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj, exc);
            return;
        }
        exc.getClass();
        ((MapApiError$$ExternalSyntheticLambda1) obj).invoke(exc);
        int i5 = RemoteActionCompatParcelizer + 19;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Object obj) throws Exception {
        int i = 2 % 2;
        int i2 = read + 109;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i3 = this.write;
        Object obj2 = this.serializer;
        if (i3 == 11) {
            ((HomeFragment.AnonymousClass1) obj2).invoke(obj);
            return;
        }
        if (i3 == 12) {
            ((HomeFragment.AnonymousClass1) obj2).invoke(obj);
            return;
        }
        if (i3 == 17) {
            ((RoomDatabase$$ExternalSyntheticLambda2) obj2).invoke(obj);
            return;
        }
        if (i3 != 18) {
            if (i3 != 26) {
                ((MapApiError$$ExternalSyntheticLambda1) obj2).invoke(obj);
                return;
            } else {
                ((RoomDatabase$$ExternalSyntheticLambda2) obj2).invoke(obj);
                return;
            }
        }
        ((HomeFragment.AnonymousClass1) obj2).invoke(obj);
        int i4 = RemoteActionCompatParcelizer + 51;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if ((r2 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r1.read().setUserProperty("installation_id", (java.lang.String) r5.getResult());
        r5 = 14 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r1.read().setUserProperty("installation_id", (java.lang.String) r5.getResult());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        timber.log.Timber.RemoteActionCompatParcelizer.write(new java.lang.Throwable("Couldn't fetch firebase installation id", r5.getException()));
        r5 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer + 43;
        com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if ((r5 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r5.isSuccessful() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r5.isSuccessful() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        r2 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read + 19;
        com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    @Override // o.PinnableContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onComplete(com.google.android.gms.tasks.Task r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read
            int r1 = r1 + 121
            int r2 = r1 % 128
            com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L20
            java.lang.Object r1 = r4.serializer
            com.roadrunner.logger.logger.firebase.FirebaseAnalyticsUserAttributesChangedListener r1 = (com.roadrunner.logger.logger.firebase.FirebaseAnalyticsUserAttributesChangedListener) r1
            r5.getClass()
            boolean r2 = r5.isSuccessful()
            r3 = 76
            int r3 = r3 / 0
            if (r2 == 0) goto L5a
            goto L2d
        L20:
            java.lang.Object r1 = r4.serializer
            com.roadrunner.logger.logger.firebase.FirebaseAnalyticsUserAttributesChangedListener r1 = (com.roadrunner.logger.logger.firebase.FirebaseAnalyticsUserAttributesChangedListener) r1
            r5.getClass()
            boolean r2 = r5.isSuccessful()
            if (r2 == 0) goto L5a
        L2d:
            int r2 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read
            int r2 = r2 + 19
            int r3 = r2 % 128
            com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r3
            int r2 = r2 % r0
            java.lang.String r0 = "installation_id"
            if (r2 != 0) goto L4c
            com.google.firebase.analytics.FirebaseAnalytics r1 = r1.read()
            java.lang.Object r5 = r5.getResult()
            java.lang.String r5 = (java.lang.String) r5
            r1.setUserProperty(r0, r5)
            r5 = 14
            int r5 = r5 / 0
            return
        L4c:
            com.google.firebase.analytics.FirebaseAnalytics r1 = r1.read()
            java.lang.Object r5 = r5.getResult()
            java.lang.String r5 = (java.lang.String) r5
            r1.setUserProperty(r0, r5)
            return
        L5a:
            timber.log.Timber$Forest r1 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Exception r5 = r5.getException()
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r3 = "Couldn't fetch firebase installation id"
            r2.<init>(r3, r5)
            r1.write(r2)
            int r5 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer
            int r5 = r5 + 43
            int r1 = r5 % 128
            com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L76
            return
        L76:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.onComplete(com.google.android.gms.tasks.Task):void");
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        int i = 2 % 2;
        int i2 = read + 35;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = this.serializer;
        if (i4 == 9) {
            obj.getClass();
            return (syncCustomerProfilefwf_client_release) ((LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0) obj2).invoke(obj);
        }
        if (i4 == 10) {
            obj.getClass();
            return (syncCustomerProfilefwf_client_release) ((LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0) obj2).invoke(obj);
        }
        if (i4 == 13) {
            obj.getClass();
            return (Integer) ((MapApiError$$ExternalSyntheticLambda1) obj2).invoke(obj);
        }
        obj.getClass();
        SingleSource singleSource = (SingleSource) ((RoomDatabase$$ExternalSyntheticLambda2) obj2).invoke(obj);
        int i5 = RemoteActionCompatParcelizer + 65;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 71 / 0;
        }
        return singleSource;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
    
        if (r5 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        r6.serializer(new o.getViewLifecycleOwner(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        r6.serializer(o.getViewLifecycleOwnerLiveData.IconCompatParcelizer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        r2 = (com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl) r2;
        r0 = (com.foodora.courier.main.presentation.MainActivity) r2.write;
        r5.getClass();
        r5 = r5.getBoolean("go_to_settings");
        r1 = (o.removeSingleSubscriptionlambda101) r2.MediaSessionCompatQueueItem;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        r1.RemoteActionCompatParcelizer.logEvent("dark_mode_pop_up_acknowledged", null);
        r5 = new android.content.Intent(r0, (java.lang.Class<?>) com.foodora.courier.legacy.ui.preferences.SettingsActivity.class);
        r5.putExtra("OPEN_SUB_SETTINGS", "APPEARANCE_SETTINGS");
        r0.startActivity(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r1.RemoteActionCompatParcelizer.logEvent("dark_mode_pop_up_dismissed", null);
        r5 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read + 105;
        com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
    
        if ((r5 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        r5 = 3 % 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0087, code lost:
    
        r0.getSupportFragmentManager().write("dark_mode_discovery_result");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r0 != 15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != 15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r5.getClass();
        r6 = ((com.roadrunner.home.HomeFragment) r2).RemoteActionCompatParcelizer();
        r5 = r5.getString("key_start_working_error");
        r6 = r6.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
     */
    @Override // o.isUnspecifieduvyYCjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFragmentResult(android.os.Bundle r5, java.lang.String r6) {
        /*
            r4 = this;
            r6 = 2
            int r0 = r6 % r6
            int r0 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer
            int r0 = r0 + 1
            int r1 = r0 % 128
            com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read = r1
            int r0 = r0 % r6
            r1 = 15
            if (r0 == 0) goto L1b
            int r0 = r4.write
            java.lang.Object r2 = r4.serializer
            r3 = 36
            int r3 = r3 / 0
            if (r0 == r1) goto L43
            goto L21
        L1b:
            int r0 = r4.write
            java.lang.Object r2 = r4.serializer
            if (r0 == r1) goto L43
        L21:
            com.roadrunner.home.HomeFragment r2 = (com.roadrunner.home.HomeFragment) r2
            r5.getClass()
            com.roadrunner.home.HomeViewModel r6 = r2.RemoteActionCompatParcelizer()
            java.lang.String r0 = "key_start_working_error"
            java.lang.String r5 = r5.getString(r0)
            io.grpc.internal.SharedResourcePool r6 = r6.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            if (r5 == 0) goto L3d
            o.getViewLifecycleOwner r0 = new o.getViewLifecycleOwner
            r0.<init>(r5)
            r6.serializer(r0)
            goto L42
        L3d:
            o.getViewLifecycleOwnerLiveData r5 = o.getViewLifecycleOwnerLiveData.IconCompatParcelizer
            r6.serializer(r5)
        L42:
            return
        L43:
            com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl r2 = (com.roadrunner.delivery.ontheway.observer.OnTheWayLifecycleObserverImpl) r2
            java.lang.Object r0 = r2.write
            com.foodora.courier.main.presentation.MainActivity r0 = (com.foodora.courier.main.presentation.MainActivity) r0
            r5.getClass()
            java.lang.String r1 = "go_to_settings"
            boolean r5 = r5.getBoolean(r1)
            java.lang.Object r1 = r2.MediaSessionCompatQueueItem
            o.removeSingleSubscriptionlambda101 r1 = (o.removeSingleSubscriptionlambda101) r1
            r2 = 0
            if (r5 == 0) goto L72
            o.decode r5 = r1.RemoteActionCompatParcelizer
            java.lang.String r6 = "dark_mode_pop_up_acknowledged"
            r5.logEvent(r6, r2)
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.foodora.courier.legacy.ui.preferences.SettingsActivity> r6 = com.foodora.courier.legacy.ui.preferences.SettingsActivity.class
            r5.<init>(r0, r6)
            java.lang.String r6 = "OPEN_SUB_SETTINGS"
            java.lang.String r1 = "APPEARANCE_SETTINGS"
            r5.putExtra(r6, r1)
            r0.startActivity(r5)
            goto L87
        L72:
            o.decode r5 = r1.RemoteActionCompatParcelizer
            java.lang.String r1 = "dark_mode_pop_up_dismissed"
            r5.logEvent(r1, r2)
            int r5 = com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.read
            int r5 = r5 + 105
            int r1 = r5 % 128
            com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer = r1
            int r5 = r5 % r6
            if (r5 != 0) goto L87
            r5 = 3
            int r5 = r5 % 5
        L87:
            o.div7Ah8Wj8 r5 = r0.getSupportFragmentManager()
            java.lang.String r6 = "dark_mode_discovery_result"
            r5.write(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0.onFragmentResult(android.os.Bundle, java.lang.String):void");
    }

    public BannerViewExternalSyntheticLambda2 RemoteActionCompatParcelizer(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8;
        int i = 2 % 2;
        QueryListener queryListener = (QueryListener) this.serializer;
        r8lambday113fDFTSR5e4PZj6XsSXLtpL60 r8lambday113fdftsr5e4pzj6xssxltpl60 = (r8lambday113fDFTSR5e4PZj6XsSXLtpL60) executelambda4Var.read(r8lambday113fDFTSR5e4PZj6XsSXLtpL60.class, "okHttp:request");
        _get_messageWebView_lambda1 _get_messagewebview_lambda1 = (_get_messageWebView_lambda1) executelambda4Var.read(_get_messageWebView_lambda1.class, "okHttp:response");
        if (_get_messagewebview_lambda1 != null) {
            int i2 = read + 33;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (r8lambday113fdftsr5e4pzj6xssxltpl60 != null) {
                int i4 = _get_messagewebview_lambda1.code;
                String strRemoteActionCompatParcelizer = UniqueHttpExceptionKt.serializer.RemoteActionCompatParcelizer(r8lambday113fdftsr5e4pzj6xssxltpl60.url.read(), "/<redacted>");
                Set set = (Set) QueryListener.RemoteActionCompatParcelizer.get(strRemoteActionCompatParcelizer);
                if (set == null || !set.contains(Integer.valueOf(i4))) {
                    bannerViewExternalSyntheticLambda2.IconCompatParcelizer("http.response.status_code", String.valueOf(i4));
                    bannerViewExternalSyntheticLambda2.IconCompatParcelizer("http.request.path", strRemoteActionCompatParcelizer);
                    bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING;
                    return bannerViewExternalSyntheticLambda2;
                }
            }
        }
        if (!((FirebaseRemoteConfigImpl) queryListener.read).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SENTRY_NON_FATAL_LOGS_ENABLED.getFirebaseFlagName())) {
            int i5 = read + 97;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bannerViewExternalSyntheticLambda2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, "Timber"}, getCieXyz.write())).booleanValue();
                throw null;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bannerViewExternalSyntheticLambda2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, "Timber"}, getCieXyz.write())).booleanValue() && bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.FATAL) {
                return null;
            }
        }
        if (queryListener.serializer.getAndSet(0L) != 0) {
            int i6 = read + 11;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            ArrayList arrayListRemoteActionCompatParcelizer = bannerViewExternalSyntheticLambda2.RemoteActionCompatParcelizer();
            if (arrayListRemoteActionCompatParcelizer != null) {
                int i8 = RemoteActionCompatParcelizer + 25;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 = (r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) onContentCardDismissed.MediaMetadataCompat((List) arrayListRemoteActionCompatParcelizer);
            } else {
                r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 = null;
            }
            if ((r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 != null ? r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write : null) == null && r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 != null) {
                r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write = new ParcelableVolumeInfo();
            }
            if (r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8 != null) {
                int i10 = RemoteActionCompatParcelizer + 83;
                read = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                ParcelableVolumeInfo parcelableVolumeInfo = r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8.write;
                if (parcelableVolumeInfo != null) {
                    parcelableVolumeInfo.serializer = Boolean.TRUE;
                }
            }
        }
        return bannerViewExternalSyntheticLambda2;
    }

    @Override // o.r8lambdaaCm2JcMru73kJeywi54SW2Mni8U
    public void write(BrazeActionUtils brazeActionUtils) {
        int i = 2 % 2;
        int i2 = read + 29;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj = this.serializer;
        if (i4 != 24) {
            Map map = (Map) obj;
            brazeActionUtils.getClass();
            addObserverForBackInvoker addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = brazeActionUtils.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            if (addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 == null) {
                addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = new addObserverForBackInvoker();
                int i5 = RemoteActionCompatParcelizer + 81;
                read = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 4 % 2;
                }
            }
            Map linkedHashMap = addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue().toString());
            }
            addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.write = Options.Companion.RemoteActionCompatParcelizer(linkedHashMap);
            brazeActionUtils.read(addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
            brazeActionUtils.IconCompatParcelizer("app_certificate", onMove.read(map, "app_certificate").toString());
            brazeActionUtils.IconCompatParcelizer("analytics_key", onMove.read(map, "analytics_key").toString());
            return;
        }
        executeAsOneOrNull executeasoneornull = (executeAsOneOrNull) obj;
        brazeActionUtils.getClass();
        addObserverForBackInvoker addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29 = brazeActionUtils.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        if (addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29 == null) {
            addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29 = new addObserverForBackInvoker();
        }
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("brand", executeasoneornull.IconCompatParcelizer);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("city", executeasoneornull.RemoteActionCompatParcelizer);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("contract_type", executeasoneornull.serializer);
        String str = executeasoneornull.read;
        if (str == null) {
            int i7 = RemoteActionCompatParcelizer + 57;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
            str = "";
        }
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, new onViewAttachedToWindowlambda0("shift_id", str));
        safeSetClipToOutline safesetcliptooutline = new safeSetClipToOutline();
        Map map2 = addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29.write;
        if (map2 == null) {
            map2 = SimpleItemTouchHelperCallback.serializer;
        }
        safesetcliptooutline.putAll(map2);
        safesetcliptooutline.putAll(SentryAppInfoChangedListener.write(executeasoneornull.MediaMetadataCompat));
        safesetcliptooutline.putAll(mapRemoteActionCompatParcelizer);
        safeSetClipToOutline safesetcliptooutlineIconCompatParcelizer = safesetcliptooutline.IconCompatParcelizer();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29.write, safesetcliptooutlineIconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            return;
        }
        addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29.write = Options.Companion.RemoteActionCompatParcelizer(safesetcliptooutlineIconCompatParcelizer);
        brazeActionUtils.read(addobserverforbackinvokerR8lambdah6vvr6zUWA2U1fE0KsKpOgpr29);
        brazeActionUtils.IconCompatParcelizer(PushNotificationParserObj.COUNTRY_KEY, (String) onMove.read(safesetcliptooutlineIconCompatParcelizer, PushNotificationParserObj.COUNTRY_KEY));
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 125;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        MapboxRenderer mapboxRenderer = (MapboxRenderer) this.serializer;
        if (i3 == 0) {
            MapboxRenderer.renderFrameFinishedCallback$lambda$0(mapboxRenderer, renderFrameFinished);
        } else {
            MapboxRenderer.renderFrameFinishedCallback$lambda$0(mapboxRenderer, renderFrameFinished);
            int i4 = 23 / 0;
        }
    }

    @Override // io.reactivex.functions.Action
    public void run() {
        int i = 2 % 2;
        Disposable disposable = ((ObservableUseCase) this.serializer).serializer;
        if (disposable != null) {
            int i2 = read + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            disposable.dispose();
        }
        int i4 = read + 91;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
