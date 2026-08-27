package com.roadrunner.delivery.pickupdropoff.details.presentation.compose.v1;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.TextFieldDefaults;
import o.buildMapping;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ProductItemKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static final void ExtraItem(r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI r8lambdapwtmfa_advbrukp1g_lstwgjii, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-418969072);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zIconCompatParcelizer = getpostalcode2.read(r8lambdapwtmfa_advbrukp1g_lstwgjii);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(r8lambdapwtmfa_advbrukp1g_lstwgjii);
            }
            if (zIconCompatParcelizer) {
                int i5 = IconCompatParcelizer + 19;
                write = i5 % Fields.SpotShadowColor;
                i3 = i5 % 2 != 0 ? 5 : 4;
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
            int i6 = write + 29;
            IconCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            z = false;
        }
        if (getpostalcode2.write(i2 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 0.0f, 14);
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode2.ComponentActivity) {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i8 = write + 43;
                    IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    getpostalcode2.serializer(constructor);
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m86width3ABfNKs(companion, Dimensions.onCreatePanelMenu)});
                String str = r8lambdapwtmfa_advbrukp1g_lstwgjii.write;
                TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk(str, d$$ExternalSyntheticOutline0.m(1.0f, true, companion), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode2, 0, 0, 131064);
                getpostalcode = getpostalcode2;
                TextKt.m131TextNvy7gAk(r8lambdapwtmfa_advbrukp1g_lstwgjii.read, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                int i10 = write + 19;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            getpostalcode = getpostalcode2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(r8lambdapwtmfa_advbrukp1g_lstwgjii, i, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073 A[PHI: r3 r4
  0x0073: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0035, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0073: PHI (r4v20 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v21 o.getAddressCountry) binds: [B:8:0x0035, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[PHI: r3 r4
  0x0037: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0035, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r4v3 o.getAddressCountry) = (r4v2 o.getAddressCountry), (r4v21 o.getAddressCountry) binds: [B:8:0x0035, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ProductItem(r8lambdaXsavzQeBGg2EVWmTw6loqCdid5k r8lambdaxsavzqebgg2evwmtw6loqcdid5k, getBirthDateFull getbirthdatefull, int i) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = write + 117;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            r8lambdaxsavzqebgg2evwmtw6loqcdid5k.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(101001426);
            getaddresscountry = getpostalcode.read;
            if ((i & 73) == 0) {
                int i6 = write + 83;
                int i7 = i6 % Fields.SpotShadowColor;
                IconCompatParcelizer = i7;
                if (i6 % 2 == 0 ? (i & 8) == 0 : (i & 100) == 0) {
                    int i8 = i7 + 51;
                    write = i8 % Fields.SpotShadowColor;
                    int i9 = i8 % 2;
                    zIconCompatParcelizer = getpostalcode.read(r8lambdaxsavzqebgg2evwmtw6loqcdid5k);
                }
                if (zIconCompatParcelizer) {
                    int i10 = write + 1;
                    IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i12 = write + 7;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
            } else {
                i3 = i;
            }
        } else {
            r8lambdaxsavzqebgg2evwmtw6loqcdid5k.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(101001426);
            getaddresscountry = getpostalcode.read;
            if ((i & 6) == 0) {
                int i14 = write + 83;
                int i15 = i14 % Fields.SpotShadowColor;
                IconCompatParcelizer = i15;
                zIconCompatParcelizer = i14 % 2 == 0 ? getpostalcode.IconCompatParcelizer(r8lambdaxsavzqebgg2evwmtw6loqcdid5k) : getpostalcode.IconCompatParcelizer(r8lambdaxsavzqebgg2evwmtw6loqcdid5k);
                if (zIconCompatParcelizer) {
                    int i16 = write + 1;
                    IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
                int i18 = write + 7;
                IconCompatParcelizer = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            } else {
                i3 = i;
            }
        }
        if (getpostalcode.write(i3 & 1, (i3 & 3) != 2)) {
            int i20 = IconCompatParcelizer + 71;
            write = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            Modifier.Companion companion = Modifier.Companion;
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, Dimensions.setActionBarVisibilityCallback, 0.0f, 0.0f, 0.0f, 14);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), companion2.getTop(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i22 = IconCompatParcelizer + 85;
                write = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            String str = r8lambdaxsavzqebgg2evwmtw6loqcdid5k.RemoteActionCompatParcelizer;
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            getPostalCode getpostalcode2 = getpostalcode;
            TextKt.m131TextNvy7gAk(str, SizeKt.m82requiredWidthInVpY3zN4$default(companion, Dimensions.onCreatePanelMenu), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyleIconCompatParcelizer, getpostalcode2, 0, 0, 131064);
            TextKt.m131TextNvy7gAk(r8lambdaxsavzqebgg2evwmtw6loqcdid5k.read, d$$ExternalSyntheticOutline0.m(1.0f, true, companion), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131064);
            TextKt.m131TextNvy7gAk(r8lambdaxsavzqebgg2evwmtw6loqcdid5k.IconCompatParcelizer, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131066);
            getpostalcode.IconCompatParcelizer(true);
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = r8lambdaxsavzqebgg2evwmtw6loqcdid5k.serializer;
            if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk == null) {
                getpostalcode.serializer(825930584);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(825930585);
                Iterator<E> it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
                while (it.hasNext()) {
                    ExtraItem((r8lambdaPWTmFA_advBRuKP1g_lSTWgJiI) it.next(), getpostalcode, 0);
                }
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(r8lambdaxsavzqebgg2evwmtw6loqcdid5k, i, 12);
        }
    }
}
