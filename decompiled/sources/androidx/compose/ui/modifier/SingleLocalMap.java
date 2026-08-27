package androidx.compose.ui.modifier;

import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import o.PopulateViewStructure_androidKtpopulate7;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleLocalMap extends ModifierLocalMap {
    public static final int $stable = 0;
    private final ModifierLocal<?> key;
    private final PopulateViewStructure_androidKtpopulate7 value$delegate;

    public SingleLocalMap(ModifierLocal<?> modifierLocal) {
        super(null);
        this.key = modifierLocal;
        this.value$delegate = CompositionKt.RemoteActionCompatParcelizer(null);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public boolean contains$ui(ModifierLocal<?> modifierLocal) {
        return modifierLocal == this.key;
    }

    public final void forceValue$ui(Object obj) {
        setValue(obj);
    }

    private final Object getValue() {
        return this.value$delegate.getValue();
    }

    private final void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    public <T> T get$ui(ModifierLocal<T> modifierLocal) {
        if (modifierLocal != this.key) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        T t = (T) getValue();
        if (t == null) {
            return null;
        }
        return t;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalMap
    /* JADX INFO: renamed from: set$ui */
    public <T> void mo2368set$ui(ModifierLocal<T> modifierLocal, T t) {
        if (modifierLocal != this.key) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        setValue(t);
    }
}
