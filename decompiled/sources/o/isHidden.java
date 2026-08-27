package o;

import com.foodora.courier.main.presentation.MainActivity;
import com.sentiance.core.model.events.N$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class isHidden extends ContinuationImpl {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public int IconCompatParcelizer;
    public MainActivity read;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ N$b write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isHidden(N$b n$b, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.write = n$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 39;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.serializer = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            return this.write.launchAppReview(null, this);
        }
        this.serializer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 72 / 0;
        return this.write.launchAppReview(null, this);
    }
}
