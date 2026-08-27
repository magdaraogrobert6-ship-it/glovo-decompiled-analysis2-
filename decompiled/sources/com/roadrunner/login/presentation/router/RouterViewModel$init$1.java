package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation$parsing$2;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferedChannel;
import o.ShortNewsContentCardView;
import o.cf;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.updateAdidI;

/* JADX INFO: loaded from: classes3.dex */
public final class RouterViewModel$init$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ RouterViewModel RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RouterViewModel$init$1(RouterViewModel routerViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.RemoteActionCompatParcelizer = routerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = 1;
        int i4 = write + 1;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = this.serializer;
        RouterViewModel routerViewModel = this.RemoteActionCompatParcelizer;
        if (i6 == 0) {
            return new RouterViewModel$init$1(routerViewModel, shortNewsContentCardView, 0);
        }
        if (i6 != 1) {
            return i6 != 2 ? new RouterViewModel$init$1(routerViewModel, shortNewsContentCardView, 3) : new RouterViewModel$init$1(routerViewModel, shortNewsContentCardView, i);
        }
        RouterViewModel$init$1 routerViewModel$init$1 = new RouterViewModel$init$1(routerViewModel, shortNewsContentCardView, i3);
        int i7 = write + 1;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return routerViewModel$init$1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return ((com.roadrunner.login.presentation.router.RouterViewModel$init$1) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return ((com.roadrunner.login.presentation.router.RouterViewModel$init$1) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r1 != 2) goto L13;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.login.presentation.router.RouterViewModel$init$1.read
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.roadrunner.login.presentation.router.RouterViewModel$init$1.write = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L21
            int r1 = r5.serializer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            r4 = 5
            int r4 = r4 / 0
            if (r1 == 0) goto L50
            if (r1 == r2) goto L45
            if (r1 == r0) goto L3a
            goto L2f
        L21:
            int r1 = r5.serializer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            if (r1 == 0) goto L50
            if (r1 == r2) goto L45
            if (r1 == r0) goto L3a
        L2f:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.RouterViewModel$init$1 r6 = (com.roadrunner.login.presentation.router.RouterViewModel$init$1) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L3a:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.RouterViewModel$init$1 r6 = (com.roadrunner.login.presentation.router.RouterViewModel$init$1) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L45:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.RouterViewModel$init$1 r6 = (com.roadrunner.login.presentation.router.RouterViewModel$init$1) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L50:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.RouterViewModel$init$1 r6 = (com.roadrunner.login.presentation.router.RouterViewModel$init$1) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            int r7 = com.roadrunner.login.presentation.router.RouterViewModel$init$1.write
            int r7 = r7 + 121
            int r1 = r7 % 128
            com.roadrunner.login.presentation.router.RouterViewModel$init$1.read = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L69
            r7 = 48
            int r7 = r7 / 0
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.router.RouterViewModel$init$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 27;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj2 = createFromParcel.INSTANCE;
        RouterViewModel routerViewModel = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                return RouterViewModel.access$initializeViewModel(routerViewModel, this) == coroutineSingletons ? coroutineSingletons : obj2;
            }
            int i6 = write + 29;
            read = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        if (i4 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.IconCompatParcelizer;
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (((FirebaseRemoteConfigImpl) routerViewModel.MediaBrowserCompatMediaItem).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_EARLY_REMOTE_CONFIG_STARTUP_ENABLED.getFirebaseFlagName())) {
                RemoteConfigStartupTask remoteConfigStartupTask = routerViewModel.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                this.IconCompatParcelizer = 1;
                Object objAwaitInternal = remoteConfigStartupTask.IconCompatParcelizer.awaitInternal(this);
                if (objAwaitInternal == coroutineSingletons2) {
                    int i8 = read + 5;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                } else {
                    objAwaitInternal = obj2;
                }
                if (objAwaitInternal != coroutineSingletons2) {
                    return obj2;
                }
            } else {
                getAllSemanticsNodesToMap getallsemanticsnodestomap = routerViewModel.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                MapboxNavigation$parsing$2 mapboxNavigation$parsing$2 = new MapboxNavigation$parsing$2(routerViewModel, shortNewsContentCardView, 19);
                this.IconCompatParcelizer = 2;
                if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("asti_router_fetch_remote_config", mapboxNavigation$parsing$2, this) != coroutineSingletons2) {
                    return obj2;
                }
            }
            return coroutineSingletons2;
        }
        if (i4 != 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.IconCompatParcelizer;
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BufferedChannel bufferedChannel = routerViewModel.write;
                this.IconCompatParcelizer = 1;
                if (bufferedChannel.serializer((Object) cf.read, (ShortNewsContentCardView) this) == coroutineSingletons3) {
                    obj2 = coroutineSingletons3;
                }
            } else if (i10 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i11 = read + 117;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return obj2;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.IconCompatParcelizer;
        if (i13 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            return RouterViewModel.m4991access$handleMobileServicesIoAF18A(routerViewModel, this) == coroutineSingletons4 ? coroutineSingletons4 : obj2;
        }
        int i14 = write + 69;
        read = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        if (i13 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
        int i16 = read + 95;
        write = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        return obj2;
    }
}
