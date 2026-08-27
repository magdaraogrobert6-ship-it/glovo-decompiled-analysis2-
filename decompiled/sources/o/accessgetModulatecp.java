package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class accessgetModulatecp {
    public int IconCompatParcelizer;
    public final Object MediaDescriptionCompat;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final Object serializer;
    public final Object write;

    public boolean IconCompatParcelizer(int i) {
        ArrayList arrayList = (ArrayList) this.read;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) arrayList.get(i2);
            int i3 = accessgetoverlaycp.read;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = accessgetoverlaycp.RemoteActionCompatParcelizer;
                    int i5 = accessgetoverlaycp.write;
                    for (int i6 = i4; i6 < i5 + i4; i6++) {
                        if (read(i6, i2 + 1) == i) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                if (read(accessgetoverlaycp.write, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public int RemoteActionCompatParcelizer(int i, int i2) {
        int i3;
        int i4;
        FocusOwnerImplWhenMappings focusOwnerImplWhenMappings = (FocusOwnerImplWhenMappings) this.MediaDescriptionCompat;
        ArrayList arrayList = (ArrayList) this.read;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) arrayList.get(size);
            int i5 = accessgetoverlaycp.read;
            int i6 = accessgetoverlaycp.RemoteActionCompatParcelizer;
            if (i5 == 8) {
                int i7 = accessgetoverlaycp.write;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            accessgetoverlaycp.RemoteActionCompatParcelizer = i6 + 1;
                            accessgetoverlaycp.write = i7 + 1;
                        } else if (i2 == 2) {
                            accessgetoverlaycp.RemoteActionCompatParcelizer = i6 - 1;
                            accessgetoverlaycp.write = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        accessgetoverlaycp.write = i7 + 1;
                    } else if (i2 == 2) {
                        accessgetoverlaycp.write = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        accessgetoverlaycp.RemoteActionCompatParcelizer = i6 + 1;
                    } else if (i2 == 2) {
                        accessgetoverlaycp.RemoteActionCompatParcelizer = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= accessgetoverlaycp.write;
                } else if (i5 == 2) {
                    i += accessgetoverlaycp.write;
                }
            } else if (i2 == 1) {
                accessgetoverlaycp.RemoteActionCompatParcelizer = i6 + 1;
            } else if (i2 == 2) {
                accessgetoverlaycp.RemoteActionCompatParcelizer = i6 - 1;
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            accessgetOverlaycp accessgetoverlaycp2 = (accessgetOverlaycp) arrayList.get(size2);
            int i8 = accessgetoverlaycp2.read;
            int i9 = accessgetoverlaycp2.write;
            if (i8 == 8) {
                if (i9 == accessgetoverlaycp2.RemoteActionCompatParcelizer || i9 < 0) {
                    arrayList.remove(size2);
                    accessgetoverlaycp2.serializer = null;
                    focusOwnerImplWhenMappings.IconCompatParcelizer(accessgetoverlaycp2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                accessgetoverlaycp2.serializer = null;
                focusOwnerImplWhenMappings.IconCompatParcelizer(accessgetoverlaycp2);
            }
        }
    }

    public void RemoteActionCompatParcelizer() {
        androidx.recyclerview.widget.RecyclerView.AnonymousClass7 anonymousClass7 = (androidx.recyclerview.widget.RecyclerView.AnonymousClass7) this.RemoteActionCompatParcelizer;
        read();
        ArrayList arrayList = (ArrayList) this.write;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) arrayList.get(i);
            int i2 = accessgetoverlaycp.read;
            if (i2 == 1) {
                anonymousClass7.write(accessgetoverlaycp);
                anonymousClass7.offsetPositionsForAdd(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
            } else if (i2 == 2) {
                anonymousClass7.write(accessgetoverlaycp);
                int i3 = accessgetoverlaycp.RemoteActionCompatParcelizer;
                int i4 = accessgetoverlaycp.write;
                androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
                recyclerView.offsetPositionRecordsForRemove(i3, i4, true);
                recyclerView.addObserverForBackInvoker = true;
                recyclerView.onCreatePanelMenu.serializer += i4;
            } else if (i2 == 4) {
                anonymousClass7.write(accessgetoverlaycp);
                anonymousClass7.markViewHoldersUpdated(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write, accessgetoverlaycp.serializer);
            } else if (i2 == 8) {
                anonymousClass7.write(accessgetoverlaycp);
                anonymousClass7.offsetPositionsForMove(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
            }
        }
        read(arrayList);
        this.IconCompatParcelizer = 0;
    }

    public void RemoteActionCompatParcelizer(TextView textView) {
        ColorStateList colorStateList = (ColorStateList) this.write;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = new SubcomposeSlotReusePolicy();
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = new SubcomposeSlotReusePolicy();
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException = (SubcomposeLayoutPausableCompositionException) this.serializer;
        subcomposeSlotReusePolicy.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        subcomposeSlotReusePolicy2.setShapeAppearanceModel(subcomposeLayoutPausableCompositionException);
        subcomposeSlotReusePolicy.MediaBrowserCompatMediaItem((ColorStateList) this.read);
        float f = this.IconCompatParcelizer;
        ColorStateList colorStateList2 = (ColorStateList) this.RemoteActionCompatParcelizer;
        subcomposeSlotReusePolicy.getLifecycle.ParcelableVolumeInfo = f;
        subcomposeSlotReusePolicy.invalidateSelf();
        accessgetReusedSlotIdp accessgetreusedslotidp = subcomposeSlotReusePolicy.getLifecycle;
        if (accessgetreusedslotidp.PlaybackStateCompatCustomAction != colorStateList2) {
            accessgetreusedslotidp.PlaybackStateCompatCustomAction = colorStateList2;
            subcomposeSlotReusePolicy.onStateChange(subcomposeSlotReusePolicy.getState());
        }
        textView.setTextColor(colorStateList);
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList.withAlpha(30), subcomposeSlotReusePolicy, subcomposeSlotReusePolicy2);
        android.graphics.Rect rect = (android.graphics.Rect) this.MediaDescriptionCompat;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        textView.setBackground(insetDrawable);
    }

    public int read(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.read;
        int size = arrayList.size();
        while (i2 < size) {
            accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) arrayList.get(i2);
            int i3 = accessgetoverlaycp.read;
            int i4 = accessgetoverlaycp.RemoteActionCompatParcelizer;
            if (i3 == 8) {
                if (i4 == i) {
                    i = accessgetoverlaycp.write;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (accessgetoverlaycp.write <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = accessgetoverlaycp.write;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += accessgetoverlaycp.write;
            }
            i2++;
        }
        return i;
    }

    public accessgetOverlaycp read(int i, int i2, int i3, Object obj) {
        accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) ((FocusOwnerImplWhenMappings) this.MediaDescriptionCompat).write();
        if (accessgetoverlaycp != null) {
            accessgetoverlaycp.read = i;
            accessgetoverlaycp.RemoteActionCompatParcelizer = i2;
            accessgetoverlaycp.write = i3;
            accessgetoverlaycp.serializer = obj;
            return accessgetoverlaycp;
        }
        accessgetOverlaycp accessgetoverlaycp2 = new accessgetOverlaycp();
        accessgetoverlaycp2.read = i;
        accessgetoverlaycp2.RemoteActionCompatParcelizer = i2;
        accessgetoverlaycp2.write = i3;
        accessgetoverlaycp2.serializer = obj;
        return accessgetoverlaycp2;
    }

    public void read() {
        ArrayList arrayList = (ArrayList) this.read;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((androidx.recyclerview.widget.RecyclerView.AnonymousClass7) this.RemoteActionCompatParcelizer).write((accessgetOverlaycp) arrayList.get(i));
        }
        read(arrayList);
        this.IconCompatParcelizer = 0;
    }

    public void read(accessgetOverlaycp accessgetoverlaycp) {
        int i;
        FocusOwnerImplWhenMappings focusOwnerImplWhenMappings = (FocusOwnerImplWhenMappings) this.MediaDescriptionCompat;
        int i2 = accessgetoverlaycp.read;
        if (i2 == 1 || i2 == 8) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("should not dispatch add or move for pre layout");
            return;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessgetoverlaycp.RemoteActionCompatParcelizer, i2);
        int i3 = accessgetoverlaycp.RemoteActionCompatParcelizer;
        int i4 = accessgetoverlaycp.read;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Gson$$ExternalSyntheticBUOutline0.m(accessgetoverlaycp, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < accessgetoverlaycp.write; i6++) {
            int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((i * i6) + accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.read);
            int i7 = accessgetoverlaycp.read;
            if (i7 == 2 ? iRemoteActionCompatParcelizer2 != iRemoteActionCompatParcelizer : !(i7 == 4 && iRemoteActionCompatParcelizer2 == iRemoteActionCompatParcelizer + 1)) {
                accessgetOverlaycp accessgetoverlaycp2 = read(i7, iRemoteActionCompatParcelizer, i5, accessgetoverlaycp.serializer);
                write(accessgetoverlaycp2, i3);
                accessgetoverlaycp2.serializer = null;
                focusOwnerImplWhenMappings.IconCompatParcelizer(accessgetoverlaycp2);
                if (accessgetoverlaycp.read == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iRemoteActionCompatParcelizer = iRemoteActionCompatParcelizer2;
            } else {
                i5++;
            }
        }
        Object obj = accessgetoverlaycp.serializer;
        accessgetoverlaycp.serializer = null;
        focusOwnerImplWhenMappings.IconCompatParcelizer(accessgetoverlaycp);
        if (i5 > 0) {
            accessgetOverlaycp accessgetoverlaycp3 = read(accessgetoverlaycp.read, iRemoteActionCompatParcelizer, i5, obj);
            write(accessgetoverlaycp3, i3);
            accessgetoverlaycp3.serializer = null;
            focusOwnerImplWhenMappings.IconCompatParcelizer(accessgetoverlaycp3);
        }
    }

    public void serializer(accessgetOverlaycp accessgetoverlaycp) {
        androidx.recyclerview.widget.RecyclerView.AnonymousClass7 anonymousClass7 = (androidx.recyclerview.widget.RecyclerView.AnonymousClass7) this.RemoteActionCompatParcelizer;
        ((ArrayList) this.read).add(accessgetoverlaycp);
        int i = accessgetoverlaycp.read;
        if (i == 1) {
            anonymousClass7.offsetPositionsForAdd(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
            return;
        }
        if (i == 2) {
            int i2 = accessgetoverlaycp.RemoteActionCompatParcelizer;
            int i3 = accessgetoverlaycp.write;
            androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
            recyclerView.offsetPositionRecordsForRemove(i2, i3, false);
            recyclerView.addObserverForBackInvoker = true;
            return;
        }
        if (i == 4) {
            anonymousClass7.markViewHoldersUpdated(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write, accessgetoverlaycp.serializer);
        } else if (i == 8) {
            anonymousClass7.offsetPositionsForMove(accessgetoverlaycp.RemoteActionCompatParcelizer, accessgetoverlaycp.write);
        } else {
            Gson$$ExternalSyntheticBUOutline0.m(accessgetoverlaycp, "Unknown update op type for ");
        }
    }

    public boolean serializer() {
        return ((ArrayList) this.write).size() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x019f  */
    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:189:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:72:0x012a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:75:0x013b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0141  */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:86:0x0162  */
    /* JADX WARN: Code duplicated, block: B:87:0x0168  */
    /* JADX WARN: Code duplicated, block: B:88:0x016a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x017b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x0191  */
    public void write() {
        boolean z;
        byte b;
        accessgetOverlaycp accessgetoverlaycp;
        int i;
        int i2;
        int i3;
        accessgetOverlaycp accessgetoverlaycp2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        accessgetOverlaycp accessgetoverlaycp3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        FocusOwnerImplWhenMappings focusOwnerImplWhenMappings = (FocusOwnerImplWhenMappings) this.MediaDescriptionCompat;
        androidx.recyclerview.widget.RecyclerView.AnonymousClass7 anonymousClass7 = (androidx.recyclerview.widget.RecyclerView.AnonymousClass7) this.RemoteActionCompatParcelizer;
        getPlus0nO6VwU getplus0no6vwu = (getPlus0nO6VwU) this.serializer;
        ArrayList arrayList = (ArrayList) this.write;
        getplus0no6vwu.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z6 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((accessgetOverlaycp) arrayList.get(size)).read == 8) {
                    if (z6) {
                        break;
                    }
                } else {
                    z6 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            accessgetModulatecp accessgetmodulatecp = (accessgetModulatecp) getplus0no6vwu.write;
            FocusOwnerImplWhenMappings focusOwnerImplWhenMappings2 = (FocusOwnerImplWhenMappings) accessgetmodulatecp.MediaDescriptionCompat;
            accessgetOverlaycp accessgetoverlaycp4 = (accessgetOverlaycp) arrayList.get(size);
            accessgetOverlaycp accessgetoverlaycp5 = (accessgetOverlaycp) arrayList.get(i12);
            int i13 = accessgetoverlaycp5.read;
            if (i13 == 1) {
                getplus0no6vwu = getplus0no6vwu;
                int i14 = accessgetoverlaycp4.write;
                int i15 = accessgetoverlaycp5.RemoteActionCompatParcelizer;
                int i16 = i14 < i15 ? -1 : 0;
                int i17 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                if (i17 < i15) {
                    i16++;
                }
                if (i15 <= i17) {
                    accessgetoverlaycp4.RemoteActionCompatParcelizer = i17 + accessgetoverlaycp5.write;
                }
                int i18 = accessgetoverlaycp5.RemoteActionCompatParcelizer;
                if (i18 <= i14) {
                    accessgetoverlaycp4.write = i14 + accessgetoverlaycp5.write;
                }
                accessgetoverlaycp5.RemoteActionCompatParcelizer = i18 + i16;
                arrayList.set(size, accessgetoverlaycp5);
                arrayList.set(i12, accessgetoverlaycp4);
            } else if (i13 == 2) {
                int i19 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                int i20 = accessgetoverlaycp4.write;
                int i21 = accessgetoverlaycp5.RemoteActionCompatParcelizer;
                if (i19 < i20) {
                    if (i21 == i19 && accessgetoverlaycp5.write == i20 - i19) {
                        z3 = false;
                        z4 = z3;
                        z5 = true;
                    } else {
                        z2 = false;
                        z4 = z2;
                        z5 = false;
                    }
                } else if (i21 == i20 + 1 && accessgetoverlaycp5.write == i19 - i20) {
                    z3 = true;
                    z4 = z3;
                    z5 = true;
                } else {
                    z2 = true;
                    z4 = z2;
                    z5 = false;
                }
                if (i20 < i21) {
                    accessgetoverlaycp5.RemoteActionCompatParcelizer = i21 - 1;
                } else {
                    int i22 = accessgetoverlaycp5.write;
                    if (i20 < i21 + i22) {
                        accessgetoverlaycp5.write = i22 - 1;
                        accessgetoverlaycp4.read = 2;
                        accessgetoverlaycp4.write = 1;
                        if (accessgetoverlaycp5.write == 0) {
                            arrayList.remove(i12);
                            accessgetoverlaycp5.serializer = null;
                            focusOwnerImplWhenMappings2.IconCompatParcelizer(accessgetoverlaycp5);
                        }
                    }
                }
                int i23 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                int i24 = accessgetoverlaycp5.RemoteActionCompatParcelizer;
                if (i23 <= i24) {
                    accessgetoverlaycp5.RemoteActionCompatParcelizer = i24 + 1;
                } else {
                    int i25 = i24 + accessgetoverlaycp5.write;
                    if (i23 < i25) {
                        int i26 = i23 + 1;
                        int i27 = i25 - i23;
                        obj = null;
                        accessgetOverlaycp accessgetoverlaycp6 = accessgetmodulatecp.read(2, i26, i27, null);
                        accessgetoverlaycp5.write = accessgetoverlaycp4.RemoteActionCompatParcelizer - accessgetoverlaycp5.RemoteActionCompatParcelizer;
                        accessgetoverlaycp3 = accessgetoverlaycp6;
                    }
                    if (z5) {
                        arrayList.set(size, accessgetoverlaycp5);
                        arrayList.remove(i12);
                        accessgetoverlaycp4.serializer = obj;
                        focusOwnerImplWhenMappings2.IconCompatParcelizer(accessgetoverlaycp4);
                    } else {
                        if (z4) {
                            if (accessgetoverlaycp3 != null) {
                                i10 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                                if (i10 > accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                    accessgetoverlaycp4.RemoteActionCompatParcelizer = i10 - accessgetoverlaycp3.write;
                                }
                                i11 = accessgetoverlaycp4.write;
                                if (i11 > accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                    accessgetoverlaycp4.write = i11 - accessgetoverlaycp3.write;
                                }
                            }
                            i8 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                            if (i8 > accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.RemoteActionCompatParcelizer = i8 - accessgetoverlaycp5.write;
                            }
                            i9 = accessgetoverlaycp4.write;
                            if (i9 > accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.write = i9 - accessgetoverlaycp5.write;
                            }
                        } else {
                            if (accessgetoverlaycp3 != null) {
                                i6 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                                if (i6 >= accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                    accessgetoverlaycp4.RemoteActionCompatParcelizer = i6 - accessgetoverlaycp3.write;
                                }
                                i7 = accessgetoverlaycp4.write;
                                if (i7 >= accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                    accessgetoverlaycp4.write = i7 - accessgetoverlaycp3.write;
                                }
                            }
                            i4 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                            if (i4 >= accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.RemoteActionCompatParcelizer = i4 - accessgetoverlaycp5.write;
                            }
                            i5 = accessgetoverlaycp4.write;
                            if (i5 >= accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.write = i5 - accessgetoverlaycp5.write;
                            }
                        }
                        arrayList.set(size, accessgetoverlaycp5);
                        if (accessgetoverlaycp4.RemoteActionCompatParcelizer != accessgetoverlaycp4.write) {
                            arrayList.set(i12, accessgetoverlaycp4);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (accessgetoverlaycp3 != null) {
                            arrayList.add(size, accessgetoverlaycp3);
                        }
                    }
                }
                obj = null;
                accessgetoverlaycp3 = null;
                if (z5) {
                    arrayList.set(size, accessgetoverlaycp5);
                    arrayList.remove(i12);
                    accessgetoverlaycp4.serializer = obj;
                    focusOwnerImplWhenMappings2.IconCompatParcelizer(accessgetoverlaycp4);
                } else {
                    if (z4) {
                        if (accessgetoverlaycp3 != null) {
                            i10 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                            if (i10 > accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.RemoteActionCompatParcelizer = i10 - accessgetoverlaycp3.write;
                            }
                            i11 = accessgetoverlaycp4.write;
                            if (i11 > accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.write = i11 - accessgetoverlaycp3.write;
                            }
                        }
                        i8 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                        if (i8 > accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                            accessgetoverlaycp4.RemoteActionCompatParcelizer = i8 - accessgetoverlaycp5.write;
                        }
                        i9 = accessgetoverlaycp4.write;
                        if (i9 > accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                            accessgetoverlaycp4.write = i9 - accessgetoverlaycp5.write;
                        }
                    } else {
                        if (accessgetoverlaycp3 != null) {
                            i6 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                            if (i6 >= accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.RemoteActionCompatParcelizer = i6 - accessgetoverlaycp3.write;
                            }
                            i7 = accessgetoverlaycp4.write;
                            if (i7 >= accessgetoverlaycp3.RemoteActionCompatParcelizer) {
                                accessgetoverlaycp4.write = i7 - accessgetoverlaycp3.write;
                            }
                        }
                        i4 = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                        if (i4 >= accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                            accessgetoverlaycp4.RemoteActionCompatParcelizer = i4 - accessgetoverlaycp5.write;
                        }
                        i5 = accessgetoverlaycp4.write;
                        if (i5 >= accessgetoverlaycp5.RemoteActionCompatParcelizer) {
                            accessgetoverlaycp4.write = i5 - accessgetoverlaycp5.write;
                        }
                    }
                    arrayList.set(size, accessgetoverlaycp5);
                    if (accessgetoverlaycp4.RemoteActionCompatParcelizer != accessgetoverlaycp4.write) {
                        arrayList.set(i12, accessgetoverlaycp4);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (accessgetoverlaycp3 != null) {
                        arrayList.add(size, accessgetoverlaycp3);
                    }
                }
            } else if (i13 == 4) {
                int i28 = accessgetoverlaycp4.write;
                int i29 = accessgetoverlaycp5.RemoteActionCompatParcelizer;
                if (i28 < i29) {
                    accessgetoverlaycp5.RemoteActionCompatParcelizer = i29 - 1;
                } else {
                    int i30 = accessgetoverlaycp5.write;
                    if (i28 < i29 + i30) {
                        accessgetoverlaycp5.write = i30 - 1;
                        accessgetoverlaycp = accessgetmodulatecp.read(4, accessgetoverlaycp4.RemoteActionCompatParcelizer, 1, accessgetoverlaycp5.serializer);
                    }
                    i = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                    i2 = accessgetoverlaycp5.RemoteActionCompatParcelizer;
                    if (i <= i2) {
                        accessgetoverlaycp5.RemoteActionCompatParcelizer = i2 + 1;
                    } else {
                        i3 = i2 + accessgetoverlaycp5.write;
                        if (i < i3) {
                            int i31 = i3 - i;
                            accessgetoverlaycp2 = accessgetmodulatecp.read(4, i + 1, i31, accessgetoverlaycp5.serializer);
                            accessgetoverlaycp5.write -= i31;
                        }
                        arrayList.set(i12, accessgetoverlaycp4);
                        if (accessgetoverlaycp5.write > 0) {
                            arrayList.set(size, accessgetoverlaycp5);
                        } else {
                            arrayList.remove(size);
                            accessgetoverlaycp5.serializer = null;
                            focusOwnerImplWhenMappings2.IconCompatParcelizer(accessgetoverlaycp5);
                        }
                        if (accessgetoverlaycp != null) {
                            arrayList.add(size, accessgetoverlaycp);
                        }
                        if (accessgetoverlaycp2 != null) {
                            arrayList.add(size, accessgetoverlaycp2);
                        }
                    }
                    accessgetoverlaycp2 = null;
                    arrayList.set(i12, accessgetoverlaycp4);
                    if (accessgetoverlaycp5.write > 0) {
                        arrayList.set(size, accessgetoverlaycp5);
                    } else {
                        arrayList.remove(size);
                        accessgetoverlaycp5.serializer = null;
                        focusOwnerImplWhenMappings2.IconCompatParcelizer(accessgetoverlaycp5);
                    }
                    if (accessgetoverlaycp != null) {
                        arrayList.add(size, accessgetoverlaycp);
                    }
                    if (accessgetoverlaycp2 != null) {
                        arrayList.add(size, accessgetoverlaycp2);
                    }
                }
                accessgetoverlaycp = null;
                i = accessgetoverlaycp4.RemoteActionCompatParcelizer;
                i2 = accessgetoverlaycp5.RemoteActionCompatParcelizer;
                if (i <= i2) {
                    accessgetoverlaycp5.RemoteActionCompatParcelizer = i2 + 1;
                } else {
                    i3 = i2 + accessgetoverlaycp5.write;
                    if (i < i3) {
                        int i32 = i3 - i;
                        accessgetoverlaycp2 = accessgetmodulatecp.read(4, i + 1, i32, accessgetoverlaycp5.serializer);
                        accessgetoverlaycp5.write -= i32;
                    }
                    arrayList.set(i12, accessgetoverlaycp4);
                    if (accessgetoverlaycp5.write > 0) {
                        arrayList.set(size, accessgetoverlaycp5);
                    } else {
                        arrayList.remove(size);
                        accessgetoverlaycp5.serializer = null;
                        focusOwnerImplWhenMappings2.IconCompatParcelizer(accessgetoverlaycp5);
                    }
                    if (accessgetoverlaycp != null) {
                        arrayList.add(size, accessgetoverlaycp);
                    }
                    if (accessgetoverlaycp2 != null) {
                        arrayList.add(size, accessgetoverlaycp2);
                    }
                }
                accessgetoverlaycp2 = null;
                arrayList.set(i12, accessgetoverlaycp4);
                if (accessgetoverlaycp5.write > 0) {
                    arrayList.set(size, accessgetoverlaycp5);
                } else {
                    arrayList.remove(size);
                    accessgetoverlaycp5.serializer = null;
                    focusOwnerImplWhenMappings2.IconCompatParcelizer(accessgetoverlaycp5);
                }
                if (accessgetoverlaycp != null) {
                    arrayList.add(size, accessgetoverlaycp);
                }
                if (accessgetoverlaycp2 != null) {
                    arrayList.add(size, accessgetoverlaycp2);
                }
            }
            getplus0no6vwu = getplus0no6vwu;
        }
        int size2 = arrayList.size();
        for (int i33 = 0; i33 < size2; i33++) {
            accessgetOverlaycp accessgetoverlaycp7 = (accessgetOverlaycp) arrayList.get(i33);
            int i34 = accessgetoverlaycp7.read;
            if (i34 == 1) {
                serializer(accessgetoverlaycp7);
            } else if (i34 == 2) {
                int i35 = accessgetoverlaycp7.RemoteActionCompatParcelizer;
                int i36 = accessgetoverlaycp7.write + i35;
                int i37 = i35;
                int i38 = 0;
                byte b2 = -1;
                while (i37 < i36) {
                    if (anonymousClass7.findViewHolder(i37) != null || IconCompatParcelizer(i37)) {
                        if (b2 == 0) {
                            read(read(2, i35, i38, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b2 == 1) {
                            serializer(read(2, i35, i38, null));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i37 -= i38;
                        i36 -= i38;
                        i38 = 1;
                    } else {
                        i38++;
                    }
                    i37++;
                    b2 = b;
                }
                if (i38 != accessgetoverlaycp7.write) {
                    accessgetoverlaycp7.serializer = null;
                    focusOwnerImplWhenMappings.IconCompatParcelizer(accessgetoverlaycp7);
                    accessgetoverlaycp7 = read(2, i35, i38, null);
                }
                if (b2 == 0) {
                    read(accessgetoverlaycp7);
                } else {
                    serializer(accessgetoverlaycp7);
                }
            } else if (i34 == 4) {
                int i39 = accessgetoverlaycp7.RemoteActionCompatParcelizer;
                int i40 = accessgetoverlaycp7.write;
                int i41 = i39;
                int i42 = i41;
                int i43 = 0;
                byte b3 = -1;
                while (i41 < i40 + i39) {
                    if (anonymousClass7.findViewHolder(i41) != null || IconCompatParcelizer(i41)) {
                        if (b3 == 0) {
                            read(read(4, i42, i43, accessgetoverlaycp7.serializer));
                            i42 = i41;
                            i43 = 0;
                        }
                        b3 = 1;
                    } else {
                        if (b3 == 1) {
                            serializer(read(4, i42, i43, accessgetoverlaycp7.serializer));
                            i42 = i41;
                            i43 = 0;
                        }
                        b3 = 0;
                    }
                    i43++;
                    i41++;
                }
                if (i43 != accessgetoverlaycp7.write) {
                    Object obj2 = accessgetoverlaycp7.serializer;
                    accessgetoverlaycp7.serializer = null;
                    focusOwnerImplWhenMappings.IconCompatParcelizer(accessgetoverlaycp7);
                    accessgetoverlaycp7 = read(4, i42, i43, obj2);
                }
                if (b3 == 0) {
                    read(accessgetoverlaycp7);
                } else {
                    serializer(accessgetoverlaycp7);
                }
            } else if (i34 == 8) {
                serializer(accessgetoverlaycp7);
            }
        }
        arrayList.clear();
    }

    public void write(accessgetOverlaycp accessgetoverlaycp, int i) {
        androidx.recyclerview.widget.RecyclerView.AnonymousClass7 anonymousClass7 = (androidx.recyclerview.widget.RecyclerView.AnonymousClass7) this.RemoteActionCompatParcelizer;
        anonymousClass7.write(accessgetoverlaycp);
        int i2 = accessgetoverlaycp.read;
        if (i2 != 2) {
            if (i2 == 4) {
                anonymousClass7.markViewHoldersUpdated(i, accessgetoverlaycp.write, accessgetoverlaycp.serializer);
                return;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = accessgetoverlaycp.write;
        androidx.recyclerview.widget.RecyclerView recyclerView = androidx.recyclerview.widget.RecyclerView.this;
        recyclerView.offsetPositionRecordsForRemove(i, i3, true);
        recyclerView.addObserverForBackInvoker = true;
        recyclerView.onCreatePanelMenu.serializer += i3;
    }

    public com.huawei.wisesecurity.ucs_credential.x IconCompatParcelizer() {
        this.IconCompatParcelizer++;
        Iterator it = (Iterator) this.serializer;
        List list = (List) this.RemoteActionCompatParcelizer;
        ArrayList arrayList = new ArrayList(list);
        for (int i = 0; it.hasNext() && i < 900 - list.size(); i++) {
            arrayList.add(it.next());
        }
        Object[] array = arrayList.toArray();
        com.huawei.wisesecurity.ucs_credential.x xVar = ((headH91voCI) this.MediaDescriptionCompat).read(((String) this.write) + ((Object) com.google.firebase.firestore.util.Util.read("?", array.length, ", ")) + ((String) this.read));
        xVar.IconCompatParcelizer(array);
        return xVar;
    }

    public accessgetModulatecp(androidx.recyclerview.widget.RecyclerView.AnonymousClass7 anonymousClass7) {
        this.MediaDescriptionCompat = new FocusOwnerImplWhenMappings(30);
        this.write = new ArrayList();
        this.read = new ArrayList();
        this.IconCompatParcelizer = 0;
        this.RemoteActionCompatParcelizer = anonymousClass7;
        this.serializer = new getPlus0nO6VwU(this);
    }

    public void read(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            accessgetOverlaycp accessgetoverlaycp = (accessgetOverlaycp) arrayList.get(i);
            accessgetoverlaycp.serializer = null;
            ((FocusOwnerImplWhenMappings) this.MediaDescriptionCompat).IconCompatParcelizer(accessgetoverlaycp);
        }
        arrayList.clear();
    }

    public static accessgetModulatecp IconCompatParcelizer(Context context, int i) {
        coil3.util.UtilsKt.IconCompatParcelizer("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, setMeasuredSizeozmzZPI.MaterialCalendarItem);
        android.graphics.Rect rect = new android.graphics.Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListIconCompatParcelizer = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListIconCompatParcelizer2 = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListIconCompatParcelizer3 = ScaleFactorKt.IconCompatParcelizer(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer = SubcomposeLayoutPausableCompositionException.write(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new SubcomposeLayoutKt(0.0f)).IconCompatParcelizer();
        typedArrayObtainStyledAttributes.recycle();
        return new accessgetModulatecp(colorStateListIconCompatParcelizer, colorStateListIconCompatParcelizer2, colorStateListIconCompatParcelizer3, dimensionPixelSize, subcomposeLayoutPausableCompositionExceptionIconCompatParcelizer, rect);
    }

    public accessgetModulatecp(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, SubcomposeLayoutPausableCompositionException subcomposeLayoutPausableCompositionException, android.graphics.Rect rect) {
        coil3.util.UtilsKt.read(rect.left);
        coil3.util.UtilsKt.read(rect.top);
        coil3.util.UtilsKt.read(rect.right);
        coil3.util.UtilsKt.read(rect.bottom);
        this.MediaDescriptionCompat = rect;
        this.write = colorStateList2;
        this.read = colorStateList;
        this.RemoteActionCompatParcelizer = colorStateList3;
        this.IconCompatParcelizer = i;
        this.serializer = subcomposeLayoutPausableCompositionException;
    }

    public accessgetModulatecp(headH91voCI headh91voci, ArrayList arrayList) {
        this.IconCompatParcelizer = 0;
        this.MediaDescriptionCompat = headh91voci;
        this.write = "SELECT contents, read_time_seconds, read_time_nanos, document_type, path FROM remote_documents WHERE path IN (";
        this.RemoteActionCompatParcelizer = Collections.EMPTY_LIST;
        this.read = ") ORDER BY path";
        this.serializer = arrayList.iterator();
    }

    public accessgetModulatecp(headH91voCI headh91voci, String str, List list, ArrayList arrayList, String str2) {
        this.IconCompatParcelizer = 0;
        this.MediaDescriptionCompat = headh91voci;
        this.write = str;
        this.RemoteActionCompatParcelizer = list;
        this.read = str2;
        this.serializer = arrayList.iterator();
    }
}
