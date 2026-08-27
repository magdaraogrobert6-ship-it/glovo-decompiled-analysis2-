package o;

import androidx.cardview.widget.CardView$1;
import coil3.Extras$Key;
import com.foodora.courier.main.presentation.MainActivity;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import com.google.re2j.Parser;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.appperformance.tracker.sentry.SentryActivityScreenPerformanceCallbacks;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.statemachine.AuthStateMachine;
import com.roadrunner.country.config.implementation.data.CountryConfigFallbackDataSource;
import com.roadrunner.customerchat.selfservice.domain.imageselection.usecase.WebChatCacheGalleryImageUseCase;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl;
import com.roadrunner.delivery.accept.domain.RemoveAutoAcceptedDeliveryIdImpl;
import com.roadrunner.heatmap.domain.ShouldShowHeatmap_Factory;
import com.roadrunner.home.CreateHomeScope;
import com.roadrunner.notifications.PendingIntentBuilderImpl;
import java.time.Clock;

/* JADX INFO: loaded from: classes3.dex */
public final class getEditableText implements getColorIntegerOrNulllambda0 {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ getEditableText(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    public /* synthetic */ getEditableText(Object obj, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = getcolorintegerornulllambda0;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.read;
        Object obj = this.RemoteActionCompatParcelizer;
        switch (i2) {
            case 0:
                return new getContentDescription((SignInDataStore) ((getContentDataType) obj).write());
            case 1:
                getGestureThresholdActivate5zf0vsI getgesturethresholdactivate5zf0vsi = new getGestureThresholdActivate5zf0vsI((getMinWidth) ((invokeqtAw6s) obj).write());
                int i3 = IconCompatParcelizer + 39;
                write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return getgesturethresholdactivate5zf0vsi;
            case 2:
                return (MainActivity) ((CardView$1) obj).IconCompatParcelizer;
            case 3:
                return new accessgetPresscp((PendingIntentBuilderImpl) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) obj).write());
            case 4:
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled = (getIdentifiersValidationsEnabled) ((r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI) obj).write();
                getidentifiersvalidationsenabled.write("http://localhost/");
                Object objWrite = getidentifiersvalidationsenabled.write().write(lambdaaddGlobalPartnerParameter23.class);
                objWrite.getClass();
                return (lambdaaddGlobalPartnerParameter23) objWrite;
            case 5:
                return new onCancelIndirectPointerInput(((getOptionalString) obj).serializer);
            case 6:
                return new Extras$Key(20, (CardView$1) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) obj).write());
            case 7:
                return new SentryActivityScreenPerformanceCallbacks((InitializeAppStartupItemsImpl) ((transformCanvas) obj).write());
            case 8:
                return new pageUp(getColorIntegerOrNull.serializer((mergeJsonObjects) obj));
            case 9:
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled2 = (getIdentifiersValidationsEnabled) ((ShouldShowHeatmap_Factory) obj).write();
                getidentifiersvalidationsenabled2.write("http://localhost/");
                Object objWrite2 = getidentifiersvalidationsenabled2.write().write(SemanticsPropertiesHideFromAccessibility1.class);
                objWrite2.getClass();
                SemanticsPropertiesHideFromAccessibility1 semanticsPropertiesHideFromAccessibility1 = (SemanticsPropertiesHideFromAccessibility1) objWrite2;
                int i5 = write + 31;
                IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return semanticsPropertiesHideFromAccessibility1;
            case 10:
                AuthStateMachine authStateMachine = new AuthStateMachine((isMainThread) ((SemanticsPropertiesFillableData1) obj).write());
                int i7 = IconCompatParcelizer + 107;
                write = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return authStateMachine;
            case 11:
                return new showTextSubstitution((setTextSubstitutiondefault) ((setStateDescription) obj).write());
            case 12:
                CountryConfigFallbackDataSource countryConfigFallbackDataSource = (CountryConfigFallbackDataSource) ((r8lambda31xVc6yTCUqSOPjA0Lc9HsR6ufI) obj).write();
                zzz zzzVar = new zzz();
                zzzVar.serializer = countryConfigFallbackDataSource;
                return zzzVar;
            case 13:
                return (getAnnotatedString) ((invokeqtAw6s) obj).write();
            case 14:
                return (ProtobufEncoder) ((SemanticsPropertiesLinkTestMarker1) obj).write();
            case 15:
                return new InitializeAppStartupItemsImpl(new ImageHeaderParserImageType(), (InitializeAppStartupItemsImpl) ((getEditableText) obj).write());
            case 16:
                return new InitializeAppStartupItemsImpl((getBulletListSettingStackui_text) ((setStateDescription) obj).write(), (accessgetRelativecp) getSaver.read.write());
            case 17:
                return new AnnotatedStringRange((AnnotatedStringspecialinlinedsortedBy1) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) obj).write());
            case 18:
                return new processingInstruction((Clock) ((setPresentationView) obj).write());
            case 19:
                return new WebChatCacheGalleryImageUseCase((SignInDataStore) ((SemanticsPropertiesLinkTestMarker1) obj).write());
            case 20:
                CreateHomeScope createHomeScope = (CreateHomeScope) ((fastMergej5T8yCg) obj).write();
                createHomeScope.getClass();
                zzz zzzVar2 = new zzz();
                zzzVar2.serializer = createHomeScope;
                return zzzVar2;
            case 21:
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled3 = (getIdentifiersValidationsEnabled) ((r8lambdazXN1qqQhLYzDDSf7dMTrYE1xu8I) obj).write();
                getidentifiersvalidationsenabled3.write("http://localhost/");
                Object objWrite3 = getidentifiersvalidationsenabled3.write().write(endPrefixMapping.class);
                objWrite3.getClass();
                return (endPrefixMapping) objWrite3;
            case 22:
                getIdentifiersValidationsEnabled getidentifiersvalidationsenabled4 = (getIdentifiersValidationsEnabled) ((ShouldShowHeatmap_Factory) obj).write();
                getidentifiersvalidationsenabled4.write("http://localhost/");
                Object objWrite4 = getidentifiersvalidationsenabled4.write().write(endDocument.class);
                objWrite4.getClass();
                return (endDocument) objWrite4;
            case 23:
                return new minIntrinsicWidth_delegatelambda0((processingInstruction) ((getEditableText) obj).write());
            case 24:
                return new r8lambdavutp54oh3TM1_3Uuqt3Q743DXDw((r8lambdawqL74eC8S3ryCNkLfP6V_cMe2yo) r8lambdavH3Umyw8kzGzWCmToKtSEXgfvpI.write.write(), (r8lambdawqL74eC8S3ryCNkLfP6V_cMe2yo) r8lambdavmfKDkO2LwQxwbdPpEp1squtAr4.RemoteActionCompatParcelizer.write(), (r8lambdauOuXWzkcWK0_FYFfgKa7xmdauU) ((r8lambda6UOvp7lvejigbq5knKoP8A0vEiw) obj).write());
            case 25:
                return new CreateHomeScope((zzz) ((r8lambdaZcilDVoiQYR1yQsOxhHduSfdjyw) obj).write());
            case 26:
                return new Parser.Pair((q4ExternalSyntheticLambda9) ((q0) obj).write(), new getActionViewIntentlambda0());
            case 27:
                return new r8lambdachPO4eWAQ7w61QZHJUYsstdg5A4((copyO0kMr_c) ((AbsSavedState) obj).write());
            case 28:
                return new RemoveAutoAcceptedDeliveryIdImpl((ShadowSpan) ((AbsSavedState) obj).write());
            default:
                return new copyGSF8kmg((AutoAcceptPreferencesDataStoreImpl) ((fastMergej5T8yCg) obj).write());
        }
    }
}
