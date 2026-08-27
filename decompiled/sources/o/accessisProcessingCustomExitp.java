package o;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.video.Recorder$3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class accessisProcessingCustomExitp {
    public setRight IconCompatParcelizer;
    public final ArrayList MediaDescriptionCompat = new ArrayList();
    public final accessassignFocus3ESFkO8 RemoteActionCompatParcelizer;
    public boolean read;
    public int serializer;
    public setRight write;

    public final void IconCompatParcelizer() {
        int i;
        setRight setrightIconCompatParcelizer;
        ArrayList arrayList = this.MediaDescriptionCompat;
        setRight setright = setRight.IconCompatParcelizer;
        setRight setrightWrite = setright;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            FocusTargetModifierNodeKtFocusTargetModifierNode1 focusTargetModifierNodeKtFocusTargetModifierNode1 = (FocusTargetModifierNodeKtFocusTargetModifierNode1) arrayList.get(size);
            setRight setright2 = this.write;
            setRight setright3 = this.IconCompatParcelizer;
            focusTargetModifierNodeKtFocusTargetModifierNode1.MediaMetadataCompat = setright2;
            accessisProcessingCustomEnterp accessisprocessingcustomenterp = focusTargetModifierNodeKtFocusTargetModifierNode1.RemoteActionCompatParcelizer;
            focusTargetModifierNodeKtFocusTargetModifierNode1.MediaDescriptionCompat = setright3;
            if (!accessisprocessingcustomenterp.write.equals(setrightWrite)) {
                accessisprocessingcustomenterp.write = setrightWrite;
                Recorder$3 recorder$3 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                if (recorder$3 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) recorder$3.MediaBrowserCompatMediaItem;
                    layoutParams.leftMargin = setrightWrite.RemoteActionCompatParcelizer;
                    layoutParams.topMargin = setrightWrite.write;
                    layoutParams.rightMargin = setrightWrite.read;
                    layoutParams.bottomMargin = setrightWrite.serializer;
                    ((View) recorder$3.RemoteActionCompatParcelizer).setLayoutParams(layoutParams);
                }
            }
            int i2 = focusTargetModifierNodeKtFocusTargetModifierNode1.RatingCompat;
            if (i2 == 1) {
                i = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaMetadataCompat.RemoteActionCompatParcelizer;
                int i3 = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaDescriptionCompat.RemoteActionCompatParcelizer;
                if (accessisprocessingcustomenterp.MediaMetadataCompat != i3) {
                    accessisprocessingcustomenterp.MediaMetadataCompat = i3;
                    Recorder$3 recorder$4 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                    if (recorder$4 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) recorder$4.MediaBrowserCompatMediaItem;
                        layoutParams2.width = i3;
                        ((View) recorder$4.RemoteActionCompatParcelizer).setLayoutParams(layoutParams2);
                    }
                }
                setrightIconCompatParcelizer = setRight.IconCompatParcelizer(i, 0, 0, 0);
            } else if (i2 == 2) {
                i = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaMetadataCompat.write;
                int i4 = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaDescriptionCompat.write;
                if (accessisprocessingcustomenterp.IconCompatParcelizer != i4) {
                    accessisprocessingcustomenterp.IconCompatParcelizer = i4;
                    Recorder$3 recorder$5 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                    if (recorder$5 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) recorder$5.MediaBrowserCompatMediaItem;
                        layoutParams3.height = i4;
                        ((View) recorder$5.RemoteActionCompatParcelizer).setLayoutParams(layoutParams3);
                    }
                }
                setrightIconCompatParcelizer = setRight.IconCompatParcelizer(0, i, 0, 0);
            } else if (i2 == 4) {
                i = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaMetadataCompat.read;
                int i5 = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaDescriptionCompat.read;
                if (accessisprocessingcustomenterp.MediaMetadataCompat != i5) {
                    accessisprocessingcustomenterp.MediaMetadataCompat = i5;
                    Recorder$3 recorder$6 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                    if (recorder$6 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) recorder$6.MediaBrowserCompatMediaItem;
                        layoutParams4.width = i5;
                        ((View) recorder$6.RemoteActionCompatParcelizer).setLayoutParams(layoutParams4);
                    }
                }
                setrightIconCompatParcelizer = setRight.IconCompatParcelizer(0, 0, i, 0);
            } else if (i2 != 8) {
                setrightIconCompatParcelizer = setright;
                i = 0;
            } else {
                i = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaMetadataCompat.serializer;
                int i6 = focusTargetModifierNodeKtFocusTargetModifierNode1.MediaDescriptionCompat.serializer;
                if (accessisprocessingcustomenterp.IconCompatParcelizer != i6) {
                    accessisprocessingcustomenterp.IconCompatParcelizer = i6;
                    Recorder$3 recorder$7 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                    if (recorder$7 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) recorder$7.MediaBrowserCompatMediaItem;
                        layoutParams5.height = i6;
                        ((View) recorder$7.RemoteActionCompatParcelizer).setLayoutParams(layoutParams5);
                    }
                }
                setrightIconCompatParcelizer = setRight.IconCompatParcelizer(0, 0, 0, i);
            }
            boolean z = i > 0;
            if (accessisprocessingcustomenterp.MediaDescriptionCompat != z) {
                accessisprocessingcustomenterp.MediaDescriptionCompat = z;
                Recorder$3 recorder$8 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                if (recorder$8 != null) {
                    ((View) recorder$8.RemoteActionCompatParcelizer).setVisibility(z ? 0 : 8);
                }
            }
            float f = 1.0f;
            focusTargetModifierNodeKtFocusTargetModifierNode1.read(i > 0 ? 1.0f : 0.0f);
            if (i <= 0) {
                f = 0.0f;
            }
            focusTargetModifierNodeKtFocusTargetModifierNode1.write(f);
            setrightWrite = setRight.write(setrightWrite, setrightIconCompatParcelizer);
        }
    }

    public final void serializer(int i) {
        ArrayList arrayList = this.MediaDescriptionCompat;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            FocusTargetModifierNodeKtFocusTargetModifierNode1 focusTargetModifierNodeKtFocusTargetModifierNode1 = (FocusTargetModifierNodeKtFocusTargetModifierNode1) arrayList.get(size);
            if (!focusTargetModifierNodeKtFocusTargetModifierNode1.IconCompatParcelizer) {
                ColorDrawable colorDrawable = focusTargetModifierNodeKtFocusTargetModifierNode1.serializer;
                if (focusTargetModifierNodeKtFocusTargetModifierNode1.write != i) {
                    focusTargetModifierNodeKtFocusTargetModifierNode1.write = i;
                    colorDrawable.setColor(i);
                    accessisProcessingCustomEnterp accessisprocessingcustomenterp = focusTargetModifierNodeKtFocusTargetModifierNode1.RemoteActionCompatParcelizer;
                    accessisprocessingcustomenterp.serializer = colorDrawable;
                    Recorder$3 recorder$3 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                    if (recorder$3 != null) {
                        ((View) recorder$3.RemoteActionCompatParcelizer).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public accessisProcessingCustomExitp(accessassignFocus3ESFkO8 accessassignfocus3esfko8, ArrayList arrayList) {
        setRight setright = setRight.IconCompatParcelizer;
        this.write = setright;
        this.IconCompatParcelizer = setright;
        read(arrayList, false);
        read(arrayList, true);
        ArrayList arrayList2 = accessassignfocus3esfko8.read;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            setRight setright2 = accessassignfocus3esfko8.write;
            setRight setright3 = accessassignfocus3esfko8.IconCompatParcelizer;
            this.write = setright2;
            this.IconCompatParcelizer = setright3;
            IconCompatParcelizer();
            serializer(accessassignfocus3esfko8.RemoteActionCompatParcelizer);
        }
        this.RemoteActionCompatParcelizer = accessassignfocus3esfko8;
    }

    public final void read(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            FocusTargetModifierNodeKtFocusTargetModifierNode1 focusTargetModifierNodeKtFocusTargetModifierNode1 = (FocusTargetModifierNodeKtFocusTargetModifierNode1) list.get(i);
            focusTargetModifierNodeKtFocusTargetModifierNode1.getClass();
            if (true == z) {
                accessisProcessingCustomExitp accessisprocessingcustomexitp = focusTargetModifierNodeKtFocusTargetModifierNode1.read;
                if (accessisprocessingcustomexitp != null) {
                    throw new IllegalStateException(focusTargetModifierNodeKtFocusTargetModifierNode1 + " (" + (i + 1) + "/" + size + ") is already controlled by " + accessisprocessingcustomexitp + " but is still added to " + this);
                }
                focusTargetModifierNodeKtFocusTargetModifierNode1.read = this;
                this.MediaDescriptionCompat.add(focusTargetModifierNodeKtFocusTargetModifierNode1);
            }
        }
    }
}
