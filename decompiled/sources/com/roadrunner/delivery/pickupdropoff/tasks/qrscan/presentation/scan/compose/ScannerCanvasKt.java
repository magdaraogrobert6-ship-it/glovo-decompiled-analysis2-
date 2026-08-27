package com.roadrunner.delivery.pickupdropoff.tasks.qrscan.presentation.scan.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import com.roadrunner.customerchat.legacy.core.usecases.CustomerChatEventUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AndroidFontTypefaceLoader;
import o.AwaitFirstLayoutModifier;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.accessgetMaxcp;
import o.buildMapping;
import o.copyiSbpLlYdefault;
import o.divBjo55l4;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.performMeasureDjhGOtQ;
import o.plusqkQi6aY;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScannerCanvasKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    public static final void read(accessgetMaxcp accessgetmaxcp, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        long windowSystemUiVisibility;
        float f;
        int i3 = 2 % 2;
        int i4 = RemoteActionCompatParcelizer + 3;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        accessgetmaxcp.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1743291138);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(accessgetmaxcp) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (getpostalcode.write(i6 & 1, !((i6 & 19) == 18))) {
            modifier2 = Modifier.Companion;
            boolean z = accessgetmaxcp instanceof divBjo55l4;
            if (z) {
                getpostalcode.serializer(265545259);
                windowSystemUiVisibility = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                getpostalcode.IconCompatParcelizer(false);
            } else if (accessgetmaxcp instanceof copyiSbpLlYdefault) {
                int i7 = RemoteActionCompatParcelizer + 43;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                getpostalcode.serializer(265547085);
                windowSystemUiVisibility = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(accessgetmaxcp instanceof plusqkQi6aY)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 265543306, false);
                }
                getpostalcode.serializer(265548907);
                windowSystemUiVisibility = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getWindowSystemUiVisibility();
                getpostalcode.IconCompatParcelizer(false);
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(windowSystemUiVisibility, null, "borderColor", null, getpostalcode, 384, 10);
            if (z) {
                f = Dimensions.write;
            } else {
                f = Dimensions.IconCompatParcelizer;
                int i9 = IconCompatParcelizer + 31;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
            }
            onViewAttachedToWindow onviewattachedtowindowWrite = TapGestureDetectorKtprocessTapGestureresetJob1.write(f, null, "borderWidth", getpostalcode, 384, 10);
            long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0.84f, 0.0f, 0.0f, 0.0f, 14, null);
            Modifier modifierThen = modifier2.then(SizeKt.read);
            boolean zSerializer = getpostalcode.serializer(jM721copywmQWz5c$default);
            boolean z2 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
            boolean z3 = getpostalcode.read(onviewattachedtowindowWrite);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((zSerializer | z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new CustomerChatEventUseCase$$ExternalSyntheticLambda0(jM721copywmQWz5c$default, onviewattachedtowindowIconCompatParcelizer, onviewattachedtowindowWrite);
                getpostalcode.write(objComponentActivity);
            }
            AwaitFirstLayoutModifier.serializer(modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 25, accessgetmaxcp, modifier2);
        }
        int i11 = IconCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
    }
}
