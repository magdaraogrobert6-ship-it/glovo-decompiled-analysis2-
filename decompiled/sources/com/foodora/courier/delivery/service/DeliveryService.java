package com.foodora.courier.delivery.service;

import android.app.Application;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.compose.ui.graphics.Fields;
import bo.app.hg$$ExternalSyntheticLambda5;
import coil3.ExtrasKt;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.application.CourierApplication;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionResult;
import com.google.firebase.Timestamp;
import com.huawei.location.gwi.util.GwiErrorCode;
import com.logistics.rider.glovo.R;
import com.roadrunner.auth.domain.token.IsUserAuthenticatedWrapper;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import com.roadrunner.incognia.implementation.IncogniaManagerImpl;
import com.roadrunner.notifications.PendingIntentBuilderImpl;
import com.roadrunner.overlay.bubble.service.OverlayTaskExecutorImpl$observePushEvents$1;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.sentiance.core.model.thrift.k$c;
import dagger.Lazy;
import io.sentry.android.replay.util.MediaSessionCompatToken;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.AndroidIndirectPointerEvent_androidKt;
import o.BrazeExternalSyntheticLambda5;
import o.BulletSpan_androidKt;
import o.DiskLruCacheEditor;
import o.HapticFeedback;
import o.MulticastConsumer;
import o.ShortNewsContentCardView;
import o.accessgetGreencp;
import o.accessgetPresscp;
import o.applyLayoutFeatures;
import o.canTrackMeasurementConsentI;
import o.checkAdjustAdRevenue;
import o.createDeeplinkIntentI;
import o.createFromParcel;
import o.deleteGlobalCallbackParameters;
import o.deleteGlobalPartnerParameters;
import o.forEachImmediateDelegateui;
import o.getActionViewIntentlambda0;
import o.getColorIntegerOrNull;
import o.getContentViewGroupParentLayout;
import o.getDataStoreFileName;
import o.getPresentationContext;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X;
import o.getToggleOff5zf0vsI;
import o.getTouchaOaMEAU;
import o.getVirtualKey5zf0vsI;
import o.hasNestedScrollingParent;
import o.inCompatibilityMode;
import o.invalidateOwnerFocusState;
import o.isAdapterPositionOnScreen;
import o.mergeJsonObjects;
import o.onFailure;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I;
import o.removeNodeAtDepth;
import o.requestInputModeiuPiT84;
import o.requestSingleLocationUpdatelambda1;
import o.s0;
import o.transferSessionPackageI;
import o.updateAdidI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class DeliveryService extends Service {
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 0;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = 1;
    public static final /* synthetic */ int serializer = 0;
    public DiskLruCacheEditor IconCompatParcelizer;
    public getTouchaOaMEAU MediaBrowserCompatMediaItem;
    public onFailure MediaDescriptionCompat;
    public k$c MediaMetadataCompat;
    public Lazy MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final isAdapterPositionOnScreen MediaSessionCompatToken = new isAdapterPositionOnScreen(new BrazeUser$$ExternalSyntheticLambda28(10, this));
    public accessgetPresscp ParcelableVolumeInfo;
    public transferSessionPackageI PlaybackStateCompat;
    public deleteGlobalPartnerParameters PlaybackStateCompatCustomAction;
    public MulticastConsumer RatingCompat;
    public IsUserAuthenticatedWrapper RemoteActionCompatParcelizer;
    public IsUserSignedInImpl read;
    public inCompatibilityMode write;

    /* JADX INFO: renamed from: com.foodora.courier.delivery.service.DeliveryService$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int read = 0;
        private static int write = 1;
        public int IconCompatParcelizer;
        public final /* synthetic */ DeliveryService RemoteActionCompatParcelizer;
        public final /* synthetic */ int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(DeliveryService deliveryService, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.RemoteActionCompatParcelizer = deliveryService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = write + 35;
            read = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            DeliveryService deliveryService = this.RemoteActionCompatParcelizer;
            if (i4 == 0) {
                return new AnonymousClass1(deliveryService, shortNewsContentCardView, 0);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(deliveryService, shortNewsContentCardView, 1);
            int i5 = read + 5;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = 2 % 2;
            int i2 = read + 121;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            int i3 = this.serializer;
            createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            if (i3 != 0) {
                return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = read + 77;
            write = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
        /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        
            if (r10 == r1) goto L42;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foodora.courier.delivery.service.DeliveryService.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 123;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return null;
        }
        int i3 = 63 / 0;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        o.removeNodeAtDepth.serializer("locationUpdateTaskExecutor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1 = r1 + 31;
        com.foodora.courier.delivery.service.DeliveryService.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sentiance.core.model.thrift.k$c IconCompatParcelizer() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.foodora.courier.delivery.service.DeliveryService.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY
            int r2 = r1 + 67
            int r3 = r2 % 128
            com.foodora.courier.delivery.service.DeliveryService.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            com.sentiance.core.model.thrift.k$c r2 = r4.MediaMetadataCompat
            r3 = 40
            int r3 = r3 / 0
            if (r2 == 0) goto L23
            goto L1b
        L17:
            com.sentiance.core.model.thrift.k$c r2 = r4.MediaMetadataCompat
            if (r2 == 0) goto L23
        L1b:
            int r1 = r1 + 31
            int r3 = r1 % 128
            com.foodora.courier.delivery.service.DeliveryService.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = r3
            int r1 = r1 % r0
            return r2
        L23:
            java.lang.String r0 = "locationUpdateTaskExecutor"
            o.removeNodeAtDepth.serializer(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foodora.courier.delivery.service.DeliveryService.IconCompatParcelizer():com.sentiance.core.model.thrift.k$c");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 71;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        serializer("onDestroy");
        super.onDestroy();
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DeliveryService OnDestroy", new Object[0]);
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 35;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent intent) {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 85;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer("DeliveryService onTaskRemoved", new Object[0]);
        read("onTaskRemoved");
        super.onTaskRemoved(intent);
        int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 109;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void read(String str) {
        int i = 2 % 2;
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 39;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        transferSessionPackageI transfersessionpackagei = this.PlaybackStateCompat;
        if (transfersessionpackagei == null) {
            removeNodeAtDepth.serializer("remoteConfig");
            throw null;
        }
        if (!((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_DEBOUNCE_LOCATION_SERVICE_ACTIONS)) {
            serializer(str);
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 51;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        getTouchaOaMEAU gettouchaoameau = this.MediaBrowserCompatMediaItem;
        if (gettouchaoameau == null) {
            removeNodeAtDepth.serializer("locationServiceManager");
            throw null;
        }
        gettouchaoameau.RemoteActionCompatParcelizer();
        int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 5;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final void serializer(String str) {
        int i = 2 % 2;
        YieldKt.write((getContentViewGroupParentLayout) this.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper(), (CancellationException) null);
        IconCompatParcelizer().read();
        onFailure onfailure = this.MediaDescriptionCompat;
        if (onfailure == null) {
            removeNodeAtDepth.serializer("overlayTaskExecutor");
            throw null;
        }
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 123;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
        forest.IconCompatParcelizer("OverlayTaskExecutor - stop", new Object[0]);
        onfailure.RemoteActionCompatParcelizer("stop called");
        JobKt.serializer(((getContentViewGroupParentLayout) onfailure.ResultReceiver.MediaSessionCompatResultReceiverWrapper()).getCoroutineContext());
        stopForeground(1);
        forest.IconCompatParcelizer("DeliveryService stopService called. From ".concat(str), new Object[0]);
        stopSelf();
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 53;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$isTokenNull(DeliveryService deliveryService, ContinuationImpl continuationImpl) {
        HapticFeedback hapticFeedback;
        int i = 2 % 2;
        if (continuationImpl instanceof HapticFeedback) {
            hapticFeedback = (HapticFeedback) continuationImpl;
            int i2 = hapticFeedback.write;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hapticFeedback.write = i2 - Integer.MIN_VALUE;
            } else {
                hapticFeedback = new HapticFeedback(deliveryService, continuationImpl);
            }
        } else {
            hapticFeedback = new HapticFeedback(deliveryService, continuationImpl);
        }
        Object objInvoke = hapticFeedback.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = hapticFeedback.write;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            IsUserAuthenticatedWrapper isUserAuthenticatedWrapper = deliveryService.RemoteActionCompatParcelizer;
            if (isUserAuthenticatedWrapper == null) {
                removeNodeAtDepth.serializer("isUserAuthenticated");
                throw null;
            }
            int i4 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 77;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            hapticFeedback.write = 1;
            objInvoke = isUserAuthenticatedWrapper.invoke(hapticFeedback);
            if (objInvoke == coroutineSingletons) {
                int i6 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 15;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 98 / 0;
                }
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            int i8 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 97;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        return Boolean.valueOf(!((Boolean) objInvoke).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        String str;
        int i3;
        getToggleOff5zf0vsI gettoggleoff5zf0vsi;
        forEachImmediateDelegateui foreachimmediatedelegateui;
        Object objIconCompatParcelizer;
        Object objSerializer;
        int i4 = 2 % 2;
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 123;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
            str = "START_STICKY_RESTART";
            if (i5 % 2 == 0) {
                int i6 = 42 / 0;
            }
        } else if (ActivityTransitionResult.hasResult(intent)) {
            str = "ActivityRecognition_Transition";
        } else if (ActivityRecognitionResult.hasResult(intent)) {
            int i7 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 69;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            str = "ActivityRecognition_Sampling";
        } else {
            str = "LocationServiceManager";
        }
        Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("DeliveryService OnStartCommand from: ".concat(str), new Object[0]);
        transferSessionPackageI transfersessionpackagei = this.PlaybackStateCompat;
        if (transfersessionpackagei == null) {
            removeNodeAtDepth.serializer("remoteConfig");
            throw null;
        }
        int i9 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 47;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_DELIVERY_SERVICE_START_FOREGROUND_FIX_ENABLED)) {
                i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 37;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    throw null;
                }
                if (!this.MediaSessionCompatResultReceiverWrapper) {
                }
            }
            gettoggleoff5zf0vsi = (getToggleOff5zf0vsI) IconCompatParcelizer().MediaBrowserCompatMediaItem;
            foreachimmediatedelegateui = gettoggleoff5zf0vsi.read;
            if (intent != null) {
                if (gettoggleoff5zf0vsi.write(intent)) {
                    foreachimmediatedelegateui.addAll(gettoggleoff5zf0vsi.read(objSerializer));
                }
                if (gettoggleoff5zf0vsi.RemoteActionCompatParcelizer(intent)) {
                    int i10 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 47;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    objIconCompatParcelizer = gettoggleoff5zf0vsi.IconCompatParcelizer(intent);
                    if (objIconCompatParcelizer != null) {
                        foreachimmediatedelegateui.addAll(gettoggleoff5zf0vsi.IconCompatParcelizer(objIconCompatParcelizer));
                    }
                }
            }
            return 1;
        }
        int i12 = 89 / 0;
        if (((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer(updateAdidI.IS_DELIVERY_SERVICE_START_FOREGROUND_FIX_ENABLED)) {
            i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 37;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            if (!this.MediaSessionCompatResultReceiverWrapper) {
            }
        }
        gettoggleoff5zf0vsi = (getToggleOff5zf0vsI) IconCompatParcelizer().MediaBrowserCompatMediaItem;
        foreachimmediatedelegateui = gettoggleoff5zf0vsi.read;
        if (intent != null) {
            if (gettoggleoff5zf0vsi.write(intent) && (objSerializer = gettoggleoff5zf0vsi.serializer(intent)) != null) {
                foreachimmediatedelegateui.addAll(gettoggleoff5zf0vsi.read(objSerializer));
            }
            if (gettoggleoff5zf0vsi.RemoteActionCompatParcelizer(intent)) {
                int i13 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 47;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                objIconCompatParcelizer = gettoggleoff5zf0vsi.IconCompatParcelizer(intent);
                if (objIconCompatParcelizer != null) {
                    foreachimmediatedelegateui.addAll(gettoggleoff5zf0vsi.IconCompatParcelizer(objIconCompatParcelizer));
                }
            }
        }
        return 1;
        RemoteActionCompatParcelizer();
        gettoggleoff5zf0vsi = (getToggleOff5zf0vsI) IconCompatParcelizer().MediaBrowserCompatMediaItem;
        foreachimmediatedelegateui = gettoggleoff5zf0vsi.read;
        if (intent != null) {
            if (gettoggleoff5zf0vsi.write(intent)) {
                foreachimmediatedelegateui.addAll(gettoggleoff5zf0vsi.read(objSerializer));
            }
            if (gettoggleoff5zf0vsi.RemoteActionCompatParcelizer(intent)) {
                int i15 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 47;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                objIconCompatParcelizer = gettoggleoff5zf0vsi.IconCompatParcelizer(intent);
                if (objIconCompatParcelizer != null) {
                    foreachimmediatedelegateui.addAll(gettoggleoff5zf0vsi.IconCompatParcelizer(objIconCompatParcelizer));
                }
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060 A[PHI: r2 r4
  0x0060: PHI (r2v10 android.app.Notification) = (r2v9 android.app.Notification), (r2v13 android.app.Notification) binds: [B:19:0x0051, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0060: PHI (r4v8 int) = (r4v7 int), (r4v9 int) binds: [B:19:0x0051, B:16:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0064 A[Catch: Exception -> 0x007d, TRY_ENTER, TryCatch #0 {Exception -> 0x007d, blocks: (B:4:0x000f, B:7:0x001a, B:11:0x002f, B:15:0x003e, B:20:0x0053, B:26:0x006d, B:24:0x0064, B:25:0x0068, B:18:0x0049, B:28:0x0071, B:29:0x0076, B:30:0x0077, B:31:0x007c), top: B:45:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:4:0x000f, B:7:0x001a, B:11:0x002f, B:15:0x003e, B:20:0x0053, B:26:0x006d, B:24:0x0064, B:25:0x0068, B:18:0x0049, B:28:0x0071, B:29:0x0076, B:30:0x0077, B:31:0x007c), top: B:45:0x000f }] */
    public final void RemoteActionCompatParcelizer() {
        int i;
        Notification notification;
        int i2;
        int i3 = 2 % 2;
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 23;
        int i5 = i4 % Fields.SpotShadowColor;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        try {
            DiskLruCacheEditor diskLruCacheEditor = this.IconCompatParcelizer;
            if (diskLruCacheEditor == null) {
                removeNodeAtDepth.serializer("isRequiredOverlayPermissionGranted");
                throw null;
            }
            int i6 = i5 + 35;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (diskLruCacheEditor.read()) {
                int i8 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 115;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i = 1073741832;
            } else {
                i = 8;
            }
            MulticastConsumer multicastConsumer = this.RatingCompat;
            if (multicastConsumer == null) {
                removeNodeAtDepth.serializer("locationForegroundNotificationProvider");
                throw null;
            }
            int i10 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 9;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                notification = multicastConsumer.read(null);
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 117) {
                    invalidateOwnerFocusState.IconCompatParcelizer(this, notification, i);
                    int i11 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 31;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                } else if (i2 >= 29) {
                    MediaSessionCompatToken.serializer(this, notification, i);
                } else {
                    startForeground(104, notification);
                }
            } else {
                notification = multicastConsumer.read(null);
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    invalidateOwnerFocusState.IconCompatParcelizer(this, notification, i);
                    int i13 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 31;
                    r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                } else if (i2 >= 29) {
                    MediaSessionCompatToken.serializer(this, notification, i);
                } else {
                    startForeground(104, notification);
                }
            }
            this.MediaSessionCompatResultReceiverWrapper = true;
        } catch (Exception e) {
            this.MediaSessionCompatResultReceiverWrapper = false;
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "DeliveryService startForeground is called from background.", new Object[0]);
            checkAdjustAdRevenue checkadjustadrevenue = new checkAdjustAdRevenue(new deleteGlobalCallbackParameters(GwiErrorCode.ALG_LIBRARY_NOT_EXIST, getString(R.string.failed_location_service_notification_title), getString(R.string.failed_location_service_notification_message), createDeeplinkIntentI.OPEN_APP), canTrackMeasurementConsentI.read, null, null, 12);
            deleteGlobalPartnerParameters deleteglobalpartnerparameters = this.PlaybackStateCompatCustomAction;
            if (deleteglobalpartnerparameters == null) {
                removeNodeAtDepth.serializer("pushNotificationManager");
                throw null;
            }
            hg$$ExternalSyntheticLambda5 hg__externalsyntheticlambda5 = new hg$$ExternalSyntheticLambda5(4);
            accessgetPresscp accessgetpresscp = this.ParcelableVolumeInfo;
            if (accessgetpresscp == null) {
                removeNodeAtDepth.serializer("pendingIntentBuilder");
                throw null;
            }
            ((s0) deleteglobalpartnerparameters).RemoteActionCompatParcelizer(checkadjustadrevenue, hg__externalsyntheticlambda5, accessgetpresscp.IconCompatParcelizer.IconCompatParcelizer(checkadjustadrevenue, false));
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        int i = 2 % 2;
        super.onCreate();
        Application application = getApplication();
        application.getClass();
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = ((CourierApplication) application).read();
        Timestamp.Companion companion = new Timestamp.Companion(0);
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation2 = getstyleable_vector_drawable_group_rotation.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
        hasNestedScrollingParent hasnestedscrollingparent = getstyleable_vector_drawable_group_rotation2.AbstractClickableNodeonKeyEvent1;
        AndroidIndirectPointerEvent_androidKt androidIndirectPointerEvent_androidKt = new AndroidIndirectPointerEvent_androidKt(hasnestedscrollingparent, 0);
        mergeJsonObjects mergejsonobjectsIconCompatParcelizer = getColorIntegerOrNull.IconCompatParcelizer(new applyLayoutFeatures(companion, getstyleable_vector_drawable_group_rotation2.getActionBarHideOffset, hasnestedscrollingparent, getstyleable_vector_drawable_group_rotation2.Contentfoundation));
        mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation2.FlingCancellationException;
        requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1 = getstyleable_vector_drawable_group_rotation2.AfRegionFlipHorizontallyQuirk;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X getstyleable_vector_drawable_group_translate_x = getstyleable_vector_drawable_group_rotation2._init_lambda2;
        mergeJsonObjects mergejsonobjectsIconCompatParcelizer2 = getColorIntegerOrNull.IconCompatParcelizer(new getVirtualKey5zf0vsI(companion, mergejsonobjects, requestsinglelocationupdatelambda1, getstyleable_vector_drawable_group_translate_x.getSavedStateRegistry, getstyleable_vector_drawable_group_rotation2.getSpacingD9Ej5fM, getstyleable_vector_drawable_group_translate_x.getViewModelStore, getstyleable_vector_drawable_group_translate_x.initializeViewTreeOwners, androidIndirectPointerEvent_androidKt, mergejsonobjectsIconCompatParcelizer, getstyleable_vector_drawable_group_rotation2.getFeatureGroupUseCaseType, getstyleable_vector_drawable_group_translate_x.MediaDescriptionCompat, getstyleable_vector_drawable_group_rotation2.Contentfoundation, getstyleable_vector_drawable_group_rotation2.setScreenFlashUiInfo, getstyleable_vector_drawable_group_rotation2.NonTouchScrollingLogic));
        mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation2.Contentfoundation;
        getDataStoreFileName getdatastorefilename = new getDataStoreFileName(companion, mergejsonobjects2, mergejsonobjectsIconCompatParcelizer2, getstyleable_vector_drawable_group_rotation2.updateWko1d7g, getstyleable_vector_drawable_group_rotation2.FlingCancellationException, getstyleable_vector_drawable_group_rotation2.AnimatedContentTransitionScopeImplSizeModifierNode, getstyleable_vector_drawable_group_rotation2.createnHHXs2Y);
        CourierApplication courierApplication = getstyleable_vector_drawable_group_rotation2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
        accessgetGreencp accessgetgreencp = new accessgetGreencp(getdatastorefilename);
        transferSessionPackageI transfersessionpackagei = (transferSessionPackageI) mergejsonobjects2.write();
        requestInputModeiuPiT84 requestinputmodeiupit84 = (requestInputModeiuPiT84) getstyleable_vector_drawable_group_translate_x.getViewModelStore.write();
        BulletSpan_androidKt bulletSpan_androidKt = (BulletSpan_androidKt) getstyleable_vector_drawable_group_translate_x.initializeViewTreeOwners.write();
        getToggleOff5zf0vsI gettoggleoff5zf0vsi = (getToggleOff5zf0vsI) mergejsonobjectsIconCompatParcelizer.write();
        getPresentationContext getpresentationcontext = (getPresentationContext) getstyleable_vector_drawable_group_rotation2.DefaultFlingBehaviorperformFling2.write();
        IncogniaManagerImpl incogniaManagerImpl = (IncogniaManagerImpl) getstyleable_vector_drawable_group_rotation2.onConfigurationChanged.write();
        transfersessionpackagei.getClass();
        requestinputmodeiupit84.getClass();
        bulletSpan_androidKt.getClass();
        gettoggleoff5zf0vsi.getClass();
        getpresentationcontext.getClass();
        incogniaManagerImpl.getClass();
        k$c k_c = new k$c();
        k_c.RemoteActionCompatParcelizer = courierApplication;
        k_c.write = accessgetgreencp;
        k_c.IconCompatParcelizer = transfersessionpackagei;
        k_c.read = requestinputmodeiupit84;
        k_c.serializer = bulletSpan_androidKt;
        k_c.MediaBrowserCompatMediaItem = gettoggleoff5zf0vsi;
        k_c.MediaSessionCompatQueueItem = getpresentationcontext;
        k_c.MediaDescriptionCompat = incogniaManagerImpl;
        this.MediaMetadataCompat = k_c;
        this.MediaSessionCompatQueueItem = getColorIntegerOrNull.serializer(getstyleable_vector_drawable_group_translate_x.enterPictureInPictureMode);
        this.MediaDescriptionCompat = (onFailure) getstyleable_vector_drawable_group_translate_x.RatingCompat.write();
        this.RatingCompat = (MulticastConsumer) getstyleable_vector_drawable_group_rotation2.detectDragGestures.write();
        this.PlaybackStateCompatCustomAction = (deleteGlobalPartnerParameters) getstyleable_vector_drawable_group_rotation2.TapGestureDetectorKtdetectTapAndPress21.write();
        this.ParcelableVolumeInfo = new accessgetPresscp(new PendingIntentBuilderImpl(getstyleable_vector_drawable_group_rotation2.addOnPictureInPictureModeChangedListener(), getstyleable_vector_drawable_group_rotation2.MediaBrowserCompatMediaItem(), new getActionViewIntentlambda0(), courierApplication, new BrazeExternalSyntheticLambda5(3)));
        this.read = getstyleable_vector_drawable_group_rotation2.enterPictureInPictureMode();
        this.RemoteActionCompatParcelizer = getstyleable_vector_drawable_group_rotation2.addOnUserLeaveHintListener();
        this.PlaybackStateCompat = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation2.Contentfoundation.write();
        this.write = new inCompatibilityMode();
        this.IconCompatParcelizer = new DiskLruCacheEditor(courierApplication, (getContentViewGroupParentLayout) getstyleable_vector_drawable_group_rotation2.ContentInViewNodelaunchAnimation21.write(), r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I.read(getstyleable_vector_drawable_group_rotation2.ScrollExtensionsKt, courierApplication, new inCompatibilityMode()));
        this.MediaBrowserCompatMediaItem = (getTouchaOaMEAU) getstyleable_vector_drawable_group_rotation2.updateWko1d7g.write();
        RemoteActionCompatParcelizer();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (!IconCompatParcelizer().serializer()) {
            int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 5;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                read("User location permission not granted");
                return;
            } else {
                read("User location permission not granted");
                throw null;
            }
        }
        onFailure onfailure = this.MediaDescriptionCompat;
        if (onfailure == null) {
            removeNodeAtDepth.serializer("overlayTaskExecutor");
            throw null;
        }
        ContextScope contextScope = onfailure.MediaSessionCompatQueueItem;
        if (contextScope != null) {
            YieldKt.write(contextScope, (CancellationException) null);
        }
        onfailure.MediaSessionCompatQueueItem = null;
        r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = onfailure.write;
        if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
            int i3 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 123;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                onfailure.write = null;
                shortNewsContentCardView.hashCode();
                throw null;
            }
            r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
            onfailure.write = null;
        }
        int i4 = 1;
        onfailure.write = BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) onfailure.ResultReceiver.MediaSessionCompatResultReceiverWrapper(), null, null, new OverlayTaskExecutorImpl$observePushEvents$1(onfailure, null, 1), 3);
        transferSessionPackageI transfersessionpackagei2 = this.PlaybackStateCompat;
        if (transfersessionpackagei2 == null) {
            removeNodeAtDepth.serializer("remoteConfig");
            throw null;
        }
        boolean zPlaybackStateCompat = ((FirebaseRemoteConfigImpl) transfersessionpackagei2).PlaybackStateCompat();
        isAdapterPositionOnScreen isadapterpositiononscreen = this.MediaSessionCompatToken;
        if (zPlaybackStateCompat) {
            BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, null, new AnonymousClass1(this, shortNewsContentCardView, i4), 3);
        }
        BuildersKt.RemoteActionCompatParcelizer((getContentViewGroupParentLayout) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        int i5 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 21;
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            int i6 = 70 / 0;
        }
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
