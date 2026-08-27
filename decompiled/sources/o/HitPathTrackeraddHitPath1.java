package o;

import android.content.Context;
import com.google.firebase.Timestamp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class HitPathTrackeraddHitPath1 extends androidx.compose.animation.core.TransitionState {
    public final /* synthetic */ int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HitPathTrackeraddHitPath1(int i) {
        super(2);
        this.write = i;
    }

    @Override // androidx.compose.animation.core.TransitionState
    public final Object read(Object obj) {
        int i = this.write;
        if (i == 0) {
            AndroidUriHandler androidUriHandlerSerializer = AndroidUriHandler.serializer();
            Context contextIconCompatParcelizer = AndroidUriHandler.serializer().IconCompatParcelizer();
            ArrayList arrayList = new ArrayList();
            Timestamp.Companion companion = new Timestamp.Companion(0);
            accessgetButton11cp accessgetbutton11cp = accessgetButton11cp.write;
            accessgetF2cp.RemoteActionCompatParcelizer(contextIconCompatParcelizer);
            accessgetF2cp.read().RemoteActionCompatParcelizer(accessgetbutton11cp);
            accessgetButton11cp.serializer.contains(new accessgetButton10cp("json"));
            arrayList.add(companion);
            return new clearPreviouslyHitModifierNodeCache(androidUriHandlerSerializer.IconCompatParcelizer(), (AndroidViewConfigurationApi34) androidUriHandlerSerializer.IconCompatParcelizer(AndroidViewConfigurationApi34.class));
        }
        if (i == 1) {
            toCancelMotionEventScoped4ec7I tocancelmotioneventscoped4ec7i = (toCancelMotionEventScoped4ec7I) obj;
            AndroidUriHandler androidUriHandlerSerializer2 = AndroidUriHandler.serializer();
            return new toMotionEventScoped4ec7I(androidUriHandlerSerializer2.IconCompatParcelizer(), (AndroidViewConfigurationApi34) androidUriHandlerSerializer2.IconCompatParcelizer(AndroidViewConfigurationApi34.class), new PointerInteropUtils_androidKt(AndroidUriHandler.serializer().IconCompatParcelizer(), tocancelmotioneventscoped4ec7i), tocancelmotioneventscoped4ec7i.RemoteActionCompatParcelizer);
        }
        if (i == 2) {
            AndroidUriHandler androidUriHandlerSerializer3 = AndroidUriHandler.serializer();
            return new setApproachNode(androidUriHandlerSerializer3.IconCompatParcelizer(), (AndroidViewConfigurationApi34) androidUriHandlerSerializer3.IconCompatParcelizer(AndroidViewConfigurationApi34.class), new getAlignmentLinesannotations(AndroidUriHandler.serializer().IconCompatParcelizer(), (getLookaheadScopeCoordinates) obj));
        }
        getSlotIdAtIndex getslotidatindex = (getSlotIdAtIndex) obj;
        AndroidUriHandler androidUriHandlerSerializer4 = AndroidUriHandler.serializer();
        return new resetLayoutState(androidUriHandlerSerializer4.IconCompatParcelizer(), (AndroidViewConfigurationApi34) androidUriHandlerSerializer4.IconCompatParcelizer(AndroidViewConfigurationApi34.class), new markActiveNodesAsReused(AndroidUriHandler.serializer().IconCompatParcelizer(), getslotidatindex, 0), getslotidatindex.serializer);
    }
}
