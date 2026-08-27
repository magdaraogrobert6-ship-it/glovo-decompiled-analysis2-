package com.roadrunner.delivery.analytics;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.StateProviderImpl;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$4;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AndroidView;
import o.AndroidView_androidKtAndroidView4;
import o.ComposableSingletonsAndroidPopup_androidKt;
import o.FontEj4NQ78;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.accessrequireViewFactoryHolder;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setFitInsetsSides;

/* JADX INFO: loaded from: classes3.dex */
public final class StateV3AnalyticsProviderImpl implements FontEj4NQ78 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final accessrequireViewFactoryHolder IconCompatParcelizer;
    public final getContentViewGroupParentLayout RemoteActionCompatParcelizer;
    public final StateFlow read;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int RemoteActionCompatParcelizer = 1;
        private static int write;
        public int IconCompatParcelizer;
        public final /* synthetic */ StateV3AnalyticsProviderImpl read;
        public final /* synthetic */ int serializer;

        /* JADX INFO: renamed from: com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00301 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;
            public final /* synthetic */ StateV3AnalyticsProviderImpl read;
            public /* synthetic */ Object serializer;
            public final /* synthetic */ int write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C00301(StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
                super(2, shortNewsContentCardView);
                this.write = i;
                this.read = stateV3AnalyticsProviderImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 69;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = this.write;
                StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = this.read;
                if (i4 != 0) {
                    C00301 c00301 = new C00301(stateV3AnalyticsProviderImpl, shortNewsContentCardView, 1);
                    c00301.serializer = ((onItemDismiss) obj).IconCompatParcelizer;
                    return c00301;
                }
                C00301 c00302 = new C00301(stateV3AnalyticsProviderImpl, shortNewsContentCardView, 0);
                c00302.serializer = ((onItemDismiss) obj).IconCompatParcelizer;
                int i5 = IconCompatParcelizer + 119;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return c00302;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(Object obj, Object obj2) {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 35;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = this.write;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = this.read;
                onItemDismiss onitemdismiss = (onItemDismiss) obj;
                if (i4 == 0) {
                    Object obj3 = onitemdismiss.IconCompatParcelizer;
                    C00301 c00301 = new C00301(stateV3AnalyticsProviderImpl, (ShortNewsContentCardView) obj2, 0);
                    c00301.serializer = obj3;
                    c00301.invokeSuspend(createfromparcel);
                    return createfromparcel;
                }
                Object obj4 = onitemdismiss.IconCompatParcelizer;
                C00301 c00302 = new C00301(stateV3AnalyticsProviderImpl, (ShortNewsContentCardView) obj2, 1);
                c00302.serializer = obj4;
                c00302.invokeSuspend(createfromparcel);
                int i5 = IconCompatParcelizer + 71;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    return createfromparcel;
                }
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 71;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                int i4 = this.write;
                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = this.read;
                Object obj2 = this.serializer;
                if (i4 == 0) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    MutableStateFlow mutableStateFlow = stateV3AnalyticsProviderImpl.serializer;
                    if (obj2 instanceof isItemDismissable) {
                        obj2 = null;
                    }
                    mutableStateFlow.IconCompatParcelizer(obj2);
                    return createfromparcel;
                }
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                MutableStateFlow mutableStateFlow2 = stateV3AnalyticsProviderImpl.write;
                if (obj2 instanceof isItemDismissable) {
                    int i5 = IconCompatParcelizer + 123;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    obj2 = null;
                } else {
                    int i7 = IconCompatParcelizer + 73;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                Object obj3 = (List) obj2;
                if (obj3 == null) {
                    obj3 = instance_delegatelambda0.write;
                    int i9 = IconCompatParcelizer + 111;
                    RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                }
                mutableStateFlow2.IconCompatParcelizer(obj3);
                return createfromparcel;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.serializer = i;
            this.read = stateV3AnalyticsProviderImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = RemoteActionCompatParcelizer + 13;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.serializer;
            StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = this.read;
            if (i4 != 0) {
                return new AnonymousClass1(stateV3AnalyticsProviderImpl, shortNewsContentCardView, 1);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(stateV3AnalyticsProviderImpl, shortNewsContentCardView, 0);
            int i5 = write + 19;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        
            return ((com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
        
            r5 = ((com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1) create(r5, r6)).invokeSuspend(r2);
            r6 = com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1.write + 101;
            com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1.RemoteActionCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r1 != 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            if (r1 != 0) goto L9;
         */
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1.RemoteActionCompatParcelizer
                int r1 = r1 + 61
                int r2 = r1 % 128
                com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1.write = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1d
                int r1 = r4.serializer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                r3 = 24
                int r3 = r3 / 0
                if (r1 == 0) goto L32
                goto L27
            L1d:
                int r1 = r4.serializer
                o.createFromParcel r2 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
                o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
                if (r1 == 0) goto L32
            L27:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl$1 r5 = (com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                return r5
            L32:
                o.ShortNewsContentCardView r5 = r4.create(r5, r6)
                com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl$1 r5 = (com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1) r5
                java.lang.Object r5 = r5.invokeSuspend(r2)
                int r6 = com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1.write
                int r6 = r6 + 101
                int r1 = r6 % 128
                com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1.RemoteActionCompatParcelizer = r1
                int r6 = r6 % r0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.analytics.StateV3AnalyticsProviderImpl.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = this.serializer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            StateV3AnalyticsProviderImpl stateV3AnalyticsProviderImpl = this.read;
            ShortNewsContentCardView shortNewsContentCardView = null;
            int i3 = 1;
            if (i2 != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.IconCompatParcelizer;
                if (i4 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    StateProviderImpl$special$$inlined$map$4 stateProviderImpl$special$$inlined$map$4 = ((StateProviderImpl) ((AndroidView_androidKtAndroidView4) stateV3AnalyticsProviderImpl.IconCompatParcelizer)).MediaDescriptionCompat;
                    C00301 c00301 = new C00301(stateV3AnalyticsProviderImpl, shortNewsContentCardView, i3);
                    this.IconCompatParcelizer = 1;
                    return FlowKt.collectLatest(stateProviderImpl$special$$inlined$map$4, c00301, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
                }
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = write + 45;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.IconCompatParcelizer;
            int i8 = 0;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                StateProviderImpl$special$$inlined$map$4 stateProviderImpl$special$$inlined$map$5 = ((StateProviderImpl) ((AndroidView) stateV3AnalyticsProviderImpl.IconCompatParcelizer)).RemoteActionCompatParcelizer;
                C00301 c00302 = new C00301(stateV3AnalyticsProviderImpl, shortNewsContentCardView, i8);
                this.IconCompatParcelizer = 1;
                if (FlowKt.collectLatest(stateProviderImpl$special$$inlined$map$5, c00302, this) != coroutineSingletons2) {
                    return createfromparcel;
                }
                int i9 = write + 27;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons2;
            }
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = RemoteActionCompatParcelizer + 117;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i12 = 30 / 0;
            return createfromparcel;
        }
    }

    public StateV3AnalyticsProviderImpl(accessrequireViewFactoryHolder accessrequireviewfactoryholder, getContentViewGroupParentLayout getcontentviewgroupparentlayout) {
        this.IconCompatParcelizer = accessrequireviewfactoryholder;
        this.RemoteActionCompatParcelizer = getcontentviewgroupparentlayout;
        ShortNewsContentCardView shortNewsContentCardView = null;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(null);
        this.serializer = mutableStateFlow;
        this.write = StateFlowKt.read(instance_delegatelambda0.write);
        this.read = FlowKt.write(new StateProviderImpl$special$$inlined$map$2(mutableStateFlow, 14), getcontentviewgroupparentlayout, SharingStarted.Companion.RemoteActionCompatParcelizer, SimpleItemTouchHelperCallback.serializer);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(this, shortNewsContentCardView, 0), 3);
        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new AnonymousClass1(this, shortNewsContentCardView, 1), 3);
    }

    public final Map write() {
        int i = 2 % 2;
        int i2 = RatingCompat + 31;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Map map = (Map) this.read.read();
        int i4 = RatingCompat + 11;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map serializer() {
        int i = 2 % 2;
        setFitInsetsSides setfitinsetssides = (setFitInsetsSides) this.serializer.read();
        if (setfitinsetssides != null) {
            int i2 = MediaDescriptionCompat + 31;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            ComposableSingletonsAndroidPopup_androidKt composableSingletonsAndroidPopup_androidKt = setfitinsetssides.analytics;
            if (composableSingletonsAndroidPopup_androidKt != null) {
                int i4 = RatingCompat + 93;
                MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    Map map = composableSingletonsAndroidPopup_androidKt.trackingParams;
                    throw null;
                }
                Map map2 = composableSingletonsAndroidPopup_androidKt.trackingParams;
                if (map2 != null) {
                    return map2;
                }
            }
        }
        return SimpleItemTouchHelperCallback.serializer;
    }
}
