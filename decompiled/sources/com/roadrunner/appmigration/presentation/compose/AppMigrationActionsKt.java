package com.roadrunner.appmigration.presentation.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.riemann.location.common.utils.Constant;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.SemanticsNodeemitFakeNodesfakeNode2;
import o.accesscontentDescriptionFakeNodeId;
import o.buildMapping;
import o.clearAndSetSemantics;
import o.enableBridgeSecurity;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getUnmergedConfigui;
import o.isUnmergedLeafNodeui;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AppMigrationActionsKt {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    public static final SemanticsNodeemitFakeNodesfakeNode2 read(clearAndSetSemantics clearandsetsemantics) {
        accesscontentDescriptionFakeNodeId accesscontentdescriptionfakenodeid;
        int i = 2 % 2;
        String str = clearandsetsemantics.IconCompatParcelizer;
        String str2 = clearandsetsemantics.MediaSessionCompatToken;
        if (str2 != null) {
            accesscontentdescriptionfakenodeid = new accesscontentDescriptionFakeNodeId(clearandsetsemantics.PlaybackStateCompatCustomAction, str2);
            int i2 = serializer + 89;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
        } else {
            accesscontentdescriptionfakenodeid = null;
        }
        int i4 = serializer + 33;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 5 % 2;
        }
        return new SemanticsNodeemitFakeNodesfakeNode2(str, accesscontentdescriptionfakenodeid, clearandsetsemantics.ParcelableVolumeInfo, clearandsetsemantics.MediaMetadataCompat, clearandsetsemantics.write);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003c  */
    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public static final void TermsText(String str, String str2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        boolean z;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = RemoteActionCompatParcelizer + 37;
        serializer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1284130777);
        if ((i & 6) == 0) {
            int i8 = RemoteActionCompatParcelizer + 121;
            serializer = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 74 / 0;
                if (getpostalcode2.read(str)) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            } else if (getpostalcode2.read(str)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = RemoteActionCompatParcelizer + 125;
            serializer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            i2 |= getpostalcode2.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i3 = Fields.SpotShadowColor;
            } else {
                int i12 = RemoteActionCompatParcelizer + 115;
                serializer = i12 % Fields.SpotShadowColor;
                i3 = i12 % 2 == 0 ? 2962 : Fields.RotationX;
            }
            i2 |= i3;
        }
        int i13 = i2 | 3072;
        if (getpostalcode2.write(i13 & 1, (i13 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i14 = serializer + 77;
            RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i16 = RemoteActionCompatParcelizer + 75;
                serializer = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            if (str == null) {
                getpostalcode2.serializer(-1525349139);
                getpostalcode2.IconCompatParcelizer(false);
                z = false;
                getpostalcode = getpostalcode2;
            } else {
                getpostalcode2.serializer(-1525349138);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.write(), getpostalcode2, 0, 0, 131066);
                getpostalcode = getpostalcode2;
                z = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            if (str2 == null) {
                getpostalcode.serializer(-1525156071);
                getpostalcode.IconCompatParcelizer(z);
            } else {
                getpostalcode.serializer(-1525156070);
                TertiaryKt.IconCompatParcelizer(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, null, false, R.drawable.ic_bold_large_text_formatting_external_link, null, null, null, getpostalcode, (i13 >> 3) & 112, 236);
                getpostalcode.IconCompatParcelizer(z);
            }
            getpostalcode.IconCompatParcelizer(true);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaZJefYWkAb6Rz_mRy9JTC1Xi8DDk(str, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, i, 1);
        }
    }

    public static final void AppMigrationActions(SemanticsNodeemitFakeNodesfakeNode2 semanticsNodeemitFakeNodesfakeNode2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = serializer + 9;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(869623986);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(semanticsNodeemitFakeNodesfakeNode2) ? 4 : 2) | i;
        } else {
            int i8 = serializer + 125;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                i4 = 16;
            } else {
                int i10 = serializer + 25;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                i4 = i10 % 2 != 0 ? 111 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            int i11 = serializer + 61;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i13 = RemoteActionCompatParcelizer + 23;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 == 0) {
                    int i14 = 4 % 4;
                }
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if ((i2 & 9363) != 9362) {
            int i15 = RemoteActionCompatParcelizer + 105;
            serializer = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i2 & 1, z)) {
            int i17 = RemoteActionCompatParcelizer + 63;
            serializer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i19 = RemoteActionCompatParcelizer + 63;
            serializer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i21 = i2 >> 3;
            TermsText(semanticsNodeemitFakeNodesfakeNode2.write, semanticsNodeemitFakeNodesfakeNode2.read, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, null, getpostalcode, i21 & 896);
            accesscontentDescriptionFakeNodeId accesscontentdescriptionfakenodeid = semanticsNodeemitFakeNodesfakeNode2.serializer;
            if (accesscontentdescriptionfakenodeid == null) {
                getpostalcode.serializer(726877982);
                getpostalcode.IconCompatParcelizer(false);
                z2 = false;
            } else {
                getpostalcode.serializer(726877983);
                int i22 = getUnmergedConfigui.read[accesscontentdescriptionfakenodeid.RemoteActionCompatParcelizer.ordinal()];
                if (i22 != 1) {
                    int i23 = RemoteActionCompatParcelizer;
                    int i24 = i23 + 105;
                    serializer = i24 % Fields.SpotShadowColor;
                    if (i24 % 2 != 0 ? i22 == 2 : i22 == 3) {
                        getpostalcode.serializer(-1892454940);
                        Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dimensions.setPrimaryBackground, 7);
                        ImageVector imageVectorVectorResource = VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_clock, getpostalcode, 6);
                        String str = accesscontentdescriptionfakenodeid.write;
                        z2 = false;
                        BannerMessageKt.IconCompatParcelizer(modifierM74paddingqDBjuR0$default, imageVectorVectorResource, str, (String) null, (AnnotatedString) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 0, Constant.ERROR_UNKNOWN);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        if (i22 != 3) {
                            throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1892464363, false);
                        }
                        int i25 = i23 + 77;
                        serializer = i25 % Fields.SpotShadowColor;
                        int i26 = i25 % 2;
                        getpostalcode.serializer(-1892444878);
                        Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dimensions.setPrimaryBackground, 7);
                        ImageVector imageVectorVectorResource2 = VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_exclamation_octagon, getpostalcode, 6);
                        String str2 = accesscontentdescriptionfakenodeid.write;
                        z2 = false;
                        BannerMessageKt.m5059BannerMessageError1xFH4wI(modifierM74paddingqDBjuR0$default2, imageVectorVectorResource2, str2, null, null, null, null, 0L, null, 0L, null, 0L, 0L, getpostalcode, 0, 0, 32756);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                } else {
                    getpostalcode.serializer(-1892462354);
                    Modifier modifierM74paddingqDBjuR0$default3 = PaddingKt.m74paddingqDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, Dimensions.setPrimaryBackground, 7);
                    String str3 = accesscontentdescriptionfakenodeid.write;
                    z2 = false;
                    BannerMessageKt.IconCompatParcelizer(modifierM74paddingqDBjuR0$default3, (ImageVector) null, (String) null, str3, (String) null, (String) null, (enableBridgeSecurity) null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) null, getpostalcode, 0, 502);
                    getpostalcode.IconCompatParcelizer(false);
                }
                getpostalcode.IconCompatParcelizer(z2);
            }
            String str4 = semanticsNodeemitFakeNodesfakeNode2.IconCompatParcelizer;
            Modifier.Companion companion2 = Modifier.Companion;
            PrimaryKt.write(str4, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, SizeKt.write(PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, Dimensions.setStackedBackground, 7), 1.0f), false, false, Integer.valueOf(R.drawable.ic_bold_large_text_formatting_external_link), null, null, null, null, getpostalcode, i2 & 112, 0, 2008);
            String str5 = semanticsNodeemitFakeNodesfakeNode2.RemoteActionCompatParcelizer;
            if (str5 == null) {
                getpostalcode.serializer(728165474);
                getpostalcode.IconCompatParcelizer(z2);
            } else {
                getpostalcode.serializer(728165475);
                TertiaryKt.IconCompatParcelizer(str5, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, SizeKt.write(companion2, 1.0f), false, 0, null, null, null, getpostalcode, (i21 & 112) | 384, 248);
                getpostalcode.IconCompatParcelizer(z2);
            }
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new isUnmergedLeafNodeui(semanticsNodeemitFakeNodesfakeNode2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 0);
        }
    }
}
