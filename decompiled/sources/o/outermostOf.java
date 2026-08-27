package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.sentiance.core.model.events.I$b;
import com.sentiance.visitessentials.h$c;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class outermostOf extends LinearLayout {
    public static final /* synthetic */ int serializer = 0;
    public final int IconCompatParcelizer;
    public final LinkedHashSet MediaBrowserCompatMediaItem;
    public boolean MediaDescriptionCompat;
    public final ArrayList MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatToken;
    public final PinnableContainerKtLocalPinnableContainer1 RatingCompat;
    public Integer[] RemoteActionCompatParcelizer;
    public final h$c read;
    public HashSet write;

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.RatingCompat);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void setSelectionRequired(boolean z) {
        this.MediaSessionCompatQueueItem = z;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && IconCompatParcelizer(i2)) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.read);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.RemoteActionCompatParcelizer = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.write.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) getHasFocus.write(1, getVisibleButtonCount(), this.MediaDescriptionCompat ? 1 : 2).IconCompatParcelizer);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        RemoteActionCompatParcelizer();
        serializer();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.MediaMetadataCompat.remove(iIndexOfChild);
        }
        RemoteActionCompatParcelizer();
        serializer();
    }

    public final boolean IconCompatParcelizer(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void RemoteActionCompatParcelizer() {
        RectRulersKt rectRulersKt;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                I$b i$bWrite = materialButton.getShapeAppearanceModel().write();
                RectRulersKt rectRulersKt2 = (RectRulersKt) this.MediaMetadataCompat.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    SubcomposeLayoutKt subcomposeLayoutKt = RectRulersKt.serializer;
                    if (i == firstVisibleChildIndex) {
                        rectRulersKt = z ? getResumePausedNjRlDlw.write(this) ? new RectRulersKt(subcomposeLayoutKt, subcomposeLayoutKt, rectRulersKt2.RemoteActionCompatParcelizer, rectRulersKt2.read) : new RectRulersKt(rectRulersKt2.write, rectRulersKt2.IconCompatParcelizer, subcomposeLayoutKt, subcomposeLayoutKt) : new RectRulersKt(rectRulersKt2.write, subcomposeLayoutKt, rectRulersKt2.RemoteActionCompatParcelizer, subcomposeLayoutKt);
                    } else if (i != lastVisibleChildIndex) {
                        rectRulersKt2 = null;
                    } else if (z) {
                        rectRulersKt = getResumePausedNjRlDlw.write(this) ? new RectRulersKt(rectRulersKt2.write, rectRulersKt2.IconCompatParcelizer, subcomposeLayoutKt, subcomposeLayoutKt) : new RectRulersKt(subcomposeLayoutKt, subcomposeLayoutKt, rectRulersKt2.RemoteActionCompatParcelizer, rectRulersKt2.read);
                    } else {
                        rectRulersKt = new RectRulersKt(subcomposeLayoutKt, rectRulersKt2.IconCompatParcelizer, subcomposeLayoutKt, rectRulersKt2.read);
                    }
                    rectRulersKt2 = rectRulersKt;
                }
                if (rectRulersKt2 == null) {
                    i$bWrite.RemoteActionCompatParcelizer = new SubcomposeLayoutKt(0.0f);
                    i$bWrite.MediaDescriptionCompat = new SubcomposeLayoutKt(0.0f);
                    i$bWrite.RatingCompat = new SubcomposeLayoutKt(0.0f);
                    i$bWrite.MediaMetadataCompat = new SubcomposeLayoutKt(0.0f);
                } else {
                    i$bWrite.RemoteActionCompatParcelizer = rectRulersKt2.write;
                    i$bWrite.MediaMetadataCompat = rectRulersKt2.IconCompatParcelizer;
                    i$bWrite.MediaDescriptionCompat = rectRulersKt2.RemoteActionCompatParcelizer;
                    i$bWrite.RatingCompat = rectRulersKt2.read;
                }
                materialButton.setShapeAppearanceModel(i$bWrite.IconCompatParcelizer());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.MediaDescriptionCompat || this.write.isEmpty()) {
            return -1;
        }
        return ((Integer) this.write.iterator().next()).intValue();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.RemoteActionCompatParcelizer;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        SentryLogcatAdapter.IconCompatParcelizer("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.IconCompatParcelizer;
        if (i != -1) {
            updateCheckedIds(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSingleSelection(boolean z) {
        if (this.MediaDescriptionCompat != z) {
            this.MediaDescriptionCompat = z;
            updateCheckedIds(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.MediaDescriptionCompat ? android.widget.RadioButton.class : ToggleButton.class).getName());
        }
    }

    public final void updateCheckedIds(Set set) {
        HashSet hashSet = this.write;
        this.write = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.MediaSessionCompatToken = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.MediaSessionCompatToken = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.MediaBrowserCompatMediaItem.iterator();
                while (it.hasNext()) {
                    ((WindowInsetsRulersCompanion) it.next()).write();
                }
            }
        }
        invalidate();
    }

    public outermostOf(Context context, AttributeSet attributeSet) {
        super(VerticalRulerCompanion.IconCompatParcelizer(context, attributeSet, com.logistics.rider.glovo.R.attr.materialButtonToggleGroupStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, com.logistics.rider.glovo.R.attr.materialButtonToggleGroupStyle);
        this.MediaMetadataCompat = new ArrayList();
        this.RatingCompat = new PinnableContainerKtLocalPinnableContainer1(16, this);
        this.MediaBrowserCompatMediaItem = new LinkedHashSet();
        this.read = new h$c(2, this);
        this.MediaSessionCompatToken = false;
        this.write = new HashSet();
        TypedArray typedArray = getDeactivateOutOfFrameNjRlDlw.read(getContext(), attributeSet, setMeasuredSizeozmzZPI.MaterialButtonToggleGroup, com.logistics.rider.glovo.R.attr.materialButtonToggleGroupStyle, com.logistics.rider.glovo.R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArray.getBoolean(3, false));
        this.IconCompatParcelizer = typedArray.getResourceId(1, -1);
        this.MediaSessionCompatQueueItem = typedArray.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArray.getBoolean(0, true));
        typedArray.recycle();
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (IconCompatParcelizer(i)) {
                return i;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            materialButton.setId(View.generateViewId());
        }
    }

    public final void IconCompatParcelizer(int i, boolean z) {
        if (i == -1) {
            SentryLogcatAdapter.serializer("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.write);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.MediaDescriptionCompat && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.MediaSessionCompatQueueItem || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        updateCheckedIds(hashSet);
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (IconCompatParcelizer(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            SentryLogcatAdapter.serializer("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        IconCompatParcelizer(materialButton.getId(), materialButton.MediaSessionCompatQueueItem);
        SubcomposeLayoutPausableCompositionException shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.MediaMetadataCompat.add(new RectRulersKt(shapeAppearanceModel.MediaDescriptionCompat, shapeAppearanceModel.write, shapeAppearanceModel.PlaybackStateCompat, shapeAppearanceModel.read));
        materialButton.setEnabled(isEnabled());
        FocusPropertiesNode.write(materialButton, new MaterialCalendar.AnonymousClass6(3, this));
    }

    public final void serializer() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
