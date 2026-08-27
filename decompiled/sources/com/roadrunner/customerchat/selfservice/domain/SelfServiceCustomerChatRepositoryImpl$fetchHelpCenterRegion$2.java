package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.logger.PerseusLogger$w$1;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.inCompatibilityMode;
import o.onItemDismiss;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public final /* synthetic */ SelfServiceCustomerChatRepositoryImpl RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.RemoteActionCompatParcelizer = selfServiceCustomerChatRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = serializer + 51;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl = this.RemoteActionCompatParcelizer;
        int i6 = 0;
        if (i5 == 0) {
            return new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2(selfServiceCustomerChatRepositoryImpl, shortNewsContentCardView, i6);
        }
        int i7 = 1;
        if (i5 != 1) {
            return new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2(selfServiceCustomerChatRepositoryImpl, shortNewsContentCardView, i);
        }
        SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 = new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2(selfServiceCustomerChatRepositoryImpl, shortNewsContentCardView, i7);
        int i8 = write + 63;
        serializer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 83 / 0;
        }
        return selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = serializer + 89;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 != 0) {
            return i4 != 1 ? ((SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = write + 105;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM4882invokegIAlus;
        int i = 2 % 2;
        int i2 = serializer + 81;
        write = i2 % Fields.SpotShadowColor;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.read;
        SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl = this.RemoteActionCompatParcelizer;
        int i4 = 1;
        if (i3 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.IconCompatParcelizer;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                ExecuteHelpCenterApiRequest executeHelpCenterApiRequest = selfServiceCustomerChatRepositoryImpl.write;
                SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2 = new SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2(selfServiceCustomerChatRepositoryImpl, shortNewsContentCardView, i4);
                this.IconCompatParcelizer = 1;
                objM4882invokegIAlus = executeHelpCenterApiRequest.m4882invokegIAlus(selfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$2, this);
                if (objM4882invokegIAlus == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = write + 99;
                serializer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objM4882invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
            }
            return new onItemDismiss(objM4882invokegIAlus);
        }
        if (i3 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i8 = this.IconCompatParcelizer;
            if (i8 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl = selfServiceCustomerChatRepositoryImpl.IconCompatParcelizer;
                this.IconCompatParcelizer = 1;
                Object objWrite = helpCenterRemoteDataSourceImpl.write(this);
                return objWrite == coroutineSingletons2 ? coroutineSingletons2 : objWrite;
            }
            int i9 = serializer;
            int i10 = i9 + 61;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i12 = i9 + 107;
            write = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = this.IconCompatParcelizer;
        if (i14 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl2 = selfServiceCustomerChatRepositoryImpl.IconCompatParcelizer;
            this.IconCompatParcelizer = 1;
            ((inCompatibilityMode) helpCenterRemoteDataSourceImpl2.read).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PerseusLogger$w$1(helpCenterRemoteDataSourceImpl2, shortNewsContentCardView, 15), this);
            return objWithContext == coroutineSingletons3 ? coroutineSingletons3 : objWithContext;
        }
        int i15 = serializer + 81;
        int i16 = i15 % Fields.SpotShadowColor;
        write = i16;
        int i17 = i15 % 2;
        if (i14 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i18 = i16 + 63;
        serializer = i18 % Fields.SpotShadowColor;
        if (i18 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        int i19 = 34 / 0;
        return obj;
    }
}
