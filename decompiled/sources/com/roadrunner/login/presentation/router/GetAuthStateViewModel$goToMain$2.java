package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusApp$init$4;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferedChannel;
import o.ShortNewsContentCardView;
import o.c9;
import o.createFromParcel;
import o.getAllSemanticsNodesToMap;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthStateViewModel$goToMain$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ int read;
    public int serializer;
    public final /* synthetic */ GetAuthStateViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAuthStateViewModel$goToMain$2(GetAuthStateViewModel getAuthStateViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.read = i;
        this.write = getAuthStateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        GetAuthStateViewModel getAuthStateViewModel = this.write;
        if (i3 == 0) {
            return new GetAuthStateViewModel$goToMain$2(getAuthStateViewModel, shortNewsContentCardView, 0);
        }
        int i4 = 1;
        if (i3 == 1) {
            GetAuthStateViewModel$goToMain$2 getAuthStateViewModel$goToMain$2 = new GetAuthStateViewModel$goToMain$2(getAuthStateViewModel, shortNewsContentCardView, i4);
            int i5 = RemoteActionCompatParcelizer + 77;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return getAuthStateViewModel$goToMain$2;
            }
            throw null;
        }
        if (i3 != 2) {
            return new GetAuthStateViewModel$goToMain$2(getAuthStateViewModel, shortNewsContentCardView, 3);
        }
        GetAuthStateViewModel$goToMain$2 getAuthStateViewModel$goToMain$3 = new GetAuthStateViewModel$goToMain$2(getAuthStateViewModel, shortNewsContentCardView, i);
        int i6 = IconCompatParcelizer + 73;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return getAuthStateViewModel$goToMain$3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r1 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        return ((com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        return ((com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
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
            int r1 = com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2.RemoteActionCompatParcelizer
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L22
            int r1 = r5.read
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            r4 = 74
            int r4 = r4 / 0
            if (r1 == 0) goto L51
            if (r1 == r2) goto L46
            if (r1 == r0) goto L3b
            goto L30
        L22:
            int r1 = r5.read
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            if (r1 == 0) goto L51
            if (r1 == r2) goto L46
            if (r1 == r0) goto L3b
        L30:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2 r6 = (com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L3b:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2 r6 = (com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L46:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2 r6 = (com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L51:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2 r6 = (com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            int r7 = com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2.RemoteActionCompatParcelizer
            int r7 = r7 + 123
            int r1 = r7 % 128
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2.IconCompatParcelizer = r1
            int r7 = r7 % r0
            if (r7 != 0) goto L67
            return r6
        L67:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.router.GetAuthStateViewModel$goToMain$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        GetAuthStateViewModel getAuthStateViewModel = this.write;
        ShortNewsContentCardView shortNewsContentCardView = null;
        int i4 = 1;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.serializer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BufferedChannel bufferedChannel = getAuthStateViewModel.read;
                this.serializer = 1;
                if (bufferedChannel.serializer((Object) c9.IconCompatParcelizer, (ShortNewsContentCardView) this) != coroutineSingletons) {
                    return createfromparcel;
                }
                int i6 = IconCompatParcelizer + 35;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
            int i8 = RemoteActionCompatParcelizer + 27;
            int i9 = i8 % Fields.SpotShadowColor;
            IconCompatParcelizer = i9;
            int i10 = i8 % 2;
            if (i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i11 = i9 + 1;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = this.serializer;
            if (i13 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getAllSemanticsNodesToMap getallsemanticsnodestomap = getAuthStateViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                GetAuthStateViewModel$onUserAuthenticated$2 getAuthStateViewModel$onUserAuthenticated$2 = new GetAuthStateViewModel$onUserAuthenticated$2(getAuthStateViewModel, shortNewsContentCardView, i4);
                this.serializer = 1;
                return ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap).ofSuspend("asti_auth_load_ab_test_config", getAuthStateViewModel$onUserAuthenticated$2, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
            }
            if (i13 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i14 = RemoteActionCompatParcelizer + 19;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            if (i14 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i15 = 4 / 0;
            return createfromparcel;
        }
        if (i3 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i16 = this.serializer;
            if (i16 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getAllSemanticsNodesToMap getallsemanticsnodestomap2 = getAuthStateViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                PerseusApp$init$4 perseusApp$init$4 = new PerseusApp$init$4(getAuthStateViewModel, shortNewsContentCardView, i4);
                this.serializer = 1;
                return ((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap2).ofSuspend("asti_auth_log_tracked_firebase_flags", perseusApp$init$4, this) == coroutineSingletons3 ? coroutineSingletons3 : createfromparcel;
            }
            int i17 = IconCompatParcelizer + 27;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0 ? i16 != 1 : i16 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i18 = this.serializer;
        if (i18 != 0) {
            if (i18 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i19 = RemoteActionCompatParcelizer + 99;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        getAllSemanticsNodesToMap getallsemanticsnodestomap3 = getAuthStateViewModel.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        GetAuthStateViewModel$onUserAuthenticated$2 getAuthStateViewModel$onUserAuthenticated$3 = new GetAuthStateViewModel$onUserAuthenticated$2(getAuthStateViewModel, shortNewsContentCardView, i);
        this.serializer = 1;
        if (((TraceTimeMeasurementWithPerformanceKit) getallsemanticsnodestomap3).ofSuspend("asti_auth_proceed_with_new_auth", getAuthStateViewModel$onUserAuthenticated$3, this) != coroutineSingletons4) {
            return createfromparcel;
        }
        int i21 = RemoteActionCompatParcelizer + 27;
        IconCompatParcelizer = i21 % Fields.SpotShadowColor;
        if (i21 % 2 == 0) {
            return coroutineSingletons4;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
