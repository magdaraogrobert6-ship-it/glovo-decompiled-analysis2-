package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import fwfd.com.fwfsdk.util.FWFHelper;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class onDraw implements getInAppMessageManager {
    private static final /* synthetic */ onCloseActionlambda1 descriptor;
    public static final onDraw write;

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return descriptor;
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] typeParametersSerializers() {
        return performClickAction.IconCompatParcelizer;
    }

    static {
        onDraw ondraw = new onDraw();
        write = ondraw;
        onCloseActionlambda1 oncloseactionlambda1 = new onCloseActionlambda1("com.deliveryhero.customerchat.eventTracking.data.UserProperties", ondraw, 10);
        oncloseactionlambda1.read("userType", true);
        oncloseactionlambda1.read("deviceType", true);
        oncloseactionlambda1.read("deviceName", true);
        oncloseactionlambda1.read("deviceManufacturer", true);
        oncloseactionlambda1.read("osVersion", true);
        oncloseactionlambda1.read("sdkType", true);
        oncloseactionlambda1.read("sdkVersion", true);
        oncloseactionlambda1.read("hostApp", true);
        oncloseactionlambda1.read("appVersion", true);
        oncloseactionlambda1.read("sdkConsumerVersion", true);
        descriptor = oncloseactionlambda1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0066  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c6  */
    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        applyAlpha applyalpha = (applyAlpha) obj;
        applyalpha.getClass();
        String str = applyalpha.sdkConsumerVersion;
        String str2 = applyalpha.appVersion;
        String str3 = applyalpha.hostApp;
        String str4 = applyalpha.sdkVersion;
        String str5 = applyalpha.sdkType;
        String str6 = applyalpha.osVersion;
        String str7 = applyalpha.deviceManufacturer;
        String str8 = applyalpha.deviceName;
        String str9 = applyalpha.deviceType;
        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = applyalpha.userType;
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        DefaultInAppMessageSlideupViewFactory defaultInAppMessageSlideupViewFactorySerializer = defaultInAppMessageViewWrapperFactory.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = applyAlpha.$childSerializers;
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || resolvelockhardwarecanvasmethod != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 0, setgraphicmodalmaxwidthdpArr[0], resolvelockhardwarecanvasmethod);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str9);
        } else {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{str9, "mobile"}, iWrite3)).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 1, str9);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str8 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str8);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str7 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str6 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1)) {
            defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 5, str5);
        } else {
            Object[] objArr = {str5, FWFHelper.fwfDeviceOS};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                defaultInAppMessageSlideupViewFactorySerializer.serializer(oncloseactionlambda1, 5, str5);
            }
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str4 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str3 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str2 != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
        }
        if (defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1) || str != null) {
            defaultInAppMessageSlideupViewFactorySerializer.read(oncloseactionlambda1, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
        }
        defaultInAppMessageSlideupViewFactorySerializer.IconCompatParcelizer(oncloseactionlambda1);
    }

    @Override // o.getInAppMessageManager
    public final setGraphicModalMaxWidthDp[] childSerializers() {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = LazyKt__LazyJVMKt.read(applyAlpha.$childSerializers[0]);
        beforeInAppMessageViewClosed beforeinappmessageviewclosed = beforeInAppMessageViewClosed.RemoteActionCompatParcelizer;
        return new setGraphicModalMaxWidthDp[]{setgraphicmodalmaxwidthdp, beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), beforeinappmessageviewclosed, LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed), LazyKt__LazyJVMKt.read(beforeinappmessageviewclosed)};
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        onCloseActionlambda1 oncloseactionlambda1 = descriptor;
        createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(oncloseactionlambda1);
        setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr = applyAlpha.$childSerializers;
        createinappmessageviewlambda1Serializer.getClass();
        String str = null;
        String str2 = null;
        boolean z = true;
        String str3 = null;
        int i = 0;
        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = null;
        String strMediaMetadataCompat = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String strMediaMetadataCompat2 = null;
        String str7 = null;
        while (z) {
            int i2 = createinappmessageviewlambda1Serializer.read(oncloseactionlambda1);
            switch (i2) {
                case -1:
                    z = false;
                    continue;
                    z = z;
                    break;
                case 0:
                    z = z;
                    resolvelockhardwarecanvasmethod = (resolveLockHardwareCanvasMethod) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 0, setgraphicmodalmaxwidthdpArr[0], resolvelockhardwarecanvasmethod);
                    i |= 1;
                    continue;
                    z = z;
                    break;
                case 1:
                    strMediaMetadataCompat = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 1);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 2, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str4);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 3, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str5);
                    i |= 8;
                    break;
                case 4:
                    str6 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 4, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str6);
                    i |= 16;
                    break;
                case 5:
                    strMediaMetadataCompat2 = createinappmessageviewlambda1Serializer.MediaMetadataCompat(oncloseactionlambda1, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 6, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str7);
                    i |= 64;
                    break;
                case 7:
                    str3 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 7, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str3);
                    i |= androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    break;
                case 8:
                    str = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 8, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str);
                    i |= androidx.compose.ui.graphics.Fields.RotationX;
                    break;
                case 9:
                    str2 = (String) createinappmessageviewlambda1Serializer.serializer(oncloseactionlambda1, 9, beforeInAppMessageViewClosed.RemoteActionCompatParcelizer, str2);
                    i |= androidx.compose.ui.graphics.Fields.RotationY;
                    break;
                default:
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer(i2);
                    return null;
            }
            z = z;
        }
        createinappmessageviewlambda1Serializer.write(oncloseactionlambda1);
        return new applyAlpha(i, resolvelockhardwarecanvasmethod, strMediaMetadataCompat, str4, str5, str6, strMediaMetadataCompat2, str7, str3, str, str2);
    }
}
