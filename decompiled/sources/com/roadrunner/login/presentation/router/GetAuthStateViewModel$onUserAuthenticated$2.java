package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthStateViewModel$onUserAuthenticated$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public int serializer;
    public final /* synthetic */ GetAuthStateViewModel write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAuthStateViewModel$onUserAuthenticated$2(GetAuthStateViewModel getAuthStateViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.write = getAuthStateViewModel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        return new com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2(r4, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        r1 = new com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2(r4, r7, r3);
        r7 = com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2.IconCompatParcelizer + 61;
        com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2.RemoteActionCompatParcelizer = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if ((r7 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r7 = 39 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(o.ShortNewsContentCardView r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2.RemoteActionCompatParcelizer
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2.IconCompatParcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1c
            int r1 = r6.read
            com.roadrunner.login.presentation.router.GetAuthStateViewModel r4 = r6.write
            r5 = 37
            int r5 = r5 / r2
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L2a
            goto L24
        L1c:
            int r1 = r6.read
            com.roadrunner.login.presentation.router.GetAuthStateViewModel r4 = r6.write
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L2a
        L24:
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2 r1 = new com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2
            r1.<init>(r4, r7, r0)
            return r1
        L2a:
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2 r1 = new com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2
            r1.<init>(r4, r7, r3)
            int r7 = com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2.IconCompatParcelizer
            int r7 = r7 + 61
            int r3 = r7 % 128
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2.RemoteActionCompatParcelizer = r3
            int r7 = r7 % r0
            if (r7 == 0) goto L3d
            r7 = 39
            int r7 = r7 / r2
        L3d:
            return r1
        L3e:
            com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2 r0 = new com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2
            r0.<init>(r4, r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.presentation.router.GetAuthStateViewModel$onUserAuthenticated$2.create(o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 == 0) {
            return ((GetAuthStateViewModel$onUserAuthenticated$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 != 1) {
            return ((GetAuthStateViewModel$onUserAuthenticated$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((GetAuthStateViewModel$onUserAuthenticated$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objInvokeSuspend;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = this.read;
        Object obj2 = createFromParcel.INSTANCE;
        GetAuthStateViewModel getAuthStateViewModel = this.write;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.serializer;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                if (GetAuthStateViewModel.access$goToMain(getAuthStateViewModel, this) != coroutineSingletons) {
                    return obj2;
                }
                int i4 = RemoteActionCompatParcelizer + 103;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return coroutineSingletons;
            }
            if (i3 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = IconCompatParcelizer + 65;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i7 = 97 / 0;
            return obj2;
        }
        if (i2 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.serializer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.serializer = 1;
                return GetAuthStateViewModel.access$proceedWithAuth(getAuthStateViewModel, this) == coroutineSingletons2 ? coroutineSingletons2 : obj2;
            }
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i9 = RemoteActionCompatParcelizer + 27;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.serializer;
        if (i11 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            LoadAbTestConfigUseCase loadAbTestConfigUseCase = getAuthStateViewModel.PlaybackStateCompatCustomAction;
            this.serializer = 1;
            if (loadAbTestConfigUseCase.invoke(this) == coroutineSingletons3) {
                obj2 = coroutineSingletons3;
            }
        } else if (i11 == 1) {
            int i12 = IconCompatParcelizer + 119;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            obj2 = null;
        }
        int i13 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i13 % Fields.SpotShadowColor;
        if (i13 % 2 == 0) {
            int i14 = 8 / 0;
        }
        return obj2;
    }
}
