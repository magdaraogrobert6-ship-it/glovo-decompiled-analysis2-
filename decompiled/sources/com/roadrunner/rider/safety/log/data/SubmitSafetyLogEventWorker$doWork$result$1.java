package com.roadrunner.rider.safety.log.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.customerchat.selfservice.data.repository.WebChatNativeAssetRepositoryImpl;
import com.roadrunner.rider.recruitment.accountcreation.email_and_phone.data.PhoneValidationRepository;
import fwfd.com.fwfsdk.util.FWFHelper;
import java.util.ArrayList;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ActivityHandlerExternalSyntheticLambda16;
import o.AnnotationContentHandler;
import o.ShortNewsContentCardView;
import o.collectRangeTransitions;
import o.createFromParcel;
import o.getInstallBeginTimeServerInSeconds;
import o.onResumeI;
import o.processRemoteTriggers;
import o.r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.setInstallBeginTimeInSeconds;
import o.setParameters;
import o.setPurchaseVerificationCallback;
import o.skippedEntity;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitSafetyLogEventWorker$doWork$result$1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ String RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitSafetyLogEventWorker$doWork$result$1(SubmitSafetyLogEventWorker submitSafetyLogEventWorker, r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA r8lambda4iulmttpk1bccxnrohiqnfq1opa, String str, setParameters setparameters, ShortNewsContentCardView shortNewsContentCardView) {
        super(1, shortNewsContentCardView);
        this.read = 0;
        this.MediaSessionCompatQueueItem = submitSafetyLogEventWorker;
        this.IconCompatParcelizer = r8lambda4iulmttpk1bccxnrohiqnfq1opa;
        this.RemoteActionCompatParcelizer = str;
        this.serializer = setparameters;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubmitSafetyLogEventWorker$doWork$result$1(Object obj, String str, String str2, String str3, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.read = i;
        this.MediaSessionCompatQueueItem = obj;
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.serializer = str3;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 91;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i3 == 0) {
            return ((SubmitSafetyLogEventWorker$doWork$result$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 1) {
            return ((SubmitSafetyLogEventWorker$doWork$result$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        if (i3 == 2) {
            return ((SubmitSafetyLogEventWorker$doWork$result$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((SubmitSafetyLogEventWorker$doWork$result$1) create(shortNewsContentCardView)).invokeSuspend(createfromparcel2);
        int i4 = MediaDescriptionCompat + 125;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return objInvokeSuspend;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        Object obj = this.serializer;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.MediaSessionCompatQueueItem;
        if (i4 == 0) {
            return new SubmitSafetyLogEventWorker$doWork$result$1((SubmitSafetyLogEventWorker) obj3, (r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) obj2, this.RemoteActionCompatParcelizer, (setParameters) obj, shortNewsContentCardView);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                return new SubmitSafetyLogEventWorker$doWork$result$1((FormBody.Builder) obj3, this.RemoteActionCompatParcelizer, (String) obj2, (String) obj, shortNewsContentCardView, 3);
            }
            return new SubmitSafetyLogEventWorker$doWork$result$1((PhoneValidationRepository) obj3, this.RemoteActionCompatParcelizer, (String) obj2, (String) obj, shortNewsContentCardView, 2);
        }
        SubmitSafetyLogEventWorker$doWork$result$1 submitSafetyLogEventWorker$doWork$result$1 = new SubmitSafetyLogEventWorker$doWork$result$1((WebChatNativeAssetRepositoryImpl) obj3, this.RemoteActionCompatParcelizer, (String) obj2, (String) obj, shortNewsContentCardView, 1);
        int i5 = MediaBrowserCompatMediaItem + 47;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return submitSafetyLogEventWorker$doWork$result$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objWrite;
        int i = 2 % 2;
        int i2 = this.read;
        String str = this.RemoteActionCompatParcelizer;
        Object obj2 = this.serializer;
        Object obj3 = this.IconCompatParcelizer;
        Object obj4 = this.MediaSessionCompatQueueItem;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.write;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                SubmitSafetyLogEventWorker submitSafetyLogEventWorker = (SubmitSafetyLogEventWorker) obj4;
                getInstallBeginTimeServerInSeconds getinstallbegintimeserverinseconds = submitSafetyLogEventWorker.MediaSessionCompatToken;
                long j = ((r8lambda4IULmTTPK1bcCxnRoHiqNFQ1OPA) obj3).read;
                setParameters setparameters = (setParameters) obj2;
                submitSafetyLogEventWorker.RatingCompat.getClass();
                setparameters.getClass();
                String str2 = setparameters.name;
                Map map = setparameters.params;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new setInstallBeginTimeInSeconds((String) entry.getKey(), (String) entry.getValue()));
                }
                setPurchaseVerificationCallback setpurchaseverificationcallback = new setPurchaseVerificationCallback(str2, arrayList);
                this.write = 1;
                if (getinstallbegintimeserverinseconds.RemoteActionCompatParcelizer(j, this.RemoteActionCompatParcelizer, setpurchaseverificationcallback, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.write;
            if (i4 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                WebChatNativeAssetRepositoryImpl webChatNativeAssetRepositoryImpl = (WebChatNativeAssetRepositoryImpl) obj4;
                this.write = 1;
                objWrite = webChatNativeAssetRepositoryImpl.serializer.write(skippedEntity.read((collectRangeTransitions) webChatNativeAssetRepositoryImpl.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), str, "/native-cache/api/v1/cache/variant"), (String) obj3, (String) obj2, FWFHelper.fwfDeviceOS, this);
                if (objWrite == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
            } else {
                if (i4 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i5 = MediaBrowserCompatMediaItem + 7;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                objWrite = obj;
            }
            return ((AnnotationContentHandler) objWrite).variant;
        }
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.write;
            if (i7 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                onResumeI onresumei = ((PhoneValidationRepository) obj4).serializer;
                processRemoteTriggers processremotetriggers = new processRemoteTriggers(str, (String) obj3, (String) obj2);
                this.write = 1;
                Object obj5 = onresumei.read(processremotetriggers, this);
                return obj5 == coroutineSingletons3 ? coroutineSingletons3 : obj5;
            }
            if (i7 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i8 = MediaBrowserCompatMediaItem + 31;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return null;
        }
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.write;
        if (i10 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            onResumeI onresumei2 = (onResumeI) ((FormBody.Builder) obj4).RemoteActionCompatParcelizer;
            ActivityHandlerExternalSyntheticLambda16 activityHandlerExternalSyntheticLambda16 = new ActivityHandlerExternalSyntheticLambda16(str, (String) obj3, (String) obj2);
            this.write = 1;
            Object objSerializer = onresumei2.serializer(activityHandlerExternalSyntheticLambda16, this);
            return objSerializer == coroutineSingletons4 ? coroutineSingletons4 : objSerializer;
        }
        int i11 = MediaDescriptionCompat + 97;
        MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
        if (i11 % 2 == 0 ? i10 == 1 : i10 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
        int i12 = MediaDescriptionCompat + 71;
        MediaBrowserCompatMediaItem = i12 % Fields.SpotShadowColor;
        int i13 = i12 % 2;
        return null;
    }
}
