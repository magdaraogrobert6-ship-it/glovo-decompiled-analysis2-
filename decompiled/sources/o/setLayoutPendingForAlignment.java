package o;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setLayoutPendingForAlignment {
    public static final setSupportButtonTintList IconCompatParcelizer = new setSupportButtonTintList(1);

    public static zzw RemoteActionCompatParcelizer(Task task, Task task2) {
        getOwner getowner = new getOwner();
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = new ParentDataModifierDefaultImpls(getowner.RemoteActionCompatParcelizer);
        PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = new PreviewView$1$$ExternalSyntheticLambda2(parentDataModifierDefaultImpls, new AtomicBoolean(false), getowner, 10);
        setSupportButtonTintList setsupportbuttontintlist = IconCompatParcelizer;
        task.continueWithTask(setsupportbuttontintlist, previewView$1$$ExternalSyntheticLambda2);
        task2.continueWithTask(setsupportbuttontintlist, previewView$1$$ExternalSyntheticLambda2);
        return parentDataModifierDefaultImpls.RemoteActionCompatParcelizer;
    }
}
