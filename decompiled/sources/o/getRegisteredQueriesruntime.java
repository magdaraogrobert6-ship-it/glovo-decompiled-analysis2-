package o;

import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class getRegisteredQueriesruntime extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem;
    public final /* synthetic */ GetNestScope$invoke$$inlined$map$1.AnonymousClass2 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public FlowCollector read;
    public int serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getRegisteredQueriesruntime(GetNestScope$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 123;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return this.IconCompatParcelizer.emit((Object) null, this);
        }
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        int i3 = 47 / 0;
        return this.IconCompatParcelizer.emit((Object) null, this);
    }
}
