package o;

import com.roadrunner.util.sound.DefaultForegroundSoundManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToContentCardsUpdateslambda3 extends ContinuationImpl {
    private static int MediaMetadataCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public /* synthetic */ Object IconCompatParcelizer;
    public int read;
    public final /* synthetic */ DefaultForegroundSoundManager serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public subscribeToContentCardsUpdateslambda3(DefaultForegroundSoundManager defaultForegroundSoundManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = defaultForegroundSoundManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DefaultForegroundSoundManager defaultForegroundSoundManager;
        long j;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            defaultForegroundSoundManager = this.serializer;
            j = 1;
        } else {
            this.IconCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            defaultForegroundSoundManager = this.serializer;
            j = 0;
        }
        return DefaultForegroundSoundManager.access$scheduleAudioFocusAbandonment(defaultForegroundSoundManager, j, this);
    }
}
