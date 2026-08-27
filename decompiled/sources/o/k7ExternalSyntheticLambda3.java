package o;

import com.mapbox.navigation.core.trip.session.LocationMatcherResult;
import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class k7ExternalSyntheticLambda3 extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int read;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 serializer;
    public LocationMatcherResult write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7ExternalSyntheticLambda3(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 63;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit((LocationMatcherResult) null, (ShortNewsContentCardView) this);
        int i4 = read + 57;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 92 / 0;
        }
        return objEmit;
    }
}
