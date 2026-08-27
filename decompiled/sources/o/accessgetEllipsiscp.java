package o;

import com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.Map;
import org.koin.dsl.ModuleDSLKt;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetEllipsiscp {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final isAdapterPositionOnScreen read;
    public final transferSessionPackageI serializer;

    public accessgetEllipsiscp(transferSessionPackageI transfersessionpackagei) {
        transfersessionpackagei.getClass();
        this.serializer = transfersessionpackagei;
        this.read = new isAdapterPositionOnScreen(new StateV3$$ExternalSyntheticLambda0(19));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0073  */
    public final getNone4e0Vf04 RemoteActionCompatParcelizer() {
        SwipeDismissTouchListenerVerticalDismissDirection swipeDismissTouchListenerVerticalDismissDirection;
        String string;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 59;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        FirebaseRemoteConfigImpl firebaseRemoteConfigImpl = (FirebaseRemoteConfigImpl) this.serializer;
        String str = firebaseRemoteConfigImpl.IconCompatParcelizer.read("godroid_ble_scanning_config");
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str)) {
            string = null;
        } else {
            try {
                isVerticalSwipeInAllowedDirection isverticalswipeinalloweddirection = resetTransientState.read;
                prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = isverticalswipeinalloweddirection.RemoteActionCompatParcelizer;
                int i4 = registerInAppMessageManagerlambda40.IconCompatParcelizer;
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpIconCompatParcelizer = pauseWebviewIfNecessarylambda10.IconCompatParcelizer(prepareinappmessagewithzippedassethtml, displayInAppMessagelambda1.IconCompatParcelizer(ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(String.class)), ModuleDSLKt.IconCompatParcelizer(displayInAppMessagelambda1.IconCompatParcelizer(SwipeDismissTouchListenerVerticalDismissDirection.class))));
                setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = setgraphicmodalmaxwidthdpIconCompatParcelizer;
                Map map = (Map) isverticalswipeinalloweddirection.serializer(str, setgraphicmodalmaxwidthdpIconCompatParcelizer);
                String strSerializer = firebaseRemoteConfigImpl.RemoteActionCompatParcelizer.serializer();
                if (strSerializer == null || (swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) map.get(strSerializer)) == null) {
                    swipeDismissTouchListenerVerticalDismissDirection = (SwipeDismissTouchListenerVerticalDismissDirection) map.get("default");
                }
                if (swipeDismissTouchListenerVerticalDismissDirection != null) {
                    int i5 = RemoteActionCompatParcelizer + 93;
                    write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i6 = i5 % 2;
                    string = swipeDismissTouchListenerVerticalDismissDirection.toString();
                } else {
                    string = null;
                }
            } catch (Exception unused) {
            }
        }
        if (string == null) {
            return null;
        }
        try {
            resetTransientState resettransientstate = (resetTransientState) this.read.MediaSessionCompatResultReceiverWrapper();
            resettransientstate.getClass();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = getNone4e0Vf04.Companion.serializer();
            setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp2 = setgraphicmodalmaxwidthdpSerializer;
            return (getNone4e0Vf04) resettransientstate.serializer(string, setgraphicmodalmaxwidthdpSerializer);
        } catch (Exception e) {
            Timber.Forest forest = Timber.RemoteActionCompatParcelizer;
            forest.RemoteActionCompatParcelizer("GetBleScanningConfig");
            forest.RemoteActionCompatParcelizer(e, "Failed to deserialize BLE scanning config into BleScanningConfig", new Object[0]);
            return null;
        }
    }
}
