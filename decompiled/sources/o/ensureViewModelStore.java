package o;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.camera.video.Recorder$3;
import io.sentry.SentryUUID;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ensureViewModelStore extends _init_lambda3 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o._init_lambda2, o._init_lambda1
    public void read(addContentView addcontentview, addContentView addcontentview2, Window window, View view, boolean z, boolean z2) {
        int i;
        coil3.util.ContextsKt setfocusrequester;
        addcontentview.getClass();
        addcontentview2.getClass();
        window.getClass();
        view.getClass();
        int i2 = 0;
        SentryUUID.read(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int iSerializer = addcontentview.serializer(z);
        int iSerializer2 = addcontentview2.serializer(z2);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            i = i2;
            break;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= viewGroup.getChildCount()) {
                if (iSerializer != 0 || iSerializer2 != 0) {
                    i = 0;
                    List list = androidx.sqlite.SQLite.read(new FocusTargetModifierNodeKtFocusTargetModifierNode1(2, iSerializer), new FocusTargetModifierNodeKtFocusTargetModifierNode1(1, iSerializer2), new FocusTargetModifierNodeKtFocusTargetModifierNode1(4, iSerializer2), new FocusTargetModifierNodeKtFocusTargetModifierNode1(8, iSerializer2));
                    FocusTargetNode focusTargetNode = new FocusTargetNode(((ViewGroup) view).getContext(), list);
                    focusTargetNode.setTag(list);
                    viewGroup.addView(focusTargetNode);
                    break;
                }
                i = 0;
                break;
            }
            View childAt = viewGroup.getChildAt(i3);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list2 = (List) tag;
                    if (list2.size() == 4 && (list2.get(i2) instanceof FocusTargetModifierNodeKtFocusTargetModifierNode1)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof FocusTargetModifierNodeKtFocusTargetModifierNode1 ? (FocusTargetModifierNodeKtFocusTargetModifierNode1) obj : null) != null) {
                                FocusTargetModifierNodeKtFocusTargetModifierNode1 focusTargetModifierNodeKtFocusTargetModifierNode1 = (FocusTargetModifierNodeKtFocusTargetModifierNode1) obj;
                                int i4 = focusTargetModifierNodeKtFocusTargetModifierNode1.RatingCompat;
                                accessisProcessingCustomEnterp accessisprocessingcustomenterp = focusTargetModifierNodeKtFocusTargetModifierNode1.RemoteActionCompatParcelizer;
                                ColorDrawable colorDrawable = focusTargetModifierNodeKtFocusTargetModifierNode1.serializer;
                                if (i4 == 1) {
                                    focusTargetModifierNodeKtFocusTargetModifierNode1.IconCompatParcelizer = true;
                                    if (focusTargetModifierNodeKtFocusTargetModifierNode1.write != iSerializer2) {
                                        focusTargetModifierNodeKtFocusTargetModifierNode1.write = iSerializer2;
                                        colorDrawable.setColor(iSerializer2);
                                        accessisprocessingcustomenterp.serializer = colorDrawable;
                                        Recorder$3 recorder$3 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                                        if (recorder$3 != null) {
                                            ((View) recorder$3.RemoteActionCompatParcelizer).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i4 == 2) {
                                    focusTargetModifierNodeKtFocusTargetModifierNode1.IconCompatParcelizer = true;
                                    if (focusTargetModifierNodeKtFocusTargetModifierNode1.write != iSerializer) {
                                        focusTargetModifierNodeKtFocusTargetModifierNode1.write = iSerializer;
                                        colorDrawable.setColor(iSerializer);
                                        accessisprocessingcustomenterp.serializer = colorDrawable;
                                        Recorder$3 recorder$4 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                                        if (recorder$4 != null) {
                                            ((View) recorder$4.RemoteActionCompatParcelizer).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i4 == 4) {
                                    focusTargetModifierNodeKtFocusTargetModifierNode1.IconCompatParcelizer = true;
                                    if (focusTargetModifierNodeKtFocusTargetModifierNode1.write != iSerializer2) {
                                        focusTargetModifierNodeKtFocusTargetModifierNode1.write = iSerializer2;
                                        colorDrawable.setColor(iSerializer2);
                                        accessisprocessingcustomenterp.serializer = colorDrawable;
                                        Recorder$3 recorder$5 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                                        if (recorder$5 != null) {
                                            ((View) recorder$5.RemoteActionCompatParcelizer).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i4 == 8) {
                                    focusTargetModifierNodeKtFocusTargetModifierNode1.IconCompatParcelizer = true;
                                    if (focusTargetModifierNodeKtFocusTargetModifierNode1.write != iSerializer2) {
                                        focusTargetModifierNodeKtFocusTargetModifierNode1.write = iSerializer2;
                                        colorDrawable.setColor(iSerializer2);
                                        accessisprocessingcustomenterp.serializer = colorDrawable;
                                        Recorder$3 recorder$6 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                                        if (recorder$6 != null) {
                                            ((View) recorder$6.RemoteActionCompatParcelizer).setBackground(colorDrawable);
                                        }
                                    }
                                }
                            }
                            i2 = 0;
                        }
                        i = i2;
                        break;
                    }
                }
                i3++;
                i2 = 0;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        window.setNavigationBarContrastEnforced(addcontentview2.write == 0 ? 1 : i);
        FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0 = new FocusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0(view);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 35) {
            setfocusrequester = new getOnExitannotations(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        } else if (i5 >= 30) {
            setfocusrequester = new FocusRestorerElement(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        } else {
            setfocusrequester = new setFocusRequester(window, focusPropertiesKtsamandroidx_compose_ui_focus_FocusPropertiesScope0);
        }
        setfocusrequester.write(!z);
        setfocusrequester.read(!z2);
    }
}
