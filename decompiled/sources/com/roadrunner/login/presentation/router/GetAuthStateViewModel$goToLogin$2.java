package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.domain.GetUserDataUseCaseImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferedChannel;
import o.ShortNewsContentCardView;
import o.c8ExternalSyntheticOutline0;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getTextSelectionRange;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthStateViewModel$goToLogin$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int read = 1;
    private static int serializer;
    public final /* synthetic */ GetAuthStateViewModel IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAuthStateViewModel$goToLogin$2(GetAuthStateViewModel getAuthStateViewModel, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = getAuthStateViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 23;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        GetAuthStateViewModel getAuthStateViewModel = this.IconCompatParcelizer;
        if (i4 != 0) {
            return new GetAuthStateViewModel$goToLogin$2(getAuthStateViewModel, shortNewsContentCardView, 1);
        }
        GetAuthStateViewModel$goToLogin$2 getAuthStateViewModel$goToLogin$2 = new GetAuthStateViewModel$goToLogin$2(getAuthStateViewModel, shortNewsContentCardView, 0);
        int i5 = read + 59;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return getAuthStateViewModel$goToLogin$2;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = read + 105;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        if (i3 != 0) {
            return ((GetAuthStateViewModel$goToLogin$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((GetAuthStateViewModel$goToLogin$2) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = read + 49;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 65;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        GetAuthStateViewModel getAuthStateViewModel = this.IconCompatParcelizer;
        if (i4 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.write;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                BufferedChannel bufferedChannel = getAuthStateViewModel.read;
                this.write = 1;
                if (bufferedChannel.serializer((Object) c8ExternalSyntheticOutline0.IconCompatParcelizer, (ShortNewsContentCardView) this) != coroutineSingletons) {
                    return createfromparcel;
                }
                int i6 = serializer + 121;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return coroutineSingletons;
            }
            int i8 = read + 67;
            int i9 = i8 % Fields.SpotShadowColor;
            serializer = i9;
            if (i8 % 2 == 0 ? i5 != 1 : i5 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i10 = i9 + 27;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            int i11 = 15 / 0;
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.write;
        if (i12 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetUserDataUseCaseImpl getUserDataUseCaseImpl = getAuthStateViewModel.MediaSessionCompatQueueItem;
            this.write = 1;
            obj = getUserDataUseCaseImpl.invoke(this);
            if (obj == coroutineSingletons2) {
                int i13 = serializer + 33;
                read = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
            }
            return coroutineSingletons2;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i15 = read + 109;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i17 = read + 29;
        serializer = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        this.write = 2;
        if (GetAuthStateViewModel.access$onUserAuthenticated(getAuthStateViewModel, (getTextSelectionRange) obj, "v2 on identity verified auto login", this) != coroutineSingletons2) {
            return createfromparcel;
        }
        return coroutineSingletons2;
    }
}
