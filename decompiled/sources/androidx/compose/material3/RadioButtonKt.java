package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.Navigator$$ExternalSyntheticLambda1;
import o.AutofillTree;
import o.AwaitFirstLayoutModifier;
import o.MediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.TapGestureDetectorKtprocessTapGestureresetJob1;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.onViewAttachedToWindow;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg;
import o.resolvePointerPrecision;

/* JADX INFO: loaded from: classes.dex */
public abstract class RadioButtonKt {
    public static final float read = Dp.m3673constructorimpl(2.0f);
    public static final float serializer = Dp.m3673constructorimpl(12.0f);
    public static final float IconCompatParcelizer = Dp.m3673constructorimpl(2.0f);

    public static final void RadioButton(boolean z, Modifier modifier, MediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1 mediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        float fM3673constructorimpl;
        long j;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(408580840);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer((Object) null) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= getpostalcode.write(true) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i3 |= getpostalcode.read(mediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1) ? Fields.Clip : 8192;
        }
        int i4 = i3 | 196608;
        if (getpostalcode.write(i4 & 1, (74899 & i4) != 74898)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
            } else {
                modifier2 = Modifier.Companion;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            if (z) {
                fM3673constructorimpl = Dp.m3673constructorimpl(serializer / 2.0f);
            } else {
                fM3673constructorimpl = Dp.m3673constructorimpl(0.0f);
            }
            onViewAttachedToWindow onviewattachedtowindowWrite = TapGestureDetectorKtprocessTapGestureresetJob1.write(fM3673constructorimpl, resolvePointerPrecision.serializer(AutofillTree.FastSpatial, getpostalcode), null, getpostalcode, 0, 12);
            if (z) {
                j = mediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1.read;
            } else if (!z) {
                j = mediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1.RemoteActionCompatParcelizer;
            } else {
                j = mediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1.serializer;
            }
            getpostalcode.serializer(1194696477);
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(j, resolvePointerPrecision.serializer(AutofillTree.DefaultEffects, getpostalcode), null, null, getpostalcode, 0, 12);
            getpostalcode.IconCompatParcelizer(false);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM78requiredSize3ABfNKs = SizeKt.m78requiredSize3ABfNKs(PaddingKt.write(SizeKt.IconCompatParcelizer(modifier2.then(companion).then(companion), Alignment.Companion.getCenter(), 2), read), RadioButtonTokens.write);
            boolean z2 = getpostalcode.read(onviewattachedtowindowIconCompatParcelizer);
            boolean z3 = getpostalcode.read(onviewattachedtowindowWrite);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if ((z2 | z3) || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new Navigator$$ExternalSyntheticLambda1(onviewattachedtowindowIconCompatParcelizer, 4, onviewattachedtowindowWrite);
                getpostalcode.write(objComponentActivity);
            }
            AwaitFirstLayoutModifier.serializer(modifierM78requiredSize3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdanw7AWrZT1ZtNTucsvl4gTUEQRqg(z, modifier2, mediaQuery_androidKtobtainUiMediaScope31invokeinlinedonDispose1, i, 0);
        }
    }
}
