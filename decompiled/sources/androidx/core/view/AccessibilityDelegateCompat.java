package androidx.core.view;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.logistics.rider.glovo.R;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o.FocusRestorerKtsaveFocusedChild11;
import o.FocusRestorerNode;
import o.is1dFocusSearch3ESFkO8;
import o.isCaptured;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityDelegateCompat {
    private static final View.AccessibilityDelegate read = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate serializer;
    private final View.AccessibilityDelegate write;

    public View.AccessibilityDelegate getBridge() {
        return this.serializer;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.write.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.write.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new AccessibilityNodeProviderCompat(accessibilityNodeProvider);
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.write.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        this.write.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11.write);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.write.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.write.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.write.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.write.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public AccessibilityDelegateCompat(View.AccessibilityDelegate accessibilityDelegate) {
        this.write = accessibilityDelegate;
        this.serializer = new is1dFocusSearch3ESFkO8(this);
    }

    public static List<FocusRestorerNode> getActionList(View view) {
        List<FocusRestorerNode> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List<FocusRestorerNode> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < actionList.size()) {
                FocusRestorerNode focusRestorerNode = actionList.get(i2);
                if (focusRestorerNode.read() == i) {
                    Class cls = focusRestorerNode.ComponentActivity;
                    isCaptured iscaptured = focusRestorerNode.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    if (iscaptured != null) {
                        if (cls != null) {
                            try {
                                m1$$ExternalSyntheticOutline0.m(cls.getDeclaredConstructor(null).newInstance(null));
                                throw null;
                            } catch (Exception e) {
                                SentryLogcatAdapter.read("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                            }
                        }
                        zPerformAccessibilityAction = iscaptured.read(view);
                        break;
                    }
                } else {
                    i2++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.write.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public AccessibilityDelegateCompat() {
        this(read);
    }
}
