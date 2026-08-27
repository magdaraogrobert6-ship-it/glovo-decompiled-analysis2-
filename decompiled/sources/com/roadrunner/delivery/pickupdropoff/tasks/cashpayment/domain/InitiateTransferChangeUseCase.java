package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.ff$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.google.android.gms.internal.mlkit_vision_face.zzng;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.CancelDeliveryUseCase$invoke$1;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.ExecuteComponentApiCallUseCase$invoke$1;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.NotifyUtccTimerStartedUseCase$invoke$1;
import com.roadrunner.home.nest.NestFragment$onCreateView$1$1$1$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.YieldKt;
import o.AnimationSearchAnimatedVisibilitySearch;
import o.AnimationSearchSearch;
import o.InfiniteTransitionComposeAnimationCompanion;
import o.PreviewAnimationClock;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.isItemDismissable;
import o.onItemDismiss;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCarryoverInAppMessage;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class InitiateTransferChangeUseCase {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final ConfirmationRepository serializer;

    public InitiateTransferChangeUseCase(ConfirmationRepository confirmationRepository, int i) {
        this.RemoteActionCompatParcelizer = i;
        if (i == 1) {
            confirmationRepository.getClass();
            this.serializer = confirmationRepository;
            return;
        }
        if (i == 2) {
            confirmationRepository.getClass();
            this.serializer = confirmationRepository;
        } else if (i == 3) {
            confirmationRepository.getClass();
            this.serializer = confirmationRepository;
        } else if (i != 4) {
            confirmationRepository.getClass();
            this.serializer = confirmationRepository;
        } else {
            confirmationRepository.getClass();
            this.serializer = confirmationRepository;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034  */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    public Object m4930invokegIAlus(AnimationSearchSearch animationSearchSearch, ContinuationImpl continuationImpl) {
        CancelDeliveryUseCase$invoke$1 cancelDeliveryUseCase$invoke$1;
        NotifyUtccTimerStartedUseCase$invoke$1 notifyUtccTimerStartedUseCase$invoke$1;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 27;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this.RemoteActionCompatParcelizer != 1) {
            if (continuationImpl instanceof NotifyUtccTimerStartedUseCase$invoke$1) {
                int i5 = i2 + 37;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                notifyUtccTimerStartedUseCase$invoke$1 = (NotifyUtccTimerStartedUseCase$invoke$1) continuationImpl;
                int i7 = notifyUtccTimerStartedUseCase$invoke$1.read;
                if ((i7 & Integer.MIN_VALUE) != 0) {
                    notifyUtccTimerStartedUseCase$invoke$1.read = i7 - Integer.MIN_VALUE;
                } else {
                    notifyUtccTimerStartedUseCase$invoke$1 = new NotifyUtccTimerStartedUseCase$invoke$1(this, continuationImpl);
                }
            } else {
                notifyUtccTimerStartedUseCase$invoke$1 = new NotifyUtccTimerStartedUseCase$invoke$1(this, continuationImpl);
            }
            Object obj = notifyUtccTimerStartedUseCase$invoke$1.serializer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = notifyUtccTimerStartedUseCase$invoke$1.read;
            if (i8 != 0) {
                if (i8 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i9 = write + 17;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return ((onItemDismiss) obj).IconCompatParcelizer;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                int i10 = 92 / 0;
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$1 = new NestFragment$onCreateView$1$1$1$1(3, this.serializer, ConfirmationRepository.class, "initiatePutApiCall", "initiatePutApiCall-0E7RQCE(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 6);
            notifyUtccTimerStartedUseCase$invoke$1.read = 1;
            Object objValidateAndExecuteApiCall = zzng.validateAndExecuteApiCall(animationSearchSearch, nestFragment$onCreateView$1$1$1$1, "Timer Started data is invalid. params:", notifyUtccTimerStartedUseCase$invoke$1);
            if (objValidateAndExecuteApiCall != coroutineSingletons) {
                return objValidateAndExecuteApiCall;
            }
            int i11 = write + 125;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            return coroutineSingletons;
        }
        if (!(continuationImpl instanceof CancelDeliveryUseCase$invoke$1)) {
            cancelDeliveryUseCase$invoke$1 = new CancelDeliveryUseCase$invoke$1(this, continuationImpl);
        } else {
            int i13 = i2 + 69;
            write = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                int i14 = ((CancelDeliveryUseCase$invoke$1) continuationImpl).IconCompatParcelizer;
                throw null;
            }
            cancelDeliveryUseCase$invoke$1 = (CancelDeliveryUseCase$invoke$1) continuationImpl;
            int i15 = cancelDeliveryUseCase$invoke$1.IconCompatParcelizer;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                cancelDeliveryUseCase$invoke$1.IconCompatParcelizer = i15 - Integer.MIN_VALUE;
            } else {
                cancelDeliveryUseCase$invoke$1 = new CancelDeliveryUseCase$invoke$1(this, continuationImpl);
            }
        }
        Object obj2 = cancelDeliveryUseCase$invoke$1.read;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i16 = cancelDeliveryUseCase$invoke$1.IconCompatParcelizer;
        if (i16 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj2);
            NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$2 = new NestFragment$onCreateView$1$1$1$1(3, this.serializer, ConfirmationRepository.class, "initiatePutApiCall", "initiatePutApiCall-0E7RQCE(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2);
            cancelDeliveryUseCase$invoke$1.IconCompatParcelizer = 1;
            Object objValidateAndExecuteApiCall2 = zzng.validateAndExecuteApiCall(animationSearchSearch, nestFragment$onCreateView$1$1$1$2, "Cancel Order data is invalid. params:", cancelDeliveryUseCase$invoke$1);
            if (objValidateAndExecuteApiCall2 != coroutineSingletons2) {
                return objValidateAndExecuteApiCall2;
            }
            int i17 = write + 81;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                return coroutineSingletons2;
            }
            throw null;
        }
        int i18 = write + 89;
        IconCompatParcelizer = i18 % Fields.SpotShadowColor;
        if (i18 % 2 == 0 ? i16 != 1 : i16 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj2);
        Object obj3 = ((onItemDismiss) obj2).IconCompatParcelizer;
        int i19 = write + 13;
        IconCompatParcelizer = i19 % Fields.SpotShadowColor;
        int i20 = i19 % 2;
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002e  */
    public Object invoke(List list, ContinuationImpl continuationImpl) {
        PreviewAnimationClock previewAnimationClock;
        List list2 = list;
        int i = 2 % 2;
        int i2 = write + 87;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof PreviewAnimationClock) {
            previewAnimationClock = (PreviewAnimationClock) continuationImpl;
            int i4 = previewAnimationClock.RemoteActionCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = IconCompatParcelizer + 51;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                previewAnimationClock.RemoteActionCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                previewAnimationClock = new PreviewAnimationClock(this, continuationImpl);
            }
        } else {
            previewAnimationClock = new PreviewAnimationClock(this, continuationImpl);
        }
        Object objCoroutineScope = previewAnimationClock.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = previewAnimationClock.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i7 != 0) {
            int i8 = IconCompatParcelizer + 119;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = previewAnimationClock.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(objCoroutineScope);
            NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$1 = new NestFragment$onCreateView$1$1$1$1(3, this.serializer, ConfirmationRepository.class, "initiatePostApiCall", "initiatePostApiCall-0E7RQCE(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 5);
            previewAnimationClock.IconCompatParcelizer = list2;
            previewAnimationClock.RemoteActionCompatParcelizer = 1;
            objCoroutineScope = YieldKt.coroutineScope(new PerseusLogger$w$1(list2, nestFragment$onCreateView$1$1$1$1, shortNewsContentCardView, 28), previewAnimationClock);
            if (objCoroutineScope == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list3 = (List) objCoroutineScope;
        List list4 = list3;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
        int i10 = 0;
        for (Object obj : list4) {
            if (i10 < 0) {
                SQLite.serializer();
                throw null;
            }
            Object obj2 = ((onItemDismiss) obj).IconCompatParcelizer;
            Throwable thSerializer = onItemDismiss.serializer(obj2);
            if (thSerializer != null) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "IVR API call #" + i10 + " failed (url=" + ((AnimationSearchSearch) list2.get(i10)).read + ")", new Object[0]);
            }
            arrayList.add(new onItemDismiss(obj2));
            i10++;
        }
        return list3;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX INFO: renamed from: invoke-0E7RQCE, reason: not valid java name */
    public Object m4929invoke0E7RQCE(String str, AnimationSearchSearch animationSearchSearch, ContinuationImpl continuationImpl) {
        ExecuteComponentApiCallUseCase$invoke$1 executeComponentApiCallUseCase$invoke$1;
        Object next;
        NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$1;
        Object objValidateAndExecuteApiCall;
        String str2 = str;
        AnimationSearchSearch animationSearchSearch2 = animationSearchSearch;
        int i = 2 % 2;
        if (continuationImpl instanceof ExecuteComponentApiCallUseCase$invoke$1) {
            int i2 = IconCompatParcelizer + 1;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            executeComponentApiCallUseCase$invoke$1 = (ExecuteComponentApiCallUseCase$invoke$1) continuationImpl;
            int i4 = executeComponentApiCallUseCase$invoke$1.serializer;
            if ((i4 & Integer.MIN_VALUE) == 0) {
                executeComponentApiCallUseCase$invoke$1 = new ExecuteComponentApiCallUseCase$invoke$1(this, continuationImpl);
            } else {
                int i5 = IconCompatParcelizer + 1;
                write = i5 % Fields.SpotShadowColor;
                executeComponentApiCallUseCase$invoke$1.serializer = i5 % 2 == 0 ? i4 / Integer.MIN_VALUE : i4 - Integer.MIN_VALUE;
            }
        } else {
            executeComponentApiCallUseCase$invoke$1 = new ExecuteComponentApiCallUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = executeComponentApiCallUseCase$invoke$1.IconCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = executeComponentApiCallUseCase$invoke$1.serializer;
        if (i6 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AnimationSearchAnimatedVisibilitySearch.Companion.getClass();
            str.getClass();
            Iterator<E> it = AnimationSearchAnimatedVisibilitySearch.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!setCarryoverInAppMessage.serializer(((AnimationSearchAnimatedVisibilitySearch) next).name(), str2, true));
            AnimationSearchAnimatedVisibilitySearch animationSearchAnimatedVisibilitySearch = (AnimationSearchAnimatedVisibilitySearch) next;
            int i7 = animationSearchAnimatedVisibilitySearch == null ? -1 : InfiniteTransitionComposeAnimationCompanion.write[animationSearchAnimatedVisibilitySearch.ordinal()];
            if (i7 == -1) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported api call method: ".concat(str2));
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(illegalArgumentException, ff$$ExternalSyntheticOutline0.m("ExecuteComponentApiCallUseCase: Component api call rejected (url=", animationSearchSearch2.read, ")"), new Object[0]);
                return new isItemDismissable(illegalArgumentException);
            }
            int i8 = IconCompatParcelizer + 23;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0 ? i7 == 1 : i7 == 0) {
                nestFragment$onCreateView$1$1$1$1 = new NestFragment$onCreateView$1$1$1$1(3, this.serializer, ConfirmationRepository.class, "initiatePostApiCall", "initiatePostApiCall-0E7RQCE(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3);
            } else if (i7 == 2) {
                nestFragment$onCreateView$1$1$1$1 = new NestFragment$onCreateView$1$1$1$1(3, this.serializer, ConfirmationRepository.class, "initiatePutApiCall", "initiatePutApiCall-0E7RQCE(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4);
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            executeComponentApiCallUseCase$invoke$1.RemoteActionCompatParcelizer = str2;
            executeComponentApiCallUseCase$invoke$1.read = animationSearchSearch2;
            executeComponentApiCallUseCase$invoke$1.serializer = 1;
            objValidateAndExecuteApiCall = zzng.validateAndExecuteApiCall(animationSearchSearch2, nestFragment$onCreateView$1$1$1$1, "Component api call data is invalid. params:", executeComponentApiCallUseCase$invoke$1);
            if (objValidateAndExecuteApiCall == coroutineSingletons) {
                int i9 = IconCompatParcelizer + 21;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                return coroutineSingletons;
            }
        } else {
            int i11 = IconCompatParcelizer + 83;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (i6 == 1) {
                AnimationSearchSearch animationSearchSearch3 = executeComponentApiCallUseCase$invoke$1.read;
                String str3 = executeComponentApiCallUseCase$invoke$1.RemoteActionCompatParcelizer;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objValidateAndExecuteApiCall = ((onItemDismiss) obj).IconCompatParcelizer;
                animationSearchSearch2 = animationSearchSearch3;
                str2 = str3;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objValidateAndExecuteApiCall);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("ExecuteComponentApiCallUseCase: Component api call failed (method=", str2, ", url=", animationSearchSearch2.read, ")"), new Object[0]);
        }
        return objValidateAndExecuteApiCall;
    }
}
