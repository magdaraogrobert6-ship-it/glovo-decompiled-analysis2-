package bo.app;

import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.presentation.CustomerUnavailableFragment;
import o.ContentCaptureManager;
import o.component4;
import o.getPostalCode;
import o.makeTreedefault;
import o.notifyValueChanged;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ n$$ExternalSyntheticLambda3(makeTreedefault maketreedefault, ComposeView composeView, CustomerUnavailableFragment customerUnavailableFragment, FragmentActivity fragmentActivity) {
        this.$r8$classId = 22;
        this.f$0 = maketreedefault;
        this.f$1 = customerUnavailableFragment;
        this.f$2 = fragmentActivity;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:113:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:200:0x061b  */
    /* JADX WARN: Code duplicated, block: B:275:0x0834 A[Catch: all -> 0x0840, DONT_GENERATE, TRY_LEAVE, TryCatch #1 {, blocks: (B:235:0x0767, B:240:0x0790, B:241:0x0793, B:244:0x07a4, B:246:0x07a9, B:248:0x07af, B:250:0x07b8, B:251:0x07bd, B:263:0x07f7, B:254:0x07c7, B:257:0x07e3, B:259:0x07e8, B:261:0x07ef, B:267:0x0806, B:269:0x080c, B:270:0x0818, B:272:0x082d, B:273:0x0832, B:275:0x0834), top: B:389:0x0767 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:424:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0237  */
    /* JADX WARN: Code duplicated, block: B:79:0x023a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0242  */
    /* JADX WARN: Code duplicated, block: B:82:0x0245  */
    /* JADX WARN: Code duplicated, block: B:86:0x024f  */
    /* JADX WARN: Code duplicated, block: B:94:0x026d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [o.maybeSendPoolingContainerAttach] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [o.ShortNewsContentCardView] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v68 java.lang.Object, still in use, count: 2, list:
          (r5v68 java.lang.Object) from 0x0233: PHI (r5 I:??) = (r5v57 java.lang.Object), (r5v68 java.lang.Object) binds: [B:75:0x0232, B:398:0x0233] A[DONT_GENERATE, DONT_INLINE]
          (r5v68 java.lang.Object) from 0x0229: CHECK_CAST (o.updateTextLayoutResult) (r5v68 java.lang.Object)
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
    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 3090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.app.n$$ExternalSyntheticLambda3.invoke():java.lang.Object");
    }

    public /* synthetic */ n$$ExternalSyntheticLambda3(getPostalCode getpostalcode, ContentCaptureManager contentCaptureManager, component4 component4Var, notifyValueChanged notifyvaluechanged) {
        this.$r8$classId = 7;
        this.f$0 = getpostalcode;
        this.f$1 = contentCaptureManager;
        this.f$2 = component4Var;
    }

    public /* synthetic */ n$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }
}
