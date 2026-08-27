package o;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.tukaani.xz.delta.DeltaDecoder;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetMediaRewindcp {
    public long[] IconCompatParcelizer;
    public int[] RemoteActionCompatParcelizer;
    public long[] read;
    public boolean[] serializer;
    public final accessgetMediaSkipForwardcp write;

    public static ArrayList read(List list, int i, int i2) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = new accessgetMediaSkipBackwardcp();
        accessgetmediaskipbackwardcp.write = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(accessgetmediaskipbackwardcp);
            }
            arrayList.add((accessgetMediaSkipBackwardcp) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(accessgetmediaskipbackwardcp);
            }
        }
        return arrayList;
    }

    public final int IconCompatParcelizer(int i, FlexItem flexItem, int i2) {
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        int paddingLeft = accessgetmediaskipforwardcp.getPaddingLeft();
        int paddingRight = accessgetmediaskipforwardcp.getPaddingRight();
        int iSerializer = accessgetmediaskipforwardcp.serializer(i, paddingRight + paddingLeft + flexItem.MediaSessionCompatQueueItem() + flexItem.MediaMetadataCompat() + i2, flexItem.MediaSessionCompatToken());
        int size = View.MeasureSpec.getSize(iSerializer);
        if (size > flexItem.ParcelableVolumeInfo()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.ParcelableVolumeInfo(), View.MeasureSpec.getMode(iSerializer));
        }
        return size < flexItem.MediaSessionCompatResultReceiverWrapper() ? View.MeasureSpec.makeMeasureSpec(flexItem.MediaSessionCompatResultReceiverWrapper(), View.MeasureSpec.getMode(iSerializer)) : iSerializer;
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        int flexItemCount = accessgetmediaskipforwardcp.getFlexItemCount();
        boolean[] zArr = this.serializer;
        if (zArr == null) {
            this.serializer = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.serializer = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= accessgetmediaskipforwardcp.getFlexItemCount()) {
            return;
        }
        int flexDirection = accessgetmediaskipforwardcp.getFlexDirection();
        int flexDirection2 = accessgetmediaskipforwardcp.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = accessgetmediaskipforwardcp.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = accessgetmediaskipforwardcp.getPaddingLeft();
            paddingRight = accessgetmediaskipforwardcp.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = accessgetmediaskipforwardcp.getLargestMainSize();
            }
            paddingLeft = accessgetmediaskipforwardcp.getPaddingTop();
            paddingRight = accessgetmediaskipforwardcp.getPaddingBottom();
        }
        int i4 = paddingRight + paddingLeft;
        int[] iArr = this.RemoteActionCompatParcelizer;
        List flexLinesInternal = accessgetmediaskipforwardcp.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) flexLinesInternal.get(i5);
            int i6 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
            if (i6 < size && accessgetmediaskipbackwardcp.read) {
                RemoteActionCompatParcelizer(i, i2, accessgetmediaskipbackwardcp, size, i4, false);
            } else if (i6 > size && accessgetmediaskipbackwardcp.RemoteActionCompatParcelizer) {
                read(i, i2, accessgetmediaskipbackwardcp, size, i4, false);
            }
        }
    }

    public final int serializer(int i, FlexItem flexItem, int i2) {
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        int paddingTop = accessgetmediaskipforwardcp.getPaddingTop();
        int paddingBottom = accessgetmediaskipforwardcp.getPaddingBottom();
        int i3 = accessgetmediaskipforwardcp.read(i, paddingBottom + paddingTop + flexItem.MediaDescriptionCompat() + flexItem.RatingCompat() + i2, flexItem.serializer());
        int size = View.MeasureSpec.getSize(i3);
        if (size > flexItem.MediaBrowserCompatMediaItem()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.MediaBrowserCompatMediaItem(), View.MeasureSpec.getMode(i3));
        }
        return size < flexItem.PlaybackStateCompatCustomAction() ? View.MeasureSpec.makeMeasureSpec(flexItem.PlaybackStateCompatCustomAction(), View.MeasureSpec.getMode(i3)) : i3;
    }

    public final void serializer(int i, int i2, int i3) {
        int mode;
        int size;
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        int flexDirection = accessgetmediaskipforwardcp.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        } else if (flexDirection != 2 && flexDirection != 3) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<accessgetMediaSkipBackwardcp> flexLinesInternal = accessgetmediaskipforwardcp.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = accessgetmediaskipforwardcp.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((accessgetMediaSkipBackwardcp) flexLinesInternal.get(0)).write = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = accessgetmediaskipforwardcp.getAlignContent();
                if (alignContent == 1) {
                    accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = new accessgetMediaSkipBackwardcp();
                    accessgetmediaskipbackwardcp.write = size - sumOfCrossSize;
                    flexLinesInternal.add(0, accessgetmediaskipbackwardcp);
                    return;
                }
                if (alignContent == 2) {
                    accessgetmediaskipforwardcp.setFlexLines(read(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size3) {
                        arrayList.add((accessgetMediaSkipBackwardcp) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp2 = new accessgetMediaSkipBackwardcp();
                            if (i4 == flexLinesInternal.size() - 2) {
                                accessgetmediaskipbackwardcp2.write = Math.round(f + size2);
                                f = 0.0f;
                            } else {
                                accessgetmediaskipbackwardcp2.write = Math.round(size2);
                            }
                            int i5 = accessgetmediaskipbackwardcp2.write;
                            float f2 = (size2 - i5) + f;
                            if (f2 > 1.0f) {
                                accessgetmediaskipbackwardcp2.write = i5 + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                accessgetmediaskipbackwardcp2.write = i5 - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(accessgetmediaskipbackwardcp2);
                        }
                        i4++;
                    }
                    accessgetmediaskipforwardcp.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        accessgetmediaskipforwardcp.setFlexLines(read(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp3 = new accessgetMediaSkipBackwardcp();
                    accessgetmediaskipbackwardcp3.write = size4;
                    for (accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp4 : flexLinesInternal) {
                        arrayList2.add(accessgetmediaskipbackwardcp3);
                        arrayList2.add(accessgetmediaskipbackwardcp4);
                        arrayList2.add(accessgetmediaskipbackwardcp3);
                    }
                    accessgetmediaskipforwardcp.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size6) {
                        accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp5 = (accessgetMediaSkipBackwardcp) flexLinesInternal.get(i4);
                        float f4 = accessgetmediaskipbackwardcp5.write + size5;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(f4);
                        float f5 = (f4 - iRound) + f3;
                        if (f5 > 1.0f) {
                            iRound++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        accessgetmediaskipbackwardcp5.write = iRound;
                        i4++;
                    }
                }
            }
        }
    }

    public final void serializer(List list, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp, int i, int i2) {
        accessgetmediaskipbackwardcp.MediaSessionCompatToken = i2;
        this.write.write(accessgetmediaskipbackwardcp);
        accessgetmediaskipbackwardcp.MediaSessionCompatQueueItem = i;
        list.add(accessgetmediaskipbackwardcp);
    }

    public final ArrayList write(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.write.read(i2).getLayoutParams();
            accessgetMediaPreviouscp accessgetmediapreviouscp = new accessgetMediaPreviouscp();
            accessgetmediapreviouscp.write = flexItem.PlaybackStateCompat();
            accessgetmediapreviouscp.RemoteActionCompatParcelizer = i2;
            arrayList.add(accessgetmediapreviouscp);
        }
        return arrayList;
    }

    public final void write(int i, List list) {
        int i2 = this.RemoteActionCompatParcelizer[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.RemoteActionCompatParcelizer;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.read;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public accessgetMediaRewindcp(accessgetMediaSkipForwardcp accessgetmediaskipforwardcp) {
        this.write = accessgetmediaskipforwardcp;
    }

    public static int[] RemoteActionCompatParcelizer(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            accessgetMediaPreviouscp accessgetmediapreviouscp = (accessgetMediaPreviouscp) it.next();
            int i3 = accessgetmediapreviouscp.RemoteActionCompatParcelizer;
            iArr[i2] = i3;
            sparseIntArray.append(i3, accessgetmediapreviouscp.write);
            i2++;
        }
        return iArr;
    }

    public final void IconCompatParcelizer(int i) {
        View viewWrite;
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        if (i >= accessgetmediaskipforwardcp.getFlexItemCount()) {
            return;
        }
        int flexDirection = accessgetmediaskipforwardcp.getFlexDirection();
        if (accessgetmediaskipforwardcp.getAlignItems() == 4) {
            int[] iArr = this.RemoteActionCompatParcelizer;
            List flexLinesInternal = accessgetmediaskipforwardcp.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = (accessgetMediaSkipBackwardcp) flexLinesInternal.get(i2);
                int i3 = accessgetmediaskipbackwardcp.MediaDescriptionCompat;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = accessgetmediaskipbackwardcp.RatingCompat + i4;
                    if (i4 < accessgetmediaskipforwardcp.getFlexItemCount() && (viewWrite = accessgetmediaskipforwardcp.write(i5)) != null && viewWrite.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) viewWrite.getLayoutParams();
                        if (flexItem.read() == -1 || flexItem.read() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(flexDirection, "Invalid flex direction: "));
                                    return;
                                }
                                IconCompatParcelizer(accessgetmediaskipbackwardcp.write, i5, viewWrite);
                            } else {
                                write(accessgetmediaskipbackwardcp.write, i5, viewWrite);
                            }
                        }
                    }
                }
            }
            return;
        }
        for (accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp2 : accessgetmediaskipforwardcp.getFlexLinesInternal()) {
            for (Integer num : accessgetmediaskipbackwardcp2.MediaBrowserCompatMediaItem) {
                View viewWrite2 = accessgetmediaskipforwardcp.write(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(flexDirection, "Invalid flex direction: "));
                        return;
                    }
                    IconCompatParcelizer(accessgetmediaskipbackwardcp2.write, num.intValue(), viewWrite2);
                } else {
                    write(accessgetmediaskipbackwardcp2.write, num.intValue(), viewWrite2);
                }
            }
        }
    }

    public final void IconCompatParcelizer(int i, int i2, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMediaSessionCompatQueueItem = flexItem.MediaSessionCompatQueueItem();
        int iMediaMetadataCompat = flexItem.MediaMetadataCompat();
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        int iMin = Math.min(Math.max(((i - iMediaSessionCompatQueueItem) - iMediaMetadataCompat) - accessgetmediaskipforwardcp.read(view), flexItem.MediaSessionCompatResultReceiverWrapper()), flexItem.ParcelableVolumeInfo());
        long[] jArr = this.IconCompatParcelizer;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        write(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        accessgetmediaskipforwardcp.RemoteActionCompatParcelizer(i2, view);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void IconCompatParcelizer(int i, View view) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.MediaSessionCompatResultReceiverWrapper()) {
            if (measuredWidth > flexItem.ParcelableVolumeInfo()) {
                measuredWidth = flexItem.ParcelableVolumeInfo();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.PlaybackStateCompatCustomAction()) {
                measuredHeight = flexItem.PlaybackStateCompatCustomAction();
            } else if (measuredHeight > flexItem.MediaBrowserCompatMediaItem()) {
                measuredHeight = flexItem.MediaBrowserCompatMediaItem();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                write(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.write.RemoteActionCompatParcelizer(i, view);
            }
        }
        measuredWidth = flexItem.MediaSessionCompatResultReceiverWrapper();
        z = true;
        if (measuredHeight < flexItem.PlaybackStateCompatCustomAction()) {
            measuredHeight = flexItem.PlaybackStateCompatCustomAction();
        } else if (measuredHeight > flexItem.MediaBrowserCompatMediaItem()) {
            measuredHeight = flexItem.MediaBrowserCompatMediaItem();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            write(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.write.RemoteActionCompatParcelizer(i, view);
        }
    }

    public final void read(View view, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.write.getAlignItems();
        if (flexItem.read() != -1) {
            alignItems = flexItem.read();
        }
        int i5 = accessgetmediaskipbackwardcp.write;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (z) {
                    int measuredWidth = view.getMeasuredWidth();
                    view.layout(measuredWidth + (i - i5) + flexItem.MediaSessionCompatQueueItem(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.MediaSessionCompatQueueItem(), i4);
                    return;
                }
                int measuredWidth2 = view.getMeasuredWidth();
                view.layout(((i + i5) - measuredWidth2) - flexItem.MediaMetadataCompat(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.MediaMetadataCompat(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth3 = view.getMeasuredWidth();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - measuredWidth3)) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.MediaMetadataCompat(), i2, i3 - flexItem.MediaMetadataCompat(), i4);
        } else {
            view.layout(i + flexItem.MediaSessionCompatQueueItem(), i2, i3 + flexItem.MediaSessionCompatQueueItem(), i4);
        }
    }

    public final void serializer(View view, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        int alignItems = accessgetmediaskipforwardcp.getAlignItems();
        if (flexItem.read() != -1) {
            alignItems = flexItem.read();
        }
        int i5 = accessgetmediaskipbackwardcp.write;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (accessgetmediaskipforwardcp.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    int measuredHeight = view.getMeasuredHeight();
                    view.layout(i, (i6 - measuredHeight) - flexItem.RatingCompat(), i3, i6 - flexItem.RatingCompat());
                    return;
                }
                int measuredHeight2 = view.getMeasuredHeight();
                view.layout(i, measuredHeight2 + (i2 - i5) + flexItem.MediaDescriptionCompat(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.MediaDescriptionCompat());
                return;
            }
            if (alignItems == 2) {
                int measuredHeight3 = view.getMeasuredHeight();
                int iMediaDescriptionCompat = (((i5 - measuredHeight3) + flexItem.MediaDescriptionCompat()) - flexItem.RatingCompat()) / 2;
                if (accessgetmediaskipforwardcp.getFlexWrap() != 2) {
                    int i7 = i2 + iMediaDescriptionCompat;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - iMediaDescriptionCompat;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = accessgetmediaskipforwardcp.getFlexWrap();
                int i9 = accessgetmediaskipbackwardcp.ParcelableVolumeInfo;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), flexItem.MediaDescriptionCompat());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                }
                int measuredHeight4 = view.getMeasuredHeight();
                int iMax2 = Math.max(view.getBaseline() + (i9 - measuredHeight4), flexItem.RatingCompat());
                view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                return;
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (accessgetmediaskipforwardcp.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.MediaDescriptionCompat(), i3, i4 + flexItem.MediaDescriptionCompat());
        } else {
            view.layout(i, i2 - flexItem.RatingCompat(), i3, i4 - flexItem.RatingCompat());
        }
    }

    public final void write(int i, int i2, View view) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iMediaDescriptionCompat = flexItem.MediaDescriptionCompat();
        int iRatingCompat = flexItem.RatingCompat();
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        int iMin = Math.min(Math.max(((i - iMediaDescriptionCompat) - iRatingCompat) - accessgetmediaskipforwardcp.read(view), flexItem.PlaybackStateCompatCustomAction()), flexItem.MediaBrowserCompatMediaItem());
        long[] jArr = this.IconCompatParcelizer;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        write(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        accessgetmediaskipforwardcp.RemoteActionCompatParcelizer(i2, view);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        int[] iArr = this.RemoteActionCompatParcelizer;
        if (iArr == null) {
            this.RemoteActionCompatParcelizer = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.RemoteActionCompatParcelizer = Arrays.copyOf(this.RemoteActionCompatParcelizer, Math.max(iArr.length * 2, i));
        }
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp, int i3, int i4, boolean z) {
        int i5;
        int iMax;
        double d;
        double d2;
        float f = accessgetmediaskipbackwardcp.ComponentActivity;
        if (f <= 0.0f || i3 < (i5 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper)) {
            return;
        }
        float f2 = (i3 - i5) / f;
        accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i4 + accessgetmediaskipbackwardcp.IconCompatParcelizer;
        if (!z) {
            accessgetmediaskipbackwardcp.write = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f3 = 0.0f;
        while (i6 < accessgetmediaskipbackwardcp.MediaDescriptionCompat) {
            int i8 = accessgetmediaskipbackwardcp.RatingCompat + i6;
            accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
            View viewWrite = accessgetmediaskipforwardcp.write(i8);
            if (viewWrite == null || viewWrite.getVisibility() == 8) {
                i5 = i5;
            } else {
                FlexItem flexItem = (FlexItem) viewWrite.getLayoutParams();
                int flexDirection = accessgetmediaskipforwardcp.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewWrite.getMeasuredHeight();
                    long[] jArr = this.IconCompatParcelizer;
                    if (jArr != null) {
                        measuredHeight = (int) (jArr[i8] >> 32);
                    }
                    int measuredWidth = viewWrite.getMeasuredWidth();
                    long[] jArr2 = this.IconCompatParcelizer;
                    if (jArr2 != null) {
                        measuredWidth = (int) jArr2[i8];
                    }
                    if (!this.serializer[i8] && flexItem.RemoteActionCompatParcelizer() > 0.0f) {
                        float fRemoteActionCompatParcelizer = (flexItem.RemoteActionCompatParcelizer() * f2) + measuredHeight;
                        if (i6 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1) {
                            fRemoteActionCompatParcelizer += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(fRemoteActionCompatParcelizer);
                        if (iRound > flexItem.MediaBrowserCompatMediaItem()) {
                            iRound = flexItem.MediaBrowserCompatMediaItem();
                            this.serializer[i8] = true;
                            accessgetmediaskipbackwardcp.ComponentActivity -= flexItem.RemoteActionCompatParcelizer();
                            z2 = true;
                        } else {
                            float f4 = (fRemoteActionCompatParcelizer - iRound) + f3;
                            double d3 = f4;
                            if (d3 > 1.0d) {
                                iRound++;
                                d2 = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    iRound--;
                                    d2 = d3 + 1.0d;
                                }
                                f3 = f4;
                            }
                            f4 = (float) d2;
                            f3 = f4;
                        }
                        int iIconCompatParcelizer = IconCompatParcelizer(i, flexItem, accessgetmediaskipbackwardcp.MediaSessionCompatToken);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewWrite.measure(iIconCompatParcelizer, iMakeMeasureSpec);
                        measuredWidth = viewWrite.getMeasuredWidth();
                        int measuredHeight2 = viewWrite.getMeasuredHeight();
                        write(i8, iIconCompatParcelizer, iMakeMeasureSpec, viewWrite);
                        accessgetmediaskipforwardcp.RemoteActionCompatParcelizer(i8, viewWrite);
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i7, accessgetmediaskipforwardcp.read(viewWrite) + measuredWidth + flexItem.MediaSessionCompatQueueItem() + flexItem.MediaMetadataCompat());
                    accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = measuredHeight + flexItem.MediaDescriptionCompat() + flexItem.RatingCompat() + accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                } else {
                    int measuredWidth2 = viewWrite.getMeasuredWidth();
                    long[] jArr3 = this.IconCompatParcelizer;
                    if (jArr3 != null) {
                        measuredWidth2 = (int) jArr3[i8];
                    }
                    int measuredHeight3 = viewWrite.getMeasuredHeight();
                    long[] jArr4 = this.IconCompatParcelizer;
                    if (jArr4 != null) {
                        measuredHeight3 = (int) (jArr4[i8] >> 32);
                    }
                    if (!this.serializer[i8] && flexItem.RemoteActionCompatParcelizer() > 0.0f) {
                        float fRemoteActionCompatParcelizer2 = (flexItem.RemoteActionCompatParcelizer() * f2) + measuredWidth2;
                        if (i6 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1) {
                            fRemoteActionCompatParcelizer2 += f3;
                            f3 = 0.0f;
                        }
                        int iRound2 = Math.round(fRemoteActionCompatParcelizer2);
                        if (iRound2 > flexItem.ParcelableVolumeInfo()) {
                            iRound2 = flexItem.ParcelableVolumeInfo();
                            this.serializer[i8] = true;
                            accessgetmediaskipbackwardcp.ComponentActivity -= flexItem.RemoteActionCompatParcelizer();
                            z2 = true;
                        } else {
                            float f5 = (fRemoteActionCompatParcelizer2 - iRound2) + f3;
                            double d4 = f5;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d = d4 + 1.0d;
                                }
                                f3 = f5;
                            }
                            f5 = (float) d;
                            f3 = f5;
                        }
                        int iSerializer = serializer(i2, flexItem, accessgetmediaskipbackwardcp.MediaSessionCompatToken);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewWrite.measure(iMakeMeasureSpec2, iSerializer);
                        int measuredWidth3 = viewWrite.getMeasuredWidth();
                        int measuredHeight4 = viewWrite.getMeasuredHeight();
                        write(i8, iMakeMeasureSpec2, iSerializer, viewWrite);
                        accessgetmediaskipforwardcp.RemoteActionCompatParcelizer(i8, viewWrite);
                        measuredWidth2 = measuredWidth3;
                        measuredHeight3 = measuredHeight4;
                    }
                    int iMax2 = Math.max(i7, accessgetmediaskipforwardcp.read(viewWrite) + measuredHeight3 + flexItem.MediaDescriptionCompat() + flexItem.RatingCompat());
                    accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = measuredWidth2 + flexItem.MediaSessionCompatQueueItem() + flexItem.MediaMetadataCompat() + accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                    iMax = iMax2;
                }
                accessgetmediaskipbackwardcp.write = Math.max(accessgetmediaskipbackwardcp.write, iMax);
                i7 = iMax;
            }
            i6++;
            i5 = i5;
        }
        int i9 = i5;
        if (!z2 || i9 == accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        RemoteActionCompatParcelizer(i, i2, accessgetmediaskipbackwardcp, i3, i4, true);
    }

    public final void read(int i) {
        long[] jArr = this.read;
        if (jArr == null) {
            this.read = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.read = Arrays.copyOf(this.read, Math.max(jArr.length * 2, i));
        }
    }

    public final void read(int i, int i2, accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp, int i3, int i4, boolean z) {
        int iMax;
        int iMediaSessionCompatResultReceiverWrapper;
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp;
        View view;
        int iPlaybackStateCompatCustomAction;
        int i5 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
        float f = accessgetmediaskipbackwardcp.ResultReceiver;
        if (f <= 0.0f || i3 > i5) {
            return;
        }
        float f2 = (i5 - i3) / f;
        accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i4 + accessgetmediaskipbackwardcp.IconCompatParcelizer;
        if (!z) {
            accessgetmediaskipbackwardcp.write = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f3 = 0.0f;
        while (i6 < accessgetmediaskipbackwardcp.MediaDescriptionCompat) {
            int i8 = accessgetmediaskipbackwardcp.RatingCompat + i6;
            accessgetMediaSkipForwardcp accessgetmediaskipforwardcp2 = this.write;
            View viewWrite = accessgetmediaskipforwardcp2.write(i8);
            if (viewWrite == null || viewWrite.getVisibility() == 8) {
                f2 = f2;
                z2 = z2;
            } else {
                FlexItem flexItem = (FlexItem) viewWrite.getLayoutParams();
                int flexDirection = accessgetmediaskipforwardcp2.getFlexDirection();
                if (flexDirection != 0 && flexDirection != 1) {
                    int measuredHeight = viewWrite.getMeasuredHeight();
                    long[] jArr = this.IconCompatParcelizer;
                    if (jArr != null) {
                        measuredHeight = (int) (jArr[i8] >> 32);
                    }
                    int measuredWidth = viewWrite.getMeasuredWidth();
                    long[] jArr2 = this.IconCompatParcelizer;
                    if (jArr2 != null) {
                        measuredWidth = (int) jArr2[i8];
                    }
                    if (this.serializer[i8] || flexItem.write() <= 0.0f) {
                        accessgetmediaskipforwardcp = accessgetmediaskipforwardcp2;
                        view = viewWrite;
                    } else {
                        float fWrite = measuredHeight - (flexItem.write() * f2);
                        if (i6 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1) {
                            fWrite += f3;
                            f3 = 0.0f;
                        }
                        int iRound = Math.round(fWrite);
                        if (iRound < flexItem.PlaybackStateCompatCustomAction()) {
                            iPlaybackStateCompatCustomAction = flexItem.PlaybackStateCompatCustomAction();
                            this.serializer[i8] = true;
                            accessgetmediaskipbackwardcp.ResultReceiver -= flexItem.write();
                            z2 = true;
                        } else {
                            float f4 = (fWrite - iRound) + f3;
                            double d = f4;
                            if (d > 1.0d) {
                                iRound++;
                                f4 -= 1.0f;
                            } else if (d < -1.0d) {
                                iRound--;
                                f4 += 1.0f;
                            }
                            f3 = f4;
                            iPlaybackStateCompatCustomAction = iRound;
                        }
                        int iIconCompatParcelizer = IconCompatParcelizer(i, flexItem, accessgetmediaskipbackwardcp.MediaSessionCompatToken);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iPlaybackStateCompatCustomAction, 1073741824);
                        viewWrite.measure(iIconCompatParcelizer, iMakeMeasureSpec);
                        measuredWidth = viewWrite.getMeasuredWidth();
                        int measuredHeight2 = viewWrite.getMeasuredHeight();
                        write(i8, iIconCompatParcelizer, iMakeMeasureSpec, viewWrite);
                        accessgetmediaskipforwardcp = accessgetmediaskipforwardcp2;
                        accessgetmediaskipforwardcp.RemoteActionCompatParcelizer(i8, viewWrite);
                        view = viewWrite;
                        measuredHeight = measuredHeight2;
                    }
                    iMax = Math.max(i7, accessgetmediaskipforwardcp.read(view) + measuredWidth + flexItem.MediaSessionCompatQueueItem() + flexItem.MediaMetadataCompat());
                    accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = measuredHeight + flexItem.MediaDescriptionCompat() + flexItem.RatingCompat() + accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                    f2 = f2;
                } else {
                    int measuredWidth2 = viewWrite.getMeasuredWidth();
                    long[] jArr3 = this.IconCompatParcelizer;
                    if (jArr3 != null) {
                        measuredWidth2 = (int) jArr3[i8];
                    }
                    int measuredHeight3 = viewWrite.getMeasuredHeight();
                    long[] jArr4 = this.IconCompatParcelizer;
                    if (jArr4 != null) {
                        measuredHeight3 = (int) (jArr4[i8] >> 32);
                    }
                    if (this.serializer[i8] || flexItem.write() <= 0.0f) {
                        f2 = f2;
                        z2 = z2;
                    } else {
                        float fWrite2 = measuredWidth2 - (flexItem.write() * f2);
                        boolean z3 = true;
                        if (i6 == accessgetmediaskipbackwardcp.MediaDescriptionCompat - 1) {
                            fWrite2 += f3;
                            f3 = 0.0f;
                        }
                        int iRound2 = Math.round(fWrite2);
                        if (iRound2 < flexItem.MediaSessionCompatResultReceiverWrapper()) {
                            iMediaSessionCompatResultReceiverWrapper = flexItem.MediaSessionCompatResultReceiverWrapper();
                            this.serializer[i8] = true;
                            accessgetmediaskipbackwardcp.ResultReceiver -= flexItem.write();
                        } else {
                            float f5 = (fWrite2 - iRound2) + f3;
                            boolean z4 = z2;
                            double d2 = f5;
                            if (d2 > 1.0d) {
                                iRound2++;
                                f5 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iRound2--;
                                f5 += 1.0f;
                            }
                            f3 = f5;
                            iMediaSessionCompatResultReceiverWrapper = iRound2;
                            z3 = z4;
                        }
                        int iSerializer = serializer(i2, flexItem, accessgetmediaskipbackwardcp.MediaSessionCompatToken);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMediaSessionCompatResultReceiverWrapper, 1073741824);
                        r11.measure(iMakeMeasureSpec2, iSerializer);
                        measuredWidth2 = r11.getMeasuredWidth();
                        int measuredHeight4 = r11.getMeasuredHeight();
                        write(i8, iMakeMeasureSpec2, iSerializer, r11);
                        accessgetmediaskipforwardcp2.RemoteActionCompatParcelizer(i8, viewWrite);
                        z2 = z3;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, accessgetmediaskipforwardcp2.read(r11) + measuredHeight3 + flexItem.MediaDescriptionCompat() + flexItem.RatingCompat());
                    accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = measuredWidth2 + flexItem.MediaSessionCompatQueueItem() + flexItem.MediaMetadataCompat() + accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                }
                accessgetmediaskipbackwardcp.write = Math.max(accessgetmediaskipbackwardcp.write, iMax);
                i7 = iMax;
            }
            i6++;
            f2 = f2;
        }
        if (!z2 || i5 == accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        read(i, i2, accessgetmediaskipbackwardcp, i3, i4, true);
    }

    public final void serializer(int i) {
        long[] jArr = this.IconCompatParcelizer;
        if (jArr == null) {
            this.IconCompatParcelizer = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.IconCompatParcelizer = Arrays.copyOf(this.IconCompatParcelizer, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01db  */
    public final void read(DeltaDecoder deltaDecoder, int i, int i2, int i3, int i4, int i5, List list) {
        int paddingTop;
        int paddingBottom;
        int paddingStart;
        int paddingEnd;
        int i6;
        int i7;
        int iSerializer;
        int iSerializer2;
        int measuredHeight;
        int iMediaDescriptionCompat;
        int iRatingCompat;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int measuredHeight2;
        int iMediaDescriptionCompat2;
        int iRatingCompat2;
        int measuredWidth;
        int iMediaSessionCompatQueueItem;
        int iMediaMetadataCompat;
        int i13;
        boolean z;
        int minimumHeight;
        int i14;
        accessgetMediaSkipForwardcp accessgetmediaskipforwardcp = this.write;
        boolean z2 = accessgetmediaskipforwardcp.read();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List arrayList = list == null ? new ArrayList() : list;
        deltaDecoder.serializer = arrayList;
        boolean z3 = i5 == -1;
        if (z2) {
            paddingTop = accessgetmediaskipforwardcp.getPaddingStart();
        } else {
            paddingTop = accessgetmediaskipforwardcp.getPaddingTop();
        }
        if (z2) {
            paddingBottom = accessgetmediaskipforwardcp.getPaddingEnd();
        } else {
            paddingBottom = accessgetmediaskipforwardcp.getPaddingBottom();
        }
        if (z2) {
            paddingStart = accessgetmediaskipforwardcp.getPaddingTop();
        } else {
            paddingStart = accessgetmediaskipforwardcp.getPaddingStart();
        }
        if (z2) {
            paddingEnd = accessgetmediaskipforwardcp.getPaddingBottom();
        } else {
            paddingEnd = accessgetmediaskipforwardcp.getPaddingEnd();
        }
        accessgetMediaSkipBackwardcp accessgetmediaskipbackwardcp = new accessgetMediaSkipBackwardcp();
        int i15 = i4;
        accessgetmediaskipbackwardcp.RatingCompat = i15;
        int i16 = paddingTop + paddingBottom;
        accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i16;
        int flexItemCount = accessgetmediaskipforwardcp.getFlexItemCount();
        int i17 = Integer.MIN_VALUE;
        int i18 = 0;
        int i19 = 0;
        int iCombineMeasuredStates = 0;
        while (i15 < flexItemCount) {
            boolean z4 = z3;
            View viewWrite = accessgetmediaskipforwardcp.write(i15);
            if (viewWrite == null) {
                if (i15 == flexItemCount - 1 && accessgetmediaskipbackwardcp.serializer() != 0) {
                    serializer(arrayList, accessgetmediaskipbackwardcp, i15, i19);
                }
                i7 = i18;
            } else {
                i7 = i18;
                if (viewWrite.getVisibility() == 8) {
                    accessgetmediaskipbackwardcp.MediaMetadataCompat++;
                    accessgetmediaskipbackwardcp.MediaDescriptionCompat++;
                    if (i15 == flexItemCount - 1 && accessgetmediaskipbackwardcp.serializer() != 0) {
                        serializer(arrayList, accessgetmediaskipbackwardcp, i15, i19);
                    }
                } else {
                    if (viewWrite instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewWrite;
                        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
                        int iMediaSessionCompatResultReceiverWrapper = flexItem.MediaSessionCompatResultReceiverWrapper();
                        int iPlaybackStateCompatCustomAction = flexItem.PlaybackStateCompatCustomAction();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        if (buttonDrawable == null) {
                            i14 = -1;
                            minimumHeight = 0;
                        } else {
                            minimumHeight = buttonDrawable.getMinimumHeight();
                            i14 = -1;
                        }
                        if (iMediaSessionCompatResultReceiverWrapper == i14) {
                            iMediaSessionCompatResultReceiverWrapper = minimumWidth;
                        }
                        flexItem.serializer(iMediaSessionCompatResultReceiverWrapper);
                        if (iPlaybackStateCompatCustomAction == i14) {
                            iPlaybackStateCompatCustomAction = minimumHeight;
                        }
                        flexItem.read(iPlaybackStateCompatCustomAction);
                    }
                    FlexItem flexItem2 = (FlexItem) viewWrite.getLayoutParams();
                    if (flexItem2.read() == 4) {
                        accessgetmediaskipbackwardcp.MediaBrowserCompatMediaItem.add(Integer.valueOf(i15));
                    }
                    if (z2) {
                        iSerializer = flexItem2.MediaSessionCompatToken();
                    } else {
                        iSerializer = flexItem2.serializer();
                    }
                    if (flexItem2.IconCompatParcelizer() != -1.0f && mode == 1073741824) {
                        iSerializer = Math.round(size * flexItem2.IconCompatParcelizer());
                    }
                    if (z2) {
                        iSerializer2 = accessgetmediaskipforwardcp.serializer(i, flexItem2.MediaSessionCompatQueueItem() + i16 + flexItem2.MediaMetadataCompat(), iSerializer);
                        int i20 = accessgetmediaskipforwardcp.read(i2, paddingStart + paddingEnd + flexItem2.MediaDescriptionCompat() + flexItem2.RatingCompat() + i19, flexItem2.serializer());
                        viewWrite.measure(iSerializer2, i20);
                        write(i15, iSerializer2, i20, viewWrite);
                    } else {
                        int iSerializer3 = accessgetmediaskipforwardcp.serializer(i2, paddingStart + paddingEnd + flexItem2.MediaSessionCompatQueueItem() + flexItem2.MediaMetadataCompat() + i19, flexItem2.MediaSessionCompatToken());
                        iSerializer2 = accessgetmediaskipforwardcp.read(i, flexItem2.MediaDescriptionCompat() + i16 + flexItem2.RatingCompat(), iSerializer);
                        viewWrite.measure(iSerializer3, iSerializer2);
                        write(i15, iSerializer3, iSerializer2, viewWrite);
                    }
                    accessgetmediaskipforwardcp.RemoteActionCompatParcelizer(i15, viewWrite);
                    IconCompatParcelizer(i15, viewWrite);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewWrite.getMeasuredState());
                    int i21 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                    if (z2) {
                        measuredHeight = viewWrite.getMeasuredWidth();
                    } else {
                        measuredHeight = viewWrite.getMeasuredHeight();
                    }
                    if (z2) {
                        iMediaDescriptionCompat = flexItem2.MediaSessionCompatQueueItem();
                    } else {
                        iMediaDescriptionCompat = flexItem2.MediaDescriptionCompat();
                    }
                    if (z2) {
                        iRatingCompat = flexItem2.MediaMetadataCompat();
                    } else {
                        iRatingCompat = flexItem2.RatingCompat();
                    }
                    int i22 = measuredHeight + iMediaDescriptionCompat + iRatingCompat;
                    int size2 = arrayList.size();
                    if (accessgetmediaskipforwardcp.getFlexWrap() != 0) {
                        if (flexItem2.ResultReceiver()) {
                            i8 = mode;
                            i10 = size;
                        } else {
                            if (mode == 0) {
                                i8 = mode;
                            } else {
                                int maxLine = accessgetmediaskipforwardcp.getMaxLine();
                                i8 = mode;
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    i9 = i7;
                                    int iSerializer4 = accessgetmediaskipforwardcp.serializer(i15, i9, viewWrite);
                                    if (iSerializer4 > 0) {
                                        i22 += iSerializer4;
                                    }
                                    i10 = size;
                                    if (i10 >= i21 + i22) {
                                        size = i10;
                                    }
                                }
                                arrayList = arrayList;
                                accessgetmediaskipbackwardcp.MediaDescriptionCompat++;
                                i12 = i9 + 1;
                                i11 = i17;
                            }
                            i9 = i7;
                            arrayList = arrayList;
                            accessgetmediaskipbackwardcp.MediaDescriptionCompat++;
                            i12 = i9 + 1;
                            i11 = i17;
                        }
                        if (accessgetmediaskipbackwardcp.serializer() > 0) {
                            serializer(arrayList, accessgetmediaskipbackwardcp, i15 > 0 ? i15 - 1 : 0, i19);
                            i19 += accessgetmediaskipbackwardcp.write;
                        } else {
                            arrayList = arrayList;
                        }
                        if (z2) {
                            if (flexItem2.serializer() == -1) {
                                int paddingTop2 = accessgetmediaskipforwardcp.getPaddingTop();
                                size = i10;
                                viewWrite.measure(iSerializer2, accessgetmediaskipforwardcp.read(i2, accessgetmediaskipforwardcp.getPaddingBottom() + paddingTop2 + flexItem2.MediaDescriptionCompat() + flexItem2.RatingCompat() + i19, flexItem2.serializer()));
                                IconCompatParcelizer(i15, viewWrite);
                            } else {
                                size = i10;
                            }
                        } else {
                            size = i10;
                            if (flexItem2.MediaSessionCompatToken() == -1) {
                                int paddingLeft = accessgetmediaskipforwardcp.getPaddingLeft();
                                viewWrite.measure(accessgetmediaskipforwardcp.serializer(i2, accessgetmediaskipforwardcp.getPaddingRight() + paddingLeft + flexItem2.MediaSessionCompatQueueItem() + flexItem2.MediaMetadataCompat() + i19, flexItem2.MediaSessionCompatToken()), iSerializer2);
                                IconCompatParcelizer(i15, viewWrite);
                            }
                        }
                        accessgetmediaskipbackwardcp = new accessgetMediaSkipBackwardcp();
                        accessgetmediaskipbackwardcp.MediaDescriptionCompat = 1;
                        accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = i16;
                        accessgetmediaskipbackwardcp.RatingCompat = i15;
                        i11 = Integer.MIN_VALUE;
                        i12 = 0;
                    } else {
                        i8 = mode;
                        i9 = i7;
                        arrayList = arrayList;
                        accessgetmediaskipbackwardcp.MediaDescriptionCompat++;
                        i12 = i9 + 1;
                        i11 = i17;
                    }
                    accessgetmediaskipbackwardcp.read |= flexItem2.RemoteActionCompatParcelizer() != 0.0f;
                    accessgetmediaskipbackwardcp.RemoteActionCompatParcelizer |= flexItem2.write() != 0.0f;
                    int[] iArr = this.RemoteActionCompatParcelizer;
                    if (iArr != null) {
                        iArr[i15] = arrayList.size();
                    }
                    int i23 = accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper;
                    if (z2) {
                        measuredHeight2 = viewWrite.getMeasuredWidth();
                    } else {
                        measuredHeight2 = viewWrite.getMeasuredHeight();
                    }
                    if (z2) {
                        iMediaDescriptionCompat2 = flexItem2.MediaSessionCompatQueueItem();
                    } else {
                        iMediaDescriptionCompat2 = flexItem2.MediaDescriptionCompat();
                    }
                    if (z2) {
                        iRatingCompat2 = flexItem2.MediaMetadataCompat();
                    } else {
                        iRatingCompat2 = flexItem2.RatingCompat();
                    }
                    accessgetmediaskipbackwardcp.MediaSessionCompatResultReceiverWrapper = measuredHeight2 + iMediaDescriptionCompat2 + iRatingCompat2 + i23;
                    accessgetmediaskipbackwardcp.ComponentActivity += flexItem2.RemoteActionCompatParcelizer();
                    accessgetmediaskipbackwardcp.ResultReceiver += flexItem2.write();
                    accessgetmediaskipforwardcp.serializer(viewWrite, i15, i12, accessgetmediaskipbackwardcp);
                    if (z2) {
                        measuredWidth = viewWrite.getMeasuredHeight();
                    } else {
                        measuredWidth = viewWrite.getMeasuredWidth();
                    }
                    if (z2) {
                        iMediaSessionCompatQueueItem = flexItem2.MediaDescriptionCompat();
                    } else {
                        iMediaSessionCompatQueueItem = flexItem2.MediaSessionCompatQueueItem();
                    }
                    if (z2) {
                        iMediaMetadataCompat = flexItem2.RatingCompat();
                    } else {
                        iMediaMetadataCompat = flexItem2.MediaMetadataCompat();
                    }
                    int iMax = Math.max(i11, accessgetmediaskipforwardcp.read(viewWrite) + measuredWidth + iMediaSessionCompatQueueItem + iMediaMetadataCompat);
                    accessgetmediaskipbackwardcp.write = Math.max(accessgetmediaskipbackwardcp.write, iMax);
                    if (z2) {
                        int flexWrap = accessgetmediaskipforwardcp.getFlexWrap();
                        int i24 = accessgetmediaskipbackwardcp.ParcelableVolumeInfo;
                        if (flexWrap != 2) {
                            accessgetmediaskipbackwardcp.ParcelableVolumeInfo = Math.max(i24, viewWrite.getBaseline() + flexItem2.MediaDescriptionCompat());
                        } else {
                            accessgetmediaskipbackwardcp.ParcelableVolumeInfo = Math.max(i24, (viewWrite.getMeasuredHeight() - viewWrite.getBaseline()) + flexItem2.RatingCompat());
                        }
                    }
                    if (i15 == flexItemCount - 1 && accessgetmediaskipbackwardcp.serializer() != 0) {
                        serializer(arrayList, accessgetmediaskipbackwardcp, i15, i19);
                        i19 += accessgetmediaskipbackwardcp.write;
                    }
                    i13 = i5;
                    if (i13 != -1 && arrayList.size() > 0) {
                        if (((accessgetMediaSkipBackwardcp) r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.IconCompatParcelizer(1, arrayList)).MediaSessionCompatQueueItem >= i13 && i15 >= i13 && !z4) {
                            i19 = -accessgetmediaskipbackwardcp.write;
                            z = true;
                        }
                        if (i19 <= i3 && z) {
                            i6 = iCombineMeasuredStates;
                            deltaDecoder.write = i6;
                        }
                        i17 = iMax;
                    }
                    z = z4;
                    if (i19 <= i3) {
                    }
                    i17 = iMax;
                }
                i15++;
                i18 = i12;
                z3 = z;
                flexItemCount = flexItemCount;
                mode = i8;
                arrayList = arrayList;
                size = size;
            }
            i13 = i5;
            i8 = mode;
            size = size;
            arrayList = arrayList;
            flexItemCount = flexItemCount;
            i12 = i7;
            z = z4;
            i15++;
            i18 = i12;
            z3 = z;
            flexItemCount = flexItemCount;
            mode = i8;
            arrayList = arrayList;
            size = size;
        }
        i6 = iCombineMeasuredStates;
        deltaDecoder.write = i6;
    }

    public final void write(int i, int i2, int i3, View view) {
        long[] jArr = this.read;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.IconCompatParcelizer;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }
}
