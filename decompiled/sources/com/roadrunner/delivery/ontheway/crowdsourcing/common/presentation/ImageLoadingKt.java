package com.roadrunner.delivery.ontheway.crowdsourcing.common.presentation;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.FixedScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import kotlinx.coroutines.DelayKt;
import o.AndroidContentCaptureManagerCompanion;
import o.ArrangementCenter1;
import o.ArrangementHorizontal;
import o.BoxMeasurePolicy;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.WrappedAnchor;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getLayers;
import o.getNewPassword;
import o.getPostalCode;
import o.performFling;
import o.performMeasureDjhGOtQ;
import o.placeSpaceBetweenfoundation_layout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafDO76o9OYYvjKpysJSsx90eBs8;
import o.r8lambdapbG_fqEcit8CH1waoNmDxLhROlU;
import o.requiredWidthInVpY3zN4default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ImageLoadingKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0101  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    public static final void ImageError(Modifier modifier, Modifier modifier2, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        Modifier modifier3;
        boolean z;
        Modifier modifier4;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        Modifier modifier5;
        MeasurePolicy measurePolicy;
        int iHashCode;
        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer;
        Modifier modifierMaterializeModifier;
        ComposeUiNode.Companion companion;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1968175834);
        if ((i & 6) == 0) {
            int i6 = IconCompatParcelizer + 29;
            serializer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i3 = i | (getpostalcode.read(modifier) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier3 = modifier2;
                i3 |= getpostalcode.read(modifier3) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                int i9 = IconCompatParcelizer + 81;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                if (i8 != 0) {
                    modifier5 = Modifier.Companion;
                } else {
                    modifier5 = modifier3;
                }
                measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
                iHashCode = Long.hashCode(getpostalcode.RatingCompat);
                dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
                modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
                companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                if (getpostalcode.read != null) {
                    SentryUUID.write();
                    throw null;
                }
                i4 = serializer + 63;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    int i11 = 80 / 0;
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                } else {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode.ComponentActivity) {
                        getpostalcode.serializer(constructor);
                    } else {
                        getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0), null, modifier5, null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved(), 0, 2, null), getpostalcode, Painter.$stable | 48 | ((i3 << 3) & 896), 56);
                getpostalcode.IconCompatParcelizer(true);
                modifier4 = modifier5;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier4 = modifier3;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new WrappedAnchor(modifier, modifier4, i, i2, 2);
            }
        }
        int i12 = serializer + 1;
        IconCompatParcelizer = i12 % Fields.SpotShadowColor;
        i3 = i12 % 2 != 0 ? i3 | 68 : i3 | 48;
        modifier3 = modifier2;
        if ((i3 & 19) != 18) {
            int i13 = IconCompatParcelizer + 81;
            serializer = i13 % Fields.SpotShadowColor;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            if (i8 != 0) {
                modifier5 = Modifier.Companion;
            } else {
                modifier5 = modifier3;
            }
            measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            companion = ComposeUiNode.Companion;
            constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                SentryUUID.write();
                throw null;
            }
            i4 = serializer + 63;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i15 = 80 / 0;
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_bold_double_extra_large_loading_image_loading_image, getpostalcode, 0), null, modifier5, null, null, 0.0f, ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setOverflowReserved(), 0, 2, null), getpostalcode, Painter.$stable | 48 | ((i3 << 3) & 896), 56);
            getpostalcode.IconCompatParcelizer(true);
            modifier4 = modifier5;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier4 = modifier3;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new WrappedAnchor(modifier, modifier4, i, i2, 2);
        }
    }

    public static final void ImageLoading(Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(956926229);
        if ((i & 6) == 0) {
            if (getpostalcode.read(modifier)) {
                int i5 = IconCompatParcelizer + 41;
                serializer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            int i7 = IconCompatParcelizer + 31;
            serializer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = false;
        }
        if (!(!getpostalcode.write(i2 & 1, z))) {
            int i9 = IconCompatParcelizer + 97;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            Object obj = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i11 = IconCompatParcelizer + 65;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    getpostalcode.serializer(constructor);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ArrangementHorizontal arrangementHorizontal = ArrangementCenter1.read(null, getpostalcode, 1);
            Object[] objArr = {800, 0, performFling.read, 2};
            placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layoutIconCompatParcelizer = ArrangementCenter1.IconCompatParcelizer(arrangementHorizontal, 360.0f, 0.0f, DelayKt.RemoteActionCompatParcelizer((requiredWidthInVpY3zN4default) DelayKt.write(1332258063, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), -1332258060, r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), r8lambdapbG_fqEcit8CH1waoNmDxLhROlU.write(), objArr), (BoxMeasurePolicy) null, 6), "SpinnerFloatAnimation", getpostalcode, 29112, 0);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_spinner, getpostalcode, 0);
            ColorFilter colorFilterM763tintxETnrds$default = ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setEmojiCompatEnabled(), 0, 2, null);
            FixedScale none = ContentScale.Companion.getNone();
            Modifier modifierM83size3ABfNKs = SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setLogo);
            boolean z2 = getpostalcode.read(placespacebetweenfoundation_layoutIconCompatParcelizer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z2 || objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new r8lambdafDO76o9OYYvjKpysJSsx90eBs8(placespacebetweenfoundation_layoutIconCompatParcelizer, 7);
                getpostalcode.write(objComponentActivity);
            }
            ImageKt.Image(painterPainterResource, null, GraphicsLayerModifierKt.graphicsLayer(modifierM83size3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity), null, none, 0.0f, colorFilterM763tintxETnrds$default, getpostalcode, Painter.$stable | 24624, 40);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getLayers(modifier, i, 11);
        }
    }
}
