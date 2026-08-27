package com.roadrunner.delivery.ontheway.address.presentation.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.GapComposerKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.pickupdropoff.details.api.domain.TagColorTokenMapperKt;
import com.roadrunner.delivery.state.pudo.TagColorToken;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.GapBuffer_jvmAndAndroidKt;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.buildMapping;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.s4;
import o.s9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DestinationSecondaryAddressKt {
    private static int serializer = 0;
    private static int write = 1;

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a A[PHI: r5
  0x004a: PHI (r5v9 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v11 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036 A[PHI: r5
  0x0036: PHI (r5v6 o.getPostalCode) = (r5v5 o.getPostalCode), (r5v11 o.getPostalCode) binds: [B:8:0x0034, B:5:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void RemoteActionCompatParcelizer(int i, getBirthDateFull getbirthdatefull, Modifier modifier, s9 s9Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getPostalCode getpostalcode;
        boolean zIconCompatParcelizer;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 91;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 != 0) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1947689695);
            if ((i & 68) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(s9Var);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(s9Var);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        } else {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-1947689695);
            if ((i & 6) == 0) {
                if ((i & 8) == 0) {
                    zIconCompatParcelizer = getpostalcode.read(s9Var);
                } else {
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(s9Var);
                }
                if (zIconCompatParcelizer) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i2 | i;
            } else {
                i3 = i;
            }
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i8 = serializer + 39;
            write = i8 % Fields.SpotShadowColor;
            if (i8 % 2 != 0) {
                if (getpostalcode.read(modifier)) {
                    int i9 = write + 21;
                    serializer = i9 % Fields.SpotShadowColor;
                    i5 = i9 % 2 != 0 ? 70 : 32;
                } else {
                    i5 = 16;
                }
                i3 |= i5;
            } else {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
        }
        if ((i & 384) == 0) {
            int i10 = write + 69;
            serializer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    int i11 = write + 59;
                    serializer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    i4 = Fields.RotationX;
                } else {
                    i4 = Fields.SpotShadowColor;
                }
                i3 |= i4;
            } else {
                getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
        }
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            SurfaceKt.m126SurfaceT9BRK9s(SizeKt.write(modifier, 1.0f), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), 0L, 0.0f, 0.0f, null, ExtrasKt.write(-108017498, new GapComposerKt$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, 20, s9Var), getpostalcode), getpostalcode, 12582912, 122);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new GapBuffer_jvmAndAndroidKt(s9Var, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }

    public static final void DestinationSecondaryAddressWithBadge(int i, getBirthDateFull getbirthdatefull, Modifier modifier, s9 s9Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1773591524);
        if ((i & 6) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                int i5 = write + 47;
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
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i7 = write + 113;
                serializer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 != 0) {
                    zIconCompatParcelizer = getpostalcode.read(s9Var);
                    int i8 = 42 / 0;
                } else {
                    zIconCompatParcelizer = getpostalcode.read(s9Var);
                }
            } else {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(s9Var);
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        int i9 = i2 | 384;
        if ((i9 & 147) != 146) {
            int i10 = write + 13;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            int i12 = write + 101;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = false;
        }
        if (getpostalcode.write(i9 & 1, z)) {
            int i14 = serializer + 53;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            modifier2 = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(modifier2, 1.0f);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite, f, 0.0f, f, f, 2);
            MeasurePolicy measurePolicy = BoxKt.read(Alignment.Companion.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i16 = write + 3;
            serializer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                int i18 = serializer + 41;
                write = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
            }
            af$$ExternalSyntheticOutline0.m(companion, getpostalcode, measurePolicy, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            DestinationSecondaryAddressWithBadgeContent(i9 & 126, getpostalcode, null, s9Var, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new GapBuffer_jvmAndAndroidKt(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, s9Var, modifier2, i, 1);
        }
    }

    public static final void DestinationSecondaryAddressWithBadgeContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, s9 s9Var, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean zIconCompatParcelizer;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(1731257989);
        if ((i & 6) == 0) {
            i2 = i | (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                int i4 = write + 11;
                serializer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                zIconCompatParcelizer = getpostalcode2.read(s9Var);
                int i6 = write + 73;
                serializer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 != 0) {
                    int i7 = 2 / 2;
                }
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(s9Var);
            }
            i2 |= zIconCompatParcelizer ? 32 : 16;
        }
        int i8 = i2 | 384;
        if (getpostalcode2.write(i8 & 1, (i8 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion;
            PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.IconCompatParcelizer(Dimensions.getNestedScrollAxes), Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i9 = serializer + 121;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = new b8$$ExternalSyntheticLambda4(1);
                getpostalcode2.write(objComponentActivity);
            }
            TextKt.m131TextNvy7gAk(s9Var.serializer, ClickableKt.serializer(companion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131064);
            s4 s4Var = s9Var.RemoteActionCompatParcelizer;
            if (s4Var == null) {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(148668520);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                getpostalcode.serializer(148668521);
                TagColorToken tagColorToken = s4Var.serializer;
                String str = s4Var.read;
                Integer num = s4Var.RemoteActionCompatParcelizer;
                TagColorTokenMapperKt.RemoteActionCompatParcelizer(tagColorToken, str, null, num != null ? num.intValue() : 0, getpostalcode, 0, 20);
                getpostalcode.IconCompatParcelizer(false);
            }
            int i11 = serializer + 5;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new GapBuffer_jvmAndAndroidKt(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, s9Var, modifier2, i, 2);
        }
    }
}
