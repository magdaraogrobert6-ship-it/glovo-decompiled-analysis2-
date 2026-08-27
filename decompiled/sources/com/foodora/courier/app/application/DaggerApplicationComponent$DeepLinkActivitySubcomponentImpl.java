package com.foodora.courier.app.application;

import androidx.compose.ui.graphics.Fields;
import bo.app.f2$$ExternalSyntheticLambda4;
import coil3.network.NetworkFetcher;
import com.data.util.AndroidScheduleProvider;
import com.huawei.wisesecurity.ucs_credential.g0;
import com.mapbox.navigation.core.MapboxNavigation$$ExternalSyntheticLambda4;
import com.roadrunner.adjust.ui.AdjustTrueLinkBrowsableActivity;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.legacy.chatlist.presentation.CustomerChatsActivity;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.deeplink.DeepLinkActivity;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.PhotoSharedSuccessDialogFragment;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothScanPermissionDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.presentation.signature.CustomerSignatureFragment;
import com.roadrunner.experience_tools.qualtrics.QualtricsManagerImpl;
import com.roadrunner.order.history.presentation.HistoryNavContainerFragment;
import com.roadrunner.push.DialogMessageRequestProxy;
import com.roadrunner.push.presentation.PushMessagesActivity;
import com.roadrunner.push.presentation.PushMessagesInjectionActivity;
import com.sentiance.core.model.events.N$b;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.subjects.BehaviorSubject;
import o.AndroidGraphicsContext2;
import o.BrazeExternalSyntheticLambda28;
import o.SemanticsOwnerKt;
import o.TextOverflowCompanion;
import o.TextUnitType;
import o.buildRGBAExpression;
import o.debounceEntryb8qMvQI;
import o.decode;
import o.forEachNewCallbackNeverInvoked;
import o.getContentViewGroupParentLayout;
import o.getEllipsisgIe3tQ8annotations;
import o.getHasNonTranslationComponents;
import o.getKeyboardTap5zf0vsI;
import o.getPivotOffsetF1C5BW0;
import o.getQueryContext;
import o.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION;
import o.getScreenOffsetnOccac;
import o.getSubpixelTextPositioningui_text;
import o.inCompatibilityMode;
import o.internalInitInvalidationTracker;
import o.nanosToMillis;
import o.r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8;
import o.r8lambdad3KDFaViDQCaterPKviUURECBdQ;
import o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34;
import o.setStateParametersdefault;
import o.setTransactionSuccessful;
import o.transferSessionPackageI;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final class DaggerApplicationComponent$DeepLinkActivitySubcomponentImpl implements r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ DaggerApplicationComponent$DeepLinkActivitySubcomponentImpl(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.write = i;
        this.serializer = getstyleable_vector_drawable_group_rotation;
    }

    @Override // o.r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34
    public final void inject(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i3 = this.write;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = this.serializer;
        switch (i3) {
            case 0:
                DeepLinkActivity deepLinkActivity = (DeepLinkActivity) obj;
                deepLinkActivity._init_lambda1 = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                deepLinkActivity.MediaSessionCompatQueueItem = getstyleable_vector_drawable_group_rotation.MediaBrowserCompatMediaItem();
                deepLinkActivity.MediaDescriptionCompat = getstyleable_vector_drawable_group_rotation.r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ;
                deepLinkActivity.RatingCompat = new r8lambda4s7OvXv48SHY8g9QXR7tgugpjF8((decode) getstyleable_vector_drawable_group_rotation.setItemInvoker.write(), (getContentViewGroupParentLayout) getstyleable_vector_drawable_group_rotation.ContentInViewNodelaunchAnimation21.write());
                deepLinkActivity.MediaBrowserCompatMediaItem = (SemanticsOwnerKt) getstyleable_vector_drawable_group_rotation.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8.write();
                int i4 = RemoteActionCompatParcelizer + 55;
                read = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            case 1:
                AdjustTrueLinkBrowsableActivity adjustTrueLinkBrowsableActivity = (AdjustTrueLinkBrowsableActivity) obj;
                adjustTrueLinkBrowsableActivity._init_lambda1 = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                adjustTrueLinkBrowsableActivity.MediaSessionCompatQueueItem = getstyleable_vector_drawable_group_rotation.MediaBrowserCompatMediaItem();
                adjustTrueLinkBrowsableActivity.MediaDescriptionCompat = new g0(0);
                return;
            case 2:
                BluetoothEnableDialogFragment bluetoothEnableDialogFragment = (BluetoothEnableDialogFragment) obj;
                bluetoothEnableDialogFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                bluetoothEnableDialogFragment.getOnBackPressedDispatcher = (getEllipsisgIe3tQ8annotations) getstyleable_vector_drawable_group_rotation.CameraValidatorCameraIdListIncorrectException.write();
                bluetoothEnableDialogFragment.getNavigationEventDispatcher = (getSubpixelTextPositioningui_text) getstyleable_vector_drawable_group_rotation.getFullyDrawnReporter.write();
                int i6 = read + 11;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return;
            case 3:
                BluetoothScanPermissionDialogFragment bluetoothScanPermissionDialogFragment = (BluetoothScanPermissionDialogFragment) obj;
                bluetoothScanPermissionDialogFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                bluetoothScanPermissionDialogFragment.getSavedStateRegistry = new internalInitInvalidationTracker(2);
                bluetoothScanPermissionDialogFragment.getOnBackPressedDispatcher = new TextOverflowCompanion(getstyleable_vector_drawable_group_rotation.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                bluetoothScanPermissionDialogFragment.getNavigationEventDispatcher = (buildRGBAExpression) getstyleable_vector_drawable_group_rotation.getViewModelStore.write();
                return;
            case 4:
                CustomerChatsActivity customerChatsActivity = (CustomerChatsActivity) obj;
                BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = new BrazeExternalSyntheticLambda28((setTransactionSuccessful) getstyleable_vector_drawable_group_rotation.toClipEntry.write(), new g0(0));
                getHasNonTranslationComponents gethasnontranslationcomponents = new getHasNonTranslationComponents((decode) getstyleable_vector_drawable_group_rotation.setItemInvoker.write(), (QualtricsManagerImpl) getstyleable_vector_drawable_group_rotation.accessprocessDragStart.write(), (getScreenOffsetnOccac) getstyleable_vector_drawable_group_rotation.isInterested.write(), new inCompatibilityMode(), (getContentViewGroupParentLayout) getstyleable_vector_drawable_group_rotation.ContentInViewNodelaunchAnimation21.write(), (TextUnitType) getstyleable_vector_drawable_group_rotation.isEnabled.write(), getstyleable_vector_drawable_group_rotation.MediaMetadataCompat(), getstyleable_vector_drawable_group_rotation.MediaSessionCompatToken());
                forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked = (forEachNewCallbackNeverInvoked) getstyleable_vector_drawable_group_rotation.accesscalculateScrollDeltaI_oMVgE.write();
                getPivotOffsetF1C5BW0 getpivotoffsetf1c5bw0 = (getPivotOffsetF1C5BW0) getstyleable_vector_drawable_group_rotation.FlingCancellationException.write();
                foreachnewcallbackneverinvoked.getClass();
                getpivotoffsetf1c5bw0.getClass();
                N$b n$b = new N$b();
                n$b.read = foreachnewcallbackneverinvoked;
                CompositeDisposable compositeDisposable = new CompositeDisposable();
                AndroidGraphicsContext2 androidGraphicsContext2 = new AndroidGraphicsContext2();
                n$b.IconCompatParcelizer = androidGraphicsContext2;
                n$b.serializer = androidGraphicsContext2;
                BehaviorSubject behaviorSubject = ((CustomerChatProviderImpl) foreachnewcallbackneverinvoked).serializer.read;
                AndroidScheduleProvider androidScheduleProvider = (AndroidScheduleProvider) getpivotoffsetf1c5bw0;
                Scheduler schedulerIconCompatParcelizer = androidScheduleProvider.IconCompatParcelizer();
                behaviorSubject.getClass();
                compositeDisposable.read(new ObservableUnsubscribeOn(new ObservableSubscribeOn(behaviorSubject, schedulerIconCompatParcelizer).RemoteActionCompatParcelizer(AndroidSchedulers.RemoteActionCompatParcelizer()), androidScheduleProvider.IconCompatParcelizer()).subscribe(new MapboxNavigation$$ExternalSyntheticLambda4(19, new f2$$ExternalSyntheticLambda4(29, n$b)), new MapboxNavigation$$ExternalSyntheticLambda4(20, new NetworkFetcher.AnonymousClass2(1, Timber.RemoteActionCompatParcelizer, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 16))));
                debounceEntryb8qMvQI debounceentryb8qmvqi = new debounceEntryb8qMvQI(brazeExternalSyntheticLambda28, gethasnontranslationcomponents, new SignInDataStore(n$b), new getQueryContext());
                debounceentryb8qmvqi.MediaSessionCompatToken = getstyleable_vector_drawable_group_rotation.MediaDescriptionCompat();
                debounceentryb8qmvqi.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new getKeyboardTap5zf0vsI(getstyleable_vector_drawable_group_rotation.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs);
                debounceentryb8qmvqi.RatingCompat = (DialogMessageRequestProxy) getstyleable_vector_drawable_group_rotation.MutatorMutexmutate2.write();
                debounceentryb8qmvqi.ParcelableVolumeInfo = getstyleable_vector_drawable_group_rotation.getLastCustomNonConfigurationInstance();
                ((PushMessagesActivity) customerChatsActivity).PlaybackStateCompatCustomAction = debounceentryb8qmvqi;
                ((PushMessagesActivity) customerChatsActivity).MediaSessionCompatToken = getstyleable_vector_drawable_group_rotation.addOnPictureInPictureModeChangedListener();
                ((PushMessagesActivity) customerChatsActivity).RatingCompat = getstyleable_vector_drawable_group_rotation.MediaBrowserCompatMediaItem();
                ((PushMessagesInjectionActivity) customerChatsActivity).MediaSessionCompatResultReceiverWrapper = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                customerChatsActivity.MediaDescriptionCompat = (forEachNewCallbackNeverInvoked) getstyleable_vector_drawable_group_rotation.accesscalculateScrollDeltaI_oMVgE.write();
                return;
            case 5:
                CustomerSignatureFragment customerSignatureFragment = (CustomerSignatureFragment) obj;
                customerSignatureFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                customerSignatureFragment.getNavigationEventDispatcher = new r8lambdad3KDFaViDQCaterPKviUURECBdQ(new nanosToMillis((setStateParametersdefault) getstyleable_vector_drawable_group_rotation.nativeRotateYUV.write()));
                return;
            case 6:
                ((HistoryNavContainerFragment) obj).initializeViewTreeOwners = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                return;
            default:
                PhotoSharedSuccessDialogFragment photoSharedSuccessDialogFragment = (PhotoSharedSuccessDialogFragment) obj;
                photoSharedSuccessDialogFragment.removeOnUserLeaveHintListener = getstyleable_vector_drawable_group_rotation.PlaybackStateCompatCustomAction();
                photoSharedSuccessDialogFragment.getNavigationEventDispatcher = (transferSessionPackageI) getstyleable_vector_drawable_group_rotation.Contentfoundation.write();
                return;
        }
    }
}
