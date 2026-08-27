package o;

import android.database.ContentObserver;
import com.sentiance.core.model.events.E$b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class getNativeKeyEvent extends ContentObserver {
    public final /* synthetic */ E$b read;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        ((AtomicBoolean) this.read.read).set(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getNativeKeyEvent(E$b e$b) {
        super(null);
        Objects.requireNonNull(e$b);
        this.read = e$b;
    }
}
