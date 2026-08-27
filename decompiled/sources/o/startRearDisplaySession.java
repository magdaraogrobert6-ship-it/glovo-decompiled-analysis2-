package o;

import com.roadrunner.location.core.domain.ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class startRearDisplaySession extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1.AnonymousClass2 read;
    public /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public startRearDisplaySession(ObserveIsWithinGeofenceUseCaseImpl$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.read = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 49;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.emit(null, this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 31 / 0;
        return this.read.emit(null, this);
    }
}
