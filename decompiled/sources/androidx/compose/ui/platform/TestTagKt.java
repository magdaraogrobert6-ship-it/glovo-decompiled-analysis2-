package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes4.dex */
public final class TestTagKt {
    public static final Modifier testTag(Modifier modifier, String str) {
        return modifier.then(new TestTagElement(str));
    }
}
