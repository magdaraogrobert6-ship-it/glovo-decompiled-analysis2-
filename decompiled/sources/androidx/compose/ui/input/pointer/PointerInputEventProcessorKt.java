package androidx.compose.ui.input.pointer;

/* JADX INFO: loaded from: classes.dex */
public final class PointerInputEventProcessorKt {
    private static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final int ProcessResult(boolean z, boolean z2, boolean z3) {
        return ProcessResult.m2158constructorimpl((z ? 1 : 0) | ((z2 ? 1 : 0) << 1) | ((z3 ? 1 : 0) << 2));
    }
}
