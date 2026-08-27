package o;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SharedPreferencesManagerImpl {
    public static final SharedPreferencesManagerImpl[] read = new SharedPreferencesManagerImpl[0];
    public ApiExceptionSessionExpiredForbidden[] IconCompatParcelizer;
    public long[] MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public long MediaSessionCompatQueueItem;
    public long[] RatingCompat;
    public FoodoraSwitchWrongException[] RemoteActionCompatParcelizer;
    public boolean serializer;
    public long write;

    public final List serializer() throws IOException {
        FoodoraSwitchWrongException[] foodoraSwitchWrongExceptionArr;
        int i;
        long[] jArr = this.RatingCompat;
        if (jArr == null || (foodoraSwitchWrongExceptionArr = this.RemoteActionCompatParcelizer) == null || jArr.length == 0 || foodoraSwitchWrongExceptionArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        LinkedList linkedList = new LinkedList();
        long j = this.RatingCompat[0];
        while (true) {
            for (int i2 = (int) j; i2 >= 0; i2 = -1) {
                FoodoraSwitchWrongException[] foodoraSwitchWrongExceptionArr2 = this.RemoteActionCompatParcelizer;
                if (i2 >= foodoraSwitchWrongExceptionArr2.length) {
                    return linkedList;
                }
                if (linkedList.contains(foodoraSwitchWrongExceptionArr2[i2])) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.serializer("folder uses the same coder more than once in coder chain");
                    return null;
                }
                linkedList.addLast(this.RemoteActionCompatParcelizer[i2]);
                if (this.IconCompatParcelizer == null) {
                    i = -1;
                    break;
                }
                i = 0;
                while (true) {
                    ApiExceptionSessionExpiredForbidden[] apiExceptionSessionExpiredForbiddenArr = this.IconCompatParcelizer;
                    if (i >= apiExceptionSessionExpiredForbiddenArr.length) {
                        i = -1;
                        break;
                    }
                    if (apiExceptionSessionExpiredForbiddenArr[i].write == i2) {
                        break;
                    }
                    i++;
                }
                if (i != -1) {
                    j = this.IconCompatParcelizer[i].read;
                }
            }
            return linkedList;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Folder with ");
        sb.append(this.RemoteActionCompatParcelizer.length);
        sb.append(" coders, ");
        sb.append(this.MediaMetadataCompat);
        sb.append(" input streams, ");
        sb.append(this.MediaSessionCompatQueueItem);
        sb.append(" output streams, ");
        sb.append(this.IconCompatParcelizer.length);
        sb.append(" bind pairs, ");
        sb.append(this.RatingCompat.length);
        sb.append(" packed streams, ");
        sb.append(this.MediaBrowserCompatMediaItem.length);
        sb.append(" unpack sizes, ");
        if (this.serializer) {
            str = "with CRC " + this.write;
        } else {
            str = "without CRC";
        }
        sb.append(str);
        sb.append(" and ");
        return af$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, " unpack streams", sb);
    }

    public final long RemoteActionCompatParcelizer() {
        long j = this.MediaSessionCompatQueueItem;
        if (j != 0) {
            for (int i = ((int) j) - 1; i >= 0; i--) {
                if (this.IconCompatParcelizer != null) {
                    int i2 = 0;
                    while (true) {
                        ApiExceptionSessionExpiredForbidden[] apiExceptionSessionExpiredForbiddenArr = this.IconCompatParcelizer;
                        if (i2 < apiExceptionSessionExpiredForbiddenArr.length) {
                            if (apiExceptionSessionExpiredForbiddenArr[i2].write == i) {
                                break;
                            }
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                    }
                }
                return this.MediaBrowserCompatMediaItem[i];
            }
        }
        return 0L;
    }
}
