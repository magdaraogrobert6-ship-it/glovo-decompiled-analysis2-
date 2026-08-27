package bo.app;

import androidx.compose.ui.graphics.Fields;
import com.braze.models.BrazeGeofence;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageSlideupViewFactory;
import o.DefaultInAppMessageViewWrapperFactory;
import o.afterClosed;
import o.beforeInAppMessageViewClosed;
import o.createInAppMessageViewlambda1;
import o.getInAppMessageManager;
import o.getWasCloseMessageCalled;
import o.onCloseActionlambda1;
import o.onCloseClicked;
import o.performClickAction;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements getInAppMessageManager {
    public static final v1 a;
    private static final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public /* bridge */ /* synthetic */ setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        v1 v1Var = new v1();
        a = v1Var;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.braze.models.BrazeGeofence", v1Var, 12);
        oncloseactionlambda1.read("id", false);
        oncloseactionlambda1.read("latitude", false);
        oncloseactionlambda1.read("longitude", false);
        oncloseactionlambda1.read(BrazeGeofence.RADIUS_METERS, false);
        oncloseactionlambda1.read(BrazeGeofence.COOLDOWN_ENTER_SECONDS, false);
        oncloseactionlambda1.read(BrazeGeofence.COOLDOWN_EXIT_SECONDS, false);
        oncloseactionlambda1.read(BrazeGeofence.ANALYTICS_ENABLED_ENTER, false);
        oncloseactionlambda1.read(BrazeGeofence.ANALYTICS_ENABLED_EXIT, false);
        oncloseactionlambda1.read(BrazeGeofence.ENTER_EVENTS, false);
        oncloseactionlambda1.read(BrazeGeofence.EXIT_EVENTS, false);
        oncloseactionlambda1.read(BrazeGeofence.NOTIFICATION_RESPONSIVENESS_MS, false);
        oncloseactionlambda1.read("distanceFromGeofenceRefresh", true);
        descriptor = oncloseactionlambda1;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s r8lambdax_kosero69poudwq9u1vzzayj1s = r8lambdaX_kOsERo69pOudWq9u1vZzAyj1s.RemoteActionCompatParcelizer;
        afterClosed afterclosed = afterClosed.IconCompatParcelizer;
        getWasCloseMessageCalled getwasclosemessagecalled = getWasCloseMessageCalled.write;
        return new setGraphicModalMaxWidthDp[]{beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, r8lambdax_kosero69poudwq9u1vzzayj1s, r8lambdax_kosero69poudwq9u1vzzayj1s, afterclosed, afterclosed, afterclosed, getwasclosemessagecalled, getwasclosemessagecalled, getwasclosemessagecalled, getwasclosemessagecalled, afterclosed, r8lambdax_kosero69poudwq9u1vzzayj1s};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        BrazeGeofence brazeGeofence = (BrazeGeofence) obj;
        defaultInAppMessageViewWrapperFactory.getClass();
        brazeGeofence.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        BrazeGeofence.write$Self$android_sdk_base_release(brazeGeofence, defaultInAppMessageSlideupViewFactorySerializer, r8lambda92m0p9sit5uf70mvjf4rwmruda);
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        defaultInAppMessageModalViewFactoryCompanion.getClass();
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        createinappmessageviewlambda1Serializer.getClass();
        int i = 0;
        int iIconCompatParcelizer = 0;
        int iIconCompatParcelizer2 = 0;
        int iIconCompatParcelizer3 = 0;
        boolean zWrite = false;
        boolean zWrite2 = false;
        boolean zWrite3 = false;
        boolean zWrite4 = false;
        int iIconCompatParcelizer4 = 0;
        String strMediaMetadataCompat = null;
        double dRemoteActionCompatParcelizer = 0.0d;
        double dRemoteActionCompatParcelizer2 = 0.0d;
        double dRemoteActionCompatParcelizer3 = 0.0d;
        boolean z = true;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(r8lambda92m0p9sit5uf70mvjf4rwmruda);
            switch (i2) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(r8lambda92m0p9sit5uf70mvjf4rwmruda, 0);
                    i |= 1;
                    break;
                case 1:
                    dRemoteActionCompatParcelizer = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 1);
                    i |= 2;
                    break;
                case 2:
                    dRemoteActionCompatParcelizer2 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 2);
                    i |= 4;
                    break;
                case 3:
                    iIconCompatParcelizer = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 3);
                    i |= 8;
                    break;
                case 4:
                    iIconCompatParcelizer2 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 4);
                    i |= 16;
                    break;
                case 5:
                    iIconCompatParcelizer3 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 5);
                    i |= 32;
                    break;
                case 6:
                    zWrite = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 6);
                    i |= 64;
                    break;
                case 7:
                    zWrite2 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 7);
                    i |= Fields.SpotShadowColor;
                    break;
                case 8:
                    zWrite3 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 8);
                    i |= Fields.RotationX;
                    break;
                case 9:
                    zWrite4 = createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda, 9);
                    i |= Fields.RotationY;
                    break;
                case 10:
                    iIconCompatParcelizer4 = createinappmessageviewlambda1Serializer.IconCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 10);
                    i |= Fields.RotationZ;
                    break;
                case 11:
                    dRemoteActionCompatParcelizer3 = createinappmessageviewlambda1Serializer.RemoteActionCompatParcelizer(r8lambda92m0p9sit5uf70mvjf4rwmruda, 11);
                    i |= Fields.CameraDistance;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
        }
        createinappmessageviewlambda1Serializer.write(r8lambda92m0p9sit5uf70mvjf4rwmruda);
        return new BrazeGeofence(i, strMediaMetadataCompat, dRemoteActionCompatParcelizer, dRemoteActionCompatParcelizer2, iIconCompatParcelizer, iIconCompatParcelizer2, iIconCompatParcelizer3, zWrite, zWrite2, zWrite3, zWrite4, iIconCompatParcelizer4, dRemoteActionCompatParcelizer3, (onCloseClicked) null);
    }
}
