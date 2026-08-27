package o;

import android.database.Cursor;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.google.firestore.admin.v1.Index;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class createLayer implements onPostAttach {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ createLayer(Object obj, int i, Object obj2) {
        this.IconCompatParcelizer = i;
        this.serializer = obj;
        this.write = obj2;
    }

    @Override // o.onPostAttach
    public final void IconCompatParcelizer(Object obj) {
        int i = this.IconCompatParcelizer;
        Object obj2 = this.write;
        Object obj3 = this.serializer;
        if (i == 0) {
            ((getTextInputService) obj2).RemoteActionCompatParcelizer(new w4$$ExternalSyntheticLambda0((getAccessibilityManager) obj3, 20, (Owner) obj));
            return;
        }
        onLayoutModifierNodeChanged onlayoutmodifiernodechanged = (onLayoutModifierNodeChanged) obj3;
        HashMap map = (HashMap) obj2;
        Cursor cursor = (Cursor) obj;
        try {
            int i2 = cursor.getInt(0);
            String string = cursor.getString(1);
            getForceMeasureWithLookaheadConstraintsui getforcemeasurewithlookaheadconstraintsui = onlayoutmodifiernodechanged.MediaBrowserCompatMediaItem;
            Index from = Index.parseFrom(cursor.getBlob(2));
            getforcemeasurewithlookaheadconstraintsui.getClass();
            onlayoutmodifiernodechanged.RemoteActionCompatParcelizer(new toParentPosition8S9VItk(i2, string, getForceMeasureWithLookaheadConstraintsui.RemoteActionCompatParcelizer(from), map.containsKey(Integer.valueOf(i2)) ? (touchBoundsInRoot) map.get(Integer.valueOf(i2)) : toParentPosition8S9VItk.serializer));
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            getRectManager.write("Failed to decode index: " + e, new Object[0]);
            throw null;
        }
    }
}
