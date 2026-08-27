package o;

import android.view.View;
import android.view.ViewGroup;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class getSetMeasurePolicyui extends FocusTargetNodeKt {
    public final /* synthetic */ SideSheetBehavior read;

    @Override // o.FocusTargetNodeKt
    public final int write(int i, View view) {
        return view.getTop();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    @Override // o.FocusTargetNodeKt
    public final void IconCompatParcelizer(View view, float f, float f2) {
        int i;
        getSetCompositionContextui getsetcompositioncontextui;
        SideSheetBehavior sideSheetBehavior = this.read;
        if (sideSheetBehavior.ComponentActivity.read == 0 ? f <= 0.0f : f >= 0.0f) {
            getSetCompositionContextui getsetcompositioncontextui2 = sideSheetBehavior.ComponentActivity;
            if (getsetcompositioncontextui2.read != 0) {
                if (Math.abs((getsetcompositioncontextui2.write.MediaDescriptionCompat * f) + view.getRight()) > 0.5f) {
                    if (sideSheetBehavior.ComponentActivity.read != 0 ? Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f : Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                        getsetcompositioncontextui = sideSheetBehavior.ComponentActivity;
                        if (getsetcompositioncontextui.read != 0) {
                            if (view.getLeft() > (getsetcompositioncontextui.read() + getsetcompositioncontextui.write.PlaybackStateCompatCustomAction) / 2) {
                            }
                        } else if (view.getRight() < (getsetcompositioncontextui.read() - getsetcompositioncontextui.write()) / 2) {
                        }
                    }
                } else {
                    if (f != 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        i = Math.abs(left - sideSheetBehavior.ComponentActivity.read()) < Math.abs(left - sideSheetBehavior.ComponentActivity.write()) ? 3 : 5;
                    }
                }
            } else {
                if (Math.abs((getsetcompositioncontextui2.write.MediaDescriptionCompat * f) + view.getLeft()) > 0.5f) {
                    if (sideSheetBehavior.ComponentActivity.read != 0) {
                        getsetcompositioncontextui = sideSheetBehavior.ComponentActivity;
                        if (getsetcompositioncontextui.read != 0) {
                            if (view.getLeft() > (getsetcompositioncontextui.read() + getsetcompositioncontextui.write.PlaybackStateCompatCustomAction) / 2) {
                            }
                        } else if (view.getRight() < (getsetcompositioncontextui.read() - getsetcompositioncontextui.write()) / 2) {
                        }
                    } else {
                        getsetcompositioncontextui = sideSheetBehavior.ComponentActivity;
                        if (getsetcompositioncontextui.read != 0) {
                            if (view.getLeft() > (getsetcompositioncontextui.read() + getsetcompositioncontextui.write.PlaybackStateCompatCustomAction) / 2) {
                            }
                        } else if (view.getRight() < (getsetcompositioncontextui.read() - getsetcompositioncontextui.write()) / 2) {
                        }
                    }
                } else {
                    if (f != 0.0f) {
                        int left2 = view.getLeft();
                        if (Math.abs(left2 - sideSheetBehavior.ComponentActivity.read()) < Math.abs(left2 - sideSheetBehavior.ComponentActivity.write())) {
                        }
                    } else {
                        int left3 = view.getLeft();
                        if (Math.abs(left3 - sideSheetBehavior.ComponentActivity.read()) < Math.abs(left3 - sideSheetBehavior.ComponentActivity.write())) {
                        }
                    }
                }
            }
        }
        sideSheetBehavior.IconCompatParcelizer(view, i, true);
    }

    @Override // o.FocusTargetNodeKt
    public final boolean IconCompatParcelizer(int i, View view) {
        java.lang.ref.WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.read;
        return (sideSheetBehavior.ResultReceiver == 1 || (weakReference = sideSheetBehavior.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg) == null || weakReference.get() != view) ? false : true;
    }

    @Override // o.FocusTargetNodeKt
    public final int serializer(int i, View view) {
        SideSheetBehavior sideSheetBehavior = this.read;
        getSetCompositionContextui getsetcompositioncontextui = sideSheetBehavior.ComponentActivity;
        int i2 = getsetcompositioncontextui.read != 0 ? getsetcompositioncontextui.read() : -getsetcompositioncontextui.write.serializer;
        getSetCompositionContextui getsetcompositioncontextui2 = sideSheetBehavior.ComponentActivity;
        return getActiveFocusTargetNode.RemoteActionCompatParcelizer(i, i2, getsetcompositioncontextui2.read != 0 ? getsetcompositioncontextui2.write.PlaybackStateCompatCustomAction : getsetcompositioncontextui2.write.PlaybackStateCompat);
    }

    @Override // o.FocusTargetNodeKt
    public final int write(View view) {
        SideSheetBehavior sideSheetBehavior = this.read;
        return sideSheetBehavior.serializer + sideSheetBehavior.PlaybackStateCompat;
    }

    @Override // o.FocusTargetNodeKt
    public final void write(int i, int i2, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.read;
        java.lang.ref.WeakReference weakReference = sideSheetBehavior.IconCompatParcelizer;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            getSetCompositionContextui getsetcompositioncontextui = sideSheetBehavior.ComponentActivity;
            int left = view.getLeft();
            int right = view.getRight();
            if (getsetcompositioncontextui.read != 0) {
                int i3 = getsetcompositioncontextui.write.PlaybackStateCompatCustomAction;
                if (left <= i3) {
                    marginLayoutParams.rightMargin = i3 - left;
                }
            } else if (left <= getsetcompositioncontextui.write.PlaybackStateCompatCustomAction) {
                marginLayoutParams.leftMargin = right;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.write;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        getSetCompositionContextui getsetcompositioncontextui2 = sideSheetBehavior.ComponentActivity;
        if (getsetcompositioncontextui2.read != 0) {
            int i4 = getsetcompositioncontextui2.write.PlaybackStateCompatCustomAction;
            getsetcompositioncontextui2.read();
        } else {
            getsetcompositioncontextui2.write();
            getsetcompositioncontextui2.read();
        }
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            throw ff$$ExternalSyntheticOutline0.m(it);
        }
    }

    public getSetMeasurePolicyui(SideSheetBehavior sideSheetBehavior) {
        this.read = sideSheetBehavior;
    }

    @Override // o.FocusTargetNodeKt
    public final void read(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.read;
            if (sideSheetBehavior.RatingCompat) {
                sideSheetBehavior.serializer(1);
            }
        }
    }
}
