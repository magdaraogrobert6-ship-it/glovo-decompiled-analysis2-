package com.google.firebase.sessions.settings;

import androidx.compose.ui.graphics.Fields;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import coil3.disk.DiskLruCache$launchCleanup$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.Trigger;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidComposeViewAccessibilityDelegateCompat;
import o.ContainsAlllambda0;
import o.ListUtils_androidKt;
import o.Paint29;
import o.PaintExtensions_androidKt;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactory28;
import o.TextAnnouncementContentCardView;
import o.TextLayoutInput;
import o.accessscheduleScrollEventIfNeeded;
import o.adjustForReversedScrollingAndRtlRE3cj74;
import o.createFromParcel;
import o.extendWith;
import o.getContentViewGroupParentLayout;
import o.getTextBounds;
import o.isInvalidIndex;
import o.performCustomExitMxy_nc0;
import o.r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafHcIMtqslO5nN2ofGE631aElY;
import o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ;
import o.setOnSessionTrackingFailedListener;
import o.updateAdidI;

/* JADX INFO: loaded from: classes2.dex */
public final class SettingsCacheImpl {
    public final TextAnnouncementContentCardView IconCompatParcelizer;
    public final AndroidComposeViewAccessibilityDelegateCompat RemoteActionCompatParcelizer;
    public final performCustomExitMxy_nc0 read;
    public final AtomicReference serializer;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ SettingsCacheImpl IconCompatParcelizer;
        public final /* synthetic */ int read;
        public int write;

        /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCacheImpl$1$1, reason: invalid class name and collision with other inner class name */
        public final /* synthetic */ class C00171 implements FlowCollector, r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ {
            private static int IconCompatParcelizer = 0;
            private static int RemoteActionCompatParcelizer = 1;
            public final /* synthetic */ int read;
            public final /* synthetic */ Object write;

            public /* synthetic */ C00171(int i, Object obj) {
                this.read = i;
                this.write = obj;
            }

            public final int hashCode() {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 9;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                Object obj = null;
                if (i2 % 2 != 0) {
                    throw null;
                }
                int i3 = this.read;
                if (i3 == 0) {
                    return getFunctionDelegate().hashCode();
                }
                if (i3 == 1) {
                    return getFunctionDelegate().hashCode();
                }
                int iHashCode = getFunctionDelegate().hashCode();
                int i4 = IconCompatParcelizer + 39;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return iHashCode;
                }
                obj.hashCode();
                throw null;
            }

            @Override // o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
            public final isInvalidIndex getFunctionDelegate() {
                int i = 2 % 2;
                int i2 = IconCompatParcelizer + 89;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i3 = this.read;
                Object obj = this.write;
                if (i3 == 0) {
                    return new AdaptedFunctionReference(2, 4, AtomicReference.class, (AtomicReference) obj, "set", "set(Ljava/lang/Object;)V");
                }
                if (i3 != 1) {
                    return new AdaptedFunctionReference(2, 4, HomeFragment.class, (HomeFragment) obj, "updateState", "updateState(Lcom/roadrunner/rider/state/api/StateApiTrigger;)V");
                }
                AdaptedFunctionReference adaptedFunctionReference = new AdaptedFunctionReference(2, 4, StaticLayoutFactory28.class, (StaticLayoutFactory28) obj, "calculateUiState", "calculateUiState(Lcom/roadrunner/delivery/accept/backToBackOrder/api/presentation/banner/BackToBackOrdersState;)V");
                int i4 = RemoteActionCompatParcelizer + 19;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return adaptedFunctionReference;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
            
                if (r2 != 1) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean equals(java.lang.Object r7) {
                /*
                    r6 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.IconCompatParcelizer
                    int r2 = r1 + 23
                    int r3 = r2 % 128
                    com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.RemoteActionCompatParcelizer = r3
                    int r2 = r2 % r0
                    r4 = 0
                    r5 = 1
                    if (r2 != 0) goto L1b
                    int r2 = r6.read
                    if (r2 == 0) goto L19
                    if (r2 == r5) goto L17
                    goto L21
                L17:
                    r4 = r5
                    goto L39
                L19:
                    r4 = r5
                    goto L5e
                L1b:
                    int r2 = r6.read
                    if (r2 == 0) goto L5e
                    if (r2 == r5) goto L39
                L21:
                    boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowCollector
                    if (r0 == 0) goto L38
                    boolean r0 = r7 instanceof o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
                    r0 = r0 ^ r5
                    if (r0 == r5) goto L38
                    o.isInvalidIndex r0 = r6.getFunctionDelegate()
                    o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ r7 = (o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) r7
                    o.isInvalidIndex r7 = r7.getFunctionDelegate()
                    boolean r4 = r0.equals(r7)
                L38:
                    return r4
                L39:
                    boolean r1 = r7 instanceof kotlinx.coroutines.flow.FlowCollector
                    if (r1 == 0) goto L5d
                    int r3 = r3 + 125
                    int r1 = r3 % 128
                    com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.IconCompatParcelizer = r1
                    int r3 = r3 % r0
                    boolean r2 = r7 instanceof o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
                    if (r2 == 0) goto L5d
                    int r1 = r1 + 123
                    int r2 = r1 % 128
                    com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.RemoteActionCompatParcelizer = r2
                    int r1 = r1 % r0
                    o.isInvalidIndex r0 = r6.getFunctionDelegate()
                    o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ r7 = (o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) r7
                    o.isInvalidIndex r7 = r7.getFunctionDelegate()
                    boolean r4 = r0.equals(r7)
                L5d:
                    return r4
                L5e:
                    boolean r2 = r7 instanceof kotlinx.coroutines.flow.FlowCollector
                    if (r2 == 0) goto L98
                    boolean r2 = r7 instanceof o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ
                    r2 = r2 ^ r5
                    if (r2 == 0) goto L68
                    goto L98
                L68:
                    int r1 = r1 + 31
                    int r2 = r1 % 128
                    com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.RemoteActionCompatParcelizer = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L89
                    o.isInvalidIndex r1 = r6.getFunctionDelegate()
                    o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ r7 = (o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) r7
                    o.isInvalidIndex r7 = r7.getFunctionDelegate()
                    boolean r4 = r1.equals(r7)
                    int r7 = com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.IconCompatParcelizer
                    int r7 = r7 + 109
                    int r1 = r7 % 128
                    com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.RemoteActionCompatParcelizer = r1
                    int r7 = r7 % r0
                    goto L98
                L89:
                    o.isInvalidIndex r0 = r6.getFunctionDelegate()
                    o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ r7 = (o.r8lambdatEa7vanKJhASEs7P3j5N2RjkfeQ) r7
                    o.isInvalidIndex r7 = r7.getFunctionDelegate()
                    r0.equals(r7)
                    r7 = 0
                    throw r7
                L98:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCacheImpl.AnonymousClass1.C00171.equals(java.lang.Object):boolean");
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
                int i = 2 % 2;
                int i2 = RemoteActionCompatParcelizer + 41;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                Object obj2 = null;
                if (i2 % 2 != 0) {
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    obj2.hashCode();
                    throw null;
                }
                int i3 = this.read;
                createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
                Object obj3 = this.write;
                if (i3 == 0) {
                    ((AtomicReference) obj3).set((accessscheduleScrollEventIfNeeded) obj);
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = IconCompatParcelizer + 113;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return createfromparcel2;
                    }
                    throw null;
                }
                if (i3 != 1) {
                    ((HomeFragment) obj3).RemoteActionCompatParcelizer((setOnSessionTrackingFailedListener) obj);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = IconCompatParcelizer + 83;
                    RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    return createfromparcel2;
                }
                ContainsAlllambda0 containsAlllambda0 = (ContainsAlllambda0) obj;
                StaticLayoutFactory28 staticLayoutFactory28 = (StaticLayoutFactory28) obj3;
                PaintExtensions_androidKt paint29 = (PaintExtensions_androidKt) staticLayoutFactory28.ParcelableVolumeInfo.read();
                if (!(paint29 instanceof getTextBounds) || !(containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY)) {
                    boolean z = containsAlllambda0 instanceof TextLayoutInput;
                    extendWith extendwith = extendWith.serializer;
                    if (z) {
                        int i7 = RemoteActionCompatParcelizer + 91;
                        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                        if (i7 % 2 != 0) {
                            staticLayoutFactory28.MediaMetadataCompat.logEvent("back_to_back_order_redispatched", null);
                            ((FirebaseRemoteConfigImpl) staticLayoutFactory28.MediaDescriptionCompat).RemoteActionCompatParcelizer.serializer();
                            throw null;
                        }
                        staticLayoutFactory28.MediaMetadataCompat.logEvent("back_to_back_order_redispatched", null);
                        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) staticLayoutFactory28.MediaDescriptionCompat;
                        String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                        if (strSerializer != null) {
                            if (m1$$ExternalSyntheticOutline0.m(updateAdidI.BACK_TO_BACK_ORDERS_REDISPATCHED_MESSAGE_ENABLED, firebaseRemoteConfigImpl.IconCompatParcelizer, strSerializer, firebaseRemoteConfigImpl)) {
                                staticLayoutFactory28.write.serializer(new ListUtils_androidKt(((TextLayoutInput) containsAlllambda0).IconCompatParcelizer));
                            }
                        }
                    } else if (containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY) {
                        staticLayoutFactory28.serializer(Trigger.BACK_TO_BACK_POPUP_APPEAR);
                        r8lambdafHcIMtqslO5nN2ofGE631aElY r8lambdafhcimtqslo5nn2ofge631aely = (r8lambdafHcIMtqslO5nN2ofGE631aElY) containsAlllambda0;
                        paint29 = new Paint29(r8lambdafhcimtqslo5nn2ofge631aely.IconCompatParcelizer, r8lambdafhcimtqslo5nn2ofge631aely.serializer, r8lambdafhcimtqslo5nn2ofge631aely.read);
                    }
                    int i8 = RemoteActionCompatParcelizer + 71;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    paint29 = extendwith;
                }
                staticLayoutFactory28.RemoteActionCompatParcelizer(paint29);
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                return createfromparcel2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(SettingsCacheImpl settingsCacheImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.read = i;
            this.IconCompatParcelizer = settingsCacheImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.read;
            SettingsCacheImpl settingsCacheImpl = this.IconCompatParcelizer;
            return i != 0 ? new AnonymousClass1(settingsCacheImpl, shortNewsContentCardView, 1) : new AnonymousClass1(settingsCacheImpl, shortNewsContentCardView, 0);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.read;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
            return i != 0 ? ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.read;
            SettingsCacheImpl settingsCacheImpl = this.IconCompatParcelizer;
            if (i != 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.write;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                        return obj;
                    }
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowSerializer = settingsCacheImpl.read.serializer();
                this.write = 1;
                Object objFirst = FlowKt.first(flowSerializer, this);
                return objFirst == coroutineSingletons ? coroutineSingletons : objFirst;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowSerializer2 = settingsCacheImpl.read.serializer();
                C00171 c00171 = new C00171(0, settingsCacheImpl.serializer);
                this.write = 1;
                if (flowSerializer2.collect(c00171, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
    }

    public final accessscheduleScrollEventIfNeeded read() {
        AtomicReference atomicReference = this.serializer;
        if (atomicReference.get() == null) {
            Object objSerializer = BuildersKt.serializer(r8lambda2qMxD75IpTxKfLD4RjAbqEmoamc.write, new AnonymousClass1(this, null, 1));
            while (!atomicReference.compareAndSet(null, objSerializer) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (accessscheduleScrollEventIfNeeded) obj;
    }

    public SettingsCacheImpl(TextAnnouncementContentCardView textAnnouncementContentCardView, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, performCustomExitMxy_nc0 performcustomexitmxy_nc0) {
        textAnnouncementContentCardView.getClass();
        androidComposeViewAccessibilityDelegateCompat.getClass();
        performcustomexitmxy_nc0.getClass();
        this.IconCompatParcelizer = textAnnouncementContentCardView;
        this.RemoteActionCompatParcelizer = androidComposeViewAccessibilityDelegateCompat;
        this.read = performcustomexitmxy_nc0;
        this.serializer = new AtomicReference();
        BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardView), null, null, new AnonymousClass1(this, null, 0), 3);
    }

    public final boolean RemoteActionCompatParcelizer() {
        Long l = read().cacheUpdatedTimeSeconds;
        Integer num = read().cacheDurationSeconds;
        if (l == null || num == null) {
            return true;
        }
        this.RemoteActionCompatParcelizer.getClass();
        return AndroidComposeViewAccessibilityDelegateCompat.RemoteActionCompatParcelizer().seconds - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object updateConfigs(accessscheduleScrollEventIfNeeded accessschedulescrolleventifneeded, ContinuationImpl continuationImpl) {
        adjustForReversedScrollingAndRtlRE3cj74 adjustforreversedscrollingandrtlre3cj74;
        if (continuationImpl instanceof adjustForReversedScrollingAndRtlRE3cj74) {
            adjustforreversedscrollingandrtlre3cj74 = (adjustForReversedScrollingAndRtlRE3cj74) continuationImpl;
            int i = adjustforreversedscrollingandrtlre3cj74.read;
            if ((i & Integer.MIN_VALUE) != 0) {
                adjustforreversedscrollingandrtlre3cj74.read = i - Integer.MIN_VALUE;
            } else {
                adjustforreversedscrollingandrtlre3cj74 = new adjustForReversedScrollingAndRtlRE3cj74(this, continuationImpl);
            }
        } else {
            adjustforreversedscrollingandrtlre3cj74 = new adjustForReversedScrollingAndRtlRE3cj74(this, continuationImpl);
        }
        Object obj = adjustforreversedscrollingandrtlre3cj74.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = adjustforreversedscrollingandrtlre3cj74.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        try {
            if (i2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                performCustomExitMxy_nc0 performcustomexitmxy_nc0 = this.read;
                DiskLruCache$launchCleanup$1 diskLruCache$launchCleanup$1 = new DiskLruCache$launchCleanup$1(accessschedulescrolleventifneeded, shortNewsContentCardView, 5);
                adjustforreversedscrollingandrtlre3cj74.read = 1;
                if (performcustomexitmxy_nc0.updateData(diskLruCache$launchCleanup$1, adjustforreversedscrollingandrtlre3cj74) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
        } catch (IOException e) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseSessions", "Failed to update config values: " + e);
        }
        return createFromParcel.INSTANCE;
    }
}
