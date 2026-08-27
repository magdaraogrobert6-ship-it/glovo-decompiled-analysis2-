package o;

import com.roadrunner.rider.safety.report.data.WelcomeMessageRepository;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdRevenuePlacement extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ WelcomeMessageRepository write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getAdRevenuePlacement(WelcomeMessageRepository welcomeMessageRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = welcomeMessageRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 99;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objShouldDisplayWelcomeMessage = this.write.shouldDisplayWelcomeMessage(this);
        int i4 = serializer + 101;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objShouldDisplayWelcomeMessage;
    }
}
