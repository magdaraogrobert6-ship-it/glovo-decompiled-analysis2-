package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getMeasurePolicyState {
    public static final /* synthetic */ int write = 0;

    static {
        int i = 9;
        LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode[] layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr = {new applyModifier(accessgetValuesp.class, i)};
        HashMap map = new HashMap();
        LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr[0];
        boolean zContainsKey = map.containsKey(layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode.serializer);
        Class cls = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode.serializer;
        if (!zContainsKey) {
            map.put(cls, layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode);
            Class cls2 = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr[0].serializer;
            Collections.unmodifiableMap(map);
            int i2 = rethrowWithComposeStackTrace.CONFIG_NAME_FIELD_NUMBER;
            try {
                removeFirst.write(minLookaheadIntrinsicWidth.IconCompatParcelizer);
                if (getLayoutNode.IconCompatParcelizer()) {
                    return;
                }
                removeFirst.serializer(new previous(getLookaheadPassDelegateui.class, new LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode[]{new applyModifier(accessgetValuesp.class, i)}, 8), true);
                return;
            } catch (GeneralSecurityException e) {
                throw new ExceptionInInitializerError(e);
            }
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
    }
}
