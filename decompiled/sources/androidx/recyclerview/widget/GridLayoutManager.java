package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o.BlockGraphicsLayerElement;
import o.FocusPropertiesNode;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNode;
import o.FocusRestorerNodeonExit1;
import o.getHue0nO6VwU;
import o.getIntrinsicSizeNHjbRc;
import o.getModulate0nO6VwU;
import o.getSaturation0nO6VwU;
import o.getSoftlight0nO6VwU;
import o.getSrc0nO6VwU;
import o.isActive;
import o.verticalGradient8A3gB4;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set read = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public final Rect IconCompatParcelizer;
    public View[] MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public final SparseIntArray MediaSessionCompatQueueItem;
    public final verticalGradient8A3gB4 MediaSessionCompatResultReceiverWrapper;
    public int ParcelableVolumeInfo;
    public final SparseIntArray RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public int serializer;
    public int[] write;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int IconCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return RatingCompat(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int read(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return MediaBrowserCompatMediaItem(getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean serializer(BlockGraphicsLayerElement blockGraphicsLayerElement) {
        return blockGraphicsLayerElement instanceof getHue0nO6VwU;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int write(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        return RatingCompat(getintrinsicsizenhjbrc);
    }

    public final int IconCompatParcelizer(int i) {
        int i2 = this.ResultReceiver;
        RecyclerView recyclerView = this.ensureViewModelStore;
        return i2 == 1 ? write(i, recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu) : IconCompatParcelizer(i, recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu);
    }

    public final int IconCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        boolean z = getintrinsicsizenhjbrc.write;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        if (!z) {
            int i2 = this.ParcelableVolumeInfo;
            verticalgradient8a3gb4.getClass();
            return i % i2;
        }
        int i3 = this.MediaSessionCompatQueueItem.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iIconCompatParcelizer = recycler.IconCompatParcelizer(i);
        if (iIconCompatParcelizer != -1) {
            int i4 = this.ParcelableVolumeInfo;
            verticalgradient8a3gb4.getClass();
            return iIconCompatParcelizer % i4;
        }
        SentryLogcatAdapter.IconCompatParcelizer("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(int i, int i2) {
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        verticalgradient8a3gb4.RemoteActionCompatParcelizer();
        ((SparseIntArray) verticalgradient8a3gb4.RemoteActionCompatParcelizer).clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        verticalgradient8a3gb4.RemoteActionCompatParcelizer();
        ((SparseIntArray) verticalgradient8a3gb4.RemoteActionCompatParcelizer).clear();
    }

    public final HashSet RemoteActionCompatParcelizer(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.ensureViewModelStore;
        int i3 = read(i2, recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu);
        for (int i4 = i; i4 < i + i3; i4++) {
            hashSet.add(Integer.valueOf(i4));
        }
        return hashSet;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        int i2;
        int[] iArr = this.write;
        int i3 = this.ParcelableVolumeInfo;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.write = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01db A[LOOP:3: B:129:0x01c7->B:134:0x01db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:142:0x0214  */
    /* JADX WARN: Code duplicated, block: B:143:0x0216  */
    /* JADX WARN: Code duplicated, block: B:145:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0228  */
    /* JADX WARN: Code duplicated, block: B:153:0x0236  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:166:0x027d A[EDGE_INSN: B:166:0x027d->B:167:0x027e BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e3, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e3]] */
    /* JADX WARN: Code duplicated, block: B:168:0x0280  */
    /* JADX WARN: Code duplicated, block: B:207:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:? A[LOOP:4: B:137:0x01ee->B:212:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x027d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:? A[LOOP:7: B:161:0x025c->B:222:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean RemoteActionCompatParcelizer(int i, Bundle bundle) {
        View viewMediaSessionCompatResultReceiverWrapper;
        RecyclerView.ViewHolder childViewHolder;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == FocusRestorerNode.MediaSessionCompatResultReceiverWrapper.read() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus()) {
                    viewMediaSessionCompatResultReceiverWrapper = null;
                    break;
                }
                View viewMediaSessionCompatResultReceiverWrapper2 = MediaSessionCompatResultReceiverWrapper(i5);
                Objects.requireNonNull(viewMediaSessionCompatResultReceiverWrapper2);
                if (viewMediaSessionCompatResultReceiverWrapper2.isAccessibilityFocused()) {
                    viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i5);
                    break;
                }
                i5++;
            }
            if (viewMediaSessionCompatResultReceiverWrapper != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (read.contains(Integer.valueOf(i6)) && (childViewHolder = this.ensureViewModelStore.getChildViewHolder(viewMediaSessionCompatResultReceiverWrapper)) != null) {
                    int absoluteAdapterPosition = childViewHolder.getAbsoluteAdapterPosition();
                    int iIconCompatParcelizer = IconCompatParcelizer(absoluteAdapterPosition);
                    int iWrite = write(absoluteAdapterPosition);
                    if (iIconCompatParcelizer >= 0 && iWrite >= 0) {
                        if (!read(absoluteAdapterPosition).contains(Integer.valueOf(this.MediaMetadataCompat)) || !RemoteActionCompatParcelizer(write(absoluteAdapterPosition), absoluteAdapterPosition).contains(Integer.valueOf(this.serializer))) {
                            this.MediaMetadataCompat = iIconCompatParcelizer;
                            this.serializer = iWrite;
                        }
                        int i7 = this.MediaMetadataCompat;
                        if (i7 == -1) {
                            i7 = iIconCompatParcelizer;
                        }
                        int i8 = this.serializer;
                        if (i8 != -1) {
                            iWrite = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iIconCompatParcelizer2 = IconCompatParcelizer(iIntValue);
                                    int iWrite2 = write(iIntValue);
                                    if (iIconCompatParcelizer2 >= 0 && iWrite2 >= 0) {
                                        if (this.ResultReceiver != 1) {
                                            if (read(iIntValue).contains(Integer.valueOf(i7)) && iWrite2 < iWrite) {
                                                this.serializer = iWrite2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iIconCompatParcelizer2 == i7 && iWrite2 < iWrite) || iIconCompatParcelizer2 < i7) {
                                                this.MediaMetadataCompat = iIconCompatParcelizer2;
                                                this.serializer = iWrite2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iIconCompatParcelizer < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < ResultReceiver()) {
                                                    it2 = read(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iIconCompatParcelizer) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.MediaMetadataCompat = iIntValue2;
                                                                this.serializer = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iIconCompatParcelizer < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < ResultReceiver()) {
                                                it4 = read(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iIconCompatParcelizer) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.MediaMetadataCompat = iIntValue3;
                                                            this.serializer = write(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                RatingCompat(iIntValue);
                                this.MediaDescriptionCompat = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = absoluteAdapterPosition - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iIconCompatParcelizer3 = IconCompatParcelizer(iIntValue);
                                    int iWrite3 = write(iIntValue);
                                    if (iIconCompatParcelizer3 >= 0 && iWrite3 >= 0) {
                                        if (this.ResultReceiver != 1) {
                                            if (iIconCompatParcelizer3 < i7 && iWrite3 == iWrite) {
                                                this.MediaMetadataCompat = ((Integer) Collections.max(read(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iIconCompatParcelizer3 < i7 && RemoteActionCompatParcelizer(write(iIntValue), iIntValue).contains(Integer.valueOf(iWrite))) {
                                                this.MediaMetadataCompat = iIconCompatParcelizer3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iIconCompatParcelizer < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < ResultReceiver()) {
                                                    it2 = read(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iIconCompatParcelizer) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.MediaMetadataCompat = iIntValue2;
                                                                this.serializer = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iIconCompatParcelizer < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < ResultReceiver()) {
                                                it4 = read(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iIconCompatParcelizer) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.MediaMetadataCompat = iIntValue3;
                                                            this.serializer = write(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                RatingCompat(iIntValue);
                                this.MediaDescriptionCompat = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (true) {
                                if (iIntValue < ResultReceiver()) {
                                    int iIconCompatParcelizer4 = IconCompatParcelizer(iIntValue);
                                    int iWrite4 = write(iIntValue);
                                    if (iIconCompatParcelizer4 >= 0 && iWrite4 >= 0) {
                                        if (this.ResultReceiver != 1) {
                                            if (iWrite4 > iWrite && read(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.serializer = iWrite4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iIconCompatParcelizer4 == i7 && iWrite4 > iWrite) || iIconCompatParcelizer4 > i7) {
                                                this.MediaMetadataCompat = iIconCompatParcelizer4;
                                                this.serializer = iWrite4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iIconCompatParcelizer < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < ResultReceiver()) {
                                                    it2 = read(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iIconCompatParcelizer) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.MediaMetadataCompat = iIntValue2;
                                                                this.serializer = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iIconCompatParcelizer < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < ResultReceiver()) {
                                                it4 = read(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iIconCompatParcelizer) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.MediaMetadataCompat = iIntValue3;
                                                            this.serializer = write(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                RatingCompat(iIntValue);
                                this.MediaDescriptionCompat = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = absoluteAdapterPosition + 1;
                            while (true) {
                                if (iIntValue < ResultReceiver()) {
                                    int iIconCompatParcelizer5 = IconCompatParcelizer(iIntValue);
                                    int iWrite5 = write(iIntValue);
                                    if (iIconCompatParcelizer5 >= 0 && iWrite5 >= 0) {
                                        if (this.ResultReceiver != 1) {
                                            if (iIconCompatParcelizer5 > i7 && iWrite5 == iWrite) {
                                                this.MediaMetadataCompat = IconCompatParcelizer(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iIconCompatParcelizer5 > i7 && (iWrite5 == iWrite || RemoteActionCompatParcelizer(write(iIntValue), iIntValue).contains(Integer.valueOf(iWrite)))) {
                                                this.MediaMetadataCompat = iIconCompatParcelizer5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.ResultReceiver) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iIconCompatParcelizer < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < ResultReceiver()) {
                                                it2 = read(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iIconCompatParcelizer) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.MediaMetadataCompat = iIntValue2;
                                                            this.serializer = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iIconCompatParcelizer < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < ResultReceiver()) {
                                            it4 = read(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iIconCompatParcelizer) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.MediaMetadataCompat = iIntValue3;
                                                        this.serializer = write(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                RatingCompat(iIntValue);
                                this.MediaDescriptionCompat = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.RemoteActionCompatParcelizer(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int itemCount = this.ensureViewModelStore.MediaSessionCompatResultReceiverWrapper.getItemCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= itemCount) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.ensureViewModelStore;
                    int iIconCompatParcelizer6 = IconCompatParcelizer(i11, recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu);
                    RecyclerView recyclerView2 = this.ensureViewModelStore;
                    int iWrite6 = write(i11, recyclerView2.getLastCustomNonConfigurationInstance, recyclerView2.onCreatePanelMenu);
                    if (this.ResultReceiver != 1) {
                        if (iIconCompatParcelizer6 == i9 && iWrite6 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iIconCompatParcelizer6 == i10 && iWrite6 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    MediaBrowserCompatMediaItem(i11, 0);
                    return true;
                }
            }
        }
        return false;
    }

    public final int read(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        boolean z = getintrinsicsizenhjbrc.write;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        if (!z) {
            verticalgradient8a3gb4.getClass();
            return 1;
        }
        int i2 = this.RatingCompat.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (recycler.IconCompatParcelizer(i) != -1) {
            verticalgradient8a3gb4.getClass();
            return 1;
        }
        SentryLogcatAdapter.IconCompatParcelizer("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(int i, int i2) {
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        verticalgradient8a3gb4.RemoteActionCompatParcelizer();
        ((SparseIntArray) verticalgradient8a3gb4.RemoteActionCompatParcelizer).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        boolean z = getintrinsicsizenhjbrc.write;
        SparseIntArray sparseIntArray = this.MediaSessionCompatQueueItem;
        SparseIntArray sparseIntArray2 = this.RatingCompat;
        if (z) {
            int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
            for (int i = 0; i < iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus; i++) {
                getHue0nO6VwU gethue0no6vwu = (getHue0nO6VwU) MediaSessionCompatResultReceiverWrapper(i).getLayoutParams();
                int layoutPosition = gethue0no6vwu.MediaMetadataCompat.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, gethue0no6vwu.write);
                sparseIntArray.put(layoutPosition, gethue0no6vwu.RemoteActionCompatParcelizer);
            }
        }
        super.read(recycler, getintrinsicsizenhjbrc);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final int write(int i) {
        int i2 = this.ResultReceiver;
        RecyclerView recyclerView = this.ensureViewModelStore;
        return i2 == 0 ? write(i, recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu) : IconCompatParcelizer(i, recyclerView.getLastCustomNonConfigurationInstance, recyclerView.onCreatePanelMenu);
    }

    public final int write(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        boolean z = getintrinsicsizenhjbrc.write;
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        if (!z) {
            int i2 = this.ParcelableVolumeInfo;
            verticalgradient8a3gb4.getClass();
            return verticalGradient8A3gB4.IconCompatParcelizer(i, i2);
        }
        int iIconCompatParcelizer = recycler.IconCompatParcelizer(i);
        if (iIconCompatParcelizer != -1) {
            int i3 = this.ParcelableVolumeInfo;
            verticalgradient8a3gb4.getClass();
            return verticalGradient8A3gB4.IconCompatParcelizer(iIconCompatParcelizer, i3);
        }
        SentryLogcatAdapter.IconCompatParcelizer("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write() {
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        verticalgradient8a3gb4.RemoteActionCompatParcelizer();
        ((SparseIntArray) verticalgradient8a3gb4.RemoteActionCompatParcelizer).clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(int i, int i2) {
        verticalGradient8A3gB4 verticalgradient8a3gb4 = this.MediaSessionCompatResultReceiverWrapper;
        verticalgradient8a3gb4.RemoteActionCompatParcelizer();
        ((SparseIntArray) verticalgradient8a3gb4.RemoteActionCompatParcelizer).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int RemoteActionCompatParcelizer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        RemoteActionCompatParcelizer();
        serializer();
        return super.RemoteActionCompatParcelizer(i, recycler, getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getModulate0nO6VwU getmodulate0no6vwu, int i) {
        int i2;
        int iIconCompatParcelizer;
        RemoteActionCompatParcelizer();
        if (getintrinsicsizenhjbrc.serializer() > 0 && !getintrinsicsizenhjbrc.write) {
            boolean z = i == 1;
            int iIconCompatParcelizer2 = IconCompatParcelizer(getmodulate0no6vwu.serializer, recycler, getintrinsicsizenhjbrc);
            if (z) {
                while (iIconCompatParcelizer2 > 0) {
                    int i3 = getmodulate0no6vwu.serializer;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    getmodulate0no6vwu.serializer = i4;
                    iIconCompatParcelizer2 = IconCompatParcelizer(i4, recycler, getintrinsicsizenhjbrc);
                }
            } else {
                int iSerializer = getintrinsicsizenhjbrc.serializer();
                int i5 = getmodulate0no6vwu.serializer;
                while (i5 < iSerializer - 1 && (iIconCompatParcelizer = IconCompatParcelizer((i2 = i5 + 1), recycler, getintrinsicsizenhjbrc)) > iIconCompatParcelizer2) {
                    i5 = i2;
                    iIconCompatParcelizer2 = iIconCompatParcelizer;
                }
                getmodulate0no6vwu.serializer = i5;
            }
        }
        serializer();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        RemoteActionCompatParcelizer();
        serializer();
        return super.serializer(i, recycler, getintrinsicsizenhjbrc);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void write(boolean z) {
        if (!z) {
            super.write(false);
        } else {
            IBraze$$ExternalSyntheticBUOutline0.m("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.RemoteActionCompatParcelizer = false;
        this.ParcelableVolumeInfo = -1;
        this.RatingCompat = new SparseIntArray();
        this.MediaSessionCompatQueueItem = new SparseIntArray();
        this.MediaSessionCompatResultReceiverWrapper = new verticalGradient8A3gB4(3);
        this.IconCompatParcelizer = new Rect();
        this.MediaDescriptionCompat = -1;
        this.MediaMetadataCompat = -1;
        this.serializer = -1;
        serializer(RecyclerView.LayoutManager.read(context, attributeSet, i, i2).RemoteActionCompatParcelizer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void IconCompatParcelizer(Rect rect, int i, int i2) {
        int iIconCompatParcelizer;
        int iIconCompatParcelizer2;
        if (this.write == null) {
            super.IconCompatParcelizer(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.ResultReceiver == 1) {
            int iHeight = rect.height();
            RecyclerView recyclerView = this.ensureViewModelStore;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            iIconCompatParcelizer2 = RecyclerView.LayoutManager.IconCompatParcelizer(i2, iHeight + paddingBottom, recyclerView.getMinimumHeight());
            int[] iArr = this.write;
            iIconCompatParcelizer = RecyclerView.LayoutManager.IconCompatParcelizer(i, iArr[iArr.length - 1] + paddingRight, this.ensureViewModelStore.getMinimumWidth());
        } else {
            int iWidth = rect.width();
            RecyclerView recyclerView2 = this.ensureViewModelStore;
            WeakHashMap weakHashMap2 = FocusPropertiesNode.RatingCompat;
            iIconCompatParcelizer = RecyclerView.LayoutManager.IconCompatParcelizer(i, iWidth + paddingRight, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.write;
            iIconCompatParcelizer2 = RecyclerView.LayoutManager.IconCompatParcelizer(i2, iArr2[iArr2.length - 1] + paddingBottom, this.ensureViewModelStore.getMinimumHeight());
        }
        this.ensureViewModelStore.setMeasuredDimension(iIconCompatParcelizer, iIconCompatParcelizer2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (this.ResultReceiver == 0) {
            return Math.min(this.ParcelableVolumeInfo, ResultReceiver());
        }
        if (getintrinsicsizenhjbrc.serializer() < 1) {
            return 0;
        }
        return write(getintrinsicsizenhjbrc.serializer() - 1, recycler, getintrinsicsizenhjbrc) + 1;
    }

    public final void RemoteActionCompatParcelizer(View view, int i, boolean z) {
        int iWrite;
        int iWrite2;
        getHue0nO6VwU gethue0no6vwu = (getHue0nO6VwU) view.getLayoutParams();
        Rect rect = gethue0no6vwu.serializer;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) gethue0no6vwu).topMargin + ((ViewGroup.MarginLayoutParams) gethue0no6vwu).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) gethue0no6vwu).leftMargin + ((ViewGroup.MarginLayoutParams) gethue0no6vwu).rightMargin;
        int iSerializer = serializer(gethue0no6vwu.RemoteActionCompatParcelizer, gethue0no6vwu.write);
        if (this.ResultReceiver == 1) {
            iWrite2 = RecyclerView.LayoutManager.write(iSerializer, i, i3, ((ViewGroup.MarginLayoutParams) gethue0no6vwu).width, false);
            iWrite = RecyclerView.LayoutManager.write(this.ComponentActivity.MediaDescriptionCompat(), this.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ, i2, ((ViewGroup.MarginLayoutParams) gethue0no6vwu).height, true);
        } else {
            int iWrite3 = RecyclerView.LayoutManager.write(iSerializer, i, i2, ((ViewGroup.MarginLayoutParams) gethue0no6vwu).height, false);
            int iWrite4 = RecyclerView.LayoutManager.write(this.ComponentActivity.MediaDescriptionCompat(), this.getSavedStateRegistryControllerannotations, i3, ((ViewGroup.MarginLayoutParams) gethue0no6vwu).width, true);
            iWrite = iWrite3;
            iWrite2 = iWrite4;
        }
        BlockGraphicsLayerElement blockGraphicsLayerElement = (BlockGraphicsLayerElement) view.getLayoutParams();
        if (z ? serializer(view, iWrite2, iWrite, blockGraphicsLayerElement) : RemoteActionCompatParcelizer(view, iWrite2, iWrite, blockGraphicsLayerElement)) {
            view.measure(iWrite2, iWrite);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void RemoteActionCompatParcelizer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        View viewMediaBrowserCompatMediaItem;
        super.RemoteActionCompatParcelizer(getintrinsicsizenhjbrc);
        this.RemoteActionCompatParcelizer = false;
        int i = this.MediaDescriptionCompat;
        if (i == -1 || (viewMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(i)) == null) {
            return;
        }
        viewMediaBrowserCompatMediaItem.sendAccessibilityEvent(67108864);
        this.MediaDescriptionCompat = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean q_() {
        return this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null && !this.RemoteActionCompatParcelizer;
    }

    public final HashSet read(int i) {
        return RemoteActionCompatParcelizer(IconCompatParcelizer(i), i);
    }

    public final void serializer() {
        View[] viewArr = this.MediaBrowserCompatMediaItem;
        if (viewArr == null || viewArr.length != this.ParcelableVolumeInfo) {
            this.MediaBrowserCompatMediaItem = new View[this.ParcelableVolumeInfo];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void serializer(getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getSrc0nO6VwU getsrc0no6vwu, isActive isactive) {
        int i;
        int i2 = this.ParcelableVolumeInfo;
        for (int i3 = 0; i3 < this.ParcelableVolumeInfo && (i = getsrc0no6vwu.serializer) >= 0 && i < getintrinsicsizenhjbrc.serializer() && i2 > 0; i3++) {
            isactive.read(getsrc0no6vwu.serializer, Math.max(0, getsrc0no6vwu.MediaSessionCompatResultReceiverWrapper));
            this.MediaSessionCompatResultReceiverWrapper.getClass();
            i2--;
            getsrc0no6vwu.serializer += getsrc0no6vwu.read;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void write(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof getHue0nO6VwU)) {
            IconCompatParcelizer(view, focusRestorerKtsaveFocusedChild11);
            return;
        }
        getHue0nO6VwU gethue0no6vwu = (getHue0nO6VwU) layoutParams;
        int iWrite = write(gethue0no6vwu.MediaMetadataCompat.getLayoutPosition(), recycler, getintrinsicsizenhjbrc);
        int i = this.ResultReceiver;
        int i2 = gethue0no6vwu.RemoteActionCompatParcelizer;
        int i3 = gethue0no6vwu.write;
        if (i == 0) {
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(i2, i3, iWrite, 1, false));
        } else {
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(iWrite, 1, i2, i3, false));
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int paddingBottom;
        int paddingTop;
        if (this.ResultReceiver == 1) {
            paddingBottom = this.menuHostHelperlambda0 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        RemoteActionCompatParcelizer(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void read(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.read(recycler, getintrinsicsizenhjbrc, focusRestorerKtsaveFocusedChild11);
        focusRestorerKtsaveFocusedChild11.read(GridView.class.getName());
        RecyclerView.Adapter adapter = this.ensureViewModelStore.MediaSessionCompatResultReceiverWrapper;
        if (adapter == null || adapter.getItemCount() <= 1) {
            return;
        }
        focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaSessionCompatResultReceiverWrapper);
    }

    public final int serializer(int i, int i2) {
        if (this.ResultReceiver != 1 || !MediaSessionCompatToken()) {
            int[] iArr = this.write;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.write;
        int i3 = this.ParcelableVolumeInfo - i;
        return iArr2[i3] - iArr2[i3 - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int serializer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        if (this.ResultReceiver == 1) {
            return Math.min(this.ParcelableVolumeInfo, ResultReceiver());
        }
        if (getintrinsicsizenhjbrc.serializer() < 1) {
            return 0;
        }
        return write(getintrinsicsizenhjbrc.serializer() - 1, recycler, getintrinsicsizenhjbrc) + 1;
    }

    public final void serializer(int i) {
        if (i == this.ParcelableVolumeInfo) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        if (i < 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.ParcelableVolumeInfo = i;
        this.MediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer();
        r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View write(View view, int i, RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc) {
        View viewFindContainingItemView;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i2;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
        View view2;
        int i3;
        int i4;
        RecyclerView.Recycler recycler2 = recycler;
        getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc2 = getintrinsicsizenhjbrc;
        RecyclerView recyclerView = this.ensureViewModelStore;
        View view3 = null;
        if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || ((ArrayList) this.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.read).contains(viewFindContainingItemView)) {
            viewFindContainingItemView = null;
        }
        if (viewFindContainingItemView != null) {
            getHue0nO6VwU gethue0no6vwu = (getHue0nO6VwU) viewFindContainingItemView.getLayoutParams();
            int i5 = gethue0no6vwu.RemoteActionCompatParcelizer;
            int i6 = gethue0no6vwu.write + i5;
            if (super.write(view, i, recycler, getintrinsicsizenhjbrc) != null) {
                if ((MediaDescriptionCompat(i) == 1) != this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1;
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = -1;
                    i2 = -1;
                } else {
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
                    i2 = 1;
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = 0;
                }
                boolean z = this.ResultReceiver == 1 && MediaSessionCompatToken();
                int iWrite = write(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2, recycler2, getintrinsicsizenhjbrc2);
                int i7 = -1;
                int i8 = -1;
                int i9 = i2;
                int iMin = 0;
                int iMin2 = 0;
                int i10 = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
                View view4 = null;
                while (i10 != iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                    int i11 = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    int iWrite2 = write(i10, recycler2, getintrinsicsizenhjbrc2);
                    View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(i10);
                    if (viewMediaSessionCompatResultReceiverWrapper == viewFindContainingItemView) {
                        break;
                    }
                    if (!viewMediaSessionCompatResultReceiverWrapper.hasFocusable() || iWrite2 == iWrite) {
                        getHue0nO6VwU gethue0no6vwu2 = (getHue0nO6VwU) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams();
                        int i12 = gethue0no6vwu2.RemoteActionCompatParcelizer;
                        view2 = viewFindContainingItemView;
                        int i13 = gethue0no6vwu2.write + i12;
                        if (viewMediaSessionCompatResultReceiverWrapper.hasFocusable() && i12 == i5 && i13 == i6) {
                            return viewMediaSessionCompatResultReceiverWrapper;
                        }
                        if (!(viewMediaSessionCompatResultReceiverWrapper.hasFocusable() && view3 == null) && (viewMediaSessionCompatResultReceiverWrapper.hasFocusable() || view4 != null)) {
                            i3 = iWrite;
                            int iMin3 = Math.min(i13, i6) - Math.max(i12, i5);
                            if (viewMediaSessionCompatResultReceiverWrapper.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                        if (z == (i12 > i8)) {
                                        }
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view3 == null) {
                                i4 = iMin;
                                if (!this.accessensureViewModelStore.read(viewMediaSessionCompatResultReceiverWrapper) || !this.addObserverForBackInvokerlambda0.read(viewMediaSessionCompatResultReceiverWrapper)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i12 > i7)) {
                                            }
                                        }
                                    }
                                    i10 += i9;
                                    recycler2 = recycler;
                                    getintrinsicsizenhjbrc2 = getintrinsicsizenhjbrc;
                                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i11;
                                    viewFindContainingItemView = view2;
                                    iWrite = i3;
                                }
                            } else {
                                i4 = iMin;
                            }
                        } else {
                            i4 = iMin;
                            i3 = iWrite;
                        }
                        boolean zHasFocusable = viewMediaSessionCompatResultReceiverWrapper.hasFocusable();
                        int i14 = gethue0no6vwu2.RemoteActionCompatParcelizer;
                        if (zHasFocusable) {
                            iMin = Math.min(i13, i6) - Math.max(i12, i5);
                            view3 = viewMediaSessionCompatResultReceiverWrapper;
                            i8 = i14;
                        } else {
                            iMin2 = Math.min(i13, i6) - Math.max(i12, i5);
                            view4 = viewMediaSessionCompatResultReceiverWrapper;
                            i7 = i14;
                        }
                        i10 += i9;
                        recycler2 = recycler;
                        getintrinsicsizenhjbrc2 = getintrinsicsizenhjbrc;
                        iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i11;
                        viewFindContainingItemView = view2;
                        iWrite = i3;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewFindContainingItemView;
                        i4 = iMin;
                        i3 = iWrite;
                    }
                    iMin = i4;
                    i10 += i9;
                    recycler2 = recycler;
                    getintrinsicsizenhjbrc2 = getintrinsicsizenhjbrc;
                    iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = i11;
                    viewFindContainingItemView = view2;
                    iWrite = i3;
                }
                return view3 != null ? view3 : view4;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View RemoteActionCompatParcelizer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, boolean z, boolean z2) {
        int i;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i2;
        int iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus();
        if (z2) {
            i = -1;
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() - 1;
            i2 = -1;
        } else {
            i = iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus2;
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
            i2 = 1;
        }
        int iSerializer = getintrinsicsizenhjbrc.serializer();
        MediaSessionCompatQueueItem();
        int iIconCompatParcelizer = this.ComponentActivity.IconCompatParcelizer();
        int iWrite = this.ComponentActivity.write();
        View view = null;
        View view2 = null;
        while (iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != i) {
            View viewMediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
            int iRemoteActionCompatParcelizer = RecyclerView.LayoutManager.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper);
            if (iRemoteActionCompatParcelizer >= 0 && iRemoteActionCompatParcelizer < iSerializer && IconCompatParcelizer(iRemoteActionCompatParcelizer, recycler, getintrinsicsizenhjbrc) == 0) {
                if (((BlockGraphicsLayerElement) viewMediaSessionCompatResultReceiverWrapper.getLayoutParams()).MediaMetadataCompat.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewMediaSessionCompatResultReceiverWrapper;
                    }
                } else {
                    if (this.ComponentActivity.RemoteActionCompatParcelizer(viewMediaSessionCompatResultReceiverWrapper) < iWrite && this.ComponentActivity.write(viewMediaSessionCompatResultReceiverWrapper) >= iIconCompatParcelizer) {
                        return viewMediaSessionCompatResultReceiverWrapper;
                    }
                    if (view == null) {
                        view = viewMediaSessionCompatResultReceiverWrapper;
                    }
                }
            }
            iR8lambda7aWCLmlNPTirEoC8eOYg0rEvmus += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement IconCompatParcelizer() {
        return this.ResultReceiver == 0 ? new getHue0nO6VwU(-2, -1) : new getHue0nO6VwU(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement read(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            getHue0nO6VwU gethue0no6vwu = new getHue0nO6VwU((ViewGroup.MarginLayoutParams) layoutParams);
            gethue0no6vwu.RemoteActionCompatParcelizer = -1;
            gethue0no6vwu.write = 0;
            return gethue0no6vwu;
        }
        getHue0nO6VwU gethue0no6vwu2 = new getHue0nO6VwU(layoutParams);
        gethue0no6vwu2.RemoteActionCompatParcelizer = -1;
        gethue0no6vwu2.write = 0;
        return gethue0no6vwu2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void serializer(RecyclerView.Recycler recycler, getIntrinsicSizeNHjbRc getintrinsicsizenhjbrc, getSrc0nO6VwU getsrc0no6vwu, getSaturation0nO6VwU getsaturation0no6vwu) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iSerializer;
        int paddingTop;
        int iSerializer2;
        int iWrite;
        int iWrite2;
        boolean z;
        int i6;
        View view;
        getSoftlight0nO6VwU getsoftlight0no6vwu = this.ComponentActivity;
        if (getsoftlight0no6vwu.read != 0) {
            i = getsoftlight0no6vwu.IconCompatParcelizer.getSavedStateRegistryControllerannotations;
        } else {
            i = getsoftlight0no6vwu.IconCompatParcelizer.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        }
        boolean z2 = i != 1073741824;
        int i7 = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus() > 0 ? this.write[this.ParcelableVolumeInfo] : 0;
        if (z2) {
            RemoteActionCompatParcelizer();
        }
        boolean z3 = getsrc0no6vwu.read == 1;
        int iIconCompatParcelizer = this.ParcelableVolumeInfo;
        if (!z3) {
            iIconCompatParcelizer = IconCompatParcelizer(getsrc0no6vwu.serializer, recycler, getintrinsicsizenhjbrc) + read(getsrc0no6vwu.serializer, recycler, getintrinsicsizenhjbrc);
        }
        int i8 = 0;
        while (i8 < this.ParcelableVolumeInfo && (i6 = getsrc0no6vwu.serializer) >= 0 && i6 < getintrinsicsizenhjbrc.serializer() && iIconCompatParcelizer > 0) {
            int i9 = getsrc0no6vwu.serializer;
            int i10 = read(i9, recycler, getintrinsicsizenhjbrc);
            if (i10 > this.ParcelableVolumeInfo) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(af$$ExternalSyntheticOutline0.m(this.ParcelableVolumeInfo, " spans.", m1$$ExternalSyntheticOutline0.m(i9, i10, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
                return;
            }
            iIconCompatParcelizer -= i10;
            if (iIconCompatParcelizer < 0 || (view = getsrc0no6vwu.read(recycler)) == null) {
                break;
            }
            this.MediaBrowserCompatMediaItem[i8] = view;
            i8++;
        }
        if (i8 == 0) {
            getsaturation0no6vwu.read = true;
            return;
        }
        if (z3) {
            i4 = 1;
            i3 = i8;
            i2 = 0;
        } else {
            i2 = i8 - 1;
            i3 = -1;
            i4 = -1;
        }
        int i11 = 0;
        while (i2 != i3) {
            View view2 = this.MediaBrowserCompatMediaItem[i2];
            getHue0nO6VwU gethue0no6vwu = (getHue0nO6VwU) view2.getLayoutParams();
            int i12 = read(RecyclerView.LayoutManager.RemoteActionCompatParcelizer(view2), recycler, getintrinsicsizenhjbrc);
            gethue0no6vwu.write = i12;
            gethue0no6vwu.RemoteActionCompatParcelizer = i11;
            i11 += i12;
            i2 += i4;
        }
        float f = 0.0f;
        int i13 = 0;
        for (int i14 = 0; i14 < i8; i14++) {
            View view3 = this.MediaBrowserCompatMediaItem[i14];
            if (getsrc0no6vwu.PlaybackStateCompatCustomAction != null) {
                z = false;
                if (z3) {
                    addViewInt(view3, -1, true);
                } else {
                    addViewInt(view3, 0, true);
                }
            } else if (z3) {
                z = false;
                addViewInt(view3, -1, false);
            } else {
                z = false;
                addViewInt(view3, 0, false);
            }
            serializer(view3, this.IconCompatParcelizer);
            RemoteActionCompatParcelizer(view3, i, z);
            int iIconCompatParcelizer2 = this.ComponentActivity.IconCompatParcelizer(view3);
            if (iIconCompatParcelizer2 > i13) {
                i13 = iIconCompatParcelizer2;
            }
            float fSerializer = (this.ComponentActivity.serializer(view3) * 1.0f) / ((getHue0nO6VwU) view3.getLayoutParams()).write;
            if (fSerializer > f) {
                f = fSerializer;
            }
        }
        if (z2) {
            RemoteActionCompatParcelizer(Math.max(Math.round(f * this.ParcelableVolumeInfo), i7));
            i13 = 0;
            for (int i15 = 0; i15 < i8; i15++) {
                View view4 = this.MediaBrowserCompatMediaItem[i15];
                RemoteActionCompatParcelizer(view4, 1073741824, true);
                int iIconCompatParcelizer3 = this.ComponentActivity.IconCompatParcelizer(view4);
                if (iIconCompatParcelizer3 > i13) {
                    i13 = iIconCompatParcelizer3;
                }
            }
        }
        for (int i16 = 0; i16 < i8; i16++) {
            View view5 = this.MediaBrowserCompatMediaItem[i16];
            if (this.ComponentActivity.IconCompatParcelizer(view5) != i13) {
                getHue0nO6VwU gethue0no6vwu2 = (getHue0nO6VwU) view5.getLayoutParams();
                Rect rect = gethue0no6vwu2.serializer;
                int i17 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) gethue0no6vwu2).topMargin + ((ViewGroup.MarginLayoutParams) gethue0no6vwu2).bottomMargin;
                int i18 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) gethue0no6vwu2).leftMargin + ((ViewGroup.MarginLayoutParams) gethue0no6vwu2).rightMargin;
                int iSerializer3 = serializer(gethue0no6vwu2.RemoteActionCompatParcelizer, gethue0no6vwu2.write);
                if (this.ResultReceiver == 1) {
                    iWrite2 = RecyclerView.LayoutManager.write(iSerializer3, 1073741824, i18, ((ViewGroup.MarginLayoutParams) gethue0no6vwu2).width, false);
                    iWrite = View.MeasureSpec.makeMeasureSpec(i13 - i17, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - i18, 1073741824);
                    iWrite = RecyclerView.LayoutManager.write(iSerializer3, 1073741824, i17, ((ViewGroup.MarginLayoutParams) gethue0no6vwu2).height, false);
                    iWrite2 = iMakeMeasureSpec;
                }
                if (serializer(view5, iWrite2, iWrite, (BlockGraphicsLayerElement) view5.getLayoutParams())) {
                    view5.measure(iWrite2, iWrite);
                }
            }
        }
        getsaturation0no6vwu.RemoteActionCompatParcelizer = i13;
        int i19 = this.ResultReceiver;
        int i20 = getsrc0no6vwu.MediaSessionCompatQueueItem;
        int iSerializer4 = getsrc0no6vwu.MediaMetadataCompat;
        if (i19 != 1) {
            if (i20 == -1) {
                i5 = iSerializer4 - i13;
            } else {
                i5 = iSerializer4;
                iSerializer4 = i13 + iSerializer4;
            }
            iSerializer = i5;
            paddingTop = 0;
            iSerializer2 = iSerializer4;
            iSerializer4 = 0;
        } else if (i20 == -1) {
            paddingTop = iSerializer4 - i13;
            iSerializer2 = 0;
            iSerializer = 0;
        } else {
            iSerializer = 0;
            paddingTop = iSerializer4;
            iSerializer4 += i13;
            iSerializer2 = 0;
        }
        int i21 = 0;
        while (true) {
            View[] viewArr = this.MediaBrowserCompatMediaItem;
            if (i21 < i8) {
                View view6 = viewArr[i21];
                getHue0nO6VwU gethue0no6vwu3 = (getHue0nO6VwU) view6.getLayoutParams();
                if (this.ResultReceiver == 1) {
                    if (MediaSessionCompatToken()) {
                        iSerializer2 = getPaddingLeft() + this.write[this.ParcelableVolumeInfo - gethue0no6vwu3.RemoteActionCompatParcelizer];
                        iSerializer = iSerializer2 - this.ComponentActivity.serializer(view6);
                    } else {
                        int paddingLeft = getPaddingLeft() + this.write[gethue0no6vwu3.RemoteActionCompatParcelizer];
                        iSerializer = paddingLeft;
                        iSerializer2 = this.ComponentActivity.serializer(view6) + paddingLeft;
                    }
                } else {
                    paddingTop = getPaddingTop() + this.write[gethue0no6vwu3.RemoteActionCompatParcelizer];
                    iSerializer4 = this.ComponentActivity.serializer(view6) + paddingTop;
                }
                RecyclerView.LayoutManager.write(view6, iSerializer, paddingTop, iSerializer2, iSerializer4);
                if (gethue0no6vwu3.MediaMetadataCompat.isRemoved() || gethue0no6vwu3.MediaMetadataCompat.isUpdated()) {
                    getsaturation0no6vwu.serializer = true;
                }
                getsaturation0no6vwu.write = view6.hasFocusable() | getsaturation0no6vwu.write;
                i21++;
            } else {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final BlockGraphicsLayerElement generateLayoutParams(Context context, AttributeSet attributeSet) {
        getHue0nO6VwU gethue0no6vwu = new getHue0nO6VwU(context, attributeSet);
        gethue0no6vwu.RemoteActionCompatParcelizer = -1;
        gethue0no6vwu.write = 0;
        return gethue0no6vwu;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.RemoteActionCompatParcelizer = false;
        this.ParcelableVolumeInfo = -1;
        this.RatingCompat = new SparseIntArray();
        this.MediaSessionCompatQueueItem = new SparseIntArray();
        this.MediaSessionCompatResultReceiverWrapper = new verticalGradient8A3gB4(3);
        this.IconCompatParcelizer = new Rect();
        this.MediaDescriptionCompat = -1;
        this.MediaMetadataCompat = -1;
        this.serializer = -1;
        serializer(i);
    }
}
