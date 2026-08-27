package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.common.data.CoroutineApiErrorHandlerKt;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository$initiateTransferChange$2;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import io.grpc.internal.SharedResourcePool;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.SimpleItemTouchHelperCallback;
import o.addSubLayer;
import o.createFromParcel;
import o.ddefault;
import o.getBitmapui_graphics;
import o.getContentViewGroupParentLayout;
import o.getMaxWidth;
import o.getOptimizationLevel;
import o.getPositionannotations;
import o.getSceneString;
import o.isOpenInternalroom_runtime;
import o.obtainAndroidOutline;
import o.onContentCardDismissed;
import o.onMove;
import o.onShowTranslationui;
import o.onViewAdded;
import o.onViewAttachedToWindowlambda0;
import o.parseAnimatedVisibility;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaQr9o1sD2sFcQv5PQz66nKB1Wzkg;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.resolveOutlinePosition;
import o.resumeWebviewIfNecessaryandroid_sdk_ui_release;
import o.transitionSearchlambda0;
import o.unsupportedSearch;
import o.unsupportedSearchlambda0;
import o.unsupportedSearchlambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferChangeViewModel$onTransferChangeClick$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ double IconCompatParcelizer;
    public final /* synthetic */ TransferChangeViewModel MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public TransferChangeViewModel read;
    public getMaxWidth serializer;
    public final /* synthetic */ long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferChangeViewModel$onTransferChangeClick$1(TransferChangeViewModel transferChangeViewModel, long j, double d, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaSessionCompatQueueItem = transferChangeViewModel;
        this.write = j;
        this.IconCompatParcelizer = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        TransferChangeViewModel$onTransferChangeClick$1 transferChangeViewModel$onTransferChangeClick$1 = new TransferChangeViewModel$onTransferChangeClick$1(this.MediaSessionCompatQueueItem, this.write, this.IconCompatParcelizer, shortNewsContentCardView);
        int i2 = RatingCompat + 103;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return transferChangeViewModel$onTransferChangeClick$1;
        }
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 113;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((TransferChangeViewModel$onTransferChangeClick$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaBrowserCompatMediaItem + 47;
        RatingCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0176  */
    /* JADX WARN: Code duplicated, block: B:36:0x0188  */
    /* JADX WARN: Code duplicated, block: B:38:0x0196  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        double dDoubleValue;
        Object objWrite;
        getOptimizationLevel getoptimizationlevel;
        Object obj2;
        TransferChangeViewModel transferChangeViewModel;
        SharedResourcePool sharedResourcePool;
        Throwable th;
        obtainAndroidOutline obtainandroidoutline;
        int i = 2 % 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.RemoteActionCompatParcelizer;
        TransferChangeViewModel transferChangeViewModel2 = this.MediaSessionCompatQueueItem;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            transferChangeViewModel2.MediaMetadataCompat.serializer(unsupportedSearchlambda1.read);
            String str = transferChangeViewModel2.write().RemoteActionCompatParcelizer.read;
            parseAnimatedVisibility parseanimatedvisibility = transferChangeViewModel2.serializer;
            getPositionannotations getpositionannotations = transferChangeViewModel2.read;
            parseanimatedvisibility.getClass();
            str.getClass();
            Map mapRemoteActionCompatParcelizer = getpositionannotations != null ? onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("currentDeliveryId", getpositionannotations.currentDeliveryId), new onViewAttachedToWindowlambda0("deliveryState", getpositionannotations.deliveryState), new onViewAttachedToWindowlambda0("deliveryTasks", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.taskIds, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("isTaskMandatory", onContentCardDismissed.IconCompatParcelizer(getpositionannotations.tasksRequired, ",", null, null, null, 62)), new onViewAttachedToWindowlambda0("transferChangeAmount", str)) : null;
            if (mapRemoteActionCompatParcelizer == null) {
                mapRemoteActionCompatParcelizer = SimpleItemTouchHelperCallback.serializer;
            }
            parseanimatedvisibility.IconCompatParcelizer.logEvent("transfer_change_click", mapRemoteActionCompatParcelizer);
            InitiateTransferChangeUseCase initiateTransferChangeUseCase = transferChangeViewModel2.IconCompatParcelizer;
            this.RemoteActionCompatParcelizer = 1;
            initiateTransferChangeUseCase.getClass();
            long j = (long) (this.IconCompatParcelizer * 100.0d);
            Double dMediaMetadataCompat = resumeWebviewIfNecessaryandroid_sdk_ui_release.MediaMetadataCompat(str);
            if (dMediaMetadataCompat != null) {
                dDoubleValue = dMediaMetadataCompat.doubleValue();
            } else {
                int i3 = RatingCompat + 5;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                dDoubleValue = 0.0d;
            }
            ConfirmationRepository confirmationRepository = initiateTransferChangeUseCase.serializer;
            isOpenInternalroom_runtime isopeninternalroom_runtime = confirmationRepository.IconCompatParcelizer;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            objWrite = CoroutineApiErrorHandlerKt.write(DefaultIoScheduler.RemoteActionCompatParcelizer, new ConfirmationRepository$initiateTransferChange$2(confirmationRepository, this.write, j, (long) (dDoubleValue * 100.0d), null), this);
            if (objWrite != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objWrite = obj;
        } else {
            if (i2 != 2) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = RatingCompat + 63;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            TransferChangeViewModel transferChangeViewModel3 = this.read;
            getMaxWidth getmaxwidth = this.serializer;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            getoptimizationlevel = getmaxwidth;
            transferChangeViewModel = transferChangeViewModel3;
            obj2 = obj;
        }
        ((onShowTranslationui) transferChangeViewModel.PlaybackStateCompat).setValue((TransferChangeViewState) obj2);
        getBitmapui_graphics getbitmapui_graphics = transferChangeViewModel2.MediaDescriptionCompat;
        sharedResourcePool = transferChangeViewModel2.MediaMetadataCompat;
        getbitmapui_graphics.RemoteActionCompatParcelizer("transfer_change_ui_state", transferChangeViewModel2.write());
        if (getoptimizationlevel instanceof getMaxWidth) {
            int i7 = MediaBrowserCompatMediaItem + 9;
            RatingCompat = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            th = ((getMaxWidth) getoptimizationlevel).serializer;
            if (th instanceof addSubLayer) {
                obtainandroidoutline = (obtainAndroidOutline) ((addSubLayer) th).messages.get(0);
                if (obtainandroidoutline instanceof resolveOutlinePosition) {
                    sharedResourcePool.serializer(new unsupportedSearchlambda0(((resolveOutlinePosition) obtainandroidoutline).title, ddefault.write));
                }
            } else {
                sharedResourcePool.serializer(new unsupportedSearchlambda0(((getMaxWidth) getoptimizationlevel).write(), ddefault.IconCompatParcelizer));
            }
        } else {
            sharedResourcePool.serializer(new unsupportedSearchlambda0(((getMaxWidth) getoptimizationlevel).write(), ddefault.IconCompatParcelizer));
        }
        return createFromParcel.INSTANCE;
        getoptimizationlevel = (getOptimizationLevel) objWrite;
        transferChangeViewModel2.MediaMetadataCompat.serializer(unsupportedSearch.RemoteActionCompatParcelizer);
        if (getoptimizationlevel instanceof getSceneString) {
            transferChangeViewModel2.MediaMetadataCompat.serializer(new transitionSearchlambda0(transferChangeViewModel2.write().RemoteActionCompatParcelizer.read));
        } else {
            if (getoptimizationlevel instanceof getMaxWidth) {
                int i9 = RatingCompat + 69;
                MediaBrowserCompatMediaItem = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                SignInDataStore signInDataStore = transferChangeViewModel2.RatingCompat;
                String str2 = transferChangeViewModel2.write().RemoteActionCompatParcelizer.read;
                String str3 = transferChangeViewModel2.write().serializer.RemoteActionCompatParcelizer;
                this.serializer = (getMaxWidth) getoptimizationlevel;
                this.read = transferChangeViewModel2;
                this.RemoteActionCompatParcelizer = 2;
                obj2 = SignInDataStore.read(signInDataStore, r8lambdaQr9o1sD2sFcQv5PQz66nKB1Wzkg.write, str2, 0.0d, str3, this, 4);
                if (obj2 != coroutineSingletons) {
                    transferChangeViewModel = transferChangeViewModel2;
                    ((onShowTranslationui) transferChangeViewModel.PlaybackStateCompat).setValue((TransferChangeViewState) obj2);
                    getBitmapui_graphics getbitmapui_graphics2 = transferChangeViewModel2.MediaDescriptionCompat;
                    sharedResourcePool = transferChangeViewModel2.MediaMetadataCompat;
                    getbitmapui_graphics2.RemoteActionCompatParcelizer("transfer_change_ui_state", transferChangeViewModel2.write());
                    if (getoptimizationlevel instanceof getMaxWidth) {
                        int i11 = MediaBrowserCompatMediaItem + 9;
                        RatingCompat = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        th = ((getMaxWidth) getoptimizationlevel).serializer;
                        if (th instanceof addSubLayer) {
                            obtainandroidoutline = (obtainAndroidOutline) ((addSubLayer) th).messages.get(0);
                            if (obtainandroidoutline instanceof resolveOutlinePosition) {
                                sharedResourcePool.serializer(new unsupportedSearchlambda0(((resolveOutlinePosition) obtainandroidoutline).title, ddefault.write));
                            }
                        } else {
                            sharedResourcePool.serializer(new unsupportedSearchlambda0(((getMaxWidth) getoptimizationlevel).write(), ddefault.IconCompatParcelizer));
                        }
                    } else {
                        sharedResourcePool.serializer(new unsupportedSearchlambda0(((getMaxWidth) getoptimizationlevel).write(), ddefault.IconCompatParcelizer));
                    }
                }
                return coroutineSingletons;
            }
            if (!(getoptimizationlevel instanceof onViewAdded)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
        }
        return createFromParcel.INSTANCE;
    }
}
