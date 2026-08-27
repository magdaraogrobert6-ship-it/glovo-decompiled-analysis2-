package o;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetSoftlightcp extends androidx.recyclerview.widget.RecyclerView.ItemAnimator {
    public static TimeInterpolator RemoteActionCompatParcelizer;
    public ArrayList IconCompatParcelizer;
    public ArrayList MediaBrowserCompatMediaItem;
    public ArrayList MediaDescriptionCompat;
    public ArrayList MediaMetadataCompat;
    public ArrayList MediaSessionCompatQueueItem;
    public ArrayList MediaSessionCompatToken;
    public ArrayList ParcelableVolumeInfo;
    public boolean PlaybackStateCompatCustomAction;
    public ArrayList RatingCompat;
    public ArrayList read;
    public ArrayList serializer;
    public ArrayList write;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        ArrayList arrayList = this.serializer;
        ArrayList arrayList2 = this.MediaSessionCompatQueueItem;
        ArrayList arrayList3 = this.read;
        View view = viewHolder.MediaSessionCompatQueueItem;
        view.animate().cancel();
        ArrayList arrayList4 = this.RatingCompat;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((accessgetSrcOutcp) arrayList4.get(size)).IconCompatParcelizer == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchAnimationFinished(viewHolder);
                arrayList4.remove(size);
            }
        }
        serializer(this.MediaMetadataCompat, viewHolder);
        if (this.MediaSessionCompatToken.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAnimationFinished(viewHolder);
        }
        if (this.MediaDescriptionCompat.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAnimationFinished(viewHolder);
        }
        int size2 = arrayList3.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            serializer(arrayList5, viewHolder);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        int size3 = arrayList2.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((accessgetSrcOutcp) arrayList6.get(size4)).IconCompatParcelizer == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchAnimationFinished(viewHolder);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        int size5 = arrayList.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.ParcelableVolumeInfo.remove(viewHolder);
                this.write.remove(viewHolder);
                this.IconCompatParcelizer.remove(viewHolder);
                this.MediaBrowserCompatMediaItem.remove(viewHolder);
                RemoteActionCompatParcelizer();
                return;
            }
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAnimationFinished(viewHolder);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean IconCompatParcelizer() {
        return (this.MediaDescriptionCompat.isEmpty() && this.MediaMetadataCompat.isEmpty() && this.RatingCompat.isEmpty() && this.MediaSessionCompatToken.isEmpty() && this.MediaBrowserCompatMediaItem.isEmpty() && this.ParcelableVolumeInfo.isEmpty() && this.write.isEmpty() && this.IconCompatParcelizer.isEmpty() && this.MediaSessionCompatQueueItem.isEmpty() && this.serializer.isEmpty() && this.read.isEmpty()) ? false : true;
    }

    public final boolean IconCompatParcelizer(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.MediaSessionCompatQueueItem;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.MediaSessionCompatQueueItem.getTranslationY());
        write(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchAnimationFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.RatingCompat;
        accessgetSrcOutcp accessgetsrcoutcp = new accessgetSrcOutcp();
        accessgetsrcoutcp.IconCompatParcelizer = viewHolder;
        accessgetsrcoutcp.serializer = translationX;
        accessgetsrcoutcp.write = translationY;
        accessgetsrcoutcp.read = i3;
        accessgetsrcoutcp.RemoteActionCompatParcelizer = i4;
        arrayList.add(accessgetsrcoutcp);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean read(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls, InfiniteAnimationPolicyDefaultImpls infiniteAnimationPolicyDefaultImpls2) {
        int i;
        int i2;
        int i3 = infiniteAnimationPolicyDefaultImpls.serializer;
        int i4 = infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer;
        if (viewHolder2.shouldIgnore()) {
            int i5 = infiniteAnimationPolicyDefaultImpls.serializer;
            i2 = infiniteAnimationPolicyDefaultImpls.RemoteActionCompatParcelizer;
            i = i5;
        } else {
            i = infiniteAnimationPolicyDefaultImpls2.serializer;
            i2 = infiniteAnimationPolicyDefaultImpls2.RemoteActionCompatParcelizer;
        }
        if (viewHolder == viewHolder2) {
            return IconCompatParcelizer(viewHolder, i3, i4, i, i2);
        }
        float translationX = viewHolder.MediaSessionCompatQueueItem.getTranslationX();
        float translationY = viewHolder.MediaSessionCompatQueueItem.getTranslationY();
        float alpha = viewHolder.MediaSessionCompatQueueItem.getAlpha();
        write(viewHolder);
        viewHolder.MediaSessionCompatQueueItem.setTranslationX(translationX);
        viewHolder.MediaSessionCompatQueueItem.setTranslationY(translationY);
        viewHolder.MediaSessionCompatQueueItem.setAlpha(alpha);
        write(viewHolder2);
        viewHolder2.MediaSessionCompatQueueItem.setTranslationX(-((int) ((i - i3) - translationX)));
        viewHolder2.MediaSessionCompatQueueItem.setTranslationY(-((int) ((i2 - i4) - translationY)));
        viewHolder2.MediaSessionCompatQueueItem.setAlpha(0.0f);
        ArrayList arrayList = this.MediaMetadataCompat;
        accessgetSrcAtopcp accessgetsrcatopcp = new accessgetSrcAtopcp();
        accessgetsrcatopcp.serializer = viewHolder;
        accessgetsrcatopcp.read = viewHolder2;
        accessgetsrcatopcp.IconCompatParcelizer = i3;
        accessgetsrcatopcp.RemoteActionCompatParcelizer = i4;
        accessgetsrcatopcp.write = i;
        accessgetsrcatopcp.MediaSessionCompatQueueItem = i2;
        arrayList.add(accessgetsrcatopcp);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void serializer() {
        ArrayList arrayList = this.MediaMetadataCompat;
        ArrayList arrayList2 = this.read;
        ArrayList arrayList3 = this.serializer;
        ArrayList arrayList4 = this.MediaSessionCompatQueueItem;
        ArrayList arrayList5 = this.MediaDescriptionCompat;
        ArrayList arrayList6 = this.MediaSessionCompatToken;
        ArrayList arrayList7 = this.RatingCompat;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            accessgetSrcOutcp accessgetsrcoutcp = (accessgetSrcOutcp) arrayList7.get(size);
            View view = accessgetsrcoutcp.IconCompatParcelizer.MediaSessionCompatQueueItem;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchAnimationFinished(accessgetsrcoutcp.IconCompatParcelizer);
            arrayList7.remove(size);
        }
        int size2 = arrayList6.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            dispatchAnimationFinished((androidx.recyclerview.widget.RecyclerView.ViewHolder) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder = (androidx.recyclerview.widget.RecyclerView.ViewHolder) arrayList5.get(size3);
            viewHolder.MediaSessionCompatQueueItem.setAlpha(1.0f);
            dispatchAnimationFinished(viewHolder);
            arrayList5.remove(size3);
        }
        int size4 = arrayList.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            accessgetSrcAtopcp accessgetsrcatopcp = (accessgetSrcAtopcp) arrayList.get(size4);
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder2 = accessgetsrcatopcp.serializer;
            if (viewHolder2 != null) {
                write(accessgetsrcatopcp, viewHolder2);
            }
            androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder3 = accessgetsrcatopcp.read;
            if (viewHolder3 != null) {
                write(accessgetsrcatopcp, viewHolder3);
            }
        }
        arrayList.clear();
        if (IconCompatParcelizer()) {
            int size5 = arrayList4.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                int size6 = arrayList8.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        accessgetSrcOutcp accessgetsrcoutcp2 = (accessgetSrcOutcp) arrayList8.get(size6);
                        View view2 = accessgetsrcoutcp2.IconCompatParcelizer.MediaSessionCompatQueueItem;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        dispatchAnimationFinished(accessgetsrcoutcp2.IconCompatParcelizer);
                        arrayList8.remove(size6);
                        if (arrayList8.isEmpty()) {
                            arrayList4.remove(arrayList8);
                        }
                    }
                }
            }
            int size7 = arrayList3.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                int size8 = arrayList9.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder4 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) arrayList9.get(size8);
                        viewHolder4.MediaSessionCompatQueueItem.setAlpha(1.0f);
                        dispatchAnimationFinished(viewHolder4);
                        arrayList9.remove(size8);
                        if (arrayList9.isEmpty()) {
                            arrayList3.remove(arrayList9);
                        }
                    }
                }
            }
            int size9 = arrayList2.size();
            while (true) {
                size9--;
                if (size9 < 0) {
                    break;
                }
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        accessgetSrcAtopcp accessgetsrcatopcp2 = (accessgetSrcAtopcp) arrayList10.get(size10);
                        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder5 = accessgetsrcatopcp2.serializer;
                        if (viewHolder5 != null) {
                            write(accessgetsrcatopcp2, viewHolder5);
                        }
                        androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder6 = accessgetsrcatopcp2.read;
                        if (viewHolder6 != null) {
                            write(accessgetsrcatopcp2, viewHolder6);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList2.remove(arrayList10);
                        }
                    }
                }
            }
            write(this.ParcelableVolumeInfo);
            write(this.MediaBrowserCompatMediaItem);
            write(this.write);
            write(this.IconCompatParcelizer);
            ArrayList arrayList11 = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
                return;
            }
            arrayList11.get(0).getClass();
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, isAppSetIdReadingEnabled.serializer());
        }
    }

    public final boolean write(accessgetSrcAtopcp accessgetsrcatopcp, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (accessgetsrcatopcp.read == viewHolder) {
            accessgetsrcatopcp.read = null;
        } else {
            if (accessgetsrcatopcp.serializer != viewHolder) {
                return false;
            }
            accessgetsrcatopcp.serializer = null;
        }
        viewHolder.MediaSessionCompatQueueItem.setAlpha(1.0f);
        viewHolder.MediaSessionCompatQueueItem.setTranslationX(0.0f);
        viewHolder.MediaSessionCompatQueueItem.setTranslationY(0.0f);
        dispatchAnimationFinished(viewHolder);
        return true;
    }

    public final void RemoteActionCompatParcelizer() {
        if (IconCompatParcelizer()) {
            return;
        }
        ArrayList arrayList = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (arrayList.size() <= 0) {
            arrayList.clear();
            return;
        }
        arrayList.get(0).getClass();
        int iSerializer = isAppSetIdReadingEnabled.serializer();
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.IconCompatParcelizer(isAppSetIdReadingEnabled.serializer(), isAppSetIdReadingEnabled.serializer(), new Object[0], -1923372309, isAppSetIdReadingEnabled.serializer(), 1923372311, iSerializer);
    }

    public final void write(androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        if (RemoteActionCompatParcelizer == null) {
            RemoteActionCompatParcelizer = new ValueAnimator().getInterpolator();
        }
        viewHolder.MediaSessionCompatQueueItem.animate().setInterpolator(RemoteActionCompatParcelizer);
        IconCompatParcelizer(viewHolder);
    }

    public static void write(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((androidx.recyclerview.widget.RecyclerView.ViewHolder) arrayList.get(size)).MediaSessionCompatQueueItem.animate().cancel();
            }
        }
    }

    public final void serializer(ArrayList arrayList, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            accessgetSrcAtopcp accessgetsrcatopcp = (accessgetSrcAtopcp) arrayList.get(size);
            if (write(accessgetsrcatopcp, viewHolder) && accessgetsrcatopcp.serializer == null && accessgetsrcatopcp.read == null) {
                arrayList.remove(accessgetsrcatopcp);
            }
        }
    }
}
