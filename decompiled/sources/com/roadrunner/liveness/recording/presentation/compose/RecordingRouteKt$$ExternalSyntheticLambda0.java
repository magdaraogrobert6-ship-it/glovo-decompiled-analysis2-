package com.roadrunner.liveness.recording.presentation.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import bo.app.b1$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.logistics.rider.glovo.R;
import com.roadrunner.delivery.pickupdropoff.presentation.compose.SingleDeliveryPageKt;
import com.roadrunner.home.HomeViewModel;
import com.roadrunner.home.nest.NestFragment;
import com.roadrunner.home.nest.NestScreenKt$$ExternalSyntheticLambda0;
import com.roadrunner.liveness.instruction.presentation.compose.InstructionScreenKt;
import com.roadrunner.liveness.recording.presentation.RecordingViewModel;
import com.roadrunner.login.presentation.countryselection.CountrySelectionViewModel;
import com.roadrunner.rrds.compose.component.forms.pattern.LoadingFullScreenKt;
import o.AbstractC0154c;
import o.ActivityHandler2;
import o.AndroidColorFilter_androidKt;
import o.AndroidContentCaptureManager;
import o.DefaultContentCardsUpdateHandlerCompanionCREATOR1;
import o.ParcelableSnapshotMutableLongState;
import o.Pool;
import o.PopulateViewStructure_androidKtpopulate7;
import o.SemanticsOwnerKt;
import o.SwitchKt;
import o.TextIndent;
import o.a5ExternalSyntheticLambda0;
import o.addRect;
import o.asFrameworkPaint;
import o.b2;
import o.createFromParcel;
import o.cubicTo;
import o.defaultParamCount;
import o.displayInAppMessagelambda1;
import o.getActionViewIntentlambda0;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getNewPassword;
import o.getPhoneNumberNational;
import o.getPostalCode;
import o.getQueryContext;
import o.getRootSemanticsNode;
import o.i2;
import o.onShowTranslationui;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY;
import o.registerInAppMessageManagerlambda0;
import o.relativeMoveTo;
import o.sendDragEventEu1f8Dk;
import o.setPathEffect;
import o.setStrokeCapBeK7IIE;
import o.setStrokeJoinWw9F2mQ;
import o.usePrepared;
import o.withTransaction;
import okhttp3.Cookie$Companion;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RecordingRouteKt$$ExternalSyntheticLambda0 implements r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds {
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read = 1;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ RecordingRouteKt$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, SwitchKt switchKt, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.IconCompatParcelizer = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.MediaBrowserCompatMediaItem = switchKt;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    public /* synthetic */ RecordingRouteKt$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, relativeMoveTo relativemoveto, SwitchKt switchKt, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.RemoteActionCompatParcelizer = relativemoveto;
        this.MediaBrowserCompatMediaItem = switchKt;
        this.write = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public /* synthetic */ RecordingRouteKt$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, SwitchKt switchKt) {
        this.IconCompatParcelizer = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.write = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaBrowserCompatMediaItem = switchKt;
    }

    public /* synthetic */ RecordingRouteKt$$ExternalSyntheticLambda0(r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, b2 b2Var, FormBody.Builder builder, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.IconCompatParcelizer = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.write = b2Var;
        this.MediaBrowserCompatMediaItem = builder;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    public /* synthetic */ RecordingRouteKt$$ExternalSyntheticLambda0(r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, getActionViewIntentlambda0 getactionviewintentlambda0, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, i2 i2Var, defaultParamCount defaultparamcount) {
        this.IconCompatParcelizer = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk;
        this.serializer = getactionviewintentlambda0;
        this.RemoteActionCompatParcelizer = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.write = i2Var;
        this.MediaBrowserCompatMediaItem = defaultparamcount;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0294  */
    /* JADX WARN: Code duplicated, block: B:87:0x0360  */
    @Override // o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        setStrokeCapBeK7IIE defaultViewModelCreationExtras;
        int i = 2 % 2;
        int i2 = RatingCompat + 87;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.read;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj5 = this.serializer;
        Object obj6 = this.MediaBrowserCompatMediaItem;
        Object obj7 = this.write;
        Object obj8 = this.RemoteActionCompatParcelizer;
        Object obj9 = this.IconCompatParcelizer;
        Object obj10 = null;
        if (i4 == 0) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj9;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) obj7;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
            SwitchKt switchKt = (SwitchKt) obj6;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            asFrameworkPaint asframeworkpaintIconCompatParcelizer = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getbirthdatefull);
            if (asframeworkpaintIconCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            RecordingViewModel recordingViewModel = (RecordingViewModel) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer, displayInAppMessagelambda1.serializer(RecordingViewModel.class), r8lambdaudhhxliolpu0hpccqh6voskpny, asframeworkpaintIconCompatParcelizer instanceof AndroidColorFilter_androidKt ? ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer).getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer);
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            boolean z = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (z) {
                objComponentActivity = new b1$$ExternalSyntheticLambda0(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                getpostalcode.write(objComponentActivity);
            } else {
                int i5 = MediaSessionCompatQueueItem + 89;
                RatingCompat = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 49 / 0;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new b1$$ExternalSyntheticLambda0(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                        getpostalcode.write(objComponentActivity);
                    }
                } else if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new b1$$ExternalSyntheticLambda0(19, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                    getpostalcode.write(objComponentActivity);
                }
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0, 1);
            RecordingScreenKt.read(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, recordingViewModel, PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt), getpostalcode, 0);
            return createfromparcel;
        }
        if (i4 == 1) {
            int iIntValue = ((Integer) obj2).intValue();
            ((Integer) obj4).getClass();
            ((ParcelableSnapshotMutableLongState) obj).getClass();
            SingleDeliveryPageKt.SingleDeliveryPage((TextIndent) ((r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk) obj9).get(iIntValue), (getActionViewIntentlambda0) obj5, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) obj8, (i2) obj7, (defaultParamCount) obj6, null, (getBirthDateFull) obj3, 0);
            return createfromparcel;
        }
        if (i4 == 2) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj9;
            SwitchKt switchKt2 = (SwitchKt) obj6;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj8;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            getPostalCode getpostalcode2 = (getPostalCode) ((getBirthDateFull) obj3);
            SemanticsOwnerKt semanticsOwnerKt = (SemanticsOwnerKt) getpostalcode2.write((getNewPassword) getRootSemanticsNode.write);
            asFrameworkPaint asframeworkpaintIconCompatParcelizer2 = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getpostalcode2);
            if (asframeworkpaintIconCompatParcelizer2 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            if (asframeworkpaintIconCompatParcelizer2 instanceof AndroidColorFilter_androidKt) {
                int i7 = RatingCompat + 97;
                MediaSessionCompatQueueItem = i7 % Fields.SpotShadowColor;
                if (i7 % 2 == 0) {
                    ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer2).getDefaultViewModelCreationExtras();
                    obj10.hashCode();
                    throw null;
                }
                defaultViewModelCreationExtras = ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer2).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = setPathEffect.IconCompatParcelizer;
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(((withTransaction) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer2, displayInAppMessagelambda1.serializer(withTransaction.class), r8lambdaudhhxliolpu0hpccqh6voskpny2, defaultViewModelCreationExtras)).IconCompatParcelizer, getpostalcode2, 0);
            InstructionScreenKt.InstructionScreen(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, ((Pool) populateViewStructure_androidKtpopulate7Write.getValue()).read, ((Pool) populateViewStructure_androidKtpopulate7Write.getValue()).write, PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt2), getpostalcode2, 0);
            boolean z2 = getpostalcode2.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (z2) {
                objComponentActivity2 = new b1$$ExternalSyntheticLambda0(18, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                getpostalcode2.write(objComponentActivity2);
            } else {
                int i8 = RatingCompat + 35;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                if (i8 % 2 == 0) {
                    int i9 = 55 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new b1$$ExternalSyntheticLambda0(18, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                        getpostalcode2.write(objComponentActivity2);
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new b1$$ExternalSyntheticLambda0(18, r8lambdardpfsr94j4iebcwx_kpqzpm8k3);
                    getpostalcode2.write(objComponentActivity2);
                }
            }
            DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode2, 0, 1);
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(semanticsOwnerKt);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new usePrepared(semanticsOwnerKt, 0);
                getpostalcode2.write(objComponentActivity3);
            }
            getPhoneNumberNational.serializer(createfromparcel, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode2);
            return createfromparcel;
        }
        if (i4 != 3) {
            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj9;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj8;
            b2 b2Var = (b2) obj7;
            FormBody.Builder builder = (FormBody.Builder) obj6;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj3;
            ((Integer) obj4).getClass();
            ((sendDragEventEu1f8Dk) obj).getClass();
            ((cubicTo) obj2).getClass();
            asFrameworkPaint asframeworkpaintIconCompatParcelizer3 = setStrokeJoinWw9F2mQ.IconCompatParcelizer(getbirthdatefull2);
            if (asframeworkpaintIconCompatParcelizer3 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return null;
            }
            ActivityHandler2 activityHandler2 = (ActivityHandler2) Cookie$Companion.IconCompatParcelizer(asframeworkpaintIconCompatParcelizer3, displayInAppMessagelambda1.serializer(ActivityHandler2.class), r8lambdaudhhxliolpu0hpccqh6voskpny3, asframeworkpaintIconCompatParcelizer3 instanceof AndroidColorFilter_androidKt ? ((AndroidColorFilter_androidKt) asframeworkpaintIconCompatParcelizer3).getDefaultViewModelCreationExtras() : setPathEffect.IconCompatParcelizer);
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write2 = ExtrasKt.write(activityHandler2.read, getbirthdatefull2, 0);
            String strStringResource = StringResources_androidKt.stringResource(R.string.all_error_message, getbirthdatefull2, 0);
            getQueryContext getquerycontext = activityHandler2.serializer;
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull2;
            boolean z3 = getpostalcode3.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
            boolean z4 = getpostalcode3.read(b2Var);
            boolean z5 = getpostalcode3.read(strStringResource);
            Object objComponentActivity4 = getpostalcode3.ComponentActivity();
            if ((z3 | z4 | z5) || objComponentActivity4 == androidContentCaptureManager) {
                objComponentActivity4 = new NestScreenKt$$ExternalSyntheticLambda0(r8lambdaunavo3sxub_pc9xroryotnrlvsm2, b2Var, strStringResource, 13);
                getpostalcode3.write(objComponentActivity4);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode3, 8);
            LoadingFullScreenKt.m5039LoadingFullScreenSj8uqqQ(((Boolean) populateViewStructure_androidKtpopulate7Write2.getValue()).booleanValue(), null, null, null, ExtrasKt.write(-461242371, new NavHostKt$NavHost$29$1$$ExternalSyntheticLambda0(builder, activityHandler2, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, 15), getpostalcode3), getpostalcode3, 24576, 14);
            return createfromparcel;
        }
        relativeMoveTo relativemoveto = (relativeMoveTo) obj8;
        SwitchKt switchKt3 = (SwitchKt) obj6;
        r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj5;
        getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj3;
        ((Integer) obj4).getClass();
        ((sendDragEventEu1f8Dk) obj).getClass();
        ((cubicTo) obj2).getClass();
        CountrySelectionViewModel countrySelectionViewModel = (CountrySelectionViewModel) Cookie$Companion.IconCompatParcelizer(CountrySelectionViewModel.class, (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj9, getbirthdatefull3);
        PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write3 = ExtrasKt.write(countrySelectionViewModel.ParcelableVolumeInfo, getbirthdatefull3, 0);
        getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull3;
        boolean zIconCompatParcelizer2 = getpostalcode4.IconCompatParcelizer(relativemoveto);
        Object objComponentActivity5 = getpostalcode4.ComponentActivity();
        if (zIconCompatParcelizer2 || objComponentActivity5 == androidContentCaptureManager) {
            objComponentActivity5 = new addRect(relativemoveto, 3);
            getpostalcode4.write(objComponentActivity5);
        }
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity5;
        boolean zIconCompatParcelizer3 = getpostalcode4.IconCompatParcelizer(countrySelectionViewModel);
        Object objComponentActivity6 = getpostalcode4.ComponentActivity();
        if (zIconCompatParcelizer3) {
            objComponentActivity6 = new HomeViewModel.AnonymousClass1(countrySelectionViewModel, null, 20);
            getpostalcode4.write(objComponentActivity6);
        } else {
            int i10 = MediaSessionCompatQueueItem + 1;
            RatingCompat = i10 % Fields.SpotShadowColor;
            int i11 = i10 % 2;
            if (objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new HomeViewModel.AnonymousClass1(countrySelectionViewModel, null, 20);
                getpostalcode4.write(objComponentActivity6);
            }
        }
        getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode4, createfromparcel, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity6);
        Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(Modifier.Companion, switchKt3);
        a5ExternalSyntheticLambda0 a5externalsyntheticlambda0 = (a5ExternalSyntheticLambda0) populateViewStructure_androidKtpopulate7Write3.getValue();
        getQueryContext getquerycontext2 = countrySelectionViewModel.MediaSessionCompatResultReceiverWrapper;
        boolean zIconCompatParcelizer4 = getpostalcode4.IconCompatParcelizer(countrySelectionViewModel);
        Object objComponentActivity7 = getpostalcode4.ComponentActivity();
        if (zIconCompatParcelizer4 || objComponentActivity7 == androidContentCaptureManager) {
            objComponentActivity7 = new NestFragment.AnonymousClass1(1, countrySelectionViewModel, CountrySelectionViewModel.class, "onCountryChanged", "onCountryChanged(Lcom/roadrunner/country/config/api/model/CountryConfig;)V", 0, 23);
            getpostalcode4.write(objComponentActivity7);
        }
        registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity7;
        boolean zIconCompatParcelizer5 = getpostalcode4.IconCompatParcelizer(countrySelectionViewModel);
        Object objComponentActivity8 = getpostalcode4.ComponentActivity();
        if (zIconCompatParcelizer5 || objComponentActivity8 == androidContentCaptureManager) {
            objComponentActivity8 = new NestFragment.AnonymousClass1(1, countrySelectionViewModel, CountrySelectionViewModel.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0, 24);
            getpostalcode4.write(objComponentActivity8);
            int i12 = RatingCompat + 107;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
        }
        AbstractC0154c.read(a5externalsyntheticlambda0, getquerycontext2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity8), r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, (String) ((onShowTranslationui) countrySelectionViewModel.RemoteActionCompatParcelizer).getValue(), r8lambdardpfsr94j4iebcwx_kpqzpm8k6, modifierIconCompatParcelizer, getpostalcode4, 64);
        boolean z6 = ((a5ExternalSyntheticLambda0) populateViewStructure_androidKtpopulate7Write3.getValue()).serializer;
        boolean z7 = getpostalcode4.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k6);
        Object objComponentActivity9 = getpostalcode4.ComponentActivity();
        if (z7 || objComponentActivity9 == androidContentCaptureManager) {
            objComponentActivity9 = new b1$$ExternalSyntheticLambda0(23, r8lambdardpfsr94j4iebcwx_kpqzpm8k6);
            getpostalcode4.write(objComponentActivity9);
        }
        DefaultContentCardsUpdateHandlerCompanionCREATOR1.IconCompatParcelizer(z6, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity9, getpostalcode4, 0, 0);
        return createfromparcel;
    }
}
