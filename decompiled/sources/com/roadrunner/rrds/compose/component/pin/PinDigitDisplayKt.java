package com.roadrunner.rrds.compose.component.pin;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AdjustBridgeInstance8;
import o.AndroidContentCaptureManagerCompanion;
import o.ArrangementCenter1;
import o.ArrangementHorizontal;
import o.BoxMeasurePolicy;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TapGestureDetectorKtdetectTapGestures21;
import o.buildMapping;
import o.execAdidCallbackCommand;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getTopLeftannotations;
import o.onShowTranslationui;
import o.onViewAttachedToWindow;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;
import o.setChildui;
import o.setCurrentSemanticsNodesui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PinDigitDisplayKt {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public static final setChildui serializer;
    public static final float read = Dp.m3673constructorimpl(1.5f);
    public static final float RemoteActionCompatParcelizer = Dp.m3673constructorimpl(10.0f);
    public static final float write = Dp.m3673constructorimpl(60.0f);

    static {
        Color.Companion companion = Color.Companion;
        serializer = new setChildui(companion.m757getTransparent0d7_KjU(), companion.m757getTransparent0d7_KjU());
        int i = MediaDescriptionCompat + 33;
        IconCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x027d  */
    /* JADX WARN: Code duplicated, block: B:96:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:97:0x02cf  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void PinDigitDisplay(Character ch, boolean z, boolean z2, boolean z3, boolean z4, Modifier modifier, String str, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z5;
        long jReportFullyDrawn;
        long jM757getTransparent0d7_KjU;
        boolean z6;
        int i3;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1829261850);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(ch) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !(getpostalcode2.write(z) ^ true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.write(z2)) {
                int i6 = RatingCompat + 97;
                MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 3072) == 0) {
            int i8 = RatingCompat + 77;
            MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                getpostalcode2.write(z3);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.write(z3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i9 = MediaBrowserCompatMediaItem + 33;
            RatingCompat = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode2.write(z4);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode2.write(z4) ? Fields.Clip : 8192;
        }
        int i10 = i2 | 196608;
        if ((1572864 & i) == 0) {
            if (getpostalcode2.read(str)) {
                int i11 = RatingCompat + 39;
                MediaBrowserCompatMediaItem = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 1048576;
            } else {
                i3 = Fields.BlendMode;
            }
            i10 |= i3;
        }
        int i13 = i10;
        if (getpostalcode2.write(i13 & 1, (i13 & 599187) != 599186)) {
            Modifier.Companion companion = Modifier.Companion;
            getTopLeftannotations gettopleftannotationsIconCompatParcelizer = RoundedCornerShapeKt.IconCompatParcelizer(Dimensions._init_lambda1);
            ArrangementHorizontal arrangementHorizontal = ArrangementCenter1.read(null, getpostalcode2, 1);
            int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 1.0f, 0.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite, new Object[]{600, 0, null, 6}), BoxMeasurePolicy.Reverse, 4), null, getpostalcode2, 4536, 8);
            if (z3) {
                int i14 = RatingCompat + 103;
                MediaBrowserCompatMediaItem = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode2.serializer(1279039013);
                jReportFullyDrawn = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setSupportBackgroundTintList();
                z5 = false;
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                z5 = false;
                if (z2) {
                    getpostalcode2.serializer(1279040390);
                    jReportFullyDrawn = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setContentView();
                    getpostalcode2.IconCompatParcelizer(false);
                } else if (z) {
                    getpostalcode2.serializer(1279042856);
                    jReportFullyDrawn = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).startActivityForResult();
                    getpostalcode2.IconCompatParcelizer(false);
                } else if (z4) {
                    getpostalcode2.serializer(1279047752);
                    jReportFullyDrawn = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).reportFullyDrawn();
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(1279045353);
                    jReportFullyDrawn = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).removeOnUserLeaveHintListener();
                    getpostalcode2.IconCompatParcelizer(false);
                }
            }
            boolean z7 = z5;
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(jReportFullyDrawn, null, null, null, getpostalcode2, 0, 14);
            if (z4) {
                getpostalcode2.serializer(1279055717);
                getpostalcode2.IconCompatParcelizer(z7);
                jM757getTransparent0d7_KjU = Color.Companion.m757getTransparent0d7_KjU();
            } else {
                getpostalcode2.serializer(1279053261);
                jM757getTransparent0d7_KjU = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).onBackPressedDispatcher_delegatelambda0();
                getpostalcode2.IconCompatParcelizer(z7);
            }
            onViewAttachedToWindow onviewattachedtowindowIconCompatParcelizer2 = TapGestureDetectorKtdetectTapGestures21.IconCompatParcelizer(jM757getTransparent0d7_KjU, null, null, null, getpostalcode2, 0, 14);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            long jM721copywmQWz5c$default = Color.m721copywmQWz5c$default(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setEmojiCompatEnabled(), ((Number) ((onShowTranslationui) placespacebetweenfoundation_layoutIconCompatParcelizer.MediaSessionCompatQueueItem).getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
            Modifier.Companion companion2 = companion;
            Modifier modifierWrite = BorderKt.write(BackgroundKt.m20backgroundbw27NRU(SizeKt.m75height3ABfNKs(companion2, write), ((Color) onviewattachedtowindowIconCompatParcelizer2.getValue()).m732unboximpl(), gettopleftannotationsIconCompatParcelizer), Dimensions.MediaSessionCompatResultReceiverWrapper, ((Color) onviewattachedtowindowIconCompatParcelizer.getValue()).m732unboximpl(), gettopleftannotationsIconCompatParcelizer);
            char c = (i13 & 112) == 32 ? (char) 1 : z7 ? 1 : 0;
            char c2 = (i13 & 14) == 4 ? (char) 1 : z7 ? 1 : 0;
            boolean zSerializer = getpostalcode2.serializer(jM721copywmQWz5c$default);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if ((c2 | c | (zSerializer ? 1 : 0)) == 0) {
                int i16 = MediaBrowserCompatMediaItem + 43;
                RatingCompat = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new execAdidCallbackCommand(z, ch, jM721copywmQWz5c$default);
                    getpostalcode2.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new execAdidCallbackCommand(z, ch, jM721copywmQWz5c$default);
                getpostalcode2.write(objComponentActivity);
            }
            Modifier modifierDrawBehind = DrawModifierKt.drawBehind(modifierWrite, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), z7);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierDrawBehind);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i18 = RatingCompat + 61;
            MediaBrowserCompatMediaItem = i18 % Fields.SpotShadowColor;
            if (i18 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z8 = getpostalcode2.ComponentActivity;
                int i19 = 69 / (z7 ? 1 : 0);
                if (z8) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i20 = RatingCompat + 73;
                    MediaBrowserCompatMediaItem = i20 % Fields.SpotShadowColor;
                    int i21 = i20 % 2;
                }
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    int i22 = RatingCompat + 73;
                    MediaBrowserCompatMediaItem = i22 % Fields.SpotShadowColor;
                    int i23 = i22 % 2;
                }
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if (ch != null) {
                getpostalcode2.serializer(-1683731440);
                char cCharValue = ch.charValue();
                TextKt.m131TextNvy7gAk(String.valueOf(cCharValue), null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RatingCompat(), getpostalcode2, 0, 0, 131066);
                getpostalcode2.IconCompatParcelizer(z7);
                companion2 = companion2;
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-1683535489);
                if (z || str == null) {
                    z6 = z7 ? 1 : 0;
                    getpostalcode = getpostalcode2;
                    getpostalcode.serializer(-1683265758);
                    getpostalcode.IconCompatParcelizer(z6);
                } else {
                    getpostalcode2.serializer(-1683460314);
                    TextStyle textStyleRatingCompat = performLayout.RatingCompat();
                    z6 = z7 ? 1 : 0;
                    TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleRatingCompat, getpostalcode2, (i13 >> 18) & 14, 0, 131066);
                    getpostalcode = getpostalcode2;
                    getpostalcode.IconCompatParcelizer(z6);
                }
                getpostalcode.IconCompatParcelizer(z6);
            }
            int i24 = MediaBrowserCompatMediaItem + 35;
            RatingCompat = i24 % Fields.SpotShadowColor;
            int i25 = i24 % 2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AdjustBridgeInstance8(ch, z, z2, z3, z4, modifier2, str, i);
        }
    }
}
