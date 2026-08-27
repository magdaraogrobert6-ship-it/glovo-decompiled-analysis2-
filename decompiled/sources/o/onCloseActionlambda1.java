package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.text.RegexKt;
import okio.Okio;

/* JADX INFO: loaded from: classes4.dex */
public class onCloseActionlambda1 implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA, InAppMessageJavascriptInterfacerequestPushPermission11 {
    public final boolean[] MediaBrowserCompatMediaItem;
    public final int MediaDescriptionCompat;
    public ArrayList MediaMetadataCompat;
    public final getInAppMessageManager MediaSessionCompatQueueItem;
    public final List[] MediaSessionCompatResultReceiverWrapper;
    public final onViewDetachedFromWindowlambda1 MediaSessionCompatToken;
    public final String ParcelableVolumeInfo;
    public final String[] PlaybackStateCompat;
    public Map PlaybackStateCompatCustomAction;
    public final onViewDetachedFromWindowlambda1 RatingCompat;
    public final onViewDetachedFromWindowlambda1 RemoteActionCompatParcelizer;
    public int write = -1;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public RegexKt RemoteActionCompatParcelizer() {
        return r8lambdaHmNwzRTGt9ipoF7JjsxqrYWXHc8.IconCompatParcelizer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return this.ParcelableVolumeInfo;
    }

    public String toString() {
        return Okio.write(this);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public boolean write() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String IconCompatParcelizer(int i) {
        return this.PlaybackStateCompat[i];
    }

    @Override // o.InAppMessageJavascriptInterfacerequestPushPermission11
    public final Set MediaSessionCompatQueueItem() {
        return this.PlaybackStateCompatCustomAction.keySet();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        return ((setGraphicModalMaxWidthDp[]) this.RatingCompat.MediaSessionCompatResultReceiverWrapper())[i].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).intValue();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        List list = this.MediaSessionCompatResultReceiverWrapper[i];
        return list == null ? instance_delegatelambda0.write : list;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        return this.MediaBrowserCompatMediaItem[i];
    }

    public onCloseActionlambda1(String str, getInAppMessageManager getinappmessagemanager, int i) {
        this.ParcelableVolumeInfo = str;
        this.MediaSessionCompatQueueItem = getinappmessagemanager;
        this.MediaDescriptionCompat = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.PlaybackStateCompat = strArr;
        int i4 = this.MediaDescriptionCompat;
        this.MediaSessionCompatResultReceiverWrapper = new List[i4];
        this.MediaBrowserCompatMediaItem = new boolean[i4];
        this.PlaybackStateCompatCustomAction = SimpleItemTouchHelperCallback.serializer;
        onViewDetachedFromWindowlambda0 onviewdetachedfromwindowlambda0 = onViewDetachedFromWindowlambda0.PUBLICATION;
        this.RatingCompat = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.r8lambdajFWRKmgkluu9nXEwsUx7U9Lqqc4
            public final /* synthetic */ onCloseActionlambda1 RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArrChildSerializers;
                ArrayList arrayList;
                setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArrTypeParametersSerializers;
                int i5 = i2;
                onCloseActionlambda1 oncloseactionlambda1 = this.RemoteActionCompatParcelizer;
                if (i5 == 0) {
                    getInAppMessageManager getinappmessagemanager2 = oncloseactionlambda1.MediaSessionCompatQueueItem;
                    return (getinappmessagemanager2 == null || (setgraphicmodalmaxwidthdpArrChildSerializers = getinappmessagemanager2.childSerializers()) == null) ? performClickAction.IconCompatParcelizer : setgraphicmodalmaxwidthdpArrChildSerializers;
                }
                if (i5 != 1) {
                    return Integer.valueOf(Okio.IconCompatParcelizer(oncloseactionlambda1, (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) oncloseactionlambda1.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()));
                }
                getInAppMessageManager getinappmessagemanager3 = oncloseactionlambda1.MediaSessionCompatQueueItem;
                if (getinappmessagemanager3 == null || (setgraphicmodalmaxwidthdpArrTypeParametersSerializers = getinappmessagemanager3.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(setgraphicmodalmaxwidthdpArrTypeParametersSerializers.length);
                    for (setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp : setgraphicmodalmaxwidthdpArrTypeParametersSerializers) {
                        arrayList.add(setgraphicmodalmaxwidthdp.getDescriptor());
                    }
                }
                return r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.write(arrayList);
            }
        });
        final int i5 = 1;
        this.MediaSessionCompatToken = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.r8lambdajFWRKmgkluu9nXEwsUx7U9Lqqc4
            public final /* synthetic */ onCloseActionlambda1 RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArrChildSerializers;
                ArrayList arrayList;
                setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArrTypeParametersSerializers;
                int i6 = i5;
                onCloseActionlambda1 oncloseactionlambda1 = this.RemoteActionCompatParcelizer;
                if (i6 == 0) {
                    getInAppMessageManager getinappmessagemanager2 = oncloseactionlambda1.MediaSessionCompatQueueItem;
                    return (getinappmessagemanager2 == null || (setgraphicmodalmaxwidthdpArrChildSerializers = getinappmessagemanager2.childSerializers()) == null) ? performClickAction.IconCompatParcelizer : setgraphicmodalmaxwidthdpArrChildSerializers;
                }
                if (i6 != 1) {
                    return Integer.valueOf(Okio.IconCompatParcelizer(oncloseactionlambda1, (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) oncloseactionlambda1.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()));
                }
                getInAppMessageManager getinappmessagemanager3 = oncloseactionlambda1.MediaSessionCompatQueueItem;
                if (getinappmessagemanager3 == null || (setgraphicmodalmaxwidthdpArrTypeParametersSerializers = getinappmessagemanager3.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(setgraphicmodalmaxwidthdpArrTypeParametersSerializers.length);
                    for (setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp : setgraphicmodalmaxwidthdpArrTypeParametersSerializers) {
                        arrayList.add(setgraphicmodalmaxwidthdp.getDescriptor());
                    }
                }
                return r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.write(arrayList);
            }
        });
        final int i6 = 2;
        this.RemoteActionCompatParcelizer = LazyKt__LazyJVMKt.serializer(onviewdetachedfromwindowlambda0, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(this) { // from class: o.r8lambdajFWRKmgkluu9nXEwsUx7U9Lqqc4
            public final /* synthetic */ onCloseActionlambda1 RemoteActionCompatParcelizer;

            {
                this.RemoteActionCompatParcelizer = this;
            }

            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final Object invoke() {
                setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArrChildSerializers;
                ArrayList arrayList;
                setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArrTypeParametersSerializers;
                int i7 = i6;
                onCloseActionlambda1 oncloseactionlambda1 = this.RemoteActionCompatParcelizer;
                if (i7 == 0) {
                    getInAppMessageManager getinappmessagemanager2 = oncloseactionlambda1.MediaSessionCompatQueueItem;
                    return (getinappmessagemanager2 == null || (setgraphicmodalmaxwidthdpArrChildSerializers = getinappmessagemanager2.childSerializers()) == null) ? performClickAction.IconCompatParcelizer : setgraphicmodalmaxwidthdpArrChildSerializers;
                }
                if (i7 != 1) {
                    return Integer.valueOf(Okio.IconCompatParcelizer(oncloseactionlambda1, (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) oncloseactionlambda1.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper()));
                }
                getInAppMessageManager getinappmessagemanager3 = oncloseactionlambda1.MediaSessionCompatQueueItem;
                if (getinappmessagemanager3 == null || (setgraphicmodalmaxwidthdpArrTypeParametersSerializers = getinappmessagemanager3.typeParametersSerializers()) == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(setgraphicmodalmaxwidthdpArrTypeParametersSerializers.length);
                    for (setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp : setgraphicmodalmaxwidthdpArrTypeParametersSerializers) {
                        arrayList.add(setgraphicmodalmaxwidthdp.getDescriptor());
                    }
                }
                return r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.write(arrayList);
            }
        });
    }

    public final void IconCompatParcelizer(Annotation annotation) {
        annotation.getClass();
        int i = this.write;
        List[] listArr = this.MediaSessionCompatResultReceiverWrapper;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.write] = arrayList;
        }
        arrayList.add(annotation);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int read(String str) {
        str.getClass();
        Integer num = (Integer) this.PlaybackStateCompatCustomAction.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final void read(String str, boolean z) {
        str.getClass();
        int i = this.write + 1;
        this.write = i;
        String[] strArr = this.PlaybackStateCompat;
        strArr[i] = str;
        this.MediaBrowserCompatMediaItem[i] = z;
        this.MediaSessionCompatResultReceiverWrapper[i] = null;
        if (i == this.MediaDescriptionCompat - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.PlaybackStateCompatCustomAction = map;
        }
    }

    public final void serializer(Annotation annotation) {
        annotation.getClass();
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new ArrayList(1);
        }
        ArrayList arrayList = this.MediaMetadataCompat;
        arrayList.getClass();
        arrayList.add(annotation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onCloseActionlambda1) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
            if (this.ParcelableVolumeInfo.equals(r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer()) && Arrays.equals((r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) this.MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper(), (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[]) ((onCloseActionlambda1) obj).MediaSessionCompatToken.MediaSessionCompatResultReceiverWrapper())) {
                int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
                int i = this.MediaDescriptionCompat;
                if (i == iIconCompatParcelizer) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{RemoteActionCompatParcelizer(i2).serializer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i2).serializer()}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{RemoteActionCompatParcelizer(i2).RemoteActionCompatParcelizer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i2).RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        ArrayList arrayList = this.MediaMetadataCompat;
        return arrayList == null ? instance_delegatelambda0.write : arrayList;
    }
}
