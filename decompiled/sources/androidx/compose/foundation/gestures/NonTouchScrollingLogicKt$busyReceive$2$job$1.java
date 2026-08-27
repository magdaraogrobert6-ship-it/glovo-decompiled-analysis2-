package androidx.compose.foundation.gestures;

import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationApp;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationAppDelegate;
import com.mapbox.navigation.core.lifecycle.MapboxNavigationOwner;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.TextStreamsKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.FlowCollector;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getNoneIUNYP9kannotations;
import o.getViewportSizeYbymL2g;
import o.isAdapterPositionOnScreen;
import o.l3;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final class NonTouchScrollingLogicKt$busyReceive$2$job$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int IconCompatParcelizer;
    public int read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonTouchScrollingLogicKt$busyReceive$2$job$1() {
        super(2, null);
        this.IconCompatParcelizer = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NonTouchScrollingLogicKt$busyReceive$2$job$1(int i, int i2, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
        this.IconCompatParcelizer = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r1 != 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r1 = new androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1(r0, 4, r8);
        r1.serializer = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r1 = new androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1(r0, r4, r8);
        r1.serializer = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1 != 3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r7, o.ShortNewsContentCardView r8) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1.write
            int r1 = r1 + 81
            int r2 = r1 % 128
            androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1.RemoteActionCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            r4 = 3
            if (r1 != 0) goto L1f
            int r1 = r6.IconCompatParcelizer
            r5 = 81
            int r5 = r5 / r2
            if (r1 == 0) goto L52
            if (r1 == r3) goto L42
            if (r1 == r0) goto L3a
            if (r1 == r4) goto L32
            goto L29
        L1f:
            int r1 = r6.IconCompatParcelizer
            if (r1 == 0) goto L52
            if (r1 == r3) goto L42
            if (r1 == r0) goto L3a
            if (r1 == r4) goto L32
        L29:
            androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1 r1 = new androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1
            r2 = 4
            r1.<init>(r0, r2, r8)
            r1.serializer = r7
            return r1
        L32:
            androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1 r1 = new androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1
            r1.<init>(r0, r4, r8)
            r1.serializer = r7
            return r1
        L3a:
            androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1 r1 = new androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1
            r1.<init>(r0, r0, r8)
            r1.serializer = r7
            return r1
        L42:
            androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1 r1 = new androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1
            r1.<init>(r0, r3, r8)
            r1.serializer = r7
            int r7 = androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1.RemoteActionCompatParcelizer
            int r7 = r7 + r4
            int r8 = r7 % 128
            androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1.write = r8
            int r7 = r7 % r0
            return r1
        L52:
            androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1 r1 = new androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1
            r1.<init>(r0, r2, r8)
            r1.serializer = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 17;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 == 0) {
            return ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        if (i3 != 2) {
            return i3 != 3 ? ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2) : ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        int i4 = write + 95;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getContentViewGroupParentLayout getcontentviewgroupparentlayout;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj2 = createFromParcel.INSTANCE;
        Object obj3 = null;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.read;
            if (i5 != 0) {
                int i6 = write + 21;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.serializer;
            }
            while (JobKt.write(getcontentviewgroupparentlayout.getCoroutineContext())) {
                getViewportSizeYbymL2g getviewportsizeybyml2g = new getViewportSizeYbymL2g(5);
                this.serializer = getcontentviewgroupparentlayout;
                this.read = 1;
                if (TextStreamsKt.read(getContext()).withFrameNanos(getviewportsizeybyml2g, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj2;
        }
        if (i4 == 1) {
            FlowCollector flowCollector = (FlowCollector) this.serializer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.read;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = null;
                this.read = 1;
                if (flowCollector.emit(getNoneIUNYP9kannotations.write, this) == coroutineSingletons2) {
                    int i9 = RemoteActionCompatParcelizer + 85;
                    write = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    obj2 = coroutineSingletons2;
                }
            } else if (i8 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i11 = write + 87;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return obj2;
        }
        if (i4 == 2) {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = (getContentViewGroupParentLayout) this.serializer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.read;
            if (i13 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = getcontentviewgroupparentlayout2;
                this.read = 1;
                if (DelayKt.delay(35000L, this) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            } else {
                if (i13 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i14 = write + 3;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    obj3.hashCode();
                    throw null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            YieldKt.IconCompatParcelizer(getcontentviewgroupparentlayout2);
            Timber.RemoteActionCompatParcelizer.write(new Exception("State loading action didn't finish in 35 seconds. App might stuck."));
            return obj2;
        }
        if (i4 != 3) {
            FlowCollector flowCollector2 = (FlowCollector) this.serializer;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i15 = this.read;
            if (i15 != 0) {
                int i16 = write + 77;
                RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (i15 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    obj2 = null;
                }
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = null;
                this.read = 1;
                if (flowCollector2.emit(obj2, this) == coroutineSingletons4) {
                    obj2 = coroutineSingletons4;
                }
            }
            int i18 = write + 35;
            RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
            if (i18 % 2 != 0) {
                return obj2;
            }
            throw null;
        }
        InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1 = (InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) this.serializer;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i19 = this.read;
        if (i19 != 0) {
            if (i19 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i20 = write + 47;
            RemoteActionCompatParcelizer = i20 % Fields.SpotShadowColor;
            if (i20 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            throw null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        l3 l3Var = new l3(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1);
        isAdapterPositionOnScreen isadapterpositiononscreen = MapboxNavigationApp.mapboxNavigationAppDelegate$delegate;
        MapboxNavigationAppDelegate mapboxNavigationAppDelegate = MapboxNavigationApp.getMapboxNavigationAppDelegate();
        mapboxNavigationAppDelegate.getClass();
        MapboxNavigationOwner mapboxNavigationOwner = mapboxNavigationAppDelegate.getMapboxNavigationOwner();
        mapboxNavigationOwner.getClass();
        if (mapboxNavigationOwner.services.add(l3Var)) {
            int i21 = write + 49;
            RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 == 0) {
                MapboxNavigation mapboxNavigation = mapboxNavigationOwner.mapboxNavigation;
                throw null;
            }
            MapboxNavigation mapboxNavigation2 = mapboxNavigationOwner.mapboxNavigation;
            if (mapboxNavigation2 != null) {
                l3Var.onAttached(mapboxNavigation2);
            }
        }
        NetworkingCoreModule$$ExternalSyntheticLambda2 networkingCoreModule$$ExternalSyntheticLambda2 = new NetworkingCoreModule$$ExternalSyntheticLambda2(11, l3Var);
        this.serializer = null;
        this.read = 1;
        return Room.awaitClose(inAppMessageBackEventHandler1inAppMessageBackAnimationCallback1, networkingCoreModule$$ExternalSyntheticLambda2, this) == coroutineSingletons5 ? coroutineSingletons5 : obj2;
    }
}
