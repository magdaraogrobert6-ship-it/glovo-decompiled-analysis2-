package o;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class PointModeCompanion extends ContinuationImpl {
    public int IconCompatParcelizer;
    public int MediaBrowserCompatMediaItem;
    public accessquadraticTojd MediaDescriptionCompat;
    public /* synthetic */ Object MediaMetadataCompat;
    public List RatingCompat;
    public int RemoteActionCompatParcelizer;
    public getBlurRadiusannotations read;
    public ShaderKt serializer;
    public getBufferOffset write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.MediaMetadataCompat = obj;
        this.MediaBrowserCompatMediaItem |= Integer.MIN_VALUE;
        return androidx.sqlite.SQLite.transform(null, null, null, null, this);
    }

    public PointModeCompanion(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
