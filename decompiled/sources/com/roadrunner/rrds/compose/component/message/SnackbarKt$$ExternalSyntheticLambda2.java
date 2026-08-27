package com.roadrunner.rrds.compose.component.message;

import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.ComposeView;
import androidx.sqlite.SQLite;
import coil3.ExtrasKt;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.reason.AmountChangingReasonDialogFragment;
import com.roadrunner.delivery.pickupdropoff.tasks.model.CashPaymentTaskUiItem;
import com.roadrunner.home.nest.NestFragment$onCreateView$1$1$1$1;
import com.roadrunner.settings.subscreens.navigation.NavigationSettingsFragment;
import com.roadrunner.settings.ui.components.NavigationSettingsDialogKt;
import com.roadrunner.settings.ui.screens.NavigationSettingsScreenKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import com.roadrunner.tnc.TncContentKt$$ExternalSyntheticLambda1;
import java.util.WeakHashMap;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TooltipKt;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getQueryContext;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o;
import o.r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.registerInAppMessageManagerlambda0;
import o.setRoundRectOutlineTNW_H78default;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class SnackbarKt$$ExternalSyntheticLambda2 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ SnackbarKt$$ExternalSyntheticLambda2(n0 n0Var, CashPaymentTaskUiItem.Reasons reasons, AmountChangingReasonDialogFragment amountChangingReasonDialogFragment) {
        this.write = 1;
        this.serializer = reasons;
        this.RemoteActionCompatParcelizer = amountChangingReasonDialogFragment;
    }

    public /* synthetic */ SnackbarKt$$ExternalSyntheticLambda2(Object obj, int i, Object obj2) {
        this.write = i;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x0198  */
    private final Object invoke$com$roadrunner$settings$subscreens$navigation$NavigationSettingsFragment$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        int i = 2 % 2;
        NavigationSettingsFragment navigationSettingsFragment = (NavigationSettingsFragment) this.serializer;
        ComposeView composeView = (ComposeView) this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i2 = read + 45;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7Write = ExtrasKt.write(navigationSettingsFragment.serializer().MediaSessionCompatResultReceiverWrapper, getpostalcode, 0);
            Modifier.Companion companion = Modifier.Companion;
            WeakHashMap weakHashMap = TooltipKt.serializer;
            Modifier modifierIconCompatParcelizer = PaddingKt.IconCompatParcelizer(companion, OffsetKt.read(setRoundRectOutlineTNW_H78default.read(getpostalcode).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, getpostalcode));
            r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o r8lambdavvrejdwf2brhzpg2b8cht1nsk8o = (r8lambdaVVReJdWF2brhZpg2b8Cht1nsK8o) populateViewStructure_androidKtpopulate7Write.getValue();
            r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer = navigationSettingsFragment.serializer();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            Object obj3 = null;
            if (zIconCompatParcelizer) {
                objComponentActivity = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onClose", "onClose()V", 0, 13);
                getpostalcode.write(objComponentActivity);
            } else {
                int i4 = read + 3;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                if (i4 % 2 != 0) {
                    obj3.hashCode();
                    throw null;
                }
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onClose", "onClose()V", 0, 13);
                    getpostalcode.write(objComponentActivity);
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda0 = (registerInAppMessageManagerlambda0) objComponentActivity;
            r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer2 = navigationSettingsFragment.serializer();
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer2);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                objComponentActivity2 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer2, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNavigationTypeChange", "onNavigationTypeChange(Lcom/roadrunner/delivery/ontheway/turnbyturn/analytics/api/NavigationAppOption;)V", 0, 1);
                getpostalcode.write(objComponentActivity2);
            } else {
                int i5 = read + 85;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 10 / 0;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer2, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNavigationTypeChange", "onNavigationTypeChange(Lcom/roadrunner/delivery/ontheway/turnbyturn/analytics/api/NavigationAppOption;)V", 0, 1);
                        getpostalcode.write(objComponentActivity2);
                    }
                } else if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer2, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNavigationTypeChange", "onNavigationTypeChange(Lcom/roadrunner/delivery/ontheway/turnbyturn/analytics/api/NavigationAppOption;)V", 0, 1);
                    getpostalcode.write(objComponentActivity2);
                }
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda1 = (registerInAppMessageManagerlambda0) objComponentActivity2;
            r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer3 = navigationSettingsFragment.serializer();
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer3);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                NestFragment$onCreateView$1$1$1$1 nestFragment$onCreateView$1$1$1$1 = new NestFragment$onCreateView$1$1$1$1(3, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer3, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNavigationOptionsSwitchItemChange", "onNavigationOptionsSwitchItemChange(Lcom/roadrunner/settings/PreferenceItem$SwitchPreferenceItem$PreferenceKey;ZZ)V", 0, 12);
                getpostalcode.write(nestFragment$onCreateView$1$1$1$1);
                objComponentActivity3 = nestFragment$onCreateView$1$1$1$1;
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda2 = (registerInAppMessageManagerlambda0) objComponentActivity3;
            r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer4 = navigationSettingsFragment.serializer();
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer4);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (!zIconCompatParcelizer4) {
                int i7 = read + 85;
                IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer4, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onMapboxMetricsChange", "onMapboxMetricsChange(Z)V", 0, 2);
                    getpostalcode.write(objComponentActivity4);
                }
            } else {
                objComponentActivity4 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer4, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onMapboxMetricsChange", "onMapboxMetricsChange(Z)V", 0, 2);
                getpostalcode.write(objComponentActivity4);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda3 = (registerInAppMessageManagerlambda0) objComponentActivity4;
            r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer5 = navigationSettingsFragment.serializer();
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer5);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer5 || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new JobKt__JobKt$invokeOnCompletion$1(1, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer5, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNaverRoutePreviewChange", "onNaverRoutePreviewChange(Z)V", 0, 3);
                getpostalcode.write(objComponentActivity5);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda4 = (registerInAppMessageManagerlambda0) objComponentActivity5;
            r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer6 = navigationSettingsFragment.serializer();
            boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer6);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer6 || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer6, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNaverRoutePreviewInfoClicked", "onNaverRoutePreviewInfoClicked()V", 0, 14);
                getpostalcode.write(objComponentActivity6);
            }
            registerInAppMessageManagerlambda0 registerinappmessagemanagerlambda5 = (registerInAppMessageManagerlambda0) objComponentActivity6;
            r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94 r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer7 = navigationSettingsFragment.serializer();
            boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer7);
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer7) {
                objComponentActivity7 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer7, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNaverRoutePreviewDismissed", "onNaverRoutePreviewDismissed()V", 0, 15);
                getpostalcode.write(objComponentActivity7);
            } else {
                int i9 = IconCompatParcelizer + 15;
                read = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (objComponentActivity7 == androidContentCaptureManager) {
                    objComponentActivity7 = new SettingsScreenKt$SettingsScreen$2$1(0, r8lambdawf0f8_ok6qhelc2navzsyrule94Serializer7, r8lambdaWF0F8_Ok6qHeLC2nAVzsyRuLe94.class, "onNaverRoutePreviewDismissed", "onNaverRoutePreviewDismissed()V", 0, 15);
                    getpostalcode.write(objComponentActivity7);
                }
            }
            NavigationSettingsScreenKt.NavigationSettingsScreen(r8lambdavvrejdwf2brhzpg2b8cht1nsk8o, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda0, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda1, (r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY) registerinappmessagemanagerlambda2, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda3, modifierIconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) registerinappmessagemanagerlambda4, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) registerinappmessagemanagerlambda5, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity7), getpostalcode, 0);
            NavigationSettingsDialogKt.NavigationSettingsDialog(navigationSettingsFragment.serializer().RemoteActionCompatParcelizer, null, getpostalcode, 0);
            getQueryContext getquerycontext = navigationSettingsFragment.serializer().ParcelableVolumeInfo;
            boolean zIconCompatParcelizer8 = getpostalcode.IconCompatParcelizer(navigationSettingsFragment);
            boolean zIconCompatParcelizer9 = getpostalcode.IconCompatParcelizer(composeView);
            Object objComponentActivity8 = getpostalcode.ComponentActivity();
            if ((zIconCompatParcelizer8 | zIconCompatParcelizer9) || objComponentActivity8 == androidContentCaptureManager) {
                objComponentActivity8 = new TncContentKt$$ExternalSyntheticLambda1(navigationSettingsFragment, 14, composeView);
                getpostalcode.write(objComponentActivity8);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity8, getpostalcode, 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:264:0x0945 A[PHI: r7
  0x0945: PHI (r7v33 o.makeTreedefault) = (r7v32 o.makeTreedefault), (r7v42 o.makeTreedefault) binds: [B:263:0x0943, B:260:0x093a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:266:0x0949  */
    /* JADX WARN: Code duplicated, block: B:269:0x0955  */
    /* JADX WARN: Code duplicated, block: B:277:0x096c  */
    /* JADX WARN: Code duplicated, block: B:289:0x0995  */
    /* JADX WARN: Code duplicated, block: B:292:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:299:0x09bd  */
    /* JADX WARN: Code duplicated, block: B:302:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:304:0x09d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:307:0x09df  */
    /* JADX WARN: Code duplicated, block: B:309:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:324:0x0a3b  */
    /* JADX WARN: Code duplicated, block: B:326:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:406:0x095e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [o.instance_delegatelambda0] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v36 java.lang.Object, still in use, count: 2, list:
          (r8v36 java.lang.Object) from 0x098a: INSTANCE_OF (r8v36 java.lang.Object) A[WRAPPED] (LINE:2338) o.boundsOfLayoutNode
          (r8v36 java.lang.Object) from 0x0990: PHI (r8 I:??) = (r8v32 java.lang.Object), (r8v36 java.lang.Object) binds: [B:285:0x098f, B:404:0x0990] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final java.lang.Object invoke(java.lang.Object r54, java.lang.Object r55) {
        /*
            Method dump skipped, instruction units count: 3182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.rrds.compose.component.message.SnackbarKt$$ExternalSyntheticLambda2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
