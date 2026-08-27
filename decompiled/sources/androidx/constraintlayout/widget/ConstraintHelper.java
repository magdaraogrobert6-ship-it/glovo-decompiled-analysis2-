package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Arrays;
import java.util.HashMap;
import o.BeyondBoundsLayoutKt;
import o.searchBeyondBoundsOMvw8;
import o.setAlignment;
import o.setPainter;
import o.shadows4CzXIIdefault;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintHelper extends View {
    public String MediaBrowserCompatMediaItem;
    public setPainter MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int[] MediaSessionCompatQueueItem;
    public Context PlaybackStateCompatCustomAction;
    public HashMap RatingCompat;
    public int RemoteActionCompatParcelizer;

    public void RemoteActionCompatParcelizer(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public abstract void serializer(setAlignment setalignment, boolean z);

    public void setReferencedIds(int[] iArr) {
        this.MediaBrowserCompatMediaItem = null;
        this.RemoteActionCompatParcelizer = 0;
        for (int i : iArr) {
            serializer(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    public final void addID(String str) {
        int identifier;
        HashMap map;
        Context context = this.PlaybackStateCompatCustomAction;
        if (str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = constraintLayout.MediaMetadataCompat) == null || !map.containsKey(strTrim)) ? null : constraintLayout.MediaMetadataCompat.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            } else {
                identifier = 0;
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = IconCompatParcelizer(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = searchBeyondBoundsOMvw8.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.RatingCompat.put(Integer.valueOf(identifier), strTrim);
            serializer(identifier);
        } else {
            SentryLogcatAdapter.IconCompatParcelizer("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.MediaSessionCompatQueueItem, this.RemoteActionCompatParcelizer);
    }

    public void write(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, BeyondBoundsLayoutKt.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.MediaBrowserCompatMediaItem = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.MediaMetadataCompat = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final int IconCompatParcelizer(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.PlaybackStateCompatCustomAction.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.MediaBrowserCompatMediaItem;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.MediaMetadataCompat;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public final void applyLayoutFeatures(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.RemoteActionCompatParcelizer; i++) {
            View view = (View) constraintLayout.serializer.get(this.MediaSessionCompatQueueItem[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaSessionCompatQueueItem = new int[32];
        this.RatingCompat = new HashMap();
        this.PlaybackStateCompatCustomAction = context;
        write(attributeSet);
    }

    public final void RemoteActionCompatParcelizer() {
        if (this.MediaDescriptionCompat == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof shadows4CzXIIdefault) {
            ((shadows4CzXIIdefault) layoutParams).onBackPressedInput_delegatelambda0 = this.MediaDescriptionCompat;
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.MediaBrowserCompatMediaItem == null) {
            serializer(i);
        }
    }

    public void setIds(String str) {
        this.MediaBrowserCompatMediaItem = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.RemoteActionCompatParcelizer = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                addID(str.substring(i));
                return;
            } else {
                addID(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.MediaMetadataCompat = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.RemoteActionCompatParcelizer = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                RemoteActionCompatParcelizer(str.substring(i));
                return;
            } else {
                RemoteActionCompatParcelizer(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public final void serializer(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.RemoteActionCompatParcelizer;
        int[] iArr = this.MediaSessionCompatQueueItem;
        if (i2 + 1 > iArr.length) {
            this.MediaSessionCompatQueueItem = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.MediaSessionCompatQueueItem;
        int i3 = this.RemoteActionCompatParcelizer;
        iArr2[i3] = i;
        this.RemoteActionCompatParcelizer = i3 + 1;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        if (str.length() == 0 || this.PlaybackStateCompatCustomAction == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            SentryLogcatAdapter.IconCompatParcelizer("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof shadows4CzXIIdefault) && strTrim.equals(((shadows4CzXIIdefault) layoutParams).PlaybackStateCompatCustomAction)) {
                if (childAt.getId() == -1) {
                    SentryLogcatAdapter.IconCompatParcelizer("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    serializer(childAt.getId());
                }
            }
        }
    }
}
