package androidx.compose.runtime;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.navigation.internal.NavControllerImpl$$ExternalSyntheticLambda0;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.b8$$ExternalSyntheticLambda4;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.roadrunner.delivery.accept.presentation.compose.AutoAcceptOptionKt$AutoAcceptOption$1$1;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain.ReportPictureUseCase$invoke$2;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.GalleryFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.gallery.presentation.compose.GalleryScreenKt;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.TermsAndConditionsFragment;
import com.roadrunner.delivery.ontheway.crowdsourcing.terms.presentation.compose.TermsAndConditionsKt;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.EntrancePictureFragment;
import com.roadrunner.delivery.ontheway.entrancepicture.details.presentation.compose.EntrancePictureScreenKt;
import com.roadrunner.delivery.ontheway.navigation.presentation.compose.NavigationButtonKt$NavigationButton$2$1;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogContentKt;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment;
import com.roadrunner.delivery.pickupdropoff.blockingui.presentation.dialog.TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda1;
import com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment;
import com.roadrunner.delivery.pickupdropoff.codescanner.BarcodeAnalyzer$$ExternalSyntheticLambda0;
import com.roadrunner.delivery.state.TrackingEvent;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.login.logging.OtpLogger;
import io.sentry.SentryUUID;
import java.util.Collections;
import java.util.Map;
import o.AdjustBridgeInstance;
import o.AndroidContentCaptureManager;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.KeyboardType;
import o.PlatformLocaleDelegate;
import o.PlatformLocaleKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.TextGeometricTransformCompanion;
import o.TextInputServiceAndroidTextInputCommand;
import o.accessgetDecimalcp;
import o.copyNB67dxodefault;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.getCreditCardExpirationMonth;
import o.getMotionEventToComposePointerIdMapui;
import o.getNoneui_text;
import o.getPhoneNumberNational;
import o.getPlatformLocaleDelegate;
import o.getPostalCode;
import o.getQueryContext;
import o.getWordsIUNYP9k;
import o.isIncludeFontPaddingEnabled;
import o.notifyFocusedRect;
import o.onRequestCursorAnchorInfo;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.registerInAppMessageManagerlambda0;
import o.removeNodeAtDepth;
import o.restartInput;
import o.updateExtractedText;
import timber.log.Timber;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GapComposer$$ExternalSyntheticLambda3 implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ GapComposer$$ExternalSyntheticLambda3(int i, Object obj) {
        this.serializer = i;
        this.IconCompatParcelizer = obj;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v50 ??, still in use, count: 1, list:
          (r5v50 ?? I:java.lang.Object) from 0x01e3: INVOKE (r2v78 ?? I:o.getPostalCode), (r5v50 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:603)
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v50 ??, still in use, count: 1, list:
          (r5v50 ?? I:java.lang.Object) from 0x01e3: INVOKE (r2v78 ?? I:o.getPostalCode), (r5v50 ?? I:java.lang.Object) VIRTUAL call: o.getPostalCode.write(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:603)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
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

    /* JADX WARN: Code duplicated, block: B:10:0x0033 A[PHI: r1 r9 r10
  0x0033: PHI (r1v8 com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment) = 
  (r1v5 com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment)
  (r1v10 com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment)
 binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r9v9 o.getBirthDateFull) = (r9v1 o.getBirthDateFull), (r9v10 o.getBirthDateFull) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0033: PHI (r10v19 int) = (r10v2 int), (r10v21 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x007c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031 A[PHI: r1 r9 r10
  0x0031: PHI (r1v6 com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment) = 
  (r1v5 com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment)
  (r1v10 com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment)
 binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r9v2 o.getBirthDateFull) = (r9v1 o.getBirthDateFull), (r9v10 o.getBirthDateFull) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x0031: PHI (r10v3 int) = (r10v2 int), (r10v21 int) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    private final Object read(Object obj, Object obj2) {
        final BluetoothEnableDialogFragment bluetoothEnableDialogFragment;
        getBirthDateFull getbirthdatefull;
        int iIntValue;
        boolean z;
        int i = 2 % 2;
        int i2 = read + 85;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        final int i3 = 1;
        final int i4 = 0;
        if (i2 % 2 == 0) {
            bluetoothEnableDialogFragment = (BluetoothEnableDialogFragment) this.IconCompatParcelizer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 2) != 2) {
                z = true;
            } else {
                z = false;
            }
        } else {
            bluetoothEnableDialogFragment = (BluetoothEnableDialogFragment) this.IconCompatParcelizer;
            getbirthdatefull = (getBirthDateFull) obj;
            iIntValue = ((Integer) obj2).intValue();
            if ((iIntValue & 3) != 2) {
                z = true;
            } else {
                z = false;
            }
        }
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, z)) {
            int i5 = RemoteActionCompatParcelizer + 51;
            read = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(bluetoothEnableDialogFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer) {
                objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment$$ExternalSyntheticLambda1
                    private static int IconCompatParcelizer = 0;
                    private static int write = 1;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i7 = 2 % 2;
                        int i8 = write + 81;
                        IconCompatParcelizer = i8 % Fields.SpotShadowColor;
                        int i9 = i8 % 2;
                        int i10 = i4;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        BluetoothEnableDialogFragment bluetoothEnableDialogFragment2 = bluetoothEnableDialogFragment;
                        if (i10 != 0) {
                            bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                            return createfromparcel;
                        }
                        try {
                            bluetoothEnableDialogFragment2.requireContext().startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                            int i11 = write + 89;
                            IconCompatParcelizer = i11 % Fields.SpotShadowColor;
                            int i12 = i11 % 2;
                        } catch (ActivityNotFoundException e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment: No activity found to handle ACTION_BLUETOOTH_SETTINGS", new Object[0]);
                            bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                        }
                        return createfromparcel;
                    }
                };
                getpostalcode.write(objComponentActivity);
            } else {
                int i7 = RemoteActionCompatParcelizer + 81;
                read = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                if (objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment$$ExternalSyntheticLambda1
                        private static int IconCompatParcelizer = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i9 = 2 % 2;
                            int i10 = write + 81;
                            IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                            int i11 = i10 % 2;
                            int i12 = i4;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            BluetoothEnableDialogFragment bluetoothEnableDialogFragment2 = bluetoothEnableDialogFragment;
                            if (i12 != 0) {
                                bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                                return createfromparcel;
                            }
                            try {
                                bluetoothEnableDialogFragment2.requireContext().startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                                int i13 = write + 89;
                                IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                                int i14 = i13 % 2;
                            } catch (ActivityNotFoundException e) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment: No activity found to handle ACTION_BLUETOOTH_SETTINGS", new Object[0]);
                                bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                            }
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity);
                }
            }
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity;
            boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(bluetoothEnableDialogFragment);
            Object objComponentActivity2 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer2) {
                objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment$$ExternalSyntheticLambda1
                    private static int IconCompatParcelizer = 0;
                    private static int write = 1;

                    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = write + 81;
                        IconCompatParcelizer = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        int i12 = i3;
                        createFromParcel createfromparcel = createFromParcel.INSTANCE;
                        BluetoothEnableDialogFragment bluetoothEnableDialogFragment2 = bluetoothEnableDialogFragment;
                        if (i12 != 0) {
                            bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                            return createfromparcel;
                        }
                        try {
                            bluetoothEnableDialogFragment2.requireContext().startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                            int i13 = write + 89;
                            IconCompatParcelizer = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                        } catch (ActivityNotFoundException e) {
                            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment: No activity found to handle ACTION_BLUETOOTH_SETTINGS", new Object[0]);
                            bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                        }
                        return createfromparcel;
                    }
                };
                getpostalcode.write(objComponentActivity2);
            } else {
                int i9 = read + 27;
                RemoteActionCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                if (objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment$$ExternalSyntheticLambda1
                        private static int IconCompatParcelizer = 0;
                        private static int write = 1;

                        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                        public final Object invoke() {
                            int i11 = 2 % 2;
                            int i12 = write + 81;
                            IconCompatParcelizer = i12 % Fields.SpotShadowColor;
                            int i13 = i12 % 2;
                            int i14 = i3;
                            createFromParcel createfromparcel = createFromParcel.INSTANCE;
                            BluetoothEnableDialogFragment bluetoothEnableDialogFragment2 = bluetoothEnableDialogFragment;
                            if (i14 != 0) {
                                bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                                return createfromparcel;
                            }
                            try {
                                bluetoothEnableDialogFragment2.requireContext().startActivity(new Intent("android.settings.BLUETOOTH_SETTINGS"));
                                int i15 = write + 89;
                                IconCompatParcelizer = i15 % Fields.SpotShadowColor;
                                int i16 = i15 % 2;
                            } catch (ActivityNotFoundException e) {
                                Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "com.roadrunner.delivery.pickupdropoff.bluetoothscanning.presentation.BluetoothEnableDialogFragment: No activity found to handle ACTION_BLUETOOTH_SETTINGS", new Object[0]);
                                bluetoothEnableDialogFragment2.RemoteActionCompatParcelizer();
                            }
                            return createfromparcel;
                        }
                    };
                    getpostalcode.write(objComponentActivity2);
                }
            }
            getMotionEventToComposePointerIdMapui.IconCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2, getpostalcode, 0);
            int i11 = read + 19;
            RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
            int i12 = i11 % 2;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    private final Object invoke$com$roadrunner$delivery$pickupdropoff$blockingui$presentation$dialog$TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        TimeChangedBlockingDialogFragment timeChangedBlockingDialogFragment = (TimeChangedBlockingDialogFragment) this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i4 = 1;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (!getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        } else {
            getQueryContext getquerycontext = timeChangedBlockingDialogFragment.serializer().RemoteActionCompatParcelizer;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(timeChangedBlockingDialogFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$2 = new ReportPictureUseCase$invoke$2(1, timeChangedBlockingDialogFragment, TimeChangedBlockingDialogFragment.class, "observePendingAction", "observePendingAction(Lcom/roadrunner/delivery/pickupdropoff/blockingui/api/navigation/TimeChangedDialogAction;)V", 0, 26);
                getpostalcode.write(reportPictureUseCase$invoke$2);
                objComponentActivity = reportPictureUseCase$invoke$2;
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
            getNoneui_text getnoneui_text = (getNoneui_text) ExtrasKt.write(timeChangedBlockingDialogFragment.serializer().MediaDescriptionCompat, getpostalcode, 0).getValue();
            if (getnoneui_text instanceof TextGeometricTransformCompanion) {
                getpostalcode.serializer(-314732878);
                OtpLogger otpLogger = timeChangedBlockingDialogFragment.serializer().MediaBrowserCompatMediaItem;
                otpLogger.getClass();
                Map mapSingletonMap = Collections.singletonMap("action", "shown");
                mapSingletonMap.getClass();
                otpLogger.RemoteActionCompatParcelizer(new TrackingEvent("SCREEN_OPENED", "time_manipulated_blocking_ui", mapSingletonMap));
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(timeChangedBlockingDialogFragment);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda1(timeChangedBlockingDialogFragment, i4);
                    getpostalcode.write(objComponentActivity2);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity2;
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(timeChangedBlockingDialogFragment);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer3) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new TimeChangedBlockingDialogFragment$$ExternalSyntheticLambda1(timeChangedBlockingDialogFragment, 2);
                    getpostalcode.write(objComponentActivity3);
                }
                TimeChangedBlockingDialogContentKt.serializer((TextGeometricTransformCompanion) getnoneui_text, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity3, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
                int i5 = read + 57;
                RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
                int i6 = i5 % 2;
            } else {
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getnoneui_text, copyNB67dxodefault.serializer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1652411202, false);
                }
                getpostalcode.serializer(1652429257);
                getpostalcode.IconCompatParcelizer(false);
                timeChangedBlockingDialogFragment.serializer().IconCompatParcelizer();
            }
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x010c  */
    private final Object invoke$com$roadrunner$delivery$ontheway$crowdsourcing$terms$presentation$TermsAndConditionsFragment$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        int i = 2 % 2;
        TermsAndConditionsFragment termsAndConditionsFragment = (TermsAndConditionsFragment) this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            getQueryContext getquerycontext = termsAndConditionsFragment.serializer().serializer;
            boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(termsAndConditionsFragment);
            Object objComponentActivity = getpostalcode.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                ReportPictureUseCase$invoke$2 reportPictureUseCase$invoke$2 = new ReportPictureUseCase$invoke$2(1, termsAndConditionsFragment, TermsAndConditionsFragment.class, "handleAction", "handleAction(Lcom/roadrunner/delivery/ontheway/crowdsourcing/api/terms/TermsAndConditionsAction;)V", 0, 17);
                getpostalcode.write(reportPictureUseCase$invoke$2);
                objComponentActivity = reportPictureUseCase$invoke$2;
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity), getpostalcode, 8);
            accessgetDecimalcp accessgetdecimalcp = (accessgetDecimalcp) ExtrasKt.write(termsAndConditionsFragment.serializer().PlaybackStateCompat, getpostalcode, 0).getValue();
            if (!(!(accessgetdecimalcp instanceof KeyboardType))) {
                int i2 = RemoteActionCompatParcelizer + 67;
                read = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    getpostalcode.serializer(774119080);
                    getpostalcode.IconCompatParcelizer(termsAndConditionsFragment.serializer());
                    getpostalcode.ComponentActivity();
                    throw null;
                }
                getpostalcode.serializer(774119080);
                KeyboardType keyboardType = (KeyboardType) accessgetdecimalcp;
                TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommandSerializer = termsAndConditionsFragment.serializer();
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(textInputServiceAndroidTextInputCommandSerializer);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2 || objComponentActivity2 == androidContentCaptureManager) {
                    objComponentActivity2 = new NavigationButtonKt$NavigationButton$2$1(0, textInputServiceAndroidTextInputCommandSerializer, TextInputServiceAndroidTextInputCommand.class, "onAgreeClick", "onAgreeClick()V", 0, 10);
                    getpostalcode.write(objComponentActivity2);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommandSerializer2 = termsAndConditionsFragment.serializer();
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(textInputServiceAndroidTextInputCommandSerializer2);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer3) || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new NavigationButtonKt$NavigationButton$2$1(0, textInputServiceAndroidTextInputCommandSerializer2, TextInputServiceAndroidTextInputCommand.class, "onBackClick", "onBackClick()V", 0, 11);
                    getpostalcode.write(objComponentActivity3);
                    int i3 = read + 89;
                    RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
                    int i4 = i3 % 2;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                TextInputServiceAndroidTextInputCommand textInputServiceAndroidTextInputCommandSerializer3 = termsAndConditionsFragment.serializer();
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(textInputServiceAndroidTextInputCommandSerializer3);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer4) {
                    objComponentActivity4 = new NavigationButtonKt$NavigationButton$2$1(0, textInputServiceAndroidTextInputCommandSerializer3, TextInputServiceAndroidTextInputCommand.class, "onLinkClick", "onLinkClick()V", 0, 12);
                    getpostalcode.write(objComponentActivity4);
                } else {
                    int i5 = RemoteActionCompatParcelizer + 105;
                    read = i5 % Fields.SpotShadowColor;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    if (objComponentActivity4 == androidContentCaptureManager) {
                        objComponentActivity4 = new NavigationButtonKt$NavigationButton$2$1(0, textInputServiceAndroidTextInputCommandSerializer3, TextInputServiceAndroidTextInputCommand.class, "onLinkClick", "onLinkClick()V", 0, 12);
                        getpostalcode.write(objComponentActivity4);
                    }
                }
                TermsAndConditionsKt.TermsAndConditions(keyboardType, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4), null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                if (!(accessgetdecimalcp instanceof getWordsIUNYP9k)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 774114862, false);
                }
                getpostalcode.serializer(774129786);
                getpostalcode.IconCompatParcelizer(false);
            }
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ba  */
    private final Object invoke$com$roadrunner$delivery$ontheway$entrancepicture$details$presentation$EntrancePictureFragment$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        int i = 2 % 2;
        EntrancePictureFragment entrancePictureFragment = (EntrancePictureFragment) this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        if (getpostalcode.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            PlatformLocaleDelegate platformLocaleDelegate = (PlatformLocaleDelegate) ExtrasKt.write(entrancePictureFragment.serializer().serializer, getpostalcode, 0).getValue();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (!(!(platformLocaleDelegate instanceof PlatformLocaleKt))) {
                int i2 = read + 71;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                getpostalcode.serializer(-1279643239);
                getpostalcode.IconCompatParcelizer(false);
                entrancePictureFragment.read(false, false);
                int i4 = read + 73;
                RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
            } else {
                if (!(platformLocaleDelegate instanceof getPlatformLocaleDelegate)) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, -1279646922, false);
                }
                getpostalcode.serializer(-1014141898);
                getPlatformLocaleDelegate getplatformlocaledelegate = (getPlatformLocaleDelegate) platformLocaleDelegate;
                isIncludeFontPaddingEnabled isincludefontpaddingenabledSerializer = entrancePictureFragment.serializer();
                boolean zIconCompatParcelizer = getpostalcode.IconCompatParcelizer(isincludefontpaddingenabledSerializer);
                Object objComponentActivity = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer || objComponentActivity == androidContentCaptureManager) {
                    objComponentActivity = new NavigationButtonKt$NavigationButton$2$1(0, isincludefontpaddingenabledSerializer, isIncludeFontPaddingEnabled.class, "onClose", "onClose()V", 0, 14);
                    getpostalcode.write(objComponentActivity);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity);
                isIncludeFontPaddingEnabled isincludefontpaddingenabledSerializer2 = entrancePictureFragment.serializer();
                boolean zIconCompatParcelizer2 = getpostalcode.IconCompatParcelizer(isincludefontpaddingenabledSerializer2);
                Object objComponentActivity2 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer2) {
                    objComponentActivity2 = new ReportPictureUseCase$invoke$2(1, isincludefontpaddingenabledSerializer2, isIncludeFontPaddingEnabled.class, "onVisibleImageChanged", "onVisibleImageChanged(I)V", 0, 18);
                    getpostalcode.write(objComponentActivity2);
                } else {
                    int i6 = RemoteActionCompatParcelizer + 117;
                    read = i6 % Fields.SpotShadowColor;
                    if (i6 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (objComponentActivity2 == androidContentCaptureManager) {
                        objComponentActivity2 = new ReportPictureUseCase$invoke$2(1, isincludefontpaddingenabledSerializer2, isIncludeFontPaddingEnabled.class, "onVisibleImageChanged", "onVisibleImageChanged(I)V", 0, 18);
                        getpostalcode.write(objComponentActivity2);
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity2);
                isIncludeFontPaddingEnabled isincludefontpaddingenabledSerializer3 = entrancePictureFragment.serializer();
                boolean zIconCompatParcelizer3 = getpostalcode.IconCompatParcelizer(isincludefontpaddingenabledSerializer3);
                Object objComponentActivity3 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer3 || objComponentActivity3 == androidContentCaptureManager) {
                    objComponentActivity3 = new NavigationButtonKt$NavigationButton$2$1(0, isincludefontpaddingenabledSerializer3, isIncludeFontPaddingEnabled.class, "onTextOverflow", "onTextOverflow()V", 0, 15);
                    getpostalcode.write(objComponentActivity3);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity3);
                isIncludeFontPaddingEnabled isincludefontpaddingenabledSerializer4 = entrancePictureFragment.serializer();
                boolean zIconCompatParcelizer4 = getpostalcode.IconCompatParcelizer(isincludefontpaddingenabledSerializer4);
                Object objComponentActivity4 = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer4) || objComponentActivity4 == androidContentCaptureManager) {
                    objComponentActivity4 = new NavigationButtonKt$NavigationButton$2$1(0, isincludefontpaddingenabledSerializer4, isIncludeFontPaddingEnabled.class, "onExpandDetailsClick", "onExpandDetailsClick()V", 0, 16);
                    getpostalcode.write(objComponentActivity4);
                    int i7 = RemoteActionCompatParcelizer + 111;
                    read = i7 % Fields.SpotShadowColor;
                    int i8 = i7 % 2;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity4);
                isIncludeFontPaddingEnabled isincludefontpaddingenabledSerializer5 = entrancePictureFragment.serializer();
                boolean zIconCompatParcelizer5 = getpostalcode.IconCompatParcelizer(isincludefontpaddingenabledSerializer5);
                Object objComponentActivity5 = getpostalcode.ComponentActivity();
                if (zIconCompatParcelizer5 || objComponentActivity5 == androidContentCaptureManager) {
                    objComponentActivity5 = new ReportPictureUseCase$invoke$2(1, isincludefontpaddingenabledSerializer5, isIncludeFontPaddingEnabled.class, "onPictureClick", "onPictureClick(Z)V", 0, 19);
                    getpostalcode.write(objComponentActivity5);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                isIncludeFontPaddingEnabled isincludefontpaddingenabledSerializer6 = entrancePictureFragment.serializer();
                boolean zIconCompatParcelizer6 = getpostalcode.IconCompatParcelizer(isincludefontpaddingenabledSerializer6);
                Object objComponentActivity6 = getpostalcode.ComponentActivity();
                if (!(!zIconCompatParcelizer6) || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new NavigationButtonKt$NavigationButton$2$1(0, isincludefontpaddingenabledSerializer6, isIncludeFontPaddingEnabled.class, "logEntrancePictureLoadError", "logEntrancePictureLoadError()V", 0, 17);
                    getpostalcode.write(objComponentActivity6);
                }
                EntrancePictureScreenKt.EntrancePictureScreen(getplatformlocaledelegate, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity6), null, getpostalcode, 0);
                getpostalcode.IconCompatParcelizer(false);
            }
            getQueryContext getquerycontext = entrancePictureFragment.serializer().write;
            boolean zIconCompatParcelizer7 = getpostalcode.IconCompatParcelizer(entrancePictureFragment);
            Object objComponentActivity7 = getpostalcode.ComponentActivity();
            if (zIconCompatParcelizer7 || objComponentActivity7 == androidContentCaptureManager) {
                objComponentActivity7 = new BarcodeAnalyzer$$ExternalSyntheticLambda0(21, entrancePictureFragment);
                getpostalcode.write(objComponentActivity7);
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity7, getpostalcode, 8);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x012b  */
    /* JADX WARN: Code duplicated, block: B:46:0x018e  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:72:0x028d  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f2  */
    private final Object invoke$com$roadrunner$delivery$ontheway$crowdsourcing$gallery$presentation$GalleryFragment$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        getPostalCode getpostalcode;
        int i = 2 % 2;
        GalleryFragment galleryFragment = (GalleryFragment) this.IconCompatParcelizer;
        getBirthDateFull getbirthdatefull = (getBirthDateFull) obj;
        int iIntValue = ((Integer) obj2).intValue();
        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull;
        if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objComponentActivity = getpostalcode2.ComponentActivity();
            AndroidContentCaptureManager androidContentCaptureManager = getCreditCardExpirationMonth.write;
            if (objComponentActivity == androidContentCaptureManager) {
                objComponentActivity = new SnackbarHostState();
                getpostalcode2.write(objComponentActivity);
                int i2 = RemoteActionCompatParcelizer + 81;
                read = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
            }
            SnackbarHostState snackbarHostState = (SnackbarHostState) objComponentActivity;
            Object objComponentActivity2 = getpostalcode2.ComponentActivity();
            if (objComponentActivity2 == androidContentCaptureManager) {
                objComponentActivity2 = CompositionKt.RemoteActionCompatParcelizer(null);
                getpostalcode2.write(objComponentActivity2);
            }
            PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7 = (PopulateViewStructure_androidKtpopulate7) objComponentActivity2;
            Object objComponentActivity3 = getpostalcode2.ComponentActivity();
            if (objComponentActivity3 == androidContentCaptureManager) {
                objComponentActivity3 = getPhoneNumberNational.RemoteActionCompatParcelizer(getpostalcode2);
                getpostalcode2.write(objComponentActivity3);
            }
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) objComponentActivity3;
            getQueryContext getquerycontext = galleryFragment.serializer().serializer;
            boolean zIconCompatParcelizer = getpostalcode2.IconCompatParcelizer(getcontentviewgroupparentlayout);
            boolean zIconCompatParcelizer2 = getpostalcode2.IconCompatParcelizer(galleryFragment);
            Object objComponentActivity4 = getpostalcode2.ComponentActivity();
            if ((zIconCompatParcelizer | zIconCompatParcelizer2) || objComponentActivity4 == androidContentCaptureManager) {
                NavControllerImpl$$ExternalSyntheticLambda0 navControllerImpl$$ExternalSyntheticLambda0 = new NavControllerImpl$$ExternalSyntheticLambda0(populateViewStructure_androidKtpopulate7, getcontentviewgroupparentlayout, galleryFragment, snackbarHostState, 5);
                getpostalcode2.write(navControllerImpl$$ExternalSyntheticLambda0);
                objComponentActivity4 = navControllerImpl$$ExternalSyntheticLambda0;
            }
            SQLite.write(getquerycontext, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) objComponentActivity4, getpostalcode2, 8);
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifierThen = companion.then(SizeKt.read);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicy = BoxKt.read(companion2.getTopStart(), false);
            int iHashCode = Long.hashCode(getpostalcode2.RatingCompat);
            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, modifierThen);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion3.getConstructor();
            if (getpostalcode2.read == null) {
                SentryUUID.write();
                throw null;
            }
            int i4 = read + 85;
            RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
            if (getpostalcode2.ComponentActivity) {
                int i6 = read + 67;
                RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                getpostalcode2.serializer(constructor);
            } else {
                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
            }
            af$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, measurePolicy, getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer);
            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, m1$$ExternalSyntheticOutline0.m(companion3, getpostalcode2, Integer.valueOf(iHashCode), getpostalcode2));
            onRequestCursorAnchorInfo onrequestcursoranchorinfo = (onRequestCursorAnchorInfo) ExtrasKt.write(galleryFragment.serializer().MediaMetadataCompat, getpostalcode2, 0).getValue();
            if (onrequestcursoranchorinfo instanceof updateExtractedText) {
                getpostalcode2.serializer(1038931138);
                updateExtractedText updateextractedtext = (updateExtractedText) onrequestcursoranchorinfo;
                notifyFocusedRect notifyfocusedrectSerializer = galleryFragment.serializer();
                boolean zIconCompatParcelizer3 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer);
                Object objComponentActivity5 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer3) {
                    objComponentActivity5 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer, notifyFocusedRect.class, "onClose", "onClose()V", 0, 20);
                    getpostalcode2.write(objComponentActivity5);
                } else {
                    int i8 = RemoteActionCompatParcelizer + 29;
                    read = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        int i9 = 51 / 0;
                        if (objComponentActivity5 == androidContentCaptureManager) {
                            objComponentActivity5 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer, notifyFocusedRect.class, "onClose", "onClose()V", 0, 20);
                            getpostalcode2.write(objComponentActivity5);
                        }
                    } else if (objComponentActivity5 == androidContentCaptureManager) {
                        objComponentActivity5 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer, notifyFocusedRect.class, "onClose", "onClose()V", 0, 20);
                        getpostalcode2.write(objComponentActivity5);
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity5);
                notifyFocusedRect notifyfocusedrectSerializer2 = galleryFragment.serializer();
                boolean zIconCompatParcelizer4 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer2);
                Object objComponentActivity6 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer4 || objComponentActivity6 == androidContentCaptureManager) {
                    objComponentActivity6 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer2, notifyFocusedRect.class, "onReport", "onReport()V", 0, 25);
                    getpostalcode2.write(objComponentActivity6);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k1 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity6);
                notifyFocusedRect notifyfocusedrectSerializer3 = galleryFragment.serializer();
                boolean zIconCompatParcelizer5 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer3);
                Object objComponentActivity7 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer5) {
                    objComponentActivity7 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer3, notifyFocusedRect.class, "onAddPhoto", "onAddPhoto()V", 0, 26);
                    getpostalcode2.write(objComponentActivity7);
                } else {
                    int i10 = RemoteActionCompatParcelizer + 119;
                    read = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    if (objComponentActivity7 == androidContentCaptureManager) {
                        objComponentActivity7 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer3, notifyFocusedRect.class, "onAddPhoto", "onAddPhoto()V", 0, 26);
                        getpostalcode2.write(objComponentActivity7);
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k2 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity7);
                notifyFocusedRect notifyfocusedrectSerializer4 = galleryFragment.serializer();
                boolean zIconCompatParcelizer6 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer4);
                Object objComponentActivity8 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer6 || objComponentActivity8 == androidContentCaptureManager) {
                    objComponentActivity8 = new ReportPictureUseCase$invoke$2(1, notifyfocusedrectSerializer4, notifyFocusedRect.class, "onLike", "onLike(Z)V", 0, 12);
                    getpostalcode2.write(objComponentActivity8);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity8);
                notifyFocusedRect notifyfocusedrectSerializer5 = galleryFragment.serializer();
                boolean zIconCompatParcelizer7 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer5);
                Object objComponentActivity9 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer7) {
                    objComponentActivity9 = new ReportPictureUseCase$invoke$2(1, notifyfocusedrectSerializer5, notifyFocusedRect.class, "onDislike", "onDislike(Z)V", 0, 13);
                    getpostalcode2.write(objComponentActivity9);
                } else {
                    int i12 = RemoteActionCompatParcelizer + 63;
                    read = i12 % Fields.SpotShadowColor;
                    if (i12 % 2 != 0) {
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                    if (objComponentActivity9 == androidContentCaptureManager) {
                        objComponentActivity9 = new ReportPictureUseCase$invoke$2(1, notifyfocusedrectSerializer5, notifyFocusedRect.class, "onDislike", "onDislike(Z)V", 0, 13);
                        getpostalcode2.write(objComponentActivity9);
                    }
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity9);
                notifyFocusedRect notifyfocusedrectSerializer6 = galleryFragment.serializer();
                boolean zIconCompatParcelizer8 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer6);
                Object objComponentActivity10 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer8 || objComponentActivity10 == androidContentCaptureManager) {
                    objComponentActivity10 = new ReportPictureUseCase$invoke$2(1, notifyfocusedrectSerializer6, notifyFocusedRect.class, "onCurrentPageChanged", "onCurrentPageChanged(Ljava/lang/String;)V", 0, 14);
                    getpostalcode2.write(objComponentActivity10);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm3 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity10);
                notifyFocusedRect notifyfocusedrectSerializer7 = galleryFragment.serializer();
                boolean zIconCompatParcelizer9 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer7);
                Object objComponentActivity11 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer9 || objComponentActivity11 == androidContentCaptureManager) {
                    objComponentActivity11 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer7, notifyFocusedRect.class, "onDetailsTextOverflow", "onDetailsTextOverflow()V", 0, 27);
                    getpostalcode2.write(objComponentActivity11);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k3 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity11);
                notifyFocusedRect notifyfocusedrectSerializer8 = galleryFragment.serializer();
                boolean zIconCompatParcelizer10 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer8);
                Object objComponentActivity12 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer10) {
                    objComponentActivity12 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer8, notifyFocusedRect.class, "onExpandDetailsClick", "onExpandDetailsClick()V", 0, 28);
                    getpostalcode2.write(objComponentActivity12);
                } else {
                    int i13 = RemoteActionCompatParcelizer + 11;
                    read = i13 % Fields.SpotShadowColor;
                    int i14 = i13 % 2;
                    if (objComponentActivity12 == androidContentCaptureManager) {
                        objComponentActivity12 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer8, notifyFocusedRect.class, "onExpandDetailsClick", "onExpandDetailsClick()V", 0, 28);
                        getpostalcode2.write(objComponentActivity12);
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k4 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity12);
                notifyFocusedRect notifyfocusedrectSerializer9 = galleryFragment.serializer();
                boolean zIconCompatParcelizer11 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer9);
                Object objComponentActivity13 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer11 || objComponentActivity13 == androidContentCaptureManager) {
                    objComponentActivity13 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer9, notifyFocusedRect.class, "onTranslationClicked", "onTranslationClicked()V", 0, 29);
                    getpostalcode2.write(objComponentActivity13);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k5 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity13);
                notifyFocusedRect notifyfocusedrectSerializer10 = galleryFragment.serializer();
                boolean zIconCompatParcelizer12 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer10);
                Object objComponentActivity14 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer12) {
                    objComponentActivity14 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer10, notifyFocusedRect.class, "onPictureClick", "onPictureClick()V", 0, 21);
                    getpostalcode2.write(objComponentActivity14);
                } else {
                    int i15 = RemoteActionCompatParcelizer + 63;
                    read = i15 % Fields.SpotShadowColor;
                    int i16 = i15 % 2;
                    if (objComponentActivity14 == androidContentCaptureManager) {
                        objComponentActivity14 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer10, notifyFocusedRect.class, "onPictureClick", "onPictureClick()V", 0, 21);
                        getpostalcode2.write(objComponentActivity14);
                    }
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k6 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity14);
                Object objComponentActivity15 = getpostalcode2.ComponentActivity();
                if (objComponentActivity15 == androidContentCaptureManager) {
                    objComponentActivity15 = new b8$$ExternalSyntheticLambda4(1);
                    getpostalcode2.write(objComponentActivity15);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k7 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) objComponentActivity15;
                notifyFocusedRect notifyfocusedrectSerializer11 = galleryFragment.serializer();
                boolean zIconCompatParcelizer13 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer11);
                Object objComponentActivity16 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer13 || objComponentActivity16 == androidContentCaptureManager) {
                    objComponentActivity16 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer11, notifyFocusedRect.class, "onDismissReportSheet", "onDismissReportSheet()V", 0, 22);
                    getpostalcode2.write(objComponentActivity16);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k8 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity16);
                notifyFocusedRect notifyfocusedrectSerializer12 = galleryFragment.serializer();
                boolean zIconCompatParcelizer14 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer12);
                Object objComponentActivity17 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer14 || objComponentActivity17 == androidContentCaptureManager) {
                    objComponentActivity17 = new ReportPictureUseCase$invoke$2(1, notifyfocusedrectSerializer12, notifyFocusedRect.class, "onSelectReportReason", "onSelectReportReason(Ljava/lang/String;)V", 0, 11);
                    getpostalcode2.write(objComponentActivity17);
                }
                r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm4 = (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) ((registerInAppMessageManagerlambda0) objComponentActivity17);
                notifyFocusedRect notifyfocusedrectSerializer13 = galleryFragment.serializer();
                boolean zIconCompatParcelizer15 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer13);
                Object objComponentActivity18 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer15 || objComponentActivity18 == androidContentCaptureManager) {
                    objComponentActivity18 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer13, notifyFocusedRect.class, "onToggleBlockUser", "onToggleBlockUser()V", 0, 23);
                    getpostalcode2.write(objComponentActivity18);
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k9 = (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity18);
                notifyFocusedRect notifyfocusedrectSerializer14 = galleryFragment.serializer();
                boolean zIconCompatParcelizer16 = getpostalcode2.IconCompatParcelizer(notifyfocusedrectSerializer14);
                Object objComponentActivity19 = getpostalcode2.ComponentActivity();
                if (zIconCompatParcelizer16 || objComponentActivity19 == androidContentCaptureManager) {
                    objComponentActivity19 = new AutoAcceptOptionKt$AutoAcceptOption$1$1(0, notifyfocusedrectSerializer14, notifyFocusedRect.class, "onSubmitReport", "onSubmitReport()V", 0, 24);
                    getpostalcode2.write(objComponentActivity19);
                }
                getpostalcode = getpostalcode2;
                GalleryScreenKt.read(updateextractedtext, null, r8lambdardpfsr94j4iebcwx_kpqzpm8k0, r8lambdardpfsr94j4iebcwx_kpqzpm8k1, r8lambdardpfsr94j4iebcwx_kpqzpm8k2, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2, r8lambdaunavo3sxub_pc9xroryotnrlvsm3, r8lambdardpfsr94j4iebcwx_kpqzpm8k3, r8lambdardpfsr94j4iebcwx_kpqzpm8k4, r8lambdardpfsr94j4iebcwx_kpqzpm8k5, r8lambdardpfsr94j4iebcwx_kpqzpm8k6, r8lambdardpfsr94j4iebcwx_kpqzpm8k7, r8lambdardpfsr94j4iebcwx_kpqzpm8k8, r8lambdaunavo3sxub_pc9xroryotnrlvsm4, r8lambdardpfsr94j4iebcwx_kpqzpm8k9, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((registerInAppMessageManagerlambda0) objComponentActivity19), getpostalcode, 0, 384);
                getpostalcode.IconCompatParcelizer(false);
            } else {
                getpostalcode = getpostalcode2;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{onrequestcursoranchorinfo, restartInput.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                    throw d$$ExternalSyntheticOutline0.m(getpostalcode, 1038927193, false);
                }
                int i17 = read + 115;
                RemoteActionCompatParcelizer = i17 % Fields.SpotShadowColor;
                int i18 = i17 % 2;
                getpostalcode.serializer(1038968525);
                getpostalcode.IconCompatParcelizer(false);
            }
            AdjustBridgeInstance.IconCompatParcelizer(snackbarHostState, populateViewStructure_androidKtpopulate7, PaddingKt.m74paddingqDBjuR0$default(BoxScopeInstance.serializer.align(companion, companion2.getBottomCenter()), 0.0f, 0.0f, 0.0f, Dimensions.setActionBarVisibilityCallback, 7), getpostalcode, 54, 0);
            getpostalcode.IconCompatParcelizer(true);
        } else {
            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        return createFromParcel.INSTANCE;
    }
}
