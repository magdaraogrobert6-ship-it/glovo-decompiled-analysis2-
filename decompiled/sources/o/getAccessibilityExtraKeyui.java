package o;

import android.content.Context;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda12;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import com.roadrunner.database.dao.SessionDao_Impl$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.accept.bottomsheet.overlay.presentation.AcceptBottomSheetKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.face.verification.presentation.identitypopup.compose.IdentityPopupContentKt;
import com.roadrunner.login.presentation.countryselection.compose.CountrySelectionKt;
import com.roadrunner.rrds.compose.component.buttons.PrimaryKt;
import com.roadrunner.rrds.compose.component.navigations.HeaderKt;
import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import com.sentiance.core.model.events.N$b;
import io.sentry.SentryUUID;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okio.Okio;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class getAccessibilityExtraKeyui implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object MediaSessionCompatQueueItem;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 write;

    public /* synthetic */ getAccessibilityExtraKeyui(androidx.compose.ui.Modifier modifier, SwitchKt switchKt, setStatusBarBackgroundResource setstatusbarbackgroundresource, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1) {
        this.RemoteActionCompatParcelizer = 3;
        this.IconCompatParcelizer = modifier;
        this.read = switchKt;
        this.MediaSessionCompatQueueItem = setstatusbarbackgroundresource;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
    }

    public /* synthetic */ getAccessibilityExtraKeyui(com.huawei.agconnect.config.impl.m mVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, getMergePolicyui getmergepolicyui) {
        this.RemoteActionCompatParcelizer = 0;
        this.IconCompatParcelizer = mVar;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.MediaSessionCompatQueueItem = getmergepolicyui;
    }

    public /* synthetic */ getAccessibilityExtraKeyui(a5ExternalSyntheticLambda0 a5externalsyntheticlambda0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, String str, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        this.RemoteActionCompatParcelizer = 4;
        this.IconCompatParcelizer = a5externalsyntheticlambda0;
        this.read = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.serializer = str;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.MediaSessionCompatQueueItem = r8lambdaunavo3sxub_pc9xroryotnrlvsm2;
    }

    public /* synthetic */ getAccessibilityExtraKeyui(configConnectionForGET configconnectionforget, androidx.compose.ui.Modifier modifier, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2) {
        this.RemoteActionCompatParcelizer = 5;
        this.IconCompatParcelizer = configconnectionforget;
        this.read = modifier;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.serializer = r8lambdardpfsr94j4iebcwx_kpqzpm8k1;
        this.MediaSessionCompatQueueItem = r8lambdardpfsr94j4iebcwx_kpqzpm8k2;
    }

    public /* synthetic */ getAccessibilityExtraKeyui(Object obj, Object obj2, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, Object obj3, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = obj;
        this.serializer = obj2;
        this.read = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
        this.MediaSessionCompatQueueItem = obj3;
        this.write = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x067c  */
    /* JADX WARN: Code duplicated, block: B:117:0x06b5  */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v51 */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        ?? r0;
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.write;
        AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj3 = this.MediaSessionCompatQueueItem;
        Object obj4 = this.serializer;
        Object obj5 = this.read;
        Object obj6 = this.IconCompatParcelizer;
        boolean z = false;
        if (i2 == 0) {
            com.huawei.agconnect.config.impl.m mVar = (com.huawei.agconnect.config.impl.m) obj6;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
            getMergePolicyui getmergepolicyui = (getMergePolicyui) obj3;
            getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
            int iIntValue = ((Integer) obj2).intValue();
            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
            if (getpostalcode.write(1 & iIntValue, (iIntValue & 3) != 2)) {
                Context context = (Context) getpostalcode.write((getNewPassword) androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                times7Ah8Wj8 times7ah8wj8 = new times7Ah8Wj8(2);
                boolean z2 = getpostalcode.read(mVar);
                boolean z3 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                boolean z4 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (!(z2 | z3) && !z4) {
                    int i3 = RatingCompat + 29;
                    MediaDescriptionCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                    if (objComponentActivity == androidContentCaptureManager) {
                        objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(mVar, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 24);
                        getpostalcode.write(objComponentActivity);
                    }
                } else {
                    objComponentActivity = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda12(mVar, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 24);
                    getpostalcode.write(objComponentActivity);
                }
                addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistenerWrite = onBackPressedDispatcher_delegatelambda010.write(times7ah8wj8, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity, getpostalcode);
                times7Ah8Wj8 times7ah8wj9 = new times7Ah8Wj8(2);
                boolean z5 = getpostalcode.read(mVar);
                boolean z6 = getpostalcode.read(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (!z5 && !z6) {
                    int i5 = RatingCompat + 91;
                    MediaDescriptionCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        Object obj7 = null;
                        obj7.hashCode();
                        throw null;
                    }
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new SessionDao_Impl$$ExternalSyntheticLambda1(mVar, 4, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                        getpostalcode.write(objComponentActivity2);
                    }
                } else {
                    objComponentActivity2 = new SessionDao_Impl$$ExternalSyntheticLambda1(mVar, 4, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
                    getpostalcode.write(objComponentActivity2);
                }
                addOnPictureInPictureUiStateChangedListener addonpictureinpictureuistatechangedlistenerWrite2 = onBackPressedDispatcher_delegatelambda010.write(times7ah8wj9, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity2, getpostalcode);
                getQueryContext getquerycontext = ((isImportantForAccessibilityui) getmergepolicyui).read;
                boolean z7 = getpostalcode.read(mVar);
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(context);
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(addonpictureinpictureuistatechangedlistenerWrite2);
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(addonpictureinpictureuistatechangedlistenerWrite);
                boolean z8 = getpostalcode.read(r8lambdardpfsr94j4iebcwx_kpqzpm8k1);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if ((z7 | zIconCompatParcelizer | zIconCompatParcelizer2 | zIconCompatParcelizer3 | z8) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new toAndroidVertexModeJOOmi9M(mVar, context, addonpictureinpictureuistatechangedlistenerWrite2, addonpictureinpictureuistatechangedlistenerWrite, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, 5);
                    getpostalcode.write(objComponentActivity3);
                }
                androidx.sqlite.SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity3, getpostalcode, 8);
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 1) {
            androidx.compose.ui.Modifier modifier = (androidx.compose.ui.Modifier) obj6;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) obj4;
            DragAndDropTargetModifierNode dragAndDropTargetModifierNode = (DragAndDropTargetModifierNode) obj5;
            androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider basicTextContextMenuProvider = (androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider) obj3;
            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
            int iIntValue2 = ((Integer) obj2).intValue();
            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
            if (getpostalcode2.write(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                int i6 = RatingCompat + 83;
                MediaDescriptionCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i7 = i6 % 2;
                Object objComponentActivity4 = getpostalcode2.ComponentActivity();
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new SelectionMagnifierKt(populateViewStructure_androidKtpopulate7, 3);
                    getpostalcode2.write(objComponentActivity4);
                }
                androidx.compose.ui.Modifier modifierOnGloballyPositioned = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4);
                androidx.compose.ui.layout.MeasurePolicy measurePolicy = androidx.compose.foundation.layout.BoxKt.read(androidx.compose.ui.Alignment.Companion.getTopStart(), true);
                int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode2, modifierOnGloballyPositioned);
                androidx.compose.ui.node.ComposeUiNode.Companion companion = androidx.compose.ui.node.ComposeUiNode.Companion;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion.getConstructor();
                if (getpostalcode2.read == null) {
                    SentryUUID.write();
                    throw null;
                }
                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode2.ComponentActivity) {
                    getpostalcode2.serializer(constructor);
                } else {
                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                af$$ExternalSyntheticOutline0.m(companion, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
                dragAndDropTargetModifierNode.invoke(getpostalcode2, 0);
                basicTextContextMenuProvider.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, getpostalcode2, 6);
                getpostalcode2.IconCompatParcelizer(true);
            } else {
                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 == 2) {
            accessisEllipsisMW5ApA accessisellipsismw5apa = (accessisEllipsisMW5ApA) obj6;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj4;
            TncComposableFactoryImpl$$ExternalSyntheticLambda0 tncComposableFactoryImpl$$ExternalSyntheticLambda0 = (TncComposableFactoryImpl$$ExternalSyntheticLambda0) obj5;
            executeRequestimpl executerequestimpl = (executeRequestimpl) obj3;
            getBirthDateFull getbirthdatefull3 = (getBirthDateFull) obj;
            int iIntValue3 = ((Integer) obj2).intValue();
            boolean z9 = (iIntValue3 & 3) != 2;
            int i8 = RatingCompat + 107;
            MediaDescriptionCompat = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i9 = i8 % 2;
            getPostalCode getpostalcode3 = (getPostalCode) getbirthdatefull3;
            if (getpostalcode3.write(iIntValue3 & 1, z9)) {
                drawTextd8rzKo drawtextd8rzko = accessisellipsismw5apa.MediaSessionCompatQueueItem;
                getcontentviewgroupparentlayout.getClass();
                Object objWrite = drawtextd8rzko.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write();
                objWrite.getClass();
                drawTextLVfH_YU drawtextlvfh_yu = new drawTextLVfH_YU(getcontentviewgroupparentlayout, (fastMapTo) objWrite);
                accessstripNonMetricAffectingCharacterStyleSpans accessstripnonmetricaffectingcharacterstylespans = accessisellipsismw5apa.serializer;
                drawTextLVfH_YUdefault drawtextlvfh_yudefault = accessisellipsismw5apa.IconCompatParcelizer;
                Object objWrite2 = accessisellipsismw5apa.read.IconCompatParcelizer.RemoteActionCompatParcelizer.write();
                objWrite2.getClass();
                SignInDataStore signInDataStore = new SignInDataStore((isSegmentInside) objWrite2, getcontentviewgroupparentlayout);
                AnalyticsServiceImpl analyticsServiceImpl = (AnalyticsServiceImpl) ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) accessisellipsismw5apa.RemoteActionCompatParcelizer.read.serializer).write();
                getcontentviewgroupparentlayout.getClass();
                N$b n$b = new N$b();
                n$b.read = analyticsServiceImpl;
                MutableStateFlow mutableStateFlow = StateFlowKt.read(kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.RemoteActionCompatParcelizer);
                n$b.write = mutableStateFlow;
                n$b.IconCompatParcelizer = mutableStateFlow;
                BuildersKt.RemoteActionCompatParcelizer(getcontentviewgroupparentlayout, null, null, new SignInDataStore$set$2(n$b, getcontentviewgroupparentlayout, (ShortNewsContentCardView) null, 19), 3);
                AcceptBottomSheetKt.AcceptBottomSheet(drawtextlvfh_yu, accessstripnonmetricaffectingcharacterstylespans, drawtextlvfh_yudefault, signInDataStore, n$b, accessisellipsismw5apa.write, new SignInDataStore((AnalyticsServiceImpl) ((r8lambdazpHrebeZ5dkHsk62AZggxj52Jpo) accessisellipsismw5apa.RatingCompat.RemoteActionCompatParcelizer.serializer).write(), getcontentviewgroupparentlayout), accessisellipsismw5apa.MediaMetadataCompat, tncComposableFactoryImpl$$ExternalSyntheticLambda0, executerequestimpl, null, this.write, getpostalcode3, 0, 0);
            } else {
                getpostalcode3.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                configConnectionForGET configconnectionforget = (configConnectionForGET) obj6;
                androidx.compose.ui.Modifier modifier2 = (androidx.compose.ui.Modifier) obj5;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3;
                getBirthDateFull getbirthdatefull4 = (getBirthDateFull) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                getPostalCode getpostalcode4 = (getPostalCode) getbirthdatefull4;
                if (getpostalcode4.write(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    boolean z10 = configconnectionforget.RemoteActionCompatParcelizer;
                    androidx.compose.ui.Modifier modifierM75height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(modifier2, Dimensions.invalidateMenu);
                    Object objComponentActivity5 = getpostalcode4.ComponentActivity();
                    if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new BrazeInAppMessageManagerExternalSyntheticLambda45(2);
                        getpostalcode4.write(objComponentActivity5);
                    }
                    androidx.compose.animation.AnimatedContentKt.write(Boolean.valueOf(z10), modifierM75height3ABfNKs, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity5, null, "Slider Loader Animation", null, coil3.ExtrasKt.write(-1969516400, new LogSqliteDrivernewTransaction2(configconnectionforget, this.write, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, 2), getpostalcode4), getpostalcode4, 1597824, 40);
                } else {
                    getpostalcode4.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                }
                return createfromparcel;
            }
            a5ExternalSyntheticLambda0 a5externalsyntheticlambda0 = (a5ExternalSyntheticLambda0) obj6;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj5;
            String str = (String) obj4;
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) obj3;
            getBirthDateFull getbirthdatefull5 = (getBirthDateFull) obj;
            int iIntValue5 = ((Integer) obj2).intValue();
            if ((iIntValue5 & 3) != 2) {
                int i10 = RatingCompat + 71;
                MediaDescriptionCompat = i10 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i11 = i10 % 2;
                z = true;
            }
            getPostalCode getpostalcode5 = (getPostalCode) getbirthdatefull5;
            if (getpostalcode5.write(iIntValue5 & 1, z)) {
                int i12 = RatingCompat + 37;
                MediaDescriptionCompat = i12 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i13 = i12 % 2;
                CountrySelectionKt.CountrySelection(a5externalsyntheticlambda0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, str, this.write, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, androidx.compose.ui.Modifier.Companion.then(androidx.compose.foundation.layout.SizeKt.read), getpostalcode5, 196608);
            } else {
                getpostalcode5.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            }
            return createfromparcel;
        }
        androidx.compose.ui.Modifier modifier3 = (androidx.compose.ui.Modifier) obj6;
        SwitchKt switchKt = (SwitchKt) obj5;
        setStatusBarBackgroundResource setstatusbarbackgroundresource = (setStatusBarBackgroundResource) obj3;
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj4;
        getBirthDateFull getbirthdatefull6 = (getBirthDateFull) obj;
        int iIntValue6 = ((Integer) obj2).intValue();
        getPostalCode getpostalcode6 = (getPostalCode) getbirthdatefull6;
        if (!(!getpostalcode6.write(iIntValue6 & 1, (iIntValue6 & 3) != 2))) {
            int i14 = RatingCompat + 123;
            MediaDescriptionCompat = i14 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i14 % 2 != 0) {
                androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(modifier3, switchKt);
                String str2 = setstatusbarbackgroundresource.IconCompatParcelizer;
                throw null;
            }
            androidx.compose.ui.Modifier modifierIconCompatParcelizer = androidx.compose.foundation.layout.PaddingKt.IconCompatParcelizer(modifier3, switchKt);
            String str3 = setstatusbarbackgroundresource.IconCompatParcelizer;
            if (str3 == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("url must be set");
                return null;
            }
            boolean z11 = setstatusbarbackgroundresource.serializer;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = this.write;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k5.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
            androidx.compose.foundation.ScrollState scrollState = PagerWrapperFlingBehavior.read(0, getpostalcode6, 1);
            androidx.compose.ui.Modifier modifierThen = modifierIconCompatParcelizer.then(androidx.compose.foundation.layout.SizeKt.read);
            setCurrentSemanticsNodesui setcurrentsemanticsnodesui = performMeasureDjhGOtQ.RemoteActionCompatParcelizer;
            androidx.compose.ui.Modifier modifierM20backgroundbw27NRU = androidx.compose.foundation.BackgroundKt.m20backgroundbw27NRU(modifierThen, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).IconCompatParcelizer(), androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape());
            FlingCancellationException flingCancellationException = androidx.compose.foundation.layout.Arrangement.MediaDescriptionCompat;
            androidx.compose.ui.Alignment.Companion companion2 = androidx.compose.ui.Alignment.Companion;
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode6, 0);
            int iHashCode2 = Long.hashCode(getpostalcode6.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer2 = getpostalcode6.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode6, modifierM20backgroundbw27NRU);
            androidx.compose.ui.node.ComposeUiNode.Companion companion3 = androidx.compose.ui.node.ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor2 = companion3.getConstructor();
            if (getpostalcode6.read == null) {
                SentryUUID.write();
                throw null;
            }
            getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode6.ComponentActivity) {
                getpostalcode6.serializer(constructor2);
            } else {
                getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode6, modalBottomSheetYbuCTN8Serializer, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer2);
            AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier2, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode6, Integer.valueOf(iHashCode2), getpostalcode6));
            if (z11) {
                int i15 = RatingCompat + 37;
                MediaDescriptionCompat = i15 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i16 = i15 % 2;
                getpostalcode6.serializer(365727481);
                androidx.compose.ui.Modifier modifierWrite = androidx.compose.foundation.layout.SizeKt.write(androidx.compose.ui.Modifier.Companion, 1.0f);
                supportingTextPaddinga9UjIt4material3default supportingtextpaddinga9ujit4material3defaultSerializer = TextFieldDefaults.serializer(androidx.compose.foundation.layout.Arrangement.RemoteActionCompatParcelizer, companion2.getTop(), getpostalcode6, 6);
                int iHashCode3 = Long.hashCode(getpostalcode6.RatingCompat);
                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer3 = getpostalcode6.serializer();
                androidx.compose.ui.Modifier modifierMaterializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode6, modifierWrite);
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor3 = companion3.getConstructor();
                getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                if (getpostalcode6.ComponentActivity) {
                    int i17 = RatingCompat + 11;
                    MediaDescriptionCompat = i17 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    getpostalcode6.serializer(constructor3);
                } else {
                    getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                }
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(companion3, getpostalcode6, supportingtextpaddinga9ujit4material3defaultSerializer, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer3);
                AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier3, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode6, Integer.valueOf(iHashCode3), getpostalcode6));
                HeaderKt.m5063HeaderbbrV0mI(null, null, null, 0L, 0.0f, null, coil3.ExtrasKt.write(580480366, new DefaultLazyKey(10, r8lambdardpfsr94j4iebcwx_kpqzpm8k4), getpostalcode6), null, null, getpostalcode6, 1572864, 447);
                getpostalcode6.IconCompatParcelizer(true);
                r0 = 0;
                getpostalcode6.IconCompatParcelizer(false);
            } else {
                r0 = 0;
                getpostalcode6.serializer(366269485);
                getpostalcode6.IconCompatParcelizer(false);
            }
            androidx.compose.ui.Modifier.Companion companion4 = androidx.compose.ui.Modifier.Companion;
            float f = Dimensions.getAnimatedVisibility;
            androidx.compose.ui.Modifier modifierM73paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m73paddingVpY3zN4$default(companion4, f, 0.0f, 2);
            androidx.compose.ui.Modifier modifierThen2 = PagerWrapperFlingBehavior.IconCompatParcelizer(modifierM73paddingVpY3zN4$default, scrollState, r0, 14).then(new show(1.0f, true));
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer2 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode6, r0);
            int iHashCode4 = Long.hashCode(getpostalcode6.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer4 = getpostalcode6.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode6, modifierThen2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor4 = companion3.getConstructor();
            getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (!getpostalcode6.ComponentActivity) {
                getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            } else {
                int i19 = RatingCompat + 35;
                MediaDescriptionCompat = i19 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i20 = i19 % 2;
                getpostalcode6.serializer(constructor4);
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode6, modalBottomSheetYbuCTN8Serializer2, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer4);
            AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier4, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode6, Integer.valueOf(iHashCode4), getpostalcode6));
            companion4.getClass();
            getNonZeroRgk1Os.write(Integer.valueOf(com.logistics.rider.glovo.R.drawable.img_medium_brand_selfie), "This is an image that is part of the instruction section", companion4, Okio.RemoteActionCompatParcelizer(com.logistics.rider.glovo.R.drawable.ic_selfie_medium, getpostalcode6, 0), null, null, null, null, androidx.compose.ui.layout.ContentScale.Companion.getNone(), null, getpostalcode6, (androidx.compose.ui.graphics.painter.Painter.$stable << 9) | 432, 6, 31728);
            float f2 = Dimensions.setTabContainer;
            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion4, f2)});
            androidx.compose.material3.TextKt.m131TextNvy7gAk(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.identity_verification_popup_title, getpostalcode6, 0), null, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.MediaSessionCompatResultReceiverWrapper(), getpostalcode6, 0, 0, 131066);
            float f3 = Dimensions.setStackedBackground;
            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m83size3ABfNKs(companion4, f3)});
            androidx.compose.material3.TextKt.m131TextNvy7gAk(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.identity_verification_popup_message, getpostalcode6, 0), null, ((buildMapping) getpostalcode6.write((getNewPassword) setcurrentsemanticsnodesui)).setPresenter(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, performLayout.IconCompatParcelizer(), getpostalcode6, 0, 0, 131066);
            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion4, f2)});
            IdentityPopupContentKt.IdentityWarning(0, getpostalcode6, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.identity_verification_popup_warning_mask, getpostalcode6, 0));
            IdentityPopupContentKt.IdentityWarning(0, getpostalcode6, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.identity_verification_popup_warning_helmet, getpostalcode6, 0));
            IdentityPopupContentKt.IdentityWarning(0, getpostalcode6, null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.identity_verification_popup_warning_sunglasses, getpostalcode6, 0));
            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion4, f2)});
            IdentityPopupContentKt.serializer(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.identity_verification_data_processed_according_to, getpostalcode6, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.identity_verification_privacy_statement, getpostalcode6, 0), str3, null, getpostalcode6, 0);
            getpostalcode6.IconCompatParcelizer(true);
            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion4, f3)});
            androidx.compose.ui.Modifier modifierWrite2 = androidx.compose.foundation.layout.SizeKt.write(modifierM73paddingVpY3zN4$default, 1.0f);
            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer3 = ModalBottomSheetKtModalBottomSheet311.serializer(flingCancellationException, companion2.getStart(), getpostalcode6, 0);
            int iHashCode5 = Long.hashCode(getpostalcode6.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer5 = getpostalcode6.serializer();
            androidx.compose.ui.Modifier modifierMaterializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(getpostalcode6, modifierWrite2);
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor5 = companion3.getConstructor();
            getpostalcode6.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode6.ComponentActivity) {
                getpostalcode6.serializer(constructor5);
            } else {
                getpostalcode6.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            c8$$ExternalSyntheticOutline0.m(companion3, getpostalcode6, modalBottomSheetYbuCTN8Serializer3, getpostalcode6, dragAndDropNodestartDragAndDropTransfer1Serializer5);
            AndroidContentCaptureManagerCompanion.write(getpostalcode6, modifierMaterializeModifier5, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode6, Integer.valueOf(iHashCode5), getpostalcode6));
            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion4, Dimensions.setSplitBackground)});
            PrimaryKt.write(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.logistics.rider.glovo.R.string.start_camera, getpostalcode6, 0), r8lambdardpfsr94j4iebcwx_kpqzpm8k5, androidx.compose.foundation.layout.SizeKt.write(companion4, 1.0f), true, false, null, null, null, null, null, getpostalcode6, 3456, 0, 2032);
            coil3.ExtrasKt.read(913837329, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), -913837326, handleUrlOverridelambda1.RemoteActionCompatParcelizer(), handleUrlOverridelambda1.RemoteActionCompatParcelizer(), new Object[]{getpostalcode6, androidx.compose.foundation.layout.SizeKt.m75height3ABfNKs(companion4, f)});
            getpostalcode6.IconCompatParcelizer(true);
            getpostalcode6.IconCompatParcelizer(true);
        } else {
            getpostalcode6.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createfromparcel;
    }
}
