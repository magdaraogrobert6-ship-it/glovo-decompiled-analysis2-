package o;

import android.os.Handler;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class DrawBackgroundModifier implements updateBuffersOnDisappeared {
    public Handler IconCompatParcelizer;
    public final DrawBehindElement MediaSessionCompatQueueItem;
    public final setSpread read = new setSpread(new setOnDraw(this, 0));
    public boolean write = true;
    public final setOnDraw RemoteActionCompatParcelizer = new setOnDraw(this, 1);
    public final ArrayList serializer = new ArrayList();

    @Override // o.updateBuffersOnDisappeared
    public final void onAbandoned() {
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onForgotten() {
        setSpread setspread = this.read;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = setspread.read;
        if (onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 != null) {
            onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.IconCompatParcelizer();
        }
        setspread.serializer();
    }

    @Override // o.updateBuffersOnDisappeared
    public final void onRemembered() {
        this.read.read();
    }

    public DrawBackgroundModifier(DrawBehindElement drawBehindElement) {
        this.MediaSessionCompatQueueItem = drawBehindElement;
    }
}
