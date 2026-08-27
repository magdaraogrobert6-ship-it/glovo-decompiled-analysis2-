package o;

import androidx.camera.video.Recorder$3;
import com.foodora.courier.app.application.DaggerApplicationComponent$DeepLinkActivitySubcomponentImpl;
import com.huawei.hmf.tasks.a.i$d;
import com.roadrunner.auth.logout.presentation.LogoutActivity;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineComposeBottomSheet;
import com.roadrunner.delivery.accept.declinebutton.presentation.LasagnaDeclineWithAcceptanceRateBottomSheet;
import com.roadrunner.delivery.inappcamera.presentation.picture_with_tag.InAppCameraWithTagsFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.sharing.presentation.PhotoSharedSuccessDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrpayment.presentation.screen.QrPaymentScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.pin.PinScreenFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.QrScannerFragment;
import com.roadrunner.face.verification.presentation.IdentityVerificationActivity;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.inappnotifications.presentation.InAppNotificationsFragment;
import com.roadrunner.liveness.presentation.LivenessDetectionActivity;
import com.roadrunner.login.presentation.LoginActivity;
import com.roadrunner.nafath.presentation.ui.NafathModalFragment;
import com.roadrunner.order.history.presentation.HistoryDialogFragment;
import com.roadrunner.order.history.presentation.HistoryNavContainerFragment;
import com.roadrunner.order.history.presentation.main.HistoryFragment;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetailsFragment;
import com.roadrunner.overlay.bubble.permission.presentation.OverlayPermissionDialogFragment;
import com.roadrunner.permission.presentation.NonFloatablePermissionActivity;
import com.roadrunner.permission.presentation.PermissionActivity;
import com.roadrunner.push.presentation.MessageDialogFragment;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.recentdeliveries.presentation.RecentDeliveriesFragment;
import com.roadrunner.rider.safety.permission.presentation.RiderSafetyPermissionFragment;
import com.roadrunner.rider.safety.report.presentation.RiderSafetyReportFragment;
import com.roadrunner.rider.state.breakrequest.RequestBreakFragment;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import com.roadrunner.web.presentation.hiring.RiderHiringWebViewFragment;
import com.sentiance.core.model.events.i$c;
import com.sentiance.core.model.thrift.k$c;

/* JADX INFO: loaded from: classes2.dex */
public final class getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR implements areJsonObjectsEqual {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION read;

    public /* synthetic */ getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = getstyleable_vector_drawable_group_rotation;
    }

    @Override // o.areJsonObjectsEqual
    public final r8lambdalZ7kyOB69DcxFWdLKMjr4_8S_34 serializer(Object obj) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION getstyleable_vector_drawable_group_rotation = this.read;
        int i3 = 7;
        int i4 = 6;
        int i5 = 0;
        switch (i2) {
            case 0:
                ((NestFragment) obj).getClass();
                return new accessgetGreencp(getstyleable_vector_drawable_group_rotation, 21);
            case 1:
                ((HistoryDialogFragment) obj).getClass();
                return new i$d(getstyleable_vector_drawable_group_rotation, 16);
            case 2:
                ((HistoryFragment) obj).getClass();
                return new androidx.transition.TransitionValuesMaps(getstyleable_vector_drawable_group_rotation, 10);
            case 3:
                ((HistoryNavContainerFragment) obj).getClass();
                return new DaggerApplicationComponent$DeepLinkActivitySubcomponentImpl(getstyleable_vector_drawable_group_rotation, i4);
            case 4:
                ((InAppCameraWithTagsFragment) obj).getClass();
                return new accessgetGreencp(getstyleable_vector_drawable_group_rotation, 20);
            case 5:
                ((IdentityVerificationActivity) obj).getClass();
                return new androidx.transition.TransitionValuesMaps(getstyleable_vector_drawable_group_rotation, 11);
            case 6:
                ((InAppNotificationsFragment) obj).getClass();
                return new accessgetTvTeletextcp(getstyleable_vector_drawable_group_rotation, 7);
            case 7:
                ((LasagnaDeclineBottomSheet) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME(getstyleable_vector_drawable_group_rotation, 0);
            case 8:
                ((LasagnaDeclineComposeBottomSheet) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME(getstyleable_vector_drawable_group_rotation, 1);
            case 9:
                ((LasagnaDeclineWithAcceptanceRateBottomSheet) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME(getstyleable_vector_drawable_group_rotation, 2);
            case 10:
                ((LivenessDetectionActivity) obj).getClass();
                k$c k_c = new k$c();
                k_c.RemoteActionCompatParcelizer = getstyleable_vector_drawable_group_rotation;
                k_c.write = new executeQuery(getstyleable_vector_drawable_group_rotation.setItemInvoker, 12);
                getDoubleOrNull getdoubleornullWrite = getDoubleOrNull.write(new onOpen(new SqlPreparedStatement(getstyleable_vector_drawable_group_rotation.toClipEntry)));
                executeQuery executequery = (executeQuery) k_c.write;
                k_c.IconCompatParcelizer = new isHiddenannotations(executequery, getstyleable_vector_drawable_group_rotation.invalidateOptionsMenu, getdoubleornullWrite, getstyleable_vector_drawable_group_rotation.tryMaxHeightJN0ABg, 5);
                mergeJsonObjects mergejsonobjects = getstyleable_vector_drawable_group_rotation.toClipEntry;
                executeQuery executequery2 = new executeQuery(mergejsonobjects, 19);
                mergeJsonObjects mergejsonobjects2 = getstyleable_vector_drawable_group_rotation.EncoderImpl;
                executeQuery executequery3 = new executeQuery(mergejsonobjects2, 14);
                getDataStoreFileName getdatastorefilename = new getDataStoreFileName(executequery3, getstyleable_vector_drawable_group_rotation.CombinedClickableElement, new acquire(getstyleable_vector_drawable_group_rotation.DefaultScrollableState, getstyleable_vector_drawable_group_rotation.getSupportCompoundDrawablesTintList, i5), getstyleable_vector_drawable_group_rotation.setUiOptions, getstyleable_vector_drawable_group_rotation.ExtraCroppingQuirk, new executeQuery(mergejsonobjects, 13));
                executeQuery executequery4 = new executeQuery(mergejsonobjects2, 18);
                backgroundTimerFiredI backgroundtimerfiredi = getstyleable_vector_drawable_group_rotation.trimToSize;
                getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate = getstyleable_vector_drawable_group_rotation.Keep;
                k_c.read = new getDataStoreFileName(executequery2, getdatastorefilename, executequery, backgroundtimerfiredi, getverticalscrollaxisrangedelegate, executequery4);
                mergeJsonObjects mergejsonobjects3 = getstyleable_vector_drawable_group_rotation.Contentfoundation;
                k_c.serializer = new setRefreshing(getstyleable_vector_drawable_group_rotation.setSupportBackgroundTintList, getstyleable_vector_drawable_group_rotation.ImageProcessingUtil, getstyleable_vector_drawable_group_rotation.invoke, executequery3, new onAnimationCancel(mergejsonobjects3, 1), new executeQuery(mergejsonobjects, 16), new executeQuery(mergejsonobjects, 17), new executeQuery(mergejsonobjects, 15), new onAnimationCancel(getstyleable_vector_drawable_group_rotation.OnBackPressedCallback, 0), executequery, 0);
                k_c.MediaBrowserCompatMediaItem = new acquire(mergejsonobjects, getstyleable_vector_drawable_group_rotation.CameraManagerCompatApi30Impl, 17);
                k_c.MediaSessionCompatQueueItem = getDoubleOrNull.write(new transaction(new k$c(executequery3, mergejsonobjects2, mergejsonobjects, mergejsonobjects3, getdatastorefilename, executequery, backgroundtimerfiredi, getverticalscrollaxisrangedelegate)));
                k_c.MediaDescriptionCompat = getDoubleOrNull.write(new SavedStateRegistryImplExternalSyntheticLambda0(new SqlPreparedStatement(getstyleable_vector_drawable_group_rotation.Transition)));
                return k_c;
            case 11:
                ((LoginActivity) obj).getClass();
                setDefaultNotificationChannelName setdefaultnotificationchannelname = new setDefaultNotificationChannelName();
                setdefaultnotificationchannelname.read = getstyleable_vector_drawable_group_rotation;
                setdefaultnotificationchannelname.serializer = new getFailureMessage(getstyleable_vector_drawable_group_rotation.toClipEntry, getstyleable_vector_drawable_group_rotation.Contentfoundation, getstyleable_vector_drawable_group_rotation.horizontalDragjO51t88, getstyleable_vector_drawable_group_rotation.ContentInViewNode, 4);
                setdefaultnotificationchannelname.RemoteActionCompatParcelizer = new executeQuery(getstyleable_vector_drawable_group_rotation.setItemInvoker, 27);
                applyLayoutFeatures applylayoutfeatures = new applyLayoutFeatures(getstyleable_vector_drawable_group_rotation.getSupportCompoundDrawablesTintList, getstyleable_vector_drawable_group_rotation.VerticalScrollableClipShape, toPaintCap.IconCompatParcelizer(), 10);
                com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory = getstyleable_vector_drawable_group_rotation.SupportedSurfaceCombination;
                executeQuery executequery5 = (executeQuery) setdefaultnotificationchannelname.RemoteActionCompatParcelizer;
                lambda31 lambda31Var = new lambda31((getColorIntegerOrNulllambda0) applylayoutfeatures, (getColorIntegerOrNulllambda0) dataModule_ProvideSchedulerFactory, (mergeJsonObjects) executequery5, i4);
                readInstallReferrerHuaweiAppGallery readinstallreferrerhuaweiappgallery = new readInstallReferrerHuaweiAppGallery(18);
                newTransaction newtransaction = getstyleable_vector_drawable_group_rotation.horizontalDragjO51t88;
                isHiddenannotations ishiddenannotations = new isHiddenannotations(applylayoutfeatures, dataModule_ProvideSchedulerFactory, executequery5, newtransaction, 7);
                mergeJsonObjects mergejsonobjects4 = getstyleable_vector_drawable_group_rotation.Contentfoundation;
                executeQuery executequery6 = new executeQuery(mergejsonobjects4, 28);
                getFailureMessage getfailuremessage = (getFailureMessage) setdefaultnotificationchannelname.serializer;
                mergeJsonObjects mergejsonobjects5 = getstyleable_vector_drawable_group_rotation.toClipEntry;
                mergeJsonObjects mergejsonobjects6 = getstyleable_vector_drawable_group_rotation.setTrackResource;
                setdefaultnotificationchannelname.write = new setRefreshing(getfailuremessage, executequery5, lambda31Var, readinstallreferrerhuaweiappgallery, ishiddenannotations, mergejsonobjects4, mergejsonobjects5, newtransaction, mergejsonobjects6, executequery6);
                mergeJsonObjects mergejsonobjects7 = getstyleable_vector_drawable_group_rotation.setItemInvoker;
                executeQuery executequery7 = new executeQuery(mergejsonobjects7, 0);
                r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq = getstyleable_vector_drawable_group_rotation.ContentInViewNodeKt;
                SimpleExecutableQuery simpleExecutableQuery = getstyleable_vector_drawable_group_rotation.isMaxVisibleEQwtKwdefault;
                onCapabilitiesChanged oncapabilitieschanged = getstyleable_vector_drawable_group_rotation.ContentInViewNode;
                setdefaultnotificationchannelname.IconCompatParcelizer = new ba(r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, ishiddenannotations, simpleExecutableQuery, mergejsonobjects5, mergejsonobjects4, executequery7, mergejsonobjects6, oncapabilitieschanged);
                executeQuery executequery8 = new executeQuery(mergejsonobjects5, 29);
                setPresentationView setpresentationview = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
                getDataStoreFileName getdatastorefilename2 = new getDataStoreFileName(newtransaction, mergejsonobjects5, mergejsonobjects4, executequery8, setpresentationview, oncapabilitieschanged);
                mergeJsonObjects mergejsonobjects8 = getstyleable_vector_drawable_group_rotation.FlingCancellationException;
                getContentDataType getcontentdatatype = getstyleable_vector_drawable_group_rotation.ScrollableKt;
                SimpleExecutableQuery simpleExecutableQuery2 = getstyleable_vector_drawable_group_rotation.getImplementationMode;
                performPushDeliveryFlushlambda0 performpushdeliveryflushlambda0 = getstyleable_vector_drawable_group_rotation.tryMaxHeightJN0ABg;
                setdefaultnotificationchannelname.RatingCompat = new d4ExternalSyntheticLambda3(mergejsonobjects8, mergejsonobjects5, getcontentdatatype, getdatastorefilename2, simpleExecutableQuery2, simpleExecutableQuery, performpushdeliveryflushlambda0, getstyleable_vector_drawable_group_rotation.hasOverlappingRendering, oncapabilitieschanged, mergejsonobjects6, newtransaction, mergejsonobjects4);
                setdefaultnotificationchannelname.MediaSessionCompatQueueItem = new getModels(getcontentdatatype, dataModule_ProvideSchedulerFactory, new acquire(mergejsonobjects5, getstyleable_vector_drawable_group_rotation.AlertControllerButtonHandler, 18), new readInstallReferrerHuaweiAppGallery(19), simpleExecutableQuery2, performpushdeliveryflushlambda0, getstyleable_vector_drawable_group_rotation.AppCompatTextHelper1);
                setdefaultnotificationchannelname.MediaBrowserCompatMediaItem = new getModels(1, executequery5, lambda31Var, mergejsonobjects5, r8lambdagjlqvkshrnmp25jfhdbcpsguwkq, mergejsonobjects4, mergejsonobjects6, getstyleable_vector_drawable_group_rotation.trimToSize);
                setdefaultnotificationchannelname.MediaMetadataCompat = new executeQuery(getcontentdatatype, 24);
                setdefaultnotificationchannelname.MediaDescriptionCompat = new executeQuery(setpresentationview, 22);
                setdefaultnotificationchannelname.MediaSessionCompatToken = new acquire(mergejsonobjects7, getstyleable_vector_drawable_group_rotation.onConsumedWindowInsetsChanged, 19);
                simpleExecutableQuery.getClass();
                getInvisibleToUserannotations getinvisibletouserannotations = new getInvisibleToUserannotations(simpleExecutableQuery);
                setStateDescription setstatedescription = getstyleable_vector_drawable_group_rotation.CameraManagerCompatApi30Impl;
                setdefaultnotificationchannelname.ParcelableVolumeInfo = new r8lambda4qmPbs3swzMG_sQ6Wvv9rB3jZw(setstatedescription, (executeQuery) setdefaultnotificationchannelname.MediaMetadataCompat, (executeQuery) setdefaultnotificationchannelname.MediaDescriptionCompat, (acquire) setdefaultnotificationchannelname.MediaSessionCompatToken, getstyleable_vector_drawable_group_rotation.getTrackDrawable, getstyleable_vector_drawable_group_rotation.minIntrinsicWidth, new r8lambdamcfkChlmwyb5a6y_ZoPzJd5UQ4(getinvisibletouserannotations, setstatedescription, getstyleable_vector_drawable_group_rotation.offsetVpY3zN4default, getstyleable_vector_drawable_group_rotation.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1, getstyleable_vector_drawable_group_rotation.ComponentActivity, 6), getstyleable_vector_drawable_group_rotation.TextLinkScope, getstyleable_vector_drawable_group_rotation.onConfigurationChanged);
                setdefaultnotificationchannelname.PlaybackStateCompatCustomAction = getDoubleOrNull.write(new nextmlRZEE(new GetAppStateImpl(4, new executeQuery(setstatedescription, 20))));
                mergeJsonObjects mergejsonobjects9 = getstyleable_vector_drawable_group_rotation.toClipEntry;
                setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime = getstyleable_vector_drawable_group_rotation.AuthenticatorUtils;
                mergeJsonObjects mergejsonobjects10 = getstyleable_vector_drawable_group_rotation.getActionBarHideOffset;
                mergejsonobjects9.getClass();
                setusetemptrackingtableroom_runtime.getClass();
                mergejsonobjects10.getClass();
                ShouldShowHeatmap_Factory shouldShowHeatmap_Factory = new ShouldShowHeatmap_Factory(mergejsonobjects9, setusetemptrackingtableroom_runtime, mergejsonobjects10, 1);
                hasNestedScrollingParent hasnestedscrollingparent = getstyleable_vector_drawable_group_rotation.AbstractClickableNodeonKeyEvent1;
                executeQuery executequery9 = new executeQuery(hasnestedscrollingparent, 25);
                mergeJsonObjects mergejsonobjects11 = getstyleable_vector_drawable_group_rotation.toClipEntry;
                lambda31 lambda31Var2 = new lambda31(mergejsonobjects11, (getColorIntegerOrNulllambda0) shouldShowHeatmap_Factory, (getColorIntegerOrNulllambda0) executequery9, 7);
                executeQuery executequery10 = new executeQuery(hasnestedscrollingparent, 26);
                lambdaprocessAndResolveDeeplink15 lambdaprocessandresolvedeeplink15 = new lambdaprocessAndResolveDeeplink15(getstyleable_vector_drawable_group_rotation.Contentfoundation, 1);
                applyLayoutFeatures applylayoutfeatures2 = new applyLayoutFeatures(getstyleable_vector_drawable_group_rotation.setItemInvoker, getstyleable_vector_drawable_group_rotation.removeOnConfigurationChangedListener, hasnestedscrollingparent, 11);
                setdefaultnotificationchannelname.PlaybackStateCompat = applylayoutfeatures2;
                setdefaultnotificationchannelname.MediaSessionCompatResultReceiverWrapper = new PreferenceGroupAdapter((getColorIntegerOrNulllambda0) lambda31Var2, (mergeJsonObjects) new getDataStoreFileName(mergejsonobjects11, shouldShowHeatmap_Factory, executequery10, lambdaprocessandresolvedeeplink15, applylayoutfeatures2, getstyleable_vector_drawable_group_rotation.trimToSize), 8);
                setdefaultnotificationchannelname.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new SimpleExecutableQuery(getstyleable_vector_drawable_group_rotation.DragGestureNodestartListeningForEvents1, 8);
                lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase45 = getstyleable_vector_drawable_group_rotation.ContextMenuUiKt;
                convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0 = getstyleable_vector_drawable_group_rotation.ComponentActivity;
                setdefaultnotificationchannelname.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new newTransaction(lambdaverifyplaystorepurchase45, convertstringjsonarraytolistlambda0, 9);
                requestBannersRefreshlambda1 requestbannersrefreshlambda1 = getstyleable_vector_drawable_group_rotation.TextStringSimpleElement;
                setPresentationView setpresentationview2 = getstyleable_vector_drawable_group_rotation.createnHHXs2Y;
                requestbannersrefreshlambda1.getClass();
                convertstringjsonarraytolistlambda0.getClass();
                setpresentationview2.getClass();
                isHiddenannotations ishiddenannotations2 = new isHiddenannotations(getstyleable_vector_drawable_group_rotation.LazyColumn, new ShouldShowHeatmap_Factory(requestbannersrefreshlambda1, convertstringjsonarraytolistlambda0, setpresentationview2, 20), getstyleable_vector_drawable_group_rotation.fullyDrawnReporter_delegatelambda00, new SimpleExecutableQuery(getstyleable_vector_drawable_group_rotation.onConfigurationChanged, 9), 6);
                executeQuery executequery11 = new executeQuery(getstyleable_vector_drawable_group_rotation.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, 23);
                getShapedelegate getshapedelegate = getstyleable_vector_drawable_group_rotation.HorizontalPager8jOkeI;
                lambdaverifyPlayStorePurchase45 lambdaverifyplaystorepurchase46 = getstyleable_vector_drawable_group_rotation.removeCloseableactivity;
                mergeJsonObjects mergejsonobjects12 = getstyleable_vector_drawable_group_rotation.Contentfoundation;
                r8lambda4ctur6dHthQRF8ridJfgtUMxjY0 r8lambda4ctur6dhthqrf8ridjfgtumxjy0 = new r8lambda4ctur6dHthQRF8ridJfgtUMxjY0(1, lambdaverifyplaystorepurchase46, getshapedelegate, mergejsonobjects12, getstyleable_vector_drawable_group_rotation.setExpandedFormat, getstyleable_vector_drawable_group_rotation.CaptureSessionOnClosedNotCalledQuirk);
                mergeJsonObjects mergejsonobjects13 = getstyleable_vector_drawable_group_rotation.FlingCancellationException;
                PreferenceGroupAdapter preferenceGroupAdapter = (PreferenceGroupAdapter) setdefaultnotificationchannelname.MediaSessionCompatResultReceiverWrapper;
                applyLayoutFeatures applylayoutfeatures3 = (applyLayoutFeatures) setdefaultnotificationchannelname.PlaybackStateCompat;
                setPaddingBottom setpaddingbottom = getstyleable_vector_drawable_group_rotation.PlatformMagnifierFactoryApi29ImplPlatformMagnifierImpl;
                SimpleExecutableQuery simpleExecutableQuery3 = (SimpleExecutableQuery) setdefaultnotificationchannelname.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                invokeqtAw6s invokeqtaw6s = getstyleable_vector_drawable_group_rotation.Arrangement;
                newTransaction newtransaction2 = (newTransaction) setdefaultnotificationchannelname.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                getDoubleOrNull getdoubleornull = getstyleable_vector_drawable_group_rotation.access1101;
                getDoubleOrNull getdoubleornull2 = getstyleable_vector_drawable_group_rotation.hasOverlappingRendering;
                setStateDescription setstatedescription2 = getstyleable_vector_drawable_group_rotation.PredictiveBackHandlerKtPredictiveBackHandlerlambda30inlinedonStopOrDispose1;
                isShowingTextSubstitutiondelegate isshowingtextsubstitutiondelegate = getstyleable_vector_drawable_group_rotation.SelectionMagnifierKt;
                getContentDataType getcontentdatatype2 = getstyleable_vector_drawable_group_rotation.getSurfaceClass;
                publishErrorlambda1 publisherrorlambda1 = getstyleable_vector_drawable_group_rotation.CameraUseCaseAdapterCameraException;
                com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory2 = getstyleable_vector_drawable_group_rotation.TextLinkScope;
                getVerticalScrollAxisRangedelegate getverticalscrollaxisrangedelegate2 = getstyleable_vector_drawable_group_rotation.IncorrectJpegMetadataQuirk;
                setDefaultNotificationChannelName setdefaultnotificationchannelname2 = new setDefaultNotificationChannelName();
                setdefaultnotificationchannelname2.read = mergejsonobjects13;
                setdefaultnotificationchannelname2.serializer = preferenceGroupAdapter;
                setdefaultnotificationchannelname2.RemoteActionCompatParcelizer = applylayoutfeatures3;
                setdefaultnotificationchannelname2.write = setpaddingbottom;
                setdefaultnotificationchannelname2.IconCompatParcelizer = getshapedelegate;
                setdefaultnotificationchannelname2.RatingCompat = simpleExecutableQuery3;
                setdefaultnotificationchannelname2.MediaSessionCompatQueueItem = invokeqtaw6s;
                setdefaultnotificationchannelname2.MediaBrowserCompatMediaItem = newtransaction2;
                setdefaultnotificationchannelname2.MediaMetadataCompat = getdoubleornull;
                setdefaultnotificationchannelname2.MediaDescriptionCompat = getdoubleornull2;
                setdefaultnotificationchannelname2.MediaSessionCompatToken = setstatedescription2;
                setdefaultnotificationchannelname2.ParcelableVolumeInfo = isshowingtextsubstitutiondelegate;
                setdefaultnotificationchannelname2.PlaybackStateCompatCustomAction = getcontentdatatype2;
                setdefaultnotificationchannelname2.PlaybackStateCompat = publisherrorlambda1;
                setdefaultnotificationchannelname2.MediaSessionCompatResultReceiverWrapper = ishiddenannotations2;
                setdefaultnotificationchannelname2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = dataModule_ProvideSchedulerFactory2;
                setdefaultnotificationchannelname2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = executequery11;
                setdefaultnotificationchannelname2.ComponentActivity = r8lambda4ctur6dhthqrf8ridjfgtumxjy0;
                setdefaultnotificationchannelname2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mergejsonobjects12;
                setdefaultnotificationchannelname2.ResultReceiver = getverticalscrollaxisrangedelegate2;
                setdefaultnotificationchannelname.ComponentActivity = getDoubleOrNull.write(new AndroidSqliteDriverstatements1(setdefaultnotificationchannelname2));
                setdefaultnotificationchannelname.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = getDoubleOrNull.write(new bf(new i$c(getstyleable_vector_drawable_group_rotation.CoreTextFieldKt, getstyleable_vector_drawable_group_rotation.setIcon, new lambda31((mergeJsonObjects) getstyleable_vector_drawable_group_rotation.CameraManagerCompatApi30Impl, (getColorIntegerOrNulllambda0) new executeQuery(getstyleable_vector_drawable_group_rotation.ScrollableKt, 21), (getColorIntegerOrNulllambda0) getstyleable_vector_drawable_group_rotation.ParcelableVolumeInfo, 5), getstyleable_vector_drawable_group_rotation.removeCloseableactivity, getstyleable_vector_drawable_group_rotation.Contentfoundation, getstyleable_vector_drawable_group_rotation.SnapFlingBehavior, getstyleable_vector_drawable_group_rotation.setExpandedFormat, (applyLayoutFeatures) setdefaultnotificationchannelname.PlaybackStateCompat, getstyleable_vector_drawable_group_rotation.LazyDslKt)));
                setdefaultnotificationchannelname.ResultReceiver = getDoubleOrNull.write(new bindDouble(new SqlPreparedStatement(getstyleable_vector_drawable_group_rotation.setItemInvoker)));
                return setdefaultnotificationchannelname;
            case 12:
                ((LogoutActivity) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_NAME(getstyleable_vector_drawable_group_rotation, 0);
            case 13:
                ((NafathModalFragment) obj).getClass();
                Recorder$3 recorder$3 = new Recorder$3(getstyleable_vector_drawable_group_rotation, 19);
                int i6 = write + 41;
                IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return recorder$3;
            case 14:
                ((NonFloatablePermissionActivity) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_NAME(getstyleable_vector_drawable_group_rotation, 3);
            case 15:
                ((OneClickStartWorkingFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(getstyleable_vector_drawable_group_rotation, 2);
            case 16:
                ((OrderDetailsFragment) obj).getClass();
                return new i$d(getstyleable_vector_drawable_group_rotation, 18);
            case 17:
                ((OverlayPermissionDialogFragment) obj).getClass();
                return new accessgetTvTeletextcp(getstyleable_vector_drawable_group_rotation, 8);
            case 18:
                ((MessageDialogFragment) obj).getClass();
                return new accessgetGreencp(getstyleable_vector_drawable_group_rotation, 22);
            case 19:
                ((PermissionActivity) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_NAME(getstyleable_vector_drawable_group_rotation, 4);
            case 20:
                ((PhotoIdPreviewFragment) obj).getClass();
                return new Recorder$3(getstyleable_vector_drawable_group_rotation, 20);
            case 21:
                ((PhotoSharedSuccessDialogFragment) obj).getClass();
                return new DaggerApplicationComponent$DeepLinkActivitySubcomponentImpl(getstyleable_vector_drawable_group_rotation, i3);
            case 22:
                ((PinScreenFragment) obj).getClass();
                getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y getstyleable_vector_drawable_group_scale_y = new getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(getstyleable_vector_drawable_group_rotation, 3);
                int i8 = write + 43;
                IconCompatParcelizer = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 35 / 0;
                }
                return getstyleable_vector_drawable_group_scale_y;
            case 23:
                ((QrPaymentScreenFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(getstyleable_vector_drawable_group_rotation, 0);
            case 24:
                ((QrScannerFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_NAME(getstyleable_vector_drawable_group_rotation, 5);
            case 25:
                ((RecentDeliveriesFragment) obj).getClass();
                return new Recorder$3(getstyleable_vector_drawable_group_rotation, 21);
            case 26:
                ((RequestBreakFragment) obj).getClass();
                i$d i_d = new i$d(getstyleable_vector_drawable_group_rotation, 19);
                int i10 = IconCompatParcelizer + 79;
                write = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                return i_d;
            case 27:
                ((RiderHiringWebViewFragment) obj).getClass();
                return new getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(getstyleable_vector_drawable_group_rotation, 1);
            case 28:
                ((RiderSafetyPermissionFragment) obj).getClass();
                return new com.airbnb.lottie.parser.DropShadowEffect(getstyleable_vector_drawable_group_rotation, 6);
            default:
                ((RiderSafetyReportFragment) obj).getClass();
                return new accessgetGreencp(getstyleable_vector_drawable_group_rotation, 23);
        }
    }
}
