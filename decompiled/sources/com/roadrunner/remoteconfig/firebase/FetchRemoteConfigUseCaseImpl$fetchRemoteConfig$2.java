package com.roadrunner.remoteconfig.firebase;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.EnumColumnAdapter;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.decode;
import o.executeAsList;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int read = 0;
    private static int serializer = 1;
    public final /* synthetic */ FetchRemoteConfigUseCaseImpl IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2(FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = fetchRemoteConfigUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = serializer + 81;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl = this.IconCompatParcelizer;
        if (i4 == 0) {
            return new FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2(fetchRemoteConfigUseCaseImpl, shortNewsContentCardView, 0);
        }
        FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2 fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2 = new FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2(fetchRemoteConfigUseCaseImpl, shortNewsContentCardView, 1);
        int i5 = read + 115;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return fetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 115;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 == 0) {
            return ((FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((FetchRemoteConfigUseCaseImpl$fetchRemoteConfig$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = serializer + 111;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM5014resetAndSyncRemoteConfigIoAF18A;
        int i = 2 % 2;
        int i2 = this.write;
        FetchRemoteConfigUseCaseImpl fetchRemoteConfigUseCaseImpl = this.IconCompatParcelizer;
        if (i2 != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.RemoteActionCompatParcelizer;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            if (i3 != 0) {
                int i4 = read + 57;
                serializer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                transferSessionPackageI transfersessionpackagei = fetchRemoteConfigUseCaseImpl.serializer;
                this.RemoteActionCompatParcelizer = 1;
                Object objActivate = ((FirebaseRemoteConfigImpl) transfersessionpackagei).IconCompatParcelizer.activate(this);
                if (objActivate != coroutineSingletons) {
                    objActivate = createfromparcel;
                }
                if (objActivate == coroutineSingletons) {
                    int i5 = read + 97;
                    serializer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        return coroutineSingletons;
                    }
                    throw null;
                }
            }
            return new onItemDismiss(createfromparcel);
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.RemoteActionCompatParcelizer;
        if (i6 != 0) {
            int i7 = read + 125;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM5014resetAndSyncRemoteConfigIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
            int i9 = read + 93;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            transferSessionPackageI transfersessionpackagei2 = fetchRemoteConfigUseCaseImpl.serializer;
            this.RemoteActionCompatParcelizer = 1;
            objM5014resetAndSyncRemoteConfigIoAF18A = ((FirebaseRemoteConfigImpl) transfersessionpackagei2).m5014resetAndSyncRemoteConfigIoAF18A(this);
            if (objM5014resetAndSyncRemoteConfigIoAF18A == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM5014resetAndSyncRemoteConfigIoAF18A);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.write(new Throwable("Firebase Error", thSerializer));
            decode decodeVar = fetchRemoteConfigUseCaseImpl.IconCompatParcelizer;
            String message = thSerializer.getMessage();
            if (message == null) {
                message = "";
            }
            ff$$ExternalSyntheticOutline0.m("reason", message, decodeVar, "firebase_fetch_failed");
            EnumColumnAdapter.serializer((EnumColumnAdapter) fetchRemoteConfigUseCaseImpl.RemoteActionCompatParcelizer.IconCompatParcelizer, "endpoint_issue_firebase", executeAsList.INFRA, "Failed to fetch Firebase Remote Config.");
        }
        return new onItemDismiss(objM5014resetAndSyncRemoteConfigIoAF18A);
    }
}
