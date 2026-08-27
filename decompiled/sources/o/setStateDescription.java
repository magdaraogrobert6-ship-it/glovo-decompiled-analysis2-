package o;

import android.app.Application;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.play.core.appupdate.zzz;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.AuthRepository;
import com.roadrunner.auth.domain.token.GetAccessTokenUseCaseImpl;
import com.roadrunner.auth.domain.token.IsUserSignedInImpl;
import com.roadrunner.country.config.implementation.data.CountryConfigListRepository;
import com.roadrunner.country.config.implementation.data.database.CountryConfigDatabase;
import com.roadrunner.customerchat.legacy.core.manager.CustomerChatProviderImpl;
import com.roadrunner.customerchat.selfservice.data.cache.ChatAssetCacheManager;
import com.roadrunner.customerchat.usecases.CustomerChatCommunicatorImpl;
import com.roadrunner.domain.util.IsFixableByRetry;
import dagger.Lazy;
import java.time.Clock;
import okio.Path$Companion;

/* JADX INFO: loaded from: classes3.dex */
public final class setStateDescription implements getColorIntegerOrNulllambda0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer;
    public final mergeJsonObjects write;

    public /* synthetic */ setStateDescription(mergeJsonObjects mergejsonobjects, int i) {
        this.IconCompatParcelizer = i;
        this.write = mergejsonobjects;
    }

    public /* synthetic */ setStateDescription(Object obj, mergeJsonObjects mergejsonobjects, int i) {
        this.IconCompatParcelizer = i;
        this.write = mergejsonobjects;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        mergeJsonObjects mergejsonobjects = this.write;
        switch (i2) {
            case 0:
                setTextdefault settextdefault = new setTextdefault((getDisabled) mergejsonobjects.write());
                int i3 = read + 27;
                RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    int i4 = 70 / 0;
                }
                return settextdefault;
            case 1:
                return new zzz((AuthRepository) mergejsonobjects.write());
            case 2:
                return new GetAccessTokenUseCaseImpl((AuthRepository) mergejsonobjects.write());
            case 3:
                return new AnalyticsServiceImpl((Clock) mergejsonobjects.write());
            case 4:
                return new IsUserSignedInImpl((AuthRepository) mergejsonobjects.write());
            case 5:
                return new pageRightdefault((onFillDatadefault) mergejsonobjects.write());
            case 6:
                return new setShowingTextSubstitution((decode) mergejsonobjects.write());
            case 7:
                return new setTextCompositionRangepsREZIo(getColorIntegerOrNull.serializer(mergejsonobjects));
            case 8:
                return new setTextSubstitutiondefault(getColorIntegerOrNull.serializer(mergejsonobjects), new IsFixableByRetry(12));
            case 9:
                return new setTraversalGroup((setTextCompositionRangepsREZIo) mergejsonobjects.write());
            case 10:
                return new textEntryKey((setTextCompositionRangepsREZIo) mergejsonobjects.write());
            case 11:
                Application application = (Application) mergejsonobjects.write();
                application.getClass();
                return getPopupBackground.write(application);
            case 12:
                return new RectListDebuggerModifierNodeonAttach1((isOpenInternalroom_runtime) mergejsonobjects.write());
            case 13:
                return new RectListDebugger((com.huawei.wisesecurity.ucs_credential.p0) setToken.RemoteActionCompatParcelizer.write(), (RectListDebugger_androidKtRectListDebugger1) distanceScoreAlongAxis.RemoteActionCompatParcelizer.write(), (setTransactionSuccessful) mergejsonobjects.write());
            case 14:
                Lazy lazySerializer = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer.getClass();
                return new metaMarkUpdated(lazySerializer, new Path$Companion());
            case 15:
                Object objWrite = mergejsonobjects.write();
                objWrite.getClass();
                return new unpackMetaValue((CountryConfigListRepository) objWrite);
            case 16:
                Lazy lazySerializer2 = getColorIntegerOrNull.serializer((r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ) mergejsonobjects);
                lazySerializer2.getClass();
                RectManager rectManager = new RectManager(lazySerializer2);
                int i5 = RemoteActionCompatParcelizer + 59;
                read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                return rectManager;
            case 17:
                Object objWrite2 = mergejsonobjects.write();
                objWrite2.getClass();
                metaWithParentId metawithparentidRemoteActionCompatParcelizer = ((CountryConfigDatabase) objWrite2).RemoteActionCompatParcelizer();
                setNativeShader.RemoteActionCompatParcelizer(metawithparentidRemoteActionCompatParcelizer, "Cannot return null from a non-@Nullable @Provides method");
                return metawithparentidRemoteActionCompatParcelizer;
            case 18:
                return (hasPositionalLayerTransformations) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", hasPositionalLayerTransformations.class);
            case 19:
                return new accessanalyzeComponents58bKbWc((transferSessionPackageI) mergejsonobjects.write());
            case 20:
                CustomerChatProviderImpl customerChatProviderImpl = (CustomerChatProviderImpl) mergejsonobjects.write();
                customerChatProviderImpl.getClass();
                return customerChatProviderImpl;
            case 21:
                return (linkedForEach) m1$$ExternalSyntheticOutline0.m((getIdentifiersValidationsEnabled) mergejsonobjects.write(), "http://localhost/", linkedForEach.class);
            case 22:
                CustomerChatCommunicatorImpl customerChatCommunicatorImpl = (CustomerChatCommunicatorImpl) mergejsonobjects.write();
                customerChatCommunicatorImpl.getClass();
                return customerChatCommunicatorImpl;
            case 23:
                CustomerChatProviderImpl customerChatProviderImpl2 = (CustomerChatProviderImpl) mergejsonobjects.write();
                customerChatProviderImpl2.getClass();
                return customerChatProviderImpl2;
            case 24:
                return new setGlobalChangeEntries((forEachNewCallbackNeverInvoked) mergejsonobjects.write());
            case 25:
                forEachNewCallbackNeverInvoked foreachnewcallbackneverinvoked = (forEachNewCallbackNeverInvoked) mergejsonobjects.write();
                foreachnewcallbackneverinvoked.getClass();
                zzz zzzVar = new zzz();
                zzzVar.serializer = foreachnewcallbackneverinvoked;
                return zzzVar;
            case 26:
                return new setViewToWindowMatrixQ8lPUPs((EnumColumnAdapter) mergejsonobjects.write());
            case 27:
                return new addStyle((ChatAssetCacheManager) mergejsonobjects.write());
            case 28:
                pushTtsAnnotation pushttsannotation = new pushTtsAnnotation((isOpenInternalroom_runtime) mergejsonobjects.write());
                int i7 = read + 75;
                RemoteActionCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return pushttsannotation;
            default:
                return new getBulletListSettingStackui_text((accessisSetgyyYBs) mergejsonobjects.write());
        }
    }
}
