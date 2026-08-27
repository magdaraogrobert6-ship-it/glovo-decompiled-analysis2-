package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
public interface RectRulers {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    HorizontalRuler getBottom();

    VerticalRuler getLeft();

    VerticalRuler getRight();

    HorizontalRuler getTop();
}
