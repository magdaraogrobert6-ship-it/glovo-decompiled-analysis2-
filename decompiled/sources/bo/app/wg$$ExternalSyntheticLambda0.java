package bo.app;

import android.location.Location;
import android.util.Size;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import com.braze.models.cards.Card;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.sentiance.sdk.eventtimeline.transportsessionrecorder.api.TransportSession;
import java.util.Comparator;
import o.BroadcastFrameClock;
import o.FabBaselineTokens;
import o.JpegCaptureDownsizingQuirk;
import o.NodeCoordinatorCompanionPointerInputSource1;
import o.NodeCoordinatorupdateLayerParameters1;
import o.calculateMinimumTouchTargetPaddingE7KxVPU;
import o.getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations;
import o.getTotalDiscounts;
import o.handleLogClickdefault;
import o.nodeReused;
import o.populatePushStoryPage;
import o.r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE;
import o.removeNodeAtDepth;
import o.setWrappedui;
import o.toParentPosition8S9VItk;
import o.visitNodes;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wg$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ wg$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return wg.a((ga) obj, (ga) obj2);
            case 1:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 2:
                return ((JpegCaptureDownsizingQuirk) obj).RemoteActionCompatParcelizer.compareTo(((JpegCaptureDownsizingQuirk) obj2).RemoteActionCompatParcelizer);
            case 3:
                return removeNodeAtDepth.serializer(((BroadcastFrameClock) obj2).serializer, ((BroadcastFrameClock) obj).serializer);
            case 4:
                return removeNodeAtDepth.serializer(((LazyListMeasuredItem) ((FabBaselineTokens) obj)).MediaMetadataCompat, ((LazyListMeasuredItem) ((FabBaselineTokens) obj2)).MediaMetadataCompat);
            case 5:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 6:
                return BrazeContentCardUtils.defaultCardHandling$lambda$0((Card) obj, (Card) obj2);
            case 7:
                calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu = (calculateMinimumTouchTargetPaddingE7KxVPU) obj;
                calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu2 = (calculateMinimumTouchTargetPaddingE7KxVPU) obj2;
                int i = calculateminimumtouchtargetpaddinge7kxvpu.read.compareTo(calculateminimumtouchtargetpaddinge7kxvpu2.read);
                return i != 0 ? i : Integer.compare(calculateminimumtouchtargetpaddinge7kxvpu.IconCompatParcelizer, calculateminimumtouchtargetpaddinge7kxvpu2.IconCompatParcelizer);
            case 8:
                calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu3 = (calculateMinimumTouchTargetPaddingE7KxVPU) obj;
                calculateMinimumTouchTargetPaddingE7KxVPU calculateminimumtouchtargetpaddinge7kxvpu4 = (calculateMinimumTouchTargetPaddingE7KxVPU) obj2;
                int iCompare = Integer.compare(calculateminimumtouchtargetpaddinge7kxvpu3.IconCompatParcelizer, calculateminimumtouchtargetpaddinge7kxvpu4.IconCompatParcelizer);
                return iCompare != 0 ? iCompare : calculateminimumtouchtargetpaddinge7kxvpu3.read.compareTo(calculateminimumtouchtargetpaddinge7kxvpu4.read);
            case 9:
                return ((Long) obj2).compareTo((Long) obj);
            case 10:
                toParentPosition8S9VItk toparentposition8s9vitk = (toParentPosition8S9VItk) obj;
                toParentPosition8S9VItk toparentposition8s9vitk2 = (toParentPosition8S9VItk) obj2;
                int iCompare2 = Long.compare(toparentposition8s9vitk.read.serializer, toparentposition8s9vitk2.read.serializer);
                return iCompare2 == 0 ? toparentposition8s9vitk.IconCompatParcelizer.compareTo(toparentposition8s9vitk2.IconCompatParcelizer) : iCompare2;
            case 11:
                return Integer.compare(((NodeCoordinatorupdateLayerParameters1) obj).RemoteActionCompatParcelizer, ((NodeCoordinatorupdateLayerParameters1) obj2).RemoteActionCompatParcelizer);
            case 12:
                return ((visitNodes) obj).compareTo((visitNodes) obj2);
            case 13:
                return setWrappedui.RemoteActionCompatParcelizer((NodeCoordinatorCompanionPointerInputSource1) obj).compareTo(setWrappedui.RemoteActionCompatParcelizer((NodeCoordinatorCompanionPointerInputSource1) obj2));
            case 14:
                return ((nodeReused) obj).serializer.compareTo(((nodeReused) obj2).serializer);
            case 15:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 16:
                return com.huawei.hms.locationSdk.r.a((com.huawei.hms.locationSdk.s) obj, (com.huawei.hms.locationSdk.s) obj2);
            case 17:
                return com.huawei.hms.locationSdk.r.b((com.huawei.hms.locationSdk.s) obj, (com.huawei.hms.locationSdk.s) obj2);
            case 18:
                return Short.compare(((Short) obj).shortValue(), ((Short) obj2).shortValue());
            case 19:
                return Long.compare(((Location) obj).getTime(), ((Location) obj2).getTime());
            case 20:
                return Long.compare(((r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) obj).PlaybackStateCompatCustomAction(), ((r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) obj2).PlaybackStateCompatCustomAction());
            case 21:
                return Long.compare(((r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) obj2).ParcelableVolumeInfo(), ((r8lambdajpyyZOnAiuxh7ebz6M40cuqFRmE) obj).ParcelableVolumeInfo());
            case 22:
                return handleLogClickdefault.IconCompatParcelizer((handleLogClickdefault) obj, (handleLogClickdefault) obj2);
            case 23:
                return (int) (((TransportSession) obj).getStartDate().getEpochTime() - ((TransportSession) obj2).getStartDate().getEpochTime());
            case 24:
                return Long.compare(((getTotalDiscounts.serializer) obj).write(), ((getTotalDiscounts.serializer) obj2).write());
            case 25:
                return ((int) ((Location) obj).getAccuracy()) - ((int) ((Location) obj2).getAccuracy());
            case 26:
                return Long.compare(((Location) obj).getTime(), ((Location) obj2).getTime());
            case 27:
                return ((populatePushStoryPage) obj).serializer().compareTo(((populatePushStoryPage) obj2).serializer());
            default:
                return Long.compare(((getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) obj2).read.longValue(), ((getBRAZE_PUSH_DELIVERY_FLUSH_MIN_KEYannotations) obj).read.longValue());
        }
    }
}
