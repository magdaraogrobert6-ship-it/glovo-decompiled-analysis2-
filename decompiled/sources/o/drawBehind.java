package o;

import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class drawBehind {
    public StreamSharing$$ExternalSyntheticLambda0 IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem = true;
    public final accesstoSizeXkaWNTQjd MediaDescriptionCompat;
    public final HashMap MediaMetadataCompat;
    public final HashMap MediaSessionCompatQueueItem;
    public long MediaSessionCompatResultReceiverWrapper;
    public final HashMap ParcelableVolumeInfo;
    public int RatingCompat;
    public final ArrayList RemoteActionCompatParcelizer;
    public boolean read;
    public final ArrayList serializer;
    public final androidx.compose.ui.unit.Density write;

    public final void RemoteActionCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer.add(obj);
        this.read = true;
    }

    public final accesstoSizeXkaWNTQjd write(Object obj) {
        HashMap map = this.MediaMetadataCompat;
        toPx0680j_4 topx0680j_4 = (toPx0680j_4) map.get(obj);
        Object obj2 = topx0680j_4;
        if (topx0680j_4 == null) {
            accesstoSizeXkaWNTQjd accesstosizexkawntqjd = new accesstoSizeXkaWNTQjd(this);
            map.put(obj, accesstosizexkawntqjd);
            accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = obj;
            obj2 = accesstosizexkawntqjd;
        }
        if (obj2 instanceof accesstoSizeXkaWNTQjd) {
            return (accesstoSizeXkaWNTQjd) obj2;
        }
        return null;
    }

    public drawBehind(androidx.compose.ui.unit.Density density) {
        HashMap map = new HashMap();
        this.MediaMetadataCompat = map;
        this.MediaSessionCompatQueueItem = new HashMap();
        this.ParcelableVolumeInfo = new HashMap();
        accesstoSizeXkaWNTQjd accesstosizexkawntqjd = new accesstoSizeXkaWNTQjd(this);
        this.MediaDescriptionCompat = accesstosizexkawntqjd;
        this.RatingCompat = 0;
        this.RemoteActionCompatParcelizer = new ArrayList();
        this.serializer = new ArrayList();
        this.read = true;
        accesstosizexkawntqjd.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = 0;
        map.put(0, accesstosizexkawntqjd);
        this.write = density;
        this.MediaSessionCompatResultReceiverWrapper = androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        androidx.compose.ui.unit.LayoutDirection layoutDirection = androidx.compose.ui.unit.LayoutDirection.Ltr;
        this.IconCompatParcelizer = new StreamSharing$$ExternalSyntheticLambda0(16, this);
    }

    public final int read(Float f) {
        return Math.round(f.floatValue());
    }

    public final toDpu2uoSUM serializer(toRect torect) {
        toDpu2uoSUM tosp0xmu5do;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i = this.RatingCompat;
        this.RatingCompat = i + 1;
        String strM = af$$ExternalSyntheticOutline0.m(i, "__", sb);
        HashMap map = this.MediaSessionCompatQueueItem;
        toDpu2uoSUM todpu2uosum = (toDpu2uoSUM) map.get(strM);
        toDpu2uoSUM todpu2uosum2 = todpu2uosum;
        if (todpu2uosum == null) {
            switch (torect.ordinal()) {
                case 0:
                    tosp0xmu5do = new getColorFilter(this, toRect.HORIZONTAL_CHAIN);
                    break;
                case 1:
                    tosp0xmu5do = new getAlignment(this, toRect.VERTICAL_CHAIN);
                    break;
                case 2:
                    EmptyBuildDrawCacheParams emptyBuildDrawCacheParams = new EmptyBuildDrawCacheParams(this, toRect.ALIGN_VERTICALLY, 1);
                    emptyBuildDrawCacheParams.getLifecycle = 0.5f;
                    tosp0xmu5do = emptyBuildDrawCacheParams;
                    break;
                case 3:
                    EmptyBuildDrawCacheParams emptyBuildDrawCacheParams2 = new EmptyBuildDrawCacheParams(this, toRect.ALIGN_VERTICALLY, 0);
                    emptyBuildDrawCacheParams2.getLifecycle = 0.5f;
                    tosp0xmu5do = emptyBuildDrawCacheParams2;
                    break;
                case 4:
                    tosp0xmu5do = new toSp0xMU5do(this);
                    break;
                case 5:
                default:
                    tosp0xmu5do = new toDpu2uoSUM(this, torect);
                    break;
                case 6:
                case 7:
                    tosp0xmu5do = new component5(this, torect);
                    break;
                case 8:
                case 9:
                case 10:
                    tosp0xmu5do = new InnerShadowScopeDefaultImpls(this, torect);
                    break;
            }
            tosp0xmu5do.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = strM;
            map.put(strM, tosp0xmu5do);
            todpu2uosum2 = tosp0xmu5do;
        }
        return todpu2uosum2;
    }

    public final getContentScale write(int i, String str) {
        accesstoSizeXkaWNTQjd accesstosizexkawntqjdWrite = write(str);
        InnerShadowScope innerShadowScope = accesstosizexkawntqjdWrite.ComponentActivity;
        if (innerShadowScope == null || !(innerShadowScope instanceof getContentScale)) {
            getContentScale getcontentscale = new getContentScale(this);
            getcontentscale.serializer = i;
            getcontentscale.RemoteActionCompatParcelizer = str;
            accesstosizexkawntqjdWrite.ComponentActivity = getcontentscale;
            accesstosizexkawntqjdWrite.read(getcontentscale.write());
        }
        return (getContentScale) accesstosizexkawntqjdWrite.ComponentActivity;
    }
}
