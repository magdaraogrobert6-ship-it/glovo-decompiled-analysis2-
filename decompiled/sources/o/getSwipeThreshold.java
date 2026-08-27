package o;

import com.google.re2j.Parser;
import com.roadrunner.home.nest.divider.DividerUiModelImpl$1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getSwipeThreshold implements decryptAndGetPasswordBWLJW6A {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public final StateFlow IconCompatParcelizer;
    public final MutableStateFlow RemoteActionCompatParcelizer;
    public final MutableStateFlow read;
    public final Parser.Pair serializer;
    public final MutableStateFlow write;

    @Override // o.decryptAndGetPasswordBWLJW6A
    public final StateFlow IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 43;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        MutableStateFlow mutableStateFlow = this.write;
        int i5 = i2 + 107;
        RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public getSwipeThreshold(Parser.Pair pair, ContextScope contextScope) {
        pair.getClass();
        this.serializer = pair;
        MutableStateFlow mutableStateFlow = StateFlowKt.read(Boolean.FALSE);
        this.RemoteActionCompatParcelizer = mutableStateFlow;
        this.write = mutableStateFlow;
        MutableStateFlow mutableStateFlow2 = StateFlowKt.read(MultiSelectListPreference.write);
        this.read = mutableStateFlow2;
        this.IconCompatParcelizer = mutableStateFlow2;
        BuildersKt.RemoteActionCompatParcelizer(contextScope, null, null, new DividerUiModelImpl$1(this, null, 12), 3);
    }
}
