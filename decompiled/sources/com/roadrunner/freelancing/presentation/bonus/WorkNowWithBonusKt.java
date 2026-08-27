package com.roadrunner.freelancing.presentation.bonus;

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
import androidx.room.RoomDatabase$createConnectionManager$2;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda3;
import coil3.ExtrasKt;
import com.incognia.internal.pcn;
import com.logistics.rider.glovo.R;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.device.manager.DeviceManager$$ExternalSyntheticLambda1;
import com.roadrunner.domain.usecase.SuspendingWorkUseCase$$ExternalSyntheticLambda0;
import com.roadrunner.freelancing.api.bonus.WorkNowWithBonusUiModel;
import com.roadrunner.freelancing.presentation.WorkNowRowKt$WorkNowRow$1$1;
import com.roadrunner.freelancing.presentation.goandstartinfo.GoAndStartInformationUiModelImpl;
import com.roadrunner.home.nest.NestScreenKt$NestScreen$1$1;
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
import o.FrameMetricsAggregator;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.NotificationCompatAction;
import o.SharedPreferencesManager;
import o.TextFieldDefaults;
import o.WindowInsetsCompatImpl;
import o.a7ExternalSyntheticLambda3;
import o.accessisMainThread;
import o.buildMapping;
import o.computeHorizontalScrollExtent;
import o.computeVerticalScrollExtent;
import o.createFromParcel;
import o.getActionList;
import o.getAddressCountry;
import o.getBirthDateFull;
import o.getCenterHorizontallyannotations;
import o.getCenterVerticallyannotations;
import o.getCreditCardExpirationMonth;
import o.getHandleruiannotations;
import o.getInsetsIgnoringVisibility;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getStableInsets;
import o.getSystemGestureInsets;
import o.getTappableElementInsets;
import o.handleUrlOverridelambda1;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instantiateActivity;
import o.instantiateProvider;
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
import o.setDisplayShape;
import o.supportingTextPaddinga9UjIt4material3default;
import o.t3;
import o.ua;
import o.xb;
import o.y0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WorkNowWithBonusKt {
    private static int read = 1;
    private static int write;

    public static final void WorkNowDescriptionRow(int i, getBirthDateFull getbirthdatefull, Modifier modifier, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        int i2;
        boolean z;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-540506543);
        if ((i & 6) == 0) {
            int i5 = read + 15;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            i2 = i | (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? 4 : 2);
        } else {
            i2 = i;
        }
        Object obj = null;
        if ((i & 48) == 0) {
            int i7 = write + 7;
            read = i7 % Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                getpostalcode2.read(str);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode2.read(str)) {
                int i8 = read + 113;
                int i9 = i8 % Fields.SpotShadowColor;
                write = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 103;
                read = i11 % Fields.SpotShadowColor;
                int i12 = i11 % 2;
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i13 = i2 | 384;
        if ((i13 & 147) != 146) {
            int i14 = write + 89;
            read = i14 % Fields.SpotShadowColor;
            int i15 = i14 % 2;
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode2.write(i13 & 1, z)) {
            Modifier.Companion companion = Modifier.Companion;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(str + " ");
            getCenterVerticallyannotations.IconCompatParcelizer(builder, "infoIcon", "�");
            AnnotatedString annotatedString = builder.toAnnotatedString();
            getCenterHorizontallyannotations getcenterhorizontallyannotations = new getCenterHorizontallyannotations(new Placeholder(TextUnitKt.getEm(1), TextUnitKt.getEm(1), PlaceholderVerticalAlign.Companion.m2975getTextCenterJ6kI3mc(), null), ExtrasKt.write(1653469192, new DefaultLazyKey(14, r8lambdardpfsr94j4iebcwx_kpqzpm8k0), getpostalcode2));
            TextStyle textStyleIconCompatParcelizer = performLayout.IconCompatParcelizer();
            long supportBackgroundTintMode = ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getSupportBackgroundTintMode();
            Map mapSingletonMap = Collections.singletonMap("infoIcon", getcenterhorizontallyannotations);
            mapSingletonMap.getClass();
            getpostalcode = getpostalcode2;
            TextKt.m132TextZ58ophY(annotatedString, companion, supportBackgroundTintMode, 0L, null, 0L, null, 0L, 0, false, 0, 0, mapSingletonMap, null, textStyleIconCompatParcelizer, getpostalcode, (i13 >> 3) & 112, 0, 196600);
            modifier2 = companion;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeHorizontalScrollExtent(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, str, modifier2, i, 14);
        }
    }

    public static final void NextAvailabilityText(String str, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        int i3;
        int i4 = 2 % 2;
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(-555762506);
        if ((i & 6) == 0) {
            if (getpostalcode2.read(str)) {
                i3 = 3;
                int i5 = read + 3;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 == 0) {
                    i3 = 4;
                }
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (getpostalcode2.write(i2 & 1, (i2 & 3) != 2)) {
            String strStringResource = StringResources_androidKt.stringResource(R.string.rid_goandstart_next_possible_availability_formatted, getpostalcode2, 0);
            boolean z = getpostalcode2.read(strStringResource);
            boolean z2 = (i2 & 14) == 4;
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            if ((z2 | z) || objComponentActivity == getCreditCardExpirationMonth.write) {
                List listSerializer = hideCurrentlyDisplayingInAppMessage.serializer(strStringResource, new String[]{"%1$s"}, 2);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append((String) listSerializer.get(0));
                int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append(str);
                    builder.pop(iPushStyle);
                    if (listSerializer.size() > 1) {
                        builder.append((String) listSerializer.get(1));
                        int i6 = write + 109;
                        read = i6 % Fields.SpotShadowColor;
                        int i7 = i6 % 2;
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
            int i8 = write + 101;
            read = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i10 = read + 95;
            write = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new a7ExternalSyntheticLambda3(str, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0271  */
    /* JADX WARN: Code duplicated, block: B:148:0x0275  */
    /* JADX WARN: Code duplicated, block: B:167:0x0316  */
    /* JADX WARN: Code duplicated, block: B:169:0x0333  */
    /* JADX WARN: Code duplicated, block: B:170:0x0340  */
    /* JADX WARN: Code duplicated, block: B:173:0x0347  */
    /* JADX WARN: Code duplicated, block: B:175:0x0353  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:179:0x035e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0362  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:190:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:200:0x0407  */
    /* JADX WARN: Code duplicated, block: B:201:0x040a  */
    /* JADX WARN: Code duplicated, block: B:205:0x0419  */
    /* JADX WARN: Code duplicated, block: B:208:0x045e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    public static final void WorkNowWithBonus(getStableInsets getstableinsets, getTappableElementInsets gettappableelementinsets, logPushStoryPageClickedlambda11 logpushstorypageclickedlambda11, xb xbVar, accessisMainThread accessismainthread, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, WorkNowWithBonusUiModel workNowWithBonusUiModel, getActionList getactionlist, Modifier modifier, getBirthDateFull getbirthdatefull, int i, int i2) {
        int i3;
        int i4;
        getPostalCode getpostalcode;
        Modifier modifier2;
        int i5;
        instantiateProvider instantiateprovider;
        NotificationCompatAction notificationCompatAction;
        boolean z;
        boolean z2;
        Object objComponentActivity;
        AndroidContentCaptureManager androidContentCaptureManager;
        AndroidContentCaptureManager androidContentCaptureManager2;
        boolean z3;
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0;
        int i6;
        setDisplayShape setdisplayshape;
        boolean zIconCompatParcelizer;
        Object objComponentActivity2;
        boolean z4;
        Object objComponentActivity3;
        boolean zIconCompatParcelizer2;
        boolean z5;
        boolean zIconCompatParcelizer3;
        Object objComponentActivity4;
        AndroidContentCaptureManager androidContentCaptureManager3;
        getPostalCode getpostalcode2;
        int i7;
        int i8;
        int i9;
        int i10 = 2 % 2;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        workNowWithBonusUiModel.getClass();
        getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull;
        getpostalcode3.MediaSessionCompatQueueItem(-915032348);
        if ((i & 6) == 0) {
            i3 = (getpostalcode3.IconCompatParcelizer(getstableinsets) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= getpostalcode3.IconCompatParcelizer(gettappableelementinsets) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            int i11 = write + 121;
            read = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            i3 |= getpostalcode3.IconCompatParcelizer(logpushstorypageclickedlambda11) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i3 |= getpostalcode3.IconCompatParcelizer(xbVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        Integer num = 48;
        if ((i & 24576) == 0) {
            int i13 = read + 107;
            write = i13 % Fields.SpotShadowColor;
            if (i13 % 2 != 0) {
                int i14 = 36 / 0;
                if (!getpostalcode3.IconCompatParcelizer(accessismainthread)) {
                    i9 = 8192;
                } else {
                    i9 = Fields.Clip;
                }
            } else if (getpostalcode3.IconCompatParcelizer(accessismainthread)) {
                i9 = Fields.Clip;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i) == 0) {
            i3 |= getpostalcode3.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i) == 0) {
            if (getpostalcode3.IconCompatParcelizer(r8lambdafjq9b8d5osr_i2bajdxqnw6rnry)) {
                int i15 = read + 43;
                write = i15 % Fields.SpotShadowColor;
                int i16 = i15 % 2;
                i8 = 1048576;
            } else {
                i8 = Fields.BlendMode;
            }
            i3 |= i8;
        }
        if ((12582912 & i) == 0) {
            i3 |= getpostalcode3.IconCompatParcelizer(r8lambdaunavo3sxub_pc9xroryotnrlvsm) ? 8388608 : 4194304;
        }
        Object obj = null;
        if ((100663296 & i) == 0) {
            int i17 = read + 65;
            write = i17 % Fields.SpotShadowColor;
            if (i17 % 2 != 0) {
                getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                obj.hashCode();
                throw null;
            }
            if (getpostalcode3.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0)) {
                int i18 = write + 73;
                read = i18 % Fields.SpotShadowColor;
                int i19 = i18 % 2;
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((805306368 & i) == 0) {
            i3 |= getpostalcode3.read(workNowWithBonusUiModel) ? 536870912 : 268435456;
        }
        int i20 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (getpostalcode3.IconCompatParcelizer(getactionlist) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i21 = i4 | 48;
        if (getpostalcode3.write(i20 & 1, ((i20 & 306783379) == 306783378 && (i21 & 19) == 18) ? false : true)) {
            modifier2 = Modifier.Companion;
            Object objComponentActivity5 = getpostalcode3.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager4 = getCreditCardExpirationMonth.write;
            if (objComponentActivity5 == androidContentCaptureManager4) {
                int i22 = write + 39;
                read = i22 % Fields.SpotShadowColor;
                int i23 = i22 % 2;
                objComponentActivity5 = getSystemGestureInsets.read;
                getpostalcode3.write(objComponentActivity5);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity5;
            Object objComponentActivity6 = getpostalcode3.ComponentActivity();
            if (objComponentActivity6 == androidContentCaptureManager4) {
                objComponentActivity6 = logpushstorypageclickedlambda11.read();
                getpostalcode3.write(objComponentActivity6);
            }
            r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds = (r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds) objComponentActivity6;
            Object objComponentActivity7 = getpostalcode3.ComponentActivity();
            if (objComponentActivity7 == androidContentCaptureManager4) {
                objComponentActivity7 = getInsetsIgnoringVisibility.serializer;
                getpostalcode3.write(objComponentActivity7);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity7;
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2;
            WorkNowWithBonusUiModelImpl workNowWithBonusUiModelImpl = (WorkNowWithBonusUiModelImpl) workNowWithBonusUiModel;
            isAdapterPositionOnScreen isadapterpositiononscreen = workNowWithBonusUiModelImpl.PlaybackStateCompat;
            isAdapterPositionOnScreen isadapterpositiononscreen2 = workNowWithBonusUiModelImpl.MediaSessionCompatQueueItem;
            getQueryContext getquerycontext = workNowWithBonusUiModelImpl.serializer;
            int i24 = i20 & 1879048192;
            boolean z6 = i24 == 536870912;
            boolean z7 = (i20 & 458752) == 131072;
            Object objComponentActivity8 = getpostalcode3.ComponentActivity();
            if ((z6 | z7) || objComponentActivity8 == androidContentCaptureManager4) {
                objComponentActivity8 = new SuspendingWorkUseCase$$ExternalSyntheticLambda0(workNowWithBonusUiModel, 16, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
                getpostalcode3.write(objComponentActivity8);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, getpostalcode3, 8);
            getQueryContext getquerycontext2 = ((GoAndStartInformationUiModelImpl) isadapterpositiononscreen2.MediaSessionCompatResultReceiverWrapper()).MediaDescriptionCompat;
            boolean z8 = (i20 & 29360128) == 8388608;
            boolean z9 = (i20 & 234881024) == 67108864;
            isAdapterPositionOnScreen isadapterpositiononscreen3 = isadapterpositiononscreen2;
            boolean z10 = (i20 & 3670016) == 1048576;
            Object objComponentActivity9 = getpostalcode3.ComponentActivity();
            if (!(z9 | z8) && !z10) {
                int i25 = write + 33;
                read = i25 % Fields.SpotShadowColor;
                i5 = 2;
                int i26 = i25 % 2;
                if (objComponentActivity9 == androidContentCaptureManager4) {
                }
                SQLite.write(getquerycontext2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, getpostalcode3, 8);
                r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((StartWorkingNavigationUiModelImpl) workNowWithBonusUiModelImpl.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode3, Integer.valueOf(((i20 >> 15) & 112) | 384));
                instantiateprovider = (instantiateProvider) ExtrasKt.write(workNowWithBonusUiModelImpl.MediaDescriptionCompat, getpostalcode3, 0).getValue();
                if (instantiateprovider instanceof FrameMetricsAggregator) {
                    getpostalcode3.serializer(1122277416);
                    getpostalcode3.IconCompatParcelizer(false);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                    getpostalcode = getpostalcode3;
                    num = 48;
                    isadapterpositiononscreen3 = isadapterpositiononscreen3;
                    isadapterpositiononscreen = isadapterpositiononscreen;
                } else {
                    if (instantiateprovider instanceof NotificationCompatAction) {
                        throw d$$ExternalSyntheticOutline0.m(getpostalcode3, 1122275401, false);
                    }
                    getpostalcode3.serializer(430924770);
                    notificationCompatAction = (NotificationCompatAction) instantiateprovider;
                    if (getactionlist.read() || notificationCompatAction.serializer != instantiateActivity.GO_AND_START) {
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                        notificationCompatAction = notificationCompatAction;
                        num = 48;
                        isadapterpositiononscreen3 = isadapterpositiononscreen3;
                        isadapterpositiononscreen = isadapterpositiononscreen;
                        z = true;
                        getpostalcode3.serializer(431128037);
                        if (i24 == 536870912) {
                            int i27 = write + 19;
                            read = i27 % Fields.SpotShadowColor;
                            int i28 = i27 % 2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objComponentActivity = getpostalcode3.ComponentActivity();
                        if (z2) {
                            androidContentCaptureManager = androidContentCaptureManager4;
                        } else {
                            i6 = write + 61;
                            read = i6 % Fields.SpotShadowColor;
                            if (i6 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            androidContentCaptureManager = androidContentCaptureManager4;
                            if (objComponentActivity != androidContentCaptureManager) {
                                androidContentCaptureManager2 = androidContentCaptureManager;
                                getpostalcode = getpostalcode3;
                            }
                            z3 = false;
                            getpostalcode.IconCompatParcelizer(false);
                            registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                        }
                        androidContentCaptureManager2 = androidContentCaptureManager;
                        getpostalcode = getpostalcode3;
                        NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$1 = new NestScreenKt$NestScreen$1$1(0, workNowWithBonusUiModel, WorkNowWithBonusUiModel.class, "onWorkNowClicked", "onWorkNowClicked()V", 0, 12);
                        getpostalcode.write(nestScreenKt$NestScreen$1$1);
                        objComponentActivity = nestScreenKt$NestScreen$1$1;
                        z3 = false;
                        getpostalcode.IconCompatParcelizer(false);
                        registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    } else {
                        int i29 = write + 93;
                        read = i29 % Fields.SpotShadowColor;
                        if (i29 % 2 == 0) {
                            getpostalcode3.serializer(431094402);
                            throw null;
                        }
                        getpostalcode3.serializer(431094402);
                        boolean z11 = i24 == 536870912;
                        Object objComponentActivity10 = getpostalcode3.ComponentActivity();
                        if (z11 || objComponentActivity10 == androidContentCaptureManager4) {
                            androidContentCaptureManager3 = androidContentCaptureManager4;
                            z = true;
                            NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$2 = new NestScreenKt$NestScreen$1$1(0, workNowWithBonusUiModel, WorkNowWithBonusUiModel.class, "onGoAndStartClicked", "onGoAndStartClicked()V", 0, 11);
                            getpostalcode2 = getpostalcode3;
                            getpostalcode2.write(nestScreenKt$NestScreen$1$2);
                            objComponentActivity10 = nestScreenKt$NestScreen$1$2;
                        } else {
                            androidContentCaptureManager3 = androidContentCaptureManager4;
                            z = true;
                            getpostalcode2 = getpostalcode3;
                        }
                        getpostalcode2.IconCompatParcelizer(false);
                        registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity10;
                        z3 = false;
                        androidContentCaptureManager2 = androidContentCaptureManager3;
                        getpostalcode = getpostalcode2;
                    }
                    setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                    zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                    objComponentActivity2 = getpostalcode.ComponentActivity();
                    AndroidContentCaptureManager androidContentCaptureManager5 = androidContentCaptureManager2;
                    if (zIconCompatParcelizer || objComponentActivity2 == androidContentCaptureManager5) {
                        objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 13);
                        getpostalcode.write(objComponentActivity2);
                    }
                    registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                    if (i24 == 536870912) {
                        z4 = z;
                    } else {
                        z4 = z3;
                    }
                    objComponentActivity3 = getpostalcode.ComponentActivity();
                    if (z4 || objComponentActivity3 == androidContentCaptureManager5) {
                        RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$2 = new RoomDatabase$createConnectionManager$2(2, workNowWithBonusUiModel, WorkNowWithBonusUiModel.class, "onCalendarButtonClicked", "onCalendarButtonClicked(Ljava/lang/String;Ljava/lang/String;)V", 0, 16);
                        getpostalcode.write(roomDatabase$createConnectionManager$2);
                        objComponentActivity3 = roomDatabase$createConnectionManager$2;
                    }
                    r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde1 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                    r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                    zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getactionlist);
                    if (i24 == 536870912) {
                        z5 = z;
                    } else {
                        z5 = false;
                    }
                    zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(instantiateprovider);
                    objComponentActivity4 = getpostalcode.ComponentActivity();
                    if (!(zIconCompatParcelizer2 | z5 | zIconCompatParcelizer3) || objComponentActivity4 == androidContentCaptureManager5) {
                        objComponentActivity4 = new n$$ExternalSyntheticLambda3(getactionlist, workNowWithBonusUiModel, notificationCompatAction, 27);
                        getpostalcode.write(objComponentActivity4);
                    }
                    WorkNowRowWithBonus(notificationCompatAction, xbVar, accessismainthread, r8lambdaa6_tctqmksh3fk6hjgcbkuvde1, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda1, modifier2, getpostalcode, ((i20 >> 6) & 1008) | ((i21 << 18) & 29360128));
                    getpostalcode.IconCompatParcelizer(false);
                }
                Integer num2 = num;
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.invoke((setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), getpostalcode, num2);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke((GoAndStartInformationUiModelImpl) isadapterpositiononscreen3.MediaSessionCompatResultReceiverWrapper(), getpostalcode, num2);
            } else {
                i5 = 2;
            }
            objComponentActivity9 = new SharedPreferencesManager(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i5);
            getpostalcode3.write(objComponentActivity9);
            SQLite.write(getquerycontext2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity9, getpostalcode3, 8);
            r8lambdafbccdpyn0hhvaib8bd2sxm5rsds.invoke((StartWorkingNavigationUiModelImpl) workNowWithBonusUiModelImpl.MediaMetadataCompat.MediaSessionCompatResultReceiverWrapper(), r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getpostalcode3, Integer.valueOf(((i20 >> 15) & 112) | 384));
            instantiateprovider = (instantiateProvider) ExtrasKt.write(workNowWithBonusUiModelImpl.MediaDescriptionCompat, getpostalcode3, 0).getValue();
            if (instantiateprovider instanceof FrameMetricsAggregator) {
                getpostalcode3.serializer(1122277416);
                getpostalcode3.IconCompatParcelizer(false);
                r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                getpostalcode = getpostalcode3;
                num = 48;
                isadapterpositiononscreen3 = isadapterpositiononscreen3;
                isadapterpositiononscreen = isadapterpositiononscreen;
            } else {
                if (instantiateprovider instanceof NotificationCompatAction) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode3, 1122275401, false);
                }
                getpostalcode3.serializer(430924770);
                notificationCompatAction = (NotificationCompatAction) instantiateprovider;
                if (getactionlist.read()) {
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                    notificationCompatAction = notificationCompatAction;
                    num = 48;
                    isadapterpositiononscreen3 = isadapterpositiononscreen3;
                    isadapterpositiononscreen = isadapterpositiononscreen;
                    z = true;
                    getpostalcode3.serializer(431128037);
                    if (i24 == 536870912) {
                        int i210 = write + 19;
                        read = i210 % Fields.SpotShadowColor;
                        int i211 = i210 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objComponentActivity = getpostalcode3.ComponentActivity();
                    if (z2) {
                        i6 = write + 61;
                        read = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        androidContentCaptureManager = androidContentCaptureManager4;
                        if (objComponentActivity != androidContentCaptureManager) {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                            getpostalcode = getpostalcode3;
                        }
                        z3 = false;
                        getpostalcode.IconCompatParcelizer(false);
                        registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    } else {
                        androidContentCaptureManager = androidContentCaptureManager4;
                    }
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    getpostalcode = getpostalcode3;
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$3 = new NestScreenKt$NestScreen$1$1(0, workNowWithBonusUiModel, WorkNowWithBonusUiModel.class, "onWorkNowClicked", "onWorkNowClicked()V", 0, 12);
                    getpostalcode.write(nestScreenKt$NestScreen$1$3);
                    objComponentActivity = nestScreenKt$NestScreen$1$3;
                    z3 = false;
                    getpostalcode.IconCompatParcelizer(false);
                    registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                } else {
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4 = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4;
                    notificationCompatAction = notificationCompatAction;
                    num = 48;
                    isadapterpositiononscreen3 = isadapterpositiononscreen3;
                    isadapterpositiononscreen = isadapterpositiononscreen;
                    z = true;
                    getpostalcode3.serializer(431128037);
                    if (i24 == 536870912) {
                        int i212 = write + 19;
                        read = i212 % Fields.SpotShadowColor;
                        int i213 = i212 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objComponentActivity = getpostalcode3.ComponentActivity();
                    if (z2) {
                        i6 = write + 61;
                        read = i6 % Fields.SpotShadowColor;
                        if (i6 % 2 == 0) {
                            obj.hashCode();
                            throw null;
                        }
                        androidContentCaptureManager = androidContentCaptureManager4;
                        if (objComponentActivity != androidContentCaptureManager) {
                            androidContentCaptureManager2 = androidContentCaptureManager;
                            getpostalcode = getpostalcode3;
                        }
                        z3 = false;
                        getpostalcode.IconCompatParcelizer(false);
                        registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                    } else {
                        androidContentCaptureManager = androidContentCaptureManager4;
                    }
                    androidContentCaptureManager2 = androidContentCaptureManager;
                    getpostalcode = getpostalcode3;
                    NestScreenKt$NestScreen$1$1 nestScreenKt$NestScreen$1$4 = new NestScreenKt$NestScreen$1$1(0, workNowWithBonusUiModel, WorkNowWithBonusUiModel.class, "onWorkNowClicked", "onWorkNowClicked()V", 0, 12);
                    getpostalcode.write(nestScreenKt$NestScreen$1$4);
                    objComponentActivity = nestScreenKt$NestScreen$1$4;
                    z3 = false;
                    getpostalcode.IconCompatParcelizer(false);
                    registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
                }
                setdisplayshape = (setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper();
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(setdisplayshape);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                AndroidContentCaptureManager androidContentCaptureManager6 = androidContentCaptureManager2;
                if (zIconCompatParcelizer) {
                    objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 13);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    objComponentActivity2 = new NestScreenKt$NestScreen$1$1(0, setdisplayshape, setDisplayShape.class, "onInfoButtonClicked", "onInfoButtonClicked()V", 0, 13);
                    getpostalcode.write(objComponentActivity2);
                }
                registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity2;
                if (i24 == 536870912) {
                    z4 = z;
                } else {
                    z4 = z3;
                }
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (z4) {
                    RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$3 = new RoomDatabase$createConnectionManager$2(2, workNowWithBonusUiModel, WorkNowWithBonusUiModel.class, "onCalendarButtonClicked", "onCalendarButtonClicked(Ljava/lang/String;Ljava/lang/String;)V", 0, 16);
                    getpostalcode.write(roomDatabase$createConnectionManager$3);
                    objComponentActivity3 = roomDatabase$createConnectionManager$3;
                } else {
                    RoomDatabase$createConnectionManager$2 roomDatabase$createConnectionManager$4 = new RoomDatabase$createConnectionManager$2(2, workNowWithBonusUiModel, WorkNowWithBonusUiModel.class, "onCalendarButtonClicked", "onCalendarButtonClicked(Ljava/lang/String;Ljava/lang/String;)V", 0, 16);
                    getpostalcode.write(roomDatabase$createConnectionManager$4);
                    objComponentActivity3 = roomDatabase$createConnectionManager$4;
                }
                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde2 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0;
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(getactionlist);
                if (i24 == 536870912) {
                    z5 = z;
                } else {
                    z5 = false;
                }
                zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(instantiateprovider);
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer2 | z5) && !zIconCompatParcelizer3) {
                    objComponentActivity4 = new n$$ExternalSyntheticLambda3(getactionlist, workNowWithBonusUiModel, notificationCompatAction, 27);
                    getpostalcode.write(objComponentActivity4);
                } else {
                    objComponentActivity4 = new n$$ExternalSyntheticLambda3(getactionlist, workNowWithBonusUiModel, notificationCompatAction, 27);
                    getpostalcode.write(objComponentActivity4);
                }
                WorkNowRowWithBonus(notificationCompatAction, xbVar, accessismainthread, r8lambdaa6_tctqmksh3fk6hjgcbkuvde2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda2, modifier2, getpostalcode, ((i20 >> 6) & 1008) | ((i21 << 18) & 29360128));
                getpostalcode.IconCompatParcelizer(false);
            }
            Integer num3 = num;
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry4.invoke((setDisplayShape) isadapterpositiononscreen.MediaSessionCompatResultReceiverWrapper(), getpostalcode, num3);
            r8lambdafjq9b8d5osr_i2bajdxqnw6rnry3.invoke((GoAndStartInformationUiModelImpl) isadapterpositiononscreen3.MediaSessionCompatResultReceiverWrapper(), getpostalcode, num3);
        } else {
            getpostalcode = getpostalcode3;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier2 = modifier;
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new WindowInsetsCompatImpl(getstableinsets, gettappableelementinsets, logpushstorypageclickedlambda11, xbVar, accessismainthread, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, workNowWithBonusUiModel, getactionlist, modifier2, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x046b  */
    /* JADX WARN: Code duplicated, block: B:149:0x046d  */
    /* JADX WARN: Code duplicated, block: B:158:0x048a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00da  */
    public static final void WorkNowRowWithBonus(NotificationCompatAction notificationCompatAction, xb xbVar, accessisMainThread accessismainthread, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2, Modifier modifier, getBirthDateFull getbirthdatefull, int i) {
        int i2;
        getPostalCode getpostalcode;
        boolean z;
        float f;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4;
        int i5;
        int i6;
        int i7 = 2 % 2;
        boolean z8 = notificationCompatAction.MediaSessionCompatQueueItem;
        t3 t3Var = notificationCompatAction.write;
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
        r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        getpostalcode2.MediaSessionCompatQueueItem(291594992);
        getAddressCountry getaddresscountry = getpostalcode2.read;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? getpostalcode2.read(notificationCompatAction) : getpostalcode2.IconCompatParcelizer(notificationCompatAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(xbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(accessismainthread) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            if (getpostalcode2.IconCompatParcelizer(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0)) {
                int i8 = write + 63;
                read = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                i6 = Fields.CameraDistance;
            } else {
                i6 = Fields.RotationZ;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0) ? Fields.Clip : 8192;
        }
        if ((196608 & i) == 0) {
            int i10 = write + 57;
            read = i10 % Fields.SpotShadowColor;
            if (i10 % 2 == 0) {
                int i11 = 89 / 0;
                if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                    i4 = write + 81;
                    read = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                    i5 = Fields.RenderEffect;
                } else {
                    i5 = 65536;
                }
            } else if (getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k1)) {
                i4 = write + 81;
                read = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    throw null;
                }
                i5 = Fields.RenderEffect;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            i2 |= getpostalcode2.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k2) ? 1048576 : Fields.BlendMode;
        }
        if ((12582912 & i) == 0) {
            i2 |= getpostalcode2.read(modifier) ? 8388608 : 4194304;
        }
        int i12 = i2;
        if (getpostalcode2.write(i12 & 1, (4793491 & i12) != 4793490)) {
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                int i13 = read + 109;
                write = i13 % Fields.SpotShadowColor;
                if (i13 % 2 != 0) {
                    getpostalcode2.write(y0.read);
                    throw null;
                }
                objComponentActivity = y0.read;
                getpostalcode2.write(objComponentActivity);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = ua.IconCompatParcelizer;
                getpostalcode2.write(objComponentActivity2);
            }
            r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2 = (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) objComponentActivity2;
            boolean z9 = (i12 & 458752) == 131072;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (!(!z9) || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new WorkNowRowKt$WorkNowRow$1$1(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, 4);
                getpostalcode2.write(objComponentActivity3);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, createFromParcel.INSTANCE, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
            Modifier modifierWrite = SizeKt.write(modifier, 1.0f);
            float f2 = Dimensions.setTabContainer;
            Modifier modifierRemoteActionCompatParcelizer = PaddingKt.RemoteActionCompatParcelizer(modifierWrite, Dimensions.getAnimatedVisibility, f2);
            FlingCancellationException flingCancellationException = Arrangement.MediaDescriptionCompat;
            Alignment.Companion companion = Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierRemoteActionCompatParcelizer);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
            if (getaddresscountry == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i14 = read + 13;
                write = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifierWrite2 = SizeKt.write(companion3, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion.getStart(), getpostalcode2, 0);
            int iHashCode2 = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion2.getConstructor();
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                getpostalcode2.serializer(constructor2);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, modalBottomSheetYbuCTN8Serializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode2), getpostalcode2));
            String str = notificationCompatAction.PlaybackStateCompat;
            TextStyle textStyle = (TextStyle) performLayout.read(925764871, pcn.serializer(), new Object[0], -925764870, pcn.serializer(), pcn.serializer(), pcn.serializer());
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            TextKt.m131TextNvy7gAk(str, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, textStyle, getpostalcode2, 0, 0, 131066);
            float f3 = Dimensions.setPrimaryBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, f3)});
            String str2 = notificationCompatAction.RatingCompat;
            if (str2 == null) {
                getpostalcode2.serializer(-1898159716);
                getpostalcode2.IconCompatParcelizer(false);
            } else {
                getpostalcode2.serializer(-1898159715);
                WorkNowDescriptionRow((i12 >> 18) & 14, getpostalcode2, null, str2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2);
                getpostalcode2.IconCompatParcelizer(false);
            }
            float f4 = Dimensions.setSplitBackground;
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, f4)});
            if (notificationCompatAction.MediaMetadataCompat) {
                getpostalcode2.serializer(-1897837377);
                Modifier modifierWrite3 = SizeKt.write(companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(Arrangement.read, companion.getBottom(), getpostalcode2, 54);
                int iHashCode3 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite3);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor3);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                int i16 = write + 37;
                read = i16 % Fields.SpotShadowColor;
                int i17 = i16 % 2;
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode3), getpostalcode2));
                if (t3Var == null) {
                    getpostalcode2.serializer(2136850734);
                } else {
                    getpostalcode2.serializer(2136850735);
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(t3.write(t3Var), getpostalcode2, 48);
                }
                getpostalcode2.IconCompatParcelizer(false);
                getpostalcode2.IconCompatParcelizer(true);
                getpostalcode2.IconCompatParcelizer(false);
                companion2 = companion2;
                getpostalcode = getpostalcode2;
                f = 1.0f;
                z3 = true;
                i3 = 54;
            } else {
                getpostalcode2.serializer(-1897474987);
                Modifier modifierWrite4 = SizeKt.write(companion3, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer2 = TextFieldDefaults.serializer(Arrangement.MediaBrowserCompatMediaItem, companion.getCenterVertically(), getpostalcode2, 48);
                int iHashCode4 = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode2.serializer();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(getpostalcode2, modifierWrite4);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion2.getConstructor();
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor4);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion2, getpostalcode2, supportingtextpaddinga9ujit4material3defaultSerializer2, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer4);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion2, getpostalcode2, Integer.valueOf(iHashCode4), getpostalcode2));
                if (!z8) {
                    getpostalcode2.serializer(1036376414);
                    getpostalcode2.IconCompatParcelizer(false);
                } else {
                    getpostalcode2.serializer(-1213500621);
                    if (t3Var == null) {
                        getpostalcode2.serializer(1036186414);
                        getpostalcode2.IconCompatParcelizer(false);
                        z = false;
                    } else {
                        getpostalcode2.serializer(1036186415);
                        r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(t3.write(t3Var), getpostalcode2, 48);
                        ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode2, SizeKt.m83size3ABfNKs(companion3, f4)});
                        z = false;
                        getpostalcode2.IconCompatParcelizer(false);
                    }
                    getpostalcode2.IconCompatParcelizer(z);
                }
                f = 1.0f;
                getpostalcode = getpostalcode2;
                i3 = 54;
                TextKt.m131TextNvy7gAk(notificationCompatAction.ParcelableVolumeInfo, null, ((buildMapping) getpostalcode2.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.RemoteActionCompatParcelizer(), getpostalcode, 0, 0, 131066);
                if (z8 && notificationCompatAction.read.equals(Boolean.TRUE)) {
                    int i18 = read + 93;
                    write = i18 % Fields.SpotShadowColor;
                    if (i18 % 2 != 0) {
                        getpostalcode.serializer(1036669984);
                        if ((i12 & 9674) == 30222) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        getpostalcode.serializer(1036669984);
                        if ((i12 & 7168) == 2048) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    }
                    if ((i12 & 14) != 4) {
                        int i19 = read + 11;
                        write = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        if ((i12 & 8) == 0 || !getpostalcode.IconCompatParcelizer(notificationCompatAction)) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                    } else {
                        z5 = true;
                    }
                    Object objComponentActivity4 = getpostalcode.ComponentActivity();
                    if ((z4 | z5) || objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new DeviceManager$$ExternalSyntheticLambda1(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, 20, notificationCompatAction);
                        getpostalcode.write(objComponentActivity4);
                    }
                    r8lambdafjq9b8d5osr_i2bajdxqnw6rnry2.invoke((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity4, getpostalcode, 48);
                    z2 = false;
                    getpostalcode.IconCompatParcelizer(false);
                } else {
                    companion2 = companion2;
                    z2 = false;
                    getpostalcode.serializer(1036791070);
                    getpostalcode.IconCompatParcelizer(false);
                }
                int i21 = read + 105;
                write = i21 % Fields.SpotShadowColor;
                int i22 = i21 % 2;
                z3 = true;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(z2);
            }
            getpostalcode.IconCompatParcelizer(z3);
            String str3 = notificationCompatAction.RemoteActionCompatParcelizer;
            boolean z10 = notificationCompatAction.MediaDescriptionCompat;
            Modifier modifierWrite5 = SizeKt.write(companion3, f);
            float f5 = Dimensions.setTransitioning;
            Modifier modifierM74paddingqDBjuR0$default = PaddingKt.m74paddingqDBjuR0$default(modifierWrite5, 0.0f, f5, 0.0f, 0.0f, 13);
            modifierM74paddingqDBjuR0$default.getClass();
            int i23 = (i12 >> 9) & 112;
            ComposeUiNode.Companion companion4 = companion2;
            PrimaryKt.write(str3, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, modifierM74paddingqDBjuR0$default, z10, false, null, null, null, null, null, getpostalcode, i23, 0, 2032);
            ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m75height3ABfNKs(companion3, f2)});
            String str4 = notificationCompatAction.IconCompatParcelizer;
            if (str4 == null) {
                getpostalcode.serializer(-1649153382);
                z6 = false;
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode.serializer(-1649153381);
                TextKt.m131TextNvy7gAk(str4, SizeKt.write(companion3, f), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).getSupportBackgroundTintMode(), 0L, null, null, 0L, TextAlign.m3504boximpl(TextAlign.Companion.m3511getCentere0LSkKk()), 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode, 48, 0, 130040);
                z6 = false;
                getpostalcode.IconCompatParcelizer(false);
            }
            String str5 = notificationCompatAction.MediaBrowserCompatMediaItem;
            if (str5 == null) {
                getpostalcode.serializer(-1648810956);
                getpostalcode.IconCompatParcelizer(z6);
                int i24 = write + 59;
                read = i24 % Fields.SpotShadowColor;
                int i25 = i24 % 2;
                z7 = true;
            } else {
                getpostalcode.serializer(-1648810955);
                Modifier modifierWrite6 = SizeKt.write(companion3, f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer3 = TextFieldDefaults.serializer(Arrangement.IconCompatParcelizer, companion.getCenterVertically(), getpostalcode, i3);
                int iHashCode5 = Long.hashCode(getpostalcode.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode.serializer();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(getpostalcode, modifierWrite6);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion4.getConstructor();
                getpostalcode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode.ComponentActivity) {
                    getpostalcode.serializer(constructor5);
                } else {
                    getpostalcode.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion4, getpostalcode, supportingtextpaddinga9ujit4material3defaultSerializer3, getpostalcode, dragAndDropNodestartDragAndDropTransfer1Serializer5);
                AndroidContentCaptureManagerCompanion.write(getpostalcode, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion4, getpostalcode, Integer.valueOf(iHashCode5), getpostalcode));
                IconKt.m116Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_clock, getpostalcode, 0), (String) null, SizeKt.m83size3ABfNKs(companion3, f5), ((buildMapping) getpostalcode.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), getpostalcode, Painter.$stable | 48, 0);
                ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode, SizeKt.m86width3ABfNKs(companion3, f3)});
                NextAvailabilityText(str5, getpostalcode, 0);
                z7 = true;
                getpostalcode.IconCompatParcelizer(true);
                getpostalcode.IconCompatParcelizer(false);
            }
            getpostalcode.IconCompatParcelizer(z7);
        } else {
            getpostalcode = getpostalcode2;
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new computeVerticalScrollExtent(notificationCompatAction, xbVar, accessismainthread, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, modifier, i, 0);
        }
    }
}
