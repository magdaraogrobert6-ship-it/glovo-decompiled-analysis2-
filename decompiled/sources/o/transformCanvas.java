package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.deliveryhero.performance.core.aqs.AppQualityScore;
import com.foodora.courier.legacy.ui.main.usecase.PhoneNumberUseCase;
import com.google.re2j.Parser;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.country.config.implementation.data.database.CountryConfigListLocalDataSource;
import com.roadrunner.delivery.accept.laststop.data.LastStopRepositoryImpl;
import com.roadrunner.delivery.accept.laststop.data.RecentLastStopsDatastoreImpl;
import com.roadrunner.delivery.accept.laststop.domain.GetLastStopScreenUseCaseImpl;
import com.roadrunner.delivery.common.analytics.DeliveryAcceptanceLogger;
import com.roadrunner.delivery.midshiftverification.LastDropoffConfirmedEventImpl;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import com.sentiance.core.model.events.H$b;
import dagger.Lazy;
import java.time.Clock;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes2.dex */
public final class transformCanvas implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public final /* synthetic */ int IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ write;

    public transformCanvas(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, int i) {
        this.IconCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        if (i == 6) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            return;
        }
        if (i == 10) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            return;
        }
        if (i == 18) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else if (i == 21) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else if (i != 24) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        }
    }

    public transformCanvas(transformCanvas transformcanvas, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 12;
        transformcanvas.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = transformcanvas;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transformCanvas(FontVariationSettingInt fontVariationSettingInt, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 27;
        fontVariationSettingInt.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = fontVariationSettingInt;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transformCanvas(LocaleListHelperMethods localeListHelperMethods, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 28;
        localeListHelperMethods.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = localeListHelperMethods;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transformCanvas(SingleProcessDataStore singleProcessDataStore, publishErrorlambda1 publisherrorlambda1) {
        this.IconCompatParcelizer = 20;
        singleProcessDataStore.getClass();
        publisherrorlambda1.getClass();
        this.write = singleProcessDataStore;
        this.read = publisherrorlambda1;
    }

    public transformCanvas(hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview) {
        this.IconCompatParcelizer = 14;
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        this.write = hasnestedscrollingparent;
        this.read = setpresentationview;
    }

    public transformCanvas(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 22;
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transformCanvas(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, hasNestedScrollingParent hasnestedscrollingparent) {
        this.IconCompatParcelizer = 3;
        convertstringjsonarraytolistlambda0.getClass();
        hasnestedscrollingparent.getClass();
        this.write = convertstringjsonarraytolistlambda0;
        this.read = hasnestedscrollingparent;
    }

    public transformCanvas(convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0, setPresentationView setpresentationview) {
        this.IconCompatParcelizer = 7;
        convertstringjsonarraytolistlambda0.getClass();
        setpresentationview.getClass();
        this.write = convertstringjsonarraytolistlambda0;
        this.read = setpresentationview;
    }

    public transformCanvas(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, int i) {
        this.IconCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        if (i != 9) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = dataModule_ProvideSchedulerFactory;
        } else {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = dataModule_ProvideSchedulerFactory;
        }
    }

    public transformCanvas(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, getContentDataType getcontentdatatype) {
        this.IconCompatParcelizer = 29;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        getcontentdatatype.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = getcontentdatatype;
    }

    public transformCanvas(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, int i) {
        this.IconCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        generateandroidfontktforapicompatibility.getClass();
        if (i != 26) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = generateandroidfontktforapicompatibility;
        } else {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = generateandroidfontktforapicompatibility;
        }
    }

    public transformCanvas(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, short s) {
        this.IconCompatParcelizer = 25;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = setpresentationview;
    }

    public transformCanvas(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.IconCompatParcelizer = 1;
        dataModule_ProvideSchedulerFactory.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.write = dataModule_ProvideSchedulerFactory;
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public transformCanvas(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, int i, boolean z) {
        this.IconCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        if (i != 17) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = dataModule_ProvideSchedulerFactory;
        } else {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = dataModule_ProvideSchedulerFactory;
        }
    }

    public transformCanvas(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, int i) {
        this.IconCompatParcelizer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        if (i == 8) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        } else if (i == 11) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        } else if (i != 19) {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        } else {
            this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.read = setpresentationview;
        }
    }

    public transformCanvas(setRoundRectOutlineTNW_H78default setroundrectoutlinetnw_h78default, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview) {
        this.IconCompatParcelizer = 0;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        this.write = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.read = setpresentationview;
    }

    public transformCanvas(r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI r8lambda31xvc6ytcuqsopja0lc9hsr6ufi, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw, int i) {
        this.IconCompatParcelizer = i;
        r8lambda31xvc6ytcuqsopja0lc9hsr6ufi.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        if (i != 15) {
            this.write = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
            this.read = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        } else {
            this.write = r8lambda31xvc6ytcuqsopja0lc9hsr6ufi;
            this.read = r8lambda6uovp7lvejigbq5knkop8a0veiw;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.read;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.write;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new com.data.util.sharedPreferences.SharedPreferencesManagerImpl((SharedPreferences) objWrite, (isOpenInternalroom_runtime) objWrite2);
            case 1:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new PhoneNumberUseCase((getConfirm5zf0vsI) objWrite3, (getPivotOffsetF1C5BW0) objWrite4);
            case 2:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new getUnmergedRootSemanticsNode((AppQualityScore) objWrite5, (removeListener) objWrite6);
            case 3:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = new InitializeAppStartupItemsImpl((AppEventInfoChangeHandler) objWrite7, 4, (Application) objWrite8);
                int i3 = serializer + 107;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 != 0) {
                    return initializeAppStartupItemsImpl;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            case 4:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new CountryConfigListLocalDataSource((performCustomExitMxy_nc0) objWrite9, (isOpenInternalroom_runtime) objWrite10);
            case 5:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite11.getClass();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new LocaleSaverlambda0((accessrequireViewFactoryHolder) objWrite11, (TextUnitTypeSaverlambda1) objWrite12);
            case 6:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new r8lambdajRJFbIqkkFSo0J2N8n3tH4yM((Savers_androidKt) objWrite13, (transferSessionPackageI) objWrite14);
            case 7:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new TextMotionLinearitySaverlambda0((DeliveryAcceptanceLogger) objWrite15, (isOpenInternalroom_runtime) objWrite16);
            case 8:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new getAnyOverlap((performCustomExitMxy_nc0) objWrite17, (isOpenInternalroom_runtime) objWrite18);
            case 9:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite19.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                return new getReversedimpl((accessrequireViewFactoryHolder) objWrite19, (TextUnitTypeSaverlambda1) objWrite20);
            case 10:
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite21.getClass();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new com.huawei.agconnect.config.impl.m((accessrequireViewFactoryHolder) objWrite21, 18, (setLastHorizontalStyle) objWrite22);
            case 11:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new RecentLastStopsDatastoreImpl((performCustomExitMxy_nc0) objWrite23, (isOpenInternalroom_runtime) objWrite24);
            case 12:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite25.getClass();
                getOffsetForHorizontal getoffsetforhorizontal = new getOffsetForHorizontal();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                return new GetLastStopScreenUseCaseImpl((LastStopRepositoryImpl) objWrite25, getoffsetforhorizontal, (NestComponentRepositoryImpl) objWrite26);
            case 13:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite27.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) objWrite27;
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                Path$Companion path$Companion = new Path$Companion();
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite29 = getidentifiersvalidationsenabled.write().write(getSecondaryHorizontaldefault.class);
                objWrite29.getClass();
                return new LastStopRepositoryImpl((getSecondaryHorizontaldefault) objWrite29, (ExecuteApiRequest) objWrite28, path$Companion);
            case 14:
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite30.getClass();
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite31.getClass();
                return new PlaceholderSpan_androidKt((Application) objWrite30, (isOpenInternalroom_runtime) objWrite31);
            case 15:
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite32.getClass();
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = (getIdentifiersValidationsEnabled) objWrite32;
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite33.getClass();
                Path$Companion path$Companion2 = new Path$Companion();
                getidentifiersvalidationsenabled2.write("http://localhost/");
                Object objWrite34 = getidentifiersvalidationsenabled2.write().write(PlaceholderSpanCompanionVerticalAlign.class);
                objWrite34.getClass();
                return new InitializeAppStartupItemsImpl((PlaceholderSpanCompanionVerticalAlign) objWrite34, (ExecuteApiRequest) objWrite33, path$Companion2);
            case 16:
                Lazy lazySerializer = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer.getClass();
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite35.getClass();
                return new isUnderlineText(lazySerializer, (getAllSemanticsNodesToMap) objWrite35);
            case 17:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer(r8lambdaktwlyipskq3tfa9ey3gatonixfq2);
                lazySerializer2.getClass();
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite36.getClass();
                return new AndroidAssetFont(lazySerializer2, (getAllSemanticsNodesToMap) objWrite36);
            case 18:
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite37.getClass();
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite38.getClass();
                interceptFontWeight interceptfontweight = new interceptFontWeight((FontEj4NQ78) objWrite37, (decode) objWrite38);
                int i4 = serializer + 59;
                RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return interceptfontweight;
            case 19:
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite39.getClass();
                Object objWrite40 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite40.getClass();
                slant slantVar = new slant((performCustomExitMxy_nc0) objWrite39, (isOpenInternalroom_runtime) objWrite40);
                int i6 = RemoteActionCompatParcelizer + 73;
                serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 27 / 0;
                }
                return slantVar;
            case 20:
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite41.getClass();
                Object objWrite42 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite42.getClass();
                return new LastDropoffConfirmedEventImpl((CachedDeliveryRepository) objWrite41, (GetRiderStatusImpl) objWrite42);
            case 21:
                Object objWrite43 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite43.getClass();
                Object objWrite44 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite44.getClass();
                return new InitializeAppStartupItemsImpl((deleteGlobalPartnerParameters) objWrite43, 22, (setTransactionSuccessful) objWrite44);
            case 22:
                Object objWrite45 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite45.getClass();
                Object objWrite46 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite46.getClass();
                return new EditProcessor((transferSessionPackageI) objWrite46, (verifyAndTrackPlayStorePurchaseI) objWrite45);
            case 23:
                Object objWrite47 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite47.getClass();
                Object objWrite48 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite48.getClass();
                return new toStringForLog((FontEj4NQ78default) objWrite48, (decode) objWrite47);
            case 24:
                Object objWrite49 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite49.getClass();
                Object objWrite50 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite50.getClass();
                return new setSelectionEnd((transferSessionPackageI) objWrite49, (getTextDirections_7Xco) objWrite50);
            case 25:
                Object objWrite51 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite51.getClass();
                Object objWrite52 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite52.getClass();
                return new getCompositionStartui_text((setTransactionSuccessful) objWrite51, (Clock) objWrite52);
            case 26:
                Object objWrite53 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite53.getClass();
                Object objWrite54 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite54.getClass();
                return new Parser.Pair((decode) objWrite53, 16, (FontEj4NQ78default) objWrite54);
            case 27:
                Object objWrite55 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite55.getClass();
                Object objWrite56 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite56.getClass();
                return new getEmpty((opticalSizingR2X_6o) objWrite55, (setLastHorizontalStyle) objWrite56);
            case 28:
                Object objWrite57 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite57.getClass();
                Object objWrite58 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite58.getClass();
                return new H$b((PlaceholderExtensions_androidKt) objWrite57, 13, (setTransactionSuccessful) objWrite58);
            default:
                Object objWrite59 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite59.getClass();
                Object objWrite60 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite60.getClass();
                return new getFontLoaded((setTransactionSuccessful) objWrite59, (accessgetOldDependencyp) objWrite60);
        }
    }
}
