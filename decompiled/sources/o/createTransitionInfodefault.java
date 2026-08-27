package o;

import com.roadrunner.delivery.pickupdropoff.tasks.data.TasksRepository;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class createTransitionInfodefault extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public long IconCompatParcelizer;
    public /* synthetic */ Object MediaDescriptionCompat;
    public final /* synthetic */ TasksRepository MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public String RemoteActionCompatParcelizer;
    public PreviewActivityExternalSyntheticLambda4 read;
    public ArrayList serializer;
    public String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createTransitionInfodefault(TasksRepository tasksRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaMetadataCompat = tasksRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        TasksRepository tasksRepository;
        long j;
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaBrowserCompatMediaItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.MediaDescriptionCompat = obj;
            this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
            tasksRepository = this.MediaMetadataCompat;
            j = 1;
        } else {
            this.MediaDescriptionCompat = obj;
            this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
            tasksRepository = this.MediaMetadataCompat;
            j = 0;
        }
        Object objUpdateTaskCache$implementation = tasksRepository.updateTaskCache$implementation(j, null, null, this);
        int i3 = RatingCompat + 95;
        MediaBrowserCompatMediaItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return objUpdateTaskCache$implementation;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
