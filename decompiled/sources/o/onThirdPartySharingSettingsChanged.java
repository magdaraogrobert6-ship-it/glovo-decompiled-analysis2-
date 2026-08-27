package o;

import com.roadrunner.rider.state.provider.domain.SaveWorkOpportunities;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class onThirdPartySharingSettingsChanged extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatToken = 1;
    public IActivityHandler IconCompatParcelizer;
    public Collection MediaBrowserCompatMediaItem;
    public final /* synthetic */ SaveWorkOpportunities MediaDescriptionCompat;
    public int MediaSessionCompatQueueItem;
    public /* synthetic */ Object RatingCompat;
    public Iterator RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public Collection write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onThirdPartySharingSettingsChanged(SaveWorkOpportunities saveWorkOpportunities, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaDescriptionCompat = saveWorkOpportunities;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatToken + 97;
        MediaMetadataCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RatingCompat = obj;
        this.MediaSessionCompatQueueItem |= Integer.MIN_VALUE;
        Object objInvoke = this.MediaDescriptionCompat.invoke(null, this);
        int i4 = MediaSessionCompatToken + 35;
        MediaMetadataCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objInvoke;
    }
}
