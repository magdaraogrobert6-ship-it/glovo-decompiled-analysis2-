package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusPropertiesNode {
    public static Field IconCompatParcelizer = null;
    public static WeakHashMap RatingCompat = null;
    public static boolean RemoteActionCompatParcelizer = false;
    public static final int[] serializer = {com.logistics.rider.glovo.R.id.accessibility_custom_action_0, com.logistics.rider.glovo.R.id.accessibility_custom_action_1, com.logistics.rider.glovo.R.id.accessibility_custom_action_2, com.logistics.rider.glovo.R.id.accessibility_custom_action_3, com.logistics.rider.glovo.R.id.accessibility_custom_action_4, com.logistics.rider.glovo.R.id.accessibility_custom_action_5, com.logistics.rider.glovo.R.id.accessibility_custom_action_6, com.logistics.rider.glovo.R.id.accessibility_custom_action_7, com.logistics.rider.glovo.R.id.accessibility_custom_action_8, com.logistics.rider.glovo.R.id.accessibility_custom_action_9, com.logistics.rider.glovo.R.id.accessibility_custom_action_10, com.logistics.rider.glovo.R.id.accessibility_custom_action_11, com.logistics.rider.glovo.R.id.accessibility_custom_action_12, com.logistics.rider.glovo.R.id.accessibility_custom_action_13, com.logistics.rider.glovo.R.id.accessibility_custom_action_14, com.logistics.rider.glovo.R.id.accessibility_custom_action_15, com.logistics.rider.glovo.R.id.accessibility_custom_action_16, com.logistics.rider.glovo.R.id.accessibility_custom_action_17, com.logistics.rider.glovo.R.id.accessibility_custom_action_18, com.logistics.rider.glovo.R.id.accessibility_custom_action_19, com.logistics.rider.glovo.R.id.accessibility_custom_action_20, com.logistics.rider.glovo.R.id.accessibility_custom_action_21, com.logistics.rider.glovo.R.id.accessibility_custom_action_22, com.logistics.rider.glovo.R.id.accessibility_custom_action_23, com.logistics.rider.glovo.R.id.accessibility_custom_action_24, com.logistics.rider.glovo.R.id.accessibility_custom_action_25, com.logistics.rider.glovo.R.id.accessibility_custom_action_26, com.logistics.rider.glovo.R.id.accessibility_custom_action_27, com.logistics.rider.glovo.R.id.accessibility_custom_action_28, com.logistics.rider.glovo.R.id.accessibility_custom_action_29, com.logistics.rider.glovo.R.id.accessibility_custom_action_30, com.logistics.rider.glovo.R.id.accessibility_custom_action_31};
    public static final FocusPropertiesModifierNodeKt write = new InterfaceC0164focusProperties() { // from class: o.FocusPropertiesModifierNodeKt
        @Override // o.InterfaceC0164focusProperties
        public final FocusOwnerKt serializer(FocusOwnerKt focusOwnerKt) {
            return focusOwnerKt;
        }
    };
    public static final FocusPropertiesScope read = new FocusPropertiesScope();

    public static void read(View view, FocusRestorerNode focusRestorerNode, isCaptured iscaptured) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat;
        if (iscaptured == null) {
            write(focusRestorerNode.read(), view);
            return;
        }
        FocusRestorerNode focusRestorerNode2 = new FocusRestorerNode(null, focusRestorerNode.ResultReceiver, null, iscaptured, focusRestorerNode.ComponentActivity);
        View.AccessibilityDelegate accessibilityDelegateSerializer = serializer(view);
        if (accessibilityDelegateSerializer == null) {
            accessibilityDelegateCompat = null;
        } else {
            accessibilityDelegateCompat = accessibilityDelegateSerializer instanceof is1dFocusSearch3ESFkO8 ? ((is1dFocusSearch3ESFkO8) accessibilityDelegateSerializer).RemoteActionCompatParcelizer : new androidx.core.view.AccessibilityDelegateCompat(accessibilityDelegateSerializer);
        }
        if (accessibilityDelegateCompat == null) {
            accessibilityDelegateCompat = new androidx.core.view.AccessibilityDelegateCompat();
        }
        write(view, accessibilityDelegateCompat);
        read(focusRestorerNode2.read(), view);
        IconCompatParcelizer(view).add(focusRestorerNode2);
        serializer(0, view);
    }

    public static void write(View view, androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (serializer(view) instanceof is1dFocusSearch3ESFkO8)) {
            accessibilityDelegateCompat = new androidx.core.view.AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    public static ArrayList IconCompatParcelizer(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(com.logistics.rider.glovo.R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(com.logistics.rider.glovo.R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FocusOwnerKt write(View view, FocusOwnerKt focusOwnerKt) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(focusOwnerKt);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return createRefs.serializer(view, focusOwnerKt);
        }
        onPlaced onplaced = (onPlaced) view.getTag(com.logistics.rider.glovo.R.id.tag_on_receive_content_listener);
        InterfaceC0164focusProperties interfaceC0164focusProperties = write;
        if (onplaced != null) {
            FocusOwnerKt focusOwnerKt2 = onplaced.read(view, focusOwnerKt);
            if (focusOwnerKt2 == null) {
                return null;
            }
            if (view instanceof InterfaceC0164focusProperties) {
                interfaceC0164focusProperties = (InterfaceC0164focusProperties) view;
            }
            return interfaceC0164focusProperties.serializer(focusOwnerKt2);
        }
        if (view instanceof InterfaceC0164focusProperties) {
            interfaceC0164focusProperties = (InterfaceC0164focusProperties) view;
        }
        return interfaceC0164focusProperties.serializer(focusOwnerKt);
    }

    public static void read(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        view2.getClass();
        view2.setTag(com.logistics.rider.glovo.R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void write(int i, View view) {
        read(i, view);
        serializer(0, view);
    }

    public static void read(int i, View view) {
        ArrayList arrayListIconCompatParcelizer = IconCompatParcelizer(view);
        for (int i2 = 0; i2 < arrayListIconCompatParcelizer.size(); i2++) {
            if (((FocusRestorerNode) arrayListIconCompatParcelizer.get(i2)).read() == i) {
                arrayListIconCompatParcelizer.remove(i2);
                return;
            }
        }
    }

    public static void read(View view, WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            component16.read(view, windowInsetsAnimationCompat$Callback);
        } else {
            component11.read(view, windowInsetsAnimationCompat$Callback);
        }
    }

    public static View.AccessibilityDelegate serializer(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return requestFocus.RemoteActionCompatParcelizer(view);
        }
        if (RemoteActionCompatParcelizer) {
            return null;
        }
        if (IconCompatParcelizer == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                IconCompatParcelizer = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                RemoteActionCompatParcelizer = true;
                return null;
            }
        }
        try {
            Object obj = IconCompatParcelizer.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            RemoteActionCompatParcelizer = true;
            return null;
        }
    }

    public static void serializer(int i, View view) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = captureFocus.IconCompatParcelizer(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : androidx.compose.ui.graphics.Fields.CameraDistance);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(captureFocus.IconCompatParcelizer(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        SentryLogcatAdapter.read("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(captureFocus.IconCompatParcelizer(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static getRedirectui write(View view) {
        if (RatingCompat == null) {
            RatingCompat = new WeakHashMap();
        }
        getRedirectui getredirectui = (getRedirectui) RatingCompat.get(view);
        if (getredirectui != null) {
            return getredirectui;
        }
        getRedirectui getredirectui2 = new getRedirectui(view);
        RatingCompat.put(view, getredirectui2);
        return getredirectui2;
    }

    public static void write(View view, FocusRequesterModifierKt focusRequesterModifierKt) {
        WindowInsets windowInsetsIconCompatParcelizer = focusRequesterModifierKt.IconCompatParcelizer();
        if (windowInsetsIconCompatParcelizer != null) {
            WindowInsets windowInsetsRemoteActionCompatParcelizer = Build.VERSION.SDK_INT >= 30 ? getFocusRequesterNodesui.RemoteActionCompatParcelizer(view, windowInsetsIconCompatParcelizer) : FocusRequester.write(view, windowInsetsIconCompatParcelizer);
            if (windowInsetsRemoteActionCompatParcelizer.equals(windowInsetsIconCompatParcelizer)) {
                return;
            }
            FocusRequesterModifierKt.write(view, windowInsetsRemoteActionCompatParcelizer);
        }
    }

    public static String[] write(AppCompatDialogFragment appCompatDialogFragment) {
        return Build.VERSION.SDK_INT >= 31 ? createRefs.write(appCompatDialogFragment) : (String[]) appCompatDialogFragment.getTag(com.logistics.rider.glovo.R.id.tag_on_receive_content_mime_types);
    }

    public static void read(View view, CharSequence charSequence) {
        new accessgetRedirectcp(com.logistics.rider.glovo.R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).write(view, charSequence);
        FocusPropertiesScope focusPropertiesScope = read;
        if (charSequence != null) {
            focusPropertiesScope.write.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(focusPropertiesScope);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(focusPropertiesScope);
                return;
            }
            return;
        }
        focusPropertiesScope.write.remove(view);
        view.removeOnAttachStateChangeListener(focusPropertiesScope);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(focusPropertiesScope);
    }

    public static void IconCompatParcelizer(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            requestFocus.IconCompatParcelizer(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }
}
