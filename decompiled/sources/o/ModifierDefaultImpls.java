package o;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
public final class ModifierDefaultImpls extends ContinuationImpl {
    public CharSequence IconCompatParcelizer;
    public final /* synthetic */ androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl MediaBrowserCompatMediaItem;
    public /* synthetic */ Object MediaMetadataCompat;
    public int RemoteActionCompatParcelizer;
    public MutexImpl read;
    public Object serializer;
    public long write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierDefaultImpls(androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaBrowserCompatMediaItem = platformSelectionBehaviorsImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        return androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.m110access$classifyTextM8tDOmk(this.MediaBrowserCompatMediaItem, null, 0L, null, this);
    }
}
