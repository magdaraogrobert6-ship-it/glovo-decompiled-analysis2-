package com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.b1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt;
import com.roadrunner.rrds.compose.component.actions.links.LinkifyTextKt;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.dialog.messagedialog.MessagePopUpKt;
import com.roadrunner.rrds.compose.component.forms.PasswordFieldKt;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import com.roadrunner.rrds.compose.component.message.password.PasswordRuleContentKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import o.ActivityHandler37;
import o.ActivityHandler39;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidSystemCallbacksActivityCallbacks;
import o.CircularProgressIndicatorTokens;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NullRequestDataException;
import o.PagerWrapperFlingBehavior;
import o.PopulateViewStructure_androidKtpopulate7;
import o.awaitStarted;
import o.b3;
import o.buildMapping;
import o.canReadPlayIds;
import o.computeVerticalScrollExtent;
import o.generatePOSTBodyString;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getKeyboardKindJ9_QTjY;
import o.getNewPassword;
import o.getOutputTransform;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.layoutDependsOn;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M;
import o.resumeSendingI;
import o.show;
import o.trigger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PasswordCreationScreenKt {
    private static int IconCompatParcelizer = 1;
    public static final float RemoteActionCompatParcelizer;
    private static int read = 0;
    private static int serializer = 0;
    private static int write = 1;

    static {
        float f = Dimensions.read;
        RemoteActionCompatParcelizer = Dimensions.setVisibility;
        int i = write + 13;
        read = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public static final void write(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1525194501);
        if ((i & 6) == 0) {
            if (!(!getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0))) {
                int i5 = serializer + 121;
                int i6 = i5 % Fields.SpotShadowColor;
                IconCompatParcelizer = i6;
                i3 = i5 % 2 == 0 ? 5 : 4;
                int i7 = i6 + 45;
                serializer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
            int i9 = IconCompatParcelizer + 91;
            serializer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            HeaderKt.RemoteActionCompatParcelizer(null, null, 0L, ExtrasKt.write(951546984, new trigger(13, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode), null, null, getpostalcode, 24576, 111);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new layoutDependsOn(i, 1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
    }

    public static final void RemoteActionCompatParcelizer(final ActivityHandler39 activityHandler39, final FocusRequester focusRequester, Modifier modifier, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = IconCompatParcelizer + 25;
        serializer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        activityHandler39.getClass();
        focusRequester.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(2116779467);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(activityHandler39) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= !getpostalcode.read(modifier) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i9 = serializer + 29;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                i5 = i9 % 2 == 0 ? 16756 : Fields.Clip;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i10 = IconCompatParcelizer + 27;
                serializer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i4 = Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            int i12 = IconCompatParcelizer + 111;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2)) {
                int i14 = serializer + 21;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                if (i14 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        if ((100663296 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3) ? 67108864 : 33554432;
        }
        int i15 = i2;
        if (getpostalcode.write(i15 & 1, (i15 & 38347923) != 38347922)) {
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(activityHandler39.MediaSessionCompatToken, modifier, activityHandler39.MediaSessionCompatQueueItem, null, ExtrasKt.write(-1971117757, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.ActivityHandler35
                private static int MediaMetadataCompat = 0;
                private static int RatingCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z;
                    int i16 = 2 % 2;
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 3) != 2) {
                        int i17 = MediaMetadataCompat + 1;
                        RatingCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i18 = i17 % 2;
                        z = true;
                    } else {
                        int i19 = RatingCompat + 117;
                        MediaMetadataCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        z = false;
                    }
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (!(!getpostalcode2.write(iIntValue & 1, z))) {
                        int i21 = MediaMetadataCompat + 63;
                        RatingCompat = i21 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i22 = i21 % 2;
                        PasswordCreationScreenKt.PasswordCreationContent(activityHandler39, focusRequester, androidx.compose.ui.Modifier.Companion, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getpostalcode2, 384);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, ((i15 >> 3) & 112) | 24576, 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ActivityHandler37(activityHandler39, focusRequester, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, i, 0);
            int i16 = serializer + 119;
            IconCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
    }

    public static final void Footer(ActivityHandler39 activityHandler39, String str, String str2, String str3, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-519281547);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(activityHandler39) ? 4 : 2) | i;
            int i5 = IconCompatParcelizer + 125;
            serializer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= !getpostalcode.read(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i7 = serializer + 123;
            IconCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            i2 |= getpostalcode.read(str2) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode.read(str3)) {
                int i9 = IconCompatParcelizer + 91;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        Object obj = null;
        if ((i & 24576) == 0) {
            int i11 = serializer + 65;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            if (i11 % 2 == 0) {
                getpostalcode.read(modifier);
                obj.hashCode();
                throw null;
            }
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 65536 : Fields.RenderEffect;
            int i12 = IconCompatParcelizer + 95;
            serializer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        if (!getpostalcode.write(i2 & 1, (74899 & i2) != 74898)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
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
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i14 = IconCompatParcelizer + 123;
                serializer = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long presenter = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter();
            String str4 = activityHandler39.PlaybackStateCompat;
            Modifier.Companion companion2 = Modifier.Companion;
            companion2.getClass();
            int i16 = i2 >> 6;
            LinkifyTextKt.m5035LinkifyPlaceholdermAkEFg8(str2, str3, textStyleIconCompatParcelizer, presenter, companion2, 0L, null, null, str4, getpostalcode, (i16 & 14) | 24576 | (i16 & 112));
            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, af$$ExternalSyntheticOutline1.m(companion2, Dimensions.setTabContainer, getpostalcode, companion2, 1.0f), activityHandler39.ParcelableVolumeInfo, false, null, null, null, null, null, getpostalcode, ((i2 >> 3) & 14) | 384 | ((i2 >> 12) & 112), 0, 2032);
            getpostalcode.IconCompatParcelizer(true);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getKeyboardKindJ9_QTjY(activityHandler39, str, str2, str3, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    public static final void Body(ActivityHandler39 activityHandler39, FocusRequester focusRequester, String str, String str2, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(413844355);
        if ((i & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(activityHandler39)) {
                int i7 = serializer + 99;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.read(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i9 = serializer + 45;
            IconCompatParcelizer = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            i2 |= getpostalcode.read(str) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.read(str2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            if (getpostalcode.read(modifier)) {
                int i11 = serializer + 93;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = Fields.Clip;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.RenderEffect : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= !getpostalcode.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2) ? 4194304 : 8388608;
        }
        if (getpostalcode.write(i2 & 1, (4793491 & i2) != 4793490)) {
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(SizeKt.write(modifier, 1.0f), PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierIconCompatParcelizer);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i13 = IconCompatParcelizer + 93;
                serializer = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    getpostalcode.serializer(constructor);
                    i3 = 0;
                    int i14 = 79 / 0;
                } else {
                    i3 = 0;
                    getpostalcode.serializer(constructor);
                }
            } else {
                i3 = 0;
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            int i15 = i3;
            TextKt.m131TextNvy7gAk(str, null, 0L, 0L, FontWeight.Companion.getBlack(), null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, ((i2 >> 6) & 14) | 1572864, 0, 131006);
            Modifier.Companion companion2 = Modifier.Companion;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.getAnimatedVisibility)});
            AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks = activityHandler39.MediaMetadataCompat;
            String str3 = androidSystemCallbacksActivityCallbacks.RemoteActionCompatParcelizer;
            String str4 = androidSystemCallbacksActivityCallbacks.read;
            int i16 = (458752 & i2) == 131072 ? 1 : i15;
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (i16 == 0) {
                int i17 = serializer + 79;
                IconCompatParcelizer = i17 % Fields.SpotShadowColor;
                if (i17 % 2 == 0) {
                    int i18 = 50 / i15;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode.write(objComponentActivity);
                    }
                } else if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new r8lambdacpVRyEhxzdUx5p9KqbggyjwKD6M(8, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            }
            PasswordFieldKt.PasswordField(str3, companion2, "ACCOUNT_CREATION_PASSWORD_INPUT_FIELD_TAG", false, str4, false, "", r8lambdaunavo3sxub_pc9xroryotnrlvsm, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, null, null, getpostalcode, ((i2 << 6) & 234881024) | 14156208, 0, 3096);
            Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(PaddingKt.m73paddingVpY3zN4$default(companion2, 0.0f, Dimensions.setTabContainer, 1), focusRequester);
            AndroidSystemCallbacksActivityCallbacks androidSystemCallbacksActivityCallbacks2 = activityHandler39.MediaBrowserCompatMediaItem;
            String str5 = androidSystemCallbacksActivityCallbacks2.RemoteActionCompatParcelizer;
            String str6 = androidSystemCallbacksActivityCallbacks2.read;
            getOutputTransform getoutputtransform = androidSystemCallbacksActivityCallbacks2.serializer;
            boolean z = getoutputtransform instanceof awaitStarted;
            awaitStarted awaitstarted = z ? (awaitStarted) getoutputtransform : null;
            PasswordFieldKt.PasswordField(str5, modifierFocusRequester, "ACCOUNT_CREATION_CONFIRM_PASSWORD_INPUT_FIELD_TAG", false, str6, z, awaitstarted != null ? awaitstarted.write : null, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, null, null, null, getpostalcode, ((i2 << 3) & 234881024) | 384, 0, 3608);
            TextKt.m131TextNvy7gAk(str2, null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.serializer(), getpostalcode, (i2 >> 9) & 14, 0, 131066);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion2, Dimensions.setSplitBackground)});
            getpostalcode.serializer(-1553097808);
            int i19 = 0;
            for (Object obj : activityHandler39.RatingCompat) {
                int i20 = IconCompatParcelizer + 63;
                serializer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                if (i19 < 0) {
                    SQLite.serializer();
                    throw null;
                }
                NullRequestDataException nullRequestDataException = (NullRequestDataException) obj;
                getpostalcode.serializer(-1553096525);
                Modifier.Companion companion3 = Modifier.Companion;
                companion3.getClass();
                PasswordRuleContentKt.m5060PasswordRuleContent69PAOm4(nullRequestDataException.IconCompatParcelizer, nullRequestDataException.read, companion3, SizeKt.m83size3ABfNKs(companion3, RemoteActionCompatParcelizer), null, null, 0L, 0L, 0L, performLayout.serializer(), 0.0f, getpostalcode, 3072, 0, 1520);
                getpostalcode.IconCompatParcelizer(false);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, Dimensions.setPrimaryBackground, 0.0f, 0.0f, 13)});
                i19++;
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(activityHandler39, focusRequester, str, str2, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0295  */
    /* JADX WARN: Code duplicated, block: B:128:0x0299  */
    public static final void PasswordCreationContent(ActivityHandler39 activityHandler39, FocusRequester focusRequester, Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        activityHandler39.getClass();
        focusRequester.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(2000125256);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        Object obj = null;
        if ((i & 6) == 0) {
            int i9 = IconCompatParcelizer + 39;
            serializer = i9 % Fields.SpotShadowColor;
            if (i9 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(activityHandler39);
                throw null;
            }
            i2 = (getpostalcode2.IconCompatParcelizer(activityHandler39) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.read(focusRequester) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.read(modifier) ^ true ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i10 = IconCompatParcelizer + 91;
                serializer = i10 % Fields.SpotShadowColor;
                i7 = i10 % 2 != 0 ? 20388 : Fields.CameraDistance;
            } else {
                i7 = Fields.RotationZ;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm)) {
                int i11 = serializer + 39;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    throw null;
                }
                i6 = Fields.RenderEffect;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm2)) {
                int i12 = IconCompatParcelizer + 41;
                serializer = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                i5 = 1048576;
            } else {
                i5 = Fields.BlendMode;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            int i14 = serializer + 25;
            IconCompatParcelizer = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (!getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k3)) {
                i4 = 33554432;
            } else {
                int i16 = serializer + 49;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i4 = 67108864;
            }
            i2 |= i4;
        }
        int i17 = i2;
        if (getpostalcode2.write(i17 & 1, (i17 & 38347923) != 38347922)) {
            int i18 = serializer + 21;
            IconCompatParcelizer = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i20 = serializer + 89;
                IconCompatParcelizer = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                objComponentActivity = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity;
            if (((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue()) {
                getpostalcode2.serializer(1650735988);
                generatePOSTBodyString generatepostbodystring = new generatePOSTBodyString(activityHandler39.serializer, false, activityHandler39.read, activityHandler39.IconCompatParcelizer, null, activityHandler39.RemoteActionCompatParcelizer, 104, null);
                Object objComponentActivity2 = getpostalcode2.ComponentActivity();
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 16);
                    getpostalcode2.write(objComponentActivity2);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                boolean z = (i17 & 57344) == 16384;
                Object objComponentActivity3 = getpostalcode2.ComponentActivity();
                if (z || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new resumeSendingI(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7, 5);
                    getpostalcode2.write(objComponentActivity3);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3;
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 17);
                    getpostalcode2.write(objComponentActivity4);
                }
                i3 = 8388608;
                MessagePopUpKt.serializer(generatepostbodystring, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, null, false, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, null, getpostalcode2, 12582960, 348);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                i3 = 8388608;
                getpostalcode2.serializer(1651387546);
                getpostalcode2.IconCompatParcelizer(false);
            }
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifier.then(SizeKt.read), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            boolean z2 = (i17 & 29360128) == i3;
            Object objComponentActivity5 = getpostalcode2.ComponentActivity();
            if (z2 || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new b1$$ExternalSyntheticLambda0(28, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode2.write(objComponentActivity5);
                int i22 = serializer + 47;
                IconCompatParcelizer = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
            }
            Modifier modifier2 = canReadPlayIds.read(modifierM20backgroundbw27NRU, null, false, null, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5, getpostalcode2, 63);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i24 = IconCompatParcelizer + 61;
            serializer = i24 % Fields.SpotShadowColor;
            if (i24 % 2 != 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                int i25 = 29 / 0;
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            } else {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(activityHandler39);
            boolean z3 = (i17 & 57344) == 16384;
            Object objComponentActivity6 = getpostalcode2.ComponentActivity();
            if ((zIconCompatParcelizer | z3) || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new b3(activityHandler39, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, populateViewStructure_androidKtpopulate7);
                getpostalcode2.write(objComponentActivity6);
            }
            write((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity6, getpostalcode2, 0);
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierWrite2 = PaddingKt.write(modifierWrite, f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            int i26 = i17 << 3;
            Body(activityHandler39, focusRequester, activityHandler39.ResultReceiver, activityHandler39.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, companion3.then(new show(1.0f, true)), r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, getpostalcode2, (i17 & 126) | ((i17 >> 9) & 458752) | (3670016 & i26) | (i26 & 29360128));
            Footer(activityHandler39, activityHandler39.write, activityHandler39.MediaSessionCompatResultReceiverWrapper, activityHandler39.PlaybackStateCompatCustomAction, PaddingKt.m74paddingqDBjuR0$default(companion3, 0.0f, f, 0.0f, 0.0f, 13), r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, (i17 & 14) | ((i17 << 6) & 458752));
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new ActivityHandler37(activityHandler39, focusRequester, modifier, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, i, 1);
        }
    }
}
