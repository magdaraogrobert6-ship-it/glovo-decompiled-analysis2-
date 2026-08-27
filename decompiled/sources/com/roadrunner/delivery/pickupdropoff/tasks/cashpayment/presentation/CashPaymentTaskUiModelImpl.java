package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.delivery.pickupdropoff.tasks.analytics.DeliveryConfirmationLoggerImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.GetDeliveryAnalyticsUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.ObserveTaskByTypeAndIdUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.domain.UpdateTaskUseCaseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.QrCodeScanTaskUiModelImpl$1;
import com.roadrunner.rider.state.legacy.UpdateStateUseCaseImpl;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import o.AnimationSearch;
import o.PreviewLogger;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.displayInAppMessagelambda1;
import o.fastFilterNotNull;
import o.getChildTransition;
import o.getChildTransitionannotations;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getPositionannotations;
import o.getQueryContext;
import o.getTransition;
import o.isItemDismissable;
import o.minHeightOffsets;
import o.onItemDismiss;
import o.openSessionlambda1;
import o.parseAnimatedVisibility;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdajJWxDf1P0Wnidmmx2M4QJ1sjopM;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class CashPaymentTaskUiModelImpl implements minHeightOffsets {
    private static int ResultReceiver = 1;
    private static int r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final UpdateTaskUseCaseImpl ComponentActivity;
    public final MutableStateFlow IconCompatParcelizer;
    public final DeliveryConfirmationLoggerImpl MediaBrowserCompatMediaItem;
    public final parseAnimatedVisibility MediaDescriptionCompat;
    public final fastFilterNotNull MediaMetadataCompat;
    public final String MediaSessionCompatQueueItem;
    public final GetDeliveryAnalyticsUseCaseImpl MediaSessionCompatResultReceiverWrapper;
    public final StateFlow MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final UpdateStateUseCaseImpl PlaybackStateCompat;
    public final getTransition PlaybackStateCompatCustomAction;
    public final long RatingCompat;
    public final openSessionlambda1 RemoteActionCompatParcelizer;
    public final getQueryContext read;
    public final ContextScope serializer;
    public getPositionannotations write;

    /* JADX INFO: renamed from: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        private static int IconCompatParcelizer = 1;
        private static int write;
        public final /* synthetic */ CashPaymentTaskUiModelImpl RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public int serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
            super(2, shortNewsContentCardView);
            this.read = i;
            this.RemoteActionCompatParcelizer = cashPaymentTaskUiModelImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.read;
            CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = this.RemoteActionCompatParcelizer;
            if (i3 == 0) {
                return new AnonymousClass2(cashPaymentTaskUiModelImpl, shortNewsContentCardView, 0);
            }
            int i4 = 1;
            if (i3 == 1) {
                return new AnonymousClass2(cashPaymentTaskUiModelImpl, shortNewsContentCardView, i4);
            }
            if (i3 == 2) {
                return new AnonymousClass2(cashPaymentTaskUiModelImpl, shortNewsContentCardView, i);
            }
            int i5 = 3;
            if (i3 != 3) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(cashPaymentTaskUiModelImpl, shortNewsContentCardView, 4);
                int i6 = IconCompatParcelizer + 47;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return anonymousClass2;
                }
                throw null;
            }
            AnonymousClass2 anonymousClass3 = new AnonymousClass2(cashPaymentTaskUiModelImpl, shortNewsContentCardView, i5);
            int i7 = IconCompatParcelizer + 83;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                return anonymousClass3;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0060 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x0061  */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
        
            if (r1 != 3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            return ((com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2) create(r7, r8)).invokeSuspend(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            return ((com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2) create(r7, r8)).invokeSuspend(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
        
            if (r1 != 3) goto L15;
         */
        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2.IconCompatParcelizer
                int r1 = r1 + 49
                int r2 = r1 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2.write = r2
                int r1 = r1 % r0
                r2 = 3
                r3 = 1
                if (r1 == 0) goto L25
                int r1 = r6.read
                o.createFromParcel r4 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
                o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
                r5 = 98
                int r5 = r5 / 0
                if (r1 == 0) goto L71
                if (r1 == r3) goto L66
                if (r1 == r0) goto L4b
                if (r1 == r2) goto L40
                goto L35
            L25:
                int r1 = r6.read
                o.createFromParcel r4 = o.createFromParcel.INSTANCE
                o.getContentViewGroupParentLayout r7 = (o.getContentViewGroupParentLayout) r7
                o.ShortNewsContentCardView r8 = (o.ShortNewsContentCardView) r8
                if (r1 == 0) goto L71
                if (r1 == r3) goto L66
                if (r1 == r0) goto L4b
                if (r1 == r2) goto L40
            L35:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl$2 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                return r7
            L40:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl$2 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                return r7
            L4b:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl$2 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                int r8 = com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2.write
                int r8 = r8 + 103
                int r1 = r8 % 128
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2.IconCompatParcelizer = r1
                int r8 = r8 % r0
                if (r8 == 0) goto L61
                return r7
            L61:
                r7 = 0
                r7.hashCode()
                throw r7
            L66:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl$2 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                return r7
            L71:
                o.ShortNewsContentCardView r7 = r6.create(r7, r8)
                com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl$2 r7 = (com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2) r7
                java.lang.Object r7 = r7.invokeSuspend(r4)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.CashPaymentTaskUiModelImpl.AnonymousClass2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v0, types: [o.ShortNewsContentCardView] */
        /* JADX WARN: Type inference failed for: r7v14 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            getChildTransitionannotations getchildtransitionannotations;
            getChildTransitionannotations getchildtransitionannotations2;
            int i = 2;
            int i2 = 2 % 2;
            int i3 = this.read;
            CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl = this.RemoteActionCompatParcelizer;
            Object obj2 = createFromParcel.INSTANCE;
            getChildTransitionannotations getchildtransitionannotations3 = 0;
            getChildTransitionannotations getchildtransitionannotations4 = null;
            String str = null;
            if (i3 == 0) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.serializer;
                if (i4 != 0) {
                    int i5 = write + 9;
                    IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        obj2 = null;
                    } else {
                        ExtrasKt.RemoteActionCompatParcelizer(obj);
                    }
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    this.serializer = 1;
                    if (CashPaymentTaskUiModelImpl.access$loadAnalytics(cashPaymentTaskUiModelImpl, this) == coroutineSingletons) {
                        int i6 = IconCompatParcelizer + 95;
                        write = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
                        obj2 = coroutineSingletons;
                    }
                }
                int i8 = write + 5;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 26 / 0;
                }
                return obj2;
            }
            if (i3 == 1) {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.serializer;
                if (i10 != 0) {
                    int i11 = write + 1;
                    IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (i10 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    objFirst = obj;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    Flow flowWrite = TuplesKt.write(UpdateStateUseCaseImpl.write(cashPaymentTaskUiModelImpl.PlaybackStateCompat));
                    SignInDataStore$clear$2 signInDataStore$clear$2 = new SignInDataStore$clear$2(i, 8, getchildtransitionannotations3);
                    this.serializer = 1;
                    objFirst = FlowKt.first(flowWrite, signInDataStore$clear$2, this);
                    if (objFirst == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                getOptimizationLevel getoptimizationlevel = (getOptimizationLevel) objFirst;
                if (!(getoptimizationlevel instanceof getMaxWidth)) {
                    return obj2;
                }
                cashPaymentTaskUiModelImpl.read.serializer(new getChildTransition(((getMaxWidth) getoptimizationlevel).write()));
                return obj2;
            }
            if (i3 == 2) {
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.serializer;
                if (i13 != 0) {
                    int i14 = IconCompatParcelizer + 85;
                    write = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0 ? i13 != 1 : i13 != 0) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj3 = cashPaymentTaskUiModelImpl.MediaSessionCompatToken.read();
                if (!(!(obj3 instanceof getChildTransitionannotations))) {
                    getchildtransitionannotations = (getChildTransitionannotations) obj3;
                }
                if (getchildtransitionannotations3 == 0) {
                    getchildtransitionannotations3 = getchildtransitionannotations;
                    return obj2;
                }
                CashPaymentTaskUiItem cashPaymentTaskUiItem = getchildtransitionannotations3.serializer;
                CashPaymentTaskUiItem.UiMode uiMode = CashPaymentTaskUiItem.UiMode.ViewPayment;
                Double d = cashPaymentTaskUiItem.selectedAmount;
                CashPaymentTaskUiItem cashPaymentTaskUiItemRemoteActionCompatParcelizer = CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem, null, d, null, cashPaymentTaskUiItem.selectedReason, null, CashPaymentTaskUiModelImpl.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl, d), null, uiMode, null, 32878591);
                this.serializer = 1;
                if (CashPaymentTaskUiModelImpl.access$runTaskUpdateUseCase(cashPaymentTaskUiModelImpl, cashPaymentTaskUiItemRemoteActionCompatParcelizer, this) == coroutineSingletons3) {
                    getchildtransitionannotations3 = getchildtransitionannotations;
                    return coroutineSingletons3;
                }
                getchildtransitionannotations3 = getchildtransitionannotations;
                return obj2;
            }
            if (i3 != 3) {
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.serializer;
                if (i15 != 0) {
                    if (i15 != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i16 = IconCompatParcelizer + 63;
                    write = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj4 = cashPaymentTaskUiModelImpl.MediaSessionCompatToken.read();
                if (obj4 instanceof getChildTransitionannotations) {
                    getchildtransitionannotations4 = (getChildTransitionannotations) obj4;
                    int i18 = write + 97;
                    IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                    int i19 = i18 % 2;
                }
                if (getchildtransitionannotations4 == null) {
                    return obj2;
                }
                CashPaymentTaskUiItem cashPaymentTaskUiItem2 = getchildtransitionannotations4.serializer;
                cashPaymentTaskUiModelImpl.MediaBrowserCompatMediaItem.serializer(cashPaymentTaskUiModelImpl.write, cashPaymentTaskUiItem2.taskId);
                CashPaymentTaskUiItem cashPaymentTaskUiItemRemoteActionCompatParcelizer2 = CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem2, null, null, null, null, null, null, null, CashPaymentTaskUiItem.UiMode.EditPayment, null, 33030143);
                this.serializer = 1;
                return CashPaymentTaskUiModelImpl.access$runTaskUpdateUseCase(cashPaymentTaskUiModelImpl, cashPaymentTaskUiItemRemoteActionCompatParcelizer2, this) == coroutineSingletons4 ? coroutineSingletons4 : obj2;
            }
            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i20 = this.serializer;
            if (i20 != 0) {
                if (i20 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj2;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            Object obj5 = cashPaymentTaskUiModelImpl.MediaSessionCompatToken.read();
            if (obj5 instanceof getChildTransitionannotations) {
                int i21 = IconCompatParcelizer + 99;
                write = i21 % Fields.SpotShadowColor;
                if (i21 % 2 != 0) {
                    getchildtransitionannotations2 = (getChildTransitionannotations) obj5;
                    int i22 = 9 / 0;
                } else {
                    getchildtransitionannotations2 = (getChildTransitionannotations) obj5;
                }
            } else {
                getchildtransitionannotations2 = null;
            }
            if (getchildtransitionannotations2 == null) {
                return obj2;
            }
            CashPaymentTaskUiItem cashPaymentTaskUiItem3 = getchildtransitionannotations2.serializer;
            cashPaymentTaskUiModelImpl.MediaBrowserCompatMediaItem.read(cashPaymentTaskUiModelImpl.write, cashPaymentTaskUiItem3.taskId);
            CashPaymentTaskUiItem.UiMode uiMode2 = CashPaymentTaskUiItem.UiMode.ViewPayment;
            Double d2 = cashPaymentTaskUiItem3.editedAmount;
            CashPaymentTaskUiItem.ReasonItem reasonItem = cashPaymentTaskUiItem3.editedReason;
            String strRemoteActionCompatParcelizer = CashPaymentTaskUiModelImpl.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl, d2);
            String strRemoteActionCompatParcelizer2 = CashPaymentTaskUiModelImpl.RemoteActionCompatParcelizer(cashPaymentTaskUiModelImpl, cashPaymentTaskUiItem3.editedAmount);
            CashPaymentTaskUiItem.Reasons reasons = cashPaymentTaskUiItem3.reasons;
            if (reasons != null) {
                int i23 = IconCompatParcelizer + 21;
                write = i23 % Fields.SpotShadowColor;
                int i24 = i23 % 2;
                str = reasons.editedReasonPrefix;
            }
            if (str == null) {
                str = "";
            }
            CashPaymentTaskUiItem cashPaymentTaskUiItemRemoteActionCompatParcelizer3 = CashPaymentTaskUiItem.RemoteActionCompatParcelizer(cashPaymentTaskUiItem3, d2, null, reasonItem, null, strRemoteActionCompatParcelizer, strRemoteActionCompatParcelizer2, null, uiMode2, str.concat(cashPaymentTaskUiItem3.MediaBrowserCompatMediaItem()), 28628991);
            this.serializer = 1;
            return CashPaymentTaskUiModelImpl.access$runTaskUpdateUseCase(cashPaymentTaskUiModelImpl, cashPaymentTaskUiItemRemoteActionCompatParcelizer3, this) == coroutineSingletons5 ? coroutineSingletons5 : obj2;
        }
    }

    @Override // o.minHeightOffsets
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 113;
        int i3 = i2 % Fields.SpotShadowColor;
        ResultReceiver = i3;
        int i4 = i2 % 2;
        String str = this.ParcelableVolumeInfo;
        int i5 = i3 + 119;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CashPaymentTaskUiModelImpl(fastFilterNotNull fastfilternotnull, ContextScope contextScope, String str, ObserveTaskByTypeAndIdUseCaseImpl observeTaskByTypeAndIdUseCaseImpl, UpdateTaskUseCaseImpl updateTaskUseCaseImpl, UpdateStateUseCaseImpl updateStateUseCaseImpl, openSessionlambda1 opensessionlambda1, DeliveryConfirmationLoggerImpl deliveryConfirmationLoggerImpl, parseAnimatedVisibility parseanimatedvisibility, GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl, getTransition gettransition, getQueryContext getquerycontext) {
        str.getClass();
        observeTaskByTypeAndIdUseCaseImpl.getClass();
        updateTaskUseCaseImpl.getClass();
        updateStateUseCaseImpl.getClass();
        opensessionlambda1.getClass();
        deliveryConfirmationLoggerImpl.getClass();
        parseanimatedvisibility.getClass();
        getDeliveryAnalyticsUseCaseImpl.getClass();
        gettransition.getClass();
        getquerycontext.getClass();
        this.MediaMetadataCompat = fastfilternotnull;
        this.serializer = contextScope;
        this.ParcelableVolumeInfo = str;
        this.ComponentActivity = updateTaskUseCaseImpl;
        this.PlaybackStateCompat = updateStateUseCaseImpl;
        this.RemoteActionCompatParcelizer = opensessionlambda1;
        this.MediaBrowserCompatMediaItem = deliveryConfirmationLoggerImpl;
        this.MediaDescriptionCompat = parseanimatedvisibility;
        this.MediaSessionCompatResultReceiverWrapper = getDeliveryAnalyticsUseCaseImpl;
        this.PlaybackStateCompatCustomAction = gettransition;
        this.read = getquerycontext;
        this.RatingCompat = fastfilternotnull.deliveryId;
        this.MediaSessionCompatQueueItem = fastfilternotnull.action;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(AnimationSearch.serializer);
        this.IconCompatParcelizer = mutableStateFlow;
        this.MediaSessionCompatToken = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new QrCodeScanTaskUiModelImpl$1(observeTaskByTypeAndIdUseCaseImpl, this, shortNewsContentCardView, 4), 3);
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new AnonymousClass2(this, shortNewsContentCardView, 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public static final String RemoteActionCompatParcelizer(CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl, Double d) {
        String strSerializer;
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 121;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = 43 / 0;
            if (d != null) {
                strSerializer = cashPaymentTaskUiModelImpl.RemoteActionCompatParcelizer.serializer(d.doubleValue(), "", true);
            } else {
                cashPaymentTaskUiModelImpl.getClass();
                strSerializer = null;
            }
        } else if (d != null) {
            strSerializer = cashPaymentTaskUiModelImpl.RemoteActionCompatParcelizer.serializer(d.doubleValue(), "", true);
        } else {
            cashPaymentTaskUiModelImpl.getClass();
            strSerializer = null;
        }
        if (strSerializer != null) {
            return strSerializer;
        }
        int i4 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 97;
        ResultReceiver = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return "";
        }
        obj.hashCode();
        throw null;
    }

    public static final Object access$runTaskUpdateUseCase(CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl, CashPaymentTaskUiItem cashPaymentTaskUiItem, SuspendLambda suspendLambda) {
        int i = 2 % 2;
        int i2 = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY + 29;
        ResultReceiver = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            cashPaymentTaskUiModelImpl.ComponentActivity.invoke(cashPaymentTaskUiModelImpl.RatingCompat, cashPaymentTaskUiModelImpl.MediaSessionCompatQueueItem, cashPaymentTaskUiItem, displayInAppMessagelambda1.serializer(CashPaymentTaskUiItem.class), suspendLambda);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objInvoke = cashPaymentTaskUiModelImpl.ComponentActivity.invoke(cashPaymentTaskUiModelImpl.RatingCompat, cashPaymentTaskUiModelImpl.MediaSessionCompatQueueItem, cashPaymentTaskUiItem, displayInAppMessagelambda1.serializer(CashPaymentTaskUiItem.class), suspendLambda);
        if (objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i3 = ResultReceiver + 83;
            r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 51 / 0;
            }
            return objInvoke;
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = ResultReceiver + 35;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0028  */
    public static final Object access$loadAnalytics(CashPaymentTaskUiModelImpl cashPaymentTaskUiModelImpl, ContinuationImpl continuationImpl) {
        r8lambdajJWxDf1P0Wnidmmx2M4QJ1sjopM r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm;
        Object objM4939invoke0E7RQCE;
        int i = 2 % 2;
        int i2 = ResultReceiver + 99;
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof r8lambdajJWxDf1P0Wnidmmx2M4QJ1sjopM) {
            r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm = (r8lambdajJWxDf1P0Wnidmmx2M4QJ1sjopM) continuationImpl;
            int i4 = r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                int i5 = ResultReceiver + 107;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm = new r8lambdajJWxDf1P0Wnidmmx2M4QJ1sjopM(cashPaymentTaskUiModelImpl, continuationImpl);
            }
        } else {
            r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm = new r8lambdajJWxDf1P0Wnidmmx2M4QJ1sjopM(cashPaymentTaskUiModelImpl, continuationImpl);
        }
        Object obj = r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm.IconCompatParcelizer;
        if (i7 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetDeliveryAnalyticsUseCaseImpl getDeliveryAnalyticsUseCaseImpl = cashPaymentTaskUiModelImpl.MediaSessionCompatResultReceiverWrapper;
            long j = cashPaymentTaskUiModelImpl.RatingCompat;
            String str = cashPaymentTaskUiModelImpl.MediaSessionCompatQueueItem;
            r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm.IconCompatParcelizer = 1;
            objM4939invoke0E7RQCE = getDeliveryAnalyticsUseCaseImpl.m4939invoke0E7RQCE(j, str, r8lambdajjwxdf1p0wnidmmx2m4qj1sjopm);
            if (objM4939invoke0E7RQCE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4939invoke0E7RQCE = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        if (!(objM4939invoke0E7RQCE instanceof isItemDismissable)) {
            getPositionannotations getpositionannotations = ((PreviewLogger) objM4939invoke0E7RQCE).serializer;
            cashPaymentTaskUiModelImpl.write = getpositionannotations;
            if (getpositionannotations == null) {
                int i8 = ResultReceiver + 93;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                Timber.RemoteActionCompatParcelizer.IconCompatParcelizer("CashPaymentTaskUiModelImpl: Analytics bundle is null in tasks response!", new Object[0]);
                int i10 = ResultReceiver + 69;
                r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            }
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4939invoke0E7RQCE);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(thSerializer, "CashPaymentTaskUiModelImpl: Analytics failed to load.", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }
}
