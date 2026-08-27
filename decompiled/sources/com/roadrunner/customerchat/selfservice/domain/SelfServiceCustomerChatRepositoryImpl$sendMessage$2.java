package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.data.remote.HelpCenterRemoteDataSourceImpl;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import java.util.Random;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl$sendMessage$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaDescriptionCompat = 0;
    public static int MediaMetadataCompat = 0;
    public static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ SelfServiceCustomerChatRepositoryImpl read;
    public final /* synthetic */ String serializer;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelfServiceCustomerChatRepositoryImpl$sendMessage$2(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, String str, String str2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.write = i;
        this.read = selfServiceCustomerChatRepositoryImpl;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = str2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 115;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i4 != 0) {
            return ((SelfServiceCustomerChatRepositoryImpl$sendMessage$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend = ((SelfServiceCustomerChatRepositoryImpl$sendMessage$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i5 = MediaDescriptionCompat + 95;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 13;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.write == 0) {
            return new SelfServiceCustomerChatRepositoryImpl$sendMessage$2(this.read, this.RemoteActionCompatParcelizer, this.serializer, shortNewsContentCardView, 0);
        }
        SelfServiceCustomerChatRepositoryImpl$sendMessage$2 selfServiceCustomerChatRepositoryImpl$sendMessage$2 = new SelfServiceCustomerChatRepositoryImpl$sendMessage$2(this.read, this.RemoteActionCompatParcelizer, this.serializer, shortNewsContentCardView, 1);
        int i4 = RatingCompat + 109;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 70 / 0;
        }
        return selfServiceCustomerChatRepositoryImpl$sendMessage$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM4882invokegIAlus;
        int i = 2 % 2;
        int i2 = RatingCompat + 107;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object obj2 = null;
        if (this.write != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.IconCompatParcelizer;
            if (i4 != 0) {
                int i5 = RatingCompat + 75;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                HelpCenterRemoteDataSourceImpl helpCenterRemoteDataSourceImpl = this.read.IconCompatParcelizer;
                this.IconCompatParcelizer = 1;
                if (helpCenterRemoteDataSourceImpl.sendMessage(this.RemoteActionCompatParcelizer, this.serializer, this) == coroutineSingletons) {
                    int i7 = MediaDescriptionCompat + 75;
                    int i8 = i7 % Fields.SpotShadowColor;
                    RatingCompat = i8;
                    if (i7 % 2 == 0) {
                        int i9 = 21 / 0;
                    }
                    int i10 = i8 + 87;
                    MediaDescriptionCompat = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    return coroutineSingletons;
                }
            }
            return createFromParcel.INSTANCE;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.IconCompatParcelizer;
        if (i12 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl = this.read;
            ExecuteHelpCenterApiRequest executeHelpCenterApiRequest = selfServiceCustomerChatRepositoryImpl.write;
            SelfServiceCustomerChatRepositoryImpl$sendMessage$2 selfServiceCustomerChatRepositoryImpl$sendMessage$2 = new SelfServiceCustomerChatRepositoryImpl$sendMessage$2(selfServiceCustomerChatRepositoryImpl, this.RemoteActionCompatParcelizer, this.serializer, null, 1);
            this.IconCompatParcelizer = 1;
            objM4882invokegIAlus = executeHelpCenterApiRequest.m4882invokegIAlus(selfServiceCustomerChatRepositoryImpl$sendMessage$2, this);
            if (objM4882invokegIAlus == coroutineSingletons2) {
                return coroutineSingletons2;
            }
        } else {
            if (i12 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i13 = RatingCompat + 87;
            MediaDescriptionCompat = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                Object obj3 = ((onItemDismiss) obj).IconCompatParcelizer;
                obj2.hashCode();
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            objM4882invokegIAlus = ((onItemDismiss) obj).IconCompatParcelizer;
        }
        return new onItemDismiss(objM4882invokegIAlus);
    }

    public static int read() {
        int i = MediaSessionCompatQueueItem;
        int i2 = i % 8111709;
        MediaSessionCompatQueueItem = i + 1;
        if (i2 != 0) {
            return MediaMetadataCompat;
        }
        int iNextInt = new Random().nextInt(1179652493);
        MediaMetadataCompat = iNextInt;
        return iNextInt;
    }
}
