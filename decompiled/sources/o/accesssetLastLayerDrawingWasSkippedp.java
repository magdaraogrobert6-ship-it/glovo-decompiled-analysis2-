package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.sentiance.visitessentials.h$c;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ReversedListReadOnly;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accesssetLastLayerDrawingWasSkippedp {
    public abstract String toString();

    public final boolean write(NodeCoordinatorCompanionPointerInputSource1 nodeCoordinatorCompanionPointerInputSource1) {
        nodeCoordinatorCompanionPointerInputSource1.getClass();
        if (!(this instanceof accessoutOfBoundsHit8NAm7pk)) {
            if (this instanceof ancestorToLocal) {
                return ((ancestorToLocal) this).IconCompatParcelizer.IconCompatParcelizer(nodeCoordinatorCompanionPointerInputSource1);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return false;
        }
        int iSerializer = getQueryParameterslambda2.serializer();
        return !((accessoutOfBoundsHit8NAm7pk) this).read.IconCompatParcelizer((List) androidx.sqlite.SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{nodeCoordinatorCompanionPointerInputSource1}, getQueryParameterslambda2.serializer(), -516583649, iSerializer)).isEmpty();
    }

    public final Comparator serializer() {
        specifiesCanFocusProperty specifiescanfocusproperty;
        if (!(this instanceof accessoutOfBoundsHit8NAm7pk)) {
            if (this instanceof ancestorToLocal) {
                return new h$c(((ancestorToLocal) this).IconCompatParcelizer.read());
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        tailH91voCIui tailh91vociui = ((accessoutOfBoundsHit8NAm7pk) this).read;
        List listIconCompatParcelizer = tailh91vociui.IconCompatParcelizer();
        listIconCompatParcelizer.getClass();
        Iterator it = new ReversedListReadOnly(listIconCompatParcelizer).iterator();
        do {
            ListIterator listIterator = ((BaseContentCardView) it).write;
            if (!listIterator.hasPrevious()) {
                getRectManager.write("RealtimePipeline must contain at least one Sort stage (ensured by RewriteStages).", new Object[0]);
                throw null;
            }
            specifiescanfocusproperty = (specifiesCanFocusProperty) listIterator.previous();
        } while (!(specifiescanfocusproperty instanceof or64DMado));
        return new NodeMeasuringIntrinsics(((or64DMado) specifiescanfocusproperty).RemoteActionCompatParcelizer, new PinnableContainerKtLocalPinnableContainer1(23, tailh91vociui));
    }

    public final hitNearFh5PU_I read() {
        if (this instanceof accessoutOfBoundsHit8NAm7pk) {
            return new hasNodeH91voCI(((accessoutOfBoundsHit8NAm7pk) this).read);
        }
        if (!(this instanceof ancestorToLocal)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            return null;
        }
        fromParentRect fromparentrectSerializer = ((ancestorToLocal) this).IconCompatParcelizer.serializer();
        fromparentrectSerializer.getClass();
        return new getSnapshotObserver(fromparentrectSerializer);
    }
}
