package com.roadrunner.localPushNotifications.smartPolling.domain;

import androidx.compose.ui.graphics.Fields;
import bo.app.b8$$ExternalSyntheticLambda4;
import coil3.ExtrasKt;
import com.braze.Braze$$ExternalSyntheticLambda9;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.application.CourierApplication;
import com.foodora.courier.push.messages.domain.HandlePushMessageUseCase;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.delivery.state.StateV3$ScreenType;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AndroidView_androidKtcreateAndroidViewNodeFactory11;
import o.ContainsAlllambda0;
import o.DialogLayout1;
import o.PrefetchNetworkException;
import o.ViewPager2LinearLayoutManagerImpl;
import o.ViewPager2RecyclerViewImpl;
import o.checkAdjustAdRevenue;
import o.createFromParcel;
import o.getCurrentItem;
import o.getIdJ3iCeTQ;
import o.getOffscreenPageLimit;
import o.onContentCardDismissed;
import o.r8lambdafHcIMtqslO5nN2ofGE631aElY;
import o.r8lambdamp9rjJu0uaONMo14IZlDWVI4Ljc;
import o.setFitInsetsSides;
import o.setOffscreenPageLimit;
import o.setPageTransformer;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryAcceptanceLocalPushNotificationFactoryImpl implements getCurrentItem {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final getIdJ3iCeTQ RemoteActionCompatParcelizer;
    public final AutoAcceptLocalPushHandlerImpl read;
    public final PrefetchNetworkException serializer;
    public final setPageTransformer write;

    public DeliveryAcceptanceLocalPushNotificationFactoryImpl(PrefetchNetworkException prefetchNetworkException, setPageTransformer setpagetransformer, AutoAcceptLocalPushHandlerImpl autoAcceptLocalPushHandlerImpl, getIdJ3iCeTQ getidj3icetq) {
        this.serializer = prefetchNetworkException;
        this.write = setpagetransformer;
        this.read = autoAcceptLocalPushHandlerImpl;
        this.RemoteActionCompatParcelizer = getidj3icetq;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object autoAcceptDelivery(String str, String str2, ContinuationImpl continuationImpl) {
        ViewPager2LinearLayoutManagerImpl viewPager2LinearLayoutManagerImpl;
        int i = 2 % 2;
        if (continuationImpl instanceof ViewPager2LinearLayoutManagerImpl) {
            viewPager2LinearLayoutManagerImpl = (ViewPager2LinearLayoutManagerImpl) continuationImpl;
            int i2 = viewPager2LinearLayoutManagerImpl.IconCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                viewPager2LinearLayoutManagerImpl.IconCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                viewPager2LinearLayoutManagerImpl = new ViewPager2LinearLayoutManagerImpl(this, continuationImpl);
                int i3 = IconCompatParcelizer + 59;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
            }
        } else {
            viewPager2LinearLayoutManagerImpl = new ViewPager2LinearLayoutManagerImpl(this, continuationImpl);
            int i5 = IconCompatParcelizer + 59;
            MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        Object objInvoke = viewPager2LinearLayoutManagerImpl.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = viewPager2LinearLayoutManagerImpl.IconCompatParcelizer;
        try {
            if (i7 != 0) {
                int i8 = MediaDescriptionCompat + 103;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0 ? i7 != 1 : i7 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
            } else {
                ExtrasKt.RemoteActionCompatParcelizer(objInvoke);
                AutoAcceptLocalPushHandlerImpl autoAcceptLocalPushHandlerImpl = this.read;
                viewPager2LinearLayoutManagerImpl.IconCompatParcelizer = 1;
                objInvoke = autoAcceptLocalPushHandlerImpl.invoke(str, str2, viewPager2LinearLayoutManagerImpl);
                if (objInvoke == coroutineSingletons) {
                    int i9 = IconCompatParcelizer + 125;
                    MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    return coroutineSingletons;
                }
            }
            checkAdjustAdRevenue checkadjustadrevenue = (checkAdjustAdRevenue) objInvoke;
            getIdJ3iCeTQ getidj3icetq = this.RemoteActionCompatParcelizer;
            checkadjustadrevenue.getClass();
            HandlePushMessageUseCase handlePushMessageUseCase = getidj3icetq.RemoteActionCompatParcelizer;
            CourierApplication courierApplication = getidj3icetq.IconCompatParcelizer;
            b8$$ExternalSyntheticLambda4 b8__externalsyntheticlambda4 = new b8$$ExternalSyntheticLambda4(1);
            handlePushMessageUseCase.getClass();
            courierApplication.getClass();
            ((TraceTimeMeasurementWithPerformanceKit) handlePushMessageUseCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read("push_message_processing", new Braze$$ExternalSyntheticLambda9(handlePushMessageUseCase, checkadjustadrevenue, courierApplication, b8__externalsyntheticlambda4, 5));
            int i11 = MediaDescriptionCompat + 91;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } catch (Exception e) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "Something went wrong with Auto accept with Smart polling", new Object[0]);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:73:0x0127  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public final Object invoke(getOffscreenPageLimit getoffscreenpagelimit, ContinuationImpl continuationImpl) {
        ViewPager2RecyclerViewImpl viewPager2RecyclerViewImpl;
        List list;
        DialogLayout1 dialogLayout1;
        String str;
        String str2;
        String str3;
        String str4;
        List list2;
        DialogLayout1 dialogLayout2;
        int i = 2 % 2;
        getIdJ3iCeTQ getidj3icetq = this.RemoteActionCompatParcelizer;
        CourierApplication courierApplication = getidj3icetq.IconCompatParcelizer;
        HandlePushMessageUseCase handlePushMessageUseCase = getidj3icetq.RemoteActionCompatParcelizer;
        if (continuationImpl instanceof ViewPager2RecyclerViewImpl) {
            viewPager2RecyclerViewImpl = (ViewPager2RecyclerViewImpl) continuationImpl;
            int i2 = viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer = i2 - Integer.MIN_VALUE;
            } else {
                viewPager2RecyclerViewImpl = new ViewPager2RecyclerViewImpl(this, continuationImpl);
            }
        } else {
            viewPager2RecyclerViewImpl = new ViewPager2RecyclerViewImpl(this, continuationImpl);
        }
        Object obj = viewPager2RecyclerViewImpl.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i3 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ContainsAlllambda0 containsAlllambda0 = getoffscreenpagelimit.IconCompatParcelizer;
            setFitInsetsSides setfitinsetssides = getoffscreenpagelimit.read;
            if (containsAlllambda0 != null && getoffscreenpagelimit.RemoteActionCompatParcelizer != StateV3$ScreenType.Accept) {
                if (containsAlllambda0.equals(r8lambdamp9rjJu0uaONMo14IZlDWVI4Ljc.serializer)) {
                    int i4 = MediaDescriptionCompat + 61;
                    IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        int i5 = 35 / 0;
                        if (setfitinsetssides != null) {
                            list = setfitinsetssides.routes;
                            if (list == null && (dialogLayout1 = (DialogLayout1) onContentCardDismissed.MediaMetadataCompat(list)) != null) {
                                str = dialogLayout1.deliveryId;
                            }
                        }
                        str2 = setOffscreenPageLimit.RemoteActionCompatParcelizer;
                        viewPager2RecyclerViewImpl.serializer = getoffscreenpagelimit;
                        viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer = 1;
                        if (autoAcceptDelivery(str2, str, viewPager2RecyclerViewImpl) != obj2) {
                        }
                    } else {
                        if (setfitinsetssides != null) {
                            list = setfitinsetssides.routes;
                            if (list == null) {
                            }
                        }
                        str2 = setOffscreenPageLimit.RemoteActionCompatParcelizer;
                        viewPager2RecyclerViewImpl.serializer = getoffscreenpagelimit;
                        viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer = 1;
                        if (autoAcceptDelivery(str2, str, viewPager2RecyclerViewImpl) != obj2) {
                        }
                    }
                    str = null;
                    str2 = setOffscreenPageLimit.RemoteActionCompatParcelizer;
                    viewPager2RecyclerViewImpl.serializer = getoffscreenpagelimit;
                    viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer = 1;
                    if (autoAcceptDelivery(str2, str, viewPager2RecyclerViewImpl) != obj2) {
                    }
                } else if (containsAlllambda0 instanceof r8lambdafHcIMtqslO5nN2ofGE631aElY) {
                    try {
                        checkAdjustAdRevenue checkadjustadrevenueRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer((r8lambdafHcIMtqslO5nN2ofGE631aElY) containsAlllambda0, setfitinsetssides);
                        b8$$ExternalSyntheticLambda4 b8__externalsyntheticlambda4 = new b8$$ExternalSyntheticLambda4(1);
                        handlePushMessageUseCase.getClass();
                        courierApplication.getClass();
                        ((TraceTimeMeasurementWithPerformanceKit) handlePushMessageUseCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read("push_message_processing", new Braze$$ExternalSyntheticLambda9(handlePushMessageUseCase, checkadjustadrevenueRemoteActionCompatParcelizer, courierApplication, b8__externalsyntheticlambda4, 5));
                        return createfromparcel;
                    } catch (MissingDeliveryIdException e) {
                        Timber.RemoteActionCompatParcelizer.write(e);
                        return createfromparcel;
                    }
                }
            }
            return obj2;
        }
        int i6 = IconCompatParcelizer + 1;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0 ? i3 != 1 : i3 != 0) {
            if (i3 == 2) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        getoffscreenpagelimit = viewPager2RecyclerViewImpl.serializer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        AndroidView_androidKtcreateAndroidViewNodeFactory11 androidView_androidKtcreateAndroidViewNodeFactory11 = getoffscreenpagelimit.serializer;
        setFitInsetsSides setfitinsetssides2 = getoffscreenpagelimit.read;
        StateV3$ScreenType stateV3$ScreenType = getoffscreenpagelimit.RemoteActionCompatParcelizer;
        if (androidView_androidKtcreateAndroidViewNodeFactory11 != null && stateV3$ScreenType == StateV3$ScreenType.Accept) {
            try {
                checkAdjustAdRevenue checkadjustadrevenueSerializer = this.serializer.serializer(androidView_androidKtcreateAndroidViewNodeFactory11, setfitinsetssides2);
                b8$$ExternalSyntheticLambda4 b8__externalsyntheticlambda5 = new b8$$ExternalSyntheticLambda4(1);
                handlePushMessageUseCase.getClass();
                courierApplication.getClass();
                ((TraceTimeMeasurementWithPerformanceKit) handlePushMessageUseCase.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).read("push_message_processing", new Braze$$ExternalSyntheticLambda9(handlePushMessageUseCase, checkadjustadrevenueSerializer, courierApplication, b8__externalsyntheticlambda5, 5));
                return createfromparcel;
            } catch (MissingDeliveryIdException e2) {
                Timber.RemoteActionCompatParcelizer.write(e2);
                return createfromparcel;
            }
        }
        if (getoffscreenpagelimit.write != null) {
            int i7 = IconCompatParcelizer + 87;
            MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                int i8 = 32 / 0;
                if (stateV3$ScreenType == StateV3$ScreenType.AutoAccept) {
                    if (setfitinsetssides2 != null || (list2 = setfitinsetssides2.routes) == null || (dialogLayout2 = (DialogLayout1) onContentCardDismissed.MediaMetadataCompat(list2)) == null) {
                        str3 = null;
                    } else {
                        str3 = dialogLayout2.deliveryId;
                    }
                    str4 = setOffscreenPageLimit.read;
                    viewPager2RecyclerViewImpl.serializer = null;
                    viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer = 2;
                    if (autoAcceptDelivery(str4, str3, viewPager2RecyclerViewImpl) == obj2) {
                        return obj2;
                    }
                }
            } else if (stateV3$ScreenType == StateV3$ScreenType.AutoAccept) {
                if (setfitinsetssides2 != null) {
                    str3 = null;
                } else {
                    str3 = null;
                }
                str4 = setOffscreenPageLimit.read;
                viewPager2RecyclerViewImpl.serializer = null;
                viewPager2RecyclerViewImpl.RemoteActionCompatParcelizer = 2;
                if (autoAcceptDelivery(str4, str3, viewPager2RecyclerViewImpl) == obj2) {
                    return obj2;
                }
            }
        }
        return createfromparcel;
    }
}
