package o;

import com.roadrunner.customerchat.selfservice.data.cache.ChatIdCacheHelper;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class withBulletListo2QH7mIdefault extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RatingCompat;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ ChatIdCacheHelper MediaDescriptionCompat;
    public String RemoteActionCompatParcelizer;
    public MutexImpl read;
    public String serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public withBulletListo2QH7mIdefault(ChatIdCacheHelper chatIdCacheHelper, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = chatIdCacheHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objPut = this.MediaDescriptionCompat.put(null, null, this);
        int i4 = MediaMetadataCompat + 43;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objPut;
        }
        throw null;
    }
}
