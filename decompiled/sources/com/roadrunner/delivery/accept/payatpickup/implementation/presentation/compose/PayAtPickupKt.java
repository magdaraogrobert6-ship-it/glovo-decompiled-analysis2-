package com.roadrunner.delivery.accept.payatpickup.implementation.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextOverflow;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPrefetchScheduler;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LineHeightSpan;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PayAtPickupKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    public static final void PayAtPickup(LineHeightSpan lineHeightSpan, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1713086825);
        if ((i & 6) == 0) {
            if ((i & 8) != 0) {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(lineHeightSpan);
            } else {
                int i4 = RemoteActionCompatParcelizer + 83;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                zIconCompatParcelizer = getpostalcode2.read(lineHeightSpan);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if (!getpostalcode2.write(i6 & 1, (i6 & 19) != 18)) {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        } else {
            int i7 = RemoteActionCompatParcelizer + 55;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            modifier2 = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(modifier2, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierWrite2 = PaddingKt.write(BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getPopupTheme(), RectangleShapeKt.getRectangleShape()), Dimensions.setActionBarVisibilityCallback);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, Alignment.Companion.getCenterVertically(), getpostalcode2, 54);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                Modifier modifierThen = modifier2.then(new show(1.0f, true));
                float f = Dimensions.getActionBarHideOffset;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierThen, 0.0f, 0.0f, f, 0.0f, 11);
                modifierM74paddingqDBjuR0$default.getClass();
                String str = lineHeightSpan.read;
                TextOverflow.Companion companion2 = TextOverflow.Companion;
                TextKt.m131TextNvy7gAk(str, modifierM74paddingqDBjuR0$default, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, companion2.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 24960, 110584);
                Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(modifier2, f, 0.0f, 0.0f, 0.0f, 14);
                modifierM74paddingqDBjuR0$default2.getClass();
                TextKt.m131TextNvy7gAk(lineHeightSpan.serializer, modifierM74paddingqDBjuR0$default2, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, companion2.m3569getEllipsisgIe3tQ8(), false, 2, 0, null, (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 24960, 110584);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPrefetchScheduler(lineHeightSpan, modifier2, i, 28);
        }
    }
}
