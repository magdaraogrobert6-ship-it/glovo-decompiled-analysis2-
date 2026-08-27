package com.roadrunner.customerchat.legacy.core;

import android.app.Activity;
import androidx.compose.ui.graphics.Fields;
import com.data.util.AndroidScheduleProvider;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.foodora.courier.app.application.CourierApplication;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.qualtrics.digital.ClientSideIntercept;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.legacy.core.usecases.ChatRegisterUseCase;
import com.roadrunner.customerchat.legacy.core.usecases.DeliveryChatVisibilityUseCase;
import com.roadrunner.home.HomeFragment;
import com.roadrunner.logger.logger.perseus.PerseusInitializerImpl$$ExternalSyntheticLambda0;
import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import java.lang.ref.WeakReference;
import o.createFromParcel;
import o.forEachNewCallbackNeverInvoked;
import o.getPivotOffsetF1C5BW0;
import o.getViewToWindowMatrix3i98HWw;
import o.getWindowOffsetnOccac;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.registerOnGlobalChange;
import o.registerOnRectChanged;
import o.scheduleDebounceCallback;
import o.setGlobalChangeEntries;
import o.setScreenOffsetgyyYBs;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class LegacyCustomerChatCommunicatorImpl {
    private static int MediaSessionCompatQueueItem = 0;
    private static int ParcelableVolumeInfo = 1;
    public final InitializeAppStartupItemsImpl IconCompatParcelizer;
    public final zzz MediaBrowserCompatMediaItem;
    public final getPivotOffsetF1C5BW0 MediaDescriptionCompat;
    public final CourierApplication MediaMetadataCompat;
    public final setGlobalChangeEntries RatingCompat;
    public final getViewToWindowMatrix3i98HWw RemoteActionCompatParcelizer;
    public final ProtobufEncoder read;
    public final DeliveryChatVisibilityUseCase serializer;
    public final ChatRegisterUseCase write;

    public LegacyCustomerChatCommunicatorImpl(getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0, ChatRegisterUseCase chatRegisterUseCase, CourierApplication courierApplication, DeliveryChatVisibilityUseCase deliveryChatVisibilityUseCase, setGlobalChangeEntries setglobalchangeentries, getViewToWindowMatrix3i98HWw getviewtowindowmatrix3i98hww, ProtobufEncoder protobufEncoder, InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, zzz zzzVar) throws Exception {
        getpivotoffsetf1c5bw0.getClass();
        chatRegisterUseCase.getClass();
        courierApplication.getClass();
        deliveryChatVisibilityUseCase.getClass();
        setglobalchangeentries.getClass();
        getviewtowindowmatrix3i98hww.getClass();
        protobufEncoder.getClass();
        initializeAppStartupItemsImpl.getClass();
        zzzVar.getClass();
        this.MediaDescriptionCompat = getpivotoffsetf1c5bw0;
        this.write = chatRegisterUseCase;
        this.MediaMetadataCompat = courierApplication;
        this.serializer = deliveryChatVisibilityUseCase;
        this.RatingCompat = setglobalchangeentries;
        this.RemoteActionCompatParcelizer = getviewtowindowmatrix3i98hww;
        this.read = protobufEncoder;
        this.IconCompatParcelizer = initializeAppStartupItemsImpl;
        this.MediaBrowserCompatMediaItem = zzzVar;
        AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) getpivotoffsetf1c5bw0;
        FlowableObserveOn flowableObserveOnWrite = chatRegisterUseCase.RemoteActionCompatParcelizer().write(androidScheduleProvider.IconCompatParcelizer());
        PerseusInitializerImpl$$ExternalSyntheticLambda0 perseusInitializerImpl$$ExternalSyntheticLambda0 = new PerseusInitializerImpl$$ExternalSyntheticLambda0(9, new LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0(this, 0));
        int i = Flowable.write;
        Flowable flowableWrite = flowableObserveOnWrite.write(perseusInitializerImpl$$ExternalSyntheticLambda0, i, i).write(new PerseusInitializerImpl$$ExternalSyntheticLambda0(10, new LegacyCustomerChatCommunicatorImpl$$ExternalSyntheticLambda0(this, 1)), i, i);
        new FlowableSubscribeOn(flowableWrite, androidScheduleProvider.IconCompatParcelizer(), !(flowableWrite instanceof FlowableCreate)).subscribe(new r8lambdayUqGVEpC1kg8ua3jc9a113shNIE(new MapApiError$$ExternalSyntheticLambda1(4)), new PerseusInitializerImpl$$ExternalSyntheticLambda0(11, new HomeFragment.AnonymousClass1(1, Timber.RemoteActionCompatParcelizer, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 9)));
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getviewtowindowmatrix3i98hww.invoke(createfromparcel);
        chatRegisterUseCase.invoke(createfromparcel);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070 A[Catch: IllegalArgumentException -> 0x009f, TryCatch #0 {IllegalArgumentException -> 0x009f, blocks: (B:13:0x0059, B:18:0x006a, B:20:0x008f, B:19:0x0070, B:22:0x0097, B:23:0x009e), top: B:29:0x0059 }] */
    public final void serializer(getWindowOffsetnOccac getwindowoffsetnoccac, boolean z) {
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        int i = 2 % 2;
        Activity activity = null;
        if (getwindowoffsetnoccac instanceof registerOnRectChanged) {
            registerOnRectChanged registeronrectchanged = (registerOnRectChanged) getwindowoffsetnoccac;
            long jRemoteActionCompatParcelizer = registeronrectchanged.RemoteActionCompatParcelizer();
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Long.valueOf(jRemoteActionCompatParcelizer), registeronrectchanged.write());
        } else {
            if (!(getwindowoffsetnoccac instanceof setScreenOffsetgyyYBs)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                int i2 = ParcelableVolumeInfo + 61;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return;
            }
            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(Long.valueOf(((setScreenOffsetgyyYBs) getwindowoffsetnoccac).RemoteActionCompatParcelizer()), null);
        }
        long jLongValue = ((Number) onviewattachedtowindowlambda0.serializer).longValue();
        String str = (String) onviewattachedtowindowlambda0.write;
        WeakReference weakReference = this.MediaMetadataCompat.defaultViewModelProviderFactory_delegatelambda0;
        if (weakReference != null) {
            int i4 = ParcelableVolumeInfo + 119;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            activity = (Activity) weakReference.get();
        }
        if (activity != null) {
            ProtobufEncoder protobufEncoder = this.read;
            forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked = (forEachNewCallbackNeverInvoked) protobufEncoder.write;
            try {
                if (!(activity instanceof scheduleDebounceCallback)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (str != null) {
                    int i6 = ParcelableVolumeInfo + 103;
                    MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    if (z) {
                        int iRemoteActionCompatParcelizer = ClientSideIntercept.RemoteActionCompatParcelizer();
                        CustomerChatProviderImpl.RemoteActionCompatParcelizer(ClientSideIntercept.RemoteActionCompatParcelizer(), 594436921, -594436921, new Object[]{(CustomerChatProviderImpl) foreachnewcallbackneverinvoked, activity, str}, ClientSideIntercept.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer, ClientSideIntercept.RemoteActionCompatParcelizer());
                    } else {
                        ((CustomerChatProviderImpl) foreachnewcallbackneverinvoked).IconCompatParcelizer(activity, str);
                    }
                } else {
                    int iRemoteActionCompatParcelizer2 = ClientSideIntercept.RemoteActionCompatParcelizer();
                    CustomerChatProviderImpl.RemoteActionCompatParcelizer(ClientSideIntercept.RemoteActionCompatParcelizer(), 594436921, -594436921, new Object[]{(CustomerChatProviderImpl) foreachnewcallbackneverinvoked, activity, str}, ClientSideIntercept.RemoteActionCompatParcelizer(), iRemoteActionCompatParcelizer2, ClientSideIntercept.RemoteActionCompatParcelizer());
                }
                protobufEncoder.RemoteActionCompatParcelizer((registerOnGlobalChange) protobufEncoder.serializer, jLongValue, activity);
            } catch (IllegalArgumentException e) {
                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new Exception(e), "Failed to open the Customer chat", new Object[0]);
            }
        }
    }
}
