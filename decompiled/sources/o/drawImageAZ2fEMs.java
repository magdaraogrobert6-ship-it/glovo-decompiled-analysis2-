package o;

/* JADX INFO: loaded from: classes.dex */
public final class drawImageAZ2fEMs {
    public final com.airbnb.lottie.PerformanceTracker IconCompatParcelizer;
    public final com.bumptech.glide.load.model.MultiModelLoaderFactory read;

    public drawImageAZ2fEMs(androidx.emoji2.text.EmojiProcessor emojiProcessor) {
        com.bumptech.glide.load.model.MultiModelLoaderFactory multiModelLoaderFactory = new com.bumptech.glide.load.model.MultiModelLoaderFactory(emojiProcessor);
        this.IconCompatParcelizer = new com.airbnb.lottie.PerformanceTracker(1);
        this.read = multiModelLoaderFactory;
    }
}
