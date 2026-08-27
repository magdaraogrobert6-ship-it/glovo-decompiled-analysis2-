package o;

import com.roadrunner.home.nest.data.NestComponentRepositoryImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class SeekBarPreferenceSavedState implements getColorIntegerOrNulllambda0 {
    private static int ComponentActivity = 0;
    private static int r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 1;
    public final mergeJsonObjects IconCompatParcelizer;
    public final mergeJsonObjects MediaBrowserCompatMediaItem;
    public final mergeJsonObjects MediaDescriptionCompat;
    public final mergeJsonObjects MediaMetadataCompat;
    public final mergeJsonObjects MediaSessionCompatQueueItem;
    public final mergeJsonObjects MediaSessionCompatResultReceiverWrapper;
    public final mergeJsonObjects MediaSessionCompatToken;
    public final mergeJsonObjects ParcelableVolumeInfo;
    public final mergeJsonObjects PlaybackStateCompat;
    public final mergeJsonObjects PlaybackStateCompatCustomAction;
    public final mergeJsonObjects RatingCompat;
    public final mergeJsonObjects RemoteActionCompatParcelizer;
    public final mergeJsonObjects read;
    public final executeQuery serializer;
    public final mergeJsonObjects write;

    public SeekBarPreferenceSavedState(mergeJsonObjects mergejsonobjects, getDoubleOrNull getdoubleornull, executeQuery executequery, getDoubleOrNull getdoubleornull2, getDoubleOrNull getdoubleornull3, getDoubleOrNull getdoubleornull4, getDoubleOrNull getdoubleornull5, getDoubleOrNull getdoubleornull6, getDoubleOrNull getdoubleornull7, getDoubleOrNull getdoubleornull8, getDoubleOrNull getdoubleornull9, getDoubleOrNull getdoubleornull10, getDoubleOrNull getdoubleornull11, getDoubleOrNull getdoubleornull12, getDoubleOrNull getdoubleornull13) {
        this.MediaSessionCompatQueueItem = mergejsonobjects;
        this.PlaybackStateCompatCustomAction = getdoubleornull;
        this.serializer = executequery;
        this.MediaSessionCompatResultReceiverWrapper = getdoubleornull2;
        this.MediaBrowserCompatMediaItem = getdoubleornull3;
        this.write = getdoubleornull4;
        this.RatingCompat = getdoubleornull5;
        this.PlaybackStateCompat = getdoubleornull6;
        this.IconCompatParcelizer = getdoubleornull7;
        this.read = getdoubleornull8;
        this.ParcelableVolumeInfo = getdoubleornull9;
        this.MediaMetadataCompat = getdoubleornull10;
        this.MediaSessionCompatToken = getdoubleornull11;
        this.RemoteActionCompatParcelizer = getdoubleornull12;
        this.MediaDescriptionCompat = getdoubleornull13;
    }

    @Override // o.r8lambdaktWLyIpskQ3TFA9eY3gatOnIxFQ
    public final Object write() {
        int i = 2 % 2;
        NestComponentRepositoryImpl nestComponentRepositoryImpl = (NestComponentRepositoryImpl) this.MediaSessionCompatQueueItem.write();
        getSuperscripty9eOQZsannotations getsuperscripty9eoqzsannotations = (getSuperscripty9eOQZsannotations) this.PlaybackStateCompatCustomAction.write();
        onSelectedChanged onselectedchanged = (onSelectedChanged) this.MediaSessionCompatResultReceiverWrapper.write();
        hasDragFlag hasdragflag = (hasDragFlag) this.MediaBrowserCompatMediaItem.write();
        registerTriggersuspendImpl registertriggersuspendimpl = (registerTriggersuspendImpl) this.write.write();
        GapWorker gapWorker = (GapWorker) this.RatingCompat.write();
        overwriteCallback overwritecallback = (overwriteCallback) this.PlaybackStateCompat.write();
        sendReferrer sendreferrer = (sendReferrer) this.IconCompatParcelizer.write();
        setIgnoreSystemLifecycleBootstrap setignoresystemlifecyclebootstrap = (setIgnoreSystemLifecycleBootstrap) this.read.write();
        RecyclerView recyclerView = (RecyclerView) this.ParcelableVolumeInfo.write();
        getControlParamsJson getcontrolparamsjson = (getControlParamsJson) this.MediaMetadataCompat.write();
        getBoundingBoxMargin getboundingboxmargin = (getBoundingBoxMargin) this.MediaSessionCompatToken.write();
        ItemTouchHelperCallback itemTouchHelperCallback = (ItemTouchHelperCallback) this.RemoteActionCompatParcelizer.write();
        DiffUtilCallback diffUtilCallback = (DiffUtilCallback) this.MediaDescriptionCompat.write();
        nestComponentRepositoryImpl.getClass();
        getsuperscripty9eoqzsannotations.getClass();
        onselectedchanged.getClass();
        hasdragflag.getClass();
        registertriggersuspendimpl.getClass();
        gapWorker.getClass();
        overwritecallback.getClass();
        sendreferrer.getClass();
        setignoresystemlifecyclebootstrap.getClass();
        recyclerView.getClass();
        getcontrolparamsjson.getClass();
        getboundingboxmargin.getClass();
        itemTouchHelperCallback.getClass();
        diffUtilCallback.getClass();
        IBraze iBraze = new IBraze();
        iBraze.read = nestComponentRepositoryImpl;
        iBraze.RemoteActionCompatParcelizer = getsuperscripty9eoqzsannotations;
        iBraze.MediaMetadataCompat = this.serializer;
        iBraze.RatingCompat = onselectedchanged;
        iBraze.ParcelableVolumeInfo = hasdragflag;
        iBraze.PlaybackStateCompat = registertriggersuspendimpl;
        iBraze.serializer = gapWorker;
        iBraze.IconCompatParcelizer = overwritecallback;
        iBraze.MediaBrowserCompatMediaItem = sendreferrer;
        iBraze.MediaDescriptionCompat = setignoresystemlifecyclebootstrap;
        iBraze.MediaSessionCompatQueueItem = recyclerView;
        iBraze.MediaSessionCompatResultReceiverWrapper = getcontrolparamsjson;
        iBraze.write = getboundingboxmargin;
        iBraze.MediaSessionCompatToken = itemTouchHelperCallback;
        iBraze.PlaybackStateCompatCustomAction = diffUtilCallback;
        int i2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus + 83;
        ComponentActivity = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return iBraze;
    }
}
