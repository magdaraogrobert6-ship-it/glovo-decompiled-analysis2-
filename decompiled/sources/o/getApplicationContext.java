package o;

import com.roadrunner.tnc.TncComposableFactoryImpl$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.AbstractMap$$ExternalSyntheticLambda0;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class getApplicationContext implements createTouchAwareListener, r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w {
    public final /* synthetic */ MutexImpl IconCompatParcelizer;
    public final CancellableContinuationImpl serializer;

    @Override // o.r8lambdaBDpegEGfDoZFH__sYSlYzSYbo2w
    public final void RemoteActionCompatParcelizer(Segment segment, int i) {
        this.serializer.RemoteActionCompatParcelizer(segment, i);
    }

    @Override // o.ShortNewsContentCardView
    public final TextAnnouncementContentCardView getContext() {
        return this.serializer.MediaBrowserCompatMediaItem;
    }

    @Override // o.ShortNewsContentCardView
    public final void resumeWith(Object obj) {
        this.serializer.resumeWith(obj);
    }

    @Override // o.createTouchAwareListener
    public final void serializer(Object obj) {
        this.serializer.serializer(obj);
    }

    @Override // o.createTouchAwareListener
    public final void serializer(Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MutexImpl.write;
        MutexImpl mutexImpl = this.IconCompatParcelizer;
        atomicReferenceFieldUpdater.set(mutexImpl, null);
        AbstractMap$$ExternalSyntheticLambda0 abstractMap$$ExternalSyntheticLambda0 = new AbstractMap$$ExternalSyntheticLambda0(mutexImpl, this);
        CancellableContinuationImpl cancellableContinuationImpl = this.serializer;
        cancellableContinuationImpl.IconCompatParcelizer(cancellableContinuationImpl.MediaSessionCompatQueueItem, (createFromParcel) obj, new TncComposableFactoryImpl$$ExternalSyntheticLambda0(12, abstractMap$$ExternalSyntheticLambda0));
    }

    @Override // o.createTouchAwareListener
    public final boolean serializer(Throwable th) {
        return this.serializer.serializer(th);
    }

    public getApplicationContext(MutexImpl mutexImpl, CancellableContinuationImpl cancellableContinuationImpl) {
        this.IconCompatParcelizer = mutexImpl;
        this.serializer = cancellableContinuationImpl;
    }

    @Override // o.createTouchAwareListener
    public final Symbol write(Object obj, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry) {
        MutexImpl mutexImpl = this.IconCompatParcelizer;
        getDoesBackButtonDismissInAppMessageView getdoesbackbuttondismissinappmessageview = new getDoesBackButtonDismissInAppMessageView(mutexImpl, this);
        Symbol symbolIconCompatParcelizer = this.serializer.IconCompatParcelizer((createFromParcel) obj, getdoesbackbuttondismissinappmessageview);
        if (symbolIconCompatParcelizer != null) {
            MutexImpl.write.set(mutexImpl, null);
        }
        return symbolIconCompatParcelizer;
    }
}
