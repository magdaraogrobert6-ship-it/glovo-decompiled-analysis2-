package androidx.compose.ui.modifier;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    public /* synthetic */ ModifierLocalMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean contains$ui(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui(ModifierLocal<T> modifierLocal);

    /* JADX INFO: renamed from: set$ui */
    public abstract <T> void mo2368set$ui(ModifierLocal<T> modifierLocal, T t);

    private ModifierLocalMap() {
    }
}
