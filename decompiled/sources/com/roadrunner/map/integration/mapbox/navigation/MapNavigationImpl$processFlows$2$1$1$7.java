package com.roadrunner.map.integration.mapbox.navigation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.nest.NestLoadingServiceImpl$special$$inlined$map$1;
import com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$combine$1$3;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.ia;
import o.k7;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl$processFlows$2$1$1$7 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ MapNavigationImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapNavigationImpl$processFlows$2$1$1$7(MapNavigationImpl mapNavigationImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mapNavigationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 101;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        int i6 = 0;
        if (i5 == 0) {
            return new MapNavigationImpl$processFlows$2$1$1$7(this.serializer, shortNewsContentCardView, i6);
        }
        int i7 = 1;
        if (i5 != 1) {
            if (i5 != 2) {
                return i5 != 3 ? new MapNavigationImpl$processFlows$2$1$1$7(this.serializer, shortNewsContentCardView, 4) : new MapNavigationImpl$processFlows$2$1$1$7(this.serializer, shortNewsContentCardView, 3);
            }
            return new MapNavigationImpl$processFlows$2$1$1$7(this.serializer, shortNewsContentCardView, i);
        }
        MapNavigationImpl$processFlows$2$1$1$7 mapNavigationImpl$processFlows$2$1$1$7 = new MapNavigationImpl$processFlows$2$1$1$7(this.serializer, shortNewsContentCardView, i7);
        int i8 = write + 111;
        read = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            int i9 = 24 / 0;
        }
        return mapNavigationImpl$processFlows$2$1$1$7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        return ((com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7) create(r7, r8)).invokeSuspend(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        return ((com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7) create(r7, r8)).invokeSuspend(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r1 != 3) goto L15;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7.write
            int r1 = r1 + 39
            int r2 = r1 % 128
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7.read = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 3
            if (r1 == 0) goto L25
            int r1 = r6.RemoteActionCompatParcelizer
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            r5 = 65
            int r5 = r5 / 0
            if (r1 == 0) goto L69
            if (r1 == r2) goto L56
            if (r1 == r0) goto L4b
            if (r1 == r3) goto L40
            goto L35
        L25:
            int r1 = r6.RemoteActionCompatParcelizer
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
            o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
            if (r1 == 0) goto L69
            if (r1 == r2) goto L56
            if (r1 == r0) goto L4b
            if (r1 == r3) goto L40
        L35:
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7 r7 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        L40:
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7 r7 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        L4b:
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7 r7 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        L56:
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7 r7 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            int r8 = com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7.read
            int r8 = r8 + r3
            int r1 = r8 % 128
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7.write = r1
            int r8 = r8 % r0
            return r7
        L69:
            o.ShortNewsContentCardView r7 = r6.create(r7, r8)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7 r7 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7) r7
            java.lang.Object r7 = r7.invokeSuspend(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$7.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objCollectLatest;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        MapNavigationImpl mapNavigationImpl = this.serializer;
        Object obj2 = createFromParcel.INSTANCE;
        Object obj3 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.IconCompatParcelizer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                NestLoadingServiceImpl$special$$inlined$map$1 nestLoadingServiceImpl$special$$inlined$map$1 = new NestLoadingServiceImpl$special$$inlined$map$1(mapNavigationImpl.RatingCompat.RemoteActionCompatParcelizer.serializer, 20);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                Object objCollect = FlowKt.RemoteActionCompatParcelizer(nestLoadingServiceImpl$special$$inlined$map$1, DefaultIoScheduler.RemoteActionCompatParcelizer).collect(new MapNavigationImpl$collectRawLocation$2(mapNavigationImpl, 1), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = obj2;
                }
                if (objCollect == coroutineSingletons) {
                    obj2 = coroutineSingletons;
                }
            } else if (i3 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i4 = write + 121;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return obj2;
            }
            obj3.hashCode();
            throw null;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 != 0) {
                if (i5 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.IconCompatParcelizer = 1;
            NestLoadingServiceImpl$special$$inlined$map$1 nestLoadingServiceImpl$special$$inlined$map$2 = new NestLoadingServiceImpl$special$$inlined$map$1(mapNavigationImpl.MediaSessionCompatToken.IconCompatParcelizer.serializer, 21);
            DefaultScheduler defaultScheduler2 = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objCollect2 = FlowKt.RemoteActionCompatParcelizer(nestLoadingServiceImpl$special$$inlined$map$2, DefaultIoScheduler.RemoteActionCompatParcelizer).collect(new MapNavigationImpl$collectRawLocation$2(mapNavigationImpl, 5), this);
            if (objCollect2 != coroutineSingletons2) {
                objCollect2 = obj2;
            }
            if (objCollect2 != coroutineSingletons2) {
                return obj2;
            }
            int i6 = read + 123;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return coroutineSingletons2;
        }
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.IconCompatParcelizer;
            if (i8 != 0) {
                int i9 = read + 91;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (i8 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ia iaVar = mapNavigationImpl.ResultReceiver;
            this.IconCompatParcelizer = 1;
            Object objCollectLatest2 = FlowKt.collectLatest(FlowKt.RemoteActionCompatParcelizer(iaVar.IconCompatParcelizer.read, new SettingsViewModel$special$$inlined$combine$1$3((ShortNewsContentCardView) null, iaVar, 10)), new PhotoIdUiModelImpl$1$1(iaVar, null, 1), this);
            if (objCollectLatest2 != coroutineSingletons3) {
                objCollectLatest2 = obj2;
            }
            if (objCollectLatest2 != coroutineSingletons3) {
                return obj2;
            }
            int i11 = read + 117;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return coroutineSingletons3;
        }
        if (i2 == 3) {
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.IconCompatParcelizer;
            if (i13 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ia iaVar2 = mapNavigationImpl.ResultReceiver;
                this.IconCompatParcelizer = 1;
                Object objCollectLatest3 = FlowKt.collectLatest(iaVar2.PlaybackStateCompatCustomAction.write, new HomeViewModel.AnonymousClass1(iaVar2, null, 24), this);
                if (objCollectLatest3 != coroutineSingletons4) {
                    objCollectLatest3 = obj2;
                }
                return objCollectLatest3 == coroutineSingletons4 ? coroutineSingletons4 : obj2;
            }
            if (i13 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i14 = write + 29;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = this.IconCompatParcelizer;
        if (i16 != 0) {
            if (i16 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        k7 k7Var = mapNavigationImpl.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        this.IconCompatParcelizer = 1;
        long jWrite = ((FirebaseRemoteConfigImpl) k7Var.serializer).IconCompatParcelizer.write("turn_by_turn_loading_timeout_duration");
        if (jWrite <= 0 || (objCollectLatest = FlowKt.collectLatest(k7Var.read.read, new LogTooLongNavigationLoading$invoke$2(jWrite, null, 0), this)) != coroutineSingletons5) {
            objCollectLatest = obj2;
        }
        if (objCollectLatest != coroutineSingletons5) {
            return obj2;
        }
        int i17 = read + 27;
        write = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        return coroutineSingletons5;
    }
}
