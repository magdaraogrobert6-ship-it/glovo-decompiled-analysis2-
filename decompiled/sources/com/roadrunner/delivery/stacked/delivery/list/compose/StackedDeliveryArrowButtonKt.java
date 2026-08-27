package com.roadrunner.delivery.stacked.delivery.list.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.util.UrlUtils;
import kotlin.ranges.RangesKt;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.PopulateViewStructure_androidKtpopulate7;
import o.buildMapping;
import o.canReadPlayIds;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.localError;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setClickable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class StackedDeliveryArrowButtonKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void StackedDeliveryArrowButton(long j, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        long jMediaMetadataCompat;
        long jCreateNavigationEventHandleractivity;
        int i3 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(76530725);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.serializer(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !getpostalcode.read(modifier) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i4 = serializer + 71;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i2 & 147) != 146) {
            int i6 = serializer + 23;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            localError localerrorIconCompatParcelizer = UrlUtils.IconCompatParcelizer(0L, getpostalcode, 1);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = c8$$ExternalSyntheticOutline0.m(getpostalcode);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) objComponentActivity;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer = RangesKt.RemoteActionCompatParcelizer(mutableInteractionSourceImpl, getpostalcode, 6);
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(531595252);
                jMediaMetadataCompat = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).MediaSessionCompatQueueItem();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(531597523);
                jMediaMetadataCompat = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).MediaMetadataCompat();
                getpostalcode.IconCompatParcelizer(false);
            }
            if (((Boolean) populateViewStructure_androidKtpopulate7RemoteActionCompatParcelizer.getValue()).booleanValue()) {
                getpostalcode.serializer(531601038);
                jCreateNavigationEventHandleractivity = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).addCloseableactivity();
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(531603117);
                jCreateNavigationEventHandleractivity = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).createNavigationEventHandleractivity();
                getpostalcode.IconCompatParcelizer(false);
            }
            long j2 = jCreateNavigationEventHandleractivity;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(SizeKt.m83size3ABfNKs(modifier, Dimensions.setCustomView), jMediaMetadataCompat, RoundedCornerShapeKt.IconCompatParcelizer);
            modifierM20backgroundbw27NRU.getClass();
            Modifier modifier2 = canReadPlayIds.read(modifierM20backgroundbw27NRU, mutableInteractionSourceImpl, false, localerrorIconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode, 30);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getCenter(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier2);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ImageKt.read(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_bold_large_arrow_right, getpostalcode, 6), "open details", SizeKt.m83size3ABfNKs(Modifier.Companion, Dimensions.setLogo), null, ColorFilter.Companion.m763tintxETnrds$default(ColorFilter.Companion, j2, 0, 2, null), getpostalcode, 48, 56);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new setClickable(j, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i, 3);
            int i8 = IconCompatParcelizer + 103;
            serializer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
    }
}
