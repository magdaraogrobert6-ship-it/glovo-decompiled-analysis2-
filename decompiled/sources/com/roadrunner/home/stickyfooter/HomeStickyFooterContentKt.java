package com.roadrunner.home.stickyfooter;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.roadrunner.home.HomeFragment$initPopupLayer$1;
import io.sentry.SentryUUID;
import java.util.Iterator;
import java.util.List;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropSourceModifierNode;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.accessgetStripNonMetricAffectingCharSpansp;
import o.accessstripNonMetricAffectingCharacterStyleSpans;
import o.buildMapping;
import o.computeVerticalScrollRange;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.jumpToPositionForSmoothScroller;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HomeStickyFooterContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:33:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public static final void HomeStickyFooterContent(List list, accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans, HomeFragment$initPopupLayer$1 homeFragment$initPopupLayer$1, Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        list.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(371400765);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(accessstripnonmetricaffectingcharacterstylespans) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !(getpostalcode.IconCompatParcelizer(homeFragment$initPopupLayer$1) ^ true) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i6 = i2 | 3072;
        if ((i & 24576) == 0) {
            int i7 = serializer + 13;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                if (!(!getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm))) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            } else {
                int i8 = 55 / 0;
                if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                    i4 = Fields.Clip;
                } else {
                    i4 = 8192;
                }
            }
            i6 |= i4;
        }
        if ((196608 & i) == 0) {
            int i9 = RemoteActionCompatParcelizer + 123;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i3 = Fields.RenderEffect;
                } else {
                    int i10 = RemoteActionCompatParcelizer + 87;
                    serializer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i3 = 65536;
                }
                i6 |= i3;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                throw null;
            }
        }
        int i12 = i6;
        if (getpostalcode.write(i12 & 1, (i12 & 74899) != 74898)) {
            int i13 = RemoteActionCompatParcelizer + 41;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                DragAndDropTargetModifierNode dragAndDropTargetModifierNode = new DragAndDropTargetModifierNode(new computeVerticalScrollRange(1, accessstripnonmetricaffectingcharacterstylespans), true, 590718748);
                getpostalcode.write(dragAndDropTargetModifierNode);
                objComponentActivity = dragAndDropTargetModifierNode;
            }
            r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM r8lambdahlfuu54mfvlmnthbk7uy9j3wgim = (r8lambdahlfuU54MFVLMnThBk7uY9J3wgIM) objComponentActivity;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.write(companion, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), RectangleShapeKt.getRectangleShape());
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i15 = RemoteActionCompatParcelizer + 45;
                    serializer = i15 % Fields.SpotShadowColor;
                    if (i15 % 2 == 0) {
                        getpostalcode.serializer(constructor);
                        z = false;
                        int i16 = 60 / 0;
                    } else {
                        z = false;
                        getpostalcode.serializer(constructor);
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    z = false;
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                getpostalcode.serializer(-1911581822);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    jumpToPositionForSmoothScroller jumptopositionforsmoothscroller = (jumpToPositionForSmoothScroller) it.next();
                    if (jumptopositionforsmoothscroller instanceof accessgetStripNonMetricAffectingCharSpansp) {
                        int i17 = serializer + 77;
                        RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        getpostalcode.serializer(882191822);
                        int i19 = i12 >> 6;
                        r8lambdahlfuu54mfvlmnthbk7uy9j3wgim.read(jumptopositionforsmoothscroller, homeFragment$initPopupLayer$1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, Integer.valueOf((i19 & 7168) | ((i12 >> 3) & 112) | 24576 | (i19 & 896)));
                        getpostalcode.IconCompatParcelizer(z);
                    } else {
                        getpostalcode.serializer(1578328615);
                        getpostalcode.IconCompatParcelizer(z);
                    }
                    companion = companion;
                }
                getpostalcode.IconCompatParcelizer(z);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new DragAndDropSourceModifierNode(list, accessstripnonmetricaffectingcharacterstylespans, homeFragment$initPopupLayer$1, modifier2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 1);
        }
    }
}
