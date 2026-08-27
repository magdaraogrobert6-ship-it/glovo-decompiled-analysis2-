package com.roadrunner.startworking.data;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.rider.state.breakrequest.domain.SendBreakRequestUseCaseImpl;
import com.roadrunner.sidemenu.photoId.PhotoIdUiModelImpl$1$1;
import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import com.sentiance.core.model.events.E$b;
import io.reactivex.Completable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ExtensionWindowAreaStatusRequirements;
import o.ShortNewsContentCardView;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.deserializeContentCardlambda2;
import o.deserializeInAppMessageStringlambda0;
import o.disableDelayedInitialization;
import o.getContentCardUnviewedCount;
import o.getDeviceIdAsync;
import o.getDeviceIdProviderandroid_sdk_base_release;
import o.getEventToken;
import o.getProductId;
import o.getRegisteredPushToken;
import o.handleInAppMessageTestPushandroid_sdk_base_release;
import o.handleInternalBannerRefreshlambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.inCompatibilityMode;
import o.logPushDeliveryandroid_sdk_base_release;
import o.logPushMaxCampaignandroid_sdk_base_release;
import o.logPushNotificationOpened;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.prepareForActivityTransitionCarryover;
import o.publishBrazePushActionandroid_sdk_base_release;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.requestBannersRefresh;
import o.subscribeToNewInAppMessageslambda1;
import o.subscribeToPushNotificationEventslambda0;
import o.waitForUserDependencyThreadlambda1;

/* JADX INFO: loaded from: classes3.dex */
public final class StartWorkingRepository$startWorking$2 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int MediaSessionCompatQueueItem = 1;
    private static int serializer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartWorkingRepository$startWorking$2(Object obj, Object obj2, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(1, shortNewsContentCardView);
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 79;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.write;
        Object obj = this.RemoteActionCompatParcelizer;
        Object obj2 = this.IconCompatParcelizer;
        if (i5 == 0) {
            return new StartWorkingRepository$startWorking$2((StartWorkingRepository) obj2, (handleInternalBannerRefreshlambda1) obj, shortNewsContentCardView, 0);
        }
        int i6 = 1;
        if (i5 == 1) {
            return new StartWorkingRepository$startWorking$2((SendBreakRequestUseCaseImpl) obj2, (String) obj, shortNewsContentCardView, i6);
        }
        if (i5 != 2) {
            return new StartWorkingRepository$startWorking$2((handleInAppMessageTestPushandroid_sdk_base_release) obj2, (logPushDeliveryandroid_sdk_base_release) obj, shortNewsContentCardView, 3);
        }
        StartWorkingRepository$startWorking$2 startWorkingRepository$startWorking$2 = new StartWorkingRepository$startWorking$2((E$b) obj2, (getContentCardUnviewedCount) obj, shortNewsContentCardView, i);
        int i7 = serializer + 121;
        MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return startWorkingRepository$startWorking$2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj;
        if (i2 == 0) {
            Object objInvokeSuspend = ((StartWorkingRepository$startWorking$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
            int i3 = MediaSessionCompatQueueItem + 55;
            serializer = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
        if (i2 == 1) {
            return ((StartWorkingRepository$startWorking$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        if (i2 != 2) {
            return ((StartWorkingRepository$startWorking$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        }
        Object objInvokeSuspend2 = ((StartWorkingRepository$startWorking$2) create(shortNewsContentCardView)).invokeSuspend(createfromparcel);
        int i4 = MediaSessionCompatQueueItem + 59;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend2;
        }
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        int i = 2 % 2;
        int i2 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.IconCompatParcelizer;
        Object obj3 = this.RemoteActionCompatParcelizer;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            StartWorkingRepository startWorkingRepository = (StartWorkingRepository) obj2;
            deserializeContentCardlambda2 deserializecontentcardlambda2 = startWorkingRepository.IconCompatParcelizer;
            handleInternalBannerRefreshlambda1 handleinternalbannerrefreshlambda1 = (handleInternalBannerRefreshlambda1) obj3;
            startWorkingRepository.serializer.getClass();
            handleinternalbannerrefreshlambda1.getClass();
            String value = handleinternalbannerrefreshlambda1.IconCompatParcelizer.getValue();
            ExtensionWindowAreaStatusRequirements extensionWindowAreaStatusRequirements = handleinternalbannerrefreshlambda1.write;
            deserializeInAppMessageStringlambda0 deserializeinappmessagestringlambda0 = new deserializeInAppMessageStringlambda0(value, extensionWindowAreaStatusRequirements != null ? new disableDelayedInitialization(extensionWindowAreaStatusRequirements.serializer, extensionWindowAreaStatusRequirements.read, extensionWindowAreaStatusRequirements.IconCompatParcelizer, extensionWindowAreaStatusRequirements.RemoteActionCompatParcelizer, extensionWindowAreaStatusRequirements.write) : null, handleinternalbannerrefreshlambda1.serializer, handleinternalbannerrefreshlambda1.RemoteActionCompatParcelizer, handleinternalbannerrefreshlambda1.read);
            this.read = 1;
            if (deserializecontentcardlambda2.write(deserializeinappmessagestringlambda0, this) != coroutineSingletons) {
                return createfromparcel;
            }
            int i4 = MediaSessionCompatQueueItem + 101;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return coroutineSingletons;
        }
        if (i2 == 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i6 = this.read;
            if (i6 != 0) {
                if (i6 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            SaveHeatmapUrlImpl saveHeatmapUrlImpl = ((SendBreakRequestUseCaseImpl) obj2).serializer;
            getEventToken geteventtoken = new getEventToken((String) obj3);
            saveHeatmapUrlImpl.getClass();
            Completable completableSerializer = ((getProductId) saveHeatmapUrlImpl.serializer).serializer(geteventtoken);
            this.read = 1;
            return RxAwaitKt.await(completableSerializer, this) == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
        }
        if (i2 == 2) {
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i7 = this.read;
            if (i7 != 0) {
                if (i7 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return obj;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            waitForUserDependencyThreadlambda1 waitforuserdependencythreadlambda1 = (waitForUserDependencyThreadlambda1) ((E$b) obj2).read;
            String value2 = ((getContentCardUnviewedCount) obj3).read.getValue();
            this.read = 1;
            Object objRemoteActionCompatParcelizer = waitforuserdependencythreadlambda1.RemoteActionCompatParcelizer(value2, this);
            return objRemoteActionCompatParcelizer == coroutineSingletons3 ? coroutineSingletons3 : objRemoteActionCompatParcelizer;
        }
        logPushDeliveryandroid_sdk_base_release logpushdeliveryandroid_sdk_base_release = (logPushDeliveryandroid_sdk_base_release) obj3;
        handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_release = (handleInAppMessageTestPushandroid_sdk_base_release) obj2;
        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = this.read;
        if (i8 != 0) {
            int i9 = serializer + 115;
            int i10 = i9 % Fields.SpotShadowColor;
            MediaSessionCompatQueueItem = i10;
            int i11 = i9 % 2;
            if (i8 != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i12 = i10 + 43;
            serializer = i12 % Fields.SpotShadowColor;
            if (i12 % 2 != 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                throw null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
        } else {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            handleinappmessagetestpushandroid_sdk_base_release.serializer.IconCompatParcelizer(logPushMaxCampaignandroid_sdk_base_release.read);
            getRegisteredPushToken getregisteredpushtoken = handleinappmessagetestpushandroid_sdk_base_release.MediaSessionCompatQueueItem;
            long jRemoteActionCompatParcelizer = handleinappmessagetestpushandroid_sdk_base_release.RemoteActionCompatParcelizer();
            getDeviceIdAsync getdeviceidasync = getDeviceIdAsync.BINARY;
            int i13 = logpushdeliveryandroid_sdk_base_release.read.write;
            String str2 = logpushdeliveryandroid_sdk_base_release.RemoteActionCompatParcelizer;
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2)) {
                int i14 = MediaSessionCompatQueueItem + 57;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                str = null;
            } else {
                str = str2;
            }
            List list = logpushdeliveryandroid_sdk_base_release.write;
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                if (((requestBannersRefresh) obj4).read) {
                    arrayList.add(obj4);
                }
            }
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int i16 = MediaSessionCompatQueueItem + 3;
                serializer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    arrayList2.add(((requestBannersRefresh) it.next()).write);
                    shortNewsContentCardView.hashCode();
                    throw null;
                }
                arrayList2.add(((requestBannersRefresh) it.next()).write);
            }
            getDeviceIdProviderandroid_sdk_base_release getdeviceidproviderandroid_sdk_base_release = new getDeviceIdProviderandroid_sdk_base_release(jRemoteActionCompatParcelizer, getdeviceidasync, i13, str, arrayList2);
            this.read = 1;
            ((inCompatibilityMode) getregisteredpushtoken.write).getClass();
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            Object objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new PhotoIdUiModelImpl$1$1(getregisteredpushtoken, getdeviceidproviderandroid_sdk_base_release, shortNewsContentCardView, 26), this);
            if (objWithContext != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objWithContext = createfromparcel;
            }
            if (objWithContext == coroutineSingletons4) {
                return coroutineSingletons4;
            }
        }
        subscribeToNewInAppMessageslambda1 subscribetonewinappmessageslambda1 = handleinappmessagetestpushandroid_sdk_base_release.PlaybackStateCompat;
        subscribeToPushNotificationEventslambda0 subscribetopushnotificationeventslambda0 = (subscribeToPushNotificationEventslambda0) handleinappmessagetestpushandroid_sdk_base_release.RatingCompat.MediaSessionCompatResultReceiverWrapper();
        long jRemoteActionCompatParcelizer2 = handleinappmessagetestpushandroid_sdk_base_release.RemoteActionCompatParcelizer();
        subscribetonewinappmessageslambda1.getClass();
        subscribetopushnotificationeventslambda0.getClass();
        subscribetonewinappmessageslambda1.write.logEvent("rider_vendor_review_success_negative", onMove.RemoteActionCompatParcelizer(new onViewAttachedToWindowlambda0("screenName", subscribetopushnotificationeventslambda0.getValue()), new onViewAttachedToWindowlambda0("currentDeliveryId", String.valueOf(jRemoteActionCompatParcelizer2))));
        handleinappmessagetestpushandroid_sdk_base_release.MediaMetadataCompat.RemoteActionCompatParcelizer(handleinappmessagetestpushandroid_sdk_base_release.RemoteActionCompatParcelizer(), ReviewState.SUBMITTED_NEGATIVE);
        handleinappmessagetestpushandroid_sdk_base_release.serializer.IconCompatParcelizer(publishBrazePushActionandroid_sdk_base_release.read);
        handleinappmessagetestpushandroid_sdk_base_release.write.serializer(logPushNotificationOpened.write);
        return createfromparcel;
    }
}
