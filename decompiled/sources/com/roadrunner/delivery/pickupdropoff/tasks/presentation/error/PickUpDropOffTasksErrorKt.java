package com.roadrunner.delivery.pickupdropoff.tasks.presentation.error;

import android.content.Context;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.LayoutlibFontResourceLoader;
import o.LinearGradientShaderVjE6UOUdefault;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.accessgetLayerBlockp;
import o.buildMapping;
import o.computeDirection;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getOffsetF1C5BW0annotations;
import o.getPostalCode;
import o.getStore;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setCurrentSemanticsNodesui;
import o.setTransformQ8lPUPs;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PickUpDropOffTasksErrorKt {
    private static int IconCompatParcelizer = 1;
    private static int read;

    public static final void PickUpDropOffTasksError(LayoutlibFontResourceLoader layoutlibFontResourceLoader, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Painter painterRemoteActionCompatParcelizer;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-347275591);
        int i4 = 4;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(layoutlibFontResourceLoader);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(layoutlibFontResourceLoader);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = 16;
            } else {
                int i5 = read + 63;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    i4 = 32;
                }
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.read(modifier) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Modifier modifierWrite = AnimationModifierKt.write(SizeKt.write(modifier, 1.0f), null, 3);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                int i6 = IconCompatParcelizer + 17;
                read = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                if (((Boolean) getpostalcode.write((getNewPassword) InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                    getpostalcode.serializer(956008411);
                    painterRemoteActionCompatParcelizer = PainterResources_androidKt.painterResource(R.drawable.ic_no_connection, getpostalcode, 0);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(956076735);
                    setTransformQ8lPUPs settransformq8lpups = new setTransformQ8lPUPs((Context) getpostalcode.write((getNewPassword) AndroidCompositionLocals_androidKt.getLocalContext()));
                    settransformq8lpups.IconCompatParcelizer = Integer.valueOf(R.drawable.ic_no_connection);
                    settransformq8lpups.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new getOffsetF1C5BW0annotations(accessgetLayerBlockp.serializer);
                    LinearGradientShaderVjE6UOUdefault.write(settransformq8lpups);
                    painterRemoteActionCompatParcelizer = computeDirection.RemoteActionCompatParcelizer(settransformq8lpups.IconCompatParcelizer(), null, null, getpostalcode, 0, 30);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i8 = read;
                int i9 = i8 + 7;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                int i11 = i8 + 117;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                Modifier.Companion companion2 = Modifier.Companion;
                ImageKt.Image(painterRemoteActionCompatParcelizer, null, SizeKt.m75height3ABfNKs(SizeKt.m86width3ABfNKs(companion2, Dimensions.peekAvailableContext), Dimensions.removeOnConfigurationChangedListener), null, null, 0.0f, null, getpostalcode, Painter.$stable | 48, 120);
                String str = layoutlibFontResourceLoader.IconCompatParcelizer;
                TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                long presenter = ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter();
                TextAlign.Companion companion3 = TextAlign.Companion;
                int iM3511getCentere0LSkKk = companion3.m3511getCentere0LSkKk();
                float f = Dimensions.setMenu;
                TextKt.m131TextNvy7gAk(str, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f, 0.0f, 0.0f, 13), presenter, 0L, null, null, 0L, TextAlign.m3504boximpl(iM3511getCentere0LSkKk), 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 130040);
                TextKt.m131TextNvy7gAk(layoutlibFontResourceLoader.write, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, TextAlign.m3504boximpl(companion3.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode, 0, 0, 130040);
                TertiaryKt.IconCompatParcelizer(layoutlibFontResourceLoader.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f, 0.0f, 0.0f, 13), false, 0, null, null, null, getpostalcode, i2 & 112, 248);
                getpostalcode.IconCompatParcelizer(true);
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getStore(i, 26, layoutlibFontResourceLoader, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier);
        }
    }
}
