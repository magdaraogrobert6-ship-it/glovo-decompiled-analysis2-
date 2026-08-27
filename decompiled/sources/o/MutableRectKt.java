package o;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.EmojiCompat$InitCallback;
import coil3.ImageLoader$Builder;
import com.google.android.gms.dynamite.zzj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class MutableRectKt {
    public static volatile MutableRectKt RemoteActionCompatParcelizer;
    public static final Object write = new Object();
    public final MutableRect3MmeM6k IconCompatParcelizer;
    public final Handler MediaBrowserCompatMediaItem;
    public volatile int MediaDescriptionCompat;
    public final int MediaMetadataCompat;
    public final ReentrantReadWriteLock MediaSessionCompatQueueItem;
    public final zzj PlaybackStateCompat;
    public final MutableRecttz77jQw RatingCompat;
    public final createnHHXs2Y read;
    public final translatek4lQ0M serializer;

    public static boolean write() {
        return RemoteActionCompatParcelizer != null;
    }

    public static MutableRectKt RemoteActionCompatParcelizer() {
        MutableRectKt mutableRectKt;
        synchronized (write) {
            mutableRectKt = RemoteActionCompatParcelizer;
            coil3.util.UtilsKt.RemoteActionCompatParcelizer("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", mutableRectKt != null);
        }
        return mutableRectKt;
    }

    public final int IconCompatParcelizer() {
        this.MediaSessionCompatQueueItem.readLock().lock();
        try {
            return this.MediaDescriptionCompat;
        } finally {
            this.MediaSessionCompatQueueItem.readLock().unlock();
        }
    }

    public final void RemoteActionCompatParcelizer(EmojiCompat$InitCallback emojiCompat$InitCallback) {
        coil3.util.UtilsKt.IconCompatParcelizer(emojiCompat$InitCallback, "initCallback cannot be null");
        this.MediaSessionCompatQueueItem.writeLock().lock();
        try {
            if (this.MediaDescriptionCompat == 1 || this.MediaDescriptionCompat == 2) {
                Handler handler = this.MediaBrowserCompatMediaItem;
                int i = this.MediaDescriptionCompat;
                List listAsList = Arrays.asList(emojiCompat$InitCallback);
                List list = listAsList;
                handler.post(new accessgetUnspecifiedcp(listAsList, i, (Throwable) null));
            } else {
                this.read.add(emojiCompat$InitCallback);
            }
        } finally {
            this.MediaSessionCompatQueueItem.writeLock().unlock();
        }
    }

    public final void read(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.MediaSessionCompatQueueItem.writeLock().lock();
        try {
            this.MediaDescriptionCompat = 2;
            arrayList.addAll(this.read);
            this.read.clear();
            this.MediaSessionCompatQueueItem.writeLock().unlock();
            this.MediaBrowserCompatMediaItem.post(new accessgetUnspecifiedcp(arrayList, this.MediaDescriptionCompat, th));
        } catch (Throwable th2) {
            this.MediaSessionCompatQueueItem.writeLock().unlock();
            throw th2;
        }
    }

    public MutableRectKt(getDistanceSquaredimpl getdistancesquaredimpl) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.MediaSessionCompatQueueItem = reentrantReadWriteLock;
        this.MediaDescriptionCompat = 3;
        MutableRecttz77jQw mutableRecttz77jQw = getdistancesquaredimpl.IconCompatParcelizer;
        this.RatingCompat = mutableRecttz77jQw;
        int i = getdistancesquaredimpl.read;
        this.MediaMetadataCompat = i;
        this.IconCompatParcelizer = getdistancesquaredimpl.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatMediaItem = new Handler(Looper.getMainLooper());
        this.read = new createnHHXs2Y(0);
        this.PlaybackStateCompat = new zzj(3);
        translatek4lQ0M translatek4lq0m = new translatek4lQ0M(this);
        this.serializer = translatek4lq0m;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.MediaDescriptionCompat = 0;
            } catch (Throwable th) {
                this.MediaSessionCompatQueueItem.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (IconCompatParcelizer() == 0) {
            try {
                mutableRecttz77jQw.write(new accessgetInfinitecp(translatek4lq0m));
            } catch (Throwable th2) {
                read(th2);
            }
        }
    }

    public final void read(EditorInfo editorInfo) {
        if (IconCompatParcelizer() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        translatek4lQ0M translatek4lq0m = this.serializer;
        translatek4lq0m.getClass();
        Bundle bundle = editorInfo.extras;
        getInfiniteF1C5BW0annotations getinfinitef1c5bw0annotations = (getInfiniteF1C5BW0annotations) ((ImageLoader$Builder) translatek4lq0m.write).RemoteActionCompatParcelizer;
        int iRemoteActionCompatParcelizer = getinfinitef1c5bw0annotations.RemoteActionCompatParcelizer(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iRemoteActionCompatParcelizer != 0 ? getinfinitef1c5bw0annotations.write.getInt(iRemoteActionCompatParcelizer + getinfinitef1c5bw0annotations.read) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }

    public final void serializer() {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.MediaMetadataCompat == 1);
        if (IconCompatParcelizer() == 1) {
            return;
        }
        this.MediaSessionCompatQueueItem.writeLock().lock();
        try {
            if (this.MediaDescriptionCompat == 0) {
                this.MediaSessionCompatQueueItem.writeLock().unlock();
                return;
            }
            this.MediaDescriptionCompat = 0;
            this.MediaSessionCompatQueueItem.writeLock().unlock();
            translatek4lQ0M translatek4lq0m = this.serializer;
            MutableRectKt mutableRectKt = (MutableRectKt) translatek4lq0m.IconCompatParcelizer;
            try {
                mutableRectKt.RatingCompat.write(new accessgetInfinitecp(translatek4lq0m));
            } catch (Throwable th) {
                mutableRectKt.read(th);
            }
        } catch (Throwable th2) {
            this.MediaSessionCompatQueueItem.writeLock().unlock();
            throw th2;
        }
    }

    public final int serializer(int i, CharSequence charSequence) {
        coil3.util.UtilsKt.RemoteActionCompatParcelizer("Not initialized yet", IconCompatParcelizer() == 1);
        coil3.util.UtilsKt.IconCompatParcelizer(charSequence, "charSequence cannot be null");
        androidx.emoji2.text.EmojiProcessor emojiProcessor = (androidx.emoji2.text.EmojiProcessor) this.serializer.read;
        emojiProcessor.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            isValidimpl[] isvalidimplArr = (isValidimpl[]) spanned.getSpans(i, i + 1, isValidimpl.class);
            if (isvalidimplArr.length > 0) {
                return spanned.getSpanStart(isvalidimplArr[0]);
            }
        }
        return ((copydBAh8RUdefault) emojiProcessor.write(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new copydBAh8RUdefault(i))).write;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a9 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:34:0x0063, B:37:0x0068, B:39:0x006c, B:41:0x007b, B:46:0x0097, B:48:0x00a3, B:50:0x00a6, B:52:0x00a9, B:54:0x00b9, B:55:0x00bc, B:58:0x00cb, B:61:0x00d2, B:63:0x00e9, B:44:0x008d), top: B:80:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:34:0x0063, B:37:0x0068, B:39:0x006c, B:41:0x007b, B:46:0x0097, B:48:0x00a3, B:50:0x00a6, B:52:0x00a9, B:54:0x00b9, B:55:0x00bc, B:58:0x00cb, B:61:0x00d2, B:63:0x00e9, B:44:0x008d), top: B:80:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e9 A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #0 {all -> 0x008a, blocks: (B:34:0x0063, B:37:0x0068, B:39:0x006c, B:41:0x007b, B:46:0x0097, B:48:0x00a3, B:50:0x00a6, B:52:0x00a9, B:54:0x00b9, B:55:0x00bc, B:58:0x00cb, B:61:0x00d2, B:63:0x00e9, B:44:0x008d), top: B:80:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f3, code lost:
    
        if (r14 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
    
        if (r14 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
    
        ((o.remtuRUvjQ) r15).write();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fe, code lost:
    
        return r15;
     */
    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(Unknown Source)
    	at java.base/java.util.HashMap.getNode(Unknown Source)
    	at java.base/java.util.HashMap.containsKey(Unknown Source)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence write(int r12, int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MutableRectKt.write(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }
}
