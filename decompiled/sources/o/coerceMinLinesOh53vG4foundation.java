package o;

import androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1;

/* JADX INFO: loaded from: classes.dex */
public abstract class coerceMinLinesOh53vG4foundation {
    public static final DraggableKt$NoOpOnDragStarted$1 IconCompatParcelizer;
    public static final DraggableKt$NoOpOnDragStarted$1 write;

    public static androidx.compose.ui.Modifier RemoteActionCompatParcelizer(androidx.compose.ui.Modifier modifier, accessgetGreencp accessgetgreencp, SelectionHandleIcon selectionHandleIcon, boolean z, boolean z2, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, int i) {
        return modifier.then(new MinLinesConstrainer(accessgetgreencp, selectionHandleIcon, z, null, z2, IconCompatParcelizer, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, false));
    }

    public static final long RemoteActionCompatParcelizer(long j) {
        return androidx.compose.ui.unit.VelocityKt.Velocity(Float.isNaN(androidx.compose.ui.unit.Velocity.m3911getXimpl(j)) ? 0.0f : androidx.compose.ui.unit.Velocity.m3911getXimpl(j), Float.isNaN(androidx.compose.ui.unit.Velocity.m3912getYimpl(j)) ? 0.0f : androidx.compose.ui.unit.Velocity.m3912getYimpl(j));
    }

    static {
        int i = 3;
        ShortNewsContentCardView shortNewsContentCardView = null;
        IconCompatParcelizer = new DraggableKt$NoOpOnDragStarted$1(i, 0, shortNewsContentCardView);
        write = new DraggableKt$NoOpOnDragStarted$1(i, 1, shortNewsContentCardView);
    }
}
