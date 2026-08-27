package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder$3;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusTargetNode extends FrameLayout {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public accessisProcessingCustomExitp read;
    public final ArrayList write;

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != RemoteActionCompatParcelizer) {
            accessisProcessingCustomExitp accessisprocessingcustomexitp = this.read;
            int childCount = getChildCount() - (accessisprocessingcustomexitp != null ? accessisprocessingcustomexitp.MediaDescriptionCompat.size() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0 A[LOOP:0: B:7:0x0028->B:27:0x00b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[SYNTHETIC] */
    public final void serializer() {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams;
        View view;
        Recorder$3 recorder$3;
        ArrayList arrayList = this.write;
        if (arrayList.isEmpty()) {
            IconCompatParcelizer();
            return;
        }
        accessassignFocus3ESFkO8 orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        IconCompatParcelizer();
        this.read = new accessisProcessingCustomExitp(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.read.MediaDescriptionCompat.size();
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            FocusTargetModifierNodeKtFocusTargetModifierNode1 focusTargetModifierNodeKtFocusTargetModifierNode1 = (FocusTargetModifierNodeKtFocusTargetModifierNode1) this.read.MediaDescriptionCompat.get(i4);
            Context context = getContext();
            accessisProcessingCustomEnterp accessisprocessingcustomenterp = focusTargetModifierNodeKtFocusTargetModifierNode1.RemoteActionCompatParcelizer;
            int i5 = focusTargetModifierNodeKtFocusTargetModifierNode1.RatingCompat;
            int i6 = -1;
            if (i5 != 1) {
                if (i5 == 2) {
                    i3 = accessisprocessingcustomenterp.IconCompatParcelizer;
                    i2 = 48;
                } else if (i5 == 4) {
                    i = accessisprocessingcustomenterp.MediaMetadataCompat;
                    i2 = 5;
                } else if (i5 != 8) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i5, "Unexpected side: "));
                    return;
                } else {
                    i3 = accessisprocessingcustomenterp.IconCompatParcelizer;
                    i2 = 80;
                }
                layoutParams = new FrameLayout.LayoutParams(i6, i3, i2);
                setRight setright = accessisprocessingcustomenterp.write;
                layoutParams.leftMargin = setright.RemoteActionCompatParcelizer;
                layoutParams.topMargin = setright.write;
                layoutParams.rightMargin = setright.read;
                layoutParams.bottomMargin = setright.serializer;
                view = new View(context);
                view.setTag(RemoteActionCompatParcelizer);
                view.setTranslationX(accessisprocessingcustomenterp.RatingCompat);
                view.setTranslationY(accessisprocessingcustomenterp.MediaBrowserCompatMediaItem);
                view.setAlpha(accessisprocessingcustomenterp.read);
                view.setVisibility(accessisprocessingcustomenterp.MediaDescriptionCompat ? 0 : 8);
                view.setBackground(accessisprocessingcustomenterp.serializer);
                recorder$3 = new Recorder$3(layoutParams, view, z, 10);
                if (accessisprocessingcustomenterp.RemoteActionCompatParcelizer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                    return;
                } else {
                    accessisprocessingcustomenterp.RemoteActionCompatParcelizer = recorder$3;
                    addView(view, i4 + childCount, layoutParams);
                }
            } else {
                i = accessisprocessingcustomenterp.MediaMetadataCompat;
                i2 = 3;
            }
            i6 = i;
            i3 = -1;
            layoutParams = new FrameLayout.LayoutParams(i6, i3, i2);
            setRight setright2 = accessisprocessingcustomenterp.write;
            layoutParams.leftMargin = setright2.RemoteActionCompatParcelizer;
            layoutParams.topMargin = setright2.write;
            layoutParams.rightMargin = setright2.read;
            layoutParams.bottomMargin = setright2.serializer;
            view = new View(context);
            view.setTag(RemoteActionCompatParcelizer);
            view.setTranslationX(accessisprocessingcustomenterp.RatingCompat);
            view.setTranslationY(accessisprocessingcustomenterp.MediaBrowserCompatMediaItem);
            view.setAlpha(accessisprocessingcustomenterp.read);
            view.setVisibility(accessisprocessingcustomenterp.MediaDescriptionCompat ? 0 : 8);
            view.setBackground(accessisprocessingcustomenterp.serializer);
            recorder$3 = new Recorder$3(layoutParams, view, z, 10);
            if (accessisprocessingcustomenterp.RemoteActionCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                return;
            } else {
                accessisprocessingcustomenterp.RemoteActionCompatParcelizer = recorder$3;
                addView(view, i4 + childCount, layoutParams);
            }
        }
    }

    public void setProtections(List<FocusTargetModifierNodeKtFocusTargetModifierNode1> list) {
        ArrayList arrayList = this.write;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            serializer();
            requestApplyInsets();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        serializer();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IconCompatParcelizer();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(com.logistics.rider.glovo.R.id.tag_system_bar_state_monitor);
        if (tag instanceof accessassignFocus3ESFkO8) {
            accessassignFocus3ESFkO8 accessassignfocus3esfko8 = (accessassignFocus3ESFkO8) tag;
            if (accessassignfocus3esfko8.read.isEmpty()) {
                accessassignfocus3esfko8.serializer.post(new RxWorker$1$$ExternalSyntheticLambda0(4, accessassignfocus3esfko8));
                viewGroup.setTag(com.logistics.rider.glovo.R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    private accessassignFocus3ESFkO8 getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(com.logistics.rider.glovo.R.id.tag_system_bar_state_monitor);
        if (tag instanceof accessassignFocus3ESFkO8) {
            return (accessassignFocus3ESFkO8) tag;
        }
        accessassignFocus3ESFkO8 accessassignfocus3esfko8 = new accessassignFocus3ESFkO8(viewGroup);
        viewGroup.setTag(com.logistics.rider.glovo.R.id.tag_system_bar_state_monitor, accessassignfocus3esfko8);
        return accessassignfocus3esfko8;
    }

    public final void IconCompatParcelizer() {
        accessisProcessingCustomExitp accessisprocessingcustomexitp;
        if (this.read != null) {
            removeViews(getChildCount() - this.read.MediaDescriptionCompat.size(), this.read.MediaDescriptionCompat.size());
            int size = this.read.MediaDescriptionCompat.size();
            int i = 0;
            while (true) {
                accessisprocessingcustomexitp = this.read;
                if (i >= size) {
                    break;
                }
                ((FocusTargetModifierNodeKtFocusTargetModifierNode1) accessisprocessingcustomexitp.MediaDescriptionCompat.get(i)).RemoteActionCompatParcelizer.RemoteActionCompatParcelizer = null;
                i++;
            }
            ArrayList arrayList = accessisprocessingcustomexitp.MediaDescriptionCompat;
            if (!accessisprocessingcustomexitp.read) {
                accessisprocessingcustomexitp.read = true;
                accessisprocessingcustomexitp.RemoteActionCompatParcelizer.read.remove(accessisprocessingcustomexitp);
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        ((FocusTargetModifierNodeKtFocusTargetModifierNode1) arrayList.get(size2)).read = null;
                    }
                }
                arrayList.clear();
            }
            this.read = null;
        }
    }

    public FocusTargetNode(Context context, List list) {
        super(context);
        this.write = new ArrayList();
        setProtections(list);
    }
}
