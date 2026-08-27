package o;

import io.sentry.SentryClient;

/* JADX INFO: loaded from: classes2.dex */
public final class getF7EK5gGoQ {
    public final long IconCompatParcelizer;
    public final androidx.emoji2.text.EmojiProcessor RemoteActionCompatParcelizer;
    public final SentryClient read;
    public final byte[] serializer;

    public getF7EK5gGoQ(SentryClient sentryClient, byte[] bArr, androidx.emoji2.text.EmojiProcessor emojiProcessor, long j) {
        this.read = sentryClient;
        this.serializer = bArr;
        this.RemoteActionCompatParcelizer = emojiProcessor;
        this.IconCompatParcelizer = j;
    }
}
