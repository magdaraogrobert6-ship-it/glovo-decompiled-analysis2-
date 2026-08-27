package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes.dex */
public interface DelegatableNode {

    public interface RegistrationHandle {
        void unregister();
    }

    Modifier.Node getNode();

    default void onDensityChange() {
    }

    default void onLayoutDirectionChange() {
    }
}
