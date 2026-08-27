package o;

import com.roadrunner.startworking.equipment.EquipmentViewModel$saveChanges$1;
import com.sentiance.core.model.events.N$b;
import io.grpc.internal.CallTracer;
import io.grpc.internal.SharedResourcePool;
import io.sentry.util.network.NetworkBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.RealWebSocket$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class lambda318 extends androidx.lifecycle.ViewModel {
    private static int MediaSessionCompatResultReceiverWrapper = 0;
    private static int PlaybackStateCompatCustomAction = 1;
    public final N$b IconCompatParcelizer;
    public final getBitmapui_graphics MediaBrowserCompatMediaItem;
    public final SharedResourcePool MediaDescriptionCompat;
    public final getQueryContext MediaMetadataCompat;
    public final MutableStateFlow MediaSessionCompatQueueItem;
    public final NetworkBody RatingCompat;
    public final lambda39 RemoteActionCompatParcelizer;
    public final isAdapterPositionOnScreen read;
    public final MutableStateFlow serializer;
    public final CallTracer write;

    public lambda318(NetworkBody networkBody, lambda39 lambda39Var, N$b n$b, SharedResourcePool sharedResourcePool, CallTracer callTracer, getBitmapui_graphics getbitmapui_graphics, getQueryContext getquerycontext) {
        networkBody.getClass();
        lambda39Var.getClass();
        n$b.getClass();
        sharedResourcePool.getClass();
        callTracer.getClass();
        getbitmapui_graphics.getClass();
        getquerycontext.getClass();
        this.RatingCompat = networkBody;
        this.RemoteActionCompatParcelizer = lambda39Var;
        this.IconCompatParcelizer = n$b;
        this.MediaDescriptionCompat = sharedResourcePool;
        this.write = callTracer;
        this.MediaBrowserCompatMediaItem = getbitmapui_graphics;
        this.MediaMetadataCompat = getquerycontext;
        this.read = new isAdapterPositionOnScreen(new RealWebSocket$$ExternalSyntheticLambda0(9, this));
        MutableStateFlow mutableStateFlow = StateFlowKt.read(new lambda317(instance_delegatelambda0.write));
        this.serializer = mutableStateFlow;
        this.MediaSessionCompatQueueItem = mutableStateFlow;
        ShortNewsContentCardView shortNewsContentCardView = null;
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new EquipmentViewModel$saveChanges$1(this, shortNewsContentCardView, 1), 3);
        BuildersKt.RemoteActionCompatParcelizer(toBitmapConfig1JJdX4A.IconCompatParcelizer(this), null, null, new EquipmentViewModel$saveChanges$1(this, shortNewsContentCardView, 2), 3);
    }

    public static lambda316 serializer(String str, List list) {
        Object obj;
        Object next;
        List list2;
        Object next2;
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int i2 = PlaybackStateCompatCustomAction + 77;
            MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                next2 = it.next();
                int i3 = 21 / 0;
                if (next2 instanceof lambda314) {
                    arrayList.add(next2);
                }
            } else {
                next2 = it.next();
                if (!(!(next2 instanceof lambda314))) {
                    arrayList.add(next2);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        int i4 = PlaybackStateCompatCustomAction + 121;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        do {
            obj = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((lambda314) next).write, str}, getCieXyz.write())).booleanValue());
        lambda314 lambda314Var = (lambda314) next;
        if (lambda314Var == null || (list2 = lambda314Var.RemoteActionCompatParcelizer) == null) {
            return null;
        }
        for (Object obj2 : list2) {
            if (((lambda316) obj2).IconCompatParcelizer) {
                obj = obj2;
                break;
            }
        }
        lambda316 lambda316Var = (lambda316) obj;
        int i6 = PlaybackStateCompatCustomAction + 63;
        MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return lambda316Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12, types: [o.lambda311] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [o.lambda315] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2 */
    public static ArrayList serializer(List list, String str, lambda316 lambda316Var) {
        ?? arrayList;
        lambda316 lambda316VarRemoteActionCompatParcelizer;
        int i = 2 % 2;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "vehicle"}, getCieXyz.write())).booleanValue()) {
            List<Object> list2 = list;
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            for (Object objWrite : list2) {
                if (objWrite instanceof lambda314) {
                    lambda314 lambda314Var = (lambda314) objWrite;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{lambda314Var.write, "bag"}, getCieXyz.write())).booleanValue()) {
                        List<lambda316> list3 = lambda314Var.RemoteActionCompatParcelizer;
                        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                        for (lambda316 lambda316Var2 : list3) {
                            if (lambda316Var.IconCompatParcelizer) {
                                int i2 = PlaybackStateCompatCustomAction + 71;
                                MediaSessionCompatResultReceiverWrapper = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                                int i3 = i2 % 2;
                                List list4 = lambda316Var.serializer;
                                list4.getClass();
                                if (list4.contains(lambda316Var2.read)) {
                                    lambda316VarRemoteActionCompatParcelizer = lambda316.RemoteActionCompatParcelizer(lambda316Var2, false, true, 15);
                                } else {
                                    lambda316VarRemoteActionCompatParcelizer = lambda316.RemoteActionCompatParcelizer(lambda316Var2, false, false, 7);
                                }
                            } else {
                                lambda316VarRemoteActionCompatParcelizer = lambda316.RemoteActionCompatParcelizer(lambda316Var2, false, true, 15);
                            }
                            arrayList2.add(lambda316VarRemoteActionCompatParcelizer);
                        }
                        objWrite = lambda314.write(lambda314Var, arrayList2);
                    }
                }
                arrayList.add(objWrite);
            }
        } else {
            arrayList = list;
        }
        Iterable<??> iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof lambda314) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((lambda314) it.next()).RemoteActionCompatParcelizer);
        }
        ArrayList arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayListR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
            lambda316 lambda316Var3 = (lambda316) obj2;
            if (lambda316Var3.IconCompatParcelizer && lambda316Var3.RemoteActionCompatParcelizer) {
                arrayList5.add(obj2);
            }
        }
        int size = arrayList5.size();
        ArrayList arrayList6 = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
        int i4 = PlaybackStateCompatCustomAction + 69;
        MediaSessionCompatResultReceiverWrapper = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        for (?? lambda315Var : iterable) {
            int i6 = PlaybackStateCompatCustomAction + 1;
            MediaSessionCompatResultReceiverWrapper = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i7 = i6 % 2;
            if (lambda315Var instanceof lambda315) {
                lambda315Var = (lambda315) lambda315Var;
                String str2 = lambda315Var.write;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str2, "save_changes"}, getCieXyz.write())).booleanValue()) {
                    int i8 = PlaybackStateCompatCustomAction + 81;
                    MediaSessionCompatResultReceiverWrapper = i8 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        arrayList3.size();
                        throw null;
                    }
                    boolean z = arrayList3.size() == size;
                    enableBridgeSecurity enablebridgesecurity = lambda315Var.RemoteActionCompatParcelizer;
                    String str3 = lambda315Var.read;
                    enablebridgesecurity.getClass();
                    str2.getClass();
                    str3.getClass();
                    lambda315Var = new lambda315(enablebridgesecurity, str2, str3, z);
                } else {
                    continue;
                }
            }
            arrayList6.add(lambda315Var);
        }
        return arrayList6;
    }
}
