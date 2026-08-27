package o;

import com.roadrunner.delivery.accept.laststop.domain.LastStopSelectionCoordinator;
import dagger.Lazy;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getRangeForRect {
    private static int RatingCompat = 1;
    private static int read;
    public final fillLineHorizontalBoundsui_text IconCompatParcelizer;
    public final Lazy RemoteActionCompatParcelizer;
    public final MutableStateFlow serializer;
    public final MutableStateFlow write;

    public getRangeForRect(Lazy lazy, fillLineHorizontalBoundsui_text filllinehorizontalboundsui_text) {
        this.RemoteActionCompatParcelizer = lazy;
        this.IconCompatParcelizer = filllinehorizontalboundsui_text;
        drawRGB drawrgb = drawRGB.INACTIVE;
        this.serializer = StateFlowKt.read(drawrgb);
        this.write = StateFlowKt.read(drawrgb);
    }

    public final StateFlow read() {
        int i = 2 % 2;
        if (!this.IconCompatParcelizer.IconCompatParcelizer()) {
            MutableStateFlow mutableStateFlow = this.write;
            int i2 = read + 61;
            RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return mutableStateFlow;
        }
        int i4 = RatingCompat;
        int i5 = i4 + 101;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        MutableStateFlow mutableStateFlow2 = this.serializer;
        int i7 = i4 + 37;
        read = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return mutableStateFlow2;
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 5;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((LastStopSelectionCoordinator) this.RemoteActionCompatParcelizer.write()).write.IconCompatParcelizer(drawVertices.RemoteActionCompatParcelizer);
        this.serializer.IconCompatParcelizer(drawRGB.INACTIVE);
        int i4 = RatingCompat + 41;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
    }
}
