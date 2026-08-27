package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LayoutModifierNodemaxIntrinsicWidth1 {
    public final Class IconCompatParcelizer;
    public final Class read;
    public final Map write;

    public abstract LayoutModifierNodemaxIntrinsicHeight1 IconCompatParcelizer();

    public abstract invalidateSemanticsui RemoteActionCompatParcelizer();

    public abstract setInteropViewFactoryHolderui RemoteActionCompatParcelizer(setOnAttachui setonattachui);

    public abstract String read();

    public IntrinsicsPolicy serializer() {
        return IntrinsicsPolicy.ALGORITHM_NOT_FIPS;
    }

    public abstract void serializer(setInteropViewFactoryHolderui setinteropviewfactoryholderui);

    public LayoutModifierNodemaxIntrinsicWidth1(Class cls, LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode... layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr) {
        this.IconCompatParcelizer = cls;
        HashMap map = new HashMap();
        for (LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode : layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr) {
            boolean zContainsKey = map.containsKey(layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode.serializer);
            Class cls2 = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode.serializer;
            if (zContainsKey) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
            map.put(cls2, layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode);
        }
        if (layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr.length > 0) {
            this.read = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr[0].serializer;
        } else {
            this.read = Void.class;
        }
        this.write = Collections.unmodifiableMap(map);
    }
}
