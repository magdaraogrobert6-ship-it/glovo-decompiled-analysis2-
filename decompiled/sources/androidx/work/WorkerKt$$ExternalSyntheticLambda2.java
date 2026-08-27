package androidx.work;

import androidx.camera.camera2.internal.Camera2CapturePipeline$ScreenFlashTask;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o.PreviewView1ExternalSyntheticLambda2;
import o.animateDecay;
import o.getMaxCardElevation;
import o.getNavigationIcon;
import o.onDrawWithContent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WorkerKt$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ int write;

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda2(getMaxCardElevation getmaxcardelevation, getNavigationIcon getnavigationicon, onDrawWithContent ondrawwithcontent) {
        this.write = 10;
        Map map = Collections.EMPTY_MAP;
        this.IconCompatParcelizer = getmaxcardelevation;
        this.RemoteActionCompatParcelizer = getnavigationicon;
        this.read = ondrawwithcontent;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0335  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0339, code lost:
    
        if (((androidx.camera.core.SurfaceRequest) r0.RatingCompat) == r3) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [o.onDetachedFromWindow, o.setMeasureWithLargestChildEnabled] */
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
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 2110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.WorkerKt$$ExternalSyntheticLambda2.run():void");
    }

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda2(PreviewView1ExternalSyntheticLambda2 previewView1ExternalSyntheticLambda2, getNavigationIcon getnavigationicon, onDrawWithContent ondrawwithcontent) {
        this.write = 7;
        Map map = Collections.EMPTY_MAP;
        this.IconCompatParcelizer = previewView1ExternalSyntheticLambda2;
        this.RemoteActionCompatParcelizer = getnavigationicon;
        this.read = ondrawwithcontent;
    }

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda2(Camera2CapturePipeline$ScreenFlashTask camera2CapturePipeline$ScreenFlashTask, AtomicReference atomicReference, onDrawWithContent ondrawwithcontent) {
        this.write = 2;
        this.IconCompatParcelizer = camera2CapturePipeline$ScreenFlashTask;
        this.RemoteActionCompatParcelizer = atomicReference;
        this.read = ondrawwithcontent;
    }

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda2(animateDecay animatedecay, int i, String str, Throwable th) {
        this.write = 15;
        this.IconCompatParcelizer = animatedecay;
        this.read = str;
        this.RemoteActionCompatParcelizer = th;
    }

    public /* synthetic */ WorkerKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3, int i) {
        this.write = i;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
        this.RemoteActionCompatParcelizer = obj3;
    }
}
