package o;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class handleOnBackCancelled extends checkForSystemLogLevelPropertylambda0 {
    public final /* synthetic */ run IconCompatParcelizer;
    public final /* synthetic */ int serializer;

    public /* synthetic */ handleOnBackCancelled(run runVar, int i) {
        this.serializer = i;
        this.IconCompatParcelizer = runVar;
    }

    @Override // o.getCancel
    public final void serializer() {
        View view;
        int i = this.serializer;
        run runVar = this.IconCompatParcelizer;
        if (i != 0) {
            runVar.MediaSessionCompatQueueItem = null;
            runVar.write.requestLayout();
            return;
        }
        if (runVar.read && (view = runVar.RatingCompat) != null) {
            view.setTranslationY(0.0f);
            runVar.write.setTranslationY(0.0f);
        }
        runVar.write.setVisibility(8);
        runVar.write.setTransitioning(false);
        runVar.MediaSessionCompatQueueItem = null;
        accessgetGreencp accessgetgreencp = runVar.PlaybackStateCompatCustomAction;
        if (accessgetgreencp != null) {
            accessgetgreencp.IconCompatParcelizer(runVar.MediaSessionCompatToken);
            runVar.MediaSessionCompatToken = null;
            runVar.PlaybackStateCompatCustomAction = null;
        }
        onDestroy ondestroy = runVar.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        if (ondestroy != null) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            ondestroy.requestApplyInsets();
        }
    }
}
