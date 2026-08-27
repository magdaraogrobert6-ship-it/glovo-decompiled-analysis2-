package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class applyModifier extends LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode {
    public final /* synthetic */ int read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ applyModifier(Class cls, int i) {
        super(cls);
        this.read = i;
    }

    @Override // o.LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode
    public final Object read(setInteropViewFactoryHolderui setinteropviewfactoryholderui) throws GeneralSecurityException {
        int i = 0;
        switch (this.read) {
            case 0:
                getRectInParentDirtyui getrectinparentdirtyui = (getRectInParentDirtyui) setinteropviewfactoryholderui;
                getOwnerui getowneruiWrite = getrectinparentdirtyui.MediaDescriptionCompat().write();
                SecretKeySpec secretKeySpec = new SecretKeySpec(getrectinparentdirtyui.RemoteActionCompatParcelizer().read(), "HMAC");
                int iSerializer = getrectinparentdirtyui.MediaDescriptionCompat().serializer();
                int i2 = accesssetIgnoreRemeasureRequestsp.IconCompatParcelizer[getowneruiWrite.ordinal()];
                if (i2 == 1) {
                    return new setLookaheadLayoutPendingui(new setLookaheadMeasurePendingui("HMACSHA1", secretKeySpec), iSerializer);
                }
                if (i2 == 2) {
                    return new setLookaheadLayoutPendingui(new setLookaheadMeasurePendingui("HMACSHA224", secretKeySpec), iSerializer);
                }
                if (i2 == 3) {
                    return new setLookaheadLayoutPendingui(new setLookaheadMeasurePendingui("HMACSHA256", secretKeySpec), iSerializer);
                }
                if (i2 == 4) {
                    return new setLookaheadLayoutPendingui(new setLookaheadMeasurePendingui("HMACSHA384", secretKeySpec), iSerializer);
                }
                if (i2 == 5) {
                    return new setLookaheadLayoutPendingui(new setLookaheadMeasurePendingui("HMACSHA512", secretKeySpec), iSerializer);
                }
                getAlignmentLinesMap.write("unknown hash");
                return null;
            case 1:
                attachui attachuiVar = (attachui) setinteropviewfactoryholderui;
                LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode[] layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr = {new hasPrevious(getWidthui.class)};
                HashMap map = new HashMap();
                LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr[0];
                boolean zContainsKey = map.containsKey(layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode.serializer);
                Class cls = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode.serializer;
                if (zContainsKey) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return null;
                }
                map.put(cls, layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode);
                Class cls2 = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr[0].serializer;
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                clearSubtreeIntrinsicsUsageui clearsubtreeintrinsicsusageuiRemoteActionCompatParcelizer = attachuiVar.RemoteActionCompatParcelizer();
                LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode2 = (LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode) mapUnmodifiableMap.get(getWidthui.class);
                if (layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode2 == null) {
                    r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Requested primitive class ", getWidthui.class.getCanonicalName(), " not supported.");
                    return null;
                }
                getWidthui getwidthui = (getWidthui) layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode2.read(clearsubtreeintrinsicsusageuiRemoteActionCompatParcelizer);
                LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode[] layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr2 = {new applyModifier(isHitInMinimumTouchTargetBetter.class, i)};
                HashMap map2 = new HashMap();
                LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode3 = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr2[0];
                boolean zContainsKey2 = map2.containsKey(layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode3.serializer);
                Class cls3 = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode3.serializer;
                if (zContainsKey2) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return null;
                }
                map2.put(cls3, layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode3);
                Class cls4 = layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNodeArr2[0].serializer;
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                getRectInParentDirtyui getrectinparentdirtyuiSerializer = attachuiVar.serializer();
                LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode4 = (LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode) mapUnmodifiableMap2.get(isHitInMinimumTouchTargetBetter.class);
                if (layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode4 != null) {
                    return new setChildrenAccessingCoordinatesDuringPlacement(getwidthui, (isHitInMinimumTouchTargetBetter) layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode4.read(getrectinparentdirtyuiSerializer), attachuiVar.serializer().MediaDescriptionCompat().serializer());
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Requested primitive class ", isHitInMinimumTouchTargetBetter.class.getCanonicalName(), " not supported.");
                return null;
            case 2:
                getApplyingModifierOnAttachui getapplyingmodifieronattachui = (getApplyingModifierOnAttachui) setinteropviewfactoryholderui;
                return new getOuterCoordinator(getapplyingmodifieronattachui.write().read(), getapplyingmodifieronattachui.IconCompatParcelizer().RemoteActionCompatParcelizer());
            case 3:
                return new invalidateParentData(((getInteropViewFactoryHolderui) setinteropviewfactoryholderui).RemoteActionCompatParcelizer().read());
            case 4:
                return new setMeasurePolicyState(((getIntrinsicsUsageByParentui) setinteropviewfactoryholderui).serializer().read());
            case 5:
                return new onRemovedFromLookaheadScope(((getMeasurePendingui) setinteropviewfactoryholderui).IconCompatParcelizer().read(), 0);
            case 6:
                String strIconCompatParcelizer = ((markMeasurePendingui) setinteropviewfactoryholderui).RemoteActionCompatParcelizer().IconCompatParcelizer();
                return hit.RemoteActionCompatParcelizer(strIconCompatParcelizer).IconCompatParcelizer(strIconCompatParcelizer);
            case 7:
                placeui placeuiVar = (placeui) setinteropviewfactoryholderui;
                String strIconCompatParcelizer2 = placeuiVar.IconCompatParcelizer().IconCompatParcelizer();
                return new quickSort(placeuiVar.IconCompatParcelizer().serializer(), hit.RemoteActionCompatParcelizer(strIconCompatParcelizer2).IconCompatParcelizer(strIconCompatParcelizer2));
            case 8:
                return new onRemovedFromLookaheadScope(((rescheduleRemeasureOrRelayoutui) setinteropviewfactoryholderui).write().read(), 1);
            case 9:
                return new onCoordinatesUsed(((getLookaheadPassDelegateui) setinteropviewfactoryholderui).RemoteActionCompatParcelizer().read());
            default:
                lookaheadRemeasure_Sx5XlMuidefault lookaheadremeasure_sx5xlmuidefault = (lookaheadRemeasure_Sx5XlMuidefault) setinteropviewfactoryholderui;
                return new setLookaheadLayoutPendingui(new setCoordinatesAccessedDuringModifierPlacement(lookaheadremeasure_sx5xlmuidefault.write().read()), lookaheadremeasure_sx5xlmuidefault.serializer().write());
        }
    }
}
