package com.roadrunner.opportunities.calendar.entrypoint;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BonusCalendarButtonKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    public static final void BonusCalendarButton(int i, getBirthDateFull getbirthdatefull, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = read + 93;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2020761951);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            int i6 = RemoteActionCompatParcelizer + 121;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 = i;
        }
        int i8 = i2 | 48;
        if (getpostalcode2.write(i8 & 1, (i8 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion;
            boolean z = (i8 & 14) == 4;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            Object obj = null;
            if (z) {
                objComponentActivity = new b1$$ExternalSyntheticLambda0(26, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode2.write(objComponentActivity);
            } else {
                int i9 = RemoteActionCompatParcelizer + 17;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    obj.hashCode();
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new b1$$ExternalSyntheticLambda0(26, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity);
                }
            }
            Modifier modifierRemoteActionCompatParcelizer = ClickableKt.RemoteActionCompatParcelizer(companion, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, 15);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = RemoteActionCompatParcelizer + 59;
            read = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i12 = read + 115;
                RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 == 0) {
                    getpostalcode2.serializer(constructor);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            String strStringResource = StringResources_androidKt.stringResource(R.string.rush_bonus_calendar_button_title, getpostalcode2, 0);
            TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(strStringResource, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            companion.getClass();
            modifier2 = companion;
            getpostalcode = getpostalcode2;
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_bold_medium_calendar_bonus, getpostalcode, 0), (String) null, PaddingKt.write(modifier2, Dimensions.setSplitBackground), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), getpostalcode, Painter.$stable | 48, 0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaaawFTjN5WDWgcOgLP5ubNLgfVTw(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 14);
        }
    }
}
