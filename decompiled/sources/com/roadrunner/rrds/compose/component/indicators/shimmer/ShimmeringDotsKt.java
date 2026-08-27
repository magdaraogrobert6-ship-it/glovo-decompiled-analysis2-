package com.roadrunner.rrds.compose.component.indicators.shimmer;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.m1$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.ArrangementCenter1;
import o.ArrangementHorizontal;
import o.BoxMeasurePolicy;
import o.BrazeInAppMessageManagerExternalSyntheticLambda45;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.TextFieldDefaults;
import o.aspectRatiodefault;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.setClickable;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShimmeringDotsKt {
    private static int IconCompatParcelizer = 1;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public static final aspectRatiodefault read;
    public static final aspectRatiodefault serializer;
    public static final aspectRatiodefault write;

    static {
        Object[] objArr = {new BrazeInAppMessageManagerExternalSyntheticLambda45(5)};
        int iWrite = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        read = (aspectRatiodefault) DelayKt.write(-1328669373, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 1328669375, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite, objArr);
        Object[] objArr2 = {new BrazeInAppMessageManagerExternalSyntheticLambda45(6)};
        int iWrite2 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        serializer = (aspectRatiodefault) DelayKt.write(-1328669373, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 1328669375, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite2, objArr2);
        Object[] objArr3 = {new BrazeInAppMessageManagerExternalSyntheticLambda45(7)};
        int iWrite3 = r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write();
        write = (aspectRatiodefault) DelayKt.write(-1328669373, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), 1328669375, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), iWrite3, objArr3);
        int i = IconCompatParcelizer + 121;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002e A[PHI: r1
  0x002e: PHI (r1v6 o.getPostalCode) = (r1v5 o.getPostalCode), (r1v11 o.getPostalCode) binds: [B:8:0x002c, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ShimmeringDots-FNF3uiM, reason: not valid java name */
    public static final void m5051ShimmeringDotsFNF3uiM(Modifier modifier, TextStyle textStyle, long j, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        int i2;
        Modifier modifier2;
        TextStyle textStyleMediaSessionCompatToken;
        long menu;
        int i3 = 2 % 2;
        int i4 = MediaBrowserCompatMediaItem + 45;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1163285888);
            i2 = i | 40;
            if ((i & 1) == 0) {
                i2 = i | 22;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1163285888);
            i2 = i | 6;
            if ((i & 48) == 0) {
                i2 = i | 22;
            }
        }
        if ((i & 384) == 0) {
            i2 |= Fields.SpotShadowColor;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) != 0 && !getpostalcode.PlaybackStateCompat()) {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier2 = modifier;
                textStyleMediaSessionCompatToken = textStyle;
                menu = j;
            } else {
                modifier2 = Modifier.Companion;
                textStyleMediaSessionCompatToken = performLayout.MediaSessionCompatToken();
                menu = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setMenu();
            }
            getpostalcode.RemoteActionCompatParcelizer();
            ArrangementHorizontal arrangementHorizontal = ArrangementCenter1.read("shimmering_dots_transition", getpostalcode, 0);
            Object obj = null;
            getPostalCode getpostalcode2 = getpostalcode;
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 1.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer(read, (BoxMeasurePolicy) null, 6), "shimmering_first_dot_animation", getpostalcode2, 29112, 0);
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer2 = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 1.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer(serializer, (BoxMeasurePolicy) null, 6), "shimmering_second_dot_animation", getpostalcode2, 29112, 0);
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer3 = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 1.0f, 1.0f, DelayKt.RemoteActionCompatParcelizer(write, (BoxMeasurePolicy) null, 6), "shimmering_third_dot_animation", getpostalcode2, 29112, 0);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i5 = MediaBrowserCompatMediaItem + 65;
            RatingCompat = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion2 = Modifier.Companion;
                boolean z = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer, 13);
                    getpostalcode.write(objComponentActivity);
                }
                TextKt.m131TextNvy7gAk(".", GraphicsLayerModifierKt.graphicsLayer(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), menu, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, getpostalcode, 6, 0, 131064);
                boolean z2 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer2);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer2, 14);
                    getpostalcode.write(objComponentActivity2);
                }
                TextKt.m131TextNvy7gAk(".", GraphicsLayerModifierKt.graphicsLayer(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2), menu, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, getpostalcode, 6, 0, 131064);
                boolean z3 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer3);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer3, 15);
                    getpostalcode.write(objComponentActivity3);
                }
                TextKt.m131TextNvy7gAk(".", GraphicsLayerModifierKt.graphicsLayer(companion2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3), menu, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleMediaSessionCompatToken, getpostalcode, 6, 0, 131064);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z4 = getpostalcode.ComponentActivity;
                obj.hashCode();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
            textStyleMediaSessionCompatToken = textStyle;
            menu = j;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setClickable(modifier2, textStyleMediaSessionCompatToken, menu, i);
        }
    }
}
