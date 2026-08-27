package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.perseus.Perseus;
import com.deliveryhero.perseus.PerseusEvent;
import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdjustedBounds {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public final InitializeAppStartupItemsImpl read;

    public getAdjustedBounds(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl) {
        this.read = initializeAppStartupItemsImpl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    public final void onEventReady(DropShadowRendererProvider dropShadowRendererProvider) {
        String string;
        int iSerializer;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        dropShadowRendererProvider.getClass();
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (dropShadowRendererProvider instanceof createInnerShadowBrushu1Psq8) {
            int i4 = IconCompatParcelizer + 63;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                shortNewsContentCardView.hashCode();
                throw null;
            }
            string = "screen_metrics";
        } else {
            if (!(dropShadowRendererProvider instanceof InnerShadowRendererProvider)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return;
            }
            int i5 = serializer + 125;
            IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i6 = i5 % 2;
            string = ((InnerShadowRendererProvider) dropShadowRendererProvider).RemoteActionCompatParcelizer;
        }
        switch (string.hashCode()) {
            case -1173527559:
                if (!string.equals("app_start_to_interactive")) {
                    iSerializer = hideCurrentlyDisplayingInAppMessage.serializer('_', 0, 6, string);
                    int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) string, '.', 0, false, 6);
                    if (iSerializer >= 0 && iWrite == -1) {
                        string = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(string, iSerializer, iSerializer + 1, ".").toString();
                    }
                } else {
                    string = "app_start_to_interactive.triggered";
                }
                break;
            case -1165165584:
                if (!string.equals("screen_metrics")) {
                    iSerializer = hideCurrentlyDisplayingInAppMessage.serializer('_', 0, 6, string);
                    int iWrite2 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) string, '.', 0, false, 6);
                    if (iSerializer >= 0) {
                        string = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(string, iSerializer, iSerializer + 1, ".").toString();
                    }
                } else {
                    string = "screen_metrics.triggered";
                }
                break;
            case -793630009:
                if (!string.equals("app_anr")) {
                    iSerializer = hideCurrentlyDisplayingInAppMessage.serializer('_', 0, 6, string);
                    int iWrite3 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) string, '.', 0, false, 6);
                    if (iSerializer >= 0) {
                        string = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(string, iSerializer, iSerializer + 1, ".").toString();
                    }
                } else {
                    string = "app_anr.detected";
                }
                break;
            case 1827693577:
                if (!string.equals("app_crash")) {
                    iSerializer = hideCurrentlyDisplayingInAppMessage.serializer('_', 0, 6, string);
                    int iWrite4 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) string, '.', 0, false, 6);
                    if (iSerializer >= 0) {
                        string = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(string, iSerializer, iSerializer + 1, ".").toString();
                    }
                } else {
                    string = "app_crash.detected";
                }
                break;
            default:
                iSerializer = hideCurrentlyDisplayingInAppMessage.serializer('_', 0, 6, string);
                int iWrite5 = hideCurrentlyDisplayingInAppMessage.write((CharSequence) string, '.', 0, false, 6);
                if (iSerializer >= 0) {
                    string = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(string, iSerializer, iSerializer + 1, ".").toString();
                }
                break;
        }
        String str = string;
        int i7 = IconCompatParcelizer + 33;
        serializer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        PerseusEvent perseusEvent = new PerseusEvent(null, str, getAllSemanticsNodesToMapfindAllSemanticNodesRecursive.read.contains(str) ? "appLog" : "client", dropShadowRendererProvider.read(), null, null, 49, null);
        InitializeAppStartupItemsImpl initializeAppStartupItemsImpl = this.read;
        if (((Boolean) ((accesstransactionWithWrapper) initializeAppStartupItemsImpl.IconCompatParcelizer).serializer.read()).booleanValue()) {
            Perseus.execute(perseusEvent);
            return;
        }
        transactionWithWrapper transactionwithwrapper = (transactionWithWrapper) initializeAppStartupItemsImpl.serializer;
        transactionwithwrapper.getClass();
        BuildersKt.RemoteActionCompatParcelizer(transactionwithwrapper.RemoteActionCompatParcelizer, (CoroutineDispatcher) transactionwithwrapper.serializer.MediaSessionCompatResultReceiverWrapper(), null, new GetNestScope$invoke$3(transactionwithwrapper, perseusEvent, shortNewsContentCardView, 20), 2);
        int i9 = serializer + 125;
        IconCompatParcelizer = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i9 % 2 != 0) {
            return;
        }
        shortNewsContentCardView.hashCode();
        throw null;
    }
}
