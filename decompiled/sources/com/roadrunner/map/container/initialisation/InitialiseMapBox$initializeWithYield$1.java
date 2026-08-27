package com.roadrunner.map.container.initialisation;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.WorkerWrapper;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.agconnect.config.impl.m;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.database.domain.ClearDatabaseUseCase$invoke$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.getContentViewGroupParentLayout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class InitialiseMapBox$initializeWithYield$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int serializer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ WorkerWrapper.Builder RemoteActionCompatParcelizer;
    public int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InitialiseMapBox$initializeWithYield$1(WorkerWrapper.Builder builder, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = builder;
    }

    /* JADX INFO: renamed from: com.roadrunner.map.container.initialisation.InitialiseMapBox$initializeWithYield$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        private static int MediaMetadataCompat = 1;
        private static int MediaSessionCompatQueueItem;
        public final /* synthetic */ int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public Object read;
        public int serializer;
        public final /* synthetic */ Object write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(m mVar, int i, String str, ShortNewsContentCardView shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
            this.IconCompatParcelizer = 2;
            this.read = mVar;
            this.RemoteActionCompatParcelizer = i;
            this.write = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(WorkerWrapper.Builder builder, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(1, shortNewsContentCardView);
            this.IconCompatParcelizer = i;
            this.write = builder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 9;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            Object obj = this.write;
            if (i4 == 0) {
                return new AnonymousClass1((WorkerWrapper.Builder) obj, shortNewsContentCardView, 0);
            }
            int i5 = 1;
            if (i4 != 1) {
                return new AnonymousClass1((m) this.read, this.RemoteActionCompatParcelizer, (String) obj, shortNewsContentCardView);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((WorkerWrapper.Builder) obj, shortNewsContentCardView, i5);
            int i6 = MediaMetadataCompat + 99;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return anonymousClass1;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(Object obj) {
            int i = 2 % 2;
            int i2 = MediaSessionCompatQueueItem + 95;
            MediaMetadataCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            int i4 = this.IconCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
            if (i4 != 0) {
                return i4 != 1 ? ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            }
            Object objInvokeSuspend = ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i5 = MediaMetadataCompat + 69;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
        
            if (kotlinx.coroutines.YieldKt.yield(r12) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x013c, code lost:
        
            if (kotlinx.coroutines.YieldKt.yield(r12) == r1) goto L51;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.container.initialisation.InitialiseMapBox$initializeWithYield$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.IconCompatParcelizer;
        WorkerWrapper.Builder builder = this.RemoteActionCompatParcelizer;
        if (i3 != 0) {
            int i4 = 1;
            if (i3 == 1) {
                return new InitialiseMapBox$initializeWithYield$1(builder, shortNewsContentCardView, i4);
            }
            InitialiseMapBox$initializeWithYield$1 initialiseMapBox$initializeWithYield$1 = new InitialiseMapBox$initializeWithYield$1(builder, shortNewsContentCardView, i);
            int i5 = write + 41;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return initialiseMapBox$initializeWithYield$1;
        }
        InitialiseMapBox$initializeWithYield$1 initialiseMapBox$initializeWithYield$2 = new InitialiseMapBox$initializeWithYield$1(builder, shortNewsContentCardView, 0);
        int i7 = write + 9;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return initialiseMapBox$initializeWithYield$2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 97;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i4 == 0) {
            return ((InitialiseMapBox$initializeWithYield$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i4 != 1) {
            return ((InitialiseMapBox$initializeWithYield$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((InitialiseMapBox$initializeWithYield$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 15;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        WorkerWrapper.Builder builder = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i3 = 1;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.read;
            if (i4 != 0) {
                int i5 = serializer + 99;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getAllSemanticsNodesToMap getallsemanticsnodestomap = (getAllSemanticsNodesToMap) builder.read;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(builder, shortNewsContentCardView, 0);
            this.read = 1;
            if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("asti_init_mapbox_with_yield", anonymousClass1, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i6 = write + 47;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                return coroutineSingletons;
            }
            throw null;
        }
        if (i2 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.read;
            if (i7 != 0) {
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getAllSemanticsNodesToMap getallsemanticsnodestomap2 = (getAllSemanticsNodesToMap) builder.read;
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(builder, shortNewsContentCardView, i3);
            this.read = 1;
            return ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap2).ofSuspend("asti_init_mapbox_io_yield", anonymousClass2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.read;
        if (i8 != 0) {
            if (i8 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getAllSemanticsNodesToMap getallsemanticsnodestomap3 = (getAllSemanticsNodesToMap) builder.read;
        ClearDatabaseUseCase$invoke$2 clearDatabaseUseCase$invoke$2 = new ClearDatabaseUseCase$invoke$2(builder, shortNewsContentCardView, 5);
        this.read = 1;
        return ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap3).ofSuspend("asti_init_mapbox_computation", clearDatabaseUseCase$invoke$2, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
    }
}
