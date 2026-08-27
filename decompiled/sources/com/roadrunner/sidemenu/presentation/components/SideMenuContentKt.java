package com.roadrunner.sidemenu.presentation.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.tooling.data.SlotTreeKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.unit.Dp;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.huawei.hms.api.ConnectionResult;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.realtime.domain.GetAppStateImpl;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.N$b;
import io.sentry.SentryUUID;
import java.util.Iterator;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.DragAndDropTargetModifierNode;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o._get_deviceId_lambda0;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaec7JQlABsI5gwAMVoMflnmYsd7o;
import o.r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdarhobHpPgW3fYGaomIOtfm02vDE;
import o.r8lambdasM5YbSTZw3Vu871y12qWaForv34;
import o.r8lambdatwlPMTrSrus3A7UmaCID8_1F1M;
import o.r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg;
import o.r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8;
import o.r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4;
import o.show;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SideMenuContentKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    public static final void SideMenuContent(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, _get_deviceId_lambda0 _get_deviceid_lambda0, N$b n$b, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        _get_deviceid_lambda0.getClass();
        n$b.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(521732213);
        getAddressCountry getaddresscountry = getpostalcode.read;
        Object obj = null;
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 23;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                    int i8 = write + 53;
                    RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                    i5 = i8 % 2 != 0 ? 5 : 4;
                } else {
                    i5 = 2;
                }
                i2 = i5 | i;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk);
                throw null;
            }
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i9 = RemoteActionCompatParcelizer + 121;
            write = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                i2 |= !(getpostalcode.IconCompatParcelizer(_get_deviceid_lambda0) ^ true) ? 32 : 16;
            } else {
                getpostalcode.IconCompatParcelizer(_get_deviceid_lambda0);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(n$b)) {
                int i10 = write + 99;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 != 0 ? ConnectionResult.RESTRICTED_PROFILE : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            int i11 = RemoteActionCompatParcelizer + 11;
            write = i11 % Fields.SpotShadowColor;
            if (i11 % 2 != 0) {
                if (getpostalcode.read(modifier)) {
                    int i12 = write + 39;
                    RemoteActionCompatParcelizer = i12 % Fields.SpotShadowColor;
                    int i13 = i12 % 2;
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            } else {
                int i14 = 76 / 0;
                if (getpostalcode.read(modifier)) {
                    int i15 = write + 39;
                    RemoteActionCompatParcelizer = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    i3 = Fields.CameraDistance;
                } else {
                    i3 = Fields.RotationZ;
                }
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 1171) != 1170)) {
            int i17 = write + 39;
            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = r8lambdasM5YbSTZw3Vu871y12qWaForv34.RemoteActionCompatParcelizer;
                getpostalcode.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new DragAndDropTargetModifierNode(new SlotTreeKt$$ExternalSyntheticLambda0(19, (r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) n$b.read), true, 2057395611);
                getpostalcode.write(objComponentActivity2);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new DragAndDropTargetModifierNode(new TncComposableFactoryImpl$$ExternalSyntheticLambda0(8, (GetAppStateImpl) n$b.write), true, 1987704077);
                getpostalcode.write(objComponentActivity3);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity3;
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new DragAndDropTargetModifierNode(new TncComposableFactoryImpl$$ExternalSyntheticLambda0(10, (r8lambdavHJVXyGGlLVHk5AGniQgYzeRF4) n$b.IconCompatParcelizer), true, -1312009089);
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity4;
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new DragAndDropTargetModifierNode(new TncComposableFactoryImpl$$ExternalSyntheticLambda0(11, (GetAppStateImpl) n$b.serializer), true, -751002441);
                getpostalcode.write(objComponentActivity5);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity5;
            FillElement fillElement = SizeKt.read;
            Modifier modifierThen = modifier.then(fillElement);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierThen);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i19 = i2;
                if (getpostalcode.ComponentActivity) {
                    int i20 = RemoteActionCompatParcelizer + 13;
                    write = i20 % Fields.SpotShadowColor;
                    if (i20 % 2 != 0) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.serializer(constructor);
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion2, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(Modifier.Companion.then(fillElement), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, companion.getStart(), getpostalcode, 54);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                getpostalcode.serializer(924618123);
                Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it.hasNext()) {
                    r8lambdaec7JQlABsI5gwAMVoMflnmYsd7o r8lambdaec7jqlabsi5gwamvomflnmysd7o = (r8lambdaec7JQlABsI5gwAMVoMflnmYsd7o) it.next();
                    if (r8lambdaec7jqlabsi5gwamvomflnmysd7o instanceof r8lambdafOIPryYKxSg19oxLSCcW3X8q4Qk) {
                        getpostalcode.serializer(-1863473026);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke(r8lambdaec7jqlabsi5gwamvomflnmysd7o, getpostalcode, 48);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (r8lambdaec7jqlabsi5gwamvomflnmysd7o instanceof r8lambdavFhLS1yxrGUJqVmNjrm6vmsl_H8) {
                        getpostalcode.serializer(-1863471202);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke(r8lambdaec7jqlabsi5gwamvomflnmysd7o, getpostalcode, 48);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (r8lambdaec7jqlabsi5gwamvomflnmysd7o instanceof r8lambdatyvITgIQDQNju3oEx9E3EWUPNmg) {
                        int i21 = write + 85;
                        RemoteActionCompatParcelizer = i21 % Fields.SpotShadowColor;
                        if (i21 % 2 != 0) {
                            getpostalcode.serializer(-1863469411);
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(r8lambdaec7jqlabsi5gwamvomflnmysd7o, getpostalcode, 48);
                            z = true;
                        } else {
                            getpostalcode.serializer(-1863469411);
                            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(r8lambdaec7jqlabsi5gwamvomflnmysd7o, getpostalcode, 48);
                            z = false;
                        }
                        getpostalcode.IconCompatParcelizer(z);
                    } else if (r8lambdaec7jqlabsi5gwamvomflnmysd7o instanceof r8lambdarhobHpPgW3fYGaomIOtfm02vDE) {
                        getpostalcode.serializer(-1863467144);
                        r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke(r8lambdaec7jqlabsi5gwamvomflnmysd7o, OffsetKt.read(Modifier.Companion, Dp.m3673constructorimpl(0.0f), Dp.m3673constructorimpl(-Dimensions.setTabContainer)), getpostalcode, 384);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        getpostalcode.serializer(-1932689583);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                }
                getpostalcode.IconCompatParcelizer(false);
                Modifier.Companion companion3 = Modifier.Companion;
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, companion3.then(new show(1.0f, true))});
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion3.then(SizeKt.read), 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback, Dimensions.setUiOptions, 3);
                Alignment.Companion companion4 = Alignment.Companion;
                Modifier modifierIconCompatParcelizer2 = SizeKt.IconCompatParcelizer(modifierM74paddingqDBjuR0$default, companion4.getBottomEnd(), 2);
                MeasurePolicy measurePolicy2 = BoxKt.read(companion4.getTopStart(), false);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer2);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion5.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion5, getpostalcode, measurePolicy2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion5, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.invoke(_get_deviceid_lambda0, getpostalcode, Integer.valueOf(((i19 >> 3) & 14) | 48));
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdatwlPMTrSrus3A7UmaCID8_1F1M(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, _get_deviceid_lambda0, n$b, modifier, i, 1);
        }
    }
}
