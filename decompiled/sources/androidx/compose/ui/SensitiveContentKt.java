package androidx.compose.ui;

/* JADX INFO: loaded from: classes4.dex */
public final class SensitiveContentKt {
    public static final Modifier sensitiveContent(Modifier modifier, boolean z) {
        return modifier.then(new SensitiveNodeElement(z));
    }

    public static /* synthetic */ Modifier sensitiveContent$default(Modifier modifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return sensitiveContent(modifier, z);
    }
}
