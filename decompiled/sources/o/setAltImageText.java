package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class setAltImageText extends getMessageTextColor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAltImageText(setHeaderTextColor setheadertextcolor) {
        super(setheadertextcolor);
        setheadertextcolor.getClass();
    }

    public final ArrayList RemoteActionCompatParcelizer(long j, long j2, List list) {
        ArrayList<r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4> arrayListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(j, j2);
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(arrayListRemoteActionCompatParcelizer, 10));
        for (r8lambda65DqD4z8gFhR5ZTM_6mU_Ajg8B4 r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4 : arrayListRemoteActionCompatParcelizer) {
            long jPlaybackStateCompatCustomAction = r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.PlaybackStateCompatCustomAction();
            Long lSerializer = r8lambda65dqd4z8gfhr5ztm_6mu_ajg8b4.serializer();
            if (lSerializer == null) {
                lSerializer = Long.valueOf(j2);
            }
            long jMin = Math.min(lSerializer.longValue(), j2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                handleLogClickdefault handlelogclickdefault = (handleLogClickdefault) obj;
                long jMediaDescriptionCompat = handlelogclickdefault.MediaDescriptionCompat();
                if (jPlaybackStateCompatCustomAction <= jMediaDescriptionCompat && jMediaDescriptionCompat <= jMin && handlelogclickdefault.IconCompatParcelizer() != null) {
                    arrayList2.add(obj);
                }
            }
            List listSerializer = onContentCardDismissed.serializer(arrayList2, new setAnimateIn());
            handleLogClickdefault handlelogclickdefault2 = (handleLogClickdefault) onContentCardDismissed.MediaMetadataCompat(listSerializer);
            Float fIconCompatParcelizer = handlelogclickdefault2 != null ? handlelogclickdefault2.IconCompatParcelizer() : null;
            handleLogClickdefault handlelogclickdefault3 = (handleLogClickdefault) onContentCardDismissed.MediaBrowserCompatMediaItem(listSerializer);
            arrayList.add(new r8lambdaF43WjDaaNoL1Ga_eezyHY_7dOps(jPlaybackStateCompatCustomAction, jMin, fIconCompatParcelizer, handlelogclickdefault3 != null ? handlelogclickdefault3.IconCompatParcelizer() : null));
        }
        return arrayList;
    }
}
