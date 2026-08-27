package com.roadrunner.delivery.accept.laststop.data;

import androidx.compose.material3.TooltipStateImpl;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.twofa.presentation.TwoFaViewModel$onPinChanged$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getSecondaryHorizontaldefault;
import o.get_nativeCanvasui_textannotations;
import o.isItemDismissable;
import o.onActivityPreCreated;
import o.onItemDismiss;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class LastStopRepositoryImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final getSecondaryHorizontaldefault read;
    public final ExecuteApiRequest write;

    public LastStopRepositoryImpl(getSecondaryHorizontaldefault getsecondaryhorizontaldefault, ExecuteApiRequest executeApiRequest, Path$Companion path$Companion) {
        this.read = getsecondaryhorizontaldefault;
        this.write = executeApiRequest;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX INFO: renamed from: getLastStopScreen-gIAlu-s, reason: not valid java name */
    public final Object m4902getLastStopScreengIAlus(String str, ContinuationImpl continuationImpl) {
        LastStopRepositoryImpl$getLastStopScreen$1 lastStopRepositoryImpl$getLastStopScreen$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        if (continuationImpl instanceof LastStopRepositoryImpl$getLastStopScreen$1) {
            lastStopRepositoryImpl$getLastStopScreen$1 = (LastStopRepositoryImpl$getLastStopScreen$1) continuationImpl;
            int i2 = lastStopRepositoryImpl$getLastStopScreen$1.read;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                int i3 = serializer + 81;
                IconCompatParcelizer = i3 % Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    lastStopRepositoryImpl$getLastStopScreen$1.read = i2 << Integer.MIN_VALUE;
                } else {
                    lastStopRepositoryImpl$getLastStopScreen$1.read = i2 - Integer.MIN_VALUE;
                }
            } else {
                lastStopRepositoryImpl$getLastStopScreen$1 = new LastStopRepositoryImpl$getLastStopScreen$1(this, continuationImpl);
            }
        } else {
            lastStopRepositoryImpl$getLastStopScreen$1 = new LastStopRepositoryImpl$getLastStopScreen$1(this, continuationImpl);
        }
        Object obj = lastStopRepositoryImpl$getLastStopScreen$1.write;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = lastStopRepositoryImpl$getLastStopScreen$1.read;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i4 != 0) {
            int i5 = serializer + 29;
            IconCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            int i6 = IconCompatParcelizer + 101;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(this, str, shortNewsContentCardView, 11);
            lastStopRepositoryImpl$getLastStopScreen$1.read = 1;
            objM4875invokegIAlus = this.write.m4875invokegIAlus(authRepository$logoutUser$2, lastStopRepositoryImpl$getLastStopScreen$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer != null) {
            return new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer));
        }
        int i8 = IconCompatParcelizer + 51;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return (get_nativeCanvasui_textannotations) objM4875invokegIAlus;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX INFO: renamed from: removeLastStopAddress-0E7RQCE, reason: not valid java name */
    public final Object m4903removeLastStopAddress0E7RQCE(String str, String str2, ContinuationImpl continuationImpl) {
        LastStopRepositoryImpl$removeLastStopAddress$1 lastStopRepositoryImpl$removeLastStopAddress$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        Object obj = null;
        if (continuationImpl instanceof LastStopRepositoryImpl$removeLastStopAddress$1) {
            int i2 = serializer + 43;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = ((LastStopRepositoryImpl$removeLastStopAddress$1) continuationImpl).write;
                obj.hashCode();
                throw null;
            }
            lastStopRepositoryImpl$removeLastStopAddress$1 = (LastStopRepositoryImpl$removeLastStopAddress$1) continuationImpl;
            int i4 = lastStopRepositoryImpl$removeLastStopAddress$1.write;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IconCompatParcelizer + 99;
                serializer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    lastStopRepositoryImpl$removeLastStopAddress$1.write = i4 >> Integer.MIN_VALUE;
                } else {
                    lastStopRepositoryImpl$removeLastStopAddress$1.write = i4 - Integer.MIN_VALUE;
                }
            } else {
                lastStopRepositoryImpl$removeLastStopAddress$1 = new LastStopRepositoryImpl$removeLastStopAddress$1(this, continuationImpl);
            }
        } else {
            lastStopRepositoryImpl$removeLastStopAddress$1 = new LastStopRepositoryImpl$removeLastStopAddress$1(this, continuationImpl);
        }
        Object obj2 = lastStopRepositoryImpl$removeLastStopAddress$1.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = lastStopRepositoryImpl$removeLastStopAddress$1.write;
        if (i6 != 0) {
            int i7 = serializer + 93;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            if (i6 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            objM4875invokegIAlus = ((onItemDismiss) obj2).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            TooltipStateImpl.AnonymousClass2 anonymousClass2 = new TooltipStateImpl.AnonymousClass2(this, str, str2, null, 12);
            lastStopRepositoryImpl$removeLastStopAddress$1.write = 1;
            objM4875invokegIAlus = this.write.m4875invokegIAlus(anonymousClass2, lastStopRepositoryImpl$removeLastStopAddress$1);
            if (objM4875invokegIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        return thSerializer == null ? (createFromParcel) objM4875invokegIAlus : new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: saveLastStopAddress-yxL6bBk, reason: not valid java name */
    public final Object m4904saveLastStopAddressyxL6bBk(String str, onActivityPreCreated onactivityprecreated, String str2, String str3, ContinuationImpl continuationImpl) {
        LastStopRepositoryImpl$saveLastStopAddress$1 lastStopRepositoryImpl$saveLastStopAddress$1;
        Object objM4875invokegIAlus;
        int i = 2 % 2;
        if (!(continuationImpl instanceof LastStopRepositoryImpl$saveLastStopAddress$1)) {
            lastStopRepositoryImpl$saveLastStopAddress$1 = new LastStopRepositoryImpl$saveLastStopAddress$1(this, continuationImpl);
            int i2 = serializer + 17;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            lastStopRepositoryImpl$saveLastStopAddress$1 = (LastStopRepositoryImpl$saveLastStopAddress$1) continuationImpl;
            int i4 = lastStopRepositoryImpl$saveLastStopAddress$1.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lastStopRepositoryImpl$saveLastStopAddress$1.serializer = i4 - Integer.MIN_VALUE;
            } else {
                lastStopRepositoryImpl$saveLastStopAddress$1 = new LastStopRepositoryImpl$saveLastStopAddress$1(this, continuationImpl);
                int i5 = serializer + 17;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        }
        LastStopRepositoryImpl$saveLastStopAddress$1 lastStopRepositoryImpl$saveLastStopAddress$2 = lastStopRepositoryImpl$saveLastStopAddress$1;
        Object obj = lastStopRepositoryImpl$saveLastStopAddress$2.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = lastStopRepositoryImpl$saveLastStopAddress$2.serializer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            TwoFaViewModel$onPinChanged$1 twoFaViewModel$onPinChanged$1 = new TwoFaViewModel$onPinChanged$1(this, str, onactivityprecreated, str2, str3, (ShortNewsContentCardView) null);
            lastStopRepositoryImpl$saveLastStopAddress$2.serializer = 1;
            objM4875invokegIAlus = this.write.m4875invokegIAlus(twoFaViewModel$onPinChanged$1, lastStopRepositoryImpl$saveLastStopAddress$2);
            if (objM4875invokegIAlus == coroutineSingletons) {
                int i8 = serializer + 31;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4875invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            int i10 = serializer + 19;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4875invokegIAlus);
        if (thSerializer == null) {
            return (createFromParcel) objM4875invokegIAlus;
        }
        isItemDismissable isitemdismissable = new isItemDismissable(Path$Companion.IconCompatParcelizer(thSerializer));
        int i12 = serializer + 95;
        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return isitemdismissable;
    }
}
