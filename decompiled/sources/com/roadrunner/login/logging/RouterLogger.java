package com.roadrunner.login.logging;

import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.graphics.Fields;
import androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2;
import bo.app.af$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.main.presentation.MainActivity;
import com.logistics.rider.glovo.R;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.delivery.pickupdropoff.domain.ObservePuDoDeliveriesResponseImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain.GetCustomerUnavailableArgsUseCase$invoke$1;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.navigator.CustomerUnavailableArgs;
import com.roadrunner.feedback.FeedbackNavigatorImpl$getFeedbackEntity$1;
import com.roadrunner.feedback.data.domain.GetFeedbackDataUseCase;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.helpcenter.data.unread_message_count.repo.UnreadMessageRepository$getUnreadMessageCount$1;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.instant.shifts.data.InstantShiftRepository;
import com.roadrunner.instant.shifts.domain.GetAvailableInstantShiftsUseCase$invoke$1;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import io.grpc.internal.SharedResourcePool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;
import o.AndroidUiFrameClock;
import o.CoordinatorLayoutLayoutParams;
import o.DialogFragment2;
import o.ImageHeaderParserImageType;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.accessisMainThread;
import o.createFromParcel;
import o.decode;
import o.dispatchKeyShortcutEvent;
import o.displayInAppMessagelambda9;
import o.fastFilterNotNull;
import o.getActionViewIntentlambda0;
import o.getAllowEnterTransitionOverlap;
import o.getExtraDataMapannotations;
import o.getLifecycleRegistryannotations;
import o.getScrollRange;
import o.getTransactionExecutor;
import o.intercept;
import o.isBound;
import o.isInvalid;
import o.isItemDismissable;
import o.isMainThread;
import o.isRemoved;
import o.isUpdated;
import o.makeTreedefault;
import o.notifyListeners;
import o.onContentCardDismissed;
import o.onEnteredHiddenState;
import o.onItemDismiss;
import o.onLeftHiddenState;
import o.postAnimationRunner;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA;
import o.r8lambda_xjKNsnSVqrQpdhsT42da52uGY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY;
import o.runInTransaction;
import o.setSyncPolicyOfflineStatuslambda1;
import o.setTransactionSuccessful;
import o.setUseTempTrackingTableroom_runtime;
import o.shouldSkipDump;
import o.subscribeToBannersUpdateslambda2;
import o.transferSessionPackageI;
import o.uiMode;
import okio.Path$Companion;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class RouterLogger {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object read;
    public Object serializer;

    public RouterLogger(InstantShiftRepository instantShiftRepository, AndroidUiFrameClock androidUiFrameClock) {
        this.IconCompatParcelizer = 19;
        instantShiftRepository.getClass();
        androidUiFrameClock.getClass();
        this.read = instantShiftRepository;
        this.serializer = androidUiFrameClock;
    }

    public /* synthetic */ RouterLogger(Object obj, Object obj2, Object obj3, int i) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
    }

    public /* synthetic */ RouterLogger(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.read = obj;
        this.serializer = obj2;
    }

    public RouterLogger(DialogFragment2 dialogFragment2, ExecuteApiRequest executeApiRequest) {
        this.IconCompatParcelizer = 15;
        dialogFragment2.getClass();
        executeApiRequest.getClass();
        this.read = dialogFragment2;
        this.serializer = executeApiRequest;
    }

    public RouterLogger(decode decodeVar, AppEventInfoChangeHandler appEventInfoChangeHandler) {
        this.IconCompatParcelizer = 0;
        decodeVar.getClass();
        appEventInfoChangeHandler.getClass();
        this.read = decodeVar;
        this.serializer = appEventInfoChangeHandler;
    }

    public RouterLogger(intercept interceptVar, getActionViewIntentlambda0 getactionviewintentlambda0) {
        this.IconCompatParcelizer = 26;
        interceptVar.getClass();
        getactionviewintentlambda0.getClass();
        this.read = interceptVar;
        this.serializer = getactionviewintentlambda0;
    }

    public RouterLogger(r8lambdaEKYmoxV_2C6WlKkhZt5ThO0_YA r8lambdaekymoxv_2c6wlkkhzt5tho0_ya, r8lambda_xjKNsnSVqrQpdhsT42da52uGY r8lambda_xjknsnsvqrqpdhst42da52ugy) {
        this.IconCompatParcelizer = 28;
        r8lambdaekymoxv_2c6wlkkhzt5tho0_ya.getClass();
        r8lambda_xjknsnsvqrqpdhst42da52ugy.getClass();
        this.read = r8lambdaekymoxv_2c6wlkkhzt5tho0_ya;
        this.serializer = r8lambda_xjknsnsvqrqpdhst42da52ugy;
    }

    public RouterLogger(ObservePuDoDeliveriesResponseImpl observePuDoDeliveriesResponseImpl, CreateHomeScope createHomeScope) {
        this.IconCompatParcelizer = 3;
        observePuDoDeliveriesResponseImpl.getClass();
        createHomeScope.getClass();
        this.read = observePuDoDeliveriesResponseImpl;
        this.serializer = createHomeScope;
    }

    public RouterLogger(isBound isbound, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2) {
        this.IconCompatParcelizer = 21;
        isbound.getClass();
        subscribetobannersupdateslambda2.getClass();
        this.read = isbound;
        this.serializer = subscribetobannersupdateslambda2;
    }

    public RouterLogger(SharedResourcePool sharedResourcePool) {
        this.IconCompatParcelizer = 24;
        sharedResourcePool.getClass();
        this.read = sharedResourcePool;
    }

    public RouterLogger(transferSessionPackageI transfersessionpackagei, displayInAppMessagelambda9 displayinappmessagelambda9) {
        this.IconCompatParcelizer = 22;
        transfersessionpackagei.getClass();
        this.read = transfersessionpackagei;
        this.serializer = displayinappmessagelambda9;
    }

    public RouterLogger(getScrollRange getscrollrange, getScrollRange getscrollrange2) {
        this.IconCompatParcelizer = 14;
        getscrollrange.getClass();
        this.read = getscrollrange;
        this.serializer = getscrollrange2;
    }

    public RouterLogger(setSyncPolicyOfflineStatuslambda1 setsyncpolicyofflinestatuslambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 12;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = setsyncpolicyofflinestatuslambda1;
        this.serializer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public RouterLogger(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy) {
        this.IconCompatParcelizer = 27;
        setusetemptrackingtableroom_runtime.getClass();
        this.read = setusetemptrackingtableroom_runtime;
        this.serializer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
    }

    public RouterLogger(getTransactionExecutor gettransactionexecutor, isMainThread ismainthread) {
        this.IconCompatParcelizer = 4;
        gettransactionexecutor.getClass();
        ismainthread.getClass();
        this.read = gettransactionexecutor;
        this.serializer = ismainthread;
    }

    public RouterLogger(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, postAnimationRunner postanimationrunner) {
        this.IconCompatParcelizer = 25;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.serializer = postanimationrunner;
    }

    public RouterLogger(ImageHeaderParserImageType imageHeaderParserImageType, accessisMainThread accessismainthread) {
        this.IconCompatParcelizer = 7;
        imageHeaderParserImageType.getClass();
        accessismainthread.getClass();
        this.read = imageHeaderParserImageType;
        this.serializer = accessismainthread;
    }

    public RouterLogger(ImageHeaderParserImageType imageHeaderParserImageType, Path$Companion path$Companion) {
        this.IconCompatParcelizer = 2;
        path$Companion.getClass();
        imageHeaderParserImageType.getClass();
        this.read = path$Companion;
        this.serializer = imageHeaderParserImageType;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: getUnreadMessageCount-gIAlu-s, reason: not valid java name */
    public Object m4989getUnreadMessageCountgIAlus(getAllowEnterTransitionOverlap getallowentertransitionoverlap, ContinuationImpl continuationImpl) {
        UnreadMessageRepository$getUnreadMessageCount$1 unreadMessageRepository$getUnreadMessageCount$1;
        int i = 2;
        int i2 = 2 % 2;
        if (continuationImpl instanceof UnreadMessageRepository$getUnreadMessageCount$1) {
            int i3 = RemoteActionCompatParcelizer + 11;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            unreadMessageRepository$getUnreadMessageCount$1 = (UnreadMessageRepository$getUnreadMessageCount$1) continuationImpl;
            int i5 = unreadMessageRepository$getUnreadMessageCount$1.IconCompatParcelizer;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                unreadMessageRepository$getUnreadMessageCount$1.IconCompatParcelizer = i5 - Integer.MIN_VALUE;
            } else {
                unreadMessageRepository$getUnreadMessageCount$1 = new UnreadMessageRepository$getUnreadMessageCount$1(this, continuationImpl);
            }
        } else {
            unreadMessageRepository$getUnreadMessageCount$1 = new UnreadMessageRepository$getUnreadMessageCount$1(this, continuationImpl);
        }
        Object obj = unreadMessageRepository$getUnreadMessageCount$1.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = unreadMessageRepository$getUnreadMessageCount$1.IconCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i6 != 0) {
            if (i6 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return ((onItemDismiss) obj).IconCompatParcelizer;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        ExecuteApiRequest executeApiRequest = (ExecuteApiRequest) this.serializer;
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$2 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2(this, getallowentertransitionoverlap, shortNewsContentCardView, i);
        unreadMessageRepository$getUnreadMessageCount$1.IconCompatParcelizer = 1;
        Object objM4875invokegIAlus = executeApiRequest.m4875invokegIAlus(dBUtil__DBUtil_androidKt$performInTransactionSuspending$2, unreadMessageRepository$getUnreadMessageCount$1);
        if (objM4875invokegIAlus != coroutineSingletons) {
            return objM4875invokegIAlus;
        }
        int i7 = write + 121;
        int i8 = i7 % Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i8;
        if (i7 % 2 != 0) {
            shortNewsContentCardView.hashCode();
            throw null;
        }
        int i9 = i8 + 125;
        write = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public Object logNoMobileServices(ContinuationImpl continuationImpl) {
        notifyListeners notifylisteners;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (continuationImpl instanceof notifyListeners) {
            notifylisteners = (notifyListeners) continuationImpl;
            int i4 = notifylisteners.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                notifylisteners.serializer = i4 - Integer.MIN_VALUE;
            } else {
                notifylisteners = new notifyListeners(this, continuationImpl);
                int i5 = RemoteActionCompatParcelizer + 119;
                write = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            }
        } else {
            notifylisteners = new notifyListeners(this, continuationImpl);
            int i7 = RemoteActionCompatParcelizer + 119;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
        }
        Object obj = notifylisteners.read;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = notifylisteners.serializer;
        if (i9 != 0) {
            int i10 = write;
            int i11 = i10 + 89;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (i9 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = i10 + 93;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            AppEventInfoChangeHandler appEventInfoChangeHandler = (AppEventInfoChangeHandler) this.serializer;
            notifylisteners.serializer = 1;
            if (appEventInfoChangeHandler.refreshUserInfo(notifylisteners) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ((decode) this.read).logEvent("no_mobile_services", null);
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (r8.refreshUserInfo(r1) == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(o.getTextSelectionRange r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.login.logging.RouterLogger.RemoteActionCompatParcelizer
            int r1 = r1 + 73
            int r2 = r1 % 128
            com.roadrunner.login.logging.RouterLogger.write = r2
            int r1 = r1 % r0
            boolean r1 = r9 instanceof o.SqlDriver
            if (r1 == 0) goto L1f
            r1 = r9
            o.SqlDriver r1 = (o.SqlDriver) r1
            int r2 = r1.read
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1f
            int r2 = r2 + r3
            r1.read = r2
            goto L2d
        L1f:
            o.SqlDriver r1 = new o.SqlDriver
            r1.<init>(r7, r9)
            int r9 = com.roadrunner.login.logging.RouterLogger.RemoteActionCompatParcelizer
            int r9 = r9 + 77
            int r2 = r9 % 128
            com.roadrunner.login.logging.RouterLogger.write = r2
            int r9 = r9 % r0
        L2d:
            java.lang.Object r9 = r1.RemoteActionCompatParcelizer
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.read
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L52
            int r8 = com.roadrunner.login.logging.RouterLogger.write
            int r8 = r8 + 45
            int r6 = r8 % 128
            com.roadrunner.login.logging.RouterLogger.RemoteActionCompatParcelizer = r6
            int r8 = r8 % r0
            if (r3 == r4) goto L4e
            if (r3 != r0) goto L48
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L76
        L48:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            return r5
        L4e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            goto L69
        L52:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r9)
            kotlinx.coroutines.scheduling.DefaultScheduler r9 = o.prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer
            kotlinx.coroutines.scheduling.DefaultIoScheduler r9 = kotlinx.coroutines.scheduling.DefaultIoScheduler.RemoteActionCompatParcelizer
            androidx.datastore.core.SingleProcessDataStore$data$1$1 r3 = new androidx.datastore.core.SingleProcessDataStore$data$1$1
            r6 = 20
            r3.<init>(r7, r8, r5, r6)
            r1.read = r4
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r9, r3, r1)
            if (r8 != r2) goto L69
            goto L75
        L69:
            java.lang.Object r8 = r7.serializer
            com.roadrunner.logger.info.AppEventInfoChangeHandler r8 = (com.roadrunner.logger.info.AppEventInfoChangeHandler) r8
            r1.read = r0
            java.lang.Object r8 = r8.refreshUserInfo(r1)
            if (r8 != r2) goto L76
        L75:
            return r2
        L76:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.login.logging.RouterLogger.execute(o.getTextSelectionRange, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public Object navigateToFeedback(MainActivity mainActivity, ContinuationImpl continuationImpl) {
        CoordinatorLayoutLayoutParams coordinatorLayoutLayoutParams;
        Object objM4988getFeedbackEntityIoAF18A;
        int i = 2 % 2;
        if (continuationImpl instanceof CoordinatorLayoutLayoutParams) {
            int i2 = RemoteActionCompatParcelizer + 123;
            write = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                int i3 = ((CoordinatorLayoutLayoutParams) continuationImpl).serializer;
                throw null;
            }
            coordinatorLayoutLayoutParams = (CoordinatorLayoutLayoutParams) continuationImpl;
            int i4 = coordinatorLayoutLayoutParams.serializer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                coordinatorLayoutLayoutParams.serializer = i4 - Integer.MIN_VALUE;
                int i5 = write + 17;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                coordinatorLayoutLayoutParams = new CoordinatorLayoutLayoutParams(this, continuationImpl);
            }
        } else {
            coordinatorLayoutLayoutParams = new CoordinatorLayoutLayoutParams(this, continuationImpl);
        }
        Object obj = coordinatorLayoutLayoutParams.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = coordinatorLayoutLayoutParams.serializer;
        if (i7 != 0) {
            int i8 = RemoteActionCompatParcelizer + 65;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if (i7 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mainActivity = coordinatorLayoutLayoutParams.read;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4988getFeedbackEntityIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            coordinatorLayoutLayoutParams.read = mainActivity;
            coordinatorLayoutLayoutParams.serializer = 1;
            objM4988getFeedbackEntityIoAF18A = m4988getFeedbackEntityIoAF18A(coordinatorLayoutLayoutParams);
            if (objM4988getFeedbackEntityIoAF18A == obj2) {
                int i10 = write + 13;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return obj2;
            }
        }
        if (!(objM4988getFeedbackEntityIoAF18A instanceof isItemDismissable)) {
            getExtraDataMapannotations getextradatamapannotations = (getExtraDataMapannotations) objM4988getFeedbackEntityIoAF18A;
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(getextradatamapannotations.IconCompatParcelizer()));
            intent.putExtra("android.intent.extra.SUBJECT", getextradatamapannotations.read());
            intent.putExtra("android.intent.extra.TEXT", getextradatamapannotations.write());
            mainActivity.startActivity(Intent.createChooser(intent, getextradatamapannotations.serializer()));
        }
        Throwable thSerializer = onItemDismiss.serializer(objM4988getFeedbackEntityIoAF18A);
        if (thSerializer != null) {
            Timber.RemoteActionCompatParcelizer.write(thSerializer);
            int i12 = write + 97;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                int i13 = 2 / 3;
            }
        }
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i14 = RemoteActionCompatParcelizer + 9;
        write = i14 % Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            int i15 = 13 / 0;
        }
        return createfromparcel;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: getFeedbackEntity-IoAF18A, reason: not valid java name */
    public Object m4988getFeedbackEntityIoAF18A(ContinuationImpl continuationImpl) {
        FeedbackNavigatorImpl$getFeedbackEntity$1 feedbackNavigatorImpl$getFeedbackEntity$1;
        Object objM4963invokeIoAF18A;
        String str;
        String str2;
        List listRemoteActionCompatParcelizer;
        int i = 2 % 2;
        if (continuationImpl instanceof FeedbackNavigatorImpl$getFeedbackEntity$1) {
            int i2 = RemoteActionCompatParcelizer + 7;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            feedbackNavigatorImpl$getFeedbackEntity$1 = (FeedbackNavigatorImpl$getFeedbackEntity$1) continuationImpl;
            int i4 = feedbackNavigatorImpl$getFeedbackEntity$1.IconCompatParcelizer;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                feedbackNavigatorImpl$getFeedbackEntity$1.IconCompatParcelizer = i4 - Integer.MIN_VALUE;
            } else {
                feedbackNavigatorImpl$getFeedbackEntity$1 = new FeedbackNavigatorImpl$getFeedbackEntity$1(this, continuationImpl);
            }
        } else {
            feedbackNavigatorImpl$getFeedbackEntity$1 = new FeedbackNavigatorImpl$getFeedbackEntity$1(this, continuationImpl);
        }
        Object obj = feedbackNavigatorImpl$getFeedbackEntity$1.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = feedbackNavigatorImpl$getFeedbackEntity$1.IconCompatParcelizer;
        String strIconCompatParcelizer = null;
        if (i5 != 0) {
            int i6 = write + 15;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            if (i6 % 2 == 0 ? i5 != 1 : i5 != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4963invokeIoAF18A = ((onItemDismiss) obj).IconCompatParcelizer;
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            GetFeedbackDataUseCase getFeedbackDataUseCase = (GetFeedbackDataUseCase) this.read;
            feedbackNavigatorImpl$getFeedbackEntity$1.IconCompatParcelizer = 1;
            objM4963invokeIoAF18A = getFeedbackDataUseCase.m4963invokeIoAF18A(feedbackNavigatorImpl$getFeedbackEntity$1);
            if (objM4963invokeIoAF18A == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (objM4963invokeIoAF18A instanceof isItemDismissable) {
            return objM4963invokeIoAF18A;
        }
        dispatchKeyShortcutEvent dispatchkeyshortcutevent = (dispatchKeyShortcutEvent) objM4963invokeIoAF18A;
        shouldSkipDump shouldskipdump = (shouldSkipDump) this.serializer;
        dispatchkeyshortcutevent.getClass();
        Locale locale = Locale.getDefault();
        setTransactionSuccessful settransactionsuccessful = shouldskipdump.serializer;
        String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.pattern_feedback_body);
        getLifecycleRegistryannotations getlifecycleregistryannotationsIconCompatParcelizer = dispatchkeyshortcutevent.IconCompatParcelizer();
        if (getlifecycleregistryannotationsIconCompatParcelizer != null) {
            int i7 = write + 107;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                getlifecycleregistryannotationsIconCompatParcelizer.write();
                strIconCompatParcelizer.hashCode();
                throw null;
            }
            String strWrite = getlifecycleregistryannotationsIconCompatParcelizer.write();
            if (strWrite == null) {
                str = "null";
            } else {
                int i8 = RemoteActionCompatParcelizer + 73;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                str = strWrite;
            }
        } else {
            str = "null";
        }
        getLifecycleRegistryannotations getlifecycleregistryannotationsIconCompatParcelizer2 = dispatchkeyshortcutevent.IconCompatParcelizer();
        if (getlifecycleregistryannotationsIconCompatParcelizer2 != null) {
            int i10 = RemoteActionCompatParcelizer + 3;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            strIconCompatParcelizer = getlifecycleregistryannotationsIconCompatParcelizer2.IconCompatParcelizer();
        }
        String str3 = strIconCompatParcelizer;
        String strSerializer = dispatchkeyshortcutevent.serializer();
        getLifecycleRegistryannotations getlifecycleregistryannotationsIconCompatParcelizer3 = dispatchkeyshortcutevent.IconCompatParcelizer();
        if (getlifecycleregistryannotationsIconCompatParcelizer3 == null || (listRemoteActionCompatParcelizer = getlifecycleregistryannotationsIconCompatParcelizer3.RemoteActionCompatParcelizer()) == null) {
            str2 = "null";
        } else {
            int i12 = write + 59;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            String str4 = (String) onContentCardDismissed.MediaMetadataCompat(listRemoteActionCompatParcelizer);
            if (str4 == null) {
                str2 = "null";
            } else {
                str2 = str4;
            }
        }
        return new getExtraDataMapannotations(settransactionsuccessful.IconCompatParcelizer(R.string.feedback), af$$ExternalSyntheticOutline0.m(settransactionsuccessful.IconCompatParcelizer(R.string.courier_feedback_subject), " ", dispatchkeyshortcutevent.MediaSessionCompatQueueItem()), String.format(locale, strIconCompatParcelizer2, Arrays.copyOf(new Object[]{str, str3, strSerializer, str2, Locale.getDefault(), "Android", dispatchkeyshortcutevent.RemoteActionCompatParcelizer(), dispatchkeyshortcutevent.write(), dispatchkeyshortcutevent.MediaSessionCompatQueueItem(), settransactionsuccessful.IconCompatParcelizer(R.string.all_feedback_message)}, 10)), settransactionsuccessful.IconCompatParcelizer(R.string.COURIER_AND_FEEDBACK_RATIONAL), r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("mailto:", dispatchkeyshortcutevent.read()));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b A[Catch: Exception -> 0x01a0, TryCatch #0 {Exception -> 0x01a0, blocks: (B:45:0x0108, B:63:0x014f, B:64:0x0155, B:66:0x015b, B:69:0x0167, B:71:0x016b, B:73:0x0181, B:48:0x0111, B:54:0x0127, B:56:0x012b, B:59:0x0134, B:74:0x0193, B:51:0x0118), top: B:79:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016b A[Catch: Exception -> 0x01a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a0, blocks: (B:45:0x0108, B:63:0x014f, B:64:0x0155, B:66:0x015b, B:69:0x0167, B:71:0x016b, B:73:0x0181, B:48:0x0111, B:54:0x0127, B:56:0x012b, B:59:0x0134, B:74:0x0193, B:51:0x0118), top: B:79:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0181 A[Catch: Exception -> 0x01a0, TRY_ENTER, TryCatch #0 {Exception -> 0x01a0, blocks: (B:45:0x0108, B:63:0x014f, B:64:0x0155, B:66:0x015b, B:69:0x0167, B:71:0x016b, B:73:0x0181, B:48:0x0111, B:54:0x0127, B:56:0x012b, B:59:0x0134, B:74:0x0193, B:51:0x0118), top: B:79:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:1: B:64:0x0155->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002a  */
    /* JADX INFO: renamed from: invoke-IoAF18A, reason: not valid java name */
    public Object m4990invokeIoAF18A(ContinuationImpl continuationImpl) {
        GetCustomerUnavailableArgsUseCase$invoke$1 getCustomerUnavailableArgsUseCase$invoke$1;
        fastFilterNotNull fastfilternotnull;
        fastFilterNotNull fastfilternotnull2;
        uiMode uimode;
        GetAvailableInstantShiftsUseCase$invoke$1 getAvailableInstantShiftsUseCase$invoke$1;
        Object obj;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj2 = this.read;
        Object obj3 = null;
        if (i2 != 3) {
            if (continuationImpl instanceof GetAvailableInstantShiftsUseCase$invoke$1) {
                getAvailableInstantShiftsUseCase$invoke$1 = (GetAvailableInstantShiftsUseCase$invoke$1) continuationImpl;
                int i3 = getAvailableInstantShiftsUseCase$invoke$1.IconCompatParcelizer;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    int i4 = write + 41;
                    RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    getAvailableInstantShiftsUseCase$invoke$1.IconCompatParcelizer = i3 - Integer.MIN_VALUE;
                } else {
                    getAvailableInstantShiftsUseCase$invoke$1 = new GetAvailableInstantShiftsUseCase$invoke$1(this, continuationImpl);
                }
            } else {
                getAvailableInstantShiftsUseCase$invoke$1 = new GetAvailableInstantShiftsUseCase$invoke$1(this, continuationImpl);
            }
            Object obj4 = getAvailableInstantShiftsUseCase$invoke$1.read;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = getAvailableInstantShiftsUseCase$invoke$1.IconCompatParcelizer;
            if (i6 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                getAvailableInstantShiftsUseCase$invoke$1.IconCompatParcelizer = 1;
                obj = ((InstantShiftRepository) obj2).RemoteActionCompatParcelizer.get();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj4);
                obj = ((onItemDismiss) obj4).IconCompatParcelizer;
            }
            int i7 = RemoteActionCompatParcelizer + 23;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                boolean z = obj instanceof isItemDismissable;
                obj3.hashCode();
                throw null;
            }
            AndroidUiFrameClock androidUiFrameClock = (AndroidUiFrameClock) this.serializer;
            if (obj instanceof isItemDismissable) {
                return obj;
            }
            List list = (List) obj;
            androidUiFrameClock.getClass();
            list.getClass();
            List<isRemoved> list2 = list;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            for (isRemoved isremoved : list2) {
                int i8 = isremoved.id;
                isInvalid isinvalid = isremoved.zone;
                arrayList.add(new onLeftHiddenState(i8, runInTransaction.write(isremoved.startedAt), runInTransaction.write(isremoved.endedAt), new onEnteredHiddenState(isinvalid.serializer(), isinvalid.RemoteActionCompatParcelizer(), new isUpdated(isinvalid.write().RemoteActionCompatParcelizer(), isinvalid.write().IconCompatParcelizer()))));
            }
            return arrayList;
        }
        if (continuationImpl instanceof GetCustomerUnavailableArgsUseCase$invoke$1) {
            getCustomerUnavailableArgsUseCase$invoke$1 = (GetCustomerUnavailableArgsUseCase$invoke$1) continuationImpl;
            int i9 = getCustomerUnavailableArgsUseCase$invoke$1.RemoteActionCompatParcelizer;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                getCustomerUnavailableArgsUseCase$invoke$1.RemoteActionCompatParcelizer = i9 - Integer.MIN_VALUE;
            } else {
                getCustomerUnavailableArgsUseCase$invoke$1 = new GetCustomerUnavailableArgsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getCustomerUnavailableArgsUseCase$invoke$1 = new GetCustomerUnavailableArgsUseCase$invoke$1(this, continuationImpl);
        }
        Object objFirstOrNull = getCustomerUnavailableArgsUseCase$invoke$1.write;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = getCustomerUnavailableArgsUseCase$invoke$1.RemoteActionCompatParcelizer;
        try {
            if (i10 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
                HeatmapDataStore$get$$inlined$map$1 heatmapDataStore$get$$inlined$map$1Write = ((ObservePuDoDeliveriesResponseImpl) obj2).write();
                getCustomerUnavailableArgsUseCase$invoke$1.RemoteActionCompatParcelizer = 1;
                objFirstOrNull = FlowKt.firstOrNull(heatmapDataStore$get$$inlined$map$1Write, getCustomerUnavailableArgsUseCase$invoke$1);
                if (objFirstOrNull == coroutineSingletons2) {
                }
                return coroutineSingletons2;
            }
            if (i10 != 1) {
                int i11 = write + 117;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0 ? i10 != 2 : i10 != 2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fastfilternotnull2 = getCustomerUnavailableArgsUseCase$invoke$1.serializer;
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objFirstOrNull);
            }
            for (Object obj5 : (r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) objFirstOrNull) {
                if (((uiMode) obj5) instanceof makeTreedefault) {
                    obj3 = obj5;
                    break;
                }
            }
            uimode = (uiMode) obj3;
            if (uimode == null) {
                return new CustomerUnavailableArgs(fastfilternotnull2.write(), fastfilternotnull2.IconCompatParcelizer(), uimode.IconCompatParcelizer());
            }
            isItemDismissable isitemdismissable = new isItemDismissable(new IllegalStateException("Customer Unavailable task not found"));
            int i12 = write + 77;
            RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return isitemdismissable;
            List list3 = (List) objFirstOrNull;
            if (list3 != null && (fastfilternotnull = (fastFilterNotNull) onContentCardDismissed.MediaMetadataCompat(list3)) != null) {
                CreateHomeScope createHomeScope = (CreateHomeScope) this.serializer;
                long jWrite = fastfilternotnull.write();
                String strIconCompatParcelizer = fastfilternotnull.IconCompatParcelizer();
                getCustomerUnavailableArgsUseCase$invoke$1.serializer = fastfilternotnull;
                getCustomerUnavailableArgsUseCase$invoke$1.RemoteActionCompatParcelizer = 2;
                Object objInvoke = createHomeScope.invoke(jWrite, strIconCompatParcelizer, getCustomerUnavailableArgsUseCase$invoke$1);
                if (objInvoke != coroutineSingletons2) {
                    fastfilternotnull2 = fastfilternotnull;
                    objFirstOrNull = objInvoke;
                    while (r11.hasNext()) {
                        if (((uiMode) obj5) instanceof makeTreedefault) {
                            obj3 = obj5;
                            break;
                        }
                    }
                    uimode = (uiMode) obj3;
                    if (uimode == null) {
                        return new CustomerUnavailableArgs(fastfilternotnull2.write(), fastfilternotnull2.IconCompatParcelizer(), uimode.IconCompatParcelizer());
                    }
                    isItemDismissable isitemdismissable2 = new isItemDismissable(new IllegalStateException("Customer Unavailable task not found"));
                    int i14 = write + 77;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    return isitemdismissable2;
                }
                return coroutineSingletons2;
            }
            return new isItemDismissable(new IllegalStateException("No active delivery found"));
        } catch (Exception e) {
            return new isItemDismissable(e);
        }
    }
}
