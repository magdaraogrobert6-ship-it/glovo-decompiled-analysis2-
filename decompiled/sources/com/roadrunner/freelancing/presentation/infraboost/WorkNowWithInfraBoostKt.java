package com.roadrunner.freelancing.presentation.infraboost;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.domain.util.RetryWithDelay$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.api.infraboost.WorkNowWithInfraBoostUiModel;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.home.nest.NestFragment$onCreateView$1$1$1$1;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
import com.roadrunner.home.nest.config.GetNestScope$invoke$3;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.startworking.oneclick.navigation.StartWorkingNavigationUiModelImpl;
import io.sentry.SentryUUID;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DefaultLazyKey;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.FlingCancellationException;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NotificationCompatMessagingStyle;
import o.NotificationCompatProgressStyle;
import o.NotificationCompatStyle;
import o.TextFieldDefaults;
import o.UiMediaScopeImpl;
import o.a7ExternalSyntheticLambda3;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.copyWindowDataInto;
import o.createFromParcel;
import o.getActionList;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getBoundingRects;
import o.getCenterHorizontallyannotations;
import o.getCenterVerticallyannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInsetsIgnoringVisibility;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPointerPrecisionfpxItnM;
import o.getPostalCode;
import o.getQueryContext;
import o.getStableInsets;
import o.getWindowInsetsAnimationCompat;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instantiateActivity;
import o.isAdapterPositionOnScreen;
import o.logPushStoryPageClickedlambda11;
import o.performLayout;
import o.performMeasureDjhGOtQ;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.registerInAppMessageManagerlambda0;
import o.setCurrentSemanticsNodesui;
import o.supportingTextPaddinga9UjIt4material3default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkNowWithInfraBoostKt {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;

    public static final void NextAvailabilityText(String str, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        int i3 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-1154762878);
        if ((i & 6) == 0) {
            i2 = (getpostalcode2.read(str) ? 4 : 2) | i;
            int i4 = write + 91;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        } else {
            i2 = i;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 3) != 2)) {
            String strStringResource = StringResources_androidKt.stringResource(R.string.rid_goandstart_next_possible_availability_formatted, getpostalcode2, 0);
            boolean z2 = getpostalcode2.read(strStringResource);
            if ((i2 & 14) == 4) {
                int i6 = write + 39;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if (!(!(z | z2)) || objComponentActivity == getCreditCardExpirationMonth.write) {
                List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(strStringResource, new String[]{"%1$s"}, 2);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append((String) listSerializer.get(0));
                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(str);
                    builder.pop(iPushStyle);
                    if (listSerializer.size() > 1) {
                        builder.append((String) listSerializer.get(1));
                    }
                    objComponentActivity = builder.toAnnotatedString();
                    getpostalcode2.write(objComponentActivity);
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            }
            getpostalcode = getpostalcode2;
            TextKt.m132TextZ58ophY((AnnotatedString) objComponentActivity, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 262138);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i8 = write + 117;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new a7ExternalSyntheticLambda3(str, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038 A[PHI: r3
  0x0038: PHI (r3v9 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r3
  0x002c: PHI (r3v6 o.getPostalCode) = (r3v5 o.getPostalCode), (r3v11 o.getPostalCode) binds: [B:8:0x002a, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static final void InfraBoostDescriptionRow(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        getPostalCode getpostalcode;
        int i2;
        int i3;
        boolean z;
        Modifier modifier2;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 51;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-882304473);
            if ((i & 107) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        } else {
            getpostalcode = (getPostalCode) getbirthdatefull;
            getpostalcode.MediaSessionCompatQueueItem(-882304473);
            if ((i & 6) == 0) {
                if (getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
                i3 = i | i2;
            } else {
                i3 = i;
            }
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode.read(str) ? 32 : 16;
        }
        int i6 = i3 | 384;
        if ((i6 & 147) != 146) {
            int i7 = RemoteActionCompatParcelizer + 97;
            int i8 = i7 % Fields.SpotShadowColor;
            write = i8;
            int i9 = i7 % 2;
            int i10 = i8 + 51;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i6 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, Alignment.Companion.getCenterVertically(), getpostalcode, 48);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getpostalcode.read != null) {
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(str + " ");
                getCenterVerticallyannotations.IconCompatParcelizer(builder, "infoIcon", "�");
                AnnotatedString annotatedString = builder.toAnnotatedString();
                getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1.5d), TextUnitKt.getEm(1.5d), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), ExtrasKt.write(1406781740, new DefaultLazyKey(15, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode));
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion, Dimensions.setSplitBackground)});
                TextStyle textStyleRemoteActionCompatParcelizer = performLayout.RemoteActionCompatParcelizer();
                long supportBackgroundTintMode = ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
                Map mapSingletonMap = Collections.singletonMap("infoIcon", getcenterhorizontallyannotations);
                mapSingletonMap.getClass();
                TextKt.m132TextZ58ophY(annotatedString, null, supportBackgroundTintMode, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapSingletonMap, null, textStyleRemoteActionCompatParcelizer, getpostalcode, 0, 0, 196602);
                getpostalcode.IconCompatParcelizer(true);
                modifier2 = companion;
            } else {
                SentryUUID.write();
                throw null;
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str, modifier2, i, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:102:0x021d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0235  */
    /* JADX WARN: Code duplicated, block: B:106:0x0238  */
    /* JADX WARN: Code duplicated, block: B:109:0x023f  */
    /* JADX WARN: Code duplicated, block: B:112:0x024e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0252  */
    /* JADX WARN: Code duplicated, block: B:118:0x0286  */
    /* JADX WARN: Code duplicated, block: B:119:0x0289  */
    /* JADX WARN: Code duplicated, block: B:122:0x029a  */
    /* JADX WARN: Code duplicated, block: B:125:0x029f  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:134:0x031b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0143  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c3  */
    public static final void WorkNowWithInfraBoost(getWindowInsetsAnimationCompat getwindowinsetsanimationcompat, getStableInsets getstableinsets, logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, WorkNowWithInfraBoostUiModel workNowWithInfraBoostUiModel, getActionList getactionlist, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        Modifier modifier2;
        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
        boolean z2;
        Object objComponentActivity;
        int i3;
        NotificationCompatMessagingStyle notificationCompatMessagingStyle;
        NotificationCompatStyle notificationCompatStyle;
        boolean z3;
        boolean z4;
        Object objComponentActivity2;
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0;
        boolean z5;
        AndroidContentCaptureManager androidContentCaptureManager;
        boolean z6;
        Object objComponentActivity3;
        AndroidContentCaptureManager androidContentCaptureManager2;
        AndroidContentCaptureManager androidContentCaptureManager3;
        getBoundingRects getboundingrects;
        boolean zIconCompatParcelizer;
        Object objComponentActivity4;
        boolean z7;
        Object objComponentActivity5;
        AndroidContentCaptureManager androidContentCaptureManager4;
        isAdapterPositionOnScreen isadapterpositiononscreen;
        int i4 = 2 % 2;
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        workNowWithInfraBoostUiModel.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1504724197);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(getwindowinsetsanimationcompat) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(getstableinsets) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(logpushstorypageclickedlambda11) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            int i5 = write + 11;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
                throw null;
            }
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            int i6 = write + 99;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i2 |= getpostalcode.read(workNowWithInfraBoostUiModel) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(getactionlist) ? Fields.RenderEffect : 65536;
        }
        int i8 = i2 | 1572864;
        if ((599187 & i8) != 599186) {
            int i9 = RemoteActionCompatParcelizer + 73;
            write = i9 % Fields.SpotShadowColor;
            int i10 = i9 % 2;
            z = true;
        } else {
            z = false;
        }
        if (!(!getpostalcode.write(i8 & 1, z))) {
            Modifier.Companion companion = Modifier.Companion;
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager5 = getCreditCardExpirationMonth.write;
            if (objComponentActivity6 == androidContentCaptureManager5) {
                objComponentActivity6 = copyWindowDataInto.IconCompatParcelizer;
                getpostalcode.write(objComponentActivity6);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager5) {
                int i11 = write + 71;
                RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                objComponentActivity7 = logpushstorypageclickedlambda11.read();
                getpostalcode.write(objComponentActivity7);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity7;
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if (objComponentActivity8 == androidContentCaptureManager5) {
                int i13 = RemoteActionCompatParcelizer + 45;
                write = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    objComponentActivity8 = getInsetsIgnoringVisibility.serializer;
                    getpostalcode.write(objComponentActivity8);
                    int i14 = 6 / 0;
                } else {
                    objComponentActivity8 = getInsetsIgnoringVisibility.serializer;
                    getpostalcode.write(objComponentActivity8);
                }
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity8;
            WorkNowWithInfraBoostUiModelImpl workNowWithInfraBoostUiModelImpl = (WorkNowWithInfraBoostUiModelImpl) workNowWithInfraBoostUiModel;
            isAdapterPositionOnScreen isadapterpositiononscreen2 = workNowWithInfraBoostUiModelImpl.serializer;
            getQueryContext getquerycontext = workNowWithInfraBoostUiModelImpl.IconCompatParcelizer;
            int i15 = i8 & 57344;
            if (i15 == 16384) {
                int i16 = RemoteActionCompatParcelizer + 103;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 == 0) {
                    z2 = true;
                }
                objComponentActivity = getpostalcode.ComponentActivity();
                if (z2 || objComponentActivity == androidContentCaptureManager5) {
                    objComponentActivity = new RetryWithDelay$$ExternalSyntheticLambda0(18, workNowWithInfraBoostUiModel);
                    getpostalcode.write(objComponentActivity);
                }
                SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
                i3 = i8 >> 6;
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((StartWorkingNavigationUiModelImpl) workNowWithInfraBoostUiModelImpl.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf((i3 & 112) | 384));
                notificationCompatMessagingStyle = (NotificationCompatMessagingStyle) ExtrasKt.write(workNowWithInfraBoostUiModelImpl.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue();
                if (notificationCompatMessagingStyle instanceof NotificationCompatProgressStyle) {
                    getpostalcode.serializer(-1363986615);
                    getpostalcode.IconCompatParcelizer(false);
                    isadapterpositiononscreen = isadapterpositiononscreen2;
                    workNowWithInfraBoostUiModelImpl = workNowWithInfraBoostUiModelImpl;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
                } else {
                    if (notificationCompatMessagingStyle instanceof NotificationCompatStyle) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1363989310, false);
                    }
                    getpostalcode.serializer(-1363985255);
                    notificationCompatStyle = (NotificationCompatStyle) notificationCompatMessagingStyle;
                    if (!getactionlist.read()) {
                        z3 = true;
                    } else {
                        if (notificationCompatStyle.read == instantiateActivity.GO_AND_START) {
                            getpostalcode.serializer(666293985);
                            if (i15 == 16384) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            objComponentActivity2 = getpostalcode.ComponentActivity();
                            if (!z4 || objComponentActivity2 == androidContentCaptureManager5) {
                                workNowWithInfraBoostUiModelImpl = workNowWithInfraBoostUiModelImpl;
                                z3 = true;
                                objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onGoAndStartClicked", "onGoAndStartClicked()V", 0, 19);
                                getpostalcode.write(objComponentActivity2);
                            } else {
                                workNowWithInfraBoostUiModelImpl = workNowWithInfraBoostUiModelImpl;
                                z3 = true;
                            }
                            registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                            getpostalcode.IconCompatParcelizer(false);
                            z5 = false;
                            androidContentCaptureManager = androidContentCaptureManager5;
                        } else {
                            z3 = true;
                        }
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                        if (i15 == 16384) {
                            z6 = z3;
                        } else {
                            int i17 = write + 67;
                            RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                            int i18 = i17 % 2;
                            z6 = z5;
                        }
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (z6) {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                        } else {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                            if (objComponentActivity3 == androidContentCaptureManager2) {
                                androidContentCaptureManager3 = androidContentCaptureManager2;
                            }
                            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                            getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                            objComponentActivity4 = getpostalcode.ComponentActivity();
                            if (zIconCompatParcelizer || objComponentActivity4 == androidContentCaptureManager3) {
                                objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                                getpostalcode.write(objComponentActivity4);
                            }
                            WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                            getpostalcode.IconCompatParcelizer(false);
                        }
                        androidContentCaptureManager3 = androidContentCaptureManager2;
                        objComponentActivity3 = new NestFragment$onCreateView$1$1$1$1(3, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onComponentDisplayed", "onComponentDisplayed(Lcom/roadrunner/rider/state/provider/api/domain/model/WorkOpportunityType;Ljava/lang/String;Z)V", 0, 8);
                        getpostalcode.write(objComponentActivity3);
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                        getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                        objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        } else {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        }
                        WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    z5 = false;
                    getpostalcode.serializer(666359364);
                    if (i15 == 16384) {
                        z7 = z3;
                    } else {
                        z7 = false;
                    }
                    objComponentActivity5 = getpostalcode.ComponentActivity();
                    if (z7) {
                        androidContentCaptureManager4 = androidContentCaptureManager5;
                    } else {
                        int i19 = write + 37;
                        RemoteActionCompatParcelizer = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        androidContentCaptureManager4 = androidContentCaptureManager5;
                        if (objComponentActivity5 == androidContentCaptureManager4) {
                            androidContentCaptureManager = androidContentCaptureManager4;
                        }
                        registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity5;
                        getpostalcode.IconCompatParcelizer(z5);
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                        if (i15 == 16384) {
                            z6 = z3;
                        } else {
                            int i110 = write + 67;
                            RemoteActionCompatParcelizer = i110 % Fields.SpotShadowColor;
                            int i111 = i110 % 2;
                            z6 = z5;
                        }
                        objComponentActivity3 = getpostalcode.ComponentActivity();
                        if (z6) {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                            if (objComponentActivity3 == androidContentCaptureManager2) {
                                androidContentCaptureManager3 = androidContentCaptureManager2;
                            }
                            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                            getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                            objComponentActivity4 = getpostalcode.ComponentActivity();
                            if (zIconCompatParcelizer) {
                                objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                                getpostalcode.write(objComponentActivity4);
                            } else {
                                objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                                getpostalcode.write(objComponentActivity4);
                            }
                            WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry7, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                            getpostalcode.IconCompatParcelizer(false);
                        } else {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                        }
                        androidContentCaptureManager3 = androidContentCaptureManager2;
                        objComponentActivity3 = new NestFragment$onCreateView$1$1$1$1(3, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onComponentDisplayed", "onComponentDisplayed(Lcom/roadrunner/rider/state/provider/api/domain/model/WorkOpportunityType;Ljava/lang/String;Z)V", 0, 8);
                        getpostalcode.write(objComponentActivity3);
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                        getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                        objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        } else {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        }
                        WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry8, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    }
                    androidContentCaptureManager = androidContentCaptureManager4;
                    objComponentActivity5 = new NestScreenKt$NestScreen$1$1(0, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onWorkNowClicked", "onWorkNowClicked()V", 0, 20);
                    getpostalcode.write(objComponentActivity5);
                    registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity5;
                    getpostalcode.IconCompatParcelizer(z5);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                    if (i15 == 16384) {
                        z6 = z3;
                    } else {
                        int i112 = write + 67;
                        RemoteActionCompatParcelizer = i112 % Fields.SpotShadowColor;
                        int i113 = i112 % 2;
                        z6 = z5;
                    }
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (z6) {
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        if (objComponentActivity3 == androidContentCaptureManager2) {
                            androidContentCaptureManager3 = androidContentCaptureManager2;
                        }
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                        getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                        objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        } else {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        }
                        WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        androidContentCaptureManager2 = androidContentCaptureManager;
                    }
                    androidContentCaptureManager3 = androidContentCaptureManager2;
                    objComponentActivity3 = new NestFragment$onCreateView$1$1$1$1(3, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onComponentDisplayed", "onComponentDisplayed(Lcom/roadrunner/rider/state/provider/api/domain/model/WorkOpportunityType;Ljava/lang/String;Z)V", 0, 8);
                    getpostalcode.write(objComponentActivity3);
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    } else {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    }
                    WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry10, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                }
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.invoke((GoAndStartInformationUiModelImpl) workNowWithInfraBoostUiModelImpl.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
                modifier2 = companion;
            } else {
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3;
            }
            z2 = false;
            objComponentActivity = getpostalcode.ComponentActivity();
            if (z2) {
                objComponentActivity = new RetryWithDelay$$ExternalSyntheticLambda0(18, workNowWithInfraBoostUiModel);
                getpostalcode.write(objComponentActivity);
            } else {
                objComponentActivity = new RetryWithDelay$$ExternalSyntheticLambda0(18, workNowWithInfraBoostUiModel);
                getpostalcode.write(objComponentActivity);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 8);
            i3 = i8 >> 6;
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((StartWorkingNavigationUiModelImpl) workNowWithInfraBoostUiModelImpl.MediaDescriptionCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode, Integer.valueOf((i3 & 112) | 384));
            notificationCompatMessagingStyle = (NotificationCompatMessagingStyle) ExtrasKt.write(workNowWithInfraBoostUiModelImpl.MediaSessionCompatResultReceiverWrapper, getpostalcode, 0).getValue();
            if (notificationCompatMessagingStyle instanceof NotificationCompatProgressStyle) {
                getpostalcode.serializer(-1363986615);
                getpostalcode.IconCompatParcelizer(false);
                isadapterpositiononscreen = isadapterpositiononscreen2;
                workNowWithInfraBoostUiModelImpl = workNowWithInfraBoostUiModelImpl;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
            } else {
                if (notificationCompatMessagingStyle instanceof NotificationCompatStyle) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1363989310, false);
                }
                getpostalcode.serializer(-1363985255);
                notificationCompatStyle = (NotificationCompatStyle) notificationCompatMessagingStyle;
                if (!getactionlist.read()) {
                    z3 = true;
                } else {
                    if (notificationCompatStyle.read == instantiateActivity.GO_AND_START) {
                        getpostalcode.serializer(666293985);
                        if (i15 == 16384) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        objComponentActivity2 = getpostalcode.ComponentActivity();
                        if (z4) {
                            workNowWithInfraBoostUiModelImpl = workNowWithInfraBoostUiModelImpl;
                            z3 = true;
                            objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onGoAndStartClicked", "onGoAndStartClicked()V", 0, 19);
                            getpostalcode.write(objComponentActivity2);
                        } else {
                            workNowWithInfraBoostUiModelImpl = workNowWithInfraBoostUiModelImpl;
                            z3 = true;
                            objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onGoAndStartClicked", "onGoAndStartClicked()V", 0, 19);
                            getpostalcode.write(objComponentActivity2);
                        }
                        registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                        getpostalcode.IconCompatParcelizer(false);
                        z5 = false;
                        androidContentCaptureManager = androidContentCaptureManager5;
                    } else {
                        z3 = true;
                    }
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                    if (i15 == 16384) {
                        z6 = z3;
                    } else {
                        int i114 = write + 67;
                        RemoteActionCompatParcelizer = i114 % Fields.SpotShadowColor;
                        int i115 = i114 % 2;
                        z6 = z5;
                    }
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (z6) {
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        if (objComponentActivity3 == androidContentCaptureManager2) {
                            androidContentCaptureManager3 = androidContentCaptureManager2;
                        }
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                        getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                        objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        } else {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        }
                        WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry11, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        androidContentCaptureManager2 = androidContentCaptureManager;
                    }
                    androidContentCaptureManager3 = androidContentCaptureManager2;
                    objComponentActivity3 = new NestFragment$onCreateView$1$1$1$1(3, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onComponentDisplayed", "onComponentDisplayed(Lcom/roadrunner/rider/state/provider/api/domain/model/WorkOpportunityType;Ljava/lang/String;Z)V", 0, 8);
                    getpostalcode.write(objComponentActivity3);
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    } else {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    }
                    WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry12, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                }
                z5 = false;
                getpostalcode.serializer(666359364);
                if (i15 == 16384) {
                    z7 = z3;
                } else {
                    z7 = false;
                }
                objComponentActivity5 = getpostalcode.ComponentActivity();
                if (z7) {
                    int i116 = write + 37;
                    RemoteActionCompatParcelizer = i116 % Fields.SpotShadowColor;
                    int i21 = i116 % 2;
                    androidContentCaptureManager4 = androidContentCaptureManager5;
                    if (objComponentActivity5 == androidContentCaptureManager4) {
                        androidContentCaptureManager = androidContentCaptureManager4;
                    }
                    registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity5;
                    getpostalcode.IconCompatParcelizer(z5);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                    if (i15 == 16384) {
                        z6 = z3;
                    } else {
                        int i117 = write + 67;
                        RemoteActionCompatParcelizer = i117 % Fields.SpotShadowColor;
                        int i118 = i117 % 2;
                        z6 = z5;
                    }
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (z6) {
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        if (objComponentActivity3 == androidContentCaptureManager2) {
                            androidContentCaptureManager3 = androidContentCaptureManager2;
                        }
                        r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                        getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                        zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                        objComponentActivity4 = getpostalcode.ComponentActivity();
                        if (zIconCompatParcelizer) {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        } else {
                            objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                            getpostalcode.write(objComponentActivity4);
                        }
                        WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry13, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                        getpostalcode.IconCompatParcelizer(false);
                    } else {
                        androidContentCaptureManager2 = androidContentCaptureManager;
                    }
                    androidContentCaptureManager3 = androidContentCaptureManager2;
                    objComponentActivity3 = new NestFragment$onCreateView$1$1$1$1(3, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onComponentDisplayed", "onComponentDisplayed(Lcom/roadrunner/rider/state/provider/api/domain/model/WorkOpportunityType;Ljava/lang/String;Z)V", 0, 8);
                    getpostalcode.write(objComponentActivity3);
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry14 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    } else {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    }
                    WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry14, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    androidContentCaptureManager4 = androidContentCaptureManager5;
                }
                androidContentCaptureManager = androidContentCaptureManager4;
                objComponentActivity5 = new NestScreenKt$NestScreen$1$1(0, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onWorkNowClicked", "onWorkNowClicked()V", 0, 20);
                getpostalcode.write(objComponentActivity5);
                registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity5;
                getpostalcode.IconCompatParcelizer(z5);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                if (i15 == 16384) {
                    z6 = z3;
                } else {
                    int i119 = write + 67;
                    RemoteActionCompatParcelizer = i119 % Fields.SpotShadowColor;
                    int i1110 = i119 % 2;
                    z6 = z5;
                }
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z6) {
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    if (objComponentActivity3 == androidContentCaptureManager2) {
                        androidContentCaptureManager3 = androidContentCaptureManager2;
                    }
                    r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry15 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (zIconCompatParcelizer) {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    } else {
                        objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                        getpostalcode.write(objComponentActivity4);
                    }
                    WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry15, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    androidContentCaptureManager2 = androidContentCaptureManager;
                }
                androidContentCaptureManager3 = androidContentCaptureManager2;
                objComponentActivity3 = new NestFragment$onCreateView$1$1$1$1(3, workNowWithInfraBoostUiModel, WorkNowWithInfraBoostUiModel.class, "onComponentDisplayed", "onComponentDisplayed(Lcom/roadrunner/rider/state/provider/api/domain/model/WorkOpportunityType;Ljava/lang/String;Z)V", 0, 8);
                getpostalcode.write(objComponentActivity3);
                r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry16 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                getboundingrects = (getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(getboundingrects);
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer) {
                    objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                    getpostalcode.write(objComponentActivity4);
                } else {
                    objComponentActivity4 = new NestScreenKt$NestScreen$1$1(0, getboundingrects, getBoundingRects.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 21);
                    getpostalcode.write(objComponentActivity4);
                }
                WorkNowRowWithInfraBoost(notificationCompatStyle, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry16, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), companion, getpostalcode, i3 & 57344);
                getpostalcode.IconCompatParcelizer(false);
            }
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((getBoundingRects) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.invoke((GoAndStartInformationUiModelImpl) workNowWithInfraBoostUiModelImpl.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 48);
            modifier2 = companion;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScopeImpl(getwindowinsetsanimationcompat, getstableinsets, logpushstorypageclickedlambda11, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, workNowWithInfraBoostUiModel, getactionlist, modifier2, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v19 */
    public static final void WorkNowRowWithInfraBoost(NotificationCompatStyle notificationCompatStyle, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        boolean z;
        ?? r15;
        boolean z2;
        boolean z3;
        boolean zIconCompatParcelizer;
        int i3;
        int i4 = 2 % 2;
        int i5 = RemoteActionCompatParcelizer + 121;
        write = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(-174009867);
        getAddressCountry getaddresscountry = getpostalcode.read;
        if ((i & 6) == 0) {
            int i7 = write + 25;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0 ? (i & 8) != 0 : (i & 14) != 0) {
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(notificationCompatStyle);
                int i8 = RemoteActionCompatParcelizer + 33;
                write = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
            } else {
                zIconCompatParcelizer = getpostalcode.read(notificationCompatStyle);
            }
            if (zIconCompatParcelizer) {
                int i10 = write + 33;
                RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
                i3 = i10 % 2 == 0 ? 5 : 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ^ true ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) ? 256 : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= getpostalcode.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode.read(modifier) ? Fields.Clip : 8192;
        }
        int i11 = i2;
        if (getpostalcode.write(i11 & 1, (i11 & 9363) != 9362)) {
            int i12 = write;
            int i13 = i12 + 119;
            RemoteActionCompatParcelizer = i13 % Fields.SpotShadowColor;
            boolean z4 = i13 % 2 != 0 ? (i11 & 896) == 256 : (i11 & 14492) == 194;
            if ((i11 & 14) == 4) {
                z = true;
            } else {
                if ((i11 & 8) != 0) {
                    int i14 = i12 + 87;
                    RemoteActionCompatParcelizer = i14 % Fields.SpotShadowColor;
                    int i15 = i14 % 2;
                    if (getpostalcode.IconCompatParcelizer(notificationCompatStyle)) {
                        z = true;
                    }
                }
                z = false;
            }
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (!z && !z4) {
                int i16 = RemoteActionCompatParcelizer + 69;
                write = i16 % Fields.SpotShadowColor;
                if (i16 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new GetNestScope$invoke$3(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, notificationCompatStyle, null, 2);
                    getpostalcode.write(objComponentActivity);
                }
            } else {
                objComponentActivity = new GetNestScope$invoke$3(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, notificationCompatStyle, null, 2);
                getpostalcode.write(objComponentActivity);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity);
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            float f = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, Dimensions.getAnimatedVisibility, f);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                int i17 = RemoteActionCompatParcelizer + 41;
                write = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(constructor);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode), getpostalcode));
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode, 0);
            int iHashCode2 = Long.hashCode(getpostalcode.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode.ComponentActivity) {
                getpostalcode.serializer(constructor2);
            } else {
                getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode, modalBottomSheetYbuCTN8Serializer2, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode2), getpostalcode));
            String str = notificationCompatStyle.MediaSessionCompatQueueItem;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode, 0, 0, 131066);
            float f2 = Dimensions.setPrimaryBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion3, f2)});
            TextKt.m131TextNvy7gAk(notificationCompatStyle.RatingCompat, null, ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 0, 0, 131066);
            float f3 = Dimensions.setSplitBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion3, f3)});
            InfraBoostDescriptionRow((i11 >> 9) & 14, getpostalcode, null, notificationCompatStyle.serializer, r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m83size3ABfNKs(companion3, f3)});
            getpostalcode.IconCompatParcelizer(true);
            String str2 = notificationCompatStyle.IconCompatParcelizer;
            boolean z5 = notificationCompatStyle.write;
            Modifier modifierWrite3 = SizeKt.write(companion3, 1.0f);
            float f4 = Dimensions.setTransitioning;
            PrimaryKt.write(str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, PaddingKt.m74paddingqDBjuR0$default(modifierWrite3, 0.0f, f4, 0.0f, 0.0f, 13), z5, false, null, null, null, null, null, getpostalcode, i11 & 112, 0, 2032);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f)});
            String str3 = notificationCompatStyle.RemoteActionCompatParcelizer;
            if (str3 == null) {
                int i19 = RemoteActionCompatParcelizer + 97;
                write = i19 % Fields.SpotShadowColor;
                if (i19 % 2 != 0) {
                    getpostalcode.serializer(-552983019);
                    z3 = false;
                } else {
                    z3 = false;
                    getpostalcode.serializer(-552983019);
                }
                getpostalcode.IconCompatParcelizer(z3);
                r15 = z3;
            } else {
                getpostalcode.serializer(-552983018);
                TextKt.m131TextNvy7gAk(str3, SizeKt.write(companion3, 1.0f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 130040);
                r15 = 0;
                getpostalcode.IconCompatParcelizer(false);
            }
            String str4 = notificationCompatStyle.MediaDescriptionCompat;
            if (str4 == null) {
                getpostalcode.serializer(-552640593);
                getpostalcode.IconCompatParcelizer((boolean) r15);
                z2 = true;
            } else {
                getpostalcode.serializer(-552640592);
                Modifier modifierWrite4 = SizeKt.write(companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, companion.getCenterVertically(), getpostalcode, 54);
                int iHashCode3 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite4);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor3);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                int i20 = RemoteActionCompatParcelizer + 103;
                write = i20 % Fields.SpotShadowColor;
                int i21 = i20 % 2;
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode, Integer.valueOf(iHashCode3), getpostalcode));
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_clock, getpostalcode, r15), (String) null, SizeKt.m83size3ABfNKs(companion3, f4), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode, Painter.$stable | 48, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, f2)});
                NextAvailabilityText(str4, getpostalcode, r15);
                z2 = true;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer((boolean) r15);
            }
            getpostalcode.IconCompatParcelizer(z2);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new getPointerPrecisionfpxItnM((Object) notificationCompatStyle, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (Object) r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, (Object) r8lambdardpfsr94j4iebcwx_kpqzpm8k1, modifier, i, 27);
        }
    }
}
