package com.data.injection;

import android.app.Application;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import androidx.room.Room;
import androidx.work.impl.WorkManagerImpl;
import com.data.util.AndroidScheduleProvider;
import com.deliveryhero.customerchat.CustomerChatModule;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.play.core.appupdate.zzz;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.roadrunner.appperformance.TraceTimeMeasurementWithPerformanceKit;
import com.roadrunner.common.data.api.ExecuteDatabaseRequest;
import com.roadrunner.country.config.implementation.data.CountryConfigListRepository;
import com.roadrunner.country.config.implementation.data.database.CountryConfigDatabase;
import com.roadrunner.country.config.implementation.domain.FetchCountryConfigListImpl;
import com.roadrunner.delivery.accept.acceptbutton.domain.GetDeliveryAcknowledgments;
import com.roadrunner.delivery.accept.acceptbutton.presentation.GetAcceptDetails;
import com.roadrunner.delivery.accept.acknowledgment.implementation.data.TimestampRepositoryImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.CreateHomeScope;
import dagger.Lazy;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.plugins.RxJavaPlugins;
import io.sentry.util.MediaBrowserCompatMediaItem;
import java.time.Clock;
import kotlinx.coroutines.rx2.DispatcherScheduler;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.AndroidUiDispatcherCompanioncurrentThread1;
import o.AndroidUiFrameClock;
import o.FlingCancellationException;
import o.GraphicsLayerCompanion;
import o.LineHeightStyleSaverlambda1;
import o.LocaleListSaverlambda0;
import o.LocaleListSaverlambda1;
import o.SemanticsOwner;
import o.ShadowSaverlambda0;
import o.VerbatimTtsAnnotationSaverlambda1;
import o.accessgetOldDependencyp;
import o.accessrequireViewFactoryHolder;
import o.accesssetDispatchTokenp;
import o.attachToRecyclerView;
import o.boundingRectInRoot;
import o.clearUpdated;
import o.clipRectmtrdDE;
import o.getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent;
import o.getColorIntegerOrNull;
import o.getColorIntegerOrNulllambda0;
import o.getCompositingStrategyke2Ky5w;
import o.getConfirm5zf0vsI;
import o.getContentDataType;
import o.getIdentifiersValidationsEnabled;
import o.getKeyboardTap5zf0vsI;
import o.getSharedElementTargetNames;
import o.getTombStone;
import o.hasNestedScrollingParent;
import o.internalPathIteratorNext;
import o.isOpenInternalroom_runtime;
import o.moveBasedOnParentOffset;
import o.performCustomExitMxy_nc0;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI;
import o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ;
import o.r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY;
import o.registerOnGlobalLayoutCallback;
import o.roleFakeNodeId;
import o.scrollByInternal;
import o.setLastHorizontalStyle;
import o.setPresentationView;
import o.setRoundRectOutlineTNW_H78default;
import o.transferSessionPackageI;
import o.unpackMetaGesturable;
import o.unpackMetaLastChildOffset;
import o.unpackMetaUpdated;
import o.unpackX;
import o.unpackY;
import o.verifyAndTrackPlayStorePurchaseI;

/* JADX INFO: loaded from: classes2.dex */
public final class DataModule_ProvideSchedulerFactory implements getColorIntegerOrNulllambda0 {
    private static int serializer = 1;
    private static int write;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public DataModule_ProvideSchedulerFactory(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.read = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i == 6) {
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 21) {
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        if (i == 29) {
            this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            return;
        }
        switch (i) {
            case 8:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 9:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            case 10:
                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                break;
            default:
                switch (i) {
                    case 13:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 14:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    case 15:
                        this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                        break;
                    default:
                        switch (i) {
                            case 23:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                            case 24:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                            case 25:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                            case 26:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                            default:
                                this.RemoteActionCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
                                break;
                        }
                        break;
                }
                break;
        }
    }

    public DataModule_ProvideSchedulerFactory(DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, int i) {
        this.read = i;
        dataModule_ProvideSchedulerFactory.getClass();
        if (i != 12) {
            this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
        } else {
            this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
        }
    }

    public DataModule_ProvideSchedulerFactory(getContentDataType getcontentdatatype) {
        this.read = 19;
        getcontentdatatype.getClass();
        this.RemoteActionCompatParcelizer = getcontentdatatype;
    }

    public DataModule_ProvideSchedulerFactory(setPresentationView setpresentationview) {
        this.read = 22;
        setpresentationview.getClass();
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public DataModule_ProvideSchedulerFactory(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy) {
        this.read = 1;
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        this.RemoteActionCompatParcelizer = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
    }

    public DataModule_ProvideSchedulerFactory(DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, byte b) {
        this.read = 28;
        dataModule_ProvideSchedulerFactory.getClass();
        this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
    }

    public DataModule_ProvideSchedulerFactory(getSharedElementTargetNames getsharedelementtargetnames) {
        this.read = 7;
        getsharedelementtargetnames.getClass();
        this.RemoteActionCompatParcelizer = getsharedelementtargetnames;
    }

    public DataModule_ProvideSchedulerFactory(FlingCancellationException flingCancellationException, r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi) {
        this.read = 2;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        this.RemoteActionCompatParcelizer = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
    }

    public DataModule_ProvideSchedulerFactory(setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default, setPresentationView setpresentationview) {
        this.read = 0;
        setpresentationview.getClass();
        this.RemoteActionCompatParcelizer = setpresentationview;
    }

    public DataModule_ProvideSchedulerFactory(AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1, hasNestedScrollingParent hasnestedscrollingparent) {
        this.read = 20;
        hasnestedscrollingparent.getClass();
        this.RemoteActionCompatParcelizer = hasnestedscrollingparent;
    }

    public DataModule_ProvideSchedulerFactory(AndroidUiFrameClock androidUiFrameClock, DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.read = 18;
        dataModule_ProvideSchedulerFactory.getClass();
        this.RemoteActionCompatParcelizer = dataModule_ProvideSchedulerFactory;
    }

    public DataModule_ProvideSchedulerFactory(AndroidUiFrameClock androidUiFrameClock, ShouldShowHeatmap_Factory shouldShowHeatmap_Factory) {
        this.read = 17;
        shouldShowHeatmap_Factory.getClass();
        this.RemoteActionCompatParcelizer = shouldShowHeatmap_Factory;
    }

    public DataModule_ProvideSchedulerFactory(AndroidUiFrameClock androidUiFrameClock, hasNestedScrollingParent hasnestedscrollingparent) {
        this.read = 16;
        hasnestedscrollingparent.getClass();
        this.RemoteActionCompatParcelizer = hasnestedscrollingparent;
    }

    public DataModule_ProvideSchedulerFactory(hasNestedScrollingParent hasnestedscrollingparent, int i) {
        this.read = i;
        hasnestedscrollingparent.getClass();
        if (i == 5) {
            this.RemoteActionCompatParcelizer = hasnestedscrollingparent;
        } else if (i != 27) {
            this.RemoteActionCompatParcelizer = hasnestedscrollingparent;
        } else {
            this.RemoteActionCompatParcelizer = hasnestedscrollingparent;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = 5;
        int i3 = 1;
        switch (this.read) {
            case 0:
                Object objWrite = this.RemoteActionCompatParcelizer.write();
                objWrite.getClass();
                AndroidScheduleProvider androidScheduleProvider = new AndroidScheduleProvider();
                RxAndroidPlugins.read = new ScreenStartObserver$$ExternalSyntheticLambda0(25);
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                DispatcherScheduler dispatcherScheduler = new DispatcherScheduler(DefaultIoScheduler.RemoteActionCompatParcelizer);
                DispatcherScheduler dispatcherScheduler2 = new DispatcherScheduler(prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer);
                RxJavaPlugins.RemoteActionCompatParcelizer = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(3, new getCompositingStrategyke2Ky5w(0, dispatcherScheduler));
                RxJavaPlugins.read = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(4, new getCompositingStrategyke2Ky5w(1, dispatcherScheduler2));
                RxJavaPlugins.MediaMetadataCompat = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(i2, new getCompositingStrategyke2Ky5w(2, dispatcherScheduler));
                RxJavaPlugins.write = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(6, new getCompositingStrategyke2Ky5w(3, dispatcherScheduler2));
                int i4 = serializer + 87;
                write = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return androidScheduleProvider;
            case 1:
                Object objWrite2 = this.RemoteActionCompatParcelizer.write();
                objWrite2.getClass();
                return new GraphicsLayerCompanion((verifyAndTrackPlayStorePurchaseI) objWrite2);
            case 2:
                Object objWrite3 = this.RemoteActionCompatParcelizer.write();
                objWrite3.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) objWrite3;
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite4 = getidentifiersvalidationsenabled.write().write(getConfirm5zf0vsI.class);
                objWrite4.getClass();
                return (getConfirm5zf0vsI) objWrite4;
            case 3:
                Object objWrite5 = this.RemoteActionCompatParcelizer.write();
                objWrite5.getClass();
                return new getKeyboardTap5zf0vsI((Application) objWrite5);
            case 4:
                Object objWrite6 = this.RemoteActionCompatParcelizer.write();
                objWrite6.getClass();
                return new TraceTimeMeasurementWithPerformanceKit((SemanticsOwner) objWrite6);
            case 5:
                Object objWrite7 = this.RemoteActionCompatParcelizer.write();
                objWrite7.getClass();
                return getAllUncoveredSemanticsNodesToIntObjectMaplambda0addDescendantsOfMergingNodePartiallyVisibleInScrollParent.serializer((Application) objWrite7);
            case 6:
                Object objWrite8 = this.RemoteActionCompatParcelizer.write();
                objWrite8.getClass();
                return new roleFakeNodeId((transferSessionPackageI) objWrite8);
            case 7:
                AndroidUiFrameClock androidUiFrameClock = (AndroidUiFrameClock) internalPathIteratorNext.IconCompatParcelizer.write();
                Object objWrite9 = this.RemoteActionCompatParcelizer.write();
                objWrite9.getClass();
                return new clearUpdated(androidUiFrameClock, (attachToRecyclerView) objWrite9);
            case 8:
                Object objWrite10 = this.RemoteActionCompatParcelizer.write();
                objWrite10.getClass();
                return new moveBasedOnParentOffset((setLastHorizontalStyle) objWrite10);
            case 9:
                Object objWrite11 = this.RemoteActionCompatParcelizer.write();
                objWrite11.getClass();
                return new ExecuteDatabaseRequest((isOpenInternalroom_runtime) objWrite11);
            case 10:
                Object objWrite12 = this.RemoteActionCompatParcelizer.write();
                objWrite12.getClass();
                return new FetchCountryConfigListImpl((CountryConfigListRepository) objWrite12);
            case 11:
                Object objWrite13 = this.RemoteActionCompatParcelizer.write();
                objWrite13.getClass();
                return new unpackMetaLastChildOffset((boundingRectInRoot) objWrite13);
            case 12:
                Object objWrite14 = this.RemoteActionCompatParcelizer.write();
                objWrite14.getClass();
                return new unpackY((boundingRectInRoot) objWrite14);
            case 13:
                Object objWrite15 = this.RemoteActionCompatParcelizer.write();
                objWrite15.getClass();
                return new boundingRectInRoot((getTombStone) objWrite15);
            case 14:
                Object objWrite16 = this.RemoteActionCompatParcelizer.write();
                objWrite16.getClass();
                return new unpackX((CountryConfigListRepository) objWrite16);
            case 15:
                Lazy lazySerializer = getColorIntegerOrNull.serializer(this.RemoteActionCompatParcelizer);
                lazySerializer.getClass();
                return new accesssetDispatchTokenp(lazySerializer);
            case 16:
                Object objWrite17 = this.RemoteActionCompatParcelizer.write();
                objWrite17.getClass();
                clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = Room.RemoteActionCompatParcelizer((Application) objWrite17, CountryConfigDatabase.class, "rr_country_config.db");
                cliprectmtrddeRemoteActionCompatParcelizer.read();
                cliprectmtrddeRemoteActionCompatParcelizer.read = true;
                return (CountryConfigDatabase) cliprectmtrddeRemoteActionCompatParcelizer.write();
            case 17:
                Object objWrite18 = this.RemoteActionCompatParcelizer.write();
                objWrite18.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = (getIdentifiersValidationsEnabled) objWrite18;
                getidentifiersvalidationsenabled2.write("https://s3-eu-west-1.amazonaws.com/foodora-dispatcher/");
                Object objWrite19 = getidentifiersvalidationsenabled2.write().write(unpackMetaGesturable.class);
                objWrite19.getClass();
                unpackMetaGesturable unpackmetagesturable = (unpackMetaGesturable) objWrite19;
                int i6 = serializer + 1;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return unpackmetagesturable;
                }
                throw null;
            case 18:
                Object objWrite20 = this.RemoteActionCompatParcelizer.write();
                objWrite20.getClass();
                PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.read();
                phoneNumberUtil.getClass();
                return new unpackMetaUpdated((boundingRectInRoot) objWrite20, phoneNumberUtil);
            case 19:
                Object objWrite21 = this.RemoteActionCompatParcelizer.write();
                objWrite21.getClass();
                return new registerOnGlobalLayoutCallback((accessgetOldDependencyp) objWrite21);
            case 20:
                Object objWrite22 = this.RemoteActionCompatParcelizer.write();
                objWrite22.getClass();
                return CustomerChatModule.write.serializer((Application) objWrite22);
            case 21:
                Object objWrite23 = this.RemoteActionCompatParcelizer.write();
                objWrite23.getClass();
                return new zzz((accessrequireViewFactoryHolder) objWrite23);
            case 22:
                Object objWrite24 = this.RemoteActionCompatParcelizer.write();
                objWrite24.getClass();
                return new LineHeightStyleSaverlambda1((Clock) objWrite24);
            case 23:
                Object objWrite25 = this.RemoteActionCompatParcelizer.write();
                objWrite25.getClass();
                return new ShadowSaverlambda0((accessrequireViewFactoryHolder) objWrite25, (LocaleListSaverlambda1) LocaleListSaverlambda0.serializer.write(), (LocaleListSaverlambda1) LocaleListSaverlambda0.write.write());
            case 24:
                Object objWrite26 = this.RemoteActionCompatParcelizer.write();
                objWrite26.getClass();
                return new GetDeliveryAcknowledgments((accessrequireViewFactoryHolder) objWrite26);
            case 25:
                MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem(i2);
                Object objWrite27 = this.RemoteActionCompatParcelizer.write();
                objWrite27.getClass();
                return new CreateHomeScope(mediaBrowserCompatMediaItem, (WorkManagerImpl) objWrite27);
            case 26:
                Object objWrite28 = this.RemoteActionCompatParcelizer.write();
                objWrite28.getClass();
                return new GetAcceptDetails((accessrequireViewFactoryHolder) objWrite28);
            case 27:
                Object objWrite29 = this.RemoteActionCompatParcelizer.write();
                objWrite29.getClass();
                VerbatimTtsAnnotationSaverlambda1 verbatimTtsAnnotationSaverlambda1 = new VerbatimTtsAnnotationSaverlambda1((Application) objWrite29);
                int i7 = serializer + 17;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return verbatimTtsAnnotationSaverlambda1;
            case 28:
                Object objWrite30 = this.RemoteActionCompatParcelizer.write();
                objWrite30.getClass();
                return new scrollByInternal(i3, (TimestampRepositoryImpl) objWrite30);
            default:
                Object objWrite31 = this.RemoteActionCompatParcelizer.write();
                objWrite31.getClass();
                return new TimestampRepositoryImpl((performCustomExitMxy_nc0) objWrite31);
        }
    }
}
