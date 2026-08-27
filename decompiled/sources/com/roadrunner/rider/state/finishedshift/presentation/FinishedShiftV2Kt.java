package com.roadrunner.rider.state.finishedshift.presentation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import io.sentry.SentryUUID;
import o.AdjustInstance;
import o.AdjustInstanceExternalSyntheticLambda1;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.checkActivityHandler;
import o.enableBridgeSecurity;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.p2;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU;
import o.r8lambdahCMuiUVsRubxJCkqZuukT4uD724;
import o.r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs;
import o.removeNodeAtDepth;
import o.saveRawReferrer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FinishedShiftV2Kt {
    private static int read = 1;
    private static int write;

    public static final void IconCompatParcelizer(AdjustInstanceExternalSyntheticLambda1 adjustInstanceExternalSyntheticLambda1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        int i3 = 2 % 2;
        int i4 = read + 41;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        adjustInstanceExternalSyntheticLambda1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1960451820);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(adjustInstanceExternalSyntheticLambda1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i6 = i2 | 48;
        if ((i6 & 19) != 18) {
            int i7 = read + 79;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            modifier2 = Modifier.Companion;
            AdjustInstance adjustInstance = (AdjustInstance) ExtrasKt.write(adjustInstanceExternalSyntheticLambda1.IconCompatParcelizer, getpostalcode, 0).getValue();
            if (adjustInstance instanceof r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs) {
                getpostalcode.serializer(1496451126);
                r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs r8lambdawewsq6zoo2b2985gwdloptnl6xs = (r8lambdawEwsQ6ZoO2B2985GWdlOptNl6xs) adjustInstance;
                FinishedShiftV2Content(r8lambdawewsq6zoo2b2985gwdloptnl6xs.serializer, r8lambdawewsq6zoo2b2985gwdloptnl6xs.read, modifier2, getpostalcode, (i6 << 3) & 896);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{adjustInstance, checkActivityHandler.read}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1496447465, false);
                }
                int i9 = write + 101;
                read = i9 % Fields.SpotShadowColor;
                if (i9 % 2 == 0) {
                    getpostalcode.serializer(1496456728);
                    getpostalcode.IconCompatParcelizer(true);
                } else {
                    getpostalcode.serializer(1496456728);
                    getpostalcode.IconCompatParcelizer(false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p2(i, 29, adjustInstanceExternalSyntheticLambda1, modifier2);
        }
    }

    public static final void FinishedShiftV2Content(String str, r8lambdahCMuiUVsRubxJCkqZuukT4uD724 r8lambdahcmuiuvsrubxjckqzuukt4ud724, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        str.getClass();
        r8lambdahcmuiuvsrubxjckqzuukt4ud724.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1065062412);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(r8lambdahcmuiuvsrubxjckqzuukt4ud724.ordinal()) ? 32 : 16;
            int i5 = read + 65;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                int i6 = 2 % 5;
            }
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i7 = write + 115;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if (getpostalcode.write(i9 & 1, (i9 & 147) != 146)) {
            Modifier modifierWrite = PaddingKt.write(modifier, Dimensions.getAnimatedVisibility);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
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
                int i10 = saveRawReferrer.read[r8lambdahcmuiuvsrubxjckqzuukt4ud724.ordinal()];
                if (i10 == 1) {
                    getpostalcode.serializer(541571996);
                    BannerMessageKt.IconCompatParcelizer((Modifier) null, (ImageVector) null, (String) null, str, (String) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, (i9 << 9) & 7168, 503);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    int i11 = write + 103;
                    int i12 = i11 % Fields.SpotShadowColor;
                    read = i12;
                    int i13 = i11 % 2;
                    if (i10 == 2) {
                        getpostalcode.serializer(541699964);
                        BannerMessageKt.BannerMessageSuccess(null, null, str, null, null, null, null, getpostalcode, (i9 << 9) & 7168, 503);
                        getpostalcode.IconCompatParcelizer(false);
                    } else if (i10 != 3) {
                        int i14 = i12 + 121;
                        write = i14 % Fields.SpotShadowColor;
                        if (i14 % 2 == 0 ? i10 == 4 : i10 == 2) {
                            getpostalcode.serializer(541952862);
                            BannerMessageKt.IconCompatParcelizer((Modifier) null, (ImageVector) null, str, (String) null, (AnnotatedString) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, (i9 << 9) & 7168, 503);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1818584596, false);
                        }
                    } else {
                        getpostalcode.serializer(541828862);
                        BannerMessageKt.m5059BannerMessageError1xFH4wI(null, null, str, null, null, null, null, 0L, null, 0L, null, 0L, 0L, getpostalcode, (i9 << 9) & 7168, 0, 32759);
                        getpostalcode.IconCompatParcelizer(false);
                    }
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZmWJ7_kmLiTuhtIga_c7SGMfvU(i, 6, str, r8lambdahcmuiuvsrubxjckqzuukt4ud724, modifier);
        }
    }
}
