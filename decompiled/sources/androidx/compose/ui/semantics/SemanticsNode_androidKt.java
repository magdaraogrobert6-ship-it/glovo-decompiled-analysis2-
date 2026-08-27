package androidx.compose.ui.semantics;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsNode_androidKt {
    public static final boolean isAccessibilityIgnoredLink(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getLinkTestMarker());
    }
}
