package o;

import android.content.SharedPreferences;
import coil3.ComponentRegistry$Builder;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gtm.zziu;
import io.grpc.internal.DelayedClientCall$2;
import io.sentry.SentryClient;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import okio.Options;

/* JADX INFO: loaded from: classes2.dex */
public final class getF4EK5gGoQ {
    public final accessgetTvInputComposite1cp IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final int MediaMetadataCompat;
    public final List MediaSessionCompatQueueItem;
    public final getF3EK5gGoQ RatingCompat;
    public final androidx.emoji2.text.EmojiProcessor RemoteActionCompatParcelizer;
    public final getExponentimpl read;
    public final io.sentry.hints.PlaybackStateCompatCustomAction serializer;
    public final /* synthetic */ ComponentRegistry$Builder write;

    /* JADX WARN: Code duplicated, block: B:14:0x0095  */
    public final void read(byte[] bArr) {
        getF5EK5gGoQ getf5ek5ggoqRemoteActionCompatParcelizer;
        getF5EK5gGoQ getf5ek5ggoq;
        try {
            getf5ek5ggoqRemoteActionCompatParcelizer = this.serializer.RemoteActionCompatParcelizer(bArr);
        } catch (zziu unused) {
            ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
            getf5ek5ggoqRemoteActionCompatParcelizer = null;
        }
        int i = this.MediaBrowserCompatMediaItem;
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.RemoteActionCompatParcelizer;
        if (emojiProcessor != null && i == 0) {
            SharedPreferences sharedPreferencesMediaMetadataCompat = emojiProcessor.MediaMetadataCompat();
            long j = sharedPreferencesMediaMetadataCompat.getLong("SUCCESSFUL_COUNT", 0L);
            long j2 = sharedPreferencesMediaMetadataCompat.getLong("FORBIDDEN_COUNT", 0L);
            long jMin = Math.min(10L, j + 1);
            long jMax = Math.max(0L, Math.min(j2, 10 - jMin));
            SharedPreferences.Editor editorEdit = sharedPreferencesMediaMetadataCompat.edit();
            editorEdit.putLong("SUCCESSFUL_COUNT", jMin);
            editorEdit.putLong("FORBIDDEN_COUNT", jMax);
            editorEdit.apply();
        }
        if (getf5ek5ggoqRemoteActionCompatParcelizer != null) {
            Status status = getf5ek5ggoqRemoteActionCompatParcelizer.read;
            Status status2 = Status.IconCompatParcelizer;
            if (status == status2) {
                androidx.emoji2.text.EmojiProcessor emojiProcessor2 = getf5ek5ggoqRemoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer;
                SentryClient sentryClient = (SentryClient) this.read.read;
                this.IconCompatParcelizer.getClass();
                getf5ek5ggoq = new getF5EK5gGoQ(status2, i, new getF7EK5gGoQ(sentryClient, bArr, emojiProcessor2, System.currentTimeMillis()), getf5ek5ggoqRemoteActionCompatParcelizer.write);
            } else {
                getf5ek5ggoq = new getF5EK5gGoQ(Status.read, i, null, null);
            }
        } else {
            getf5ek5ggoq = new getF5EK5gGoQ(Status.read, i, null, null);
        }
        write(getf5ek5ggoq);
    }

    public final void write(getF5EK5gGoQ getf5ek5ggoq) {
        Status status = getf5ek5ggoq.read;
        getF7EK5gGoQ getf7ek5ggoq = getf5ek5ggoq.IconCompatParcelizer;
        Status status2 = Status.IconCompatParcelizer;
        ComponentRegistry$Builder componentRegistry$Builder = this.write;
        if (status == status2) {
            "Container resource successfully loaded from ".concat(getf5ek5ggoq.serializer());
            int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite3, -1921293486)).booleanValue();
            if (getf5ek5ggoq.serializer == 0) {
                SentryClient sentryClient = getf7ek5ggoq.read;
                byte[] bArr = getf7ek5ggoq.serializer;
                if (!sentryClient.IconCompatParcelizer) {
                    accessgetTvInputComposite1cp accessgettvinputcomposite1cp = (accessgetTvInputComposite1cp) componentRegistry$Builder.RemoteActionCompatParcelizer;
                    String str = (String) sentryClient.RemoteActionCompatParcelizer;
                    HashMap map = (HashMap) componentRegistry$Builder.IconCompatParcelizer;
                    if (map.containsKey(str)) {
                        getF8EK5gGoQ getf8ek5ggoq = (getF8EK5gGoQ) map.get(str);
                        accessgettvinputcomposite1cp.getClass();
                        getf8ek5ggoq.serializer = System.currentTimeMillis();
                    } else {
                        accessgettvinputcomposite1cp.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        getF8EK5gGoQ getf8ek5ggoq2 = new getF8EK5gGoQ();
                        getf8ek5ggoq2.serializer = jCurrentTimeMillis;
                        map.put(str, getf8ek5ggoq2);
                    }
                    if (bArr != null && bArr.length > 0) {
                        androidx.emoji2.text.EmojiProcessor emojiProcessor = (androidx.emoji2.text.EmojiProcessor) componentRegistry$Builder.read;
                        String strWrite = getf7ek5ggoq.read.write();
                        emojiProcessor.getClass();
                        ((ExecutorService) emojiProcessor.read).execute(new DelayedClientCall$2(emojiProcessor, strWrite, bArr, 4));
                    }
                }
            }
            this.RatingCompat.IconCompatParcelizer(getf5ek5ggoq);
            return;
        }
        getf5ek5ggoq.serializer();
        int iWrite4 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite5 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        int iWrite6 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
        ((Boolean) Options.Companion.read(iWrite4, 1921293490, iWrite5, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite6, -1921293486)).booleanValue();
        if (status.write()) {
            "Response source: ".concat(getf5ek5ggoq.serializer());
            int iWrite7 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite8 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite9 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            ((Boolean) Options.Companion.read(iWrite7, 1921293490, iWrite8, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite9, -1921293486)).booleanValue();
            int length = getf7ek5ggoq.serializer.length;
            int iWrite10 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite11 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            int iWrite12 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
            ((Boolean) Options.Companion.read(iWrite10, 1921293490, iWrite11, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, iWrite12, -1921293486)).booleanValue();
        }
        int i = this.MediaMetadataCompat;
        componentRegistry$Builder.IconCompatParcelizer(this.read, this.MediaSessionCompatQueueItem, i + 1, this.RatingCompat, this.RemoteActionCompatParcelizer);
    }

    public getF4EK5gGoQ(ComponentRegistry$Builder componentRegistry$Builder, int i, getExponentimpl getexponentimpl, List list, int i2, getF3EK5gGoQ getf3ek5ggoq, androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        this.write = componentRegistry$Builder;
        accessgetSystemNavigationDowncp.IconCompatParcelizer(getexponentimpl);
        this.read = getexponentimpl;
        accessgetSystemNavigationDowncp.IconCompatParcelizer((SentryClient) getexponentimpl.read);
        this.MediaBrowserCompatMediaItem = i;
        this.serializer = getF6EK5gGoQ.RemoteActionCompatParcelizer;
        this.IconCompatParcelizer = accessgetTvInputComposite1cp.read;
        this.RemoteActionCompatParcelizer = emojiProcessor;
        this.RatingCompat = getf3ek5ggoq;
        this.MediaSessionCompatQueueItem = list;
        this.MediaMetadataCompat = i2;
    }

    public final void serializer(int i, int i2) {
        androidx.emoji2.text.EmojiProcessor emojiProcessor = this.RemoteActionCompatParcelizer;
        if (emojiProcessor != null && i2 == 0 && i == 3) {
            SharedPreferences sharedPreferencesMediaMetadataCompat = emojiProcessor.MediaMetadataCompat();
            long j = sharedPreferencesMediaMetadataCompat.getLong("FORBIDDEN_COUNT", 0L);
            long j2 = sharedPreferencesMediaMetadataCompat.getLong("SUCCESSFUL_COUNT", 0L);
            SharedPreferences.Editor editorEdit = sharedPreferencesMediaMetadataCompat.edit();
            long jMin = j == 0 ? 3L : Math.min(10L, j + 1);
            long jMax = Math.max(0L, Math.min(j2, 10 - jMin));
            editorEdit.putLong("FORBIDDEN_COUNT", jMin);
            editorEdit.putLong("SUCCESSFUL_COUNT", jMax);
            editorEdit.apply();
        }
        Object obj = ((SentryClient) this.read.read).RemoteActionCompatParcelizer;
        ((Boolean) Options.Companion.read(SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), 1921293490, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{2}, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), -1921293486)).booleanValue();
        write(new getF5EK5gGoQ(Status.read, i2, null, null));
    }
}
