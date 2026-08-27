package androidx.compose.ui;

import java.util.Arrays;
import o.getCieXyz;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    public final String getFqName() {
        return this.fqName;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return Arrays.hashCode(this.keys) + (this.fqName.hashCode() * 31);
    }

    public KeyedComposedModifierN(String str, Object[] objArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        super(r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof KeyedComposedModifierN)) {
            return false;
        }
        KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.fqName, keyedComposedModifierN.fqName}, getCieXyz.write())).booleanValue() && Arrays.equals(this.keys, keyedComposedModifierN.keys);
    }
}
