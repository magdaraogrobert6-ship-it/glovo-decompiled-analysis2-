package o;

import coil3.ImageLoader$Builder;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class copydBAh8RU extends DefaultContentCardsUpdateHandlerCompanionCREATOR1 {
    public final /* synthetic */ ThreadPoolExecutor RemoteActionCompatParcelizer;
    public final /* synthetic */ DefaultContentCardsUpdateHandlerCompanionCREATOR1 serializer;

    @Override // o.DefaultContentCardsUpdateHandlerCompanionCREATOR1
    public final void RemoteActionCompatParcelizer(ImageLoader$Builder imageLoader$Builder) {
        ThreadPoolExecutor threadPoolExecutor = this.RemoteActionCompatParcelizer;
        try {
            this.serializer.RemoteActionCompatParcelizer(imageLoader$Builder);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // o.DefaultContentCardsUpdateHandlerCompanionCREATOR1
    public final void write(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.RemoteActionCompatParcelizer;
        try {
            this.serializer.write(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public copydBAh8RU(DefaultContentCardsUpdateHandlerCompanionCREATOR1 defaultContentCardsUpdateHandlerCompanionCREATOR1, ThreadPoolExecutor threadPoolExecutor) {
        this.serializer = defaultContentCardsUpdateHandlerCompanionCREATOR1;
        this.RemoteActionCompatParcelizer = threadPoolExecutor;
    }
}
