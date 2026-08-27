package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.RegexKt;
import okio.Okio;
import okio.internal.ResourceFileSystem$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class getAppropriateModalView implements r8lambda92M0P9sIT5Uf70mvjF4RwMruDA, InAppMessageJavascriptInterfacerequestPushPermission11 {
    public final List IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final Map MediaDescriptionCompat;
    public final RegexKt MediaMetadataCompat;
    public final int MediaSessionCompatQueueItem;
    public final HashSet MediaSessionCompatResultReceiverWrapper;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] PlaybackStateCompatCustomAction;
    public final boolean[] RatingCompat;
    public final isAdapterPositionOnScreen RemoteActionCompatParcelizer;
    public final List[] read;
    public final String[] serializer;
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] write;

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final int IconCompatParcelizer() {
        return this.MediaSessionCompatQueueItem;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean MediaBrowserCompatMediaItem() {
        return false;
    }

    @Override // o.InAppMessageJavascriptInterfacerequestPushPermission11
    public final Set MediaSessionCompatQueueItem() {
        return this.MediaSessionCompatResultReceiverWrapper;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final RegexKt RemoteActionCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List read() {
        return this.IconCompatParcelizer;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String serializer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String toString() {
        return Okio.write(this);
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write() {
        return false;
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final String IconCompatParcelizer(int i) {
        return this.serializer[i];
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA RemoteActionCompatParcelizer(int i) {
        return this.write[i];
    }

    public final int hashCode() {
        return ((Number) this.RemoteActionCompatParcelizer.MediaSessionCompatResultReceiverWrapper()).intValue();
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final List serializer(int i) {
        return this.read[i];
    }

    @Override // o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA
    public final boolean write(int i) {
        return this.RatingCompat[i];
    }

    public getAppropriateModalView(String str, RegexKt regexKt, int i, List list, r8lambdaXTprrz59IiooUoChp937ds3kuBc r8lambdaxtprrz59iioouochp937ds3kubc) {
        this.MediaBrowserCompatMediaItem = str;
        this.MediaMetadataCompat = regexKt;
        this.MediaSessionCompatQueueItem = i;
        this.IconCompatParcelizer = r8lambdaxtprrz59iioouochp937ds3kubc.write;
        ArrayList arrayList = r8lambdaxtprrz59iioouochp937ds3kubc.serializer;
        this.MediaSessionCompatResultReceiverWrapper = onContentCardDismissed.write(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.serializer = strArr;
        this.write = r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.write(r8lambdaxtprrz59iioouochp937ds3kubc.RemoteActionCompatParcelizer);
        this.read = (List[]) r8lambdaxtprrz59iioouochp937ds3kubc.read.toArray(new List[0]);
        this.RatingCompat = onContentCardDismissed.read((Collection) r8lambdaxtprrz59iioouochp937ds3kubc.IconCompatParcelizer);
        strArr.getClass();
        isLongPressDragEnabled islongpressdragenabled = new isLongPressDragEnabled(0, new ResourceFileSystem$$ExternalSyntheticLambda0(20, strArr));
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(islongpressdragenabled, 10));
        Iterator it = islongpressdragenabled.iterator();
        while (true) {
            r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44 r8lambdaorcgh_zecjpqysbjv51vn1ttu44 = (r8lambdaorcGh_ZeCJpQysbjV51vn1tTu44) it;
            if (!((Iterator) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.IconCompatParcelizer).hasNext()) {
                this.MediaDescriptionCompat = onMove.serializer(arrayList2);
                this.PlaybackStateCompatCustomAction = r8lambdafhYz7cFuDeJzdcQ1hWQAPMteho.write(list);
                this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new ResourceFileSystem$$ExternalSyntheticLambda0(22, this));
                return;
            }
            isItemViewSwipeEnabled isitemviewswipeenabled = (isItemViewSwipeEnabled) r8lambdaorcgh_zecjpqysbjv51vn1ttu44.next();
            arrayList2.add(new onViewAttachedToWindowlambda0(isitemviewswipeenabled.read, Integer.valueOf(isitemviewswipeenabled.IconCompatParcelizer)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getAppropriateModalView) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) obj;
            if (this.MediaBrowserCompatMediaItem.equals(r8lambda92m0p9sit5uf70mvjf4rwmruda.serializer()) && Arrays.equals(this.PlaybackStateCompatCustomAction, ((getAppropriateModalView) obj).PlaybackStateCompatCustomAction)) {
                int iIconCompatParcelizer = r8lambda92m0p9sit5uf70mvjf4rwmruda.IconCompatParcelizer();
                int i = this.MediaSessionCompatQueueItem;
                if (i == iIconCompatParcelizer) {
                    for (int i2 = 0; i2 < i; i2++) {
                        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA[] r8lambda92m0p9sit5uf70mvjf4rwmrudaArr = this.write;
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmrudaArr[i2].serializer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i2).serializer()}, getCieXyz.write())).booleanValue()) {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{r8lambda92m0p9sit5uf70mvjf4rwmrudaArr[i2].RemoteActionCompatParcelizer(), r8lambda92m0p9sit5uf70mvjf4rwmruda.RemoteActionCompatParcelizer(i2).RemoteActionCompatParcelizer()}, getCieXyz.write())).booleanValue()) {
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
    public final int read(String str) {
        str.getClass();
        Integer num = (Integer) this.MediaDescriptionCompat.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }
}
