package o;

import com.roadrunner.util.sound.DefaultBackgroundSoundManager;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class subscribeToContentCardsUpdateslambda1 extends ContinuationImpl {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public final /* synthetic */ DefaultBackgroundSoundManager IconCompatParcelizer;
    public long RemoteActionCompatParcelizer;
    public int serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public subscribeToContentCardsUpdateslambda1(DefaultBackgroundSoundManager defaultBackgroundSoundManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = defaultBackgroundSoundManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DefaultBackgroundSoundManager defaultBackgroundSoundManager;
        long j;
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 119;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            defaultBackgroundSoundManager = this.IconCompatParcelizer;
            j = 1;
        } else {
            this.write = obj;
            this.serializer |= Integer.MIN_VALUE;
            defaultBackgroundSoundManager = this.IconCompatParcelizer;
            j = 0;
        }
        Object objAccess$scheduleAudioFocusAbandonment = DefaultBackgroundSoundManager.access$scheduleAudioFocusAbandonment(defaultBackgroundSoundManager, j, this);
        int i3 = MediaSessionCompatQueueItem + 81;
        read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objAccess$scheduleAudioFocusAbandonment;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
