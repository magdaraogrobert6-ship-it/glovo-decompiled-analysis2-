package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.camera.core.ImageCapture$1;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.SentryLogcatAdapter;
import o.getExponentimpl;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class SignInHubActivity extends FragmentActivity {
    private static boolean MediaDescriptionCompat = false;
    private boolean MediaBrowserCompatMediaItem = false;
    private SignInConfiguration MediaSessionCompatQueueItem;
    private int ParcelableVolumeInfo;
    private Intent PlaybackStateCompatCustomAction;
    private boolean RatingCompat;

    public final /* synthetic */ Intent RemoteActionCompatParcelizer() {
        return this.PlaybackStateCompatCustomAction;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final /* synthetic */ int read() {
        return this.ParcelableVolumeInfo;
    }

    private final void serializer(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.MediaSessionCompatQueueItem);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.MediaBrowserCompatMediaItem = true;
            SentryLogcatAdapter.IconCompatParcelizer("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            write(17);
        }
    }

    private final void write(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        MediaDescriptionCompat = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            SentryLogcatAdapter.serializer("AuthSignInClient", "Null action");
            write(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            SentryLogcatAdapter.serializer("AuthSignInClient", "Action not implemented");
            write(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            SentryLogcatAdapter.serializer("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            SentryLogcatAdapter.serializer("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            SentryLogcatAdapter.serializer("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.MediaSessionCompatQueueItem = signInConfiguration;
        if (bundle == null) {
            if (MediaDescriptionCompat) {
                setResult(0);
                write(12502);
                return;
            } else {
                MediaDescriptionCompat = true;
                serializer(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.RatingCompat = z;
        if (z) {
            this.ParcelableVolumeInfo = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.PlaybackStateCompatCustomAction = intent2;
                serializer();
            } else {
                SentryLogcatAdapter.serializer("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MediaDescriptionCompat = false;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.RatingCompat);
        if (this.RatingCompat) {
            bundle.putInt("signInResultCode", this.ParcelableVolumeInfo);
            bundle.putParcelable("signInResultData", this.PlaybackStateCompatCustomAction);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.serializer) != null) {
                ImageCapture$1 imageCapture$1 = ImageCapture$1.read(this);
                GoogleSignInOptions googleSignInOptions = this.MediaSessionCompatQueueItem.read;
                synchronized (imageCapture$1) {
                    ((Storage) imageCapture$1.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.RatingCompat = true;
                this.ParcelableVolumeInfo = i2;
                this.PlaybackStateCompatCustomAction = intent;
                serializer();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                write(intExtra);
                return;
            }
        }
        write(8);
    }

    private final void serializer() {
        getSupportLoaderManager().serializer(0, new getExponentimpl(19, this));
        MediaDescriptionCompat = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
