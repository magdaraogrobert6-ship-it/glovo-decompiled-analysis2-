package o;

import com.sentiance.core.model.events.C$b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class checkEnvironment extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ C$b read;
    public /* synthetic */ Object serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public checkEnvironment(C$b c$b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = c$b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 37;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.serializer = obj;
            this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
            return this.read.invoke$implementation(this);
        }
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        int i3 = 11 / 0;
        return this.read.invoke$implementation(this);
    }
}
