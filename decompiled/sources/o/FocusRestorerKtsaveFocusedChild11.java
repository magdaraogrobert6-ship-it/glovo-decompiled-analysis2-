package o;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRestorerKtsaveFocusedChild11 {
    public final AccessibilityNodeInfo write;
    public int RemoteActionCompatParcelizer = -1;
    public int IconCompatParcelizer = -1;

    public final ArrayList IconCompatParcelizer(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.write;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void IconCompatParcelizer(int i, boolean z) {
        Bundle extras = this.write.getExtras();
        if (extras != null) {
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", ((~i) & extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0)) | (z ? i : 0));
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.write.setScrollable(z);
    }

    public final void RemoteActionCompatParcelizer(CharSequence charSequence) {
        this.write.setText(charSequence);
    }

    public final void read(android.graphics.Rect rect) {
        this.write.getBoundsInParent(rect);
    }

    public final void read(CharSequence charSequence) {
        this.write.setClassName(charSequence);
    }

    public final boolean serializer(int i) {
        Bundle extras = this.write.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final CharSequence write() {
        boolean zIsEmpty = IconCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.write;
        if (zIsEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList arrayListIconCompatParcelizer = IconCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList arrayListIconCompatParcelizer2 = IconCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList arrayListIconCompatParcelizer3 = IconCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList arrayListIconCompatParcelizer4 = IconCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < arrayListIconCompatParcelizer.size(); i++) {
            spannableString.setSpan(new focusRestorerdefault(((Integer) arrayListIconCompatParcelizer4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) arrayListIconCompatParcelizer.get(i)).intValue(), ((Integer) arrayListIconCompatParcelizer2.get(i)).intValue(), ((Integer) arrayListIconCompatParcelizer3.get(i)).intValue());
        }
        return spannableString;
    }

    public final void write(FocusRestorerNode focusRestorerNode) {
        this.write.addAction((AccessibilityNodeInfo.AccessibilityAction) focusRestorerNode.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
    }

    public FocusRestorerKtsaveFocusedChild11(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.write = accessibilityNodeInfo;
    }

    public final void IconCompatParcelizer(FocusRestorerNodeonExit1 focusRestorerNodeonExit1) {
        this.write.setCollectionItemInfo(focusRestorerNodeonExit1 == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) focusRestorerNodeonExit1.write);
    }

    public final void RemoteActionCompatParcelizer(getHasFocus gethasfocus) {
        this.write.setCollectionInfo(gethasfocus == null ? null : (AccessibilityNodeInfo.CollectionInfo) gethasfocus.IconCompatParcelizer);
    }

    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        int iRemoteActionCompatParcelizer;
        String str;
        boolean zWrite;
        int iIconCompatParcelizer;
        CharSequence charSequence3;
        boolean zSerializer;
        boolean zSerializer2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        android.graphics.Rect rect = new android.graphics.Rect();
        read(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.write;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            IntervalTree.write(accessibilityNodeInfo, rect);
        } else {
            android.graphics.Rect rect2 = (android.graphics.Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(write());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (i >= 30) {
            charSequence = getFocusRect.serializer(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        if (i >= 36) {
            charSequence2 = FocusEventModifierNodeKt.read(accessibilityNodeInfo);
        } else {
            charSequence2 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
        }
        sb.append(charSequence2);
        sb.append("; tooltipText: ");
        sb.append(accessibilityNodeInfo.getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (i >= 33) {
            string = VideoCaptureExternalSyntheticLambda5.RemoteActionCompatParcelizer(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        if (i >= 36) {
            iRemoteActionCompatParcelizer = FocusEventModifierNodeKt.RemoteActionCompatParcelizer(accessibilityNodeInfo);
        } else {
            iRemoteActionCompatParcelizer = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        }
        String str2 = "PARTIAL";
        if (iRemoteActionCompatParcelizer == 1) {
            str = "TRUE";
        } else if (iRemoteActionCompatParcelizer == 2) {
            str = "PARTIAL";
        } else {
            str = "FALSE";
        }
        sb.append(str);
        sb.append("; fieldRequired: ");
        if (i >= 36) {
            zWrite = FocusEventModifierNodeKt.write(accessibilityNodeInfo);
        } else {
            zWrite = accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
        }
        sb.append(zWrite);
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        if (i >= 36) {
            iIconCompatParcelizer = FocusEventModifierNodeKt.IconCompatParcelizer(accessibilityNodeInfo);
        } else {
            iIconCompatParcelizer = accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        }
        if (iIconCompatParcelizer == 0) {
            str2 = "UNDEFINED";
        } else if (iIconCompatParcelizer == 1) {
            str2 = "COLLAPSED";
        } else if (iIconCompatParcelizer != 2) {
            if (iIconCompatParcelizer != 3) {
                str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            } else {
                str2 = "FULL";
            }
        }
        sb.append(str2);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        if (i >= 34) {
            charSequence3 = IntervalTree.serializer(accessibilityNodeInfo);
        } else {
            charSequence3 = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(serializer(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i >= 33) {
            zSerializer = VideoCaptureExternalSyntheticLambda5.serializer(accessibilityNodeInfo);
        } else {
            zSerializer = serializer(8388608);
        }
        sb.append(zSerializer);
        sb.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            zSerializer2 = IntervalTree.IconCompatParcelizer(accessibilityNodeInfo);
        } else {
            zSerializer2 = serializer(64);
        }
        sb.append(zSerializer2);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new FocusRestorerNode(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            FocusRestorerNode focusRestorerNode = (FocusRestorerNode) arrayList.get(i3);
            int i4 = focusRestorerNode.read();
            Object obj = focusRestorerNode.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
            String string2 = read(i4);
            if (string2.equals("ACTION_UNKNOWN")) {
                AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) obj;
                if (accessibilityAction.getLabel() != null) {
                    string2 = accessibilityAction.getLabel().toString();
                }
            }
            sb.append(string2);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.write;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void read() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.write.setTextEntryKey(true);
        } else {
            IconCompatParcelizer(8, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FocusRestorerKtsaveFocusedChild11)) {
            return false;
        }
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11 = (FocusRestorerKtsaveFocusedChild11) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.write;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.IconCompatParcelizer == focusRestorerKtsaveFocusedChild11.IconCompatParcelizer && this.RemoteActionCompatParcelizer == focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer;
    }

    public final void write(int i) {
        this.write.addAction(i);
    }

    public static String read(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i != 2) {
            switch (i) {
                case 4:
                    return "ACTION_SELECT";
                case 8:
                    return "ACTION_CLEAR_SELECTION";
                case 16:
                    return "ACTION_CLICK";
                case 32:
                    return "ACTION_LONG_CLICK";
                case 64:
                    return "ACTION_ACCESSIBILITY_FOCUS";
                case androidx.compose.ui.graphics.Fields.SpotShadowColor /* 128 */:
                    return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                case androidx.compose.ui.graphics.Fields.RotationX /* 256 */:
                    return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                case androidx.compose.ui.graphics.Fields.RotationY /* 512 */:
                    return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                case androidx.compose.ui.graphics.Fields.RotationZ /* 1024 */:
                    return "ACTION_NEXT_HTML_ELEMENT";
                case androidx.compose.ui.graphics.Fields.CameraDistance /* 2048 */:
                    return "ACTION_PREVIOUS_HTML_ELEMENT";
                case androidx.compose.ui.graphics.Fields.TransformOrigin /* 4096 */:
                    return "ACTION_SCROLL_FORWARD";
                case 8192:
                    return "ACTION_SCROLL_BACKWARD";
                case androidx.compose.ui.graphics.Fields.Clip /* 16384 */:
                    return "ACTION_COPY";
                case androidx.compose.ui.graphics.Fields.CompositingStrategy /* 32768 */:
                    return "ACTION_PASTE";
                case 65536:
                    return "ACTION_CUT";
                case androidx.compose.ui.graphics.Fields.RenderEffect /* 131072 */:
                    return "ACTION_SET_SELECTION";
                case androidx.compose.ui.graphics.Fields.ColorFilter /* 262144 */:
                    return "ACTION_EXPAND";
                case androidx.compose.ui.graphics.Fields.BlendMode /* 524288 */:
                    return "ACTION_COLLAPSE";
                case 2097152:
                    return "ACTION_SET_TEXT";
                case android.R.id.accessibilityActionMoveWindow:
                    return "ACTION_MOVE_WINDOW";
                default:
                    switch (i) {
                        case android.R.id.accessibilityActionShowOnScreen:
                            return "ACTION_SHOW_ON_SCREEN";
                        case android.R.id.accessibilityActionScrollToPosition:
                            return "ACTION_SCROLL_TO_POSITION";
                        case android.R.id.accessibilityActionScrollUp:
                            return "ACTION_SCROLL_UP";
                        case android.R.id.accessibilityActionScrollLeft:
                            return "ACTION_SCROLL_LEFT";
                        case android.R.id.accessibilityActionScrollDown:
                            return "ACTION_SCROLL_DOWN";
                        case android.R.id.accessibilityActionScrollRight:
                            return "ACTION_SCROLL_RIGHT";
                        case android.R.id.accessibilityActionContextClick:
                            return "ACTION_CONTEXT_CLICK";
                        case android.R.id.accessibilityActionSetProgress:
                            return "ACTION_SET_PROGRESS";
                        default:
                            switch (i) {
                                case android.R.id.accessibilityActionShowTooltip:
                                    return "ACTION_SHOW_TOOLTIP";
                                case android.R.id.accessibilityActionHideTooltip:
                                    return "ACTION_HIDE_TOOLTIP";
                                case android.R.id.accessibilityActionPageUp:
                                    return "ACTION_PAGE_UP";
                                case android.R.id.accessibilityActionPageDown:
                                    return "ACTION_PAGE_DOWN";
                                case android.R.id.accessibilityActionPageLeft:
                                    return "ACTION_PAGE_LEFT";
                                case android.R.id.accessibilityActionPageRight:
                                    return "ACTION_PAGE_RIGHT";
                                case android.R.id.accessibilityActionPressAndHold:
                                    return "ACTION_PRESS_AND_HOLD";
                                default:
                                    switch (i) {
                                        case android.R.id.accessibilityActionImeEnter:
                                            return "ACTION_IME_ENTER";
                                        case android.R.id.accessibilityActionDragStart:
                                            return "ACTION_DRAG_START";
                                        case android.R.id.accessibilityActionDragDrop:
                                            return "ACTION_DRAG_DROP";
                                        case android.R.id.accessibilityActionDragCancel:
                                            return "ACTION_DRAG_CANCEL";
                                        default:
                                            switch (i) {
                                                case android.R.id.accessibilityActionScrollInDirection:
                                                    return "ACTION_SCROLL_IN_DIRECTION";
                                                case android.R.id.ALT:
                                                    return "ACTION_SET_EXTENDED_SELECTION";
                                                default:
                                                    return "ACTION_UNKNOWN";
                                            }
                                    }
                            }
                    }
            }
        }
        return "ACTION_CLEAR_FOCUS";
    }
}
