package o;

import com.roadrunner.customerchat.selfservice.presentation.WebChatViewModel$observeBridgeMessage$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class toLocalIndex extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ WebChatViewModel$observeBridgeMessage$2 serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public toLocalIndex(WebChatViewModel$observeBridgeMessage$2 webChatViewModel$observeBridgeMessage$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = webChatViewModel$observeBridgeMessage$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = read + 51;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.serializer.emit((onViewAttachedToWindowlambda0) null, (ShortNewsContentCardView) this);
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        this.serializer.emit((onViewAttachedToWindowlambda0) null, (ShortNewsContentCardView) this);
        throw null;
    }
}
