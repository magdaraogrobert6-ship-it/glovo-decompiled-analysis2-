package com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.compose;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.incognia.internal.pcn;
import com.mapbox.navigation.core.internal.dump.HelpDumpInterceptor$prettyString$1;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.buttons.TertiaryKt;
import io.sentry.SentryUUID;
import io.sentry.hints.PlaybackStateCompatCustomAction;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidFontTypefaceLoader;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FloatingActionButtonKtExtendedFloatingActionButton1;
import o.KeyboardType;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.PagerWrapperFlingBehavior;
import o.TextFieldDefaults;
import o.buildMapping;
import o.dc;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInsetsForType;
import o.getNewPassword;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getUnspecifiedIUNYP9k;
import o.hideCurrentlyDisplayingInAppMessage;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setCurrentSemanticsNodesui;
import o.stopIgnoring;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TermsAndConditionsKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public static final void GuidelinePoint(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1938889006);
        if ((i & 6) == 0) {
            int i5 = RemoteActionCompatParcelizer + 19;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            if (getpostalcode2.read(str)) {
                int i7 = write + 105;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i8 = i2 | 48;
        if ((i8 & 19) != 18) {
            int i9 = RemoteActionCompatParcelizer + 79;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            int i11 = RemoteActionCompatParcelizer + 5;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            z = false;
        }
        if (getpostalcode2.write(i8 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, Dimensions.getNestedScrollAxes, 0.0f, 0.0f, 13);
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getTop(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierM74paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode2.read != null) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                TextStyle textStyle = (TextStyle) performLayout.read(-1830567612, pcn.serializer(), new Object[0], 1830567614, pcn.serializer(), pcn.serializer(), pcn.serializer());
                setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
                TextKt.m131TextNvy7gAk("  •  ", null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 6, 0, 131066);
                TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode2, i8 & 14, 0, 131066);
                getpostalcode = getpostalcode2;
                getpostalcode.IconCompatParcelizer(true);
                int i13 = RemoteActionCompatParcelizer + 99;
                write = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new dc(i, str, modifier2, 5);
        }
    }

    public static final void ExamplePhoto(getUnspecifiedIUNYP9k getunspecifiediunyp9k, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        boolean zIconCompatParcelizer;
        int i4;
        int i5 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-2047957629);
        Object obj = null;
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                int i6 = write + 3;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    getpostalcode2.read(getunspecifiediunyp9k);
                    obj.hashCode();
                    throw null;
                }
                zIconCompatParcelizer = getpostalcode2.read(getunspecifiediunyp9k);
            } else {
                zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getunspecifiediunyp9k);
            }
            if (zIconCompatParcelizer) {
                int i7 = write + 7;
                RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode2.read(modifier)) {
                int i9 = RemoteActionCompatParcelizer + 71;
                write = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 19) != 18)) {
            int i11 = RemoteActionCompatParcelizer + 57;
            write = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getCenterHorizontally(), getpostalcode2, 48);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i13 = write + 15;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            if (i13 % 2 == 0) {
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                boolean z = getpostalcode2.ComponentActivity;
                obj.hashCode();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!(!getpostalcode2.ComponentActivity)) {
                int i14 = RemoteActionCompatParcelizer + 123;
                write = i14 % Fields.SpotShadowColor;
                if (i14 % 2 != 0) {
                    getpostalcode2.serializer(constructor);
                    int i15 = 66 / 0;
                } else {
                    getpostalcode2.serializer(constructor);
                }
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Painter painterPainterResource = PainterResources_androidKt.painterResource(getunspecifiediunyp9k.read, getpostalcode2, 0);
            ContentScale crop = ContentScale.Companion.getCrop();
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier modifierThen = companion2.then(new FloatingActionButtonKtExtendedFloatingActionButton1(InspectableValueKt.isDebugInspectorInfoEnabled() ? new HelpDumpInterceptor$prettyString$1(1, 1) : InspectableValueKt.getNoInspectorInfo()));
            float f = Dimensions.getNestedScrollAxes;
            ImageKt.Image(painterPainterResource, null, ClipKt.clip(modifierThen, RoundedCornerShapeKt.IconCompatParcelizer(f)), null, crop, 0.0f, null, getpostalcode2, Painter.$stable | 24624, 104);
            TextKt.m131TextNvy7gAk(getunspecifiediunyp9k.write, PaddingKt.m74paddingqDBjuR0$default(companion2, 0.0f, f, 0.0f, 0.0f, 13), ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode2, 0, 0, 131064);
            getpostalcode = getpostalcode2;
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidFontTypefaceLoader(i, 4, getunspecifiediunyp9k, modifier);
            int i16 = write + 9;
            RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
            int i17 = i16 % 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x010f  */
    /* JADX WARN: Code duplicated, block: B:6:0x0022  */
    public static final void CommunityGuidelines(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, String str2, String str3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-541426538);
        if ((i & 6) == 0) {
            if (!getpostalcode2.read(str)) {
                i3 = 2;
            } else {
                int i5 = write + 27;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    i3 = 2;
                } else {
                    i3 = 4;
                }
            }
            i2 = i3 | i;
            int i6 = RemoteActionCompatParcelizer + 31;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i8 = RemoteActionCompatParcelizer + 111;
            write = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i2 |= getpostalcode2.read(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.read(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= !(getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true) ? 2048 : Fields.RotationZ;
        }
        int i10 = i2 | 24576;
        if (getpostalcode2.write(i10 & 1, (i10 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, str2, 0, false, 6);
            int length = str2.length();
            getpostalcode2.serializer(-619850867);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str);
            if (iWrite >= 0) {
                getpostalcode2.serializer(-1439587804);
                TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getAccessibilityClassName(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), null, null, null, 14, null);
                boolean z = (i10 & 7168) == 2048;
                Object objComponentActivity = getpostalcode2.ComponentActivity();
                if (!z) {
                    int i11 = RemoteActionCompatParcelizer + 27;
                    write = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = new getInsetsForType(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode2.write(objComponentActivity);
                        int i13 = RemoteActionCompatParcelizer + 1;
                        write = i13 % Fields.SpotShadowColor;
                        int i14 = i13 % 2;
                    }
                } else {
                    objComponentActivity = new getInsetsForType(1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode2.write(objComponentActivity);
                    int i15 = RemoteActionCompatParcelizer + 1;
                    write = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                }
                builder.addLink(new LinkAnnotation.Clickable(str3, textLinkStyles, (LinkInteractionListener) objComponentActivity), iWrite, length + iWrite);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-1439121719);
                getpostalcode2.IconCompatParcelizer(false);
            }
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getpostalcode2.IconCompatParcelizer(false);
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long supportBackgroundTintMode = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
            companion.getClass();
            getpostalcode = getpostalcode2;
            TextKt.m132TextZ58ophY(annotatedString, companion, supportBackgroundTintMode, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, textStyleIconCompatParcelizer, getpostalcode, 0, 0, 262136);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new stopIgnoring(i, str, str2, str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifier2, 2);
        }
    }

    public static final void TermsAndConditions(KeyboardType keyboardType, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 75;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        List list = keyboardType.read;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-160202374);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i7 = RemoteActionCompatParcelizer + 63;
            write = i7 % Fields.SpotShadowColor;
            i2 = ((i7 % 2 == 0 ? (i & 8) != 0 : (i & 21) != 0) ? getpostalcode.IconCompatParcelizer(keyboardType) : getpostalcode.read(keyboardType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i8 = RemoteActionCompatParcelizer + 49;
                write = i8 % Fields.SpotShadowColor;
                i3 = i8 % 2 != 0 ? 72 : 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? Fields.CameraDistance : Fields.RotationZ;
        }
        int i9 = i2 | 24576;
        if (getpostalcode.write(i9 & 1, (i9 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierIconCompatParcelizer = PagerWrapperFlingBehavior.IconCompatParcelizer(companion, PagerWrapperFlingBehavior.read(0, getpostalcode, 1), false, 14);
            float f = Dimensions.setActionBarVisibilityCallback;
            Modifier modifier3 = PaddingKt.read(modifierIconCompatParcelizer, f, f, f, Dimensions.setHideOnContentScrollEnabled);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifier3);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            int i10 = write + 41;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Object obj = null;
            TextKt.m131TextNvy7gAk(keyboardType.MediaSessionCompatQueueItem, PaddingKt.m74paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dimensions.getActionBarHideOffset, 7), ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0, 0, 131064);
            CommunityGuidelines(i9 & 7168, getpostalcode, null, keyboardType.write, keyboardType.MediaMetadataCompat, keyboardType.RatingCompat, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
            getpostalcode.serializer(-1836405054);
            Iterator it = keyboardType.serializer.iterator();
            while (it.hasNext()) {
                GuidelinePoint(0, getpostalcode, null, (String) it.next());
            }
            getpostalcode.IconCompatParcelizer(false);
            if (list.isEmpty()) {
                getpostalcode.serializer(-1093476462);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                int i12 = RemoteActionCompatParcelizer + 3;
                write = i12 % Fields.SpotShadowColor;
                int i13 = i12 % 2;
                getpostalcode.serializer(-1093869511);
                Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(Modifier.Companion, 1.0f), 0.0f, Dimensions.setHideOnContentScrollEnabled, 0.0f, 0.0f, 13);
                PlaybackStateCompatCustomAction playbackStateCompatCustomAction = Arrangement.MediaBrowserCompatMediaItem;
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer(Dimensions.setMenu), Alignment.Companion.getTop(), getpostalcode, 0);
                int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierM74paddingqDBjuR0$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    int i14 = write + 41;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    if (i14 % 2 == 0) {
                        getpostalcode.serializer(constructor2);
                        obj.hashCode();
                        throw null;
                    }
                    getpostalcode.serializer(constructor2);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
                getpostalcode.serializer(842274831);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ExamplePhoto((getUnspecifiedIUNYP9k) it2.next(), d$$ExternalSyntheticOutline0.m(1.0f, true, Modifier.Companion), getpostalcode, 0);
                }
                af$$ExternalSyntheticOutline0.m(getpostalcode, false, true, false);
            }
            String str = keyboardType.RemoteActionCompatParcelizer;
            Modifier.Companion companion4 = Modifier.Companion;
            companion4.getClass();
            PrimaryKt.write(str, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(SizeKt.write(companion4, 1.0f), 0.0f, Dimensions.setHideOnContentScrollEnabled, 0.0f, Dimensions.setActionBarVisibilityCallback, 5), false, false, null, null, null, null, null, getpostalcode, i9 & 112, 0, 2040);
            TertiaryKt.IconCompatParcelizer(keyboardType.IconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, SizeKt.write(companion4, 1.0f), false, 0, null, null, null, getpostalcode, ((i9 >> 3) & 112) | 384, 248);
            getpostalcode.IconCompatParcelizer(true);
            int i15 = RemoteActionCompatParcelizer + 115;
            write = i15 % Fields.SpotShadowColor;
            int i16 = i15 % 2;
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        int i17 = RemoteActionCompatParcelizer + 75;
        write = i17 % Fields.SpotShadowColor;
        int i18 = i17 % 2;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) keyboardType, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier2, i, 13);
        }
    }
}
