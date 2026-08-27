package o;

import android.app.Application;
import android.content.Context;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.play.core.appupdate.zzz;
import com.huawei.location.Vw$Vw;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatManagerImpl;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatRepository;
import com.roadrunner.customerchat.selfservice.data.cache.WebChatNativeCacheDataStore;
import com.roadrunner.customerchat.selfservice.data.remote.service.ExecuteHelpCenterApiRequest;
import com.roadrunner.customerchat.usecase.TriggerChatAssetsDownloading;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.database.Database;
import com.roadrunner.delivery.accept.autoaccept.preferences.data.AutoAcceptPreferencesDataStoreImpl;
import com.roadrunner.delivery.accept.declinebutton.domain.DeclineButtonClickEventRetriever;
import com.roadrunner.home.CreateHomeScope;

/* JADX INFO: loaded from: classes3.dex */
public final class fastMergej5T8yCg implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final mergeJsonObjects read;

    public /* synthetic */ fastMergej5T8yCg(AndroidUiFrameClock androidUiFrameClock, getColorIntegerOrNulllambda0 getcolorintegerornulllambda0, int i) {
        this.IconCompatParcelizer = i;
        this.read = getcolorintegerornulllambda0;
    }

    public /* synthetic */ fastMergej5T8yCg(mergeJsonObjects mergejsonobjects, int i) {
        this.IconCompatParcelizer = i;
        this.read = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        SemanticsPropertiesFillableData1 semanticsPropertiesFillableData1 = AnnotationSpan.serializer;
        mergeJsonObjects mergejsonobjects = this.read;
        switch (i2) {
            case 0:
                return new mergePlatformStyle((CustomerChatManagerImpl) mergejsonobjects.write());
            case 1:
                return new AnnotatedStringExhaustiveAnnotation((CustomerChatRepository) mergejsonobjects.write());
            case 2:
                return new ExecuteHelpCenterApiRequest((isOpenInternalroom_runtime) mergejsonobjects.write());
            case 3:
                com.huawei.agconnect.config.impl.m mVar = new com.huawei.agconnect.config.impl.m((zzz) semanticsPropertiesFillableData1.write(), (accessgetOldDependencyp) mergejsonobjects.write());
                int i3 = write + 3;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return mVar;
            case 4:
                return new InitializeAppStartupItemsImpl((zzz) semanticsPropertiesFillableData1.write(), (accessgetOldDependencyp) mergejsonobjects.write());
            case 5:
                return new getTextLayoutInput((startDocument) mergejsonobjects.write());
            case 6:
                processingInstruction processinginstruction = (processingInstruction) mergejsonobjects.write();
                processinginstruction.getClass();
                CreateHomeScope createHomeScope = new CreateHomeScope();
                createHomeScope.read = processinginstruction;
                int i5 = write + 61;
                RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    return createHomeScope;
                }
                throw null;
            case 7:
                return (AnnotatedStringKtnormalizedParagraphStylesinlinedsortedBy1) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", AnnotatedStringKtnormalizedParagraphStylesinlinedsortedBy1.class);
            case 8:
                return (handleUlStart) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", handleUlStart.class);
            case 9:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                Context applicationContext = application.getApplicationContext();
                applicationContext.getClass();
                return Paragraph_EkL_Y.read(applicationContext);
            case 10:
                return (endElement) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", endElement.class);
            case 11:
                Application application2 = (Application) mergejsonobjects.write();
                application2.getClass();
                return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(application2.getPackageName(), ".picture.provider");
            case 12:
                Application application3 = (Application) mergejsonobjects.write();
                accessresolveTextDirection.RemoteActionCompatParcelizer.getClass();
                application3.getClass();
                return new WebChatNativeCacheDataStore((performCustomExitMxy_nc0) accessresolveTextDirection.IconCompatParcelizer.getValue(application3, accessresolveTextDirection.write[0]));
            case 13:
                return new ParagraphUl8oQg4((accessgetOldDependencyp) mergejsonobjects.write());
            case 14:
                return new getLineHeightStyle((Application) mergejsonobjects.write());
            case 15:
                return new PlatformHapticFeedbackType((Application) mergejsonobjects.write(), 2);
            case 16:
                return new getTextIndent((transferSessionPackageI) mergejsonobjects.write());
            case 17:
                return new TriggerChatAssetsDownloading((androidx.work.impl.WorkManagerImpl) mergejsonobjects.write());
            case 18:
                return new CustomerChatCommunicatorImpl(getColorIntegerOrNull.serializer(mergejsonobjects));
            case 19:
                Application application4 = (Application) mergejsonobjects.write();
                application4.getClass();
                clipRectmtrdDE cliprectmtrddeRemoteActionCompatParcelizer = androidx.room.Room.RemoteActionCompatParcelizer(application4, Database.class, "roadrunner.db");
                cliprectmtrddeRemoteActionCompatParcelizer.read = true;
                cliprectmtrddeRemoteActionCompatParcelizer.read();
                return (Database) cliprectmtrddeRemoteActionCompatParcelizer.write();
            case 20:
                Database database = (Database) mergejsonobjects.write();
                database.getClass();
                copyK8Q__8 copyk8q__8IconCompatParcelizer = database.IconCompatParcelizer();
                setNativeShader.IconCompatParcelizer(copyk8q__8IconCompatParcelizer);
                return copyk8q__8IconCompatParcelizer;
            case 21:
                return new r8lambdam1qNeNADvgEt3ehZGqENNyRsxU((setOnEventTrackingSucceededListener) mergejsonobjects.write());
            case 22:
                return new r8lambdapjTUZ0Wtzlo73NSJRTFk8zfAbE((setTransactionSuccessful) mergejsonobjects.write(), 0);
            case 23:
                return new Vw$Vw((transferSessionPackageI) mergejsonobjects.write(), (com.huawei.wisesecurity.ucs_credential.g0) r8lambdarRgMd9LrXJBWhK7xyGYL6g_vrL4.serializer.write());
            case 24:
                return new r8lambdapjTUZ0Wtzlo73NSJRTFk8zfAbE((setTransactionSuccessful) mergejsonobjects.write(), 1);
            case 25:
                return new r8lambdapjTUZ0Wtzlo73NSJRTFk8zfAbE((setTransactionSuccessful) mergejsonobjects.write(), 2);
            case 26:
                return new AutoAcceptPreferencesDataStoreImpl((performCustomExitMxy_nc0) mergejsonobjects.write());
            case 27:
                Application application5 = (Application) mergejsonobjects.write();
                application5.getClass();
                return androidx.datastore.preferences.core.PreferencesSerializer.write(null, new subscribeToContentCardsUpdateslambda30(application5, 2), 7);
            case 28:
                return new AnalyticsServiceImpl((com.data.util.sharedPreferences.SharedPreferencesManagerImpl) mergejsonobjects.write());
            default:
                return new DeclineButtonClickEventRetriever((accessrequireViewFactoryHolder) mergejsonobjects.write());
        }
    }
}
