package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;

/* JADX INFO: loaded from: classes.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    default boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    void onCancelPointerInput();

    default void onDensityChange() {
        onCancelPointerInput();
    }

    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    void mo11onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    default void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    default boolean sharePointerInputWithSiblings() {
        return false;
    }

    /* JADX INFO: renamed from: getTouchBoundsExpansion-RZrCHBk */
    default long mo1974getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m2652getNoneRZrCHBk();
    }
}
