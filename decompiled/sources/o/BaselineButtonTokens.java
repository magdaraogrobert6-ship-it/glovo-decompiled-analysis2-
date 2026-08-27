package o;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class BaselineButtonTokens implements androidx.compose.ui.layout.MeasureScope {
    public final onRelease IconCompatParcelizer;
    public final androidx.compose.ui.layout.SubcomposeMeasureScope RemoteActionCompatParcelizer;
    public final animateToWithDecay read;
    public final animateToHidden write;

    @Override // androidx.compose.ui.unit.Density
    public final float getDensity() {
        return this.RemoteActionCompatParcelizer.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public final float getFontScale() {
        return this.RemoteActionCompatParcelizer.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final androidx.compose.ui.unit.LayoutDirection getLayoutDirection() {
        return this.RemoteActionCompatParcelizer.getLayoutDirection();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public final boolean isLookingAhead() {
        return this.RemoteActionCompatParcelizer.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final androidx.compose.ui.layout.MeasureResult layout(int i, int i2, Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return this.RemoteActionCompatParcelizer.layout(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final int mo41roundToPxR2X_6o(long j) {
        return this.RemoteActionCompatParcelizer.mo41roundToPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final int mo42roundToPx0680j_4(float f) {
        return this.RemoteActionCompatParcelizer.mo42roundToPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final float mo43toDpGaN1DYA(long j) {
        return this.RemoteActionCompatParcelizer.mo43toDpGaN1DYA(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo45toDpu2uoSUM(int i) {
        return this.RemoteActionCompatParcelizer.mo45toDpu2uoSUM(i);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final long mo46toDpSizekrfVVM(long j) {
        return this.RemoteActionCompatParcelizer.mo46toDpSizekrfVVM(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final float mo47toPxR2X_6o(long j) {
        return this.RemoteActionCompatParcelizer.mo47toPxR2X_6o(j);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final float mo48toPx0680j_4(float f) {
        return this.RemoteActionCompatParcelizer.mo48toPx0680j_4(f);
    }

    @Override // androidx.compose.ui.unit.Density
    public final androidx.compose.ui.geometry.Rect toRect(androidx.compose.ui.unit.DpRect dpRect) {
        return this.RemoteActionCompatParcelizer.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final long mo49toSizeXkaWNTQ(long j) {
        return this.RemoteActionCompatParcelizer.mo49toSizeXkaWNTQ(j);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final long mo50toSp0xMU5do(float f) {
        return this.RemoteActionCompatParcelizer.mo50toSp0xMU5do(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo51toSpkPz2Gy4(float f) {
        return this.RemoteActionCompatParcelizer.mo51toSpkPz2Gy4(f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List write(int i) {
        animateToWithDecay animatetowithdecay = this.read;
        List list = (List) animatetowithdecay.serializer(i);
        if (list != null) {
            return list;
        }
        onRelease onrelease = this.IconCompatParcelizer;
        Object objWrite = onrelease.write(i);
        List<androidx.compose.ui.layout.Measurable> listSubcompose = this.RemoteActionCompatParcelizer.subcompose(objWrite, this.write.IconCompatParcelizer(objWrite, i, onrelease.serializer(i)));
        animatetowithdecay.IconCompatParcelizer(i, listSubcompose);
        return listSubcompose;
    }

    public BaselineButtonTokens(animateToHidden animatetohidden, androidx.compose.ui.layout.SubcomposeMeasureScope subcomposeMeasureScope) {
        this.write = animatetohidden;
        this.RemoteActionCompatParcelizer = subcomposeMeasureScope;
        this.IconCompatParcelizer = (onRelease) animatetohidden.write.invoke();
        VerticalScrollableClipShape.RemoteActionCompatParcelizer();
        this.read = new animateToWithDecay();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public final androidx.compose.ui.layout.MeasureResult layout(int i, int i2, Map map, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm2) {
        return this.RemoteActionCompatParcelizer.layout(i, i2, map, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaunavo3sxub_pc9xroryotnrlvsm2);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final float mo44toDpu2uoSUM(float f) {
        return this.RemoteActionCompatParcelizer.mo44toDpu2uoSUM(f);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final long mo52toSpkPz2Gy4(int i) {
        return this.RemoteActionCompatParcelizer.mo52toSpkPz2Gy4(i);
    }
}
