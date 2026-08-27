package com.roadrunner.freelancing.presentation.outsideactivearea;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
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
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.freelancing.api.presentation.outsideactivearea.OutsideActiveAreaUiModel;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import io.sentry.SentryUUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.AndroidPathIterator_androidKtWhenMappings;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.ShortNewsContentCardView;
import o.TextFieldDefaults;
import o.areNotificationsEnabled;
import o.buildMapping;
import o.createFromParcel;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInsetsForType;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.internalPathIteratorPeek;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.restoreFromCompatExtras;
import o.setBuilder;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OutsideActiveAreaKt {
    private static int read = 0;
    private static int serializer = 1;

    public static final void OutsideActiveArea(OutsideActiveAreaUiModel outsideActiveAreaUiModel, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        int i3 = 2 % 2;
        outsideActiveAreaUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-1972912486);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.read(outsideActiveAreaUiModel) ? 4 : 2) | i;
        } else {
            int i4 = serializer + 33;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            setBuilder setbuilder = (setBuilder) ExtrasKt.write(((OutsideActiveAreaUiModelImpl) outsideActiveAreaUiModel).MediaDescriptionCompat, getpostalcode, 0).getValue();
            if (setbuilder instanceof restoreFromCompatExtras) {
                getpostalcode.serializer(-1888315264);
                restoreFromCompatExtras restorefromcompatextras = (restoreFromCompatExtras) setbuilder;
                int i6 = i2 & 14;
                boolean z2 = i6 == 4;
                Object objComponentActivity = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                if (z2 || objComponentActivity == androidContentCaptureManager) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, outsideActiveAreaUiModel, OutsideActiveAreaUiModel.class, "onComponentDisplayed", "onComponentDisplayed()V", 0, 22);
                    getpostalcode.write(nestScreenKt$NestScreen$1$1);
                    objComponentActivity = nestScreenKt$NestScreen$1$1;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                if (i6 == 4) {
                    int i7 = read + 17;
                    serializer = i7 % Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    z = true;
                } else {
                    z = false;
                }
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (z || objComponentActivity2 == androidContentCaptureManager) {
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, outsideActiveAreaUiModel, OutsideActiveAreaUiModel.class, "onScheduleTabClicked", "onScheduleTabClicked()V", 0, 23);
                    getpostalcode.write(nestScreenKt$NestScreen$1$2);
                    objComponentActivity2 = nestScreenKt$NestScreen$1$2;
                }
                OutsideActiveAreaContent(restorefromcompatextras, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2), getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{setbuilder, areNotificationsEnabled.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    getpostalcode.serializer(-1888307426);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1888319107, false);
                }
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new AndroidPathIterator_androidKtWhenMappings(outsideActiveAreaUiModel, i, 22);
        }
    }

    public static final void OutsideActiveAreaContent(restoreFromCompatExtras restorefromcompatextras, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3;
        int i4 = 2 % 2;
        String str = restorefromcompatextras.read;
        String str2 = restorefromcompatextras.serializer;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-393133382);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(restorefromcompatextras) : getpostalcode2.IconCompatParcelizer(restorefromcompatextras) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 32 : 16;
            int i5 = serializer + 109;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
        }
        if ((i & 384) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                int i7 = serializer + 17;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                i3 = Fields.RotationX;
            } else {
                i3 = Fields.SpotShadowColor;
            }
            i2 |= i3;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = !((i2 & 112) != 32);
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            ShortNewsContentCardView shortNewsContentCardView = null;
            if (z2 || objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, shortNewsContentCardView, 5);
                getpostalcode2.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierWrite = SizeKt.write(companion, 1.0f);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            Modifier modifierM20backgroundbw27NRU = BackgroundKt.m20backgroundbw27NRU(modifierWrite, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), RectangleShapeKt.getRectangleShape());
            float f = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierM20backgroundbw27NRU, f, f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion2 = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i9 = read + 39;
                serializer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion2.getCenterVertically(), getpostalcode2, 48);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_outside_area, getpostalcode2, 0), (String) null, SizeKt.m83size3ABfNKs(companion, Dimensions.getContentHeight), ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode2, Painter.$stable | 48, 0);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m86width3ABfNKs(companion, f)});
            TextKt.m131TextNvy7gAk(restorefromcompatextras.RemoteActionCompatParcelizer, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, (TextStyle) performLayout.read(-961708487, pcn.serializer(), new Object[0], 961708487, pcn.serializer(), pcn.serializer(), pcn.serializer()), getpostalcode2, 0, 0, 131066);
            getpostalcode2.IconCompatParcelizer(true);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m75height3ABfNKs(companion, Dimensions.setStackedBackground)});
            SpanStyle spanStyle = new SpanStyle(((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).onKeyDown(), 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65530, (DefaultConstructorMarker) null);
            boolean z3 = getpostalcode2.read(str);
            boolean z4 = getpostalcode2.read(str2);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if ((z3 || z4) || objComponentActivity2 == androidContentCaptureManager) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iWrite = hideCurrentlyDisplayingInAppMessage.write((CharSequence) str, str2, 0, false, 6);
                if (iWrite != -1) {
                    builder.append(str.substring(0, iWrite));
                    z = true;
                    int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("SCHEDULE_TAB", new TextLinkStyles(spanStyle, null, null, null, 14, null), new getInsetsForType(0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1)));
                    try {
                        builder.append(str2);
                        builder.pop(iPushLink);
                        builder.append(str.substring(str2.length() + iWrite));
                    } catch (Throwable th) {
                        builder.pop(iPushLink);
                        throw th;
                    }
                } else {
                    z = true;
                    builder.append(str);
                }
                objComponentActivity2 = builder.toAnnotatedString();
                getpostalcode2.write(objComponentActivity2);
            } else {
                z = true;
            }
            getpostalcode = getpostalcode2;
            TextKt.m132TextZ58ophY((AnnotatedString) objComponentActivity2, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 262138);
            getpostalcode.IconCompatParcelizer(z);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new internalPathIteratorPeek(i, 7, restorefromcompatextras, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
        }
    }
}
