package com.roadrunner.delivery.pickupdropoff.tasks.multiplecodescan.presentation.scan.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.text.MultiParagraph$$ExternalSyntheticLambda0;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import o.AndroidContentCaptureManager;
import o.AndroidUiMode;
import o.SourceContext;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.UiToolingDataApi;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLocations;
import o.getNewPassword;
import o.getPackageHash;
import o.getPostalCode;
import o.getSourceFile;
import o.getStore;
import o.handleUrlOverridelambda1;
import o.invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0;
import o.onViewAttachedToWindow;
import o.performMeasureDjhGOtQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScannerCanvasKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    public static final void RemoteActionCompatParcelizer(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationTakePictureTaskComposableFactoryV1ImplExternalSyntheticLambda0 invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0, Modifier modifier, Float f, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        long supportBackgroundTintList;
        float f2;
        int i3 = 2 % 2;
        invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(462256697);
        if ((i & 6) == 0) {
            i2 = (!((i & 8) == 0 ? getpostalcode.read(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0) : getpostalcode.IconCompatParcelizer(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= getpostalcode.read(f) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i4 & 1, (i4 & 147) != 146)) {
            int i5 = write + 41;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            Modifier.Companion companion = Modifier.Companion;
            boolean z = invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof AndroidUiMode;
            if (z) {
                getpostalcode.serializer(1847062178);
                long popupTheme = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme();
                getpostalcode.IconCompatParcelizer(false);
                int i7 = write + 67;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    int i8 = 4 % 4;
                }
                supportBackgroundTintList = popupTheme;
            } else if ((invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof SourceContext) || (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getLocations)) {
                getpostalcode.serializer(1847064898);
                supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).read();
                getpostalcode.IconCompatParcelizer(false);
            } else if ((invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getPackageHash) || (invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof getSourceFile)) {
                getpostalcode.serializer(1847067556);
                supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0 instanceof UiToolingDataApi)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1847060461, false);
                }
                int i9 = write + 17;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode.serializer(1847069410);
                supportBackgroundTintList = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getWindowSystemUiVisibility();
                getpostalcode.IconCompatParcelizer(false);
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(supportBackgroundTintList, null, "borderColor", null, getpostalcode, 384, 10);
            Object obj = null;
            if (!(!z)) {
                int i11 = RemoteActionCompatParcelizer + 15;
                write = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0) {
                    float f3 = Dimensions.write;
                    obj.hashCode();
                    throw null;
                }
                f2 = Dimensions.write;
            } else {
                f2 = Dimensions.IconCompatParcelizer;
            }
            onViewAttachedToWindow onviewattachedtowindowWrite = TapGestureDetectorKtprocessTapGestureresetJob1.write(f2, null, "borderWidth", getpostalcode, 384, 10);
            long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0.84f, 0.0f, 0.0f, 0.0f, 14, null);
            Modifier modifierThen = companion.then(SizeKt.read);
            boolean z2 = (i4 & 896) == 256;
            boolean zSerializer = getpostalcode.serializer(jM721copywmQWz5c$default);
            boolean z3 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
            boolean z4 = getpostalcode.read(onviewattachedtowindowWrite);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!(zSerializer | z2 | z3) && !z4) {
                int i12 = RemoteActionCompatParcelizer + 117;
                write = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    MultiParagraph$$ExternalSyntheticLambda0 multiParagraph$$ExternalSyntheticLambda0 = new MultiParagraph$$ExternalSyntheticLambda0(f, jM721copywmQWz5c$default, onviewattachedtowindowIconCompatParcelizer, onviewattachedtowindowWrite);
                    getpostalcode.write(multiParagraph$$ExternalSyntheticLambda0);
                    objComponentActivity = multiParagraph$$ExternalSyntheticLambda0;
                }
            } else {
                MultiParagraph$$ExternalSyntheticLambda0 multiParagraph$$ExternalSyntheticLambda1 = new MultiParagraph$$ExternalSyntheticLambda0(f, jM721copywmQWz5c$default, onviewattachedtowindowIconCompatParcelizer, onviewattachedtowindowWrite);
                getpostalcode.write(multiParagraph$$ExternalSyntheticLambda1);
                objComponentActivity = multiParagraph$$ExternalSyntheticLambda1;
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, DrawModifierKt.drawWithCache(modifierThen, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity)});
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 25, modifier2, (Object) invokecomroadrunnerdeliverypickupdropofftaskstakepicturepresentationtakepicturetaskcomposablefactoryv1implexternalsyntheticlambda0, (Object) f);
        }
    }
}
