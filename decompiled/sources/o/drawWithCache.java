package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes.dex */
public abstract class drawWithCache {
    public static final androidx.compose.ui.semantics.SemanticsPropertyKey RemoteActionCompatParcelizer;
    public static final /* synthetic */ registerInAppMessageManagerlambda2[] serializer;

    public static final void serializer(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver, DrawModifierDefaultImpls drawModifierDefaultImpls) {
        RemoteActionCompatParcelizer.setValue(semanticsPropertyReceiver, serializer[0], drawModifierDefaultImpls);
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(drawWithCache.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1);
        displayInAppMessagelambda1.IconCompatParcelizer.getClass();
        serializer = new registerInAppMessageManagerlambda2[]{mutablePropertyReference1Impl};
        RemoteActionCompatParcelizer = new androidx.compose.ui.semantics.SemanticsPropertyKey("DesignInfoProvider", (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) null, 2, (DefaultConstructorMarker) null);
    }
}
