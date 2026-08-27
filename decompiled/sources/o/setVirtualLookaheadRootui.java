package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setVirtualLookaheadRootui {
    public static final updateChildrenIfDirtyui serializer = new updateChildrenIfDirtyui();
    public static final LayoutNodeExternalSyntheticLambda1 write;

    static {
        LayoutNodeExternalSyntheticLambda1 layoutNodeExternalSyntheticLambda1 = null;
        try {
            layoutNodeExternalSyntheticLambda1 = (LayoutNodeExternalSyntheticLambda1) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        write = layoutNodeExternalSyntheticLambda1;
    }

    public static LayoutNodeExternalSyntheticLambda1 write() {
        LayoutNodeExternalSyntheticLambda1 layoutNodeExternalSyntheticLambda1 = write;
        if (layoutNodeExternalSyntheticLambda1 != null) {
            return layoutNodeExternalSyntheticLambda1;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write("Protobuf runtime is not correctly loaded.");
        return null;
    }
}
