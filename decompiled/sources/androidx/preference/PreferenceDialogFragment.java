package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.findFirstRoot;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class PreferenceDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    private BitmapDrawable IconCompatParcelizer;
    private CharSequence MediaBrowserCompatMediaItem;
    private int MediaMetadataCompat;
    private DialogPreference MediaSessionCompatQueueItem;
    private CharSequence RemoteActionCompatParcelizer;
    private CharSequence read;
    private int serializer;
    private CharSequence write;

    @Deprecated
    public PreferenceDialogFragment() {
    }

    @Deprecated
    public abstract void RemoteActionCompatParcelizer(boolean z);

    @Override // android.content.DialogInterface.OnClickListener
    @Deprecated
    public void onClick(DialogInterface dialogInterface, int i) {
        this.MediaMetadataCompat = i;
    }

    @Deprecated
    public void read(AlertDialog.Builder builder) {
    }

    public boolean write() {
        return false;
    }

    @Deprecated
    public void IconCompatParcelizer(View view) {
        int i;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.RemoteActionCompatParcelizer;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Fragment targetFragment = getTargetFragment();
        if (!(targetFragment instanceof PreferenceFragment)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Target fragment must implement TargetFragment interface");
            return;
        }
        PreferenceFragment preferenceFragment = (PreferenceFragment) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.read = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.MediaBrowserCompatMediaItem = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.write = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.RemoteActionCompatParcelizer = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.serializer = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.IconCompatParcelizer = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) preferenceFragment.IconCompatParcelizer(string);
        this.MediaSessionCompatQueueItem = dialogPreference;
        this.read = dialogPreference.IconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = dialogPreference.MediaBrowserCompatMediaItem;
        this.write = dialogPreference.write;
        this.RemoteActionCompatParcelizer = dialogPreference.read;
        this.serializer = dialogPreference.serializer;
        Drawable drawable = dialogPreference.RemoteActionCompatParcelizer;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.IconCompatParcelizer = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.IconCompatParcelizer = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        RemoteActionCompatParcelizer(this.MediaMetadataCompat == -1);
    }

    private void write(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            findFirstRoot.read(window);
        } else {
            window.setSoftInputMode(5);
        }
    }

    @Deprecated
    public DialogPreference IconCompatParcelizer() {
        if (this.MediaSessionCompatQueueItem == null) {
            this.MediaSessionCompatQueueItem = (DialogPreference) ((PreferenceFragment) getTargetFragment()).IconCompatParcelizer(getArguments().getString("key"));
        }
        return this.MediaSessionCompatQueueItem;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.MediaMetadataCompat = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.read).setIcon(this.IconCompatParcelizer).setPositiveButton(this.MediaBrowserCompatMediaItem, this).setNegativeButton(this.write, this);
        View view = read(activity);
        if (view != null) {
            IconCompatParcelizer(view);
            negativeButton.setView(view);
        } else {
            negativeButton.setMessage(this.RemoteActionCompatParcelizer);
        }
        read(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (write()) {
            write(alertDialogCreate);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.read);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.MediaBrowserCompatMediaItem);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.write);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.RemoteActionCompatParcelizer);
        bundle.putInt("PreferenceDialogFragment.layout", this.serializer);
        BitmapDrawable bitmapDrawable = this.IconCompatParcelizer;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Deprecated
    public View read(Context context) {
        int i = this.serializer;
        if (i == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i, (ViewGroup) null);
    }
}
