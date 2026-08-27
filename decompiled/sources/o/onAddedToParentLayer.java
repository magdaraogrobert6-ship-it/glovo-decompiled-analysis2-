package o;

import android.content.Context;
import android.os.Looper;
import coil3.Extras$Key;
import coil3.compose.AsyncImagePainter$launchJob$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.PerseusApp$init$1;
import com.deliveryhero.perseus.core.session.AppSessionManagerImpl;
import com.deliveryhero.perseus.core.session.ClientIdProviderImpl;
import com.deliveryhero.perseus.data.local.PerseusConfigLocalDataStoreImpl;
import com.deliveryhero.perseus.data.local.PerseusUserLocalDataStoreImpl;
import com.deliveryhero.perseus.data.local.SharedPreferenceToDataStoreBridge;
import com.deliveryhero.perseus.di.DataModule;
import com.deliveryhero.perseus.di.TelemetryModule$runTelemetryUseCase$2$2;
import com.deliveryhero.perseus.hits.usecase.RunTelemetryUseCase;
import com.deliveryhero.perseus.logger.DatabaseInfoLogger;
import com.deliveryhero.perseus.logger.PerseusLogger;
import com.google.gson.GsonBuilder;
import io.sentry.util.UrlUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class onAddedToParentLayer implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int RemoteActionCompatParcelizer;

    public /* synthetic */ onAddedToParentLayer(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = 3;
        int i2 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        switch (this.RemoteActionCompatParcelizer) {
            case 0:
                return new DefaultInAppMessageHtmlFullViewFactory("com.data.error.Message", displayInAppMessagelambda1.serializer(obtainAndroidOutline.class), new getUnregisteredInAppMessageannotations[]{displayInAppMessagelambda1.serializer(drawWithChildTracking.class), displayInAppMessagelambda1.serializer(resolveOutlinePosition.class)}, new setGraphicModalMaxWidthDp[]{obtainPathBounds.IconCompatParcelizer, setPositionVbeCjmY.IconCompatParcelizer}, new Annotation[0]);
            case 1:
                return com.braze.ui.inappmessage.BrazeInAppMessageManager.unregisterInAppMessageManager$lambda$1();
            case 2:
                return com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$0();
            case 3:
                return com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$1();
            case 4:
                return com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$3();
            case 5:
                return com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$4();
            case 6:
                return com.braze.ui.inappmessage.BrazeInAppMessageManager.ensureSubscribedToInAppMessageEvents$lambda$7();
            case 7:
                return com.braze.ui.inappmessage.BrazeInAppMessageManager.pauseWebviewIfNecessary$lambda$0();
            case 8:
                return com.braze.ui.inappmessage.InAppMessageActivityTransitionCoordinator.resolveUnregisterDisplayedMessage$lambda$0();
            case 9:
                return com.braze.ui.inappmessage.InAppMessageActivityTransitionCoordinator.logUnregisterActivity$lambda$0();
            case 10:
                if (!onDependencyAdded.serializer) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{Looper.myLooper(), Looper.getMainLooper()}, getCieXyz.write())).booleanValue()) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Gson should not be initialized on the main thread");
                        return null;
                    }
                }
                Type type = accessgetDependencyp.RemoteActionCompatParcelizer;
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.registerTypeAdapter(accessgetDependencyp.RemoteActionCompatParcelizer, new com.data.data.serialization.DateTimeConverter());
                return gsonBuilder.create();
            case 11:
                return new setWasCloseMessageCalled(obtainAndroidOutline.Companion.serializer(), 0);
            case 12:
                return updateRenderPath.MediaMetadataCompat;
            case 13:
                return updateRenderPath.MediaMetadataCompat;
            case 14:
                return updateRenderPath.MediaMetadataCompat;
            case 15:
                DataModule dataModule = DataModule.read;
                return new AppSessionManagerImpl((PerseusUserLocalDataStoreImpl) DataModule.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), new ScreenStartObserver$$ExternalSyntheticLambda0(26));
            case 16:
                DataModule dataModule2 = DataModule.read;
                return new ClientIdProviderImpl((PerseusUserLocalDataStoreImpl) DataModule.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper());
            case 17:
                return new ImageVectorBuilderGroupParams();
            case 18:
                return new GsonBuilder().create();
            case 19:
                return new PerseusConfigLocalDataStoreImpl((getVerticalEllipseRadius) getPathMeasure.write.MediaSessionCompatResultReceiverWrapper(), (generateImageVectorIdui) getPathMeasure.serializer.MediaSessionCompatResultReceiverWrapper());
            case 20:
                return new PerseusUserLocalDataStoreImpl((getVerticalEllipseRadius) getPathMeasure.write.MediaSessionCompatResultReceiverWrapper(), (generateImageVectorIdui) getPathMeasure.serializer.MediaSessionCompatResultReceiverWrapper(), new ScreenStartObserver$$ExternalSyntheticLambda0(27));
            case 21:
                try {
                    Context context = pauseWebviewIfNecessarylambda10.IconCompatParcelizer;
                    if (context != null) {
                        return androidx.work.impl.WorkManagerImpl.RemoteActionCompatParcelizer(context);
                    }
                    removeNodeAtDepth.serializer("applicationContext");
                    throw null;
                } catch (IllegalStateException e) {
                    PerseusLogger perseusLoggerRemoteActionCompatParcelizer = getPathFillTypeRgk1Os.RemoteActionCompatParcelizer();
                    BuildersKt.RemoteActionCompatParcelizer(perseusLoggerRemoteActionCompatParcelizer.IconCompatParcelizer, null, null, new AsyncImagePainter$launchJob$1(perseusLoggerRemoteActionCompatParcelizer, "Failed to get work manager instance.\nThis probably caused by having the work manager disabled.\nReference: https://developer.android.com/develop/background-work/background-tasks/persistent/configuration/custom-configuration#remove-default", e, null, 13), 3);
                    new androidx.work.WorkManagerInitializer();
                    Context context2 = pauseWebviewIfNecessarylambda10.IconCompatParcelizer;
                    if (context2 != null) {
                        return androidx.work.WorkManagerInitializer.IconCompatParcelizer(context2);
                    }
                    removeNodeAtDepth.serializer("applicationContext");
                    throw null;
                }
            case 22:
                Context context3 = pauseWebviewIfNecessarylambda10.IconCompatParcelizer;
                if (context3 != null) {
                    return new SharedPreferenceToDataStoreBridge(context3);
                }
                removeNodeAtDepth.serializer("applicationContext");
                throw null;
            case 23:
                getVerticalEllipseRadius getverticalellipseradius = new getVerticalEllipseRadius();
                getverticalellipseradius.write = new ConcurrentHashMap();
                return getverticalellipseradius;
            case 24:
                return new PerseusLogger();
            case 25:
                DataModule dataModule3 = DataModule.read;
                return new DatabaseInfoLogger(updateRenderPath.IconCompatParcelizer(), (PerseusUserLocalDataStoreImpl) DataModule.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper(), DataModule.IconCompatParcelizer(), new Extras$Key(getPathMeasure.IconCompatParcelizer), getPathFillTypeRgk1Os.RemoteActionCompatParcelizer());
            case 26:
                return new RunTelemetryUseCase(new PerseusApp$init$1(i2, i, shortNewsContentCardView), new TelemetryModule$runTelemetryUseCase$2$2(3, null), new accessgetIntersectcp(24), new onAddedToParentLayer(28), new accessgetIntersectcp(25));
            case 27:
                return new getStrokeLineJoinLxFBmk8(YieldKt.RemoteActionCompatParcelizer(updateRenderPath.MediaMetadataCompat.plus(UrlUtils.serializer())), new PerseusApp$init$1(i2, 4, shortNewsContentCardView));
            case 28:
                return getStrokeLineWidth.write;
            default:
                return Calendar.getInstance();
        }
    }
}
