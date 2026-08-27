package androidx.compose.ui.text.font;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.onViewAttachedToWindow;

/* JADX INFO: loaded from: classes.dex */
public interface TypefaceResult extends onViewAttachedToWindow {

    public static final class Async implements TypefaceResult, onViewAttachedToWindow {
        public static final int $stable = 0;
        private final AsyncFontListLoader current;

        public final AsyncFontListLoader getCurrent$ui_text() {
            return this.current;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable$ui_text();
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult, o.onViewAttachedToWindow
        public Object getValue() {
            return this.current.getValue();
        }

        public Async(AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }
    }

    boolean getCacheable();

    @Override // o.onViewAttachedToWindow
    /* synthetic */ Object getValue();

    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;
        private final Object value;

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult, o.onViewAttachedToWindow
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ Immutable(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }

        public Immutable(Object obj, boolean z) {
            this.value = obj;
            this.cacheable = z;
        }
    }
}
