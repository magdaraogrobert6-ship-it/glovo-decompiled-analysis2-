package o;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRestorerNode {
    public static final FocusRestorerNode IconCompatParcelizer;
    public static final FocusRestorerNode MediaBrowserCompatMediaItem;
    public static final FocusRestorerNode MediaDescriptionCompat;
    public static final FocusRestorerNode MediaMetadataCompat;
    public static final FocusRestorerNode MediaSessionCompatQueueItem;
    public static final FocusRestorerNode MediaSessionCompatResultReceiverWrapper;
    public static final FocusRestorerNode MediaSessionCompatToken;
    public static final FocusRestorerNode ParcelableVolumeInfo;
    public static final FocusRestorerNode PlaybackStateCompat;
    public static final FocusRestorerNode PlaybackStateCompatCustomAction;
    public static final FocusRestorerNode RatingCompat = new FocusRestorerNode(1, (String) null);
    public static final FocusRestorerNode RemoteActionCompatParcelizer = new FocusRestorerNode(2, (String) null);
    public static final FocusRestorerNode r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public static final FocusRestorerNode read;
    public static final FocusRestorerNode serializer;
    public static final FocusRestorerNode write;
    public final Class ComponentActivity;
    public final int ResultReceiver;
    public final Object r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final isCaptured r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;

    public final int read() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys).getId();
    }

    public FocusRestorerNode(Object obj, int i, CharSequence charSequence, isCaptured iscaptured, Class cls) {
        this.ResultReceiver = i;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = iscaptured;
        if (obj == null) {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = obj;
        }
        this.ComponentActivity = cls;
    }

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityActionWrite = null;
        new FocusRestorerNode(4, (String) null);
        new FocusRestorerNode(8, (String) null);
        serializer = new FocusRestorerNode(16, (String) null);
        new FocusRestorerNode(32, (String) null);
        IconCompatParcelizer = new FocusRestorerNode(64, (String) null);
        write = new FocusRestorerNode(androidx.compose.ui.graphics.Fields.SpotShadowColor, (String) null);
        new FocusRestorerNode(isFocused.class, androidx.compose.ui.graphics.Fields.RotationX);
        new FocusRestorerNode(isFocused.class, androidx.compose.ui.graphics.Fields.RotationY);
        new FocusRestorerNode(FocusStateImpl.class, androidx.compose.ui.graphics.Fields.RotationZ);
        new FocusRestorerNode(FocusStateImpl.class, androidx.compose.ui.graphics.Fields.CameraDistance);
        ParcelableVolumeInfo = new FocusRestorerNode(androidx.compose.ui.graphics.Fields.TransformOrigin, (String) null);
        MediaSessionCompatQueueItem = new FocusRestorerNode(8192, (String) null);
        new FocusRestorerNode(androidx.compose.ui.graphics.Fields.Clip, (String) null);
        new FocusRestorerNode(androidx.compose.ui.graphics.Fields.CompositingStrategy, (String) null);
        new FocusRestorerNode(65536, (String) null);
        new FocusRestorerNode(FocusTargetModifierNodePYyLHbcdefault.class, androidx.compose.ui.graphics.Fields.RenderEffect);
        MediaMetadataCompat = new FocusRestorerNode(androidx.compose.ui.graphics.Fields.ColorFilter, (String) null);
        read = new FocusRestorerNode(androidx.compose.ui.graphics.Fields.BlendMode, (String) null);
        MediaBrowserCompatMediaItem = new FocusRestorerNode(1048576, (String) null);
        new FocusRestorerNode(FocusTargetModifierNodeKt.class, 2097152);
        new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, android.R.id.accessibilityActionShowOnScreen, null, null, null);
        MediaSessionCompatToken = new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, android.R.id.accessibilityActionScrollToPosition, null, null, getFocusabilityLCbbffg.class);
        r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, android.R.id.accessibilityActionScrollUp, null, null, null);
        PlaybackStateCompat = new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, android.R.id.accessibilityActionScrollLeft, null, null, null);
        MediaDescriptionCompat = new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, android.R.id.accessibilityActionScrollDown, null, null, null);
        PlaybackStateCompatCustomAction = new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, android.R.id.accessibilityActionScrollRight, null, null, null);
        int i = Build.VERSION.SDK_INT;
        new FocusRestorerNode(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, android.R.id.accessibilityActionPageUp, null, null, null);
        new FocusRestorerNode(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, android.R.id.accessibilityActionPageDown, null, null, null);
        new FocusRestorerNode(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, android.R.id.accessibilityActionPageLeft, null, null, null);
        new FocusRestorerNode(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, android.R.id.accessibilityActionPageRight, null, null, null);
        new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, android.R.id.accessibilityActionContextClick, null, null, null);
        new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, android.R.id.accessibilityActionSetProgress, null, null, FocusTargetModifierNode.class);
        new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, android.R.id.accessibilityActionMoveWindow, null, null, FocusStateImplWhenMappings.class);
        new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, android.R.id.accessibilityActionShowTooltip, null, null, null);
        new FocusRestorerNode(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, android.R.id.accessibilityActionHideTooltip, null, null, null);
        new FocusRestorerNode(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, android.R.id.accessibilityActionPressAndHold, null, null, null);
        new FocusRestorerNode(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, android.R.id.accessibilityActionImeEnter, null, null, null);
        new FocusRestorerNode(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, android.R.id.accessibilityActionDragStart, null, null, null);
        new FocusRestorerNode(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, android.R.id.accessibilityActionDragDrop, null, null, null);
        new FocusRestorerNode(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, android.R.id.accessibilityActionDragCancel, null, null, null);
        new FocusRestorerNode(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, android.R.id.accessibilityActionShowTextSuggestions, null, null, null);
        MediaSessionCompatResultReceiverWrapper = new FocusRestorerNode(i >= 34 ? IntervalTree.write() : null, android.R.id.accessibilityActionScrollInDirection, null, null, null);
        int i2 = getListeners.RemoteActionCompatParcelizer;
        if (i >= 36 && getRootState.RemoteActionCompatParcelizer() >= 3600001) {
            accessibilityActionWrite = FocusState.write();
        }
        new FocusRestorerNode(accessibilityActionWrite, android.R.id.ALT, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FocusRestorerNode)) {
            return false;
        }
        Object obj2 = ((FocusRestorerNode) obj).r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        Object obj3 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String string = FocusRestorerKtsaveFocusedChild11.read(this.ResultReceiver);
        if (string.equals("ACTION_UNKNOWN")) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            if (accessibilityAction.getLabel() != null) {
                string = accessibilityAction.getLabel().toString();
            }
        }
        sb.append(string);
        return sb.toString();
    }

    public FocusRestorerNode(Class cls, int i) {
        this(null, i, null, null, cls);
    }

    public FocusRestorerNode(int i, String str) {
        this(null, i, str, null, null);
    }
}
