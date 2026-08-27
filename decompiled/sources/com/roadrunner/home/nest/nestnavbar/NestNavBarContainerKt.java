package com.roadrunner.home.nest.nestnavbar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.rrds.compose.component.indicators.shimmer.ShimmeringHorizontalBarKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.internalPathIteratorPeek;
import o.invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NestNavBarContainerKt {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    public static final void NestNavBarContent(invokeSuspendcomroadrunnermapintegrationmapboxnavigationMapNavigationImplprocessFlows21 invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        boolean zIconCompatParcelizer;
        int i5 = 2 % 2;
        int i6 = IconCompatParcelizer + 1;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(584492724);
        if ((i & 6) == 0) {
            int i8 = RemoteActionCompatParcelizer + 105;
            IconCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode.read(invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21);
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21);
            }
            i2 = (zIconCompatParcelizer ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = RemoteActionCompatParcelizer + 117;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 == 0 ? 8 : 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
            int i11 = RemoteActionCompatParcelizer + 63;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        }
        if ((i & 384) == 0) {
            int i13 = IconCompatParcelizer + 87;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            } else {
                int i14 = 74 / 0;
                if (getpostalcode.read(modifier)) {
                    i3 = Fields.RotationX;
                } else {
                    i3 = Fields.SpotShadowColor;
                }
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                HeaderKt.serializer(null, null, 0L, null, ExtrasKt.write(-1491998451, new PagerDefaults$$ExternalSyntheticLambda0(invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21, 15, r8lambdaunavo3sxub_pc9xroryotnrlvsm), getpostalcode), null, null, getpostalcode, 196608, Constant.ERROR_WSS_TIME_DIFF_LARGE);
                if (invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21.read) {
                    getpostalcode.serializer(153551084);
                    ShimmeringHorizontalBarKt.m5052ShimmeringHorizontalBarCgnh0Qk(((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled(), null, 0.0f, 0.0f, 0.0f, 1200, 0, getpostalcode, 196608, 94);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    getpostalcode.serializer(153697156);
                    getpostalcode.IconCompatParcelizer(false);
                }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 10, invokesuspendcomroadrunnermapintegrationmapboxnavigationmapnavigationimplprocessflows21, r8lambdaunavo3sxub_pc9xroryotnrlvsm, modifier);
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
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
    public static final void NestNavBarContainer(o.DividerItemDecoration r26, o.getQueryContext r27, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r28, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r29, androidx.compose.ui.Modifier r30, o.getBirthDateFull r31, int r32) {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.nestnavbar.NestNavBarContainerKt.NestNavBarContainer(o.DividerItemDecoration, o.getQueryContext, o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0, o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM, androidx.compose.ui.Modifier, o.getBirthDateFull, int):void");
    }
}
