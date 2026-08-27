package o;

import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FocusPropertiesenter1 implements toAndroidColorSpace {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Serializable read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ FocusPropertiesenter1(Object obj, Serializable serializable, Object obj2, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.read = serializable;
        this.write = obj2;
    }

    @Override // o.toAndroidColorSpace
    public final void onStateChanged(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp, AndroidColorSpace_androidKt androidColorSpace_androidKt) {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        Serializable serializable = this.read;
        Object obj2 = this.serializer;
        if (i != 0) {
            getStyleTiuSbCo getstyletiusbco = (getStyleTiuSbCo) obj2;
            createInAppMessageEventSubscriber createinappmessageeventsubscriber = (createInAppMessageEventSubscriber) serializable;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj;
            int i2 = getStrokeMiterLimit.write[androidColorSpace_androidKt.ordinal()];
            if (i2 == 3) {
                createinappmessageeventsubscriber.IconCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getstyletiusbco);
                return;
            } else {
                if (i2 != 4) {
                    return;
                }
                isAntiAlias isantialias = (isAntiAlias) createinappmessageeventsubscriber.IconCompatParcelizer;
                if (isantialias != null) {
                    isantialias.write();
                }
                createinappmessageeventsubscriber.IconCompatParcelizer = null;
                return;
            }
        }
        FocusPropertiesCompanion focusPropertiesCompanion = (FocusPropertiesCompanion) obj2;
        toColorLong8_81llA tocolorlong8_81lla = (toColorLong8_81llA) serializable;
        getUnsetFocusRect getunsetfocusrect = (getUnsetFocusRect) obj;
        focusPropertiesCompanion.getClass();
        Runnable runnable = focusPropertiesCompanion.serializer;
        CopyOnWriteArrayList copyOnWriteArrayList = focusPropertiesCompanion.write;
        if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.upTo(tocolorlong8_81lla)) {
            copyOnWriteArrayList.add(getunsetfocusrect);
            runnable.run();
        } else if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.ON_DESTROY) {
            focusPropertiesCompanion.read(getunsetfocusrect);
        } else if (androidColorSpace_androidKt == AndroidColorSpace_androidKt.downFrom(tocolorlong8_81lla)) {
            copyOnWriteArrayList.remove(getunsetfocusrect);
            runnable.run();
        }
    }
}
