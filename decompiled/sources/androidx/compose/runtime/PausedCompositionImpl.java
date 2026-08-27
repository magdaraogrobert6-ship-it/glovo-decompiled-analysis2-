package androidx.compose.runtime;

import android.os.Trace;
import io.sentry.util.UrlUtils;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import o.ContentInViewNodelaunchAnimation21;
import o.awaitLongPressOrCancellationrnUCldI;
import o.awaitTouchSlopOrCancellationjO51t88;
import o.bufferContentCaptureViewDisappeared;
import o.contentCaptureChangeCheckerlambda0;
import o.fastForEachReplacedVisibleChildren;
import o.firstDescendantOrNull;
import o.getAddressCountry;
import o.getBirthDateYear;
import o.getContentCaptureSessionuiannotations;
import o.getCreditCardExpirationDay;
import o.getCreditCardSecurityCode;
import o.getHandlerui;
import o.getPostalCode;
import o.onCreateVirtualViewTranslationRequests;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.relocationOffsetfbGrOKE;
import o.toViewStructure;
import o.trackEventI;

/* JADX INFO: loaded from: classes.dex */
public final class PausedCompositionImpl implements bufferContentCaptureViewDisappeared {
    public final getBirthDateYear IconCompatParcelizer;
    public final firstDescendantOrNull MediaBrowserCompatMediaItem;
    public final Object MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public awaitTouchSlopOrCancellationjO51t88 MediaSessionCompatQueueItem;
    public final boolean MediaSessionCompatToken;
    public final AtomicReference PlaybackStateCompat = new AtomicReference(fastForEachReplacedVisibleChildren.InitialPending);
    public final toViewStructure RatingCompat;
    public final getAddressCountry RemoteActionCompatParcelizer;
    public final getPostalCode read;
    public final r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 serializer;
    public final getCreditCardSecurityCode write;

    public final firstDescendantOrNull RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final toViewStructure write() {
        return this.RatingCompat;
    }

    public final void IconCompatParcelizer() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.MediaDescriptionCompat) {
                try {
                    toViewStructure toviewstructure = this.RatingCompat;
                    getAddressCountry getaddresscountry = this.RemoteActionCompatParcelizer;
                    getaddresscountry.getClass();
                    toviewstructure.RemoteActionCompatParcelizer(getaddresscountry, this.MediaBrowserCompatMediaItem);
                    this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
                    this.MediaBrowserCompatMediaItem.serializer();
                    this.MediaBrowserCompatMediaItem.read();
                    this.write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                } catch (Throwable th) {
                    this.MediaBrowserCompatMediaItem.read();
                    this.write.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return ((fastForEachReplacedVisibleChildren) this.PlaybackStateCompat.get()).compareTo(fastForEachReplacedVisibleChildren.ApplyPending) >= 0;
    }

    public final void MediaDescriptionCompat() {
        AtomicReference atomicReference;
        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren = fastForEachReplacedVisibleChildren.RecomposePending;
        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren2 = fastForEachReplacedVisibleChildren.ApplyPending;
        do {
            atomicReference = this.PlaybackStateCompat;
            if (atomicReference.compareAndSet(fastforeachreplacedvisiblechildren, fastforeachreplacedvisiblechildren2)) {
                return;
            }
        } while (atomicReference.get() == fastforeachreplacedvisiblechildren);
        getContentCaptureSessionuiannotations.write("Unexpected state change from: " + fastforeachreplacedvisiblechildren + " to: " + fastforeachreplacedvisiblechildren2 + '.');
    }

    public final boolean MediaMetadataCompat() {
        if (this.PlaybackStateCompat.get() == fastForEachReplacedVisibleChildren.Recomposing) {
            long j = this.MediaMetadataCompat;
            int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
            int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
            int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
            if (j == ((Long) UrlUtils.RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, -1993279031, 1993279036, iIconCompatParcelizer3, new Object[0])).longValue()) {
                return true;
            }
        }
        return false;
    }

    public final void MediaSessionCompatQueueItem() {
        AtomicReference atomicReference;
        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren = fastForEachReplacedVisibleChildren.ApplyPending;
        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren2 = fastForEachReplacedVisibleChildren.RecomposePending;
        do {
            atomicReference = this.PlaybackStateCompat;
            if (atomicReference.compareAndSet(fastforeachreplacedvisiblechildren, fastforeachreplacedvisiblechildren2)) {
                return;
            }
        } while (atomicReference.get() == fastforeachreplacedvisiblechildren);
    }

    public final void read() throws Exception {
        AtomicReference atomicReference = this.PlaybackStateCompat;
        try {
            switch (contentCaptureChangeCheckerlambda0.write[((fastForEachReplacedVisibleChildren) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    IconCompatParcelizer();
                    fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren = fastForEachReplacedVisibleChildren.ApplyPending;
                    fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren2 = fastForEachReplacedVisibleChildren.Applied;
                    while (!atomicReference.compareAndSet(fastforeachreplacedvisiblechildren, fastforeachreplacedvisiblechildren2)) {
                        if (atomicReference.get() != fastforeachreplacedvisiblechildren) {
                            getContentCaptureSessionuiannotations.write("Unexpected state change from: " + fastforeachreplacedvisiblechildren + " to: " + fastforeachreplacedvisiblechildren2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(fastForEachReplacedVisibleChildren.Invalid);
            throw e;
        }
    }

    public final void serializer() {
        relocationOffsetfbGrOKE relocationoffsetfbgroke;
        this.PlaybackStateCompat.set(fastForEachReplacedVisibleChildren.Cancelled);
        firstDescendantOrNull firstdescendantornull = this.MediaBrowserCompatMediaItem;
        if (((relocationOffsetfbGrOKE) firstdescendantornull.MediaSessionCompatQueueItem).read()) {
            relocationoffsetfbgroke = (relocationOffsetfbGrOKE) firstdescendantornull.MediaSessionCompatQueueItem;
            relocationOffsetfbGrOKE relocationoffsetfbgroke2 = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
            firstdescendantornull.MediaSessionCompatQueueItem = new relocationOffsetfbGrOKE();
            ((onCreateVirtualViewTranslationRequests) firstdescendantornull.MediaBrowserCompatMediaItem).RemoteActionCompatParcelizer();
        } else {
            relocationoffsetfbgroke = null;
        }
        firstdescendantornull.read();
        getCreditCardSecurityCode getcreditcardsecuritycode = this.write;
        getcreditcardsecuritycode.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        if (relocationoffsetfbgroke != null) {
            getcreditcardsecuritycode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.RemoteActionCompatParcelizer = relocationoffsetfbgroke;
            getcreditcardsecuritycode.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ba A[Catch: Exception -> 0x0177, TryCatch #1 {Exception -> 0x0177, blocks: (B:3:0x0006, B:6:0x0022, B:67:0x0173, B:68:0x0176, B:7:0x0026, B:8:0x002d, B:9:0x002e, B:10:0x0035, B:11:0x0036, B:12:0x003d, B:13:0x003e, B:14:0x0045, B:15:0x0046, B:16:0x0050, B:17:0x0051, B:18:0x0055, B:24:0x007d, B:26:0x00ad, B:27:0x00b3, B:33:0x00db, B:35:0x00e3, B:30:0x00ba, B:32:0x00c0, B:37:0x00e9, B:38:0x00ef, B:40:0x00f5, B:43:0x00fc, B:44:0x0117, B:21:0x005c, B:23:0x0062, B:47:0x011e, B:50:0x012d, B:51:0x0130, B:52:0x0134, B:58:0x015c, B:60:0x0164, B:55:0x013b, B:57:0x0141, B:65:0x016f, B:66:0x0172, B:25:0x007f, B:48:0x0123), top: B:74:0x0006, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3 A[Catch: Exception -> 0x0177, TryCatch #1 {Exception -> 0x0177, blocks: (B:3:0x0006, B:6:0x0022, B:67:0x0173, B:68:0x0176, B:7:0x0026, B:8:0x002d, B:9:0x002e, B:10:0x0035, B:11:0x0036, B:12:0x003d, B:13:0x003e, B:14:0x0045, B:15:0x0046, B:16:0x0050, B:17:0x0051, B:18:0x0055, B:24:0x007d, B:26:0x00ad, B:27:0x00b3, B:33:0x00db, B:35:0x00e3, B:30:0x00ba, B:32:0x00c0, B:37:0x00e9, B:38:0x00ef, B:40:0x00f5, B:43:0x00fc, B:44:0x0117, B:21:0x005c, B:23:0x0062, B:47:0x011e, B:50:0x012d, B:51:0x0130, B:52:0x0134, B:58:0x015c, B:60:0x0164, B:55:0x013b, B:57:0x0141, B:65:0x016f, B:66:0x0172, B:25:0x007f, B:48:0x0123), top: B:74:0x0006, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0164 A[Catch: Exception -> 0x0177, TRY_LEAVE, TryCatch #1 {Exception -> 0x0177, blocks: (B:3:0x0006, B:6:0x0022, B:67:0x0173, B:68:0x0176, B:7:0x0026, B:8:0x002d, B:9:0x002e, B:10:0x0035, B:11:0x0036, B:12:0x003d, B:13:0x003e, B:14:0x0045, B:15:0x0046, B:16:0x0050, B:17:0x0051, B:18:0x0055, B:24:0x007d, B:26:0x00ad, B:27:0x00b3, B:33:0x00db, B:35:0x00e3, B:30:0x00ba, B:32:0x00c0, B:37:0x00e9, B:38:0x00ef, B:40:0x00f5, B:43:0x00fc, B:44:0x0117, B:21:0x005c, B:23:0x0062, B:47:0x011e, B:50:0x012d, B:51:0x0130, B:52:0x0134, B:58:0x015c, B:60:0x0164, B:55:0x013b, B:57:0x0141, B:65:0x016f, B:66:0x0172, B:25:0x007f, B:48:0x0123), top: B:74:0x0006, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:27:0x00b3->B:82:?, LOOP_END, SYNTHETIC] */
    public final boolean write(getHandlerui gethandlerui) throws Exception {
        long j;
        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren;
        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren2;
        AtomicReference atomicReference = this.PlaybackStateCompat;
        try {
            int i = contentCaptureChangeCheckerlambda0.write[((fastForEachReplacedVisibleChildren) atomicReference.get()).ordinal()];
            getCreditCardSecurityCode getcreditcardsecuritycode = this.write;
            getBirthDateYear getbirthdateyear = this.IconCompatParcelizer;
            switch (i) {
                case 1:
                    getPostalCode getpostalcode = this.read;
                    boolean z = this.MediaSessionCompatToken;
                    if (z) {
                        getpostalcode.getOnBackPressedInput = 0;
                        getpostalcode.addObserverForBackInvokerlambda0 = true;
                    }
                    try {
                        this.MediaSessionCompatQueueItem = getbirthdateyear.IconCompatParcelizer(getcreditcardsecuritycode, gethandlerui, this.serializer);
                        if (z) {
                            getpostalcode.MediaMetadataCompat();
                        }
                        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren3 = fastForEachReplacedVisibleChildren.InitialPending;
                        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren4 = fastForEachReplacedVisibleChildren.RecomposePending;
                        while (!atomicReference.compareAndSet(fastforeachreplacedvisiblechildren3, fastforeachreplacedvisiblechildren4)) {
                            if (atomicReference.get() != fastforeachreplacedvisiblechildren3) {
                                getContentCaptureSessionuiannotations.write("Unexpected state change from: " + fastforeachreplacedvisiblechildren3 + " to: " + fastforeachreplacedvisiblechildren4 + '.');
                                if (this.MediaSessionCompatQueueItem.write()) {
                                    MediaDescriptionCompat();
                                }
                                return MediaBrowserCompatMediaItem();
                            }
                        }
                        if (this.MediaSessionCompatQueueItem.write()) {
                            MediaDescriptionCompat();
                        }
                        return MediaBrowserCompatMediaItem();
                    } catch (Throwable th) {
                        if (z) {
                            getpostalcode.MediaMetadataCompat();
                        }
                        throw th;
                    }
                case 2:
                    fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren5 = fastForEachReplacedVisibleChildren.RecomposePending;
                    fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren6 = fastForEachReplacedVisibleChildren.Recomposing;
                    try {
                        while (!atomicReference.compareAndSet(fastforeachreplacedvisiblechildren5, fastforeachreplacedvisiblechildren6)) {
                            if (atomicReference.get() != fastforeachreplacedvisiblechildren5) {
                                getContentCaptureSessionuiannotations.write("Unexpected state change from: " + fastforeachreplacedvisiblechildren5 + " to: " + fastforeachreplacedvisiblechildren6 + '.');
                                j = this.MediaMetadataCompat;
                                this.MediaMetadataCompat = ((Long) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -1993279031, 1993279036, trackEventI.IconCompatParcelizer(), new Object[0])).longValue();
                                this.MediaSessionCompatQueueItem = getbirthdateyear.IconCompatParcelizer(getcreditcardsecuritycode, gethandlerui, this.MediaSessionCompatQueueItem);
                                this.MediaMetadataCompat = j;
                                fastforeachreplacedvisiblechildren = fastForEachReplacedVisibleChildren.Recomposing;
                                fastforeachreplacedvisiblechildren2 = fastForEachReplacedVisibleChildren.RecomposePending;
                                while (!atomicReference.compareAndSet(fastforeachreplacedvisiblechildren, fastforeachreplacedvisiblechildren2)) {
                                    if (atomicReference.get() != fastforeachreplacedvisiblechildren) {
                                        getContentCaptureSessionuiannotations.write("Unexpected state change from: " + fastforeachreplacedvisiblechildren + " to: " + fastforeachreplacedvisiblechildren2 + '.');
                                        if (this.MediaSessionCompatQueueItem.write()) {
                                            MediaDescriptionCompat();
                                        }
                                        return MediaBrowserCompatMediaItem();
                                    }
                                }
                                if (this.MediaSessionCompatQueueItem.write()) {
                                    MediaDescriptionCompat();
                                }
                                return MediaBrowserCompatMediaItem();
                            }
                        }
                        this.MediaMetadataCompat = ((Long) UrlUtils.RemoteActionCompatParcelizer(trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), trackEventI.IconCompatParcelizer(), -1993279031, 1993279036, trackEventI.IconCompatParcelizer(), new Object[0])).longValue();
                        this.MediaSessionCompatQueueItem = getbirthdateyear.IconCompatParcelizer(getcreditcardsecuritycode, gethandlerui, this.MediaSessionCompatQueueItem);
                        this.MediaMetadataCompat = j;
                        fastforeachreplacedvisiblechildren = fastForEachReplacedVisibleChildren.Recomposing;
                        fastforeachreplacedvisiblechildren2 = fastForEachReplacedVisibleChildren.RecomposePending;
                        while (!atomicReference.compareAndSet(fastforeachreplacedvisiblechildren, fastforeachreplacedvisiblechildren2)) {
                            if (atomicReference.get() != fastforeachreplacedvisiblechildren) {
                                getContentCaptureSessionuiannotations.write("Unexpected state change from: " + fastforeachreplacedvisiblechildren + " to: " + fastforeachreplacedvisiblechildren2 + '.');
                                if (this.MediaSessionCompatQueueItem.write()) {
                                    MediaDescriptionCompat();
                                }
                                return MediaBrowserCompatMediaItem();
                            }
                        }
                        if (this.MediaSessionCompatQueueItem.write()) {
                            MediaDescriptionCompat();
                        }
                        return MediaBrowserCompatMediaItem();
                    } catch (Throwable th2) {
                        this.MediaMetadataCompat = j;
                        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren7 = fastForEachReplacedVisibleChildren.Recomposing;
                        fastForEachReplacedVisibleChildren fastforeachreplacedvisiblechildren8 = fastForEachReplacedVisibleChildren.RecomposePending;
                        while (!atomicReference.compareAndSet(fastforeachreplacedvisiblechildren7, fastforeachreplacedvisiblechildren8)) {
                            if (atomicReference.get() != fastforeachreplacedvisiblechildren7) {
                                getContentCaptureSessionuiannotations.write("Unexpected state change from: " + fastforeachreplacedvisiblechildren7 + " to: " + fastforeachreplacedvisiblechildren8 + '.');
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                    j = this.MediaMetadataCompat;
                case 3:
                    getCreditCardExpirationDay.IconCompatParcelizer("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(fastForEachReplacedVisibleChildren.Invalid);
            throw e;
        }
    }

    public PausedCompositionImpl(getCreditCardSecurityCode getcreditcardsecuritycode, getBirthDateYear getbirthdateyear, getPostalCode getpostalcode, ContentInViewNodelaunchAnimation21 contentInViewNodelaunchAnimation21, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, boolean z, getAddressCountry getaddresscountry, Object obj) {
        this.write = getcreditcardsecuritycode;
        this.IconCompatParcelizer = getbirthdateyear;
        this.read = getpostalcode;
        this.serializer = r8lambdaa6_tctqmksh3fk6hjgcbkuvde0;
        this.MediaSessionCompatToken = z;
        this.RemoteActionCompatParcelizer = getaddresscountry;
        this.MediaDescriptionCompat = obj;
        int iIconCompatParcelizer = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer2 = trackEventI.IconCompatParcelizer();
        int iIconCompatParcelizer3 = trackEventI.IconCompatParcelizer();
        this.MediaMetadataCompat = ((Long) UrlUtils.RemoteActionCompatParcelizer(iIconCompatParcelizer, trackEventI.IconCompatParcelizer(), iIconCompatParcelizer2, -1993279031, 1993279036, iIconCompatParcelizer3, new Object[0])).longValue();
        relocationOffsetfbGrOKE relocationoffsetfbgroke = awaitLongPressOrCancellationrnUCldI.IconCompatParcelizer;
        relocationoffsetfbgroke.getClass();
        this.MediaSessionCompatQueueItem = relocationoffsetfbgroke;
        firstDescendantOrNull firstdescendantornull = new firstDescendantOrNull();
        firstdescendantornull.serializer(contentInViewNodelaunchAnimation21, getpostalcode.PlaybackStateCompatCustomAction());
        this.MediaBrowserCompatMediaItem = firstdescendantornull;
        this.RatingCompat = new toViewStructure(getaddresscountry.getCurrent());
    }
}
