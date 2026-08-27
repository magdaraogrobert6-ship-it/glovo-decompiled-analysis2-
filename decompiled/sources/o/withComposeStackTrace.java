package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class withComposeStackTrace {
    public static final withComposeStackTrace write = new withComposeStackTrace();
    public final ConcurrentHashMap serializer = new ConcurrentHashMap();
    public final LayoutNode_foldedChildren1 read = new LayoutNode_foldedChildren1();

    public final getCoordinatesAccessedDuringPlacement RemoteActionCompatParcelizer(Class cls) {
        Class cls2;
        getMinimumTouchTargetSizeMYxV2XQ.RemoteActionCompatParcelizer(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.serializer;
        getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement = (getCoordinatesAccessedDuringPlacement) concurrentHashMap.get(cls);
        if (getcoordinatesaccessedduringplacement == null) {
            LayoutNode_foldedChildren1 layoutNode_foldedChildren1 = this.read;
            layoutNode_foldedChildren1.getClass();
            Class cls3 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer;
            if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = getChildrenAccessingLookaheadCoordinatesDuringPlacement.serializer) != null && !cls2.isAssignableFrom(cls)) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
                return null;
            }
            getDetachedFromParentLookaheadPlacementui getdetachedfromparentlookaheadplacementuiIconCompatParcelizer = ((LayoutNodeDrawScoperecord1) layoutNode_foldedChildren1.RemoteActionCompatParcelizer).IconCompatParcelizer(cls);
            if ((getdetachedfromparentlookaheadplacementuiIconCompatParcelizer.write & 2) == 2) {
                getcoordinatesaccessedduringplacement = GeneratedMessageLite.class.isAssignableFrom(cls) ? LayoutNodeDrawScopeKt.read(getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer, setVirtualLookaheadRootui.serializer, getdetachedfromparentlookaheadplacementuiIconCompatParcelizer.RemoteActionCompatParcelizer) : LayoutNodeDrawScopeKt.read(getChildrenAccessingLookaheadCoordinatesDuringPlacement.read, setVirtualLookaheadRootui.write(), getdetachedfromparentlookaheadplacementuiIconCompatParcelizer.RemoteActionCompatParcelizer);
            } else if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                getcoordinatesaccessedduringplacement = ((getdetachedfromparentlookaheadplacementuiIconCompatParcelizer.write & 1) == 1 ? getChildrenAccessingCoordinatesDuringPlacement.PROTO2 : getChildrenAccessingCoordinatesDuringPlacement.PROTO3) == getChildrenAccessingCoordinatesDuringPlacement.PROTO2 ? LayoutNodeKt.read(getdetachedfromparentlookaheadplacementuiIconCompatParcelizer, ensureLookaheadDelegateCreatedui.serializer, LayoutNodeUsageByParent.write, getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer, setVirtualLookaheadRootui.serializer, accesssetDrawNodep.write) : LayoutNodeKt.read(getdetachedfromparentlookaheadplacementuiIconCompatParcelizer, ensureLookaheadDelegateCreatedui.serializer, LayoutNodeUsageByParent.write, getChildrenAccessingLookaheadCoordinatesDuringPlacement.IconCompatParcelizer, null, accesssetDrawNodep.write);
            } else {
                getcoordinatesaccessedduringplacement = ((getdetachedfromparentlookaheadplacementuiIconCompatParcelizer.write & 1) == 1 ? getChildrenAccessingCoordinatesDuringPlacement.PROTO2 : getChildrenAccessingCoordinatesDuringPlacement.PROTO3) == getChildrenAccessingCoordinatesDuringPlacement.PROTO2 ? LayoutNodeKt.read(getdetachedfromparentlookaheadplacementuiIconCompatParcelizer, ensureLookaheadDelegateCreatedui.IconCompatParcelizer, LayoutNodeUsageByParent.read, getChildrenAccessingLookaheadCoordinatesDuringPlacement.read, setVirtualLookaheadRootui.write(), accesssetDrawNodep.read) : LayoutNodeKt.read(getdetachedfromparentlookaheadplacementuiIconCompatParcelizer, ensureLookaheadDelegateCreatedui.IconCompatParcelizer, LayoutNodeUsageByParent.read, getChildrenAccessingLookaheadCoordinatesDuringPlacement.write, null, accesssetDrawNodep.read);
            }
            getCoordinatesAccessedDuringPlacement getcoordinatesaccessedduringplacement2 = (getCoordinatesAccessedDuringPlacement) concurrentHashMap.putIfAbsent(cls, getcoordinatesaccessedduringplacement);
            if (getcoordinatesaccessedduringplacement2 != null) {
                return getcoordinatesaccessedduringplacement2;
            }
        }
        return getcoordinatesaccessedduringplacement;
    }
}
