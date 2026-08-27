package kotlin.text;

import androidx.compose.foundation.contextmenu.ContextMenuScope$$ExternalSyntheticLambda0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import coil3.ComponentRegistry$Builder;
import coil3.ExtrasKt;
import com.roadrunner.rrds.compose.component.screenstate.ErrorScreenKt;
import com.roadrunner.settings.ui.screens.SettingsScreenKt$SettingsScreen$2$1;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewContentKt;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment;
import com.roadrunner.sidemenu.photoId.preview.PhotoIdPreviewFragment$$ExternalSyntheticLambda1;
import com.roadrunner.sidemenu.presentation.SideMenuFragment;
import com.roadrunner.sidemenu.presentation.SideMenuViewModel;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingFragment$$ExternalSyntheticLambda0;
import com.roadrunner.startworking.oneclick.OneClickStartWorkingViewModel;
import com.roadrunner.vendor.review.presentation.VendorReviewFragment;
import com.roadrunner.vendor.review.presentation.VendorReviewScreenKt;
import com.sentiance.core.model.events.N$b;
import kotlinx.coroutines.JobKt__JobKt$invokeOnCompletion$1;
import o.AndroidContentCaptureManager;
import o.BrazeCompanion;
import o.BrazeExternalSyntheticLambda9;
import o.DragAndDropTargetModifierNode;
import o.ImageHeaderParserImageType;
import o._set_registeredPushToken_lambda1;
import o.accessgetEndpointProvidercp;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCreditCardExpirationMonth;
import o.getPostalCode;
import o.getQueryContext;
import o.handleInAppMessageTestPushandroid_sdk_base_release;
import o.logFeatureFlagImpressionlambda0;
import o.logPurchase;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.recordGeofenceTransitionlambda1;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.schedulePushDeliveryandroid_sdk_base_release;
import o.subscribeToBannersUpdateslambda1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class StringsKt__StringsKt$$ExternalSyntheticLambda1 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ StringsKt__StringsKt$$ExternalSyntheticLambda1(int i, Object obj) {
        this.read = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    private final Object RemoteActionCompatParcelizer(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        int i2 = write + 83;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        BrazeCompanion brazeCompanion = (BrazeCompanion) this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            z = true;
        } else {
            int i4 = write + 21;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            ErrorScreenKt.ErrorScreen(((BrazeExternalSyntheticLambda9) brazeCompanion).serializer, null, getpostalcode, 0, 2);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    private final Object write(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        PhotoIdPreviewFragment photoIdPreviewFragment = (PhotoIdPreviewFragment) this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = 1;
        if ((iIntValue & 3) != 2) {
            int i3 = IconCompatParcelizer + 43;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            _set_registeredPushToken_lambda1 _set_registeredpushtoken_lambda1 = (_set_registeredPushToken_lambda1) photoIdPreviewFragment.getNavigationEventDispatcher.MediaSessionCompatResultReceiverWrapper();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(photoIdPreviewFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer) {
                objComponentActivity = new PhotoIdPreviewFragment$$ExternalSyntheticLambda1(photoIdPreviewFragment, i2);
                getpostalcode.write(objComponentActivity);
            } else {
                int i5 = write + 107;
                IconCompatParcelizer = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
                    throw null;
                }
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = new PhotoIdPreviewFragment$$ExternalSyntheticLambda1(photoIdPreviewFragment, i2);
                    getpostalcode.write(objComponentActivity);
                }
            }
            PhotoIdPreviewContentKt.RemoteActionCompatParcelizer(_set_registeredpushtoken_lambda1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity, getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            int i6 = IconCompatParcelizer + 3;
            write = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
        return createFromParcel.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:java.lang.Object) from 0x006d: INVOKE (r12v2 ?? I:o.getPostalCode), (r0v1 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:69)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private final java.lang.Object invoke$com$roadrunner$settings$subscreens$appearance$AppearanceFragment$$ExternalSyntheticLambda1(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 1, list:
          (r0v1 ?? I:java.lang.Object) from 0x006d: INVOKE (r12v2 ?? I:o.getPostalCode), (r0v1 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:69)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    private final Object invoke$com$roadrunner$sidemenu$presentation$SideMenuFragment$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        Modifier modifier;
        int i;
        int i2 = 2 % 2;
        SideMenuFragment sideMenuFragment = (SideMenuFragment) this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        boolean z = false;
        if ((iIntValue & 3) != 2) {
            int i3 = IconCompatParcelizer + 65;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                z = true;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            SideMenuViewModel sideMenuViewModel = (SideMenuViewModel) sideMenuFragment.write.MediaSessionCompatResultReceiverWrapper();
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(sideMenuFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer || objComponentActivity == getCreditCardExpirationMonth.write) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, sideMenuFragment, SideMenuFragment.class, "handleActions", "handleActions(Lcom/roadrunner/sidemenu/presentation/model/SideMenuAction;)V", 0, 14);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity = jobKt__JobKt$invokeOnCompletion$1;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity);
            N$b n$b = sideMenuFragment.RemoteActionCompatParcelizer;
            if (n$b == null) {
                removeNodeAtDepth.serializer("itemsComposableFactory");
                throw null;
            }
            int i4 = IconCompatParcelizer + 77;
            write = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                modifier = null;
                i = 1;
            } else {
                modifier = null;
                i = 0;
            }
            accessgetEndpointProvidercp.RemoteActionCompatParcelizer(sideMenuViewModel, r8lambdaunavo3sxub_pc9xroryotnrlvsm, n$b, modifier, getpostalcode, i);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 ??, still in use, count: 1, list:
          (r6v7 ?? I:java.lang.Object) from 0x0077: INVOKE (r4v4 ?? I:o.getPostalCode), (r6v7 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:76)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private final java.lang.Object invoke$com$roadrunner$startworking$equipment$EquipmentBottomSheet$$ExternalSyntheticLambda1(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v7 ??, still in use, count: 1, list:
          (r6v7 ?? I:java.lang.Object) from 0x0077: INVOKE (r4v4 ?? I:o.getPostalCode), (r6v7 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:76)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    private final Object invoke$com$roadrunner$vendor$review$presentation$VendorReviewFragment$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        boolean z;
        int i = 2 % 2;
        VendorReviewFragment vendorReviewFragment = (VendorReviewFragment) this.RemoteActionCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if ((iIntValue & 3) != 2) {
            int i2 = IconCompatParcelizer + 53;
            write = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            z = true;
        } else {
            z = false;
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, z)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            getQueryContext getquerycontext = vendorReviewFragment.serializer().write;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(vendorReviewFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, vendorReviewFragment, VendorReviewFragment.class, "handleAction", "handleAction(Lcom/roadrunner/vendor/review/presentation/entity/VendorReviewAction;)V", 0, 21);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$1);
                objComponentActivity = jobKt__JobKt$invokeOnCompletion$1;
            } else {
                int i4 = write + 115;
                IconCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(1, vendorReviewFragment, VendorReviewFragment.class, "handleAction", "handleAction(Lcom/roadrunner/vendor/review/presentation/entity/VendorReviewAction;)V", 0, 21);
                    getpostalcode.write(jobKt__JobKt$invokeOnCompletion$2);
                    objComponentActivity = jobKt__JobKt$invokeOnCompletion$2;
                }
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
            logPurchase logpurchase = (logPurchase) ExtrasKt.write(vendorReviewFragment.serializer().MediaBrowserCompatMediaItem, getpostalcode, 0).getValue();
            handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_releaseSerializer = vendorReviewFragment.serializer();
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(handleinappmessagetestpushandroid_sdk_base_releaseSerializer);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                subscribeToBannersUpdateslambda1 subscribetobannersupdateslambda1 = new subscribeToBannersUpdateslambda1(0, handleinappmessagetestpushandroid_sdk_base_releaseSerializer, handleInAppMessageTestPushandroid_sdk_base_release.class, "onCloseScreen", "onCloseScreen$implementation()V", 0, 4);
                getpostalcode.write(subscribetobannersupdateslambda1);
                objComponentActivity2 = subscribetobannersupdateslambda1;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2);
            handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_releaseSerializer2 = vendorReviewFragment.serializer();
            boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(handleinappmessagetestpushandroid_sdk_base_releaseSerializer2);
            Object objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                recordGeofenceTransitionlambda1 recordgeofencetransitionlambda1 = new recordGeofenceTransitionlambda1(2, handleinappmessagetestpushandroid_sdk_base_releaseSerializer2, handleInAppMessageTestPushandroid_sdk_base_release.class, "onTagClick", "onTagClick$implementation(Lcom/roadrunner/vendor/review/presentation/entity/VendorReviewUiState$Available;Lcom/roadrunner/vendor/review/presentation/tags/ReviewTag;)V", 0, 7);
                getpostalcode.write(recordgeofencetransitionlambda1);
                objComponentActivity3 = recordgeofencetransitionlambda1;
            }
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
            handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_releaseSerializer3 = vendorReviewFragment.serializer();
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(handleinappmessagetestpushandroid_sdk_base_releaseSerializer3);
            Object objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer4 || objComponentActivity4 == androidContentCaptureManager) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$3 = new JobKt__JobKt$invokeOnCompletion$1(1, handleinappmessagetestpushandroid_sdk_base_releaseSerializer3, handleInAppMessageTestPushandroid_sdk_base_release.class, "onDraftCommentUpdate", "onDraftCommentUpdate$implementation(Ljava/lang/String;)V", 0, 22);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$3);
                objComponentActivity4 = jobKt__JobKt$invokeOnCompletion$3;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity4);
            handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_releaseSerializer4 = vendorReviewFragment.serializer();
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(handleinappmessagetestpushandroid_sdk_base_releaseSerializer4);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer5 || objComponentActivity5 == androidContentCaptureManager) {
                subscribeToBannersUpdateslambda1 subscribetobannersupdateslambda2 = new subscribeToBannersUpdateslambda1(0, handleinappmessagetestpushandroid_sdk_base_releaseSerializer4, handleInAppMessageTestPushandroid_sdk_base_release.class, "onCommentSave", "onCommentSave$implementation()V", 0, 5);
                getpostalcode.write(subscribetobannersupdateslambda2);
                int i6 = IconCompatParcelizer + 97;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    int i7 = 4 % 2;
                }
                objComponentActivity5 = subscribetobannersupdateslambda2;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
            handleInAppMessageTestPushandroid_sdk_base_release handleinappmessagetestpushandroid_sdk_base_releaseSerializer5 = vendorReviewFragment.serializer();
            boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(handleinappmessagetestpushandroid_sdk_base_releaseSerializer5);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer6 || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new JobKt__JobKt$invokeOnCompletion$1(1, handleinappmessagetestpushandroid_sdk_base_releaseSerializer5, handleInAppMessageTestPushandroid_sdk_base_release.class, "onConfirmClick", "onConfirmClick$implementation(Lcom/roadrunner/vendor/review/presentation/entity/VendorReviewUiState$Available;)V", 0, 23);
                getpostalcode.write(objComponentActivity6);
            }
            VendorReviewScreenKt.IconCompatParcelizer(logpurchase, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, null, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity6), getpostalcode, 0);
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d4 A[DONT_INVERT, PHI: r4
  0x00d4: PHI (r4v10 java.lang.Object) = (r4v9 java.lang.Object), (r4v30 java.lang.Object) binds: [B:26:0x00d2, B:23:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:33:0x0114  */
    /* JADX WARN: Code duplicated, block: B:35:0x011f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:39:0x0146  */
    /* JADX WARN: Code duplicated, block: B:42:0x016b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0179  */
    /* JADX WARN: Code duplicated, block: B:48:0x017b  */
    private final Object invoke$com$roadrunner$startworking$oneclick$OneClickStartWorkingFragment$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        Object objComponentActivity;
        boolean zIconCompatParcelizer;
        Object objComponentActivity2;
        boolean zIconCompatParcelizer2;
        Object objComponentActivity3;
        boolean zIconCompatParcelizer3;
        Object objComponentActivity4;
        int i;
        int i2 = 2 % 2;
        OneClickStartWorkingFragment oneClickStartWorkingFragment = (OneClickStartWorkingFragment) this.RemoteActionCompatParcelizer;
        ComponentRegistry$Builder componentRegistry$Builder = oneClickStartWorkingFragment.getSavedStateRegistry;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            int i3 = IconCompatParcelizer + 23;
            write = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            ImageHeaderParserImageType imageHeaderParserImageType = oneClickStartWorkingFragment.getNavigationEventDispatcher;
            if (imageHeaderParserImageType == null) {
                removeNodeAtDepth.serializer("idVerificationEntryPointComposableFactory");
                throw null;
            }
            schedulePushDeliveryandroid_sdk_base_release schedulepushdeliveryandroid_sdk_base_releaseIconCompatParcelizer = ((OneClickStartWorkingViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper()).MediaDescriptionCompat.IconCompatParcelizer();
            OneClickStartWorkingViewModel oneClickStartWorkingViewModel = (OneClickStartWorkingViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper();
            boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingViewModel);
            Object objComponentActivity5 = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer4 || objComponentActivity5 == androidContentCaptureManager) {
                objComponentActivity5 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingViewModel, OneClickStartWorkingViewModel.class, "onIdentityVerificationCompleted", "onIdentityVerificationCompleted()V", 0, 26);
                getpostalcode.write(objComponentActivity5);
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
            OneClickStartWorkingViewModel oneClickStartWorkingViewModel2 = (OneClickStartWorkingViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper();
            boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingViewModel2);
            Object objComponentActivity6 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer5 || objComponentActivity6 == androidContentCaptureManager) {
                objComponentActivity6 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingViewModel2, OneClickStartWorkingViewModel.class, "onIdVerificationCancelled", "onIdVerificationCancelled()V", 0, 27);
                getpostalcode.write(objComponentActivity6);
            }
            imageHeaderParserImageType.RemoteActionCompatParcelizer(schedulepushdeliveryandroid_sdk_base_releaseIconCompatParcelizer, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity6)).invoke(getpostalcode, 0);
            logFeatureFlagImpressionlambda0 logfeatureflagimpressionlambda0 = oneClickStartWorkingFragment.getOnBackPressedDispatcher;
            if (logfeatureflagimpressionlambda0 == null) {
                removeNodeAtDepth.serializer("oneClickStartWorkingComposableFactory");
                throw null;
            }
            int i5 = IconCompatParcelizer + 41;
            write = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity = getpostalcode.ComponentActivity();
                int i6 = 68 / 0;
                if (!zIconCompatParcelizer6) {
                    if (objComponentActivity == androidContentCaptureManager) {
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$1 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithResult", "dismissWithResult()V", 0, 29);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$1);
                    objComponentActivity2 = settingsScreenKt$SettingsScreen$2$1;
                } else {
                    int i7 = write + 37;
                    IconCompatParcelizer = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$2 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithResult", "dismissWithResult()V", 0, 29);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$2);
                        objComponentActivity2 = settingsScreenKt$SettingsScreen$2$2;
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2 || objComponentActivity3 == androidContentCaptureManager) {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$1 = new JobKt__JobKt$invokeOnCompletion$1(1, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithError", "dismissWithError(Ljava/lang/String;)V", 0, 18);
                    getpostalcode.write(jobKt__JobKt$invokeOnCompletion$1);
                    objComponentActivity3 = jobKt__JobKt$invokeOnCompletion$1;
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3) {
                    objComponentActivity4 = new OneClickStartWorkingFragment$$ExternalSyntheticLambda0(oneClickStartWorkingFragment, 1);
                    getpostalcode.write(objComponentActivity4);
                } else {
                    i = IconCompatParcelizer + 111;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new OneClickStartWorkingFragment$$ExternalSyntheticLambda0(oneClickStartWorkingFragment, 1);
                        getpostalcode.write(objComponentActivity4);
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k1.getClass();
                r8lambdardpfsr94j4iebcwx_kpqzpm8k2.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm2.getClass();
                new DragAndDropTargetModifierNode(new ContextMenuScope$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, logfeatureflagimpressionlambda0, r8lambdaunavo3sxub_pc9xroryotnrlvsm2), true, 556748104).invoke((OneClickStartWorkingViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0);
            } else {
                boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (!zIconCompatParcelizer7) {
                    if (objComponentActivity == androidContentCaptureManager) {
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer) {
                    int i9 = write + 37;
                    IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                    int i10 = i9 % 2;
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$3 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithResult", "dismissWithResult()V", 0, 29);
                        getpostalcode.write(settingsScreenKt$SettingsScreen$2$3);
                        objComponentActivity2 = settingsScreenKt$SettingsScreen$2$3;
                    }
                } else {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$4 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithResult", "dismissWithResult()V", 0, 29);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$4);
                    objComponentActivity2 = settingsScreenKt$SettingsScreen$2$4;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2) {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$2 = new JobKt__JobKt$invokeOnCompletion$1(1, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithError", "dismissWithError(Ljava/lang/String;)V", 0, 18);
                    getpostalcode.write(jobKt__JobKt$invokeOnCompletion$2);
                    objComponentActivity3 = jobKt__JobKt$invokeOnCompletion$2;
                } else {
                    JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$3 = new JobKt__JobKt$invokeOnCompletion$1(1, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithError", "dismissWithError(Ljava/lang/String;)V", 0, 18);
                    getpostalcode.write(jobKt__JobKt$invokeOnCompletion$3);
                    objComponentActivity3 = jobKt__JobKt$invokeOnCompletion$3;
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
                objComponentActivity4 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3) {
                    i = IconCompatParcelizer + 111;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        throw null;
                    }
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new OneClickStartWorkingFragment$$ExternalSyntheticLambda0(oneClickStartWorkingFragment, 1);
                        getpostalcode.write(objComponentActivity4);
                    }
                } else {
                    objComponentActivity4 = new OneClickStartWorkingFragment$$ExternalSyntheticLambda0(oneClickStartWorkingFragment, 1);
                    getpostalcode.write(objComponentActivity4);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
                r8lambdardpfsr94j4iebcwx_kpqzpm8k3.getClass();
                r8lambdardpfsr94j4iebcwx_kpqzpm8k4.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm3.getClass();
                r8lambdaunavo3sxub_pc9xroryotnrlvsm4.getClass();
                new DragAndDropTargetModifierNode(new ContextMenuScope$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, logfeatureflagimpressionlambda0, r8lambdaunavo3sxub_pc9xroryotnrlvsm4), true, 556748104).invoke((OneClickStartWorkingViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0);
            }
            SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$5 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismiss", "dismiss()V", 0, 28);
            getpostalcode.write(settingsScreenKt$SettingsScreen$2$5);
            int i11 = write + 27;
            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
            objComponentActivity = settingsScreenKt$SettingsScreen$2$5;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
            zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
            objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer) {
                int i13 = write + 37;
                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                int i14 = i13 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$6 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithResult", "dismissWithResult()V", 0, 29);
                    getpostalcode.write(settingsScreenKt$SettingsScreen$2$6);
                    objComponentActivity2 = settingsScreenKt$SettingsScreen$2$6;
                }
            } else {
                SettingsScreenKt$SettingsScreen$2$1 settingsScreenKt$SettingsScreen$2$7 = new SettingsScreenKt$SettingsScreen$2$1(0, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithResult", "dismissWithResult()V", 0, 29);
                getpostalcode.write(settingsScreenKt$SettingsScreen$2$7);
                objComponentActivity2 = settingsScreenKt$SettingsScreen$2$7;
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2);
            zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
            objComponentActivity3 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$4 = new JobKt__JobKt$invokeOnCompletion$1(1, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithError", "dismissWithError(Ljava/lang/String;)V", 0, 18);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$4);
                objComponentActivity3 = jobKt__JobKt$invokeOnCompletion$4;
            } else {
                JobKt__JobKt$invokeOnCompletion$1 jobKt__JobKt$invokeOnCompletion$5 = new JobKt__JobKt$invokeOnCompletion$1(1, oneClickStartWorkingFragment, OneClickStartWorkingFragment.class, "dismissWithError", "dismissWithError(Ljava/lang/String;)V", 0, 18);
                getpostalcode.write(jobKt__JobKt$invokeOnCompletion$5);
                objComponentActivity3 = jobKt__JobKt$invokeOnCompletion$5;
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm5 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity3);
            zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(oneClickStartWorkingFragment);
            objComponentActivity4 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer3) {
                i = IconCompatParcelizer + 111;
                write = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    throw null;
                }
                if (objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new OneClickStartWorkingFragment$$ExternalSyntheticLambda0(oneClickStartWorkingFragment, 1);
                    getpostalcode.write(objComponentActivity4);
                }
            } else {
                objComponentActivity4 = new OneClickStartWorkingFragment$$ExternalSyntheticLambda0(oneClickStartWorkingFragment, 1);
                getpostalcode.write(objComponentActivity4);
            }
            r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm6 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4;
            r8lambdardpfsr94j4iebcwx_kpqzpm8k5.getClass();
            r8lambdardpfsr94j4iebcwx_kpqzpm8k6.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm5.getClass();
            r8lambdaunavo3sxub_pc9xroryotnrlvsm6.getClass();
            new DragAndDropTargetModifierNode(new ContextMenuScope$$ExternalSyntheticLambda0(r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdaunavo3sxub_pc9xroryotnrlvsm5, logfeatureflagimpressionlambda0, r8lambdaunavo3sxub_pc9xroryotnrlvsm6), true, 556748104).invoke((OneClickStartWorkingViewModel) componentRegistry$Builder.MediaSessionCompatResultReceiverWrapper(), getpostalcode, 0);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v95 ??, still in use, count: 1, list:
          (r1v95 ?? I:java.lang.Object) from 0x0885: INVOKE (r2v34 ?? I:o.getPostalCode), (r1v95 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2101)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final java.lang.Object invoke(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v95 ??, still in use, count: 1, list:
          (r1v95 ?? I:java.lang.Object) from 0x0885: INVOKE (r2v34 ?? I:o.getPostalCode), (r1v95 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:2101)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r41v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
}
