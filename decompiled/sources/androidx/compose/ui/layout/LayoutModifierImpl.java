package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;
    private r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY measureBlock;

    public final r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY getMeasureBlock() {
        return this.measureBlock;
    }

    public final void setMeasureBlock(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.measureBlock = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public MeasureResult mo7measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        return (MeasureResult) this.measureBlock.invoke(measureScope, measurable, Constraints.m3613boximpl(j));
    }

    public LayoutModifierImpl(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        this.measureBlock = r8lambdafjq9b8d5osr_i2bajdxqnw6rnry;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
