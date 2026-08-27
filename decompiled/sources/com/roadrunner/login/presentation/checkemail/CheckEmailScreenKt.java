package com.roadrunner.login.presentation.checkemail;

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
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.RectListDebuggerModifierNode;
import o.a4;
import o.buildMapping;
import o.dd;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CheckEmailScreenKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: o.getPostalCode
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: o.getPostalCode
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 o.getPostalCode, new type: o.getPostalCode
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    public static final void CheckEmailScreen(a4 a4Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        a4Var.getClass();
        RectListDebuggerModifierNode rectListDebuggerModifierNode = a4Var.IconCompatParcelizer;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-565650721);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode.read(a4Var) : getpostalcode.IconCompatParcelizer(a4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i9 = IconCompatParcelizer + 37;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i11 = RemoteActionCompatParcelizer + 121;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.CameraDistance;
            } else {
                i4 = Fields.RotationZ;
            }
            i2 |= i4;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i13 = RemoteActionCompatParcelizer + 75;
            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode.read(modifier)) {
                int i14 = RemoteActionCompatParcelizer + 17;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                i3 = i14 % 2 == 0 ? 23772 : Fields.Clip;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        int i15 = i2;
        if (getpostalcode.write(i15 & 1, (i15 & 9363) != 9362)) {
            int i16 = IconCompatParcelizer + 69;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i18 = IconCompatParcelizer + 115;
                RemoteActionCompatParcelizer = i18 % Fields.SpotShadowColor;
                if (i18 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    int i19 = 96 / 0;
                } else {
                    getpostalcode.serializer(constructor);
                }
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, ExtrasKt.write(2109813546, new trigger(5, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, null, getpostalcode, 196608, 479);
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier modifierWrite2 = PaddingKt.write(companion4, Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            TextKt.m131TextNvy7gAk(a4Var.MediaDescriptionCompat, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).WindowCallbackWrapper(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131066);
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, Dimensions.setSplitBackground, 0.0f, 0.0f, 13);
            modifierM74paddingqDBjuR0$default.getClass();
            TextKt.m132TextZ58ophY(a4Var.RemoteActionCompatParcelizer, modifierM74paddingqDBjuR0$default, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 262136);
            TextKt.m131TextNvy7gAk(a4Var.serializer, PaddingKt.m74paddingqDBjuR0$default(companion4, 0.0f, Dimensions.getTitle, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131064);
            if (!rectListDebuggerModifierNode.serializer) {
                getpostalcode.serializer(117115461);
                dd.RemoteActionCompatParcelizer(rectListDebuggerModifierNode.RemoteActionCompatParcelizer, companion4, getpostalcode, 48);
                getpostalcode.IconCompatParcelizer(false);
                companion = companion4;
            } else {
                getpostalcode.serializer(116864919);
                companion = companion4;
                TertiaryKt.IconCompatParcelizer(a4Var.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, companion4, false, 0, null, null, null, getpostalcode, ((i15 >> 3) & 112) | 384, 248);
                getpostalcode.IconCompatParcelizer(false);
            }
            Modifier.Companion companion5 = companion;
            Object[] objArr = {getpostalcode, companion5.then(new show(1.0f, true))};
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), objArr);
            Modifier modifierWrite3 = SizeKt.write(companion5, 1.0f);
            modifierWrite3.getClass();
            PrimaryKt.write(a4Var.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifierWrite3, false, false, null, null, null, null, null, getpostalcode, ((i15 >> 6) & 112) | 384, 0, 2040);
            getpostalcode.IconCompatParcelizer((boolean) r15);
            getpostalcode.IconCompatParcelizer((boolean) r15);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdag2v_8ZFcgEbevxAiKW6LalaYkVg(a4Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 6);
        }
    }
}
