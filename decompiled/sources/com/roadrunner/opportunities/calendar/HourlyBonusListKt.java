package com.roadrunner.opportunities.calendar;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.opportunities.calendar.tile.BonusMultiplierTileKt;
import io.sentry.SentryUUID;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.u3;
import o.v6ExternalSyntheticLambda7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HourlyBonusListKt {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;

    public static final void HourlyBonusList(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        v6ExternalSyntheticLambda7 v6externalsyntheticlambda7;
        Modifier.Companion companion;
        float f;
        float f2;
        float f3;
        float f4;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1977068631);
        if ((i & 6) == 0) {
            int i6 = serializer + 31;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            if ((i6 % 2 == 0 ? (i & 8) != 0 : (i & 100) != 0) ? getpostalcode.IconCompatParcelizer(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk) : getpostalcode.read(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk)) {
                i4 = 4;
            } else {
                int i7 = IconCompatParcelizer + 45;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        int i9 = i2 | 48;
        if (getpostalcode.write(i9 & 1, (i9 & 19) != 18)) {
            modifier2 = Modifier.Companion;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(PagerWrapperFlingBehavior.IconCompatParcelizer(modifier2.then(SizeKt.read), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14), 0.0f, Dimensions.setTransitioning, 1);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM73paddingVpY3zN4$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            Object obj = null;
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i10 = serializer + 27;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                if (i10 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    obj.hashCode();
                    throw null;
                }
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(modifier2, Dimensions.setPrimaryBackground)});
            getpostalcode.serializer(-1218176822);
            Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            while (it.hasNext()) {
                int i11 = IconCompatParcelizer + 57;
                serializer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    v6externalsyntheticlambda7 = (v6ExternalSyntheticLambda7) it.next();
                    companion = Modifier.Companion;
                    f = Dimensions.read;
                    f2 = 1.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                    i3 = 127;
                } else {
                    v6externalsyntheticlambda7 = (v6ExternalSyntheticLambda7) it.next();
                    companion = Modifier.Companion;
                    f = Dimensions.read;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                    i3 = 7;
                }
                BonusMultiplierTileKt.RemoteActionCompatParcelizer(v6externalsyntheticlambda7, PaddingKt.m74paddingqDBjuR0$default(companion, f2, f3, f4, f, i3), getpostalcode, 0);
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
            int i12 = serializer + 125;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new u3(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, modifier2, i, 0);
        }
    }
}
