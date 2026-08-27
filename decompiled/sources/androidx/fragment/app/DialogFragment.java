package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Objects;
import o.SizeCompanion;
import o.accessisRenderNodeCompatiblecp;
import o.div7Ah8Wj8;
import o.getSafeInnerRect;
import o.isInfiniteannotations;
import o.removeNodeAtDepth;
import o.unregisterComponentCallback;

/* JADX INFO: loaded from: classes.dex */
public class DialogFragment extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean MediaDescriptionCompat;
    public Handler MediaMetadataCompat;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public boolean ResultReceiver;
    public Dialog read;
    public boolean write;
    public final Fragment.AnonymousClass3 MediaSessionCompatQueueItem = new Fragment.AnonymousClass3(1, this);
    public final AnonymousClass2 RatingCompat = new DialogInterface.OnCancelListener() { // from class: androidx.fragment.app.DialogFragment.2
        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.read;
            if (dialog != null) {
                dialogFragment.onCancel(dialog);
            }
        }
    };
    public final AnonymousClass3 PlaybackStateCompatCustomAction = new AnonymousClass3();
    public int ParcelableVolumeInfo = 0;
    public int MediaSessionCompatToken = 0;
    public boolean RemoteActionCompatParcelizer = true;
    public boolean PlaybackStateCompat = true;
    public int IconCompatParcelizer = -1;
    public final AnonymousClass4 MediaBrowserCompatMediaItem = new unregisterComponentCallback() { // from class: androidx.fragment.app.DialogFragment.4
        @Override // o.unregisterComponentCallback
        public final void RemoteActionCompatParcelizer(Object obj) {
            if (((accessisRenderNodeCompatiblecp) obj) != null) {
                DialogFragment dialogFragment = DialogFragment.this;
                if (dialogFragment.PlaybackStateCompat) {
                    View viewRequireView = dialogFragment.requireView();
                    if (viewRequireView.getParent() != null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("DialogFragment can not be attached to a container view");
                    } else if (dialogFragment.read != null) {
                        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
                            Objects.toString(dialogFragment.read);
                        }
                        dialogFragment.read.setContentView(viewRequireView);
                    }
                }
            }
        }
    };
    public boolean serializer = false;

    /* JADX INFO: renamed from: androidx.fragment.app.DialogFragment$3, reason: invalid class name */
    public final class AnonymousClass3 implements DialogInterface.OnDismissListener {
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            DialogFragment dialogFragment = DialogFragment.this;
            Dialog dialog = dialogFragment.read;
            if (dialog != null) {
                dialogFragment.onDismiss(dialog);
            }
        }

        public AnonymousClass3() {
        }
    }

    public void RemoteActionCompatParcelizer(div7Ah8Wj8 div7ah8wj8, String str) {
        this.MediaDescriptionCompat = false;
        this.MediaSessionCompatResultReceiverWrapper = true;
        div7ah8wj8.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
        isinfiniteannotations.ComponentActivity = true;
        isinfiniteannotations.read(0, this, str, 1);
        isinfiniteannotations.read();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    public final void read(int i, int i2) {
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            toString();
        }
        this.ParcelableVolumeInfo = i;
        if (i == 2 || i == 3) {
            this.MediaSessionCompatToken = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.MediaSessionCompatToken = i2;
        }
    }

    public int w_() {
        return this.MediaSessionCompatToken;
    }

    public Dialog write(Bundle bundle) {
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            toString();
        }
        return new ComponentDialog(requireContext(), w_());
    }

    public void write() {
        read(false, false);
    }

    public final void write(div7Ah8Wj8 div7ah8wj8, String str) {
        this.MediaDescriptionCompat = false;
        this.MediaSessionCompatResultReceiverWrapper = true;
        div7ah8wj8.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(div7ah8wj8);
        isinfiniteannotations.ComponentActivity = true;
        isinfiniteannotations.read(0, this, str, 1);
        isinfiniteannotations.RemoteActionCompatParcelizer();
    }

    public void RemoteActionCompatParcelizer() {
        read(true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().read(this.MediaBrowserCompatMediaItem);
        if (this.MediaSessionCompatResultReceiverWrapper) {
            return;
        }
        this.MediaDescriptionCompat = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.read;
        if (dialog != null) {
            this.ResultReceiver = true;
            dialog.setOnDismissListener(null);
            this.read.dismiss();
            if (!this.MediaDescriptionCompat) {
                onDismiss(this.read);
            }
            this.read = null;
            this.serializer = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        if (!this.MediaSessionCompatResultReceiverWrapper && !this.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = true;
        }
        getViewLifecycleOwnerLiveData().RemoteActionCompatParcelizer((unregisterComponentCallback) this.MediaBrowserCompatMediaItem);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.read;
        if (dialog != null) {
            this.ResultReceiver = false;
            dialog.show();
            View decorView = this.read.getWindow().getDecorView();
            removeNodeAtDepth.write(decorView, (accessisRenderNodeCompatiblecp) this);
            decorView.setTag(com.logistics.rider.glovo.R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(com.logistics.rider.glovo.R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.read;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.read == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.read.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.getActivityResultRegistry != null || this.read == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.read.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z = this.PlaybackStateCompat;
        if (z && !this.write) {
            if (z && !this.serializer) {
                try {
                    this.write = true;
                    Dialog dialogWrite = write(bundle);
                    this.read = dialogWrite;
                    if (this.PlaybackStateCompat) {
                        RemoteActionCompatParcelizer(dialogWrite, this.ParcelableVolumeInfo);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.read.setOwnerActivity((Activity) context);
                        }
                        this.read.setCancelable(this.RemoteActionCompatParcelizer);
                        this.read.setOnCancelListener(this.RatingCompat);
                        this.read.setOnDismissListener(this.PlaybackStateCompatCustomAction);
                        this.serializer = true;
                    } else {
                        this.read = null;
                    }
                    this.write = false;
                } catch (Throwable th) {
                    this.write = false;
                    throw th;
                }
            }
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                toString();
            }
            Dialog dialog = this.read;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
            toString();
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.read;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.ParcelableVolumeInfo;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.MediaSessionCompatToken;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.RemoteActionCompatParcelizer;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.PlaybackStateCompat;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.IconCompatParcelizer;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaMetadataCompat = new Handler();
        this.PlaybackStateCompat = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg == 0;
        if (bundle != null) {
            this.ParcelableVolumeInfo = bundle.getInt("android:style", 0);
            this.MediaSessionCompatToken = bundle.getInt("android:theme", 0);
            this.RemoteActionCompatParcelizer = bundle.getBoolean("android:cancelable", true);
            this.PlaybackStateCompat = bundle.getBoolean("android:showsDialog", this.PlaybackStateCompat);
            this.IconCompatParcelizer = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ResultReceiver) {
            return;
        }
        if (div7Ah8Wj8.RemoteActionCompatParcelizer(3)) {
            toString();
        }
        read(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final getSafeInnerRect createFragmentContainer() {
        final getSafeInnerRect getsafeinnerrectCreateFragmentContainer = super.createFragmentContainer();
        return new getSafeInnerRect() { // from class: androidx.fragment.app.DialogFragment.5
            @Override // o.getSafeInnerRect
            public final View IconCompatParcelizer(int i) {
                getSafeInnerRect getsafeinnerrect = getsafeinnerrectCreateFragmentContainer;
                if (getsafeinnerrect.write()) {
                    return getsafeinnerrect.IconCompatParcelizer(i);
                }
                Dialog dialog = DialogFragment.this.read;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            }

            @Override // o.getSafeInnerRect
            public final boolean write() {
                return getsafeinnerrectCreateFragmentContainer.write() || DialogFragment.this.serializer;
            }
        };
    }

    public final void read(boolean z, boolean z2) {
        if (this.MediaDescriptionCompat) {
            return;
        }
        this.MediaDescriptionCompat = true;
        this.MediaSessionCompatResultReceiverWrapper = false;
        Dialog dialog = this.read;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.read.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.MediaMetadataCompat.getLooper()) {
                    onDismiss(this.read);
                } else {
                    this.MediaMetadataCompat.post(this.MediaSessionCompatQueueItem);
                }
            }
        }
        this.ResultReceiver = true;
        if (this.IconCompatParcelizer >= 0) {
            div7Ah8Wj8 parentFragmentManager = getParentFragmentManager();
            int i = this.IconCompatParcelizer;
            parentFragmentManager.getClass();
            if (i < 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(i, "Bad id: "));
                return;
            } else {
                parentFragmentManager.RemoteActionCompatParcelizer(new SizeCompanion(parentFragmentManager, null, i), z);
                this.IconCompatParcelizer = -1;
                return;
            }
        }
        div7Ah8Wj8 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        isInfiniteannotations isinfiniteannotations = new isInfiniteannotations(parentFragmentManager2);
        isinfiniteannotations.ComponentActivity = true;
        isinfiniteannotations.write(this);
        if (z) {
            isinfiniteannotations.read(true, true);
        } else {
            isinfiniteannotations.read();
        }
    }

    public final Dialog y_() {
        Dialog dialog = this.read;
        if (dialog != null) {
            return dialog;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.serializer("DialogFragment ", this, " does not have a Dialog.");
        return null;
    }

    public void RemoteActionCompatParcelizer(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
}
