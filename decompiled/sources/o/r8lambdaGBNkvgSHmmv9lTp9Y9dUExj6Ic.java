package o;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.Metadata;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.LazyKt__LazyJVMKt;

/* JADX INFO: loaded from: classes2.dex */
public final class r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic {
    public final GmsRpc IconCompatParcelizer;
    public final toClipMetadata MediaBrowserCompatMediaItem;
    public final ScheduledThreadPoolExecutor MediaMetadataCompat;
    public final FirebaseMessaging read;
    public final Context serializer;
    public final Metadata write;
    public final ImageKt RemoteActionCompatParcelizer = new ImageKt(0);
    public boolean MediaSessionCompatQueueItem = false;

    public final void IconCompatParcelizer(boolean z) {
        synchronized (this) {
            this.MediaSessionCompatQueueItem = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046 A[Catch: IOException -> 0x00ab, TRY_LEAVE, TryCatch #3 {IOException -> 0x00ab, blocks: (B:10:0x0013, B:21:0x0046, B:15:0x0024, B:17:0x002c, B:18:0x0035, B:20:0x003d), top: B:78:0x0013 }] */
    public final boolean write() throws IOException {
        AndroidClipboardManager androidClipboardManagerWrite;
        while (true) {
            synchronized (this) {
                androidClipboardManagerWrite = this.MediaBrowserCompatMediaItem.write();
                if (androidClipboardManagerWrite == null) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    return true;
                }
            }
            try {
                String str = androidClipboardManagerWrite.serializer;
                String str2 = androidClipboardManagerWrite.read;
                int iHashCode = str.hashCode();
                if (iHashCode != 83) {
                    if (iHashCode == 85 && str.equals("U")) {
                        RemoteActionCompatParcelizer(str2);
                        Log.isLoggable("FirebaseMessaging", 3);
                    } else {
                        Log.isLoggable("FirebaseMessaging", 3);
                    }
                } else if (str.equals("S")) {
                    write(str2);
                    Log.isLoggable("FirebaseMessaging", 3);
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
                toClipMetadata toclipmetadata = this.MediaBrowserCompatMediaItem;
                synchronized (toclipmetadata) {
                    try {
                        ComponentRegistry$Builder componentRegistry$Builder = toclipmetadata.read;
                        String str3 = androidClipboardManagerWrite.IconCompatParcelizer;
                        synchronized (((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer)) {
                            try {
                                if (((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer).remove(str3)) {
                                    ((ScheduledThreadPoolExecutor) componentRegistry$Builder.serializer).execute(new RxWorker$1$$ExternalSyntheticLambda0(26, componentRegistry$Builder));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                synchronized (this.RemoteActionCompatParcelizer) {
                    String str4 = androidClipboardManagerWrite.IconCompatParcelizer;
                    if (this.RemoteActionCompatParcelizer.containsKey(str4)) {
                        ArrayDeque arrayDeque = (ArrayDeque) this.RemoteActionCompatParcelizer.get(str4);
                        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) arrayDeque.poll();
                        if (parentDataModifierDefaultImpls != null) {
                            parentDataModifierDefaultImpls.IconCompatParcelizer((Object) null);
                        }
                        if (arrayDeque.isEmpty()) {
                            this.RemoteActionCompatParcelizer.remove(str4);
                        }
                    }
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(e.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(e.getMessage())) {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    SentryLogcatAdapter.serializer("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                    return false;
                }
                SentryLogcatAdapter.serializer("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                return false;
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) throws IOException {
        String strBlockingGetToken = this.read.blockingGetToken();
        GmsRpc gmsRpc = this.IconCompatParcelizer;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        RemoteActionCompatParcelizer(gmsRpc.serializer(gmsRpc.read(strBlockingGetToken, "/topics/" + str, bundle)));
    }

    public final void read() {
        boolean z;
        if (this.MediaBrowserCompatMediaItem.write() != null) {
            synchronized (this) {
                z = this.MediaSessionCompatQueueItem;
            }
            if (z) {
                return;
            }
            RemoteActionCompatParcelizer(0L);
        }
    }

    public final zzw write(AndroidClipboardManager androidClipboardManager) {
        ArrayDeque arrayDeque;
        toClipMetadata toclipmetadata = this.MediaBrowserCompatMediaItem;
        synchronized (toclipmetadata) {
            ComponentRegistry$Builder componentRegistry$Builder = toclipmetadata.read;
            String str = androidClipboardManager.IconCompatParcelizer;
            componentRegistry$Builder.getClass();
            if (!TextUtils.isEmpty(str) && !str.contains((String) componentRegistry$Builder.RemoteActionCompatParcelizer)) {
                synchronized (((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer)) {
                    if (((ArrayDeque) componentRegistry$Builder.IconCompatParcelizer).add(str)) {
                        ((ScheduledThreadPoolExecutor) componentRegistry$Builder.serializer).execute(new RxWorker$1$$ExternalSyntheticLambda0(26, componentRegistry$Builder));
                    }
                }
            }
        }
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls();
        synchronized (this.RemoteActionCompatParcelizer) {
            String str2 = androidClipboardManager.IconCompatParcelizer;
            if (this.RemoteActionCompatParcelizer.containsKey(str2)) {
                arrayDeque = (ArrayDeque) this.RemoteActionCompatParcelizer.get(str2);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                this.RemoteActionCompatParcelizer.put(str2, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(parentDataModifierDefaultImpls);
        }
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }

    public final void write(String str) throws IOException {
        String strBlockingGetToken = this.read.blockingGetToken();
        GmsRpc gmsRpc = this.IconCompatParcelizer;
        gmsRpc.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        RemoteActionCompatParcelizer(gmsRpc.serializer(gmsRpc.read(strBlockingGetToken, "/topics/" + str, bundle)));
    }

    public static void RemoteActionCompatParcelizer(Task task) throws IOException {
        try {
            LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void RemoteActionCompatParcelizer(long j) {
        this.MediaMetadataCompat.schedule(new AndroidComposeView(this, this.serializer, this.write, Math.min(Math.max(30L, 2 * j), 28800L)), j, TimeUnit.SECONDS);
        IconCompatParcelizer(true);
    }

    public r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic(FirebaseMessaging firebaseMessaging, Metadata metadata, toClipMetadata toclipmetadata, GmsRpc gmsRpc, Context context, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.read = firebaseMessaging;
        this.write = metadata;
        this.MediaBrowserCompatMediaItem = toclipmetadata;
        this.IconCompatParcelizer = gmsRpc;
        this.serializer = context;
        this.MediaMetadataCompat = scheduledThreadPoolExecutor;
    }
}
