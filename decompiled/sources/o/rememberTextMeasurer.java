package o;

import com.huawei.riemann.location.common.utils.Constant;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.customerchat.selfservice.presentation.BridgeManager$trackEvent$2;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.FloatingContentKt;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.compose.OverlayFooterKt;
import com.roadrunner.liveness.recording.presentation.compose.RecordingRouteKt$$ExternalSyntheticLambda0;
import com.roadrunner.login.presentation.welcome.WelcomeNavigationKt$$ExternalSyntheticLambda0;
import com.roadrunner.nafath.logger.NafathLogger$$ExternalSyntheticLambda0;
import com.roadrunner.rider.recruitment.accountcreation.password_creation.presentation.compose.PasswordCreationScreenKt;
import com.roadrunner.rider.recruitment.accountcreation.presentation.AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1;
import com.roadrunner.rider.recruitment.passverification.pass_error.PassErrorScreenKt$$ExternalSyntheticLambda4;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import com.roadrunner.twofa.navigation.TwoFaNavigationImpl$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.N$b;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import okhttp3.FormBody;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rememberTextMeasurer implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int ResultReceiver = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final /* synthetic */ int IconCompatParcelizer = 0;
    public final /* synthetic */ Object MediaBrowserCompatMediaItem;
    public final /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ Object MediaMetadataCompat;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ Object MediaSessionCompatResultReceiverWrapper;
    public final /* synthetic */ Object MediaSessionCompatToken;
    public final /* synthetic */ Object ParcelableVolumeInfo;
    public final /* synthetic */ Object PlaybackStateCompat;
    public final /* synthetic */ Object PlaybackStateCompatCustomAction;
    public final /* synthetic */ Object RatingCompat;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ rememberTextMeasurer(getPlatformAndroidManager getplatformandroidmanager, getPlatformAndroidManager getplatformandroidmanager2, sensitiveContentdefault sensitivecontentdefault, getPlatformAndroidManager getplatformandroidmanager3, SignInDataStore signInDataStore, drawTextLVfH_YUdefault drawtextlvfh_yudefault, drawTextLVfH_YU drawtextlvfh_yu, accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans, TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0, getPlatformAndroidManager getplatformandroidmanager4, N$b n$b, TextPainterKt textPainterKt, SignInDataStore signInDataStore2, com.huawei.wisesecurity.ucs_credential.p0 p0Var) {
        this.write = getplatformandroidmanager;
        this.serializer = getplatformandroidmanager2;
        this.RatingCompat = sensitivecontentdefault;
        this.MediaMetadataCompat = getplatformandroidmanager3;
        this.MediaSessionCompatQueueItem = signInDataStore;
        this.MediaSessionCompatToken = drawtextlvfh_yudefault;
        this.PlaybackStateCompatCustomAction = drawtextlvfh_yu;
        this.PlaybackStateCompat = accessstripnonmetricaffectingcharacterstylespans;
        this.ParcelableVolumeInfo = tncComposableFactoryImpl$$ExternalSyntheticLambda0;
        this.MediaSessionCompatResultReceiverWrapper = getplatformandroidmanager4;
        this.RemoteActionCompatParcelizer = n$b;
        this.read = textPainterKt;
        this.MediaBrowserCompatMediaItem = signInDataStore2;
        this.MediaDescriptionCompat = p0Var;
    }

    public /* synthetic */ rememberTextMeasurer(relativeMoveTo relativemoveto, String str, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny, FormBody.Builder builder, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getContentViewGroupParentLayout getcontentviewgroupparentlayout, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4, PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, androidx.compose.material3.SnackbarHostState snackbarHostState) {
        this.write = relativemoveto;
        this.serializer = str;
        this.MediaMetadataCompat = r8lambdaudhhxliolpu0hpccqh6voskpny;
        this.MediaSessionCompatResultReceiverWrapper = builder;
        this.RatingCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatToken = getcontentviewgroupparentlayout;
        this.PlaybackStateCompatCustomAction = r8lambdaudhhxliolpu0hpccqh6voskpny2;
        this.PlaybackStateCompat = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.ParcelableVolumeInfo = r8lambdaudhhxliolpu0hpccqh6voskpny3;
        this.RemoteActionCompatParcelizer = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
        this.read = r8lambdaudhhxliolpu0hpccqh6voskpny4;
        this.MediaBrowserCompatMediaItem = populateViewStructure_androidKtpopulate7;
        this.MediaDescriptionCompat = snackbarHostState;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a1  */
    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        Object obj4 = this.MediaDescriptionCompat;
        Object obj5 = this.MediaBrowserCompatMediaItem;
        Object obj6 = this.read;
        Object obj7 = this.RemoteActionCompatParcelizer;
        Object obj8 = this.ParcelableVolumeInfo;
        Object obj9 = this.PlaybackStateCompat;
        Object obj10 = this.PlaybackStateCompatCustomAction;
        Object obj11 = this.MediaSessionCompatToken;
        Object obj12 = this.MediaSessionCompatQueueItem;
        Object obj13 = this.RatingCompat;
        Object obj14 = this.MediaSessionCompatResultReceiverWrapper;
        Object obj15 = this.MediaMetadataCompat;
        Object obj16 = this.serializer;
        Object obj17 = this.write;
        if (i2 != 0) {
            final relativeMoveTo relativemoveto = (relativeMoveTo) obj17;
            String str = (String) obj16;
            final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj15;
            final FormBody.Builder builder = (FormBody.Builder) obj14;
            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj13;
            final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj12;
            final getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj11;
            final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny2 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj10;
            final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj9;
            final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny3 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj8;
            final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj7;
            final r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny4 = (r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY) obj6;
            final PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj5;
            final androidx.compose.material3.SnackbarHostState snackbarHostState = (androidx.compose.material3.SnackbarHostState) obj4;
            SwitchKt switchKt = (SwitchKt) obj;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            switchKt.getClass();
            if ((iIntValue & 6) == 0) {
                iIntValue |= ((getPostalCode) getbirthdatefull).read(switchKt) ? 4 : 2;
            }
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(iIntValue & 1, (iIntValue & 19) != 18)) {
                androidx.compose.ui.Modifier modifierIconCompatParcelizer = androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(androidx.compose.ui.Modifier.Companion, ((buildMapping) getpostalcode.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).IconCompatParcelizer(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()), switchKt);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(builder);
                boolean z2 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                boolean z3 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(getcontentviewgroupparentlayout);
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny2);
                boolean z4 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(relativemoveto);
                boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny3);
                boolean z5 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
                boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(r8lambdaudhhxliolpu0hpccqh6voskpny4);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!(zIconCompatParcelizer | zIconCompatParcelizer2 | z2 | z3 | zIconCompatParcelizer3 | zIconCompatParcelizer4 | z4 | zIconCompatParcelizer5 | zIconCompatParcelizer6 | z5) && !zIconCompatParcelizer7) {
                    int i3 = ResultReceiver + 69;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ActivityHandler48
                            private static int ParcelableVolumeInfo = 1;
                            private static int PlaybackStateCompat;

                            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                            public final Object invoke(Object obj18) {
                                int i5 = 2 % 2;
                                int i6 = ParcelableVolumeInfo + 23;
                                PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i7 = i6 % 2;
                                relativeLineTo relativelineto = (relativeLineTo) obj18;
                                relativelineto.getClass();
                                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny5 = r8lambdaudhhxliolpu0hpccqh6voskpny;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                                final getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                                PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                                androidx.compose.material3.SnackbarHostState snackbarHostState2 = snackbarHostState;
                                List list = null;
                                if (r8lambdaudhhxliolpu0hpccqh6voskpny5 != null) {
                                    list = null;
                                    BaseCardView.IconCompatParcelizer(relativelineto, "VerifyScreen", null, new DragAndDropTargetModifierNode(new RecordingRouteKt$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny5, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 4), builder, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), true, 13479557), Constant.ERROR_ROAD_AREA_INVALID);
                                }
                                b2 b2Var = new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 5);
                                final relativeMoveTo relativemoveto2 = relativemoveto;
                                final int i8 = 0;
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ActivityHandler47
                                    private static int read = 0;
                                    private static int serializer = 1;

                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public final Object invoke(Object obj19) {
                                        int i9 = 2 % 2;
                                        int i10 = i8;
                                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                        relativeMoveTo relativemoveto3 = relativemoveto2;
                                        getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                        ActivityHandler44 activityHandler44 = (ActivityHandler44) obj19;
                                        Object obj20 = null;
                                        if (i10 == 0) {
                                            activityHandler44.getClass();
                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 0), 3);
                                            int i11 = read + 91;
                                            serializer = i11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i12 = i11 % 2;
                                            return createfromparcel;
                                        }
                                        activityHandler44.getClass();
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 1), 3);
                                        int i13 = serializer + 49;
                                        read = i13 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i13 % 2 == 0) {
                                            return createfromparcel;
                                        }
                                        obj20.hashCode();
                                        throw null;
                                    }
                                };
                                C0188n c0188n = new C0188n(relativemoveto2, 8);
                                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny6 = r8lambdaudhhxliolpu0hpccqh6voskpny2;
                                r8lambdaudhhxliolpu0hpccqh6voskpny6.getClass();
                                companion.getClass();
                                r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                                r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
                                BaseCardView.IconCompatParcelizer(relativelineto, "EmailAndPhone", list, new DragAndDropTargetModifierNode(new TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny6, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, c0188n, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, b2Var, companion), true, 686976501), Constant.ERROR_ROAD_AREA_INVALID);
                                af afVar = new af(relativemoveto2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 1);
                                b2 b2Var2 = new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 2);
                                float f = PasswordCreationScreenKt.RemoteActionCompatParcelizer;
                                r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny7 = r8lambdaudhhxliolpu0hpccqh6voskpny3;
                                r8lambdaudhhxliolpu0hpccqh6voskpny7.getClass();
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
                                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = new setSupportCompoundDrawablesTintList(0);
                                AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings = asAndroidPathEffect.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                                setsupportcompounddrawablestintlist.write = androidPaint_androidKtWhenMappings;
                                setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer("");
                                addArc addarc = new addArc("email", setsupportcompounddrawablestintlist.read());
                                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = new setSupportCompoundDrawablesTintList(0);
                                setsupportcompounddrawablestintlist2.write = androidPaint_androidKtWhenMappings;
                                setsupportcompounddrawablestintlist2.RemoteActionCompatParcelizer("");
                                addArc addarc2 = new addArc("phone", setsupportcompounddrawablestintlist2.read());
                                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist3 = new setSupportCompoundDrawablesTintList(0);
                                setsupportcompounddrawablestintlist3.write = androidPaint_androidKtWhenMappings;
                                setsupportcompounddrawablestintlist3.RemoteActionCompatParcelizer("");
                                addArc addarc3 = new addArc("originalMessageId", setsupportcompounddrawablestintlist3.read());
                                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist4 = new setSupportCompoundDrawablesTintList(0);
                                setsupportcompounddrawablestintlist4.write = asAndroidPathEffect.RemoteActionCompatParcelizer;
                                setsupportcompounddrawablestintlist4.RemoteActionCompatParcelizer(Boolean.FALSE);
                                BaseCardView.IconCompatParcelizer(relativelineto, "Password/{email}/{phone}/{originalMessageId}?isPassFlow={isPassFlow}", androidx.sqlite.SQLite.read(addarc, addarc2, addarc3, new addArc("isPassFlow", setsupportcompounddrawablestintlist4.read())), new DragAndDropTargetModifierNode(new WelcomeNavigationKt$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny7, afVar, b2Var2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, companion, 2), true, -272719022), 252);
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                                r8lambdaunavo3sxub_pc9xroryotnrlvsm5.getClass();
                                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist5 = new setSupportCompoundDrawablesTintList(0);
                                setsupportcompounddrawablestintlist5.write = androidPaint_androidKtWhenMappings;
                                setsupportcompounddrawablestintlist5.RemoteActionCompatParcelizer(fromString.UnexpectedError.getCode());
                                final int i9 = 1;
                                BaseCardView.IconCompatParcelizer(relativelineto, "PassError/{passErrorType}", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new addArc("passErrorType", setsupportcompounddrawablestintlist5.read())}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), new DragAndDropTargetModifierNode(new PassErrorScreenKt$$ExternalSyntheticLambda4(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 0, r8lambdaunavo3sxub_pc9xroryotnrlvsm5), true, 1086662795), 252);
                                af afVar2 = new af(relativemoveto2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 2);
                                b2 b2Var3 = new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 3);
                                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ActivityHandler47
                                    private static int read = 0;
                                    private static int serializer = 1;

                                    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                    public final Object invoke(Object obj19) {
                                        int i10 = 2 % 2;
                                        int i11 = i9;
                                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                        relativeMoveTo relativemoveto3 = relativemoveto2;
                                        getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                        ActivityHandler44 activityHandler44 = (ActivityHandler44) obj19;
                                        Object obj20 = null;
                                        if (i11 == 0) {
                                            activityHandler44.getClass();
                                            BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 0), 3);
                                            int i12 = read + 91;
                                            serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                            int i13 = i12 % 2;
                                            return createfromparcel;
                                        }
                                        activityHandler44.getClass();
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 1), 3);
                                        int i14 = serializer + 49;
                                        read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        if (i14 % 2 == 0) {
                                            return createfromparcel;
                                        }
                                        obj20.hashCode();
                                        throw null;
                                    }
                                };
                                toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m = new toAndroidVertexModeJOOmi9M(getcontentviewgroupparentlayout2, relativemoveto2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 11);
                                accessgetTextCentercp accessgettextcentercp = new accessgetTextCentercp(12);
                                NafathLogger$$ExternalSyntheticLambda0 nafathLogger$$ExternalSyntheticLambda0 = new NafathLogger$$ExternalSyntheticLambda0(22);
                                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist6 = new setSupportCompoundDrawablesTintList(0);
                                setsupportcompounddrawablestintlist6.write = androidPaint_androidKtWhenMappings;
                                setsupportcompounddrawablestintlist6.RemoteActionCompatParcelizer("");
                                addArc addarc4 = new addArc("otpPhoneNumber", setsupportcompounddrawablestintlist6.read());
                                setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist7 = new setSupportCompoundDrawablesTintList(0);
                                setsupportcompounddrawablestintlist7.write = androidPaint_androidKtWhenMappings;
                                setsupportcompounddrawablestintlist7.RemoteActionCompatParcelizer("");
                                BaseCardView.IconCompatParcelizer(relativelineto, "OtpVerification/{otpPhoneNumber}/{email}", androidx.sqlite.SQLite.read(addarc4, new addArc("email", setsupportcompounddrawablestintlist7.read())), new DragAndDropTargetModifierNode(new TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny4, nafathLogger$$ExternalSyntheticLambda0, b2Var3, accessgettextcentercp, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, toandroidvertexmodejoomi9m, afVar2), true, -1437205072), 252);
                                createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                int i10 = ParcelableVolumeInfo + 99;
                                PlaybackStateCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i11 = i10 % 2;
                                return createfromparcel;
                            }
                        };
                        getpostalcode.write(objComponentActivity);
                    }
                } else {
                    objComponentActivity = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ActivityHandler48
                        private static int ParcelableVolumeInfo = 1;
                        private static int PlaybackStateCompat;

                        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                        public final Object invoke(Object obj18) {
                            int i5 = 2 % 2;
                            int i6 = ParcelableVolumeInfo + 23;
                            PlaybackStateCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i7 = i6 % 2;
                            relativeLineTo relativelineto = (relativeLineTo) obj18;
                            relativelineto.getClass();
                            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny5 = r8lambdaudhhxliolpu0hpccqh6voskpny;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
                            final getContentViewGroupParentLayout getcontentviewgroupparentlayout2 = getcontentviewgroupparentlayout;
                            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate8 = populateViewStructure_androidKtpopulate7;
                            androidx.compose.material3.SnackbarHostState snackbarHostState2 = snackbarHostState;
                            List list = null;
                            if (r8lambdaudhhxliolpu0hpccqh6voskpny5 != null) {
                                list = null;
                                BaseCardView.IconCompatParcelizer(relativelineto, "VerifyScreen", null, new DragAndDropTargetModifierNode(new RecordingRouteKt$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny5, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 4), builder, r8lambdardpfsr94j4iebcwx_kpqzpm8k2), true, 13479557), Constant.ERROR_ROAD_AREA_INVALID);
                            }
                            b2 b2Var = new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 5);
                            final relativeMoveTo relativemoveto2 = relativemoveto;
                            final int i8 = 0;
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ActivityHandler47
                                private static int read = 0;
                                private static int serializer = 1;

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj19) {
                                    int i10 = 2 % 2;
                                    int i11 = i8;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    relativeMoveTo relativemoveto3 = relativemoveto2;
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                    ActivityHandler44 activityHandler44 = (ActivityHandler44) obj19;
                                    Object obj20 = null;
                                    if (i11 == 0) {
                                        activityHandler44.getClass();
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 0), 3);
                                        int i12 = read + 91;
                                        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i13 = i12 % 2;
                                        return createfromparcel;
                                    }
                                    activityHandler44.getClass();
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 1), 3);
                                    int i14 = serializer + 49;
                                    read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i14 % 2 == 0) {
                                        return createfromparcel;
                                    }
                                    obj20.hashCode();
                                    throw null;
                                }
                            };
                            C0188n c0188n = new C0188n(relativemoveto2, 8);
                            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
                            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny6 = r8lambdaudhhxliolpu0hpccqh6voskpny2;
                            r8lambdaudhhxliolpu0hpccqh6voskpny6.getClass();
                            companion.getClass();
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
                            r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
                            BaseCardView.IconCompatParcelizer(relativelineto, "EmailAndPhone", list, new DragAndDropTargetModifierNode(new TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny6, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, c0188n, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, b2Var, companion), true, 686976501), Constant.ERROR_ROAD_AREA_INVALID);
                            af afVar = new af(relativemoveto2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 1);
                            b2 b2Var2 = new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 2);
                            float f = PasswordCreationScreenKt.RemoteActionCompatParcelizer;
                            r8lambdauDhHXlIoLpU0HpCcQH6vOsKpNY r8lambdaudhhxliolpu0hpccqh6voskpny7 = r8lambdaudhhxliolpu0hpccqh6voskpny3;
                            r8lambdaudhhxliolpu0hpccqh6voskpny7.getClass();
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
                            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist = new setSupportCompoundDrawablesTintList(0);
                            AndroidPaint_androidKtWhenMappings androidPaint_androidKtWhenMappings = asAndroidPathEffect.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                            setsupportcompounddrawablestintlist.write = androidPaint_androidKtWhenMappings;
                            setsupportcompounddrawablestintlist.RemoteActionCompatParcelizer("");
                            addArc addarc = new addArc("email", setsupportcompounddrawablestintlist.read());
                            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist2 = new setSupportCompoundDrawablesTintList(0);
                            setsupportcompounddrawablestintlist2.write = androidPaint_androidKtWhenMappings;
                            setsupportcompounddrawablestintlist2.RemoteActionCompatParcelizer("");
                            addArc addarc2 = new addArc("phone", setsupportcompounddrawablestintlist2.read());
                            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist3 = new setSupportCompoundDrawablesTintList(0);
                            setsupportcompounddrawablestintlist3.write = androidPaint_androidKtWhenMappings;
                            setsupportcompounddrawablestintlist3.RemoteActionCompatParcelizer("");
                            addArc addarc3 = new addArc("originalMessageId", setsupportcompounddrawablestintlist3.read());
                            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist4 = new setSupportCompoundDrawablesTintList(0);
                            setsupportcompounddrawablestintlist4.write = asAndroidPathEffect.RemoteActionCompatParcelizer;
                            setsupportcompounddrawablestintlist4.RemoteActionCompatParcelizer(Boolean.FALSE);
                            BaseCardView.IconCompatParcelizer(relativelineto, "Password/{email}/{phone}/{originalMessageId}?isPassFlow={isPassFlow}", androidx.sqlite.SQLite.read(addarc, addarc2, addarc3, new addArc("isPassFlow", setsupportcompounddrawablestintlist4.read())), new DragAndDropTargetModifierNode(new WelcomeNavigationKt$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny7, afVar, b2Var2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, companion, 2), true, -272719022), 252);
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
                            r8lambdaunavo3sxub_pc9xroryotnrlvsm5.getClass();
                            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist5 = new setSupportCompoundDrawablesTintList(0);
                            setsupportcompounddrawablestintlist5.write = androidPaint_androidKtWhenMappings;
                            setsupportcompounddrawablestintlist5.RemoteActionCompatParcelizer(fromString.UnexpectedError.getCode());
                            final int i9 = 1;
                            BaseCardView.IconCompatParcelizer(relativelineto, "PassError/{passErrorType}", (List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new addArc("passErrorType", setsupportcompounddrawablestintlist5.read())}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()), new DragAndDropTargetModifierNode(new PassErrorScreenKt$$ExternalSyntheticLambda4(r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 0, r8lambdaunavo3sxub_pc9xroryotnrlvsm5), true, 1086662795), 252);
                            af afVar2 = new af(relativemoveto2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, 2);
                            b2 b2Var3 = new b2(getcontentviewgroupparentlayout2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 3);
                            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: o.ActivityHandler47
                                private static int read = 0;
                                private static int serializer = 1;

                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj19) {
                                    int i10 = 2 % 2;
                                    int i11 = i9;
                                    createFromParcel createfromparcel = createFromParcel.INSTANCE;
                                    relativeMoveTo relativemoveto3 = relativemoveto2;
                                    getContentViewGroupParentLayout getcontentviewgroupparentlayout3 = getcontentviewgroupparentlayout2;
                                    ActivityHandler44 activityHandler44 = (ActivityHandler44) obj19;
                                    Object obj20 = null;
                                    if (i11 == 0) {
                                        activityHandler44.getClass();
                                        BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 0), 3);
                                        int i12 = read + 91;
                                        serializer = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                        int i13 = i12 % 2;
                                        return createfromparcel;
                                    }
                                    activityHandler44.getClass();
                                    BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout3, null, null, new AccountCreationScreenKt$AccountCreationScreen$6$1$1$3$1(relativemoveto3, activityHandler44, null, 1), 3);
                                    int i14 = serializer + 49;
                                    read = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                    if (i14 % 2 == 0) {
                                        return createfromparcel;
                                    }
                                    obj20.hashCode();
                                    throw null;
                                }
                            };
                            toAndroidVertexModeJOOmi9M toandroidvertexmodejoomi9m = new toAndroidVertexModeJOOmi9M(getcontentviewgroupparentlayout2, relativemoveto2, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, populateViewStructure_androidKtpopulate8, snackbarHostState2, 11);
                            accessgetTextCentercp accessgettextcentercp = new accessgetTextCentercp(12);
                            NafathLogger$$ExternalSyntheticLambda0 nafathLogger$$ExternalSyntheticLambda0 = new NafathLogger$$ExternalSyntheticLambda0(22);
                            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist6 = new setSupportCompoundDrawablesTintList(0);
                            setsupportcompounddrawablestintlist6.write = androidPaint_androidKtWhenMappings;
                            setsupportcompounddrawablestintlist6.RemoteActionCompatParcelizer("");
                            addArc addarc4 = new addArc("otpPhoneNumber", setsupportcompounddrawablestintlist6.read());
                            setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist7 = new setSupportCompoundDrawablesTintList(0);
                            setsupportcompounddrawablestintlist7.write = androidPaint_androidKtWhenMappings;
                            setsupportcompounddrawablestintlist7.RemoteActionCompatParcelizer("");
                            BaseCardView.IconCompatParcelizer(relativelineto, "OtpVerification/{otpPhoneNumber}/{email}", androidx.sqlite.SQLite.read(addarc4, new addArc("email", setsupportcompounddrawablestintlist7.read())), new DragAndDropTargetModifierNode(new TwoFaNavigationImpl$$ExternalSyntheticLambda0(r8lambdaudhhxliolpu0hpccqh6voskpny4, nafathLogger$$ExternalSyntheticLambda0, b2Var3, accessgettextcentercp, r8lambdaunavo3sxub_pc9xroryotnrlvsm6, toandroidvertexmodejoomi9m, afVar2), true, -1437205072), 252);
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            int i10 = ParcelableVolumeInfo + 99;
                            PlaybackStateCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
                throwIllegalStateException.read(relativemoveto, str, modifierIconCompatParcelizer, null, null, null, null, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode, 0, 0, 1016);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createFromParcel.INSTANCE;
        }
        getPlatformAndroidManager getplatformandroidmanager = (getPlatformAndroidManager) obj17;
        getPlatformAndroidManager getplatformandroidmanager2 = (getPlatformAndroidManager) obj16;
        sensitiveContentdefault sensitivecontentdefault = (sensitiveContentdefault) obj13;
        getPlatformAndroidManager getplatformandroidmanager3 = (getPlatformAndroidManager) obj15;
        SignInDataStore signInDataStore = (SignInDataStore) obj12;
        drawTextLVfH_YUdefault drawtextlvfh_yudefault = (drawTextLVfH_YUdefault) obj11;
        drawTextLVfH_YU drawtextlvfh_yu = (drawTextLVfH_YU) obj10;
        accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans = (accessstripNonMetricAffectingCharacterStyleSpans) obj9;
        TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0 = (TncComposableFactoryImpl$$ExternalSyntheticLambda0) obj8;
        getPlatformAndroidManager getplatformandroidmanager4 = (getPlatformAndroidManager) obj14;
        N$b n$b = (N$b) obj7;
        TextPainterKt textPainterKt = (TextPainterKt) obj6;
        SignInDataStore signInDataStore2 = (SignInDataStore) obj5;
        com.huawei.wisesecurity.ucs_credential.p0 p0Var = (com.huawei.wisesecurity.ucs_credential.p0) obj4;
        getShouldCreateCompositionOnAttachedToWindow getshouldcreatecompositiononattachedtowindow = (getShouldCreateCompositionOnAttachedToWindow) obj;
        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        getshouldcreatecompositiononattachedtowindow.getClass();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= ((getPostalCode) getbirthdatefull2).read(getshouldcreatecompositiononattachedtowindow) ? 4 : 2;
        }
        if ((iIntValue2 & 19) != 18) {
            int i5 = ResultReceiver + 117;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
        if (getpostalcode2.write(iIntValue2 & 1, z)) {
            onHideTranslationui onhidetranslationui = (onHideTranslationui) getplatformandroidmanager;
            androidx.compose.material3.BottomSheetScaffoldKt.m112BottomSheetScaffoldsdMYb0k(coil3.ExtrasKt.write(1418823030, new dividedefault(onhidetranslationui, getplatformandroidmanager2, getplatformandroidmanager4, n$b, textPainterKt, signInDataStore2, p0Var, 1), getpostalcode2), null, sensitivecontentdefault, onhidetranslationui.serializer() > 0 ? androidx.compose.ui.unit.Dp.m3673constructorimpl(((getWindow) getshouldcreatecompositiononattachedtowindow).serializer() * 0.5f) : androidx.compose.ui.unit.Dp.m3673constructorimpl(((onHideTranslationui) getplatformandroidmanager2).serializer()), 0.0f, null, ((buildMapping) getpostalcode2.write((getNewPassword) performMeasureDjhGOtQ.RemoteActionCompatParcelizer)).getPopupTheme(), 0L, 0.0f, 0.0f, drawTextJFhB2K4default.write, false, null, androidx.compose.ui.graphics.Color.Companion.m757getTransparent0d7_KjU(), 0L, getpostalcode2, 6, 1597446);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.Companion;
            androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
            androidx.compose.ui.Alignment topEnd = companion2.getTopEnd();
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.serializer;
            FloatingContentKt.FloatingContent(getplatformandroidmanager3, signInDataStore, drawtextlvfh_yudefault, boxScopeInstance.align(companion, topEnd), getpostalcode2, 6);
            androidx.compose.ui.Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getBottomCenter());
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = new TextMeasurerHelperKt(getplatformandroidmanager4, 0);
                getpostalcode2.write(objComponentActivity2);
            }
            OverlayFooterKt.OverlayStickyFooter(drawtextlvfh_yu, accessstripnonmetricaffectingcharacterstylespans, tncComposableFactoryImpl$$ExternalSyntheticLambda0, androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(modifierAlign, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2), getpostalcode2, 0);
            androidx.compose.material3.SheetState sheetState = sensitivecontentdefault.write;
            boolean z6 = getpostalcode2.read(sensitivecontentdefault);
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (z6 || objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = new BridgeManager$trackEvent$2(sensitivecontentdefault, getplatformandroidmanager3, (ShortNewsContentCardView) null, 11);
                getpostalcode2.write(objComponentActivity3);
            }
            getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2, sheetState, (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) objComponentActivity3);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = ResultReceiver + 117;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return createFromParcel.INSTANCE;
    }
}
