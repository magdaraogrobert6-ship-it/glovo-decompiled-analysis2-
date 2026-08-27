package com.roadrunner.map.integration.mapbox;

import android.app.Application;
import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.core.internal.MapboxNavigationSDKInitializer;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import io.sentry.metrics.MetricsBatchProcessor;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getContentViewGroupParentLayout;
import o.igExternalSyntheticLambda2;
import o.igExternalSyntheticLambda7;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setToSaturationimpl;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InitialiseMapBoxNavigation$initializeOnIo$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ MetricsBatchProcessor IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int write;

    /* JADX INFO: renamed from: com.roadrunner.map.integration.mapbox.InitialiseMapBoxNavigation$initializeOnIo$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int serializer = 1;
        private static int write;
        public final /* synthetic */ int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public final /* synthetic */ MetricsBatchProcessor read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(MetricsBatchProcessor metricsBatchProcessor, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.read = metricsBatchProcessor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = serializer + 47;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = this.IconCompatParcelizer;
            MetricsBatchProcessor metricsBatchProcessor = this.read;
            if (i4 == 0) {
                return new AnonymousClass1(metricsBatchProcessor, shortNewsContentCardView, 0);
            }
            int i5 = 1;
            if (i4 != 1) {
                return new AnonymousClass1(metricsBatchProcessor, shortNewsContentCardView, i);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(metricsBatchProcessor, shortNewsContentCardView, i5);
            int i6 = serializer + 57;
            write = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return anonymousClass1;
            }
            throw null;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = serializer + 59;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
            if (i4 != 0) {
                return i4 != 1 ? ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = write + 53;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = write + 121;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            MetricsBatchProcessor metricsBatchProcessor = this.read;
            if (i4 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.RemoteActionCompatParcelizer;
                if (i5 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    if (MetricsBatchProcessor.access$waitForMapboxInitialization(metricsBatchProcessor, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                setToSaturationimpl settosaturationimplIconCompatParcelizer = setToSaturationimpl.IconCompatParcelizer((Application) metricsBatchProcessor.RemoteActionCompatParcelizer);
                settosaturationimplIconCompatParcelizer.read(MapboxNavigationSDKInitializer.class);
                MetricsBatchProcessor.write(metricsBatchProcessor, settosaturationimplIconCompatParcelizer);
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Initializing mapbox navigation SDK v11 on IO thread", new Object[0]);
                return createfromparcel;
            }
            if (i4 != 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.RemoteActionCompatParcelizer;
                if (i6 != 0) {
                    int i7 = write;
                    int i8 = i7 + 19;
                    serializer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    if (i6 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i10 = i7 + 25;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    if (MetricsBatchProcessor.access$waitForMapboxInitialization(metricsBatchProcessor, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Initializing mapbox navigation SDK v11 with yield", new Object[0]);
                int i12 = write + 113;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                return createfromparcel;
            }
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i14 = this.RemoteActionCompatParcelizer;
            if (i14 != 0) {
                int i15 = serializer;
                int i16 = i15 + 51;
                write = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (i14 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i18 = i15 + 93;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (MetricsBatchProcessor.access$waitForMapboxInitialization(metricsBatchProcessor, this) == coroutineSingletons3) {
                    int i20 = serializer + 9;
                    write = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                    return coroutineSingletons3;
                }
            }
            setToSaturationimpl settosaturationimplIconCompatParcelizer2 = setToSaturationimpl.IconCompatParcelizer((Application) metricsBatchProcessor.RemoteActionCompatParcelizer);
            settosaturationimplIconCompatParcelizer2.read(MapboxNavigationSDKInitializer.class);
            MetricsBatchProcessor.write(metricsBatchProcessor, settosaturationimplIconCompatParcelizer2);
            Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("Initializing mapbox navigation SDK v11 on computation thread", new Object[0]);
            return createfromparcel;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InitialiseMapBoxNavigation$initializeOnIo$1(MetricsBatchProcessor metricsBatchProcessor, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = metricsBatchProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = read + 21;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.RemoteActionCompatParcelizer;
        MetricsBatchProcessor metricsBatchProcessor = this.IconCompatParcelizer;
        if (i5 != 0) {
            int i6 = 1;
            if (i5 != 1) {
                return i5 != 2 ? new InitialiseMapBoxNavigation$initializeOnIo$1(metricsBatchProcessor, shortNewsContentCardView, 3) : new InitialiseMapBoxNavigation$initializeOnIo$1(metricsBatchProcessor, shortNewsContentCardView, i);
            }
            return new InitialiseMapBoxNavigation$initializeOnIo$1(metricsBatchProcessor, shortNewsContentCardView, i6);
        }
        InitialiseMapBoxNavigation$initializeOnIo$1 initialiseMapBoxNavigation$initializeOnIo$1 = new InitialiseMapBoxNavigation$initializeOnIo$1(metricsBatchProcessor, shortNewsContentCardView, 0);
        int i7 = serializer + 9;
        read = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return initialiseMapBoxNavigation$initializeOnIo$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = serializer + 85;
        read = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            obj3.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 == 0) {
            Object objInvokeSuspend = ((InitialiseMapBoxNavigation$initializeOnIo$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
            int i4 = serializer + 1;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 29 / 0;
            }
            return objInvokeSuspend;
        }
        if (i3 != 1) {
            return i3 != 2 ? ((InitialiseMapBoxNavigation$initializeOnIo$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2) : ((InitialiseMapBoxNavigation$initializeOnIo$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend2 = ((InitialiseMapBoxNavigation$initializeOnIo$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i6 = read + 65;
        serializer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return objInvokeSuspend2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        MetricsBatchProcessor metricsBatchProcessor = this.IconCompatParcelizer;
        int i4 = 0;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i5 = 1;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.write;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getAllSemanticsNodesToMap getallsemanticsnodestomap = (getAllSemanticsNodesToMap) metricsBatchProcessor.serializer;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(metricsBatchProcessor, shortNewsContentCardView, i4);
                this.write = 1;
                if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("asti_init_mapbox_navigation_io", anonymousClass1, this) == coroutineSingletons) {
                    int i7 = read + 115;
                    serializer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            ((igExternalSyntheticLambda2) metricsBatchProcessor.write).IconCompatParcelizer(igExternalSyntheticLambda7.NAVIGATION_INITIALIZED);
            return createfromparcel;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i9 = this.write;
            if (i9 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getAllSemanticsNodesToMap getallsemanticsnodestomap2 = (getAllSemanticsNodesToMap) metricsBatchProcessor.serializer;
                AnonymousClass1 anonymousClass2 = new AnonymousClass1(metricsBatchProcessor, shortNewsContentCardView, i5);
                this.write = 1;
                if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap2).ofSuspend("asti_init_mapbox_navigation_computation", anonymousClass2, this) == coroutineSingletons2) {
                    int i10 = read;
                    int i11 = i10 + 11;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    int i13 = i10 + 65;
                    serializer = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    return coroutineSingletons2;
                }
            } else {
                if (i9 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i15 = serializer + 41;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            ((igExternalSyntheticLambda2) metricsBatchProcessor.write).IconCompatParcelizer(igExternalSyntheticLambda7.NAVIGATION_INITIALIZED);
            return createfromparcel;
        }
        if (i3 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i17 = this.write;
            if (i17 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getAllSemanticsNodesToMap getallsemanticsnodestomap3 = (getAllSemanticsNodesToMap) metricsBatchProcessor.serializer;
                TooltipStateImpl.AnonymousClass2 anonymousClass3 = new TooltipStateImpl.AnonymousClass2(metricsBatchProcessor, null, 17);
                this.write = 1;
                if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap3).ofSuspend("asti_init_mapbox_navigation_io_yield", anonymousClass3, this) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
            } else {
                if (i17 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i18 = read + 39;
                serializer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            ((igExternalSyntheticLambda2) metricsBatchProcessor.write).IconCompatParcelizer(igExternalSyntheticLambda7.NAVIGATION_INITIALIZED);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i20 = this.write;
        if (i20 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getAllSemanticsNodesToMap getallsemanticsnodestomap4 = (getAllSemanticsNodesToMap) metricsBatchProcessor.serializer;
            AnonymousClass1 anonymousClass4 = new AnonymousClass1(metricsBatchProcessor, shortNewsContentCardView, i);
            this.write = 1;
            if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap4).ofSuspend("asti_init_mapbox_navigation_with_yield", anonymousClass4, this) == coroutineSingletons4) {
                int i21 = serializer + 83;
                read = i21 % Fields.SpotShadowColor;
                if (i21 % 2 == 0) {
                    int i22 = 32 / 0;
                }
                return coroutineSingletons4;
            }
        } else {
            if (i20 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        }
        ((igExternalSyntheticLambda2) metricsBatchProcessor.write).IconCompatParcelizer(igExternalSyntheticLambda7.NAVIGATION_INITIALIZED);
        return createfromparcel;
    }
}
