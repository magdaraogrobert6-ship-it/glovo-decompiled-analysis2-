package o;

import android.app.KeyguardManager;
import com.huawei.location.Vw$Vw;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.accept.domain.AutoAcceptDeliveryImpl;
import com.roadrunner.delivery.accept.domain.AutoAcceptEarningsUseCaseImpl;
import com.roadrunner.delivery.domain.ValidateAndSaveStateResponseImpl;
import com.roadrunner.delivery.overdue.data.IssueRepository;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.UtccTaskStateRepositoryImpl;
import com.roadrunner.delivery.repository.CachedDeliveryRepository;
import com.roadrunner.diagnostics.domain.SendTestPushUseCase;
import com.roadrunner.domain.util.IsFixableByRetry;
import com.roadrunner.heatmap.domain.SaveHeatmapUrlImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.login.logging.RouterLogger;
import com.sentiance.core.model.events.N$b;

/* JADX INFO: loaded from: classes3.dex */
public final class r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final getColorIntegerOrNulllambda0 serializer;

    public /* synthetic */ r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo(getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = getcolorintegerornulllambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        getColorIntegerOrNulllambda0 getcolorintegerornulllambda0 = this.serializer;
        switch (i3) {
            case 0:
                return new IssueRepository((N$b) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) getcolorintegerornulllambda0).write());
            case 1:
                return new AnalyticsServiceImpl(27, (SignInDataStore) ((ShouldShowHeatmap_Factory) getcolorintegerornulllambda0).write());
            case 2:
                return new AnalyticsServiceImpl(28, (SignInDataStore) ((ShouldShowHeatmap_Factory) getcolorintegerornulllambda0).write());
            case 3:
                return new TextStyleKtWhenMappings((accesscreatePlatformTextStyleInternal) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) getcolorintegerornulllambda0).write());
            case 4:
                return new AutoAcceptDeliveryImpl((ClickableSaverlambda1) ((insertBasedOnParentOffset) getcolorintegerornulllambda0).write());
            case 5:
                AutoAcceptEarningsUseCaseImpl autoAcceptEarningsUseCaseImpl = new AutoAcceptEarningsUseCaseImpl((InitializeAppStartupItemsImpl) ((transformCanvas) getcolorintegerornulllambda0).write());
                int i4 = read + 67;
                IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    return autoAcceptEarningsUseCaseImpl;
                }
                obj.hashCode();
                throw null;
            case 6:
                return new accessgetStaticLayoutConstructor((AnalyticsServiceImpl) ((r8lambdawMZ4b3qLWvwGdmRM_auBcG267s) getcolorintegerornulllambda0).write());
            case 7:
                return new CreateHomeScope(new accessisMainThread(), (attachToRecyclerView) ((getSharedElementTargetNames) getcolorintegerornulllambda0).write());
            case 8:
                return new getMultiplier((KeyguardManager) ((FontVariationSettingInt) getcolorintegerornulllambda0).write());
            case 9:
                return new SignInDataStore((stripNonMetricAffectingCharacterStyleSpans) ((getStringBounds) getcolorintegerornulllambda0).write(), new fillStringBounds());
            case 10:
                return new getNeedsDensityui_text((CachedDeliveryRepository) ((SingleProcessDataStore) getcolorintegerornulllambda0).write());
            case 11:
                return new ValidateAndSaveStateResponseImpl((InitializeAppStartupItemsImpl) ((accessgetTextBottomcp) getcolorintegerornulllambda0).write());
            case 12:
                return new hasFlag((getTrackTintList) ((FontVariationSettingInt) getcolorintegerornulllambda0).write(), (com.huawei.wisesecurity.ucs_credential.g0) TextInputSession.write.write());
            case 13:
                return new TextInputServiceAndroid_androidKtExternalSyntheticLambda1((updateWithEmojiCompat) ((FontVariationSettingInt) getcolorintegerornulllambda0).write(), (IsFixableByRetry) TextInputSession.IconCompatParcelizer.write());
            case 14:
                return new CreateHomeScope((r8lambdaLZjsjPSXWRendXZH98LKrH6PSs) ((requestGeofencesInitializationlambda1) getcolorintegerornulllambda0).write());
            case 15:
                return new ensureOpenSession((CreateHomeScope) ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) getcolorintegerornulllambda0).write());
            case 16:
                return new clearShader((PlaceholderExtensions_androidKt) ((LocaleListHelperMethods) getcolorintegerornulllambda0).write());
            case 17:
                return new setBrush_12SF9DMlambda0(new AndroidUiFrameClock(), (getPreviouseUduSuoannotations) getNoneeUduSuoannotations.write.write(), (Nonelambda0) ((accessgetTextBottomcp) getcolorintegerornulllambda0).write());
            case 18:
                return new SendTestPushUseCase((Vw$Vw) ((onMeasureChild) getcolorintegerornulllambda0).write());
            case 19:
                return new accessgetLoosecp((copy8_81llAdefault) ((AbsSavedState) getcolorintegerornulllambda0).write());
            case 20:
                return new getInitialState((getAnimationSpec) ((setVerticalBias) getcolorintegerornulllambda0).write());
            case 21:
                return new findRememberedData((UtccTaskStateRepositoryImpl) ((getIterationDuration) getcolorintegerornulllambda0).write());
            case 22:
                return new SaveHeatmapUrlImpl((r8lambdaI0rwLnY7SWJ2zbMkkgoBaCvlVM) ((r8lambdaW54wJFeAx5lsK9aKy9gIsQwXLk) getcolorintegerornulllambda0).write());
            case 23:
                return new millisToNanos((setGuidelineBegin) ((getIterationDuration) getcolorintegerornulllambda0).write());
            case 24:
                return new createClocklambda0(new AndroidUiFrameClock(), (setInitialStateToCurrentAnimationValue) ((internalPathIteratorRawSize) getcolorintegerornulllambda0).write());
            case 25:
                return new divYEO4UFw((getCenterozmzZPIannotations) ((SingleProcessDataStore) getcolorintegerornulllambda0).write(), new AndroidUiFrameClock());
            case 26:
                return new getMToDpValuesannotations((RouterLogger) ((onMeasureChild) getcolorintegerornulllambda0).write());
            case 27:
                return new setLastHorizontalStyle((setFirstVerticalBias) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) getcolorintegerornulllambda0).write());
            case 28:
                return new setWrapMode((getMargin) ((SingleProcessDataStore) getcolorintegerornulllambda0).write());
            default:
                getColorIntegerOrNull.serializer(getcolorintegerornulllambda0).getClass();
                return new io.sentry.util.MediaBrowserCompatMediaItem(12);
        }
    }
}
