package com.roadrunner.rider.state.connectivity;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import java.util.Calendar;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getFailureResponseData;
import o.getTimerStart;
import o.r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setBaseUrl;
import o.setSubsessionInterval;

/* JADX INFO: loaded from: classes3.dex */
public final class RiderStateConnectivityObserver$init$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public int read;
    public final /* synthetic */ getTimerStart serializer;
    public final /* synthetic */ int write;

    /* JADX INFO: renamed from: com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2$1, reason: invalid class name */
    public final class AnonymousClass1 implements FlowCollector {
        private static int IconCompatParcelizer = 0;
        private static int RemoteActionCompatParcelizer = 1;
        public final /* synthetic */ int read;
        public final /* synthetic */ getTimerStart write;

        public /* synthetic */ AnonymousClass1(getTimerStart gettimerstart, int i) {
            this.read = i;
            this.write = gettimerstart;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        public Object emit(boolean z, ShortNewsContentCardView shortNewsContentCardView) {
            setBaseUrl setbaseurl;
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = i2 + 31;
            RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            Long l = null;
            if (shortNewsContentCardView instanceof setBaseUrl) {
                int i5 = i2 + 5;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    int i6 = ((setBaseUrl) shortNewsContentCardView).RemoteActionCompatParcelizer;
                    l.hashCode();
                    throw null;
                }
                setbaseurl = (setBaseUrl) shortNewsContentCardView;
                int i7 = setbaseurl.RemoteActionCompatParcelizer;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    setbaseurl.RemoteActionCompatParcelizer = i7 - Integer.MIN_VALUE;
                } else {
                    setbaseurl = new setBaseUrl(this, shortNewsContentCardView);
                }
            } else {
                setbaseurl = new setBaseUrl(this, shortNewsContentCardView);
            }
            Object objFirstOrNull = setbaseurl.write;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = setbaseurl.RemoteActionCompatParcelizer;
            getTimerStart gettimerstart = this.write;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                if (z) {
                    GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1IconCompatParcelizer = gettimerstart.RemoteActionCompatParcelizer.IconCompatParcelizer();
                    setbaseurl.RemoteActionCompatParcelizer = 1;
                    objFirstOrNull = FlowKt.firstOrNull(getMapScope$invoke$$inlined$map$1IconCompatParcelizer, setbaseurl);
                    if (objFirstOrNull == coroutineSingletons) {
                        int i9 = RemoteActionCompatParcelizer + 123;
                        IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                        if (i9 % 2 == 0) {
                            return coroutineSingletons;
                        }
                        throw null;
                    }
                }
                return createFromParcel.INSTANCE;
            }
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                int i10 = RemoteActionCompatParcelizer + 91;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            getFailureResponseData getfailureresponsedata = (getFailureResponseData) objFirstOrNull;
            if (getfailureresponsedata != null) {
                l = new Long(getfailureresponsedata.write);
                int i12 = RemoteActionCompatParcelizer + 13;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            }
            if (l == null || Math.max(System.currentTimeMillis() - l.longValue(), 0L) > DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
                ((setSubsessionInterval) gettimerstart.RatingCompat.write()).write(Calendar.getInstance());
                int i14 = IconCompatParcelizer + 111;
                RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
            }
            return createFromParcel.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 107;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            if (this.read != 0) {
                return emit(((Boolean) obj).booleanValue(), shortNewsContentCardView);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            getTimerStart gettimerstart = this.write;
            r8lambda7Q1QCWXCUHrhcsGraulDg_ksbGU r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu = gettimerstart.MediaBrowserCompatMediaItem;
            ShortNewsContentCardView shortNewsContentCardView2 = null;
            if (zBooleanValue) {
                int i4 = RemoteActionCompatParcelizer;
                int i5 = i4 + 107;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    int i7 = i4 + 39;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 != 0) {
                        r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                        shortNewsContentCardView2.hashCode();
                        throw null;
                    }
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                    int i8 = RemoteActionCompatParcelizer + 111;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                }
                gettimerstart.MediaBrowserCompatMediaItem = BuildersKt.RemoteActionCompatParcelizer(gettimerstart.write, null, null, new RiderStateConnectivityObserver$init$2(gettimerstart, shortNewsContentCardView2, 1), 3);
            } else {
                if (r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu != null) {
                    int i10 = RemoteActionCompatParcelizer + 115;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    r8lambda7q1qcwxcuhrhcsgrauldg_ksbgu.write((CancellationException) null);
                }
                gettimerstart.MediaBrowserCompatMediaItem = null;
            }
            return createFromParcel.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RiderStateConnectivityObserver$init$2(getTimerStart gettimerstart, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.write = i;
        this.serializer = gettimerstart;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        getTimerStart gettimerstart = this.serializer;
        if (i3 == 0) {
            RiderStateConnectivityObserver$init$2 riderStateConnectivityObserver$init$2 = new RiderStateConnectivityObserver$init$2(gettimerstart, shortNewsContentCardView, 0);
            int i4 = RemoteActionCompatParcelizer + 5;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return riderStateConnectivityObserver$init$2;
        }
        RiderStateConnectivityObserver$init$2 riderStateConnectivityObserver$init$3 = new RiderStateConnectivityObserver$init$2(gettimerstart, shortNewsContentCardView, 1);
        int i6 = IconCompatParcelizer + 85;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return riderStateConnectivityObserver$init$3;
        }
        obj2.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        return ((com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2) create(r5, r6)).invokeSuspend(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5 = ((com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2) create(r5, r6)).invokeSuspend(r2);
        r6 = com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2.RemoteActionCompatParcelizer + 75;
        com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2.IconCompatParcelizer = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2.RemoteActionCompatParcelizer
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2.IconCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1d
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            r3 = 21
            int r3 = r3 / 0
            if (r1 == 0) goto L3b
            goto L27
        L1d:
            int r1 = r4.write
            o.createFromParcel r2 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r5 = (o.getContentViewGroupParentLayout) r5
            o.ShortNewsContentCardView r6 = (o.ShortNewsContentCardView) r6
            if (r1 == 0) goto L3b
        L27:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2 r5 = (com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            int r6 = com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2.RemoteActionCompatParcelizer
            int r6 = r6 + 75
            int r1 = r6 % 128
            com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2.IconCompatParcelizer = r1
            int r6 = r6 % r0
            return r5
        L3b:
            o.ShortNewsContentCardView r5 = r4.create(r5, r6)
            com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2 r5 = (com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2) r5
            java.lang.Object r5 = r5.invokeSuspend(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rider.state.connectivity.RiderStateConnectivityObserver$init$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        Object obj2 = createFromParcel.INSTANCE;
        getTimerStart gettimerstart = this.serializer;
        int i5 = 1;
        Object obj3 = null;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.read;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Flow flowWrite = FlowKt.write(new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(new RiderStateConnectivityObserver$listenConnectivityChangesAndUpdateState$1$1(2, null), gettimerstart.read.read), DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(gettimerstart, i5);
                this.read = 1;
                if (flowWrite.collect(anonymousClass1, this) == coroutineSingletons) {
                    int i7 = IconCompatParcelizer + 71;
                    RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    obj2 = coroutineSingletons;
                }
            } else if (i6 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i9 = IconCompatParcelizer + 117;
            RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                return obj2;
            }
            obj3.hashCode();
            throw null;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.read;
        int i11 = 0;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = gettimerstart.IconCompatParcelizer;
            this.read = 1;
            obj = initializeAppStartupItemsImpl.invoke(this);
            if (obj != coroutineSingletons2) {
            }
            return coroutineSingletons2;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i12 = IconCompatParcelizer + 61;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i13 = 61 / 0;
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i14 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i14 % Fields.SpotShadowColor;
        int i15 = i14 % 2;
        AnonymousClass1 anonymousClass2 = new AnonymousClass1(gettimerstart, i11);
        this.read = 2;
        if (((Flow) obj).collect(anonymousClass2, this) != coroutineSingletons2) {
            return obj2;
        }
        return coroutineSingletons2;
    }
}
