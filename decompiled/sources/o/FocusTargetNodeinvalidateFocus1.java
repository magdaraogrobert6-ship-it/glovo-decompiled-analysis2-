package o;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.transition.Transition$1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.android.core.ActivityLifecycleIntegration$$ExternalSyntheticLambda1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FocusTargetNodeinvalidateFocus1 extends androidx.core.view.AccessibilityDelegateCompat {
    public static final android.graphics.Rect RemoteActionCompatParcelizer = new android.graphics.Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final Transition$1 read;
    public static final toContentCaptureSession write;
    public FocusTargetNodeWhenMappings MediaSessionCompatQueueItem;
    public final android.view.accessibility.AccessibilityManager RatingCompat;
    public final RootMeasurePolicy serializer;
    public final android.graphics.Rect MediaSessionCompatToken = new android.graphics.Rect();
    public final android.graphics.Rect MediaSessionCompatResultReceiverWrapper = new android.graphics.Rect();
    public final android.graphics.Rect PlaybackStateCompatCustomAction = new android.graphics.Rect();
    public final int[] MediaMetadataCompat = new int[2];
    public int IconCompatParcelizer = Integer.MIN_VALUE;
    public int MediaBrowserCompatMediaItem = Integer.MIN_VALUE;
    public int MediaDescriptionCompat = Integer.MIN_VALUE;

    public abstract void IconCompatParcelizer(ArrayList arrayList);

    public abstract void read(int i, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11);

    public final boolean read(int i) {
        int i2;
        RootMeasurePolicy rootMeasurePolicy = this.serializer;
        if ((!rootMeasurePolicy.isFocused() && !rootMeasurePolicy.requestFocus()) || (i2 = this.MediaBrowserCompatMediaItem) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            serializer(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.MediaBrowserCompatMediaItem = i;
        RootMeasurePolicymeasure1 rootMeasurePolicymeasure1 = (RootMeasurePolicymeasure1) this;
        if (i == 1) {
            RootMeasurePolicy rootMeasurePolicy2 = rootMeasurePolicymeasure1.PlaybackStateCompat;
            rootMeasurePolicy2.MediaBrowserCompatMediaItem = true;
            rootMeasurePolicy2.refreshDrawableState();
        }
        read(i, 8);
        return true;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        RootMeasurePolicy rootMeasurePolicy = ((RootMeasurePolicymeasure1) this).PlaybackStateCompat;
        RulerScope rulerScope = rootMeasurePolicy.RatingCompat;
        focusRestorerKtsaveFocusedChild11.write.setCheckable(rulerScope != null && rulerScope.IconCompatParcelizer);
        focusRestorerKtsaveFocusedChild11.write.setClickable(rootMeasurePolicy.isClickable());
        focusRestorerKtsaveFocusedChild11.read(rootMeasurePolicy.getAccessibilityClassName());
        focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer(rootMeasurePolicy.getText());
    }

    public final FocusRestorerKtsaveFocusedChild11 write(int i) {
        if (i == -1) {
            RootMeasurePolicy rootMeasurePolicy = this.serializer;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(rootMeasurePolicy);
            FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11 = new FocusRestorerKtsaveFocusedChild11(accessibilityNodeInfoObtain);
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            rootMeasurePolicy.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            ArrayList arrayList = new ArrayList();
            IconCompatParcelizer(arrayList);
            if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Views cannot have both real and virtual children");
                return null;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                focusRestorerKtsaveFocusedChild11.write.addChild(rootMeasurePolicy, ((Integer) arrayList.get(i2)).intValue());
            }
            return focusRestorerKtsaveFocusedChild11;
        }
        return IconCompatParcelizer(i);
    }

    public final void read(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.RatingCompat.isEnabled() || (parent = (view = this.serializer).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11Write = write(i);
            accessibilityEventObtain.getText().add(focusRestorerKtsaveFocusedChild11Write.write());
            AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11Write.write;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                return;
            } else {
                accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
                accessibilityEventObtain.setSource(view, i);
                accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            }
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    public FocusTargetNodeinvalidateFocus1(RootMeasurePolicy rootMeasurePolicy) {
        this.serializer = rootMeasurePolicy;
        this.RatingCompat = (android.view.accessibility.AccessibilityManager) rootMeasurePolicy.getContext().getSystemService("accessibility");
        rootMeasurePolicy.setFocusable(true);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        if (rootMeasurePolicy.getImportantForAccessibility() == 0) {
            rootMeasurePolicy.setImportantForAccessibility(1);
        }
    }

    public final FocusRestorerKtsaveFocusedChild11 IconCompatParcelizer(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11 = new FocusRestorerKtsaveFocusedChild11(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        focusRestorerKtsaveFocusedChild11.read(androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        android.graphics.Rect rect = RemoteActionCompatParcelizer;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer = -1;
        RootMeasurePolicy rootMeasurePolicy = this.serializer;
        accessibilityNodeInfoObtain.setParent(rootMeasurePolicy);
        read(i, focusRestorerKtsaveFocusedChild11);
        if (focusRestorerKtsaveFocusedChild11.write() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        android.graphics.Rect rect2 = this.MediaSessionCompatResultReceiverWrapper;
        focusRestorerKtsaveFocusedChild11.read(rect2);
        if (rect2.equals(rect)) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & androidx.compose.ui.graphics.Fields.SpotShadowColor) != 0) {
            ActivityLifecycleIntegration$$ExternalSyntheticLambda1.serializer("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(rootMeasurePolicy.getContext().getPackageName());
        focusRestorerKtsaveFocusedChild11.IconCompatParcelizer = i;
        accessibilityNodeInfoObtain.setSource(rootMeasurePolicy, i);
        if (this.IconCompatParcelizer == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            focusRestorerKtsaveFocusedChild11.write(androidx.compose.ui.graphics.Fields.SpotShadowColor);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            focusRestorerKtsaveFocusedChild11.write(64);
        }
        boolean z = this.MediaBrowserCompatMediaItem == i;
        if (z) {
            focusRestorerKtsaveFocusedChild11.write(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            focusRestorerKtsaveFocusedChild11.write(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.MediaMetadataCompat;
        rootMeasurePolicy.getLocationOnScreen(iArr);
        android.graphics.Rect rect3 = this.MediaSessionCompatToken;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            focusRestorerKtsaveFocusedChild11.read(rect3);
            if (focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer != -1) {
                FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild12 = new FocusRestorerKtsaveFocusedChild11(AccessibilityNodeInfo.obtain());
                for (int i2 = focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer; i2 != -1; i2 = focusRestorerKtsaveFocusedChild12.RemoteActionCompatParcelizer) {
                    focusRestorerKtsaveFocusedChild12.RemoteActionCompatParcelizer = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild12.write;
                    accessibilityNodeInfo.setParent(rootMeasurePolicy, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    read(i2, focusRestorerKtsaveFocusedChild12);
                    focusRestorerKtsaveFocusedChild12.read(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - rootMeasurePolicy.getScrollX(), iArr[1] - rootMeasurePolicy.getScrollY());
        }
        android.graphics.Rect rect4 = this.PlaybackStateCompatCustomAction;
        if (rootMeasurePolicy.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - rootMeasurePolicy.getScrollX(), iArr[1] - rootMeasurePolicy.getScrollY());
            if (rect3.intersect(rect4)) {
                AccessibilityNodeInfo accessibilityNodeInfo2 = focusRestorerKtsaveFocusedChild11.write;
                accessibilityNodeInfo2.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && rootMeasurePolicy.getWindowVisibility() == 0) {
                    Object parent = rootMeasurePolicy.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfo2.setVisibleToUser(true);
                    }
                }
            }
        }
        return focusRestorerKtsaveFocusedChild11;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = new FocusTargetNodeWhenMappings(this);
        }
        return this.MediaSessionCompatQueueItem;
    }

    static {
        int i = 9;
        read = new Transition$1(i);
        write = new toContentCaptureSession(i);
    }

    public final boolean serializer(int i) {
        if (this.MediaBrowserCompatMediaItem != i) {
            return false;
        }
        this.MediaBrowserCompatMediaItem = Integer.MIN_VALUE;
        RootMeasurePolicymeasure1 rootMeasurePolicymeasure1 = (RootMeasurePolicymeasure1) this;
        if (i == 1) {
            RootMeasurePolicy rootMeasurePolicy = rootMeasurePolicymeasure1.PlaybackStateCompat;
            rootMeasurePolicy.MediaBrowserCompatMediaItem = false;
            rootMeasurePolicy.refreshDrawableState();
        }
        read(i, 8);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0101  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [boolean, int] */
    public final boolean write(int i, android.graphics.Rect rect) {
        int i2;
        Object obj;
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11;
        ?? r10;
        android.graphics.Rect rect2;
        int iWrite;
        android.graphics.Rect rect3;
        int i3;
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild12;
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild13;
        int iIconCompatParcelizer;
        int iWrite2;
        int iIconCompatParcelizer2;
        int iWrite3;
        ArrayList arrayList = new ArrayList();
        IconCompatParcelizer(arrayList);
        accessprocessDragStart accessprocessdragstart = new accessprocessDragStart(0);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            accessprocessdragstart.RemoteActionCompatParcelizer(((Integer) arrayList.get(i4)).intValue(), IconCompatParcelizer(((Integer) arrayList.get(i4)).intValue()));
        }
        int i5 = this.MediaBrowserCompatMediaItem;
        int iIconCompatParcelizer3 = Integer.MIN_VALUE;
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild14 = i5 == Integer.MIN_VALUE ? null : (FocusRestorerKtsaveFocusedChild11) isInterested.RemoteActionCompatParcelizer(accessprocessdragstart, i5);
        Transition$1 transition$1 = read;
        toContentCaptureSession tocontentcapturesession = write;
        RootMeasurePolicy rootMeasurePolicy = this.serializer;
        int i6 = -1;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            android.graphics.Rect rect4 = new android.graphics.Rect();
            int i7 = this.MediaBrowserCompatMediaItem;
            if (i7 != Integer.MIN_VALUE) {
                write(i7).read(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = rootMeasurePolicy.getWidth();
                    int height = rootMeasurePolicy.getHeight();
                    if (i == 17) {
                        r10 = 0;
                        rect4.set(width, 0, width, height);
                    } else if (i == 33) {
                        r10 = 0;
                        rect4.set(0, height, width, height);
                    } else if (i == 66) {
                        r10 = 0;
                        rect4.set(-1, 0, -1, height);
                    } else if (i == 130) {
                        r10 = 0;
                        rect4.set(0, -1, width, -1);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
                rect2 = new android.graphics.Rect(rect4);
                if (i != 17) {
                    rect2.offset(rect4.width() + 1, r10);
                } else if (i != 33) {
                    rect2.offset(r10, rect4.height() + 1);
                } else if (i != 66) {
                    rect2.offset(-(rect4.width() + 1), r10);
                } else if (i == 130) {
                    rect2.offset(r10, -(rect4.height() + 1));
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return r10;
                }
                tocontentcapturesession.getClass();
                iWrite = accessprocessdragstart.write();
                rect3 = new android.graphics.Rect();
                focusRestorerKtsaveFocusedChild12 = null;
                for (i3 = 0; i3 < iWrite; i3++) {
                    focusRestorerKtsaveFocusedChild13 = (FocusRestorerKtsaveFocusedChild11) accessprocessdragstart.read(i3);
                    if (focusRestorerKtsaveFocusedChild13 == focusRestorerKtsaveFocusedChild14) {
                        transition$1.getClass();
                        focusRestorerKtsaveFocusedChild13.read(rect3);
                        if (io.sentry.util.RatingCompat.serializer(i, rect4, rect3)) {
                            if (io.sentry.util.RatingCompat.serializer(i, rect4, rect2) && !io.sentry.util.RatingCompat.write(i, rect4, rect3, rect2)) {
                                if (io.sentry.util.RatingCompat.write(i, rect4, rect2, rect3)) {
                                    iIconCompatParcelizer = io.sentry.util.RatingCompat.IconCompatParcelizer(i, rect4, rect3);
                                    iWrite2 = io.sentry.util.RatingCompat.write(i, rect4, rect3);
                                    iIconCompatParcelizer2 = io.sentry.util.RatingCompat.IconCompatParcelizer(i, rect4, rect2);
                                    iWrite3 = io.sentry.util.RatingCompat.write(i, rect4, rect2);
                                    if ((iWrite2 * iWrite2) + (iIconCompatParcelizer * 13 * iIconCompatParcelizer) < (iWrite3 * iWrite3) + (iIconCompatParcelizer2 * 13 * iIconCompatParcelizer2)) {
                                        rect2.set(rect3);
                                        focusRestorerKtsaveFocusedChild12 = focusRestorerKtsaveFocusedChild13;
                                    }
                                }
                            } else {
                                rect2.set(rect3);
                                focusRestorerKtsaveFocusedChild12 = focusRestorerKtsaveFocusedChild13;
                            }
                        }
                    }
                }
                focusRestorerKtsaveFocusedChild11 = focusRestorerKtsaveFocusedChild12;
                i2 = 0;
            }
            r10 = 0;
            rect2 = new android.graphics.Rect(rect4);
            if (i != 17) {
                rect2.offset(rect4.width() + 1, r10);
            } else if (i != 33) {
                rect2.offset(r10, rect4.height() + 1);
            } else if (i != 66) {
                rect2.offset(-(rect4.width() + 1), r10);
            } else if (i == 130) {
                rect2.offset(r10, -(rect4.height() + 1));
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return r10;
            }
            tocontentcapturesession.getClass();
            iWrite = accessprocessdragstart.write();
            rect3 = new android.graphics.Rect();
            focusRestorerKtsaveFocusedChild12 = null;
            while (i3 < iWrite) {
                focusRestorerKtsaveFocusedChild13 = (FocusRestorerKtsaveFocusedChild11) accessprocessdragstart.read(i3);
                if (focusRestorerKtsaveFocusedChild13 == focusRestorerKtsaveFocusedChild14) {
                    transition$1.getClass();
                    focusRestorerKtsaveFocusedChild13.read(rect3);
                    if (io.sentry.util.RatingCompat.serializer(i, rect4, rect3)) {
                        if (io.sentry.util.RatingCompat.serializer(i, rect4, rect2)) {
                            if (io.sentry.util.RatingCompat.write(i, rect4, rect2, rect3)) {
                                iIconCompatParcelizer = io.sentry.util.RatingCompat.IconCompatParcelizer(i, rect4, rect3);
                                iWrite2 = io.sentry.util.RatingCompat.write(i, rect4, rect3);
                                iIconCompatParcelizer2 = io.sentry.util.RatingCompat.IconCompatParcelizer(i, rect4, rect2);
                                iWrite3 = io.sentry.util.RatingCompat.write(i, rect4, rect2);
                                if ((iWrite2 * iWrite2) + (iIconCompatParcelizer * 13 * iIconCompatParcelizer) < (iWrite3 * iWrite3) + (iIconCompatParcelizer2 * 13 * iIconCompatParcelizer2)) {
                                    rect2.set(rect3);
                                    focusRestorerKtsaveFocusedChild12 = focusRestorerKtsaveFocusedChild13;
                                }
                            }
                        } else {
                            rect2.set(rect3);
                            focusRestorerKtsaveFocusedChild12 = focusRestorerKtsaveFocusedChild13;
                        }
                    }
                }
            }
            focusRestorerKtsaveFocusedChild11 = focusRestorerKtsaveFocusedChild12;
            i2 = 0;
        } else {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            boolean z = rootMeasurePolicy.getLayoutDirection() == 1;
            tocontentcapturesession.getClass();
            int iWrite4 = accessprocessdragstart.write();
            ArrayList arrayList2 = new ArrayList(iWrite4);
            for (int i8 = 0; i8 < iWrite4; i8++) {
                arrayList2.add((FocusRestorerKtsaveFocusedChild11) accessprocessdragstart.read(i8));
            }
            Collections.sort(arrayList2, new setPreviouslyFocusedChildHash(z, transition$1));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (focusRestorerKtsaveFocusedChild14 != null) {
                    size = arrayList2.indexOf(focusRestorerKtsaveFocusedChild14);
                }
                int i9 = size - 1;
                obj = i9 >= 0 ? arrayList2.get(i9) : null;
            } else if (i == 2) {
                int size2 = arrayList2.size();
                int iLastIndexOf = (focusRestorerKtsaveFocusedChild14 == null ? -1 : arrayList2.lastIndexOf(focusRestorerKtsaveFocusedChild14)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                return false;
            }
            focusRestorerKtsaveFocusedChild11 = (FocusRestorerKtsaveFocusedChild11) obj;
        }
        if (focusRestorerKtsaveFocusedChild11 != null) {
            if (accessprocessdragstart.write) {
                isInterested.read(accessprocessdragstart);
            }
            int i10 = accessprocessdragstart.serializer;
            for (int i11 = i2; i11 < i10; i11++) {
                if (accessprocessdragstart.read[i11] == focusRestorerKtsaveFocusedChild11) {
                    i6 = i11;
                    break;
                }
            }
            iIconCompatParcelizer3 = accessprocessdragstart.IconCompatParcelizer(i6);
        }
        return read(iIconCompatParcelizer3);
    }
}
