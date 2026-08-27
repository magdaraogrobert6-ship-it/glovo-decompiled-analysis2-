package com.roadrunner.rrds.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import java.util.Arrays;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.ArrangementCenter1;
import o.ArrangementHorizontal;
import o.BoxMeasurePolicy;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.onViewAttachedToWindowlambda0;
import o.performFling;
import o.performMeasureDjhGOtQ;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ModifierAnimatedGradientBorderKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public static final float serializer = Dp.m3673constructorimpl(2.0f);
    private static int write;

    static {
        int i = read + 35;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final Modifier serializer(Modifier modifier, getTopLeftannotations gettopleftannotations, float f, getBirthDateFull getbirthdatefull, int i) {
        float f2;
        int i2 = 2 % 2;
        int i3 = write + 101;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        modifier.getClass();
        gettopleftannotations.getClass();
        if ((i & 2) != 0) {
            int i5 = write + 115;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            f2 = serializer;
        } else {
            f2 = f;
        }
        setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        onViewAttachedToWindowlambda0[] onviewattachedtowindowlambda0Arr = {new onViewAttachedToWindowlambda0(Float.valueOf(0.0f), Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled())), new onViewAttachedToWindowlambda0(Float.valueOf(0.6f), Color.m712boximpl(((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setSupportBackgroundTintMode()))};
        ArrangementHorizontal arrangementHorizontal = ArrangementCenter1.read(null, getbirthdatefull, 1);
        Object[] objArr = {2000, 0, performFling.read, 2};
        placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 0.0f, 360.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr), BoxMeasurePolicy.Restart, 4), null, getbirthdatefull, 4536, 8);
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        Object objComponentActivity = getpostalcode2.ComponentActivity();
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        if (objComponentActivity == androidContentCaptureManager) {
            int i7 = write + 87;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            objComponentActivity = Brush.Companion.m672linearGradientmHitzGk$default(Brush.Companion, (onViewAttachedToWindowlambda0[]) Arrays.copyOf(onviewattachedtowindowlambda0Arr, 2), 0L, 0L, 0, 14, (Object) null);
            getpostalcode2.write(objComponentActivity);
        }
        Brush brush = (Brush) objComponentActivity;
        Modifier modifierWrite = PaddingKt.write(ClipKt.clip(modifier, gettopleftannotations), f2);
        boolean z = getpostalcode2.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
        Object objComponentActivity2 = getpostalcode2.ComponentActivity();
        if (z || objComponentActivity2 == androidContentCaptureManager) {
            objComponentActivity2 = new TncContentKt$$ExternalSyntheticLambda1(placespacebetweenfoundation_layoutIconCompatParcelizer, 12, brush);
            getpostalcode2.write(objComponentActivity2);
        }
        return DrawModifierKt.drawWithContent(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2);
    }
}
