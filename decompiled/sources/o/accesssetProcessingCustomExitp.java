package o;

import android.graphics.RectF;
import android.view.View;
import androidx.camera.video.Recorder$3;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class accesssetProcessingCustomExitp extends WindowInsetsAnimationCompat$Callback {
    public final HashMap IconCompatParcelizer;
    public final /* synthetic */ accessassignFocus3ESFkO8 serializer;

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onEnd(component14 component14Var) {
        ArrayList arrayList = this.serializer.read;
        if ((component14Var.IconCompatParcelizer.write() & 519) == 0) {
            return;
        }
        this.IconCompatParcelizer.remove(component14Var);
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            accessisProcessingCustomExitp accessisprocessingcustomexitp = (accessisProcessingCustomExitp) arrayList.get(size);
            int i = accessisprocessingcustomexitp.serializer;
            boolean z = i > 0;
            int i2 = i - 1;
            accessisprocessingcustomexitp.serializer = i2;
            if (z && i2 == 0) {
                accessisprocessingcustomexitp.IconCompatParcelizer();
            }
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final void onPrepare(component14 component14Var) {
        ArrayList arrayList = this.serializer.read;
        if ((component14Var.IconCompatParcelizer.write() & 519) == 0) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((accessisProcessingCustomExitp) arrayList.get(size)).serializer++;
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final FocusRequesterModifierKt onProgress(FocusRequesterModifierKt focusRequesterModifierKt, List list) {
        ArrayList arrayList = this.serializer.read;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            component14 component14Var = (component14) list.get(size);
            Integer num = (Integer) this.IconCompatParcelizer.get(component14Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fSerializer = component14Var.IconCompatParcelizer.serializer();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fSerializer;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fSerializer;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fSerializer;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fSerializer;
                }
                i |= iIntValue;
            }
        }
        setRight setrightRemoteActionCompatParcelizer = setRight.RemoteActionCompatParcelizer(focusRequesterModifierKt.IconCompatParcelizer.getInsets(519), focusRequesterModifierKt.IconCompatParcelizer.getInsets(64));
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return focusRequesterModifierKt;
            }
            accessisProcessingCustomExitp accessisprocessingcustomexitp = (accessisProcessingCustomExitp) arrayList.get(size2);
            setRight setright = accessisprocessingcustomexitp.IconCompatParcelizer;
            ArrayList arrayList2 = accessisprocessingcustomexitp.MediaDescriptionCompat;
            int size3 = arrayList2.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    FocusTargetModifierNodeKtFocusTargetModifierNode1 focusTargetModifierNodeKtFocusTargetModifierNode1 = (FocusTargetModifierNodeKtFocusTargetModifierNode1) arrayList2.get(size3);
                    int i2 = focusTargetModifierNodeKtFocusTargetModifierNode1.RatingCompat;
                    if ((i2 & i) != 0) {
                        accessisProcessingCustomEnterp accessisprocessingcustomenterp = focusTargetModifierNodeKtFocusTargetModifierNode1.RemoteActionCompatParcelizer;
                        if (!accessisprocessingcustomenterp.MediaDescriptionCompat) {
                            accessisprocessingcustomenterp.MediaDescriptionCompat = true;
                            Recorder$3 recorder$3 = accessisprocessingcustomenterp.RemoteActionCompatParcelizer;
                            if (recorder$3 != null) {
                                ((View) recorder$3.RemoteActionCompatParcelizer).setVisibility(0);
                            }
                        }
                        if (i2 == 1) {
                            int i3 = setright.RemoteActionCompatParcelizer;
                            if (i3 > 0) {
                                focusTargetModifierNodeKtFocusTargetModifierNode1.write(setrightRemoteActionCompatParcelizer.RemoteActionCompatParcelizer / i3);
                            }
                            focusTargetModifierNodeKtFocusTargetModifierNode1.read(rectF.left);
                        } else if (i2 == 2) {
                            int i4 = setright.write;
                            if (i4 > 0) {
                                focusTargetModifierNodeKtFocusTargetModifierNode1.write(setrightRemoteActionCompatParcelizer.write / i4);
                            }
                            focusTargetModifierNodeKtFocusTargetModifierNode1.read(rectF.top);
                        } else if (i2 == 4) {
                            int i5 = setright.read;
                            if (i5 > 0) {
                                focusTargetModifierNodeKtFocusTargetModifierNode1.write(setrightRemoteActionCompatParcelizer.read / i5);
                            }
                            focusTargetModifierNodeKtFocusTargetModifierNode1.read(rectF.right);
                        } else if (i2 == 8) {
                            int i6 = setright.serializer;
                            if (i6 > 0) {
                                focusTargetModifierNodeKtFocusTargetModifierNode1.write(setrightRemoteActionCompatParcelizer.serializer / i6);
                            }
                            focusTargetModifierNodeKtFocusTargetModifierNode1.read(rectF.bottom);
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat$Callback
    public final component15 onStart(component14 component14Var, component15 component15Var) {
        if ((component14Var.IconCompatParcelizer.write() & 519) != 0) {
            setRight setright = component15Var.read;
            setRight setright2 = component15Var.RemoteActionCompatParcelizer;
            int i = setright.RemoteActionCompatParcelizer != setright2.RemoteActionCompatParcelizer ? 1 : 0;
            if (setright.write != setright2.write) {
                i |= 2;
            }
            if (setright.read != setright2.read) {
                i |= 4;
            }
            if (setright.serializer != setright2.serializer) {
                i |= 8;
            }
            this.IconCompatParcelizer.put(component14Var, Integer.valueOf(i));
        }
        return component15Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public accesssetProcessingCustomExitp(accessassignFocus3ESFkO8 accessassignfocus3esfko8) {
        super(0);
        this.serializer = accessassignfocus3esfko8;
        this.IconCompatParcelizer = new HashMap();
    }
}
