package o;

import java.util.stream.IntStream;

/* JADX INFO: renamed from: o.pointerInteropFilter, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0193pointerInteropFilter {
    public static IntStream read(CharSequence charSequence) {
        return charSequence.chars();
    }

    public static IntStream write(CharSequence charSequence) {
        return charSequence.codePoints();
    }
}
