package com.roadrunner.face.verification.presentation.selfie.review;

import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.designsystem.mode.discovery.DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1;
import com.roadrunner.face.verification.presentation.selfie.review.ReviewSelfieContentKt;
import com.roadrunner.freelancing.data.GoAndStartDataStoreFactory$$ExternalSyntheticLambda1;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import com.roadrunner.rrds.compose.component.indicators.ChipsKt;
import com.roadrunner.rrds.compose.component.message.BannerMessageKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import io.sentry.SentryUUID;
import java.util.Locale;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.CircularProgressIndicatorTokens;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.Iconww6aTOc;
import o.ModalBottomSheetDialogWrapper;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextFieldDefaults;
import o.TooltipKtTooltipBoxwrappedContent1;
import o.buildMapping;
import o.getAddressCountry;
import o.getAndroidType;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getNewPassword;
import o.getPostalCode;
import o.getRootCause;
import o.handleUrlOverridelambda1;
import o.internalPathIteratorPeek;
import o.onDependentViewChanged;
import o.onDependentViewRemoved;
import o.onLayoutChild;
import o.onRequestChildRectangleOnScreen;
import o.p6;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.show;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReviewSelfieContentKt {
    private static int IconCompatParcelizer = 1;
    private static int write;

    public static final void read(Uri uri, String str, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = write + 7;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        uri.getClass();
        str.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(76169971);
        if ((i & 6) == 0) {
            int i8 = IconCompatParcelizer + 125;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 = (getpostalcode.IconCompatParcelizer(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i10 = write + 1;
            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                getpostalcode.read(str);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!getpostalcode.read(str)) {
                int i11 = IconCompatParcelizer + 25;
                write = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i4 = 16;
            } else {
                int i13 = IconCompatParcelizer + 15;
                write = i13 % Fields.SpotShadowColor;
                i4 = i13 % 2 != 0 ? 84 : 32;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.read(modifier)) {
                int i14 = write + 19;
                IconCompatParcelizer = i14 % Fields.SpotShadowColor;
                i3 = i14 % 2 == 0 ? 22582 : Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 147) != 146)) {
            Iconww6aTOc.serializer(SizeKt.write(modifier, 1.0f), Alignment.Companion.getCenter(), false, ExtrasKt.write(-220202531, new PagerDefaults$$ExternalSyntheticLambda0(uri, 13, str), getpostalcode), getpostalcode, 3120, 4);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 4, uri, str, modifier);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    public static final void serializer(DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, Modifier modifier, int i, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        int i8 = IconCompatParcelizer + 75;
        write = i8 % Fields.SpotShadowColor;
        int i9 = i8 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-228716675);
        if ((i2 & 6) == 0) {
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1)) {
                int i10 = write + 91;
                IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                int i11 = i10 % 2;
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= Fields.SpotShadowColor;
        }
        Object obj = null;
        if (getpostalcode.write(i3 & 1, (i3 & 147) != 146)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) != 0) {
                int i12 = write + 91;
                IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                if (i12 % 2 != 0) {
                    if (getpostalcode.PlaybackStateCompat()) {
                        i5 = i3 & (-897);
                        i4 = R.string.identity_verification_preview_secondary_button;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        i5 = i3 & (-897);
                        i4 = i;
                    }
                } else {
                    getpostalcode.PlaybackStateCompat();
                    obj.hashCode();
                    throw null;
                }
            } else {
                i5 = i3 & (-897);
                i4 = R.string.identity_verification_preview_secondary_button;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            String upperCase = StringResources_androidKt.stringResource(i4, getpostalcode, 0).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int i13 = i5 << 6;
            ChipsKt.RemoteActionCompatParcelizer(upperCase, false, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, modifier, R.drawable.ic_refresh, getpostalcode, (i13 & 896) | 48 | (i13 & 7168), 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i4 = i;
        }
        int i14 = IconCompatParcelizer + 109;
        write = i14 % Fields.SpotShadowColor;
        if (i14 % 2 == 0) {
            getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new onDependentViewChanged(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, modifier, i4, i2, 0);
                return;
            }
            return;
        }
        getpostalcode.MediaDescriptionCompat();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    public static final void ButtonsFooterConsent(boolean z, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(120552979);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i11 = IconCompatParcelizer + 119;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1)) {
                int i13 = write + 3;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                i9 = i13 % 2 == 0 ? 49 : 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        boolean z3 = true;
        if ((i & 384) == 0) {
            int i14 = IconCompatParcelizer + 1;
            write = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2)) {
                int i16 = write + 85;
                IconCompatParcelizer = i16 % Fields.SpotShadowColor;
                i8 = i16 % 2 == 0 ? 12842 : Fields.RotationX;
            } else {
                i8 = Fields.SpotShadowColor;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            int i17 = write + 25;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            int i18 = i17 % 2;
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3)) {
                int i19 = write + 117;
                IconCompatParcelizer = i19 % Fields.SpotShadowColor;
                i7 = i19 % 2 == 0 ? 21405 : Fields.CameraDistance;
            } else {
                i7 = Fields.RotationZ;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            int i20 = IconCompatParcelizer + 45;
            write = i20 % Fields.SpotShadowColor;
            int i21 = i20 % 2;
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i22 = write + 117;
            IconCompatParcelizer = i22 % Fields.SpotShadowColor;
            int i23 = i22 % 2;
            i2 |= getpostalcode.read(modifier) ? Fields.RenderEffect : 65536;
        }
        if ((74899 & i2) != 74898) {
            int i24 = write + 117;
            IconCompatParcelizer = i24 % Fields.SpotShadowColor;
            if (i24 % 2 == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (!getpostalcode.write(i2 & 1, z2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else if (z) {
            int i25 = IconCompatParcelizer + 73;
            write = i25 % Fields.SpotShadowColor;
            if (i25 % 2 != 0) {
                getpostalcode.serializer(801429366);
                i3 = 0;
                i6 = 0;
                i4 = 1;
                i5 = (i2 / 30) & 21797;
            } else {
                getpostalcode.serializer(801429366);
                i3 = 0;
                i4 = 0;
                i5 = (i2 >> 6) & 8190;
                z3 = false;
                i6 = 0;
            }
            ButtonsFooterConsentSuccess(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i3, i6, i4, getpostalcode, i5);
            getpostalcode.IconCompatParcelizer(z3);
        } else {
            getpostalcode.serializer(801709792);
            ButtonsFooterConsentError(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, modifier, 0, getpostalcode, ((i2 >> 12) & 112) | ((i2 >> 3) & 14));
            getpostalcode.IconCompatParcelizer(false);
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getAndroidType(z, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i);
        }
    }

    public static final void ButtonsFooterConsentError(DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, Modifier modifier, int i, getBirthDateFull getbirthdatefull, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1410297312);
        if ((i2 & 6) == 0) {
            int i9 = IconCompatParcelizer + 65;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1)) {
                int i11 = IconCompatParcelizer + 107;
                write = i11 % Fields.SpotShadowColor;
                i7 = i11 % 2 != 0 ? 3 : 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= getpostalcode.read(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= Fields.SpotShadowColor;
        }
        if ((i3 & 147) != 146) {
            int i12 = write + 65;
            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i2 & 1) == 0 || getpostalcode.PlaybackStateCompat()) {
                i5 = i3 & (-897);
                i6 = R.string.identity_verification_preview_secondary_button;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                i5 = i3 & (-897);
                i6 = i;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!(!getpostalcode.ComponentActivity)) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(Modifier.Companion, 1.0f), 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13);
                modifierM74paddingqDBjuR0$default.getClass();
                PrimaryKt.write(StringResources_androidKt.stringResource(i6, getpostalcode, 0), darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, modifierM74paddingqDBjuR0$default, true, false, null, null, null, null, null, getpostalcode, ((i5 << 3) & 112) | 3072, 0, 2032);
                getpostalcode.IconCompatParcelizer(true);
                i4 = i6;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i4 = i;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new onDependentViewChanged(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, modifier, i4, i2, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    public static final void ButtonsFooter(boolean z, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1481648291);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.write(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1)) {
                int i7 = IconCompatParcelizer + 117;
                write = i7 % Fields.SpotShadowColor;
                i5 = i7 % 2 != 0 ? 3 : 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2)) {
                int i8 = IconCompatParcelizer + 63;
                write = i8 % Fields.SpotShadowColor;
                i4 = i8 % 2 != 0 ? 7632 : Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (!(!getpostalcode.read(modifier))) {
                int i9 = IconCompatParcelizer + 27;
                write = i9 % Fields.SpotShadowColor;
                i3 = i9 % 2 != 0 ? 20534 : Fields.CameraDistance;
            } else {
                i3 = Fields.RotationZ;
            }
            i2 |= i3;
        }
        int i10 = i2;
        if (getpostalcode.write(i10 & 1, (i10 & 1171) != 1170)) {
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode.read != null) {
                int i11 = write + 27;
                IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                if (i11 % 2 == 0) {
                    getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    int i12 = 87 / 0;
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
                c8$$ExternalSyntheticOutline0.m(companion, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion2 = Modifier.Companion;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion2, 1.0f), 0.0f, Dimensions.getContentHeight, 0.0f, 0.0f, 13);
                String strStringResource = StringResources_androidKt.stringResource(R.string.submit, getpostalcode, 0);
                if ((i10 & 112) == 32) {
                    z2 = true;
                } else {
                    int i13 = IconCompatParcelizer + 97;
                    write = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    z2 = false;
                }
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z2 || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new onLayoutChild(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, 0);
                    getpostalcode.write(objComponentActivity);
                }
                PrimaryKt.write(strStringResource, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, modifierM74paddingqDBjuR0$default, z, false, null, null, null, null, null, getpostalcode, (i10 << 9) & 7168, 0, 2032);
                Modifier modifierM74paddingqDBjuR0$default2 = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion2, 1.0f), 0.0f, Dimensions.setStackedBackground, 0.0f, Dimensions.setSubtitle, 5);
                modifierM74paddingqDBjuR0$default2.getClass();
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.identity_verification_preview_secondary_button, getpostalcode, 0);
                boolean z3 = (i10 & 896) == 256;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z3 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(23, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2);
                    getpostalcode.write(objComponentActivity2);
                }
                TertiaryKt.IconCompatParcelizer(strStringResource2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierM74paddingqDBjuR0$default2, false, 0, null, null, null, getpostalcode, 0, 248);
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
            gethandleruiannotationsMediaDescriptionCompat.serializer = new p6(z, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, modifier, i, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a  */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003f A[PHI: r3 r6
  0x003f: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x003f: PHI (r6v14 o.getAddressCountry) = (r6v1 o.getAddressCountry), (r6v15 o.getAddressCountry) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r3 r6
  0x0034: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0034: PHI (r6v2 o.getAddressCountry) = (r6v1 o.getAddressCountry), (r6v15 o.getAddressCountry) binds: [B:8:0x0032, B:5:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void ButtonsFooterConsentSuccess(final DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, final DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, final Modifier modifier, int i, int i2, int i3, getBirthDateFull getbirthdatefull, final int i4) {
        getPostalCode getpostalcode;
        getAddressCountry getaddresscountry;
        int i5;
        int i6;
        boolean z;
        final int i7;
        final int i8;
        final int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 2 % 2;
        int i17 = write + 95;
        IconCompatParcelizer = i17 % Fields.SpotShadowColor;
        if (i17 % 2 == 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1657182573);
            getaddresscountry = getpostalcode.read;
            if ((i4 & 20) == 0) {
                if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
                i6 = i5 | i4;
            } else {
                i6 = i4;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(1657182573);
            getaddresscountry = getpostalcode.read;
            if ((i4 & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1)) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
                i6 = i5 | i4;
            } else {
                i6 = i4;
            }
        }
        if ((i4 & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2)) {
                int i18 = IconCompatParcelizer + 125;
                write = i18 % Fields.SpotShadowColor;
                i15 = i18 % 2 != 0 ? 15 : 32;
            } else {
                i15 = 16;
            }
            i6 |= i15;
        }
        if ((i4 & 384) == 0) {
            i6 |= !getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.SpotShadowColor : Fields.RotationX;
        }
        if ((i4 & 3072) == 0) {
            i6 |= getpostalcode.read(modifier) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i4 & 24576) == 0) {
            int i19 = write + 111;
            IconCompatParcelizer = i19 % Fields.SpotShadowColor;
            int i20 = i19 % 2;
            i6 |= 8192;
        }
        if ((196608 & i4) == 0) {
            int i21 = write + 67;
            IconCompatParcelizer = i21 % Fields.SpotShadowColor;
            if (i21 % 2 == 0) {
                i6 |= 65536;
                int i22 = 40 / 0;
            } else {
                i6 |= 65536;
            }
        }
        if ((1572864 & i4) == 0) {
            i6 |= Fields.BlendMode;
        }
        if ((599187 & i6) != 599186) {
            int i23 = IconCompatParcelizer + 35;
            write = i23 % Fields.SpotShadowColor;
            int i24 = i23 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i4 & 1) != 0) {
                int i25 = IconCompatParcelizer + 83;
                write = i25 % Fields.SpotShadowColor;
                if (i25 % 2 == 0) {
                    if (getpostalcode.PlaybackStateCompat()) {
                        i10 = R.string.selfie_consent_human_review_icon_text;
                        i11 = i6 & (-4186113);
                        i12 = R.string.selfie_consent_automated_review_button_text;
                        i13 = R.string.selfie_consent_human_review_button_text;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        i13 = i2;
                        i10 = i3;
                        i11 = i6 & (-4186113);
                        i12 = i;
                    }
                } else {
                    int i26 = 35 / 0;
                    if (getpostalcode.PlaybackStateCompat()) {
                        i10 = R.string.selfie_consent_human_review_icon_text;
                        i11 = i6 & (-4186113);
                        i12 = R.string.selfie_consent_automated_review_button_text;
                        i13 = R.string.selfie_consent_human_review_button_text;
                    } else {
                        getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        i13 = i2;
                        i10 = i3;
                        i11 = i6 & (-4186113);
                        i12 = i;
                    }
                }
            } else {
                i10 = R.string.selfie_consent_human_review_icon_text;
                i11 = i6 & (-4186113);
                i12 = R.string.selfie_consent_automated_review_button_text;
                i13 = R.string.selfie_consent_human_review_button_text;
            }
            getpostalcode.RemoteActionCompatParcelizer();
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry != null) {
                int i27 = write + 85;
                IconCompatParcelizer = i27 % Fields.SpotShadowColor;
                int i28 = i27 % 2;
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion3, 1.0f), 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13);
                modifierM74paddingqDBjuR0$default.getClass();
                String strStringResource = StringResources_androidKt.stringResource(i12, getpostalcode, 0);
                boolean z2 = (i11 & 14) == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z2 || objComponentActivity == androidContentCaptureManager) {
                    i14 = 1;
                    objComponentActivity = new onLayoutChild(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, 1);
                    getpostalcode.write(objComponentActivity);
                } else {
                    i14 = 1;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
                int i29 = i10;
                int i30 = i13;
                int i31 = i14;
                PrimaryKt.write(strStringResource, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifierM74paddingqDBjuR0$default, true, false, null, null, null, null, null, getpostalcode, 3072, 0, 2032);
                Modifier modifierWrite = SizeKt.write(companion3, 1.0f);
                float f = Dimensions.setPrimaryBackground;
                Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(modifierWrite, 0.0f, f, i31);
                modifierM73paddingVpY3zN4$default.getClass();
                String strStringResource2 = StringResources_androidKt.stringResource(i30, getpostalcode, 0);
                int i32 = (i11 & 112) == 32 ? i31 : 0;
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if ((i32 ^ i31) != i31 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new GoAndStartDataStoreFactory$$ExternalSyntheticLambda1(22, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2);
                    getpostalcode.write(objComponentActivity2);
                }
                TertiaryKt.IconCompatParcelizer(strStringResource2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, modifierM73paddingVpY3zN4$default, false, 0, null, null, null, getpostalcode, 0, 248);
                Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, companion.getCenterVertically(), getpostalcode, 54);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (!getpostalcode.ComponentActivity) {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                } else {
                    int i33 = IconCompatParcelizer + 55;
                    write = i33 % Fields.SpotShadowColor;
                    int i34 = i33 % 2;
                    getpostalcode.serializer(constructor2);
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                getRootCause.write(R.drawable.ic_info_circle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, companion3, null, false, null, null, getpostalcode, ((i11 >> 3) & 112) | 384, 248);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, f)});
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(i29, getpostalcode, 0), null, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(true);
                i8 = i30;
                i7 = i12;
                i9 = i29;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            i7 = i;
            i8 = i2;
            i9 = i3;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: o.onDetachedFromLayoutParams
                private static int MediaBrowserCompatMediaItem = 0;
                private static int MediaMetadataCompat = 1;

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    int i35 = 2 % 2;
                    int i36 = MediaMetadataCompat + 87;
                    MediaBrowserCompatMediaItem = i36 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i37 = i36 % 2;
                    ((Integer) obj2).getClass();
                    ReviewSelfieContentKt.ButtonsFooterConsentSuccess(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier, i7, i8, i9, (getBirthDateFull) obj, ContentType_androidKt.RemoteActionCompatParcelizer(i4 | 1));
                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                    int i38 = MediaBrowserCompatMediaItem + 59;
                    MediaMetadataCompat = i38 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i39 = i38 % 2;
                    return createfromparcel;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:97:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x042c  */
    public static final void ReviewSelfieContent(int i, getBirthDateFull getbirthdatefull, Modifier modifier, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, DarkModeDiscoveryDialogFragment$onCreateView$1$1$1$1 darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, onDependentViewRemoved ondependentviewremoved, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        boolean z2;
        Object objComponentActivity;
        int i3;
        int i4;
        int i5 = 2 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        ondependentviewremoved.getClass();
        boolean z3 = ondependentviewremoved.RemoteActionCompatParcelizer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(188879945);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1) ? 32 : 16;
            int i6 = IconCompatParcelizer + 27;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2)) {
                int i8 = write + 115;
                IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i4 = Fields.RotationX;
            } else {
                i4 = Fields.SpotShadowColor;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i10 = IconCompatParcelizer + 99;
            write = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                getpostalcode2.IconCompatParcelizer(ondependentviewremoved);
                throw null;
            }
            i2 |= getpostalcode2.IconCompatParcelizer(ondependentviewremoved) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i11 = IconCompatParcelizer + 9;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            if (getpostalcode2.read(modifier)) {
                int i13 = write + 109;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                i3 = Fields.RenderEffect;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        }
        int i15 = i2;
        if (getpostalcode2.write(i15 & 1, (74899 & i15) != 74898)) {
            Modifier.Companion companion = Modifier.Companion;
            float f = Dimensions.getAnimatedVisibility;
            Modifier modifierM73paddingVpY3zN4$default = PaddingKt.m73paddingVpY3zN4$default(companion, f, 0.0f, 2);
            boolean z4 = ondependentviewremoved.serializer;
            SheetState sheetStateRemoteActionCompatParcelizer = ModalBottomSheetKt.RemoteActionCompatParcelizer(null, getpostalcode2, 0, 3);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(Boolean.FALSE);
                getpostalcode2.write(objComponentActivity2);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            boolean zBooleanValue = ((Boolean) populateViewStructure_androidKtpopulate7.getValue()).booleanValue();
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 14);
                getpostalcode2.write(objComponentActivity3);
            }
            int i16 = i15;
            Object obj = null;
            HumanReviewBottomSheetKt.write(zBooleanValue, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, sheetStateRemoteActionCompatParcelizer, null, getpostalcode2, 48);
            Modifier modifierThen = modifier.then(SizeKt.read);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM20backgroundbw27NRU);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i17 = write + 101;
            IconCompatParcelizer = i17 % Fields.SpotShadowColor;
            if (i17 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z5 = getpostalcode2.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Modifier modifierIconCompatParcelizer = ModalBottomSheetDialogWrapper.IconCompatParcelizer(SizeKt.write(companion, 1.0f), 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierIconCompatParcelizer);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, null, ExtrasKt.write(-273802499, new DefaultLazyKey(12, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2), null, null, getpostalcode2, 1572864, 447);
            float f2 = Dimensions.setSplitBackground;
            TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.identity_verification_preview_title, getpostalcode2, 0), PaddingKt.m74paddingqDBjuR0$default(modifierM73paddingVpY3zN4$default, 0.0f, f2, 0.0f, Dimensions.setStackedBackground, 5), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaMetadataCompat(), getpostalcode2, 0, 0, 131064);
            if (ondependentviewremoved.write) {
                getpostalcode2.serializer(1669240691);
                BannerMessageKt.m5059BannerMessageError1xFH4wI(PaddingKt.m74paddingqDBjuR0$default(modifierM73paddingVpY3zN4$default, 0.0f, Dimensions.setTabContainer, 0.0f, 0.0f, 13), null, StringResources_androidKt.stringResource(R.string.identity_verification_error_no_face_detected, getpostalcode2, 0), StringResources_androidKt.stringResource(R.string.identity_verification_error_selfie_instructions, getpostalcode2, 0), null, null, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getWindowSystemUiVisibility(), null, 0L, null, 0L, 0L, getpostalcode2, 0, 0, 32230);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(1669681325);
                TextKt.m131TextNvy7gAk(StringResources_androidKt.stringResource(R.string.identity_verification_preview_sub_title, getpostalcode2, 0), modifierM73paddingVpY3zN4$default, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, 0, 0, 131064);
                getpostalcode2.IconCompatParcelizer(false);
            }
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion, Dimensions.getContentHeight)});
            Uri uri = ondependentviewremoved.IconCompatParcelizer.IconCompatParcelizer;
            int i18 = ondependentviewremoved.read;
            if (1.0f <= 0.0d) {
                TooltipKtTooltipBoxwrappedContent1.read("invalid weight; must be greater than zero");
            }
            boolean z6 = false;
            Modifier modifierM73paddingVpY3zN4$default2 = PaddingKt.m73paddingVpY3zN4$default(companion.then(new show(1.0f, false)), f, 0.0f, 2);
            modifierM73paddingVpY3zN4$default2.getClass();
            read(uri, String.valueOf(i18), modifierM73paddingVpY3zN4$default2, getpostalcode2, 0);
            if (z4) {
                z = true;
                if (!z3) {
                    int i19 = IconCompatParcelizer + 33;
                    write = i19 % Fields.SpotShadowColor;
                    int i20 = i19 % 2;
                    getpostalcode2.serializer(1670493463);
                    ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion, f2)});
                    Modifier modifierWrite = SizeKt.write(companion, 1.0f);
                    supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, companion2.getTop(), getpostalcode2, 6);
                    int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
                    DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
                    getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                    if (getpostalcode2.ComponentActivity) {
                        getpostalcode2.serializer(constructor3);
                    } else {
                        getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                    }
                    r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                    AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
                    i16 = i16;
                    z6 = false;
                    serializer(darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, companion, 0, getpostalcode2, ((i16 >> 6) & 14) | 48);
                    getpostalcode2.IconCompatParcelizer(true);
                    getpostalcode2.IconCompatParcelizer(false);
                }
                getpostalcode2.IconCompatParcelizer(z);
                if (z4) {
                    getpostalcode2.serializer(1340583948);
                    objComponentActivity = getpostalcode2.ComponentActivity();
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 15);
                        getpostalcode2.write(objComponentActivity);
                    }
                    ButtonsFooterConsent(z3 ^ z, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion, 1.0f), f, 0.0f, 2), getpostalcode2, ((i16 >> 3) & 112) | 24576 | ((i16 << 3) & 896) | (i16 & 7168));
                    getpostalcode2.IconCompatParcelizer(z6);
                    z2 = z;
                    getpostalcode = getpostalcode2;
                } else {
                    boolean z7 = z;
                    getpostalcode2.serializer(1341115970);
                    Modifier modifierM73paddingVpY3zN4$default3 = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion, 1.0f), f, 0.0f, 2);
                    int i21 = i16 & 1008;
                    z2 = z7;
                    getpostalcode = getpostalcode2;
                    ButtonsFooter(z3 ^ z7, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, modifierM73paddingVpY3zN4$default3, getpostalcode, i21);
                    getpostalcode.IconCompatParcelizer(z6);
                }
                getpostalcode.IconCompatParcelizer(z2);
            } else {
                z = true;
            }
            getpostalcode2.serializer(1670945133);
            getpostalcode2.IconCompatParcelizer(z6);
            getpostalcode2.IconCompatParcelizer(z);
            if (z4) {
                getpostalcode2.serializer(1340583948);
                objComponentActivity = getpostalcode2.ComponentActivity();
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new CircularProgressIndicatorTokens(populateViewStructure_androidKtpopulate7, 15);
                    getpostalcode2.write(objComponentActivity);
                }
                ButtonsFooterConsent(z3 ^ z, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion, 1.0f), f, 0.0f, 2), getpostalcode2, ((i16 >> 3) & 112) | 24576 | ((i16 << 3) & 896) | (i16 & 7168));
                getpostalcode2.IconCompatParcelizer(z6);
                z2 = z;
                getpostalcode = getpostalcode2;
            } else {
                boolean z8 = z;
                getpostalcode2.serializer(1341115970);
                Modifier modifierM73paddingVpY3zN4$default4 = PaddingKt.m73paddingVpY3zN4$default(SizeKt.write(companion, 1.0f), f, 0.0f, 2);
                int i22 = i16 & 1008;
                z2 = z8;
                getpostalcode = getpostalcode2;
                ButtonsFooter(z3 ^ z8, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, modifierM73paddingVpY3zN4$default4, getpostalcode, i22);
                getpostalcode.IconCompatParcelizer(z6);
            }
            getpostalcode.IconCompatParcelizer(z2);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new onRequestChildRectangleOnScreen(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$1, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$2, darkModeDiscoveryDialogFragment$onCreateView$1$1$1$3, ondependentviewremoved, modifier, i);
        }
    }
}
