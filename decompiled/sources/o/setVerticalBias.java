package o;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.re2j.Parser;
import com.huawei.location.Vw$Vw;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.delivery.pickupdropoff.tasks.api.data.ConfirmationRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain.GetSoftPosDeeplinkUseCaseImpl;
import com.roadrunner.freelancing.presentation.tab.ShouldShowTabs;
import com.roadrunner.home.bottomsheet.config.GetBottomSheetConfigurationType;
import com.roadrunner.login.logging.RouterLogger;
import com.roadrunner.rider.state.domain.GetStatusUseCaseImpl;
import com.roadrunner.rider.state.provider.domain.GetWorkOpportunitiesImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class setVerticalBias implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ IconCompatParcelizer;
    public final r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ read;
    public final /* synthetic */ int serializer;

    public setVerticalBias(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2, int i) {
        this.serializer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq2.getClass();
        if (i == 8) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            return;
        }
        if (i == 9) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
            return;
        }
        if (i == 15) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else if (i == 24) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else if (i != 29) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        } else {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq2;
        }
    }

    public setVerticalBias(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, setPresentationView setpresentationview, int i) {
        this.serializer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        setpresentationview.getClass();
        if (i == 7) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = setpresentationview;
        } else if (i == 26) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = setpresentationview;
        } else if (i != 28) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = setpresentationview;
        } else {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = setpresentationview;
        }
    }

    public setVerticalBias(com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory, r8lambdagJlqvKShRNmP25JfHDBcPsgUwKQ r8lambdagjlqvkshrnmp25jfhdbcpsguwkq) {
        this.serializer = 16;
        dataModule_ProvideSchedulerFactory.getClass();
        r8lambdagjlqvkshrnmp25jfhdbcpsguwkq.getClass();
        this.read = dataModule_ProvideSchedulerFactory;
        this.IconCompatParcelizer = r8lambdagjlqvkshrnmp25jfhdbcpsguwkq;
    }

    public setVerticalBias(LayoutCompat layoutCompat, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 11;
        layoutCompat.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = layoutCompat;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public setVerticalBias(generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, int i) {
        this.serializer = i;
        generateandroidfontktforapicompatibility.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        if (i != 13) {
            this.read = generateandroidfontktforapicompatibility;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        } else {
            this.read = generateandroidfontktforapicompatibility;
            this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        }
    }

    public setVerticalBias(FontVariationSettingInt fontVariationSettingInt, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 3;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        fontVariationSettingInt.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = fontVariationSettingInt;
    }

    public setVerticalBias(LocaleListHelperMethods localeListHelperMethods, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 12;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        localeListHelperMethods.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = localeListHelperMethods;
    }

    public setVerticalBias(getSharedElementTargetNames getsharedelementtargetnames, setPresentationView setpresentationview) {
        this.serializer = 27;
        getsharedelementtargetnames.getClass();
        setpresentationview.getClass();
        this.read = getsharedelementtargetnames;
        this.IconCompatParcelizer = setpresentationview;
    }

    public setVerticalBias(hasNestedScrollingParent hasnestedscrollingparent, com.data.injection.DataModule_ProvideSchedulerFactory dataModule_ProvideSchedulerFactory) {
        this.serializer = 0;
        hasnestedscrollingparent.getClass();
        dataModule_ProvideSchedulerFactory.getClass();
        this.read = hasnestedscrollingparent;
        this.IconCompatParcelizer = dataModule_ProvideSchedulerFactory;
    }

    public setVerticalBias(hasNestedScrollingParent hasnestedscrollingparent, setPresentationView setpresentationview, int i) {
        this.serializer = i;
        hasnestedscrollingparent.getClass();
        setpresentationview.getClass();
        if (i != 18) {
            this.read = hasnestedscrollingparent;
            this.IconCompatParcelizer = setpresentationview;
        } else {
            this.read = hasnestedscrollingparent;
            this.IconCompatParcelizer = setpresentationview;
        }
    }

    public setVerticalBias(hasNestedScrollingParent hasnestedscrollingparent, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 1;
        hasnestedscrollingparent.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = hasnestedscrollingparent;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public setVerticalBias(q0 q0Var, requestBannersRefreshlambda1 requestbannersrefreshlambda1) {
        this.serializer = 19;
        q0Var.getClass();
        requestbannersrefreshlambda1.getClass();
        this.read = q0Var;
        this.IconCompatParcelizer = requestbannersrefreshlambda1;
    }

    public setVerticalBias(r8lambdaqTOOBHcNghE7kA6ntx9WQ9cPAYY r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy, r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq) {
        this.serializer = 20;
        r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy.getClass();
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        this.read = r8lambdaqtoobhcnghe7ka6ntx9wq9cpayy;
        this.IconCompatParcelizer = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
    }

    public setVerticalBias(subscribeToFeatureFlagsUpdateslambda0 subscribetofeatureflagsupdateslambda0, convertStringJsonArrayToListlambda0 convertstringjsonarraytolistlambda0) {
        this.serializer = 23;
        subscribetofeatureflagsupdateslambda0.getClass();
        convertstringjsonarraytolistlambda0.getClass();
        this.read = subscribetofeatureflagsupdateslambda0;
        this.IconCompatParcelizer = convertstringjsonarraytolistlambda0;
    }

    public setVerticalBias(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, r8lambda6UOvp7lvejigbq5knKoP8A0vEiw r8lambda6uovp7lvejigbq5knkop8a0veiw) {
        this.serializer = 14;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        r8lambda6uovp7lvejigbq5knkop8a0veiw.getClass();
        this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
        this.IconCompatParcelizer = r8lambda6uovp7lvejigbq5knkop8a0veiw;
    }

    public setVerticalBias(r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq, generateAndroidFontKtForApiCompatibility generateandroidfontktforapicompatibility, int i) {
        this.serializer = i;
        r8lambdaktwlyipskq3tfa9ey3gatonixfq.getClass();
        generateandroidfontktforapicompatibility.getClass();
        if (i != 10) {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = generateandroidfontktforapicompatibility;
        } else {
            this.read = r8lambdaktwlyipskq3tfa9ey3gatonixfq;
            this.IconCompatParcelizer = generateandroidfontktforapicompatibility;
        }
    }

    public setVerticalBias(setUseTempTrackingTableroom_runtime setusetemptrackingtableroom_runtime, performDetach performdetach) {
        this.serializer = 25;
        setusetemptrackingtableroom_runtime.getClass();
        performdetach.getClass();
        this.read = setusetemptrackingtableroom_runtime;
        this.IconCompatParcelizer = performdetach;
    }

    public setVerticalBias(subscribeToBannersUpdates subscribetobannersupdates, setVerticalBias setverticalbias, int i) {
        this.serializer = i;
        subscribetobannersupdates.getClass();
        setverticalbias.getClass();
        if (i != 22) {
            this.read = subscribetobannersupdates;
            this.IconCompatParcelizer = setverticalbias;
        } else {
            this.read = subscribetobannersupdates;
            this.IconCompatParcelizer = setverticalbias;
        }
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.serializer;
        getMandatorySystemGestureInsets getmandatorysystemgestureinsets = getMandatorySystemGestureInsets.write;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq = this.IconCompatParcelizer;
        r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ r8lambdaktwlyipskq3tfa9ey3gatonixfq2 = this.read;
        int i3 = 27;
        switch (i2) {
            case 0:
                Object objWrite = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite.getClass();
                Object objWrite2 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite2.getClass();
                return new setVerticalStyle((Application) objWrite, (getAllSemanticsNodesToMap) objWrite2);
            case 1:
                Object objWrite3 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite3.getClass();
                AndroidUiDispatcherCompanioncurrentThread1 androidUiDispatcherCompanioncurrentThread1 = new AndroidUiDispatcherCompanioncurrentThread1(7);
                Object objWrite4 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite4.getClass();
                return new SpannableExtensions_androidKt((Application) objWrite3, androidUiDispatcherCompanioncurrentThread1, (setTransactionSuccessful) objWrite4);
            case 2:
                Object objWrite5 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite5.getClass();
                Object objWrite6 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite6.getClass();
                return new setBaselineShift0ocSgnM((FontEj4NQ78default) objWrite6, (decode) objWrite5);
            case 3:
                Object objWrite7 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite7.getClass();
                Object objWrite8 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite8.getClass();
                return new setTextIndent((opticalSizingR2X_6o) objWrite8, (setLastHorizontalStyle) objWrite7);
            case 4:
                Object objWrite9 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite9.getClass();
                Object objWrite10 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite10.getClass();
                return new DrawStyleSpan((FontEj4NQ78default) objWrite9, (decode) objWrite10);
            case 5:
                Object objWrite11 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite11.getClass();
                Object objWrite12 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite12.getClass();
                return new lerpjWV1Mfo((accessgetParagraphcp) objWrite11, (isOpenInternalroom_runtime) objWrite12);
            case 6:
                Object objWrite13 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite13.getClass();
                Object objWrite14 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite14.getClass();
                return new copy8_81llA((SharedPreferences) objWrite13, (setTransactionSuccessful) objWrite14);
            case 7:
                Object objWrite15 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite15.getClass();
                Object objWrite16 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite16.getClass();
                return new component10d7_KjU((accessgetParagraphcp) objWrite15, (isOpenInternalroom_runtime) objWrite16);
            case 8:
                Object objWrite17 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite17.getClass();
                Object objWrite18 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite18.getClass();
                return new InitializeAppStartupItemsImpl((accessrequireViewFactoryHolder) objWrite17, 25, (getHeadingrAG3T2k) objWrite18);
            case 9:
                Object objWrite19 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite19.getClass();
                Object objWrite20 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite20.getClass();
                InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = new InitializeAppStartupItemsImpl((accessrequireViewFactoryHolder) objWrite19, i3, (transferSessionPackageI) objWrite20);
                int i4 = RemoteActionCompatParcelizer + 61;
                write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return initializeAppStartupItemsImpl;
            case 10:
                Object objWrite21 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite21.getClass();
                Object objWrite22 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite22.getClass();
                return new setBaselineShift0ocSgnM((FontEj4NQ78default) objWrite22, (decode) objWrite21);
            case 11:
                Object objWrite23 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite23.getClass();
                Object objWrite24 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite24.getClass();
                return new InitializeAppStartupItemsImpl((packBytes) objWrite23, 28, (r8lambdaokZBgNnbR8K2i443J9b9JUwVwk) objWrite24);
            case 12:
                Object objWrite25 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite25.getClass();
                Object objWrite26 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite26.getClass();
                return new Parser.Pair((accessrequireViewFactoryHolder) objWrite25, 17, (PlaceholderExtensions_androidKt) objWrite26);
            case 13:
                Object objWrite27 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite27.getClass();
                Object objWrite28 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite28.getClass();
                return new initui_toolingdefault((FontEj4NQ78default) objWrite27, (decode) objWrite28);
            case 14:
                Object objWrite29 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite29.getClass();
                Object objWrite30 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite30.getClass();
                return new GetSoftPosDeeplinkUseCaseImpl((ConfirmationRepository) objWrite29, (withRect) objWrite30);
            case 15:
                Object objWrite31 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite31.getClass();
                Object objWrite32 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite32.getClass();
                return new getTargetState((toDebugStringlambda2) objWrite31, (setTransactionSuccessful) objWrite32);
            case 16:
                Object objWrite33 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite33.getClass();
                Object objWrite34 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite34.getClass();
                return new getTextUnitTypesui_unit((unpackMetaLastChildOffset) objWrite33, (openSessionlambda1) objWrite34);
            case 17:
                Object objWrite35 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite35.getClass();
                Object objWrite36 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite36.getClass();
                return new accesstoComposeOffset((Application) objWrite35, (isOpenInternalroom_runtime) objWrite36);
            case 18:
                Object objWrite37 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite37.getClass();
                Object objWrite38 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite38.getClass();
                return new cancelAll((Application) objWrite37, (isOpenInternalroom_runtime) objWrite38);
            case 19:
                Object objWrite39 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite39.getClass();
                Object objWrite40 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite40.getClass();
                return new getNotificationChannelGroupCompat((GetWorkOpportunitiesImpl) objWrite39, (getHuaweiAdsReferrer) objWrite40);
            case 20:
                Object objWrite41 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite41.getClass();
                Object objWrite42 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite42.getClass();
                return new getActionList((transferSessionPackageI) objWrite42, (verifyAndTrackPlayStorePurchaseI) objWrite41);
            case 21:
                getStableInsets getstableinsets = (getStableInsets) getmandatorysystemgestureinsets.write();
                Object objWrite43 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite43.getClass();
                logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11 = (logPushStoryPageClickedlambda11) objWrite43;
                getTappableElementInsets gettappableelementinsets = (getTappableElementInsets) initTypeBoundingRectsMaps.RemoteActionCompatParcelizer.write();
                xb xbVar = new xb();
                accessisMainThread accessismainthread = new accessisMainThread();
                isMainThread ismainthread = new isMainThread(19);
                Object objWrite44 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite44.getClass();
                return new ViewKtallViews1(getstableinsets, logpushstorypageclickedlambda11, gettappableelementinsets, xbVar, accessismainthread, ismainthread, (getActionList) objWrite44);
            case 22:
                Object objWrite45 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite45.getClass();
                getWindowInsetsAnimationCompat getwindowinsetsanimationcompat = (getWindowInsetsAnimationCompat) consumeDisplayCutout.serializer.write();
                getStableInsets getstableinsets2 = (getStableInsets) getmandatorysystemgestureinsets.write();
                Object objWrite46 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite46.getClass();
                setStableInsets setstableinsets = new setStableInsets((logPushStoryPageClickedlambda11) objWrite45, getwindowinsetsanimationcompat, getstableinsets2, (getActionList) objWrite46);
                int i6 = write + 107;
                RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                return setstableinsets;
            case 23:
                Object objWrite47 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite47.getClass();
                Object objWrite48 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite48.getClass();
                return new ShouldShowTabs((GetStatusUseCaseImpl) objWrite47, (subscribeToBannersUpdateslambda2) objWrite48);
            case 24:
                Object objWrite49 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite49.getClass();
                Object objWrite50 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite50.getClass();
                return new RouterLogger((requestPermissions) objWrite49, 16, (performActivityCreated) objWrite50);
            case 25:
                Object objWrite51 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite51.getClass();
                Object objWrite52 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite52.getClass();
                return new performPause((GetBottomSheetConfigurationType) objWrite51, (performGetLayoutInflater) objWrite52);
            case 26:
                Object objWrite53 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite53.getClass();
                Object objWrite54 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite54.getClass();
                return new setMenuVisibility((com.data.util.sharedPreferences.SharedPreferencesManagerImpl) objWrite53, (isOpenInternalroom_runtime) objWrite54);
            case 27:
                Object objWrite55 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite55.getClass();
                Object objWrite56 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite56.getClass();
                return new setReenterTransition((setHasOptionsMenu) objWrite55, (isOpenInternalroom_runtime) objWrite56);
            case 28:
                Object objWrite57 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite57.getClass();
                Object objWrite58 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite58.getClass();
                return new isApiKeyPresentandroid_sdk_base_releaseannotations((com.data.util.sharedPreferences.SharedPreferencesManagerImpl) objWrite57, (isOpenInternalroom_runtime) objWrite58);
            default:
                Object objWrite59 = r8lambdaktwlyipskq3tfa9ey3gatonixfq2.write();
                objWrite59.getClass();
                Object objWrite60 = r8lambdaktwlyipskq3tfa9ey3gatonixfq.write();
                objWrite60.getClass();
                return new Vw$Vw((setNextTransition) objWrite59, i3, (setTransactionSuccessful) objWrite60);
        }
    }
}
