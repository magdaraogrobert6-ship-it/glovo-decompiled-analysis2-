package o;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdar4GqpMVy9WWVsSgBItkK_rUL1wk {
    public final /* synthetic */ r8lambdao3lqYNEkeMXUHIX5LRLuX2akVp8 IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final Set write = Collections.newSetFromMap(new IdentityHashMap());

    public r8lambdar4GqpMVy9WWVsSgBItkK_rUL1wk(r8lambdao3lqYNEkeMXUHIX5LRLuX2akVp8 r8lambdao3lqynekemxuhix5lrlux2akvp8, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = r8lambdao3lqynekemxuhix5lrlux2akvp8;
    }

    public final void RemoteActionCompatParcelizer(Object obj, boolean z) {
        Set set = this.write;
        int size = set.size();
        int i = this.RemoteActionCompatParcelizer;
        r8lambdao3lqYNEkeMXUHIX5LRLuX2akVp8 r8lambdao3lqynekemxuhix5lrlux2akvp8 = this.IconCompatParcelizer;
        if (z) {
            set.add(obj);
            if (size == 0) {
                if (i == 0) {
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) r8lambdao3lqynekemxuhix5lrlux2akvp8;
                    ((cExternalSyntheticLambda7) r8lambday78ccsnuxer22a2wvqifr2bmbdo.MediaBrowserCompatMediaItem.write).PlaybackStateCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(r8lambday78ccsnuxer22a2wvqifr2bmbdo, true);
                    return;
                } else if (i != 1) {
                    ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) r8lambdao3lqynekemxuhix5lrlux2akvp8).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(true);
                    return;
                } else {
                    ((hasTooManyZipEntrieslambda0) r8lambdao3lqynekemxuhix5lrlux2akvp8).RatingCompat();
                    return;
                }
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            if (i == 0) {
                r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo2 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) r8lambdao3lqynekemxuhix5lrlux2akvp8;
                ((cExternalSyntheticLambda7) r8lambday78ccsnuxer22a2wvqifr2bmbdo2.MediaBrowserCompatMediaItem.write).PlaybackStateCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.RemoteActionCompatParcelizer(r8lambday78ccsnuxer22a2wvqifr2bmbdo2, false);
            } else {
                if (i != 1) {
                    ((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) r8lambdao3lqynekemxuhix5lrlux2akvp8).r8lambda7IJBVrN0sHyidCAZufWEJFc7yY.write(false);
                    return;
                }
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = (hasTooManyZipEntrieslambda0) r8lambdao3lqynekemxuhix5lrlux2akvp8;
                if (hastoomanyzipentrieslambda0.addContentView.get()) {
                    return;
                }
                hastoomanyzipentrieslambda0.MediaDescriptionCompat();
            }
        }
    }
}
