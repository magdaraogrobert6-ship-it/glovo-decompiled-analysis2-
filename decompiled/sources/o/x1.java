package o;

import com.roadrunner.location.toggle.domain.CanRequestLocationUpdatesImpl;
import com.roadrunner.location.toggle.domain.GetOfflineLocationRequestStateImpl;
import com.roadrunner.map.measurement.domain.IsRiderInsideAreaUseCaseImpl;
import com.roadrunner.opportunities.data.OpportunitiesRepository;
import com.roadrunner.rider.state.provider.domain.GetRiderStatusImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 {
    private static int ResultReceiver = 0;
    private static int r8lambda54BeH8ZsBru0CXI2CCSP2syNys = 1;
    public final GetOfflineLocationRequestStateImpl IconCompatParcelizer;
    public final checkSdkClickResponse MediaBrowserCompatMediaItem;
    public final IsRiderInsideAreaUseCaseImpl MediaDescriptionCompat;
    public final v4 MediaMetadataCompat;
    public final readFileContent MediaSessionCompatQueueItem;
    public final removeRearDisplayPresentationStatusListener MediaSessionCompatResultReceiverWrapper;
    public final v9 MediaSessionCompatToken;
    public final OpportunitiesRepository ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public final va PlaybackStateCompatCustomAction;
    public final GetRiderStatusImpl RatingCompat;
    public final AndroidUiFrameClock RemoteActionCompatParcelizer;
    public final subscribeToBannersUpdateslambda2 read;
    public final setLastHorizontalStyle serializer;
    public final CanRequestLocationUpdatesImpl write;

    public x1(setLastHorizontalStyle setlasthorizontalstyle, OpportunitiesRepository opportunitiesRepository, v9 v9Var, va vaVar, v4 v4Var, GetRiderStatusImpl getRiderStatusImpl, AndroidUiFrameClock androidUiFrameClock, subscribeToBannersUpdateslambda2 subscribetobannersupdateslambda2, checkSdkClickResponse checksdkclickresponse, CanRequestLocationUpdatesImpl canRequestLocationUpdatesImpl, GetOfflineLocationRequestStateImpl getOfflineLocationRequestStateImpl, removeRearDisplayPresentationStatusListener removereardisplaypresentationstatuslistener, IsRiderInsideAreaUseCaseImpl isRiderInsideAreaUseCaseImpl, readFileContent readfilecontent) {
        setlasthorizontalstyle.getClass();
        opportunitiesRepository.getClass();
        v9Var.getClass();
        vaVar.getClass();
        v4Var.getClass();
        getRiderStatusImpl.getClass();
        androidUiFrameClock.getClass();
        subscribetobannersupdateslambda2.getClass();
        checksdkclickresponse.getClass();
        canRequestLocationUpdatesImpl.getClass();
        getOfflineLocationRequestStateImpl.getClass();
        removereardisplaypresentationstatuslistener.getClass();
        isRiderInsideAreaUseCaseImpl.getClass();
        readfilecontent.getClass();
        this.serializer = setlasthorizontalstyle;
        this.ParcelableVolumeInfo = opportunitiesRepository;
        this.MediaSessionCompatToken = v9Var;
        this.PlaybackStateCompatCustomAction = vaVar;
        this.MediaMetadataCompat = v4Var;
        this.RatingCompat = getRiderStatusImpl;
        this.RemoteActionCompatParcelizer = androidUiFrameClock;
        this.read = subscribetobannersupdateslambda2;
        this.MediaBrowserCompatMediaItem = checksdkclickresponse;
        this.write = canRequestLocationUpdatesImpl;
        this.IconCompatParcelizer = getOfflineLocationRequestStateImpl;
        this.MediaSessionCompatResultReceiverWrapper = removereardisplaypresentationstatuslistener;
        this.MediaDescriptionCompat = isRiderInsideAreaUseCaseImpl;
        this.MediaSessionCompatQueueItem = readfilecontent;
        this.PlaybackStateCompat = true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041  */
    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[PHI: r2
  0x0047: PHI (r2v9 int) = (r2v7 int), (r2v13 int) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0034 A[PHI: r2
  0x0034: PHI (r2v8 int) = (r2v7 int), (r2v13 int) binds: [B:8:0x0032, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    public static gExternalSyntheticLambda1 serializer(x1 x1Var, ArrayList arrayList, double d, g5 g5Var, int i) {
        int iM776toArgb8_81llA;
        int i2;
        int i3;
        g5 g5Var2;
        int i4 = 2 % 2;
        int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 23;
        ResultReceiver = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            iM776toArgb8_81llA = androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(x1Var.serializer.IconCompatParcelizer().setPresenter());
            if ((i & 22) != 0) {
                g5 g5Var3 = g5.NEVER;
                i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 123;
                ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i6 = 5 % 3;
                }
                i3 = iM776toArgb8_81llA;
                g5Var2 = g5Var3;
            } else {
                g5Var2 = g5Var;
                i3 = iM776toArgb8_81llA;
            }
        } else {
            iM776toArgb8_81llA = androidx.compose.ui.graphics.ColorKt.m776toArgb8_81llA(x1Var.serializer.IconCompatParcelizer().setPresenter());
            if ((i & 8) != 0) {
                g5 g5Var4 = g5.NEVER;
                i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 123;
                ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    int i7 = 5 % 3;
                }
                i3 = iM776toArgb8_81llA;
                g5Var2 = g5Var4;
            } else {
                g5Var2 = g5Var;
                i3 = iM776toArgb8_81llA;
            }
        }
        x1Var.getClass();
        return new gExternalSyntheticLambda1(arrayList, d, i3, 0, g5Var2, null, 80);
    }

    public static ArrayList IconCompatParcelizer(List list) {
        int i = 2 % 2;
        List<o7ExternalSyntheticLambda3> list2 = list;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
        for (o7ExternalSyntheticLambda3 o7externalsyntheticlambda3 : list2) {
            arrayList.add(new f8(o7externalsyntheticlambda3.read, o7externalsyntheticlambda3.write));
        }
        int i2 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 105;
        ResultReceiver = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrayList;
    }

    public static se serializer(se seVar, int i) {
        sb sbVar;
        Object next;
        Integer numValueOf;
        Integer numValueOf2;
        int i2 = 2 % 2;
        sa saVar = seVar.serializer;
        Object obj = null;
        if (saVar instanceof sb) {
            sbVar = (sb) saVar;
            int i3 = ResultReceiver + 91;
            r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
        } else {
            sbVar = null;
        }
        if (sbVar != null) {
            List list = sbVar.write;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                int i5 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 35;
                ResultReceiver = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                int i6 = i5 % 2;
                next = it.next();
            } while (((t2) next).MediaDescriptionCompat != i);
            t2 t2Var = (t2) next;
            if (t2Var != null) {
                t1 t1Var = t2Var.serializer;
                if (t1Var != null) {
                    int i7 = ResultReceiver + 65;
                    r8lambda54BeH8ZsBru0CXI2CCSP2syNys = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i7 % 2 == 0) {
                        Integer.valueOf(t1Var.IconCompatParcelizer);
                        obj.hashCode();
                        throw null;
                    }
                    numValueOf = Integer.valueOf(t1Var.IconCompatParcelizer);
                } else {
                    numValueOf = null;
                }
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    int i8 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 87;
                    ResultReceiver = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        t1 t1Var2 = ((t2) it2.next()).serializer;
                        throw null;
                    }
                    t2 t2Var2 = (t2) it2.next();
                    t1 t1Var3 = t2Var2.serializer;
                    if (t1Var3 != null) {
                        numValueOf2 = Integer.valueOf(t1Var3.IconCompatParcelizer);
                        int i9 = r8lambda54BeH8ZsBru0CXI2CCSP2syNys + 79;
                        ResultReceiver = i9 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                        int i10 = i9 % 2;
                    } else {
                        numValueOf2 = null;
                    }
                    arrayList.add(t2.IconCompatParcelizer(t2Var2, ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{numValueOf2, numValueOf}, getCieXyz.write())).booleanValue()));
                }
                return se.RemoteActionCompatParcelizer(seVar, sb.serializer(sbVar, arrayList));
            }
        }
        return seVar;
    }
}
