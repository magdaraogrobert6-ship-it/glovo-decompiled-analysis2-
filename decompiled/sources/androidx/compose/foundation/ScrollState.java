package androidx.compose.foundation;

import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.gestures.DefaultScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.CompositionKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.InlineChildren;
import o.RoundedCornerShapea9UjIt4default;
import o.applyMeasureResultfoundation;
import o.createFromParcel;
import o.getAdjustedCoordinatesk4lQ0M;
import o.getPersonLastName;
import o.getPlatformAndroidManager;
import o.getViewportSizeYbymL2g;
import o.onHideTranslationui;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollState implements getAdjustedCoordinatesk4lQ0M {
    public static final CardView$1 serializer = new CardView$1(new ScrollState$$ExternalSyntheticLambda3(0), 5, new getViewportSizeYbymL2g(8));
    public final getPlatformAndroidManager MediaDescriptionCompat;
    public float write;
    public final getPlatformAndroidManager MediaSessionCompatQueueItem = CompositionKt.read(0);
    public final getPlatformAndroidManager MediaMetadataCompat = CompositionKt.read(0);
    public final MutableInteractionSourceImpl MediaBrowserCompatMediaItem = new MutableInteractionSourceImpl();
    public final getPlatformAndroidManager read = CompositionKt.read(Integer.MAX_VALUE);
    public final DefaultScrollableState RatingCompat = new DefaultScrollableState(new InlineChildren(0, this));
    public final getPersonLastName IconCompatParcelizer = CompositionKt.serializer(new RoundedCornerShapea9UjIt4default(this, 0));
    public final getPersonLastName RemoteActionCompatParcelizer = CompositionKt.serializer(new RoundedCornerShapea9UjIt4default(this, 1));

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean IconCompatParcelizer() {
        return this.RatingCompat.IconCompatParcelizer();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean RemoteActionCompatParcelizer() {
        return ((Boolean) this.RemoteActionCompatParcelizer.getValue()).booleanValue();
    }

    public final int read() {
        return ((onHideTranslationui) this.read).serializer();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final Object scroll(applyMeasureResultfoundation applymeasureresultfoundation, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, ContinuationImpl continuationImpl) {
        Object objScroll = this.RatingCompat.scroll(applymeasureresultfoundation, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, continuationImpl);
        return objScroll == CoroutineSingletons.COROUTINE_SUSPENDED ? objScroll : createFromParcel.INSTANCE;
    }

    public final int serializer() {
        return ((onHideTranslationui) this.MediaDescriptionCompat).serializer();
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final float write(float f) {
        return this.RatingCompat.write(f);
    }

    @Override // o.getAdjustedCoordinatesk4lQ0M
    public final boolean write() {
        return ((Boolean) this.IconCompatParcelizer.getValue()).booleanValue();
    }

    public ScrollState(int i) {
        this.MediaDescriptionCompat = CompositionKt.read(i);
    }
}
