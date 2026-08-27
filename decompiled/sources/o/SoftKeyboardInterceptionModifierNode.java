package o;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class SoftKeyboardInterceptionModifierNode {
    public static volatile SoftKeyboardInterceptionModifierNode read;
    public static final SoftKeyboardInterceptionModifierNode serializer;

    static {
        SoftKeyboardInterceptionModifierNode softKeyboardInterceptionModifierNode = new SoftKeyboardInterceptionModifierNode();
        Map map = Collections.EMPTY_MAP;
        serializer = softKeyboardInterceptionModifierNode;
    }
}
