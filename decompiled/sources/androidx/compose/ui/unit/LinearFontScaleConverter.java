package androidx.compose.ui.unit;

import androidx.compose.ui.unit.fontscaling.FontScaleConverter;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes.dex */
final class LinearFontScaleConverter implements FontScaleConverter {
    private final float fontScale;

    private final float component1() {
        return this.fontScale;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertDpToSp(float f) {
        return f / this.fontScale;
    }

    @Override // androidx.compose.ui.unit.fontscaling.FontScaleConverter
    public float convertSpToDp(float f) {
        return f * this.fontScale;
    }

    public final LinearFontScaleConverter copy(float f) {
        return new LinearFontScaleConverter(f);
    }

    public int hashCode() {
        return Float.hashCode(this.fontScale);
    }

    public LinearFontScaleConverter(float f) {
        this.fontScale = f;
    }

    public static /* synthetic */ LinearFontScaleConverter copy$default(LinearFontScaleConverter linearFontScaleConverter, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = linearFontScaleConverter.fontScale;
        }
        return linearFontScaleConverter.copy(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LinearFontScaleConverter) && Float.compare(this.fontScale, ((LinearFontScaleConverter) obj).fontScale) == 0;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.serializer(new StringBuilder("LinearFontScaleConverter(fontScale="), this.fontScale, ')');
    }
}
