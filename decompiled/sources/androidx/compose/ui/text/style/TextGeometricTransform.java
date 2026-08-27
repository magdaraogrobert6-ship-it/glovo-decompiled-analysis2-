package androidx.compose.ui.text.style;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
public final class TextGeometricTransform {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextGeometricTransform None = new TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public final TextGeometricTransform copy(float f, float f2) {
        return new TextGeometricTransform(f, f2);
    }

    public int hashCode() {
        return Float.hashCode(this.skewX) + (Float.hashCode(this.scaleX) * 31);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getNone$ui_text$annotations() {
        }

        public final TextGeometricTransform getNone$ui_text() {
            return TextGeometricTransform.None;
        }

        private Companion() {
        }
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = textGeometricTransform.scaleX;
        }
        if ((i & 2) != 0) {
            f2 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.scaleX);
        sb.append(", skewX=");
        return MediaSessionCompatQueueItem.serializer(sb, this.skewX, ')');
    }

    public /* synthetic */ TextGeometricTransform(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    public TextGeometricTransform(float f, float f2) {
        this.scaleX = f;
        this.skewX = f2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextGeometricTransform() {
        float f = 0.0f;
        this(f, f, 3, null);
    }
}
