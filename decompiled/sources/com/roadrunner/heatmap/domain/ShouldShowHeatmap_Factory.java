package com.roadrunner.heatmap.domain;

import android.app.Application;
import android.content.SharedPreferences;
import androidx.compose.ui.graphics.Fields;
import androidx.datastore.preferences.core.PreferencesSerializer;
import com.data.injection.DataModule_ProvideSchedulerFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.autoaccept.domain.AutoAcceptNotificationMapperImpl;
import com.roadrunner.delivery.accept.autoaccept.notification.ShowNotification;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.delivery.accept.backToBackOrder.domain.GetBackToBackOrdersDataImpl;
import com.roadrunner.delivery.accept.backToBackOrder.domain.ObserveBackToBackOrdersStateImpl;
import com.roadrunner.delivery.accept.domain.AutoAcceptDeliveryImpl;
import com.roadrunner.delivery.accept.domain.StoreAutoAcceptedDeliveryIdsImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.NavigationSettingsDialogManagerImpl;
import com.roadrunner.delivery.ontheway.turnbyturn.settings.domain.onboarding.ShouldShowTooltip;
import com.roadrunner.freelancing.domain.GetWorkNowOpportunity;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.logger.logger.perseus.PerseusUserAttributesChangedListener;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.map.container.safearea.SafeAreaPublisherImpl;
import com.roadrunner.map.integration.mapbox.camera.CalculateSafeAreaUseCase;
import com.roadrunner.notifications.PendingIntentBuilderImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import com.roadrunner.remoteconfig.firebase.data.FirebaseRemoteConfigProvider;
import com.roadrunner.rider.recruitment.applicant.domain.AddRiderHiringQueryParamsImpl;
import com.roadrunner.rider.recruitment.applicant.domain.GetBecomeRiderUriImpl;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import dagger.Lazy;
import io.grpc.internal.SharedResourcePool;
import io.sentry.CombinedScopeView;
import io.sentry.util.MediaBrowserCompatMediaItem;
import io.sentry.util.UrlUtils;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AbsSavedState;
import o.EmptyFillMeasurePolicymeasure1;
import o.FontVariationSetting;
import o.LayoutCompat;
import o.LineBreakSaverlambda0;
import o.LineBreak_androidKt;
import o.RectManager;
import o.Savers_androidKt;
import o.SemanticsInfoKt;
import o.SemanticsPropertiesLinkTestMarker1;
import o.TextMotionLinearitySaverlambda0;
import o.TextMotionSaverlambda0;
import o.WordIterator;
import o.WorkManagerImpl;
import o.access1200;
import o.accessgetOldDependencyp;
import o.accessisMainThread;
import o.accessunpackByte3;
import o.and;
import o.backgroundTimerFiredI;
import o.convertStringJsonArrayToListlambda0;
import o.copy8_81llAdefault;
import o.decode;
import o.deleteGlobalPartnerParameters;
import o.endFirstSessionDelay;
import o.fillLineHorizontalBoundsui_text;
import o.first;
import o.foregroundTimerFired;
import o.getActionViewIntentlambda0;
import o.getAllSemanticsNodesToMap;
import o.getColorIntegerOrNull;
import o.getColorIntegerOrNulllambda0;
import o.getContentDataType;
import o.getContentViewGroupParentLayout;
import o.getDoubleOrNull;
import o.getIdentifiersValidationsEnabled;
import o.getLeftIndents;
import o.getLooseusljTpc;
import o.getNeedsDensityui_text;
import o.getOnBackInvokedCallback;
import o.getParagraphForOffset;
import o.getRangeForRect;
import o.getScrollRange;
import o.getSharedElementTargetNames;
import o.getTextDirectionHeuristic;
import o.getUnspecifiedusljTpc;
import o.hasNestedScrollingParent;
import o.i0;
import o.i3;
import o.ib;
import o.inCompatibilityMode;
import o.invokeSuspendcomroadrunnercustomerchatusecaseChatAssetDownloadingObserverImplonCreate111;
import o.isDisabled;
import o.isOpenInternalroom_runtime;
import o.isStateSaved;
import o.lineEndToVisibleEnd;
import o.loadBlocking;
import o.o1;
import o.oc;
import o.packBytes;
import o.performPushDeliveryFlushlambda0;
import o.prepareForActivityTransitionCarryover;
import o.publishErrorlambda1;
import o.qb;
import o.qdExternalSyntheticLambda0;
import o.r1;
import o.r8lambda3kVrWtRC8n86EcXsBaaaVTQnb4;
import o.r8lambda6UOvp7lvejigbq5knKoP8A0vEiw;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU;
import o.r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I;
import o.r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo;
import o.r8lambdazvX83UIDsL68vmN7rPQXcY0mE;
import o.readObject;
import o.removeRearDisplayPresentationStatusListener;
import o.setFirstHorizontalStyle;
import o.setFirstVerticalBias;
import o.setHasOptionsMenu;
import o.setHorizontalStyle;
import o.setNextTransition;
import o.setPopDirection;
import o.setPresentationView;
import o.setStateDescription;
import o.setTransacterruntime;
import o.setTransactionSuccessful;
import o.setUseTempTrackingTableroom_runtime;
import o.setVerticalStyle;
import o.subscribeToContentCardsUpdateslambda30;
import o.transactionWithResultsuspendImpl;
import o.transactiondefault;
import o.transferSessionPackageI;
import o.transformCanvas;
import o.vg;

/* JADX INFO: loaded from: classes3.dex */
public final class ShouldShowHeatmap_Factory implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3, int i) {
        this.serializer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq3.getClass();
        if (i == 11) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
            return;
        }
        if (i == 15) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        } else if (i == 20) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        } else if (i != 22) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        } else {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq3;
        }
    }

    public ShouldShowHeatmap_Factory(SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, AbsSavedState absSavedState, LayoutCompat layoutCompat, int i) {
        this.serializer = i;
        semanticsPropertiesLinkTestMarker1.getClass();
        absSavedState.getClass();
        layoutCompat.getClass();
        if (i != 13) {
            this.write = semanticsPropertiesLinkTestMarker1;
            this.read = absSavedState;
            this.RemoteActionCompatParcelizer = layoutCompat;
        } else {
            this.write = semanticsPropertiesLinkTestMarker1;
            this.read = absSavedState;
            this.RemoteActionCompatParcelizer = layoutCompat;
        }
    }

    public ShouldShowHeatmap_Factory(setStateDescription setstatedescription, transactionWithResultsuspendImpl transactionwithresultsuspendimpl, publishErrorlambda1 publisherrorlambda1) {
        this.serializer = 29;
        setstatedescription.getClass();
        transactionwithresultsuspendimpl.getClass();
        publisherrorlambda1.getClass();
        this.write = setstatedescription;
        this.read = transactionwithresultsuspendimpl;
        this.RemoteActionCompatParcelizer = publisherrorlambda1;
    }

    public ShouldShowHeatmap_Factory(lineEndToVisibleEnd lineendtovisibleend, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 4;
        lineendtovisibleend.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = lineendtovisibleend;
        this.read = semanticsPropertiesLinkTestMarker1;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public ShouldShowHeatmap_Factory(lineEndToVisibleEnd lineendtovisibleend, o1 o1Var, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory) {
        this.serializer = 6;
        lineendtovisibleend.getClass();
        o1Var.getClass();
        shouldShowHeatmap_Factory.getClass();
        this.write = lineendtovisibleend;
        this.read = o1Var;
        this.RemoteActionCompatParcelizer = shouldShowHeatmap_Factory;
    }

    public ShouldShowHeatmap_Factory(getSharedElementTargetNames getsharedelementtargetnames, setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 16;
        getsharedelementtargetnames.getClass();
        setusetemptrackingtableroom_runtime.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = getsharedelementtargetnames;
        this.read = setusetemptrackingtableroom_runtime;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public ShouldShowHeatmap_Factory(hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 18;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = hasnestedscrollingparent;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public ShouldShowHeatmap_Factory(publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 17;
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = publisherrorlambda1;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public ShouldShowHeatmap_Factory(getDoubleOrNull getdoubleornull, getDoubleOrNull getdoubleornull2, getDoubleOrNull getdoubleornull3, int i) {
        this.serializer = i;
        getdoubleornull.getClass();
        getdoubleornull2.getClass();
        getdoubleornull3.getClass();
        if (i != 8) {
            this.write = getdoubleornull;
            this.read = getdoubleornull2;
            this.RemoteActionCompatParcelizer = getdoubleornull3;
        } else {
            this.write = getdoubleornull;
            this.read = getdoubleornull2;
            this.RemoteActionCompatParcelizer = getdoubleornull3;
        }
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.serializer = 5;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
        this.RemoteActionCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, backgroundTimerFiredI backgroundtimerfiredi, getContentDataType getcontentdatatype) {
        this.serializer = 10;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        backgroundtimerfiredi.getClass();
        getcontentdatatype.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = backgroundtimerfiredi;
        this.RemoteActionCompatParcelizer = getcontentdatatype;
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, publishErrorlambda1 publisherrorlambda1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 0;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        publisherrorlambda1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = publisherrorlambda1;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview) {
        this.serializer = 2;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, SemanticsPropertiesLinkTestMarker1 semanticsPropertiesLinkTestMarker1, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 21;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        semanticsPropertiesLinkTestMarker1.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = semanticsPropertiesLinkTestMarker1;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public ShouldShowHeatmap_Factory(DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, getScrollRange getscrollrange, r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i) {
        this.serializer = 14;
        dataModule_ProvideSchedulerFactory.getClass();
        getscrollrange.getClass();
        r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i.getClass();
        this.write = dataModule_ProvideSchedulerFactory;
        this.read = getscrollrange;
        this.RemoteActionCompatParcelizer = r8lambdazxn1qqqhlyzddsf7dmtrye1xu8i;
    }

    public ShouldShowHeatmap_Factory(r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo r8lambdazphrebez5dkhsk62azggxj52jpo, lineEndToVisibleEnd lineendtovisibleend, transformCanvas transformcanvas) {
        this.serializer = 3;
        r8lambdazphrebez5dkhsk62azggxj52jpo.getClass();
        lineendtovisibleend.getClass();
        transformcanvas.getClass();
        this.write = r8lambdazphrebez5dkhsk62azggxj52jpo;
        this.read = lineendtovisibleend;
        this.RemoteActionCompatParcelizer = transformcanvas;
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, lineEndToVisibleEnd lineendtovisibleend) {
        this.serializer = 9;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        lineendtovisibleend.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = lineendtovisibleend;
    }

    public ShouldShowHeatmap_Factory(hasNestedScrollingParent hasnestedscrollingparent, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me, r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me2) {
        this.serializer = 26;
        hasnestedscrollingparent.getClass();
        r8lambdazvx83uidsl68vmn7rpqxcy0me.getClass();
        r8lambdazvx83uidsl68vmn7rpqxcy0me2.getClass();
        this.write = hasnestedscrollingparent;
        this.read = r8lambdazvx83uidsl68vmn7rpqxcy0me;
        this.RemoteActionCompatParcelizer = r8lambdazvx83uidsl68vmn7rpqxcy0me2;
    }

    public ShouldShowHeatmap_Factory(r8lambdazvX83UIDsL68vmN7rPQXcY0mE r8lambdazvx83uidsl68vmn7rpqxcy0me, backgroundTimerFiredI backgroundtimerfiredi, backgroundTimerFiredI backgroundtimerfiredi2) {
        this.serializer = 25;
        r8lambdazvx83uidsl68vmn7rpqxcy0me.getClass();
        backgroundtimerfiredi.getClass();
        backgroundtimerfiredi2.getClass();
        this.write = r8lambdazvx83uidsl68vmn7rpqxcy0me;
        this.read = backgroundtimerfiredi;
        this.RemoteActionCompatParcelizer = backgroundtimerfiredi2;
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2) {
        this.serializer = 19;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = setpresentationview;
        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
    }

    public ShouldShowHeatmap_Factory(hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview, DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.serializer = 28;
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        this.write = hasnestedscrollingparent;
        this.read = setpresentationview;
        this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
    }

    public ShouldShowHeatmap_Factory(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, hasNestedScrollingParent hasnestedscrollingparent, setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, performPushDeliveryFlushlambda0 performpushdeliveryflushlambda0, setPresentationView setpresentationview) {
        this.serializer = 27;
        hasnestedscrollingparent.getClass();
        setusetemptrackingtableroom_runtime.getClass();
        performpushdeliveryflushlambda0.getClass();
        this.write = hasnestedscrollingparent;
        this.read = setusetemptrackingtableroom_runtime;
        this.RemoteActionCompatParcelizer = performpushdeliveryflushlambda0;
    }

    public ShouldShowHeatmap_Factory(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview) {
        this.serializer = 24;
        convertstringjsonarraytolistlambda0.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.write = convertstringjsonarraytolistlambda0;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public ShouldShowHeatmap_Factory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, setPresentationView setpresentationview, byte b) {
        this.serializer = 23;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        setpresentationview.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.serializer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.RemoteActionCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq3 = this.write;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite2.getClass();
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite3.getClass();
                return new invokeSuspendcomroadrunnercustomerchatusecaseChatAssetDownloadingObserverImplonCreate111((getNeedsDensityui_text) objWrite, (GetRiderStatusImpl) objWrite2, (transferSessionPackageI) objWrite3);
            case 1:
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite4.getClass();
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new SemanticsInfoKt((setTransactionSuccessful) objWrite4, (setTransacterruntime) objWrite5, (setVerticalStyle) objWrite6);
            case 2:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite8.getClass();
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite9.getClass();
                return new EmptyFillMeasurePolicymeasure1((decode) objWrite7, (getContentViewGroupParentLayout) objWrite8, (isOpenInternalroom_runtime) objWrite9);
            case 3:
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite10.getClass();
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite11.getClass();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                ProtobufEncoder protobufEncoder = new ProtobufEncoder();
                protobufEncoder.write = (AutoAcceptDeliveryImpl) objWrite10;
                protobufEncoder.serializer = (StoreAutoAcceptedDeliveryIdsImpl) objWrite11;
                protobufEncoder.RemoteActionCompatParcelizer = (TextMotionLinearitySaverlambda0) objWrite12;
                return protobufEncoder;
            case 4:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite14.getClass();
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite15.getClass();
                TextMotionSaverlambda0 textMotionSaverlambda0 = new TextMotionSaverlambda0((LineBreakSaverlambda0) objWrite13, (FontVariationSetting) objWrite14, (Savers_androidKt) objWrite15);
                int i3 = IconCompatParcelizer + 93;
                MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return textMotionSaverlambda0;
            case 5:
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite16.getClass();
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new ShowNotification((deleteGlobalPartnerParameters) objWrite16, (PendingIntentBuilderImpl) objWrite17, (AutoAcceptNotificationMapperImpl) objWrite18);
            case 6:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite19.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite20.getClass();
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite21.getClass();
                return new ObserveBackToBackOrdersStateImpl((GetBackToBackOrdersDataImpl) objWrite19, (BackToBackOrdersDataRepositoryImpl) objWrite20, (TextMotionSaverlambda0) objWrite21);
            case 7:
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite22.getClass();
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new SignInDataStore((first) objWrite22, (loadBlocking) objWrite23, (WordIterator) objWrite24);
            case 8:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite25.getClass();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite26.getClass();
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite27.getClass();
                return new SignInDataStore((getParagraphForOffset) objWrite25, (getTextDirectionHeuristic) objWrite26, (getLeftIndents) objWrite27);
            case 9:
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite28.getClass();
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer.getClass();
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite29.getClass();
                return new SignInDataStore((getRangeForRect) objWrite28, lazySerializer, (fillLineHorizontalBoundsui_text) objWrite29);
            case 10:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite30.getClass();
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite31.getClass();
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                return new getUnspecifiedusljTpc((decode) objWrite30, (oc) objWrite31, (accessgetOldDependencyp) objWrite32);
            case 11:
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite33.getClass();
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite34.getClass();
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite35.getClass();
                return new LineBreak_androidKt((setTransactionSuccessful) objWrite33, (transferSessionPackageI) objWrite34, (SharedPreferences) objWrite35);
            case 12:
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite36.getClass();
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite37.getClass();
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite38.getClass();
                return new NavigationSettingsDialogManagerImpl((accessunpackByte3) objWrite36, (copy8_81llAdefault) objWrite37, (packBytes) objWrite38);
            case 13:
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite39.getClass();
                Object objWrite40 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite40.getClass();
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite41.getClass();
                return new ShouldShowTooltip((accessunpackByte3) objWrite39, (copy8_81llAdefault) objWrite40, (packBytes) objWrite41);
            case 14:
                getActionViewIntentlambda0 getactionviewintentlambda0 = new getActionViewIntentlambda0();
                Object objWrite42 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite42.getClass();
                Object objWrite43 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite43.getClass();
                Object objWrite44 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite44.getClass();
                return new setFirstHorizontalStyle(getactionviewintentlambda0, (getAllSemanticsNodesToMap) objWrite42, (setHorizontalStyle) objWrite43, (setFirstVerticalBias) objWrite44);
            case 15:
                Object objWrite45 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite45.getClass();
                Object objWrite46 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite46.getClass();
                Object objWrite47 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite47.getClass();
                return new ProtobufEncoder((GetWorkNowOpportunity) objWrite45, (removeRearDisplayPresentationStatusListener) objWrite46, (vg) objWrite47);
            case 16:
                Object objWrite48 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite48.getClass();
                Object objWrite49 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite49.getClass();
                Object objWrite50 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite50.getClass();
                return new setNextTransition((setHasOptionsMenu) objWrite48, (setPopDirection) objWrite49, (getContentViewGroupParentLayout) objWrite50);
            case 17:
                Object objWrite51 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite51.getClass();
                Object objWrite52 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite52.getClass();
                Object objWrite53 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite53.getClass();
                return new WorkManagerImpl((GetRiderStatusImpl) objWrite51, (transferSessionPackageI) objWrite52, (getContentViewGroupParentLayout) objWrite53);
            case 18:
                Object objWrite54 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite54.getClass();
                Object objWrite55 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite55.getClass();
                Object objWrite56 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite56.getClass();
                return new CombinedScopeView((Application) objWrite54, (decode) objWrite55, (getContentViewGroupParentLayout) objWrite56, 12);
            case 19:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq3);
                lazySerializer2.getClass();
                Lazy lazySerializer3 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) transactiondefault.read);
                lazySerializer3.getClass();
                Object objWrite57 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite57.getClass();
                Object objWrite58 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite58.getClass();
                return new PerseusUserAttributesChangedListener(lazySerializer2, lazySerializer3, (isOpenInternalroom_runtime) objWrite57, (getContentViewGroupParentLayout) objWrite58);
            case 20:
                Object objWrite59 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite59.getClass();
                Object objWrite60 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite60.getClass();
                Object objWrite61 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite61.getClass();
                RouterLogger routerLogger = new RouterLogger((r8lambda3kVrWtRC8n86EcXsBaaaVTQnb4) objWrite59, (AppEventInfoChangeHandler) objWrite60, (isOpenInternalroom_runtime) objWrite61, 23);
                int i5 = IconCompatParcelizer + 109;
                MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return routerLogger;
            case 21:
                Object objWrite62 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite62.getClass();
                Object objWrite63 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite63.getClass();
                Object objWrite64 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite64.getClass();
                return new i0((transferSessionPackageI) objWrite62, (getLooseusljTpc) objWrite63, (i3) objWrite64);
            case 22:
                Object objWrite65 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite65.getClass();
                Object objWrite66 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite66.getClass();
                Object objWrite67 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite67.getClass();
                CalculateSafeAreaUseCase calculateSafeAreaUseCase = new CalculateSafeAreaUseCase((SafeAreaPublisherImpl) objWrite65, (ib) objWrite66, (isStateSaved) objWrite67, new accessisMainThread());
                int i7 = IconCompatParcelizer + 113;
                MediaDescriptionCompat = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    return calculateSafeAreaUseCase;
                }
                throw null;
            case 23:
                Lazy lazySerializer4 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq3);
                lazySerializer4.getClass();
                Object objWrite68 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite68.getClass();
                Object objWrite69 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite69.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = new getIdentifiersValidationsEnabled();
                getidentifiersvalidationsenabled.read = new qb(lazySerializer4);
                getidentifiersvalidationsenabled.write((r1) objWrite69);
                getidentifiersvalidationsenabled.write((qdExternalSyntheticLambda0) objWrite68);
                return getidentifiersvalidationsenabled;
            case 24:
                Lazy lazySerializer5 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq3);
                lazySerializer5.getClass();
                Object objWrite70 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite70.getClass();
                Object objWrite71 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite71.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = new getIdentifiersValidationsEnabled();
                getidentifiersvalidationsenabled2.read = new qb(lazySerializer5);
                getidentifiersvalidationsenabled2.write((r1) objWrite71);
                getidentifiersvalidationsenabled2.write((qdExternalSyntheticLambda0) objWrite70);
                return getidentifiersvalidationsenabled2;
            case 25:
                Lazy lazySerializer6 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq3);
                lazySerializer6.getClass();
                Lazy lazySerializer7 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer7.getClass();
                Lazy lazySerializer8 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq);
                lazySerializer8.getClass();
                return new r8lambdaxXjW7P_AvkpTNfi9yKZ8umnanKU(lazySerializer6, lazySerializer7, lazySerializer8);
            case 26:
                Object objWrite72 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite72.getClass();
                Lazy lazySerializer9 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer9.getClass();
                Lazy lazySerializer10 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq);
                lazySerializer10.getClass();
                return new access1200((Application) objWrite72, lazySerializer9, lazySerializer10);
            case 27:
                Object objWrite73 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite73.getClass();
                Object objWrite74 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite74.getClass();
                Object objWrite75 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite75.getClass();
                inCompatibilityMode incompatibilitymode = new inCompatibilityMode();
                FirebaseRemoteConfig firebaseRemoteConfigWrite = ((RemoteConfigComponent) FirebaseApp.write().write(RemoteConfigComponent.class)).write("firebase");
                firebaseRemoteConfigWrite.getClass();
                SharedResourcePool sharedResourcePool = new SharedResourcePool(firebaseRemoteConfigWrite);
                SharedPreferences sharedPreferences = ((Application) objWrite73).getSharedPreferences("firebase_remote_config_prefs", 0);
                sharedPreferences.getClass();
                return new FirebaseRemoteConfigImpl(new FirebaseRemoteConfigProvider(firebaseRemoteConfigWrite, sharedResourcePool, new SaveHeatmapUrlImpl(21, sharedPreferences), incompatibilitymode), (setTransacterruntime) objWrite74, (foregroundTimerFired) objWrite75);
            case 28:
                Object objWrite76 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite76.getClass();
                Object objWrite77 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite77.getClass();
                Object objWrite78 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite78.getClass();
                and andVar = new and(getOnBackInvokedCallback.RemoteActionCompatParcelizer, 7);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                return new endFirstSessionDelay(PreferencesSerializer.write(YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()).plus(andVar)), new subscribeToContentCardsUpdateslambda30((Application) objWrite76, 11), 3), (isOpenInternalroom_runtime) objWrite77, (getAllSemanticsNodesToMap) objWrite78);
            default:
                Object objWrite79 = r8lambdaktwlyipskq3tfa9ey3gatonixfq3.write();
                objWrite79.getClass();
                RectManager rectManager = (RectManager) objWrite79;
                Object objWrite80 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite80.getClass();
                AddRiderHiringQueryParamsImpl addRiderHiringQueryParamsImpl = (AddRiderHiringQueryParamsImpl) objWrite80;
                Object objWrite81 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite81.getClass();
                return new GetBecomeRiderUriImpl(rectManager, addRiderHiringQueryParamsImpl, (readObject) objWrite81, new isDisabled(), new isDisabled());
        }
    }
}
