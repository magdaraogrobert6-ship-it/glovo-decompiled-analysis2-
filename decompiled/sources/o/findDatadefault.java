package o;

import com.roadrunner.home.nest.NestViewModel$updateConfiguration$1$1$1$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class findDatadefault extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ NestViewModel$updateConfiguration$1$1$1$1 IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public FlowCollector write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public findDatadefault(NestViewModel$updateConfiguration$1$1$1$1 nestViewModel$updateConfiguration$1$1$1$1, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.IconCompatParcelizer = nestViewModel$updateConfiguration$1$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objEmit;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 43;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit((Object) null, this);
            int i3 = 93 / 0;
        } else {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            objEmit = this.IconCompatParcelizer.emit((Object) null, this);
        }
        int i4 = MediaBrowserCompatMediaItem + 55;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objEmit;
        }
        obj2.hashCode();
        throw null;
    }
}
