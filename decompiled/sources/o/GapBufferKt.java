package o;

import android.os.Process;
import com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class GapBufferKt extends ContinuationImpl {
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat;
    public static int RemoteActionCompatParcelizer;
    public static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ObserveTagsUiState$invoke$$inlined$map$1$2 serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GapBufferKt(ObserveTagsUiState$invoke$$inlined$map$1$2 observeTagsUiState$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.serializer = observeTagsUiState$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 35;
        MediaDescriptionCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objEmit = this.serializer.emit(null, this);
        int i4 = RatingCompat + 123;
        MediaDescriptionCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objEmit;
    }

    public static int serializer() {
        int i = RemoteActionCompatParcelizer;
        int i2 = i % 7660301;
        RemoteActionCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int iMyTid = Process.myTid();
        write = iMyTid;
        return iMyTid;
    }
}
