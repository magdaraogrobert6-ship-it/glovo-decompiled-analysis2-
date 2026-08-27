package com.roadrunner.login.presentation.router;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.login.logging.RouterLogger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getIsContainer;
import o.getIsDialog;
import o.getTextSelectionRange;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthStateViewModel$proceedWithAuth$2$4 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaMetadataCompat = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getIsDialog RemoteActionCompatParcelizer;
    public final /* synthetic */ GetAuthStateViewModel read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAuthStateViewModel$proceedWithAuth$2$4(GetAuthStateViewModel getAuthStateViewModel, getIsDialog getisdialog, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.IconCompatParcelizer = i;
        this.read = getAuthStateViewModel;
        this.RemoteActionCompatParcelizer = getisdialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 35;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        getIsDialog getisdialog = this.RemoteActionCompatParcelizer;
        GetAuthStateViewModel getAuthStateViewModel = this.read;
        if (i4 != 0) {
            GetAuthStateViewModel$proceedWithAuth$2$4 getAuthStateViewModel$proceedWithAuth$2$4 = new GetAuthStateViewModel$proceedWithAuth$2$4(getAuthStateViewModel, getisdialog, shortNewsContentCardView, 1);
            int i5 = serializer + 23;
            MediaMetadataCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return getAuthStateViewModel$proceedWithAuth$2$4;
        }
        GetAuthStateViewModel$proceedWithAuth$2$4 getAuthStateViewModel$proceedWithAuth$2$5 = new GetAuthStateViewModel$proceedWithAuth$2$4(getAuthStateViewModel, getisdialog, shortNewsContentCardView, 0);
        int i7 = MediaMetadataCompat + 109;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return getAuthStateViewModel$proceedWithAuth$2$5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 95;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 != 0) {
            return ((GetAuthStateViewModel$proceedWithAuth$2$4) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((GetAuthStateViewModel$proceedWithAuth$2$4) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaMetadataCompat + 99;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 11;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getIsDialog getisdialog = this.RemoteActionCompatParcelizer;
        GetAuthStateViewModel getAuthStateViewModel = this.read;
        Object obj2 = null;
        if (i4 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.write;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                getTextSelectionRange gettextselectionrange = ((getIsContainer) getisdialog).RemoteActionCompatParcelizer;
                this.write = 1;
                return GetAuthStateViewModel.access$onUserAuthenticated(getAuthStateViewModel, gettextselectionrange, "auto login v2", this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
            }
            int i6 = MediaMetadataCompat + 93;
            serializer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = this.write;
        if (i7 != 0) {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i8 = MediaMetadataCompat + 111;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return createfromparcel;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        RouterLogger routerLogger = getAuthStateViewModel.ComponentActivity;
        getTextSelectionRange gettextselectionrange2 = ((getIsContainer) getisdialog).RemoteActionCompatParcelizer;
        this.write = 1;
        if (routerLogger.execute(gettextselectionrange2, this) != coroutineSingletons2) {
            return createfromparcel;
        }
        int i10 = MediaMetadataCompat + 15;
        serializer = i10 % Fields.SpotShadowColor;
        if (i10 % 2 == 0) {
            return coroutineSingletons2;
        }
        obj2.hashCode();
        throw null;
    }
}
